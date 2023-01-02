import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GUI {

        public GUI() throws FileNotFoundException {
                // title
                JLabel label = new JLabel();
                label.setText("Brilliant Boba");
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.TOP);
                label.setForeground(new Color(0, 0, 0));
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 69));
                label.setVerticalAlignment(JLabel.TOP);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBounds(250, 0, 500, 200);

                // instructions
                JLabel label1 = new JLabel();
                label1.setText("Welcome to Brilliant Boba! Search for ");
                label1.setHorizontalTextPosition(JLabel.CENTER);
                label1.setVerticalTextPosition(JLabel.TOP);
                label1.setForeground(new Color(0, 0, 0));
                label1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
                label1.setVerticalAlignment(JLabel.TOP);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setBounds(250, 100, 500, 200);

                JLabel label2 = new JLabel();
                label2.setText("boba places near UT Austin that");
                label2.setHorizontalTextPosition(JLabel.CENTER);
                label2.setVerticalTextPosition(JLabel.TOP);
                label2.setForeground(new Color(0, 0, 0));
                label2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
                label2.setVerticalAlignment(JLabel.TOP);
                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setBounds(250, 135, 500, 200);

                JLabel label3 = new JLabel();
                label3.setText("meet your preferences!");
                label3.setHorizontalTextPosition(JLabel.CENTER);
                label3.setVerticalTextPosition(JLabel.TOP);
                label3.setForeground(new Color(0, 0, 0));
                label3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
                label3.setVerticalAlignment(JLabel.TOP);
                label3.setHorizontalAlignment(JLabel.CENTER);
                label3.setBounds(250, 170, 500, 200);

                JLabel label4 = new JLabel();
                label4.setText("Min Price:");
                label4.setHorizontalTextPosition(JLabel.CENTER);
                label4.setVerticalTextPosition(JLabel.TOP);
                label4.setForeground(new Color(0, 0, 0));
                label4.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label4.setVerticalAlignment(JLabel.TOP);
                label4.setHorizontalAlignment(JLabel.CENTER);
                label4.setBounds(65, 275, 500, 200);

                JLabel label5 = new JLabel();
                label5.setText("Max Price:");
                label5.setHorizontalTextPosition(JLabel.CENTER);
                label5.setVerticalTextPosition(JLabel.TOP);
                label5.setForeground(new Color(0, 0, 0));
                label5.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label5.setVerticalAlignment(JLabel.TOP);
                label5.setHorizontalAlignment(JLabel.CENTER);
                label5.setBounds(270, 275, 500, 200);

                JLabel label6 = new JLabel();
                label6.setText("Non-dairy options?");
                label6.setHorizontalTextPosition(JLabel.CENTER);
                label6.setVerticalTextPosition(JLabel.TOP);
                label6.setForeground(new Color(0, 0, 0));
                label6.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label6.setVerticalAlignment(JLabel.TOP);
                label6.setHorizontalAlignment(JLabel.CENTER);
                label6.setBounds(47, 315, 500, 200);

                JLabel lablel7 = new JLabel();
                lablel7.setText("Min Rating:");
                lablel7.setHorizontalTextPosition(JLabel.CENTER);
                lablel7.setVerticalTextPosition(JLabel.TOP);
                lablel7.setForeground(new Color(0, 0, 0));
                lablel7.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                lablel7.setVerticalAlignment(JLabel.TOP);
                lablel7.setHorizontalAlignment(JLabel.CENTER);
                lablel7.setBounds(270, 315, 500, 200);

                JLabel label8 = new JLabel();
                label8.setText("Non-caffeine options?");
                label8.setHorizontalTextPosition(JLabel.CENTER);
                label8.setVerticalTextPosition(JLabel.TOP);
                label8.setForeground(new Color(0, 0, 0));
                label8.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label8.setVerticalAlignment(JLabel.TOP);
                label8.setHorizontalAlignment(JLabel.CENTER);
                label8.setBounds(44, 353, 500, 200);

                JLabel label9 = new JLabel();
                label9.setText("Click here to search!");
                label9.setHorizontalTextPosition(JLabel.CENTER);
                label9.setVerticalTextPosition(JLabel.TOP);
                label9.setForeground(new Color(0, 0, 0));
                label9.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label9.setVerticalAlignment(JLabel.TOP);
                label9.setHorizontalAlignment(JLabel.CENTER);
                label9.setBounds(120, 428, 500, 200);

                JLabel label10 = new JLabel();
                label10.setHorizontalTextPosition(JLabel.CENTER);
                label10.setVerticalTextPosition(JLabel.TOP);
                label10.setForeground(new Color(0, 0, 0));
                label10.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                label10.setVerticalAlignment(JLabel.TOP);
                label10.setHorizontalAlignment(JLabel.CENTER);
                label10.setBounds(150, 450, 500, 200);

                //inputs
                JTextField inp = new JTextField();
                inp.setBounds(50, 100, 70, 30);
                inp.setLocation(375, 270);

                JTextField inp1 = new JTextField();
                inp1.setBounds(50, 100, 70, 30);
                inp1.setLocation(575, 270);

                JTextField inp2 = new JTextField();
                inp2.setBounds(50, 100, 70, 30);
                inp2.setLocation(375, 310);

                JTextField inp3 = new JTextField();
                inp3.setBounds(50, 100, 70, 30);
                inp3.setLocation(575, 310);

                JTextField inp4 = new JTextField();
                inp4.setBounds(50, 100, 70, 30);
                inp4.setLocation(375, 350);

                JButton but = new JButton();
                but.setSize(17, 17);
                but.setLocation(470, 430);


                // frame
                JFrame frame = new JFrame();
                frame.setTitle("Brilliant Boba");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000, 700);
                frame.setResizable(false);
                frame.setLayout(null);
                frame.setVisible(true);
                frame.getContentPane().setBackground(new Color(199, 178, 137));

                // setup
                frame.add(label);
                frame.add(label1);
                frame.add(label2);
                frame.add(label3);
                frame.add(inp);
                frame.add(label4);
                frame.add(label5);
                frame.add(inp1);
                frame.add(label6);
                frame.add(inp2);
                frame.add(lablel7);
                frame.add(inp3);
                frame.add(label8);
                frame.add(inp4);
                frame.add(but);
                frame.add(label9);

                File file = new File("final.txt");
                Scanner sc = new Scanner(file);
                sc.useDelimiter("[|]");
                ArrayList<Store> allS = new ArrayList<>();
                while (sc.hasNext()) {
                        String name = sc.next();
                        if (!sc.hasNext()) {
                                break;
                        }
                        Double min = Double.parseDouble(sc.next());
                        if (!sc.hasNext()) {
                                break;
                        }
                        Double max = Double.parseDouble(sc.next());
                        if (!sc.hasNext()) {
                                break;
                        }
                        Double rating = Double.parseDouble(sc.next());
                        if (!sc.hasNext()) {
                                break;
                        }
                        boolean caff;
                        boolean dairy;
                        String dec = sc.next();
                        if (!sc.hasNext()) {
                                break;
                        }
                        caff = dec.equals("Y") ? true : false;
                        dec = sc.next();
                        if (!sc.hasNext()) {
                                break;
                        }
                        dairy = dec.equals("Y") ? true : false;
                        allS.add(new Store(name, rating, min, max, dairy, caff));
//                        for (int i = 0; i < 6; i ++) {
//                                System.out.println(sc.next());
//                        }
                }

                but.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if(((JButton) e.getSource()) == but) {
                                        ArrayList<Store> temp = (ArrayList<Store>) allS.clone();
                                        boolean o = true;
                                        boolean o1 = true;
                                        boolean o2 = true;
                                        boolean o3 = true;
                                        boolean o4 = true;
                                        double mi = 0;
                                        try {
                                                mi = Double.parseDouble(inp.getText());
                                        } catch(Exception NumberFormatException) {
                                                o = false;
                                        }
                                        double ma = 0;
                                        try {
                                                ma = Double.parseDouble(inp1.getText());
                                        } catch(Exception NumberFormatException) {
                                                o1 = false;
                                        }
                                        String da = inp2.getText();
                                        double r = 0;
                                        try {
                                                r = Double.parseDouble(inp3.getText());
                                        } catch (Exception NumberFormatException) {
                                                o2 = false;
                                        }
                                        String c = inp4.getText();
//                                        System.out.println(temp);
                                        for (int i = 0; i < temp.size(); i++) {
                                                Store cUr = temp.get(i);
                                                if (o && mi > cUr.maxCost) {
                                                        temp.remove(i);
                                                        i--;
//                                                        System.out.println("mh");
                                                } else if (o1 && ma < cUr.minCost) {
                                                        temp.remove(i);
                                                        i--;
//                                                        System.out.println("msh");
                                                } else if ((da.toLowerCase().contains("y") && !cUr.dairyOpts) ||
                                                da.toLowerCase().contains("n") && cUr.dairyOpts) {
                                                        temp.remove(i);
                                                        i--;
//                                                        System.out.println("mhw");
                                                } else if ((c.toLowerCase().contains("y") && !cUr.dairyOpts) ||
                                                        c.toLowerCase().contains("n") && cUr.dairyOpts) {
                                                        temp.remove(i);
                                                        i--;
//                                                        System.out.println("mqh");
                                                } else if (o2 && cUr.rating < r) {
                                                        temp.remove(i);
                                                        i--;
//                                                        System.out.println("mhd");
                                                }
                                        }
                                        if (temp.size() == 0) {
                                                label10.setText("No places that match.");
                                        } else {
                                                label10.setText("Try " + temp.get(0).name);
                                        }
//                                        System.out.println("hi");
                                        label10.setHorizontalTextPosition(JLabel.CENTER);
                                        label10.setVerticalTextPosition(JLabel.TOP);
                                        label10.setForeground(new Color(0, 0, 0));
                                        label10.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
                                        label10.setVerticalAlignment(JLabel.TOP);
                                        label10.setHorizontalAlignment(JLabel.CENTER);
                                        label10.setBounds(150, 450, 500, 200);
                                        frame.add(label10);
//                                        System.out.println("hm");
                                }
                        }
                });

        }


}