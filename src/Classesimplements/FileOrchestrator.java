package Classesimplements;

import interfaces.FileDataBase;
import interfaces.ImageFileDataBase;
import Model.MFileAnnotationTypeEnum;

import java.io.File;
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
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {

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
}
