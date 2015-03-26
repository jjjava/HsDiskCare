package br.com.schumaker.gfx;

import br.com.schumaker.core.FrCoreMain;

/**
 *
 * @author hudson schumaker
 */
public class FrMain extends javax.swing.JFrame {

    /**
     * Creates new form FrMain
     */
    public FrMain() {
        System.setProperty("apple.laf.useScreenMenuBar", "true");//integrar com o finder
        initComponents();
        setLocationRelativeTo(null);
        FrCoreMain.getInstance().setMacintoshHD(jProgressBar1);
        FrCoreMain.getInstance().setTotalSpace(jlTotalSpace);
        FrCoreMain.getInstance().setFreeSpace(jlFreeSpace);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jlTotalSpace = new javax.swing.JLabel();
        jlFreeSpace = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HsDiskCare");

        jProgressBar1.setStringPainted(true);

        jlTotalSpace.setText("Total Space:");

        jlFreeSpace.setText("Free Space:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTotalSpace)
                            .addComponent(jlFreeSpace))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlTotalSpace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFreeSpace)
                .addGap(30, 30, 30)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jlFreeSpace;
    private javax.swing.JLabel jlTotalSpace;
    // End of variables declaration//GEN-END:variables
}
