
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class StartGame extends javax.swing.JFrame {
    
    private Player player;
    private Dealer dealer;
    private Deck deck;
    private Point lastPlayerCardPos;
    private Point lastDealerCardPos;
    private ArrayList<JLabel> extraCardsPrinted;
    
    
    public StartGame() {
        initComponents();
        
        // Set extra card numbers to 0
        extraCardsPrinted = new ArrayList<JLabel>();
        
        // Create the player
        player = new Player();

        // Create the dealer
        dealer = new Dealer();
        
        // Create the deck
        deck = new Deck();

        // Start a new round
        newRound();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        newRound = new javax.swing.JLabel();
        dealerTitle = new javax.swing.JLabel();
        playerTitle = new javax.swing.JLabel();
        optionsButton = new javax.swing.JToggleButton();
        restartButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        betButton = new javax.swing.JButton();
        betAmount = new javax.swing.JFormattedTextField();
        hitButton = new javax.swing.JButton();
        standButton = new javax.swing.JButton();
        doubleButton = new javax.swing.JButton();
        splitButton = new javax.swing.JButton();
        surrenderButton = new javax.swing.JButton();
        playerCard2 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        balanceTitle = new javax.swing.JLabel();
        balanceAmount = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blackjack");
        setLocationByPlatform(true);
        setResizable(false);

        panel.setOpaque(false);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newRound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/newRound.png"))); // NOI18N
        panel.add(newRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        dealerTitle.setBackground(new java.awt.Color(207, 38, 39));
        dealerTitle.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        dealerTitle.setForeground(java.awt.Color.white);
        dealerTitle.setText("Dealer");
        dealerTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dealerTitle.setOpaque(true);
        panel.add(dealerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        playerTitle.setBackground(new java.awt.Color(207, 38, 39));
        playerTitle.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        playerTitle.setForeground(java.awt.Color.white);
        playerTitle.setText("Player");
        playerTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerTitle.setOpaque(true);
        panel.add(playerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        optionsButton.setBackground(java.awt.Color.white);
        optionsButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        optionsButton.setText("OPTIONS");
        optionsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });
        panel.add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 50));

        restartButton.setBackground(java.awt.Color.white);
        restartButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        restartButton.setText("RESTART GAME");
        restartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restartButtonMouseClicked(evt);
            }
        });
        panel.add(restartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 50));

        menuButton.setBackground(java.awt.Color.white);
        menuButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        menuButton.setText("MAIN MENU");
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        panel.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 50));

        betButton.setBackground(java.awt.Color.white);
        betButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        betButton.setText("BET");
        betButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });
        panel.add(betButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, 160, 50));

        betAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        betAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        betAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        betAmount.setCaretColor(new java.awt.Color(253, 205, 68));
        betAmount.setDisabledTextColor(new java.awt.Color(129, 199, 132));
        betAmount.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        panel.add(betAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 140, 50));

        hitButton.setBackground(new java.awt.Color(129, 199, 132));
        hitButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        hitButton.setText("HIT");
        hitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        hitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitButtonActionPerformed(evt);
            }
        });
        panel.add(hitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 140, 50));

        standButton.setBackground(new java.awt.Color(255, 138, 101));
        standButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        standButton.setText("STAND");
        standButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        standButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standButtonActionPerformed(evt);
            }
        });
        panel.add(standButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 140, 50));

        doubleButton.setBackground(new java.awt.Color(178, 250, 180));
        doubleButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        doubleButton.setText("DOUBLE");
        doubleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        doubleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleButtonActionPerformed(evt);
            }
        });
        panel.add(doubleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 110, 40));

        splitButton.setBackground(new java.awt.Color(178, 250, 180));
        splitButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        splitButton.setText("SPLIT");
        splitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.add(splitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, 80, 40));

        surrenderButton.setBackground(new java.awt.Color(255, 187, 147));
        surrenderButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        surrenderButton.setText("SURRENDER");
        surrenderButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        surrenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surrenderButtonActionPerformed(evt);
            }
        });
        panel.add(surrenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 190, 40));
        panel.add(playerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 104, 158));
        panel.add(playerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 104, 158));
        panel.add(dealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 104, 158));
        panel.add(dealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 104, 158));

        balanceTitle.setBackground(new java.awt.Color(253, 205, 68));
        balanceTitle.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        balanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceTitle.setText("Balance ");
        balanceTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        balanceTitle.setOpaque(true);
        panel.add(balanceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 160, 50));

        balanceAmount.setBackground(java.awt.Color.white);
        balanceAmount.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        balanceAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        balanceAmount.setOpaque(true);
        panel.add(balanceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 140, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newRound() {
        
        // Shuffle the deck
        deck.shuffle();
        
        // Set the last positions as the positions of the initial cards
        // created by netbeans
        lastPlayerCardPos = new Point(500, 420);
        lastDealerCardPos = new Point(420, 30);
        
        // Make everything invisible and print the newround image when the round starts
        optionsButton.setVisible(false);
        restartButton.setVisible(false);
        menuButton.setVisible(false);
        hitButton.setVisible(false);
        standButton.setVisible(false);
        surrenderButton.setVisible(false);
        splitButton.setVisible(false);
        doubleButton.setVisible(false);
        betButton.setVisible(false);
        betAmount.setVisible(false);
        balanceTitle.setVisible(false);
        balanceAmount.setVisible(false);
        playerTitle.setVisible(false);
        dealerTitle.setVisible(false);
        playerCard1.setVisible(false);
        playerCard2.setVisible(false);
        dealerCard1.setVisible(false);
        dealerCard2.setVisible(false);
        
        newRound.setVisible(true);
        
        // Make everything visible after 500 milliseconds of showing the
        // newround image. We use a timer for this
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newRound.setVisible(false);
                
                // Set options button visible
                optionsButton.setVisible(true);
                
                // Set bet and balance buttons visible and enable them
                betButton.setVisible(true);
                betButton.setEnabled(true);
                betAmount.setVisible(true);
                betAmount.setEditable(true);
                balanceTitle.setVisible(true);
                balanceAmount.setText(player.getBalance() + "");
                balanceAmount.setVisible(true);
                
                // Set gameplay buttons visible but disable them
                // since bet needs to be taken first
                hitButton.setVisible(true);
                hitButton.setEnabled(false);
                standButton.setVisible(true);
                standButton.setEnabled(false);
                surrenderButton.setVisible(true);
                surrenderButton.setEnabled(false);
                splitButton.setVisible(true);
                splitButton.setEnabled(false);
                doubleButton.setVisible(true);
                doubleButton.setEnabled(false);
                
                // Set titles visible
                playerTitle.setVisible(true);
                dealerTitle.setVisible(true);
                
                // Print initial dealer and player cards (turned!)
                ImageIcon back = new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"));
                playerCard1.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
                playerCard2.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
                dealerCard1.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
                dealerCard2.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
                
                // Set the cards visible
                playerCard1.setVisible(true);
                playerCard2.setVisible(true);
                dealerCard1.setVisible(true);
                dealerCard2.setVisible(true);

            }
        });
        timer.setRepeats(false);
        timer.start();
        
        // Deal the initial cards
        player.addToHand(deck.getCard());
        player.addToHand(deck.getCard());
        dealer.addToHand(deck.getCard());
        dealer.addToHand(deck.getCard());

    }
    
    public void clearUp() {
        // Check if player has gone bankrupt
        if (player.getBalance() < 5) {
            int choice = JOptionPane.showOptionDialog(null, "Restart game?",
                    "House wins the game.", JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Restart", "Main Menu"}, "Restart");
            
            if (choice == JOptionPane.NO_OPTION) {
                new BlackjackUI().setVisible(true);
            } else {
                new StartGame().setVisible(true);
            }
            
            this.dispose();
            
        }
        
        // Remove extra cards from the panel
        for(JLabel card: extraCardsPrinted) {
            panel.remove(card);
        }
        extraCardsPrinted = new ArrayList<JLabel>();
        
        // Reset hands
        player.resetHand();
        dealer.resetHand();
        
        // Reset bet
        betAmount.setText("");
        
        // Start new round
        newRound();
    }
    
    private void restartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartButtonMouseClicked
        new StartGame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_restartButtonMouseClicked

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        new BlackjackUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuButtonMouseClicked

    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        // Self explanatory
        if (restartButton.isVisible()){
            restartButton.setVisible(false);
            menuButton.setVisible(false);
        } else {
            restartButton.setVisible(true);
            menuButton.setVisible(true);
        }
    }//GEN-LAST:event_optionsButtonActionPerformed

    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        // If a number is entered as a bet
        if (betAmount.getText().matches("[0-9]+")) {
            int bet = Integer.parseInt(betAmount.getText());
            // Minimum bet
            if (bet < 5) {
                JOptionPane.showMessageDialog(null, "Minimum bet is 5!", "You're underbetting!", JOptionPane.PLAIN_MESSAGE);
                betAmount.setText("");
                betAmount.setText(5 + "");
            }
            // If player can afford the bet
            else if (player.getBalance() >= bet) {
                // Set the player's bet
                player.setCurrentBet(bet);

                // Disable bet related part
                betButton.setEnabled(false);
                betAmount.setEditable(false);

                // Enable gameplay buttons
                hitButton.setEnabled(true);
                standButton.setEnabled(true);
                surrenderButton.setEnabled(true);
                
                // Enable double and split buttons only if the player can afford it
                if (player.getBalance() >= player.getCurrentBet()*2) {
                    doubleButton.setEnabled(true);
                    
                    // Check if cards are suitable
                    String card1name = player.getHand().get(0).getName();
                    String card1val = card1name.substring(0, card1name.length()-1);
                    String card2name = player.getHand().get(1).getName();
                    String card2val = card2name.substring(0, card2name.length()-1);
                    if (card1val.equals(card2val)) {
                        splitButton.setEnabled(true);
                    }
                }

                // Print initial cards
                ImageIcon pc1 = new javax.swing.ImageIcon(getClass().getResource("/resources/" + player.getHand().get(player.cardToPrint()).getName() + ".png"));
                playerCard1.setIcon(scaleImage(pc1, pc1.getIconWidth()*15/100, pc1.getIconHeight()*15/100));
                ImageIcon pc2 = new javax.swing.ImageIcon(getClass().getResource("/resources/" + player.getHand().get(player.cardToPrint()).getName() + ".png"));
                playerCard2.setIcon(scaleImage(pc2, pc2.getIconWidth()*15/100, pc2.getIconHeight()*15/100));

                ImageIcon dc1 = new javax.swing.ImageIcon(getClass().getResource("/resources/" + dealer.getHand().get(dealer.cardToPrint()).getName() + ".png"));
                dealerCard1.setIcon(scaleImage(dc1, dc1.getIconWidth()*15/100, dc1.getIconHeight()*15/100));
                
                // Check for natural blackjack
                // If the player has blackjack
                if (player.getHandValue() == 21) {
                    
                    // Wait before revealing the dealer card
                    Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Print the other card of the dealer
                        ImageIcon dc2 = new javax.swing.ImageIcon(getClass().getResource("/resources/" + dealer.getHand().get(dealer.cardToPrint()).getName() + ".png"));
                        dealerCard2.setIcon(scaleImage(dc2, dc2.getIconWidth()*15/100, dc2.getIconHeight()*15/100));
                        
                        // Wait before announcing result
                        Timer timer = new Timer(500, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // If dealer also has blackjack
                            if (dealer.getHandValue() == player.getHandValue()) {
                                JOptionPane.showMessageDialog(null, "Blackjack tie!", "You lost!", JOptionPane.PLAIN_MESSAGE);
                                player.bust();
                            } else {
                                JOptionPane.showMessageDialog(null, "Blackjack!", "You won!", JOptionPane.PLAIN_MESSAGE);
                                player.win();
                            }
                            clearUp();
                        }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                });
                timer.setRepeats(false);
                timer.start();

                }
            } else {
                JOptionPane.showMessageDialog(null, "You can't bet more than you have!", "You're overbetting!", JOptionPane.PLAIN_MESSAGE);
                betAmount.setText("");
                betAmount.setText((int) player.getBalance() + "");
            }  
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid amount!", "That's not a number?", JOptionPane.PLAIN_MESSAGE);
            betAmount.setText("");
        }

    }//GEN-LAST:event_betButtonActionPerformed

    private void surrenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surrenderButtonActionPerformed
        // Disable gameplay buttons
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        surrenderButton.setEnabled(false);
        splitButton.setEnabled(false);
        doubleButton.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Better luck next round!", "You surrendered.", JOptionPane.PLAIN_MESSAGE);
        player.surrender();
        clearUp();
    }//GEN-LAST:event_surrenderButtonActionPerformed

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
        // Disable gameplay buttons
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        surrenderButton.setEnabled(false);
        splitButton.setEnabled(false);
        doubleButton.setEnabled(false);

        // Get a new card for the player
        player.addToHand(deck.getCard());
        
        // Print the new card for the player
        // Print the back first and wait 500ms before printing the front
        JLabel newCard = new JLabel();
        ImageIcon back = new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"));
        // 104, 158 is the dimension of a card
        int newCard_x = lastPlayerCardPos.x - 120;
        int newCard_y = lastPlayerCardPos.y;
        panel.add(newCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(newCard_x, newCard_y, 104, 158), 0);
        newCard.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
        newCard.setVisible(true);
        
        // Add the extra printed cards here to remove them later in clearUp
        extraCardsPrinted.add(newCard);
        
        // Update last card position
        lastPlayerCardPos = new Point(newCard_x, newCard_y);
        
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon card = new javax.swing.ImageIcon(getClass().getResource("/resources/" + player.getHand().get(player.cardToPrint()).getName() +".png"));
                newCard.setIcon(scaleImage(card, card.getIconWidth()*15/100, card.getIconHeight()*15/100));
                
                // Check if the player busted
                if (player.getHandValue() > 21) {
                    JOptionPane.showMessageDialog(null, "Better luck next round!", "You busted!", JOptionPane.PLAIN_MESSAGE);
                    player.bust();
                    clearUp();
                }
                
                // Enable gameplay buttons
                hitButton.setEnabled(true);
                standButton.setEnabled(true);
                surrenderButton.setEnabled(true);
                splitButton.setEnabled(true);
                doubleButton.setEnabled(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_hitButtonActionPerformed

    private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
        // Disable gameplay buttons
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        surrenderButton.setEnabled(false);
        splitButton.setEnabled(false);
        doubleButton.setEnabled(false);

        // Print the other card of the dealer
        ImageIcon dc2 = new javax.swing.ImageIcon(getClass().getResource("/resources/" + dealer.getHand().get(dealer.cardToPrint()).getName() + ".png"));
        dealerCard2.setIcon(scaleImage(dc2, dc2.getIconWidth()*15/100, dc2.getIconHeight()*15/100));
        
        // Dealer has to hit 16 and stay 17
        // While dealer's hand is 17 and below 
        
        int timeToWait = 500;
        
        while (dealer.getHandValue() < 17) {
            
            // Get a new card for the dealer
            dealer.addToHand(deck.getCard());
            
            // Wait a bit for printing the cards
            Timer timer = new Timer(timeToWait, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Print the new card for the dealer
                    // Print the back first and wait 500ms before printing the front
                    JLabel newCard = new JLabel();
                    ImageIcon back = new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"));
                    // 104, 158 is the dimension of a card
                    int newCard_x = lastDealerCardPos.x + 120;
                    int newCard_y = lastDealerCardPos.y;
                    panel.add(newCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(newCard_x, newCard_y, 104, 158), 0);
                    newCard.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
                    newCard.setVisible(true);

                    // Add the extra printed cards here to remove them later in clearUp
                    extraCardsPrinted.add(newCard);

                    // Update last card position
                    lastDealerCardPos = new Point(newCard_x, newCard_y);
                    
                    // Wait a bit before revealing the cards
                    Timer timer2 = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ImageIcon card = new javax.swing.ImageIcon(getClass().getResource("/resources/" + dealer.getHand().get(dealer.cardToPrint()).getName() +".png"));
                        newCard.setIcon(scaleImage(card, card.getIconWidth()*15/100, card.getIconHeight()*15/100));
                    }
                    });
                    timer2.setRepeats(false);
                    timer2.start();
                }
            });
            timer.setRepeats(false);
            timer.start();
            
            // Increase time to wait
            timeToWait += 500;
        }

        Timer timer = new Timer(timeToWait, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check if the dealer busted
            if (dealer.getHandValue() > 21) {
                JOptionPane.showMessageDialog(null, "You won!", "Dealer busted!", JOptionPane.PLAIN_MESSAGE);
                player.win();
            } 
            // If not, compare hands
            else {
                if (dealer.getHandValue() >= player.getHandValue()) {
                    JOptionPane.showMessageDialog(null, "With " + player.getHandValue() + " against " + dealer.getHandValue() + "!", "You lost!", JOptionPane.PLAIN_MESSAGE);
                    player.bust();
                } else {
                    JOptionPane.showMessageDialog(null, "With " + player.getHandValue() + " against " + dealer.getHandValue() + "!", "You won!", JOptionPane.PLAIN_MESSAGE);
                    player.win();
                }
            }
            clearUp();
        }
        });
        timer.setRepeats(false);
        timer.start();
        
    }//GEN-LAST:event_standButtonActionPerformed

    private void doubleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleButtonActionPerformed

        // Double the bet
        player.setCurrentBet(player.getCurrentBet() * 2);
        betAmount.setText(player.getCurrentBet() + "");
        
        // Disable gameplay buttons
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        surrenderButton.setEnabled(false);
        splitButton.setEnabled(false);
        doubleButton.setEnabled(false);

        // Get a new card for the player
        player.addToHand(deck.getCard());
        
        // Print the new card for the player
        // Print the back first and wait 500ms before printing the front
        JLabel newCard = new JLabel();
        ImageIcon back = new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"));
        // 104, 158 is the dimension of a card
        int newCard_x = lastPlayerCardPos.x - 120;
        int newCard_y = lastPlayerCardPos.y;
        panel.add(newCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(newCard_x, newCard_y, 104, 158), 0);
        newCard.setIcon(scaleImage(back, back.getIconWidth()*15/100, back.getIconHeight()*15/100));
        newCard.setVisible(true);
        
        // Add the extra printed cards here to remove them later in clearUp
        extraCardsPrinted.add(newCard);
        
        // Update last card position
        lastPlayerCardPos = new Point(newCard_x, newCard_y);
        
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon card = new javax.swing.ImageIcon(getClass().getResource("/resources/" + player.getHand().get(player.cardToPrint()).getName() +".png"));
                newCard.setIcon(scaleImage(card, card.getIconWidth()*15/100, card.getIconHeight()*15/100));
                
                // Check if the player busted
                if (player.getHandValue() > 21) {
                    JOptionPane.showMessageDialog(null, "Better luck next round!", "You busted!", JOptionPane.PLAIN_MESSAGE);
                    player.bust();
                    clearUp();
                }
                // If not, stand (since it's basically the same thing)
                else {
                    standButtonActionPerformed(e);
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
        
    }//GEN-LAST:event_doubleButtonActionPerformed
    
    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
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
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGame().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel balanceAmount;
    private javax.swing.JLabel balanceTitle;
    private javax.swing.JFormattedTextField betAmount;
    private javax.swing.JButton betButton;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerTitle;
    private javax.swing.JButton doubleButton;
    private javax.swing.JButton hitButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel newRound;
    private javax.swing.JToggleButton optionsButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerTitle;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton splitButton;
    private javax.swing.JButton standButton;
    private javax.swing.JButton surrenderButton;
    // End of variables declaration//GEN-END:variables
}
