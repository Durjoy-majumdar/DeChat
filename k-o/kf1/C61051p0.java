package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import sx3.C36907w;
import te3.C50008jm0;
import wp1.C66164a;

/* renamed from: kf1.p0 */
public final class C61051p0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173875a;

    public C61051p0(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        this.f173875a = finderCommentDrawerPresenter;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("Finder.DrawerPresenter", "preloadNextPage CgiGetFinderFeedComment resp null");
            return new ArrayList();
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new ArrayList();
        } else {
            this.f173875a.mo77322S0(((C50008jm0) t).f136188i == 1);
            this.f173875a.f158626r = ((C50008jm0) cVar.f256796d).f136185f;
            StringBuilder sb = new StringBuilder();
            sb.append("preloadNextPage after lastBuffer ");
            if (this.f173875a.f158626r == null) {
                str = "null";
            } else {
                C89349b bVar = this.f173875a.f158626r;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("Finder.DrawerPresenter", sb.toString());
            ArrayList arrayList = new ArrayList();
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173875a;
            LinkedList<FinderCommentInfo> linkedList = ((C50008jm0) cVar.f256796d).f136183d;
            C87412m.m108593f(linkedList, "it.resp.commentInfo");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderCommentInfo finderCommentInfo : linkedList) {
                C66164a aVar = C66164a.f190162a;
                C87412m.m108593f(finderCommentInfo, "commentInfo");
                FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
                if (finderItem != null) {
                    arrayList2.add(aVar.mo90221b(finderCommentInfo, finderItem.getId()));
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            arrayList.addAll(arrayList2);
            return this.f173875a.mo77330f0(arrayList, true);
        }
    }
}
