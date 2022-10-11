package br.joaovictor.swing.frame;

public class Main {
    public static void main(String[] args) {
        /*Vc pode deixar dentro ou fora da classe Main
		//JFrame = Uma página GUI a qual poderemos adicionar componetes

		JFrame frame = new JFrame();//Cria uma página
		frame.setTitle("Título");//Decide o título da página
		frame.setSize(420,420); //decide as dimensões da página

		//Por default, mesmo que vc feche a página a operação continuará
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Esse é o default
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Agora, quando vc fechar a página a opeção acaba

		frame.setResizable(false);//Decide se o tamanho da página pode ou não ser modificado pelo mouse. Tambem impede de ficar tela cheia

		ImageIcon image = new ImageIcon("logoGUI.jpg");//Cria uma ImageIcon
		frame.setIconImage(image.getImage());//Muda o icone da página

		//Dessa forma vc pode mudar a cor de fundo
		//Vc pode escolher entre algumas cores fixas ou pode escolher uma cor especifica
		//frame.getContentPane().setBackground(Color.green);
		frame.getContentPane().setBackground(new Color(195, 141, 212));

		frame.setVisible(true); //Torna a página visivel
		*/

        //Vc pode chamar somente o construtor ou criar um objeto se for necessario
        new MyFrame();
        //MyFrame myFrame = new MyFrame();
    }
}