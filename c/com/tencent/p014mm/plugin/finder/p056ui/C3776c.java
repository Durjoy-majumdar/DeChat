package com.tencent.p014mm.plugin.finder.p056ui;

import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.c */
public final class C3776c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17249d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3776c(FinderActivityDescUI finderActivityDescUI) {
        super(0);
        this.f17249d = finderActivityDescUI;
    }

    public Object invoke() {
        ImageView imageView = this.f17249d.f16740N;
        if (imageView != null) {
            imageView.setVisibility(0);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("coverImageView");
        throw null;
    }
}
