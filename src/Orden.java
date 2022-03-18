import java.util.Map;
/**
 * 
 * @author liter
 *
 */
public class Orden {

	/**
	 * Método para añadir cartas
	 * @param mapa
	 * @param mapa2
	 * @param nombreCarta
	 * @return
	 */
    public static boolean añadir(Map<Integer, Cartas> mapa, Map<Integer, Cartas> mapa2, String nombreCarta){
        for (Map.Entry<Integer, Cartas> entry : mapa.entrySet()){
            if (entry.getValue().getNombre().equals(nombreCarta)){
                if (mapa2.isEmpty()){
                    mapa2.put(1, entry.getValue());
                    mapa.remove(entry.getKey());
                    return true;
                } else {
                    mapa2.put(mapa2.size() + 1, entry.getValue());
                    mapa.remove(entry.getKey());
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método para mostrar el tipo de cartas
     * @param map
     * @param cardName
     * @return
     */
    public static String mostrarTipo(Map<Integer, Cartas> map, String nombre){
        for (Map.Entry<Integer, Cartas> entry : map.entrySet()){
            if (entry.getValue().getNombre().equals(nombre)){
                return "\nTipo de carta: " + entry.getValue().getTipo();
            }
        }
        return "\nLa carta ingresada es inválida";
    }

    /**
     * Método para mostrar cartas
     * @param mapa2
     * @return
     */
    public static String mostrarCartas(Map<Integer, Cartas> mapa2){
        String todo = "";
        for (Map.Entry<Integer, Cartas> nuevo : mapa2.entrySet()) {
            todo += nuevo.getValue() + "\n";
        }
        return todo;
    }
    /**
     * Método para filtrar cartas de colección por tipo
     * @param mapa2
     * @return
     */
    public static String filtro(Map<Integer, Cartas> mapa2){
        String monstruos = "\nTIPO MONSTRUO\n";
        String hechizos = "\nTIPO HECHIZO\n";
        String trampas = "\nTIPO TRAMPA\n";
        int monstruo = 0;
        int hechizo = 0;
        int trampa = 0;
        for (Map.Entry<Integer, Cartas> entry : mapa2.entrySet()) {
            if(entry.getValue().getTipo().equals("Monstruo")){
            	monstruo ++;
            }
            else if (entry.getValue().getTipo().equals("Hechizo")) {
            	hechizo++;
            }
            
            else {
            	trampa ++;
            }
        	
            if (entry.getValue().getTipo().equals("Monstruo")){
                monstruos += "Nombre: " + entry.getValue().getNombre() + " Tipo: " + entry.getValue().getTipo() + "\n";
            } 
            else if (entry.getValue().getTipo().equals("Hechizo")){
                hechizos += "Nombre: " + entry.getValue().getNombre() + " Tipo: " + entry.getValue().getTipo() + "\n";
            } 
            else if (entry.getValue().getTipo().equals("Trampa")){
                trampas += "Nombre: " + entry.getValue().getNombre() + " Tipo: " + entry.getValue().getTipo() + "\n";
            }
            
            
            
        }
        return monstruos + hechizos + trampas + "\nCantidad de monstruos: " + Integer.toString(monstruo)
        + "\nCantidad de hechizos: " + Integer.toString(hechizo) + "\nCantidad de trampas: " + Integer.toString(trampa);
    }
    
}
