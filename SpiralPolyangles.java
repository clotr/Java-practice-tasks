import java.util.ArrayList;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SpiralPolyangles {
  public static void mainDraw(Graphics graphics) {
    int d = 8;
    int[][] polyangle = {{0, 0}, {640, 0}, {640, 640}, {0, 640}};
    drawLines(fillCoord(polyangle, d), graphics);

  }

  private static void drawLines(int[][] coordsArray, Graphics graphics) {
    for (int i = 0; i < coordsArray.length - 1; i++) {
      graphics.drawLine(coordsArray[i][0], coordsArray[i][1], coordsArray[i + 1][0],
          coordsArray[i + 1][1]);
    }
  }

  private static int[][] fillCoord(int[][] polyAngle, int d) {
    ArrayList<Integer> xCoords = new ArrayList<Integer>();
    ArrayList<Integer> yCoords = new ArrayList<Integer>();
    for (int i = 0; i < polyAngle.length; i++) {
      xCoords.add(i, polyAngle[i][0]);
      yCoords.add(i, polyAngle[i][1]);
      if (i == polyAngle.length - 1) {
        xCoords.add(i + 1, polyAngle[0][0]);
        yCoords.add(i + 1, polyAngle[0][1]);
      }
    }
    int i = polyAngle.length + 1;
    double k;
    double distance;
    int x1, x2, y1, y2;
    do {
      x1 = xCoords.get(i - (polyAngle.length - 1));
      x2 = xCoords.get(i - polyAngle.length);
      y1 = yCoords.get(i - (polyAngle.length - 1));
      y2 = yCoords.get(i - polyAngle.length);

      distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      k = d / (distance - d);
      xCoords.add(i, (int) ((x2 + k * x1) / (1 + k)));
      yCoords.add(i, (int) ((y2 + k * y1) / (1 + k)));
      i++;
    } while (distance >= d);


    int[][] coordsArray = new int[xCoords.size()][2];
    for (int j = 0; j < xCoords.size(); j++) {
      coordsArray[j][0] = xCoords.get(j);
      coordsArray[j][1] = yCoords.get(j);
    }
    return coordsArray;
  }

  static int WIDTH = 640;
  static int HEIGHT = 640;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
