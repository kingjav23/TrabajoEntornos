/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Fernando
 */
public class CuentaBancaria {
    String nombrecb;
    int saldocb;
    String idcb;
    Cliente clientecb;
    
    CuentaBancaria(){
        
    }
    
    CuentaBancaria(String nombrecb, int saldocb, String idcb, Cliente clientecb){
        this.nombrecb = nombrecb;
        this.saldocb = saldocb;
        this.idcb = idcb;
        this.clientecb = clientecb;
    }

    public String getNombrecb() {
        return nombrecb;
    }

    public void setNombrecb(String nombrecb) {
        this.nombrecb = nombrecb;
    }

    public int getSaldocb() {
        return saldocb;
    }

    public void setSaldocb(int saldocb) {
        this.saldocb = saldocb;
    }

    public String getIdcb() {
        return idcb;
    }

    public void setIdcb(String idcb) {
        this.idcb = idcb;
    }

    public Cliente getClientecb() {
        return clientecb;
    }

    public void setClientecb(Cliente clientecb) {
        this.clientecb = clientecb;
    }
    
    public boolean ingresar(int ingreso){
        setSaldocb(getSaldocb() + ingreso);
        return true;
    }
    
    public boolean retirar(int retirado){
        setSaldocb(getSaldocb() - retirado);
        return true;
    }
}
