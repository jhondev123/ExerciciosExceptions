/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioexceptions;

import entities.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ExercicioExceptions {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        Scanner s=new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Digite o numero do quarto : ");
        int roomnumber= s.nextInt();
        System.out.println("Digite a data de entrada");
        Date checkin =sdf.parse(s.next());
        System.out.println("Digite a data de saida");
        Date checkout = sdf.parse(s.next());
        if(!checkout.after(checkin)){
            System.out.println("Error in DATE ");
        }else{
            Reservation reserv = new Reservation(roomnumber,checkin,checkout);
            System.out.println("RESERVATION :" + reserv);
            System.out.println("");
            System.out.println("Deseja atualizar as datas ? ");
            char a=s.next().charAt(0);
            if(a=='s'){
            System.out.println("Digite a data de entrada");
      checkin =sdf.parse(s.next());
        System.out.println("Digite a data de saida");
       checkout = sdf.parse(s.next());
       reserv.updateReservation(checkin, checkout);
       System.out.println("RESERVATION :" + reserv);
            }
        }
        s.close();
    }
    
}
