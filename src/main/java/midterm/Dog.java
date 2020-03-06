package midterm;

public class Dog implements Animal {
  public String sound;
  public Integer numLegs;

  public Dog(String sound, Integer numLegs) {
    this.sound = sound;
    this.numLegs = numLegs;
  }

  public static class DogBuilder{
    // copy parameters
    public String sound;
    public Integer numLegs;

    // step 2 make setters

    public void setSound(String sound) {
      this.sound = sound;
    }

    public void setNumLegs(Integer numLegs) {
      this.numLegs = numLegs;
    }

    // last step
    public Dog build(){
      return new Dog(this.sound, this.numLegs);
    }
  }


  public static void main(String[] args){
    DogBuilder dogBuilder = new DogBuilder(); // builder needs new
    dogBuilder.setSound("Woof");
    dogBuilder.setNumLegs(4);
    Dog dog = dogBuilder.build();
  }
}
