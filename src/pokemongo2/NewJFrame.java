/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongo2;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Timer;


/**
 *
 * @author hakan
 */
public class NewJFrame extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    
    static int clickCount;
    static int count = 0;
    static int numberofcards;
    static int usingNumberofcards;
    static int usersequence;
    static int comsequence;
    static int flag ;
    static boolean gameStatus = false;
    
    User user = new User();
    Computer computer = new Computer();
    Computer computer2 = new Computer();
    
    //static int player1score = User.score;
    //static int player2score;
    
    public NewJFrame() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jTextField1.setText("Player 1 Score: 0");

        jTextField2.setText("Player 2 Score: 0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("CHOOSE CARD");
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jToggleButton1.setText("User   vs  Computer      ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Computer vs Computer");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton1)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447)
                .addComponent(jButton2)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jToggleButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );

        jLabel3.getAccessibleContext().setAccessibleName("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    public ArrayList<Integer> createList(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
    
    public ArrayList<Integer> createList2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        
        Collections.shuffle(list);
        
        return list;
    }
    
    ArrayList<Integer> list2 = createList2(); 
    
    public ArrayList<Pokemon> createPokemonList(){
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        
        Bulbasaur bulbasaur = new Bulbasaur();
        Butterfree butterfree = new Butterfree();
        Pysduck pysduck = new Pysduck();
        Jigglypuff jigglypuff = new Jigglypuff();
        Squirtle squirtle = new Squirtle();
        Snorlax snorlax = new Snorlax();
        Meowth meowth = new Meowth();
        Zubat zubat = new Zubat();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        
        pokemonList.add(bulbasaur);
        pokemonList.add(butterfree);
        pokemonList.add(pysduck);
        pokemonList.add(jigglypuff);
        pokemonList.add(squirtle);
        pokemonList.add(meowth);
        pokemonList.add(charmander);
        pokemonList.add(pikachu);
        pokemonList.add(zubat);
        pokemonList.add(snorlax);
        
        numberofcards = pokemonList.size();
        
        return pokemonList;
    }
    
    ArrayList<Integer> arrList = createList();
    ArrayList<Pokemon> pokList = createPokemonList();
   
    
    public static int game(int damage1,int damage2){
        return (damage1-damage2);
    }
    
    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(evt.getSource() == jButton1 && flag ==2 ){
            gameStatus = true;
            
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
             
            for(int i=0;i<3;i++){
                computer2.computercardList.add(pokList.get(arrList.get(i)));
                usingNumberofcards ++;
            }
        
            for(int i=3;i<6;i++){
                computer.computercardList.add(pokList.get(arrList.get(i)));
                usingNumberofcards ++;
            }
            
            computer2.computercardList.add(pokList.get(arrList.get(6)));
            usingNumberofcards ++ ;
            computer.computercardList.add(pokList.get(arrList.get(7)));;
            usingNumberofcards ++ ;
           
            computer2.computercardList.add(pokList.get(arrList.get(8)));
            usingNumberofcards ++ ;
            computer.computercardList.add(pokList.get(arrList.get(9)));;
            usingNumberofcards ++ ;
            
            int delay = 2000;
            
            Timer timer = new Timer(delay,(ActionEvent e) -> {
                jLabel3.setIcon(computer2.computercardList.get(0).getImage()); // NOI18N
                jLabel10.setIcon(computer.computercardList.get(0).getImage()); // NOI18N
            
                int result1 = game(computer2.computercardList.get(0).damage_score(),computer.computercardList.get(0).damage_score());
            
                if(result1 > 0){
                   computer2.score +=5;
                }else if(result1 < 0){
                   computer.score +=5; 
                } 
                jTextField1.setText("Player 1 Score is: " + computer2.score);
                jTextField2.setText("Player 2 Score is: " + computer.score);
            });
            timer.setRepeats(false);
            timer.start();
            
            int delay1 = 4000;
            
            Timer timer1 = new Timer(delay1, (ActionEvent e) -> {
                jLabel3.setIcon(null); // NOI18N
                jLabel12.setIcon(computer2.computercardList.get(1).getImage()); // NOI18N
                jLabel10.setIcon(null); // NOI18N
                jLabel9.setIcon(computer.computercardList.get(1).getImage()); // NOI18N
                
                int result2 = game(computer2.computercardList.get(1).damage_score(),computer.computercardList.get(1).damage_score());
                
                if(result2 > 0){
                   computer2.score +=5;
                }else if(result2 < 0){
                   computer.score +=5; 
                }
                
                jTextField1.setText("Player 1 Score is: " + computer2.score);
                jTextField2.setText("Player 2 Score is: " + computer.score);
            });
            timer1.setRepeats(false);
            timer1.start();
            
            int delay2 = 6000;
            
            Timer timer2 = new Timer(delay2,(ActionEvent e)-> {
                jLabel12.setIcon(null); // NOI18N
                jLabel16.setIcon(computer2.computercardList.get(2).getImage()); // NOI18N
                jLabel9.setIcon(null); // NOI18N
                jLabel13.setIcon(computer.computercardList.get(2).getImage()); // NOI18N
                
                int result3 = game(computer2.computercardList.get(2).damage_score(),computer.computercardList.get(2).damage_score());
                
                if(result3 > 0){
                   computer2.score +=5;
                }else if(result3 < 0){
                   computer.score +=5; 
                }
                
                jTextField1.setText("Player 1 Score is: " + computer2.score);
                jTextField2.setText("Player 2 Score is: " + computer.score);
                
                
            });
            timer2.setRepeats(false);
            timer2.start();
            
            int delay3 = 8000;
            
            Timer timer3 = new Timer(delay3,(ActionEvent e)-> {
                jLabel16.setIcon(null);
                jLabel13.setIcon(null);
                jLabel15.setIcon(computer2.computercardList.get(3).getImage()); // NOI18N
                jLabel14.setIcon(computer.computercardList.get(3).getImage()); // NOI18N
                
                int result3 = game(computer2.computercardList.get(3).damage_score(),computer.computercardList.get(3).damage_score());
                
                if(result3 > 0){
                   computer2.score +=5;
                }else if(result3 < 0){
                   computer.score +=5; 
                }
                
                jTextField1.setText("Player 1 Score is: " + computer2.score);
                jTextField2.setText("Player 2 Score is: " + computer.score);
                
                
            });
            timer3.setRepeats(false);
            timer3.start();
            
            int delay4 = 10000;
            
            Timer timer4 = new Timer(delay4,(ActionEvent e)-> {
                jLabel8.setIcon(null); // NOI18N // NOI18N
                jLabel15.setIcon(computer2.computercardList.get(4).getImage()); // NOI18N
                jLabel14.setIcon(computer.computercardList.get(4).getImage()); // NOI18N
                
                int result3 = game(computer2.computercardList.get(4).damage_score(),computer.computercardList.get(4).damage_score());
                
                if(result3 > 0){
                   computer2.score +=5;
                }else if(result3 < 0){
                   computer.score +=5; 
                }
                
                jTextField1.setText("Player 1 Score is: " + computer2.score);
                jTextField2.setText("Player 2 Score is: " + computer.score);
                
                createFrame frame = new createFrame();
                frame.createNewFrame();
            });
            timer4.setRepeats(false);
            timer4.start();
            
    }//GEN-LAST:event_jButton1ActionPerformed
         else if(evt.getSource() == jButton1 && flag == 1){
             gameStatus = true;
         }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(evt.getSource() == jButton2 && gameStatus == true){
        if(evt.getSource() == jButton2 && clickCount == 0){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
             
            for(int i=0;i<3;i++){
                user.usercardList.add(pokList.get(arrList.get(i)));
                usingNumberofcards ++;
            }
        
            for(int i=3;i<6;i++){
                computer.computercardList.add(pokList.get(arrList.get(i)));
                usingNumberofcards ++;
            }
            clickCount ++;
        }else if (evt.getSource() == jButton2 && clickCount == 1){
            user.usercardList.add(pokList.get(arrList.get(6)));
            usersequence = 3;
            usingNumberofcards ++ ;
            computer.computercardList.add(pokList.get(arrList.get(7)));
            comsequence = 3;
            usingNumberofcards ++ ;
            
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            
            clickCount ++;
        }else if (evt.getSource() == jButton2 && clickCount == 2 ){
            user.usercardList.add(pokList.get(arrList.get(8)));
            usersequence = 4;
            usingNumberofcards ++ ;
            computer.computercardList.add(pokList.get(arrList.get(9)));
            comsequence = 4;
            usingNumberofcards ++ ;
            
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            
            count ++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        
        if(evt.getSource() == jLabel15 ){
            
            jLabel15.setIcon(user.usercardList.get(usersequence).getImage()); // NOI18N
            jLabel14.setIcon(computer.computercardList.get(comsequence).getImage()); // NOI18N
            
            int result = game(user.usercardList.get(usersequence).damage_score(),
                                computer.computercardList.get(comsequence).damage_score());
            
                if(result > 0){
                   user.score += 5 ;
                }else if(result < 0){
                   computer.score += 5; 
                } 
                jTextField1.setText("Player 1 Score is: " + user.getScore());
                jTextField2.setText("Player 2 Score is: " + computer.getScore());
            
            count ++;
        }
        if(usingNumberofcards == numberofcards){
            
            createFrame frame = new createFrame();
            frame.createNewFrame();
            
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        if(evt.getSource() == jLabel3 && list2.get(0) == 0){
            jLabel3.setIcon(null);
            jLabel10.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 0;
            comsequence = 0;
        }
        else if(evt.getSource() == jLabel3 && list2.get(0) == 1){
            jLabel3.setIcon(null);
            jLabel9.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 0;
            comsequence = 1;
        }
        else if(evt.getSource() == jLabel3 && list2.get(0) == 2){
            jLabel3.setIcon(null);
            jLabel13.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 0;
            comsequence = 2;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        
        if(evt.getSource() == jLabel12 && list2.get(1) == 0){
            jLabel12.setIcon(null);
            jLabel10.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 1;
            comsequence = 0;
        }
        else if(evt.getSource() == jLabel12 && list2.get(1) == 1){
            jLabel12.setIcon(null);
            jLabel9.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 1;
            comsequence = 1;
        }
        else if(evt.getSource() == jLabel12 && list2.get(1) == 2){
            jLabel12.setIcon(null);
            jLabel13.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 1;
            comsequence = 2;
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        
        if(evt.getSource() == jLabel16 && list2.get(2) == 0){
            jLabel16.setIcon(null);
            jLabel10.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 2;
            comsequence = 0;
        }
        else if(evt.getSource() == jLabel16 && list2.get(2) == 1){
            jLabel16.setIcon(null);
            jLabel9.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 2;
            comsequence = 1;
        }
        else if(evt.getSource() == jLabel16 && list2.get(2) == 2){
            jLabel16.setIcon(null);
            jLabel13.setIcon(null);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemongo2/pokemongo.png"))); // NOI18N
            usersequence = 2;
            comsequence = 2;
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jToggleButton1 && flag ==0){
            System.out.println("User vs Computer!");
            flag = 1;
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jToggleButton2  && flag ==0){
            System.out.println("Computer vs Computer!");
            flag = 2;
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
} 
