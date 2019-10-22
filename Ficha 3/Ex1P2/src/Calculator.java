import Exceptions.EmptyCollectionException;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class Calculator {

    ArrayStack<Integer> stack = new ArrayStack();

    public Calculator() {

    }

    /**
     *
     */
    public void ask() {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression :");
        input = sc.nextLine();
        processInput(input);
    }

    /**
     *
     * @param input
     */
    public void processInput(String input) {
        boolean success = true;

            String[] inarray = input.split(" ");
            for(int x = 0; x < inarray.length; x++){
                try {
                    Integer tmp = Integer.parseInt(inarray[x]);
                    if (tmp instanceof Integer) {
                        stack.push(tmp);
                    }
                }catch(Exception e){
                    calculate(inarray[x]);
                }
            }
            /*
            int ascii = (int) input.charAt(i);//passa o primeiro char da string a ascii

            if (ascii > 47 && ascii < 58) { //verifica se o codigo ascii corresponde a um digito de 0 a 9
                int a = Character.getNumericValue(input.charAt(i));//pega no valor numerico do char (um valor entre 0 e 9)
                stack.push(a);//manda pra stack
            } else if (ascii == 42 || ascii == 43 || ascii == 47 || ascii == 47) {//se o codigo ascii corresponder ao input de + - * ou /
                if (stack.size() >= 2) {//e se houver pelo menos 2 numeros na stack
                    calculate(ascii);//faz a operação com o input dado
                }
            }
        */
        System.out.println("stack: \n" + stack.toString());
    }

    /**
     *
     * @param op
     */
    public void calculate(String op) {
        int numb1 = 0, numb2 = 0, res = 0;
        String operation = op;

        try {
            switch (operation) {
                case "+":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 + numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "-":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 - numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "*":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 * numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                case "/":
                    numb1 = stack.pop();
                    numb2 = stack.pop();
                    res = numb1 / numb2;
                    stack.push(res);
                    System.out.println("result = " + res);
                    break;
                default:
                    break;
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
}
