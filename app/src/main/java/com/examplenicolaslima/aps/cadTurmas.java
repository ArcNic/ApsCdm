package com.examplenicolaslima.aps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cadTurmas extends AppCompatActivity {

    private EditText turma;
    private EditText sala;
    private TurmaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_turmas);

        turma = findViewById(R.id.editTurma);
        sala = findViewById(R.id.editSala);
        dao = new TurmaDAO(this);
    }

    public void salvarTurma(View view){
        Turma t = new Turma();
        t.setNome_turma(turma.getText().toString());
        t.setSala(sala.getText().toString());
        dao.inserirTurma(t);
        Toast.makeText(this, "Turma Cadastrada.", Toast.LENGTH_SHORT).show();

    }




}
