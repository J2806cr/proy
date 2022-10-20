/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIM SENA
 */
public class ModelCliente {
    protected int IdC;
    protected String NombC;
    protected String ApeC;
    protected String DirrC;

    public ModelCliente(int IdC, String NombC, String ApeC, String DirrC) {
        this.IdC = IdC;
        this.NombC = NombC;
        this.ApeC = ApeC;
        this.DirrC = DirrC;
    }

    public int getIdC() {
        return IdC;
    }

    public void setIdC(int IdC) {
        this.IdC = IdC;
    }

    public String getNombC() {
        return NombC;
    }

    public void setNombC(String NombC) {
        this.NombC = NombC;
    }

    public String getApeC() {
        return ApeC;
    }

    public void setApeC(String ApeC) {
        this.ApeC = ApeC;
    }

    public String getDirrC() {
        return DirrC;
    }

    public void setDirrC(String DirrC) {
        this.DirrC = DirrC;
    }
    
    
}
