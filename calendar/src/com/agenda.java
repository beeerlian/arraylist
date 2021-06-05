package com;

import java.util.*;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

class agenda implements Comparable{
    Date time;
    String title;
    String description;
    boolean status = false; 

    public agenda(String time, String title, String description) throws ParseException{
        Date timeConverted = new SimpleDateFormat("dd/MM/yyyy").parse(time);
        this.time = timeConverted;
        this.title = title;
        this.description = description;
    }

    public void display(){
        System.out.println("Tanggal  : " + this.time);
        System.out.println("Judul    : " + this.title);
        System.out.println("Deskripsi: " + this.description);
    }
    public void editTitle(String title){
        this.title = title;
    }
    public void editDate(String time) throws ParseException{
        Date timeConverted = new SimpleDateFormat("dd/MM/yyyy").parse(time);
        this.time = timeConverted;
    }
    public void editDescription(String description){
        this.title = description;
    }
    public boolean statusDone(){
        this.status = true;
        return this.status;
    }
    public void getStatus(){
        if(this.status == true){
            System.out.println("This Task is Done");
        }
        else
            System.out.println("T his task is still remaining");
    }

    // @Override
    // public Date compareTo(agenda compareAgd) {
    //     int compareAgd = ((agenda)compareAgd).getAgendatime();

    //     return this.time-compareAgd;
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

}
