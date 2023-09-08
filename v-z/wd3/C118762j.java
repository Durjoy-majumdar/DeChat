package wd3;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.net.URLDecoder;
import java.util.Set;
import p248ug.C102027b;

/* renamed from: wd3.j */
public final class C118762j {

    /* renamed from: a */
    public static final C118762j f355306a = new C118762j();

    /* renamed from: b */
    public static boolean f355307b = true;

    static {
        Log.m105925i("MicroMsg.BizImageDownloadUtil", "alvinluo updateEnableImageBlankReport %b", Boolean.TRUE);
    }

    /* renamed from: a */
    public final boolean mo183488a(int i) {
        return C102027b.m134390e() && (i == 1 || i == 3 || i == 2);
    }

    /* renamed from: b */
    public final boolean mo183489b(int i) {
        return f355307b && i == 1;
    }

    /* renamed from: c */
    public final int mo183490c(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (mo183491d(str)) {
            return 1;
        }
        if ((str == null || str.length() == 0) || !C87412m.m108589b(str, "image/webp")) {
            z = false;
        }
        return z ? 2 : 0;
    }

    /* renamed from: d */
    public final boolean mo183491d(String str) {
        return !(str == null || str.length() == 0) && C87412m.m108589b(str, "image/wxpic");
    }

    /* renamed from: e */
    public final String mo183492e(Uri uri, String str) {
        C87412m.m108594g(uri, "uri");
        C87412m.m108594g(str, "key");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String next : queryParameterNames) {
            if (!C87412m.m108589b(next, str)) {
                clearQuery.appendQueryParameter(next, uri.getQueryParameter(next));
            }
        }
        String decode = URLDecoder.decode(clearQuery.build().toString(), "utf-8");
        C87412m.m108593f(decode, "decode(newUri.build().toString(), \"utf-8\")");
        return decode;
    }
}
