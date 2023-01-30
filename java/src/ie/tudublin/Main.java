package ie.tudublin;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public class PlayMusic{
	public static void main(String[] args){
		
		
		String filepath = "OOP-2023/data/Test2.wav";
		playMusic(filepath);
		helloProcessing();
		JOptionPane.showMessageDialog(null, "Press ok button to stop the music");
		

		
	}

	}
	private static void playMusic(String location) {

		try{
			File musicPath = new File(location);

			if(musicPath.exists())
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			}
			else
			{
				System.out.println("Cant find file");
			}




		} 
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
	
	
	