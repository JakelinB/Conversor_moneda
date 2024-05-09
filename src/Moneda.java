import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Moneda {
    Object conversion_rates;
    String base_code;

    public Object getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Object conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    //Metodo para convertir el objeto conversion_rates, a un map, para buscar una tasa de cambio predeterminada
    private Map ConvertirJsonAMap() {
        Gson gson = new Gson();
        String json = gson.toJson(this.conversion_rates);
        Map<String, Double> map = gson.fromJson(json, new TypeToken<Map<String, Double>>() {}.getType());
        return map;
        //System.out.println(map.get(base_code));
    }

    //Metodo que nos convierte la cantidad ingresada por el usuario en la moneda que elija
    //esto según la tasa de cambio obtenida por el codigo ingresado
    public double obtenerValorDivisa(double valorACambiar, Object tipoDeMonedaDeCambio){
        try{
            Map tasaDeCambio = new HashMap<>();
            tasaDeCambio = ConvertirJsonAMap();
            Double valorCambiado = ((Double) tasaDeCambio.get(tipoDeMonedaDeCambio))*valorACambiar;
            return valorCambiado;
        }catch (NullPointerException e){
            //En caso de que no se encuentre el codigo, procedemos retornar mensaje de advertencia
            //Y retornarlo al menú de opciones
            System.out.println("Opción no valida, por favor, intenta de nuevo");
            return 0;
        }
    }

    public double obtenerCodigoDivisa(String cadenaAdivir){

        // Patrón para encontrar números
        Pattern patronNumeros = Pattern.compile("\\d+");
        Matcher matcherNumeros = patronNumeros.matcher(cadenaAdivir);

        // Encontrar y concatenar todos los números encontrados
        StringBuilder numeros = new StringBuilder();
        while (matcherNumeros.find()) {
            numeros.append(matcherNumeros.group());
        }

        // Convertir el resultado a una cadena y devolverlo
        Double resultadoNumerico = Double.valueOf(numeros.toString());
        return  resultadoNumerico;


    }
    public String sacarLetra(String cadenaAconvertir){
        // Patrón para encontrar letras
        Pattern patronLetras = Pattern.compile("[a-zA-Z]+");
        Matcher matcherLetras = patronLetras.matcher(cadenaAconvertir);

        // Encontrar y concatenar todas las letras encontradas
        StringBuilder letras = new StringBuilder();
        while (matcherLetras.find()) {
            letras.append(matcherLetras.group());
        }

        // Convertir el resultado a una cadena
        String resultadoLetras = letras.toString();
        return resultadoLetras;

    }

    //Descomentar si quieres imprimir lo que contenga la clase moneda el objeto moneda
    /*
    @Override
    public String toString() {
        return "Moneda{" +
                "conversion_rates= " + conversion_rates +
                ", base_code= '" + base_code + '\'' +
                '}';
    }*/
}
