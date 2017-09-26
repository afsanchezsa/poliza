/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialllll;

/**
 *
 * @author Estudiante
 */
public class Movimiento {
    private String _date;
    private double _soldePrecedent;
    private double _montant;
    private Tipo _type;

    public Movimiento(String _date, double _soldePrecedent, double _montant, Tipo _type) {
        this._date = _date;
        this._soldePrecedent = _soldePrecedent;
        this._montant = _montant;
        this._type = _type;
    }

    public String getDate() {
        return _date;
    }

    public double getSoldePrecedent() {
        return _soldePrecedent;
    }

    public double getMontant() {
        return _montant;
    }

    public Tipo getType() {
        return _type;
    }
    

    
    
}
