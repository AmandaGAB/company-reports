package br.edu.ifpb.report.database;

public interface ConnectorDatabase {
     void openConnection();
     void executeQuery(String query);

}
