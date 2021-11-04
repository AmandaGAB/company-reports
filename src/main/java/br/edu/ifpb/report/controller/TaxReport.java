package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends AbstractTemplate{


    public MysqlDatabaseConnector connector(){
        return new MysqlDatabaseConnector();

    }

   /*  private MysqlDatabaseConnector connector = new MysqlDatabaseConnector(); */

    /* public void generate() {
        createDatabaseConnection();
        executeMySQLQuery();
        convertToPDF();
    } */

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector().openConnection();
    }

    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector().executeQuery(query);
    }

    public void convertToThis() {
        System.out.println("Converting To PDF...");
    }
}
