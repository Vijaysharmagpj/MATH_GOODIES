
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
public class Rectangle_Solver extends javax.swing.JFrame {

    /**
     * Creates new form Rectangle_Solver
     */
    public Rectangle_Solver() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("RECTANGLE SOLVER");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_length = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_width = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_Area = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_Perimeter = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rectangle Solver");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/Rectangle.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 240), 2, true));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Length");

        txt_length.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_length.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_length.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        txt_length.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_lengthMouseClicked(evt);
            }
        });
        txt_length.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_lengthFocusGained(evt);
            }
        });
        txt_length.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lengthKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Width");

        txt_width.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_width.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_width.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        txt_width.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_widthMouseClicked(evt);
            }
        });
        txt_width.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_widthFocusGained(evt);
            }
        });
        txt_width.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_widthKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_Area.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_Area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 240), 2, true));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, txt_Area, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(txt_Area, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Area");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Perimeter");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txt_Perimeter.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_Perimeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Perimeter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 240), 2, true));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, txt_Perimeter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(txt_Perimeter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        calculate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        calculate.setText("Calculate");
        calculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateMouseClicked(evt);
            }
        });
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

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Main Menu ");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("Geometric Calculator ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Rectangle Solver");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(txt_width)
                            .add(txt_length)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel10)
                        .add(0, 47, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(calculate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(5, 5, 5)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(40, 40, 40)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(txt_length, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(txt_width, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(30, 30, 30)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton2)
                            .add(calculate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(0, 10, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {calculate, jButton2}, org.jdesktop.layout.GroupLayout.VERTICAL);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lengthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_lengthMouseClicked
        // TODO add your handling code here:
        txt_length.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_lengthMouseClicked

    private void txt_lengthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lengthFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lengthFocusGained

    private void txt_lengthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lengthKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || (evt.getKeyChar() == 8) || (evt.getKeyChar() == 10) || evt.getKeyChar()== '.'))  {
            int l=txt_length.getText().length();//System.out.println(len);
        if((l<=5) || (evt.getKeyChar()==8)){
            String value = txt_length.getText();
            if((evt.getKeyChar() == '.') && value.contains(".")){
                txt_length.setEditable(false);
            }
            else{
                txt_length.setEditable(true);
                if((evt.getKeyChar() == 10)){
                    if("".equals(txt_length.getText()) || "".equals(txt_width.getText())){
                        if("".equals(txt_length.getText()) && "".equals(txt_width.getText())){
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH AND WIDTH OF RECTANGLE BOTH");
                            txt_length.setBackground(Color.YELLOW);
                            txt_width.setBackground(Color.YELLOW);
                        }
                        else if("".equals(txt_length.getText())){
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH OF RECTANGLE");
                            txt_length.setBackground(Color.YELLOW);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE WIDTH OF RECTANGLE");
                            txt_width.setBackground(Color.YELLOW);
                        }
                    }
                    else{
                        calculate.requestFocus();calculate.setFocusable(true);
                    }
                }
            }
        }
        else{
            txt_length.setEditable(false);
        }
        }
        else {
            txt_length.setEditable(false);
        }
    }//GEN-LAST:event_txt_lengthKeyPressed

    private void txt_widthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_widthMouseClicked
        // TODO add your handling code here:
        txt_width.setBackground(Color.WHITE);
    }//GEN-LAST:event_txt_widthMouseClicked

    private void txt_widthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_widthFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_widthFocusGained

    private void txt_widthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_widthKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || (evt.getKeyChar() == 8) || (evt.getKeyChar() == 10) || evt.getKeyChar()== '.'))  {
            int l=txt_width.getText().length();//System.out.println(len);
        if((l<=5) || (evt.getKeyChar()==8)){
            String value = txt_width.getText();
            if((evt.getKeyChar() == '.') && value.contains(".")){
                txt_width.setEditable(false);
            }
            else{
                txt_width.setEditable(true);
                if((evt.getKeyChar() == 10)){
                    if("".equals(txt_length.getText()) || "".equals(txt_width.getText())){
                        if("".equals(txt_length.getText()) && "".equals(txt_width.getText())){
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH AND WIDTH OF RECTANGLE BOTH");
                            txt_length.setBackground(Color.YELLOW);
                            txt_width.setBackground(Color.YELLOW);
                        }
                        else if("".equals(txt_length.getText())){
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH OF RECTANGLE");
                            txt_length.setBackground(Color.YELLOW);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"PLEASE ENTER THE WIDTH OF RECTANGLE");
                            txt_width.setBackground(Color.YELLOW);
                        }
                    }
                    else{
                        calculate.requestFocus();calculate.setFocusable(true);
                    }
                }
            }
        }
        else{
            txt_width.setEditable(false);
        }
        }
        else {
            txt_width.setEditable(false);
        }
    }//GEN-LAST:event_txt_widthKeyPressed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_calculateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txt_length.setText("");
        txt_width.setText("");
        txt_Area.setText("");
        txt_Perimeter.setText("");
        txt_length.setBackground(Color.WHITE);
        txt_width.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MAIN_MENU obj=new MAIN_MENU();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        GeometricCalculator obj=new GeometricCalculator();
        obj.setVisible(true);
        CloseFrame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void calculateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calculateFocusGained
        // TODO add your handling code here:
        if("".equals(txt_length.getText()) || "".equals(txt_width.getText())){}
        else{
            float area=0,perimeter=0;
            float input_length=Float.parseFloat(txt_length.getText());
            float input_width=Float.parseFloat(txt_width.getText());
            RectangleSolver obj=new RectangleSolver(input_length,input_width);
            perimeter=obj.computeParimeter ();
            area=obj.computeArea ();
            txt_Perimeter.setText(String.valueOf(perimeter));
            txt_Area.setText(String.valueOf(area));
        }
    }//GEN-LAST:event_calculateFocusGained

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        // TODO add your handling code here:
        float area=0,perimeter=0;
        if("".equals(txt_length.getText()) || "".equals(txt_width.getText())){
            if("".equals(txt_length.getText()) && "".equals(txt_width.getText())){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH AND WIDTH OF RECTANGLE BOTH");
                txt_length.setBackground(Color.YELLOW);
                txt_width.setBackground(Color.YELLOW);
            }
            else if("".equals(txt_length.getText())){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE LENGTH OF RECTANGLE");
                txt_length.setBackground(Color.YELLOW);
            }
            else{
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE WIDTH OF RECTANGLE");
                txt_width.setBackground(Color.YELLOW);
            }
        }

        else{
            float input_length=Float.parseFloat(txt_length.getText());
            float input_width=Float.parseFloat(txt_width.getText());
            RectangleSolver obj=new RectangleSolver(input_length,input_width);
            perimeter=obj.computeParimeter ();
            area=obj.computeArea ();
            txt_Perimeter.setText(String.valueOf(perimeter));
            txt_Area.setText(String.valueOf(area));
        }
    }//GEN-LAST:event_calculateMouseClicked

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
            java.util.logging.Logger.getLogger(Rectangle_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rectangle_Solver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_Area;
    private javax.swing.JLabel txt_Perimeter;
    private javax.swing.JTextField txt_length;
    private javax.swing.JTextField txt_width;
    // End of variables declaration//GEN-END:variables

    private void CloseFrame() {
        super.dispose();
    }
}
