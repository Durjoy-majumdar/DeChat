package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import ez3.C24473b;
import fy3.C32226l;
import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import n04.C25143j0;
import sx3.C110818d0;
import sx3.C36907w;
import v04.C26381a;
import vz3.C22830f;
import w04.C26413e;
import wy3.C26434a;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;
import zz3.C23602t;

/* renamed from: g04.o */
public final class C20776o extends C20767a {

    /* renamed from: c */
    public static final C20780a f58685c = new C20780a((C8480h) null);

    /* renamed from: b */
    public final C20770i f58686b;

    /* renamed from: g04.o$b */
    public static final class C20777b extends C87413o implements C32226l<C26434a, C26434a> {

        /* renamed from: d */
        public static final C20777b f58687d = new C20777b();

        public C20777b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26434a aVar = (C26434a) obj;
            C87412m.m108594g(aVar, "$this$selectMostSpecificInEachOverridableGroup");
            return aVar;
        }
    }

    /* renamed from: g04.o$c */
    public static final class C20778c extends C87413o implements C32226l<C26520x0, C26434a> {

        /* renamed from: d */
        public static final C20778c f58688d = new C20778c();

        public C20778c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26520x0 x0Var = (C26520x0) obj;
            C87412m.m108594g(x0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return x0Var;
        }
    }

    /* renamed from: g04.o$d */
    public static final class C20779d extends C87413o implements C32226l<C26504r0, C26434a> {

        /* renamed from: d */
        public static final C20779d f58689d = new C20779d();

        public C20779d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26504r0 r0Var = (C26504r0) obj;
            C87412m.m108594g(r0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return r0Var;
        }
    }

    /* renamed from: g04.o$a */
    public static final class C20780a {
        public C20780a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C20770i mo32465a(String str, Collection<? extends C25143j0> collection) {
            C20770i iVar;
            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
            C87412m.m108594g(collection, "types");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(collection, 10));
            for (C25143j0 n : collection) {
                arrayList.add(n.mo37088n());
            }
            C26413e<C20770i> b = C26381a.m33960b(arrayList);
            int size = b.size();
            if (size == 0) {
                iVar = C20770i.C20773b.f58684b;
            } else if (size != 1) {
                Object[] array = b.toArray(new C20770i[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                iVar = new C24526b(str, (C20770i[]) array, (C8480h) null);
            } else {
                iVar = b.get(0);
            }
            return b.f73679d <= 1 ? iVar : new C20776o(str, iVar, (C8480h) null);
        }
    }

    public C20776o(String str, C20770i iVar, C8480h hVar) {
        this.f58686b = iVar;
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return C23602t.m28184a(super.mo32456a(fVar, bVar), C20778c.f58688d);
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return C23602t.m28184a(super.mo32457b(fVar, bVar), C20779d.f58689d);
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        Collection<C26469k> e = super.mo32460e(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : e) {
            if (((C26469k) next) instanceof C26434a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return C110818d0.m150933e0(C23602t.m28184a(arrayList, C20777b.f58687d), arrayList2);
    }

    /* renamed from: i */
    public C20770i mo32464i() {
        return this.f58686b;
    }
}
