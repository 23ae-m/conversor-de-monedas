import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int option = 0;
        while (option != 8){
            System.out.println("*****************************\n" +
                    "Bienvenidos Al Conversor De Monedas\n\n" +
                    "Ingrese la conversion que deseas realizar \n\n" +
                    "1. Dollar a Peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brasileño\n" +
                    "4. Real Brasileño a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Convertir otra Moneda\n" +
                    "8. Salir");
            option = lectura.nextInt();
            lectura.nextLine();

            switch (option) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }


}
