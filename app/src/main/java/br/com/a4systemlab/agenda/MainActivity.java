package br.com.a4systemlab.agenda;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

import br.com.a4systemlab.agenda.utils.DataBase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SystemClock.sleep(TimeUnit.SECONDS.toMillis(2));

        SharedPreferences sessao = getSharedPreferences("Sessao", MODE_PRIVATE);

        DataBase dataBase = new DataBase(this);

        dataBase.getReadableDatabase();

        if(sessao.contains("sessao")){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        } else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
