package qy3;

import gy3.C87412m;
import n04.C25187v1;
import qy3.C25919e0;
import ry3.C26150i;

/* renamed from: qy3.f0 */
public final class C25929f0 {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ry3.C26121e m33113a(qy3.C25919e0.C25920a r7, boolean r8) {
        /*
            z04.k r0 = qy3.C22167o.f62692d
            qy3.e0 r1 = r7.mo52800r()
            java.lang.String r1 = r1.f72268j
            boolean r0 = r0.mo90759d(r1)
            if (r0 == 0) goto L_0x0012
            ry3.k r7 = ry3.C26154k.f73078a
            goto L_0x0201
        L_0x0012:
            qy3.r0 r0 = qy3.C25977r0.f72357a
            qy3.e0 r1 = r7.mo52800r()
            wy3.r0 r1 = r1.mo52805n()
            qy3.d r0 = r0.mo52842b(r1)
            boolean r1 = r0 instanceof qy3.C22161d.C22165c
            r2 = 0
            if (r1 == 0) goto L_0x016c
            qy3.d$c r0 = (qy3.C22161d.C22165c) r0
            tz3.a$d r1 = r0.f62687c
            r3 = 0
            r4 = 1
            if (r8 == 0) goto L_0x003a
            int r5 = r1.f73492e
            r6 = 4
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 == 0) goto L_0x0048
            tz3.a$c r1 = r1.f73495h
            goto L_0x0049
        L_0x003a:
            int r5 = r1.f73492e
            r6 = 8
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            tz3.a$c r1 = r1.f73496i
            goto L_0x0049
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r1 == 0) goto L_0x0065
            qy3.e0 r3 = r7.mo52800r()
            qy3.o r3 = r3.f72266h
            sz3.c r4 = r0.f62688d
            int r5 = r1.f73482f
            java.lang.String r4 = r4.getString(r5)
            sz3.c r0 = r0.f62688d
            int r1 = r1.f73483g
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r3 = r3.mo35269l(r4, r0)
        L_0x0065:
            if (r3 != 0) goto L_0x010e
            qy3.e0 r0 = r7.mo52800r()
            wy3.r0 r0 = r0.mo52805n()
            boolean r0 = zz3.C26798j.m35241d(r0)
            if (r0 == 0) goto L_0x00df
            qy3.e0 r0 = r7.mo52800r()
            wy3.r0 r0 = r0.mo52805n()
            wy3.s r0 = r0.getVisibility()
            wy3.s r1 = wy3.C26491r.f73781d
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x00df
            qy3.e0 r8 = r7.mo52800r()
            wy3.r0 r8 = r8.mo52805n()
            wy3.k r8 = r8.mo51892b()
            java.lang.Class r8 = ry3.C26150i.m33570f(r8)
            if (r8 == 0) goto L_0x00bf
            qy3.e0 r0 = r7.mo52800r()
            wy3.r0 r0 = r0.mo52805n()
            java.lang.reflect.Method r8 = ry3.C26150i.m33568d(r8, r0)
            boolean r0 = r7.mo52807p()
            if (r0 == 0) goto L_0x00b8
            ry3.j$a r0 = new ry3.j$a
            java.lang.Object r1 = m33116d(r7)
            r0.<init>(r8, r1)
            goto L_0x019f
        L_0x00b8:
            ry3.j$b r0 = new ry3.j$b
            r0.<init>(r8)
            goto L_0x019f
        L_0x00bf:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            qy3.e0 r7 = r7.mo52800r()
            r0.append(r7)
            java.lang.String r7 = " should have a field"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00df:
            qy3.e0 r0 = r7.mo52800r()
            qy3.n0$b<java.lang.reflect.Field> r0 = r0.f72270o
            java.lang.Object r0 = r0.invoke()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L_0x00f3
            ry3.f r0 = m33114b(r7, r8, r0)
            goto L_0x019f
        L_0x00f3:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            qy3.e0 r7 = r7.mo52800r()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x010e:
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L_0x0130
            boolean r8 = r7.mo52807p()
            if (r8 == 0) goto L_0x0128
            ry3.f$g$a r8 = new ry3.f$g$a
            java.lang.Object r0 = m33116d(r7)
            r8.<init>(r3, r0)
            goto L_0x012d
        L_0x0128:
            ry3.f$g$d r8 = new ry3.f$g$d
            r8.<init>(r3)
        L_0x012d:
            r0 = r8
            goto L_0x019f
        L_0x0130:
            qy3.e0 r8 = r7.mo52800r()
            wy3.r0 r8 = r8.mo52805n()
            xy3.h r8 = r8.getAnnotations()
            vz3.c r0 = qy3.C25987u0.f72374a
            boolean r8 = r8.mo51479q(r0)
            if (r8 == 0) goto L_0x0156
            boolean r8 = r7.mo52807p()
            if (r8 == 0) goto L_0x0150
            ry3.f$g$b r8 = new ry3.f$g$b
            r8.<init>(r3)
            goto L_0x012d
        L_0x0150:
            ry3.f$g$e r8 = new ry3.f$g$e
            r8.<init>(r3)
            goto L_0x012d
        L_0x0156:
            boolean r8 = r7.mo52807p()
            if (r8 == 0) goto L_0x0166
            ry3.f$g$c r8 = new ry3.f$g$c
            java.lang.Object r0 = m33116d(r7)
            r8.<init>(r3, r0)
            goto L_0x012d
        L_0x0166:
            ry3.f$g$f r8 = new ry3.f$g$f
            r8.<init>(r3)
            goto L_0x012d
        L_0x016c:
            boolean r1 = r0 instanceof qy3.C22161d.C22162a
            if (r1 == 0) goto L_0x0179
            qy3.d$a r0 = (qy3.C22161d.C22162a) r0
            java.lang.reflect.Field r0 = r0.f62680a
            ry3.f r0 = m33114b(r7, r8, r0)
            goto L_0x019f
        L_0x0179:
            boolean r1 = r0 instanceof qy3.C22161d.C22163b
            if (r1 == 0) goto L_0x01c1
            if (r8 == 0) goto L_0x0184
            qy3.d$b r0 = (qy3.C22161d.C22163b) r0
            java.lang.reflect.Method r8 = r0.f62681a
            goto L_0x018a
        L_0x0184:
            qy3.d$b r0 = (qy3.C22161d.C22163b) r0
            java.lang.reflect.Method r8 = r0.f62682b
            if (r8 == 0) goto L_0x01a8
        L_0x018a:
            boolean r0 = r7.mo52807p()
            if (r0 == 0) goto L_0x019a
            ry3.f$g$a r0 = new ry3.f$g$a
            java.lang.Object r1 = m33116d(r7)
            r0.<init>(r8, r1)
            goto L_0x019f
        L_0x019a:
            ry3.f$g$d r0 = new ry3.f$g$d
            r0.<init>(r8)
        L_0x019f:
            wy3.q0 r7 = r7.mo52813q()
            ry3.e r7 = ry3.C26150i.m33566b(r0, r7, r2)
            goto L_0x0201
        L_0x01a8:
            qy3.l0 r7 = new qy3.l0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r8.append(r1)
            java.lang.reflect.Method r0 = r0.f62681a
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x01c1:
            boolean r1 = r0 instanceof qy3.C22161d.C22164d
            if (r1 == 0) goto L_0x0238
            if (r8 == 0) goto L_0x01cc
            qy3.d$d r0 = (qy3.C22161d.C22164d) r0
            qy3.c$e r8 = r0.f62683a
            goto L_0x01d2
        L_0x01cc:
            qy3.d$d r0 = (qy3.C22161d.C22164d) r0
            qy3.c$e r8 = r0.f62684b
            if (r8 == 0) goto L_0x021d
        L_0x01d2:
            qy3.e0 r0 = r7.mo52800r()
            qy3.o r0 = r0.f72266h
            uz3.d$b r8 = r8.f62678a
            java.lang.String r1 = r8.f65292a
            java.lang.String r8 = r8.f65293b
            java.lang.reflect.Method r8 = r0.mo35269l(r1, r8)
            if (r8 == 0) goto L_0x0202
            int r0 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r7.mo52807p()
            if (r0 == 0) goto L_0x01fc
            ry3.f$g$a r0 = new ry3.f$g$a
            java.lang.Object r7 = m33116d(r7)
            r0.<init>(r8, r7)
            r7 = r0
            goto L_0x0201
        L_0x01fc:
            ry3.f$g$d r7 = new ry3.f$g$d
            r7.<init>(r8)
        L_0x0201:
            return r7
        L_0x0202:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            qy3.e0 r7 = r7.mo52800r()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x021d:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            qy3.e0 r7 = r7.mo52800r()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0238:
            rx3.j r7 = new rx3.j
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25929f0.m33113a(qy3.e0$a, boolean):ry3.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ry3.C26123f<java.lang.reflect.Field> m33114b(qy3.C25919e0.C25920a<?, ?> r3, boolean r4, java.lang.reflect.Field r5) {
        /*
            qy3.e0 r0 = r3.mo52800r()
            wy3.r0 r0 = r0.mo52805n()
            wy3.k r1 = r0.mo51892b()
            java.lang.String r2 = "containingDeclaration"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = zz3.C26794h.m35225m(r1)
            if (r2 != 0) goto L_0x0018
            goto L_0x003c
        L_0x0018:
            wy3.k r1 = r1.mo51892b()
            wy3.f r2 = wy3.C26453f.INTERFACE
            boolean r2 = zz3.C26794h.m35227o(r1, r2)
            if (r2 != 0) goto L_0x002c
            wy3.f r2 = wy3.C26453f.ANNOTATION_CLASS
            boolean r1 = zz3.C26794h.m35227o(r1, r2)
            if (r1 == 0) goto L_0x003a
        L_0x002c:
            boolean r1 = r0 instanceof l04.C24918l
            if (r1 == 0) goto L_0x003c
            l04.l r0 = (l04.C24918l) r0
            qz3.n r0 = r0.f70988H
            boolean r0 = uz3.C26380h.m33951d(r0)
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 != 0) goto L_0x009f
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x009f
        L_0x004a:
            qy3.e0 r0 = r3.mo52800r()
            wy3.r0 r0 = r0.mo52805n()
            xy3.h r0 = r0.getAnnotations()
            vz3.c r1 = qy3.C25987u0.f72374a
            boolean r0 = r0.mo51479q(r1)
            if (r0 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x0073
            boolean r3 = r3.mo52807p()
            if (r3 == 0) goto L_0x006d
            ry3.f$e$b r3 = new ry3.f$e$b
            r3.<init>(r5)
            goto L_0x00d5
        L_0x006d:
            ry3.f$e$d r3 = new ry3.f$e$d
            r3.<init>(r5)
            goto L_0x00d5
        L_0x0073:
            boolean r4 = r3.mo52807p()
            if (r4 == 0) goto L_0x0083
            ry3.f$f$b r4 = new ry3.f$f$b
            boolean r3 = m33115c(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x0083:
            ry3.f$f$d r4 = new ry3.f$f$d
            boolean r3 = m33115c(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x008d:
            if (r4 == 0) goto L_0x0095
            ry3.f$e$e r3 = new ry3.f$e$e
            r3.<init>(r5)
            goto L_0x00d5
        L_0x0095:
            ry3.f$f$e r4 = new ry3.f$f$e
            boolean r3 = m33115c(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x009f:
            if (r4 == 0) goto L_0x00b7
            boolean r4 = r3.mo52807p()
            if (r4 == 0) goto L_0x00b1
            ry3.f$e$a r4 = new ry3.f$e$a
            java.lang.Object r3 = m33116d(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x00b1:
            ry3.f$e$c r3 = new ry3.f$e$c
            r3.<init>(r5)
            goto L_0x00d5
        L_0x00b7:
            boolean r4 = r3.mo52807p()
            if (r4 == 0) goto L_0x00cb
            ry3.f$f$a r4 = new ry3.f$f$a
            boolean r0 = m33115c(r3)
            java.lang.Object r3 = m33116d(r3)
            r4.<init>(r5, r0, r3)
            goto L_0x00d4
        L_0x00cb:
            ry3.f$f$c r4 = new ry3.f$f$c
            boolean r3 = m33115c(r3)
            r4.<init>(r5, r3)
        L_0x00d4:
            r3 = r4
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25929f0.m33114b(qy3.e0$a, boolean, java.lang.reflect.Field):ry3.f");
    }

    /* renamed from: c */
    public static final boolean m33115c(C25919e0.C25920a<?, ?> aVar) {
        return !C25187v1.m32087g(aVar.mo52800r().mo52805n().getType());
    }

    /* renamed from: d */
    public static final Object m33116d(C25919e0.C25920a<?, ?> aVar) {
        C87412m.m108594g(aVar, "<this>");
        C25919e0<?> r = aVar.mo52800r();
        return C26150i.m33565a(r.f72269n, r.mo52805n());
    }
}
