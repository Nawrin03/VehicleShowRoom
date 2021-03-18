/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsi1;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author BIPASHA
 */
class Vehicle{
    public int model_number;
    public int engine_type;
    public int engine_power;
    public int tire_size; 
    
    public Vehicle(int model_number, int engine_type, int engine_power, int tire_size)
    {
        this.model_number=model_number;
        this.engine_type=engine_type;
        this.engine_power=engine_power;
        this.tire_size=tire_size;
    }
 
}
class Sports extends Vehicle{
      int turbo;

    public Sports(int model_number, int engine_type, int engine_power, int tire_size,int turbo) {
        super(model_number, engine_type, engine_power, tire_size);
        this.turbo=turbo;
    }
}
class Heavy extends Vehicle{
      int weight;

    public Heavy(int model_number, int engine_type, int engine_power, int tire_size,int weight) {
        super(model_number, engine_type, engine_power, tire_size);
        this.weight=weight;
    }
}


public class DSI1 {
    /**
     * @param args the command line arguments
     */
static Vector<Vehicle> normalvehicle = new Vector<>();    
static Vector<Sports> sportVehicle = new Vector<>();  
static Vector<Heavy> heavyVehicle = new Vector<>();  
static int customer=30;
    public static void main(String[] args) {
        // TODO code application logic here
       
        char y='Y';
        while(y=='Y' || y=='y'){
            System.out.println("Press 1 to ADD Vehicles");
            System.out.println("Press 2 to DELETE Vehicles");
            System.out.println("Press 3 to SHOW Vehicles");
            System.out.println("Press 4 to Expected Number of Customer");
            System.out.print("Enter your input: ");
            Scanner sc0= new Scanner(System.in);
            int b= sc0.nextInt();
            switch(b){
            case 1: 
                    addFunction();
                    break;
            case 2: deleteFunction();
                    break;
            case 3: showFunction();
                    break;
            case 4: expectedCustomer();
                    break;
            default: System.out.println("Wrong Input");
            }
             System.out.print("TO Contimue Press Y/y: ");
             y= sc0.next().charAt(0);
            
    }
    }
        public static void addFunction(){
            System.out.println("MENU:");
            System.out.println("Press 1 to add Normal Vehicle");
            System.out.println("Press 2 to add Sports Vehicle");
            System.out.println("Press 3 to add Heavy Vehicle");
            System.out.print("Enter your input: ");
            Scanner sc= new Scanner(System.in); 
            int a= sc.nextInt();
            System.out.print("Model Number : ");
            int mn=sc.nextInt();
            System.out.print("Engine Power : ");
            int ep=sc.nextInt();
            System.out.print("Tire Size : ");
            int ts=sc.nextInt();
        switch(a)
        {
            case 1:
                {
                  
                    System.out.print("Engine type : press 1 for Oil, 2 for Gas, 3 for Disel : ");
                    int et=sc.nextInt();
                    Vehicle vc=new Vehicle(mn, et, ep, ts);
                   normalvehicle.add(vc);
                   break;
                }
            case 2:
            {
                    int et=1;
     
                    System.out.print("Turbo : ");
                    int turbo=sc.nextInt();
                    Sports sp=new Sports(mn, et, ep, ts, turbo);
                    sportVehicle.add(sp);
                    customer=customer+20;
                    break;
            }
            
            case 3:
            {
                    int et=3;      
                    System.out.print("Weight : ");
                    int weight=sc.nextInt();
                    Heavy hv=new Heavy(mn, et, ep, ts, weight);
                    heavyVehicle.add(hv);
                    break;
            }
            default: System.out.println("Wrong Input");
        }
    }
    public static void  showFunction()
    {
     
        int i;
        // Displaying the Vector 
        System.out.println("The Vector is: " + normalvehicle.size()); 
        String en_ty=null;
        System.out.println("The List of Normal Vehicles: ");
        System.out.println("Number of Normal Vehicles: " + normalvehicle.size());
        for(i=0;i<normalvehicle.size();i++){
             if(normalvehicle.get(i).engine_type==1)
                    en_ty="Oil";
            if(normalvehicle.get(i).engine_type==2)
                    en_ty="Gas";
            if(normalvehicle.get(i).engine_type==3)
                    en_ty="Disel";        
            System.out.println("Model Number: "+ normalvehicle.get(i).model_number + " Engine Type: "+ en_ty + " " +"Engine Power: "+ normalvehicle.get(i).engine_power + " "+"Tire Size: " + normalvehicle.get(i).tire_size);
        }
             System.out.println("The List of Sports Vehicles: ");
        System.out.println("Number of Sports Vehicles: " + sportVehicle.size());
        for(i=0;i<sportVehicle.size();i++){
        
            System.out.println("Model Number: "+ sportVehicle.get(i).model_number + " Engine Type: "+ "Oil" + " " +"Engine Power: "+ sportVehicle.get(i).engine_power + " "+"Tire Size: " + sportVehicle.get(i).tire_size +" "+"Turbo: "+ sportVehicle.get(i).turbo);
        }
             System.out.println("The List of Heavy Vehicles: ");
        System.out.println("Number of Heavy Vehicles: " + heavyVehicle.size());
        for(i=0;i<heavyVehicle.size();i++){
        
            System.out.println("Model Number: "+ heavyVehicle.get(i).model_number + " Engine Type: "+ "Disel" + " " +"Engine Power: "+ heavyVehicle.get(i).engine_power + " "+"Tire Size: " + heavyVehicle.get(i).tire_size +" "+"Weight: "+ heavyVehicle.get(i).weight);
        // Creating an empty enumeration to store 
       
            }
    }
    public static void deleteFunction()
    {
        System.out.println("Enter the Model Number to delete the Vehicle");
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int i;
        for(i=0;i<normalvehicle.size();i++){
                    if(normalvehicle.get(i).model_number==a)
                    {
                        normalvehicle.remove(i);
                        System.out.println("VEHICLE DELETED"); 
                        break;
                    }
                   // else {System.out.println("Model Number not Valid");}
        
        }
           for(i=0;i<sportVehicle.size();i++){
                    if(sportVehicle.get(i).model_number==a)
                    {
                        sportVehicle.remove(i);
                        System.out.println("VEHICLE DELETED"); 
                        break;
                    }
                   // else {System.out.println("Model Number not Valid");}
        
        }
         for(i=0;i<heavyVehicle.size();i++){
                    if(heavyVehicle.get(i).model_number==a)
                    {
                        heavyVehicle.remove(i);
                        System.out.println("VEHICLE DELETED"); 
                        break;
                    }
                   // else {System.out.println("Model Number not Valid");}
        
        }
         
                 
    }
    public static void  expectedCustomer()
    {
        showFunction();
        System.out.println("Expected Customer at this moment: " + customer);
    }
    
}
