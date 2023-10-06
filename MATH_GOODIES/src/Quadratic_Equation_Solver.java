
import java.awt.Color;
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
public class Quadratic_Equation_Solver extends javax.swing.JFrame {
    String p;

    /**
     * Creates new form Quadratic_Equation_Solver
     */
    public Quadratic_Equation_Solver() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUADRATIC EQUATION SOLVER");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
        sign2 = new javax.swing.JComboBox();
        B = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sign3 = new javax.swing.JComboBox();
        C = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sign1 = new javax.swing.JComboBox();
        A = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Roots = new javax.swing.JLabel();
        Sum_of_Roots = new javax.swing.JLabel();
        Product_of_Roots = new javax.swing.JLabel();
        Nature_of_Roots = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quadratic Equation Solver");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sign2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-" }));
        sign2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sign2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        B.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sign3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sign3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-" }));
        sign3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sign3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        C.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("=");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("To calculate the roots:     ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("For example ,Enter a=1, b=8 and c=16.  ax2 + bx + c = 0");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("0");

        sign1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sign1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-" }));
        sign1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sign1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign1ActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        A.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X^2");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("a");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("b");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("c");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Roots.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Roots.setText("Roots : ");

        Sum_of_Roots.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Sum_of_Roots.setText("Sum of Roots : ");

        Product_of_Roots.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Product_of_Roots.setText("Product of Roots : ");

        Nature_of_Roots.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nature_of_Roots.setText("Nature of Roots : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Roots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Sum_of_Roots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Product_of_Roots, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addComponent(Nature_of_Roots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Roots)
                .addGap(18, 18, 18)
                .addComponent(Sum_of_Roots)
                .addGap(18, 18, 18)
                .addComponent(Product_of_Roots)
                .addGap(18, 18, 18)
                .addComponent(Nature_of_Roots)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Quadratic Equation Solver :");

        calculate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        calculate.setText("Calculate");
        calculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        calculate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                calculateFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sign1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sign2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sign3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B, C});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sign1, sign2, sign3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sign2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sign3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sign1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B, C});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sign1, sign2, sign3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {calculate, jButton1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton4, jLabel12});

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

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        // TODO add your handling code here:
        B.setBackground(Color.WHITE);
    }//GEN-LAST:event_BMouseClicked

    private void BKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyPressed
        // TODO add your handling code here:
        int l = B.getText().length();
        if ( (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (evt.getKeyChar() == 8) || (evt.getKeyChar()==10)) {
            if((l<=2) || (evt.getKeyChar() == 8) ){
                B.setEditable(true);
                if((evt.getKeyChar() == 10)){
                    p="B";
                    calculate.requestFocus();calculate.setFocusable(true);
                }
            }
            else{
                B.setEditable(false);
            }
        }
        else {
            B.setEditable(false);
        }
    }//GEN-LAST:event_BKeyPressed

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        // TODO add your handling code here:
        C.setBackground(Color.WHITE);
    }//GEN-LAST:event_CMouseClicked

    private void CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyPressed
        // TODO add your handling code here:
        int l = C.getText().length();
        if ( (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (evt.getKeyChar() == 8) || (evt.getKeyChar()==10)) {
            if((l<=2) || (evt.getKeyChar() == 8) ){
                C.setEditable(true);
                if((evt.getKeyChar() == 10)){
                    p="C";
                    calculate.requestFocus();calculate.setFocusable(true);
                }
            }
            else{
                C.setEditable(false);
            }
        }
        else {
            C.setEditable(false);
        }
    }//GEN-LAST:event_CKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        A.setText("");A.setBackground(Color.WHITE);
        B.setText("");B.setBackground(Color.WHITE);
        C.setText("");C.setBackground(Color.WHITE);
        Roots.setText("Roots : ");
        Sum_of_Roots.setText("Sum of Roots : ");
        Product_of_Roots.setText("Product of Roots : ");
        Nature_of_Roots.setText("Nature of Roots : ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        // TODO add your handling code here:
        A.setBackground(Color.WHITE);
    }//GEN-LAST:event_AMouseClicked

    private void AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyPressed
        // TODO add your handling code here:
        int l = A.getText().length();
        if ( (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (evt.getKeyChar() == 8) || (evt.getKeyChar()==10)) {
            if((l<=2) || (evt.getKeyChar() == 8) ){
                A.setEditable(true);
                if((evt.getKeyChar() == 10)){
                    p="A";
                    calculate.requestFocus();calculate.setFocusable(true);
                }
            }
            else{
                A.setEditable(false);
            }
        }
        else {
            A.setEditable(false);
        }
    }//GEN-LAST:event_AKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MAIN_MENU obj=new MAIN_MENU();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        if("".equals(A.getText()) || "".equals(B.getText()) || "".equals(C.getText())){
            JOptionPane.showMessageDialog(null,"ALL FIELDS SHOULD BE FILLED");
            if(A.getText().length()==0){A.setBackground(Color.YELLOW);}
            if(B.getText().length()==0){B.setBackground(Color.YELLOW);}
            if(C.getText().length()==0){C.setBackground(Color.YELLOW);}
        }
        else{
            int a=0,b=0,c=0;
            double [] roots = new double[2];
            double SOR,POR;
            String NOR,str=null;
            a=Integer.parseInt(A.getText());
            b=Integer.parseInt(B.getText());
            c=Integer.parseInt(C.getText());
            if(sign1.getSelectedItem()=="-"){a=(-1)*a;}
            if(sign2.getSelectedItem()=="-"){b=(-1)*b;}
            if(sign3.getSelectedItem()=="-"){c=(-1)*c;}

            QuadraticEquationSolver obj= new QuadraticEquationSolver(a,b,c);

            roots=obj.computeRoots ();

            SOR=obj.sumOfRoots ();
            Sum_of_Roots.setText("Sum of Roots : "+SOR);

            POR=obj.productOfRoots ();
            Product_of_Roots.setText("Product of Roots : "+POR);

            NOR=obj.natureOfRoots ();
            Nature_of_Roots.setText("Nature of Roots : "+NOR);
            if("roots are imaginary".equals(NOR)){
                str=obj.compute_imaginary_roots();
            }

            if ("only one distinct root".equals(NOR)){Roots.setText("Roots : Root1 = Root2 = "+roots[0]);}
            else if ("roots are real".equals(NOR)) {Roots.setText("Roots : Root1 = "+roots[0]+" and Root2 = "+roots[1]);}
            else{
                Roots.setText(str);
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void sign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign1ActionPerformed

    private void calculateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calculateFocusGained
        // TODO add your handling code here:
        if("".equals(A.getText()) || "".equals(B.getText()) || "".equals(C.getText())){A.requestFocus();A.setFocusable(true);
            JOptionPane.showMessageDialog(null,"ALL FIELDS SHOULD BE FILLED");
            if(A.getText().length()==0){A.setBackground(Color.YELLOW);}
            if(B.getText().length()==0){B.setBackground(Color.YELLOW);}
            if(C.getText().length()==0){C.setBackground(Color.YELLOW);}
            
            if("A".equals(p)){calculate.setFocusable(false);A.requestFocus();A.setFocusable(true);}
            if("B".equals(p)){calculate.setFocusable(false);B.requestFocus();B.setFocusable(true);}
            if("C".equals(p)){calculate.setFocusable(false);C.requestFocus();C.setFocusable(true);}
        }
        else{
            int a=0,b=0,c=0;
            double [] roots = new double[2];
            double SOR,POR;
            String NOR,str=null;
            a=Integer.parseInt(A.getText());
            b=Integer.parseInt(B.getText());
            c=Integer.parseInt(C.getText());
            if(sign1.getSelectedItem()=="-"){a=(-1)*a;}
            if(sign2.getSelectedItem()=="-"){b=(-1)*b;}
            if(sign3.getSelectedItem()=="-"){c=(-1)*c;}

            QuadraticEquationSolver obj= new QuadraticEquationSolver(a,b,c);

            roots=obj.computeRoots ();

            SOR=obj.sumOfRoots ();
            Sum_of_Roots.setText("Sum of Roots : "+SOR);

            POR=obj.productOfRoots ();
            Product_of_Roots.setText("Product of Roots : "+POR);

            NOR=obj.natureOfRoots ();
            Nature_of_Roots.setText("Nature of Roots : "+NOR);
            if("roots are imaginary".equals(NOR)){
                str=obj.compute_imaginary_roots();
            }

            if ("only one distinct root".equals(NOR)){Roots.setText("Roots : Root1 = Root2 = "+roots[0]);}
            else if ("roots are real".equals(NOR)) {Roots.setText("Roots : Root1 = "+roots[0]+" and Root2 = "+roots[1]);}
            else{
                Roots.setText(str);
            }
        }
    }//GEN-LAST:event_calculateFocusGained

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10){
            A.setText("");A.setBackground(Color.WHITE);
            B.setText("");B.setBackground(Color.WHITE);
            C.setText("");C.setBackground(Color.WHITE);
            Roots.setText("Roots : ");
            Sum_of_Roots.setText("Sum of Roots : ");
            Product_of_Roots.setText("Product of Roots : ");
            Nature_of_Roots.setText("Nature of Roots : ");
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10){
            MAIN_MENU obj=new MAIN_MENU();
            obj.setVisible(true);
            CloseFrame();
        }
    }//GEN-LAST:event_jButton4KeyPressed

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
            java.util.logging.Logger.getLogger(Quadratic_Equation_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quadratic_Equation_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quadratic_Equation_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quadratic_Equation_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quadratic_Equation_Solver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JLabel Nature_of_Roots;
    private javax.swing.JLabel Product_of_Roots;
    private javax.swing.JLabel Roots;
    private javax.swing.JLabel Sum_of_Roots;
    private javax.swing.JButton calculate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox sign1;
    private javax.swing.JComboBox sign2;
    private javax.swing.JComboBox sign3;
    // End of variables declaration//GEN-END:variables

    private void CloseFrame() {
        super.dispose();
    }
}
