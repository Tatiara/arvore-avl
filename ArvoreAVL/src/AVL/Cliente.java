package AVL;
import java.io.*;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author  AMS
 */
public class Cliente extends javax.swing.JFrame {
    LeArquivo arquivo;
    ArvoreAVL arvore;
    String arquivoInteiro ="";
    
    /** Creates new form Cliente */
    public Cliente() {
        initComponents();
        try {
            arquivo = new LeArquivo();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        arvore = new ArvoreAVL();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        edCodigo = new javax.swing.JTextField();
        edNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                esconder(evt);
            }
        });

        jLabel1.setText("C\u00f3digo:");

        jLabel2.setText("Nome:");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Procurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Novo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Cadastro de Clientes - Usando Arvores AVL");

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o c�digo do cliente a ser removido"));
        if (arvore.remover(codigo,arvore.raiz)) {
            edCodigo.setText("");
            edNome.setText("");                        
        } else
            JOptionPane.showMessageDialog(this, "Registro n�o encontrado");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void esconder(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_esconder
        try {
            arquivo.limpa("cliente.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_esconder

    private void fechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar
        try {
            arquivo.limpa("cliente.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_fechar

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o c�digo do cliente"));
        if (arvore.procurar(codigo)) {
            edCodigo.setText("" + codigo);
            edNome.setText(arquivo.nome(codigo));                    
        } else 
            JOptionPane.showMessageDialog(this, "Registro n�o encontrado");        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (arvore.procurar(Integer.parseInt(edCodigo.getText())))
            JOptionPane.showMessageDialog(this, "Codigo de registro j� existe");
        else {
            try {
                arvore.inserir(Integer.parseInt(edCodigo.getText()));
                arquivoInteiro = arquivo.le("cliente.txt");
                arquivo.grava("cliente.txt", arquivoInteiro + "Codigo:" + edCodigo.getText() + " Nome: " + edNome.getText());
            } catch (IOException ex) {
                System.out.println("Erro na leitura / grava��o");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        edCodigo.setText("");
        edNome.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edCodigo;
    private javax.swing.JTextField edNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}