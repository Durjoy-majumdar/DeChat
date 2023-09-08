package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.z1 */
public final class C56115z1 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159986d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56115z1(FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f159986d = finderLiveProductRecordView;
    }

    public Object invoke() {
        View findViewById = this.f159986d.getRoot().findViewById(C0966R.C0970id.dwv);
        findViewById.setOnClickListener(new C56112y1(this.f159986d));
        return findViewById;
    }
}
