package kf1;

import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import je1.C46552y1;
import pe3.C89349b;
import rx3.C13598b0;
import u60.C14121l;

/* renamed from: kf1.k1 */
public final class C61037k1 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61028h1 f173821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61037k1(C61028h1 h1Var) {
        super(1);
        this.f173821d = h1Var;
    }

    public Object invoke(Object obj) {
        String str;
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        StringBuilder sb = new StringBuilder();
        sb.append("loadMoreData before lastBuffer ");
        if (this.f173821d.f173800f == null) {
            str = "null";
        } else {
            C89349b bVar = this.f173821d.f173800f;
            str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
        }
        sb.append(str);
        Log.m105924i("Finder.FavListDrawerPresenter", sb.toString());
        String userName = this.f173821d.mo85986h().getUserName();
        this.f173821d.getClass();
        FinderFavDrawer.Companion companion = FinderFavDrawer.f162097C;
        new C46552y1(userName, 0, this.f173821d.f173800f, this.f173821d.mo85986h().getId(), 2).mo9225i().mo123064p(new C46702i1(this.f173821d)).mo123062e(new C61035j1(this.f173821d, lVar)).mo11397F(this.f173821d);
        return C13598b0.f38549a;
    }
}
