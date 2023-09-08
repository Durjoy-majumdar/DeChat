package com.tencent.liteav.base.util;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tencent.liteav.base.util.i */
public final class C113471i {
    /* renamed from: a */
    public static long m155357a(File file, int i) {
        long j;
        long j2 = 0;
        if (i <= 0) {
            return 0;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j = m155357a(file2, i - 1);
                } else {
                    j = file2.length();
                }
                j2 += j;
            }
        } catch (Exception e) {
            LiteavLog.m16901i("FileUtil", "getFolderSize exception " + e.toString());
        }
        return j2;
    }

    /* renamed from: a */
    public static void m155359a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m155358a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
