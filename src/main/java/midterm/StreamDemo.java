package midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

  public static void main(String[] args){
    List<String> strings = new ArrayList<>();
    strings.add("Hello");
    strings.add("World!");

    List<String> output = strings.stream()
        .map(String::length)
        .filter(y -> y == 6)
        .filter(y -> y == 5)
        .map(Object::toString)
        .collect(Collectors.toList());

    output.stream()
        .forEach(n -> {
          System.out.println(n);
        });
  }
}
