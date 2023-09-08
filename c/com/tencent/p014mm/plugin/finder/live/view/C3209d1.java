package com.tencent.p014mm.plugin.finder.live.view;

import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.FinderLiveMultiNoticeListFooter;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.d1 */
public final class C3209d1 extends C87413o implements C32224a<WxRefreshLayout> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15323d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3209d1(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(0);
        this.f15323d = finderLiveMultiNoticeView;
    }

    public Object invoke() {
        View view = this.f15323d.f15285e;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.ije);
            FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15323d;
            WxRefreshLayout wxRefreshLayout = (WxRefreshLayout) findViewById;
            wxRefreshLayout.setPadding(0, 0, 0, C85875k4.m106188j(wxRefreshLayout.getContext()));
            wxRefreshLayout.mo26641y(new FinderLiveMultiNoticeListFooter(wxRefreshLayout.getContext(), (AttributeSet) null));
            wxRefreshLayout.setOnSimpleAction(new C3207c1(finderLiveMultiNoticeView));
            return wxRefreshLayout;
        }
        C87412m.m108603p("root");
        throw null;
    }
}
