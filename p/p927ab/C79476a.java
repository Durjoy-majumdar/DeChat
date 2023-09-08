package p927ab;

import android.graphics.Typeface;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81257h1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p419td.C26296b;
import s24.C90125c;

/* renamed from: ab.a */
public class C79476a implements C26296b {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f233028a;

    public C79476a(C79477b bVar, WeakReference weakReference) {
        this.f233028a = weakReference;
    }

    /* renamed from: a */
    public String mo53170a(String str) {
        Log.m105925i("MBFontManagerRegistry", "getFontPath at path[%s]", str);
        if (str == null || str.length() == 0) {
            return null;
        }
        AppBrandRuntime appBrandRuntime = (AppBrandRuntime) this.f233028a.get();
        if (appBrandRuntime == null) {
            Log.m105920e("MBFontManagerRegistry", "hy: runtime released");
            return null;
        } else if (str.startsWith("wxfile://")) {
            try {
                C86009m1 absoluteFile = appBrandRuntime.mo113034V().getAbsoluteFile(str);
                if (absoluteFile != null) {
                    return absoluteFile.mo119971i();
                }
                Log.m105921e("MBFontManagerRegistry", "Read [%s] from filesystem failed, no file", str);
                return null;
            } catch (Exception unused) {
                Log.m105921e("MBFontManagerRegistry", "Read [%s] from filesystem failed", str);
                return null;
            }
        } else {
            try {
                if (C81247g3.m99554j(str)) {
                    return null;
                }
                C81298o0.C81299a openReadPartialInfo = C81247g3.m99555k(appBrandRuntime, false).openReadPartialInfo(str);
                if (openReadPartialInfo != null) {
                    return C81257h1.m99577a(openReadPartialInfo.f238719d, openReadPartialInfo.f238721f);
                }
                return null;
            } catch (Exception unused2) {
                Log.m105921e("MBFontManagerRegistry", "Read [%s] from WxaPkgRuntimeReader failed", str);
                return null;
            }
        }
    }

    /* renamed from: b */
    public byte[] mo53171b(String str) {
        String a = mo53170a(str);
        if (a == null) {
            Log.m105925i("MBFontManagerRegistry", "getFontData [%s] failed", str);
            return new byte[0];
        }
        try {
            byte[] c = C90125c.m112776c(C86013q1.m106423E(a));
            Log.m105925i("MBFontManagerRegistry", "getFontData [%s], size[%d]", str, Integer.valueOf(c.length));
            return c;
        } catch (IOException e) {
            Log.m105921e("MBFontManagerRegistry", "getFontData [%s] failed [%s]", str, e);
            return new byte[0];
        }
    }

    public Typeface loadFont(String str) {
        Log.m105925i("MBFontManagerRegistry", "loadFont at path[%s]", str);
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return Typeface.createFromFile(str);
        } catch (Exception unused) {
            Log.m105921e("MBFontManagerRegistry", "Create typeface from file failed. fontPath = [%s]", str);
            return null;
        }
    }
}
