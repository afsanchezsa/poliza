/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialllll;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Banco {
    private String _code;
    private ArrayList<Cuenta>_comptes; 
    private ArrayList<Tipo>_types;
  

    public Banco(String _code) {
        this._code = _code;
        this._comptes=new ArrayList<>();
         this._types=new ArrayList<>();
    }
    public void addCuenta(Cuenta cuenta){
    this._comptes.add(cuenta);
    
    }
    public void addTipo(Tipo tipo){
    this._types.add(tipo);
    
    }

    public ArrayList<Cuenta> getComptes() {
        return _comptes;
    }
    
    
}
