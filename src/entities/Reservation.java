/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Usuário
 */
public class Reservation {
    private int roomnumber;
    private Date checkin;
    private Date checkout;
public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(int roomnumber, Date checkin, Date checkout) {
        this.roomnumber = roomnumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    public long duration(){
        long diff = this.checkout.getTime()-this.checkin.getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}
public void updateReservation(Date checkin,Date checkout){
    this.checkin=checkin;
    this.checkout=checkout;
}
    public int getRoomnumber() {
        return roomnumber;
    }
    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }
    public Date getCheckin() {
        return checkin;
    }
    public Date getCheckout() {
        return checkout;
    }

    @Override
    public String toString() {
        return "Reservation : " + "roomnumber : " + roomnumber + ", checkin :" +
                sdf.format(checkin) + ", checkout : " + sdf.format(checkout) +":"+ duration() + " Nights"; 
    }
    
}

