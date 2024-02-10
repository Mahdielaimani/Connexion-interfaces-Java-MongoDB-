package db;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

            MongoDatabase database = mongoClient.getDatabase("ConnectionJava");

            MongoCollection<Document> collection = database.getCollection("articles");

            System.out.println("Connected to MongoDB successfully.");

            FindIterable<Document> documents = collection.find();

            for (Document document : documents) {
                System.out.println(document.toJson());
            }

            mongoClient.close();
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e);
        }
    }
}
