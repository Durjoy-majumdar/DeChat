package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import je1.C9390z1;
import pe3.C89349b;
import rx3.C13598b0;
import u60.C14121l;

/* renamed from: kf1.s3 */
public final class C9969s3 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikeDrawerPresenter f30648d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9969s3(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        super(1);
        this.f30648d = finderLikeDrawerPresenter;
    }

    public Object invoke(Object obj) {
        String str;
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        StringBuilder sb = new StringBuilder();
        sb.append("loadMoreData before lastBuffer ");
        if (this.f30648d.f13111r == null) {
            str = "null";
        } else {
            C89349b bVar = this.f30648d.f13111r;
            str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
        }
        sb.append(str);
        Log.m105924i("Finder.DrawerPresenter", sb.toString());
        new C9390z1(this.f30648d.mo2551i(), this.f30648d.getScene(), this.f30648d.f13111r, this.f30648d.f13101e).mo9225i().mo123064p(new C9935q3(this.f30648d)).mo123062e(new C9952r3(this.f30648d, lVar)).mo11397F(this.f30648d);
        return C13598b0.f38549a;
    }
}
