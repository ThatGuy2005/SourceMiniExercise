
package com.mycompany.sourceminiexercise;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSource implements Source {
    public DatabaseSource(String connectionString) 
            throws IllegalArgumentException{
        if(isValid(connectionString)) {
            this.connectionString = connectionString;
        } else {
            throw new IllegalArgumentException("Invalid connection string.");
        }
        // Get name from connection string or add another argument
        if(!isDatabase(connectionString)) {
            // Create database
        }
    }
    
    @Override
    public boolean checkSource() {
        // And other conditions if needed
        if(isInternet() && isConnected() && isTable("Users"))
        {
            return true;
        }
        return false;
    }
    
    @Override
    public List readSource() {
        List<Object> results = new ArrayList<Object>();
        if(checkSource()) {
            // Set up connection, get data, parse it
            // add results to list
        }
        return results;
    }
    
    private boolean isInternet() {
        // Check for internet connection
        return true;
    }
    
    private boolean isConnected() {
        // Check for http code
        return true;
    }
    
    private boolean isTable(String table) {
        // Check if the table exists.
        return true;
    }
    
    private boolean isDatabase(String name) {
        // For a local SQLite database check if exists
        return true;
    }
    
    private boolean isValid(String connectionString) {
        // Check if url is valid
        return true;
    }
    
    private String connectionString;
}
