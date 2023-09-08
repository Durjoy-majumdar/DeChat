package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77398g;
import rx3.C13598b0;
import xx0.C53458b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.f0 */
public final class C40682f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f109295d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40682f0(BizTestUI bizTestUI) {
        super(0);
        this.f109295d = bizTestUI;
    }

    public Object invoke() {
        C77398g gVar = new C77398g(this.f109295d);
        gVar.setTitle((CharSequence) "Pkg Info");
        gVar.mo107533r(C53458b.f150358a.mo74092h());
        TextView textView = gVar.f225700q;
        if (textView != null) {
            textView.setGravity(3);
        }
        TextView textView2 = gVar.f225695i;
        if (textView2 != null) {
            textView2.setGravity(3);
        }
        gVar.mo107542x(this.f109295d.getString(C0966R.string.fmz), true, (DialogInterface.OnClickListener) null);
        gVar.show();
        return C13598b0.f38549a;
    }
}
