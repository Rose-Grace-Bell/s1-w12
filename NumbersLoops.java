public class NumbersLoops{
    public NumbersLoops(){
      for(int i = 0; i<=10; i++){
         System.out.println(i);
      }
    }
  
    public int digitSum(int num){
      return (num*(num+1))/2;
    }
  
    public int reverseNum(int num){
      int length = String.valueOf(Math.abs(num)).length();
      int x=num;
      int b=0;
      for(int j = 1;j<=length; j++){
        b += (x%10) * (Math.pow(10,(length-j)));
        x=x/10; 
      }
      return b;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      return 0;
    }
  }