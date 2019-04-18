import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCursor;

public class DocMaker {

	public static void main(String[] args) {
		MongoClient mongoClient = connectToServer();
		DB db = mongoClient.getDB("node-mongo-registration-login-api");
		BasicDBObject query = new BasicDBObject("notify", true);
		DBCursor cursor = db.getCollection("users").find(query);
		System.out.println(cursor.count());
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}	

	}
	
	private static MongoClient connectToServer() {
		int port = 27017;
		String ipAddr = "127.0.0.1";
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient(ipAddr, port);
		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (mongoClient != null)
				System.out.println("Connected to " + ipAddr + " on port " + port + "! :)");
		}
		return mongoClient;
	}
}