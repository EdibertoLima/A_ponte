/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_ponte;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Betim
 */
public class janela_caro extends javax.swing.JFrame {

    /**
     * Creates new form janela_caro
     */
    public janela_caro() {
       
        
        initComponents();
        novocar x = new novocar();
        x.getT(25,5);
        x.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a_ponte/p7irh6n6j186ih4s90k26o7g0tq7ok6ja.png"))); // NOI18N
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded
    
    public class novocar extends Thread{
        int x=0;
        int vx,te,i=1;
        boolean t=true;
        JLabel lcar = new JLabel(new ImageIcon(getClass().getResource("carro_medio.png")));
        
        public void getT(int vx,int te){
            this.vx = vx;
            this.te = te;
            
        }
        public int dir = 1;
        public void run() {
            adcar(lcar);
            
            ImageIcon iccarm = new ImageIcon(getClass().getResource("carro_medio.png"));
            JLabel lcarm = new JLabel(iccarm);
            ImageIcon iccarm1 = new ImageIcon(getClass().getResource("carro_medio1.png"));
            JLabel lcarm1 = new JLabel(iccarm1);
             
         
            while(t){
                try{Thread.sleep(vx);}catch(Exception erro){}
                lcar.setBounds(lcar.getX()+this.i, 300, 45, 18);
               if(x>10){
                lcar.setIcon(iccarm);
                x++;
                System.out.println(x);}
                if(x<=10|| x>20 ){
                lcar.setIcon(iccarm1);
                x++;
                System.out.println(x);
                }else x=0;            
                //lcar = new JLabel(new ImageIcon(getClass().getResource("carro_rapido.png")));
                if(lcar.getX()>=500 || lcar.getX()<=100){
                    i=-i;
                    try{Thread.sleep(te*1000);}catch(Exception erro){}
                   
                }    
            }
            
        }
        
    }     public void adcar(JLabel x){
          
        x.setBounds(100, 0, 45, 18);
        add(x);

    }
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
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new janela_caro().setVisible(true);
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}