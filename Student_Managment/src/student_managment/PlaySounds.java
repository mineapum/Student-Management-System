
package student_managment;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author Sovuthyna
 */
public class PlaySounds {
	public static void PlaySoundEf(File Sound) {
		try {
                    try (Clip clip = AudioSystem.getClip()) {
                        clip.open(AudioSystem.getAudioInputStream(Sound));
                        clip.start();
                        Thread.sleep(clip.getMicrosecondLength()/1000);
                        clip.drain();
                        clip.close();
                    }
		}catch(IOException | InterruptedException | LineUnavailableException | UnsupportedAudioFileException e) {
		
		}
	}
}
