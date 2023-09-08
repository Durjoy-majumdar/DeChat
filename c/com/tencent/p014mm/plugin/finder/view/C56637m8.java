package com.tencent.p014mm.plugin.finder.view;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.m8 */
public final class C56637m8 extends C87413o implements C32224a<RecyclerView> {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56637m8(TestPreloadPreview testPreloadPreview) {
        super(0);
        this.f162356d = testPreloadPreview;
    }

    public Object invoke() {
        return (RecyclerView) this.f162356d.findViewById(C0966R.C0970id.i1l);
    }
}
