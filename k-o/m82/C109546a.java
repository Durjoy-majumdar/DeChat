package m82;

import android.media.ImageReader;

/* renamed from: m82.a */
public final class C109546a implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C109547b f327911d;

    public C109546a(C109547b bVar) {
        this.f327911d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MTR.ImageReaderWrapper", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MTR.ImageReaderWrapper", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r0 != null ? r0.length : 0) < ((r18.getWidth() * r18.getWidth()) * 4)) goto L_0x0022;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r18) {
        /*
            r17 = this;
            android.media.Image r1 = r18.acquireLatestImage()
            r2 = r17
            if (r1 == 0) goto L_0x00f9
            m82.b r3 = r2.f327911d
            byte[] r0 = r3.f327913e
            r4 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            int r5 = r18.getWidth()
            int r6 = r18.getWidth()
            int r5 = r5 * r6
            int r5 = r5 * 4
            if (r0 >= r5) goto L_0x0067
        L_0x0022:
            java.lang.String r0 = "MicroMsg.MTR.ImageReaderWrapper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "alloc cached buffer, cur size "
            r5.append(r6)
            byte[] r6 = r3.f327913e
            if (r6 == 0) goto L_0x0038
            int r6 = r6.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r5.append(r6)
            java.lang.String r6 = ", new size "
            r5.append(r6)
            int r6 = r18.getWidth()
            int r7 = r18.getHeight()
            int r6 = r6 * r7
            int r6 = r6 * 4
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            int r0 = r18.getWidth()
            int r5 = r18.getWidth()
            int r0 = r0 * r5
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            r3.f327913e = r0
        L_0x0067:
            byte[] r5 = r3.f327913e     // Catch:{ NoSuchElementException -> 0x00ad, IllegalStateException -> 0x00ab }
            if (r5 == 0) goto L_0x00af
            monitor-enter(r5)     // Catch:{ NoSuchElementException -> 0x00ad, IllegalStateException -> 0x00ab }
            android.media.Image$Plane[] r0 = r1.getPlanes()     // Catch:{ all -> 0x00a8 }
            r0 = r0[r4]     // Catch:{ all -> 0x00a8 }
            java.nio.ByteBuffer r6 = r0.getBuffer()     // Catch:{ all -> 0x00a8 }
            r6.clear()     // Catch:{ all -> 0x00a8 }
            int r7 = r18.getHeight()     // Catch:{ all -> 0x00a8 }
        L_0x007d:
            if (r4 >= r7) goto L_0x00a4
            int r8 = r18.getWidth()     // Catch:{ all -> 0x00a8 }
            int r8 = r8 * r4
            int r9 = r0.getPixelStride()     // Catch:{ all -> 0x00a8 }
            int r8 = r8 * r9
            int r9 = r18.getWidth()     // Catch:{ all -> 0x00a8 }
            int r10 = r0.getPixelStride()     // Catch:{ all -> 0x00a8 }
            int r9 = r9 * r10
            r6.get(r5, r8, r9)     // Catch:{ all -> 0x00a8 }
            int r8 = r0.getRowStride()     // Catch:{ all -> 0x00a8 }
            int r8 = r8 * r4
            r6.position(r8)     // Catch:{ all -> 0x00a8 }
            int r4 = r4 + 1
            goto L_0x007d
        L_0x00a4:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a8 }
            monitor-exit(r5)     // Catch:{ NoSuchElementException -> 0x00ad, IllegalStateException -> 0x00ab }
            goto L_0x00af
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ NoSuchElementException -> 0x00ad, IllegalStateException -> 0x00ab }
            throw r0     // Catch:{ NoSuchElementException -> 0x00ad, IllegalStateException -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            goto L_0x00b3
        L_0x00ad:
            r0 = move-exception
            goto L_0x00bd
        L_0x00af:
            r1.close()
            goto L_0x00c7
        L_0x00b3:
            java.lang.String r4 = "MicroMsg.MTR.ImageReaderWrapper"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x00f4 }
            goto L_0x00af
        L_0x00bd:
            java.lang.String r4 = "MicroMsg.MTR.ImageReaderWrapper"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x00f4 }
            goto L_0x00af
        L_0x00c7:
            byte[] r7 = r3.f327913e
            if (r7 == 0) goto L_0x00f9
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.b0 r6 = r0.mo150671n()
            if (r6 == 0) goto L_0x00f9
            int r8 = r18.getWidth()
            int r9 = r18.getWidth()
            r10 = 516(0x204, float:7.23E-43)
            a14.n0 r0 = r6.f314576d
            if (r0 == 0) goto L_0x00f9
            r12 = 0
            r13 = 0
            com.tencent.mm.plugin.multitalk.model.c0 r14 = new com.tencent.mm.plugin.multitalk.model.c0
            r11 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r15 = 3
            r16 = 0
            r11 = r0
            a14.C53895h.m60466d(r11, r12, r13, r14, r15, r16)
            goto L_0x00f9
        L_0x00f4:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m82.C109546a.onImageAvailable(android.media.ImageReader):void");
    }
}
