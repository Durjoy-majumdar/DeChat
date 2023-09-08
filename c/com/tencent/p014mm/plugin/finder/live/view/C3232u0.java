package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;

/* renamed from: com.tencent.mm.plugin.finder.live.view.u0 */
public final class C3232u0 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15359d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3232u0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(0);
        this.f15359d = finderLiveMultiNoticeView;
    }

    public Object invoke() {
        View view = this.f15359d.f15285e;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.m0s);
            findViewById.setOnClickListener(new C3231t0(this.f15359d));
            C62042e.m72803Q1(C62042e.f176370a, findViewById, 0, 0, 6, (Object) null);
            return findViewById;
        }
        C87412m.m108603p("root");
        throw null;
    }
}
