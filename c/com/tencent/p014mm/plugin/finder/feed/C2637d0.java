package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import kf1.C9878n9;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.d0 */
public final class C2637d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f13483d;

    /* renamed from: e */
    public final /* synthetic */ int f13484e;

    /* renamed from: f */
    public final /* synthetic */ int f13485f;

    /* renamed from: g */
    public final /* synthetic */ int f13486g;

    /* renamed from: h */
    public final /* synthetic */ int f13487h;

    /* renamed from: i */
    public final /* synthetic */ String f13488i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2637d0(FinderTimelinePresenter finderTimelinePresenter, int i, int i2, int i3, int i4, String str) {
        super(0);
        this.f13483d = finderTimelinePresenter;
        this.f13484e = i;
        this.f13485f = i2;
        this.f13486g = i3;
        this.f13487h = i4;
        this.f13488i = str;
    }

    public Object invoke() {
        RecyclerView recyclerView;
        C9878n9 n9Var = this.f13483d.f13269j;
        if (!(n9Var == null || (recyclerView = n9Var.getRecyclerView()) == null)) {
            recyclerView.post(new C2636c0(this.f13483d, this.f13484e, this.f13485f, this.f13486g, this.f13487h, this.f13488i));
        }
        return C13598b0.f38549a;
    }
}
