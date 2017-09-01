import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {

	private static final String FILENAME = "/home/osgdev/Desktop/tt.1";

	public static void main(String[] args) {

		BufferedReader br = null,br1=null;
		FileReader fr = null,fr1=null;
int ctr=0;
		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine,s1,s="";

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println("");
				//s=s+sCurrentLine+'\n';
				++ctr;
				//s=s+sCurrentLine+'\n';
			}
		
			System.out.println("ctr="+ctr);
			//System.out.println(s);
			String[] str=new String[ctr];
			ctr=0;str[0]="dfh";
			System.out.println(str[0]);
			fr1 = new FileReader(FILENAME);
			br1 = new BufferedReader(fr1);
			while ((s1 = br1.readLine()) != null) {
				//System.out.println("11");
				s=s+sCurrentLine;
				str[ctr]=s;
				s="";
				//System.out.println(sCurrentLine);
				ctr++;
				//s=s+sCurrentLine+'\n';
			}
			System.out.println(str[0]);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
				if (br1 != null)
					br.close();

				if (fr1 != null)
					fr.close();


			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}