package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13604l;
import te3.C50581nr0;
import te3.C52283zm0;

/* renamed from: kf1.t3 */
public final class C9984t3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLikeDrawerPresenter f30670a;

    public C9984t3(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        this.f30670a = finderLikeDrawerPresenter;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        byte[] bArr = null;
        if (cVar == null) {
            Log.m105920e("Finder.DrawerPresenter", "refreshData resp null");
            return new C13604l(Boolean.FALSE, null);
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new C13604l(Boolean.FALSE, null);
        } else {
            this.f30670a.f13111r = ((C52283zm0) t).f146093e;
            this.f30670a.f13109p = ((C52283zm0) cVar.f256796d).f146095g;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshData lastBuffer ");
            if (this.f30670a.f13111r == null) {
                str = "null";
            } else {
                C89349b bVar = this.f30670a.f13111r;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                str = MD5Util.getMD5String(bArr);
            }
            sb.append(str);
            sb.append(" totalCount ");
            sb.append(this.f30670a.f13109p);
            Log.m105924i("Finder.DrawerPresenter", sb.toString());
            boolean z = false;
            this.f30670a.mo2554m(((C52283zm0) cVar.f256796d).f146094f == 1);
            LinkedList linkedList = new LinkedList();
            C72996z1 g = C75592q0.m90777g();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("contact: ");
            if (g == null) {
                z = true;
            }
            sb4.append(z);
            sb4.append(", canShowLikeEdu:");
            sb4.append(FinderLikeDrawerPresenter.m2448h(this.f30670a));
            Log.m105924i("Finder.DrawerPresenter", sb4.toString());
            if (FinderLikeDrawerPresenter.m2448h(this.f30670a)) {
                int scene = this.f30670a.getScene();
                FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                if (scene == 2 && g != null) {
                    C50581nr0 nr02 = new C50581nr0();
                    FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f30670a;
                    nr02.f138724d = g.mo62909j3();
                    nr02.f138729i = finderLikeDrawerPresenter.f13104h;
                    nr02.f138726f = System.currentTimeMillis();
                    linkedList.add(nr02);
                    LinkedList<C50581nr0> linkedList2 = ((C52283zm0) cVar.f256796d).f146092d;
                    C87412m.m108593f(linkedList2, "it.resp.likeList");
                    FinderLikeDrawerPresenter finderLikeDrawerPresenter2 = this.f30670a;
                    ArrayList arrayList = new ArrayList();
                    for (T next : linkedList2) {
                        if (!C87412m.m108589b(((C50581nr0) next).f138729i, finderLikeDrawerPresenter2.f13104h)) {
                            arrayList.add(next);
                        }
                    }
                    linkedList.addAll(arrayList);
                    return new C13604l(Boolean.TRUE, linkedList);
                }
            }
            linkedList.addAll(((C52283zm0) cVar.f256796d).f146092d);
            return new C13604l(Boolean.TRUE, linkedList);
        }
    }
}
