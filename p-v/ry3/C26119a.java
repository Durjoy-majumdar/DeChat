package ry3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import cz3.C24410d;
import gy3.C87412m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ny3.C25235d;
import sx3.C36907w;

/* renamed from: ry3.a */
public final class C26119a implements C26121e {

    /* renamed from: a */
    public final Class<?> f73049a;

    /* renamed from: b */
    public final List<String> f73050b;

    /* renamed from: c */
    public final C22278a f73051c;

    /* renamed from: d */
    public final List<Method> f73052d;

    /* renamed from: e */
    public final List<Type> f73053e;

    /* renamed from: f */
    public final List<Class<?>> f73054f;

    /* renamed from: g */
    public final List<Object> f73055g;

    /* renamed from: ry3.a$a */
    public enum C22278a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* renamed from: ry3.a$b */
    public enum C22279b {
        JAVA,
        KOTLIN
    }

    public C26119a(Class<?> cls, List<String> list, C22278a aVar, C22279b bVar, List<Method> list2) {
        C87412m.m108594g(cls, "jClass");
        C87412m.m108594g(list, "parameterNames");
        C87412m.m108594g(aVar, "callMode");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(list2, "methods");
        this.f73049a = cls;
        this.f73050b = list;
        this.f73051c = aVar;
        this.f73052d = list2;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f73053e = arrayList;
        List<Method> list3 = this.f73052d;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            C87412m.m108593f(returnType2, LocaleUtil.ITALIAN);
            List<C25235d<? extends Object>> list4 = C24410d.f69857a;
            Class<?> cls2 = C24410d.f69859c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList2.add(returnType2);
        }
        this.f73054f = arrayList2;
        List<Method> list5 = this.f73052d;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list5, 10));
        for (Method defaultValue : list5) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f73055g = arrayList3;
        if (this.f73051c == C22278a.POSITIONAL_CALL && bVar == C22279b.JAVA) {
            List<String> list6 = this.f73050b;
            C87412m.m108594g(list6, "<this>");
            ArrayList arrayList4 = new ArrayList(C36907w.m41090l(list6, 10));
            Iterator<T> it = list6.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!z && C87412m.m108589b(next, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* renamed from: a */
    public List<Type> mo53054a() {
        return this.f73053e;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo53055b() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r7.isInstance(r5) != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "args"
            gy3.C87412m.m108594g(r14, r0)
            ry3.C26121e.C26122a.m33553a(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            int r1 = r14.length
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r3 >= r1) goto L_0x0140
            r5 = r14[r3]
            int r6 = r4 + 1
            if (r5 != 0) goto L_0x0029
            ry3.a$a r7 = r13.f73051c
            ry3.a$a r8 = ry3.C26119a.C22278a.CALL_BY_NAME
            if (r7 != r8) goto L_0x0029
            java.util.List<java.lang.Object> r5 = r13.f73055g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r4)
            goto L_0x0086
        L_0x0029:
            java.util.List<java.lang.Class<?>> r7 = r13.f73054f
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r8 = r5 instanceof java.lang.Class
            r9 = 0
            if (r8 == 0) goto L_0x0039
            goto L_0x0085
        L_0x0039:
            boolean r8 = r5 instanceof ny3.C25235d
            if (r8 == 0) goto L_0x0044
            ny3.d r5 = (ny3.C25235d) r5
            java.lang.Class r5 = ey3.C116796a.m164750b(r5)
            goto L_0x007e
        L_0x0044:
            boolean r8 = r5 instanceof java.lang.Object[]
            if (r8 == 0) goto L_0x007e
            r8 = r5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            boolean r10 = r8 instanceof java.lang.Class[]
            if (r10 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            boolean r10 = r8 instanceof ny3.C25235d[]
            if (r10 == 0) goto L_0x007d
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            gy3.C87412m.m108592e(r5, r8)
            ny3.d[] r5 = (ny3.C25235d[]) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r5.length
            r8.<init>(r10)
            int r10 = r5.length
            r11 = 0
        L_0x0063:
            if (r11 >= r10) goto L_0x0071
            r12 = r5[r11]
            java.lang.Class r12 = ey3.C116796a.m164750b(r12)
            r8.add(r12)
            int r11 = r11 + 1
            goto L_0x0063
        L_0x0071:
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r5, r8)
            goto L_0x007e
        L_0x007d:
            r5 = r8
        L_0x007e:
            boolean r7 = r7.isInstance(r5)
            if (r7 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r5 = r9
        L_0x0086:
            if (r5 != 0) goto L_0x0138
            java.util.List<java.lang.String> r14 = r13.f73050b
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.util.List<java.lang.Class<?>> r0 = r13.f73054f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r1 = gy3.C87412m.m108589b(r0, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.Class<ny3.d> r0 = ny3.C25235d.class
            ny3.d r0 = gy3.C24560g0.m30725a(r0)
            goto L_0x00c6
        L_0x00a9:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00c2
            java.lang.Class r1 = r0.getComponentType()
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x00c2
            java.lang.Class<ny3.d[]> r0 = ny3.C25235d[].class
            ny3.d r0 = gy3.C24560g0.m30725a(r0)
            goto L_0x00c6
        L_0x00c2:
            ny3.d r0 = gy3.C24560g0.m30725a(r0)
        L_0x00c6:
            java.lang.String r1 = r0.mo51262e()
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            ny3.d r2 = gy3.C24560g0.m30725a(r2)
            java.lang.String r2 = r2.mo51262e()
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x010d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.mo51262e()
            r1.append(r2)
            r2 = 60
            r1.append(r2)
            java.lang.Class r0 = ey3.C116796a.m164750b(r0)
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r2 = "kotlinClass.java.componentType"
            gy3.C87412m.m108593f(r0, r2)
            ny3.d r0 = gy3.C24560g0.m30725a(r0)
            java.lang.String r0 = r0.mo51262e()
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0111
        L_0x010d:
            java.lang.String r0 = r0.mo51262e()
        L_0x0111:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = " is not of the required type "
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x0138:
            r0.add(r5)
            int r3 = r3 + 1
            r4 = r6
            goto L_0x0012
        L_0x0140:
            java.lang.Class<?> r14 = r13.f73049a
            java.util.List<java.lang.String> r1 = r13.f73050b
            java.util.List r0 = sx3.C110818d0.m150908F0(r1, r0)
            java.util.Map r0 = sx3.C90364q0.m113152k(r0)
            java.util.List<java.lang.reflect.Method> r1 = r13.f73052d
            java.lang.Object r14 = ry3.C110665b.m150644a(r14, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26119a.call(java.lang.Object[]):java.lang.Object");
    }

    public Type getReturnType() {
        return this.f73049a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26119a(java.lang.Class r7, java.util.List r8, ry3.C26119a.C22278a r9, ry3.C26119a.C22279b r10, java.util.List r11, int r12, gy3.C8480h r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = sx3.C36907w.m41090l(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x002a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L_0x0013
        L_0x002a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26119a.<init>(java.lang.Class, java.util.List, ry3.a$a, ry3.a$b, java.util.List, int, gy3.h):void");
    }
}
