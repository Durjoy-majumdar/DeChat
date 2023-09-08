package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dj1.C7341l;
import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import ig1.C8916d;
import java.util.LinkedList;
import java.util.Map;
import ob0.C89132b;
import p165hr.C60106t;
import rx3.C13598b0;
import te3.C49486fy0;
import te3.C49914iy0;
import te3.C50767p11;

/* renamed from: cj1.v */
public final class C0625v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f1479a;

    /* renamed from: b */
    public final /* synthetic */ int f1480b;

    /* renamed from: c */
    public final /* synthetic */ C54820t f1481c;

    public C0625v(C32227p<? super Boolean, ? super Integer, C13598b0> pVar, int i, C54820t tVar) {
        this.f1479a = pVar;
        this.f1480b = i;
        this.f1481c = tVar;
    }

    public Object call(Object obj) {
        LinkedList<C49486fy0> linkedList;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && (linkedList = ((C49914iy0) cVar.f256796d).f135744d) != null) {
            C54820t tVar = this.f1481c;
            for (C49486fy0 fy02 : linkedList) {
                LinkedList<C50767p11> linkedList2 = fy02.f133738h;
                if (linkedList2 != null) {
                    for (C50767p11 p112 : linkedList2) {
                        C8916d.C8917a aVar = C8916d.f28211b1;
                        C87412m.m108593f(p112, "finderLiveGift");
                        C8916d a = aVar.mo9727a(p112);
                        a.field_flag |= 2;
                        ((C60106t) C86312j.m106911c(C60106t.class)).zx0().mo9741qq(a);
                        Log.m105924i(tVar.f153694d, "dumpRemoteGift " + C7341l.f25459x.mo8515a(p112));
                        C0639y1 y1Var = C0639y1.f1510a;
                        Log.m105924i("Finder.FinderLiveGiftLoader", "addIfNotExistGift " + a);
                        String str = a.field_rewardProductId;
                        if (!(str == null || str.length() == 0)) {
                            Map<String, C8916d> map = C0639y1.f1513d;
                            if (!map.containsKey(str)) {
                                map.put(str, a);
                                y1Var.mo619k(a, str);
                            }
                        }
                        Log.m105924i("Finder.FinderLiveGiftLoader", "addIfNotExistGift id:" + str + ", giftCache.containsKey:" + C0639y1.f1513d.containsKey(str));
                    }
                }
            }
        }
        C32227p<Boolean, Integer, C13598b0> pVar = this.f1479a;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(Boolean.TRUE, Integer.valueOf(this.f1480b));
        return C13598b0.f38549a;
    }
}
