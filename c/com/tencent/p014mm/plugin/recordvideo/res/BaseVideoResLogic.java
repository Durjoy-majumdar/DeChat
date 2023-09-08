package com.tencent.p014mm.plugin.recordvideo.res;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;
import p1054vg.C90801g;
import p523fp.C32147e;
import rx3.C13598b0;
import uh2.C111170b;

/* renamed from: com.tencent.mm.plugin.recordvideo.res.BaseVideoResLogic */
public abstract class BaseVideoResLogic {

    /* renamed from: a */
    public final IListener<CheckResUpdateCacheFileEvent> f315408a = new BaseVideoResLogic$checkResUpdateCacheFileEventListener$1(this, C40008f.f107254d);

    /* renamed from: b */
    public boolean f315409b;

    /* renamed from: c */
    public C32224a<C13598b0> f315410c;

    /* renamed from: a */
    public void mo151271a(boolean z) {
    }

    /* renamed from: b */
    public void mo151272b() {
        String j = mo151280j();
        Log.m105924i(j, "checkRes " + mo151279i());
        ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(mo151279i());
        mo151276f().mo162906h();
    }

    /* renamed from: c */
    public final JSONArray mo151273c() {
        if (!this.f315409b) {
            return null;
        }
        return new JSONArray(C86013q1.m106432N(mo151277g() + "config.json"));
    }

    /* renamed from: d */
    public abstract String mo151274d();

    /* renamed from: e */
    public abstract String[] mo151275e();

    /* renamed from: f */
    public abstract C111170b mo151276f();

    /* renamed from: g */
    public abstract String mo151277g();

    /* renamed from: h */
    public final String mo151278h() {
        return mo151277g() + "temp/";
    }

    /* renamed from: i */
    public abstract int mo151279i();

