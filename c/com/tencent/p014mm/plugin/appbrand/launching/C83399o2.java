package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83362l1;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.o2 */
public class C83399o2 implements C83362l1, C83362l1.C83363a, C83404p1 {

    /* renamed from: d */
    public final String f243676d;

    /* renamed from: e */
    public final int f243677e;

    /* renamed from: f */
    public final boolean f243678f;

    /* renamed from: g */
    public final String f243679g;

    /* renamed from: h */
    public final String f243680h;

    /* renamed from: i */
    public WxaAttributes.WxaVersionInfo f243681i;

    /* renamed from: j */
    public final ICommLibReader f243682j;

    /* renamed from: n */
    public final QualitySession f243683n;

    /* renamed from: o */
    public final C90422jy f243684o;

    /* renamed from: p */
    public boolean f243685p = true;

    /* renamed from: q */
    public boolean f243686q;

    /* renamed from: r */
    public boolean f243687r;

    public C83399o2(String str, int i, boolean z, String str2, String str3, WxaAttributes.WxaVersionInfo wxaVersionInfo, ICommLibReader iCommLibReader, QualitySession qualitySession, C90422jy jyVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(wxaVersionInfo, "versionInfo");
        C87412m.m108594g(qualitySession, "reportQualitySession");
        C87412m.m108594g(jyVar, "cgiCommRequestSource");
        this.f243676d = str;
        this.f243677e = i;
        this.f243678f = z;
        this.f243679g = str2;
        this.f243680h = str3;
        this.f243681i = wxaVersionInfo;
        this.f243682j = iCommLibReader;
        this.f243683n = qualitySession;
        this.f243684o = jyVar;
    }

    /* renamed from: a */
    public void mo115635a(boolean z) {
        this.f243685p = z;
    }

    /* renamed from: b */
    public void mo115673b(int i) {
    }

