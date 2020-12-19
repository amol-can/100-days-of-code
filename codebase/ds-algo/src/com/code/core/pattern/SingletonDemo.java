package com.code.core.pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConf databaseConf = DatabaseConf.getInstance();
        System.out.println(databaseConf.getDbName());
        float f = 10.25f;
    }

    public int getSum(int a, int b){
        return a+b;
    }
}

class DatabaseConf{
    private final String hostname;
    private final String dbName;
    private static final DatabaseConf instance = new DatabaseConf();

    private DatabaseConf(){
        hostname = "dbhost.example.com";
        dbName = "sql";
    }

    public String getHostname(){
        return hostname;
    }

    public String getDbName(){
        return dbName;
    }

    public static DatabaseConf getInstance(){
        return  instance;
    }

}
