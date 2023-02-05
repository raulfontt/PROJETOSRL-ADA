package Classesimplements;

import Model.MFile;
import Model.MFileAnnotationTypeEnum;
import interfaces.FileDataBase;
import interfaces.FolderManagement;
import interfaces.ImageFileDataBase;

import java.util.ArrayList;
import java.util.List;

public class HandlerFile extends FileOrchestrator{

    private List<MFile> mFileList = new ArrayList<>();
    ImageFileDataBase imageFileDataBase;
    FileDataBase fileDatabase;
    FolderManagement folderManagement;


    public HandlerFile(){
        imageFileDataBase = new FileOrchestrator();
        fileDatabase = new FileOrchestrator();
    }

    public HandlerFile (MFile mFile){
        if(mFile.getType().equals(MFileAnnotationTypeEnum.IMAGE)){
            mFileList.add(mFile);
            saveAllListOfImagesFiles(mFileList);
        }
    }

    public void salvarImagemComDiretorio(MFile mFile) {
        fileDatabase.saveFile(mFile.getPath(), mFile.getContent(), mFile.getType(), mFile.getNameFile());
    }

    public void listarArquivos(String directory) {
    }

    public void salvarComDiretorio(MFile mFile) {
    }
}
