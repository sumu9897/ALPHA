public class Patterns{
	
	public static void hollowRectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	
	public static void inverted_rotated_halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
	public static void inverted_halfPyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            //spaces...
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int number = 1;
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(number +" ");
                number++;
            }
            //spaces ...
            System.out.println();
        }
    }
    public static void k_pattern(int n) {
    	
    	int i,j;
    	System.out.println("K Pattern");
    	for( i=n; i>=1;i--) {
    		for ( j=1; j<=i ;j++) {
    			System.out.print("*");
    			
    		}
    		System.out.println();
    		
    	}
    	for (i=2; i<=n ;i++) {
			for ( j=1;j<=i;j++) {
    			System.out.print("*");
    			
    		}
    		System.out.println();
		}
    }
    
    public static void triangle(int n) {
    	int i,j;
    	System.out.println("Triangle");
    	for (i=0;i<n;i++) {
    		for(j=n-i;j>1;j--) {
    			System.out.print(" ");
    		}
    		
    		for (j=0; j<=i;j++) {
    			System.out.print("* ");
    		}
    		
    		System.out.println();
    	}
    }
	
	public static void main(String args[]) {
		hollowRectangle(5, 5);
        inverted_rotated_halfPyramid(4);
        inverted_halfPyramid_withNumbers(5);
        floyds_triangle(5);
        k_pattern(6);
        triangle(6);

	}
	
}