    /* renamed from: j */
    public abstract String mo151280j();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0112  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo151281k() {
        /*
            r13 = this;
            java.lang.String r0 = r13.mo151280j()
            java.lang.String r1 = "init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r13.mo151277g()
            r0.append(r1)
            java.lang.String r1 = "config.json"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r13.mo151280j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "absConfigPath is:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x00ba }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ba }
            int r0 = r1.length()     // Catch:{ Exception -> 0x00ba }
            r4 = 0
        L_0x004c:
            if (r4 >= r0) goto L_0x00b8
            org.json.JSONObject r5 = r1.getJSONObject(r4)     // Catch:{ Exception -> 0x00ba }
            java.lang.String[] r6 = r13.mo151275e()     // Catch:{ Exception -> 0x00ba }
            int r7 = r6.length     // Catch:{ Exception -> 0x00ba }
            r8 = 0
        L_0x0058:
            if (r8 >= r7) goto L_0x00b5
            r9 = r6[r8]     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r10.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r13.mo151277g()     // Catch:{ Exception -> 0x00ba }
            r10.append(r11)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x00ba }
            r10.append(r9)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r10 = r13.mo151280j()     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r11.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r12 = "file index:"
            r11.append(r12)     // Catch:{ Exception -> 0x00ba }
            r11.append(r4)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r12 = " path:"
            r11.append(r12)     // Catch:{ Exception -> 0x00ba }
            r11.append(r9)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x00ba }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ Exception -> 0x00ba }
            if (r10 != 0) goto L_0x00b2
            java.lang.String r0 = r13.mo151280j()     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = "file not exist.path:"
            r1.append(r4)     // Catch:{ Exception -> 0x00ba }
            r1.append(r9)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d1
        L_0x00b2:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x00b5:
            int r4 = r4 + 1
            goto L_0x004c
        L_0x00b8:
            r0 = 1
            goto L_0x00d2
        L_0x00ba:
            r0 = move-exception
            java.lang.String r1 = r13.mo151280j()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "video res parse config error!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r4)
            goto L_0x00d1
        L_0x00c8:
            java.lang.String r0 = r13.mo151280j()
            java.lang.String r1 = "config not exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x00d1:
            r0 = 0
        L_0x00d2:
            if (r0 == 0) goto L_0x00d7
            r13.f315409b = r3
            goto L_0x0106
        L_0x00d7:
            java.lang.Class<fp.e> r0 = p523fp.C32147e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            fp.e r0 = (p523fp.C32147e) r0
            int r1 = r13.mo151279i()
            java.lang.String r0 = r0.mo58507AD(r1, r3)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = r13.mo151280j()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r2 = "cache file exist %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            java.lang.String r1 = "cacheFile"
            gy3.C87412m.m108593f(r0, r1)
            int r1 = r13.mo151279i()
            r13.mo151285o(r0, r1, r3, r3)
        L_0x0106:
            boolean r0 = r13.f315409b
            if (r0 == 0) goto L_0x0112
            uh2.b r0 = r13.mo151276f()
            r0.mo162905g()
            goto L_0x0119
        L_0x0112:
            uh2.b r0 = r13.mo151276f()
            r0.mo162899a()
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.res.BaseVideoResLogic.mo151281k():void");
    }

    /* renamed from: l */
    public final void mo151282l(String str) {
        String str2 = mo151278h() + mo151274d() + str;
        String str3 = mo151277g() + str;
        Log.m105924i(mo151280j(), "file tmp:" + str2 + "  real:" + str3);
        if (!C86013q1.m106450k(str2)) {
            Log.m105920e(mo151280j(), "fuck! config does not matching file list!!!!!!!!");
        } else if (!C86013q1.m106450k(str3)) {
            Log.m105924i(mo151280j(), "move file " + str);
            C86013q1.m106463x(str2, str3);
        } else if (!C87412m.m108589b(C90801g.m113874b(str2), C90801g.m113874b(str3))) {
            C86013q1.m106447h(str3);
            C86013q1.m106463x(str2, str3);
            Log.m105924i(mo151280j(), "replace file " + str);
        } else {
            Log.m105924i(mo151280j(), "already has file " + str);
        }
    }

    /* renamed from: m */
    public final void mo151283m() {
        if (this.f315409b) {
            mo151276f().mo162901c();
        } else {
            mo151276f().mo162903e();
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x00f9=Splitter:B:49:0x00f9, B:44:0x00ea=Splitter:B:44:0x00ea} */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo151284n(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            r1 = -1
            r2 = 0
            r3 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x00f8, IOException -> 0x00e9 }
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ FileNotFoundException -> 0x00f8, IOException -> 0x00e9 }
            r4.<init>(r10)     // Catch:{ FileNotFoundException -> 0x00f8, IOException -> 0x00e9 }
            r10 = r2
        L_0x000f:
            java.util.zip.ZipEntry r5 = r4.getNextEntry()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r5 == 0) goto L_0x0017
            r10 = r5
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            if (r5 == 0) goto L_0x00da
            gy3.C87412m.m108591d(r10)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = r10.getName()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "zipEntry!!.name"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "../"
            boolean r6 = z04.C112550d0.m153801u(r5, r6, r3)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r6 != 0) goto L_0x000f
            java.lang.String r6 = "..\\"
            boolean r6 = z04.C112550d0.m153801u(r5, r6, r3)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r6 == 0) goto L_0x0038
            goto L_0x000f
        L_0x0038:
            boolean r6 = r10.isDirectory()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r7 = 47
            if (r6 == 0) goto L_0x009d
            int r6 = r5.length()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            int r6 = r6 + -1
            java.lang.String r5 = r5.substring(r3, r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.append(r11)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.append(r5)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = r6.toString()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = r5.getPath()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r3, r3)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r7 = r5.getPath()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            boolean r7 = r7.equals(r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r7 != 0) goto L_0x0086
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            android.net.Uri r5 = r5.build()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
        L_0x0086:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r2)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            boolean r6 = r5.mo177810a()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r6 != 0) goto L_0x0094
            goto L_0x000f
        L_0x0094:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = r5.f348992b     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.mo119937g(r5)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            goto L_0x000f
        L_0x009d:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r8.append(r11)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r8.append(r5)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = r8.toString()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6.<init>((java.lang.String) r5)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            com.tencent.mm.vfs.m1 r5 = r6.mo119974l()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r5 == 0) goto L_0x00bd
            r5.mo119987x()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
        L_0x00bd:
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106426H(r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "openWrite(file)"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
        L_0x00cb:
            int r7 = r4.read(r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            if (r7 == r1) goto L_0x00d5
            r5.write(r6, r3, r7)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            goto L_0x00cb
        L_0x00d5:
            r5.close()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e1, all -> 0x00de }
            goto L_0x000f
        L_0x00da:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
            return r3
        L_0x00de:
            r10 = move-exception
            r2 = r4
            goto L_0x0106
        L_0x00e1:
            r10 = move-exception
            r2 = r4
            goto L_0x00ea
        L_0x00e4:
            r10 = move-exception
            r2 = r4
            goto L_0x00f9
        L_0x00e7:
            r10 = move-exception
            goto L_0x0106
        L_0x00e9:
            r10 = move-exception
        L_0x00ea:
            java.lang.String r11 = r9.mo151280j()     // Catch:{ all -> 0x00e7 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e7 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r0, r1)     // Catch:{ all -> 0x00e7 }
            r10 = -2
            com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
            return r10
        L_0x00f8:
            r10 = move-exception
        L_0x00f9:
            java.lang.String r11 = r9.mo151280j()     // Catch:{ all -> 0x00e7 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e7 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r0, r3)     // Catch:{ all -> 0x00e7 }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
            return r1
        L_0x0106:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.res.BaseVideoResLogic.mo151284n(java.lang.String, java.lang.String):int");
    }

    /* renamed from: o */
    public final synchronized void mo151285o(String str, int i, int i2, int i3) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        boolean z = false;
        Log.m105925i(mo151280j(), "unzipRes: %s", str);
        if (C86013q1.m106450k(str)) {
            C86013q1.m106461v(mo151278h());
            int n = mo151284n(str, mo151278h());
            Log.m105924i(mo151280j(), "unzip file ret:" + n + "  " + mo151278h());
            StringBuilder sb = new StringBuilder();
            sb.append(mo151278h());
            sb.append(mo151274d());
            Iterable<C86001b0> t = C86013q1.m106459t(sb.toString(), false);
            if (t != null) {
                for (C86001b0 next : t) {
                    Log.m105924i(mo151280j(), "unzip file path:" + next.f250471a + " name:" + next.f250472b + " size:" + next.f250473c);
                }
            }
            if (n == 0) {
                try {
                    if (C86013q1.m106450k(mo151278h() + mo151274d() + "config.json")) {
                        String N = C86013q1.m106432N(mo151278h() + mo151274d() + "config.json");
                        Log.m105925i(mo151280j(), "meta json: %s", N);
                        JSONArray jSONArray = new JSONArray(N);
                        int length = jSONArray.length();
                        for (int i4 = 0; i4 < length; i4++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            for (String optString : mo151275e()) {
                                String optString2 = jSONObject.optString(optString);
                                C87412m.m108593f(optString2, "item.optString(it)");
                                mo151282l(optString2);
                            }
                        }
                        C86013q1.m106447h(mo151277g() + "config.json");
                        C86013q1.m106463x(mo151278h() + mo151274d() + "config.json", mo151277g() + "config.json");
                        z = true;
                    }
                    if (!z) {
                        mo151276f().mo162902d();
                        Log.m105924i(mo151280j(), "unzip failed");
                    } else {
                        mo151276f().mo162900b();
                        Log.m105924i(mo151280j(), "unzip success");
                        ((C32147e) C86312j.m106911c(C32147e.class)).Y40(i, i2, i3);
                        this.f315409b = true;
                    }
                    C32224a<C13598b0> aVar = this.f315410c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    C86013q1.m106446g(mo151278h(), true);
                } catch (Exception e) {
                    try {
                        Log.printErrStackTrace(mo151280j(), e, "unzipRes error: %s", e.getMessage());
                        mo151276f().mo162902d();
                        Log.m105924i(mo151280j(), "unzip failed");
                        C32224a<C13598b0> aVar2 = this.f315410c;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        C86013q1.m106446g(mo151278h(), true);
                    } catch (Throwable th) {
                        mo151276f().mo162902d();
                        Log.m105924i(mo151280j(), "unzip failed");
                        C32224a<C13598b0> aVar3 = this.f315410c;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        C86013q1.m106446g(mo151278h(), true);
                        mo151271a(false);
                        throw th;
                    }
                }
                mo151271a(z);
            }
        }
    }
}
