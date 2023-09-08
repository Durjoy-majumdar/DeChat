package t83;

/* renamed from: t83.x0 */
public class C48615x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130138d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f130139e;

    public C48615x0(C48590l lVar, String str) {
        this.f130139e = lVar;
        this.f130138d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f130138d
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            t83.l r1 = r11.f130139e
            r1.getClass()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            r2 = 0
            goto L_0x0013
        L_0x0012:
            int r2 = r0.length
        L_0x0013:
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0019
            r5 = r3
            goto L_0x0050
        L_0x0019:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
        L_0x001f:
            if (r6 >= r2) goto L_0x0050
            java.util.Set r7 = r5.keySet()
            r8 = r0[r6]
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0044
            r7 = r0[r6]
            java.lang.Object r7 = r5.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = r7 + r4
            r8 = r0[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.put(r8, r7)
            goto L_0x004d
        L_0x0044:
            r7 = r0[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r5.put(r7, r8)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0050:
            t83.l r0 = r11.f130139e
            java.lang.String r2 = "hosts"
            java.lang.String r0 = t83.C48590l.m53979k(r0, r2)
            t83.l r2 = r11.f130139e
            r2.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r6 = "MicroMsg.JsApiHandler"
            if (r2 != 0) goto L_0x012a
            if (r5 != 0) goto L_0x0069
            goto L_0x012a
        L_0x0069:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            boolean r7 = r2.mo119967g()
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0096
            r2.mo119964e()     // Catch:{ IOException -> 0x007a }
            goto L_0x0096
        L_0x007a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "creating file failed, filePath is "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r8, r3)
            goto L_0x0130
        L_0x0096:
            java.io.OutputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106427I(r2, r4)     // Catch:{ Exception -> 0x0104 }
            java.util.Set r2 = r5.keySet()     // Catch:{ Exception -> 0x0104 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0104 }
        L_0x00a2:
            boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x0104 }
            if (r7 == 0) goto L_0x00de
            java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r9 = r5.get(r7)     // Catch:{ Exception -> 0x0104 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0104 }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r10.<init>()     // Catch:{ Exception -> 0x0104 }
            r10.append(r9)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r9 = " "
            r10.append(r9)     // Catch:{ Exception -> 0x0104 }
            r10.append(r7)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x0104 }
            byte[] r7 = r7.getBytes()     // Catch:{ Exception -> 0x0104 }
            r3.write(r7)     // Catch:{ Exception -> 0x0104 }
            r7 = 13
            r3.write(r7)     // Catch:{ Exception -> 0x0104 }
            r7 = 10
            r3.write(r7)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00a2
        L_0x00de:
            r3.flush()     // Catch:{ Exception -> 0x0104 }
            r3.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00eb
        L_0x00e5:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r8, r3)
        L_0x00eb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "writeToFile ok! "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            r2 = 1
            goto L_0x0131
        L_0x0102:
            r0 = move-exception
            goto L_0x011d
        L_0x0104:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r8, r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = "write to file error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)     // Catch:{ all -> 0x0102 }
            if (r3 == 0) goto L_0x0130
            r3.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x0130
        L_0x0116:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r8, r3)
            goto L_0x0130
        L_0x011d:
            if (r3 == 0) goto L_0x0129
            r3.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0129
        L_0x0123:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r8, r1)
        L_0x0129:
            throw r0
        L_0x012a:
            java.lang.String r2 = "write to file error, path is null or empty, or data is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
        L_0x0130:
            r2 = 0
        L_0x0131:
            if (r2 == 0) goto L_0x0155
            t83.l r2 = r11.f130139e
            com.tencent.mm.plugin.webview.stub.l r3 = r2.f130007l
            if (r3 == 0) goto L_0x015a
            com.tencent.mm.ui.widget.MMWebView r2 = r2.f129996a
            if (r2 == 0) goto L_0x015a
            java.lang.String r2 = r2.getUrl()     // Catch:{ RemoteException -> 0x0145 }
            r3.mo68109Sk(r1, r2, r0)     // Catch:{ RemoteException -> 0x0145 }
            goto L_0x015a
        L_0x0145:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "uploadFileToCDN error "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
            goto L_0x015a
        L_0x0155:
            java.lang.String r0 = "failed to write Hosts file"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.C48615x0.run():void");
    }
}
