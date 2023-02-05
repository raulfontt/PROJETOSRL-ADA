package americanas.com.br.letscode;

import Classesimplements.HandlerFile;
import Classesimplements.MFile;
import Model.MFileAnnotationTypeEnum;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HandlerFile handlerFile = new HandlerFile();

        System.out.println("####### BEM VINDO AO MANIPULADOR DE ARQUIVOS VERS�O 0.2.1 ####### ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("MENU: ");
        System.out.println("Digite: (1) - Salvar Arquivo TXT, (2) - Salvar Imagem, (3) - Deletar Arquivo TXT, (4) Deletar Imagem," + "(5) Criar diret�rios " +
                "  (6) Recuperar Arquivo TXT, (7) - Salvar Conjunto de Arquivos TXT");

        System.out.println("Obs: Para as opera��es (1),(2),(3),(4) � necess�rio criar os diretorios iniciais (5) ");
        boolean loop = true;
        while (loop) {
            int inputNumber = scanner.nextInt();
            scanner.skip("((?<!\\R)\\s)*");
            switch (inputNumber) {
                case 1 -> {
                    System.out.println("Op��o Salvar Arquivo TXT");
                    System.out.println("Voc� pode criar 3 tipos de arquivos TXT");
                    System.out.println("(1) - REMINDER");
                    System.out.println("(2) - IMPORTANT");
                    System.out.println("(3) - SIMPLE");
                    System.out.println("Digite o n�mero da op��o desejada");
                    int typeNumberCreateDir = scanner.nextInt();
                    switch (typeNumberCreateDir) {
                        case 1 -> loop = createFile(handlerFile, MFileAnnotationTypeEnum.REMINDER);
                        case 2 -> loop = createFile(handlerFile, MFileAnnotationTypeEnum.IMPORTANT);
                        case 3 -> loop = createFile(handlerFile, MFileAnnotationTypeEnum.SIMPLE);
                    }
                }
                case 2 -> {
                    System.out.println("Op��o Salvar Imagem");
                    System.out.println("Digite agora o caminho do diret�rio");
                    String path = scanner.next();
                    System.out.println("Digite agora o nome do arquivo");
                    String nameFile = scanner.next();
                    System.out.println("Digite a URL da Imagem");
                    String urlFile = scanner.next();

                    MFile mFile = new MFile();
                    mFile.setFileName(nameFile);
                    mFile.setPath(path);
                    mFile.setContent(urlFile);

                    handlerFile.salvarImagemComDiretorio(mFile);

                    System.out.println("Programa Finalizado");
                    loop = false;
                }


            }
            if(inputNumber == 0){
                loop = false;
            }
        }

        System.out.println("LISTANDO ARQUIVOS");
        System.out.println("DIRET�RIO");
        String directory = scanner.nextLine();
        handlerFile.listarArquivos(directory);

    }

    public static Boolean createFile(HandlerFile handlerFile, MFileAnnotationTypeEnum fileType) {
        System.out.println("Op��o:" + fileType.name());
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do diret�rio: \n");
        String path = sc.nextLine();
        System.out.print("Digite o conte�do do arquivo: \n");
        String contentArq = sc.next();
        System.out.print("Digite o nome do arquivo: \n");
        String nameArq = sc.next();

        MFile mFile = new MFile();
        mFile.setType(fileType);
        mFile.setPath(path);
        mFile.setContent(contentArq);
        mFile.setFileName(nameArq);

        handlerFile.salvarComDiretorio(mFile);

        System.out.println("Programa Finalizado!");
        return false;
    }
}