package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C55033u;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import ob0.C89132b;
import p629ny.C76979h;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50284lm0;
import up1.C65426w0;
import vp1.C65838f;
import wp1.C66164a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.q */
public final class C55775q<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55776r f158801a;

    /* renamed from: b */
    public final /* synthetic */ List<C65426w0> f158802b;

    /* renamed from: c */
    public final /* synthetic */ long f158803c;

    /* renamed from: d */
    public final /* synthetic */ List<C65426w0> f158804d;

    public C55775q(C55776r rVar, List<C65426w0> list, long j, List<C65426w0> list2) {
        this.f158801a = rVar;
        this.f158802b = list;
        this.f158803c = j;
        this.f158804d = list2;
    }

    public Object call(Object obj) {
        T t;
        Object obj2;
        FinderCommentInfo finderCommentInfo;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        try {
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (t = cVar.f256796d) != null) {
                C89349b bVar = ((C50284lm0) t).f137514f;
                String str = this.f158801a.f158807h;
                StringBuilder sb = new StringBuilder();
                sb.append("---refreshData lastBuffer ");
                sb.append(bVar == null ? "null" : MD5Util.getMD5String(bVar.mo123703f()));
                Log.m105918d(str, sb.toString());
                T t2 = cVar.f256796d;
                boolean z = true;
                boolean z2 = ((C50284lm0) t2).f137516h == 1;
                boolean z3 = ((C50284lm0) t2).f137515g == 1;
                C50284lm0 lm02 = (C50284lm0) t2;
                if (!(lm02 == null || (finderCommentInfo = lm02.f137517i) == null)) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C2812p(this.f158801a, this.f158803c, finderCommentInfo));
                }
                ArrayList arrayList = new ArrayList();
                LinkedList<FinderCommentInfo> linkedList = ((C50284lm0) cVar.f256796d).f137512d;
                C87412m.m108593f(linkedList, "it.resp.commentInfo");
                long j = this.f158803c;
                for (FinderCommentInfo finderCommentInfo2 : linkedList) {
                    C66164a aVar = C66164a.f190162a;
                    C87412m.m108593f(finderCommentInfo2, "commentInfo");
                    arrayList.add(aVar.mo90221b(finderCommentInfo2, j));
                }
                C55776r.m63514G1(this.f158801a, this.f158802b, arrayList, this.f158803c);
                List F1 = C55776r.m63513F1(this.f158801a, arrayList, this.f158803c);
                List<C65426w0> list = this.f158804d;
                C55776r rVar = this.f158801a;
                for (C65426w0 w0Var : list) {
                    Iterator it = ((ArrayList) F1).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        C55033u uVar = (C55033u) obj2;
                        uVar.f154492d.mo89530m2();
                        if (C87412m.m108589b(uVar.f154492d.mo89530m2(), w0Var.mo89530m2())) {
                            break;
                        }
                    }
                    if (((C55033u) obj2) == null) {
                        String str2 = rVar.f158807h;
                        Log.m105918d(str2, "---merge local item: " + w0Var.mo89530m2());
                        C55033u uVar2 = new C55033u(w0Var);
                        ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), w0Var.getContent());
                        ((ArrayList) F1).add(uVar2);
                    }
                }
                String str3 = this.f158801a.f158807h;
                Log.m105924i(str3, "---merge preSize: " + ((C50284lm0) cVar.f256796d).f137512d.size() + ", afterSize:" + ((ArrayList) F1).size());
                C65838f fVar = C65838f.f189333a;
                if (fVar.mo89883d(this.f158803c, 0) != null) {
                    z = false;
                }
                if (z) {
                    long j2 = this.f158803c;
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(F1, 10));
                    Iterator it4 = ((ArrayList) F1).iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((C55033u) it4.next()).f154492d);
                    }
                    fVar.mo89880a(j2, 0, arrayList2);
                    C65838f.f189333a.mo89881b(this.f158803c, 0, 0, bVar, z3, z2, false);
                    String str4 = this.f158801a.f158807h;
                    Log.m105924i(str4, "add cache succ, feedId: " + C61926c.m72691p(this.f158803c) + ", size:" + ((ArrayList) F1).size());
                } else {
                    String str5 = this.f158801a.f158807h;
                    Log.m105924i(str5, "---cache exist or list is empty, feedId:" + C61926c.m72691p(this.f158803c) + ", list size: " + ((ArrayList) F1).size());
                }
            }
        } catch (Throwable th) {
            this.f158801a.f158812p.remove(Long.valueOf(this.f158803c));
            throw th;
        }
        this.f158801a.f158812p.remove(Long.valueOf(this.f158803c));
        return C13598b0.f38549a;
    }
}
