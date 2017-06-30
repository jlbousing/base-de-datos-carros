
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class ListaCarro implements Serializable {
    
    private Carro _cabeza;

    public Carro getCabeza() {
        return _cabeza;
    }

    public void setCabeza(Carro _cabeza) {
        this._cabeza = _cabeza;
    }
    
    public ListaCarro()
    {
        this._cabeza = null;
    }
    
    public void InsertaF(Carro nuevo)
    {
        if(_cabeza == null)
        {
            _cabeza = nuevo;
            System.out.println("bandera1");
        }
        else
        {
            Carro aux = _cabeza;
            while(aux.getProx() != null)
            {
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo);
            System.out.println("bandera2");
        }
    }
    
    public Carro Eliminar(String telefono)
    {
        //LA BUSQUEDA SERÁ SECUENCIAL
        if(_cabeza.getProx() == null)
        {
            if(_cabeza.getTlf() == telefono)
            {
                Carro aux = _cabeza;
                _cabeza = null;
                return aux;
            }
            else
            {
                return null;
            }
        }
        else
        {
            Carro aux = _cabeza;
            while(aux.getProx().getTlf() != telefono && aux.getProx() != null)
            {
                aux = aux.getProx();
            }
            
            Carro aux2 = aux.getProx();
            aux.setProx(aux2.getProx());
            aux2.setProx(null);
            return aux2;
        }
    }
    
    public void Mostrar()
    {
        Carro aux = _cabeza;
        
        while(aux != null)
        {
            aux.toString();
            System.out.println("");
        }
    }
}
