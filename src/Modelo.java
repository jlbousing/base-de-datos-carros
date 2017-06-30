
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
public class Modelo implements Serializable {
    
    private String _data;
    private Modelo _hi;
    private Modelo _hd;
    private ListaCarro list;
    public Modelo(String m)
    {
        this._data = m;
        this._hi = null;
        this._hd = null;
         this.list = new ListaCarro();
    }

    public String getData() {
        return _data;
    }

    public void setData(String _data) {
        this._data = _data;
    }

    public Modelo getHi() {
        return _hi;
    }

    public void setHi(Modelo _hi) {
        this._hi = _hi;
    }

    public Modelo getHd() {
        return _hd;
    }

    public void setHd(Modelo _hd) {
        this._hd = _hd;
    }

    public ListaCarro getList() {
        return list;
    }

    public void setList(ListaCarro list) {
        this.list = list;
    }
    
    
    
    
}
