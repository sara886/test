package sara_mohamed;

public class task_merge {

	public static void main(String[] args) {
	int[] a={1,3,5,9};
	int[] b={0,5,7,8};
	int[] r=merge(a,b);
	for(int i=0;i<r.length;i++){
		System.out.print(r[i]+" ");
	}

	}



public static int[] merge(int[] a,int[] b){
	int[] r=new int[a.length+b.length];
	int aindex=0;
	int bindex=0;
	int rindex=0;
	while(aindex<a.length&&bindex<b.length){
		if(a[aindex]<=b[bindex]){
			r[rindex++]=a[aindex++];
		}
		else{
			r[rindex++]=b[bindex++];
		}
	}
	while(aindex<a.length){
		r[rindex++]=a[aindex++];
	}
	while(bindex<b.length){
		r[rindex++]=b[bindex++];
		}
	return r;
	
 }
}
