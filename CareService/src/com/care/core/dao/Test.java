package com.care.core.dao;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;
public class Test {

	public static void main(String[] args) {
		//TransactionalGraph graph = new OrientGraph("remote:localhost/ocare", "mrigank", "Passw0rd");
		OrientGraphFactory factory = new OrientGraphFactory("remote:localhost/ocare", "9833721131", "Passw0rd");
		
		// Get connection to database 
		OrientGraph graph = factory.getTx();
		
		
		try{
			/*Vertex vuser = graph.addVertex("class:user");
			vuser.setProperty("name", "2222222");
			vuser.setProperty("password", "Passw0rd");
			
			vuser.setProperty("status", "ACTIVE");
			vuser.setProperty("lastip", "10.5.4.78");*/
			
			for(Edge e:graph.getEdgesOfClass("ORole")){
				System.out.println(e.getLabel());
			}
			//Edge inroles = graph.addEdge(null, 2222222, webuser, "in_roles");
			//graph.commit();
		}finally {
			graph.shutdown();
		}
	}

}
