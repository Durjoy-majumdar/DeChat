package com.tencent.p014mm.plugin.finder.view;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.d3 */
public final class C4035d3 extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderHotCommentLayout f18110d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4035d3(FinderHotCommentLayout finderHotCommentLayout) {
        super(0);
        this.f18110d = finderHotCommentLayout;
    }

    public Object invoke() {
        return (TextView) this.f18110d.findViewById(C0966R.C0970id.lz_);
    }
}
