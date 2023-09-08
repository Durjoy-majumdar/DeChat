package cl1;

import bl1.C39775b;
import bl1.C39786k;
import bl1.C39807u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C49153dj;
import te3.C50131kh1;
import te3.C50317lw0;
import te3.C52013xs0;

/* renamed from: cl1.k */
public final class C39980k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C39775b f107191d;

    /* renamed from: e */
    public final /* synthetic */ C50131kh1 f107192e;

    /* renamed from: f */
    public final /* synthetic */ C39975j f107193f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39980k(C39775b bVar, C50131kh1 kh12, C39975j jVar) {
        super(0);
        this.f107191d = bVar;
        this.f107192e = kh12;
        this.f107193f = jVar;
    }

    public Object invoke() {
        C39807u d;
        LinkedList<C49153dj> linkedList;
        C39775b bVar = this.f107191d;
        bVar.f106734e.f144913r = this.f107192e.f136791e;
        C39786k kVar = this.f107193f.f107176s;
        if (kVar != null) {
            C50317lw0 lw02 = bVar.f106734e.f144910o;
            T t = null;
            String str = lw02 != null ? lw02.f137677e : null;
            boolean z = false;
            if (!(str == null || str.length() == 0) && (d = kVar.mo62413d(str)) != null) {
                C39786k.C39787a aVar = kVar.f106765d.get(str);
                int indexOf = d.f106815b.indexOf(bVar);
                String str2 = bVar.f106734e.f144904f;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        z = true;
                    }
                }
                if (z && (linkedList = d.f106817d.f144667g) != null) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        String str3 = bVar.f106734e.f144904f;
                        C52013xs0 xs02 = ((C49153dj) next).f132361d;
                        if (C87412m.m108589b(str3, xs02 != null ? xs02.f144904f : null)) {
                            t = next;
                            break;
                        }
                    }
                    C49153dj djVar = (C49153dj) t;
                    if (djVar != null) {
                        C52013xs0 xs03 = djVar.f132361d;
                        if (xs03 != null) {
                            xs03.f144913r = bVar.f106734e.f144913r;
                        }
                        String str4 = "updateLocalSeq " + bVar.f106734e.f144913r + ", " + bVar.f106734e.f144904f;
                        C87412m.m108594g(str4, "str");
                        Log.m105924i("Finder.BoxDataStore", "memDataLog " + str4);
                    }
                }
                if (indexOf >= 0) {
                    kVar.mo62411b("notifier update index:" + indexOf + ", msg:" + bVar.mo62406i());
                    if (aVar != null) {
                        aVar.mo62418b(new C39786k.C39790d(str, indexOf, 1, 102));
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
