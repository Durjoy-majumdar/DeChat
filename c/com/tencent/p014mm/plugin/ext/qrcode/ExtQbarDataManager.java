package com.tencent.p014mm.plugin.ext.qrcode;

import android.net.Uri;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.plugin.ext.qrcode.C93387f;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C57538o;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.ExtQbarDataManager */
public class ExtQbarDataManager {

    /* renamed from: a */
    public static HashSet<String> f269548a = new HashSet<>();

    /* renamed from: b */
    public static HashSet<String> f269549b = new HashSet<>();

    /* renamed from: c */
    public static ArrayList<C93380a> f269550c = new ArrayList<>();

    /* renamed from: d */
    public static IListener f269551d = new IListener<CheckResUpdateCacheFileEvent>(C40008f.f107254d) {
        {
            this.__eventId = 905296653;
        }

        public boolean callback(IEvent iEvent) {
            CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            if (aVar.f78744a != 46 || aVar.f78745b != 0) {
                return false;
            }
            Log.m105924i("MicroMsg.ExtQbarDataManager", "hy: got ext qrcode config. trigger copy");
            C86013q1.m106442c(checkResUpdateCacheFileEvent.f78743d.f78746c, ExtQbarDataManager.m117941b());
            ExtQbarDataManager.m117943d();
            return false;
        }
    };

    /* renamed from: e */
    public static HashMap<String, C93387f.C93389b> f269552e = new HashMap<>();

    /* renamed from: a */
    public static boolean m117940a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInBlacklist");
            return false;
        } else if (!f269549b.contains(str)) {
            return false;
        } else {
            Log.m105925i("MicroMsg.ExtQbarDataManager", "hy: %s already in blacklist", str);
            return true;
        }
    }

    /* renamed from: b */
    public static String m117941b() {
        String[] strArr = ExtControlProviderOpenApi.f269478t;
        String str = MMApplicationContext.getContext().getFilesDir().getParent() + "/" + "extqbar";
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            Log.m105924i("MicroMsg.ExtQbarDataManager", "hy: face dir not exist. mk dir");
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        return str + "/" + "ext_qbar_config.csv";
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df A[Catch:{ Exception -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0021 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m117942c(java.lang.String r15) {
        /*
            com.tencent.mm.plugin.ext.qrcode.b r0 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.DOMAIN
            com.tencent.mm.plugin.ext.qrcode.b r1 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.SUBDOMAIN
            com.tencent.mm.plugin.ext.qrcode.b r2 = com.tencent.p014mm.plugin.ext.qrcode.C93381b.PREFIX
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            java.lang.String r4 = "MicroMsg.ExtQbarDataManager"
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = "hy: no preset black/white config"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)
        L_0x0013:
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.StringReader r5 = new java.io.StringReader
            r5.<init>(r15)
            r3.<init>(r5)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
        L_0x0021:
            r15 = 0
            r7 = 1
            java.lang.String r8 = r3.readLine()     // Catch:{ Exception -> 0x00e6 }
            if (r8 == 0) goto L_0x00ee
            java.lang.String r9 = "hy: retrieving line"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r9)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r9 = ","
            java.lang.String[] r9 = r8.split(r9)     // Catch:{ Exception -> 0x00e6 }
            int r10 = r9.length     // Catch:{ Exception -> 0x00e6 }
            r11 = 3
            if (r10 >= r11) goto L_0x0042
            java.lang.String r9 = "hy: line %s not qualified length!"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00e6 }
            r10[r15] = r8     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r9, r10)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0021
        L_0x0042:
            com.tencent.mm.plugin.ext.qrcode.a r8 = new com.tencent.mm.plugin.ext.qrcode.a     // Catch:{ Exception -> 0x00e6 }
            r8.<init>()     // Catch:{ Exception -> 0x00e6 }
            r10 = 2
            r10 = r9[r10]     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r10 = r10.toUpperCase()     // Catch:{ Exception -> 0x00e6 }
            r8.f269555c = r10     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r10 = "white"
            r11 = r9[r15]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r11 = "domain"
            java.lang.String r12 = "subdomain"
            java.lang.String r13 = "prefix"
            if (r10 == 0) goto L_0x0096
            com.tencent.mm.plugin.ext.qrcode.c r10 = com.tencent.p014mm.plugin.ext.qrcode.C93382c.WHITE     // Catch:{ Exception -> 0x00e6 }
            r8.f269554b = r10     // Catch:{ Exception -> 0x00e6 }
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r13.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x0074
            r8.f269553a = r2     // Catch:{ Exception -> 0x00e6 }
        L_0x0071:
            r9 = 1
            goto L_0x00dd
        L_0x0074:
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r12.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x007f
            r8.f269553a = r1     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0071
        L_0x007f:
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r11.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x008a
            r8.f269553a = r0     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0071
        L_0x008a:
            java.lang.String r10 = "hy: [white] 2nd not qualified! %s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00e6 }
            r9 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            r11[r15] = r9     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r11)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00dc
        L_0x0096:
            java.lang.String r10 = "black"
            r14 = r9[r15]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r10.equalsIgnoreCase(r14)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x00d1
            com.tencent.mm.plugin.ext.qrcode.c r10 = com.tencent.p014mm.plugin.ext.qrcode.C93382c.BLACK     // Catch:{ Exception -> 0x00e6 }
            r8.f269554b = r10     // Catch:{ Exception -> 0x00e6 }
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r13.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x00af
            r8.f269553a = r2     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0071
        L_0x00af:
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r12.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x00ba
            r8.f269553a = r1     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0071
        L_0x00ba:
            r10 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            boolean r10 = r11.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x00c5
            r8.f269553a = r0     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0071
        L_0x00c5:
            java.lang.String r10 = "hy: [black] 2nd not qualified! %s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00e6 }
            r9 = r9[r7]     // Catch:{ Exception -> 0x00e6 }
            r11[r15] = r9     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r11)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r10 = "hy: 1st not qualified! %s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00e6 }
            r9 = r9[r15]     // Catch:{ Exception -> 0x00e6 }
            r11[r15] = r9     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r11)     // Catch:{ Exception -> 0x00e6 }
        L_0x00dc:
            r9 = 0
        L_0x00dd:
            if (r9 == 0) goto L_0x0021
            java.util.ArrayList<com.tencent.mm.plugin.ext.qrcode.a> r9 = f269550c     // Catch:{ Exception -> 0x00e6 }
            r9.add(r8)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0021
        L_0x00e6:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r2 = "hy: exception when parse config!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r15] = r1
            java.lang.String r15 = "hy: qrcode config retrieved using %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.qrcode.ExtQbarDataManager.m117942c(java.lang.String):void");
    }

    /* renamed from: d */
    public static void m117943d() {
        if (!C86013q1.m106450k(m117941b())) {
            Log.m105928w("MicroMsg.ExtQbarDataManager", "hy: not found csv file");
            C86709a0.m107524d().mo123460f(new C57538o(46));
            return;
        }
        try {
            String N = C86013q1.m106432N(m117941b());
            Log.m105924i("MicroMsg.ExtQbarDataManager", "hy: found qrcode config");
            Log.m105927v("MicroMsg.ExtQbarDataManager", "hy: qrcode config is %s", N);
            m117942c(N);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.ExtQbarDataManager", e, "hy: read config file failed!", new Object[0]);
        }
    }
}
