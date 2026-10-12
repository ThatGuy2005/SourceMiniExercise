
package com.mycompany.sourceminiexercise;

import java.util.List;

public interface Source<T> {
    public boolean checkSource();
    public List<T> readSource();
    // Add other functions as needed
}
