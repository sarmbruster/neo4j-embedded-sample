package org.neo4j.sample;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;

public class EmbeddedSample {

    public static void main(String[] args) {
        GraphDatabaseService db = new GraphDatabaseFactory().newEmbeddedDatabase(new File("data"));
        db.shutdown();
    }
}
