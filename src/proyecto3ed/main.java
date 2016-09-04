package proyecto3ed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import static org.graphstream.algorithm.Toolkit.diameter;

public class main extends javax.swing.JFrame {

    Graph grafo;

    public main() {
        initComponents();
        grafo = new MultiGraph("Amistades");
        grafo.setStrict(false);
        grafo.setAutoCreate(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdFriends = new javax.swing.JDialog();
        tfPerson1 = new javax.swing.JTextField();
        tfPerson2 = new javax.swing.JTextField();
        jlName1 = new javax.swing.JLabel();
        jlName2 = new javax.swing.JLabel();
        bVerify = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        bLoad = new javax.swing.JButton();
        bDraw = new javax.swing.JButton();
        bFriends = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        bExit = new javax.swing.JButton();
        bExtra = new javax.swing.JButton();

        jlName1.setText("Nombre Persona 1:");

        jlName2.setText("Nombre Persona 2:");

        bVerify.setText("Verificar Amistad");
        bVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVerifyMouseClicked(evt);
            }
        });

        taResult.setEditable(false);
        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        javax.swing.GroupLayout jdFriendsLayout = new javax.swing.GroupLayout(jdFriends.getContentPane());
        jdFriends.getContentPane().setLayout(jdFriendsLayout);
        jdFriendsLayout.setHorizontalGroup(
            jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdFriendsLayout.createSequentialGroup()
                .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlName1)
                            .addComponent(jlName2))
                        .addGap(36, 36, 36)
                        .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPerson2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPerson1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jdFriendsLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(bVerify)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdFriendsLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jdFriendsLayout.setVerticalGroup(
            jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdFriendsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPerson1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlName1))
                .addGap(18, 18, 18)
                .addGroup(jdFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPerson2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlName2))
                .addGap(18, 18, 18)
                .addComponent(bVerify)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLoad.setText("Cargar archivo txt");
        bLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLoadMouseClicked(evt);
            }
        });

        bDraw.setText("Dibujar Grafo");
        bDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDrawMouseClicked(evt);
            }
        });

        bFriends.setText("Verificar Amistades");
        bFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFriendsMouseClicked(evt);
            }
        });

        lTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lTitulo.setText("Red de amistades");

        bExit.setText("Salir");
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
        });

        bExtra.setText("Calcular Diametro");
        bExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExtraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(27, 27, 27)
                .addComponent(bLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoadMouseClicked
        try {
            String dir = System.getProperty("user.home");
            JFileChooser chooser = new JFileChooser(dir + "/Desktop");
            FileFilter filter = new FileNameExtensionFilter(null, "txt");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                if (chooser.getSelectedFile().getName().endsWith(".txt")) {
                    File file = chooser.getSelectedFile();
                    FileReader in = new FileReader(file);
                    BufferedReader reader = new BufferedReader(in);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(",")) {
                            String[] vertices = line.split(",");
                            Node nodo1 = null;
                            Node nodo2 = null;
                            if (grafo.getNode(vertices[0]) == null) {
                                grafo.addNode(vertices[0]);
                                nodo1 = grafo.getNode(vertices[0]);
                                nodo1.addAttribute("ui.label", vertices[0]);

                            } else {
                                nodo1 = grafo.getNode(vertices[0]);
                            }
                            if (grafo.getNode(vertices[1]) == null) {
                                grafo.addNode(vertices[1]);
                                nodo2 = grafo.getNode(vertices[1]);
                                nodo2.setAttribute("ui.label", vertices[1]);
                            } else {
                                nodo2 = grafo.getNode(vertices[1]);
                            }
                            if (grafo.getEdge(nodo1.getId() + nodo2.getId()) == null) {
                                grafo.addEdge(nodo1.getId() + nodo2.getId(), nodo1, nodo2, true).addAttribute("weight", 1);
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Se cargaron los datos al grafo con exito!");
                    reader.close();
                    in.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo invalido, debe cargar un archivo .txt!");
                }
            }
        } catch (IOException | NullPointerException e) {
            grafo.clear();
            JOptionPane.showMessageDialog(this, "Ocurrio un error cargando los datos. Revise si el archivo txt tiene el formato correcto (Persona1,Persona2)");
        }
    }//GEN-LAST:event_bLoadMouseClicked

    private void bDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDrawMouseClicked
        if (grafo.getEachNode() != null) {
            grafo.display(true).setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_bDrawMouseClicked

    private void bFriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFriendsMouseClicked
        if (grafo.getEachNode() != null) {
            jdFriends.setModal(true);
            jdFriends.setLocationRelativeTo(this);
            jdFriends.pack();
            tfPerson1.setText("");
            tfPerson2.setText("");
            taResult.setText("");
            jdFriends.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_bFriendsMouseClicked

    private void bVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerifyMouseClicked
        if (tfPerson1.getText().equals("") || tfPerson2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese ambos nombres (correctos) para poder verificar su amistad!");
        } else {
            taResult.setText("");
            Edge amistad1 = grafo.getEdge(tfPerson1.getText() + tfPerson2.getText());
            Edge amistad2 = grafo.getEdge(tfPerson2.getText() + tfPerson1.getText());
            
            if (amistad1 == null) {
                taResult.append(tfPerson1.getText() + " no conoce a " + tfPerson2.getText());
            } else {
                taResult.append(tfPerson1.getText() + " conoce a " + tfPerson2.getText());
            }
            if (amistad2 == null) {
                taResult.append("\n" + tfPerson2.getText() + " no conoce a " + tfPerson1.getText() + "\n");
            } else {
                taResult.append("\n" + tfPerson2.getText() + " conoce a " + tfPerson1.getText() + "\n");
            }
            if (amistad1 != null && amistad2 != null) {
                taResult.append("Por lo tanto, " + tfPerson1.getText() + " y " + tfPerson2.getText() + " son amigos!");
                tfPerson1.setText("");
                tfPerson2.setText("");
            } else {
                taResult.append("Por lo tanto, " + tfPerson1.getText() + " y " + tfPerson2.getText() + " no son amigos.");
                Node person1 = grafo.getNode(tfPerson1.getText());
                Node person2 = grafo.getNode(tfPerson2.getText());
                tfPerson1.setText("");
                tfPerson2.setText("");
                Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "weight");
                dijkstra.init(grafo);
                dijkstra.setSource(person1);
                dijkstra.compute();
                
                Path camino = dijkstra.getPath(person2);
                Node principal;
                if (!camino.getEdgePath().isEmpty()) {
                    principal = person1;
                } else {
                    principal = null;
                }
                if (!camino.getEdgePath().isEmpty() && principal != null) {
                    if (camino.getEdgePath().size() > 1) {
                        String separator="";
                        taResult.append("\n" + principal.getId() + " puede conocer a " + (principal == person1 ? person2.getId() : person1.getId()) + " a traves de las siguientes conecciones de amistades:\n");
                        taResult.append(principal.getId()+"->");
                        for (Edge edge : camino.getEdgePath()) {
                            if(edge.getTargetNode()==(principal==person1?person2:person1)){
                                separator="";
                            }else{
                                separator="->";
                            }
                            taResult.append(edge.getTargetNode().getId()+separator);
                        }
                    }
                } else {
                    taResult.append("\n-"+person1.getId() + " y " + person2.getId() + " no se pueden conocer a traves de sus amistades");
                }
            }
        }
    }//GEN-LAST:event_bVerifyMouseClicked

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        grafo.clear();
        System.exit(0);
    }//GEN-LAST:event_bExitMouseClicked

    private void bExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExtraMouseClicked
        if(grafo.getEachNode()!=null){
            double dens=diameter(grafo);
            JOptionPane.showMessageDialog(this, "El diametro del grafo es: "+dens);
        }else{
            JOptionPane.showMessageDialog(this, "No hay un grafo creado, cargue datos a partir de un archivo txt primero!");
        }
    }//GEN-LAST:event_bExtraMouseClicked

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
    private javax.swing.JButton bDraw;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bExtra;
    private javax.swing.JButton bFriends;
    private javax.swing.JButton bLoad;
    private javax.swing.JButton bVerify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jdFriends;
    private javax.swing.JLabel jlName1;
    private javax.swing.JLabel jlName2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField tfPerson1;
    private javax.swing.JTextField tfPerson2;
    // End of variables declaration//GEN-END:variables
}
