package gz3;

import b04.C23643b;
import b04.C23649g;
import b04.C23654k;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import mz3.C25050b;
import mz3.C25061m;
import n04.C25143j0;
import p04.C25416i;
import p04.C25417j;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C64187h0;
import sx3.C90364q0;
import ty3.C26343l;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26448e0;
import wy3.C26463h1;
import xy3.C23144n;
import xy3.C26582o;

/* renamed from: gz3.d */
public final class C24582d {

    /* renamed from: a */
    public static final C24582d f70176a = new C24582d();

    /* renamed from: b */
    public static final Map<String, EnumSet<C26582o>> f70177b = C90364q0.m113147f(new C13604l("PACKAGE", EnumSet.noneOf(C26582o.class)), new C13604l("TYPE", EnumSet.of(C26582o.CLASS, C26582o.FILE)), new C13604l("ANNOTATION_TYPE", EnumSet.of(C26582o.ANNOTATION_CLASS)), new C13604l("TYPE_PARAMETER", EnumSet.of(C26582o.TYPE_PARAMETER)), new C13604l("FIELD", EnumSet.of(C26582o.FIELD)), new C13604l("LOCAL_VARIABLE", EnumSet.of(C26582o.LOCAL_VARIABLE)), new C13604l("PARAMETER", EnumSet.of(C26582o.VALUE_PARAMETER)), new C13604l("CONSTRUCTOR", EnumSet.of(C26582o.CONSTRUCTOR)), new C13604l("METHOD", EnumSet.of(C26582o.FUNCTION, C26582o.PROPERTY_GETTER, C26582o.PROPERTY_SETTER)), new C13604l("TYPE_USE", EnumSet.of(C26582o.TYPE)));

    /* renamed from: c */
    public static final Map<String, C23144n> f70178c = C90364q0.m113147f(new C13604l("RUNTIME", C23144n.RUNTIME), new C13604l("CLASS", C23144n.BINARY), new C13604l("SOURCE", C23144n.SOURCE));

    /* renamed from: gz3.d$a */
    public static final class C24583a extends C87413o implements C32226l<C26448e0, C25143j0> {

        /* renamed from: d */
        public static final C24583a f70179d = new C24583a();

        public C24583a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26448e0 e0Var = (C26448e0) obj;
            C87412m.m108594g(e0Var, "module");
            C26463h1 b = C24577a.m30756b(C24581c.f70173c, e0Var.mo52623m().mo53318j(C26343l.C26344a.f73431u));
            C25143j0 type = b != null ? b.getType() : null;
            return type == null ? C25417j.m32698c(C25416i.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    /* renamed from: a */
    public final C23649g<?> mo51303a(List<? extends C25050b> list) {
        C87412m.m108594g(list, "arguments");
        ArrayList<C25061m> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof C25061m) {
                arrayList.add(next);
            }
        }
        ArrayList<C26582o> arrayList2 = new ArrayList<>();
        for (C25061m e : arrayList) {
            C22830f e2 = e.mo51105e();
            Iterable iterable = f70177b.get(e2 != null ? e2.mo35995b() : null);
            if (iterable == null) {
                iterable = C64187h0.f181908d;
            }
            C64175a0.m75508p(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C26582o name : arrayList2) {
            arrayList3.add(new C23654k(C26408b.m33992l(C26343l.C26344a.f73432v), C22830f.m26794f(name.name())));
        }
        return new C23643b(arrayList3, C24583a.f70179d);
    }
}
