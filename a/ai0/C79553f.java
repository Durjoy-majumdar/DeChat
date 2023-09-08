package ai0;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81112d;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81114e;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81116f;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81118g;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81120h;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81121j;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI1;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI2;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI3;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI4;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sn0.C90259e;

/* renamed from: ai0.f */
public class C79553f {

    /* renamed from: a */
    public static final Map<String, Class<? extends AppBrandAdUI>> f233288a;

    /* renamed from: b */
    public static Set<String> f233289b;

    /* renamed from: ai0.f$a */
    public static class C79554a {

        /* renamed from: a */
        public static final C81439t0 f233290a;

        static {
            C81439t0 t0Var = new C81439t0(C82419d1.m101178d("__ad"), "wxfile://ad");
            f233290a = t0Var;
            t0Var.f238994f = DownloadHelper.SAVE_LENGTH;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(":appbrand0", AppBrandAdUI.class);
        hashMap.put(":appbrand1", AppBrandAdUI1.class);
        hashMap.put(":appbrand2", AppBrandAdUI2.class);
        hashMap.put(":appbrand3", AppBrandAdUI3.class);
        hashMap.put(":appbrand4", AppBrandAdUI4.class);
        f233288a = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        f233289b = hashSet;
        hashSet.add(C81120h.NAME);
        f233289b.add(C81118g.NAME);
        f233289b.add(C81116f.NAME);
        f233289b.add(C81114e.NAME);
        f233289b.add(C81112d.NAME);
        f233289b.add(C81121j.NAME);
        f233289b.add(C90259e.C90262c.NAME);
        f233289b.add(C90259e.C90264e.NAME);
        f233289b.add(C90259e.C90261b.NAME);
        f233289b.add(C90259e.C90263d.NAME);
        f233289b.add(C90259e.C90260a.NAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r3 == 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r3 == 1) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m96594a(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r8) {
        /*
            boolean r0 = ai0.C27903c.m38028a()
            r1 = 0
            java.lang.String r2 = "MicroMsg.AppBrandAdUtils[AppBrandSplashAd]"
            if (r0 != 0) goto L_0x000f
            java.lang.String r8 = "isAdContact, showad experiment closed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            return r1
        L_0x000f:
            if (r8 == 0) goto L_0x008c
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r8.mo113210l1()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC
            if (r0 != 0) goto L_0x001b
            goto L_0x008c
        L_0x001b:
            boolean r0 = r8.mo121254q1()
            if (r0 == 0) goto L_0x0028
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r8.mo113210l1()
            boolean r0 = r0.f239381l1
            goto L_0x002e
        L_0x0028:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r8.mo113210l1()
            boolean r0 = r0.f239380k1
        L_0x002e:
            java.lang.String r3 = "appbrandAd"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            r4 = -1
            java.lang.String r5 = "allshowad"
            int r3 = r3.decodeInt(r5, r4)
            java.lang.String r4 = "MicroMsg.AppBrandAdABTests[AppBrandSplashAd]"
            r5 = 1
            if (r3 < 0) goto L_0x0053
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r1] = r7
            java.lang.String r7 = "canAllShowAppBrandAd, command value:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r6)
            if (r3 != r5) goto L_0x0051
        L_0x004f:
            r3 = 1
            goto L_0x0071
        L_0x0051:
            r3 = 0
            goto L_0x0071
        L_0x0053:
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_appbrand_all_show_ad
            int r3 = r3.mo58779Qe(r6, r1)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r1] = r7
            java.lang.String r7 = "canAllShowAppBrandAd, experiment value:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r6)
            if (r3 != r5) goto L_0x0051
            goto L_0x004f
        L_0x0071:
            if (r3 == 0) goto L_0x0079
            java.lang.String r0 = "isAdContact, set to all show ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 1
        L_0x0079:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = r8.f238147j
            r3[r1] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r3[r5] = r8
            java.lang.String r8 = "isAdContact, appId:%s, canShowAd:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r3)
            return r0
        L_0x008c:
            java.lang.String r8 = "isAdContact, null runtime or wrong initConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai0.C79553f.m96594a(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m96595b(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r8, com.tencent.p014mm.plugin.appbrand.task.q$$h r9, boolean r10) {
        /*
            int r9 = r9.ordinal()
            r0 = 1
            r1 = 2
            r2 = 3
            if (r9 == 0) goto L_0x0014
            if (r9 == r0) goto L_0x0012
            if (r9 == r1) goto L_0x0010
            if (r9 == r2) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            r9 = 3
            goto L_0x0015
        L_0x0012:
            r9 = 2
            goto L_0x0015
        L_0x0014:
            r9 = 1
        L_0x0015:
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r3 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r8.mo113210l1()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r8 = r8.mo121253n1()
            java.lang.String r5 = ""
            r3.<init>(r5, r4, r8)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 21052(0x523c, float:2.95E-41)
            r5 = 7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            java.lang.String r7 = r3.f245833e
            r5[r6] = r7
            int r6 = r3.f245837i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r0] = r6
            int r6 = r3.f245834f
            if (r6 == r0) goto L_0x0048
            if (r6 == r1) goto L_0x0045
            if (r6 == r2) goto L_0x0042
            r0 = 0
            goto L_0x004a
        L_0x0042:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct.C80774a.demo
            goto L_0x004a
        L_0x0045:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct.C80774a.debug
            goto L_0x004a
        L_0x0048:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct.C80774a.release
        L_0x004a:
            r5[r1] = r0
            int r0 = r3.f245835g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r2] = r0
            r0 = 4
            int r1 = r3.f245836h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r0] = r1
            r0 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r0] = r9
            r9 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r9] = r10
            r8.mo160131h(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai0.C79553f.m96595b(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC, com.tencent.mm.plugin.appbrand.task.q$$h, boolean):void");
    }
}
