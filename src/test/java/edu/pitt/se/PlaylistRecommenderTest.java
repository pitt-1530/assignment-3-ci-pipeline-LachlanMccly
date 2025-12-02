package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);

    }

    @Test
    void classifyEnergy_HighEnergy() {
        // Average: (150 + 140 + 145) / 3 = 145
        List<Integer> highBPMs = Arrays.asList(150, 140, 145);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(highBPMs), 
                     "Should classify average BPM >= 140 as HIGH.");
    }

    @Test
    void isValidTrackTitle_Valid() {
        // Length 15, only letters and space
        assertTrue(PlaylistRecommender.isValidTrackTitle("The Best New Song"), 
                   "Title with only letters and spaces should be valid.");
    }

    @Test
    void normalizeVolume_ClampsToMax() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(120), 
                     "Volume above 100 should be clamped to 100.");
    }
}
