package Controlador;

import Fmat.Framework.Controlador.ClaseControlador;
import Fmat.Framework.Modelo.ClaseModelo;
import Modelo.AdminCandidato;

/**
 *
 * @author 
 */
public class ControladorCandidatos extends ClaseControlador {

    public ControladorCandidatos( ClaseModelo modelo, int idEvento ) {
        super( modelo, idEvento );
    }

    public void agregarCandidato( int id, String candidato ) {
        (AdminCandidato.getInstance()).agregarCandidatos( id, candidato );
    }

    public void eliminarCandidato(int id) {
        (AdminCandidato.getInstance()).eliminarCandidato(id);
    }

    @Override
    public void actualizar( Object obj ) {}

}
