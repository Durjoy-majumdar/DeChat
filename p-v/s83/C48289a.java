package s83;

import com.tencent.mars.cdn.CronetLogic;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: s83.a */
public final class C48289a implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<CronetLogic.CronetTaskResult, C13598b0> f129307a;

    public C48289a(C32226l<? super CronetLogic.CronetTaskResult, C13598b0> lVar) {
        this.f129307a = lVar;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = r10.headers;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r11 = "protocol"
            gy3.C87412m.m108594g(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onCronetReceiveHeader: "
            r11.append(r12)
            if (r10 == 0) goto L_0x0024
            com.tencent.mars.cdn.CronetLogic$HeaderMap[] r0 = r10.headers
            if (r0 == 0) goto L_0x0024
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r10 = sx3.C110823p.m150987M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0025
        L_0x0024:
            r10 = 0
        L_0x0025:
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "MicroMsg.BizMpVideoInterceptor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s83.C48289a.onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic$ResponseHeader, int, java.lang.String):int");
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r0 = r11.headers;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCronetTaskCompleted(java.lang.String r10, com.tencent.mars.cdn.CronetLogic.CronetTaskResult r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r10 = "protocol"
            gy3.C87412m.m108594g(r12, r10)
            fy3.l<com.tencent.mars.cdn.CronetLogic$CronetTaskResult, rx3.b0> r10 = r9.f129307a
            r10.invoke(r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "onCronetTaskCompleted: "
            r10.append(r12)
            if (r11 == 0) goto L_0x0029
            com.tencent.mars.cdn.CronetLogic$HeaderMap[] r0 = r11.headers
            if (r0 == 0) goto L_0x0029
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r11 = sx3.C110823p.m150987M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x002a
        L_0x0029:
            r11 = 0
        L_0x002a:
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.BizMpVideoInterceptor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s83.C48289a.onCronetTaskCompleted(java.lang.String, com.tencent.mars.cdn.CronetLogic$CronetTaskResult, java.lang.String):void");
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
