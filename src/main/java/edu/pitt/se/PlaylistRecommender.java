package edu.pitt.se;

import java.util.List;
import java.util.Arrays;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        if(bpms == null || bpms.isEmpty()){
            return "Rejection: list is null or empty";
        }

        int sumpBPM = 0;


        for(Integer bpm : bpms){
            sumpBPM+= bpm;
        }

        double avgBpm = (double) sumpBPM/ bpms.size();

        if(avgBpm >=140){
            return "HIGH";
        }
        else if(avgBpm>=100){
            return "MEDIUM";
        }
        else{
            return "LOW";
        }
        
            return "empty";

    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if(title == null){
            return false;
        }
        int length = title.length();

        if(length<1 || length>30){
            return false;
        }

        for(char c: title.toCharArray()){
            if(!Character.isLetter(c) && c != ' '){
                return false;
            }
        }
        return true;
    }

    

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if(volumeDb> 100){
            return 100;
        }
        else if(volumeDb<0){
            return 0;
        }

        return volumeDb;
    }
}
