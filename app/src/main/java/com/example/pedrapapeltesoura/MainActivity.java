package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){
        this.opcaoSelecionada("Pedra");

    }

    public void papel(View view){
        this.opcaoSelecionada("Papel");

    }

    public void tesoura(View view){
        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada(String opcaoSelecionada){

        TextView texto = findViewById(R.id.textoResultado);
        ImageView imageApp = findViewById(R.id.imageApp);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcoesApp = opcoes[numero];
        switch (opcoesApp){
            case "Pedra":
                imageApp.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imageApp.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imageApp.setImageResource(R.drawable.tesoura);
                break;
        }

        if(opcoesApp == "Tesoura" && opcaoSelecionada == "Papel" || opcoesApp == "Papel" && opcaoSelecionada == "Pedra" || opcoesApp == "Pedra" && opcaoSelecionada == "Tesoura"){

            texto.setText("O app ganhou, jogue mais uma vez e tente a sorte :)!");

        }else if(opcoesApp == "Tesoura" && opcaoSelecionada == "Pedra" || opcoesApp == "Papel" && opcaoSelecionada == "Tesoura" || opcoesApp == "Pedra" && opcaoSelecionada == "Papel"){

            texto.setText("Você ganhou parabéns :D, vamos jogar mais!");

        }else{

            texto.setText("Houve um empate vamos resolver isso!");
        }

    }
}