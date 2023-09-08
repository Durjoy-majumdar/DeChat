package sn0;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: sn0.a */
public class C13734a {
    /* renamed from: a */
    public static String[] m13038a(String[] strArr) {
        byte[] bArr;
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str == null || !str.startsWith("data:image/")) {
                strArr2[i] = strArr[i];
            } else {
                String str2 = strArr[i];
                String str3 = "";
                if (!TextUtils.isEmpty(str2)) {
                    String trim = str2.substring(str2.indexOf("base64,") + 7).trim();
                    OutputStream outputStream = null;
                    try {
                        bArr = Base64.decode(trim, 0);
                    } catch (Exception e) {
                        Log.printErrStackTrace(str3, e, "writeToFile", new Object[0]);
                        bArr = null;
                    }
                    if (!(bArr == null || bArr.length == 0)) {
                        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), "preview_" + System.currentTimeMillis() + "_" + trim.hashCode());
                        try {
                            outputStream = C86013q1.m106426H(m1Var);
                            outputStream.write(bArr);
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                            str3 = m1Var.mo119971i();
                        } catch (Exception unused2) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    }
                }
                strArr2[i] = str3;
            }
        }
        return strArr2;
    }

    /* renamed from: b */
    public static String[] m13039b(String[] strArr, String[] strArr2) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (!(str2 == null || (str = strArr2[i]) == null || str2.equals(str))) {
                arrayList.add(strArr[i]);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
