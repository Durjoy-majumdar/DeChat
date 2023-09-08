package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import nj3.C11182m0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.w */
public class C40471w implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f108760d;

    /* renamed from: e */
    public final /* synthetic */ double f108761e;

    /* renamed from: f */
    public final /* synthetic */ double f108762f;

    /* renamed from: g */
    public final /* synthetic */ C82613z f108763g;

    public C40471w(C82613z zVar, C81925i2 i2Var, double d, double d2) {
        this.f108763g = zVar;
        this.f108760d = i2Var;
        this.f108761e = d;
        this.f108762f = d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00ac, code lost:
        if (r1 != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateMMMenu(nj3.C76874e0 r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.appbrand.jsapi.lbs.z r0 = r12.f108763g
            com.tencent.mm.plugin.appbrand.i2 r1 = r12.f108760d
            android.app.Activity r1 = r1.mo114344o0()
            double r2 = r12.f108761e
            double r4 = r12.f108762f
            r0.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = "com.tencent.map"
            r6.add(r7)
            java.lang.String r8 = "com.google.android.apps.maps"
            r6.add(r8)
            java.lang.String r8 = "com.baidu.BaiduMap"
            r6.add(r8)
            java.lang.String r8 = "com.autonavi.minimap"
            r6.add(r8)
            java.lang.String r8 = "com.sogou.map.android.maps"
            r6.add(r8)
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 0
            r9[r3] = r2
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r4 = 1
            r9[r4] = r2
            java.lang.String r2 = "geo:%f,%f"
            java.lang.String r2 = java.lang.String.format(r2, r9)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r5.<init>(r9, r2)
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r10 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r2.queryIntentActivities(r5, r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x0062:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x008c
            java.lang.Object r5 = r2.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r10 = r5.activityInfo
            java.lang.String r10 = r10.packageName
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x0062
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r10 = r5.packageName
            android.content.pm.PackageManager r11 = r1.getPackageManager()
            java.lang.CharSequence r5 = r5.loadLabel(r11)
            java.lang.String r5 = r5.toString()
            r9.put(r10, r5)
            goto L_0x0062
        L_0x008c:
            r0.f241748h = r9
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            r0 = r0 ^ r4
            if (r0 != 0) goto L_0x00af
            com.tencent.mm.plugin.appbrand.jsapi.lbs.z r1 = r12.f108763g
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f241748h
            boolean r1 = r1.containsKey(r7)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r2[r3] = r5
            java.lang.String r5 = "MicroMsg.JsApiOpenMapApp"
            java.lang.String r6 = "install tencent map: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
            if (r1 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r4 = r0
        L_0x00b0:
            if (r4 == 0) goto L_0x00b8
            r0 = 2131837838(0x7f11438e, float:1.9308882E38)
            r13.mo107135b(r8, r0, r3)
        L_0x00b8:
            r0 = 3
            com.tencent.mm.plugin.appbrand.jsapi.lbs.z r1 = r12.f108763g
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f241748h
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x00e6
            java.lang.Object r2 = r2.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r13.mo107144g(r0, r2, r3)
        L_0x00e6:
            int r0 = r0 + 1
            goto L_0x00c5
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C40471w.onCreateMMMenu(nj3.e0):void");
    }
}