    /* renamed from: c */
    public void mo115674c() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.util.LinkedList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.f243677e
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r0)
            r1 = 93
            java.lang.String r8 = "MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible"
            if (r0 == 0) goto L_0x0059
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r7.f243681i
            int r0 = r0.f239452d
            if (r0 == 0) goto L_0x0059
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.d1> r0 = com.tencent.p014mm.plugin.appbrand.launching.C29567d1.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.launching.d1 r0 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r0
            java.lang.String r2 = r7.f243676d
            int r3 = r7.f243677e
            java.lang.String r0 = r0.mo56815jo(r2, r3)
            if (r0 == 0) goto L_0x0030
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = wi0.C90982g0.m114149a(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r7.f243681i = r0
            goto L_0x0059
        L_0x0030:
            r22.mo115676e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "call() parse extInfoJson failed with appId["
            r0.append(r2)
            java.lang.String r2 = r7.f243676d
            r0.append(r2)
            java.lang.String r2 = "] versionType["
            r0.append(r2)
            int r2 = r7.f243677e
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r9 = 0
            goto L_0x031e
        L_0x0059:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo
            r4.<init>()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r7.f243681i
            int r2 = r0.f239452d
            r4.pkgVersion = r2
            int r2 = r7.f243677e
            r4.f238585d = r2
            java.lang.String r0 = r0.f239455g
            r4.md5 = r0
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap
            r0.<init>()
            r4.f238590i = r0
            com.tencent.mm.plugin.appbrand.launching.w1 r0 = com.tencent.p014mm.plugin.appbrand.launching.C83511w1.f243992a
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r7.f243681i
            java.lang.String r3 = r7.f243676d
            int r12 = r7.f243677e
            int r13 = r2.f239452d
            boolean r14 = r7.f243678f
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r15 = r7.f243682j
            r10 = r0
            r11 = r3
            boolean r5 = r10.mo115801a(r11, r12, r13, r14, r15)
            java.util.Map r3 = r0.mo115802b(r2, r3, r5)
            r0 = r3
            android.util.ArrayMap r0 = (android.util.ArrayMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            java.lang.String r5 = "versionInfo.moduleList"
            java.lang.String r6 = "__APP__"
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L_0x017f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r12 = "<this>"
            gy3.C87412m.m108594g(r2, r12)
            java.lang.Object r13 = r2.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo) r2
            boolean r6 = gy3.C87412m.m108589b(r6, r13)
            if (r6 != 0) goto L_0x0105
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r6 = r4.f238588g
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r14 = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
            r14.<init>()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r15 = r7.f243681i
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r15 = r15.f239460o
            gy3.C87412m.m108593f(r15, r5)
            java.util.Iterator r5 = r15.iterator()
        L_0x00d2:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x00e8
            java.lang.Object r15 = r5.next()
            r9 = r15
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r9 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r9
            java.lang.String r9 = r9.f239472d
            boolean r9 = gy3.C87412m.m108589b(r13, r9)
            if (r9 == 0) goto L_0x00d2
            goto L_0x00e9
        L_0x00e8:
            r15 = 0
        L_0x00e9:
            gy3.C87412m.m108591d(r15)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r15 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r15
            r14.name = r13
            java.lang.String r5 = r2.f239483e
            r14.md5 = r5
            boolean r5 = r15.f239474f
            r14.independent = r5
            java.lang.String[] r5 = r15.f239476h
            r14.aliases = r5
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r7.f243681i
            int r5 = r5.f239452d
            r14.pkgVersion = r5
            r6.add(r14)
        L_0x0105:
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> r5 = r2.f239484f
            if (r5 == 0) goto L_0x0112
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r5 = 0
            goto L_0x0113
        L_0x0112:
            r5 = 1
        L_0x0113:
            if (r5 != 0) goto L_0x0096
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r5 = r4.f238590i
            gy3.C87412m.m108591d(r5)
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> r2 = r2.f239484f
            if (r2 == 0) goto L_0x0124
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0125
        L_0x0124:
            r10 = 1
        L_0x0125:
            if (r10 == 0) goto L_0x0129
            r6 = 0
            goto L_0x0164
        L_0x0129:
            java.util.ArrayList r6 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r2, r9)
            r6.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x0138:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0164
            java.lang.Object r9 = r2.next()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r9 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo) r9
            gy3.C87412m.m108594g(r9, r12)
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r10 = new com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo
            r10.<init>()
            java.lang.String r11 = r9.f239437d
            r10.provider = r11
            int r11 = r9.f239438e
            r10.version = r11
            java.lang.String r11 = r9.f239439f
            r10.md5 = r11
            java.lang.String r11 = r9.f239440g
            r10.prefixPath = r11
            java.util.List<java.lang.Integer> r9 = r9.f239442i
            r10.contexts = r9
            r6.add(r10)
            goto L_0x0138
        L_0x0164:
            java.lang.String r2 = "moduleName"
            gy3.C87412m.m108594g(r13, r2)
            if (r6 == 0) goto L_0x0096
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0173
            goto L_0x0096
        L_0x0173:
            android.util.ArrayMap<com.tencent.mm.plugin.appbrand.appcache.r3, java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo>> r2 = r5.f238594d
            com.tencent.mm.plugin.appbrand.appcache.r3 r5 = new com.tencent.mm.plugin.appbrand.appcache.r3
            r5.<init>(r13)
            r2.put(r5, r6)
            goto L_0x0096
        L_0x017f:
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = r4.f238590i
            if (r0 == 0) goto L_0x0186
            r0.mo113468e()
        L_0x0186:
            boolean r0 = r7.f243678f
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r7.f243679g
            if (r0 == 0) goto L_0x0198
            java.lang.String r2 = "__wx__"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0198
            r0 = 1
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            if (r0 == 0) goto L_0x019e
            r9 = r4
            goto L_0x031e
        L_0x019e:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r7.f243681i
            boolean r2 = r0.f239461p
            if (r2 == 0) goto L_0x0274
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r0 = r0.f239460o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x0274
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r2 = r7.f243679g
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99875i(r2)
            java.lang.String r17 = p225rc.C89925n.m112488a(r2)
            if (r17 == 0) goto L_0x01c6
            int r2 = r17.length()
            if (r2 != 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r2 = 0
            goto L_0x01c7
        L_0x01c6:
            r2 = 1
        L_0x01c7:
            java.lang.String r9 = " versionType:"
            if (r2 == 0) goto L_0x0222
            java.lang.String r2 = r7.f243680h
            if (r2 == 0) goto L_0x01d8
            int r12 = r2.length()
            if (r12 != 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            r12 = 0
            goto L_0x01d9
        L_0x01d8:
            r12 = 1
        L_0x01d9:
            if (r12 == 0) goto L_0x01df
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r7.f243681i
            java.lang.String r2 = r2.f239462q
        L_0x01df:
            r17 = r2
            if (r17 == 0) goto L_0x01ec
            int r2 = r17.length()
            if (r2 != 0) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            r2 = 0
            goto L_0x01ed
        L_0x01ec:
            r2 = 1
        L_0x01ed:
            if (r2 == 0) goto L_0x01f1
            r2 = 0
            goto L_0x0252
        L_0x01f1:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r7.f243681i
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r2 = r2.f239460o
            gy3.C87412m.m108593f(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "LaunchCheckPkgHandlerSeparatedPluginsCompatible for module appId:"
            r5.append(r12)
            java.lang.String r12 = r7.f243676d
            r5.append(r12)
            r5.append(r9)
            int r9 = r7.f243677e
            r5.append(r9)
            java.lang.String r18 = r5.toString()
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r2
            java.lang.Object r2 = op0.C89277n.m111584a(r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r2
            goto L_0x0252
        L_0x0222:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r7.f243681i
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r2 = r2.f239460o
            gy3.C87412m.m108593f(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "LaunchCheckPkgHandlerSeparatedPluginsCompatible for path appId:"
            r5.append(r12)
            java.lang.String r12 = r7.f243676d
            r5.append(r12)
            r5.append(r9)
            int r9 = r7.f243677e
            r5.append(r9)
            java.lang.String r18 = r5.toString()
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r2
            java.lang.Object r2 = op0.C89277n.m111584a(r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r2
        L_0x0252:
            if (r2 == 0) goto L_0x0259
            java.lang.String r5 = r2.f239472d
            r0.add(r5)
        L_0x0259:
            if (r2 == 0) goto L_0x025e
            java.lang.String r5 = r2.f239472d
            goto L_0x025f
        L_0x025e:
            r5 = 0
        L_0x025f:
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x026d
            boolean r2 = r2.f239474f
            if (r2 != r11) goto L_0x026d
            r2 = 1
            goto L_0x026e
        L_0x026d:
            r2 = 0
        L_0x026e:
            if (r2 != 0) goto L_0x027c
            r0.add(r6)
            goto L_0x027c
        L_0x0274:
            java.lang.String[] r0 = new java.lang.String[]{r6}
            java.util.ArrayList r0 = sx3.C64197v.m75534c(r0)
        L_0x027c:
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "call() appId:"
            r0.append(r5)
            java.lang.String r5 = r7.f243676d
            r0.append(r5)
            java.lang.String r5 = ", versionType:"
            r0.append(r5)
            int r5 = r7.f243677e
            r0.append(r5)
            java.lang.String r5 = ", will request ("
            r0.append(r5)
            java.lang.String r5 = ","
            java.lang.String r5 = u24.C90599h.m113512e(r2, r5)
            r0.append(r5)
            java.lang.String r5 = ") for path:"
            r0.append(r5)
            java.lang.String r5 = r7.f243679g
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r11)
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference
            r11.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible["
            r0.append(r5)
            java.lang.String r5 = r7.f243676d
            r0.append(r5)
            r5 = 124(0x7c, float:1.74E-43)
            r0.append(r5)
            int r5 = r7.f243677e
            r0.append(r5)
            r0.append(r1)
            java.lang.String r12 = r0.toString()
            com.tencent.mm.plugin.appbrand.launching.k2 r13 = new com.tencent.mm.plugin.appbrand.launching.k2
            r0 = r13
            r1 = r22
            r5 = r11
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 2
            r1 = 0
            o40.C61926c.m72659D(r12, r10, r13, r0, r1)
            r9.await()     // Catch:{ all -> 0x02f2 }
            goto L_0x0317
        L_0x02f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "await semaphore failed with appId("
            r0.append(r1)
            java.lang.String r1 = r7.f243676d
            r0.append(r1)
            java.lang.String r1 = ") versionType("
            r0.append(r1)
            int r1 = r7.f243677e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0317:
            java.lang.Object r0 = r11.get()
            r9 = r0
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r9 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) r9
        L_0x031e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83399o2.call():java.lang.Object");
    }

    /* renamed from: d */
    public boolean mo115519d() {
        return this.f243685p;
    }

    /* renamed from: e */
    public final void mo115676e() {
        String str;
        int i = this.f243677e;
        if (i == 1) {
            str = C84737f0.m104395b(C0966R.string.f7745q9, new Object[0]);
        } else {
            str = C84737f0.m104395b(C0966R.string.f7814se, C81243g.m99551a(i));
        }
        mo115677f(str);
    }

    /* renamed from: f */
    public void mo115677f(String str) {
        if (this.f243685p) {
            C83454r3.m102416b(str, this);
            return;
        }
        Log.m105920e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "silent toast:error=" + str + ", stack=" + android.util.Log.getStackTraceString(new Throwable()));
    }
}
