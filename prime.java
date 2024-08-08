package csed8;

public class prime {
      public static void main(String[] args) {
    	  int n = 23;
    	  int count = 1;
    	  for(int i=2;i<=n;i++) {
    		  if(n%i == 0) {
    			  count++;
    		  }
    	  }
    	  if(count==2) {
    		  System.out.println("prime");
    	  }
    	  else {
    		  System.out.println("not prime");
    	  }
      }
}
