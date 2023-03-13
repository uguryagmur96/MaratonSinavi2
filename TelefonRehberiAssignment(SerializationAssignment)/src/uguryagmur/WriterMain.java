package uguryagmur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {

	public static void main(String[] args) {
		// Buffered writer ile rehber txt yi oluşturdum. True olarak oluşturmamla birlikte verileri üstüne yazmak yerine
		// yeni girdiğim verileri text e ekleyerek devam edecek. 
		
		try (BufferedWriter writer= new BufferedWriter(new FileWriter("rehber.txt",true))) {
			
			writer.write("Ali Kaya; Ankara; 3123334455\n");
			writer.write("Seher Özkan; İstanbul; 2123236577\n");
			writer.write("Ahmet Genç; İzmir; 2162223344\n");
			writer.write("Ali Öncü; Ankara; 5353222288\n");
			
		} catch (IOException e) {
			System.out.println("File writing error!");
			e.printStackTrace();
		}
		
		System.out.println("Writing process is done!");

	}

}
