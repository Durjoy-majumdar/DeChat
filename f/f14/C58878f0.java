package f14;

import a14.C53963w2;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import wx3.C66212f;

/* renamed from: f14.f0 */
public final class C58878f0 {

    /* renamed from: a */
    public static final C58872c0 f168516a = new C58872c0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final C32227p<Object, C66212f.C66215b, Object> f168517b = C58879a.f168520d;

    /* renamed from: c */
    public static final C32227p<C53963w2<?>, C66212f.C66215b, C53963w2<?>> f168518c = C58880b.f168521d;

    /* renamed from: d */
    public static final C32227p<C58886i0, C66212f.C66215b, C58886i0> f168519d = C58881c.f168522d;

    /* renamed from: f14.f0$a */
    public static final class C58879a extends C87413o implements C32227p<Object, C66212f.C66215b, Object> {

        /* renamed from: d */
        public static final C58879a f168520d = new C58879a();

        public C58879a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            if (!(bVar instanceof C53963w2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: f14.f0$b */
    public static final class C58880b extends C87413o implements C32227p<C53963w2<?>, C66212f.C66215b, C53963w2<?>> {

        /* renamed from: d */
        public static final C58880b f168521d = new C58880b();

        public C58880b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C53963w2 w2Var = (C53963w2) obj;
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            if (w2Var != null) {
                return w2Var;
            }
            if (bVar instanceof C53963w2) {
                return (C53963w2) bVar;
            }
            return null;
        }
    }

    /* renamed from: f14.f0$c */
    public static final class C58881c extends C87413o implements C32227p<C58886i0, C66212f.C66215b, C58886i0> {

        /* renamed from: d */
        public static final C58881c f168522d = new C58881c();

        public C58881c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C58886i0 i0Var = (C58886i0) obj;
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            if (bVar instanceof C53963w2) {
                C53963w2<Object> w2Var = (C53963w2) bVar;
                Object q = w2Var.mo74638q(i0Var.f168531a);
                Object[] objArr = i0Var.f168532b;
                int i = i0Var.f168534d;
                objArr[i] = q;
                C53963w2<Object>[] w2VarArr = i0Var.f168533c;
                i0Var.f168534d = i + 1;
                w2VarArr[i] = w2Var;
            }
            return i0Var;
        }
    }

    /* renamed from: a */
    public static final void m68714a(C66212f fVar, Object obj) {
        if (obj != f168516a) {
            if (obj instanceof C58886i0) {
                C58886i0 i0Var = (C58886i0) obj;
                int length = i0Var.f168533c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        C53963w2<Object> w2Var = i0Var.f168533c[length];
                        C87412m.m108591d(w2Var);
                        w2Var.mo74637j(fVar, i0Var.f168532b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, f168518c);
                if (fold != null) {
                    ((C53963w2) fold).mo74637j(fVar, obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    /* renamed from: b */
    public static final Object m68715b(C66212f fVar) {
        Object fold = fVar.fold(0, f168517b);
        C87412m.m108591d(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m68716c(C66212f fVar, Object obj) {
        if (obj == null) {
            obj = m68715b(fVar);
        }
        return obj == 0 ? f168516a : obj instanceof Integer ? fVar.fold(new C58886i0(fVar, ((Number) obj).intValue()), f168519d) : ((C53963w2) obj).mo74638q(fVar);
    }
}
