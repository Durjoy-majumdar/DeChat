package lq1;

import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import pq1.C62490a;
import qq1.C63317a;
import sx3.C36907w;
import te3.C64236ao1;

/* renamed from: lq1.o */
public final class C61373o<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ UniCommentDrawerPresenter f174570a;

    public C61373o(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        this.f174570a = uniCommentDrawerPresenter;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("MicroMsg.MusicUni.DrawerPresenter", "loadMoreData resp null");
            return new ArrayList();
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new ArrayList();
        } else {
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f174570a;
            boolean z = true;
            if (((C64236ao1) t).f182113g != 1) {
                z = false;
            }
            uniCommentDrawerPresenter.mo79246u0(z);
            this.f174570a.f161385p = ((C64236ao1) cVar.f256796d).f182114h;
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreData after lastBuffer ");
            if (this.f174570a.f161385p == null) {
                str = "null";
            } else {
                C89349b bVar = this.f174570a.f161385p;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
            ArrayList arrayList = new ArrayList();
            UniCommentDrawerPresenter uniCommentDrawerPresenter2 = this.f174570a;
            LinkedList<FinderCommentInfo> linkedList = ((C64236ao1) cVar.f256796d).f182110d;
            C87412m.m108593f(linkedList, "it.resp.comment_info");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderCommentInfo finderCommentInfo : linkedList) {
                C62490a aVar = C62490a.f177529a;
                C87412m.m108593f(finderCommentInfo, "commentInfo");
                C63317a aVar2 = uniCommentDrawerPresenter2.f161380h;
                if (aVar2 != null) {
                    arrayList2.add(aVar.mo87519a(finderCommentInfo, (long) aVar2.f179674f));
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            arrayList.addAll(arrayList2);
            return UniCommentDrawerPresenter.m64755t(this.f174570a, arrayList);
        }
    }
}
