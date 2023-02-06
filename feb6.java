public class feb6 {
    public static void main(String[] args) {
        int n=5;
     int ch=65;
     for(int i=1;i<=n;i++){
       if(i%2==0){
        char chRev=(char)(ch+i-1);
        for(int j=1;j<=i;j++){
            System.out.print((char)chRev-- +" ");
            ch++;
        }
       }
       else{
        for(int j=1;j<=i;j++){
            System.out.print((char)ch++ +" ");
        }
       }
       System.out.println();
     }
        
    }
    
}
