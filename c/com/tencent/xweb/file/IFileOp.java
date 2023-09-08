package com.tencent.xweb.file;

import java.io.InputStream;
import java.io.OutputStream;

public interface IFileOp {
    boolean copyFile(String str, String str2);

    String getFileMD5String(String str);

    InputStream openRead(String str);

    OutputStream openWrite(String str);
}
