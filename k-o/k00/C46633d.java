package k00;

import android.net.Uri;
import android.webkit.URLUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: k00.d */
public final class C46633d {
    /* renamed from: a */
    public static String m51936a(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return Util.nullAsNil(Uri.parse(str).getQueryParameter("wechat_pkgid"));
        } catch (UnsupportedOperationException e) {
            Log.m105920e("MicroMsg.WepkgUtilities", e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static String m51937b(String str) {
        if (Util.isNullOrNil(str) || !URLUtil.isNetworkUrl(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            String replaceFirst = str.replaceFirst(parse.getScheme() + "://", "");
            return replaceFirst.contains("?") ? replaceFirst.substring(0, replaceFirst.indexOf("?")) : replaceFirst;
        } catch (Exception unused) {
            return str;
        }
    }
}
