package com.tencent.p014mm.plugin.appbrand.config;

import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p1031sb.C90155b;
import p1042u.C111059i;
import u24.C90595a;
import wi0.C38164x;
import wi0.C91000y;

/* renamed from: com.tencent.mm.plugin.appbrand.config.d */
public final class C81648d extends C90155b {

    /* renamed from: h */
    public final String[] f239669h = {"wx308bd2aeb83d3345"};

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public static com.tencent.p014mm.plugin.appbrand.config.C81648d m100144g() {
        /*
            java.lang.Class<sb.b> r0 = p1031sb.C90155b.class
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0016 }
            sb.b r1 = p1031sb.C90155b.f258853f     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x000f
            com.tencent.mm.plugin.appbrand.config.d r1 = new com.tencent.mm.plugin.appbrand.config.d     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            p1031sb.C90155b.f258853f = r1     // Catch:{ all -> 0x0018 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            sb.b r1 = p1031sb.C90155b.f258853f     // Catch:{ all -> 0x0016 }
            com.tencent.mm.plugin.appbrand.config.d r1 = (com.tencent.p014mm.plugin.appbrand.config.C81648d) r1     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r1
        L_0x0016:
            r1 = move-exception
            goto L_0x001b
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81648d.m100144g():com.tencent.mm.plugin.appbrand.config.d");
    }

    /* renamed from: f */
    public AppBrandInitConfigWC mo113991a(WxaAttributes wxaAttributes) {
        AppBrandInitConfigWC appBrandInitConfigWC;
        AppBrandInitConfigLU a = super.mo113991a(wxaAttributes);
        if (a != null) {
            appBrandInitConfigWC = new AppBrandInitConfigWC(a.mo113913b());
            appBrandInitConfigWC.f239373d1 = wxaAttributes.mo113940m2().mo113971b() && (MultiProcessMMKV.getMMKV("MicroMsg.AppBrandPersistentRuntimeConfig").getBoolean("KEY_XWEB_INSTALLED", false) || !C90595a.m113498b(this.f239669h, appBrandInitConfigWC.f239362d));
        } else {
            appBrandInitConfigWC = null;
        }
        if (appBrandInitConfigWC != null) {
            appBrandInitConfigWC.f239380k1 = wxaAttributes.mo113941n2().f239507a.f239535w;
            appBrandInitConfigWC.f239381l1 = wxaAttributes.mo113941n2().f239507a.f239536x;
            C38164x qq = ((C91000y) C81161g2.Bx0(C91000y.class)).mo125064qq(appBrandInitConfigWC.f239362d);
            Object[] objArr = new Object[2];
            objArr[0] = appBrandInitConfigWC.f239362d;
            objArr[1] = qq == null ? "null" : qq.field_exptInfo;
            Log.m105925i("MicroMsg.AppBrandInitConfigHelperWC", "assembleConfig for appId(%s), getExptInfo return %s", objArr);
            if (qq != null && !TextUtils.isEmpty(qq.field_exptInfo)) {
                appBrandInitConfigWC.f234823V0 = qq.field_exptInfo;
            }
        }
        if (appBrandInitConfigWC != null && !TextUtils.isEmpty(appBrandInitConfigWC.f239362d)) {
            String str = appBrandInitConfigWC.f239362d;
            Log.m105925i("Luggage.WXA.AppBrandInitConfigHelper", "clearByAppId %s", str);
            synchronized (this.f258855d) {
                ((C111059i) this.f258855d).remove(str);
            }
        }
        appBrandInitConfigWC.f234815R0.mo76934e(appBrandInitConfigWC.f234841u);
        return appBrandInitConfigWC;
    }

    /* renamed from: h */
    public AppBrandInitConfigWC mo113992b(String str) {
        return (AppBrandInitConfigWC) super.mo113992b(str);
    }
}
