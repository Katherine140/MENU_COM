package MENU_COOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MENUCOOP {
 public static void main(String[] args) {
  Scanner SC = new Scanner(System.in);
  BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
  PERSONAL_COOP[] REGISTRO;
  int[] A;
  int T = 0;
  int opcion = 0;
  int opcion1 = 0;
  int opcion2 = 0;
  System.out.printf("DE QUE TAMAÑO QUIERES LA CARTERA DE CLIENTES: ");
  T = SC.nextInt();
  REGISTRO = new PERSONAL_COOP[T];

  for (int i = 0; i < REGISTRO.length; i++) {
   REGISTRO[i] = new PERSONAL_COOP();
  }


  while (opcion != 3) {
   System.out.printf("\n*****************************************");
   System.out.printf("\n        MENU DE REGISTRO DE COOP         ");
   System.out.printf("\n*****************************************");
   System.out.printf("\n[1] AGREGAR CLIENTES");
   System.out.printf("\n[2] MOSTRAR CLIENTES");
   System.out.printf("\n[3] BUSCAR CLIENTE");
   System.out.printf("\n[0] SALIR");
   System.out.printf("\nELIGE UNA OPCION DEL MENU: ");
   opcion = SC.nextInt();
   System.out.printf("                                         ");
   switch (opcion) {
    case 1:
     System.out.printf("\n*****************************************");
     System.out.printf("\n            DATOS DEL CLIENTE             ");
     System.out.printf("\n*****************************************");
     try {
      for (int i = 0; i < REGISTRO.length; i++) {
       System.out.printf("\n*******************************************************************");
       System.out.printf("\nINGRESA EL ID: ");
       REGISTRO[i].setID(B.readLine());
       System.out.printf("INGRESA EL NOMBRE: ");
       REGISTRO[i].setNOMBRE(B.readLine());
       System.out.printf("INGRESA EL APELLIDO PATERNO: ");
       REGISTRO[i].setAPELLIDO_P(B.readLine());
       System.out.printf("INGRESA EL APELLIDO MATERNO: ");
       REGISTRO[i].setAPELLIDO_M(B.readLine());
       System.out.printf("INGRESA LA EDAD: ");
       REGISTRO[i].setEDAD(SC.nextInt());
       System.out.printf("INGRESA EL TELEFONO: ");
       REGISTRO[i].setTELEFONO(B.readLine());
       System.out.printf("INGRESA EL CORREO: ");
       REGISTRO[i].setCORREO(B.readLine());
       System.out.printf("INGRESA LA DIRECCION: ");
       REGISTRO[i].setDIRECCION(B.readLine());
      }

     } catch (Exception e) {
      System.out.printf(e.getMessage());
     }
     System.out.printf("\n*******************************************************************");
     break;
    case 2:
     System.out.printf("\n*****************************************");
     System.out.printf("\n          LISTADO DE CLIENTES            ");
     System.out.printf("\n*****************************************");
     for (int i = 0; i < REGISTRO.length; i++) {
      System.out.printf("\n*******************************************************************");
      System.out.printf("\nEL ID es: " + "" + REGISTRO[i].getID());
      System.out.printf("\nEL NOMBRE ES: " + REGISTRO[i].getNOMBRE());
      System.out.printf("\nEL APELLIDO PATERNO ES: " + REGISTRO[i].getAPELLIDO_P());
      System.out.printf("\nEL APELLIDO MATERNO ES: " + REGISTRO[i].getAPELLIDO_M());
      System.out.printf("\nLA EDAD ES: " + REGISTRO[i].getEDAD());
      System.out.printf("\nEL TELEFONO ES: " + REGISTRO[i].getTELEFONO());
      System.out.printf("\nEL CORREO ES: " + REGISTRO[i].getCORREO());
      System.out.printf("\nLA DIRECCION ES: " + REGISTRO[i].getDIRECCION());
     }
     System.out.printf("\n*******************************************************************");
     break;
    case 3:

     System.out.println("                        ");
     System.out.println("*************************");
     System.out.println("     MENU DE BUSQUEDA    ");
     System.out.println("*************************");
     System.out.println("                        ");
     System.out.println("1. BUSCAR POR ID");
     System.out.println("4. BUSCAR POR NOMBRE");
     System.out.println("5. SALIR ");
     System.out.println("Elige una opcion del menu: ");
     opcion1 = SC.nextInt();
     switch (opcion1) {
      case 1:
       System.out.println("INGRESE EL ID A BUSCAR: ");
       opcion1 = SC.nextInt();
       if (opcion1 >= 0 && opcion1 < REGISTRO.length) {
        System.out.printf("\nEL ID es: " + "" + REGISTRO[opcion1].getID());
        System.out.printf("\nEL NOMBRE ES: " + REGISTRO[opcion1].getNOMBRE());
        System.out.printf("\nEL APELLIDO PATERNO ES: " + REGISTRO[opcion1].getAPELLIDO_P());
        System.out.printf("\nEL APELLIDO MATERNO ES: " + REGISTRO[opcion1].getAPELLIDO_M());
        System.out.printf("\nLA EDAD ES: " + REGISTRO[opcion1].getEDAD());
        System.out.printf("\nEL TELEFONO ES: " + REGISTRO[opcion1].getTELEFONO());
        System.out.printf("\nEL CORREO ES: " + REGISTRO[opcion1].getCORREO());
        System.out.printf("\nLA DIRECCION ES: " + REGISTRO[opcion1].getDIRECCION());
       } else {
        System.out.printf("NO EXISTE ESTE CLIENTE");

       }
       break;
      case 4:
       int P = -1;
       System.out.println("INGRESE EL NOMBRE A BUSCAR: ");
       String BUSCAR = null;
       try {
        BUSCAR = B.readLine();
       } catch (IOException e) {
        e.printStackTrace();
       }
      {
       for(int i=0;i< REGISTRO.length; i++){
        if(BUSCAR.equals(REGISTRO[i].getNOMBRE())){
         P=i;
         System.out.printf("CLIENTE EXISTENTE EN EL REGISTRO");
         System.out.printf("\nEL ID es: " + "" + REGISTRO[i].getID());
         System.out.printf("\nEL NOMBRE ES: " + REGISTRO[i].getNOMBRE());
         System.out.printf("\nEL APELLIDO PATERNO ES: " + REGISTRO[i].getAPELLIDO_P());
         System.out.printf("\nEL APELLIDO MATERNO ES: " + REGISTRO[i].getAPELLIDO_M());
         System.out.printf("\nLA EDAD ES: " + REGISTRO[i].getEDAD());
         System.out.printf("\nEL TELEFONO ES: " + REGISTRO[i].getTELEFONO());
         System.out.printf("\nEL CORREO ES: " + REGISTRO[i].getCORREO());
         System.out.printf("\nLA DIRECCION ES: " + REGISTRO[i].getDIRECCION());
        } if (P==-1){
         System.out.printf("NO EXISTE ESTE CLIENTE");
        }
       }
      }

       break;
      case 5:
       System.out.printf("GRACIAS POR USAR EL PROGRAMA DE BUSQUEDA BUEN DIA");
       System.out.printf("\n*******************************************************************");
       break;
      case 0:
       System.out.printf("GRACIAS POR USAR EL PROGRAMA BUEN DIA");
       System.out.printf("\n*******************************************************************");
       break;
     }


   }
  }
 }
}