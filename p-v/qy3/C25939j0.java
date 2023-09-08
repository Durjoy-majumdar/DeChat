package qy3;

import bz3.C23681f;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import l04.C24893h;
import l04.C24894i;
import n04.C25143j0;
import ny3.C25235d;
import ny3.C25245n;
import ny3.C25246o;
import ny3.C25249q;
import ny3.C89104m;
import oz3.C25383k;
import qy3.C25968n0;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C36907w;
import wy3.C26436b;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26469k;

/* renamed from: qy3.j0 */
public final class C25939j0 implements C25246o {

    /* renamed from: g */
    public static final /* synthetic */ C89104m<Object>[] f72300g = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C25939j0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: d */
    public final C26446d1 f72301d;

    /* renamed from: e */
    public final C25968n0.C25969a f72302e = C25968n0.m33137c(new C25940a(this));

    /* renamed from: f */
    public final C25942k0 f72303f;

    /* renamed from: qy3.j0$a */
    public static final class C25940a extends C87413o implements C32224a<List<? extends C25935i0>> {

        /* renamed from: d */
        public final /* synthetic */ C25939j0 f72304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25940a(C25939j0 j0Var) {
            super(0);
            this.f72304d = j0Var;
        }

        public Object invoke() {
            List<C25143j0> upperBounds = this.f72304d.f72301d.getUpperBounds();
            C87412m.m108593f(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(upperBounds, 10));
            for (C25143j0 i0Var : upperBounds) {
                arrayList.add(new C25935i0(i0Var, (C32224a<? extends Type>) null));
            }
            return arrayList;
        }
    }

    public C25939j0(C25942k0 k0Var, C26446d1 d1Var) {
        Object obj;
        C25943l<?> lVar;
        Class<?> cls;
        C87412m.m108594g(d1Var, "descriptor");
        this.f72301d = d1Var;
        if (k0Var == null) {
            C26469k b = d1Var.mo51892b();
            C87412m.m108593f(b, "descriptor.containingDeclaration");
            if (b instanceof C26447e) {
                obj = mo52825a((C26447e) b);
            } else if (b instanceof C26436b) {
                C26469k b2 = ((C26436b) b).mo51892b();
                C87412m.m108593f(b2, "declaration.containingDeclaration");
                if (b2 instanceof C26447e) {
                    lVar = mo52825a((C26447e) b2);
                } else {
                    Object obj2 = null;
                    C24894i iVar = b instanceof C24894i ? (C24894i) b : null;
                    if (iVar != null) {
                        C24893h G = iVar.mo51883G();
                        C25383k kVar = (C25383k) (!(G instanceof C25383k) ? null : G);
                        Object obj3 = kVar != null ? kVar.f71926d : null;
                        C23681f fVar = (C23681f) (obj3 instanceof C23681f ? obj3 : obj2);
                        if (fVar == null || (cls = fVar.f67871a) == null) {
                            throw new C118215l0("Container of deserialized member is not resolved: " + iVar);
                        }
                        C25235d a = C24560g0.m30725a(cls);
                        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        lVar = (C25943l) a;
                    } else {
                        throw new C118215l0("Non-class callable descriptor must be deserialized: " + b);
                    }
                }
                obj = b.mo52621h0(new C25905a(lVar), C13598b0.f38549a);
            } else {
                throw new C118215l0("Unknown type parameter container: " + b);
            }
            C87412m.m108593f(obj, "when (val declaration = … $declaration\")\n        }");
            k0Var = (C25942k0) obj;
        }
        this.f72303f = k0Var;
    }

    /* renamed from: a */
    public final C25943l<?> mo52825a(C26447e eVar) {
        Class<?> h = C25987u0.m33177h(eVar);
        C25943l<?> lVar = (C25943l) (h != null ? C24560g0.m30725a(h) : null);
        if (lVar != null) {
            return lVar;
        }
        throw new C118215l0("Type parameter container is not resolved: " + eVar.mo51892b());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C25939j0) {
            C25939j0 j0Var = (C25939j0) obj;
            return C87412m.m108589b(this.f72303f, j0Var.f72303f) && C87412m.m108589b(getName(), j0Var.getName());
        }
    }

    public String getName() {
        String b = this.f72301d.getName().mo35995b();
        C87412m.m108593f(b, "descriptor.name.asString()");
        return b;
    }

    public List<C25245n> getUpperBounds() {
        C25968n0.C25969a aVar = this.f72302e;
        C89104m<Object> mVar = f72300g[0];
        Object invoke = aVar.invoke();
        C87412m.m108593f(invoke, "<get-upperBounds>(...)");
        return (List) invoke;
    }

    public int hashCode() {
        return (this.f72303f.hashCode() * 31) + getName().hashCode();
    }

    /* renamed from: o */
    public C25249q mo52350o() {
        int ordinal = this.f72301d.mo53423o().ordinal();
        if (ordinal == 0) {
            return C25249q.INVARIANT;
        }
        if (ordinal == 1) {
            return C25249q.IN;
        }
        if (ordinal == 2) {
            return C25249q.OUT;
        }
        throw new C13603j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int ordinal = mo52350o().ordinal();
        if (ordinal == 1) {
            sb.append("in ");
        } else if (ordinal == 2) {
            sb.append("out ");
        }
        sb.append(getName());
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
