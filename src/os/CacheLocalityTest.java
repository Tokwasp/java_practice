package os;

public class CacheLocalityTest {
    static final int ROW_COUNT = 10000;
    static final int COL_COUNT = 10000;

    public static void main(String[] args) {
        int[][] arr = new int[ROW_COUNT][COL_COUNT];

        // 배열 초기화
        for(int i = 0; i < ROW_COUNT; i++){
            for(int j = 0; j < COL_COUNT; j++){
                if(j % 2 == 0) {
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }

        // 읽는 방식 i, j
        long total = 0;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < ROW_COUNT; i++){
            for(int j = 0; j < COL_COUNT; j++){
                total += arr[i][j];
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("cache TotalTime : " + (endTime - startTime) + "millis");

        // 읽는 방식 j, i
        total = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < ROW_COUNT; i++){
            for(int j = 0; j < COL_COUNT; j++){
                total += arr[j][i];
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("no cache TotalTime : " + (endTime - startTime) + "millis");
    }
}