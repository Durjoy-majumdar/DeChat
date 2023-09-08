package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.net.URI;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.d */
public final class C43749d {

    /* renamed from: a */
    public static ArrayList<String> f118217a;

    /* renamed from: a */
    public static String m47592a(String str) {
        boolean z = false;
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (Util.isNullOrNil(scheme)) {
                return null;
            }
            StringBuilder sb = new StringBuilder(scheme);
            sb.append("://");
            sb.append(uri.getHost());
            int port = uri.getPort();
            if (port == -1 || ((scheme.equalsIgnoreCase("http") && port == 80) || (scheme.equalsIgnoreCase(C113600ck.f339986i) && port == 443))) {
                z = true;
            }
            if (!z) {
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(uri.getPort());
            }
            return sb.toString();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebView.CookiesCleanup", "getOrigin fail %s", e.getMessage());
            return null;
        }
    }
}
