class addi {
  public static void main(String[] args) {
    if(args.length == 2){
      int sum;
      sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
      System.out.println("Sum is " + sum);
    }
    else{
      System.out.println("invalid parameters");
      System.exit(0);
    }

  }
}
