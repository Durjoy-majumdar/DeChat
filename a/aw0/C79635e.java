package aw0;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import java.util.Locale;

/* renamed from: aw0.e */
public class C79635e {
    /* renamed from: a */
    public static String m96713a(String str, int i) {
        return String.format(Locale.US, "%s#%d", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: b */
    public static String m96714b(String str, int i) {
        return String.format(Locale.US, "%s#%d", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: c */
    public static String m96715c(String str) {
        return MD5Util.getMD5String(String.format("%s", new Object[]{str}));
    }
}
