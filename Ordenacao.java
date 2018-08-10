/*
    Imprimir os valores recebidos em ordem crescente (sem parâmetros, sem retorno).
    Imprimir os valores recebidos em ordem decrescente (sem parâmetros, com retorno).
    Imprimir o maior e menor valor (com parâmetro, sem retorno).
    Devolver o número de valores maiores que 10 (com parâmetro, com retorno). 
    Somar os valores.*/

 /*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public class Ordenacao {
    
    private int[] array;
    
    /**
     * Recebe o array com o conteudo a ser ordenado
     * @param arrayParaOrdenar contem o conteudo a ser ordenado
     */
    public static void main(String[] args) {
        int[] arrayteste={0,3,2,4,5,1,2,10,2,45,100};
        Ordenacao(arrayteste);
        
    }

    public static void Ordenacao(int[] arrayParaOrdenar){
        int menor;
        menor=arrayParaOrdenar[0];
        for(int i=0;i<arrayParaOrdenar.length;i++){
            for(int j=0; j<arrayParaOrdenar.length;j++){
                if(arrayParaOrdenar[i]<arrayParaOrdenar[j]){
                    menor=arrayParaOrdenar[j];
                    arrayParaOrdenar[j]=arrayParaOrdenar[i];
                    arrayParaOrdenar[i]=menor;
                }        
            }
        }

        for(int i=0;i<arrayParaOrdenar.length;i++){
            System.out.print(" "+arrayParaOrdenar[i]);
        }

    }

    /**
     * Realiza a ordenacao do conteudo do array recebido no construtor
     * @return array com o conteudo ordenado
     */
    public int[] ordena() {

        //Coloque aqui o seu codigo que vai realizar a ordenacao

        int[] array = new int[4];

        return array;
    }
    
    
    /**
     * Converte o conteudo do array em String formatado
     * Exemplo: 
     * Para o conteudo do array: [1,2,3,4,5]
     * Retorna: "1,2,3,4,5"
     * @return String com o conteudo do array formatado
     */
    @Override
    public String toString(){
        
        //Coloque aqui o seu codigo que converte em String e formata o conteudo do array
        
        String array;
        array="alfafa";

        return array;
    }



}

