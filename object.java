class person {
  public String name;
  public String age;
  public String gender;
  void walk() {
    System.out.println("waking function.....");
  }

}
class demo {
  public static void main(String[] args) {
    person ram  = new person();
    ram.name    = "Ram";
    ram.age     = "5";
    ram.gender  = "Male";
    System.out.println(ram.name);
    System.out.println(ram.age);
    System.out.println(ram.gender);

  }
}
