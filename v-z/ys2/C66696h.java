package ys2;

import c30.C104289g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import h81.C32735h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ys2.h */
public class C66696h extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f191734d;

    /* renamed from: e */
    public C11385n f191735e;

    /* renamed from: f */
    public String f191736f;

    /* renamed from: ys2.h$a */
    public static class C66697a {

        /* renamed from: a */
        public C104289g f191737a = new C104289g();

        /* renamed from: b */
        public C104289g f191738b = new C104289g();

        /* renamed from: a */
        public C104289g mo90727a(String str, long j) {
            SnsMethodCalculate.markStartTimeMs("appendContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                this.f191737a.mo145954o(str, j);
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e.toString());
            }
            C104289g gVar = this.f191737a;
            SnsMethodCalculate.markEndTimeMs("appendContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            return gVar;
        }

        /* renamed from: b */
        public C104289g mo90728b(String str, long j) {
            SnsMethodCalculate.markStartTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                this.f191738b.mo145954o(str, j);
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e.toString());
            }
            C104289g gVar = this.f191738b;
            SnsMethodCalculate.markEndTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            return gVar;
        }

        /* renamed from: c */
        public C104289g mo90729c(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                this.f191738b.put(str, Util.nullAsNil(str2));
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e.toString());
            }
            C104289g gVar = this.f191738b;
            SnsMethodCalculate.markEndTimeMs("appendExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            return gVar;
        }

        /* renamed from: d */
        public final String mo90730d() {
            SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                this.f191737a.put("extInfo", this.f191738b);
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "build exp=" + e.toString());
            }
            String gVar = this.f191737a.toString();
            SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            return gVar;
        }

        /* renamed from: e */
        public void mo90731e(String str, int i, int i2, long j, int i3, int i4, int i5, String str2, String str3) {
            SnsMethodCalculate.markStartTimeMs("initContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                this.f191737a.put("uxinfo", str);
                this.f191737a.mo145953n(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
                this.f191737a.mo145953n("originScene", i2);
                this.f191737a.mo145954o("canvasId", j);
                this.f191737a.mo145953n("type", i3);
                this.f191737a.mo145953n("subType", i4);
                this.f191737a.mo145953n("action", i5);
                if (!Util.isNullOrNil(str2, str3)) {
                    this.f191737a.put("viewid", str2);
                    this.f191737a.put("commInfo", str3);
                }
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "initContentInfo exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("initContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        }

        /* renamed from: f */
        public void mo90732f(String str) {
            SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
            try {
                String d = mo90730d();
                AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, d);
                Log.m105924i("NetSceneAdLadingPageClick", "report, channel=" + str + ", content=" + d);
            } catch (Exception e) {
                Log.m105920e("NetSceneAdLadingPageClick", "report exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0189 A[Catch:{ all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66696h(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r11.<init>()
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.z1 r1 = new te3.z1
            r1.<init>()
            r0.f127066a = r1
            te3.a2 r1 = new te3.a2
            r1.<init>()
            r0.f127067b = r1
            java.lang.String r1 = "/cgi-bin/mmoc-bin/ad/adchannelmsg"
            r0.f127068c = r1
            r1 = 2538(0x9ea, float:3.556E-42)
            r0.f127069d = r1
            ob0.c r0 = r0.mo72403a()
            r11.f191734d = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.z1 r0 = (te3.C64870z1) r0
            te3.y1 r1 = new te3.y1
            r1.<init>()
            r2 = 2
            r1.f186428h = r2
            java.lang.String r3 = "getNetWorkType"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r5)
            if (r6 == 0) goto L_0x0045
            r2 = 1
            goto L_0x0065
        L_0x0045:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r5)
            if (r6 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r5)
            if (r2 == 0) goto L_0x0054
            r2 = 3
            goto L_0x0065
        L_0x0054:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r5)
            if (r2 == 0) goto L_0x005c
            r2 = 4
            goto L_0x0065
        L_0x005c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r5)
            if (r2 == 0) goto L_0x0064
            r2 = 5
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r1.f186425e = r2
            java.lang.String r2 = do2.C97503a.m125622c()
            r1.f186430j = r2
            java.lang.String r2 = do2.C97503a.m125621b()
            r1.f186431n = r2
            java.lang.String r2 = do2.C97503a.m125620a()
            r1.f186435r = r2
            java.lang.String r2 = do2.C97503a.m125623d()
            r1.f186434q = r2
            com.tencent.mm.pointers.PString r2 = new com.tencent.mm.pointers.PString
            r2.<init>()
            java.lang.String r3 = "getWaid"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "uxinfo"
            boolean r6 = r13.contains(r5)
            java.lang.String r7 = "NetSceneAdLadingPageClick"
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0109
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x00f0 }
            r6.<init>(r13)     // Catch:{ all -> 0x00f0 }
            java.lang.String r5 = r6.optString(r5)     // Catch:{ all -> 0x00f0 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f0 }
            if (r6 == 0) goto L_0x00c0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r5.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = "getWaid, has no uxinfo, channel="
            r5.append(r6)     // Catch:{ all -> 0x00f0 }
            r5.append(r12)     // Catch:{ all -> 0x00f0 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)     // Catch:{ all -> 0x00f0 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x010c
        L_0x00c0:
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.storage.ADInfo.getWaidPkgByUxInfo(r5)     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r9.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r10 = "getWaid, waidPkg="
            r9.append(r10)     // Catch:{ all -> 0x00f0 }
            r9.append(r6)     // Catch:{ all -> 0x00f0 }
            java.lang.String r10 = ", uxinfo="
            r9.append(r10)     // Catch:{ all -> 0x00f0 }
            r9.append(r5)     // Catch:{ all -> 0x00f0 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x00f0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)     // Catch:{ all -> 0x00f0 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00f0 }
            if (r5 != 0) goto L_0x0109
            r2.value = r6     // Catch:{ all -> 0x00f0 }
            java.lang.String r8 = kv2.C34071b.m40230d(r6)     // Catch:{ all -> 0x00f0 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x010c
        L_0x00f0:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "getWaid exop="
            r6.append(r9)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
        L_0x0109:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x010c:
            r1.f186436s = r8
            java.lang.String r2 = r2.value
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r1.f186437t = r2
            r0.f186616e = r1
            r0.f186615d = r12
            r0.f186617f = r13
            r11.f191736f = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r0.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r2 = "build req, channel="
            r0.append(r2)     // Catch:{ all -> 0x018f }
            r0.append(r12)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ all -> 0x018f }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x018f }
            r2 = 1612(0x64c, float:2.259E-42)
            r3 = 90
            r0.mo175911u(r2, r3)     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r0.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r2 = "##oaid:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186430j     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = ", imei:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186431n     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = ", waid:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186436s     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = ", waidPkg:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186437t     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = ", common_device_id:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186435r     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = ", ua:"
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r1.f186434q     // Catch:{ all -> 0x018f }
            r0.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ all -> 0x018f }
            boolean r0 = m78680j1()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x01a8
            po2.a r0 = po2.C62420a.f177386a     // Catch:{ all -> 0x018f }
            r0.mo87471a(r12, r1, r13)     // Catch:{ all -> 0x018f }
            goto L_0x01a8
        L_0x018f:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "adTecReport exp="
            r13.append(r0)
            java.lang.String r12 = r12.toString()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.C66696h.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: j1 */
    public static boolean m78680j1() {
        SnsMethodCalculate.markStartTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_adchannel_to_kv, 0);
            boolean z = Qe > 0;
            Log.m105918d("NetSceneAdLadingPageClick", "isReport2Kv, exptValue=" + Qe);
            SnsMethodCalculate.markEndTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
            return z;
        } catch (Throwable th) {
            Log.m105920e("NetSceneAdLadingPageClick", "isReport2Kv, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReport2Kv", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
            return false;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        Log.m105924i("NetSceneAdLadingPageClick", "doScene, channel=" + this.f191736f);
        this.f191735e = nVar;
        int dispatch = dispatch(gVar, this.f191734d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        int i = this.f191734d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
        Log.m105924i("NetSceneAdLadingPageClick", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str + ", channel=" + this.f191736f);
        if (!(i2 == 0 && i3 == 0)) {
            C115669n.INSTANCE.mo175911u(1612, 91);
        }
        C11385n nVar = this.f191735e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick");
    }
}
