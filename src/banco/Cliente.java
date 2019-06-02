/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Javier
 */
public class Cliente {
    private int idcliente;
    private String nombre,apellidos,dirección;
    private String telefono;

    public Cliente(int idcliente, String nombre, String apellidos, String dirección, String telefono) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direcci\u00f3n=" + dirección + ", telefono=" + telefono + '}';
    }
    
}
