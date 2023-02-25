
class Animal {
  public void eat() {
    System.out.println("I am eating");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("Woof!");
  }
}


class tommy extends Dog {
  public void playFetch() {
    System.out.println("I am playing fetch");
  }
}


class Main {
  public static void main(String[] args) {
    tommy myLabrador = new tommy();
    myLabrador.eat(); 
    myLabrador.bark(); 
    myLabrador.playFetch(); 
  }
}
