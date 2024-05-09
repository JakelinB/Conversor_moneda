import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Hacemos las declaraciones de las variable necesitamos de manera global
        int opcion;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultaM = new ConsultaMoneda();
        Moneda moneda = new Moneda();
        Menus menu = new Menus();
        ArrayList<String> historialDeConversion= new ArrayList<>(); //Este para guardar el historial de conversion

        menu.notaInicial(); //Hacemos la invocacion del mensaje inicial antes de que se muestre el menú de opciones

        //Aqui hacemos un bucle, para darle la opción al usurio de que haga las conversiones cuantas veces desee
        do {
            opcion = menu.menuInicial(); //mostramos el menu de opcion que se encuentra en la clase Menus
            switch (opcion) {
                case 1: //Imprimir el historial de las conversiones
                    if (historialDeConversion.isEmpty()) {
                        System.out.println("¡No tienes historial, para mostrar!");
                    } else {
                        System.out.println(historialDeConversion);
                    }
                    break;
                case 2: /*Hacer proceso de conversión, pidiendo al usuario los datos requerido, llamamos los metodos
                y mostramos los datos de conversión hecha al usuario*/

                    System.out.println("Ingresa el valor que deseas convertir con su respectivo codigo: ");
                    String cadena = lectura.next().toUpperCase();

                    double valorNumericoAConvertir = moneda.obtenerCodigoDivisa(cadena);

                    String divisaAConsultar = moneda.sacarLetra(cadena);

                    System.out.println("Ingresa el codigo de moneda de la que sea conocer el equivalente del valor ingresado: ");
                    String divisaABuscar = lectura.next().toUpperCase();
                    moneda = consultaM.consultaMoneda(divisaAConsultar.toUpperCase());

                    Double valorCambiado;
                    valorCambiado = moneda.obtenerValorDivisa(valorNumericoAConvertir, divisaABuscar);

                    if(valorCambiado !=0){
                        String stringArray= "**"+cadena+" equivale a: "+valorCambiado+divisaABuscar;
                        historialDeConversion.add(stringArray);
                        System.out.println("Los "+cadena+" Equivalen a: "+valorCambiado + divisaABuscar);
                    }else
                        System.out.println("El codigo que al que desea llegar, no se encontró, recuerde leer el mensaje inicial\n");
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo!");

            }
        }while (opcion!=0);
    }

}