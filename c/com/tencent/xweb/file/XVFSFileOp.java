package com.tencent.xweb.file;

import java.io.InputStream;
import java.io.OutputStream;

public class XVFSFileOp {
    public static IFileOp sFileOp = XFileManager.getProvider().createFileOp();

    public static boolean copyFile(String str, String str2) {
        return sFileOp.copyFile(str, str2);
    }

    public static String getFileMD5String(String str) {
        return sFileOp.getFileMD5String(str);
    }

    public static InputStream openRead(String str) {
        return sFileOp.openRead(str);
    }

    public static OutputStream openWrite(String str) {
        return sFileOp.openWrite(str);
    }
}
