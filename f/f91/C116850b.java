package f91;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: f91.b */
public final class C116850b {
    /* renamed from: a */
    public static byte[] m164831a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m164832b().decodeBytes(str);
    }

    /* renamed from: b */
    public static MultiProcessMMKV m164832b() {
        return MultiProcessMMKV.getMMKV("_hellhound_mmkv");
    }

    /* renamed from: c */
    public static String m164833c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m164832b().getString(str, (String) null);
    }

    /* renamed from: d */
    public static void m164834d(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null) {
            m164832b().encode(str, bArr);
        }
    }

    /* renamed from: e */
    public static void m164835e(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                str2 = "";
            }
            m164832b().putString(str, str2);
        }
    }
}
