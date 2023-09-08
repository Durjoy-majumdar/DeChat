package kf1;

import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import je1.C46552y1;
import rx3.C13598b0;
import te3.C50557nk0;
import u60.C14121l;

/* renamed from: kf1.o1 */
public final class C61045o1 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f173844d;

    /* renamed from: e */
    public final /* synthetic */ C61028h1 f173845e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<LinkedList<C50557nk0>, LinkedList<C50557nk0>> f173846f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61045o1(boolean z, C61028h1 h1Var, C32226l<? super LinkedList<C50557nk0>, ? extends LinkedList<C50557nk0>> lVar) {
        super(1);
        this.f173844d = z;
        this.f173845e = h1Var;
        this.f173846f = lVar;
    }

    public Object invoke(Object obj) {
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        Log.m105924i("Finder.FavListDrawerPresenter", "refreshData " + this.f173844d);
        long currentTimeMillis = System.currentTimeMillis();
        String userName = this.f173845e.mo85986h().getUserName();
        this.f173845e.getClass();
        FinderFavDrawer.Companion companion = FinderFavDrawer.f162097C;
        new C46552y1(userName, 0, this.f173845e.f173800f, this.f173845e.mo85986h().getId(), 2).mo9225i().mo123064p(new C46703l1(this.f173845e)).mo123062e(new C61043n1(this.f173846f, this.f173845e, this.f173844d, currentTimeMillis, lVar)).mo11397F(this.f173845e);
        return C13598b0.f38549a;
    }
}
