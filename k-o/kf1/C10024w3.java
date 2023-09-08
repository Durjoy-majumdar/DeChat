package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import je1.C9390z1;
import rx3.C13598b0;
import te3.C50581nr0;
import u60.C14121l;

/* renamed from: kf1.w3 */
public final class C10024w3 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f30724d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikeDrawerPresenter f30725e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<LinkedList<C50581nr0>, LinkedList<C50581nr0>> f30726f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10024w3(boolean z, FinderLikeDrawerPresenter finderLikeDrawerPresenter, C32226l<? super LinkedList<C50581nr0>, ? extends LinkedList<C50581nr0>> lVar) {
        super(1);
        this.f30724d = z;
        this.f30725e = finderLikeDrawerPresenter;
        this.f30726f = lVar;
    }

    public Object invoke(Object obj) {
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        Log.m105924i("Finder.DrawerPresenter", "refreshData " + this.f30724d);
        new C9390z1(this.f30725e.mo2551i(), this.f30725e.getScene(), this.f30725e.f13111r, this.f30725e.f13101e).mo9225i().mo123064p(new C9984t3(this.f30725e)).mo123062e(new C10010v3(this.f30726f, this.f30725e, this.f30724d, System.currentTimeMillis(), lVar)).mo11397F(this.f30725e);
        return C13598b0.f38549a;
    }
}
