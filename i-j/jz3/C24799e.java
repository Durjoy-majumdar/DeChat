package jz3;

import b04.C23641a;
import b04.C23643b;
import b04.C23649g;
import b04.C23650h;
import b04.C23651i;
import b04.C23654k;
import b04.C23663s;
import b04.C23668u;
import d04.C24442a;
import fy3.C32224a;
import fz3.C24503f0;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24577a;
import gz3.C24597k;
import hz3.C24615g;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kz3.C24863e;
import lz3.C24955a;
import m04.C21480i;
import m04.C24976j;
import m04.C24979m;
import mz3.C25048a;
import mz3.C25050b;
import mz3.C25051c;
import mz3.C25053e;
import mz3.C25055g;
import mz3.C25056h;
import mz3.C25061m;
import mz3.C25063o;
import n04.C25143j0;
import n04.C25153l0;
import n04.C25158m1;
import n04.C25176s0;
import n04.C25202z1;
import ny3.C89104m;
import p04.C25416i;
import p04.C25417j;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90364q0;
import ty3.C26336h;
import ty3.C26343l;
import vy3.C26386d;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26510v;
import wy3.C26521y0;
import xy3.C26566c;
import xy3.C26568e;
import yz3.C23393c;

/* renamed from: jz3.e */
public final class C24799e implements C26566c, C24615g {

    /* renamed from: i */
    public static final /* synthetic */ C89104m<Object>[] f70718i;

    /* renamed from: a */
    public final C24651h f70719a;

    /* renamed from: b */
    public final C25048a f70720b;

    /* renamed from: c */
    public final C24976j f70721c;

    /* renamed from: d */
    public final C21480i f70722d;

    /* renamed from: e */
    public final C24955a f70723e;

    /* renamed from: f */
    public final C21480i f70724f;

    /* renamed from: g */
    public final boolean f70725g;

    /* renamed from: h */
    public final boolean f70726h;

    /* renamed from: jz3.e$a */
    public static final class C24800a extends C87413o implements C32224a<Map<C22830f, ? extends C23649g<?>>> {

        /* renamed from: d */
        public final /* synthetic */ C24799e f70727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24800a(C24799e eVar) {
            super(0);
            this.f70727d = eVar;
        }

        public Object invoke() {
            Collection<C25050b> arguments = this.f70727d.f70720b.getArguments();
            C24799e eVar = this.f70727d;
            ArrayList arrayList = new ArrayList();
            for (C25050b bVar : arguments) {
                C22830f name = bVar.getName();
                if (name == null) {
                    name = C24503f0.f70031b;
                }
                C23649g<?> b = eVar.mo51785b(bVar);
                C13604l lVar = b != null ? new C13604l(name, b) : null;
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            return C90364q0.m113152k(arrayList);
        }
    }

    /* renamed from: jz3.e$b */
    public static final class C24801b extends C87413o implements C32224a<C22826c> {

        /* renamed from: d */
        public final /* synthetic */ C24799e f70728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24801b(C24799e eVar) {
            super(0);
            this.f70728d = eVar;
        }

        public Object invoke() {
            C26408b f = this.f70728d.f70720b.mo51043f();
            if (f != null) {
                return f.mo53387b();
            }
            return null;
        }
    }

    /* renamed from: jz3.e$c */
    public static final class C24802c extends C87413o implements C32224a<C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C24799e f70729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24802c(C24799e eVar) {
            super(0);
            this.f70729d = eVar;
        }

        public Object invoke() {
            C22826c d = this.f70729d.mo51298d();
            if (d == null) {
                return C25417j.m32698c(C25416i.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, this.f70729d.f70720b.toString());
            }
            C26447e b = C26386d.m33970b(C26386d.f73603a, d, this.f70729d.f70719a.f70290a.f70270o.mo52623m(), (Integer) null, 4, (Object) null);
            if (b == null) {
                C25055g e = this.f70729d.f70720b.mo51041e();
                b = e != null ? this.f70729d.f70719a.f70290a.f70266k.mo51483a(e) : null;
                if (b == null) {
                    C24799e eVar = this.f70729d;
                    b = C26510v.m34218c(eVar.f70719a.f70290a.f70270o, C26408b.m33992l(d), eVar.f70719a.f70290a.f70259d.mo52574c().f70633l);
                }
            }
            return b.mo36111s();
        }
    }

