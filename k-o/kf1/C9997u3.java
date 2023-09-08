package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C50581nr0;
import u60.C14121l;
import u60.C65233m;
import ur1.C14378f;

/* renamed from: kf1.u3 */
public final class C9997u3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikeDrawerPresenter f30687d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9997u3(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        super(0);
        this.f30687d = finderLikeDrawerPresenter;
    }

    public Object invoke() {
        C14378f fVar = this.f30687d.f13106j;
        if (fVar != null) {
            fVar.mo13682j();
        }
        FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f30687d;
        C65233m mVar = finderLikeDrawerPresenter.f13102f;
        if (mVar != null) {
            mVar.mo11856a(new C14121l(new C10024w3(true, finderLikeDrawerPresenter, (C32226l<? super LinkedList<C50581nr0>, ? extends LinkedList<C50581nr0>>) null), (String) null, 2, (C8480h) null));
        }
        return C13598b0.f38549a;
    }
}
