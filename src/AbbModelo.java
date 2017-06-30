
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
public class AbbModelo implements Serializable {
    
    private Modelo _raiz;
   

    public AbbModelo()
    {
        this._raiz = null;
       
    }
    
    public Modelo getRaiz() {
        return _raiz;
    }

    public void setRaiz(Modelo _raiz) {
        this._raiz = _raiz;
    }


    
    public boolean Vacio()
    {
        if(_raiz == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void InsertarModelo(Modelo aux, String nombre){
        
        if(Vacio())
        {
            //System.out.println("bandera1");
           _raiz = new Modelo(nombre);
        }
        else
        {        
                if(aux.getData().compareTo(nombre) > 0) //SE VA PARA LOS HI
                {
                    if(aux.getHi() == null)
                    {
                        aux.setHi(new Modelo(nombre));
           //             System.out.println("bandera2");
                    }
                    else
                    {
                        InsertarModelo(aux.getHi(),nombre);
                    }
                }
                else //SE VA PARA LOS HD
                {
                    if(aux.getHd() == null)
                    {
                        aux.setHd(new Modelo(nombre));
         //               System.out.println("bandera3");
                    }
                    else
                    {
                        InsertarModelo(aux.getHd(),nombre);
                    }
                }   
        }
    }
        
       
    
    public void InsertaCarro(Modelo aux, String modelo, Carro nuevo)
    {
        if(Vacio())
        {
            System.out.println("No hay ningun modelo de carros registrados");
        }
        else
        {
            if(aux != null)
            {
                if(aux.getData().equals(modelo))
                {
                    aux.getList().InsertaF(nuevo);
                    System.out.println("Se ha insertado un carro de modelo "+modelo);
                }
                else if(aux.getData().compareTo(modelo) > 0) //SE VA PARA LOS HIJOZ IZQUIERDOS
                {
                    InsertaCarro(aux.getHi(),modelo,nuevo);
                }
                else //SE VA PARA LOS HIJOS IZQUIERDOS
                {
                    InsertaCarro(aux.getHd(),modelo,nuevo);
                }
            }
        }
    }
    
    public void EliminaCarro(Modelo aux, String modelo, String telefono)
    {
        if(Vacio())
        {
            System.out.println("No hay ningun modelo de carros registrados");
        }
        else
        {
           if(aux != null)
           {
              if(aux.getData() == modelo)
              {
                  aux.getList().Eliminar(telefono);
              }
              else if(aux.getData().compareTo(modelo) > 0) //SE VA PARA LOS HIJOS IZQUIERDOS
              {
                  EliminaCarro(aux.getHi(),modelo,telefono);
              }
              else
              {
                  EliminaCarro(aux.getHd(),modelo,telefono);
              }
           }
        }
    }
   
    public Modelo Buscar(Modelo aux, String nombre)
    {
        if(Vacio())
        {
            System.out.println("No hay ningun modelo registrado en el sistema");
            return null;
        }
        else
        {   
            if(aux != null)
            {
                if(aux.getData().equals(nombre))
                {
                    System.out.println("Lo encontro en el arbol");
                    return aux;
                }
                else if(aux.getData().compareTo(nombre) > 0) //SE VA PARA LOS HI
                {
                    Buscar(aux.getHi(),nombre);
                }
                else
                {
                    Buscar(aux.getHd(),nombre);
                }
            }
             return null;
        }
    }
    
    public void Mostrar(Modelo aux)
    {
        //RECORRER ARBOL EN ORDEN
        Mostrar(aux.getHi());
        aux.getData();
        Mostrar(aux.getHd());
    }
    
   
}
