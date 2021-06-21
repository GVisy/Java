import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(650,250);
        setSize(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton firstButton=new JButton("EXIT");
        ActionListener listener=new CloseActionListener();
        firstButton.addActionListener(listener);

        JButton secondButton=new JButton("Вторая кнопка");
        ActionListener secondListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        secondButton.addActionListener(secondListener);

        JPanel panel=new JPanel(new GridLayout(1,2));
        panel.add(firstButton);
        panel.add(secondButton);

        add(panel,BorderLayout.SOUTH);
    }
}
