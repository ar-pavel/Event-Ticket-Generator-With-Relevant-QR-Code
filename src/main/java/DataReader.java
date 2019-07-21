
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reckless
 */
public class DataReader {

    private static List<Contestant> contestants;

    DataReader() {
        System.out.println(new File("Ticket.png").getAbsoluteFile());
        System.out.println(new File("ticketing.regular.ttf").getAbsoluteFile());

        contestants = new ArrayList();
        try {
            URL url = new URL("https://docs.google.com/spreadsheets/d/1iXAxOUPFj2UvpHf6FHf-32HqOr4Hs8fNPFMqTxcGu0M/edit?usp=sharing");
           // BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
            RandomAccessFile input = new RandomAccessFile("/home/reckless/Documents/SEU Intra-University Programming Contest 2019 Participation Form.csv", "r");
            //RandomAccessFile input = new RandomAccessFile("SEU Intra-University Programming Contest 2019.csv", "r");
            String element;
            boolean first = true;
            while (true) {
                element = input.readLine();
                if (element == null)    break;
                if(first){
                    first = false;
                    continue;
                }

                //    System.out.println(element);
                String[] attributes = element.split(",");

                contestants.add(createContestant(attributes));

            }
        } catch (FileNotFoundException e) {
            System.err.println("File could not be found!");
        } catch (IOException e) {
            System.err.println("File could not be accessed!");
        }

        /*
      for(Contestant contestant: contestants)
            System.out.println(contestant);
         */

    }

    public static List<Contestant> getData() {
        return contestants;
    }

    private static Contestant createContestant(String[] attributes) {
        System.out.println(attributes[0]+attributes[1]+attributes[2]+attributes[3]+attributes[4]+attributes[5]+attributes[6]+attributes[7]+attributes[8]);
        return new Contestant(attributes[0].replace("\"", ""), attributes[1].replace("\"", ""), attributes[2].replace("\"", ""), attributes[3].replace("\"", ""), attributes[4].replace("\"", ""), attributes[5].replace("\"", ""), attributes[6].replace("\"", ""), attributes[7].replace("\"", ""), attributes[8].replace("\"", ""));
    }

}
