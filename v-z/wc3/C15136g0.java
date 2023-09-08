package wc3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: wc3.g0 */
public final class C15136g0 {

    /* renamed from: a */
    public static final C13601g f41263a = C36568h.m40985a(C15137a.f41264d);

    /* renamed from: wc3.g0$a */
    public static final class C15137a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C15137a f41264d = new C15137a();

        public C15137a() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            long j = FrequentLimiter.WEEK_MILLS;
            if (hVar != null) {
                C32735h.C32737c cVar = C32735h.C32737c.clicfg_opensdk_launch_appbrand_cache_data_expire_time;
                C13601g gVar = C15136g0.f41263a;
                j = hVar.mo58777He(cVar, FrequentLimiter.WEEK_MILLS);
            } else {
                C13601g gVar2 = C15136g0.f41263a;
            }
            Log.m105924i("MicroMsg.OpenSDKLaunchWXMiniProgramHelper", "miniProgramTranslateLinkResultCacheTime:" + j);
            return Long.valueOf(j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[Catch:{ Exception -> 0x001f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ Exception -> 0x001f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14249a(java.lang.String r10, boolean r11, java.lang.String r12) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.OpenSDKLaunchWXMiniProgramHelper"
            r2 = 0
            rx3.g r3 = f41263a     // Catch:{ Exception -> 0x001f }
            rx3.n r3 = (rx3.C36570n) r3     // Catch:{ Exception -> 0x001f }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x001f }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x001f }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x001f }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0022
            java.lang.String r10 = "cacheWXMiniProgramJumpResult cacheTime <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)     // Catch:{ Exception -> 0x001f }
            return
        L_0x001f:
            r10 = move-exception
            goto L_0x00bc
        L_0x0022:
            r3 = 1
            if (r10 == 0) goto L_0x002e
            boolean r4 = z04.C112551y.m153811k(r10)     // Catch:{ Exception -> 0x001f }
            if (r4 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = 0
            goto L_0x002f
        L_0x002e:
            r4 = 1
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            return
        L_0x0032:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r4 = new com.tencent.mm.sdk.platformtools.MMKVSlotManager     // Catch:{ Exception -> 0x001f }
            java.lang.String r7 = "opensdk_launch_miniprogram_cache"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)     // Catch:{ Exception -> 0x001f }
            java.lang.String r8 = "getMMKV(MMKV_OPENSDK_LAUNCH_MINIPROGRAM)"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ Exception -> 0x001f }
            r8 = 604800(0x93a80, double:2.98811E-318)
            r4.<init>(r7, r8)     // Catch:{ Exception -> 0x001f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001f }
            r7.<init>()     // Catch:{ Exception -> 0x001f }
            java.lang.String r8 = "link"
            r7.append(r8)     // Catch:{ Exception -> 0x001f }
            r7.append(r10)     // Catch:{ Exception -> 0x001f }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x001f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001f }
            r8.<init>()     // Catch:{ Exception -> 0x001f }
            java.lang.String r9 = "cacheWXMiniProgramJumpResult key:"
            r8.append(r9)     // Catch:{ Exception -> 0x001f }
            r8.append(r10)     // Catch:{ Exception -> 0x001f }
            java.lang.String r9 = ", jumpSuccess:"
            r8.append(r9)     // Catch:{ Exception -> 0x001f }
            r8.append(r11)     // Catch:{ Exception -> 0x001f }
            java.lang.String r9 = ", deepLink:"
            r8.append(r9)     // Catch:{ Exception -> 0x001f }
            r8.append(r12)     // Catch:{ Exception -> 0x001f }
            java.lang.String r9 = ", deepLinkKey:"
            r8.append(r9)     // Catch:{ Exception -> 0x001f }
            r8.append(r7)     // Catch:{ Exception -> 0x001f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x001f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ Exception -> 0x001f }
            if (r11 == 0) goto L_0x00b2
            java.lang.Object r11 = r4.getSlotForWrite()     // Catch:{ Exception -> 0x001f }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r11     // Catch:{ Exception -> 0x001f }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x001f }
            r11.encode((java.lang.String) r10, (long) r5)     // Catch:{ Exception -> 0x001f }
            if (r12 == 0) goto L_0x009c
            boolean r10 = z04.C112551y.m153811k(r12)     // Catch:{ Exception -> 0x001f }
            if (r10 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            if (r3 != 0) goto L_0x00a8
            java.lang.Object r10 = r4.getSlotForWrite()     // Catch:{ Exception -> 0x001f }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10     // Catch:{ Exception -> 0x001f }
            r10.encode((java.lang.String) r7, (java.lang.String) r12)     // Catch:{ Exception -> 0x001f }
            goto L_0x00c1
        L_0x00a8:
            java.lang.Object r10 = r4.getSlotForWrite()     // Catch:{ Exception -> 0x001f }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10     // Catch:{ Exception -> 0x001f }
            r10.encode((java.lang.String) r7, (java.lang.String) r0)     // Catch:{ Exception -> 0x001f }
            goto L_0x00c1
        L_0x00b2:
            java.lang.Object r11 = r4.getSlotForWrite()     // Catch:{ Exception -> 0x001f }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r11     // Catch:{ Exception -> 0x001f }
            r11.encode((java.lang.String) r10, (long) r5)     // Catch:{ Exception -> 0x001f }
            goto L_0x00c1
        L_0x00bc:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc3.C15136g0.m14249a(java.lang.String, boolean, java.lang.String):void");
    }
}
