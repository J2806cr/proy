/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIM SENA
 */
public class ModelVendedor {
    protected int IDV;
    protected String NomV;
    protected String ApeV;

    public ModelVendedor(int IDV, String NomV, String ApeV) {
        this.IDV = IDV;
        this.NomV = NomV;
        this.ApeV = ApeV;
    }

    public int getIDV() {
        return IDV;
    }

    public void setIDV(int IDV) {
        this.IDV = IDV;
    }

    public String getNomV() {
        return NomV;
    }

    public void setNomV(String NomV) {
        this.NomV = NomV;
    }

    public String getApeV() {
        return ApeV;
    }

    public void setApeV(String ApeV) {
        this.ApeV = ApeV;
    }
    
}
