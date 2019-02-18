package org.neo4j.sample;

import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;

public class SampleTest {

    @Test
    public void testEmbeddedDatabase() {

        GraphDatabaseService gds = new GraphDatabaseFactory().newEmbeddedDatabase(new File("data"));
        gds.shutdown();
    }
}
