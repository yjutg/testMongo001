package testMongo001.testMongo001;
import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class TestMongo001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//修改为自己本地的数据库地址
		String uri = "mongodb://127.0.0.1:27017";
	    try (MongoClient mongoClient = MongoClients.create(uri)) {
	        MongoDatabase database = mongoClient.getDatabase("pymongodb");
	        MongoCollection<Document> collection = database.getCollection("zzcc");
	        Document doc = collection.find().first();
	        System.out.println(doc.toJson());
	    }
	}

}
