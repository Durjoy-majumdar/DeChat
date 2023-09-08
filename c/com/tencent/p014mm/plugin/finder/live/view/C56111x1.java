package com.tencent.p014mm.plugin.finder.live.view;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.x1 */
public final class C56111x1 extends C87413o implements C32224a<ViewGroup> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159980d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56111x1(FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f159980d = finderLiveProductRecordView;
    }

    public Object invoke() {
        ViewGroup viewGroup = (ViewGroup) this.f159980d.getRoot().findViewById(C0966R.C0970id.dws);
        viewGroup.setOnClickListener(new C56107w1(this.f159980d));
        return viewGroup;
    }
}
