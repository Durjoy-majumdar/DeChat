package com.tencent.p014mm.plugin.finder.uniComments;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import lq1.C61356g0;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.g */
public final class C56471g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentDrawerPresenter f161461d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56471g(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        super(0);
        this.f161461d = uniCommentDrawerPresenter;
    }

    public Object invoke() {
        C77426q qVar = new C77426q(this.f161461d.f161376d);
        qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.ecx));
        qVar.mo107589a(true);
        qVar.mo107600l(C56470f.f161460a);
        qVar.mo107603o();
        C61356g0 g0Var = this.f161461d.f161382j;
        if (g0Var != null) {
            UniCommentDrawer i = g0Var.mo86312i();
            C32224a<Boolean> aVar = i.f161368S;
            if (!(aVar != null ? aVar.invoke().booleanValue() : false)) {
                i.mo79202l();
            }
        }
        return C13598b0.f38549a;
    }
}
