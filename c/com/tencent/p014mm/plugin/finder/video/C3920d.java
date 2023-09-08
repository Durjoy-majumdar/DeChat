package com.tencent.p014mm.plugin.finder.video;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.video.d */
public final class C3920d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f17597d;

    /* renamed from: e */
    public final /* synthetic */ FinderFullSeekBarLayout f17598e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3920d(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f17597d = weImageView;
        this.f17598e = finderFullSeekBarLayout;
    }

    public Object invoke() {
        this.f17597d.setIconColor(this.f17598e.getContext().getResources().getColor(C0966R.color.f3585yj));
        WeImageView weImageView = this.f17597d;
        weImageView.post(new C3919c(weImageView, this.f17598e));
        return C13598b0.f38549a;
    }
}
