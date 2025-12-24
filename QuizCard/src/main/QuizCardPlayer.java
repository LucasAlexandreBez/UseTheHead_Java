package main;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardPlayer {
	
	private ArrayList<QuizCard> cardList = new ArrayList<>(); 
	private int currentCardIndex;
	private QuizCard currentCard;
	private JTextArea display;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer;
	
	public static void main(String[] args) {
		QuizCardPlayer reader = new QuizCardPlayer();
		reader.go();
	}
	
	public void go() {
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		display = new JTextArea(10, 20);
		display.setFont(bigFont);
		display.setLineWrap(true);
		display.setEditable(false);
		
		JScrollPane scroller = new JScrollPane(display);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		mainPanel.add(scroller);
		
		nextButton = new JButton("Show Question");
		nextButton.addActionListener(e -> nextCard());
		mainPanel.add(nextButton);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem loadMenuItem = new JMenuItem("Load card set");
		loadMenuItem.addActionListener(e -> open());
		
		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	public void nextCard() {
		if (isShowAnswer) {
			display.setText(currentCard.getAnswer());
			nextButton.setText("Next Card");
			isShowAnswer = false;
		} else {
			if (currentCardIndex < cardList.size()) {
				showNextCard();
			} else {
				display.setText("That was last card");
				nextButton.setEnabled(false);
			}
		}
	}
	
	public void open() {
		JFileChooser fileOpen = new JFileChooser();
		fileOpen.showOpenDialog(frame);
		loadFile(fileOpen.getSelectedFile());
	}
	
	public void loadFile(File file) {
		try {			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				makeCard(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		showNextCard();
	}

	public void makeCard(String lineToParse) {
		String[] result = lineToParse.split("/");
		QuizCard card = new QuizCard(result[0], result[1]);
		cardList.add(card);
		System.out.println("Made a card");
	}
	
	public void showNextCard() {
		currentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		display.setText(currentCard.getQuestion());
		isShowAnswer = true;
		nextButton.setEnabled(true);
	}
	

}
