import java.io.*;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author liter
 *
 */
public class Main {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
    	try {

        Boolean selección = true;
        Map<Integer, Cartas> map = null;
        Map<Integer, Cartas> map2 = null;
        MapFactory mapFactory = new MapFactory();

        while (selección){

            System.out.println(menuPrincipal());
            System.out.print("Seleccione una implementación: ");

            Scanner scn = new Scanner(System.in);
            String opcc = scn.next();

            switch (opcc){
                case "1":
                    map = mapFactory.getMap("1");
                    map2 = mapFactory.getMap("1");
                    map = readFile(map);
                    selección = false;
                    break;
                case "2":
                    map = mapFactory.getMap("2");
                    map2 = mapFactory.getMap("2");
                    map = readFile(map);
                    selección = false;
                    break;
                case "3":
                    map = mapFactory.getMap("3");
                    map2 = mapFactory.getMap("3");
                    map = readFile(map);
                    selección = false;
                    break;
                default:
                    System.out.println("\nLa opcion ingresada no es valida.\n");
                    break;
            }
        }

        Boolean whantsToContinue = true;

        while (whantsToContinue){

            System.out.println(menu2());
            System.out.print("Seleccione una opcion: ");

            Scanner input2 = new Scanner(System.in);
            String op2 = input2.next();

            switch (op2){
                case "1":
                    System.out.print("\nIngrese nombre de la carta a agregar: ");
                    Scanner input3 = new Scanner(System.in);
                    String nombreCarta = input3.nextLine();
                    if (Orden.añadir(map, map2, nombreCarta))
                        System.out.println("\nLa carta fue agregada exitosamente");
                    else
                        System.out.println("\nNO existe la carta solicitada");
                    break;
                case "2":
                    System.out.print("\nIngrese nombre de la carta a buscar: ");
                    Scanner input4 = new Scanner(System.in);
                    String nombreCarta2 = input4.nextLine();
                    System.out.println(Orden.mostrarTipo(map, nombreCarta2));
                    break;
                case "3":
                    System.out.println(Orden.mostrarCartas(map2));
                    break;
                case "4":
                    System.out.println(Orden.filtro(map2));
                    break;
                case "5":
                    System.out.println(map);
                    break;
                case "6":
                    System.out.println(Orden.filtro(map));
                    break;
                case "7":
                    whantsToContinue = false;
                    break;
                default:
                    break;
            }

        }
    	}catch(Exception ie) {
    		System.out.println("No se ha encontrado el archivo.");
    	}


    }
    /**
     * Leer el archivo relativo
     * @param map
     * @return
     */
    public static Map readFile(Map map){
    	try {

        File file = new File("C:\\Users\\liter\\OneDrive\\Escritorio\\Universidad\\Semestre V\\Algoritmos y Estructuras de Datos\\Laboratorio 6\\Algoritmos-y-Estructuras-HT6\\src\\cards_desc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        Integer key = 1;

        while ((line = bufferedReader.readLine()) != null){

            String[] nombreTipo = line.split("\\|");

            String nombreCarta = nombreTipo[0];
            String tipoCarta = nombreTipo[1];

            map.put(key, new Cartas(nombreCarta, tipoCarta, key));

            key++;

        }
    	}catch(Exception ie) {
    		System.out.println("No se ha encontrado el archivo.");
    	}
        return map;

    }

    /**
     * Menú Principal
     * 
     */
    public static String menuPrincipal(){
        return "Seleccione una implementación:\n " +
                "\n1. HashMap\n" +
                "2. TreeMap\n" +
                "3. LinkedHashMap\n";
    }

    /**
     * Menú 2
     * 
     */
    public static String menu2(){
        return "\nMenú principal\n" +
                "1. Agregar carta a colección del usuario\n" +
                "2. Mostrar tipo de una carta especifica\n" +
                "3. Mostrar el nombre, tipo y cantidad de cada carta en mi colección\n" +
                "4. Mostrar el nombre, tipo y cantidad de cada carta ordenadas por tipo en mi colección\n" +
                "5. Mostrar nombre y tipo de cartas existentes\n" +
                "6. Mostrar nombre y tipo de cartas existentes ordenadas por tipo\n" +
                "7. Salir\n";
    }
}