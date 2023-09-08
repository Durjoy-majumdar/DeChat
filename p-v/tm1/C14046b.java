package tm1;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;

/* renamed from: tm1.b */
public final class C14046b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NearbyLiveSquareUIC f39396d;

    public C14046b(NearbyLiveSquareUIC nearbyLiveSquareUIC, ViewPager viewPager) {
        this.f39396d = nearbyLiveSquareUIC;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = r6.f39396d
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            gy3.C87412m.m108591d(r0)
            android.view.View r0 = r0.getView()
            java.lang.String r1 = "NearbyLiveSquareUIC"
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "addFragments after post view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0017:
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = r6.f39396d
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.isDetached()
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "addFragments after fragment detached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x002c:
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = r6.f39396d
            te3.x91 r2 = r0.f15659h
            r3 = 0
            if (r2 == 0) goto L_0x0073
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "addFragments go to target page:targetTabInfo="
            r4.append(r5)
            te3.x91 r5 = r0.f15659h
            if (r5 == 0) goto L_0x0048
            int r5 = r5.f144531d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0049
        L_0x0048:
            r5 = r3
        L_0x0049:
            r4.append(r5)
            r5 = 45
            r4.append(r5)
            te3.x91 r5 = r0.f15659h
            if (r5 == 0) goto L_0x0057
            java.lang.String r3 = r5.f144532e
        L_0x0057:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            int r1 = r2.f144531d
            r0.mo3609i3(r1)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$a r1 = r0.f15666r
            int r2 = r2.f144531d
            int r0 = r0.mo3608g3(r2)
            r1.onPageSelected(r0)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0073:
            if (r3 != 0) goto L_0x00ac
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = r6.f39396d
            bl3.r r1 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r2 = r0.getFragment()
            gy3.C87412m.m108591d(r2)
            bl3.r$a r1 = r1.mo62445d(r2)
            java.lang.Class<wm1.g> r2 = wm1.C15530g.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(fragment!…TabLayoutUIC::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            wm1.g r1 = (wm1.C15530g) r1
            r2 = 0
            com.google.android.material.tabs.TabLayout r1 = r1.mo14306f3()
            if (r1 == 0) goto L_0x00a7
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146907k(r2)
            if (r1 == 0) goto L_0x00a7
            boolean r3 = r1.mo76120a()
            if (r3 != 0) goto L_0x00a7
            r1.mo76121b()
        L_0x00a7:
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$a r0 = r0.f15666r
            r0.onPageSelected(r2)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tm1.C14046b.run():void");
    }
}
