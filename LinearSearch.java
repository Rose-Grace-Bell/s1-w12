public class LinearSearch{
    public int fIndOlet(String w, String l){
        int i =0;
        int b=0;
        while(i==0){
            if(w.substring(0,1).equals(l)){
                i=1;
                b--;
            }
            b++;
            if(w.equals("")){
                i=10;
                b=-1;
            }
        }
        return b;
    }

     public static void main(String[] args) {
        LinearSearch l = new LinearSearch();
        System.out.println(l.fIndOlet("wowie","w"));
        System.out.println(l.fIndOlet("wowie","e"));
        System.out.println(l.fIndOlet("wowie","o"));
        System.out.println(l.fIndOlet("wowie","i"));
        System.out.println(l.fIndOlet("wowie","s"));
    }
}