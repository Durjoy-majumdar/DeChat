package com.tencent.xweb.file;

import java.io.File;

public class DefaultFileImp implements IFile {
    public File mFile;

    public DefaultFileImp(File file) {
        this.mFile = file;
    }

    public boolean delete() {
        return this.mFile.delete();
    }

    public boolean exists() {
        return this.mFile.exists();
    }

    public String getAbsolutePath() {
        return this.mFile.getAbsolutePath();
    }

    public String getName() {
        return this.mFile.getName();
    }

    public String getPath() {
        return this.mFile.getPath();
    }

    public boolean isDirectory() {
        return this.mFile.isDirectory();
    }

    public boolean isFile() {
        return this.mFile.isFile();
    }

    public String[] list() {
        return this.mFile.list();
    }

    public IFile[] listFiles() {
        File[] listFiles = this.mFile.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return new IFile[0];
        }
        IFile[] iFileArr = new IFile[listFiles.length];
        for (int i = 0; i < listFiles.length; i++) {
            iFileArr[i] = new DefaultFileImp(listFiles[i]);
        }
        return iFileArr;
    }
}
