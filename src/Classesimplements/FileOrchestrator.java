package Classesimplements;

import Model.MFile;
import interfaces.FileDataBase;
import interfaces.ImageFileDataBase;
import Model.MFileAnnotationTypeEnum;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDataBase, FileDataBase {

    File file;

    List<MFile> mFileList = new ArrayList<>();

    public void saveAllListOfImagesFiles(List<MFile> mImageFileList){
        for (MFile lista: mImageFileList) {
            file = new File("C:\\Users\\raulh\\OneDrive\\Documentos\\DEV\\PROJETOSRL-ADA\\src\\Diretorios");
            if (file.exists()){
                saveImageFile("C:\\Users\\raulh\\OneDrive\\Documentos\\DEV\\PROJETOSRL-ADA\\src\\Diretorios",
                        lista.getContent(),
                        lista.getNameFile());
            }else System.out.println("Diretório não existe");
        }
    }


    @Override
    public void saveImageFile(String directory, String content, String nameFile) {
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

    @Override
    public void saveImageFile(String directory, String content, MFileAnnotationTypeEnum fileType, String fileName) {

    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImageFiles(String directory) {

    }

    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum filetype, String nameFile) {
        String dir;
        switch (filetype) {
            case REMINDER -> dir = "\\reminders";
            case IMPORTANT -> dir = "\\importants";
            case IMAGE -> dir = "\\images";
            default -> dir = "";
        }
        super.createAFolder(directory+dir, filetype);

        String path = directory + dir + "\\" + nameFile + ".txt";


        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    @Override
    public void recoveryFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void listAllFiles(String directory, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void createAFolder(String path) {

    }
}
