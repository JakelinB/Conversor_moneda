import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menus {
    //Metodo para mostrar mensaje aclaratorio de las principales tipos de monedas soportadas
    public void notaInicial(){
        System.out.println("\n/****POR FAVOR TENER EN CUENTA QUE LOS CODIGOS DE LOS PAISES " +
                "ADMINITIDOS SON LOS SIGUIENTES****/\n" +
                "---------------------------------------------------------------------------");
        System.out.println("CODIGO\t NOMBRE_MONEDA\t         PAIS_MONEDA\n" +
                "----------------------------------------------------------------\n"+
                "USD\t     Dolar Estadounidense\t EEUU\n"+
                "CHF\t     Franco Suizo        \t SUIZA\n"+
                "JPY\t     Yen Japones         \t JAPÓN\n"+
                "HKD\t     Dolar Hongkones     \t HONG KONG\n"+
                "CAD\t     Dolar Canadiense    \t CANADA\n"+
                "CNY\t     Yuan Chino          \t CHINA\n"+
                "BRL\t     Real Brasileño      \t BRASIL\n"+
                "RUB\t     Rubio Ruso          \t RUSIA\n"+
                "MXN\t     Peso Méxicano       \t MÉXICO\n"+
                "COP\t     Peso Colombiano     \t COLOMBIA\n"+
                "ARS\t     Peso Argentino      \t ARGENTINA\n"+
                "AUD\t     Dolar Australiano   \t AUSTRALIA\n"+
                "BSD\t     Dolar Bahameño      \t LAS BAHAMAS\n"+
                "DOP\t     Peso Dominicano     \t Rep. DOMINICANA\n"+
                "PEN\t     Sol Peruano         \t PERU\n"+
                "Puede convertir de cuaquiera de estas monedas a cualquiera de ellas, " +
                "en caso de ingresar otro codigo se atiene a verificación"
        );
        System.out.println("----------------------------------------------------------------");
    }

    //Metodo para mostrar el menu de opciones con que cuenta el usuario
    public int menuInicial(){
        Scanner lectura = new Scanner(System.in);
        int opcion;
        try {
            System.out.println("/***********MENU************/\n" +
                    "!BIENVENIDO, QUE DESEA REALIZAR EL DIA DE HOY¡\n" +
                    "Marque 1, para: consultar su historial de conversiones\n" +
                    "Marque 2, para: realizar una conversión de monedas\n" +
                    "Marque 0, para: Salir del programa");
            opcion = lectura.nextInt();
            return opcion;
        }catch (Exception e){
            return 8;
        }
    }

}
