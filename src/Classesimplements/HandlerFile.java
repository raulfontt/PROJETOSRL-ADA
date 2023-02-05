package Classesimplements;

import Model.MFileAnnotationTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class HandlerFile extends FileOrchestrator{

    private List<MFile> mFileList = new ArrayList<>();

    public HandlerFile(){
    }

    public HandlerFile (MFile mFile){
        if(mFile.getType().equals(MFileAnnotationTypeEnum.IMAGE)){
            mFileList.add(mFile);
            saveAllListOfImagesFiles(mFileList);
        }
    }

    public void salvarImagemComDiretorio(MFile mFile) {
    }

    public void listarArquivos(String directory) {
    }

    public void salvarComDiretorio(MFile mFile) {
    }
}
