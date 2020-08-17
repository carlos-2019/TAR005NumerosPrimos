package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CENumeroPrimo;
import pe.unjfsc.daw.spring5.logical.CLNumeroPrimo;



public class CVMostrarNumeroPrimo {
	public static final Logger LOG = org.slf4j.LoggerFactory.getLogger("CVMostrarNumeroPrimo");
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando CVContextFactorial");
		ApplicationContext onCntx = new ClassPathXmlApplicationContext("NumeroPrimo.xml");
		
		LOG.info("[EVL] Instancia ApplicationContext : {}", onCntx);
		
		CENumeroPrimo oCENumeroPrimo =(CENumeroPrimo) onCntx.getBean("idCENumeroPrimo");
		CLNumeroPrimo oCLNumeroPrimo =(CLNumeroPrimo) onCntx.getBean("idCLNumeroPrimo");
		
		LOG.info("[EVL] Instancia with data : {}", oCENumeroPrimo);
		LOG.info("[EVL] Instancia with data : {}", oCLNumeroPrimo);
		
		oCENumeroPrimo = oCLNumeroPrimo.NumeroPrimo(3, 17, 29);
		LOG.info("[EVL] Numero primo : {}", oCENumeroPrimo);
		((ConfigurableApplicationContext) onCntx).close();
	}
}
