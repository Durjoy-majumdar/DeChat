package xy3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sx3.C110818d0;
import sx3.C110823p;
import vz3.C22826c;
import y04.C112354s;
import y04.C15925h;
import y04.C91365f;

/* renamed from: xy3.l */
public final class C26579l implements C26571h {

    /* renamed from: d */
    public final List<C26571h> f73944d;

    /* renamed from: xy3.l$b */
    public static final class C23143b extends C87413o implements C32226l<C26571h, C15925h<? extends C26566c>> {

        /* renamed from: d */
        public static final C23143b f66467d = new C23143b();

        public C23143b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26571h hVar = (C26571h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return C110818d0.m150897A(hVar);
        }
    }

    /* renamed from: xy3.l$a */
    public static final class C26580a extends C87413o implements C32226l<C26571h, C26566c> {

        /* renamed from: d */
        public final /* synthetic */ C22826c f73945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26580a(C22826c cVar) {
            super(1);
            this.f73945d = cVar;
        }

        public Object invoke(Object obj) {
            C26571h hVar = (C26571h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return hVar.mo51476b(this.f73945d);
        }
    }

    public C26579l(List<? extends C26571h> list) {
        C87412m.m108594g(list, "delegates");
        this.f73944d = list;
    }

    /* renamed from: b */
    public C26566c mo51476b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return (C26566c) C112354s.m153288k(C112354s.m153291n(C110818d0.m150897A(this.f73944d), new C26580a(cVar)));
    }

    public boolean isEmpty() {
        List<C26571h> list = this.f73944d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C26571h isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C26566c> iterator() {
        return new C91365f.C91366a((C91365f) C112354s.m153289l(C110818d0.m150897A(this.f73944d), C23143b.f66467d));
    }

    /* renamed from: q */
    public boolean mo51479q(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        Iterator it = ((C110818d0.C64182a) C110818d0.m150897A(this.f73944d)).iterator();
        while (it.hasNext()) {
            if (((C26571h) it.next()).mo51479q(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C26579l(C26571h... hVarArr) {
        this((List<? extends C26571h>) C110823p.m151001a0(hVarArr));
        C87412m.m108594g(hVarArr, "delegates");
    }
}
