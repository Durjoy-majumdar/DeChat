package com.tencent.xweb.file;

public interface IFile {
    boolean delete();

    boolean exists();

    String getAbsolutePath();

    String getName();

    String getPath();

    boolean isDirectory();

    boolean isFile();

    String[] list();

    IFile[] listFiles();
}
