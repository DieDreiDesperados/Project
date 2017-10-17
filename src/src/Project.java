i
/**
 * Created by obayer2s on 10.10.2017.
 */
public class Project {

    private String[] kontrolle;
    public Project(String[][] reihenfolge){
        kontrolle  = new String[reihenfolge.length];
        for(int i = 0; i < kontrolle.length; i++){
            kontrolle[i] = reihenfolge[i][1] + reihenfolge[i][0];
        }
    }
    public boolean isWellSorted(String[] sequence) {
        if(sequence.length==0){
            return true;
        }
        for(int i = 0; i < sequence.length-1; i++){
            for(int p = i; p < sequence.length-1;p++){
                for(int u = 0; u < kontrolle.length;u++) {
                    if ((sequence[i] + sequence[p]) == kontrolle[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
