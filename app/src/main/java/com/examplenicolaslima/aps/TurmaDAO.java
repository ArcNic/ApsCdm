package com.examplenicolaslima.aps;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public TurmaDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserirTurma(Turma turma){
        ContentValues values = new ContentValues();
        values.put("turma", turma.getNome_turma());
        values.put("sala", turma.getSala());
        return banco.insert("turma",null, values);
    }

    public List<Turma> obterTodosTurmas(){
        List<Turma> turmas = new ArrayList<>();
        Cursor cursor = banco.query("turma", new String[]{"id","nome_turma","sala"},
                null, null, null, null, null);

        while(cursor.moveToNext()){
            Turma t = new Turma();
            t.setID(cursor.getInt(0));
            t.setNome_turma(cursor.getString(1));
            t.setSala(cursor.getString(2));
            turmas.add(t);
        }
        return turmas;
    }
}
