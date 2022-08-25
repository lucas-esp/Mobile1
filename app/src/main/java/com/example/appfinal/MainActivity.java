package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button botaoagenda,botaoclima,botaog1,botaoyoutube,botaofinalizar,botaomusicayoutube;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Ajuda Vovô");

        botaoagenda=findViewById(R.id.btnagenda);
        botaoclima=findViewById(R.id.btnoclima);
        botaog1=findViewById(R.id.btng1);
        botaoyoutube=findViewById(R.id.btnyoutube);
        botaofinalizar=findViewById(R.id.btnfinalizar);
        botaomusicayoutube=findViewById(R.id.btnmusicayoutube);
        //finaliza o sistema
        botaofinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //abre a api do clima
        botaoclima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent clima = new Intent(getApplicationContext(),clima.class);
               startActivity(clima);
            }
        });
        //abre agenda telefonica
        botaoagenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent agenda = new Intent(getApplicationContext(),agenda.class);
                startActivity(agenda);
            }
        });

        //abre o g1
        botaog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goLink("https://g1.globo.com/");
            }
        });

        botaoyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/");
            }
        });
        botaomusicayoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://video-to-mp3-converter.com/pt9");
            }
        });




    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_main,menu);
            return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.agenda){
            Toast.makeText(getApplicationContext(), "agenda aberta",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),agenda.class);
            startActivity(intent);
            return true;
        }
        else if(item.getItemId() == R.id.clima){
            Toast.makeText(getApplicationContext(), "Clima abrindo",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),clima.class);
            startActivity(intent);
            return true;

        }
        else if(item.getItemId() == R.id.finalizar){
            Toast.makeText(getApplicationContext(), "Finalizando",Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}