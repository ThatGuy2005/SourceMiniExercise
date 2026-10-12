
package com.mycompany.sourceminiexercise;

import java.util.ArrayList;
import java.util.List;

public class MockSource implements Source {
    public MockSource(String fileLocation) 
            throws IllegalArgumentException{
        if(isFile(fileLocation)) {
            this.fileLocation = fileLocation;
        } else {
            throw new IllegalArgumentException("Invalid file");
        }

    }
    
    @Override
    public boolean checkSource() {
        // And other conditions if needed
        if(isFile(this.fileLocation))
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
    
    private boolean isFile(String path) {
        // Check if file exists
        return true;
    }
    
    private String fileLocation;
}
