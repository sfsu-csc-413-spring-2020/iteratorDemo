package midterm;

import java.util.ArrayList;
import java.util.List;

public class DemoDao {

  private List<DemoDto> data = new ArrayList<>();
  // private mysql;

  // in charge of storing data
  public void addItem(DemoDto dto){
    data.add(dto);
  }

  public static void main(String args[]){
    DemoDao demoDao = new DemoDao();
    demoDao.addItem(new DemoDto("Ads"));
  }
}
