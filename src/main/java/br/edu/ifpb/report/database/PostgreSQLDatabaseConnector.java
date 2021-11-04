package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements ConnectorDatabase {
    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }
}
