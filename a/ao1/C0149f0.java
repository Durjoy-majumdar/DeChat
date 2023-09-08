package ao1;

import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView;
import dr1.C7493o;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.f0 */
public final class C0149f0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0192y f587d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0149f0(C0192y yVar) {
        super(1);
        this.f587d = yVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C0192y yVar = this.f587d;
        if (booleanValue) {
            yVar.mo172d3();
        } else {
            C7493o oVar = yVar.f662g;
            FinderExtendReadingView finderExtendReadingView = oVar != null ? oVar.f25730b : null;
            if (finderExtendReadingView != null) {
                finderExtendReadingView.setVisibility(0);
            }
        }
        return C13598b0.f38549a;
    }
}
