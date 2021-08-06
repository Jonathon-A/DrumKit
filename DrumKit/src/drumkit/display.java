package drumkit;

import java.awt.Color;
import java.awt.Font;
import sun.audio.*;
import java.io.*;
import java.time.LocalTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class display extends javax.swing.JFrame {

    public boolean record = false;
    public String fullDir = System.getProperty("user.dir") + "\\recording.txt";
    public long tim2;
    public long tim;

    public display() {
        initComponents();

        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton1.setText(null);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton2.setText(null);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton3.setText(null);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        jButton4.setText(null);
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
        jButton5.setText(null);
        jButton6.setOpaque(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setBorderPainted(false);
        jButton6.setText(null);
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        jButton7.setText(null);
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        jButton8.setText(null);
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
        jButton9.setText(null);
        jButton10.setOpaque(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setBorderPainted(false);
        jButton10.setText(null);
        jButton11.setOpaque(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setBorderPainted(false);
        jButton11.setText(null);
        jButton12.setOpaque(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setBorderPainted(false);
        jButton12.setText(null);
        jButton13.setOpaque(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setBorderPainted(false);
        jButton13.setText(null);
        jButton14.setOpaque(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setBorderPainted(false);
        jButton14.setText(null);
        jButton15.setOpaque(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setBorderPainted(false);
        jButton15.setText(null);
        jButton16.setOpaque(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setBorderPainted(false);
        jButton16.setText(null);
        jButton17.setOpaque(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setBorderPainted(false);
        jButton17.setText(null);
        jButton18.setOpaque(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setBorderPainted(false);
        jButton18.setText(null);
        jButton19.setOpaque(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setBorderPainted(false);
        jButton19.setText(null);
        jButton20.setOpaque(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setBorderPainted(false);
        jButton20.setText(null);
        jButton21.setOpaque(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setBorderPainted(false);
        jButton21.setText(null);
        jButton22.setOpaque(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setBorderPainted(false);
        jButton22.setText(null);
        jButton23.setOpaque(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setBorderPainted(false);
        jButton23.setText(null);
        jButton24.setOpaque(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setBorderPainted(false);
        jButton24.setText(null);
        jButton25.setOpaque(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setBorderPainted(false);
        jButton25.setText(null);
        jButton26.setOpaque(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setBorderPainted(false);
        jButton26.setText(null);
        jButton27.setOpaque(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setBorderPainted(false);
        jButton27.setText(null);
        jButton28.setOpaque(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setBorderPainted(false);
        jButton28.setText(null);
        jButton29.setOpaque(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setBorderPainted(false);
        jButton29.setText(null);
        jButton30.setOpaque(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setBorderPainted(false);
        jButton30.setText(null);
        jButton31.setOpaque(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setBorderPainted(false);
        jButton31.setText(null);
        jButton32.setOpaque(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setBorderPainted(false);
        jButton32.setText(null);
        jButton33.setOpaque(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setBorderPainted(false);
        jButton33.setText(null);
        Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 5, false);
        jButton34.setBackground(Color.white);
        jButton34.setBorder(roundedBorder);
        jButton34.setFont(new Font("Verdana", Font.PLAIN, 18));
        jButton34.setText("Generate Track");

        jButton35.setBackground(Color.white);
        jButton35.setBorder(roundedBorder);
        jButton35.setFont(new Font("Verdana", Font.PLAIN, 18));
        jButton35.setText("Start/Stop Recording");

        jButton36.setBackground(Color.white);
        jButton36.setBorder(roundedBorder);
        jButton36.setFont(new Font("Verdana", Font.PLAIN, 18));
        jButton36.setText("Play Recording");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(517, 517));
        getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 90, 100, 40);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 193, 90, 60);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 210, 100, 70);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 220, 30, 80);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 210, 70, 70);

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 110, 70, 70);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(200, 120, 50, 90);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(330, 90, 120, 80);

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(90, 73, 80, 20);

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(100, 130, 80, 30);

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(180, 100, 20, 50);

        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(170, 160, 30, 50);

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(180, 150, 20, 10);

        jButton14.setText("jButton14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(250, 180, 90, 30);

        jButton15.setText("jButton15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(320, 160, 10, 20);

        jButton16.setText("jButton16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(340, 170, 100, 20);

        jButton17.setText("jButton17");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(450, 110, 10, 40);

        jButton18.setText("jButton18");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(360, 83, 60, 10);

        jButton19.setText("jButton19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(320, 110, 10, 50);

        jButton20.setText("jButton20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(280, 280, 110, 70);

        jButton21.setText("jButton21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(280, 210, 10, 70);

        jButton22.setText("jButton22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(240, 210, 40, 10);

        jButton23.setText("jButton23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(240, 220, 10, 70);

        jButton24.setText("jButton24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(169, 280, 70, 30);

        jButton25.setText("jButton25");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(150, 250, 20, 50);

        jButton26.setText("jButton26");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(230, 310, 20, 60);

        jButton27.setText("jButton27");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(240, 290, 10, 20);

        jButton28.setText("jButton28");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28);
        jButton28.setBounds(110, 340, 30, 30);

        jButton29.setText("jButton29");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton29);
        jButton29.setBounds(130, 360, 30, 30);

        jButton30.setText("jButton30");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30);
        jButton30.setBounds(80, 250, 70, 10);

        jButton31.setText("jButton31");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton31);
        jButton31.setBounds(160, 200, 10, 50);

        jButton32.setText("jButton32");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32);
        jButton32.setBounds(60, 193, 10, 50);

        jButton33.setText("jButton33");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton33);
        jButton33.setBounds(90, 183, 50, 10);

        jButton34.setText("jButton34");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton34);
        jButton34.setBounds(10, 390, 240, 90);

        jButton35.setText("jButton35");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton35);
        jButton35.setBounds(260, 390, 230, 40);

        jButton36.setText("jButton36");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton36);
        jButton36.setBounds(260, 440, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drumkit/vic-firth-Mute-Pack.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 517);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Crash-Cymbal-Hit-C-www.fesliyanstudios.com.wav";
            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "0";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Hi-Hat-Closed-Hit-A1-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "1";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Snare-Drum-Hit-Level-3a-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "4";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Small-Tom-Drum-Hit-Level-5A-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "6";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Medium-Tom-Drum-Hit-Level-3B-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "5";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Bass-Drum-Hit-Level-6a-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "3";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Floor-Tom-Drum-Hit-Level-4A-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "2";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String dir = System.getProperty("user.dir") + "\\Ride-Cymbal-Crash-Hit-B-www.fesliyanstudios.com.wav";

            InputStream in = new FileInputStream(dir);
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (record == true) {
            tim = LocalTime.now().toNanoOfDay() / 1000000;
            long timdif = tim - tim2;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;
            String mystr = Long.toString(timdif) + " " + "7";

            try {
                FileWriter writeToFile = new FileWriter(fullDir, true);
                PrintWriter printToFile = new PrintWriter(writeToFile);
                printToFile.println(mystr);
                printToFile.close();
                writeToFile.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton1.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton1.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton1.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jButton2.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jButton2.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jButton2.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jButton2.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton2.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jButton2.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton5.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton5.doClick();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton5.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton4.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jButton4.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton4.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton3.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton3.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton6.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton6.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton8.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton8.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton8.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton8.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton7.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton7.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        Random rand = new Random();

        int r3 = rand.nextInt(150) + 100;
        for (int i = 0; i < r3; i++) {

            int r1 = 150;
            int r2 = rand.nextInt(11);
            try {
                Thread.sleep(r1);
            } catch (InterruptedException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (r2 == 0) {
                jButton1.doClick(); //crash

            }
            if (r2 == 1) {
                jButton2.doClick(); //hi hat

            }
            if (r2 == 8) {
                jButton5.doClick();

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
                }
                jButton7.doClick();

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
                }
                jButton1.doClick();

            }
            if (r2 == 2) {
                jButton3.doClick(); //floor

            }
            if (r2 == 9) {
                jButton4.doClick();

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

                }
                jButton2.doClick(); //hi hat

            }
            if (r2 == 3) {
                jButton4.doClick(); //bass

            }
            if (r2 == 4) {
                jButton5.doClick(); //snare

            }
            if (r2 == 10) {
                jButton2.doClick();

                try {
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

                }
                jButton5.doClick();

            }
            if (r2 == 5) {
                jButton6.doClick(); //mid tom

            }

            if (r2 == 6) {
                jButton7.doClick(); //small tom

            }

            if (r2 == 7) {
                jButton8.doClick(); //ride

            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

            }
            jButton4.doClick();

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

            }
            jButton2.doClick(); //hi hat

            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (record == true) {
            record = false;
        }
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDir));
            while ((inputLine = read.readLine()) != null) {

                String[] parts = inputLine.split(" ");
                String part1 = parts[0];
                String part2 = parts[1];
                int r2 = Integer.valueOf(part2);
                int part1int = Integer.valueOf(part1);

                try {
                    Thread.sleep(part1int);
                } catch (InterruptedException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);

                }

                if (r2 == 0) {
                    jButton1.doClick(); //crash

                }
                if (r2 == 1) {
                    jButton2.doClick(); //hi hat
                }

                if (r2 == 2) {
                    jButton3.doClick(); //floor
                }

                if (r2 == 3) {
                    jButton4.doClick(); //bass
                }
                if (r2 == 4) {
                    jButton5.doClick(); //snare
                }

                if (r2 == 5) {
                    jButton6.doClick(); //mid tom
                }

                if (r2 == 6) {
                    jButton7.doClick(); //small tom
                }

                if (r2 == 7) {
                    jButton8.doClick(); //ride
                }

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

        if (record == false) {
            record = true;
            tim2 = LocalTime.now().toNanoOfDay() / 1000000;

            try {
                File file = new File(fullDir);
                FileOutputStream fooStream = new FileOutputStream(file, false);

                fooStream.write("".getBytes());
                fooStream.close();
            } catch (Exception e) {

            }

        } else {

            if (record == true) {
                record = false;
            }
        }

    }//GEN-LAST:event_jButton35ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
