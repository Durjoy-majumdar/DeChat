package androidx.compose.foundation.lazy.layout;

import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p415q0.C110261c;
import p415q0.C25518a;
import p560i2.C108321c;
import p560i2.C108322d;
import p560i2.C108324e;
import p683s0.C110678e;
import rx3.C13598b0;

/* renamed from: androidx.compose.foundation.lazy.layout.i */
public final class C103581i {

    /* renamed from: a */
    public final C110678e f305901a;

    /* renamed from: b */
    public final C32224a<C103583j> f305902b;

    /* renamed from: c */
    public final Map<Object, C103582a> f305903c = new LinkedHashMap();

    /* renamed from: d */
    public C108322d f305904d = new C108324e(0.0f, 0.0f);

    /* renamed from: e */
    public long f305905e = C108321c.m146705b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: androidx.compose.foundation.lazy.layout.i$a */
    public final class C103582a {

        /* renamed from: a */
        public final Object f305906a;

        /* renamed from: b */
        public final Object f305907b;

        /* renamed from: c */
        public final C60690y0 f305908c;

        /* renamed from: d */
        public C32227p<? super C108504h, ? super Integer, C13598b0> f305909d;

        /* renamed from: e */
        public final /* synthetic */ C103581i f305910e;

        public C103582a(C103581i iVar, int i, Object obj, Object obj2) {
            C87412m.m108594g(obj, "key");
            this.f305910e = iVar;
            this.f305906a = obj;
            this.f305907b = obj2;
            this.f305908c = C108500f2.m146996c(Integer.valueOf(i), (C108497e2) null, 2, (Object) null);
        }
    }

    public C103581i(C110678e eVar, C32224a<? extends C103583j> aVar) {
        C87412m.m108594g(eVar, "saveableStateHolder");
        C87412m.m108594g(aVar, "itemProvider");
        this.f305901a = eVar;
        this.f305902b = aVar;
    }

    /* renamed from: a */
    public final C32227p<C108504h, Integer, C13598b0> mo144567a(int i, Object obj) {
        C87412m.m108594g(obj, "key");
        C103582a aVar = (C103582a) ((LinkedHashMap) this.f305903c).get(obj);
        Object d = this.f305902b.invoke().mo75148d(i);
        if (aVar == null || ((Number) ((C108494d2) aVar.f305908c).getValue()).intValue() != i || !C87412m.m108589b(aVar.f305907b, d)) {
            C103582a aVar2 = new C103582a(this, i, obj, d);
            this.f305903c.put(obj, aVar2);
            C32227p<? super C108504h, ? super Integer, C13598b0> pVar = aVar2.f305909d;
            if (pVar != null) {
                return pVar;
            }
            C25518a c = C110261c.m149879c(1403994769, true, new C103580h(aVar2.f305910e, aVar2));
            aVar2.f305909d = c;
            return c;
        }
        C32227p<? super C108504h, ? super Integer, C13598b0> pVar2 = aVar.f305909d;
        if (pVar2 != null) {
            return pVar2;
        }
        C25518a c2 = C110261c.m149879c(1403994769, true, new C103580h(aVar.f305910e, aVar));
        aVar.f305909d = c2;
        return c2;
    }

    /* renamed from: b */
    public final Object mo144568b(Object obj) {
        C103582a aVar = (C103582a) ((LinkedHashMap) this.f305903c).get(obj);
        if (aVar != null) {
            return aVar.f305907b;
        }
        C103583j invoke = this.f305902b.invoke();
        Integer num = invoke.mo75149e().get(obj);
        if (num != null) {
            return invoke.mo75148d(num.intValue());
        }
        return null;
    }
}
