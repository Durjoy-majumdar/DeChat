package com.tencent.p014mm.plugin.finder.view;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.c1 */
public final class C18789c1 extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderCollapsibleTextView f52588d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18789c1(FinderCollapsibleTextView finderCollapsibleTextView) {
        super(0);
        this.f52588d = finderCollapsibleTextView;
    }

    public Object invoke() {
        return (TextView) this.f52588d.findViewById(C0966R.C0970id.bg_);
    }
}
