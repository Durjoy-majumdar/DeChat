package t83;

/* renamed from: t83.y0 */
public class C48617y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130141d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130142e;

    public C48617y0(C48590l lVar, String str) {
        this.f130142e = lVar;
        this.f130141d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            t83.l r0 = r8.f130142e
            java.lang.String r1 = "html"
            java.lang.String r0 = t83.C48590l.m53979k(r0, r1)
            t83.l r1 = r8.f130142e
            java.lang.String r2 = r8.f130141d
            r1.getClass()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 0
            r4 = 1
            java.lang.String r5 = "MicroMsg.JsApiHandler"
            if (r1 != 0) goto L_0x00af
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 == 0) goto L_0x0021
            goto L_0x00af
        L_0x0021:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r0)
            boolean r6 = r1.mo119967g()
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x004d
            r1.mo119964e()     // Catch:{ IOException -> 0x0032 }
            goto L_0x004d
        L_0x0032:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "creating file failed, filePath is "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r7, r2)
            goto L_0x00b5
        L_0x004d:
            r6 = 0
            java.io.OutputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1)     // Catch:{ Exception -> 0x0089 }
            byte[] r1 = r2.getBytes()     // Catch:{ Exception -> 0x0089 }
            r6.write(r1)     // Catch:{ Exception -> 0x0089 }
            r1 = 13
            r6.write(r1)     // Catch:{ Exception -> 0x0089 }
            r1 = 10
            r6.write(r1)     // Catch:{ Exception -> 0x0089 }
            r6.flush()     // Catch:{ Exception -> 0x0089 }
            r6.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r7, r2)
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "writeToFile ok! "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
            r1 = 1
            goto L_0x00b6
        L_0x0087:
            r0 = move-exception
            goto L_0x00a2
        L_0x0089:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0087 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r7, r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "write to file error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x00b5
            r6.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00b5
        L_0x009b:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r7, r2)
            goto L_0x00b5
        L_0x00a2:
            if (r6 == 0) goto L_0x00ae
            r6.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00ae
        L_0x00a8:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r7, r2)
        L_0x00ae:
            throw r0
        L_0x00af:
            java.lang.String r1 = "write to file error, path is null or empty, or data is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            if (r1 == 0) goto L_0x00da
            t83.l r1 = r8.f130142e
            com.tencent.mm.plugin.webview.stub.l r2 = r1.f130007l
            if (r2 == 0) goto L_0x00df
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f129996a
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = r1.getUrl()     // Catch:{ RemoteException -> 0x00ca }
            r2.mo68109Sk(r4, r1, r0)     // Catch:{ RemoteException -> 0x00ca }
            goto L_0x00df
        L_0x00ca:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r1[r3] = r0
            java.lang.String r0 = "uploadFileToCDN error "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
            goto L_0x00df
        L_0x00da:
            java.lang.String r0 = "failed to write Html file"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.C48617y0.run():void");
    }
}
