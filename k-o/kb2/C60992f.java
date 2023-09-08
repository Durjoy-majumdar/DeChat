package kb2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58057l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.C64470jh3;
import te3.C64493kh3;
import te3.C64506kz3;
import te3.C64525lh3;

/* renamed from: kb2.f */
public final class C60992f extends C53996a<C60995i> {

    /* renamed from: d */
    public final C64525lh3 f173703d;

    /* renamed from: e */
    public String f173704e;

    /* renamed from: f */
    public final HashSet<String> f173705f = new HashSet<>();

    public C60992f(C64525lh3 lh32) {
        C87412m.m108594g(lh32, "previewItemObj");
        this.f173703d = lh32;
    }

    /* renamed from: b */
    public C45252f<C39534d<C60995i>> mo70650e(LifecycleScope lifecycleScope, C53998c<C60995i> cVar) {
        C64493kh3 kh32;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        LinkedList<C64493kh3> linkedList = this.f173703d.f184106d;
        C87412m.m108593f(linkedList, "previewItemObj.sourceList");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                LinkedList<C64493kh3> linkedList2 = this.f173703d.f184106d;
                C87412m.m108593f(linkedList2, "previewItemObj.sourceList");
                kh32 = (C64493kh3) C110818d0.m150916N(linkedList2);
                break;
            }
            kh32 = (C64493kh3) it.next();
            if (C87412m.m108589b(kh32.f183943e, this.f173704e)) {
                break;
            }
        }
        if (kh32 != null) {
            int size = kh32.f183942d.size();
            for (int i = 0; i < size; i++) {
                C64470jh3 jh32 = kh32.f183942d.get(i);
                String str = jh32.f183796d;
                if (str != null) {
                    HashSet<String> hashSet = this.f173705f;
                    boolean contains = hashSet.contains(kh32.f183943e + '-' + str);
                    ArrayList<T> arrayList = dVar.f106151b;
                    String str2 = kh32.f183943e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C60995i iVar = new C60995i(str, i, jh32, str2);
                    iVar.f173715h = contains;
                    arrayList.add(iVar);
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    public void onCreate() {
        LinkedList<C64506kz3> linkedList = this.f173703d.f184107e;
        C87412m.m108593f(linkedList, "previewItemObj.selectItemList");
        for (C64506kz3 kz32 : linkedList) {
            C64470jh3 jh32 = kz32.f184006d;
            if (jh32 != null) {
                HashSet<String> hashSet = this.f173705f;
                hashSet.add(kz32.f184007e + '-' + jh32.f183796d);
            }
        }
    }
}
