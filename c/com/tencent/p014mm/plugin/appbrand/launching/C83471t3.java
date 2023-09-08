package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import wo0.C91052l;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.t3 */
public class C83471t3 extends C83448q3<Pair<HashMap<String, AppRuntimeApiPermissionBundle>, Boolean>> {

    /* renamed from: h */
    public final WxaAttributes.WxaVersionInfo f243906h;

    /* renamed from: i */
    public final String f243907i;

    /* renamed from: j */
    public final int f243908j;

    /* renamed from: n */
    public final int f243909n;

    /* renamed from: o */
    public final boolean f243910o;

    /* renamed from: p */
    public final int f243911p;

    /* renamed from: q */
    public final String f243912q;

    /* renamed from: r */
    public final QualitySession f243913r;

    /* renamed from: s */
    public final C80247h f243914s;

    /* renamed from: t */
    public List<C91052l> f243915t = new LinkedList();

    public C83471t3(String str, int i, int i2, boolean z, WxaAttributes.WxaVersionInfo wxaVersionInfo, int i3, String str2, QualitySession qualitySession, C80247h hVar) {
        this.f243907i = str;
        this.f243908j = i;
        this.f243909n = !C81289m.C81290a.m99664b(i) ? 0 : i2;
        this.f243910o = z;
        this.f243911p = i3;
        this.f243906h = wxaVersionInfo;
        this.f243912q = str2;
        this.f243913r = qualitySession;
        this.f243914s = hVar;
        Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckAppWxaJsApiPermissionInfo", "<init> hash:%d, appId:%s,versionType:%d,isGame:%b,enterScene:%d, wxaColdStartMode:%s", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i3), hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r13 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r13.f243906h
            boolean r1 = r13.f243910o
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 1
            r4 = 0
            r5 = 2
            r6 = 0
            java.lang.String r7 = "MicroMsg.AppBrand.PrepareStepCheckAppWxaJsApiPermissionInfo"
            if (r1 == 0) goto L_0x009b
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_android_wagame_isolated_plugin_permission
            boolean r8 = r8.mo58784wf(r9, r3)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r9[r6] = r11
            java.lang.String r11 = "MicroMsg.PkgABTest"
            java.lang.String r12 = "openGameIsolatedPluginPermissionCheck exp:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r9)
            if (r8 == 0) goto L_0x009b
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo> r0 = r0.f239465t
            if (r0 == 0) goto L_0x00fa
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0042
            goto L_0x00fa
        L_0x0042:
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo r1 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo) r1
            int r8 = r1.f239482d
            r9 = 22
            if (r8 != r9) goto L_0x0046
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> r1 = r1.f239484f
            if (r1 == 0) goto L_0x0046
            int r8 = r1.size()
            if (r8 > 0) goto L_0x0063
            goto L_0x0046
        L_0x0063:
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0046
            java.lang.Object r8 = r1.next()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r8 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo) r8
            java.util.List<java.lang.Integer> r9 = r8.f239442i
            java.util.Iterator r9 = r9.iterator()
        L_0x0079:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0067
            java.lang.Object r11 = r9.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = 3
            if (r11 != r12) goto L_0x0079
            wo0.l r11 = new wo0.l
            r11.<init>()
            java.lang.String r12 = r8.f239437d
            r11.f261211a = r12
            r11.f261212b = r5
            r2.add(r11)
            goto L_0x0079
        L_0x009b:
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = r0.f239463r
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00a6
            goto L_0x00fa
        L_0x00a6:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ec }
            java.lang.String r0 = r0.f239463r     // Catch:{ JSONException -> 0x00ec }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00ec }
            java.lang.String r0 = "call_plugin_info"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L_0x00fa
            int r1 = r0.length()
            if (r1 > 0) goto L_0x00bc
            goto L_0x00fa
        L_0x00bc:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.tencent.mm.plugin.appbrand.launching.s3 r8 = new com.tencent.mm.plugin.appbrand.launching.s3
            r8.<init>(r13, r1)
            p170ic.C87689c.m109089b(r0, r8)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00fb
            java.util.Iterator r0 = r1.iterator()
        L_0x00d3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            wo0.l r8 = new wo0.l
            r8.<init>()
            r8.f261211a = r1
            r8.f261212b = r5
            r2.add(r8)
            goto L_0x00d3
        L_0x00ec:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = r13.f243907i
            r1[r6] = r2
            r1[r3] = r0
            java.lang.String r0 = "getTodoCheckAppJsApiList(), parse json failed for miniprogram, appId:%s, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r1)
        L_0x00fa:
            r2 = r4
        L_0x00fb:
            r13.f243915t = r2
            if (r2 == 0) goto L_0x0266
            int r0 = r2.size()
            if (r0 > 0) goto L_0x0107
            goto L_0x0266
        L_0x0107:
            r0 = 100
            java.lang.String r1 = r13.f243907i
            int r2 = r13.f243908j
            int r4 = r13.f243909n
            bp0.C79746b.m96887a(r0, r1, r2, r4)
            te3.jy r9 = new te3.jy
            r9.<init>()
            int r0 = r13.f243911p
            r9.f259639d = r0
            com.tencent.luggage.sdk.launching.h r0 = r13.f243914s
            r0.mo111350a(r9)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.u2 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.c3 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238480s
            r2 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x01a3
            if (r1 != 0) goto L_0x0132
            goto L_0x01a3
        L_0x0132:
            java.util.List<wo0.l> r4 = r13.f243915t
            if (r4 == 0) goto L_0x0197
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0197
            java.util.List<wo0.l> r4 = r13.f243915t
            java.util.Iterator r4 = r4.iterator()
        L_0x0142:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0197
            java.lang.Object r8 = r4.next()
            wo0.l r8 = (wo0.C91052l) r8
            java.lang.String r11 = r8.f261211a
            int r8 = r8.f261212b
            if (r8 != r5) goto L_0x017b
            te3.au r8 = r1.mo56812Lo(r11)
            if (r8 != 0) goto L_0x0164
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r11
            java.lang.String r1 = "needSyncCheckAppJsApiPermission pluginInfoStorage not include appId:%s!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            goto L_0x0195
        L_0x0164:
            pe3.b r12 = r8.f130770d
            if (r12 != 0) goto L_0x0172
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r11
            java.lang.String r1 = "needSyncCheckAppJsApiPermission pluginInfoStorage appId:%s jsapi_control_bytes null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            goto L_0x0195
        L_0x0172:
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle r12 = new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle
            r12.<init>(r8)
            r10.put(r11, r12)
            goto L_0x0142
        L_0x017b:
            if (r8 != r3) goto L_0x0142
            com.tencent.mm.plugin.appbrand.launching.w2 r8 = new com.tencent.mm.plugin.appbrand.launching.w2
            r8.<init>()
            r8.field_appId = r11
            java.lang.String r11 = "appId"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            boolean r11 = r0.get(r8, r11)
            if (r11 != 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            te3.au r8 = r8.field_jsapiInfo
            if (r8 != 0) goto L_0x0142
        L_0x0195:
            r6 = 1
            goto L_0x01b1
        L_0x0197:
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r1 = r13.f243907i
            int r4 = r13.f243908j
            int r5 = r13.f243909n
            bp0.C79746b.m96887a(r0, r1, r4, r5)
            goto L_0x01b1
        L_0x01a3:
            java.lang.String r0 = "needSyncCheckAppJsApiPermission storage null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.String r0 = r13.f243907i
            int r1 = r13.f243908j
            int r4 = r13.f243909n
            bp0.C79746b.m96887a(r2, r0, r1, r4)
        L_0x01b1:
            r0 = 102(0x66, float:1.43E-43)
            if (r6 == 0) goto L_0x023c
            java.lang.String r1 = "CgiWxaJsApiInfo sync"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r1 = r13
            com.tencent.mm.plugin.appbrand.launching.k0 r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83355k0) r1
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r1 = r1.f243580u
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r4 = r1.f243257g
            if (r4 == 0) goto L_0x01da
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r1 = r1.f243257g
            com.tencent.mm.plugin.appbrand.launching.u r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83483u) r1
            com.tencent.mm.ipcinvoker.g r3 = r1.f243928d
            if (r3 == 0) goto L_0x01dc
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult r3 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult
            r3.<init>()
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$d r4 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask.C83254d.EVENT_ON_SYNC_JSAPIINFO_START
            r3.f243185d = r4
            com.tencent.mm.ipcinvoker.g r1 = r1.f243928d
            r1.mo894a(r3)
            goto L_0x01dc
        L_0x01da:
            r1.f243253Z = r3
        L_0x01dc:
            r9.f259641f = r2
            wo0.i r10 = new wo0.i
            java.lang.String r2 = r13.f243907i
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r1 = r13.f243906h
            int r3 = r1.f239454f
            java.util.List<wo0.l> r4 = r13.f243915t
            r5 = 1
            java.lang.String r6 = r13.f243912q
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r7 = r13.f243913r
            r1 = r10
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            ob0.b$c r1 = r10.mo115600n()
            boolean r2 = rp0.C90077a.m112679b(r1)
            if (r2 == 0) goto L_0x020c
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle> r2 = r10.f261207u
            if (r2 == 0) goto L_0x020c
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r1 = r13.f243907i
            int r2 = r13.f243908j
            int r3 = r13.f243909n
            bp0.C79746b.m96887a(r0, r1, r2, r3)
            goto L_0x0233
        L_0x020c:
            java.lang.String r2 = r13.f243907i
            int r3 = r13.f243908j
            int r4 = r13.f243909n
            bp0.C79746b.m96887a(r0, r2, r3, r4)
            if (r1 == 0) goto L_0x0228
            int r0 = r1.f256793a
            r1 = 4
            if (r0 != r1) goto L_0x0228
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r1 = r13.f243907i
            int r2 = r13.f243908j
            int r3 = r13.f243909n
            bp0.C79746b.m96887a(r0, r1, r2, r3)
            goto L_0x0233
        L_0x0228:
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r1 = r13.f243907i
            int r2 = r13.f243908j
            int r3 = r13.f243909n
            bp0.C79746b.m96887a(r0, r1, r2, r3)
        L_0x0233:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle> r0 = r10.f261207u
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            android.util.Pair r4 = android.util.Pair.create(r0, r1)
            goto L_0x0277
        L_0x023c:
            java.lang.String r1 = "CgiWxaJsApiInfo async"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r9.f259641f = r0
            wo0.i r0 = new wo0.i
            java.lang.String r2 = r13.f243907i
            int r3 = r13.f243908j
            java.util.List<wo0.l> r4 = r13.f243915t
            r5 = 0
            java.lang.String r6 = r13.f243912q
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r7 = r13.f243913r
            r1 = r0
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            mp3.i r1 = mp3.C88819d.LOGIC
            wo0.h r2 = new wo0.h
            r2.<init>(r0)
            r1.arrange(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r4 = android.util.Pair.create(r10, r0)
            goto L_0x0277
        L_0x0266:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r1 = r13.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "call() todoChecJsApiAppInfoList null, return, hash:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
        L_0x0277:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83471t3.call():java.lang.Object");
    }

    /* renamed from: f */
    public String mo115591f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppWxaJsApiPermissionInfo";
    }
}
