package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.n1 */
public final class C56644n1 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentFooter f162370d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f162371e;

    public C56644n1(FinderCommentFooter finderCommentFooter, C32224a<C13598b0> aVar) {
        this.f162370d = finderCommentFooter;
        this.f162371e = aVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f162370d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f162371e.invoke();
    }
}
