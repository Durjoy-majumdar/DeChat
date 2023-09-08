package p1045ud;

import android.util.Base64;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import java.io.ByteArrayInputStream;
import p1030s6.C90132b;
import p748xd.C91176h;

/* renamed from: ud.b */
public class C90643b implements C90132b {

    /* renamed from: a */
    public static String[] f260409a = {"jpeg", "png", "gif", "svg+xml"};

    /* renamed from: a */
    public String mo109801a() {
        return "base64";
    }

    public boolean accept(Object obj) {
        return (obj instanceof String) && mo124778c((String) obj) > 0;
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        String str = (String) obj;
        return new C90132b.C90133a(new ByteArrayInputStream(Base64.decode(str.substring(mo124778c(str)), 2)));
    }

    /* renamed from: c */
    public final int mo124778c(String str) {
        boolean z;
        if (C91176h.m114416a(str) || !str.startsWith("data:image/")) {
            return 0;
        }
        int i = 11;
        String[] strArr = f260409a;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                z = false;
                break;
            }
            String str2 = strArr[i2];
            if (str.startsWith(str2, 11)) {
                i = 11 + str2.length();
                z = true;
                break;
            }
            i2++;
        }
        if (z && str.startsWith(";base64,", i)) {
            return i + 8;
        }
        return 0;
    }
}
