package com.example.batman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnmumara, btnbat, btnsuper, btnaqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmumara = (Button) findViewById(R.id.btnmumara);
        btnbat = (Button) findViewById(R.id.btnbat);
        btnsuper = (Button) findViewById(R.id.btnsuper);
        btnaqua = (Button) findViewById(R.id.btnaqua);
    }
    public void Bat (View view){

        Intent intent = new Intent(this, MainBatmanActivity.class);
        startActivity(intent);
    }

    public void Mara (View view){

        Intent intent = new Intent(this, MainMaravilhaActivity.class);
        startActivity(intent);
    }

    public void Aqua (View view){

        Intent intent = new Intent(this, MainAquamanActivity.class);
        startActivity(intent);
    }

    public void Super (View view){

        Intent intent = new Intent(this, MainSuperActivity.class);
        startActivity(intent);
    }

    public void Site(View view){
        Intent pesquisa = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ligadajustia.fandom.com/pt-br/wiki/Liga_da_Justi%C3%A7a"));
        startActivity(pesquisa);
    }

}