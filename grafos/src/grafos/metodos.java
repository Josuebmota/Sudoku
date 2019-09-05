package grafos;

public class metodos {
	 private int sudoku[][];
	 private int cor = 9;

	 metodos(int sudoku[][]) {
	    this.sudoku = sudoku;
	 }
	 
	 public boolean verificar() {
		 int i=0, j=0;
		 boolean certeza = false;
		 //selecionar as celulas vazias
		 for(int k=0; k<cor && !certeza; k++) {
			 for(int p=0; p<cor && !certeza; p++) {
				 if (sudoku[k][p] == 0) {
					 certeza = true;//afirma que o lugar está vazio
					 i=k;
					 j=p;
				 }
			 }
		 }
		 //Condição de parada
		 if(certeza==false) {
			 return true;
		 }
		 for(int x = 1; x<=cor; x++) {
			 //Verificar as premissas
			 if(premissas(i,j,x)==true) {
				 sudoku[i][j] = x; //atribuir cor
				 if(verificar()==true) {//chama novamente o verificar
					 return true;
				 }
				 sudoku[i][j] = 0; //Se o verificar for falso, logo a
				 				   //cor que eu coloquei antes não é
				 				   //adequada
			 }
		 }
		 return false;
	 }
	 
	 public boolean premissas(int i, int j, int x) {
		// verificar se tem na msm linha
	        for (int l = 0; l < cor; l++) {
	            if (sudoku[i][l] == x) {
	                return false;
	            }
	        }

	        //verificar se tem na msm coluna.
	        for (int c = 0; c < cor; c++) {
	            if (sudoku[c][j] == x) {
	                return false;
	            }
	        }

	        // verificar se tem o no msm quadrante(3x3).
	        //as duas proximas variaveis servem para localizar
	        //o seu quadradnte.
	        int nalinha = i - i % 3; 
	        int nacoluna = j - j % 3;

	        for (int l = 0; l < 3; l++) {
	            for (int c = 0; c < 3; c++) {
	                if (sudoku[nalinha + l][nacoluna + c] == x) {
	                    return false;
	                }
	            }
	        }
	        return true;
	 }
	 
	 public void resultado() {
		 if(verificar()==false) {//start do programa
			 System.out.println("Deu ruim");
		 }
		 for (int i = 0; i < cor; i++) { //printar a matriz verificada
			 for (int j = 0; j < cor; j++) {
				 System.out.print(sudoku[i][j] + " ");
	         }
	             System.out.println();
	     }
	 }
}
