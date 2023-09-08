package com.tencent.p014mm.plugin.ext.key;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.tencent.mm.plugin.ext.key.AESUtil */
public class AESUtil {

    /* renamed from: a */
    public static SecretKey f248180a;

    /* renamed from: b */
    public static char[] f248181b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static long m105052a(String str) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = null;
        } else {
            m105054c();
            Cipher instance = Cipher.getInstance("AES");
            instance.init(2, f248180a);
            str2 = new String(instance.doFinal(m105055d(str)), "UTF8");
        }
        return Long.valueOf(str2.trim()).longValue();
    }

    /* renamed from: b */
    public static String m105053b(long j) {
        byte[] bArr;
        String valueOf = String.valueOf(j);
        if (valueOf == null || valueOf.length() <= 0) {
            bArr = null;
        } else {
            m105054c();
            Cipher instance = Cipher.getInstance("AES");
            instance.init(1, f248180a);
            bArr = instance.doFinal(valueOf.getBytes("UTF8"));
        }
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = f248181b;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m105054c() {
        try {
            if (f248180a == null) {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(m105055d("aced00057372001f6a617661782e63727970746f2e737065632e5365637265744b6579537065635b470b66e230614d0200024c0009616c676f726974686d7400124c6a6176612f6c616e672f537472696e673b5b00036b65797400025b427870740003414553757200025b42acf317f8060854e0020000787000000010402a2173bd6f2542e5e71ee414b2e1e8")));
                f248180a = (SecretKey) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AESUtil", e, "", new Object[0]);
        }
    }

    /* renamed from: d */
    public static final byte[] m105055d(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }
}
