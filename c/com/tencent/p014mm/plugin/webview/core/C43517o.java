package com.tencent.p014mm.plugin.webview.core;

import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;

/* renamed from: com.tencent.mm.plugin.webview.core.o */
public final class C43517o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebResourceRequest f117654d;

    /* renamed from: e */
    public final /* synthetic */ C30579m f117655e;

    /* renamed from: f */
    public final /* synthetic */ WebResourceResponse f117656f;

    /* renamed from: g */
    public final /* synthetic */ String f117657g;

    /* renamed from: h */
    public final /* synthetic */ int f117658h;

    /* renamed from: i */
    public final /* synthetic */ int f117659i;

    public C43517o(WebResourceRequest webResourceRequest, C30579m mVar, WebResourceResponse webResourceResponse, String str, int i, int i2) {
        this.f117654d = webResourceRequest;
        this.f117655e = mVar;
        this.f117656f = webResourceResponse;
        this.f117657g = str;
        this.f117658h = i;
        this.f117659i = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = r0.getPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.tencent.xweb.WebResourceRequest r0 = r12.f117654d
            boolean r0 = r0.isForMainFrame()
            r1 = 1
            r2 = 2
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L_0x0028
            com.tencent.xweb.WebResourceRequest r0 = r12.f117654d
            android.net.Uri r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0024
            java.lang.String r5 = ".ico"
            boolean r0 = z04.C112551y.m153808h(r0, r5, r4, r2, r3)
            if (r0 != r1) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            return
        L_0x0028:
            com.tencent.xweb.WebResourceRequest r0 = r12.f117654d
            android.net.Uri r0 = r0.getUrl()
            java.lang.String r0 = r0.getHost()
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = ""
        L_0x0036:
            com.tencent.mm.plugin.webview.core.m r5 = r12.f117655e
            com.tencent.xweb.WebResourceRequest r6 = r12.f117654d
            android.net.Uri r6 = r6.getUrl()
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = r6.toString()
            goto L_0x0046
        L_0x0045:
            r6 = r3
        L_0x0046:
            java.lang.String r5 = com.tencent.p014mm.plugin.webview.core.C30579m.m39133a(r5, r6)
            com.tencent.xweb.WebResourceResponse r6 = r12.f117656f
            if (r6 == 0) goto L_0x0053
            int r6 = r6.getStatusCode()
            goto L_0x0054
        L_0x0053:
            r6 = -1
        L_0x0054:
            com.tencent.mm.plugin.webview.core.m r7 = r12.f117655e
            com.tencent.xweb.WebResourceResponse r8 = r12.f117656f
            if (r8 == 0) goto L_0x005e
            java.lang.String r3 = r8.getReasonPhrase()
        L_0x005e:
            java.lang.String r3 = com.tencent.p014mm.plugin.webview.core.C30579m.m39133a(r7, r3)
            com.tencent.xweb.WebResourceRequest r7 = r12.f117654d
            boolean r7 = r7.isForMainFrame()
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 22086(0x5646, float:3.0949E-41)
            r10 = 9
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r10[r4] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r10[r1] = r4
            r10[r2] = r0
            r0 = 3
            r10[r0] = r5
            r0 = 4
            r10[r0] = r3
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r10[r0] = r1
            r0 = 6
            java.lang.String r1 = r12.f117657g
            r10[r0] = r1
            r0 = 7
            int r1 = r12.f117658h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r0] = r1
            r0 = 8
            int r1 = r12.f117659i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r0] = r1
            r8.mo160131h(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43517o.run():void");
    }
}
