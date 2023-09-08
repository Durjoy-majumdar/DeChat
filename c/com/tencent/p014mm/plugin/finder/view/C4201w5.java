package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.w5 */
public final class C4201w5 extends C87413o implements C32224a<WxRecyclerView> {

    /* renamed from: d */
    public final /* synthetic */ FinderWordingLayout f18497d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4201w5(FinderWordingLayout finderWordingLayout) {
        super(0);
        this.f18497d = finderWordingLayout;
    }

    public Object invoke() {
        return (WxRecyclerView) this.f18497d.findViewById(C0966R.C0970id.m9c);
    }
}
