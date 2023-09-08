package qy3;

import d04.C24442a;
import fz3.C20742e0;
import fz3.C20754l0;
import gy3.C87412m;
import oz3.C25404v;
import qy3.C22152c;
import uz3.C22710d;
import vz3.C22826c;
import vz3.C26408b;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26516w;

/* renamed from: qy3.r0 */
public final class C25977r0 {

    /* renamed from: a */
    public static final C25977r0 f72357a = new C25977r0();

    /* renamed from: b */
    public static final C26408b f72358b = C26408b.m33992l(new C22826c("java.lang.Void"));

    /* renamed from: a */
    public final C22152c.C22160e mo52841a(C26516w wVar) {
        String a = C20754l0.m22704a(wVar);
        if (a == null) {
            if (wVar instanceof C26506s0) {
                String b = C24442a.m30545l(wVar).getName().mo35995b();
                C87412m.m108593f(b, "descriptor.propertyIfAccessor.name.asString()");
                a = C20742e0.m22697a(b);
            } else if (wVar instanceof C26507t0) {
                String b2 = C24442a.m30545l(wVar).getName().mo35995b();
                C87412m.m108593f(b2, "descriptor.propertyIfAccessor.name.asString()");
                a = C20742e0.m22698b(b2);
            } else {
                a = wVar.getName().mo35995b();
                C87412m.m108593f(a, "descriptor.name.asString()");
            }
        }
        return new C22152c.C22160e(new C22710d.C22712b(a, C25404v.m32595a(wVar, false, false, 1, (Object) null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: qy3.c$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qy3.C22161d mo52842b(wy3.C26504r0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            gy3.C87412m.m108594g(r8, r0)
            wy3.b r8 = zz3.C26794h.m35234v(r8)
            wy3.r0 r8 = (wy3.C26504r0) r8
            wy3.r0 r1 = r8.mo36109a()
            java.lang.String r8 = "unwrapFakeOverride(possi…rriddenProperty).original"
            gy3.C87412m.m108593f(r1, r8)
            boolean r8 = r1 instanceof l04.C24918l
            r0 = 0
            if (r8 == 0) goto L_0x0038
            r8 = r1
            l04.l r8 = (l04.C24918l) r8
            qz3.n r2 = r8.f70988H
            xz3.h$f<qz3.n, tz3.a$d> r3 = tz3.C26349a.f73456d
            java.lang.String r4 = "propertySignature"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = sz3.C26245e.m33733a(r2, r3)
            tz3.a$d r3 = (tz3.C26349a.C26357d) r3
            if (r3 == 0) goto L_0x00bc
            qy3.d$c r6 = new qy3.d$c
            sz3.c r4 = r8.f70989I
            sz3.g r5 = r8.f70990J
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0038:
            boolean r8 = r1 instanceof hz3.C24614f
            if (r8 == 0) goto L_0x00bc
            r8 = r1
            hz3.f r8 = (hz3.C24614f) r8
            wy3.y0 r8 = r8.getSource()
            boolean r2 = r8 instanceof lz3.C24955a
            if (r2 == 0) goto L_0x004a
            lz3.a r8 = (lz3.C24955a) r8
            goto L_0x004b
        L_0x004a:
            r8 = r0
        L_0x004b:
            if (r8 == 0) goto L_0x0052
            mz3.l r8 = r8.mo37236c()
            goto L_0x0053
        L_0x0052:
            r8 = r0
        L_0x0053:
            boolean r2 = r8 instanceof cz3.C24441z
            if (r2 == 0) goto L_0x0061
            qy3.d$a r0 = new qy3.d$a
            cz3.z r8 = (cz3.C24441z) r8
            java.lang.reflect.Field r8 = r8.f69892a
            r0.<init>(r8)
            goto L_0x0097
        L_0x0061:
            boolean r2 = r8 instanceof cz3.C24409c0
            if (r2 == 0) goto L_0x0098
            qy3.d$b r2 = new qy3.d$b
            cz3.c0 r8 = (cz3.C24409c0) r8
            java.lang.reflect.Method r8 = r8.f69856a
            wy3.t0 r1 = r1.mo52640i()
            if (r1 == 0) goto L_0x0076
            wy3.y0 r1 = r1.getSource()
            goto L_0x0077
        L_0x0076:
            r1 = r0
        L_0x0077:
            boolean r3 = r1 instanceof lz3.C24955a
            if (r3 == 0) goto L_0x007e
            lz3.a r1 = (lz3.C24955a) r1
            goto L_0x007f
        L_0x007e:
            r1 = r0
        L_0x007f:
            if (r1 == 0) goto L_0x0086
            mz3.l r1 = r1.mo37236c()
            goto L_0x0087
        L_0x0086:
            r1 = r0
        L_0x0087:
            boolean r3 = r1 instanceof cz3.C24409c0
            if (r3 == 0) goto L_0x008e
            cz3.c0 r1 = (cz3.C24409c0) r1
            goto L_0x008f
        L_0x008e:
            r1 = r0
        L_0x008f:
            if (r1 == 0) goto L_0x0093
            java.lang.reflect.Method r0 = r1.f69856a
        L_0x0093:
            r2.<init>(r8, r0)
            r0 = r2
        L_0x0097:
            return r0
        L_0x0098:
            qy3.l0 r0 = new qy3.l0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r8)
            r8 = 41
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        L_0x00bc:
            wy3.s0 r8 = r1.mo52635g()
            gy3.C87412m.m108591d(r8)
            qy3.c$e r8 = r7.mo52841a(r8)
            wy3.t0 r1 = r1.mo52640i()
            if (r1 == 0) goto L_0x00d1
            qy3.c$e r0 = r7.mo52841a(r1)
        L_0x00d1:
            qy3.d$d r1 = new qy3.d$d
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25977r0.mo52842b(wy3.r0):qy3.d");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [mz3.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qy3.C22152c mo52843c(wy3.C26516w r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            gy3.C87412m.m108594g(r8, r0)
            wy3.b r0 = zz3.C26794h.m35234v(r8)
            wy3.w r0 = (wy3.C26516w) r0
            wy3.w r0 = r0.mo36109a()
            java.lang.String r1 = "unwrapFakeOverride(possi…titutedFunction).original"
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = r0 instanceof l04.C24872b
            if (r1 == 0) goto L_0x0072
            r1 = r0
            l04.b r1 = (l04.C24872b) r1
            xz3.p r2 = r1.mo51890z()
            boolean r3 = r2 instanceof qz3.C26041i
            if (r3 == 0) goto L_0x003c
            uz3.h r3 = uz3.C26380h.f73581a
            r4 = r2
            qz3.i r4 = (qz3.C26041i) r4
            sz3.c r5 = r1.mo51882F()
            sz3.g r6 = r1.mo51886a0()
            uz3.d$b r3 = r3.mo53365c(r4, r5, r6)
            if (r3 == 0) goto L_0x003c
            qy3.c$e r8 = new qy3.c$e
            r8.<init>(r3)
            return r8
        L_0x003c:
            boolean r3 = r2 instanceof qz3.C26023d
            if (r3 == 0) goto L_0x006d
            uz3.h r3 = uz3.C26380h.f73581a
            qz3.d r2 = (qz3.C26023d) r2
            sz3.c r4 = r1.mo51882F()
            sz3.g r1 = r1.mo51886a0()
            uz3.d$b r1 = r3.mo53363a(r2, r4, r1)
            if (r1 == 0) goto L_0x006d
            wy3.k r8 = r8.mo51892b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            gy3.C87412m.m108593f(r8, r0)
            boolean r8 = zz3.C26798j.m35239b(r8)
            if (r8 == 0) goto L_0x0067
            qy3.c$e r8 = new qy3.c$e
            r8.<init>(r1)
            goto L_0x006c
        L_0x0067:
            qy3.c$d r8 = new qy3.c$d
            r8.<init>(r1)
        L_0x006c:
            return r8
        L_0x006d:
            qy3.c$e r8 = r7.mo52841a(r0)
            return r8
        L_0x0072:
            boolean r8 = r0 instanceof hz3.C24610e
            r1 = 0
            if (r8 == 0) goto L_0x00b8
            r8 = r0
            hz3.e r8 = (hz3.C24610e) r8
            wy3.y0 r8 = r8.getSource()
            boolean r2 = r8 instanceof lz3.C24955a
            if (r2 == 0) goto L_0x0085
            lz3.a r8 = (lz3.C24955a) r8
            goto L_0x0086
        L_0x0085:
            r8 = r1
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            mz3.l r8 = r8.mo37236c()
            goto L_0x008e
        L_0x008d:
            r8 = r1
        L_0x008e:
            boolean r2 = r8 instanceof cz3.C24409c0
            if (r2 == 0) goto L_0x0095
            r1 = r8
            cz3.c0 r1 = (cz3.C24409c0) r1
        L_0x0095:
            if (r1 == 0) goto L_0x00a1
            java.lang.reflect.Method r8 = r1.f69856a
            if (r8 == 0) goto L_0x00a1
            qy3.c$c r0 = new qy3.c$c
            r0.<init>(r8)
            return r0
        L_0x00a1:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x00b8:
            boolean r8 = r0 instanceof hz3.C24608b
            r2 = 41
            java.lang.String r3 = " ("
            if (r8 == 0) goto L_0x0119
            r8 = r0
            hz3.b r8 = (hz3.C24608b) r8
            wy3.y0 r8 = r8.getSource()
            boolean r4 = r8 instanceof lz3.C24955a
            if (r4 == 0) goto L_0x00ce
            lz3.a r8 = (lz3.C24955a) r8
            goto L_0x00cf
        L_0x00ce:
            r8 = r1
        L_0x00cf:
            if (r8 == 0) goto L_0x00d5
            mz3.l r1 = r8.mo37236c()
        L_0x00d5:
            boolean r8 = r1 instanceof cz3.C24438w
            if (r8 == 0) goto L_0x00e3
            qy3.c$b r8 = new qy3.c$b
            cz3.w r1 = (cz3.C24438w) r1
            java.lang.reflect.Constructor<?> r0 = r1.f69890a
            r8.<init>(r0)
            goto L_0x00f8
        L_0x00e3:
            boolean r8 = r1 instanceof cz3.C24435t
            if (r8 == 0) goto L_0x00f9
            r8 = r1
            cz3.t r8 = (cz3.C24435t) r8
            boolean r4 = r8.mo51095x()
            if (r4 == 0) goto L_0x00f9
            qy3.c$a r0 = new qy3.c$a
            java.lang.Class<?> r8 = r8.f69886a
            r0.<init>(r8)
            r8 = r0
        L_0x00f8:
            return r8
        L_0x00f9:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r8.<init>(r0)
            throw r8
        L_0x0119:
            vz3.f r8 = r0.getName()
            vz3.f r1 = ty3.C26343l.f73368b
            boolean r8 = r8.equals(r1)
            r1 = 1
            r4 = 0
            if (r8 == 0) goto L_0x012f
            boolean r8 = zz3.C26792g.m35211j(r0)
            if (r8 == 0) goto L_0x012f
            r8 = 1
            goto L_0x0130
        L_0x012f:
            r8 = 0
        L_0x0130:
            if (r8 != 0) goto L_0x0162
            vz3.f r8 = r0.getName()
            vz3.f r5 = ty3.C26343l.f73367a
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0146
            boolean r8 = zz3.C26792g.m35211j(r0)
            if (r8 == 0) goto L_0x0146
            r8 = 1
            goto L_0x0147
        L_0x0146:
            r8 = 0
        L_0x0147:
            if (r8 == 0) goto L_0x014a
            goto L_0x0162
        L_0x014a:
            vz3.f r8 = r0.getName()
            vz3.f r5 = vy3.C26382a.f73583e
            boolean r8 = gy3.C87412m.m108589b(r8, r5)
            if (r8 == 0) goto L_0x0161
            java.util.List r8 = r0.mo52639h()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0161
            goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            if (r1 == 0) goto L_0x0169
            qy3.c$e r8 = r7.mo52841a(r0)
            return r8
        L_0x0169:
            qy3.l0 r8 = new qy3.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25977r0.mo52843c(wy3.w):qy3.c");
    }
}
