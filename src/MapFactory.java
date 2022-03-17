import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
/**
 * 
 * @author liter
 *
 * @param <N>
 * @param <S>
 */
public class MapFactory<N,S> {
	
	public MapFactory(){
	}
	
	/**
	 * 
	 * @param opcion
	 * @return
	 */
	public Map<N,S> getMap(String opcion){
		//Opcion HashMap
		if(opcion.equals("1")) {
			return new HashMap<N,S>();
		}
		else
			//Opcion TreeMap
			if(opcion.equals("2")) {
				return new TreeMap<N,S>();
			}
			else
				//Opcion LinkedHashMap
				if(opcion.equals("3")) {
					return new LinkedHashMap<N,S>();
				}
				//Opcion inválida
				else {
					return null;
				}
		
		
	}

	
}
	


