package qy3;

import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C24557d;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C24576z;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import ny3.C25234c;
import ny3.C25237g;
import ny3.C89104m;
import qy3.C22161d;
import qy3.C25968n0;
import rx3.C13598b0;
import ry3.C26121e;
import sx3.C110818d0;
import tz3.C26349a;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26490q0;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26506s0;
import wy3.C26507t0;
import xy3.C26571h;
import z04.C66716g;
import z04.C66717h;
import zz3.C26792g;

/* renamed from: qy3.e0 */
public abstract class C25919e0<V> extends C25914e<V> implements C89104m<V> {

    /* renamed from: q */
    public static final Object f72265q = new Object();

    /* renamed from: h */
    public final C22167o f72266h;

    /* renamed from: i */
    public final String f72267i;

    /* renamed from: j */
    public final String f72268j;

    /* renamed from: n */
    public final Object f72269n;

    /* renamed from: o */
    public final C25968n0.C25970b<Field> f72270o;

    /* renamed from: p */
    public final C25968n0.C25969a<C26504r0> f72271p;

    /* renamed from: qy3.e0$d */
    public static final class C22166d extends C87413o implements C32224a<C26504r0> {

        /* renamed from: d */
        public final /* synthetic */ C25919e0<V> f62691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22166d(C25919e0<? extends V> e0Var) {
            super(0);
            this.f62691d = e0Var;
        }