    static {
        Class<C24799e> cls = C24799e.class;
        f70718i = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C24799e(C24651h hVar, C25048a aVar, boolean z) {
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(aVar, "javaAnnotation");
        this.f70719a = hVar;
        this.f70720b = aVar;
        this.f70721c = hVar.f70290a.f70256a.mo52005f(new C24801b(this));
        this.f70722d = hVar.f70290a.f70256a.mo52006g(new C24802c(this));
        this.f70723e = hVar.f70290a.f70265j.mo37235a(aVar);
        this.f70724f = hVar.f70290a.f70256a.mo52006g(new C24800a(this));
        this.f70725g = aVar.mo51040c();
        this.f70726h = aVar.mo51046m() || z;
    }

    /* renamed from: a */
    public Map<C22830f, C23649g<?>> mo51296a() {
        return (Map) C24979m.m31587a(this.f70724f, this, f70718i[2]);
    }

    /* renamed from: b */
    public final C23649g<?> mo51785b(C25050b bVar) {
        C23649g<?> sVar;
        C25143j0 j0Var;
        if (bVar instanceof C25063o) {
            return C23651i.f67841a.mo37200b(((C25063o) bVar).getValue());
        }
        if (bVar instanceof C25061m) {
            C25061m mVar = (C25061m) bVar;
            C26408b d = mVar.mo51104d();
            C22830f e = mVar.mo51105e();
            if (d == null || e == null) {
                return null;
            }
            return new C23654k(d, e);
        }
        if (bVar instanceof C25053e) {
            C25053e eVar = (C25053e) bVar;
            C22830f name = eVar.getName();
            if (name == null) {
                name = C24503f0.f70031b;
            }
            C87412m.m108593f(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            List<C25050b> b = eVar.mo51067b();
            C25176s0 s0Var = (C25176s0) C24979m.m31587a(this.f70722d, this, f70718i[1]);
            C87412m.m108593f(s0Var, "type");
            if (C25153l0.m31968a(s0Var)) {
                return null;
            }
            C26447e d2 = C24442a.m30537d(this);
            C87412m.m108591d(d2);
            C26463h1 b2 = C24577a.m30756b(name, d2);
            if (b2 == null || (j0Var = b2.getType()) == null) {
                j0Var = this.f70719a.f70290a.f70270o.mo52623m().mo53316h(C25202z1.INVARIANT, C25417j.m32698c(C25416i.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b, 10));
            for (C25050b b3 : b) {
                Object b4 = mo51785b(b3);
                if (b4 == null) {
                    b4 = new C23668u();
                }
                arrayList.add(b4);
            }
            sVar = new C23643b(arrayList, new C23650h(j0Var));
        } else if (bVar instanceof C25051c) {
            return new C23641a(new C24799e(this.f70719a, ((C25051c) bVar).mo51057a(), false));
        } else if (!(bVar instanceof C25056h)) {
            return null;
        } else {
            C25143j0 e2 = this.f70719a.f70294e.mo51869e(((C25056h) bVar).mo51097c(), C24863e.m31346b(C24597k.COMMON, false, (C26446d1) null, 3, (Object) null));
            if (C25153l0.m31968a(e2)) {
                return null;
            }
            C25143j0 j0Var2 = e2;
            int i = 0;
            while (C26336h.m33842z(j0Var2)) {
                j0Var2 = ((C25158m1) C110818d0.m150938j0(j0Var2.mo37079I0())).getType();
                C87412m.m108593f(j0Var2, "type.arguments.single().type");
                i++;
            }
            C22935h o = j0Var2.mo37081K0().mo37094o();
            if (o instanceof C26447e) {
                C26408b f = C24442a.m30539f(o);
                if (f == null) {
                    return new C23663s((C23663s.C23664a) new C23663s.C23664a.C23665a(e2));
                }
                sVar = new C23663s(f, i);
            } else if (!(o instanceof C26446d1)) {
                return null;
            } else {
                sVar = new C23663s(C26408b.m33992l(C26343l.C26344a.f73409b.mo35993i()), 0);
            }
        }
        return sVar;
    }

    /* renamed from: c */
    public boolean mo51297c() {
        return this.f70725g;
    }

    /* renamed from: d */
    public C22826c mo51298d() {
        C24976j jVar = this.f70721c;
        C89104m<Object> mVar = f70718i[0];
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(mVar, "p");
        return (C22826c) jVar.invoke();
    }

    public C26521y0 getSource() {
        return this.f70723e;
    }

    public C25143j0 getType() {
        return (C25176s0) C24979m.m31587a(this.f70722d, this, f70718i[1]);
    }

    public String toString() {
        return C23393c.m27911q(C23393c.f67152a, this, (C26568e) null, 2, (Object) null);
    }
}
