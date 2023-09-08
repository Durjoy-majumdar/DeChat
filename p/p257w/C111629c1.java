package p257w;

import a14.C0000n0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ListIterator;
import kotlin.ResultKt;
import p175j0.C108491a0;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60667k2;
import p175j0.C60685u0;
import p175j0.C60690y0;
import p241t0.C110839b0;
import p241t0.C110872v;
import p257w.C111636d;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: w.c1 */
public final class C111629c1<S> {

    /* renamed from: a */
    public final C111655m0<S> f334177a;

    /* renamed from: b */
    public final String f334178b;

    /* renamed from: c */
    public final C60690y0 f334179c = C108500f2.m146996c(mo163298b(), (C108497e2) null, 2, (Object) null);

    /* renamed from: d */
    public final C60690y0 f334180d = C108500f2.m146996c(new C111633c(mo163298b(), mo163298b()), (C108497e2) null, 2, (Object) null);

    /* renamed from: e */
    public final C60690y0 f334181e = C108500f2.m146996c(0L, (C108497e2) null, 2, (Object) null);

    /* renamed from: f */
    public final C60690y0 f334182f = C108500f2.m146996c(Long.MIN_VALUE, (C108497e2) null, 2, (Object) null);

    /* renamed from: g */
    public final C60690y0 f334183g = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);

    /* renamed from: h */
    public final C110872v<C111629c1<S>.d<?, ?>> f334184h = new C110872v<>();

    /* renamed from: i */
    public final C110872v<C111629c1<?>> f334185i = new C110872v<>();

    /* renamed from: j */
    public final C60690y0 f334186j = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);

    /* renamed from: k */
    public long f334187k;

    /* renamed from: l */
    public final C60667k2 f334188l = C108500f2.m146994a(new C111635g(this));

    @C91590f(mo125468c = "androidx.compose.animation.core.Transition$animateTo$1$1", mo125469f = "Transition.kt", mo125470l = {433}, mo125471m = "invokeSuspend")
    /* renamed from: w.c1$e */
    public static final class C65909e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189474d;

        /* renamed from: e */
        public /* synthetic */ Object f189475e;

        /* renamed from: f */
        public final /* synthetic */ C111629c1<S> f189476f;

        /* renamed from: w.c1$e$a */
        public static final class C65910a extends C87413o implements C32226l<Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C111629c1<S> f189477d;

            /* renamed from: e */
            public final /* synthetic */ float f189478e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65910a(C111629c1<S> c1Var, float f) {
                super(1);
                this.f189477d = c1Var;
                this.f189478e = f;
            }

            public Object invoke(Object obj) {
                long longValue = ((Number) obj).longValue();
                if (!this.f189477d.mo163301e()) {
                    this.f189477d.mo163302f(longValue / 1, this.f189478e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65909e(C111629c1<S> c1Var, C15601d<? super C65909e> dVar) {
            super(2, dVar);
            this.f189476f = c1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C65909e eVar = new C65909e(this.f189476f, dVar);
            eVar.f189475e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65909e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C0000n0 n0Var;
            C65910a aVar;
            C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189474d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                n0Var = (C0000n0) this.f189475e;
            } else if (i == 1) {
                n0Var = (C0000n0) this.f189475e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            do {
                aVar = new C65910a(this.f189476f, C111671y0.m152197e(n0Var.getCoroutineContext()));
                this.f189475e = n0Var;
                this.f189474d = 1;
            } while (C60685u0.m70964b(aVar, this) != aVar2);
            return aVar2;
        }
    }

    /* renamed from: w.c1$f */
    public static final class C65911f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f189479d;

        /* renamed from: e */
        public final /* synthetic */ S f189480e;

        /* renamed from: f */
        public final /* synthetic */ int f189481f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65911f(C111629c1<S> c1Var, S s, int i) {
            super(2);
            this.f189479d = c1Var;
            this.f189480e = s;
            this.f189481f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f189479d.mo163297a(this.f189480e, (C108504h) obj, this.f189481f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.c1$h */
    public static final class C65912h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f189482d;

        /* renamed from: e */
        public final /* synthetic */ S f189483e;

        /* renamed from: f */
        public final /* synthetic */ int f189484f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65912h(C111629c1<S> c1Var, S s, int i) {
            super(2);
            this.f189482d = c1Var;
            this.f189483e = s;
            this.f189484f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f189482d.mo163304h(this.f189483e, (C108504h) obj, this.f189484f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.c1$a */
    public final class C111630a<T, V extends C37919o> {

        /* renamed from: a */
        public final C37906k1<T, V> f334189a;

        /* renamed from: b */
        public final String f334190b;

        /* renamed from: c */
        public C111629c1<S>.a<T, V>.a<T, V> f334191c;

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f334192d;

        /* renamed from: w.c1$a$a */
        public final class C111631a<T, V extends C37919o> implements C60667k2<T> {

            /* renamed from: d */
            public final C111629c1<S>.d<T, V> f334193d;

            /* renamed from: e */
            public C32226l<? super C111632b<S>, ? extends C37892b0<T>> f334194e;

            /* renamed from: f */
            public C32226l<? super S, ? extends T> f334195f;

            /* renamed from: g */
            public final /* synthetic */ C111629c1<S>.a<T, V> f334196g;

            public C111631a(C111630a aVar, C111629c1<S>.d<T, V> dVar, C32226l<? super C111632b<S>, ? extends C37892b0<T>> lVar, C32226l<? super S, ? extends T> lVar2) {
                C87412m.m108594g(dVar, "animation");
                C87412m.m108594g(lVar, "transitionSpec");
                C87412m.m108594g(lVar2, "targetValueByState");
                this.f334196g = aVar;
                this.f334193d = dVar;
                this.f334194e = lVar;
                this.f334195f = lVar2;
            }

            /* renamed from: e */
            public final void mo163306e(C111632b<S> bVar) {
                C87412m.m108594g(bVar, "segment");
                Object invoke = this.f334195f.invoke(bVar.mo163309c());
                if (this.f334196g.f334192d.mo163301e()) {
                    this.f334193d.mo163313g(this.f334195f.invoke(bVar.mo163308b()), invoke, (C37892b0) this.f334194e.invoke(bVar));
                    return;
                }
                this.f334193d.mo163314h(invoke, (C37892b0) this.f334194e.invoke(bVar));
            }

            public T getValue() {
                mo163306e(this.f334196g.f334192d.mo163299c());
                return this.f334193d.getValue();
            }
        }

        public C111630a(C111629c1 c1Var, C37906k1<T, V> k1Var, String str) {
            C87412m.m108594g(k1Var, "typeConverter");
            C87412m.m108594g(str, "label");
            this.f334192d = c1Var;
            this.f334189a = k1Var;
            this.f334190b = str;
        }

        /* renamed from: a */
        public final C60667k2<T> mo163305a(C32226l<? super C111632b<S>, ? extends C37892b0<T>> lVar, C32226l<? super S, ? extends T> lVar2) {
            C87412m.m108594g(lVar, "transitionSpec");
            C87412m.m108594g(lVar2, "targetValueByState");
            C111629c1<S>.a<T, V>.a<T, V> aVar = this.f334191c;
            if (aVar == null) {
                C111629c1<S> c1Var = this.f334192d;
                aVar = new C111631a<>(this, new C111634d(c1Var, lVar2.invoke(c1Var.mo163298b()), C111651k.m152179c(this.f334189a, lVar2.invoke(this.f334192d.mo163298b())), this.f334189a, this.f334190b), lVar, lVar2);
                C111629c1<S> c1Var2 = this.f334192d;
                this.f334191c = aVar;
                C111629c1<S>.d<T, V> dVar = aVar.f334193d;
                c1Var2.getClass();
                C87412m.m108594g(dVar, "animation");
                c1Var2.f334184h.add(dVar);
            }
            C111629c1<S> c1Var3 = this.f334192d;
            aVar.f334195f = lVar2;
            aVar.f334194e = lVar;
            aVar.mo163306e(c1Var3.mo163299c());
            return aVar;
        }
    }

    /* renamed from: w.c1$b */
    public interface C111632b<S> {
        /* renamed from: a */
        boolean mo163307a(S s, S s2);

        /* renamed from: b */
        S mo163308b();

        /* renamed from: c */
        S mo163309c();
    }

    /* renamed from: w.c1$c */
    public static final class C111633c<S> implements C111632b<S> {

        /* renamed from: a */
        public final S f334197a;

        /* renamed from: b */
        public final S f334198b;

        public C111633c(S s, S s2) {
            this.f334197a = s;
            this.f334198b = s2;
        }

        /* renamed from: a */
        public boolean mo163307a(S s, S s2) {
            return C87412m.m108589b(s, mo163308b()) && C87412m.m108589b(s2, mo163309c());
        }

        /* renamed from: b */
        public S mo163308b() {
            return this.f334197a;
        }

        /* renamed from: c */
        public S mo163309c() {
            return this.f334198b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C111632b) {
                C111632b bVar = (C111632b) obj;
                return C87412m.m108589b(this.f334197a, bVar.mo163308b()) && C87412m.m108589b(this.f334198b, bVar.mo163309c());
            }
        }

        public int hashCode() {
            S s = this.f334197a;
            int i = 0;
            int hashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.f334198b;
            if (s2 != null) {
                i = s2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: w.c1$d */
    public final class C111634d<T, V extends C37919o> implements C60667k2<T> {

        /* renamed from: d */
        public final C37906k1<T, V> f334199d;

        /* renamed from: e */
        public final C60690y0 f334200e;

        /* renamed from: f */
        public final C60690y0 f334201f;

        /* renamed from: g */
        public final C60690y0 f334202g;

        /* renamed from: h */
        public final C60690y0 f334203h = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);

        /* renamed from: i */
        public final C60690y0 f334204i = C108500f2.m146996c(0L, (C108497e2) null, 2, (Object) null);

        /* renamed from: j */
        public final C60690y0 f334205j = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);

        /* renamed from: n */
        public final C60690y0 f334206n;

        /* renamed from: o */
        public V f334207o;

        /* renamed from: p */
        public final C37892b0<T> f334208p;

        /* renamed from: q */
        public final /* synthetic */ C111629c1<S> f334209q;

        public C111634d(C111629c1 c1Var, T t, V v, C37906k1<T, V> k1Var, String str) {
            Object obj;
            C87412m.m108594g(v, "initialVelocityVector");
            C87412m.m108594g(k1Var, "typeConverter");
            C87412m.m108594g(str, "label");
            this.f334209q = c1Var;
            this.f334199d = k1Var;
            C60690y0 c = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
            this.f334200e = c;
            C60690y0 c2 = C108500f2.m146996c(C37903i.m41594b(0.0f, 0.0f, (Object) null, 7, (Object) null), (C108497e2) null, 2, (Object) null);
            this.f334201f = c2;
            this.f334202g = C108500f2.m146996c(new C37893b1((C37892b0) ((C108494d2) c2).getValue(), k1Var, t, ((C108494d2) c).getValue(), v), (C108497e2) null, 2, (Object) null);
            this.f334206n = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
            this.f334207o = v;
            Float f = (Float) C111679z1.f334306a.get(k1Var);
            if (f != null) {
                float floatValue = f.floatValue();
                C37919o oVar = (C37919o) k1Var.mo61399a().invoke(t);
                int b = oVar.mo61402b();
                for (int i = 0; i < b; i++) {
                    oVar.mo61405e(i, floatValue);
                }
                obj = this.f334199d.mo61400b().invoke(oVar);
            } else {
                obj = null;
            }
            this.f334208p = C37903i.m41594b(0.0f, 0.0f, obj, 3, (Object) null);
        }

        /* renamed from: f */
        public static void m152157f(C111634d dVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            Object obj3 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            ((C108494d2) dVar.f334202g).setValue(new C37893b1(z ? ((C37892b0) ((C108494d2) dVar.f334201f).getValue()) instanceof C37944w0 ? (C37892b0) ((C108494d2) dVar.f334201f).getValue() : dVar.f334208p : (C37892b0) ((C108494d2) dVar.f334201f).getValue(), dVar.f334199d, obj3, ((C108494d2) dVar.f334200e).getValue(), dVar.f334207o));
            C111629c1<S> c1Var = dVar.f334209q;
            ((C108494d2) c1Var.f334183g).setValue(Boolean.TRUE);
            if (c1Var.mo163301e()) {
                long j = 0;
                ListIterator<C111629c1<S>.d<?, ?>> listIterator = c1Var.f334184h.listIterator();
                while (true) {
                    C110839b0 b0Var = (C110839b0) listIterator;
                    if (b0Var.hasNext()) {
                        C111634d dVar2 = (C111634d) b0Var.next();
                        j = Math.max(j, dVar2.mo163312e().f100302h);
                        long j2 = c1Var.f334187k;
                        ((C108494d2) dVar2.f334206n).setValue(dVar2.mo163312e().mo61385e(j2));
                        dVar2.f334207o = dVar2.mo163312e().mo61387g(j2);
                    } else {
                        ((C108494d2) c1Var.f334183g).setValue(Boolean.FALSE);
                        return;
                    }
                }
            }
        }

        /* renamed from: e */
        public final C37893b1<T, V> mo163312e() {
            return (C37893b1) this.f334202g.getValue();
        }

        /* renamed from: g */
        public final void mo163313g(T t, T t2, C37892b0<T> b0Var) {
            C87412m.m108594g(b0Var, "animationSpec");
            ((C108494d2) this.f334200e).setValue(t2);
            ((C108494d2) this.f334201f).setValue(b0Var);
            if (!C87412m.m108589b(mo163312e().f100297c, t) || !C87412m.m108589b(mo163312e().f100298d, t2)) {
                m152157f(this, t, false, 2, (Object) null);
            }
        }

        public T getValue() {
            return this.f334206n.getValue();
        }

        /* renamed from: h */
        public final void mo163314h(T t, C37892b0<T> b0Var) {
            C87412m.m108594g(b0Var, "animationSpec");
            if (!C87412m.m108589b(((C108494d2) this.f334200e).getValue(), t) || ((Boolean) ((C108494d2) this.f334205j).getValue()).booleanValue()) {
                ((C108494d2) this.f334200e).setValue(t);
                ((C108494d2) this.f334201f).setValue(b0Var);
                m152157f(this, (Object) null, !((Boolean) ((C108494d2) this.f334203h).getValue()).booleanValue(), 1, (Object) null);
                C60690y0 y0Var = this.f334203h;
                Boolean bool = Boolean.FALSE;
                ((C108494d2) y0Var).setValue(bool);
                long longValue = ((Number) ((C108494d2) this.f334209q.f334181e).getValue()).longValue();
                ((C108494d2) this.f334204i).setValue(Long.valueOf(longValue));
                ((C108494d2) this.f334205j).setValue(bool);
            }
        }
    }

    /* renamed from: w.c1$g */
    public static final class C111635g extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C111629c1<S> f334210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111635g(C111629c1<S> c1Var) {
            super(0);
            this.f334210d = c1Var;
        }

        public Object invoke() {
            ListIterator<C111629c1<S>.d<?, ?>> listIterator = this.f334210d.f334184h.listIterator();
            long j = 0;
            while (true) {
                C110839b0 b0Var = (C110839b0) listIterator;
                if (!b0Var.hasNext()) {
                    break;
                }
                j = Math.max(j, ((C111634d) b0Var.next()).mo163312e().f100302h);
            }
            ListIterator<C111629c1<?>> listIterator2 = this.f334210d.f334185i.listIterator();
            while (true) {
                C110839b0 b0Var2 = (C110839b0) listIterator2;
                if (!b0Var2.hasNext()) {
                    return Long.valueOf(j);
                }
                j = Math.max(j, ((Number) ((C108491a0) ((C111629c1) b0Var2.next()).f334188l).getValue()).longValue());
            }
        }
    }

    public C111629c1(C111655m0<S> m0Var, String str) {
        C87412m.m108594g(m0Var, "transitionState");
        this.f334177a = m0Var;
        this.f334178b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (((java.lang.Boolean) ((p175j0.C108494d2) r6.f334183g).getValue()).booleanValue() == false) goto L_0x00a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163297a(S r7, p175j0.C108504h r8, int r9) {
        /*
            r6 = this;
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            j0.h r8 = r8.mo51623z(r0)
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0018
            boolean r0 = r8.mo51619x(r7)
            if (r0 == 0) goto L_0x0015
            r0 = 4
            goto L_0x0016
        L_0x0015:
            r0 = 2
        L_0x0016:
            r0 = r0 | r9
            goto L_0x0019
        L_0x0018:
            r0 = r9
        L_0x0019:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0029
            boolean r1 = r8.mo51619x(r6)
            if (r1 == 0) goto L_0x0026
            r1 = 32
            goto L_0x0028
        L_0x0026:
            r1 = 16
        L_0x0028:
            r0 = r0 | r1
        L_0x0029:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L_0x003a
            boolean r1 = r8.mo51575a()
            if (r1 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r8.mo51581d()
            goto L_0x00a4
        L_0x003a:
            boolean r1 = r6.mo163301e()
            if (r1 != 0) goto L_0x00a4
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r6.mo163304h(r7, r8, r1)
            java.lang.Object r1 = r6.mo163298b()
            boolean r1 = gy3.C87412m.m108589b(r7, r1)
            if (r1 == 0) goto L_0x007b
            j0.y0 r1 = r6.f334182f
            j0.d2 r1 = (p175j0.C108494d2) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            if (r1 != 0) goto L_0x007b
            j0.y0 r1 = r6.f334183g
            j0.d2 r1 = (p175j0.C108494d2) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a4
        L_0x007b:
            int r0 = r0 >> 3
            r0 = r0 & 14
            r1 = 1157296644(0x44faf204, float:2007.563)
            r8.mo51557H(r1)
            boolean r1 = r8.mo51619x(r6)
            java.lang.Object r2 = r8.mo51606q()
            if (r1 != 0) goto L_0x0093
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r1) goto L_0x009c
        L_0x0093:
            w.c1$e r2 = new w.c1$e
            r1 = 0
            r2.<init>(r6, r1)
            r8.mo51553F(r2)
        L_0x009c:
            r8.mo51565P()
            fy3.p r2 = (fy3.C32227p) r2
            p175j0.C60655g0.m70932c(r6, r2, r8, r0)
        L_0x00a4:
            j0.v1 r8 = r8.mo51596l()
            if (r8 != 0) goto L_0x00ab
            goto L_0x00b3
        L_0x00ab:
            w.c1$f r0 = new w.c1$f
            r0.<init>(r6, r7, r9)
            r8.mo51650a(r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C111629c1.mo163297a(java.lang.Object, j0.h, int):void");
    }

    /* renamed from: b */
    public final S mo163298b() {
        return ((C108494d2) this.f334177a.f334253a).getValue();
    }

    /* renamed from: c */
    public final C111632b<S> mo163299c() {
        return (C111632b) this.f334180d.getValue();
    }

    /* renamed from: d */
    public final S mo163300d() {
        return this.f334179c.getValue();
    }

    /* renamed from: e */
    public final boolean mo163301e() {
        return ((Boolean) this.f334186j.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final void mo163302f(long j, float f) {
        if (((Number) ((C108494d2) this.f334182f).getValue()).longValue() == Long.MIN_VALUE) {
            ((C108494d2) this.f334182f).setValue(Long.valueOf(j));
            ((C108494d2) this.f334177a.f334255c).setValue(Boolean.TRUE);
        }
        ((C108494d2) this.f334183g).setValue(Boolean.FALSE);
        ((C108494d2) this.f334181e).setValue(Long.valueOf(j - ((Number) ((C108494d2) this.f334182f).getValue()).longValue()));
        ListIterator<C111629c1<S>.d<?, ?>> listIterator = this.f334184h.listIterator();
        boolean z = true;
        while (true) {
            C110839b0 b0Var = (C110839b0) listIterator;
            if (!b0Var.hasNext()) {
                break;
            }
            C111634d dVar = (C111634d) b0Var.next();
            if (!((Boolean) ((C108494d2) dVar.f334203h).getValue()).booleanValue()) {
                long longValue = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? dVar.mo163312e().f100302h : (long) (((float) (((Number) ((C108494d2) this.f334181e).getValue()).longValue() - ((Number) ((C108494d2) dVar.f334204i).getValue()).longValue())) / f);
                ((C108494d2) dVar.f334206n).setValue(dVar.mo163312e().mo61385e(longValue));
                dVar.f334207o = dVar.mo163312e().mo61387g(longValue);
                C37893b1 e = dVar.mo163312e();
                e.getClass();
                if (C111636d.C37895a.m41575a(e, longValue)) {
                    ((C108494d2) dVar.f334203h).setValue(Boolean.TRUE);
                    ((C108494d2) dVar.f334204i).setValue(0L);
                }
            }
            if (!((Boolean) ((C108494d2) dVar.f334203h).getValue()).booleanValue()) {
                z = false;
            }
        }
        ListIterator<C111629c1<?>> listIterator2 = this.f334185i.listIterator();
        while (true) {
            C110839b0 b0Var2 = (C110839b0) listIterator2;
            if (!b0Var2.hasNext()) {
                break;
            }
            C111629c1 c1Var = (C111629c1) b0Var2.next();
            if (!C87412m.m108589b(c1Var.mo163300d(), c1Var.mo163298b())) {
                c1Var.mo163302f(((Number) ((C108494d2) this.f334181e).getValue()).longValue(), f);
            }
            if (!C87412m.m108589b(c1Var.mo163300d(), c1Var.mo163298b())) {
                z = false;
            }
        }
        if (z) {
            ((C108494d2) this.f334182f).setValue(Long.MIN_VALUE);
            ((C108494d2) this.f334177a.f334253a).setValue(mo163300d());
            ((C108494d2) this.f334181e).setValue(0L);
            ((C108494d2) this.f334177a.f334255c).setValue(Boolean.FALSE);
        }
    }

    /* renamed from: g */
    public final void mo163303g(S s, S s2, long j) {
        ((C108494d2) this.f334182f).setValue(Long.MIN_VALUE);
        ((C108494d2) this.f334177a.f334255c).setValue(Boolean.FALSE);
        if (!mo163301e() || !C87412m.m108589b(mo163298b(), s) || !C87412m.m108589b(mo163300d(), s2)) {
            ((C108494d2) this.f334177a.f334253a).setValue(s);
            ((C108494d2) this.f334179c).setValue(s2);
            ((C108494d2) this.f334186j).setValue(Boolean.TRUE);
            ((C108494d2) this.f334180d).setValue(new C111633c(s, s2));
        }
        ListIterator<C111629c1<?>> listIterator = this.f334185i.listIterator();
        while (true) {
            C110839b0 b0Var = (C110839b0) listIterator;
            if (!b0Var.hasNext()) {
                break;
            }
            C111629c1 c1Var = (C111629c1) b0Var.next();
            if (c1Var.mo163301e()) {
                c1Var.mo163303g(c1Var.mo163298b(), c1Var.mo163300d(), j);
            }
        }
        ListIterator<C111629c1<S>.d<?, ?>> listIterator2 = this.f334184h.listIterator();
        while (true) {
            C110839b0 b0Var2 = (C110839b0) listIterator2;
            if (b0Var2.hasNext()) {
                C111634d dVar = (C111634d) b0Var2.next();
                ((C108494d2) dVar.f334206n).setValue(dVar.mo163312e().mo61385e(j));
                dVar.f334207o = dVar.mo163312e().mo61387g(j);
            } else {
                this.f334187k = j;
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo163304h(S s, C108504h hVar, int i) {
        int i2;
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-583974681);
        if ((i & 14) == 0) {
            i2 = (z.mo51619x(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z.mo51619x(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && z.mo51575a()) {
            z.mo51581d();
        } else if (!mo163301e() && !C87412m.m108589b(mo163300d(), s)) {
            ((C108494d2) this.f334180d).setValue(new C111633c(mo163300d(), s));
            ((C108494d2) this.f334177a.f334253a).setValue(mo163300d());
            ((C108494d2) this.f334179c).setValue(s);
            if (!(((Number) ((C108494d2) this.f334182f).getValue()).longValue() != Long.MIN_VALUE)) {
                ((C108494d2) this.f334183g).setValue(Boolean.TRUE);
            }
            ListIterator<C111629c1<S>.d<?, ?>> listIterator = this.f334184h.listIterator();
            while (true) {
                C110839b0 b0Var = (C110839b0) listIterator;
                if (!b0Var.hasNext()) {
                    break;
                }
                ((C108494d2) ((C111634d) b0Var.next()).f334205j).setValue(Boolean.TRUE);
            }
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C65912h(this, s, i));
        }
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar2 = C24715p.f70494a;
    }
}
