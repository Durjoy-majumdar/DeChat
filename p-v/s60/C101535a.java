package s60;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import k60.C99102f;
import r60.C101350i;
import s60.C101536b;
import w60.C65941g;

/* renamed from: s60.a */
public final class C101535a<T> extends C101536b<T> {
    public C101535a(C101536b<T> bVar) {
        C87412m.m108594g(bVar, "transcoder");
        mo141015c(bVar);
    }

    /* renamed from: e */
    public static boolean m133296e(C101535a aVar, C101536b.C101538b bVar, int i, Object obj) {
        C101536b<?> bVar2;
        C101536b<?> bVar3;
        C101536b<?> bVar4;
        if ((i & 1) != 0) {
            bVar = C101536b.C101538b.DOWNLOADED;
        }
        aVar.getClass();
        C87412m.m108594g(bVar, "when");
        C101536b<?> bVar5 = aVar.f297265a;
        if (!(bVar5 instanceof C101536b)) {
            bVar5 = null;
        }
        if (bVar2 == null) {
            C101536b<?> bVar6 = aVar.f297265a;
        } else {
            do {
                if (bVar2.f297266b == C101536b.C101537a.HIGH && bVar == bVar2.f297267c) {
                    return true;
                }
                bVar2 = bVar2.f297265a;
                if (!(bVar2 instanceof C101536b)) {
                    bVar2 = null;
                    continue;
                }
            } while (bVar2 != null);
        }
        C101536b<?> bVar62 = aVar.f297265a;
        if (!(bVar62 instanceof C101536b)) {
            bVar62 = null;
        }
        if (bVar3 == null) {
            C101536b<?> bVar7 = aVar.f297265a;
        } else {
            do {
                if (bVar3.f297266b == C101536b.C101537a.NORMAL && bVar == bVar3.f297267c) {
                    return true;
                }
                bVar3 = bVar3.f297265a;
                if (!(bVar3 instanceof C101536b)) {
                    bVar3 = null;
                    continue;
                }
            } while (bVar3 != null);
        }
        C101536b<?> bVar72 = aVar.f297265a;
        if (!(bVar72 instanceof C101536b)) {
            bVar72 = null;
        }
        if (bVar4 == null) {
            return false;
        }
        do {
            if (bVar4.f297266b == C101536b.C101537a.LOW && bVar == bVar4.f297267c) {
                return true;
            }
            bVar4 = bVar4.f297265a;
            if (!(bVar4 instanceof C101536b)) {
                bVar4 = null;
                continue;
            }
        } while (bVar4 != null);
        return false;
    }

    /* renamed from: a */
    public C65941g<? extends T> mo139547a(C101350i<?> iVar, C99102f<?, T> fVar, C65941g<T> gVar) {
        C87412m.m108594g(iVar, "targetView");
        C87412m.m108594g(fVar, "reaper");
        C87412m.m108594g(gVar, FirebaseAnalytics.C113379b.SOURCE);
        return gVar;
    }

