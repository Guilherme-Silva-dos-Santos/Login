import java.util.Scanner;

public class login {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            var login = "adm"; //declarando login e senha nas variáveis
            var senha = 123;
            for (var i = 3; i >=1 ; i--) { //A contagem regressiva das tentativas de login
                System.out.printf("Você tem %s tentativas de login\n", i);//mostrando ao usuario as suas tentativas restantes
                System.out.println("Digite o seu login:");
                var loginDigitado = scanner.next();
                if (loginDigitado.equals(login)) { //comparando o que foi digitado se corresponde a senha
                    for (var j = 3; j >=1; j--){ // se login estiver correto começa a contagem para as tentativas para acertar a senha
                        System.out.printf("você tem %s tentativas!\nAgora digite a senha:",j);
                        var senhaDigitada = scanner.nextInt();

                        if (senhaDigitada == senha) {
                            System.out.println("Acesso Permitido!");
                            break; // senha coincidindo o sistema dá uma mensagem de Acesso permitido rompendo o laço
                        } else if (j <= 1) {
                            //se caso as tentativas de senha forem esgotadas o sistema mostra mensagem de erro e encerra o laço
                            System.out.println("Senha errada! Tente novamente mais tarde!");
                            break;
                        }else {
                            //caso o usuario ainda tenha mais tentativas mostra essa mensagem de erro e volta para o inicio do laço
                            System.out.println("Senha errada, tente novamente.");
                        }

                    }break; //rompendo laço quando o login estiver correto

                } else if (i <= 1) {
                    //se as tentativas de login forem esgotadas o sistema mostra erro e rompe o laço
                    System.out.println("Login errado! Tente novamente mais tarde!");
                    break;
                }else {
                    //caso o usuario ainda tenha tentivas de login ele mostra essa mensagem de erro e volta para o inicio do laço
                    System.out.println("Login errado, tente novamente!");
                }

            }
        }
    }
