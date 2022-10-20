/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIM SENA
 */
public class ModelProducto {
    protected int IDP;
    protected String NomP;
    protected float PreP;
    protected String CateP;

    public ModelProducto(int IDP, String NomP, float PreP, String CateP) {
        this.IDP = IDP;
        this.NomP = NomP;
        this.PreP = PreP;
        this.CateP = CateP;
    }

    public int getIDP() {
        return IDP;
    }

    public void setIDP(int IDP) {
        this.IDP = IDP;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String NomP) {
        this.NomP = NomP;
    }

    public float getPreP() {
        return PreP;
    }

    public void setPreP(float PreP) {
        this.PreP = PreP;
    }

    public String getCateP() {
        return CateP;
    }

    public void setCateP(String CateP) {
        this.CateP = CateP;
    }
    
}
