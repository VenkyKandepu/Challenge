import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.print.DocFlavor.STRING;



public class CalcDeptWiseAmount {

	public static void main(String[] args) throws IOException {
		try {
			FileReader in = new FileReader(new File("testData1.csv"));
			BufferedReader br = new BufferedReader(in);
			String data = null;
			String[][] array = new String[5][3];
			int i=0;
			String[][] finalData = new String[2][2];
			while((data = br.readLine()) != null){
				int j=0;
				String[] dataElements = data.split("\\,");
				for(String element:dataElements){
					array[i][j] = element;
					
					j++;
				}
				i++;
			}
			int count =0;
			for(i=0;i<5;i++){
				for(int j=0;j<3;j++){
					if(array[i][1].contentEquals(array[i][j])){
						count = count+ Integer.parseInt(array[i][2]);
						System.out.println(count);
					}
				}
			}
			System.out.println(array);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
