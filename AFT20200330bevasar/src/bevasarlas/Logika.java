package bevasarlas;

import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author muezli
 */
public class Logika {
    public String[][] Rendez(String[][] data, boolean aToZ){
        //Rendezés A=>Z tömb első oszlopa szerint
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(final String[] r1, final String[] r2) {
                final String n1 = r1[0];
                final String n2 = r2[0];
                return n1.compareTo(n2);
            }
        });
        
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
    
        public String[][] Rendez(String[][] data, boolean aToZ, int ordercol){
        //Rendezés A=>Z tömb első oszlopa szerint
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(final String[] r1, final String[] r2) {
                final String n1 = r1[ordercol];
                final String n2 = r2[ordercol];
                return n1.compareTo(n2);
            }
        });
        
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
    
    public int Vegosszeg(String[][] data){
        int sum = 0;
        //Jelenleg 4-5 oszlopra tekintek mint mennyiség és ár
        //Nem numerikus karakterek eltávolítása a stringből
        for (int i = 0; i < data.length; i++) {
            sum += Integer.parseInt((data[i][4]).replaceAll("[^\\d]", "")) * Integer.parseInt((data[i][5]).replaceAll("[^\\d]", ""));
        }
        return sum;
    }
    
    public String[][] AddRow(String[][] data){
        String[][] odata = new String[data.length+1][data.length];
        System.arraycopy(data, 0, odata, 0, data.length);
        return odata;
    }
}
