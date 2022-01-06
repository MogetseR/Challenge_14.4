import java.util.*;
import java.io.*;

class User implements Serializable{
   String name;
   String surname;
   String email;
   String Date_Of_Birth; 
   
   User(String name, String surname, String email, String Date_Of_Birth){
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.Date_Of_Birth = Date_Of_Birth;
   
   }
   public String toString(){
          return name+" "+surname+" "+email+" "+Date_Of_Birth;
   }
}
class Database_To_File{
   public static void main(String[] args) throws Exception{
      int choice = -1;
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      File file = new File("Users.txt");
      List<User> al = new ArrayList<User>();
      ObjectOutputStream oos = null; 
      ObjectInputStream ois = null;
      ListIterator li = null;
      
      // Read to file
      if(file.isFile()){
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<User>)ois.readObject();
          ois.close();
      
      }
    
    do{
        System.out.println("1. Add");
        System.out.println("2. List");
        System.out.println("3. Delete");
        System.out.println("4. Update");
        System.out.println("5. Exit");
        System.out.println("Enter your option: ");
        choice = s.nextInt();
        
        switch(choice){
            case 1:
              System.out.println("Enter the number os users u want to enter: ");
              int n = s.nextInt();
              for(int i=0;i<n;i++){
              System.out.print("Enter your name: ");
              String name = s1.nextLine();
              System.out.print("Enter your surname: ");
              String surname = s1.nextLine();
              System.out.print("Enter your email: ");
              String email = s1.nextLine();
              System.out.print("Enter your Date of birth in (DD/MM/YYYY): ");
              String Date_Of_Birth = s1.nextLine();
              
              al.add(new User(name,surname,email,Date_Of_Birth));
              
              }
              // write to file
              oos = new ObjectOutputStream(new FileOutputStream(file));
              oos.writeObject(al);
              oos.close();
            break;
            case 2:
                if(file.isFile()){
                ois = new ObjectInputStream(new FileInputStream(file));
                al = (ArrayList<User>)ois.readObject();
                ois.close();
                System.out.println("----------------------------------------------");
                li = al.listIterator();
                while(li.hasNext())
                System.out.println(li.next());
                System.out.println("----------------------------------------------"); 
                }else{
                    System.out.println("File not exists...!");
                }
            break;

            case 3:
                if(file.isFile()){
                ois = new ObjectInputStream(new FileInputStream(file));
                al = (ArrayList<User>)ois.readObject();
                ois.close();
                boolean found = false;
                System.out.println("Enter name to delete: ");
                String name = s1.nextLine();
                System.out.println("----------------------------------------------");
                li = al.listIterator();
                while(li.hasNext()){
                    User u = (User)li.next();
                    if(u.name == name){
                        li.remove();
                        found = true;
                      }
                }
                if(found){
                   // write to file
                   oos = new ObjectInputStream(new FileInputStream(file));
                   oos.writeObject(al);
                   ois.close();
                   System.out.println("Record Delete seccessfully....!");
                }else{
                   
                   System.out.println("Record not found....!");     
                   }
                System.out.println("----------------------------------------------");
                }else{
                    System.out.println("File not exists...!");
                    }
            break;
            
            case 4:
                if(file.isFile()){
                ois = new ObjectInputStream(new FileInputStream(file));
                al = (ArrayList<User>)ois.readObject();
                ois.close();
                boolean found = false;
                System.out.print("Enter name to update: ");
                String name = s1.nextLine();
                System.out.println("----------------------------------------------");
                li = al.listIterator();
                while(li.hasNext()){
                    User u = (User)li.next();
                    if(u.name == name){
                        System.out.print("Enter new name: ");
                        String name = s1.nextLine();
                        li.set(new User(name));
                        found = true;
                      }
                }
                if(found){
                   //write to file
                   oos = new ObjectInputStream(new FileInputStream(file));
                   oos.writeObject(al);
                   ois.close();
                   System.out.println("Record Updated seccessfully....!");
                }else{
                   
                   System.out.println("Record not found....!");     
                   }
                System.out.println("----------------------------------------------");
                }else{
                    System.out.println("File not exists...!");
                    }
            break;
            
       }
       
    }while(choice!=0);
  
}	
}





