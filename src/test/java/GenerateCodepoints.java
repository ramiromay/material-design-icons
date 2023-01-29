import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenerateCodepoints
{
    //10k e951
    //WIFI('\uE63E'),
    public static void main(String[] args)
    {
        String line;
        String[] nameCode;
        StringBuilder concatenation = new StringBuilder();

        try(InputStream inputStream = new BufferedInputStream(Files
                .newInputStream(Paths.get("src/main/resources/text/CODEPOINTS.txt"))))
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            FileWriter write = new FileWriter("src/main/resources/text/code-points.txt");
            while((line = reader.readLine()) != null)
            {
                nameCode = line.split(" ");
                System.out.println(nameCode[0] + " - "+ nameCode[1] + " -> " + nameCode.length );
                char [] chars = nameCode[0].toCharArray();
                if(chars[0] == '0' || chars[0] == '1' || chars[0] == '2'
                    || chars[0] == '3' || chars[0] == '4' || chars[0] == '5'
                        || chars[0] == '6' || chars[0] == '7' || chars[0] == '8' || chars[0] == '9')
                {
                    concatenation.append("_");
                }
                concatenation.append(nameCode[0].toUpperCase()).append("('\\u")
                        .append(nameCode[1].toUpperCase()).append("'),\n");
                write.write(concatenation.toString());
                concatenation.setLength(0);
            }
            reader.close();
            write.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
