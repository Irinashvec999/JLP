public class HelloAll {

<<<<<<< HEAD
      public static void main (String[] args){
          System.out.println("Hello all!!!);
          //================================
          printUserInfo("Vladyslav", "Kasyanchuk");
          printUserInfo("Ruslan", "Gramatic");
          printUserInfo("Ilya", "Igonin");
          printUserInfo("Irina", "Shvec");
          printUserInfo("Rotar", "Denis");
          printUserInfo("Maxim", "Voroniuk");
          printUserInfo("Kirill" ,"Klyenko");
          printUserInfo("Rotar", "Denis");
          printUserInfo("Nikita", "Palchinski");
          printUserInfo("Iliya ","Chernomorets");
          printUserInfo("Vitalij", "Stinskij");
          printUserInfo("Vladislav","Berdnikov");
          printUserInfo("Anna","Tsurkan");
          printUserInfo("Denis","Palamarchuk");
          printUserInfo("Aleksey", "Andreev");
      }

=======
     public static void main (String[] args){
        System.out.println("Hello all!!!);
        //================================
        printUserInfo("Vladyslav", "Kasyanchuk");
        printUserInfo("Ruslan", "Gramatic");
        printUserInfo("Irina", "Shvec");
        printUserInfo("Rotar", "Denis");
        printUserInfo("Iliya ","Chernomorets");
        printUserInfo("Ruslan", "Gramatic");    }
        printUserInfo("Irina", "Shvec");
        printUserInfo("Rotar", "Denis");
        printUserInfo("Maxim", "Voroniuk");
        printUserInfo("Kirill" ,"Klyenko");
        printUserInfo("Nikita", "Palchinski");
        printUserInfo("Vitalij", "Stinskij");
        printUserInfo("Iliya ","Chernomorets");
        printUserInfo("Vladislav","Berdnikov");
        printUserInfo("Anna","Tsurkan");
        printUserInfo("Denis","Palamarchuk");
        printUserInfo("Aleksey", "Andreev");
        printUserInfo("Ilya", "Igonin");
        printUserInfo("Ivan", "Brus");
      }	
                           
>>>>>>> 6ec17ac8715b8288f3ebbc469151acc9a41020a0
      private static void printUserInfo(String firstName, String lastName) {
          System.out.format("Hello %s %s, Welcome to Hillel school !!!\n", firstName, lastName);
      }
}
