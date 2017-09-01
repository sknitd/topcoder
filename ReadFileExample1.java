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
			//System.out.println(str[0]);
			fr1 = new FileReader(FILENAME);
			br1 = new BufferedReader(fr1);
			while ((s1 = br1.readLine()) != null) {
				//System.out.println("11");
				s=s+s1;
				str[ctr]=s;
				s="";
				//System.out.println(sCurrentLine);
				ctr++;
				//s=s+sCurrentLine+'\n';
			}
			String st[]=str[1].split(",");
			String st1[] = null;
			String st2[][]=new String[ctr][500];
			ctr=0;
			for(String c:str)
			{
				st1=c.split(",");
				st2[ctr++]=st1;
			}
			try {
				System.out.println(st2[0][1]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("null");
			}
			

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