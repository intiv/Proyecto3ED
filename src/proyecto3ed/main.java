package proyecto3ed;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

public class main extends javax.swing.JFrame {
    Graph grafo;
    public main() {
        initComponents();
        grafo=new MultiGraph("Amistades");
        grafo.setStrict(false);
        grafo.setAutoCreate(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLoad.setText("Cargar archivo txt");
        bLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLoadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoadMouseClicked
        try{
            String dir=System.getProperty("user.home");
            JFileChooser chooser=new JFileChooser(dir+"/Desktop");
            FileFilter filter=new FileNameExtensionFilter(null,"txt");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                if(chooser.getSelectedFile().getName().endsWith(".txt")){
                    File file=chooser.getSelectedFile();
                    FileReader in=new FileReader(file);
                    BufferedReader reader=new BufferedReader(in);
                    String line;
                    while((line=reader.readLine())!=null){
                        if(line.contains(",")){
                            String[] vertices=line.split(",");
                            Node nodo1=null;
                            Node nodo2=null;
                            if(grafo.getNode(vertices[0])==null){
                                grafo.addNode(vertices[0]);
                                nodo1=grafo.getNode(vertices[0]);
                                nodo1.setAttribute("ui.label", vertices[0]);
                            }else{
                                nodo1=grafo.getNode(vertices[0]);
                            }
                            if(grafo.getNode(vertices[1])==null){
                                grafo.addNode(vertices[1]);                            
                                nodo2=grafo.getNode(vertices[1]);
                                nodo2.setAttribute("ui.label", vertices[1]);
                            }else{
                                nodo2=grafo.getNode(vertices[1]);
                            }
                            if(grafo.getEdge(nodo1.getId()+nodo2.getId())==null){
                                grafo.addEdge(nodo1.getId()+nodo2.getId(), nodo1, nodo2,true);
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Se cargaron los datos al grafo con exito!");
                    reader.close();
                    in.close();
                }else{
                    JOptionPane.showMessageDialog(this, "Archivo invalido, debe cargar un archivo .txt!");
                }
            }
        }catch(IOException|NullPointerException e){
            grafo.clear();
            JOptionPane.showMessageDialog(this, "Ocurrio un error cargando los datos. Revise si el archivo txt tiene el formato correcto (Persona1,Persona2)");
        }
    }//GEN-LAST:event_bLoadMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLoad;
    // End of variables declaration//GEN-END:variables
}
