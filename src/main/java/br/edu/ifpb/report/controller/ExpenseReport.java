package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends AbstractTemplate{
    
    
    public PostgreSQLDatabaseConnector connector(){
        return new PostgreSQLDatabaseConnector();

    }
    /* private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector(); */

   /*  public void generate() {
        createDatabaseConnection();
        executePostgresQuery();
        convertToXLS();
    } */

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector().openConnection();
    }

    public void executePostgresQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector().executeQuery(query);
    }

    public void convertToXLS() {
        System.out.println("Converting To XLS...");
    }

}
