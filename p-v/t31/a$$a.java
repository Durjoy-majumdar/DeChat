package t31;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118361a f129809d;

    /* renamed from: e */
    public final /* synthetic */ String f129810e;

    /* renamed from: f */
    public final /* synthetic */ MultiProcessMMKV f129811f;

    /* renamed from: g */
    public final /* synthetic */ String f129812g;

    /* renamed from: h */
    public final /* synthetic */ int f129813h;

    public /* synthetic */ a$$a(C118361a aVar, String str, MultiProcessMMKV multiProcessMMKV, String str2, int i) {
        this.f129809d = aVar;
        this.f129810e = str;
        this.f129811f = multiProcessMMKV;
        this.f129812g = str2;
        this.f129813h = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r1 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r1 != null) goto L_0x0092;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[Catch:{ MalformedURLException -> 0x0076, IOException -> 0x0059, all -> 0x0057, all -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            t31.a r0 = r11.f129809d
            java.lang.String r1 = r11.f129810e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r11.f129811f
            java.lang.String r3 = r11.f129812g
            int r4 = r11.f129813h
            r0.getClass()
            java.lang.String r0 = "downloadAsString throw Exception : "
            java.lang.String r5 = "Amoeba.PageConfig"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0076, IOException -> 0x0059, all -> 0x0057 }
            r8.<init>(r1)     // Catch:{ MalformedURLException -> 0x0076, IOException -> 0x0059, all -> 0x0057 }
            java.net.URLConnection r1 = r8.openConnection()     // Catch:{ MalformedURLException -> 0x0076, IOException -> 0x0059, all -> 0x0057 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ MalformedURLException -> 0x0076, IOException -> 0x0059, all -> 0x0057 }
            if (r1 == 0) goto L_0x0054
            r1.connect()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            int r7 = r1.getResponseCode()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x0054
            java.io.InputStream r7 = r1.getInputStream()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            if (r7 == 0) goto L_0x0054
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            r9.<init>(r7)     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
        L_0x003f:
            java.lang.String r9 = r8.readLine()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            if (r9 == 0) goto L_0x0049
            r6.append(r9)     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            goto L_0x003f
        L_0x0049:
            r8.close()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            r7.close()     // Catch:{ MalformedURLException -> 0x0052, IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r7 = move-exception
            goto L_0x005d
        L_0x0052:
            r7 = move-exception
            goto L_0x007a
        L_0x0054:
            if (r1 == 0) goto L_0x0095
            goto L_0x0092
        L_0x0057:
            r0 = move-exception
            goto L_0x00bf
        L_0x0059:
            r1 = move-exception
            r10 = r7
            r7 = r1
            r1 = r10
        L_0x005d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            r8.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00bd }
            r8.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x0095
            goto L_0x0092
        L_0x0076:
            r1 = move-exception
            r10 = r7
            r7 = r1
            r1 = r10
        L_0x007a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            r8.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00bd }
            r8.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x0095
        L_0x0092:
            r1.disconnect()
        L_0x0095:
            java.lang.String r0 = r6.toString()
            boolean r1 = u24.C90599h.m113511d(r0)
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = "mmkv_key_data_report_page_config_version"
            boolean r5 = r2.contains(r1)
            if (r5 != 0) goto L_0x00aa
            r2.clear()
        L_0x00aa:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            boolean r3 = u24.C90599h.m113509b(r5, r3)
            if (r3 == 0) goto L_0x00bc
            r2.putInt(r1, r4)
            java.lang.String r1 = "mmkv_key_data_report_page_config_json"
            r2.putString(r1, r0)
        L_0x00bc:
            return
        L_0x00bd:
            r0 = move-exception
            r7 = r1
        L_0x00bf:
            if (r7 == 0) goto L_0x00c4
            r7.disconnect()
        L_0x00c4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t31.a$$a.run():void");
    }
}