    /* renamed from: b */
    public String mo139548b(String str) {
        C101536b.C101538b bVar = C101536b.C101538b.DECODED;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C101536b<?> bVar2 = this.f297265a;
        if (bVar2 == null) {
            C101536b<?> bVar3 = this.f297265a;
        } else {
            do {
                if (bVar2.f297266b == C101536b.C101537a.HIGH && bVar == bVar2.f297267c) {
                    str = str + bVar2.mo139548b(str);
                }
                bVar2 = bVar2.f297265a;
            } while (bVar2 != null);
        }
        C101536b<?> bVar32 = this.f297265a;
        if (bVar32 == null) {
            C101536b<?> bVar4 = this.f297265a;
        } else {
            do {
                if (bVar32.f297266b == C101536b.C101537a.NORMAL && bVar == bVar32.f297267c) {
                    str = str + bVar32.mo139548b(str);
                }
                bVar32 = bVar32.f297265a;
            } while (bVar32 != null);
        }
        C101536b<?> bVar42 = this.f297265a;
        if (bVar42 == null) {
            return str;
        }
        do {
            if (bVar42.f297266b == C101536b.C101537a.LOW && bVar == bVar42.f297267c) {
                str = str + bVar42.mo139548b(str);
            }
            bVar42 = bVar42.f297265a;
        } while (bVar42 != null);
        return str;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=w60.g<T>, code=w60.g<? extends ?>, for r7v0, types: [w60.g<T>, java.lang.Object] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w60.C65941g<T> mo141014d(r60.C101350i<?> r5, k60.C99102f<?, T> r6, w60.C65941g<? extends java.lang.Object> r7, s60.C101536b.C101538b r8) {
        /*
            r4 = this;
            java.lang.String r0 = "targetView"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "reaper"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "when"
            gy3.C87412m.m108594g(r8, r0)
            s60.b<?> r0 = r4.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            r2 = 0
            if (r1 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0050
        L_0x0024:
            s60.b$a r1 = r0.f297266b
            s60.b$a r3 = s60.C101536b.C101537a.HIGH
            if (r1 != r3) goto L_0x0046
            s60.b$b r1 = r0.f297267c
            if (r8 != r1) goto L_0x0046
            boolean r1 = r7 instanceof w60.C65941g
            if (r1 == 0) goto L_0x0034
            r1 = r7
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            gy3.C87412m.m108591d(r1)
            w60.g r1 = r0.mo139547a(r5, r6, r1)
            boolean r3 = r1 instanceof w60.C65941g
            if (r3 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = r1
        L_0x0046:
            s60.b<?> r0 = r0.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 != 0) goto L_0x0024
        L_0x0050:
            s60.b<?> r0 = r4.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            goto L_0x0087
        L_0x005b:
            s60.b$a r1 = r0.f297266b
            s60.b$a r3 = s60.C101536b.C101537a.NORMAL
            if (r1 != r3) goto L_0x007d
            s60.b$b r1 = r0.f297267c
            if (r8 != r1) goto L_0x007d
            boolean r1 = r7 instanceof w60.C65941g
            if (r1 == 0) goto L_0x006b
            r1 = r7
            goto L_0x006c
        L_0x006b:
            r1 = r2
        L_0x006c:
            gy3.C87412m.m108591d(r1)
            w60.g r1 = r0.mo139547a(r5, r6, r1)
            boolean r3 = r1 instanceof w60.C65941g
            if (r3 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            if (r1 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r7 = r1
        L_0x007d:
            s60.b<?> r0 = r0.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            if (r1 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r0 = r2
        L_0x0085:
            if (r0 != 0) goto L_0x005b
        L_0x0087:
            s60.b<?> r0 = r4.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            if (r1 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r0 = r2
        L_0x008f:
            if (r0 != 0) goto L_0x0092
            goto L_0x00be
        L_0x0092:
            s60.b$a r1 = r0.f297266b
            s60.b$a r3 = s60.C101536b.C101537a.LOW
            if (r1 != r3) goto L_0x00b4
            s60.b$b r1 = r0.f297267c
            if (r8 != r1) goto L_0x00b4
            boolean r1 = r7 instanceof w60.C65941g
            if (r1 == 0) goto L_0x00a2
            r1 = r7
            goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            gy3.C87412m.m108591d(r1)
            w60.g r1 = r0.mo139547a(r5, r6, r1)
            boolean r3 = r1 instanceof w60.C65941g
            if (r3 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = r2
        L_0x00b0:
            if (r1 != 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r7 = r1
        L_0x00b4:
            s60.b<?> r0 = r0.f297265a
            boolean r1 = r0 instanceof s60.C101536b
            if (r1 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r0 = r2
        L_0x00bc:
            if (r0 != 0) goto L_0x0092
        L_0x00be:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s60.C101535a.mo141014d(r60.i, k60.f, w60.g, s60.b$b):w60.g");
    }
}
