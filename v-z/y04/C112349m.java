package y04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import sx3.C110823p;

/* renamed from: y04.m */
public class C112349m extends C112348l {

    /* renamed from: y04.m$a */
    public static final class C66487a implements C15925h<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f191268a;

        public C66487a(Iterator it) {
            this.f191268a = it;
        }

        public Iterator<T> iterator() {
            return this.f191268a;
        }
    }

    /* renamed from: y04.m$b */
    public static final class C112350b extends C87413o implements C32226l<C15925h<? extends T>, Iterator<? extends T>> {

        /* renamed from: d */
        public static final C112350b f336376d = new C112350b();

        public C112350b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C15925h hVar = (C15925h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return hVar.iterator();
        }
    }

    /* renamed from: y04.m$c */
    public static final class C112351c extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ T f336377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112351c(T t) {
            super(0);
            this.f336377d = t;
        }

        public final T invoke() {
            return this.f336377d;
        }
    }

    /* renamed from: a */
    public static final <T> C15925h<T> m153278a(Iterator<? extends T> it) {
        C87412m.m108594g(it, "<this>");
        return m153279b(new C66487a(it));
    }

    /* renamed from: b */
    public static final <T> C15925h<T> m153279b(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        return hVar instanceof C91364a ? hVar : new C91364a(hVar);
    }

    /* renamed from: c */
    public static final <T> C15925h<T> m153280c(C15925h<? extends C15925h<? extends T>> hVar) {
        C87412m.m108594g(hVar, "<this>");
        C112350b bVar = C112350b.f336376d;
        if (!(hVar instanceof C66488v)) {
            return new C91365f(hVar, C38944n.f104943d, bVar);
        }
        C66488v vVar = (C66488v) hVar;
        C87412m.m108594g(bVar, "iterator");
        return new C91365f(vVar.f191269a, vVar.f191270b, bVar);
    }

    /* renamed from: d */
    public static final <T> C15925h<T> m153281d(T t, C32226l<? super T, ? extends T> lVar) {
        C87412m.m108594g(lVar, "nextFunction");
        return t == null ? C112346d.f336375a : new C66483g(new C112351c(t), lVar);
    }

    /* renamed from: e */
    public static final <T> C15925h<T> m153282e(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        return tArr.length == 0 ? C112346d.f336375a : C110823p.m151006v(tArr);
    }
}
