

package com.mycompany.sourceminiexercise;

import Sources.DatabaseSource;
import Sources.Source;
import java.util.List;

public class SourceMiniExercise {
    public static List<Object> readThings(Source source) {
        return source.readSource();
    }

    public static void main(String[] args) {
        List<Object> things = readThings(new DatabaseSource("MyDB.db"));
    }
}
