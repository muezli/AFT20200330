package bevasarlas;

/**
 *
 * @author muezli
 */
public class Logika {
    public String[][] Rendez(String[][] data, boolean aToZ){
        //Rendezés A=>Z tömb első oszlopa szerint
        String tmp;
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i][1].compareToIgnoreCase(data[j][1])>0) {
                    tmp = data[i][1];
                    data[i][1] = data[j][1];
                    data[j][1] = tmp;
                }
            }
        }
        
        //Ha nem A=>Z tömb megfordítása
        if (!aToZ) {
            int start = 0;
            int end = data.length;
            while(start < end){
                String[] stmp = data[start];
                data[start] = data[end];
                data[end] = stmp;
                start++;
                end--;
            }
        }
        return data;
    }
}
