package interfaces;

import Model.MFileAnnotationTypeEnum;

public interface FolderManagement {
    void createAFolder(String path);
    void removeAFolder(String path);
    void listAllFoldersCreated();
    void createAFolder(String path, MFileAnnotationTypeEnum fileType);
}
