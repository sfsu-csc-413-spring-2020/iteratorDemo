import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IteratorDemo<T> {
  private List<T> internalCollection;
  private int i = 0;

  public IteratorDemo(Collection<T> collection){
    this.internalCollection = new ArrayList<T>(collection);
  }

  public boolean hasNext(){
    return i < internalCollection.size();
  }

  public T next(){
    T nextObject = internalCollection.get(i);
    i++;
    return nextObject;
  }

  public static void main(String args[]){
    List<String> strings = new ArrayList<>();
    strings.add("Hello");
    strings.add("world");
    IteratorDemo<String> iteratorDemo = new IteratorDemo<>(strings);

    while(iteratorDemo.hasNext()){
      System.out.println(iteratorDemo.next());
    }

    Set<Integer> ints = new HashSet<>();
    ints.add(1);
    ints.add(2);
    ints.add(3);
    IteratorDemo<Integer> intDemo = new IteratorDemo<>(ints);

    while(intDemo.hasNext()){
      System.out.println(intDemo.next());
    }
  }

}
