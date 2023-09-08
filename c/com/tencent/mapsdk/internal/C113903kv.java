package com.tencent.mapsdk.internal;

import com.tencent.map.tools.Util;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: com.tencent.mapsdk.internal.kv */
public final class C113903kv {
    /* renamed from: a */
    private static String m157739a(String str) {
        return Util.getMD5String(str);
    }

    /* renamed from: a */
    private static String m157740a(byte[] bArr) {
        return Util.getMD5String(bArr);
    }

    /* renamed from: a */
    public static String m157738a(File file) {
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i2 = 0;
            for (i = 0; i < 16; i++) {
                byte b = digest[i];
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
