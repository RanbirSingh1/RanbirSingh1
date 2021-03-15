public class FinDWordInArray {
    static int R,C;
    public static void main(String args[])
    {
        R = 3;
        C = 13;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };

        patternSearch(grid, "GEEKS",R,C);
        System.out.println();
        patternSearch(grid, "IDEQ",R,C);
    }

    private static void patternSearch(char[][] grid, String word, int m, int n) {

        int strLen=word.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=word.charAt(0))
                    break;
                else{
                   // grid[i][j]='-';
                    if(findrestwords(strLen,word,grid,i,j))
                    System.out.println("i -> "+i+" j -> "+j);

                }
            }
        }

    }

    private static boolean findrestwords(int length,String word,char[][] grid,int row,int col) {
        int x[]={ -1, -1, -1, 0, 0, 1, 1, 1 };
        int y[]={ -1, 0, 1, -1, 1, -1, 0, 1 };
        int i;
            for(int k=0;k<8;k++){
                int newx =row+x[k];
                int newy =col+y[k];
                for(i=1;i<length;i++){
                if(checkOutOfBounds(grid,newx,newy)) {
                    break;
                }
                if(grid[newx][newy] != word.charAt(i)){
                    break;
                }
                    newx +=x[k];
                    newy +=y[k];
                }
                if(i==length)
                    System.out.println("length "+i);
                    return true;
            }
        return false;
    }

    private static boolean checkOutOfBounds(char[][] grid,int i,int j){
        if(i > grid.length || i< 0 || j > grid[0].length || j <0)
            return true;
        else
            return false;
    }


}

