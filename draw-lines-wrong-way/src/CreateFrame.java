import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.util.Scanner;

public class CreateFrame extends JFrame {
  // create varaibles
  static int x1;
  static int y1;
  static int x2;
  static int y2;

  // settings for frame & add event listener
  public CreateFrame() {
    this.setTitle("App - Tomiis");
    this.setSize(720, 480);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(true);
    this.getContentPane().setBackground(new Color(150, 150, 180));

    this.addMouseListener(new MouseAdapter() {
      @Override 
      public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
      }
      public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();

        try {
          FileWriter myWriter = new FileWriter("data.txt");
          myWriter.write(x1 + "," + y1 + "," + x2 + "," + y2 + "");
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException ex) {
          System.out.println(ex);
        }

        System.out.println(x1 + "," + y1 + " || " + x2 + "," + y2);
      }
    });
  }

  // draw line from x1, y1, x2, y2
  void drawLines(Graphics g) {
    byte width = 5;

    Graphics2D g2 = (Graphics2D) g;
    
    // line settings
    g2.setStroke(new BasicStroke(width));
    g2.setColor(new Color(255, 0, 255));
    
    Line2D line = new Line2D.Float(x1, y1, x2, y2);
    
    g2.draw(line);
  }

  // draw line
  public void paint(Graphics g) {
    super.paint(g);
    drawLines(g);
  }

  public static void main(String[] args) {
    // create file if it's not created
    try {
      File myObj = new File("data.txt");
      if (myObj.createNewFile()) {
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException ex) {
      System.out.println(ex);
    }

    // read file and set x1, y1, x2, y2 from data.txt
    try {
      File myObj = new File("data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] position = data.split(",");
        x1 = Integer.parseInt(position[0]);
        y1 = Integer.parseInt(position[1]);
        x2 = Integer.parseInt(position[2]);
        y2 = Integer.parseInt(position[3]);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    
    // create frame
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new CreateFrame().setVisible(true);
      }
    });
  }
}
