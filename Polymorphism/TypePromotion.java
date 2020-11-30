public class TypePromotion
{
	//One type is promoted to another implicitly if no matching datatype is found.
	//No de-promotion occurs implicitly.
	//byte---->short,int,long,float,double
	//short--->int,long,float,double
	//char---->int,long,float,double
	//int----->long,float,double
	//long---->float,double
	//float--->double
	void sum(int a,long b){
		System.out.println(a+b);
	}
/*	void sum(long a,int b){ //ambiguity arises here. results  in compile time error.
		System.out.println(a+b);
	}
*/
	void sum(int a,int b,long c){
		System.out.println(a+b+c);
	}
	void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		TypePromotion typePromotion = new TypePromotion();
		typePromotion.sum(10,10);//second int literal will be promoted to long.
		typePromotion.sum(10,10,10);//no type promotion since matching is available.
	}
}