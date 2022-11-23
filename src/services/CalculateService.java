package services;

import entities.Aluno;
import entities.Curso;

public interface CalculateService {
	 void calc(int op, Aluno al, Curso c);
}
