package bo1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import er1.C58739j4;
import hp3.C87581a;
import ht1.C8781l2;
import java.util.ArrayList;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

@C86522b
/* renamed from: bo1.c */
public final class C0339c extends C86301e implements C8781l2 {

    /* renamed from: d */
    public final ArrayList<Long> f919d = new ArrayList<>();

    /* renamed from: bo1.c$a */
    public static final class C0340a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C0339c f920a;

        /* renamed from: b */
        public final /* synthetic */ long f921b;

        /* renamed from: c */
        public final /* synthetic */ boolean f922c;

        public C0340a(C0339c cVar, long j, boolean z) {
            this.f920a = cVar;
            this.f921b = j;
            this.f922c = z;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if ((i == 0 && cVar.f256794b == 0) || C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            }
            this.f920a.f919d.remove(Long.valueOf(this.f921b));
            Log.m105924i("FinderFeedPreloadService", "tryGetFinderObject finish, errType=" + cVar.f256793a + ", errCode=" + cVar.f256794b + ", feedId=" + C61926c.m72691p(this.f921b) + ", isLandscapeFeed=" + this.f922c);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* renamed from: xE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo377xE(long r26, java.lang.String r28, int r29, boolean r30) {
        /*
            r25 = this;
            r0 = r25
            r14 = r26
            r7 = r30
            java.lang.String r1 = "nonceId"
            r13 = r28
            gy3.C87412m.m108594g(r13, r1)
            r8 = 0
            r1 = 0
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            return r8
        L_0x0015:
            r11 = 1
            if (r7 == 0) goto L_0x0152
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<bo1.u> r2 = bo1.C0359u.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            bo1.u r1 = (bo1.C0359u) r1
            r1.getClass()
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99492q3
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "FinderShareRelPreloadCore"
            if (r1 == r11) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkPreloadLandscapeRelFeedList: expt is close, feedId="
            r1.append(r3)
            java.lang.String r3 = o40.C61926c.m72691p(r26)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0152
        L_0x005a:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_MP_PREFETCH_TYPE_INT_SYNC
            int r5 = r1.mo119689j(r3, r8)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC
            int r1 = r1.mo119689j(r3, r8)
            java.lang.String r3 = ", cacheValidIntervalSec="
            if (r5 == 0) goto L_0x012c
            if (r1 > 0) goto L_0x007e
            goto L_0x012c
        L_0x007e:
            j31.a$b r4 = j31.C9276a.f29023b
            j31.a r4 = r4.mo10053a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "3688+"
            r6.append(r9)
            java.lang.String r9 = o40.C61926c.m72691p(r26)
            r6.append(r9)
            java.lang.String r9 = "+0+31"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            j31.b r4 = r4.mo10052a(r6)
            boolean r6 = r4 instanceof bo1.C0341e
            if (r6 == 0) goto L_0x00a9
            bo1.e r4 = (bo1.C0341e) r4
            goto L_0x00aa
        L_0x00a9:
            r4 = 0
        L_0x00aa:
            if (r4 == 0) goto L_0x00cc
            _result r6 = r4.f29027b
            if (r6 == 0) goto L_0x00b6
            boolean r6 = r4.mo380g()
            if (r6 != 0) goto L_0x00c5
        L_0x00b6:
            a14.u0<? extends _result> r4 = r4.f29029d
            if (r4 == 0) goto L_0x00c2
            boolean r4 = r4.mo74466a()
            if (r4 != r11) goto L_0x00c2
            r4 = 1
            goto L_0x00c3
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            if (r4 == 0) goto L_0x00c7
        L_0x00c5:
            r4 = 1
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            if (r4 != r11) goto L_0x00cc
            r4 = 1
            goto L_0x00cd
        L_0x00cc:
            r4 = 0
        L_0x00cd:
            if (r4 == 0) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkPreloadLandscapeRelFeedList: already have cache, feedId="
            r1.append(r3)
            java.lang.String r3 = o40.C61926c.m72691p(r26)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0152
        L_0x00e8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkPreloadLandscapeRelFeedList: start preload, feedId="
            r4.append(r6)
            java.lang.String r6 = o40.C61926c.m72691p(r26)
            r4.append(r6)
            java.lang.String r6 = ", prefetchType="
            r4.append(r6)
            r4.append(r5)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            a14.h0 r1 = a14.C53872d1.f151119c
            a14.n0 r16 = a14.C53930o0.m60554a(r1)
            r17 = 0
            r18 = 0
            bo1.t r19 = new bo1.t
            r6 = 0
            r1 = r19
            r2 = r26
            r4 = r28
            r1.<init>(r2, r4, r5, r6)
            r20 = 3
            r21 = 0
            a14.C53895h.m60466d(r16, r17, r18, r19, r20, r21)
            goto L_0x0152
        L_0x012c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkPreloadLandscapeRelFeedList: is closed, prefetchType="
            r4.append(r6)
            r4.append(r5)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ", feedId="
            r4.append(r1)
            java.lang.String r1 = o40.C61926c.m72691p(r26)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0152:
            vp1.e r1 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo89871e(r14)
            java.lang.String r2 = ", isLandscapeFeed="
            java.lang.String r3 = "FinderFeedPreloadService"
            if (r1 == 0) goto L_0x017d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "preloadBizTimelineFeed: already has cache, feedId="
            r1.append(r4)
            java.lang.String r4 = o40.C61926c.m72691p(r26)
            r1.append(r4)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r8
        L_0x017d:
            java.util.ArrayList<java.lang.Long> r1 = r0.f919d
            java.lang.Long r4 = java.lang.Long.valueOf(r26)
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "preloadBizTimelineFeed: feed is preloading, feedId="
            r1.append(r4)
            java.lang.String r4 = o40.C61926c.m72691p(r26)
            r1.append(r4)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r8
        L_0x01a8:
            java.util.ArrayList<java.lang.Long> r1 = r0.f919d
            java.lang.Long r2 = java.lang.Long.valueOf(r26)
            r1.add(r2)
            je1.x1 r23 = new je1.x1
            r1 = r23
            r6 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            r2 = 0
            r24 = 1
            r11 = r2
            r2 = 0
            r13 = r2
            r2 = 0
            r4 = r14
            r14 = r2
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 122816(0x1dfc0, float:1.72102E-40)
            r22 = 0
            java.lang.String r2 = ""
            r3 = r7
            r7 = r2
            r2 = r26
            r4 = r28
            r5 = r29
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            nr3.e r1 = r23.mo9225i()
            bo1.c$a r2 = new bo1.c$a
            r3 = r26
            r5 = r30
            r2.<init>(r0, r3, r5)
            r1.mo123062e(r2)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: bo1.C0339c.mo377xE(long, java.lang.String, int, boolean):boolean");
    }
}
