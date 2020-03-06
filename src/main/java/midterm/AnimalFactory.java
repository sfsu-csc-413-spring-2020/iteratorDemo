package midterm;

public class AnimalFactory { // not of type Animal
  // not need to call new
  public static Animal getObject(String name){
    // switching logic
    if(name.equals("dog")){
      return new Dog("asd", 4);
    }
    return null;
  }
}
