package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50397mg0;
import te3.C51533ue1;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.f */
public final class C55761f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55763h f158761a;

    public C55761f(C55763h hVar) {
        this.f158761a = hVar;
    }

    public Object call(Object obj) {
        T t;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("Finder.AdInfoPreLoader", "errType: " + cVar.f256793a + " erroCode:" + cVar.f256794b);
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && (t = cVar.f256796d) != null) {
            LinkedList<C51533ue1> linkedList = ((C50397mg0) t).f138011d;
            if (linkedList == null) {
                return null;
            }
            C55763h hVar = this.f158761a;
            hVar.getClass();
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C51533ue1 ue12 : linkedList) {
                    hVar.mo77374u(ue12, arrayList);
                    hVar.mo77375v(ue12, arrayList2);
                    hVar.f158769g.remove(Long.valueOf(ue12.f142797d));
                    hVar.f158770h.add(Long.valueOf(ue12.f142797d));
                }
                hVar.mo77379z(arrayList, arrayList2);
                return linkedList;
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.AdInfoPreLoader", e, "FinderAdInfoPreLoader exception", new Object[0]);
                return linkedList;
            }
        } else {
            this.f158761a.f158769g.clear();
            return C13598b0.f38549a;
        }
    }
}
