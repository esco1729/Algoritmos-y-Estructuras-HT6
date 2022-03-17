/**
 * 
 * @author liter
 *
 */
public class Cartas{
    
    private String nombre;
    private String tipo;
    private int cantidad;
    /**
     * 
     * @param nombre
     * @param tipo
     * @param cantidad
     */
    public Cartas(String nombre, String tipo, int cantidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    /**
     * Obtener nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String cardName) {
        this.nombre = cardName;
    }
    /**
     * Obtener tipo
     * @return
     */
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String cardType) {
        this.tipo = cardType;
    }

    /**
     * 
     */
    public String toString(){
        return " Card Name: " + this.nombre +
                " Card Type: " + this.tipo;
    }

}

