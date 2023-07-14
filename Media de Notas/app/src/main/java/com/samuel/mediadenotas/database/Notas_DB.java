package com.samuel.mediadenotas.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Notas_DB extends SQLiteOpenHelper {

    private static String DB_NAME = "Notas_DB";
    private static final int DB_VERSION = 1;

    Cursor cursor;
    SQLiteDatabase db;

    public Notas_DB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String TabelaNotas
                = "CREATE TABLE Notas (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT," +
                "disciplina TEXT," +
                "B1 REAL, " +
                "B2 REAL, " +
                "B3 REAL, " +
                "B4 REAL, " +
                "media REAL, " +
                "resultado TEXT)";

        db.execSQL(TabelaNotas);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void salvarDados(String tabela, ContentValues dados) {
        db.insert(tabela, null, dados);
    }
}
