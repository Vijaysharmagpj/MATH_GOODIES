
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class TTD_OR_GATE extends javax.swing.JFrame {

    /**
     * Creates new form TTD_OR_GATE
     */
    public TTD_OR_GATE() {
        initComponents();
        
        setVisible(true);
        setResizable(false);
        setTitle("OR GATE TRUTH TABLE");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/5-this.getSize().height/5);
    
        
        A1.setVisible(false);B1.setVisible(false);C1.setVisible(false);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(false);
        A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
        
        R_1.setVisible(false);R_2.setVisible(false);R_3.setVisible(false);R_4.setVisible(false);
        R_5.setVisible(false);R_6.setVisible(false);R_7.setVisible(false);R_8.setVisible(false);
        R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
        R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
        R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
        R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
        R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
        R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);
        
        M1_1.setVisible(false);M1_2.setVisible(false);M1_3.setVisible(false);M1_4.setVisible(false);M1_5.setVisible(false);
        M2_1.setVisible(false);M2_2.setVisible(false);M2_3.setVisible(false);M2_4.setVisible(false);M2_5.setVisible(false);
        M3_1.setVisible(false);M3_2.setVisible(false);M3_3.setVisible(false);M3_4.setVisible(false);M3_5.setVisible(false);
        M4_1.setVisible(false);M4_2.setVisible(false);M4_3.setVisible(false);M4_4.setVisible(false);M4_5.setVisible(false);
        M5_1.setVisible(false);M5_2.setVisible(false);M5_3.setVisible(false);M5_4.setVisible(false);M5_5.setVisible(false);
        M6_1.setVisible(false);M6_2.setVisible(false);M6_3.setVisible(false);M6_4.setVisible(false);M6_5.setVisible(false);
        M7_1.setVisible(false);M7_2.setVisible(false);M7_3.setVisible(false);M7_4.setVisible(false);M7_5.setVisible(false);
        M8_1.setVisible(false);M8_2.setVisible(false);M8_3.setVisible(false);M8_4.setVisible(false);M8_5.setVisible(false);
        M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
        M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
        M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
        M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
        M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
        M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
        M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
        M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
        M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
        M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
        M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
        M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
        M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
        M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
        M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
        M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
        M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
        M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
        M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
        M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
        M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
        M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
        M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
        M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        TTD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        OR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Number_Of_Variable = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        Result1 = new javax.swing.JLabel();
        M1_1 = new javax.swing.JLabel();
        M1_2 = new javax.swing.JLabel();
        M1_3 = new javax.swing.JLabel();
        M1_4 = new javax.swing.JLabel();
        M1_5 = new javax.swing.JLabel();
        R_1 = new javax.swing.JLabel();
        M2_1 = new javax.swing.JLabel();
        M3_1 = new javax.swing.JLabel();
        M3_2 = new javax.swing.JLabel();
        M2_2 = new javax.swing.JLabel();
        M2_3 = new javax.swing.JLabel();
        M3_3 = new javax.swing.JLabel();
        M2_4 = new javax.swing.JLabel();
        M3_4 = new javax.swing.JLabel();
        M2_5 = new javax.swing.JLabel();
        M3_5 = new javax.swing.JLabel();
        R_2 = new javax.swing.JLabel();
        R_3 = new javax.swing.JLabel();
        M6_4 = new javax.swing.JLabel();
        M7_3 = new javax.swing.JLabel();
        M6_3 = new javax.swing.JLabel();
        M6_5 = new javax.swing.JLabel();
        M6_1 = new javax.swing.JLabel();
        R_7 = new javax.swing.JLabel();
        R_6 = new javax.swing.JLabel();
        M7_5 = new javax.swing.JLabel();
        M6_2 = new javax.swing.JLabel();
        M7_4 = new javax.swing.JLabel();
        M7_2 = new javax.swing.JLabel();
        M7_1 = new javax.swing.JLabel();
        M5_1 = new javax.swing.JLabel();
        M4_1 = new javax.swing.JLabel();
        M4_2 = new javax.swing.JLabel();
        M5_2 = new javax.swing.JLabel();
        M4_3 = new javax.swing.JLabel();
        M5_3 = new javax.swing.JLabel();
        M4_4 = new javax.swing.JLabel();
        M5_4 = new javax.swing.JLabel();
        M5_5 = new javax.swing.JLabel();
        M4_5 = new javax.swing.JLabel();
        R_4 = new javax.swing.JLabel();
        R_5 = new javax.swing.JLabel();
        M15_1 = new javax.swing.JLabel();
        M14_1 = new javax.swing.JLabel();
        M13_1 = new javax.swing.JLabel();
        M12_1 = new javax.swing.JLabel();
        M11_1 = new javax.swing.JLabel();
        M10_1 = new javax.swing.JLabel();
        M9_1 = new javax.swing.JLabel();
        M8_1 = new javax.swing.JLabel();
        M8_2 = new javax.swing.JLabel();
        M9_2 = new javax.swing.JLabel();
        M10_2 = new javax.swing.JLabel();
        M11_2 = new javax.swing.JLabel();
        M12_2 = new javax.swing.JLabel();
        M13_2 = new javax.swing.JLabel();
        M14_2 = new javax.swing.JLabel();
        M15_2 = new javax.swing.JLabel();
        M15_3 = new javax.swing.JLabel();
        M14_3 = new javax.swing.JLabel();
        M13_3 = new javax.swing.JLabel();
        M12_3 = new javax.swing.JLabel();
        M11_3 = new javax.swing.JLabel();
        M10_3 = new javax.swing.JLabel();
        M9_3 = new javax.swing.JLabel();
        M8_3 = new javax.swing.JLabel();
        M8_4 = new javax.swing.JLabel();
        M8_5 = new javax.swing.JLabel();
        R_8 = new javax.swing.JLabel();
        R_9 = new javax.swing.JLabel();
        M9_5 = new javax.swing.JLabel();
        M9_4 = new javax.swing.JLabel();
        M10_4 = new javax.swing.JLabel();
        M11_4 = new javax.swing.JLabel();
        M12_4 = new javax.swing.JLabel();
        M13_4 = new javax.swing.JLabel();
        M14_4 = new javax.swing.JLabel();
        M15_4 = new javax.swing.JLabel();
        M15_5 = new javax.swing.JLabel();
        M14_5 = new javax.swing.JLabel();
        M13_5 = new javax.swing.JLabel();
        M12_5 = new javax.swing.JLabel();
        M11_5 = new javax.swing.JLabel();
        M10_5 = new javax.swing.JLabel();
        R_10 = new javax.swing.JLabel();
        R_11 = new javax.swing.JLabel();
        R_12 = new javax.swing.JLabel();
        R_13 = new javax.swing.JLabel();
        R_14 = new javax.swing.JLabel();
        R_15 = new javax.swing.JLabel();
        M28_2 = new javax.swing.JLabel();
        M31_1 = new javax.swing.JLabel();
        M24_3 = new javax.swing.JLabel();
        R_27 = new javax.swing.JLabel();
        M25_3 = new javax.swing.JLabel();
        M28_5 = new javax.swing.JLabel();
        M25_4 = new javax.swing.JLabel();
        M27_2 = new javax.swing.JLabel();
        M31_5 = new javax.swing.JLabel();
        M28_4 = new javax.swing.JLabel();
        M29_2 = new javax.swing.JLabel();
        M29_4 = new javax.swing.JLabel();
        R_24 = new javax.swing.JLabel();
        M27_4 = new javax.swing.JLabel();
        M25_2 = new javax.swing.JLabel();
        M29_1 = new javax.swing.JLabel();
        M27_3 = new javax.swing.JLabel();
        R_25 = new javax.swing.JLabel();
        R_26 = new javax.swing.JLabel();
        M26_5 = new javax.swing.JLabel();
        M31_4 = new javax.swing.JLabel();
        M26_4 = new javax.swing.JLabel();
        M26_2 = new javax.swing.JLabel();
        M24_2 = new javax.swing.JLabel();
        M24_1 = new javax.swing.JLabel();
        R_30 = new javax.swing.JLabel();
        M31_2 = new javax.swing.JLabel();
        M25_1 = new javax.swing.JLabel();
        M25_5 = new javax.swing.JLabel();
        M28_3 = new javax.swing.JLabel();
        M30_1 = new javax.swing.JLabel();
        R_31 = new javax.swing.JLabel();
        M30_2 = new javax.swing.JLabel();
        M30_4 = new javax.swing.JLabel();
        R_28 = new javax.swing.JLabel();
        M29_5 = new javax.swing.JLabel();
        R_29 = new javax.swing.JLabel();
        M28_1 = new javax.swing.JLabel();
        M30_5 = new javax.swing.JLabel();
        M26_1 = new javax.swing.JLabel();
        M27_1 = new javax.swing.JLabel();
        M27_5 = new javax.swing.JLabel();
        M30_3 = new javax.swing.JLabel();
        M24_5 = new javax.swing.JLabel();
        M29_3 = new javax.swing.JLabel();
        M26_3 = new javax.swing.JLabel();
        M31_3 = new javax.swing.JLabel();
        M24_4 = new javax.swing.JLabel();
        M23_1 = new javax.swing.JLabel();
        M22_1 = new javax.swing.JLabel();
        M21_1 = new javax.swing.JLabel();
        M20_1 = new javax.swing.JLabel();
        M19_1 = new javax.swing.JLabel();
        M18_1 = new javax.swing.JLabel();
        M17_1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        M17_2 = new javax.swing.JLabel();
        M18_2 = new javax.swing.JLabel();
        M19_2 = new javax.swing.JLabel();
        M20_2 = new javax.swing.JLabel();
        M21_2 = new javax.swing.JLabel();
        M22_2 = new javax.swing.JLabel();
        M23_2 = new javax.swing.JLabel();
        M23_3 = new javax.swing.JLabel();
        M22_3 = new javax.swing.JLabel();
        M21_3 = new javax.swing.JLabel();
        M20_3 = new javax.swing.JLabel();
        M19_3 = new javax.swing.JLabel();
        M18_3 = new javax.swing.JLabel();
        M17_3 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        Result2 = new javax.swing.JLabel();
        R_17 = new javax.swing.JLabel();
        R_18 = new javax.swing.JLabel();
        R_19 = new javax.swing.JLabel();
        R_20 = new javax.swing.JLabel();
        R_21 = new javax.swing.JLabel();
        R_22 = new javax.swing.JLabel();
        R_23 = new javax.swing.JLabel();
        M23_5 = new javax.swing.JLabel();
        M23_4 = new javax.swing.JLabel();
        M22_4 = new javax.swing.JLabel();
        M21_4 = new javax.swing.JLabel();
        M20_4 = new javax.swing.JLabel();
        M19_4 = new javax.swing.JLabel();
        M18_4 = new javax.swing.JLabel();
        M17_4 = new javax.swing.JLabel();
        M17_5 = new javax.swing.JLabel();
        M18_5 = new javax.swing.JLabel();
        M19_5 = new javax.swing.JLabel();
        M20_5 = new javax.swing.JLabel();
        M21_5 = new javax.swing.JLabel();
        M22_5 = new javax.swing.JLabel();
        M16_1 = new javax.swing.JLabel();
        M16_2 = new javax.swing.JLabel();
        M16_3 = new javax.swing.JLabel();
        M16_4 = new javax.swing.JLabel();
        M16_5 = new javax.swing.JLabel();
        R_16 = new javax.swing.JLabel();
        M32_1 = new javax.swing.JLabel();
        M32_2 = new javax.swing.JLabel();
        M32_3 = new javax.swing.JLabel();
        M32_4 = new javax.swing.JLabel();
        M32_5 = new javax.swing.JLabel();
        R_32 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        A1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OR Gate Truth Table");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Main Menu");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        TTD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TTD.setForeground(new java.awt.Color(0, 0, 102));
        TTD.setText("Truth Table Designer");
        TTD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TTD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTDActionPerformed(evt);
            }
        });
        TTD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TTDKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("OR Gate Truth Table");

        OR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OR.setForeground(new java.awt.Color(0, 0, 102));
        OR.setText("OR Gate");
        OR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORActionPerformed(evt);
            }
        });
        OR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ORKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Select number of Boolean Variable : ");

        Number_Of_Variable.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Number_Of_Variable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select no. of Boolean Variable----", "2", "3", "4", "5" }));
        Number_Of_Variable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 240), new java.awt.Color(0, 0, 240), new java.awt.Color(0, 0, 240), new java.awt.Color(0, 0, 240)));
        Number_Of_Variable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Number_Of_Variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_Of_VariableActionPerformed(evt);
            }
        });
        Number_Of_Variable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Number_Of_VariableKeyPressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/arrow.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRUTH TABLE");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        B1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        C1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        E1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        E1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        D1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Result1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Result1.setText("RESULT");
        Result1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        M1_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M1_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M1_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M1_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M1_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M1_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M2_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M3_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M3_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M2_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M2_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M3_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M2_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M3_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M2_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M2_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M3_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M3_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M6_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M6_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M7_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M7_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M7_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M6_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M6_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M6_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M6_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M6_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M6_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M7_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M7_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M7_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M6_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M6_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M7_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M7_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M7_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M7_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M7_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M7_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M7_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M7_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M7_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M5_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M5_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M4_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M4_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M5_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M5_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M4_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M5_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M5_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M4_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M5_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M5_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M5_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M5_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M4_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M4_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M15_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M15_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M15_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M14_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M14_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M14_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M13_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M13_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M13_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M12_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M12_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M12_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M11_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M11_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M11_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M10_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M10_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M10_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M9_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M9_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M8_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M8_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M8_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M8_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M8_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M8_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M9_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M9_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M10_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M10_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M10_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M11_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M11_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M11_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M12_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M12_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M12_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M13_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M13_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M13_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M14_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M14_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M14_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M15_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M15_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M15_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M15_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M15_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M15_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M14_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M14_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M14_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M13_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M13_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M13_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M12_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M12_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M12_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M11_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M11_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M11_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M10_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M10_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M10_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M9_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M9_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M8_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M8_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M8_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M8_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M8_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M8_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M8_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M8_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M8_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M9_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M9_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M9_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M9_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M10_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M10_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M10_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M11_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M11_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M11_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M12_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M12_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M12_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M13_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M13_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M13_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M14_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M14_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M14_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M15_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M15_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M15_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M15_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M15_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M15_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M14_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M14_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M14_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M13_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M13_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M13_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M12_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M12_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M12_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M11_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M11_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M11_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M10_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M10_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M10_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M28_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M28_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M28_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M31_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M31_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M31_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M24_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M24_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M24_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M25_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M25_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M25_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M28_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M28_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M28_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M25_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M25_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M25_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M27_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M27_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M27_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M31_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M31_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M31_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M28_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M28_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M28_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M29_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M29_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M29_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M29_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M29_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M29_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M27_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M27_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M27_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M25_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M25_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M25_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M29_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M29_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M29_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M27_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M27_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M27_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M26_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M26_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M26_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M31_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M31_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M31_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M26_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M26_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M26_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M26_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M26_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M26_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M24_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M24_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M24_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M24_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M24_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M24_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M31_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M31_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M31_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M25_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M25_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M25_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M25_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M25_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M25_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M28_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M28_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M28_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M30_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M30_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M30_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M30_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M30_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M30_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M30_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M30_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M30_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M29_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M29_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M29_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M28_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M28_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M28_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M30_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M30_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M30_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M26_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M26_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M26_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M27_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M27_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M27_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M27_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M27_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M27_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M30_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M30_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M30_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M24_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M24_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M24_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M29_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M29_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M29_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M26_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M26_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M26_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M31_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M31_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M31_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M24_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M24_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M24_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M23_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M23_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M23_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M22_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M22_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M22_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M21_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M21_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M21_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M20_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M20_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M20_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M19_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M19_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M19_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M18_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M18_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M18_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M17_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M17_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M17_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        B2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        M17_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M17_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M17_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M18_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M18_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M18_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M19_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M19_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M19_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M20_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M20_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M20_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M21_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M21_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M21_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M22_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M22_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M22_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M23_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M23_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M23_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M23_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M23_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M23_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M22_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M22_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M22_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M21_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M21_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M21_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M20_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M20_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M20_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M19_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M19_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M19_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M18_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M18_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M18_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M17_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M17_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M17_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        D2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        E2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        E2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Result2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Result2.setText("RESULT");
        Result2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        R_17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M23_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M23_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M23_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M23_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M23_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M23_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M22_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M22_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M22_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M21_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M21_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M21_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M20_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M20_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M20_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M19_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M19_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M19_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M18_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M18_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M18_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M17_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M17_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M17_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M17_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M17_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M17_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M18_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M18_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M18_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M19_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M19_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M19_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M20_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M20_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M20_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M21_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M21_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M21_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M22_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M22_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M22_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M16_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M16_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M16_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M16_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M16_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M16_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M16_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M16_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M16_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M16_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M16_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M16_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M16_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M16_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M16_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M32_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M32_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M32_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M32_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M32_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M32_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M32_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M32_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M32_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M32_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M32_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M32_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M32_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M32_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M32_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R_32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        R_32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setText("Generate Truth Table");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TTD))
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Number_Of_Variable, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M16_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M16_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M3_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M4_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M5_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M6_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M7_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M8_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M9_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M10_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M11_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M16_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M11_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M16_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M11_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M16_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M17_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M18_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M19_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M21_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M22_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M23_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M24_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M25_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M26_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M27_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M28_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M29_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M30_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M31_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M32_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M17_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M18_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M19_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M21_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M22_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M23_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M24_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M25_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M26_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M27_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M28_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M29_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M30_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M31_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M32_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M17_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M18_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M19_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M21_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M22_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M23_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M24_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M25_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M26_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M27_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M28_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M29_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M30_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M31_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M32_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M17_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M18_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M19_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M21_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M22_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M23_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M24_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M25_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M26_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M27_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M28_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M29_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M30_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M31_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M32_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M17_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M18_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M19_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M21_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M22_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M23_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M24_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M25_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M26_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M27_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M28_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M29_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M30_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M31_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M32_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_26, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_29, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_30, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_31, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Number_Of_Variable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M17_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M17_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M17_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M17_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M17_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M18_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M18_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M18_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M18_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M18_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M19_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M19_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M19_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M19_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M19_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M20_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M20_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M20_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M20_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M20_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M21_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M21_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M21_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M21_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M21_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M22_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M23_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M24_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M24_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M24_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M24_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M24_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M25_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M25_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M25_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M25_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M25_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M26_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M26_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M26_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M26_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M26_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M27_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M27_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M27_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M27_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M27_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M12_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M28_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M28_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M28_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M28_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M28_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M13_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M29_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M29_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M29_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M29_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M29_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M14_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M14_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M14_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M14_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M14_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M30_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M30_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M30_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M30_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M30_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M15_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M15_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M15_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M15_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M15_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M31_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M31_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M31_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M31_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M31_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M16_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M16_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M16_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M16_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M16_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32_2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32_3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32_4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M32_5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Number_Of_Variable, jButton7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MAIN_MENU obj=new MAIN_MENU();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()==10)){
            MAIN_MENU obj=new MAIN_MENU();
            obj.setVisible(true);
            CloseFrame();
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void TTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTDActionPerformed
        // TODO add your handling code here:
        Truth_Table_Designer obj=new Truth_Table_Designer();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_TTDActionPerformed

    private void TTDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TTDKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()==10)){
            Truth_Table_Designer obj=new Truth_Table_Designer();
            obj.setVisible(true);
            CloseFrame();
        }
    }//GEN-LAST:event_TTDKeyPressed

    private void ORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORActionPerformed
        // TODO add your handling code here:
        OR_GATE obj=new OR_GATE();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_ORActionPerformed

    private void ORKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ORKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()==10)){
            OR_GATE obj=new OR_GATE();
            obj.setVisible(true);
            CloseFrame();
        }
    }//GEN-LAST:event_ORKeyPressed

    private void Number_Of_VariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Of_VariableActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Number_Of_VariableActionPerformed

    private void Number_Of_VariableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number_Of_VariableKeyPressed
        // TODO add your handling code here:
         if ( ((evt.getKeyChar() == 10))){
             if(Number_Of_Variable.getSelectedItem()=="----Select no. of Boolean Variable----"){
                    JOptionPane.showMessageDialog(null,"PLEASE SELECT THE NUMBER OF BOOLEAN VARIABLE");
                }
             else{
                 if(Number_Of_Variable.getSelectedItem()=="2"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(false);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(false);R_6.setVisible(false);R_7.setVisible(false);R_8.setVisible(false);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(false);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(false);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(false);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(false);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(false);M5_2.setVisible(false);M5_3.setVisible(false);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(false);M6_2.setVisible(false);M6_3.setVisible(false);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(false);M7_2.setVisible(false);M7_3.setVisible(false);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(false);M8_2.setVisible(false);M8_3.setVisible(false);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[4][3];int n_2=2;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_two_var(n_2);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));R_1.setText(String.valueOf(truth_table[0][2]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));R_2.setText(String.valueOf(truth_table[1][2]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));R_3.setText(String.valueOf(truth_table[2][2]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));R_4.setText(String.valueOf(truth_table[3][2]));
        }
        if(Number_Of_Variable.getSelectedItem()=="3"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[8][4];int n_3=3;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_three_var(n_3);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));R_1.setText(String.valueOf(truth_table[0][3]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));R_2.setText(String.valueOf(truth_table[1][3]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));R_3.setText(String.valueOf(truth_table[2][3]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));R_4.setText(String.valueOf(truth_table[3][3]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));R_5.setText(String.valueOf(truth_table[4][3]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));R_6.setText(String.valueOf(truth_table[5][3]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));R_7.setText(String.valueOf(truth_table[6][3]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));R_8.setText(String.valueOf(truth_table[7][3]));
        }
        if(Number_Of_Variable.getSelectedItem()=="4"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(false);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(false);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(false);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(false);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(false);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(false);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(false);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(false);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[16][5];int n_4=4;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_four_var(n_4);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));R_1.setText(String.valueOf(truth_table[0][4]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));R_2.setText(String.valueOf(truth_table[1][4]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));R_3.setText(String.valueOf(truth_table[2][4]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));R_4.setText(String.valueOf(truth_table[3][4]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));R_5.setText(String.valueOf(truth_table[4][4]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));R_6.setText(String.valueOf(truth_table[5][4]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));R_7.setText(String.valueOf(truth_table[6][4]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));R_8.setText(String.valueOf(truth_table[7][4]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));R_9.setText(String.valueOf(truth_table[8][4]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));R_10.setText(String.valueOf(truth_table[9][4]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));R_11.setText(String.valueOf(truth_table[10][4]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));R_12.setText(String.valueOf(truth_table[11][4]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));R_13.setText(String.valueOf(truth_table[12][4]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));R_14.setText(String.valueOf(truth_table[13][4]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));R_15.setText(String.valueOf(truth_table[14][4]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));R_16.setText(String.valueOf(truth_table[15][4]));
        }
        if(Number_Of_Variable.getSelectedItem()=="5"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(true);Result1.setVisible(true);
            A2.setVisible(true);B2.setVisible(true);C2.setVisible(true);D2.setVisible(true);E2.setVisible(true);Result2.setVisible(true);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("R");E1.setText("R");
            A2.setText("P");B2.setText("Q");C2.setText("R");D2.setText("R");E2.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(true);R_18.setVisible(true);R_19.setVisible(true);R_20.setVisible(true);
            R_21.setVisible(true);R_22.setVisible(true);R_23.setVisible(true);R_24.setVisible(true);
            R_25.setVisible(true);R_26.setVisible(true);R_27.setVisible(true);R_28.setVisible(true);
            R_29.setVisible(true);R_30.setVisible(true);R_31.setVisible(true);R_32.setVisible(true);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(true);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(true);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(true);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(true);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(true);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(true);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(true);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(true);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(true);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(true);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(true);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(true);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(true);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(true);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(true);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(true);
            M17_1.setVisible(true);M17_2.setVisible(true);M17_3.setVisible(true);M17_4.setVisible(true);M17_5.setVisible(true);
            M18_1.setVisible(true);M18_2.setVisible(true);M18_3.setVisible(true);M18_4.setVisible(true);M18_5.setVisible(true);
            M19_1.setVisible(true);M19_2.setVisible(true);M19_3.setVisible(true);M19_4.setVisible(true);M19_5.setVisible(true);
            M20_1.setVisible(true);M20_2.setVisible(true);M20_3.setVisible(true);M20_4.setVisible(true);M20_5.setVisible(true);
            M21_1.setVisible(true);M21_2.setVisible(true);M21_3.setVisible(true);M21_4.setVisible(true);M21_5.setVisible(true);
            M22_1.setVisible(true);M22_2.setVisible(true);M22_3.setVisible(true);M22_4.setVisible(true);M22_5.setVisible(true);
            M23_1.setVisible(true);M23_2.setVisible(true);M23_3.setVisible(true);M23_4.setVisible(true);M23_5.setVisible(true);
            M24_1.setVisible(true);M24_2.setVisible(true);M24_3.setVisible(true);M24_4.setVisible(true);M24_5.setVisible(true);
            M25_1.setVisible(true);M25_2.setVisible(true);M25_3.setVisible(true);M25_4.setVisible(true);M25_5.setVisible(true);
            M26_1.setVisible(true);M26_2.setVisible(true);M26_3.setVisible(true);M26_4.setVisible(true);M26_5.setVisible(true);
            M27_1.setVisible(true);M27_2.setVisible(true);M27_3.setVisible(true);M27_4.setVisible(true);M27_5.setVisible(true);
            M28_1.setVisible(true);M28_2.setVisible(true);M28_3.setVisible(true);M28_4.setVisible(true);M28_5.setVisible(true);
            M29_1.setVisible(true);M29_2.setVisible(true);M29_3.setVisible(true);M29_4.setVisible(true);M29_5.setVisible(true);
            M30_1.setVisible(true);M30_2.setVisible(true);M30_3.setVisible(true);M30_4.setVisible(true);M30_5.setVisible(true);
            M31_1.setVisible(true);M31_2.setVisible(true);M31_3.setVisible(true);M31_4.setVisible(true);M31_5.setVisible(true);
            M32_1.setVisible(true);M32_2.setVisible(true);M32_3.setVisible(true);M32_4.setVisible(true);M32_5.setVisible(true);
            
            int [][] truth_table=new int[32][6];int n_5=5;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_five_var(n_5);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));M1_5.setText(String.valueOf(truth_table[0][4]));R_1.setText(String.valueOf(truth_table[0][5]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));M2_5.setText(String.valueOf(truth_table[1][4]));R_2.setText(String.valueOf(truth_table[1][5]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));M3_5.setText(String.valueOf(truth_table[2][4]));R_3.setText(String.valueOf(truth_table[2][5]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));M4_5.setText(String.valueOf(truth_table[3][4]));R_4.setText(String.valueOf(truth_table[3][5]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));M5_5.setText(String.valueOf(truth_table[4][4]));R_5.setText(String.valueOf(truth_table[4][5]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));M6_5.setText(String.valueOf(truth_table[5][4]));R_6.setText(String.valueOf(truth_table[5][5]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));M7_5.setText(String.valueOf(truth_table[6][4]));R_7.setText(String.valueOf(truth_table[6][5]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));M8_5.setText(String.valueOf(truth_table[7][4]));R_8.setText(String.valueOf(truth_table[7][5]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));M9_5.setText(String.valueOf(truth_table[8][4]));R_9.setText(String.valueOf(truth_table[8][5]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));M10_5.setText(String.valueOf(truth_table[9][4]));R_10.setText(String.valueOf(truth_table[9][5]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));M11_5.setText(String.valueOf(truth_table[10][4]));R_11.setText(String.valueOf(truth_table[10][5]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));M12_5.setText(String.valueOf(truth_table[11][4]));R_12.setText(String.valueOf(truth_table[11][5]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));M13_5.setText(String.valueOf(truth_table[12][4]));R_13.setText(String.valueOf(truth_table[12][5]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));M14_5.setText(String.valueOf(truth_table[13][4]));R_14.setText(String.valueOf(truth_table[13][5]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));M15_5.setText(String.valueOf(truth_table[14][4]));R_15.setText(String.valueOf(truth_table[14][5]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));M16_5.setText(String.valueOf(truth_table[15][4]));R_16.setText(String.valueOf(truth_table[15][5]));
            M17_1.setText(String.valueOf(truth_table[16][0]));M17_2.setText(String.valueOf(truth_table[16][1]));M17_3.setText(String.valueOf(truth_table[16][2]));M17_4.setText(String.valueOf(truth_table[16][3]));M17_5.setText(String.valueOf(truth_table[16][4]));R_17.setText(String.valueOf(truth_table[16][5]));
            M18_1.setText(String.valueOf(truth_table[17][0]));M18_2.setText(String.valueOf(truth_table[17][1]));M18_3.setText(String.valueOf(truth_table[17][2]));M18_4.setText(String.valueOf(truth_table[17][3]));M18_5.setText(String.valueOf(truth_table[17][4]));R_18.setText(String.valueOf(truth_table[17][5]));
            M19_1.setText(String.valueOf(truth_table[18][0]));M19_2.setText(String.valueOf(truth_table[18][1]));M19_3.setText(String.valueOf(truth_table[18][2]));M19_4.setText(String.valueOf(truth_table[18][3]));M19_5.setText(String.valueOf(truth_table[18][4]));R_19.setText(String.valueOf(truth_table[18][5]));
            M20_1.setText(String.valueOf(truth_table[19][0]));M20_2.setText(String.valueOf(truth_table[19][1]));M20_3.setText(String.valueOf(truth_table[19][2]));M20_4.setText(String.valueOf(truth_table[19][3]));M20_5.setText(String.valueOf(truth_table[19][4]));R_20.setText(String.valueOf(truth_table[19][5]));
            M21_1.setText(String.valueOf(truth_table[20][0]));M21_2.setText(String.valueOf(truth_table[20][1]));M21_3.setText(String.valueOf(truth_table[20][2]));M21_4.setText(String.valueOf(truth_table[20][3]));M21_5.setText(String.valueOf(truth_table[20][4]));R_21.setText(String.valueOf(truth_table[20][5]));
            M22_1.setText(String.valueOf(truth_table[21][0]));M22_2.setText(String.valueOf(truth_table[21][1]));M22_3.setText(String.valueOf(truth_table[21][2]));M22_4.setText(String.valueOf(truth_table[21][3]));M22_5.setText(String.valueOf(truth_table[21][4]));R_22.setText(String.valueOf(truth_table[21][5]));
            M23_1.setText(String.valueOf(truth_table[22][0]));M23_2.setText(String.valueOf(truth_table[22][1]));M23_3.setText(String.valueOf(truth_table[22][2]));M23_4.setText(String.valueOf(truth_table[22][3]));M23_5.setText(String.valueOf(truth_table[22][4]));R_23.setText(String.valueOf(truth_table[22][5]));
            M24_1.setText(String.valueOf(truth_table[23][0]));M24_2.setText(String.valueOf(truth_table[23][1]));M24_3.setText(String.valueOf(truth_table[23][2]));M24_4.setText(String.valueOf(truth_table[23][3]));M24_5.setText(String.valueOf(truth_table[23][4]));R_24.setText(String.valueOf(truth_table[23][5]));
            M25_1.setText(String.valueOf(truth_table[24][0]));M25_2.setText(String.valueOf(truth_table[24][1]));M25_3.setText(String.valueOf(truth_table[24][2]));M25_4.setText(String.valueOf(truth_table[24][3]));M25_5.setText(String.valueOf(truth_table[24][4]));R_25.setText(String.valueOf(truth_table[24][5]));
            M26_1.setText(String.valueOf(truth_table[25][0]));M26_2.setText(String.valueOf(truth_table[25][1]));M26_3.setText(String.valueOf(truth_table[25][2]));M26_4.setText(String.valueOf(truth_table[25][3]));M26_5.setText(String.valueOf(truth_table[25][4]));R_26.setText(String.valueOf(truth_table[25][5]));
            M27_1.setText(String.valueOf(truth_table[26][0]));M27_2.setText(String.valueOf(truth_table[26][1]));M27_3.setText(String.valueOf(truth_table[26][2]));M27_4.setText(String.valueOf(truth_table[26][3]));M27_5.setText(String.valueOf(truth_table[26][4]));R_27.setText(String.valueOf(truth_table[26][5]));
            M28_1.setText(String.valueOf(truth_table[27][0]));M28_2.setText(String.valueOf(truth_table[27][1]));M28_3.setText(String.valueOf(truth_table[27][2]));M28_4.setText(String.valueOf(truth_table[27][3]));M28_5.setText(String.valueOf(truth_table[27][4]));R_28.setText(String.valueOf(truth_table[27][5]));
            M29_1.setText(String.valueOf(truth_table[28][0]));M29_2.setText(String.valueOf(truth_table[28][1]));M29_3.setText(String.valueOf(truth_table[28][2]));M29_4.setText(String.valueOf(truth_table[28][3]));M29_5.setText(String.valueOf(truth_table[28][4]));R_29.setText(String.valueOf(truth_table[28][5]));
            M30_1.setText(String.valueOf(truth_table[29][0]));M30_2.setText(String.valueOf(truth_table[29][1]));M30_3.setText(String.valueOf(truth_table[29][2]));M30_4.setText(String.valueOf(truth_table[29][3]));M30_5.setText(String.valueOf(truth_table[29][4]));R_30.setText(String.valueOf(truth_table[29][5]));
            M31_1.setText(String.valueOf(truth_table[30][0]));M31_2.setText(String.valueOf(truth_table[30][1]));M31_3.setText(String.valueOf(truth_table[30][2]));M31_4.setText(String.valueOf(truth_table[30][3]));M31_5.setText(String.valueOf(truth_table[30][4]));R_31.setText(String.valueOf(truth_table[30][5]));
            M32_1.setText(String.valueOf(truth_table[31][0]));M32_2.setText(String.valueOf(truth_table[31][1]));M32_3.setText(String.valueOf(truth_table[31][2]));M32_4.setText(String.valueOf(truth_table[31][3]));M32_5.setText(String.valueOf(truth_table[31][4]));R_32.setText(String.valueOf(truth_table[31][4]));
        }
             }
         
         }
    }//GEN-LAST:event_Number_Of_VariableKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(Number_Of_Variable.getSelectedItem()=="----Select no. of Boolean Variable----"){
                    JOptionPane.showMessageDialog(null,"PLEASE SELECT THE NUMBER OF BOOLEAN VARIABLE");
                }
        else{
            if(Number_Of_Variable.getSelectedItem()=="2"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(false);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(false);R_6.setVisible(false);R_7.setVisible(false);R_8.setVisible(false);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(false);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(false);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(false);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(false);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(false);M5_2.setVisible(false);M5_3.setVisible(false);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(false);M6_2.setVisible(false);M6_3.setVisible(false);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(false);M7_2.setVisible(false);M7_3.setVisible(false);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(false);M8_2.setVisible(false);M8_3.setVisible(false);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[4][3];int n_2=2;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_two_var(n_2);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));R_1.setText(String.valueOf(truth_table[0][2]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));R_2.setText(String.valueOf(truth_table[1][2]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));R_3.setText(String.valueOf(truth_table[2][2]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));R_4.setText(String.valueOf(truth_table[3][2]));
        }
        if(Number_Of_Variable.getSelectedItem()=="3"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[8][4];int n_3=3;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_three_var(n_3);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));R_1.setText(String.valueOf(truth_table[0][3]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));R_2.setText(String.valueOf(truth_table[1][3]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));R_3.setText(String.valueOf(truth_table[2][3]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));R_4.setText(String.valueOf(truth_table[3][3]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));R_5.setText(String.valueOf(truth_table[4][3]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));R_6.setText(String.valueOf(truth_table[5][3]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));R_7.setText(String.valueOf(truth_table[6][3]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));R_8.setText(String.valueOf(truth_table[7][3]));
        }
        if(Number_Of_Variable.getSelectedItem()=="4"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(false);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(false);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(false);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(false);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(false);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(false);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(false);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(false);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[16][5];int n_4=4;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_four_var(n_4);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));R_1.setText(String.valueOf(truth_table[0][4]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));R_2.setText(String.valueOf(truth_table[1][4]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));R_3.setText(String.valueOf(truth_table[2][4]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));R_4.setText(String.valueOf(truth_table[3][4]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));R_5.setText(String.valueOf(truth_table[4][4]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));R_6.setText(String.valueOf(truth_table[5][4]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));R_7.setText(String.valueOf(truth_table[6][4]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));R_8.setText(String.valueOf(truth_table[7][4]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));R_9.setText(String.valueOf(truth_table[8][4]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));R_10.setText(String.valueOf(truth_table[9][4]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));R_11.setText(String.valueOf(truth_table[10][4]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));R_12.setText(String.valueOf(truth_table[11][4]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));R_13.setText(String.valueOf(truth_table[12][4]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));R_14.setText(String.valueOf(truth_table[13][4]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));R_15.setText(String.valueOf(truth_table[14][4]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));R_16.setText(String.valueOf(truth_table[15][4]));
        }
        if(Number_Of_Variable.getSelectedItem()=="5"){

            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(true);Result1.setVisible(true);
            A2.setVisible(true);B2.setVisible(true);C2.setVisible(true);D2.setVisible(true);E2.setVisible(true);Result2.setVisible(true);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("R");E1.setText("R");
            A2.setText("P");B2.setText("Q");C2.setText("R");D2.setText("R");E2.setText("R");

            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(true);R_18.setVisible(true);R_19.setVisible(true);R_20.setVisible(true);
            R_21.setVisible(true);R_22.setVisible(true);R_23.setVisible(true);R_24.setVisible(true);
            R_25.setVisible(true);R_26.setVisible(true);R_27.setVisible(true);R_28.setVisible(true);
            R_29.setVisible(true);R_30.setVisible(true);R_31.setVisible(true);R_32.setVisible(true);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(true);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(true);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(true);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(true);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(true);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(true);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(true);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(true);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(true);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(true);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(true);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(true);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(true);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(true);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(true);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(true);
            M17_1.setVisible(true);M17_2.setVisible(true);M17_3.setVisible(true);M17_4.setVisible(true);M17_5.setVisible(true);
            M18_1.setVisible(true);M18_2.setVisible(true);M18_3.setVisible(true);M18_4.setVisible(true);M18_5.setVisible(true);
            M19_1.setVisible(true);M19_2.setVisible(true);M19_3.setVisible(true);M19_4.setVisible(true);M19_5.setVisible(true);
            M20_1.setVisible(true);M20_2.setVisible(true);M20_3.setVisible(true);M20_4.setVisible(true);M20_5.setVisible(true);
            M21_1.setVisible(true);M21_2.setVisible(true);M21_3.setVisible(true);M21_4.setVisible(true);M21_5.setVisible(true);
            M22_1.setVisible(true);M22_2.setVisible(true);M22_3.setVisible(true);M22_4.setVisible(true);M22_5.setVisible(true);
            M23_1.setVisible(true);M23_2.setVisible(true);M23_3.setVisible(true);M23_4.setVisible(true);M23_5.setVisible(true);
            M24_1.setVisible(true);M24_2.setVisible(true);M24_3.setVisible(true);M24_4.setVisible(true);M24_5.setVisible(true);
            M25_1.setVisible(true);M25_2.setVisible(true);M25_3.setVisible(true);M25_4.setVisible(true);M25_5.setVisible(true);
            M26_1.setVisible(true);M26_2.setVisible(true);M26_3.setVisible(true);M26_4.setVisible(true);M26_5.setVisible(true);
            M27_1.setVisible(true);M27_2.setVisible(true);M27_3.setVisible(true);M27_4.setVisible(true);M27_5.setVisible(true);
            M28_1.setVisible(true);M28_2.setVisible(true);M28_3.setVisible(true);M28_4.setVisible(true);M28_5.setVisible(true);
            M29_1.setVisible(true);M29_2.setVisible(true);M29_3.setVisible(true);M29_4.setVisible(true);M29_5.setVisible(true);
            M30_1.setVisible(true);M30_2.setVisible(true);M30_3.setVisible(true);M30_4.setVisible(true);M30_5.setVisible(true);
            M31_1.setVisible(true);M31_2.setVisible(true);M31_3.setVisible(true);M31_4.setVisible(true);M31_5.setVisible(true);
            M32_1.setVisible(true);M32_2.setVisible(true);M32_3.setVisible(true);M32_4.setVisible(true);M32_5.setVisible(true);
            
            int [][] truth_table=new int[32][6];int n_5=5;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_five_var(n_5);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));M1_5.setText(String.valueOf(truth_table[0][4]));R_1.setText(String.valueOf(truth_table[0][5]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));M2_5.setText(String.valueOf(truth_table[1][4]));R_2.setText(String.valueOf(truth_table[1][5]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));M3_5.setText(String.valueOf(truth_table[2][4]));R_3.setText(String.valueOf(truth_table[2][5]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));M4_5.setText(String.valueOf(truth_table[3][4]));R_4.setText(String.valueOf(truth_table[3][5]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));M5_5.setText(String.valueOf(truth_table[4][4]));R_5.setText(String.valueOf(truth_table[4][5]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));M6_5.setText(String.valueOf(truth_table[5][4]));R_6.setText(String.valueOf(truth_table[5][5]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));M7_5.setText(String.valueOf(truth_table[6][4]));R_7.setText(String.valueOf(truth_table[6][5]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));M8_5.setText(String.valueOf(truth_table[7][4]));R_8.setText(String.valueOf(truth_table[7][5]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));M9_5.setText(String.valueOf(truth_table[8][4]));R_9.setText(String.valueOf(truth_table[8][5]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));M10_5.setText(String.valueOf(truth_table[9][4]));R_10.setText(String.valueOf(truth_table[9][5]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));M11_5.setText(String.valueOf(truth_table[10][4]));R_11.setText(String.valueOf(truth_table[10][5]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));M12_5.setText(String.valueOf(truth_table[11][4]));R_12.setText(String.valueOf(truth_table[11][5]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));M13_5.setText(String.valueOf(truth_table[12][4]));R_13.setText(String.valueOf(truth_table[12][5]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));M14_5.setText(String.valueOf(truth_table[13][4]));R_14.setText(String.valueOf(truth_table[13][5]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));M15_5.setText(String.valueOf(truth_table[14][4]));R_15.setText(String.valueOf(truth_table[14][5]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));M16_5.setText(String.valueOf(truth_table[15][4]));R_16.setText(String.valueOf(truth_table[15][5]));
            M17_1.setText(String.valueOf(truth_table[16][0]));M17_2.setText(String.valueOf(truth_table[16][1]));M17_3.setText(String.valueOf(truth_table[16][2]));M17_4.setText(String.valueOf(truth_table[16][3]));M17_5.setText(String.valueOf(truth_table[16][4]));R_17.setText(String.valueOf(truth_table[16][5]));
            M18_1.setText(String.valueOf(truth_table[17][0]));M18_2.setText(String.valueOf(truth_table[17][1]));M18_3.setText(String.valueOf(truth_table[17][2]));M18_4.setText(String.valueOf(truth_table[17][3]));M18_5.setText(String.valueOf(truth_table[17][4]));R_18.setText(String.valueOf(truth_table[17][5]));
            M19_1.setText(String.valueOf(truth_table[18][0]));M19_2.setText(String.valueOf(truth_table[18][1]));M19_3.setText(String.valueOf(truth_table[18][2]));M19_4.setText(String.valueOf(truth_table[18][3]));M19_5.setText(String.valueOf(truth_table[18][4]));R_19.setText(String.valueOf(truth_table[18][5]));
            M20_1.setText(String.valueOf(truth_table[19][0]));M20_2.setText(String.valueOf(truth_table[19][1]));M20_3.setText(String.valueOf(truth_table[19][2]));M20_4.setText(String.valueOf(truth_table[19][3]));M20_5.setText(String.valueOf(truth_table[19][4]));R_20.setText(String.valueOf(truth_table[19][5]));
            M21_1.setText(String.valueOf(truth_table[20][0]));M21_2.setText(String.valueOf(truth_table[20][1]));M21_3.setText(String.valueOf(truth_table[20][2]));M21_4.setText(String.valueOf(truth_table[20][3]));M21_5.setText(String.valueOf(truth_table[20][4]));R_21.setText(String.valueOf(truth_table[20][5]));
            M22_1.setText(String.valueOf(truth_table[21][0]));M22_2.setText(String.valueOf(truth_table[21][1]));M22_3.setText(String.valueOf(truth_table[21][2]));M22_4.setText(String.valueOf(truth_table[21][3]));M22_5.setText(String.valueOf(truth_table[21][4]));R_22.setText(String.valueOf(truth_table[21][5]));
            M23_1.setText(String.valueOf(truth_table[22][0]));M23_2.setText(String.valueOf(truth_table[22][1]));M23_3.setText(String.valueOf(truth_table[22][2]));M23_4.setText(String.valueOf(truth_table[22][3]));M23_5.setText(String.valueOf(truth_table[22][4]));R_23.setText(String.valueOf(truth_table[22][5]));
            M24_1.setText(String.valueOf(truth_table[23][0]));M24_2.setText(String.valueOf(truth_table[23][1]));M24_3.setText(String.valueOf(truth_table[23][2]));M24_4.setText(String.valueOf(truth_table[23][3]));M24_5.setText(String.valueOf(truth_table[23][4]));R_24.setText(String.valueOf(truth_table[23][5]));
            M25_1.setText(String.valueOf(truth_table[24][0]));M25_2.setText(String.valueOf(truth_table[24][1]));M25_3.setText(String.valueOf(truth_table[24][2]));M25_4.setText(String.valueOf(truth_table[24][3]));M25_5.setText(String.valueOf(truth_table[24][4]));R_25.setText(String.valueOf(truth_table[24][5]));
            M26_1.setText(String.valueOf(truth_table[25][0]));M26_2.setText(String.valueOf(truth_table[25][1]));M26_3.setText(String.valueOf(truth_table[25][2]));M26_4.setText(String.valueOf(truth_table[25][3]));M26_5.setText(String.valueOf(truth_table[25][4]));R_26.setText(String.valueOf(truth_table[25][5]));
            M27_1.setText(String.valueOf(truth_table[26][0]));M27_2.setText(String.valueOf(truth_table[26][1]));M27_3.setText(String.valueOf(truth_table[26][2]));M27_4.setText(String.valueOf(truth_table[26][3]));M27_5.setText(String.valueOf(truth_table[26][4]));R_27.setText(String.valueOf(truth_table[26][5]));
            M28_1.setText(String.valueOf(truth_table[27][0]));M28_2.setText(String.valueOf(truth_table[27][1]));M28_3.setText(String.valueOf(truth_table[27][2]));M28_4.setText(String.valueOf(truth_table[27][3]));M28_5.setText(String.valueOf(truth_table[27][4]));R_28.setText(String.valueOf(truth_table[27][5]));
            M29_1.setText(String.valueOf(truth_table[28][0]));M29_2.setText(String.valueOf(truth_table[28][1]));M29_3.setText(String.valueOf(truth_table[28][2]));M29_4.setText(String.valueOf(truth_table[28][3]));M29_5.setText(String.valueOf(truth_table[28][4]));R_29.setText(String.valueOf(truth_table[28][5]));
            M30_1.setText(String.valueOf(truth_table[29][0]));M30_2.setText(String.valueOf(truth_table[29][1]));M30_3.setText(String.valueOf(truth_table[29][2]));M30_4.setText(String.valueOf(truth_table[29][3]));M30_5.setText(String.valueOf(truth_table[29][4]));R_30.setText(String.valueOf(truth_table[29][5]));
            M31_1.setText(String.valueOf(truth_table[30][0]));M31_2.setText(String.valueOf(truth_table[30][1]));M31_3.setText(String.valueOf(truth_table[30][2]));M31_4.setText(String.valueOf(truth_table[30][3]));M31_5.setText(String.valueOf(truth_table[30][4]));R_31.setText(String.valueOf(truth_table[30][5]));
            M32_1.setText(String.valueOf(truth_table[31][0]));M32_2.setText(String.valueOf(truth_table[31][1]));M32_3.setText(String.valueOf(truth_table[31][2]));M32_4.setText(String.valueOf(truth_table[31][3]));M32_5.setText(String.valueOf(truth_table[31][4]));R_32.setText(String.valueOf(truth_table[31][4]));
        }
            
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10){
            if(Number_Of_Variable.getSelectedItem()=="----Select no. of Boolean Variable----"){
                JOptionPane.showMessageDialog(null,"PLEASE SELECT THE NUMBER OF BOOLEAN VARIABLE");
            }
            else{
                if(Number_Of_Variable.getSelectedItem()=="2"){
            
            A1.setVisible(true);B1.setVisible(true);C1.setVisible(false);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");
            
            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(false);R_6.setVisible(false);R_7.setVisible(false);R_8.setVisible(false);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(false);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(false);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(false);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(false);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(false);M5_2.setVisible(false);M5_3.setVisible(false);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(false);M6_2.setVisible(false);M6_3.setVisible(false);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(false);M7_2.setVisible(false);M7_3.setVisible(false);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(false);M8_2.setVisible(false);M8_3.setVisible(false);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[4][3];int n_2=2;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_two_var(n_2);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));R_1.setText(String.valueOf(truth_table[0][2]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));R_2.setText(String.valueOf(truth_table[1][2]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));R_3.setText(String.valueOf(truth_table[2][2]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));R_4.setText(String.valueOf(truth_table[3][2]));
        }
        if(Number_Of_Variable.getSelectedItem()=="3"){
            
            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(false);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");
            
            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(false);R_10.setVisible(false);R_11.setVisible(false);R_12.setVisible(false);
            R_13.setVisible(false);R_14.setVisible(false);R_15.setVisible(false);R_16.setVisible(false);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);
        
            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(false);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(false);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(false);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(false);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(false);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(false);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(false);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(false);M8_5.setVisible(false);
            M9_1.setVisible(false);M9_2.setVisible(false);M9_3.setVisible(false);M9_4.setVisible(false);M9_5.setVisible(false);
            M10_1.setVisible(false);M10_2.setVisible(false);M10_3.setVisible(false);M10_4.setVisible(false);M10_5.setVisible(false);
            M11_1.setVisible(false);M11_2.setVisible(false);M11_3.setVisible(false);M11_4.setVisible(false);M11_5.setVisible(false);
            M12_1.setVisible(false);M12_2.setVisible(false);M12_3.setVisible(false);M12_4.setVisible(false);M12_5.setVisible(false);
            M13_1.setVisible(false);M13_2.setVisible(false);M13_3.setVisible(false);M13_4.setVisible(false);M13_5.setVisible(false);
            M14_1.setVisible(false);M14_2.setVisible(false);M14_3.setVisible(false);M14_4.setVisible(false);M14_5.setVisible(false);
            M15_1.setVisible(false);M15_2.setVisible(false);M15_3.setVisible(false);M15_4.setVisible(false);M15_5.setVisible(false);
            M16_1.setVisible(false);M16_2.setVisible(false);M16_3.setVisible(false);M16_4.setVisible(false);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[8][4];int n_3=3;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_three_var(n_3);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));R_1.setText(String.valueOf(truth_table[0][3]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));R_2.setText(String.valueOf(truth_table[1][3]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));R_3.setText(String.valueOf(truth_table[2][3]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));R_4.setText(String.valueOf(truth_table[3][3]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));R_5.setText(String.valueOf(truth_table[4][3]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));R_6.setText(String.valueOf(truth_table[5][3]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));R_7.setText(String.valueOf(truth_table[6][3]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));R_8.setText(String.valueOf(truth_table[7][3]));
        }
        if(Number_Of_Variable.getSelectedItem()=="4"){
            
            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(false);Result1.setVisible(true);
            A2.setVisible(false);B2.setVisible(false);C2.setVisible(false);D2.setVisible(false);E2.setVisible(false);Result2.setVisible(false);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("S");
            
            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(false);R_18.setVisible(false);R_19.setVisible(false);R_20.setVisible(false);
            R_21.setVisible(false);R_22.setVisible(false);R_23.setVisible(false);R_24.setVisible(false);
            R_25.setVisible(false);R_26.setVisible(false);R_27.setVisible(false);R_28.setVisible(false);
            R_29.setVisible(false);R_30.setVisible(false);R_31.setVisible(false);R_32.setVisible(false);
            
            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(false);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(false);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(false);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(false);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(false);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(false);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(false);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(false);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(false);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(false);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(false);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(false);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(false);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(false);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(false);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(false);
            M17_1.setVisible(false);M17_2.setVisible(false);M17_3.setVisible(false);M17_4.setVisible(false);M17_5.setVisible(false);
            M18_1.setVisible(false);M18_2.setVisible(false);M18_3.setVisible(false);M18_4.setVisible(false);M18_5.setVisible(false);
            M19_1.setVisible(false);M19_2.setVisible(false);M19_3.setVisible(false);M19_4.setVisible(false);M19_5.setVisible(false);
            M20_1.setVisible(false);M20_2.setVisible(false);M20_3.setVisible(false);M20_4.setVisible(false);M20_5.setVisible(false);
            M21_1.setVisible(false);M21_2.setVisible(false);M21_3.setVisible(false);M21_4.setVisible(false);M21_5.setVisible(false);
            M22_1.setVisible(false);M22_2.setVisible(false);M22_3.setVisible(false);M22_4.setVisible(false);M22_5.setVisible(false);
            M23_1.setVisible(false);M23_2.setVisible(false);M23_3.setVisible(false);M23_4.setVisible(false);M23_5.setVisible(false);
            M24_1.setVisible(false);M24_2.setVisible(false);M24_3.setVisible(false);M24_4.setVisible(false);M24_5.setVisible(false);
            M25_1.setVisible(false);M25_2.setVisible(false);M25_3.setVisible(false);M25_4.setVisible(false);M25_5.setVisible(false);
            M26_1.setVisible(false);M26_2.setVisible(false);M26_3.setVisible(false);M26_4.setVisible(false);M26_5.setVisible(false);
            M27_1.setVisible(false);M27_2.setVisible(false);M27_3.setVisible(false);M27_4.setVisible(false);M27_5.setVisible(false);
            M28_1.setVisible(false);M28_2.setVisible(false);M28_3.setVisible(false);M28_4.setVisible(false);M28_5.setVisible(false);
            M29_1.setVisible(false);M29_2.setVisible(false);M29_3.setVisible(false);M29_4.setVisible(false);M29_5.setVisible(false);
            M30_1.setVisible(false);M30_2.setVisible(false);M30_3.setVisible(false);M30_4.setVisible(false);M30_5.setVisible(false);
            M31_1.setVisible(false);M31_2.setVisible(false);M31_3.setVisible(false);M31_4.setVisible(false);M31_5.setVisible(false);
            M32_1.setVisible(false);M32_2.setVisible(false);M32_3.setVisible(false);M32_4.setVisible(false);M32_5.setVisible(false);
            
            int [][] truth_table=new int[16][5];int n_4=4;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_four_var(n_4);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));R_1.setText(String.valueOf(truth_table[0][4]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));R_2.setText(String.valueOf(truth_table[1][4]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));R_3.setText(String.valueOf(truth_table[2][4]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));R_4.setText(String.valueOf(truth_table[3][4]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));R_5.setText(String.valueOf(truth_table[4][4]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));R_6.setText(String.valueOf(truth_table[5][4]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));R_7.setText(String.valueOf(truth_table[6][4]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));R_8.setText(String.valueOf(truth_table[7][4]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));R_9.setText(String.valueOf(truth_table[8][4]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));R_10.setText(String.valueOf(truth_table[9][4]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));R_11.setText(String.valueOf(truth_table[10][4]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));R_12.setText(String.valueOf(truth_table[11][4]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));R_13.setText(String.valueOf(truth_table[12][4]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));R_14.setText(String.valueOf(truth_table[13][4]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));R_15.setText(String.valueOf(truth_table[14][4]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));R_16.setText(String.valueOf(truth_table[15][4]));
            
        }
        if(Number_Of_Variable.getSelectedItem()=="5"){
            
            A1.setVisible(true);B1.setVisible(true);C1.setVisible(true);D1.setVisible(true);E1.setVisible(true);Result1.setVisible(true);
            A2.setVisible(true);B2.setVisible(true);C2.setVisible(true);D2.setVisible(true);E2.setVisible(true);Result2.setVisible(true);
            
            A1.setText("P");B1.setText("Q");C1.setText("R");D1.setText("S");E1.setText("T");
            A2.setText("P");B2.setText("Q");C2.setText("R");D2.setText("S");E2.setText("T");
            
            R_1.setVisible(true);R_2.setVisible(true);R_3.setVisible(true);R_4.setVisible(true);
            R_5.setVisible(true);R_6.setVisible(true);R_7.setVisible(true);R_8.setVisible(true);
            R_9.setVisible(true);R_10.setVisible(true);R_11.setVisible(true);R_12.setVisible(true);
            R_13.setVisible(true);R_14.setVisible(true);R_15.setVisible(true);R_16.setVisible(true);
            R_17.setVisible(true);R_18.setVisible(true);R_19.setVisible(true);R_20.setVisible(true);
            R_21.setVisible(true);R_22.setVisible(true);R_23.setVisible(true);R_24.setVisible(true);
            R_25.setVisible(true);R_26.setVisible(true);R_27.setVisible(true);R_28.setVisible(true);
            R_29.setVisible(true);R_30.setVisible(true);R_31.setVisible(true);R_32.setVisible(true);

            M1_1.setVisible(true);M1_2.setVisible(true);M1_3.setVisible(true);M1_4.setVisible(true);M1_5.setVisible(true);
            M2_1.setVisible(true);M2_2.setVisible(true);M2_3.setVisible(true);M2_4.setVisible(true);M2_5.setVisible(true);
            M3_1.setVisible(true);M3_2.setVisible(true);M3_3.setVisible(true);M3_4.setVisible(true);M3_5.setVisible(true);
            M4_1.setVisible(true);M4_2.setVisible(true);M4_3.setVisible(true);M4_4.setVisible(true);M4_5.setVisible(true);
            M5_1.setVisible(true);M5_2.setVisible(true);M5_3.setVisible(true);M5_4.setVisible(true);M5_5.setVisible(true);
            M6_1.setVisible(true);M6_2.setVisible(true);M6_3.setVisible(true);M6_4.setVisible(true);M6_5.setVisible(true);
            M7_1.setVisible(true);M7_2.setVisible(true);M7_3.setVisible(true);M7_4.setVisible(true);M7_5.setVisible(true);
            M8_1.setVisible(true);M8_2.setVisible(true);M8_3.setVisible(true);M8_4.setVisible(true);M8_5.setVisible(true);
            M9_1.setVisible(true);M9_2.setVisible(true);M9_3.setVisible(true);M9_4.setVisible(true);M9_5.setVisible(true);
            M10_1.setVisible(true);M10_2.setVisible(true);M10_3.setVisible(true);M10_4.setVisible(true);M10_5.setVisible(true);
            M11_1.setVisible(true);M11_2.setVisible(true);M11_3.setVisible(true);M11_4.setVisible(true);M11_5.setVisible(true);
            M12_1.setVisible(true);M12_2.setVisible(true);M12_3.setVisible(true);M12_4.setVisible(true);M12_5.setVisible(true);
            M13_1.setVisible(true);M13_2.setVisible(true);M13_3.setVisible(true);M13_4.setVisible(true);M13_5.setVisible(true);
            M14_1.setVisible(true);M14_2.setVisible(true);M14_3.setVisible(true);M14_4.setVisible(true);M14_5.setVisible(true);
            M15_1.setVisible(true);M15_2.setVisible(true);M15_3.setVisible(true);M15_4.setVisible(true);M15_5.setVisible(true);
            M16_1.setVisible(true);M16_2.setVisible(true);M16_3.setVisible(true);M16_4.setVisible(true);M16_5.setVisible(true);
            M17_1.setVisible(true);M17_2.setVisible(true);M17_3.setVisible(true);M17_4.setVisible(true);M17_5.setVisible(true);
            M18_1.setVisible(true);M18_2.setVisible(true);M18_3.setVisible(true);M18_4.setVisible(true);M18_5.setVisible(true);
            M19_1.setVisible(true);M19_2.setVisible(true);M19_3.setVisible(true);M19_4.setVisible(true);M19_5.setVisible(true);
            M20_1.setVisible(true);M20_2.setVisible(true);M20_3.setVisible(true);M20_4.setVisible(true);M20_5.setVisible(true);
            M21_1.setVisible(true);M21_2.setVisible(true);M21_3.setVisible(true);M21_4.setVisible(true);M21_5.setVisible(true);
            M22_1.setVisible(true);M22_2.setVisible(true);M22_3.setVisible(true);M22_4.setVisible(true);M22_5.setVisible(true);
            M23_1.setVisible(true);M23_2.setVisible(true);M23_3.setVisible(true);M23_4.setVisible(true);M23_5.setVisible(true);
            M24_1.setVisible(true);M24_2.setVisible(true);M24_3.setVisible(true);M24_4.setVisible(true);M24_5.setVisible(true);
            M25_1.setVisible(true);M25_2.setVisible(true);M25_3.setVisible(true);M25_4.setVisible(true);M25_5.setVisible(true);
            M26_1.setVisible(true);M26_2.setVisible(true);M26_3.setVisible(true);M26_4.setVisible(true);M26_5.setVisible(true);
            M27_1.setVisible(true);M27_2.setVisible(true);M27_3.setVisible(true);M27_4.setVisible(true);M27_5.setVisible(true);
            M28_1.setVisible(true);M28_2.setVisible(true);M28_3.setVisible(true);M28_4.setVisible(true);M28_5.setVisible(true);
            M29_1.setVisible(true);M29_2.setVisible(true);M29_3.setVisible(true);M29_4.setVisible(true);M29_5.setVisible(true);
            M30_1.setVisible(true);M30_2.setVisible(true);M30_3.setVisible(true);M30_4.setVisible(true);M30_5.setVisible(true);
            M31_1.setVisible(true);M31_2.setVisible(true);M31_3.setVisible(true);M31_4.setVisible(true);M31_5.setVisible(true);
            M32_1.setVisible(true);M32_2.setVisible(true);M32_3.setVisible(true);M32_4.setVisible(true);M32_5.setVisible(true);
            
            int [][] truth_table=new int[32][6];int n_5=5;
            Or_Table_Generater obj=new Or_Table_Generater();
            truth_table=obj.compute_truth_table_for_five_var(n_5);
            
            M1_1.setText(String.valueOf(truth_table[0][0]));M1_2.setText(String.valueOf(truth_table[0][1]));M1_3.setText(String.valueOf(truth_table[0][2]));M1_4.setText(String.valueOf(truth_table[0][3]));M1_5.setText(String.valueOf(truth_table[0][4]));R_1.setText(String.valueOf(truth_table[0][5]));
            M2_1.setText(String.valueOf(truth_table[1][0]));M2_2.setText(String.valueOf(truth_table[1][1]));M2_3.setText(String.valueOf(truth_table[1][2]));M2_4.setText(String.valueOf(truth_table[1][3]));M2_5.setText(String.valueOf(truth_table[1][4]));R_2.setText(String.valueOf(truth_table[1][5]));
            M3_1.setText(String.valueOf(truth_table[2][0]));M3_2.setText(String.valueOf(truth_table[2][1]));M3_3.setText(String.valueOf(truth_table[2][2]));M3_4.setText(String.valueOf(truth_table[2][3]));M3_5.setText(String.valueOf(truth_table[2][4]));R_3.setText(String.valueOf(truth_table[2][5]));
            M4_1.setText(String.valueOf(truth_table[3][0]));M4_2.setText(String.valueOf(truth_table[3][1]));M4_3.setText(String.valueOf(truth_table[3][2]));M4_4.setText(String.valueOf(truth_table[3][3]));M4_5.setText(String.valueOf(truth_table[3][4]));R_4.setText(String.valueOf(truth_table[3][5]));
            M5_1.setText(String.valueOf(truth_table[4][0]));M5_2.setText(String.valueOf(truth_table[4][1]));M5_3.setText(String.valueOf(truth_table[4][2]));M5_4.setText(String.valueOf(truth_table[4][3]));M5_5.setText(String.valueOf(truth_table[4][4]));R_5.setText(String.valueOf(truth_table[4][5]));
            M6_1.setText(String.valueOf(truth_table[5][0]));M6_2.setText(String.valueOf(truth_table[5][1]));M6_3.setText(String.valueOf(truth_table[5][2]));M6_4.setText(String.valueOf(truth_table[5][3]));M6_5.setText(String.valueOf(truth_table[5][4]));R_6.setText(String.valueOf(truth_table[5][5]));
            M7_1.setText(String.valueOf(truth_table[6][0]));M7_2.setText(String.valueOf(truth_table[6][1]));M7_3.setText(String.valueOf(truth_table[6][2]));M7_4.setText(String.valueOf(truth_table[6][3]));M7_5.setText(String.valueOf(truth_table[6][4]));R_7.setText(String.valueOf(truth_table[6][5]));
            M8_1.setText(String.valueOf(truth_table[7][0]));M8_2.setText(String.valueOf(truth_table[7][1]));M8_3.setText(String.valueOf(truth_table[7][2]));M8_4.setText(String.valueOf(truth_table[7][3]));M8_5.setText(String.valueOf(truth_table[7][4]));R_8.setText(String.valueOf(truth_table[7][5]));
            M9_1.setText(String.valueOf(truth_table[8][0]));M9_2.setText(String.valueOf(truth_table[8][1]));M9_3.setText(String.valueOf(truth_table[8][2]));M9_4.setText(String.valueOf(truth_table[8][3]));M9_5.setText(String.valueOf(truth_table[8][4]));R_9.setText(String.valueOf(truth_table[8][5]));
            M10_1.setText(String.valueOf(truth_table[9][0]));M10_2.setText(String.valueOf(truth_table[9][1]));M10_3.setText(String.valueOf(truth_table[9][2]));M10_4.setText(String.valueOf(truth_table[9][3]));M10_5.setText(String.valueOf(truth_table[9][4]));R_10.setText(String.valueOf(truth_table[9][5]));
            M11_1.setText(String.valueOf(truth_table[10][0]));M11_2.setText(String.valueOf(truth_table[10][1]));M11_3.setText(String.valueOf(truth_table[10][2]));M11_4.setText(String.valueOf(truth_table[10][3]));M11_5.setText(String.valueOf(truth_table[10][4]));R_11.setText(String.valueOf(truth_table[10][5]));
            M12_1.setText(String.valueOf(truth_table[11][0]));M12_2.setText(String.valueOf(truth_table[11][1]));M12_3.setText(String.valueOf(truth_table[11][2]));M12_4.setText(String.valueOf(truth_table[11][3]));M12_5.setText(String.valueOf(truth_table[11][4]));R_12.setText(String.valueOf(truth_table[11][5]));
            M13_1.setText(String.valueOf(truth_table[12][0]));M13_2.setText(String.valueOf(truth_table[12][1]));M13_3.setText(String.valueOf(truth_table[12][2]));M13_4.setText(String.valueOf(truth_table[12][3]));M13_5.setText(String.valueOf(truth_table[12][4]));R_13.setText(String.valueOf(truth_table[12][5]));
            M14_1.setText(String.valueOf(truth_table[13][0]));M14_2.setText(String.valueOf(truth_table[13][1]));M14_3.setText(String.valueOf(truth_table[13][2]));M14_4.setText(String.valueOf(truth_table[13][3]));M14_5.setText(String.valueOf(truth_table[13][4]));R_14.setText(String.valueOf(truth_table[13][5]));
            M15_1.setText(String.valueOf(truth_table[14][0]));M15_2.setText(String.valueOf(truth_table[14][1]));M15_3.setText(String.valueOf(truth_table[14][2]));M15_4.setText(String.valueOf(truth_table[14][3]));M15_5.setText(String.valueOf(truth_table[14][4]));R_15.setText(String.valueOf(truth_table[14][5]));
            M16_1.setText(String.valueOf(truth_table[15][0]));M16_2.setText(String.valueOf(truth_table[15][1]));M16_3.setText(String.valueOf(truth_table[15][2]));M16_4.setText(String.valueOf(truth_table[15][3]));M16_5.setText(String.valueOf(truth_table[15][4]));R_16.setText(String.valueOf(truth_table[15][5]));
            M17_1.setText(String.valueOf(truth_table[16][0]));M17_2.setText(String.valueOf(truth_table[16][1]));M17_3.setText(String.valueOf(truth_table[16][2]));M17_4.setText(String.valueOf(truth_table[16][3]));M17_5.setText(String.valueOf(truth_table[16][4]));R_17.setText(String.valueOf(truth_table[16][5]));
            M18_1.setText(String.valueOf(truth_table[17][0]));M18_2.setText(String.valueOf(truth_table[17][1]));M18_3.setText(String.valueOf(truth_table[17][2]));M18_4.setText(String.valueOf(truth_table[17][3]));M18_5.setText(String.valueOf(truth_table[17][4]));R_18.setText(String.valueOf(truth_table[17][5]));
            M19_1.setText(String.valueOf(truth_table[18][0]));M19_2.setText(String.valueOf(truth_table[18][1]));M19_3.setText(String.valueOf(truth_table[18][2]));M19_4.setText(String.valueOf(truth_table[18][3]));M19_5.setText(String.valueOf(truth_table[18][4]));R_19.setText(String.valueOf(truth_table[18][5]));
            M20_1.setText(String.valueOf(truth_table[19][0]));M20_2.setText(String.valueOf(truth_table[19][1]));M20_3.setText(String.valueOf(truth_table[19][2]));M20_4.setText(String.valueOf(truth_table[19][3]));M20_5.setText(String.valueOf(truth_table[19][4]));R_20.setText(String.valueOf(truth_table[19][5]));
            M21_1.setText(String.valueOf(truth_table[20][0]));M21_2.setText(String.valueOf(truth_table[20][1]));M21_3.setText(String.valueOf(truth_table[20][2]));M21_4.setText(String.valueOf(truth_table[20][3]));M21_5.setText(String.valueOf(truth_table[20][4]));R_21.setText(String.valueOf(truth_table[20][5]));
            M22_1.setText(String.valueOf(truth_table[21][0]));M22_2.setText(String.valueOf(truth_table[21][1]));M22_3.setText(String.valueOf(truth_table[21][2]));M22_4.setText(String.valueOf(truth_table[21][3]));M22_5.setText(String.valueOf(truth_table[21][4]));R_22.setText(String.valueOf(truth_table[21][5]));
            M23_1.setText(String.valueOf(truth_table[22][0]));M23_2.setText(String.valueOf(truth_table[22][1]));M23_3.setText(String.valueOf(truth_table[22][2]));M23_4.setText(String.valueOf(truth_table[22][3]));M23_5.setText(String.valueOf(truth_table[22][4]));R_23.setText(String.valueOf(truth_table[22][5]));
            M24_1.setText(String.valueOf(truth_table[23][0]));M24_2.setText(String.valueOf(truth_table[23][1]));M24_3.setText(String.valueOf(truth_table[23][2]));M24_4.setText(String.valueOf(truth_table[23][3]));M24_5.setText(String.valueOf(truth_table[23][4]));R_24.setText(String.valueOf(truth_table[23][5]));
            M25_1.setText(String.valueOf(truth_table[24][0]));M25_2.setText(String.valueOf(truth_table[24][1]));M25_3.setText(String.valueOf(truth_table[24][2]));M25_4.setText(String.valueOf(truth_table[24][3]));M25_5.setText(String.valueOf(truth_table[24][4]));R_25.setText(String.valueOf(truth_table[24][5]));
            M26_1.setText(String.valueOf(truth_table[25][0]));M26_2.setText(String.valueOf(truth_table[25][1]));M26_3.setText(String.valueOf(truth_table[25][2]));M26_4.setText(String.valueOf(truth_table[25][3]));M26_5.setText(String.valueOf(truth_table[25][4]));R_26.setText(String.valueOf(truth_table[25][5]));
            M27_1.setText(String.valueOf(truth_table[26][0]));M27_2.setText(String.valueOf(truth_table[26][1]));M27_3.setText(String.valueOf(truth_table[26][2]));M27_4.setText(String.valueOf(truth_table[26][3]));M27_5.setText(String.valueOf(truth_table[26][4]));R_27.setText(String.valueOf(truth_table[26][5]));
            M28_1.setText(String.valueOf(truth_table[27][0]));M28_2.setText(String.valueOf(truth_table[27][1]));M28_3.setText(String.valueOf(truth_table[27][2]));M28_4.setText(String.valueOf(truth_table[27][3]));M28_5.setText(String.valueOf(truth_table[27][4]));R_28.setText(String.valueOf(truth_table[27][5]));
            M29_1.setText(String.valueOf(truth_table[28][0]));M29_2.setText(String.valueOf(truth_table[28][1]));M29_3.setText(String.valueOf(truth_table[28][2]));M29_4.setText(String.valueOf(truth_table[28][3]));M29_5.setText(String.valueOf(truth_table[28][4]));R_29.setText(String.valueOf(truth_table[28][5]));
            M30_1.setText(String.valueOf(truth_table[29][0]));M30_2.setText(String.valueOf(truth_table[29][1]));M30_3.setText(String.valueOf(truth_table[29][2]));M30_4.setText(String.valueOf(truth_table[29][3]));M30_5.setText(String.valueOf(truth_table[29][4]));R_30.setText(String.valueOf(truth_table[29][5]));
            M31_1.setText(String.valueOf(truth_table[30][0]));M31_2.setText(String.valueOf(truth_table[30][1]));M31_3.setText(String.valueOf(truth_table[30][2]));M31_4.setText(String.valueOf(truth_table[30][3]));M31_5.setText(String.valueOf(truth_table[30][4]));R_31.setText(String.valueOf(truth_table[30][5]));
            M32_1.setText(String.valueOf(truth_table[31][0]));M32_2.setText(String.valueOf(truth_table[31][1]));M32_3.setText(String.valueOf(truth_table[31][2]));M32_4.setText(String.valueOf(truth_table[31][3]));M32_5.setText(String.valueOf(truth_table[31][4]));R_32.setText(String.valueOf(truth_table[31][4]));
        }
            }
        }
    }//GEN-LAST:event_jButton7KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TTD_OR_GATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTD_OR_GATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTD_OR_GATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTD_OR_GATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTD_OR_GATE().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel M10_1;
    private javax.swing.JLabel M10_2;
    private javax.swing.JLabel M10_3;
    private javax.swing.JLabel M10_4;
    private javax.swing.JLabel M10_5;
    private javax.swing.JLabel M11_1;
    private javax.swing.JLabel M11_2;
    private javax.swing.JLabel M11_3;
    private javax.swing.JLabel M11_4;
    private javax.swing.JLabel M11_5;
    private javax.swing.JLabel M12_1;
    private javax.swing.JLabel M12_2;
    private javax.swing.JLabel M12_3;
    private javax.swing.JLabel M12_4;
    private javax.swing.JLabel M12_5;
    private javax.swing.JLabel M13_1;
    private javax.swing.JLabel M13_2;
    private javax.swing.JLabel M13_3;
    private javax.swing.JLabel M13_4;
    private javax.swing.JLabel M13_5;
    private javax.swing.JLabel M14_1;
    private javax.swing.JLabel M14_2;
    private javax.swing.JLabel M14_3;
    private javax.swing.JLabel M14_4;
    private javax.swing.JLabel M14_5;
    private javax.swing.JLabel M15_1;
    private javax.swing.JLabel M15_2;
    private javax.swing.JLabel M15_3;
    private javax.swing.JLabel M15_4;
    private javax.swing.JLabel M15_5;
    private javax.swing.JLabel M16_1;
    private javax.swing.JLabel M16_2;
    private javax.swing.JLabel M16_3;
    private javax.swing.JLabel M16_4;
    private javax.swing.JLabel M16_5;
    private javax.swing.JLabel M17_1;
    private javax.swing.JLabel M17_2;
    private javax.swing.JLabel M17_3;
    private javax.swing.JLabel M17_4;
    private javax.swing.JLabel M17_5;
    private javax.swing.JLabel M18_1;
    private javax.swing.JLabel M18_2;
    private javax.swing.JLabel M18_3;
    private javax.swing.JLabel M18_4;
    private javax.swing.JLabel M18_5;
    private javax.swing.JLabel M19_1;
    private javax.swing.JLabel M19_2;
    private javax.swing.JLabel M19_3;
    private javax.swing.JLabel M19_4;
    private javax.swing.JLabel M19_5;
    private javax.swing.JLabel M1_1;
    private javax.swing.JLabel M1_2;
    private javax.swing.JLabel M1_3;
    private javax.swing.JLabel M1_4;
    private javax.swing.JLabel M1_5;
    private javax.swing.JLabel M20_1;
    private javax.swing.JLabel M20_2;
    private javax.swing.JLabel M20_3;
    private javax.swing.JLabel M20_4;
    private javax.swing.JLabel M20_5;
    private javax.swing.JLabel M21_1;
    private javax.swing.JLabel M21_2;
    private javax.swing.JLabel M21_3;
    private javax.swing.JLabel M21_4;
    private javax.swing.JLabel M21_5;
    private javax.swing.JLabel M22_1;
    private javax.swing.JLabel M22_2;
    private javax.swing.JLabel M22_3;
    private javax.swing.JLabel M22_4;
    private javax.swing.JLabel M22_5;
    private javax.swing.JLabel M23_1;
    private javax.swing.JLabel M23_2;
    private javax.swing.JLabel M23_3;
    private javax.swing.JLabel M23_4;
    private javax.swing.JLabel M23_5;
    private javax.swing.JLabel M24_1;
    private javax.swing.JLabel M24_2;
    private javax.swing.JLabel M24_3;
    private javax.swing.JLabel M24_4;
    private javax.swing.JLabel M24_5;
    private javax.swing.JLabel M25_1;
    private javax.swing.JLabel M25_2;
    private javax.swing.JLabel M25_3;
    private javax.swing.JLabel M25_4;
    private javax.swing.JLabel M25_5;
    private javax.swing.JLabel M26_1;
    private javax.swing.JLabel M26_2;
    private javax.swing.JLabel M26_3;
    private javax.swing.JLabel M26_4;
    private javax.swing.JLabel M26_5;
    private javax.swing.JLabel M27_1;
    private javax.swing.JLabel M27_2;
    private javax.swing.JLabel M27_3;
    private javax.swing.JLabel M27_4;
    private javax.swing.JLabel M27_5;
    private javax.swing.JLabel M28_1;
    private javax.swing.JLabel M28_2;
    private javax.swing.JLabel M28_3;
    private javax.swing.JLabel M28_4;
    private javax.swing.JLabel M28_5;
    private javax.swing.JLabel M29_1;
    private javax.swing.JLabel M29_2;
    private javax.swing.JLabel M29_3;
    private javax.swing.JLabel M29_4;
    private javax.swing.JLabel M29_5;
    private javax.swing.JLabel M2_1;
    private javax.swing.JLabel M2_2;
    private javax.swing.JLabel M2_3;
    private javax.swing.JLabel M2_4;
    private javax.swing.JLabel M2_5;
    private javax.swing.JLabel M30_1;
    private javax.swing.JLabel M30_2;
    private javax.swing.JLabel M30_3;
    private javax.swing.JLabel M30_4;
    private javax.swing.JLabel M30_5;
    private javax.swing.JLabel M31_1;
    private javax.swing.JLabel M31_2;
    private javax.swing.JLabel M31_3;
    private javax.swing.JLabel M31_4;
    private javax.swing.JLabel M31_5;
    private javax.swing.JLabel M32_1;
    private javax.swing.JLabel M32_2;
    private javax.swing.JLabel M32_3;
    private javax.swing.JLabel M32_4;
    private javax.swing.JLabel M32_5;
    private javax.swing.JLabel M3_1;
    private javax.swing.JLabel M3_2;
    private javax.swing.JLabel M3_3;
    private javax.swing.JLabel M3_4;
    private javax.swing.JLabel M3_5;
    private javax.swing.JLabel M4_1;
    private javax.swing.JLabel M4_2;
    private javax.swing.JLabel M4_3;
    private javax.swing.JLabel M4_4;
    private javax.swing.JLabel M4_5;
    private javax.swing.JLabel M5_1;
    private javax.swing.JLabel M5_2;
    private javax.swing.JLabel M5_3;
    private javax.swing.JLabel M5_4;
    private javax.swing.JLabel M5_5;
    private javax.swing.JLabel M6_1;
    private javax.swing.JLabel M6_2;
    private javax.swing.JLabel M6_3;
    private javax.swing.JLabel M6_4;
    private javax.swing.JLabel M6_5;
    private javax.swing.JLabel M7_1;
    private javax.swing.JLabel M7_2;
    private javax.swing.JLabel M7_3;
    private javax.swing.JLabel M7_4;
    private javax.swing.JLabel M7_5;
    private javax.swing.JLabel M8_1;
    private javax.swing.JLabel M8_2;
    private javax.swing.JLabel M8_3;
    private javax.swing.JLabel M8_4;
    private javax.swing.JLabel M8_5;
    private javax.swing.JLabel M9_1;
    private javax.swing.JLabel M9_2;
    private javax.swing.JLabel M9_3;
    private javax.swing.JLabel M9_4;
    private javax.swing.JLabel M9_5;
    private javax.swing.JComboBox Number_Of_Variable;
    private javax.swing.JButton OR;
    private javax.swing.JLabel R_1;
    private javax.swing.JLabel R_10;
    private javax.swing.JLabel R_11;
    private javax.swing.JLabel R_12;
    private javax.swing.JLabel R_13;
    private javax.swing.JLabel R_14;
    private javax.swing.JLabel R_15;
    private javax.swing.JLabel R_16;
    private javax.swing.JLabel R_17;
    private javax.swing.JLabel R_18;
    private javax.swing.JLabel R_19;
    private javax.swing.JLabel R_2;
    private javax.swing.JLabel R_20;
    private javax.swing.JLabel R_21;
    private javax.swing.JLabel R_22;
    private javax.swing.JLabel R_23;
    private javax.swing.JLabel R_24;
    private javax.swing.JLabel R_25;
    private javax.swing.JLabel R_26;
    private javax.swing.JLabel R_27;
    private javax.swing.JLabel R_28;
    private javax.swing.JLabel R_29;
    private javax.swing.JLabel R_3;
    private javax.swing.JLabel R_30;
    private javax.swing.JLabel R_31;
    private javax.swing.JLabel R_32;
    private javax.swing.JLabel R_4;
    private javax.swing.JLabel R_5;
    private javax.swing.JLabel R_6;
    private javax.swing.JLabel R_7;
    private javax.swing.JLabel R_8;
    private javax.swing.JLabel R_9;
    private javax.swing.JLabel Result1;
    private javax.swing.JLabel Result2;
    private javax.swing.JButton TTD;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void CloseFrame() {
        super.dispose();
    }
}
