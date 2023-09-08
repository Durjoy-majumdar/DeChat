package rs1;

import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.g0 */
public final class C13239g0 extends C87413o implements C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikeDrawer f37594d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13239g0(FinderLikeDrawer finderLikeDrawer) {
        super(1);
        this.f37594d = finderLikeDrawer;
    }

    public Object invoke(Object obj) {
        RecyclerViewDrawerSquares.C45117c cVar = (RecyclerViewDrawerSquares.C45117c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        FinderLikeDrawer finderLikeDrawer = this.f37594d;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.mo82527b(cVar);
        }
        return C13598b0.f38549a;
    }
}
