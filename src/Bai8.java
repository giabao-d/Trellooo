
public class Bai8 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Bai8.class.getName());

    
    public Bai8() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        khungNhapSo = new javax.swing.JTextField();
        nutKiemTra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập số:");

        nutKiemTra.setText("Kiểm tra");
        nutKiemTra.addActionListener(this::nutKiemTraActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kiểm tra số nguyên tố");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(khungNhapSo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nutKiemTra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(khungNhapSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutKiemTra))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nutKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutKiemTraActionPerformed
        try{
        // 1. Lấy dữ liệu từ khung nhập
        String input = khungNhapSo.getText();
        int a = Integer.parseInt(input);
        
        // 2. Thuật toán kiểm tra số nguyên tố
        boolean laSoNguyenTo = true;
        
        if (a < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }
        
        // 3. Hiển thị thông báo kết quả
        if (laSoNguyenTo) {
            javax.swing.JOptionPane.showMessageDialog(this, a + " là số nguyên tố.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, a + " không phải là số nguyên tố.");
        }
        
    } catch (NumberFormatException e) {
        // Trường hợp người dùng nhập chữ hoặc để trống
        javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập một số nguyên hợp lệ!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_nutKiemTraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Bai8().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField khungNhapSo;
    private javax.swing.JButton nutKiemTra;
    // End of variables declaration//GEN-END:variables
}
