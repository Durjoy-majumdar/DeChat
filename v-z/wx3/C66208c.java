package wx3;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Serializable;
import wx3.C66212f;

/* renamed from: wx3.c */
public final class C66208c implements C66212f, Serializable {

    /* renamed from: d */
    public final C66212f f190247d;

    /* renamed from: e */
    public final C66212f.C66215b f190248e;

    /* renamed from: wx3.c$a */
    public static final class C66209a extends C87413o implements C32227p<String, C66212f.C66215b, String> {

        /* renamed from: d */
        public static final C66209a f190249d = new C66209a();

        public C66209a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            C87412m.m108594g(str, "acc");
            C87412m.m108594g(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C66208c(C66212f fVar, C66212f.C66215b bVar) {
        C87412m.m108594g(fVar, "left");
        C87412m.m108594g(bVar, "element");
        this.f190247d = fVar;
        this.f190248e = bVar;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C66208c)) {
                return false;
            }
            C66208c cVar = (C66208c) obj;
            cVar.getClass();
            int i = 2;
            C66208c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                C66212f fVar = cVar2.f190247d;
                cVar2 = fVar instanceof C66208c ? (C66208c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            C66208c cVar3 = this;
            while (true) {
                C66212f fVar2 = cVar3.f190247d;
                cVar3 = fVar2 instanceof C66208c ? (C66208c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C66208c cVar4 = this;
            while (true) {
                C66212f.C66215b bVar = cVar4.f190248e;
                if (C87412m.m108589b(cVar.get(bVar.getKey()), bVar)) {
                    C66212f fVar3 = cVar4.f190247d;
                    if (!(fVar3 instanceof C66208c)) {
                        C87412m.m108592e(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        C66212f.C66215b bVar2 = (C66212f.C66215b) fVar3;
                        z = C87412m.m108589b(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (C66208c) fVar3;
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this.f190247d.fold(r, pVar), this.f190248e);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        C66208c cVar2 = this;
        while (true) {
            E e = cVar2.f190248e.get(cVar);
            if (e != null) {
                return e;
            }
            C66212f fVar = cVar2.f190247d;
            if (!(fVar instanceof C66208c)) {
                return fVar.get(cVar);
            }
            cVar2 = (C66208c) fVar;
        }
    }

    public int hashCode() {
        return this.f190247d.hashCode() + this.f190248e.hashCode();
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        if (this.f190248e.get(cVar) != null) {
            return this.f190247d;
        }
        C66212f minusKey = this.f190247d.minusKey(cVar);
        return minusKey == this.f190247d ? this : minusKey == C66217g.f190253d ? this.f190248e : new C66208c(minusKey, this.f190248e);
    }

    public C66212f plus(C66212f fVar) {
        return C66212f.C66213a.m78144a(this, fVar);
    }

    public String toString() {
        return '[' + ((String) fold("", C66209a.f190249d)) + ']';
    }
}
