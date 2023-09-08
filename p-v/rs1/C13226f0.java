package rs1;

import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.f0 */
public final class C13226f0 extends C87413o implements C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56597e1 f37565d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13226f0(C56597e1 e1Var) {
        super(1);
        this.f37565d = e1Var;
    }

    public Object invoke(Object obj) {
        FinderCommentDrawer finderCommentDrawer;
        RecyclerViewDrawerSquares.C45117c cVar = (RecyclerViewDrawerSquares.C45117c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        C56597e1 e1Var = this.f37565d;
        if (!(e1Var == null || (finderCommentDrawer = e1Var.f162255a) == null)) {
            finderCommentDrawer.mo82543k(cVar);
        }
        return C13598b0.f38549a;
    }
}
