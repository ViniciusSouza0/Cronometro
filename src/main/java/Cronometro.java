/*
    Este código Java cria um cronômetro simples com uma interface gráfica usando a biblioteca Swing. Aqui está uma explicação passo a passo do que ele faz:

1. **Importações de Pacotes**: Importa os pacotes necessários para o programa, incluindo os relacionados ao Swing e ao gerenciamento de eventos.

2. **Declaração da Classe `Cronometro`**: Define a classe `Cronometro`, que estende a classe `JFrame`, ou seja, é uma janela Swing.

3. **Atributos**: Declara os atributos necessários para o cronômetro, incluindo um rótulo (`JLabel`) para exibir o tempo decorrido, um timer (`Timer`) para contar os segundos e um inteiro para 
    armazenar os segundos.

4. **Construtor**: Define o construtor da classe `Cronometro`. Dentro do construtor, a janela é configurada com um título, tamanho e operação de fechamento padrão. Um rótulo é criado 
    e adicionado à janela para exibir o tempo decorrido. Um timer também é configurado com um intervalo de 1000 milissegundos (1 segundo) e um ouvinte de ação para atualizar o rótulo a cada segundo.

5. **Método `iniciar()`**: Define um método `iniciar()` que inicia o timer. Este método é chamado no método `main()` para iniciar o cronômetro quando o programa é executado.

6. **Método `main()`**: Define o método `main()` que cria uma instância da classe `Cronometro`, torna a janela visível e inicia o cronômetro.

7. **Atualização do Rótulo**: O ouvinte de ação do timer incrementa a contagem de segundos a cada segundo e atualiza o texto do rótulo para mostrar o tempo decorrido em segundos.

8. **Execução do Programa**: O programa é executado e uma janela é exibida contando os segundos. O cronômetro continua até que a janela seja fechada pelo usuário.

Basicamente, o código cria uma interface gráfica simples para um cronômetro que conta os segundos e exibe o tempo decorrido em uma janela.
    
*/

import java.util.Timer;
import java.util.TimerTask;
public class Cronometro {


private int segundos = 0;
 private Timer timer;

public Cronometro() {
 timer = new Timer();
    }

public void iniciar() {
 timer.scheduleAtFixedRate(new TimerTask() {
   public void run() {
    segundos++;
      System.out.println("Tempo decorrido: " + segundos + " segundos");
            } 
        }, 1000, 1000);
    }
}
