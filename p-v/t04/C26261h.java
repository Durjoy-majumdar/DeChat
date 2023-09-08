package t04;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Collection;
import vz3.C22830f;
import wy3.C26516w;
import z04.C66723k;

/* renamed from: t04.h */
public final class C26261h {

    /* renamed from: a */
    public final C22830f f73192a;

    /* renamed from: b */
    public final C66723k f73193b;

    /* renamed from: c */
    public final Collection<C22830f> f73194c;

    /* renamed from: d */
    public final C32226l<C26516w, String> f73195d;

    /* renamed from: e */
    public final C26255f[] f73196e;

    /* renamed from: t04.h$a */
    public static final class C26262a extends C87413o implements C32226l {

        /* renamed from: d */
        public static final C26262a f73197d = new C26262a();

        public C26262a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C26516w) obj, "$this$null");
            return null;
        }
    }

    /* renamed from: t04.h$b */
    public static final class C26263b extends C87413o implements C32226l {

        /* renamed from: d */
        public static final C26263b f73198d = new C26263b();

        public C26263b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C26516w) obj, "$this$null");
            return null;
        }
    }

    public C26261h(C22830f fVar, C66723k kVar, Collection<C22830f> collection, C32226l<? super C26516w, String> lVar, C26255f... fVarArr) {
        this.f73192a = fVar;
        this.f73193b = kVar;
        this.f73194c = collection;
        this.f73195d = lVar;
        this.f73196e = fVarArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26261h(C22830f fVar, C26255f[] fVarArr, C32226l lVar, int i, C8480h hVar) {
        this(fVar, fVarArr, (C32226l<? super C26516w, String>) (i & 4) != 0 ? C26262a.f73197d : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C26261h(C22830f fVar, C26255f[] fVarArr, C32226l<? super C26516w, String> lVar) {
        this(fVar, (C66723k) null, (Collection<C22830f>) null, lVar, (C26255f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(fVarArr, "checks");
        C87412m.m108594g(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26261h(Collection collection, C26255f[] fVarArr, C32226l lVar, int i, C8480h hVar) {
        this((Collection<C22830f>) collection, fVarArr, (C32226l<? super C26516w, String>) (i & 4) != 0 ? C26263b.f73198d : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C26261h(Collection<C22830f> collection, C26255f[] fVarArr, C32226l<? super C26516w, String> lVar) {
        this((C22830f) null, (C66723k) null, collection, lVar, (C26255f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C87412m.m108594g(collection, "nameList");
        C87412m.m108594g(fVarArr, "checks");
        C87412m.m108594g(lVar, "additionalChecks");
    }
}
