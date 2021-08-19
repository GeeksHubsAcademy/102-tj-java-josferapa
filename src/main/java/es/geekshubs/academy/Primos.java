package es.geekshubs.academy;

import java.util.ArrayList;
import java.util.List;

public class Primos {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public List<Integer> apply(final Integer input) {
    
	List<Integer> resultado = new ArrayList<Integer>();
    int i, j;
    boolean primo = true;
	
    if(input < 2) {
    	resultado = null;
    }else {
		for(i = 2; i <= input; i++) {
			for(j = 2; j < input/2; j++) {
				if(i % j == 0 && j != i) {
					primo = false;
				}
			}
			
			if(primo) {
				resultado.add(i);
			}
			
			primo = true;
		}
    }
    
    return resultado;
    
  }

}