class code8{

  public static void main(String[]args){
  
    int a=10;

    int b=20;

    if(a>=0 && b>=0){

	    int num=a*b;

	    

            
	    switch(num % 2){

		    case 0:

			    System.out.println("number is even");

			   break;

	          case 1:
		

		            System.out.println("number is odd");	 

			    
	    
	    }
    
       
    }else{
    
      System.out.println("Sorry negative number not allowed");
    }
  }
}
