package Utils;

import Models.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsumirAPI {
    Scanner entrada = new Scanner(System.in);

    public Moneda moneda(String monedaBase){
        monedaBase = URLEncoder.encode(monedaBase, StandardCharsets.UTF_8);

        //Aqui se puede cambiar el APIKEY
        String tuAPiKey = ""; //Meter aqui tu APIKEY
        String pathURL = "https://v6.exchangerate-api.com/v6/"+tuAPiKey+"/latest/"+monedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(pathURL))
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            System.out.println("No encontre la moneda");
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Double PedirDivisa(String divisa){
        System.out.println("Dame la cantidad de "+divisa+" a cambiar");
        return entrada.nextDouble();
    }

}
