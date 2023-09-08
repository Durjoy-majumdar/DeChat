package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.b1 */
public final class C3205b1 extends C87413o implements C32224a<WxRecyclerView> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15319d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3205b1(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(0);
        this.f15319d = finderLiveMultiNoticeView;
    }

    public Object invoke() {
        View view = this.f15319d.f15285e;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.f358196m11);
            FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15319d;
            WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
            View view2 = finderLiveMultiNoticeView.f15285e;
            if (view2 != null) {
                Context context = view2.getContext();
                C87412m.m108593f(context, "root.context");
                wxRecyclerView.setLayoutManager(new FinderLinearLayoutManager(context));
                wxRecyclerView.setAdapter(finderLiveMultiNoticeView.getMAdapter());
                return wxRecyclerView;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }
}
