package ph1;

import cm1.C0740i2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import up1.C37521f;

/* renamed from: ph1.b */
public final class C11937b {

    /* renamed from: a */
    public static final C11937b f34871a = new C11937b();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0055, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11811a(com.tencent.p014mm.protocal.protobuf.FinderObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r7, r0)
            te3.c21 r7 = r7.liveInfo
            r0 = 0
            if (r7 == 0) goto L_0x006d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isFluentEnable finderObject liveId: "
            r1.append(r2)
            long r3 = r7.f182392d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FinderFluentSwitchABTes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            long r4 = r7.f182392d
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            long r4 = r7.f182392d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            r1 = 0
            r7 = 1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x006d
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x0069
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0069
            long r1 = r1.f182392d
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x006d
            r0 = 1
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C11937b.mo11811a(com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    /* renamed from: b */
    public final boolean mo11812b(C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "feed");
        if (!mo11813c()) {
            return false;
        }
        return !(i2Var instanceof BaseFinderFeed ? mo11811a(((BaseFinderFeed) i2Var).mo3513o().getFeedObject()) : false);
    }

    /* renamed from: c */
    public final boolean mo11813c() {
        C37521f.f99374d.getClass();
        return C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X();
    }
}
