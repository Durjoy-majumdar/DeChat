package kf1;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import gy3.C87412m;

/* renamed from: kf1.h3 */
public final class C9764h3 extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9764h3(MMActivity mMActivity, FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter, int i, int i2) {
        super(mMActivity, finderHalfScreenContract$Presenter, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderHalfScreenContract$Presenter, "presenter");
        this.f30130o = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r6 == false) goto L_0x0083;
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5181F0() {
        /*
            r8 = this;
            kf1.c r0 = r8.f30123e
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract.Presenter"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r0 = (com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter) r0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13094z
            java.lang.String r2 = "FinderHalfScreenContract"
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "cache exist!, show cache first"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.ArrayList r1 = r0.mo2492n()
            if (r1 == 0) goto L_0x001d
            r1.clear()
        L_0x001d:
            java.util.ArrayList r1 = r0.mo2492n()
            if (r1 == 0) goto L_0x002b
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13094z
            gy3.C87412m.m108591d(r3)
            r1.add(r3)
        L_0x002b:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r8.mo10312p()
            r1.notifyDataSetChanged()
        L_0x0032:
            long r3 = r0.f13089u
            j31.a$b r1 = j31.C9276a.f29023b
            j31.a r1 = r1.mo10053a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "3688+"
            r5.append(r6)
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r5.append(r3)
            java.lang.String r3 = "+0+31"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            j31.b r1 = r1.mo10052a(r3)
            boolean r3 = r1 instanceof bo1.C0341e
            r4 = 0
            if (r3 == 0) goto L_0x0060
            bo1.e r1 = (bo1.C0341e) r1
            goto L_0x0061
        L_0x0060:
            r1 = r4
        L_0x0061:
            r3 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0083
            boolean r6 = r1.mo380g()
            if (r6 == 0) goto L_0x007f
            te3.lp0 r6 = r1.mo382j()
            if (r6 == 0) goto L_0x007a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r6.f137560d
            if (r6 == 0) goto L_0x007a
            int r6 = r6.size()
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            if (r6 <= 0) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r1 = r4
        L_0x0084:
            if (r1 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r3 = 0
        L_0x0088:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "onViewPrepared: hasPreloadCache="
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = ", firstObjectId="
            r1.append(r6)
            long r6 = r0.f13089u
            java.lang.String r6 = o40.C61926c.m72691p(r6)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r3 == 0) goto L_0x00b0
            r0.mo2565s1()
            goto L_0x00b8
        L_0x00b0:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r8.mo10308D()
            r1 = 3
            com.tencent.p014mm.view.RefreshLoadMoreLayout.m66897N(r0, r5, r5, r1, r4)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9764h3.mo5181F0():void");
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
