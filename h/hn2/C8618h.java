package hn2;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import z04.C119027c;

/* renamed from: hn2.h */
public final class C8618h {

    /* renamed from: a */
    public static final C8618h f27727a = new C8618h();

    /* renamed from: a */
    public final String mo9488a(String str, int i) {
        byte[] bArr;
        if (Util.isNullOrNil(str)) {
            return str;
        }
        try {
            Charset forName = Charset.forName("utf-8");
            C87412m.m108593f(forName, "forName(charsetName)");
            bArr = str.getBytes(forName);
            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
        } catch (UnsupportedEncodingException e) {
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            Log.m105921e("MicroMsg.QQShareUtil", "getBytes fail, throw : %s", e.getMessage());
            bArr = bytes;
        }
        String encodeToString = Base64.encodeToString(bArr, i);
        C87412m.m108593f(encodeToString, "encodeToString(b, flag)");
        return encodeToString;
    }
}
