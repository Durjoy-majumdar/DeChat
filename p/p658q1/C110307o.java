package p658q1;

import gy3.C87412m;
import iy3.C60641c;
import java.util.HashMap;
import java.util.Map;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p631o1.C61911a;
import p631o1.C61912b;
import p631o1.C61919i;
import sx3.C90364q0;

/* renamed from: q1.o */
public final class C110307o {

    /* renamed from: a */
    public final C110301j f329950a;

    /* renamed from: b */
    public boolean f329951b = true;

    /* renamed from: c */
    public boolean f329952c;

    /* renamed from: d */
    public boolean f329953d;

    /* renamed from: e */
    public boolean f329954e;

    /* renamed from: f */
    public boolean f329955f;

    /* renamed from: g */
    public boolean f329956g;

    /* renamed from: h */
    public C110301j f329957h;

    /* renamed from: i */
    public final Map<C61911a, Integer> f329958i = new HashMap();

    public C110307o(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        this.f329950a = jVar;
    }

    /* renamed from: b */
    public static final void m150054b(C110307o oVar, C61911a aVar, int i, C110311s sVar) {
        float f = (float) i;
        long a = C112540f.m153745a(f, f);
        while (true) {
            a = sVar.mo161757Z0(a);
            sVar = sVar.f329973i;
            C87412m.m108591d(sVar);
            if (C87412m.m108589b(sVar, oVar.f329950a.f329895I)) {
                break;
            } else if (sVar.mo161741G0().mo145550d().containsKey(aVar)) {
                float F0 = (float) sVar.mo161740F0(aVar);
                a = C112540f.m153745a(F0, F0);
            }
        }
        int b = aVar instanceof C61919i ? C60641c.m70921b(C112539e.m153739d(a)) : C60641c.m70921b(C112539e.m153738c(a));
        Map<C61911a, Integer> map = oVar.f329958i;
        if (((HashMap) map).containsKey(aVar)) {
            int intValue = ((Number) C90364q0.m113145d(oVar.f329958i, aVar)).intValue();
            C61919i iVar = C61912b.f176019a;
            C87412m.m108594g(aVar, "<this>");
            b = aVar.f176018a.invoke(Integer.valueOf(intValue), Integer.valueOf(b)).intValue();
        }
        ((HashMap) map).put(aVar, Integer.valueOf(b));
    }

    /* renamed from: a */
    public final boolean mo161733a() {
        return this.f329952c || this.f329954e || this.f329955f || this.f329956g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = r0.f329931z;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161734c() {
        /*
            r2 = this;
            boolean r0 = r2.mo161733a()
            if (r0 == 0) goto L_0x0009
            q1.j r0 = r2.f329950a
            goto L_0x0049
        L_0x0009:
            q1.j r0 = r2.f329950a
            q1.j r0 = r0.mo161723s()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            q1.o r0 = r0.f329931z
            q1.j r0 = r0.f329957h
            if (r0 == 0) goto L_0x0021
            q1.o r1 = r0.f329931z
            boolean r1 = r1.mo161733a()
            if (r1 == 0) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            q1.j r0 = r2.f329957h
            if (r0 == 0) goto L_0x004b
            q1.o r1 = r0.f329931z
            boolean r1 = r1.mo161733a()
            if (r1 == 0) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            q1.j r1 = r0.mo161723s()
            if (r1 == 0) goto L_0x003b
            q1.o r1 = r1.f329931z
            if (r1 == 0) goto L_0x003b
            r1.mo161734c()
        L_0x003b:
            q1.j r0 = r0.mo161723s()
            if (r0 == 0) goto L_0x0048
            q1.o r0 = r0.f329931z
            if (r0 == 0) goto L_0x0048
            q1.j r0 = r0.f329957h
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r2.f329957h = r0
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110307o.mo161734c():void");
    }
}
