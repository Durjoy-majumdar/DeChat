package com.tencent.p014mm.plugin.webview.luggage;

import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$d */
public class n$$d extends C53138x.C53140b {

    /* renamed from: b */
    public final /* synthetic */ C43658n f117972b;

    public n$$d(C43658n nVar) {
        this.f117972b = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.LuggageMMWebPage", "get resource type failed Throwable ; %s", r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.LuggageMMWebPage", "get resource type failed Exception ; %s", r8.getMessage());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse mo67948a(android.webkit.WebResourceRequest r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.LuggageMMWebPage"
            r1 = 0
            r2 = 1
            java.lang.String r3 = "resourceType"
            int r8 = r8.getInt(r3)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            if (r8 == r2) goto L_0x000f
            r3 = 7
            if (r8 != r3) goto L_0x0051
        L_0x000f:
            java.lang.String r3 = "get resoutce type is iframe : %d, start geta8key"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            r4[r1] = r8     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            com.tencent.mm.plugin.webview.luggage.n r8 = r6.f117972b     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            android.net.Uri r3 = r7.getUrl()     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            d93.c r4 = r8.f117922L     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            d93.a<te3.xt1> r8 = r8.f117943Y0     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            r5 = 5
            monitor-enter(r4)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            r4.mo70851q(r3, r1, r5, r8)     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            goto L_0x0051
        L_0x0031:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
            throw r8     // Catch:{ Exception -> 0x0043, all -> 0x0034 }
        L_0x0034:
            r8 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r8 = r8.getMessage()
            r2[r1] = r8
            java.lang.String r8 = "get resource type failed Throwable ; %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r8, r2)
            goto L_0x0051
        L_0x0043:
            r8 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r8 = r8.getMessage()
            r2[r1] = r8
            java.lang.String r8 = "get resource type failed Exception ; %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r8, r2)
        L_0x0051:
            if (r7 == 0) goto L_0x005a
            android.net.Uri r7 = r7.getUrl()
            r7.toString()
        L_0x005a:
            com.tencent.mm.plugin.webview.luggage.n r7 = r6.f117972b
            r7.getClass()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.n$$d.mo67948a(android.webkit.WebResourceRequest, android.os.Bundle):android.webkit.WebResourceResponse");
    }

    /* renamed from: c */
    public void mo67949c(C53138x xVar, String str) {
        this.f117972b.mo65781H(str);
    }

    /* renamed from: d */
    public void mo67950d(C53138x xVar, String str) {
        this.f117972b.mo65782I(str);
    }
}
