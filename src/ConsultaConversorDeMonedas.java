import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversorDeMonedas {
    public ConversorDeMonedas buscaConversorDeMonedas(String monedaBase, String monedaDeDestino, float cantidad) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e9e79a52ba02745a02fbbda8/pair/" + monedaBase + "/" + monedaDeDestino + "/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ConversorDeMonedas.class);
    }
}
