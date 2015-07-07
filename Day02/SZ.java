
public class SZ {
	public static void main(String[] args){
		int a[][]=new int[20][5];
		int[] sum1=new int[5];
		int[][]arr=new int[5][5];
		int[]sum2=new int[5];
		String[]name=new String[]{"A01","A02","A03","A04","A05"};
	
		System.out.println("\tB01"+"\tB02"+"\tB03"+"\tB04"+"\tB05");
		for(int i=0;i<arr.length;i++){
		  System.out.print(name[i]);
		  for(int j=0;j<arr[i].length;j++){
			  arr[i][j]=(int)((Math.random()*0.4+0.6)*100);
			  System.out.print("\t"+arr[i][j]);
			  sum2[i]+=arr[i][j];
		  }
		  System.out.println();
		  
		}
		System.out.print("平均分");
		for(int j=0;j<arr[0].length;j++){
			for(int i=0;i<arr.length;i++){
				sum1[j]+=arr[i][j];
			}
			System.out.print("\t"+sum1[j]/5);
		}
		System.out.print("\n");
		System.out.print("每个人的总分");
		for(int i=0;i<arr.length;i++){
			System.out.print("\t"+sum2[i]);
			
		}
	}
}

