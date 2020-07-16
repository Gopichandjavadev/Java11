package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class NewHttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {
      String message = "Hello";
      
      System.out.println(message);
      
      HttpClient client = HttpClient.newHttpClient();
      
      HttpRequest req = HttpRequest.newBuilder(URI.create("https://www.pluralsight.com:443/")).GET().build();
      
      HttpResponse<String> response = client.send(req, BodyHandlers.ofString());
      
      System.out.println(response.body());
      
      
      HttpClient client1 = HttpClient.newHttpClient();
      
      HttpRequest req1 = HttpRequest.newBuilder(URI.create("https://google.com")).GET().build();
      
      CompletableFuture<HttpResponse<String>> asyncResponse = client1.sendAsync(req1, BodyHandlers.ofString());
      
      asyncResponse.thenAccept(res -> System.out.println(res.version()));
      
      asyncResponse.join();
      

    }

}
