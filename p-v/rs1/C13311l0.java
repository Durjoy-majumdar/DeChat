package rs1;

import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.l0 */
public final class C13311l0 extends C87413o implements C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderPlayListDrawer f37770d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13311l0(FinderPlayListDrawer finderPlayListDrawer) {
        super(1);
        this.f37770d = finderPlayListDrawer;
    }

    public Object invoke(Object obj) {
        RecyclerViewDrawerSquares.C45117c cVar = (RecyclerViewDrawerSquares.C45117c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        FinderPlayListDrawer finderPlayListDrawer = this.f37770d;
        if (finderPlayListDrawer != null) {
            finderPlayListDrawer.mo82543k(cVar);
        }
        return C13598b0.f38549a;
    }
}
