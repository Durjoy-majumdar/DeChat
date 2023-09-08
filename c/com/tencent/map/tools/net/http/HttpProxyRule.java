package com.tencent.map.tools.net.http;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

public class HttpProxyRule extends JsonComposer {
    @Json(name = "domain")
    public String domain;
    @Json(name = "proxy_domain")
    public String proxyDomain;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r4 = android.net.Uri.parse(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean match(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r1 = r4.getScheme()
            if (r1 == 0) goto L_0x002a
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x0017
            goto L_0x002a
        L_0x0017:
            java.lang.String r4 = r4.getHost()
            if (r4 == 0) goto L_0x002a
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = r3.domain
            boolean r4 = r4.matches(r0)
            return r4
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.net.http.HttpProxyRule.match(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = r0.getHost();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String replaceHost(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r1 = r0.getScheme()
            if (r1 == 0) goto L_0x003d
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x0017
            goto L_0x003d
        L_0x0017:
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L_0x003d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = r3.domain
            boolean r1 = r1.matches(r2)
            if (r1 == 0) goto L_0x003d
            android.net.Uri$Builder r4 = r0.buildUpon()
            java.lang.String r0 = r3.proxyDomain
            android.net.Uri$Builder r4 = r4.encodedAuthority(r0)
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.net.http.HttpProxyRule.replaceHost(java.lang.String):java.lang.String");
    }
}
