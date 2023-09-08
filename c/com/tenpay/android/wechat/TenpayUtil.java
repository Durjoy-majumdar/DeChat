package com.tenpay.android.wechat;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.ndk.Encrypt;
import java.lang.reflect.Field;
import java.security.MessageDigest;

public class TenpayUtil {
    public static final int getResourceDeclareStyleableIndex(Context context, String str) {
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return field.getInt((Object) null);
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static final int[] getResourceDeclareStyleableIntArray(Context context, String str) {
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get((Object) null);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean invalidateID(String str) {
        if (str == null || str.length() != 18) {
            return false;
        }
        int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] cArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int i = 0;
        int i2 = 0;
        while (i < str.length() - 1) {
            try {
                int i3 = i + 1;
                i2 += Util.safeParseInt(str.substring(i, i3)) * iArr[i];
                i = i3;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        int i4 = i2 % 11;
        char charAt = str.charAt(17);
        if (i4 == 2) {
            return charAt == 'X' || charAt == 'x';
        }
        if (charAt != cArr[i4]) {
            return false;
        }
    }

    public static String md5HexDigest(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String signWith3Des(String str) {
        if (str == null) {
            return null;
        }
        return new Encrypt().desedeEncode(md5HexDigest(str));
    }

    public static byte[] sm4DecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return null;
        }
        return new Encrypt().sm4DecryptCBC(bArr, bArr2, bArr3);
    }

    public static byte[] sm4EncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return null;
        }
        return new Encrypt().sm4EncryptCBC(bArr, bArr2, bArr3);
    }
}
