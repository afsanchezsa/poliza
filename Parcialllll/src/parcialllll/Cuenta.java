/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialllll;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int _numeroCompte;
    private double _soldeCourant;
    private String _dateCreation;
    private String _nomClient;
   private ArrayList<Movimiento>_mouvements;

    public Cuenta(int _numeroCompte, double _soldeCourant, String _dateCreation, String _nomClient) {
        this._numeroCompte = _numeroCompte;
        this._soldeCourant = _soldeCourant;
        this._dateCreation = _dateCreation;
        this._nomClient = _nomClient;
        this._mouvements=new ArrayList<>();
    }
    
    public void addMouvement(String _date, double _montant, Tipo _type){
    this._mouvements.add(new Movimiento(_date, this.getSoldeCourant(), _montant, _type));
    if(_type.getCode().equalsIgnoreCase("consignacion")){
    this._soldeCourant+=_montant;
    
    }else{
    
    this._soldeCourant-=_montant;
    
    }
    
    
    }

    public double getSoldeCourant() {
        return _soldeCourant;
    }

    public int getNumeroCompte() {
        return _numeroCompte;
    }

    public String getDateCreation() {
        return _dateCreation;
    }

    public String getNomClient() {
        return _nomClient;
    }

    public ArrayList<Movimiento> getMouvements() {
        return _mouvements;
    }
    
    
}
