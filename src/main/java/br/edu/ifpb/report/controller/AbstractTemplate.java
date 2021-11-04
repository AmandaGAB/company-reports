package br.edu.ifpb.report.controller;



public abstract class AbstractTemplate{

    

    public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToThis();
    }


    abstract void createDatabaseConnection();
    abstract void executeQuery();
    abstract void convertToThis();




}