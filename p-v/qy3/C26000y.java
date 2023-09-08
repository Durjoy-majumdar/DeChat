package qy3;

import d04.C24442a;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import n04.C25143j0;
import ny3.C25239j;
import ny3.C25245n;
import ny3.C89104m;
import qy3.C25968n0;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26486o0;
import wy3.C26504r0;
import wy3.C26509u0;
import wy3.C26516w;

/* renamed from: qy3.y */
public final class C26000y implements C25239j {

    /* renamed from: h */
    public static final /* synthetic */ C89104m<Object>[] f72394h;

    /* renamed from: d */
    public final C25914e<?> f72395d;

    /* renamed from: e */
    public final int f72396e;

    /* renamed from: f */
    public final C25239j.C25240a f72397f;

    /* renamed from: g */
    public final C25968n0.C25969a f72398g;

    /* renamed from: qy3.y$a */
    public static final class C26001a extends C87413o implements C32224a<List<? extends Annotation>> {

        /* renamed from: d */
        public final /* synthetic */ C26000y f72399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26001a(C26000y yVar) {
            super(0);
            this.f72399d = yVar;
        }

        public Object invoke() {
            return C25987u0.m33171b(this.f72399d.mo52851c());
        }
    }

    /* renamed from: qy3.y$b */
    public static final class C26002b extends C87413o implements C32224a<Type> {

        /* renamed from: d */
        public final /* synthetic */ C26000y f72400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26002b(C26000y yVar) {
            super(0);
            this.f72400d = yVar;
        }

        public Object invoke() {
            C26486o0 c = this.f72400d.mo52851c();
            if (!(c instanceof C26509u0) || !C87412m.m108589b(C25987u0.m33174e(this.f72400d.f72395d.mo52805n()), c) || this.f72400d.f72395d.mo52805n().mo52634f() != C26436b.C26437a.FAKE_OVERRIDE) {
                return this.f72400d.f72395d.mo52802k().mo53054a().get(this.f72400d.f72396e);
            }
            C26469k b = this.f72400d.f72395d.mo52805n().mo51892b();
            C87412m.m108592e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> h = C25987u0.m33177h((C26447e) b);
            if (h != null) {
                return h;
            }
            throw new C118215l0("Cannot determine receiver Java type of inherited declaration: " + c);
        }
    }

    static {
        Class<C26000y> cls = C26000y.class;
        f72394h = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C26000y(C25914e<?> eVar, int i, C25239j.C25240a aVar, C32224a<? extends C26486o0> aVar2) {
        C87412m.m108594g(eVar, "callable");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(aVar2, "computeDescriptor");
        this.f72395d = eVar;
        this.f72396e = i;
        this.f72397f = aVar;
        this.f72398g = C25968n0.m33137c(aVar2);
        C25968n0.m33137c(new C26001a(this));
    }

    /* renamed from: a */
    public boolean mo52341a() {
        C26486o0 c = mo52851c();
        return (c instanceof C26463h1) && ((C26463h1) c).mo53440S() != null;
    }

    /* renamed from: b */
    public boolean mo52342b() {
        C26486o0 c = mo52851c();
        C26463h1 h1Var = c instanceof C26463h1 ? (C26463h1) c : null;
        if (h1Var != null) {
            return C24442a.m30534a(h1Var);
        }
        return false;
    }

    /* renamed from: c */
    public final C26486o0 mo52851c() {
        C25968n0.C25969a aVar = this.f72398g;
        C89104m<Object> mVar = f72394h[0];
        Object invoke = aVar.invoke();
        C87412m.m108593f(invoke, "<get-descriptor>(...)");
        return (C26486o0) invoke;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C26000y) {
            C26000y yVar = (C26000y) obj;
            return C87412m.m108589b(this.f72395d, yVar.f72395d) && this.f72396e == yVar.f72396e;
        }
    }

    /* renamed from: f */
    public C25239j.C25240a mo52343f() {
        return this.f72397f;
    }

    public String getName() {
        C26486o0 c = mo52851c();
        C26463h1 h1Var = c instanceof C26463h1 ? (C26463h1) c : null;
        if (h1Var == null || h1Var.mo51892b().mo51317M()) {
            return null;
        }
        C22830f name = h1Var.getName();
        C87412m.m108593f(name, "valueParameter.name");
        if (name.f65638e) {
            return null;
        }
        return name.mo35995b();
    }

    public C25245n getType() {
        C25143j0 type = mo52851c().getType();
        C87412m.m108593f(type, "descriptor.type");
        return new C25935i0(type, new C26002b(this));
    }

    public int hashCode() {
        return (this.f72395d.hashCode() * 31) + Integer.valueOf(this.f72396e).hashCode();
    }

    public String toString() {
        String str;
        C25974p0 p0Var = C25974p0.f72353a;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.f72397f.ordinal();
        if (ordinal == 0) {
            sb.append("instance parameter");
        } else if (ordinal == 1) {
            sb.append("extension receiver parameter");
        } else if (ordinal == 2) {
            sb.append("parameter #" + this.f72396e + ' ' + getName());
        }
        sb.append(" of ");
        C26436b n = this.f72395d.mo52805n();
        if (n instanceof C26504r0) {
            str = p0Var.mo52839c((C26504r0) n);
        } else if (n instanceof C26516w) {
            str = p0Var.mo52838b((C26516w) n);
        } else {
            throw new IllegalStateException(("Illegal callable: " + n).toString());
        }
        sb.append(str);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
