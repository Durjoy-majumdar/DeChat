package kf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;
import ur1.C65468g;

/* renamed from: kf1.w0 */
public final class C61069w0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f173922d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61069w0(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(0);
        this.f173922d = finderCommentDrawerPresenter;
    }

    public Object invoke() {
        C77426q qVar = new C77426q(this.f173922d.f158615d);
        qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.ecx));
        qVar.mo107589a(true);
        qVar.mo107600l(C61068v0.f173921a);
        qVar.mo107603o();
        C65468g gVar = this.f173922d.f158622n;
        if (gVar != null) {
            FinderCommentDrawer j = gVar.mo89585j();
            C32224a<Boolean> aVar = j.f162046U;
            if (!(aVar != null ? aVar.invoke().booleanValue() : false)) {
                j.mo79715l();
            }
        }
        return C13598b0.f38549a;
    }
}
