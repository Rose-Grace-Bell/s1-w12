public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int c = 0;
      while(!s.equals("")){
        s=s.substring(1);
        c++;
      }
      return c;
    }
  
    public String copy(String s, int num){
      String r = "";
      for (int i = 0; i < num; i++) {
        r+=s;
      }
      return r;
    }
  
    public String interweaving(String s1, String s2){
      String u = "";
      for (int i = 0; i <= s1.length() + 1; i++) {
        u += s1.substring(0,1);
        u += s2.substring(0,1);
        s1 = s1.substring(1);
        s2 = s2.substring(1);
      }

      return u;
    }
  
  
  }