package c93;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: c93.b */
public final class C39931b {
    /* renamed from: a */
    public static String m42721a(String str) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getScheme());
        sb.append("://");
        sb.append(parse.getHost());
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append(parse.getPort());
        if (Util.isNullOrNil((List) parse.getPathSegments())) {
            sb.append("/");
        } else {
            for (String append : parse.getPathSegments()) {
                sb.append("/");
                sb.append(append);
            }
        }
        if (!Util.isNullOrNil(parse.getQuery())) {
            sb.append("?");
            sb.append(parse.getQuery());
        }
        if (!Util.isNullOrNil(parse.getFragment())) {
            sb.append("#");
            sb.append(parse.getFragment());
        }
        if (str.endsWith("/")) {
            sb.append("/");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m42722b(String str) {
        String d = m42724d(str);
        if (Util.isNullOrNil(d)) {
            Log.m105921e("MicroMsg.WebViewCacheUtils", "evaluateResURLWithScheme, original url is invalid = %s", str);
            return null;
        }
        Uri parse = Uri.parse(d);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getScheme());
        sb.append("://");
        sb.append(parse.getHost());
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append(parse.getPort());
        if (!Util.isNullOrNil((List) parse.getPathSegments())) {
            for (String nullAsNil : parse.getPathSegments()) {
                sb.append("/");
                sb.append(Util.nullAsNil(nullAsNil));
            }
        }
        if (str.endsWith("/")) {
            sb.append("/");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m42723c(String str) {
        String d = m42724d(str);
        if (Util.isNullOrNil(d)) {
            return null;
        }
        return Uri.parse(d).getHost();
    }

    /* renamed from: d */
    public static String m42724d(String str) {
        String str2;
        if (!C6013c.m5892d(str)) {
            return null;
        }
        try {
            URI uri = new URI(str);
            String lowerCase = Util.nullAsNil(uri.getScheme()).toLowerCase();
            String lowerCase2 = Util.nullAsNil(uri.getHost()).toLowerCase();
            if (Util.isNullOrNil(lowerCase2)) {
                return null;
            }
            int port = uri.getPort() == -1 ? lowerCase.equalsIgnoreCase("http") ? 80 : JsApiPauseDownloadTask.CTRL_INDEX : uri.getPort();
            String str3 = "";
            if (Util.isNullOrNil(uri.getQuery())) {
                str2 = str3;
            } else {
                str2 = "?" + uri.getQuery();
            }
            if (!Util.isNullOrNil(uri.getFragment())) {
                str3 = "#" + uri.getFragment();
            }
            String str4 = lowerCase + "://" + lowerCase2 + XVFSFile.PATH_SEPARATOR + port + "/" + Util.nullAsNil(uri.getPath()) + str2 + str3;
            if (str4.endsWith("/")) {
                str4 = str4 + "/";
            }
            return m42721a(str4);
        } catch (URISyntaxException e) {
            Log.m105921e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL URISyntaxException : %s", e.getMessage());
            return str;
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL normal : %s", e2.getMessage());
            return str;
        }
    }
}
