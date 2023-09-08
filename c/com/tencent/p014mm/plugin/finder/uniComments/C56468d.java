package com.tencent.p014mm.plugin.finder.uniComments;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import p629ny.C76979h;
import pe3.C89349b;
import qq1.C63317a;
import rx3.C13604l;
import sq1.C64147b;
import sq1.C64151e;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C64236ao1;
import te3.C64854ye0;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.d */
public final class C56468d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C64151e f161454a;

    /* renamed from: b */
    public final /* synthetic */ UniCommentDrawerPresenter f161455b;

    public C56468d(C64151e eVar, UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        this.f161454a = eVar;
        this.f161455b = uniCommentDrawerPresenter;
    }

    public Object call(Object obj) {
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("MicroMsg.MusicUni.DrawerPresenter", "loadMoreLevel2Comments resp null");
            return new C13604l(-2, C64186f0.f181907d);
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || cVar.f256796d == null) {
            return cVar.f256794b == -4032 ? new C13604l(-1, C64186f0.f181907d) : new C13604l(0, C64186f0.f181907d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreLevel2Comments after lastBuffer ");
            if (this.f161454a.f181868d.mo88876n2().lastBuffer == null) {
                str = "null";
            } else {
                C89349b bVar = this.f161454a.f181868d.mo88876n2().lastBuffer;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
            LinkedList<FinderCommentInfo> linkedList = ((C64236ao1) cVar.f256796d).f182110d;
            C87412m.m108593f(linkedList, "it.resp.comment_info");
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161455b;
            C64151e eVar = this.f161454a;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderCommentInfo finderCommentInfo : linkedList) {
                C87412m.m108593f(finderCommentInfo, "commentInfo");
                C63317a aVar = uniCommentDrawerPresenter.f161380h;
                if (aVar != null) {
                    long itemId = eVar.getItemId();
                    C64147b bVar2 = new C64147b();
                    bVar2.field_feedId = (long) aVar.f179674f;
                    bVar2.field_state = 2;
                    C64854ye0 ye02 = bVar2.field_actionInfo;
                    ye02.f186497e = finderCommentInfo;
                    ye02.f186500h = itemId;
                    C64151e eVar2 = new C64151e(bVar2);
                    ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), eVar2.f181868d.getContent());
                    arrayList.add(eVar2);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            return new C13604l(0, arrayList);
        }
    }
}
