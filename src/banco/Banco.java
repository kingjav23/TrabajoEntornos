/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria objcb = new CuentaBancaria();
        Cliente cli = new Cliente();
        int opcion = 0, id = 0;
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        ArrayList<Cliente> alcliente = new ArrayList<Cliente>();
        ArrayList<CuentaBancaria> alcb = new ArrayList<CuentaBancaria>();
        
        do{
            System.out.println(" --- MENÚ --- ");
            System.out.println(" 1.- Crear cliente.");
            System.out.println(" 2.- Crear cuenta bancaria.");
            System.out.println(" 3.- Ingresar dinero.");
            System.out.println(" 4.- Retirar dinero.");
            System.out.println(" 0.- Salir.");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce los datos del nuevo cliente en este orden: \n"
                            + "ID - NOMBRE - APELLIDOS - DIRECCION - TELEFONO");
                    cli.setIdcliente(sc.nextInt());
                    cli.setNombre(sc.nextLine());
                    cli.setApellidos(sc.nextLine());
                    cli.setDirección(sc.nextLine());
                    cli.setTelefono(sc.nextLine());
                    alcliente.add(cli);
                    cli = new Cliente();
                    break;
                case 2:
                    System.out.println("Introduce los datos de la nueva cuenta en este orden: \n"
                            + "ID - NOMBRE - SALDO - CLIENTE");
                    objcb.setIdcb(sc.nextLine());
                    objcb.setNombrecb(sc.nextLine());
                    objcb.setSaldocb(sc.nextInt());
                    objcb.setClientecb(cli);
                    alcb.add(objcb);
                    objcb = new CuentaBancaria();
                    break;
                case 3:
                    int i = 0;
                    for(; i < alcb.size(); i++){ }
                    if(i==0) System.out.println("no puede realizar un ingreso si no existe una cuenta.");
                    else{
                        System.out.println("Va a realizar un ingreso, indique la cantidad a ingresar:");
                        objcb.ingresar(sc.nextInt());
                        System.out.println("Gracias por acudir a nosotros para cumplir sus deseos.");
                    }
                    break;
                case 4:
                    int j = 0;
                    for(; j < alcliente.size(); j++){ }
                    if(j==0) System.out.println("no puede realizar una retirada de efectivo si no existe una cuenta.");
                    else{
                        System.out.println("Va a realizar una retirada de efectivo, indique la cantidad a retirar:");
                        objcb.retirar(sc.nextInt());
                        System.out.println("Gracias por acudir a nosotros para cumplir sus deseos.");
                    }
                    System.out.println("Va a realizar una retirada de efectivo, indique la cantidad a retirar:");
                    if(objcb.getSaldocb()<0){
                            System.out.println("Importe a retirar Superior a su saldo , introduzca otro saldo o pongase en contacto con nuestras oficinas");
                }
                    else {objcb.retirar(sc.nextInt());}
                    System.out.println("Gracias por acudir a nosotros para cumplir sus deseos.");
                    break;
                case 0:
                    break;
            }
        }while(opcion != 0);
    }
    
}
