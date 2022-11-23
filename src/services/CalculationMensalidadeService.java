package services;

import entities.Aluno;
import entities.Curso;

public class CalculationMensalidadeService implements CalculateService {

	@Override
	public void calc(int op, Aluno al, Curso c) {
		switch(op) {
			case 1:
				al.setC(c);
				al.setValorMensalidade(500.00);
				System.out.println("CREATED !!!");
				break;
			case 2:
				al.setC(c);
				al.setValorMensalidade(450.00);
				System.out.println("CREATED !!!");
				break;
			case 3:
				al.setC(c);
				al.setValorMensalidade(300.00);
				System.out.println("CREATED !!!");
				break;
			default:
				al.setC(c);
				al.setValorMensalidade(600.00);
				System.out.println("CREATED !!!");
				break;
		}
		
	}
	
}
