package midterm;

public class Singleton {

  private static Singleton instance = null;

  private Singleton(){
  }

  public static Singleton getInstance(){
    if(instance == null){
      instance = new Singleton();
    }
    return instance;
  }

  public static void main(String[] args){
    System.out.println(Singleton.instance == null); //true
    Singleton.getInstance();
    System.out.println(Singleton.instance == null);
    System.out.println(Singleton.instance == null);
    System.out.println(Singleton.instance == null);
  }
}
