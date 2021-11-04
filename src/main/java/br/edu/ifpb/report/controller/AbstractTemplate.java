package br.edu.ifpb.report.controller;


public abstract class AbstractTemplate{

    

    public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToThis();
    }
    public abstract void ConnectorDatabase connector();
    public abstract void createDatabaseConnection();
    public abstract void executeQuery();
    public abstract void convertToThis();




}