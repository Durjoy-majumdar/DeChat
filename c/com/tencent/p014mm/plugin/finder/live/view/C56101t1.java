package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.t1 */
public final class C56101t1 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159966d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56101t1(FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f159966d = finderLiveProductRecordView;
    }

    public Object invoke() {
        View findViewById = this.f159966d.getRoot().findViewById(C0966R.C0970id.dwp);
        findViewById.setOnClickListener(new C56098s1(this.f159966d));
        return findViewById;
    }
}
