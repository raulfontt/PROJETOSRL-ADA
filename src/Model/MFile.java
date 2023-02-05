package Model;

import Model.MFileAnnotationTypeEnum;

public class MFile {
    private String content;
    private String nameFile;
    private MFileAnnotationTypeEnum type;
    private String path;

    public String getPath() {
        return path;
    }

    public MFile(){
    }

    public MFile(String content, String nameFile, MFileAnnotationTypeEnum type) {
        this.content = content;
        this.nameFile = nameFile;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public MFileAnnotationTypeEnum getType() {
        return type;
    }

    public void setType(MFileAnnotationTypeEnum type) {
        this.type = type;
    }

    public void setFileName(String nameFile) {
    }

    public void setPath(String path) {
        this.path = path;
    }
}
