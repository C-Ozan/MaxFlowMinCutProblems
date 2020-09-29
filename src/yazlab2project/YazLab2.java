package yazlab2project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;

public class YazLab2 extends javax.swing.JFrame {

    ArrayList<Valves> valveList = new ArrayList<>();
    int[][] Graph = new int[DO_NOTHING_ON_CLOSE][DO_NOTHING_ON_CLOSE];
    int[][] tempGraph = new int[DO_NOTHING_ON_CLOSE][DO_NOTHING_ON_CLOSE];
    int[] tempParents = new int[DO_NOTHING_ON_CLOSE];
    int[][] EdgeX = new int[DO_NOTHING_ON_CLOSE][DO_NOTHING_ON_CLOSE];
    int[][] EdgeY = new int[DO_NOTHING_ON_CLOSE][DO_NOTHING_ON_CLOSE];

    public YazLab2() {

        setTitle("MaxFlow-MinCut");

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NumberOfValve = new javax.swing.JTextField();
        DugumEkleBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pipeEntry = new javax.swing.JTextField();
        pipeExit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pipeCapacity = new javax.swing.JTextField();
        KenarEkleBtn = new javax.swing.JButton();
        MaxFlowIndicate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StartNode = new javax.swing.JTextField();
        EndNode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MinCutBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ClearPanelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        NumberOfValve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfValveActionPerformed(evt);
            }
        });

        DugumEkleBtn.setText("AddNode");
        DugumEkleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DugumEkleBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTRY");

        jLabel2.setText("EXIT");

        pipeEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeEntryActionPerformed(evt);
            }
        });

        pipeExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeExitActionPerformed(evt);
            }
        });

        jLabel3.setText("CAPACITY");

        KenarEkleBtn.setText("AddEdge");
        KenarEkleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KenarEkleBtnActionPerformed(evt);
            }
        });

        MaxFlowIndicate.setText("MaxFlowCalculater");
        MaxFlowIndicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxFlowIndicateActionPerformed(evt);
            }
        });

        jLabel4.setText("SourceNode");

        jLabel5.setText("TargetNode");

        StartNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartNodeActionPerformed(evt);
            }
        });

        jLabel6.setText("Result");

        MinCutBtn.setText("MinCutCalculater");
        MinCutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinCutBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Result");

        ClearPanelBtn.setText("ClearPanel");
        ClearPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearPanelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DugumEkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(NumberOfValve, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pipeEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pipeExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pipeCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(KenarEkleBtn)
                                            .addComponent(ClearPanelBtn))))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StartNode))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EndNode)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(295, 295, 295))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MaxFlowIndicate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MinCutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(NumberOfValve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DugumEkleBtn)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pipeEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pipeExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pipeCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KenarEkleBtn)
                        .addGap(30, 30, 30)
                        .addComponent(ClearPanelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartNode)
                    .addComponent(EndNode)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaxFlowIndicate)
                    .addComponent(MinCutBtn))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberOfValveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfValveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfValveActionPerformed

    private void DugumEkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DugumEkleBtnActionPerformed

        Graphics g = getGraphics();
        g.setColor(Color.white);
        Graphics a = getGraphics();
        valvePaint(g);


    }//GEN-LAST:event_DugumEkleBtnActionPerformed

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }

    private void pipeEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pipeEntryActionPerformed

    private void pipeExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pipeExitActionPerformed

    private void KenarEkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KenarEkleBtnActionPerformed

        Graphics g = getGraphics();
        g.setColor(Color.red);
        Edge(g);


    }//GEN-LAST:event_KenarEkleBtnActionPerformed

    private void MaxFlowIndicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxFlowIndicateActionPerformed

        Graphics g = getGraphics();
        String str1 = StartNode.getText();
        int startNode = Integer.parseInt(str1);
        String str2 = EndNode.getText();
        int endNode = Integer.parseInt(str2);

        int maxFlowResult = maximumFlow(Graph, startNode, endNode);

        /*for (Valves v : valveList) {

            for (int i = 0; i < tempParents.length; i++) {

                if (v.NodeID == tempParents[i]) {

                    g.setColor(Color.BLUE);
                    g.fillOval(v.x, v.y, 20, 20);

                }

            }
        }*/
        for (Valves v : valveList) {

            for (int i = 0; i < valveList.size(); i++) {

                if (v.NodeID == startNode) {

                    g.setColor(Color.BLACK);
                    g.fillOval(v.x, v.y, 20, 20);

                }
                if (v.NodeID == endNode) {

                    g.setColor(Color.blue);
                    g.fillOval(v.x, v.y, 20, 20);

                }

            }

        }
        jLabel9.setText(maxFlowResult + "  birimlik max. Akış sağlanmaktadır");
        boolean[][] boolGraph = new boolean[Graph.length][Graph.length];
        int x = 0;
        for (int i = 0; i < Graph.length; i++) {

            for (int j = 0; j < Graph.length; j++) {

                if (Graph[i][j] > 0 && boolGraph[i][j] == false) {

                    g.setColor(Color.GREEN);
                    boolGraph[i][j] = true;
                    g.drawString(tempGraph[i][j] + " /", EdgeX[i][j] - 30, EdgeY[i][j] - 5);
                }

                if (Graph[i][j] > 0 && Graph[j][i] > 0 && boolGraph[j][i] == false) {

                    g.setColor(Color.GREEN);
                    boolGraph[j][i] = true;
                    x = tempGraph[j][i] - Graph[j][i];

                    if (x < 0) {
                        x = 0;
                    } else if (x > 0) {
                        x = Graph[j][i];
                    }

                    g.drawString(Graph[j][i] + " /", EdgeX[i][j] + 10, EdgeY[i][j] + 30);
                }

            }

        }


    }//GEN-LAST:event_MaxFlowIndicateActionPerformed

    private void StartNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartNodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartNodeActionPerformed

    private void MinCutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinCutBtnActionPerformed

        String str1 = StartNode.getText();
        int start_Node = Integer.parseInt(str1);
        String str2 = EndNode.getText();
        int end_Node = Integer.parseInt(str2);

        minimumCut(Graph, start_Node, end_Node);


    }//GEN-LAST:event_MinCutBtnActionPerformed

    private void ClearPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearPanelBtnActionPerformed

        for (int i = 0; i < Graph.length; i++) {

            for (int j = 0; j < Graph.length; j++) {

                Graph[i][j] = 0;

            }

        }

        jPanel1.repaint();

    }//GEN-LAST:event_ClearPanelBtnActionPerformed

    void minimumCut(int[][] graph, int source, int target) {

        int node1, node2;
        int[] parents = new int[graph.length];
        int[][] residualGraph = new int[graph.length][graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                residualGraph[i][j] = graph[i][j];
            }
        }

        while (breadthFirstSearch(residualGraph, source, target, parents)) {

            int maxFlowPath = 1000;
            for (node2 = target; node2 != source; node2 = parents[node2]) {
                node1 = parents[node2];
                maxFlowPath = Math.min(maxFlowPath, residualGraph[node1][node2]);
            }

            for (node2 = target; node2 != source; node2 = parents[node2]) {
                node1 = parents[node2];
                residualGraph[node1][node2] = residualGraph[node1][node2] - maxFlowPath;
                residualGraph[node2][node1] = residualGraph[node2][node1] + maxFlowPath;
            }
        }

        boolean[] visited = new boolean[graph.length];
        depthFirstSearch(residualGraph, source, visited);

        String minCutEdges = "";

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] > 0 && visited[i] && !visited[j]) {

                    minCutEdges = minCutEdges + i + "--" + j + ",";

                }
            }

        }

        jLabel10.setText(minCutEdges + "Kenarlari kaldırılmalıdır");
    }

    void depthFirstSearch(int[][] residualGraph, int source, boolean[] visited) {
        visited[source] = true;
        for (int i = 0; i < residualGraph.length; i++) {
            if (residualGraph[source][i] > 0 && !visited[i]) {
                depthFirstSearch(residualGraph, i, visited);
            }
        }
    }

    boolean breadthFirstSearch(int[][] residualGraph, int source, int target, int[] parents) {

        boolean visited[] = new boolean[residualGraph.length];
        LinkedList<Integer> queueStruct = new LinkedList<Integer>();
        visited[source] = true;
        parents[source] = -100;

        queueStruct.add(source);

        for (int i = 0; i < residualGraph.length; i++) {
            visited[i] = false;
        }

        while (queueStruct.size() != 0) {
            int node1 = queueStruct.poll();

            for (int node2 = 0; node2 < residualGraph.length; node2++) {
                if (visited[node2] == false && residualGraph[node1][node2] > 0) {
                    queueStruct.add(node2);
                    parents[node2] = node1;
                    visited[node2] = true;
                }
            }
        }

        return (visited[target] == true);
    }

    int maximumFlow(int graph[][], int source, int target) {

        int node1, node2;
        int maxFlow = 0;
        int parent[] = new int[graph.length];
        int[][] residualGraph = new int[graph.length][graph.length];
        tempParents = new int[graph.length];

        for (node1 = 0; node1 < graph.length; node1++) {
            for (node2 = 0; node2 < graph.length; node2++) {
                residualGraph[node1][node2] = graph[node1][node2];
            }
        }

        while (breadthFirstSearch(residualGraph, source, target, parent)) {

            int pathFlow = 1000;
            for (node2 = target; node2 != source; node2 = parent[node2]) {
                node1 = parent[node2];
                pathFlow = Math.min(pathFlow, residualGraph[node1][node2]);
            }

            for (node2 = target; node2 != source; node2 = parent[node2]) {
                node1 = parent[node2];
                residualGraph[node1][node2] -= pathFlow;
                residualGraph[node2][node1] += pathFlow;
            }

            maxFlow += pathFlow;
        }
        tempGraph = residualGraph;
        tempParents = parent;

        return maxFlow;
    }

    public void Edge(Graphics g) {

        String str1 = pipeEntry.getText();
        String str2 = pipeExit.getText();
        String str3 = pipeCapacity.getText();
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int capacity = Integer.parseInt(str3);
        int flag = 0;

        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 0;

        Graph[i][j] = capacity;

        for (Valves v : valveList) {

            if (v.NodeID == i) {
                x1 = v.x;
                y1 = v.y;
            }
            if (v.NodeID == j) {

                x2 = v.x;
                y2 = v.y;
            }

        }

        int ort1 = (x1 + x2) / 2;
        int ort2 = (y1 + y2) / 2;

        EdgeX[i][j] = ort1;
        EdgeY[i][j] = ort2;

        if (Graph[j][i] > 0) {

            g.setColor(Color.RED);
            g.drawLine(x1 + 15, y1 + 15, x2 + 15, y2 + 15);
            g.drawString("" + Graph[i][j], ort1 + 30, ort2 + 30);

            flag++;

        }
        if (flag == 0) {
            g.setColor(Color.ORANGE);
            g.drawLine(x1 + 5, y1 + 5, x2 + 5, y2 + 5);
            g.drawString("" + capacity, ort1 - 10, ort2 - 5);
        }

    }

    public void valvePaint(Graphics g) {

        String str1 = NumberOfValve.getText();

        int x = Integer.parseInt(str1);
        Graph = new int[x][x];
        EdgeX = new int[x][x];
        EdgeY = new int[x][x];
        int x1 = 120, y1 = 200, x2 = 120, y2 = 300;

        /*for (int i = 0; i < x; i++) {

            valveList.add(new Valves());

        }*/
        for (int i = 0; i < x; i++) {

            Valves valve = new Valves(i);

            if (i == 0) {
                valve.x = x1 - 20;
                valve.y = y1 + 50;

                valveList.add(valve);

            } else if (i % 2 == 0) {

                x2 = x2 + 100;
                valve.x = x2;
                valve.y = y2 + 40;
                valveList.add(valve);

            }

            if (i % 2 == 1) {

                x1 = x1 + 100;
                valve.x = x1;
                valve.y = y1 - 40;
                valveList.add(valve);

            }

        }

        for (Valves v : valveList) {

            g.fillOval(v.x, v.y, 20, 20);
            g.drawString("" + v.NodeID, v.x - 10, v.y - 5);

        }

    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(YazLab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YazLab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YazLab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YazLab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YazLab2().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearPanelBtn;
    private javax.swing.JButton DugumEkleBtn;
    private javax.swing.JTextField EndNode;
    private javax.swing.JButton KenarEkleBtn;
    private javax.swing.JButton MaxFlowIndicate;
    private javax.swing.JButton MinCutBtn;
    private javax.swing.JTextField NumberOfValve;
    private javax.swing.JTextField StartNode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pipeCapacity;
    private javax.swing.JTextField pipeEntry;
    private javax.swing.JTextField pipeExit;
    // End of variables declaration//GEN-END:variables
}
