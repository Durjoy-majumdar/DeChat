package com.tencent.p014mm.modelimage.loader.impr;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ic0.C87693m;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.tencent.mm.modelimage.loader.impr.e */
public class C81002e implements C87693m {
    /* renamed from: d */
    public static byte[] m98906d(InputStream inputStream, boolean z) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        if (!z) {
            inputStream.close();
        }
        return byteArray;
    }

    /* renamed from: a */
    public boolean mo112878a(String str, byte[] bArr) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        }
        String mD5String = MD5Util.getMD5String(bArr);
        if (Util.isNullOrNil(mD5String) || !mD5String.equals(str)) {
            Log.m105929w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", mD5String, str);
            return false;
        }
        Log.m105924i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
        return true;
    }

    /* renamed from: b */
    public boolean mo112879b(String str, String str2) {
        if (Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: filePath is null. check failed");
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        } else {
            String q = C86013q1.m106456q(str2);
            if (Util.isNullOrNil(q) || !q.equals(str)) {
                Log.m105929w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", q, str);
                return false;
            }
            Log.m105924i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo112880c(String str, InputStream inputStream) {
        if (inputStream == null) {
            Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: inputStream is null. check failed");
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
            return false;
        } else {
            try {
                inputStream.mark(inputStream.available());
                String mD5String = MD5Util.getMD5String(m98906d(inputStream, true));
                inputStream.reset();
                if (Util.isNullOrNil(mD5String) || !mD5String.equals(str)) {
                    Log.m105929w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", mD5String, str);
                    return false;
                }
                Log.m105924i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
                return true;
            } catch (Exception e) {
                Log.m105928w("MicroMsg.DefaultImageMD5CheckListener", "hy: exception: " + e.toString());
                return false;
            }
        }
    }
}
