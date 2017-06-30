
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
public class Carro implements Serializable{
   private String _color;
   private int _year;
   private int _precio;
   private String _tlf;
   private String _vendedor;
   private double _km;
   private boolean _negociable;
   private Carro _prox;
   
   public Carro(String c, int y, int p, String t, boolean n, String v, double k)
   {
       this._color = c;
       this._year = y;
       this._precio = p;
       this._tlf = t;
       this._negociable = n;
       this._vendedor = v;
       this._km = k;
       this._prox = null;
   }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int _year) {
        this._year = _year;
    }

    public int getPrecio() {
        return _precio;
    }

    public void setPrecio(int _precio) {
        this._precio = _precio;
    }

   
    public boolean isNegociable() {
        return _negociable;
    }

    public void setNegociable(boolean _negociable) {
        this._negociable = _negociable;
    }

    public Carro getProx() {
        return _prox;
    }

    public void setProx(Carro _prox) {
        this._prox = _prox;
    }

    public String getVendedor() {
        return _vendedor;
    }

    public void setVendedor(String _vendedor) {
        this._vendedor = _vendedor;
    }

    public double getKm() {
        return _km;
    }

    public void setKm(double _km) {
        this._km = _km;
    }

    public String getTlf() {
        return _tlf;
    }

    public void setTlf(String _tlf) {
        this._tlf = _tlf;
    }
    
    

    @Override
    public String toString() {
        return "Carro{" + "_color=" + _color + ", _year=" + _year + ", _precio=" + _precio + ", _tlf=" + _tlf + ", _negociable=" + _negociable + ", _prox=" + _prox + '}';
    }
   
    
   
   
}
