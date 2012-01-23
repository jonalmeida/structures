//import java.util.*;

public class pixelcomplex {
	
	public static Integer[][] image =	{  {1,5,3,8,2},
																						{3,0,6,3,1},
																						{5,4,8,1,3},
																						{6,2,3,2,3},
																						{3,5,2,1,8}};

	public static void main(String[] args) {
		
		int[][] testCenter = new int[5][5];
		
		//testCenter[0][0] = image[0][0];
		//System.out.println(image[1][0]);
		
		Integer[] testBorder = new Integer[1]; //new Integer;
		int totalBorder = 0; //new Integer;
		int borderCounter = 0;
		
		testBorder[0] = 0;
		
		for(int i=0; i < 5;i++){
			for(int j=0; j < 5;j++){
				try{
				testBorder[0] = image[i][j+1];
				}					catch(ArrayIndexOutOfBoundsException e){
					//				System.out.println("Exception error");	
									}
				//System.out.println(testBorder[0]);

									if(testBorder[0] > 0){
									totalBorder = testBorder[0] + totalBorder;
									borderCounter++;
									}

				try{
				testBorder[0] = image[i+1][j+1];
			}					catch(ArrayIndexOutOfBoundsException e){
						//		System.out.println("Exception error");	
								}
			
									if(testBorder[0] > 0){
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}

				try{
				testBorder[0] = image[i+1][j];
				}					catch(ArrayIndexOutOfBoundsException e){
							//		System.out.println("Exception error");	
									}
				
									if(testBorder[0] > 0){
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
				
				try{
				testBorder[0] = image[i+1][j-1];
				}					catch(ArrayIndexOutOfBoundsException e){
								//	System.out.println("Exception error");	
									}
				//System.out.println(image[i][j]);
				
/*				catch(Exception e){
					System.out.println("Test");
				}
*/					
				
									if(testBorder[0] > 0) {
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
			
				
			
				try{
				testBorder[0] = image[i][j-1];
				}					catch(ArrayIndexOutOfBoundsException e){
				//					System.out.println("Exception error");	
									}
				
									if(testBorder[0] > 0) {
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
				
				try{
				testBorder[0] = image[i-1][j-1];
				}					catch(ArrayIndexOutOfBoundsException e){
					//				System.out.println("Exception error");	
									}
				
									if(testBorder[0] > 0) {
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
				
				try{
				testBorder[0] = image[i-1][j];
				}					catch(ArrayIndexOutOfBoundsException e){
						//			System.out.println("Exception error");	
									}
				
									if(testBorder[0] > 0) {
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
				
				try{
				testBorder[0] = image[i-1][j+1];
				}					catch(ArrayIndexOutOfBoundsException e){
							//		System.out.println("Exception error");	
									}
				
									if(testBorder[0] > 0) {
									totalBorder = (int) testBorder[0] + totalBorder;
									borderCounter++;
									}
									

				
				
				float testAverage = 0;
				
				testAverage = (float) totalBorder/ (float)borderCounter;
				
				if(testAverage < (int)image[i][j])
					testCenter[i][j] = 255;
				else
					testCenter[i][j] = 0;
//				for(int k=0;k<4;k++){
				System.out.print(testCenter[i][j] + "\t");
//				}
//				System.out.println("\n");
			}		
			System.out.print("\n");
		}
	}
}