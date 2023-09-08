package com.tencent.p014mm.plugin.finder.live.viewmodel;

import android.widget.ProgressBar;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.b */
public final class C56121b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC f160008d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56121b(FinderLiveVisitorGameRankSwitchUIC finderLiveVisitorGameRankSwitchUIC) {
        super(0);
        this.f160008d = finderLiveVisitorGameRankSwitchUIC;
    }

    public Object invoke() {
        ProgressBar progressBar = this.f160008d.f159989f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
