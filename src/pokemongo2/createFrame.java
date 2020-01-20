package pokemongo2;

import java.awt.*;
import javax.swing.*;

public class createFrame {
    public void createNewFrame(){
        JFrame frame = new JFrame("PokemonGO");
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(230,340);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int x = (dim.width/2)-(frame.getWidth()/2);
        int y = (dim.height/2)-(frame.getHeight()/2);
        frame.setLocation(x, y);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JTextArea textArea = new JTextArea(3,10);
        textArea.setEditable(false);
        
        ImageIcon image = new ImageIcon(getClass().getResource("gameover.png"));
        JLabel label = new JLabel(image);
        panel.add(label,BorderLayout.NORTH);
        panel.add(textArea,BorderLayout.SOUTH);
        
        /*if(NewJFrame.player1score > NewJFrame.player2score){
            textArea.append("Player 1 score is: " + NewJFrame.player1score + "\n");
            textArea.append("Player 2 score is: " + NewJFrame.player2score + "\n");
            textArea.append("Game Over! " + "\n" + "Player 1 is winner!" );
        }else if(NewJFrame.player2score > NewJFrame.player1score){
            textArea.append("Player 1 score is: " + NewJFrame.player1score + "\n");
            textArea.append("Player 2 score is: " + NewJFrame.player2score + "\n");
            textArea.append("Game Over! " + "\n" + "Player 2 is winner!" );
        }else
            textArea.append("Game Over!" + "\n" +"Game has ben draw");*/
        
        frame.add(panel);
    }
}
