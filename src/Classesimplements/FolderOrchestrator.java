package Classesimplements;

import Model.MFileAnnotationTypeEnum;
import interfaces.FolderManagement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public abstract class FolderOrchestrator implements FolderManagement {

    @Override
    public void removeAFolder(String path) {

    }

    @Override
    public void listAllFoldersCreated() {

    }

    @Override
    public void createAFolder(String path, MFileAnnotationTypeEnum fileType) {
        String dir = "";
        switch (fileType) {
            case REMINDER -> dir = "reminders";
            case IMPORTANT -> dir = "importants";
            case IMAGE -> dir = "images";
            default -> dir = "";
        }
        try {
            boolean file = new File(path+"\\"+dir).exists();
            if (file) {
                System.out.println("diretorio ja existe");
            } else {
                boolean result = new File(path).mkdir();
                if (result) {
                    System.out.println(" DIRETORIO CRIADO COM SUCESSO ");
                }

            }

        } catch (Exception e) {
            System.out.println(" ERROR AO CRIAR DIRETORIO ");
        }
    }

    public void saveImageFile(String directory, String content, String nameFile){
        try {
            String dir = "imagens";
            BufferedImage image;
            URL url = new URL(content);
            image = ImageIO.read(url);
            String path = directory + "\\" + dir + "\\" + nameFile + ".jpg";
            ImageIO.write(image, "jpg", new File(path));
            System.out.println("Imagem salva com sucesso");
        } catch (Exception e) {
            System.out.println("error generico. imagem não foi salva");
        }
    }

    public abstract void saveImageFile(String directory, String content, MFileAnnotationTypeEnum fileType, String fileName);
}
