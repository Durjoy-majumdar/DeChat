package p004b0;

import fy3.C32226l;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: b0.f0 */
public interface C54372f0 {

    /* renamed from: b0.f0$a */
    public static final class C54373a {

        /* renamed from: b0.f0$a$a */
        public static final class C54374a extends C87413o implements C32226l {

            /* renamed from: d */
            public static final C54374a f152556d = new C54374a();

            public C54374a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m61062a(C54372f0 f0Var, Object obj, Object obj2, C32228q qVar, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                f0Var.mo75140c(obj, obj2, qVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        /* renamed from: b */
        public static /* synthetic */ void m61063b(C54372f0 f0Var, int i, C32226l lVar, C32226l lVar2, C32229r rVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    lVar = null;
                }
                if ((i2 & 4) != 0) {
                    lVar2 = C54374a.f152556d;
                }
                f0Var.mo75141d(i, lVar, lVar2, rVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }

    /* renamed from: a */
    /* synthetic */ void mo75138a(int i, C32226l lVar, C32229r rVar);

    /* renamed from: b */
    void mo75139b(Object obj, Object obj2, C32228q<? super C103941f, ? super C108504h, ? super Integer, C13598b0> qVar);

    /* renamed from: c */
    void mo75140c(Object obj, Object obj2, C32228q<? super C103941f, ? super C108504h, ? super Integer, C13598b0> qVar);

    /* renamed from: d */
    void mo75141d(int i, C32226l<? super Integer, ? extends Object> lVar, C32226l<? super Integer, ? extends Object> lVar2, C32229r<? super C103941f, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar);
}
