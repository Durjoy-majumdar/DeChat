package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import f40.C86709a0;
import java.util.Map;
import qe3.C89625d;

/* renamed from: com.tencent.mm.pluginsdk.model.app.b */
public class C72682b {

    /* renamed from: a */
    public int f211485a;

    /* renamed from: b */
    public String f211486b;

    /* renamed from: c */
    public int f211487c;

    /* renamed from: d */
    public String f211488d;

    /* renamed from: e */
    public String f211489e;

    /* renamed from: f */
    public long f211490f;

    /* renamed from: g */
    public long f211491g;

    public C72682b(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        this.f211489e = parseXml.get(".msg.appmsg.des");
        this.f211485a = Util.getInt(parseXml.get(".msg.alphainfo.clientVersion"), 0);
        this.f211486b = parseXml.get(".msg.alphainfo.url");
        this.f211487c = Util.getInt(parseXml.get(".msg.alphainfo.size"), 0);
        this.f211488d = parseXml.get(".msg.alphainfo.md5");
        this.f211490f = Util.getLong(parseXml.get(".msg.alphainfo.maxAge"), 0);
        this.f211491g = Util.getLong(parseXml.get(".msg.alphainfo.expireTime"), 0);
        Log.m105925i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", str, Integer.valueOf(this.f211485a), this.f211486b, Integer.valueOf(this.f211487c), this.f211488d, this.f211489e, Long.valueOf(this.f211490f), Long.valueOf(this.f211491g));
    }

    /* renamed from: a */
    public static void m84999a() {
        C86709a0.m107535s().mo121142i().mo119676J(352273, (Object) null);
        C86709a0.m107535s().mo121142i().mo119676J(352274, (Object) null);
    }

    /* renamed from: c */
    public static C72682b m85000c() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(352273, "");
        if (!Util.isNullOrNil(str)) {
            C72682b bVar = new C72682b(str);
            if (bVar.mo100145f() && !bVar.mo100144e()) {
                return bVar;
            }
            m84999a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100142b() {
        /*
            r15 = this;
            java.lang.String r0 = "MicroMsg.AlphaUpdateInfo"
            java.lang.String r1 = "downloadInSilence."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r1 = r15.mo100145f()
            if (r1 == 0) goto L_0x010a
            boolean r1 = r15.mo100144e()
            if (r1 == 0) goto L_0x0015
            goto L_0x010a
        L_0x0015:
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "SilentDownloadApkAtWiFi"
            java.lang.String r1 = r1.mo107405c(r2)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0030
            goto L_0x0068
        L_0x0030:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r4 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.mo119684e(r4, r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r4
            if (r1 != 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)
            if (r4 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            int r4 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.updateMode
            r4 = r4 & r2
            if (r4 == 0) goto L_0x006a
            java.lang.String r1 = "channel pack, not silence download."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x0068:
            r1 = 0
            goto L_0x006f
        L_0x006a:
            java.lang.String r4 = "not channel pack."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
        L_0x006f:
            if (r1 != 0) goto L_0x0076
            r15.mo100143d()
            goto L_0x010a
        L_0x0076:
            r1 = 4
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f211488d
            r4[r3] = r5
            int r5 = r15.f211487c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = r15.f211489e
            r6 = 2
            r4[r6] = r5
            r5 = 3
            java.lang.String r7 = r15.f211486b
            r4[r5] = r7
            java.lang.String r5 = "go to download, %s, %d, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
            s72.b r0 = s72.C90149c.f258834a
            java.lang.String r4 = r15.f211488d
            int r5 = r15.f211487c
            java.lang.String r7 = r15.f211489e
            java.lang.String r8 = "(\n)*<a.*</a>(\n)*"
            java.lang.String r9 = "\n"
            java.lang.String r7 = r7.replaceFirst(r8, r9)
            java.lang.String r8 = r15.f211486b
            com.tencent.mm.plugin.sandbox.SubCoreSandBox r0 = (com.tencent.p014mm.plugin.sandbox.SubCoreSandBox) r0
            r0.getClass()
            int r0 = com.tencent.p014mm.sandbox.updater.Updater.f249748o
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<com.tencent.mm.sandbox.updater.UpdaterService> r10 = com.tencent.p014mm.sandbox.updater.UpdaterService.class
            r0.<init>(r9, r10)
            int r9 = qe3.C89625d.f257841g
            java.lang.String r10 = "intent_client_version"
            r0.putExtra(r10, r9)
            java.lang.String r9 = "intent_update_type"
            r0.putExtra(r9, r1)
            java.lang.String r1 = "intent_extra_desc"
            r0.putExtra(r1, r7)
            java.lang.String r1 = "intent_extra_md5"
            r0.putExtra(r1, r4)
            java.lang.String r1 = "intent_extra_size"
            r0.putExtra(r1, r5)
            java.lang.String[] r1 = new java.lang.String[r2]
            r1[r3] = r8
            java.lang.String r3 = "intent_extra_download_url"
            r0.putExtra(r3, r1)
            int r1 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.updateMode
            java.lang.String r3 = "intent_extra_updateMode"
            r0.putExtra(r3, r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.marketURL
            java.lang.String r3 = "intent_extra_marketUrl"
            r0.putExtra(r3, r1)
            java.lang.String r1 = "intent_extra_run_in_foreground"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "intent_extra_download_mode"
            r0.putExtra(r1, r6)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 405(0x195, double:2.0E-321)
            r10 = 45
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)
            java.lang.String r1 = "sandbox"
            android.content.Intent r3 = ke3.C88144b.m109786e(r1)
            com.tencent.p014mm.service.C116024c.m163164d(r0, r1, r2, r3)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72682b.mo100142b():void");
    }

    /* renamed from: d */
    public void mo100143d() {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(C75604z3.m90841m("weixin", Util.nowSecond()));
        f4Var.setType(1);
        f4Var.mo108732L2(this.f211489e);
        Log.m105918d("MicroMsg.AlphaUpdateInfo", Util.secPrint(f4Var.getContent()));
        f4Var.mo108740T2(0);
        f4Var.mo108749c3("weixin");
        f4Var.mo100991d(3);
        C75604z3.m90852x(f4Var);
        Log.m105924i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
        m84999a();
    }

    /* renamed from: e */
    public boolean mo100144e() {
        boolean z = System.currentTimeMillis() - ((Long) C86709a0.m107535s().mo121142i().mo119684e(352274, Long.valueOf(System.currentTimeMillis()))).longValue() > this.f211490f || System.currentTimeMillis() > this.f211491g;
        Log.m105925i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public boolean mo100145f() {
        boolean z = this.f211485a > C89625d.f257841g && !Util.isNullOrNil(this.f211486b) && !Util.isNullOrNil(this.f211488d) && !Util.isNullOrNil(this.f211489e);
        Log.m105925i("MicroMsg.AlphaUpdateInfo", "isValid %b", Boolean.valueOf(z));
        return z;
    }
}
