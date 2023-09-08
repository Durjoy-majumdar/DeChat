package com.tencent.xweb.file;

import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.MD5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DefaultFileOpImp implements IFileOp {
    public boolean copyFile(String str, String str2) {
        return FileUtils.copyFile(str, str2);
    }

    public String getFileMD5String(String str) {
        return MD5.getMD5(str);
    }

    public InputStream openRead(String str) {
        return new FileInputStream(str);
    }

    public OutputStream openWrite(String str) {
        return new FileOutputStream(str);
    }
}