        public Object invoke() {
            String str;
            C25919e0<V> e0Var = this.f62691d;
            C22167o oVar = e0Var.f72266h;
            String str2 = e0Var.f72267i;
            String str3 = e0Var.f72268j;
            oVar.getClass();
            C87412m.m108594g(str2, "name");
            C87412m.m108594g(str3, "signature");
            C66716g c = C22167o.f62692d.mo90758c(str3);
            boolean z = true;
            if (c != null) {
                String str4 = ((C66717h) c).mo90752b().get(1);
                C26504r0 p = oVar.mo35263p(Integer.parseInt(str4));
                if (p != null) {
                    return p;
                }
                throw new C118215l0("Local property #" + str4 + " not found in " + oVar.mo32564c());
            }
            Collection<C26504r0> s = oVar.mo35264s(C22830f.m26794f(str2));
            ArrayList arrayList = new ArrayList();
            for (T next : s) {
                if (C87412m.m108589b(C25977r0.f72357a.mo52842b((C26504r0) next).mo35267a(), str3)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                throw new C118215l0("Property '" + str2 + "' (JVM signature: " + str3 + ") not resolved in " + oVar);
            } else if (arrayList.size() == 1) {
                return (C26504r0) C110818d0.m150938j0(arrayList);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C26505s visibility = ((C26504r0) next2).getVisibility();
                    Object obj = linkedHashMap.get(visibility);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(visibility, obj);
                    }
                    ((List) obj).add(next2);
                }
                TreeMap treeMap = new TreeMap(C22174r.f62701d);
                treeMap.putAll(linkedHashMap);
                Collection values = treeMap.values();
                C87412m.m108593f(values, "properties\n             …\n                }.values");
                List list = (List) C110818d0.m150922T(values);
                if (list.size() == 1) {
                    return (C26504r0) C110818d0.m150914L(list);
                }
                String S = C110818d0.m150921S(oVar.mo35264s(C22830f.m26794f(str2)), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C22173q.f62700d, 30, (Object) null);
                StringBuilder sb = new StringBuilder();
                sb.append("Property '");
                sb.append(str2);
                sb.append("' (JVM signature: ");
                sb.append(str3);
                sb.append(") not resolved in ");
                sb.append(oVar);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                if (S.length() != 0) {
                    z = false;
                }
                if (z) {
                    str = " no members found";
                } else {
                    str = 10 + S;
                }
                sb.append(str);
                throw new C118215l0(sb.toString());
            }
        }
    }

    /* renamed from: qy3.e0$a */
    public static abstract class C25920a<PropertyType, ReturnType> extends C25914e<ReturnType> implements C25237g<ReturnType> {
        public boolean isExternal() {
            return mo52813q().isExternal();
        }

        public boolean isInfix() {
            return mo52813q().isInfix();
        }

        public boolean isInline() {
            return mo52813q().isInline();
        }

        public boolean isOperator() {
            return mo52813q().isOperator();
        }

        public boolean isSuspend() {
            return mo52813q().isSuspend();
        }

        /* renamed from: l */
        public C22167o mo52803l() {
            return mo52800r().f72266h;
        }

        /* renamed from: m */
        public C26121e<?> mo52804m() {
            return null;
        }

        /* renamed from: p */
        public boolean mo52807p() {
            return mo52800r().mo52807p();
        }

        /* renamed from: q */
        public abstract C26490q0 mo52813q();

        /* renamed from: r */
        public abstract C25919e0<PropertyType> mo52800r();
    }

    /* renamed from: qy3.e0$b */
    public static abstract class C25921b<V> extends C25920a<V, V> {

        /* renamed from: j */
        public static final /* synthetic */ C89104m<Object>[] f72272j;

        /* renamed from: h */
        public final C25968n0.C25969a f72273h = C25968n0.m33137c(new C25923b(this));

        /* renamed from: i */
        public final C25968n0.C25970b f72274i = C25968n0.m33136b(new C25922a(this));

        /* renamed from: qy3.e0$b$a */
        public static final class C25922a extends C87413o implements C32224a<C26121e<?>> {

            /* renamed from: d */
            public final /* synthetic */ C25921b<V> f72275d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25922a(C25921b<? extends V> bVar) {
                super(0);
                this.f72275d = bVar;
            }

            public Object invoke() {
                return C25929f0.m33113a(this.f72275d, true);
            }
        }

        /* renamed from: qy3.e0$b$b */
        public static final class C25923b extends C87413o implements C32224a<C26506s0> {

            /* renamed from: d */
            public final /* synthetic */ C25921b<V> f72276d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25923b(C25921b<? extends V> bVar) {
                super(0);
                this.f72276d = bVar;
            }

            public Object invoke() {
                C26506s0 g = this.f72276d.mo52800r().mo52805n().mo52635g();
                if (g != null) {
                    return g;
                }
                C26504r0 r = this.f72276d.mo52800r().mo52805n();
                int i = C26571h.f73936P0;
                return C26792g.m35204c(r, C26571h.C26572a.f73937a);
            }
        }

        static {
            Class<C25921b> cls = C25921b.class;
            f72272j = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public boolean equals(Object obj) {
            return (obj instanceof C25921b) && C87412m.m108589b(mo52800r(), ((C25921b) obj).mo52800r());
        }

        public String getName() {
            return "<get-" + mo52800r().f72267i + '>';
        }

        public int hashCode() {
            return mo52800r().hashCode();
        }

        /* renamed from: k */
        public C26121e<?> mo52802k() {
            C25968n0.C25970b bVar = this.f72274i;
            C89104m<Object> mVar = f72272j[1];
            Object invoke = bVar.invoke();
            C87412m.m108593f(invoke, "<get-caller>(...)");
            return (C26121e) invoke;
        }

        /* renamed from: n */
        public C26436b mo52805n() {
            C25968n0.C25969a aVar = this.f72273h;
            C89104m<Object> mVar = f72272j[0];
            Object invoke = aVar.invoke();
            C87412m.m108593f(invoke, "<get-descriptor>(...)");
            return (C26506s0) invoke;
        }

        /* renamed from: q */
        public C26490q0 mo52813q() {
            C25968n0.C25969a aVar = this.f72273h;
            C89104m<Object> mVar = f72272j[0];
            Object invoke = aVar.invoke();
            C87412m.m108593f(invoke, "<get-descriptor>(...)");
            return (C26506s0) invoke;
        }

        public String toString() {
            return "getter of " + mo52800r();
        }
    }

    /* renamed from: qy3.e0$c */
    public static abstract class C25924c<V> extends C25920a<V, C13598b0> {

        /* renamed from: j */
        public static final /* synthetic */ C89104m<Object>[] f72277j;

        /* renamed from: h */
        public final C25968n0.C25969a f72278h = C25968n0.m33137c(new C25926b(this));

        /* renamed from: i */
        public final C25968n0.C25970b f72279i = C25968n0.m33136b(new C25925a(this));

        /* renamed from: qy3.e0$c$a */
        public static final class C25925a extends C87413o implements C32224a<C26121e<?>> {

            /* renamed from: d */
            public final /* synthetic */ C25924c<V> f72280d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25925a(C25924c<V> cVar) {
                super(0);
                this.f72280d = cVar;
            }

            public Object invoke() {
                return C25929f0.m33113a(this.f72280d, false);
            }
        }

        /* renamed from: qy3.e0$c$b */
        public static final class C25926b extends C87413o implements C32224a<C26507t0> {

            /* renamed from: d */
            public final /* synthetic */ C25924c<V> f72281d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25926b(C25924c<V> cVar) {
                super(0);
                this.f72281d = cVar;
            }

            public Object invoke() {
                C26507t0 i = this.f72281d.mo52800r().mo52805n().mo52640i();
                if (i != null) {
                    return i;
                }
                C26504r0 r = this.f72281d.mo52800r().mo52805n();
                int i2 = C26571h.f73936P0;
                C26571h hVar = C26571h.C26572a.f73937a;
                return C26792g.m35205d(r, hVar, hVar);
            }
        }

        static {
            Class<C25924c> cls = C25924c.class;
            f72277j = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public boolean equals(Object obj) {
            return (obj instanceof C25924c) && C87412m.m108589b(mo52800r(), ((C25924c) obj).mo52800r());
        }

        public String getName() {
            return "<set-" + mo52800r().f72267i + '>';
        }

        public int hashCode() {
            return mo52800r().hashCode();
        }

        /* renamed from: k */
        public C26121e<?> mo52802k() {
            C25968n0.C25970b bVar = this.f72279i;
            C89104m<Object> mVar = f72277j[1];
            Object invoke = bVar.invoke();
            C87412m.m108593f(invoke, "<get-caller>(...)");
            return (C26121e) invoke;
        }

        /* renamed from: n */
        public C26436b mo52805n() {
            C25968n0.C25969a aVar = this.f72278h;
            C89104m<Object> mVar = f72277j[0];
            Object invoke = aVar.invoke();
            C87412m.m108593f(invoke, "<get-descriptor>(...)");
            return (C26507t0) invoke;
        }

        /* renamed from: q */
        public C26490q0 mo52813q() {
            C25968n0.C25969a aVar = this.f72278h;
            C89104m<Object> mVar = f72277j[0];
            Object invoke = aVar.invoke();
            C87412m.m108593f(invoke, "<get-descriptor>(...)");
            return (C26507t0) invoke;
        }

        public String toString() {
            return "setter of " + mo52800r();
        }
    }

    /* renamed from: qy3.e0$e */
    public static final class C25927e extends C87413o implements C32224a<Field> {

        /* renamed from: d */
        public final /* synthetic */ C25919e0<V> f72282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25927e(C25919e0<? extends V> e0Var) {
            super(0);
            this.f72282d = e0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
            if (((r6 == null || !r6.getAnnotations().mo51479q(fz3.C20742e0.f58630a)) ? r1.getAnnotations().mo51479q(fz3.C20742e0.f58630a) : true) != false) goto L_0x0094;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1 A[SYNTHETIC, Splitter:B:43:0x00c1] */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r10 = this;
                qy3.r0 r0 = qy3.C25977r0.f72357a
                qy3.e0<V> r1 = r10.f72282d
                wy3.r0 r1 = r1.mo52805n()
                qy3.d r0 = r0.mo52842b(r1)
                boolean r1 = r0 instanceof qy3.C22161d.C22165c
                r2 = 0
                if (r1 == 0) goto L_0x00d0
                qy3.d$c r0 = (qy3.C22161d.C22165c) r0
                wy3.r0 r1 = r0.f62685a
                uz3.h r3 = uz3.C26380h.f73581a
                qz3.n r4 = r0.f62686b
                sz3.c r5 = r0.f62688d
                sz3.g r6 = r0.f62689e
                r7 = 1
                uz3.d$a r3 = r3.mo53364b(r4, r5, r6, r7)
                if (r3 == 0) goto L_0x00e2
                qy3.e0<V> r4 = r10.f72282d
                r5 = 0
                if (r1 == 0) goto L_0x00cc
                wy3.b$a r6 = r1.mo52634f()
                wy3.b$a r8 = wy3.C26436b.C26437a.FAKE_OVERRIDE
                if (r6 != r8) goto L_0x0032
                goto L_0x0093
            L_0x0032:
                wy3.k r6 = r1.mo51892b()
                if (r6 == 0) goto L_0x00c8
                boolean r8 = zz3.C26794h.m35225m(r6)
                if (r8 == 0) goto L_0x0064
                wy3.k r8 = r6.mo51892b()
                wy3.f r9 = wy3.C26453f.CLASS
                boolean r9 = zz3.C26794h.m35227o(r8, r9)
                if (r9 != 0) goto L_0x0055
                wy3.f r9 = wy3.C26453f.ENUM_CLASS
                boolean r8 = zz3.C26794h.m35227o(r8, r9)
                if (r8 == 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r8 = 0
                goto L_0x0056
            L_0x0055:
                r8 = 1
            L_0x0056:
                if (r8 == 0) goto L_0x0064
                wy3.e r6 = (wy3.C26447e) r6
                ty3.c r8 = ty3.C22554c.f64865a
                boolean r6 = ty3.C26332d.m33814a(r8, r6)
                if (r6 != 0) goto L_0x0064
                r6 = 1
                goto L_0x0065
            L_0x0064:
                r6 = 0
            L_0x0065:
                if (r6 == 0) goto L_0x0068
                goto L_0x0094
            L_0x0068:
                wy3.k r6 = r1.mo51892b()
                boolean r6 = zz3.C26794h.m35225m(r6)
                if (r6 == 0) goto L_0x0093
                wy3.u r6 = r1.mo52641l0()
                if (r6 == 0) goto L_0x0086
                xy3.h r6 = r6.getAnnotations()
                vz3.c r8 = fz3.C20742e0.f58630a
                boolean r6 = r6.mo51479q(r8)
                if (r6 == 0) goto L_0x0086
                r6 = 1
                goto L_0x0090
            L_0x0086:
                xy3.h r6 = r1.getAnnotations()
                vz3.c r8 = fz3.C20742e0.f58630a
                boolean r6 = r6.mo51479q(r8)
            L_0x0090:
                if (r6 == 0) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r7 = 0
            L_0x0094:
                if (r7 != 0) goto L_0x00b5
                qz3.n r0 = r0.f62686b
                boolean r0 = uz3.C26380h.m33951d(r0)
                if (r0 == 0) goto L_0x009f
                goto L_0x00b5
            L_0x009f:
                wy3.k r0 = r1.mo51892b()
                boolean r1 = r0 instanceof wy3.C26447e
                if (r1 == 0) goto L_0x00ae
                wy3.e r0 = (wy3.C26447e) r0
                java.lang.Class r0 = qy3.C25987u0.m33177h(r0)
                goto L_0x00bf
            L_0x00ae:
                qy3.o r0 = r4.f72266h
                java.lang.Class r0 = r0.mo32564c()
                goto L_0x00bf
            L_0x00b5:
                qy3.o r0 = r4.f72266h
                java.lang.Class r0 = r0.mo32564c()
                java.lang.Class r0 = r0.getEnclosingClass()
            L_0x00bf:
                if (r0 == 0) goto L_0x00e2
                java.lang.String r1 = r3.f65290a     // Catch:{ NoSuchFieldException -> 0x00e2 }
                java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00e2 }
                goto L_0x00e2
            L_0x00c8:
                fz3.C116909o.m164919a(r7)
                throw r2
            L_0x00cc:
                fz3.C116909o.m164919a(r5)
                throw r2
            L_0x00d0:
                boolean r1 = r0 instanceof qy3.C22161d.C22162a
                if (r1 == 0) goto L_0x00d9
                qy3.d$a r0 = (qy3.C22161d.C22162a) r0
                java.lang.reflect.Field r2 = r0.f62680a
                goto L_0x00e2
            L_0x00d9:
                boolean r1 = r0 instanceof qy3.C22161d.C22163b
                if (r1 == 0) goto L_0x00de
                goto L_0x00e2
            L_0x00de:
                boolean r0 = r0 instanceof qy3.C22161d.C22164d
                if (r0 == 0) goto L_0x00e3
            L_0x00e2:
                return r2
            L_0x00e3:
                rx3.j r0 = new rx3.j
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qy3.C25919e0.C25927e.invoke():java.lang.Object");
        }
    }

    public C25919e0(C22167o oVar, String str, String str2, C26504r0 r0Var, Object obj) {
        this.f72266h = oVar;
        this.f72267i = str;
        this.f72268j = str2;
        this.f72269n = obj;
        this.f72270o = C25968n0.m33136b(new C25927e(this));
        this.f72271p = new C25968n0.C25969a<>(r0Var, new C22166d(this));
    }

    public boolean equals(Object obj) {
        C22826c cVar = C25987u0.f72374a;
        C25919e0 e0Var = null;
        C25919e0 e0Var2 = obj instanceof C25919e0 ? (C25919e0) obj : null;
        if (e0Var2 == null) {
            C24576z zVar = obj instanceof C24576z ? (C24576z) obj : null;
            C25234c compute = zVar != null ? zVar.compute() : null;
            if (compute instanceof C25919e0) {
                e0Var = (C25919e0) compute;
            }
        } else {
            e0Var = e0Var2;
        }
        return e0Var != null && C87412m.m108589b(this.f72266h, e0Var.f72266h) && C87412m.m108589b(this.f72267i, e0Var.f72267i) && C87412m.m108589b(this.f72268j, e0Var.f72268j) && C87412m.m108589b(this.f72269n, e0Var.f72269n);
    }

    public String getName() {
        return this.f72267i;
    }

    public int hashCode() {
        return (((this.f72266h.hashCode() * 31) + this.f72267i.hashCode()) * 31) + this.f72268j.hashCode();
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: k */
    public C26121e<?> mo52802k() {
        return mo52799s().mo52802k();
    }

    /* renamed from: l */
    public C22167o mo52803l() {
        return this.f72266h;
    }

    /* renamed from: m */
    public C26121e<?> mo52804m() {
        mo52799s().getClass();
        return null;
    }

    /* renamed from: p */
    public boolean mo52807p() {
        return !C87412m.m108589b(this.f72269n, C24557d.NO_RECEIVER);
    }

    /* renamed from: q */
    public final Member mo52810q() {
        if (!mo52805n().mo52642q0()) {
            return null;
        }
        C22161d b = C25977r0.f72357a.mo52842b(mo52805n());
        if (b instanceof C22161d.C22165c) {
            C22161d.C22165c cVar = (C22161d.C22165c) b;
            C26349a.C26357d dVar = cVar.f62687c;
            boolean z = true;
            if ((dVar.f73492e & 16) == 16) {
                C26349a.C26354c cVar2 = dVar.f73497j;
                int i = cVar2.f73481e;
                if ((i & 1) == 1) {
                    if ((i & 2) != 2) {
                        z = false;
                    }
                    if (z) {
                        return this.f72266h.mo35269l(cVar.f62688d.getString(cVar2.f73482f), cVar.f62688d.getString(cVar2.f73483g));
                    }
                }
                return null;
            }
        }
        return this.f72270o.invoke();
    }

    /* renamed from: r */
    public C26504r0 mo52805n() {
        C26504r0 invoke = this.f72271p.invoke();
        C87412m.m108593f(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: s */
    public abstract C25921b<V> mo52799s();

    public String toString() {
        return C25974p0.f72353a.mo52839c(mo52805n());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25919e0(C22167o oVar, String str, String str2, Object obj) {
        this(oVar, str, str2, (C26504r0) null, obj);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25919e0(qy3.C22167o r8, wy3.C26504r0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r9, r0)
            vz3.f r0 = r9.getName()
            java.lang.String r3 = r0.mo35995b()
            java.lang.String r0 = "descriptor.name.asString()"
            gy3.C87412m.m108593f(r3, r0)
            qy3.r0 r0 = qy3.C25977r0.f72357a
            qy3.d r0 = r0.mo52842b(r9)
            java.lang.String r4 = r0.mo35267a()
            java.lang.Object r6 = gy3.C24557d.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25919e0.<init>(qy3.o, wy3.r0):void");
    }
}
