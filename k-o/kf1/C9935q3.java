package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import te3.C50581nr0;
import te3.C52283zm0;

/* renamed from: kf1.q3 */
public final class C9935q3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLikeDrawerPresenter f30572a;

    public C9935q3(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        this.f30572a = finderLikeDrawerPresenter;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("Finder.DrawerPresenter", "loadMoreData resp null");
            return new LinkedList();
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new LinkedList();
        } else {
            this.f30572a.mo2554m(((C52283zm0) t).f146094f == 1);
            this.f30572a.f13111r = ((C52283zm0) cVar.f256796d).f146093e;
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreData after lastBuffer ");
            if (this.f30572a.f13111r == null) {
                str = "null";
            } else {
                C89349b bVar = this.f30572a.f13111r;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("Finder.DrawerPresenter", sb.toString());
            if (FinderLikeDrawerPresenter.m2448h(this.f30572a)) {
                int scene = this.f30572a.getScene();
                FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                if (scene == 2) {
                    LinkedList<C50581nr0> linkedList = ((C52283zm0) cVar.f256796d).f146092d;
                    C87412m.m108593f(linkedList, "it.resp.likeList");
                    FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f30572a;
                    ArrayList arrayList = new ArrayList();
                    for (T next : linkedList) {
                        if (!C87412m.m108589b(((C50581nr0) next).f138729i, finderLikeDrawerPresenter.f13104h)) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                }
            }
            return ((C52283zm0) cVar.f256796d).f146092d;
        }
    }
}
