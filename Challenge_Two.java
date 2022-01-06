import java.util.*;

 class User{
  private String name;
  private String surname;
  private String email;
  private String Date_Of_Birth;
    
    
    User(String name, String surname, String email, String Date_Of_Birth){
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.Date_Of_Birth = Date_Of_Birth;
       }
       
       public String getName(){
          return name;
       }
       public String getSurname(){
          return surname;
       }
       public String getEmail(){
          return email;
       }
       public String getDateOfBirth(){
          return Date_Of_Birth;
       }
       public String toString(){
          return name+" "+surname+" "+email+" "+Date_Of_Birth;
       }
    }
 class Challenge_Two{
    
     public static void main(String[] args){   
     List<User> u = new ArrayList<User>();
      Scanner s = new Scanner(System.in);    
      Scanner s1 = new Scanner(System.in); 
         int ch;
         do{
             // User option menu
             System.out.println("---Menu---");
             System.out.println("1. Add");
             System.out.println("2. Update");
             System.out.println("3. Delete");
             System.out.println("4. List Users");
             System.out.println("5. Exit");
             System.out.print("Choose an option from (1 - 5)");
             ch = s.nextInt();
             
             switch(ch){
                // User data input when option 1 is chosen
                case 1:
                     System.out.print("Enter your name: ");
                     String name = s1.nextLine();
                     System.out.print("Enter your surname: ");
                     String surname = s1.nextLine();
                     System.out.print("Enter your email: ");
                     String email = s1.nextLine();
                     System.out.print("Enter your Date of birth: ");
                     String Date_Of_Birth = s1.nextLine();
                     System.out.print("Hello " + name + " " + surname + " your details have been saved.");
                     
                     
                     u.add(new User(name,surname,email,Date_Of_Birth));
                     break;
                     
                     // User data input when option 2 is chosen
                     case 2:
                     boolean found = false;
                     System.out.print("Enter email to update: ");
                     email = s1.nextLine();
                     System.out.println("---------------");
                     Iterator<User> i = u.iterator();
                     ListIterator<User>li = u.listIterator();
                     while(li.hasNext()){
                         User us = li.next();
                         if(us.getEmail() == email) {
                         System.out.println("Enter new name");
                         name = s1.nextLine();
                         System.out.println("Enter new surname");
                         surname = s1.nextLine();
                         System.out.println("Enter new email");
                         email = s1.nextLine();
                         System.out.println("Enter new date of birth");
                         Date_Of_Birth = s1.nextLine();
                         li.set(new User(name,surname,email,Date_Of_Birth));
                         found = true;
                         }
                         }
                         if(!found){
                              System.out.println("Record not found");
                         }else{
                              System.out.println("Record is updated");     
                     }
                     System.out.println("--------------------");
                     break;
                     // User email input to delete
                     case 3:
                     found = false;
                     System.out.print("Enter email: ");
                     email = s1.nextLine();
                     System.out.println("---------------");
                  
                     i = u.iterator();
                     while(i.hasNext()){
                         User us = i.next();
                         if(us.getEmail() == email) {
                         i.remove();
                         
                         found = true;
                         }
                         }
                         if(!found){
                              System.out.println("Record not found");
                         }else{
                              System.out.println("Record is deleted");     
                     }
                     System.out.println("--------------------");
                     break;
                     // user list function 
                     case 4:
                          System.out.println("------------------");
                       
                          i = u.iterator();
                          while(i.hasNext()){
                              User us = i.next();
                              System.out.println(us);
                              }
                              System.out.println("--------------------");
                              break;
                      // Function to exit        
                      case 5: 
                      		System.exit(0);
                              }
                     
                              
        }while(ch!=0); 
       }
      }
    
          
        
