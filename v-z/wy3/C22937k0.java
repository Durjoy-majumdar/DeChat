package wy3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sx3.C110818d0;
import vz3.C22826c;
import vz3.C22830f;
import y04.C112354s;

/* renamed from: wy3.k0 */
public final class C22937k0 implements C22941m0 {

    /* renamed from: a */
    public final Collection<C26465i0> f65910a;

    /* renamed from: wy3.k0$a */
    public static final class C22938a extends C87413o implements C32226l<C26465i0, C22826c> {

        /* renamed from: d */
        public static final C22938a f65911d = new C22938a();

        public C22938a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26465i0 i0Var = (C26465i0) obj;
            C87412m.m108594g(i0Var, LocaleUtil.ITALIAN);
            return i0Var.mo53444d();
        }
    }

    /* renamed from: wy3.k0$b */
    public static final class C22939b extends C87413o implements C32226l<C22826c, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C22826c f65912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22939b(C22826c cVar) {
            super(1);
            this.f65912d = cVar;
        }

        public Object invoke(Object obj) {
            C22826c cVar = (C22826c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(!cVar.mo35975d() && C87412m.m108589b(cVar.mo35976e(), this.f65912d));
        }
    }

    public C22937k0(Collection<? extends C26465i0> collection) {
        C87412m.m108594g(collection, "packageFragments");
        this.f65910a = collection;
    }

    /* renamed from: a */
    public List<C26465i0> mo36112a(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        Collection<C26465i0> collection = this.f65910a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (C87412m.m108589b(((C26465i0) next).mo53444d(), cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo36114b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        Collection<C26465i0> collection = this.f65910a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (C26465i0 d : collection) {
            if (C87412m.m108589b(d.mo53444d(), cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo36115c(C22826c cVar, Collection<C26465i0> collection) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(collection, "packageFragments");
        for (T next : this.f65910a) {
            if (C87412m.m108589b(((C26465i0) next).mo53444d(), cVar)) {
                collection.add(next);
            }
        }
    }

    /* renamed from: r */
    public Collection<C22826c> mo36113r(C22826c cVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        return C112354s.m153296s(C112354s.m153285h(C112354s.m153290m(C110818d0.m150897A(this.f65910a), C22938a.f65911d), new C22939b(cVar)));
    }
}
