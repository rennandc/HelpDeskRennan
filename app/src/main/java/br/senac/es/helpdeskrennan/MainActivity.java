package br.senac.es.helpdeskrennan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nome = (EditText) findViewById(R.id.txtNomeRn);
        final EditText senha = (EditText) findViewById(R.id.txtSenhaRn);
        final Button logar = (Button) findViewById(R.id.botaoLogarRn);


        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Funcao funcao = new Funcao();
                funcao.verificarLogin(getApplicationContext(), nome, senha);

                if (funcao.verificarLogin(getApplicationContext(), nome, senha) == true) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);


                }


            }
        });
    }


}


