/* Todos los Derechos Reservados 2013 BCM.
 *  Bufete Consultor Mexicano
 *
 *  Este software contiene informacion propiedad exclusiva del BCM considerada
 *  Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 *  parcial o total.
 *  
 */
package mx.com.bcm.banamex.ae.apliacion.web.controller.catalogo;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.JRException;
import mx.com.bcm.banamex.ae.apliacion.web.controller.helper.ErrorMessageHelper;
import mx.com.bcm.banamex.ae.negocio.common.GlobalReportAbstract;
import mx.com.bcm.banamex.ae.negocio.facade.CatalogoFacade;
import mx.com.bcm.banamex.ae.persistencia.constantes.CodigoMensajeType;
import mx.com.bcm.banamex.ae.persistencia.exception.EfectivoAplicacionBOException;
import mx.com.bcm.banamex.ae.persistencia.vo.MensajeAewebVO;
import mx.com.bcm.banamex.ae.persistencia.vo.SubBovedaVO;


/**
 * @author atinajero ABRAHAM ALFONSO TINAJERO SÁNCHEZ Describe : La clase
 *         muestra un ejemplo claro de como consumir servicios y concatena el
 *         valor de una cadena.
 */
@ManagedBean(name = "subBovedaGridMB")
@RequestScoped
public class SubBovedaGridMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Servicio MessageBOBean EJB para el consumo de servicios
	 */
	@EJB
	private CatalogoFacade catalogoFacade;
	private List<SubBovedaVO> listaSubBoveda;
	private SubBovedaVO subBovedaVO;
	private MensajeAewebVO mensajeError;
	private GlobalReportAbstract reportSubBoveda;

	/**
	 * @return the subBovedaVO
	 */
	public SubBovedaVO getSubBovedaVO() {
		return subBovedaVO;
	}

	/**
	 * @param subBovedaVO
	 *            the subBovedaVO to set
	 */
	public void setSubBovedaVO(SubBovedaVO subBovedaVO) {
		this.subBovedaVO = subBovedaVO;
	}

	/**
	 * @return the listaSubBoveda
	 */
	public List<SubBovedaVO> getListaSubBoveda() {
		return listaSubBoveda;
	}

	/**
	 * @param listaSubBoveda
	 *            the listaSubBoveda to set
	 */
	public void setListaSubBoveda(List<SubBovedaVO> listaSubBoveda) {
		this.listaSubBoveda = listaSubBoveda;
	}

	public void consultaSubBoveda() throws EfectivoAplicacionBOException {
		this.catalogoFacade.getCatalogoSubBovedaBO().consultSubBovedas();

	}

	/**
	 * 
	 * Agregar registro
	 * 
	 * @throws EfectivoAplicacionBOException
	 */

	public void agregar() {

		subBovedaVO.setPlazaIdn(this.listaSubBoveda.get(0).getPlazaIdn());
		subBovedaVO.setSirhIdn(this.listaSubBoveda.get(0).getSirhIdn());

		try {

			this.catalogoFacade.getCatalogoSubBovedaBO().addSubBovedas(
					this.subBovedaVO);
			this.setListaSubBoveda(this.catalogoFacade.getCatalogoSubBovedaBO()
					.consultSubBovedas());

			mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.ALTA_CATALOGO.getValue());
			ErrorMessageHelper.addSuccessMessage(mensajeError
					.getMensajeDescripcion());
		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			ErrorMessageHelper.addErrorMessage(e.getMessage());
		}

	}

	public void editar() throws EfectivoAplicacionBOException {
		try {
			subBovedaVO.setPlazaIdn(this.listaSubBoveda.get(0).getPlazaIdn());
			subBovedaVO.setSirhIdn(this.listaSubBoveda.get(0).getSirhIdn());

			this.catalogoFacade.getCatalogoSubBovedaBO().editSubBovedas(
					this.subBovedaVO);
			this.setListaSubBoveda(this.catalogoFacade.getCatalogoSubBovedaBO()
					.consultSubBovedas());
			this.refresh();
			mensajeError = this.catalogoFacade
					.getCatalogoMensajeAewebBO()
					.consultaCatalogoMensajePorCodigo(
							CodigoMensajeType.ACTUALIZACION_CATALOGO.getValue());
			ErrorMessageHelper.addSuccessMessage(mensajeError
					.getMensajeDescripcion());
		} catch (EfectivoAplicacionBOException e) {
			ErrorMessageHelper.addErrorMessage(e.getMessage());
		}

	}

	public void generarRepore() throws JRException, IOException {

		reportSubBoveda = new GlobalReportAbstract();
		reportSubBoveda.prepararReporte(listaSubBoveda, "SubBoveda.jasper");
		this.reportSubBoveda.PDF("ReporteCatSubBoveda");

	}

	public void refresh() {
		FacesContext context = FacesContext.getCurrentInstance();
		Application application = context.getApplication();
		ViewHandler viewHandler = application.getViewHandler();
		UIViewRoot viewRoot = viewHandler.createView(context, context
				.getViewRoot().getViewId());
		context.setViewRoot(viewRoot);
		context.renderResponse();
	}

	public String consultaSubBovedaPorId() throws EfectivoAplicacionBOException {
		subBovedaVO = this.getSubBovedaVO();
		long id = this.subBovedaVO.getIdnSubBoveda();

		try {
			this.subBovedaVO = this.catalogoFacade.getCatalogoSubBovedaBO()
					.consultarPorIdnSubBoveda((short) id);

		} catch (EfectivoAplicacionBOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "subbovedasEdit";

	}

	@PostConstruct
	public void init() {
		this.subBovedaVO = new SubBovedaVO();
		try {

			this.setListaSubBoveda(this.catalogoFacade.getCatalogoSubBovedaBO()
					.consultSubBovedas());

		} catch (EfectivoAplicacionBOException e) {
			e.printStackTrace();

			try {
				mensajeError = this.catalogoFacade.getCatalogoMensajeAewebBO()
						.consultaCatalogoMensajePorCodigo(
								CodigoMensajeType.CONTRATO_CONSULTA_CATALOGO
										.getValue());
			} catch (EfectivoAplicacionBOException e1) {

				e1.printStackTrace();
			}
			ErrorMessageHelper.addSuccessMessage(mensajeError
					.getMensajeDescripcion());

		}

	}

}
