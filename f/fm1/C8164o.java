package fm1;

import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import up1.C37521f;

/* renamed from: fm1.o */
public final class C8164o {

    /* renamed from: a */
    public static final C8164o f27042a = new C8164o();

    /* renamed from: b */
    public static int f27043b = C37521f.f99269R.mo60266n().intValue();

    /* renamed from: c */
    public static long f27044c;

    /* renamed from: d */
    public static final SparseArray<Integer> f27045d = new SparseArray<>();

    static {
        C37521f.f99374d.getClass();
        Log.m105924i("NearbyConfig", "CACHE_DATA_EXPIRED_MS:" + f27043b);
    }

    /* renamed from: a */
    public final int mo9217a() {
        int b = mo9218b();
        if (b == 1006) {
            return 112;
        }
        switch (b) {
            case 1002:
                return 15;
            case 1003:
                return 77;
            default:
                return 94;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r4 == 1001) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9218b() {
        /*
            r7 = this;
            vc1.b r0 = vc1.C37715b.f99914a
            boolean r1 = r0.mo61298a()
            r2 = 1006(0x3ee, float:1.41E-42)
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r1 == 0) goto L_0x000f
            r1 = 1006(0x3ee, float:1.41E-42)
            goto L_0x0011
        L_0x000f:
            r1 = 1001(0x3e9, float:1.403E-42)
        L_0x0011:
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NEARBY_LAST_TAB_TYPE_INT_SYNC
            r6 = -1
            int r4 = r4.mo119689j(r5, r6)
            boolean r0 = r0.mo61298a()
            if (r0 == 0) goto L_0x0029
            if (r4 != r3) goto L_0x002e
            goto L_0x002f
        L_0x0029:
            if (r4 != r2) goto L_0x002e
            r2 = 1001(0x3e9, float:1.403E-42)
            goto L_0x002f
        L_0x002e:
            r2 = r4
        L_0x002f:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r3 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
            java.lang.String r4 = "NearbyEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r3.mo77227G5(r4)
            if (r3 == 0) goto L_0x0062
            te3.xi1 r4 = r3.field_ctrInfo
            int r4 = r4.f144670e
            r5 = 1014(0x3f6, float:1.421E-42)
            if (r4 != r5) goto L_0x0053
            java.lang.String r0 = "Finder.RedDotManager"
            java.lang.String r3 = "[getNearbyAliveTabType] entrance red dot is foot print, jump to default tab"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0062
        L_0x0053:
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            int r0 = r0.mo77280t(r3)
            goto L_0x0063
        L_0x0062:
            r0 = -1
        L_0x0063:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get3TabTargetTabType defaultType="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", lastExitType:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " aliveType="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "NearbyConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r0 == r6) goto L_0x008d
            r1 = r0
            goto L_0x0094
        L_0x008d:
            if (r2 == r6) goto L_0x0094
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r2 == r0) goto L_0x0094
            r1 = r2
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fm1.C8164o.mo9218b():int");
    }

    /* renamed from: c */
    public final int mo9219c(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - f27044c;
        Integer num = f27045d.get(i);
        int intValue = num == null ? 0 : num.intValue();
        Log.m105924i("NearbyConfig", "getExitLiveTabId expiredMs:" + elapsedRealtime + " tabId:" + intValue + " commentScene: " + i);
        if (elapsedRealtime > ((long) f27043b)) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: d */
    public final String mo9220d() {
        int b = mo9218b();
        if (b == 1006) {
            return "8003";
        }
        switch (b) {
            case 1002:
                return "1002";
            case 1003:
                return "1003";
            default:
                return "1001";
        }
    }
}
