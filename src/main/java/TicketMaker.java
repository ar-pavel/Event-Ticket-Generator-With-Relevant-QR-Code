
import com.google.zxing.WriterException;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author reckless
 */
public class TicketMaker {

    private BufferedImage createImageFromBytes(byte[] imageData) {
        ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
        try {
            return ImageIO.read(bais);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void doIt(Contestant contestant) {
        String text = "SEU Intra-Uni Programming Contest2K19.";

        try {

//            BufferedImage img = ImageIO.read(new File("/home/reckless/Downloads/Test/TicketM.png"));
            BufferedImage img = ImageIO.read(new File("Ticket.png"));
            byte[] qrCodeImageArray = QRCodeGenerator.getQRCodeImageArray(contestant.toString());
            BufferedImage qr = createImageFromBytes(qrCodeImageArray);

            int width = img.getWidth();
            int height = img.getHeight();

            // System.out.println(width + " " + height);
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            Graphics2D g2d = bufferedImage.createGraphics();
            Font ticket = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("ticketing.regular.ttf"));

            ticket.deriveFont(Font.PLAIN,120);

            Font font = new Font("Ticketing", Font.PLAIN, 120);


            System.out.println(ticket);
            System.out.println(ticket);


            g2d.setFont(font);
            g2d.setColor(Color.DARK_GRAY);
            g2d.drawImage(img, 0, 0, null);

            g2d.drawImage(qr, 4350, 900, null);

          //  g2d.drawString(text, 1800, 400);
            g2d.drawString(contestant.getName(), 1550, 400);
            g2d.drawString(contestant.getId(), 1550, 800);
            g2d.drawString(contestant.getBatch(), 1550, 1100);
            g2d.drawString(contestant.getCatagory(), 1550, 1400);
            g2d.dispose();

            File file = new File("/home/reckless/Downloads/Test/" + contestant.getId());
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException ex) {
            Logger.getLogger(TicketMaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

}
