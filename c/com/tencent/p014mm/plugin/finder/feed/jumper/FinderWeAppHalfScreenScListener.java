package com.tencent.p014mm.plugin.finder.feed.jumper;

import com.tencent.p014mm.plugin.appbrand.config.HeightInfo;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;
import kotlin.Metadata;
import pf1.C62262d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/jumper/FinderWeAppHalfScreenScListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.jumper.FinderWeAppHalfScreenScListener */
public final class FinderWeAppHalfScreenScListener extends WeAppHalfScreenStatusChangeListener {

    /* renamed from: f */
    public RecyclerViewDrawerSquares.C45117c f158662f;

    public FinderWeAppHalfScreenScListener(boolean z, RecyclerViewDrawerSquares.C45117c cVar) {
        super(z);
        this.f158662f = cVar;
    }

    /* renamed from: b */
    public void mo77350b() {
        Log.m105924i("FinderWeAppHalfScreenScListener", "onEnterFullScreen...");
    }

    /* renamed from: c */
    public void mo77351c() {
        Log.m105924i("FinderWeAppHalfScreenScListener", "onEnterHalfScreen...");
    }

    /* renamed from: d */
    public void mo77352d(boolean z) {
        Log.m105924i("FinderWeAppHalfScreenScListener", "onHalfScreenClose... isAnimationBegin=" + z);
        RecyclerViewDrawerSquares.C45117c cVar = this.f158662f;
        if (cVar != null) {
            cVar.mo3766g(false, z, 0);
        }
        if (!z) {
            C62262d0.f176978a.getClass();
            C62262d0.f176980c = false;
            RecyclerViewDrawerSquares.C45117c cVar2 = this.f158662f;
            if (cVar2 != null) {
                cVar2.mo9498f();
            }
            this.f158662f = null;
        }
    }

    /* renamed from: e */
    public void mo77353e(boolean z) {
        Log.m105924i("FinderWeAppHalfScreenScListener", "onHalfScreenOpen... isAnimationBegin=" + z);
        RecyclerViewDrawerSquares.C45117c cVar = this.f158662f;
        if (cVar != null) {
            cVar.mo3766g(true, z, 0);
        }
        C62262d0.f176978a.getClass();
        C62262d0.f176980c = true;
    }

    /* renamed from: f */
    public void mo77354f(HeightInfo heightInfo) {
        C87412m.m108594g(heightInfo, "info");
        int i = heightInfo.f158025d;
        int i2 = heightInfo.f158026e;
        if (i <= i2) {
            float f = ((float) 1) - ((((float) i) * 1.0f) / ((float) i2));
            RecyclerViewDrawerSquares.C45117c cVar = this.f158662f;
            if (cVar != null) {
                cVar.mo9497e(f);
            }
            Log.m105924i("FinderWeAppHalfScreenScListener", "onHeightChanged " + heightInfo + " percent：" + f);
        }
    }
}
