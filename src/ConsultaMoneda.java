import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda consultaMoneda(String tasaCambio){
        //realizamos la creación de la URI para la conexion con la API
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/122d88b2cf4449a71052e1ef/latest/"+tasaCambio);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        //Hacemos la petición para obtener las tasas de cambio
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("El codigo Ingresado no es valido, El programa termino!");

        }
        //Realizamos el cambio del json por nuestra clase moneda
        return new Gson().fromJson(response.body(), Moneda.class);


    }
}
