/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases.Cacheable;



/**
 *
 * @author 
 */
public class Candidato implements Cacheable, java.io.Serializable{

    private int idCandidato;
    private String nombre;
    private int numVotos;

    public Candidato() {
    }

    /**
     * Crea un nuevo objeto de tipo Candidato, con los siguientes atributos:
     *
     * @param idCandidato, identificador único del candidato.
     * @param nombre
     * @param numVotos
     */
    public Candidato(int idCandidato, String nombre, int numVotos) {
        this.idCandidato = idCandidato;
        this.nombre = nombre;
        this.numVotos = numVotos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the numVotos
     */
    public int getNumVotos() {
        return numVotos;
    }

    /**
     * @param idCandidato the idCandidato to set
     */
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param numVotos the numVotos to set
     */
    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }

    /**
     * Suma automáticamente en 1, el total de votos del candidato.
     */
    public void agregarVoto() {
        ++numVotos;
    }

    @Override
    public String toString() {
        return getID()+", '"+getNombre()+"', "+getNumVotos();
    }


    @Override
    public int getID() {
        return idCandidato;
    }

}
