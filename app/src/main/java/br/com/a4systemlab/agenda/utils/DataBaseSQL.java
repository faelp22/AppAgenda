package br.com.a4systemlab.agenda.utils;

/**
 * Created by isael on 21/04/17.
 */

public class DataBaseSQL {

    public static final String atividade = "atividade";
    public static final String contato = "contato";
    public static final String compromisso = "compromisso";
    public static final String apiaddress = "apiaddress";

    public static String getAtividade() {

        StringBuilder atividade = new StringBuilder();

        atividade.append("CREATE TABLE IF NOT EXISTS atividade ( ");
        atividade.append("    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        atividade.append("    compromisso_id INTEGER DEFAULT NULL REFERENCES compromisso (id) ON DELETE CASCADE, ");
        atividade.append("    user INTEGER NOT NULL, ");
        atividade.append("    created_at datetime NOT NULL, ");
        atividade.append("    updated_at datetime NOT NULL, ");
        atividade.append("    status INTEGER NOT NULL, ");
        atividade.append("    sync INTEGER NOT NULL, ");
        atividade.append("    nome varchar (255) NOT NULL, ");
        atividade.append("    descricao longtext NOT NULL, ");
        atividade.append("    prazo datetime NOT NULL");
        atividade.append(" ); ");

        return atividade.toString();
    }

    public static String getContato() {

        StringBuilder contato = new StringBuilder();

        contato.append("CREATE TABLE IF NOT EXISTS contato ( ");
        contato.append("    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        contato.append("    compromisso_id INTEGER DEFAULT NULL REFERENCES compromisso (id) ON DELETE CASCADE, ");
        contato.append("    user INTEGER NOT NULL, ");
        contato.append("    created_at datetime NOT NULL, ");
        contato.append("    updated_at datetime NOT NULL, ");
        contato.append("    status INTEGER NOT NULL, ");
        contato.append("    sync INTEGER NOT NULL, ");
        contato.append("    nome varchar (150) NOT NULL, ");
        contato.append("    email varchar (150) NOT NULL, ");
        contato.append("    telefone varchar (14) NOT NULL");
        contato.append(" ); ");

        return contato.toString();
    }

    public static String getCompromisso() {

        StringBuilder compromisso = new StringBuilder();

        compromisso.append("CREATE TABLE IF NOT EXISTS compromisso ( ");
        compromisso.append("    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        compromisso.append("    user INTEGER NOT NULL, ");
        compromisso.append("    created_at datetime NOT NULL, ");
        compromisso.append("    updated_at datetime NOT NULL, ");
        compromisso.append("    nome varchar (255) NOT NULL, ");
        compromisso.append("    descricao longtext NOT NULL, ");
        compromisso.append("    local varchar (255) NOT NULL, ");
        compromisso.append("    status INTEGER NOT NULL, ");
        compromisso.append("    sync INTEGER NOT NULL, ");
        compromisso.append("    data datetime NOT NULL");
        compromisso.append(" ); ");

        return compromisso.toString();
    }

}
