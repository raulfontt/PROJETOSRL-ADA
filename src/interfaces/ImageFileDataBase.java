package interfaces;

import Model.MFileAnnotationTypeEnum;

public interface ImageFileDataBase {
    void saveImageFile (String directory, String content, String fileName);
    void recoveryImageFile(String directory);
    void removeImageFile (String directory, String nameFile);
    void listAllImageFiles(String directory);
}
