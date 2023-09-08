package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m04.C21479h;
import m04.C24959e;
import vz3.C22826c;
import vz3.C22829e;

/* renamed from: fz3.i0 */
public final class C20748i0<T> implements C24505h0<T> {

    /* renamed from: b */
    public final Map<C22826c, T> f58637b;

    /* renamed from: c */
    public final C21479h<C22826c, T> f58638c = new C24959e("Java nullability annotation states").mo52004e(new C20749a(this));

    /* renamed from: fz3.i0$a */
    public static final class C20749a extends C87413o implements C32226l<C22826c, T> {

        /* renamed from: d */
        public final /* synthetic */ C20748i0<T> f58639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20749a(C20748i0<T> i0Var) {
            super(1);
            this.f58639d = i0Var;
        }

        public Object invoke(Object obj) {
            Object obj2;
            C22826c cVar = (C22826c) obj;
            C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
            Map<C22826c, T> map = this.f58639d.f58637b;
            C87412m.m108594g(map, "values");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<C22826c, T>> it = map.entrySet().iterator();
            while (true) {
                boolean z = true;
                C22826c cVar2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                C22826c cVar3 = (C22826c) next.getKey();
                if (!C87412m.m108589b(cVar, cVar3)) {
                    C87412m.m108594g(cVar3, "packageName");
                    if (!cVar.mo35975d()) {
                        cVar2 = cVar.mo35976e();
                    }
                    if (!C87412m.m108589b(cVar2, cVar3)) {
                        z = false;
                    }
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            if (!(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                return null;
            }
            Iterator it4 = linkedHashMap.entrySet().iterator();
            if (!it4.hasNext()) {
                obj2 = null;
            } else {
                obj2 = it4.next();
                if (it4.hasNext()) {
                    int length = C22829e.m26791a((C22826c) ((Map.Entry) obj2).getKey(), cVar).mo35973b().length();
                    do {
                        Object next2 = it4.next();
                        int length2 = C22829e.m26791a((C22826c) ((Map.Entry) next2).getKey(), cVar).mo35973b().length();
                        if (length > length2) {
                            obj2 = next2;
                            length = length2;
                        }
                    } while (it4.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) obj2;
            if (entry != null) {
                return entry.getValue();
            }
            return null;
        }
    }

    public C20748i0(Map<C22826c, ? extends T> map) {
        C87412m.m108594g(map, "states");
        this.f58637b = map;
    }
}
