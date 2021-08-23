
package servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServicioCxC")
public class ServicioCxC {

      
    /*
    *@param idSucursal El id de la Sucursal de la factura obtenida en la DB 
    *@param pntEmision Punto de emisión de la factura
    *@param secuencia Secuencia de la factura
    */

    @WebMethod(operationName = "obtenerConcatenacionFactura")
    public String obtenerConcatenacionFactura(@WebParam(name = "idSucursal") int idSucursal, @WebParam(name = "pntEmision") int pntEmision, @WebParam(name = "secuencia") int secuencia) {
     
        String numSucursal = "000", numEmision = "000", numSecuencia = "000000000";
        int longitud = 0;

        //Controlando la surcursal
        longitud = String.valueOf(idSucursal).length();
        numSucursal = numSucursal.substring(0, (numSucursal.length()) - longitud) + String.valueOf(idSucursal);

        //Controlando punto de emision
        longitud = String.valueOf(pntEmision).length();
        numEmision = numEmision.substring(0, (numEmision.length()) - longitud) + String.valueOf(pntEmision);

        //Controlando secuencia de la factura
        longitud = String.valueOf(secuencia).length();
        numSecuencia = numSecuencia.substring(0, (numSecuencia.length()) - longitud) + String.valueOf(secuencia);

        
        /*
        *Concatenación del número de la factura
        *@return Retorna el siguiente String: 000-000-000000000 con sus respectivos números
        */
        return numSucursal + "-" + numEmision + "-" + numSecuencia;
    }
}
