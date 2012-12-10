/**
 * 
 */
package com.examine.data;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * @author sang
 *
 */
public class MongoDBConnection {
	private MongoClient mongoClient; 
	private String dbName; 
	private String hostName;
	private String collectionName;
	private int dbPort;
	private DB db;
	private DBCollection colls;
	private DBCursor cursor;
	
	
	public MongoDBConnection(){
		
	}


	/**
	 * @param dbName
	 * @param collectionName
	 * @param dbPort
	 */
	public MongoDBConnection(String dbName, String collectionName, int dbPort, String hostName) {
		//super();
		this.dbName = dbName;
		this.collectionName = collectionName;
		this.dbPort = dbPort;
		this.hostName = hostName;
	}
	
	
	
	public void createConnection(){
		try {
			mongoClient = new MongoClient(this.hostName, this.dbPort);
			db = mongoClient.getDB(this.dbName);
			colls = db.getCollection(this.collectionName);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean existData(BasicDBObject obj){
		//this.createConnection();
		cursor = colls.find(obj);
		//System.out.println(cursor.size());
		//while(cursor.hasNext()){
		//	System.out.println(cursor.next());
		//}
		//return true;
		return (cursor.size() > 0);
	}
	
	
}
