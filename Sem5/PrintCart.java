package Sem5;

public class PrintCart {
    public static void main(String [] args) {
        var map = getMap();
        System.out.println(rowData(getMap()));
        
    }
    
    static int [][] getMap() {
        return new int [][]{
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,00,00,00,-1,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,-1,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,-1,00,00,-1,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,-1,00,-1,-1,-1,-1,00,00,00,00,00,-1},
            {-1,00,00,00,-1,00,-1,00,00,-1,00,00,00,00,00,-1},
            {-1,-1,-1,00,-1,00,-1,00,00,-1,00,00,00,00,00,-1},
            {-1,00,00,00,-1,00,-1,00,00,-1,00,-1,00,00,00,-1},
            {-1,00,00,00,-1,00,00,00,00,-1,-1,-1,00,00,00,-1},
            {-1,00,00,00,-1,00,00,00,00,-1,00,-1,00,00,00,-1},
            {-1,00,00,00,-1,00,00,00,00,-1,00,-1,00,00,00,-1},
            {-1,00,00,00,-1,-1,-1,-1,-1,-1,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,-1,-1,-1,-1,-1,-1,-1,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        };
    }

    static String rowData (int [][] map){
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%5d",map[row][col]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
