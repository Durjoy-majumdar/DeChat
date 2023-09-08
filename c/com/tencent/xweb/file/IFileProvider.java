package com.tencent.xweb.file;

import java.io.File;

public interface IFileProvider {
    IFile createFile(File file);

    IFile createFile(String str);

    IFileOp createFileOp();
}
