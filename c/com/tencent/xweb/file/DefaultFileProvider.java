package com.tencent.xweb.file;

import java.io.File;

public class DefaultFileProvider implements IFileProvider {
    public IFile createFile(String str) {
        return new DefaultFileImp(new File(str));
    }

    public IFileOp createFileOp() {
        return new DefaultFileOpImp();
    }

    public IFile createFile(File file) {
        return new DefaultFileImp(file);
    }
}
