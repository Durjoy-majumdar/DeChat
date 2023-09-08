package com.tencent.xweb.file;

import java.io.File;

public class XVFSFile implements IFile {
    public static final String PATH_SEPARATOR = ":";
    public static final char PATH_SEPARATOR_CHAR = ':';
    public static final String SEPARATOR = "/";
    public static final char SEPARATOR_CHAR = '/';
    public IFile mFile;

    public XVFSFile(String str) {
        this.mFile = XFileManager.getProvider().createFile(str);
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

    public XVFSFile[] listFiles() {
        IFile[] listFiles = this.mFile.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return new XVFSFile[0];
        }
        XVFSFile[] xVFSFileArr = new XVFSFile[listFiles.length];
        for (int i = 0; i < listFiles.length; i++) {
            xVFSFileArr[i] = new XVFSFile(listFiles[i]);
        }
        return xVFSFileArr;
    }

    public XVFSFile(IFile iFile) {
        this.mFile = iFile;
    }

    public XVFSFile(File file) {
        this.mFile = XFileManager.getProvider().createFile(file);
    }

    public XVFSFile(String str, String str2) {
    }
}
