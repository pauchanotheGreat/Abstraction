import java.util.Scanner;
public class RunAnimal {
   
 
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Choose an animal. Press b for Bird, c for cat , or d for Dog:");
    String choice = sc.nextLine();
    
   if(choice.equalsIgnoreCase("b")){
   	Bird b  = new Bird();
   	b.eat();
   	b.sleep();
    b.makeSound();   
   }
   else if (choice.equalsIgnoreCase("c")){
   	Cat c  = new Cat();
   	c.eat();
   	c.sleep();
   	c.makeSound();
   }
   	else if(choice.equalsIgnoreCase("d")){
   		Dog d = new Dog();
   		d.eat();
   		d.sleep();
   		d.makeSound();
   		
   		
   	}
   	else{
   		System.out.print("Invalid");
   	}
   
    }
}