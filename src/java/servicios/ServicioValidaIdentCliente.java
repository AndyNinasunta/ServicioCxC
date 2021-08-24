/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PERSONAL
 */
@WebService(serviceName = "ServicioValidaIdentCliente")
public class ServicioValidaIdentCliente {

    /**
     * @param identificacion identificacion de un cliente obtenida de la BD.
     * @param listaIdenti Lista donde se cargan todas las identifaciones de los
     * clientes.
     * @return Boolean un valor true (si la identificacion se repite) y un valor
     * false (si la identifacion no se repite)
     */
    @WebMethod(operationName = "validaIdentCliente")
    public Boolean validaIdentCliente(@WebParam(name = "identificacion") String identificacion, @WebParam(name = "listaIdenti") List listaIdenti) {
        for (int i = 0; i < listaIdenti.size(); i++) {
            
            if (identificacion.equals(listaIdenti.get(i))) {
                return true;

            }
        }
        return false;
    }
}
