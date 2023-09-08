package com.tencent.p014mm.plugin.report.service;

import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.plugin.report.service.n$$s */
public class n$$s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Callable f248876d;

    /* renamed from: e */
    public final /* synthetic */ String f248877e;

    /* renamed from: f */
    public final /* synthetic */ long f248878f;

    public n$$s(C115669n nVar, Callable callable, String str, long j) {
        this.f248876d = callable;
        this.f248877e = str;
        this.f248878f = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "support.weixin.qq.com"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002a
            boolean r1 = f40.C86709a0.m107522a()
            if (r1 == 0) goto L_0x002a
            f40.e r1 = f40.C86709a0.m107523b()
            int r1 = r1.mo121110g()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            if (r4 != 0) goto L_0x0025
            r4 = r2
            goto L_0x002c
        L_0x0025:
            java.lang.String r4 = eb0.C75592q0.m90789s()
            goto L_0x002c
        L_0x002a:
            r4 = r2
            r1 = 0
        L_0x002c:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = "system_config_prefs"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r3)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = r5.getString(r0, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.concurrent.Callable r5 = r12.f248876d     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r5 = r5.call()     // Catch:{ Exception -> 0x0182 }
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{ Exception -> 0x0182 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x0182 }
            r7 = 0
        L_0x0048:
            if (r7 >= r6) goto L_0x005f
            org.json.JSONObject r8 = r5.getJSONObject(r7)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r9 = "tag"
            java.lang.String r10 = r12.f248877e     // Catch:{ Exception -> 0x0182 }
            r8.put(r9, r10)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r9 = "uin"
            r8.put(r9, r1)     // Catch:{ Exception -> 0x0182 }
            int r7 = r7 + 1
            goto L_0x0048
        L_0x005f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0182 }
            r1.<init>()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = "head"
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0182 }
            r7.<init>()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "protocol_ver"
            r9 = 1
            org.json.JSONObject r7 = r7.put(r8, r9)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "phone"
            java.lang.String r10 = qe3.C89625d.f257838d     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r7 = r7.put(r8, r10)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "os_ver"
            java.lang.String r10 = qe3.C89625d.m112060a()     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r7 = r7.put(r8, r10)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "report_time"
            long r10 = r12.f248878f     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r7 = r7.put(r8, r10)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "revision"
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x0182 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r7 = r7.put(r8, r10)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r1 = r1.put(r6, r7)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = "items"
            org.json.JSONObject r1 = r1.put(r6, r5)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0182 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0182 }
            int r5 = r1.length     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = "weixin#$()%d%d"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0182 }
            int r8 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x0182 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0182 }
            r7[r3] = r8     // Catch:{ Exception -> 0x0182 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0182 }
            r7[r9] = r8     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ Exception -> 0x0182 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = p823sg.C90193h.m112878f(r6)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x0182 }
            byte[] r1 = p823sg.C90197s.m112889a(r1)     // Catch:{ Exception -> 0x0182 }
            com.tencent.mm.pointers.PByteArray r7 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x0182 }
            r7.<init>()     // Catch:{ Exception -> 0x0182 }
            byte[] r8 = r6.getBytes()     // Catch:{ Exception -> 0x0182 }
            p823sg.C118283d.m166849b(r7, r1, r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0182 }
            r8 = 256(0x100, float:3.59E-43)
            r1.<init>(r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = "https://"
            r1.append(r8)     // Catch:{ Exception -> 0x0182 }
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "/cgi-bin/mmsupport-bin/stackreport"
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "?version="
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            int r0 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ Exception -> 0x0182 }
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "&devicetype="
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = qe3.C89625d.m112060a()     // Catch:{ Exception -> 0x0182 }
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "&filelength="
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            r1.append(r5)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "&sum="
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            r1.append(r6)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "&reporttype=1&NewReportType=110"
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            if (r4 == 0) goto L_0x0137
            int r0 = r4.length()     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "&username="
            r1.append(r0)     // Catch:{ Exception -> 0x0182 }
            r1.append(r4)     // Catch:{ Exception -> 0x0182 }
        L_0x0137:
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0182 }
            org.apache.http.impl.client.DefaultHttpClient r1 = new org.apache.http.impl.client.DefaultHttpClient     // Catch:{ Exception -> 0x0182 }
            r1.<init>()     // Catch:{ Exception -> 0x0182 }
            org.apache.http.client.methods.HttpPost r4 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0182 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0182 }
            org.apache.http.entity.ByteArrayEntity r0 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ Exception -> 0x0182 }
            byte[] r5 = r7.value     // Catch:{ Exception -> 0x0182 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r5 = "binary/octet-stream"
            r0.setContentType(r5)     // Catch:{ Exception -> 0x0182 }
            r4.setEntity(r0)     // Catch:{ Exception -> 0x0182 }
            org.apache.http.HttpResponse r0 = r1.execute(r4)     // Catch:{ Exception -> 0x0182 }
            org.apache.http.HttpEntity r0 = r0.getEntity()     // Catch:{ Exception -> 0x0182 }
            java.io.InputStream r2 = r0.getContent()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.convertStreamToString(r2)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "MicroMsg.cLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0182 }
            r4.<init>()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r5 = "POST returned: "
            r4.append(r5)     // Catch:{ Exception -> 0x0182 }
            r4.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0182 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x0182 }
            if (r2 == 0) goto L_0x018f
        L_0x017c:
            r2.close()     // Catch:{ IOException -> 0x018f }
            goto L_0x018f
        L_0x0180:
            r0 = move-exception
            goto L_0x0190
        L_0x0182:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r4 = "Failed to upload cLog."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0180 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r3)     // Catch:{ all -> 0x0180 }
            if (r2 == 0) goto L_0x018f
            goto L_0x017c
        L_0x018f:
            return
        L_0x0190:
            if (r2 == 0) goto L_0x0195
            r2.close()     // Catch:{ IOException -> 0x0195 }
        L_0x0195:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.n$$s.run():void");
    }
}
