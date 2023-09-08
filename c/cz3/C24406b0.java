package cz3;

import cz3.C24413d0;
import cz3.C24421h;
import gy3.C87412m;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25055g;
import mz3.C25064p;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26409h;
import wy3.C26481l1;

/* renamed from: cz3.b0 */
public abstract class C24406b0 extends C24439x implements C24421h, C24413d0, C25064p {
    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: F */
    public C25055g mo51019F() {
        Class<?> declaringClass = mo51021P().getDeclaringClass();
        C87412m.m108593f(declaringClass, "member.declaringClass");
        return new C24435t(declaringClass);
    }

    /* renamed from: O */
    public boolean mo51020O() {
        return Modifier.isStatic(mo51032o());
    }

    /* renamed from: P */
    public abstract Member mo51021P();

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<mz3.C25074z> mo51022Q(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "parameterTypes"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "parameterAnnotations"
            gy3.C87412m.m108594g(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            cz3.c r1 = cz3.C24407c.f69852a
            java.lang.reflect.Member r2 = r12.mo51021P()
            java.lang.String r3 = "member"
            gy3.C87412m.m108594g(r2, r3)
            cz3.c$a r3 = cz3.C24407c.f69853b
            if (r3 != 0) goto L_0x002f
            monitor-enter(r1)
            cz3.c$a r3 = cz3.C24407c.f69853b     // Catch:{ all -> 0x002c }
            if (r3 != 0) goto L_0x002a
            cz3.c$a r3 = r1.mo51034a(r2)     // Catch:{ all -> 0x002c }
            cz3.C24407c.f69853b = r3     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r1)
            goto L_0x002f
        L_0x002c:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        L_0x002f:
            java.lang.reflect.Method r1 = r3.f69854a
            r4 = 0
            r5 = 0
            if (r1 != 0) goto L_0x0037
        L_0x0035:
            r2 = r4
            goto L_0x0068
        L_0x0037:
            java.lang.reflect.Method r3 = r3.f69855b
            if (r3 != 0) goto L_0x003c
            goto L_0x0035
        L_0x003c:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.invoke(r2, r6)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<*>"
            gy3.C87412m.m108592e(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.length
            r2.<init>(r6)
            int r6 = r1.length
            r7 = 0
        L_0x0051:
            if (r7 >= r6) goto L_0x0068
            r8 = r1[r7]
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r3.invoke(r8, r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            r2.add(r8)
            int r7 = r7 + 1
            goto L_0x0051
        L_0x0068:
            if (r2 == 0) goto L_0x0071
            int r1 = r2.size()
            int r3 = r13.length
            int r1 = r1 - r3
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            int r3 = r13.length
            r6 = 0
        L_0x0074:
            if (r6 >= r3) goto L_0x011d
            r7 = r13[r6]
            java.lang.String r8 = "type"
            gy3.C87412m.m108594g(r7, r8)
            boolean r8 = r7 instanceof java.lang.Class
            if (r8 == 0) goto L_0x0090
            r9 = r7
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r10 = r9.isPrimitive()
            if (r10 == 0) goto L_0x0090
            cz3.f0 r7 = new cz3.f0
            r7.<init>(r9)
            goto L_0x00b8
        L_0x0090:
            boolean r9 = r7 instanceof java.lang.reflect.GenericArrayType
            if (r9 != 0) goto L_0x00b2
            if (r8 == 0) goto L_0x00a0
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            boolean r8 = r8.isArray()
            if (r8 == 0) goto L_0x00a0
            goto L_0x00b2
        L_0x00a0:
            boolean r8 = r7 instanceof java.lang.reflect.WildcardType
            if (r8 == 0) goto L_0x00ac
            cz3.k0 r8 = new cz3.k0
            java.lang.reflect.WildcardType r7 = (java.lang.reflect.WildcardType) r7
            r8.<init>(r7)
            goto L_0x00b7
        L_0x00ac:
            cz3.v r8 = new cz3.v
            r8.<init>(r7)
            goto L_0x00b7
        L_0x00b2:
            cz3.k r8 = new cz3.k
            r8.<init>(r7)
        L_0x00b7:
            r7 = r8
        L_0x00b8:
            if (r2 == 0) goto L_0x0104
            int r8 = r6 + r1
            java.lang.Object r8 = sx3.C110818d0.m150917O(r2, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00c5
            goto L_0x0105
        L_0x00c5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "No parameter with index "
            r14.append(r15)
            r14.append(r6)
            r15 = 43
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = " (name="
            r14.append(r15)
            vz3.f r15 = r12.getName()
            r14.append(r15)
            java.lang.String r15 = " type="
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = ") in "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0104:
            r8 = r4
        L_0x0105:
            if (r15 == 0) goto L_0x010e
            int r9 = r13.length
            int r9 = r9 + -1
            if (r6 != r9) goto L_0x010e
            r9 = 1
            goto L_0x010f
        L_0x010e:
            r9 = 0
        L_0x010f:
            cz3.j0 r10 = new cz3.j0
            r11 = r14[r6]
            r10.<init>(r7, r11, r8, r9)
            r0.add(r10)
            int r6 = r6 + 1
            goto L_0x0074
        L_0x011d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24406b0.mo51022Q(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        return C24421h.C24422a.m30477a(this, cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24406b0) && C87412m.m108589b(mo51021P(), ((C24406b0) obj).mo51021P());
    }

    public Collection getAnnotations() {
        return C24421h.C24422a.m30478b(this);
    }

    public C22830f getName() {
        String name = mo51021P().getName();
        C22830f f = name != null ? C22830f.m26794f(name) : null;
        return f == null ? C26409h.f73647a : f;
    }

    public C26481l1 getVisibility() {
        return C24413d0.C24414a.m30461a(this);
    }

    public int hashCode() {
        return mo51021P().hashCode();
    }

    /* renamed from: i */
    public AnnotatedElement mo51029i() {
        Member P = mo51021P();
        C87412m.m108592e(P, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) P;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(mo51032o());
    }

    public boolean isFinal() {
        return Modifier.isFinal(mo51032o());
    }

    /* renamed from: o */
    public int mo51032o() {
        return mo51021P().getModifiers();
    }

    public String toString() {
        return getClass().getName() + ": " + mo51021P();
    }
}
