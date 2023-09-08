package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.w0 */
public final class C3234w0 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15361d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3234w0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(0);
        this.f15361d = finderLiveMultiNoticeView;
    }

    public Object invoke() {
        View view = this.f15361d.f15285e;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.f358085m04);
            findViewById.setOnClickListener(new C3233v0(this.f15361d));
            return findViewById;
        }
        C87412m.m108603p("root");
        throw null;
    }
}
