package vc1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import lc3.C10485b;
import oe1.C35152b;
import pe1.C35464c;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: vc1.b */
public final class C37715b {

    /* renamed from: a */
    public static final C37715b f99914a = new C37715b();

    /* renamed from: b */
    public static boolean f99915b;

    /* renamed from: c */
    public static final C13601g f99916c = C36568h.m40985a(C14428a.f40032d);

    /* renamed from: vc1.b$a */
    public static final class C14428a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C14428a f40032d = new C14428a();

        public C14428a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("_finder_live_entrance_mmkv" + C86709a0.m107523b().mo121110g());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0068, code lost:
        if (r4 == 1) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0076, code lost:
        if (r1 == 1) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61298a() {
        /*
            r9 = this;
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            boolean r0 = r0.mo76873sF()
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "FinderNewLiveEntrySwitch"
            r3 = 0
            int r1 = r1.mo107404b(r2, r3)
            rx3.g r2 = f99916c
            r4 = r2
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r4
            java.lang.String r5 = "live_status_flag"
            r6 = -1
            int r4 = r4.getInt(r5, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "isEnableByDynamicConfig localSwitch: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = " dynamicSwitch: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderFindPageLiveABTest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            r7 = 1
            if (r4 == r6) goto L_0x006b
            if (r1 == r4) goto L_0x0068
            boolean r2 = f99915b
            if (r2 == 0) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            it1.e r2 = new it1.e
            vc1.c r5 = new vc1.c
            r5.<init>(r1)
            r2.<init>(r1, r5)
            r2.mo9225i()
            f99915b = r7
        L_0x0068:
            if (r4 != r7) goto L_0x007a
            goto L_0x0078
        L_0x006b:
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
            r2.putInt(r5, r1)
            if (r1 != r7) goto L_0x007a
        L_0x0078:
            r1 = 1
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            pe1.c<java.lang.Integer> r2 = oe1.C35152b.f94273a
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r7) goto L_0x008b
            r2 = 1
            goto L_0x008c
        L_0x008b:
            r2 = 0
        L_0x008c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isEnableFindLive isEnableFinder: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " isEnableByDynamicConfig: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "  hasDebug: "
            r4.append(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r4.append(r5)
            java.lang.String r5 = " isEnableByExpt: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r0 == 0) goto L_0x00c3
            if (r1 != 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00c3
        L_0x00c2:
            r3 = 1
        L_0x00c3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vc1.C37715b.mo61298a():boolean");
    }

    /* renamed from: b */
    public final boolean mo61299b() {
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderNewLiveEntryOnTopStorySwitch", 0) == 1;
        C35464c<Integer> cVar = C35152b.f94273a;
        boolean z2 = C35152b.f94275c.mo60266n().intValue() == 1;
        Log.m105924i("FinderFindPageLiveABTest", "isEnableFinderLiveAboveLook isEnableDynamicConfig:" + z + " isEnableExpt:" + z2);
        return (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) ? z2 : z || z2;
    }
}
