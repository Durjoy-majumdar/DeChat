package ao1;

import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView;
import dr1.C7493o;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.d0 */
public final class C0144d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0192y f575d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0144d0(C0192y yVar) {
        super(0);
        this.f575d = yVar;
    }

    public Object invoke() {
        C7493o oVar = this.f575d.f662g;
        FinderExtendReadingView finderExtendReadingView = oVar != null ? oVar.f25730b : null;
        if (finderExtendReadingView != null) {
            finderExtendReadingView.setVisibility(0);
        }
        return C13598b0.f38549a;
    }
}
