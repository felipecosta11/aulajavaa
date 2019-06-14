package view;
import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor prof = new Professor();
		
		prof.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		prof.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
		prof.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		prof.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		prof.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "CEP: ")));
		prof.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		prof.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg: ")));
		prof.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF: ")));
		
		System.out.println(prof.getNome());
		System.out.println(prof.getEndereco());
		System.out.println(prof.getBairro());
		System.out.println(prof.getCidade());
		System.out.println(prof.getCep());
		System.out.println(prof.getEstado());
		System.out.println(prof.getRg());
		System.out.println(prof.getCpf());
		
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Disciplinas você possui?"));
			String disciplinas[] = new String[dis];
			for (int i = 0; i < dis; i++) {
				disciplinas [i] = JOptionPane.showInputDialog(null, "Digite a sua disciplina " + i );
			}
			prof.setDisciplinas(disciplinas);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
			String cursos [] = new String [cur];
			for( int i = 0; i < cur; i++) {
				cursos [i] = JOptionPane.showInputDialog(null, "Digite o curso"+ i);
				
			}prof.setCursos(cursos);
			
		}catch (Exception e ) {
			e.printStackTrace();
			
		}
		try {
			for(int i=0; i< prof.getDisciplinas().length; i++) {
				System.out.println(prof.getDisciplinas()[i]);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			for(int i = 0; i < prof.getCursos().length; i++) {
				System.out.println(prof.getCursos()[i]);
				
			}
		}catch(Exception e) {
				e.printStackTrace();
				
			
		}
		

	}

}
