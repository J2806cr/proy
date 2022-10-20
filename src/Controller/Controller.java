/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ModelCliente;
import Model.ModelProducto;
import Model.ModelVendedor;
import View.Cliente;
import View.JFAdmin;
import View.JFLogin;
import View.Productos;
import View.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DIM SENA
 */
public class Controller implements ActionListener {

    JFLogin log;
    JFAdmin adm = new JFAdmin();
    Cliente cli = new Cliente();
    Vendedor ven = new Vendedor();
    Productos prod = new Productos();
   

//    ArrayList<ModelCliente> ListCliente = new ArrayList<ModelCliente>();
//    ArrayList<ModelProducto> ListProductos = new ArrayList<ModelProducto>();
//    ArrayList<ModelVendedor> ListVendedor = new ArrayList<ModelVendedor>();

    private String User = null;
    private String Pass = null;

    public Controller(JFLogin log) {
        this.log = log;
        this.iniciar();
        this.log.BTIngresar.addActionListener(this);
        this.adm.clientef.addActionListener(this);
        this.adm.VendedorI.addActionListener(this);
        this.adm.ProdcutosI.addActionListener(this);

    }

    public void iniciar() {
        this.log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        User = this.log.TUser.getText();
        Pass = this.log.TPass.getText();

        if (e.getSource() == this.log.BTIngresar) {
            if (User.equals("admin") && Pass.equals("123")) {
                adm.setVisible(true);
            } else if (User.equals("cliente") && Pass.equals("567")) {
                cli.setVisible(true);
            } else if (User.equals("vendedor") && Pass.equals("345")) {
                ven.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "DATOS NO ENCONTRADOS");
            }
        }
        if (adm.clientef == e.getSource()) {
            Cliente verventana = new Cliente();

            this.adm.escritorio.add(verventana);
            verventana.show();
        }
        if (adm.VendedorI == e.getSource()) {
            Vendedor ver = new Vendedor();

            this.adm.escritorio.add(ver);
            ver.show();
        }
        if (adm.ProdcutosI == e.getSource()) {
            Productos verv = new Productos();

            this.adm.escritorio.add(verv);
            verv.show();
        }
    }
    
}
