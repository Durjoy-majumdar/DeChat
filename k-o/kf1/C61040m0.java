package kf1;

import cm1.C55033u;
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
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C50284lm0;
import wp1.C66164a;

/* renamed from: kf1.m0 */
public final class C61040m0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55033u f173831a;

    /* renamed from: b */
    public final /* synthetic */ FinderCommentDrawerPresenter f173832b;

    public C61040m0(C55033u uVar, FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        this.f173831a = uVar;
        this.f173832b = finderCommentDrawerPresenter;
    }

    public Object call(Object obj) {
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("Finder.DrawerPresenter", "loadMoreLevel2Comments resp null");
            return new C13604l(-2, C64186f0.f181907d);
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || cVar.f256796d == null) {
            return cVar.f256794b == -4032 ? new C13604l(-1, C64186f0.f181907d) : new C13604l(0, C64186f0.f181907d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreLevel2Comments after lastBuffer ");
            if (this.f173831a.f154492d.mo89539u2() == null) {
                str = "null";
            } else {
                C89349b u2 = this.f173831a.f154492d.mo89539u2();
                str = MD5Util.getMD5String(u2 != null ? u2.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("Finder.DrawerPresenter", sb.toString());
            LinkedList<FinderCommentInfo> linkedList = ((C50284lm0) cVar.f256796d).f137512d;
            C87412m.m108593f(linkedList, "it.resp.commentInfo");
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173832b;
            C55033u uVar = this.f173831a;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderCommentInfo finderCommentInfo : linkedList) {
                C66164a aVar = C66164a.f190162a;
                C87412m.m108593f(finderCommentInfo, "commentInfo");
                FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
                if (finderItem != null) {
                    arrayList.add(aVar.mo90222c(finderCommentInfo, finderItem.getId(), uVar.getItemId()));
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            return new C13604l(0, arrayList);
        }
    }
}
