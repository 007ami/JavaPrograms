package pattern;

public class pattern29 {

	public static void main(String[] args) {
      int k=1;
      for(int i=1;i<=3;i++)
      {
    	  for(int j=1;j<=3;j++)
    	  {
    		  if(i>=j)
    		  {
    			  System.out.print(k++);
    		  }
    	  }
    	  System.out.println();
      }
	}

}
