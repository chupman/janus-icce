package org.cdlib;

import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.janusgraph.core.JanusGraphFactory;

public class JanusICCE {
  public static void main(String[] args) {
    Graph g0 = TinkerGraph.open();
    Vertex r0 = g0.addVertex("root");
    System.out.println("TinkerGraph root ID: " + r0.id());

    Graph g1 = JanusGraphFactory.build().set("storage.backend", "inmemory").open();
    Vertex r1 = g1.addVertex("root");
    System.out.println("JanusGraph root ID: " + r1.id());
  }
}
