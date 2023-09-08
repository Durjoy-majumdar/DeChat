package com.tencent.p014mm.plugin.finder.video;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.video.b */
public final class C3918b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f17593d;

    /* renamed from: e */
    public final /* synthetic */ FinderFullSeekBarLayout f17594e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3918b(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f17593d = weImageView;
        this.f17594e = finderFullSeekBarLayout;
    }

    public Object invoke() {
        this.f17593d.setIconColor(this.f17594e.getContext().getResources().getColor(C0966R.color.Red_90));
        WeImageView weImageView = this.f17593d;
        weImageView.post(new C3917a(weImageView, this.f17594e));
        return C13598b0.f38549a;
    }
}
