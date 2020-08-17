package pe.unjfsc.daw.spring5.logical;

import org.slf4j.Logger;

import pe.unjfsc.daw.spring5.entity.CENumeroPrimo;



public class CLNumeroPrimo {
	public static final Logger LOG = org.slf4j.LoggerFactory.getLogger("CLNumeroPrimo");
	public CENumeroPrimo NumeroPrimo(int n1,int n2,int n3) {
		int val;
		CENumeroPrimo oCENumeroPrimo= new CENumeroPrimo();
		boolean a = EsPrimo(n1);
		boolean b = EsPrimo(n2);
		boolean c = EsPrimo(n3);
		
		if(a && b && c){
	           
	           if(n2<n3){
	               val=n3;
	               n3=n2;
	               n2=val;
	           }
	           if(n1<n2){
	               val=n2;
	               n2=n1;
	               n1=val;
	           }
	            if(n2<n3){
	               val=n3;
	               n3=n2;
	               n2=val;
	           }
	       oCENumeroPrimo.setNumero1(n1);
	       oCENumeroPrimo.setNumero2(n2);
	       oCENumeroPrimo.setNumero3(n3);
	       
		LOG.info("[EVL] Ordenado : {}", oCENumeroPrimo);
	}if(a == false){
		LOG.info("no es primo" + " " + n1);
	}if(a == true) {
		LOG.info("primo" + " " + n1);
	}if(b == false) {
		LOG.info("no es primo" + " " + n2);
	}if(b == true) {
		LOG.info("primo" + " " + n2);
	}if(c == false) {
		LOG.info("no es primo" + " " + n3);
	}if(c == true) {
		LOG.info("primo" + " " + n3);
	}
		return oCENumeroPrimo;
}
public static boolean EsPrimo(int numero) {
	int primo[] = {2,3,5,7,11,13,17,19,23,29};
	boolean rpta = false;
	if(numero == 2) {
		return true;
	}else {
		for (int i = 0; i < primo.length; i++) { 
            
	           int residuo  = getResiduo(numero,primo[i]);
	           int cociente = getCociente(numero, primo[i]);
	            if (residuo!=0) {
	                if (cociente>primo[i]) {
	                }else{
	                    rpta = true;
	                    break;
	                }
	            }else{
	                rpta = false;          
	                break;
	            }                
	        }
	        return rpta;
	}
} 
public static int getResiduo(int dividendo,int divisor){                  
	return dividendo % divisor;
}
public static int getCociente(int dividendo, int divisor){        
	return dividendo / divisor;
}

}
