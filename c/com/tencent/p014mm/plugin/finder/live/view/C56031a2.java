package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.a2 */
public final class C56031a2 extends C87413o implements C32224a<ViewGroup> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159839d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56031a2(FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f159839d = finderLiveProductRecordView;
    }

    public Object invoke() {
        Context context = this.f159839d.f159798f;
        if (context != null) {
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.aj9, this.f159839d);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) ((ViewGroup) inflate).findViewById(C0966R.C0970id.dwu);
        }
        C87412m.m108603p("mContext");
        throw null;
    }
}
