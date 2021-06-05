package com;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class AgendaList {
    static Scanner scan = new Scanner(System.in);
    static agenda objAgenda;
    static ArrayList<agenda> listAgenda = new ArrayList<agenda>();
    public static void main(String[] args) {
        addAgendaList("06/06/2021", "tugas", "tugas prak PBO");
        addAgendaList("05/06/2021", "rapat", "Rapat mapaba");
        objAgenda.statusDone();
        listAgenda.get(0).display();
        listAgenda.get(0).getStatus();
        listAgenda.get(1).display();
        listAgenda.get(1).getStatus();

    }
    public static void addAgendaList(String a, String b, String c){
        try {
            listAgenda.add(objAgenda = new agenda(a, b, c));
            } 
            catch (ParseException e) {
                // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    } 
    // public static void addAgendaList(){
    //     String a = scan.nextLine();
    //         String b = scan.nextLine();
    //         String c = scan.nextLine();
    //         try {
    //             listAgenda.add(objAgenda = new agenda(a, b, c));
    //         } catch (ParseException e) {
    //             // TODO Auto-generated catch block
    //             e.printStackTrace();
    //         }
    // } 
    public void removeAgenda(int index){
        listAgenda.remove(index);
    }

    public void sortingList(){
    }

}
