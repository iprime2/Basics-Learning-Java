import java.util.Arrays;
import java.util.Scanner;

public class Test {
        public static int countFavoriteSingers(int[] songs) {
            int maxCount = 0;
            int n = songs.length;
            int[] singerCounts = new int[n]; // assuming a maximum of 1000 singers

            for (int i = 0; i < songs.length; i++) {
                int singer = songs[i];
                singerCounts[singer]++;
                if (singerCounts[singer] > maxCount) {
                    maxCount = singerCounts[singer];
                }
            }

            System.out.println(Arrays.toString(singerCounts));

            int numFavoriteSingers = 0;
            for (int i = 0; i < singerCounts.length; i++) {
                if (singerCounts[i] == maxCount) {
                    numFavoriteSingers++;
                }
            }

            return numFavoriteSingers;
        }

        public static void main(String args[] ) throws Exception {

//            Scanner scanner = new Scanner(System.in);
//
//            int n = scanner.nextInt();
            int[] songs = {1,1,2,2,3};

//            for (int i = 0; i < n; i++) {
//                songs[i] = scanner.nextInt();
//            }

            int numFavoriteSingers = countFavoriteSingers(songs);
            System.out.println(numFavoriteSingers);

        }
    }


