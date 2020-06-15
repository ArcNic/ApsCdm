package com.examplenicolaslima.aps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListarTurmas extends AppCompatActivity {

    private ListView listView;
    private TurmaDAO daot;
    private List<Turma> turmas;
    private List<Turma> turmasFiltrados =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_turmas);
        listView = findViewById(R.id.lista_turmas);
        daot = new TurmaDAO(this);
        //turmas = daot.obterTodosTurmas();
        //turmasFiltrados.addAll(turmas);
        //ArrayAdapter<Turma> adaptadorT = new ArrayAdapter<Turma>(this, android.R.layout.simple_list_item_2, turmasFiltrados);
        //listView.setAdapter(adaptadorT);
    }

}
