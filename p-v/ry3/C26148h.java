package ry3;

import gy3.C87412m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import my3.C61594j;

/* renamed from: ry3.h */
public final class C26148h<M extends Member> implements C26121e<M> {

    /* renamed from: a */
    public final C26121e<M> f73068a;

    /* renamed from: b */
    public final boolean f73069b;

    /* renamed from: c */
    public final C26149a f73070c;

    /* renamed from: ry3.h$a */
    public static final class C26149a {

        /* renamed from: a */
        public final C61594j f73071a;

        /* renamed from: b */
        public final Method[] f73072b;

        /* renamed from: c */
        public final Method f73073c;

        public C26149a(C61594j jVar, Method[] methodArr, Method method) {
            C87412m.m108594g(jVar, "argumentRange");
            C87412m.m108594g(methodArr, "unbox");
            this.f73071a = jVar;
            this.f73072b = methodArr;
            this.f73073c = method;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        if ((r12 instanceof ry3.C26120d) != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26148h(wy3.C26436b r11, ry3.C26121e<? extends M> r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "caller"
            gy3.C87412m.m108594g(r12, r0)
            r10.<init>()
            r10.f73068a = r12
            r10.f73069b = r13
            n04.j0 r0 = r11.getReturnType()
            gy3.C87412m.m108591d(r0)
            java.lang.Class r0 = ry3.C26150i.m33569e(r0)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x005d
            java.lang.String r4 = "box-impl"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0039 }
            java.lang.reflect.Method r6 = ry3.C26150i.m33568d(r0, r11)     // Catch:{ NoSuchMethodException -> 0x0039 }
            java.lang.Class r6 = r6.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0039 }
            r5[r3] = r6     // Catch:{ NoSuchMethodException -> 0x0039 }
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0039 }
            java.lang.String r5 = "{\n        getDeclaredMet…riptor).returnType)\n    }"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0039 }
            goto L_0x005e
        L_0x0039:
            qy3.l0 r12 = new qy3.l0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "No box method found in inline class: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = " (calling "
            r13.append(r0)
            r13.append(r11)
            r11 = 41
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x005d:
            r4 = r1
        L_0x005e:
            boolean r0 = zz3.C26798j.m35238a(r11)
            if (r0 == 0) goto L_0x0071
            ry3.h$a r11 = new ry3.h$a
            my3.j r12 = my3.C61594j.f175177g
            my3.j r12 = my3.C61594j.f175177g
            java.lang.reflect.Method[] r13 = new java.lang.reflect.Method[r3]
            r11.<init>(r12, r13, r4)
            goto L_0x0177
        L_0x0071:
            boolean r0 = r12 instanceof ry3.C26123f.C26140g.C26143c
            java.lang.String r5 = "descriptor.containingDeclaration"
            r6 = -1
            if (r0 == 0) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            boolean r0 = r11 instanceof wy3.C26467j
            if (r0 == 0) goto L_0x0082
            boolean r12 = r12 instanceof ry3.C26120d
            if (r12 == 0) goto L_0x009c
            goto L_0x009d
        L_0x0082:
            wy3.u0 r0 = r11.mo52626H()
            if (r0 == 0) goto L_0x009c
            boolean r12 = r12 instanceof ry3.C26120d
            if (r12 != 0) goto L_0x009c
            wy3.k r12 = r11.mo51892b()
            gy3.C87412m.m108593f(r12, r5)
            boolean r12 = zz3.C26798j.m35239b(r12)
            if (r12 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r6 = 1
            goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            if (r13 == 0) goto L_0x00a1
            r12 = 2
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            boolean r13 = r11 instanceof wy3.C26516w
            if (r13 == 0) goto L_0x00b1
            r13 = r11
            wy3.w r13 = (wy3.C26516w) r13
            boolean r13 = r13.isSuspend()
            if (r13 == 0) goto L_0x00b1
            r13 = 1
            goto L_0x00b2
        L_0x00b1:
            r13 = 0
        L_0x00b2:
            int r12 = r12 + r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            wy3.u0 r0 = r11.mo52627I()
            if (r0 == 0) goto L_0x00c3
            n04.j0 r0 = r0.getType()
            goto L_0x00c4
        L_0x00c3:
            r0 = r1
        L_0x00c4:
            if (r0 == 0) goto L_0x00ca
            r13.add(r0)
            goto L_0x010d
        L_0x00ca:
            boolean r0 = r11 instanceof wy3.C26467j
            if (r0 == 0) goto L_0x00f3
            r0 = r11
            wy3.j r0 = (wy3.C26467j) r0
            wy3.e r0 = r0.mo53446j0()
            java.lang.String r5 = "descriptor.constructedClass"
            gy3.C87412m.m108593f(r0, r5)
            boolean r5 = r0.mo51795Y()
            if (r5 == 0) goto L_0x010d
            wy3.k r0 = r0.mo51892b()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            gy3.C87412m.m108592e(r0, r5)
            wy3.e r0 = (wy3.C26447e) r0
            n04.s0 r0 = r0.mo36111s()
            r13.add(r0)
            goto L_0x010d
        L_0x00f3:
            wy3.k r0 = r11.mo51892b()
            gy3.C87412m.m108593f(r0, r5)
            boolean r5 = r0 instanceof wy3.C26447e
            if (r5 == 0) goto L_0x010d
            boolean r5 = zz3.C26798j.m35239b(r0)
            if (r5 == 0) goto L_0x010d
            wy3.e r0 = (wy3.C26447e) r0
            n04.s0 r0 = r0.mo36111s()
            r13.add(r0)
        L_0x010d:
            java.util.List r0 = r11.mo52639h()
            java.lang.String r5 = "descriptor.valueParameters"
            gy3.C87412m.m108593f(r0, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x011a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r0.next()
            wy3.h1 r5 = (wy3.C26463h1) r5
            n04.j0 r5 = r5.getType()
            r13.add(r5)
            goto L_0x011a
        L_0x012e:
            int r0 = r13.size()
            int r0 = r0 + r6
            int r0 = r0 + r12
            int r12 = ry3.C26147g.m33562a(r10)
            if (r12 != r0) goto L_0x017a
            int r12 = java.lang.Math.max(r6, r3)
            int r5 = r13.size()
            int r5 = r5 + r6
            my3.j r12 = my3.C61595o.m72301i(r12, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r0]
            r7 = 0
        L_0x014a:
            if (r7 >= r0) goto L_0x0172
            int r8 = r12.f175174d
            int r9 = r12.f175175e
            if (r7 > r9) goto L_0x0156
            if (r8 > r7) goto L_0x0156
            r8 = 1
            goto L_0x0157
        L_0x0156:
            r8 = 0
        L_0x0157:
            if (r8 == 0) goto L_0x016c
            int r8 = r7 - r6
            java.lang.Object r8 = r13.get(r8)
            n04.j0 r8 = (n04.C25143j0) r8
            java.lang.Class r8 = ry3.C26150i.m33569e(r8)
            if (r8 == 0) goto L_0x016c
            java.lang.reflect.Method r8 = ry3.C26150i.m33568d(r8, r11)
            goto L_0x016d
        L_0x016c:
            r8 = r1
        L_0x016d:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x014a
        L_0x0172:
            ry3.h$a r11 = new ry3.h$a
            r11.<init>(r12, r5, r4)
        L_0x0177:
            r10.f73070c = r11
            return
        L_0x017a:
            qy3.l0 r12 = new qy3.l0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r13.append(r1)
            int r1 = ry3.C26147g.m33562a(r10)
            r13.append(r1)
            java.lang.String r1 = " != "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = "\nCalling: "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = "\nParameter types: "
            r13.append(r11)
            java.util.List r11 = r10.mo53054a()
            r13.append(r11)
            java.lang.String r11 = ")\nDefault: "
            r13.append(r11)
            boolean r11 = r10.f73069b
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26148h.<init>(wy3.b, ry3.e, boolean):void");
    }

    /* renamed from: a */
    public List<Type> mo53054a() {
        return this.f73068a.mo53054a();
    }

    /* renamed from: b */
    public M mo53055b() {
        return this.f73068a.mo53055b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            gy3.C87412m.m108594g(r10, r0)
            ry3.h$a r0 = r9.f73070c
            my3.j r1 = r0.f73071a
            java.lang.reflect.Method[] r2 = r0.f73072b
            java.lang.reflect.Method r0 = r0.f73073c
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "copyOf(this, size)"
            gy3.C87412m.m108593f(r3, r4)
            int r4 = r1.f175174d
            int r1 = r1.f175175e
            r5 = 0
            if (r4 > r1) goto L_0x0041
        L_0x001e:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x002d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
            goto L_0x003a
        L_0x002d:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r7 = "method.returnType"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.Object r7 = qy3.C25987u0.m33172c(r6)
        L_0x003a:
            r3[r4] = r7
            if (r4 == r1) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0041:
            ry3.e<M> r10 = r9.f73068a
            java.lang.Object r10 = r10.call(r3)
            if (r0 == 0) goto L_0x0057
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r10 = r0
        L_0x0057:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26148h.call(java.lang.Object[]):java.lang.Object");
    }

    public Type getReturnType() {
        return this.f73068a.getReturnType();
    }
}
