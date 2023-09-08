package g83;

import android.os.Bundle;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: g83.i */
public class C45900i extends WebViewClient {

    /* renamed from: a */
    public final int f123864a;

    /* renamed from: b */
    public final String f123865b = "MicroMsg.WebSearch.WebSearchClient";

    public C45900i(int i) {
        this.f123864a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.xweb.WebResourceResponse mo71327J(com.tencent.xweb.WebView r13, com.tencent.xweb.WebResourceRequest r14) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0122
            android.net.Uri r14 = r14.getUrl()
            if (r14 == 0) goto L_0x0122
            java.lang.String r14 = r14.toString()
            if (r14 == 0) goto L_0x0122
            java.lang.String r1 = "weixin://fts"
            r7 = 0
            boolean r1 = z04.C112551y.m153819s(r14, r1, r7)
            if (r1 == 0) goto L_0x001b
            r1 = r14
            goto L_0x001c
        L_0x001b:
            r1 = r0
        L_0x001c:
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L_0x005a
            java.lang.String r13 = r12.f123865b
            java.lang.Object[] r14 = new java.lang.Object[r8]
            r14[r7] = r1
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r14[r9] = r2
            java.lang.String r2 = "url=%s | thread=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r14)
            android.net.Uri r13 = android.net.Uri.parse(r1)
            java.lang.String r14 = "path"
            java.lang.String r13 = r13.getQueryParameter(r14)     // Catch:{ Exception -> 0x004b }
            if (r13 == 0) goto L_0x004c
            java.io.InputStream r13 = com.tencent.p014mm.vfs.C86013q1.m106423E(r13)     // Catch:{ Exception -> 0x004b }
            goto L_0x004d
        L_0x004b:
        L_0x004c:
            r13 = r0
        L_0x004d:
            if (r13 == 0) goto L_0x0059
            com.tencent.xweb.WebResourceResponse r0 = new com.tencent.xweb.WebResourceResponse
            java.lang.String r14 = "image/*"
            java.lang.String r1 = "utf8"
            r0.<init>(r14, r1, r13)
        L_0x0059:
            return r0
        L_0x005a:
            r10 = 7
            int r1 = r12.f123864a
            if (r1 < 0) goto L_0x0122
            if (r13 == 0) goto L_0x006b
            r1 = 2002(0x7d2, float:2.805E-42)
            boolean r1 = r13.supportFeature(r1)
            if (r1 != r9) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 == 0) goto L_0x0122
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0122
            int r1 = r14.length()
            if (r1 <= r10) goto L_0x0122
            int r1 = r12.f123864a
            e83.b r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46983g(r1)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "?"
            r1 = r14
            int r1 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r1.intValue()
            if (r2 <= r10) goto L_0x0097
            r2 = 1
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            if (r2 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r1 = r0
        L_0x009c:
            if (r1 == 0) goto L_0x00a3
            int r1 = r1.intValue()
            goto L_0x00a7
        L_0x00a3:
            int r1 = r14.length()
        L_0x00a7:
            java.lang.String r14 = r14.substring(r10, r1)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r14, r1)
            java.util.HashMap r1 = r11.mo71071d()
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0122
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0115
            java.lang.String r2 = r12.f123865b
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r1
            r3[r9] = r14
            java.lang.String r4 = "hit js xweb script %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            com.tencent.xweb.XWebScript r2 = new com.tencent.xweb.XWebScript
            r2.<init>(r8, r7, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            r3 = 46
            r13.append(r3)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            r2.setCacheKey(r13)
            r2.setJsSrcAsPath(r14)
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream
            java.lang.String r14 = r2.toString()
            java.lang.String r1 = "script.toString()"
            gy3.C87412m.m108593f(r14, r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = "UTF_8"
            gy3.C87412m.m108593f(r1, r2)
            byte[] r14 = r14.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r14, r1)
            r13.<init>(r14)
            com.tencent.xweb.WebResourceResponse r14 = new com.tencent.xweb.WebResourceResponse
            java.lang.String r1 = "UTF-8"
            r14.<init>(r0, r1, r13)
            r0 = r14
            goto L_0x0122
        L_0x0115:
            java.lang.String r13 = r12.f123865b
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r1
            r2[r9] = r14
            java.lang.String r14 = "not hit js xweb script %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r2)
        L_0x0122:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C45900i.mo71327J(com.tencent.xweb.WebView, com.tencent.xweb.WebResourceRequest):com.tencent.xweb.WebResourceResponse");
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse J = mo71327J(webView, webResourceRequest);
        return J == null ? super.shouldInterceptRequest(webView, webResourceRequest) : J;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        WebResourceResponse J = mo71327J(webView, webResourceRequest);
        return J == null ? super.shouldInterceptRequest(webView, webResourceRequest, bundle) : J;
    }
}
