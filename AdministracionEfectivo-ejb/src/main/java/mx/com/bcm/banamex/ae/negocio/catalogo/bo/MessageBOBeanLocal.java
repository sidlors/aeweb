 /* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.negocio.catalogo.bo;

import javax.ejb.Local;


/**
 * @author YAMIL OMAR DELGADO GONZALEZ
 *
 */
public @Local interface MessageBOBeanLocal {
 
	/**
	 * @return
	 */
	public abstract String getMessage();
}
