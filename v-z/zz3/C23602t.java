package zz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import rx3.C13598b0;
import sx3.C110818d0;
import w04.C22850f;
import wy3.C26434a;

/* renamed from: zz3.t */
public final class C23602t {

    /* renamed from: zz3.t$a */
    public static final class C23603a extends C87413o implements C32226l<H, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22850f<H> f67740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23603a(C22850f<H> fVar) {
            super(1);
            this.f67740d = fVar;
        }

        public Object invoke(Object obj) {
            C22850f<H> fVar = this.f67740d;
            C87412m.m108593f(obj, LocaleUtil.ITALIAN);
            fVar.add(obj);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final <H> Collection<H> m28184a(Collection<? extends H> collection, C32226l<? super H, ? extends C26434a> lVar) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C22850f a = C22850f.f65674f.mo36008a();
        while (!linkedList.isEmpty()) {
            Object L = C110818d0.m150914L(linkedList);
            C22850f a2 = C22850f.f65674f.mo36008a();
            Collection<H> g = C26802n.m35256g(L, linkedList, lVar, new C23603a(a2));
            if (((ArrayList) g).size() != 1 || !a2.isEmpty()) {
                Object s = C26802n.m35264s(g, lVar);
                C87412m.m108593f(s, "selectMostSpecificMember…roup, descriptorByHandle)");
                C26434a aVar = (C26434a) lVar.invoke(s);
                for (T next : g) {
                    C87412m.m108593f(next, LocaleUtil.ITALIAN);
                    if (!C26802n.m35259k(aVar, (C26434a) lVar.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(s);
            } else {
                Object i0 = C110818d0.m150937i0(g);
                C87412m.m108593f(i0, "overridableGroup.single()");
                a.add(i0);
            }
        }
        return a;
    }
}
