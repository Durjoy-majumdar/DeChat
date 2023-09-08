package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49548ge1;

/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.b */
public final class C3327b extends C87413o implements C32226l<C89132b.C89134c<C49548ge1>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15752d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3327b(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback) {
        super(1);
        this.f15752d = liveEntranceFragmentViewCallback;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C89132b.C89134c) obj, LocaleUtil.ITALIAN);
        this.f15752d.f15701F = false;
        return C13598b0.f38549a;
    }
}
