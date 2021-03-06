/**
 * 
 */
package mx.com.bcm.banamex.ae.persistencia.assambler;


import mx.com.bcm.banamex.ae.persistencia.dto.OperacionProcesadoraDTO;
import mx.com.bcm.banamex.ae.persistencia.modelo.DetalleInterfaceProcesadora;
import mx.com.bcm.banamex.ae.persistencia.vo.ConsultasyReportesProcesadoraVO;
import mx.com.bcm.banamex.ae.persistencia.vo.ProcesadorasListVO;


/**
 * @author OCE-WCD Vázquez Reyes Eder Israel
 * @author INGRET AGUILAR VELAZQUEZ
 *
 */

/*
* @param ConsultasyReportesProcesadoraVO
* @return
*/

public class ConsultasyReportesAssambler {
	public static ConsultasyReportesProcesadoraVO getReportproceVO(DetalleInterfaceProcesadora detalleInterfaceProcesadora){
		
		ConsultasyReportesProcesadoraVO consultasyReportesProcesadoraVO = new ConsultasyReportesProcesadoraVO();
		consultasyReportesProcesadoraVO.setDetprocTipoRegistro(detalleInterfaceProcesadora.getDetprocTipoRegistro());
		consultasyReportesProcesadoraVO.setDetprocIdentificadorMovto(detalleInterfaceProcesadora.getDetprocIdentificadorMovto());
		consultasyReportesProcesadoraVO.setDetprocEtvTraslado(detalleInterfaceProcesadora.getDetprocEtvTraslado());
		consultasyReportesProcesadoraVO.setDetprocSirhCpaeSirhOrigen(detalleInterfaceProcesadora.getDetprocSirhCpaeSirhOrigen());
		consultasyReportesProcesadoraVO.setDetprocSirhDestinoIdAtm(detalleInterfaceProcesadora.getDetprocSirhDestinoIdAtm());
		consultasyReportesProcesadoraVO.setDetprocRecoleccion(detalleInterfaceProcesadora.getDetprocRecoleccion());
		consultasyReportesProcesadoraVO.setDetprocRecepcionEnEtv(detalleInterfaceProcesadora.getDetprocRecepcionEnEtv());
		consultasyReportesProcesadoraVO.setDetprocVerificacion(detalleInterfaceProcesadora.getDetprocVerificacion());
		consultasyReportesProcesadoraVO.setDetprocAcreditacionEnBnmx(detalleInterfaceProcesadora.getDetprocAcreditacionEnBnmx());
		consultasyReportesProcesadoraVO.setDetprocInstruccionEtv(detalleInterfaceProcesadora.getDetprocInstruccionEtv());
		consultasyReportesProcesadoraVO.setDetprocPreparacionEtv(detalleInterfaceProcesadora.getDetprocPreparacionEtv());
		consultasyReportesProcesadoraVO.setDetprocEntregaATraslado(detalleInterfaceProcesadora.getDetprocEntregaATraslado());
		consultasyReportesProcesadoraVO.setDetprocEntregaFORetrnoEtv(detalleInterfaceProcesadora.getDetprocEntregaFORetrnoEtv());
		consultasyReportesProcesadoraVO.setDetprocCopmisoEntrgUsrio(detalleInterfaceProcesadora.getDetprocCopmisoEntrgUsrio());
		consultasyReportesProcesadoraVO.setDetprocNumDeComprobante(detalleInterfaceProcesadora.getDetprocNumDeComprobante());
		consultasyReportesProcesadoraVO.setDetprocDiceContener(detalleInterfaceProcesadora.getDetprocDiceContener());
		consultasyReportesProcesadoraVO.setDetprocNumUneg(detalleInterfaceProcesadora.getDetprocNumUneg());
		consultasyReportesProcesadoraVO.setDetprocContratoEfectivo(detalleInterfaceProcesadora.getDetprocContratoEfectivo());
		consultasyReportesProcesadoraVO.setDetprocUnegSefEnvase(detalleInterfaceProcesadora.getDetprocUnegSefEnvase());
		consultasyReportesProcesadoraVO.setDetprocGloblParclContendor(detalleInterfaceProcesadora.getDetprocGloblParclContendor());
		consultasyReportesProcesadoraVO.setDetprocPenalizacion1(detalleInterfaceProcesadora.getDetprocPenalizacion1());
		consultasyReportesProcesadoraVO.setDetprocPenalizacion2(detalleInterfaceProcesadora.getDetprocPenalizacion2());
		consultasyReportesProcesadoraVO.setDetprocPenalizacion3(detalleInterfaceProcesadora.getDetprocPenalizacion3());
		consultasyReportesProcesadoraVO.setDetprocPenalizacion4(detalleInterfaceProcesadora.getDetprocPenalizacion4());
		consultasyReportesProcesadoraVO.setDetprocDivisa(detalleInterfaceProcesadora.getDetprocDivisa());
		consultasyReportesProcesadoraVO.setDetprocNumCliente(detalleInterfaceProcesadora.getDetprocNumCliente());
		consultasyReportesProcesadoraVO.setDetprocFolioDeposDolares(detalleInterfaceProcesadora.getDetprocFolioDeposDolares());
		consultasyReportesProcesadoraVO.setDetprocUnegPemex(detalleInterfaceProcesadora.getDetprocUnegPemex());
		consultasyReportesProcesadoraVO.setDetprocSuc(detalleInterfaceProcesadora.getDetprocSuc());
		consultasyReportesProcesadoraVO.setDetprocCuenta(detalleInterfaceProcesadora.getDetprocCuenta());
		consultasyReportesProcesadoraVO.setDetprocImpteDeposDotacion(detalleInterfaceProcesadora.getDetprocImpteDeposDotacion());
		consultasyReportesProcesadoraVO.setDetprocRefNumerica1(detalleInterfaceProcesadora.getDetprocRefNumerica1());
		consultasyReportesProcesadoraVO.setDetprocReferenciaAlf(detalleInterfaceProcesadora.getDetprocReferenciaAlf());
		consultasyReportesProcesadoraVO.setDetprocReferenciaAlf2(detalleInterfaceProcesadora.getDetprocReferenciaAlf2());
		consultasyReportesProcesadoraVO.setDetprocReferencia3(detalleInterfaceProcesadora.getDetprocReferencia3());
		consultasyReportesProcesadoraVO.setDetprocReferencia4(detalleInterfaceProcesadora.getDetprocReferencia4());
		consultasyReportesProcesadoraVO.setDetprocComprobServSef(detalleInterfaceProcesadora.getDetprocComprobServSef());
		consultasyReportesProcesadoraVO.setDetprocTipoBill1(detalleInterfaceProcesadora.getDetprocTipoBill1());
		consultasyReportesProcesadoraVO.setDetprocDenominacion1(detalleInterfaceProcesadora.getDetprocDenominacion1());
		consultasyReportesProcesadoraVO.setDetprocImpte1(detalleInterfaceProcesadora.getDetprocImpte1());
		consultasyReportesProcesadoraVO.setDetprocTipoBill2(detalleInterfaceProcesadora.getDetprocTipoBill2());
		consultasyReportesProcesadoraVO.setDetprocDenominacion2(detalleInterfaceProcesadora.getDetprocDenominacion2());
		consultasyReportesProcesadoraVO.setDetprocImpte2(detalleInterfaceProcesadora.getDetprocImpte2());
		consultasyReportesProcesadoraVO.setDetprocTipoBill3(detalleInterfaceProcesadora.getDetprocTipoBill3());
		consultasyReportesProcesadoraVO.setDetprocDenominacion3(detalleInterfaceProcesadora.getDetprocDenominacion3());
		consultasyReportesProcesadoraVO.setDetprocImpte3(detalleInterfaceProcesadora.getDetprocImpte3());
		consultasyReportesProcesadoraVO.setDetprocTipoBill4(detalleInterfaceProcesadora.getDetprocTipoBill4());
		consultasyReportesProcesadoraVO.setDetprocDenominacion4(detalleInterfaceProcesadora.getDetprocDenominacion4());
		consultasyReportesProcesadoraVO.setDetprocImpte4(detalleInterfaceProcesadora.getDetprocImpte4());
		consultasyReportesProcesadoraVO.setDetprocTipoBill5(detalleInterfaceProcesadora.getDetprocTipoBill5());
		consultasyReportesProcesadoraVO.setDetprocDenominacion5(detalleInterfaceProcesadora.getDetprocDenominacion5());
		consultasyReportesProcesadoraVO.setDetprocImpte5(detalleInterfaceProcesadora.getDetprocImpte5());
		consultasyReportesProcesadoraVO.setDetprocTipoBill6(detalleInterfaceProcesadora.getDetprocTipoBill6());
		consultasyReportesProcesadoraVO.setDetprocDenominacion6(detalleInterfaceProcesadora.getDetprocDenominacion6());
		consultasyReportesProcesadoraVO.setDetprocImpte6(detalleInterfaceProcesadora.getDetprocImpte6());
		consultasyReportesProcesadoraVO.setDetprocTipoBill7(detalleInterfaceProcesadora.getDetprocTipoBill7());
		consultasyReportesProcesadoraVO.setDetprocDenominacion7(detalleInterfaceProcesadora.getDetprocDenominacion7());
		consultasyReportesProcesadoraVO.setDetprocImpte7(detalleInterfaceProcesadora.getDetprocImpte7());
		consultasyReportesProcesadoraVO.setDetprocTipoBill8(detalleInterfaceProcesadora.getDetprocTipoBill8());
		consultasyReportesProcesadoraVO.setDetprocDenominacion8(detalleInterfaceProcesadora.getDetprocDenominacion8());
		consultasyReportesProcesadoraVO.setDetprocImpte8(detalleInterfaceProcesadora.getDetprocImpte8());
		consultasyReportesProcesadoraVO.setDetprocTipoBill9(detalleInterfaceProcesadora.getDetprocTipoBill9());
		consultasyReportesProcesadoraVO.setDetprocDenominacion9(detalleInterfaceProcesadora.getDetprocDenominacion9());
		consultasyReportesProcesadoraVO.setDetprocImpte9(detalleInterfaceProcesadora.getDetprocImpte9());
		consultasyReportesProcesadoraVO.setDetprocTipoBill10(detalleInterfaceProcesadora.getDetprocTipoBill10());
		consultasyReportesProcesadoraVO.setDetprocDenominacion10(detalleInterfaceProcesadora.getDetprocDenominacion10());
		consultasyReportesProcesadoraVO.setDetprocImpte10(detalleInterfaceProcesadora.getDetprocImpte10());
		consultasyReportesProcesadoraVO.setDetprocTipoBill11(detalleInterfaceProcesadora.getDetprocTipoBill11());
		consultasyReportesProcesadoraVO.setDetprocDenominacion11(detalleInterfaceProcesadora.getDetprocDenominacion11());
		consultasyReportesProcesadoraVO.setDetprocImpte11(detalleInterfaceProcesadora.getDetprocImpte11());
		consultasyReportesProcesadoraVO.setDetprocTipoBill12(detalleInterfaceProcesadora.getDetprocTipoBill12());
		consultasyReportesProcesadoraVO.setDetprocDenominacion12(detalleInterfaceProcesadora.getDetprocDenominacion12());
		consultasyReportesProcesadoraVO.setDetprocImpte12(detalleInterfaceProcesadora.getDetprocImpte12());
		consultasyReportesProcesadoraVO.setDetprocTipoBill13(detalleInterfaceProcesadora.getDetprocTipoBill13());
		consultasyReportesProcesadoraVO.setDetprocDenominacion13(detalleInterfaceProcesadora.getDetprocDenominacion13());
		consultasyReportesProcesadoraVO.setDetprocImpte13(detalleInterfaceProcesadora.getDetprocImpte13());
		consultasyReportesProcesadoraVO.setDetprocTipoBill14(detalleInterfaceProcesadora.getDetprocTipoBill14());
		consultasyReportesProcesadoraVO.setDetprocDenominacion14(detalleInterfaceProcesadora.getDetprocDenominacion14());
		consultasyReportesProcesadoraVO.setDetprocImpte14(detalleInterfaceProcesadora.getDetprocImpte14());
		consultasyReportesProcesadoraVO.setDetprocTipoBill15(detalleInterfaceProcesadora.getDetprocTipoBill15());
		consultasyReportesProcesadoraVO.setDetprocDenominacion15(detalleInterfaceProcesadora.getDetprocDenominacion15());
		consultasyReportesProcesadoraVO.setDetprocImpte15(detalleInterfaceProcesadora.getDetprocImpte15());
		consultasyReportesProcesadoraVO.setDetprocTipoBill16(detalleInterfaceProcesadora.getDetprocTipoBill16());
		consultasyReportesProcesadoraVO.setDetprocDenominacion16(detalleInterfaceProcesadora.getDetprocDenominacion16());
		consultasyReportesProcesadoraVO.setDetprocImpte16(detalleInterfaceProcesadora.getDetprocImpte16());
		consultasyReportesProcesadoraVO.setDetprocTipoBill17(detalleInterfaceProcesadora.getDetprocTipoBill17());
		consultasyReportesProcesadoraVO.setDetprocDenominacion17(detalleInterfaceProcesadora.getDetprocDenominacion17());
		consultasyReportesProcesadoraVO.setDetprocImpte17(detalleInterfaceProcesadora.getDetprocImpte17());
		consultasyReportesProcesadoraVO.setDetprocTipoBill18(detalleInterfaceProcesadora.getDetprocTipoBill18());
		consultasyReportesProcesadoraVO.setDetprocDenominacion18(detalleInterfaceProcesadora.getDetprocDenominacion18());
		consultasyReportesProcesadoraVO.setDetprocImpte18(detalleInterfaceProcesadora.getDetprocImpte18());
		consultasyReportesProcesadoraVO.setDetprocTipoBill19(detalleInterfaceProcesadora.getDetprocTipoBill19());
		consultasyReportesProcesadoraVO.setDetprocDenominacion19(detalleInterfaceProcesadora.getDetprocDenominacion19());
		consultasyReportesProcesadoraVO.setDetprocImpte19(detalleInterfaceProcesadora.getDetprocImpte19());
		consultasyReportesProcesadoraVO.setDetprocTipoBill20(detalleInterfaceProcesadora.getDetprocTipoBill20());
		consultasyReportesProcesadoraVO.setDetprocDenominacion20(detalleInterfaceProcesadora.getDetprocDenominacion20());
		consultasyReportesProcesadoraVO.setDetprocImpte20(detalleInterfaceProcesadora.getDetprocImpte20());
		consultasyReportesProcesadoraVO.setDetprocTipoBill21(detalleInterfaceProcesadora.getDetprocTipoBill21());
		consultasyReportesProcesadoraVO.setDetprocDenominacion21(detalleInterfaceProcesadora.getDetprocDenominacion21());
		consultasyReportesProcesadoraVO.setDetprocImpte21(detalleInterfaceProcesadora.getDetprocImpte21());
		consultasyReportesProcesadoraVO.setDetprocTipoBill22(detalleInterfaceProcesadora.getDetprocTipoBill22());
		consultasyReportesProcesadoraVO.setDetprocDenominacion22(detalleInterfaceProcesadora.getDetprocDenominacion22());
		consultasyReportesProcesadoraVO.setDetprocImpte22(detalleInterfaceProcesadora.getDetprocImpte22());
		consultasyReportesProcesadoraVO.setDetprocTipoBill23(detalleInterfaceProcesadora.getDetprocTipoBill23());
		consultasyReportesProcesadoraVO.setDetprocDenominacion23(detalleInterfaceProcesadora.getDetprocDenominacion23());
		consultasyReportesProcesadoraVO.setDetprocImpte23(detalleInterfaceProcesadora.getDetprocImpte23());
		consultasyReportesProcesadoraVO.setDetprocImpteCargoCheque(detalleInterfaceProcesadora.getDetprocImpteCargoCheque());
		consultasyReportesProcesadoraVO.setDetprocBanco(detalleInterfaceProcesadora.getDetprocBanco());
		consultasyReportesProcesadoraVO.setDetprocLineacapCodSeguridad(detalleInterfaceProcesadora.getDetprocLineacapCodSeguridad());
		consultasyReportesProcesadoraVO.setDetprocLineacapRutaTransito(detalleInterfaceProcesadora.getDetprocLineacapRutaTransito());
		consultasyReportesProcesadoraVO.setDetprocLineacapNumCuenta(detalleInterfaceProcesadora.getDetprocLineacapNumCuenta());
		consultasyReportesProcesadoraVO.setDetprocLineacapNumCheque(detalleInterfaceProcesadora.getDetprocLineacapNumCheque());
		consultasyReportesProcesadoraVO.setDetprocFecHrRetencion(detalleInterfaceProcesadora.getDetprocFecHrRetencion());
		consultasyReportesProcesadoraVO.setDetprocCausaRetencion(detalleInterfaceProcesadora.getDetprocCausaRetencion());
		consultasyReportesProcesadoraVO.setDetprocImpteDiferencia(detalleInterfaceProcesadora.getDetprocImpteDiferencia());
		consultasyReportesProcesadoraVO.setDetprocFaltanteSobrante(detalleInterfaceProcesadora.getDetprocFaltanteSobrante());
		consultasyReportesProcesadoraVO.setDetprocSuccargoAbonoDif(detalleInterfaceProcesadora.getDetprocSuccargoAbonoDif());
		consultasyReportesProcesadoraVO.setDetprocReferenciaNumerica(detalleInterfaceProcesadora.getDetprocReferenciaNumerica());
		consultasyReportesProcesadoraVO.setDetprocReferenciaAlf(detalleInterfaceProcesadora.getDetprocReferenciaAlf());
		consultasyReportesProcesadoraVO.setDetprocReferencia31(detalleInterfaceProcesadora.getDetprocReferencia31());
		consultasyReportesProcesadoraVO.setDetprocReferencia41(detalleInterfaceProcesadora.getDetprocReferencia41());
		consultasyReportesProcesadoraVO.setDetprocNumParcDif(detalleInterfaceProcesadora.getDetprocNumParcDif());
		consultasyReportesProcesadoraVO.setDetprocDenominacionBpf(detalleInterfaceProcesadora.getDetprocDenominacionBpf());
		consultasyReportesProcesadoraVO.setDetprocSerieBpf(detalleInterfaceProcesadora.getDetprocSerieBpf());
		consultasyReportesProcesadoraVO.setDetprocFolioBpf(detalleInterfaceProcesadora.getDetprocFolioBpf());
		consultasyReportesProcesadoraVO.setDetprocNombreCajeroEtv(detalleInterfaceProcesadora.getDetprocNombreCajeroEtv());
		consultasyReportesProcesadoraVO.setDetprocFecBpf(detalleInterfaceProcesadora.getDetprocFecBpf());
		consultasyReportesProcesadoraVO.setDetprocFolioBpf(detalleInterfaceProcesadora.getDetprocFolioBpf());
		consultasyReportesProcesadoraVO.setDetprocNombreCajeroEtv(detalleInterfaceProcesadora.getDetprocNombreCajeroEtv());
		consultasyReportesProcesadoraVO.setDetprocFecBpf(detalleInterfaceProcesadora.getDetprocFecBpf());
		consultasyReportesProcesadoraVO.setDetprocFolioSam(detalleInterfaceProcesadora.getDetprocFolioSam());
		consultasyReportesProcesadoraVO.setDetprocEfectivoIntegrCaja(detalleInterfaceProcesadora.getDetprocEfectivoIntegrCaja());
		consultasyReportesProcesadoraVO.setDetprocTransmisionS500(detalleInterfaceProcesadora.getDetprocTransmisionS500());
		consultasyReportesProcesadoraVO.setTipoMovimiento(detalleInterfaceProcesadora.getTipoMovimiento().getTipomovIdn());
		consultasyReportesProcesadoraVO.setTipoDeOperacion(detalleInterfaceProcesadora.getTipoDeOperacion().getTipoDeOperacionPK().getTipoperIdn());
		consultasyReportesProcesadoraVO.setCabceraInterfProcdoraTotls(detalleInterfaceProcesadora.getCabceraInterfProcdoraTotls());
		consultasyReportesProcesadoraVO.setDetprocBanco(detalleInterfaceProcesadora.getDetprocBanco());
		consultasyReportesProcesadoraVO.setDetprocFolioS018(detalleInterfaceProcesadora.getDetprocFolioS018());
		//detalleInterfaceProcesadoraPK
		consultasyReportesProcesadoraVO.setDetprocDetallprocIdn(detalleInterfaceProcesadora.getDetalleInterfaceProcesadoraPK().getDetprocDetallprocIdn());
		consultasyReportesProcesadoraVO.setEstructraSirh(detalleInterfaceProcesadora.getDetalleInterfaceProcesadoraPK().getEstructraSirh());
		consultasyReportesProcesadoraVO.setEtvIdn(detalleInterfaceProcesadora.getDetalleInterfaceProcesadoraPK().getEtvIdn());
		consultasyReportesProcesadoraVO.setHdInterprocNumCorte(detalleInterfaceProcesadora.getDetalleInterfaceProcesadoraPK().getHdInterprocNumCorte());
		consultasyReportesProcesadoraVO.setHdInterprocFecContable(detalleInterfaceProcesadora.getDetalleInterfaceProcesadoraPK().getHdInterprocFecContable());
		
		
		
		return consultasyReportesProcesadoraVO;
	}
	
	public static ProcesadorasListVO getProcesadoraListVO(OperacionProcesadoraDTO procList){
		ProcesadorasListVO procesadoraListVO=new ProcesadorasListVO(); 
		procesadoraListVO.setCpaesEstructuraSirhIdn(procList.getEstructraSirh());
		procesadoraListVO.setEtvIdn(procList.getEtvIdn());
		procesadoraListVO.setEtvNombreLargo(procList.getEtvNombreLargo());
		procesadoraListVO.setSirhNombre(procList.getSirhNombre());
		StringBuilder cadena=new StringBuilder();
		cadena.append(procList.getEstructraSirh()+"|"+procList.getSirhNombre()+"|"+procList.getEtvIdn()+"|"+procList.getEtvNombreLargo());
		procesadoraListVO.setCadenaFormato(cadena.toString());
		
		return procesadoraListVO;
	}
}

