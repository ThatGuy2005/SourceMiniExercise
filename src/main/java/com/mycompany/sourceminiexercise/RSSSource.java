
package com.mycompany.sourceminiexercise;

import java.util.ArrayList;
import java.util.List;

public class RSSSource implements Source {
    public RSSSource(String url) throws IllegalArgumentException{
        if(isValid(url)) {
            this.url = url;
        } else {
            throw new IllegalArgumentException("Invalid url.");
        }
    }
    
    @Override
    public boolean checkSource() {
        if(isInternet() && isConnected())
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
    
    private boolean isValid(String url) {
        // Check if url is valid
        return true;
    }
    
    private String url;
}
