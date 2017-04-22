package br.com.a4systemlab.agenda.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by isael on 21/04/17.
 */

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABASE = "appAgenda";
    private static final int VERSAO = 1;

    public DataBase(Context context) {
        super(context, DATABASE, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DataBaseSQL.getCompromisso());
        db.execSQL(DataBaseSQL.getAtividade());
        db.execSQL(DataBaseSQL.getContato());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
