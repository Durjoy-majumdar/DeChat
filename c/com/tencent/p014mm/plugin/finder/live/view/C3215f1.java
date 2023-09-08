package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.f1 */
public final class C3215f1 extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15334d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3215f1(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(0);
        this.f15334d = finderLiveMultiNoticeView;
    }

    public Object invoke() {
        View view = this.f15334d.f15285e;
        if (view != null) {
            return (TextView) view.findViewById(C0966R.C0970id.f358197m12);
        }
        C87412m.m108603p("root");
        throw null;
    }
}
