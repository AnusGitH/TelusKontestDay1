package pascletemple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascleTemple2 {

	public static void main(String[] args) {
		
	PascleTempleIteration pascleTempleIteration = new PascleTempleIteration();
	PascleTempleRecursion pascleTempleRecursion = new PascleTempleRecursion();
    PascleTempleMemoisation pascleTempleMemoisation = new PascleTempleMemoisation();
    
    try (Scanner scnr = new Scanner(System.in)) {
		System.out.println("Select your choice... PRESS \n I for Iteration \n R for Recursion \n M for Memoisation \n");

		switch (scnr.next() )
			{	
			    case ("I"): 
			    	pascleTempleIteration.pascleTempleIteration();
					break;
					
				case ("R"):
					pascleTempleRecursion.pascleTempleRecursion();
					break;
				case ("M"): 
					pascleTempleMemoisation.pascleTempleMemoisation();
				    break;
			}		
	}
}
}


class PascleTempleIteration {
	void pascleTempleIteration() {
	
	Scanner in = new Scanner(System.in);

	  int i=0,j=0,k=0,m;
	  int l=0;
	  CoEfficient1 coeff=new CoEfficient1( );
	  System.out.println("Enter the degree of the binomial equation you want the co-efficient for:");
	  try
	  {
		   k=in.nextInt();
	   }
	  catch (Exception e)
	  {
	   System.out.println("Exception occured");
	   }		 
	  
	  System.out.println("The Pascle Temple for a binomial equation of of degree "+(long)k+" is:\n");
	  for(i=0;i<=k;i++)
	  {
		  
		  
	   for(j=1;j<=(k-i);j++)
	   { 
	    System.out.print("\t");
	    }
	   
	   
	   
	   for(l=0;l<=i;l++)
	    {
	     if(i==l)
	     {
	      System.out.print("\b"+(long)coeff.nCi(i,l));
	      }
	     else
	     {
	    System.out.print(""+(long)coeff.nCi(i,l)+"\t\t");
	      }
	     }
	   
	   
	   m=0;
	   for(m=1;m<=k-i;m++)
	   {
	    System.out.print("\t");
	    }
	   System.out.println(" -degree "+(long)i );
	   
	   
	  }
	  
	  
	  
	System.out.println("\n");
	System.out.println("The Co-Efficients of the binomial equation of degree "+(long)k+" is:\n");
	 
	    for(l=0;l<=k;l++)
	    {
	       System.out.print(""+(long)coeff.nCi(k,l)+" ");
	     }
	   System.out.println( );
	 } 		
}


class CoEfficient1
{
double y,i1,z;
double nCi(double i,double l)
{  
y=(fact(i))/((fact(l))*(fact(i-l)));
return y;
}
double fact(double x)
{
z=1;
if(x==0)
{
z=1;
}
else
{
for(i1=1;i1<=x;i1++)
{
z=z*i1;
}
}
return z;
}
}

class PascleTempleRecursion{
	void pascleTempleRecursion() {
	
	Scanner in = new Scanner(System.in);

	  int i=0,j=0,k=0,m;
	  int l=0;
	  CoEfficient coeff=new CoEfficient( );
	  System.out.println("Enter the degree of the binomial equation you want the co-efficient for:");
	  try
	  {
		   k=in.nextInt();
	   }
	  catch (Exception e)
	  {
	   System.out.println("Exception occured");
	   }
	  
//	  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 
	  
	  System.out.println("The Pascle Temple for a binomial equation of of degree "+(long)k+" is:\n");
	  for(i=0;i<=k;i++)
	  {
		  
		  
	   for(j=1;j<=(k-i);j++)
	   { 
	    System.out.print("\t");
	    }
	   
	   
//Main Code	  
	   
	   
	   for(l=0;l<=i;l++)
	    {
	     if(i==l)
	     {
	      System.out.print("\b"+(long)coeff.nCi(i,l));
	      }
	     else
	     {
	    System.out.print(""+(long)coeff.nCi(i,l)+"\t\t");
	      }
	     }
	   
	   
//  Main Code
	   
	   
	   m=0;
	   for(m=1;m<=k-i;m++)
	   {
	    System.out.print("\t");
	    }
	   System.out.println(" -degree "+(long)i );
	   
	   
	  }
	  
	  
	  
	System.out.println("\n");
	System.out.println("The Co-Efficients of the binomial equation of degree "+(long)k+" is:\n");
	 
	    for(l=0;l<=k;l++)
	    {
	       System.out.print(""+(long)coeff.nCi(k,l)+" ");
	     }
	   System.out.println( );
	 } 		
}


class CoEfficient
{
double y,i1,z;

double nCi(double i,double l)
{  
y=(fact(i))/((fact(l))*(fact(i-l)));
return y;
}

double fact(double x)
{
z=1;
if(x==0)
{
  return 1;
}
else
{
  return x*fact(x-1);
}	
}
}

class PascleTempleMemoisation{
	 void pascleTempleMemoisation() {
		
		Scanner in = new Scanner(System.in);
	
		  int i=0,j=0,k=0,m;
		  int l=0;
		  CoEfficient2 coeff=new CoEfficient2( );
		  System.out.println("Enter the degree of the binomial equation you want the co-efficient for:");
		  try
		  {
			   k=in.nextInt();
		   }
		  catch (Exception e)
		  {
		   System.out.println("Exception occured");
		   }
		  
//		  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		  
		  System.out.println("The Pascle Temple for a binomial equation of of degree "+(long)k+" is:\n");
		  for(i=0;i<=k;i++)
		  {
			  
			  
		   for(j=1;j<=(k-i);j++)
		   { 
		    System.out.print("\t");
		    }
		   
		   
//	Main Code	  
		   
		   
		   for(l=0;l<=i;l++)
		    {
		     if(i==l)
		     {
		      System.out.print("\b"+(long)coeff.nCi(i,l));
		      }
		     else
		     {
		    System.out.print(""+(long)coeff.nCi(i,l)+"\t\t");
		      }
		     }
		   
		   
//  Main Code
		   
		   
		   m=0;
		   for(m=1;m<=k-i;m++)
		   {
		    System.out.print("\t");
		    }
		   System.out.println(" -degree "+(long)i );
		   
		   
		  }
		  
		  
		  
		System.out.println("\n");
		System.out.println("The Co-Efficients of the binomial equation of degree "+(long)k+" is:\n");
		 
		    for(l=0;l<=k;l++)
		    {
		       System.out.print(""+(long)coeff.nCi(k,l)+" ");
		     }
		   System.out.println( );
		 } 		
	}

	
class CoEfficient2
{

 double y,i1,z;
 
	private Map<NoDn, Double> cache = new HashMap<>();
	
	NoDn nodn; 
 
 double nCi(double i,double l)
 {  	 
	 if(cache.containsKey(nodn)) {
		 return y;
	 }else {
		 y=(fact(i))/((fact(l))*(fact(i-l)));
		  
		  cache.put(new NoDn(i,l), y);
		  
		  return y;
	 }  
  }
 
 double fact(double x)
 {
  z=1;
  if(x==0)
  {
	  return 1;
   }
  else
  {
	  return x*fact(x-1);
  }
 } 
}

class NoDn{
	double i;
	double l;
	
	public NoDn(double i, double l) {
		this.i = i;
		this.l = l;
	}	
}
