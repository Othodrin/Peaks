// Assignment #1
// Author: Lucas Ten
// Student #: 101265497
// Date: Friday, February 3, 2023
import java.util.Arrays;
public class Peaks{
    public static int numPeaks(int[] data){
        if(data.length == 1){
            return 1;
        }
        int peaks = 0;
        for(int i = 0; i < data.length; i++){   
            if(i == 0){
                if(data[i] > data[i+1]){
                    peaks++;
                } 
            }
            else if(i == data.length-1){
                if(data[i] > data[i-1]){
                    peaks++;
                }
            }
            else{
                if(data[i] > data[i-1] && data[i] > data[i+1]){
                    peaks++;
                }
            }
        }

        return peaks;
    }

    public static int[] peaks(int[] data){
        int[] peakLocations = new int[numPeaks(data)];
        int currentPeakIndex = 0;
        if(data.length == 1){
            peakLocations[currentPeakIndex] = 0;
            return peakLocations;
        }
        for(int i = 0; i < data.length; i++){
            if(i == 0){
                if(data[i] > data[i+1]){
                    peakLocations[currentPeakIndex] = i;
                    currentPeakIndex++;
                } 
            }
            else if(i == data.length-1){
                if(data[i] > data[i-1]){
                    peakLocations[currentPeakIndex] = i;
                }
            }
            else{
                if(data[i] > data[i-1] && data[i] > data[i+1]){
                    peakLocations[currentPeakIndex] = i;
                    currentPeakIndex++;
                }
            }
        }

        return peakLocations;
    }

    public static int[][] minmax(int[] data){
        int num_locations_min = 0, num_locations_max = 0;
        int[][] min_max;
        int lowest = data[0];
        int highest = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] == lowest) num_locations_min++;
            if(data[i] == highest) num_locations_max++;
            if(data[i] < lowest){
                lowest = data[i];
                num_locations_min = 1;
            } 
            if(data[i] > highest){
                 highest = data[i];
                 num_locations_max = 1;
            }
        }
        min_max = new int[2][];
        min_max[0] = new int[num_locations_min+1];
        min_max[1] = new int[num_locations_max+1];
        min_max[0][0] = lowest;
        min_max[1][0] = highest;
        int location_start_min = 1, location_start_max = 1;
        for(int i = 0; i < data.length; i++){
            if(data[i] == lowest){
                min_max[0][location_start_min] = i;
                location_start_min++;
            }
            if(data[i] == highest){
                min_max[1][location_start_max] = i;
                location_start_max++;
            }
        }

        return min_max;   
    }

    public static void main(String[] args){
        //int[] data = {-9,10,11,12,13,14,15,16,17,18,10,2,7,8,4,42,2,22,362,32,73,273,27,7};
        //System.out.println(numPeaks(data));
        //int[] arr = peaks(data);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.deepToString(minmax(data)));
        	
        	
        	
        	
        int[] x;
        x = new int[]{11,22,33};
    }
}