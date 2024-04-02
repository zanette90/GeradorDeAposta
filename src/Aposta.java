import java.util.HashSet;
import java.util.Random;

    public class Aposta {
        private Random random;
        private HashSet<Integer> numerosJogados;
        private int numeroAleatorio;

        public Aposta() {
            this.random = new Random();
            this.numerosJogados = new HashSet<>();
        }
        public int getNumeroAleatorio() {
            return numeroAleatorio;
        }

        public int geraNumero() {

            numeroAleatorio = random.nextInt(1,61) ;
            while(numerosJogados.contains(numeroAleatorio)){
                numeroAleatorio = random.nextInt(1,61);
            }
            numerosJogados.add(numeroAleatorio);
            return numeroAleatorio;
        }
        public void limpalista(){
            this.numerosJogados.clear();
        }

    }

