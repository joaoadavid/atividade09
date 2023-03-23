package application;

public class Programa {
	public interface Letra {
	    char[][] desenhar();
	}

	public class LetraA implements Letra {
	    @Override
		public char[][] desenhar() {
	       return new char [][] {
	          {'A', 'A', 'A', 'A', 'A'},
	          {'A', ' ', ' ', ' ', 'A'},
	          {'A', 'A', 'A', 'A', 'A'},
	          {'A', ' ', ' ', ' ', 'A'},
	          {'A', ' ', ' ', ' ', 'A'}
	        };
	      
	    }
	}

	public class Escritor {
	    public void escrever(char[][] arr) {
	        for (char [] linha : arr) {
	            for (char coluna : linha) {
	                System.out.print(coluna + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	public class Exemplo {
	    public static void main(String[] args) {
	        Letra letra = new LetraA();
	        char[][] arr = letra.desenhar();

	        Escritor escritor = new Escritor();
	        escritor.escrever(arr);
	    }
	}
}
