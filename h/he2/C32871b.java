package he2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.concurrent.TimeUnit;

/* renamed from: he2.b */
public final class C32871b {

    /* renamed from: a */
    public static final C32871b f89373a = new C32871b();

    /* renamed from: b */
    public static final long f89374b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: c */
    public static final C86009m1 f89375c;

    /* renamed from: d */
    public static final String[] f89376d;

    static {
        String str;
        String i;
        C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
        f89375c = c;
        String[] strArr = new String[2];
        String str2 = null;
        if (c == null || (i = c.mo119971i()) == null) {
            str = null;
        } else {
            str = i + "/hprofs/";
        }
        strArr[0] = str;
        if (c != null) {
            str2 = c.mo119971i();
        }
        strArr[1] = str2 + "/matrix_resource";
        f89376d = strArr;
    }
}
