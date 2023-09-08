package com.tencent.p014mm.plugin.finder.view;

import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.d1 */
public final class C18790d1 extends C87413o implements C32224a<NeatTextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderCollapsibleTextView f52589d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18790d1(FinderCollapsibleTextView finderCollapsibleTextView) {
        super(0);
        this.f52589d = finderCollapsibleTextView;
    }

    public Object invoke() {
        return (NeatTextView) this.f52589d.findViewById(C0966R.C0970id.bga);
    }
}
