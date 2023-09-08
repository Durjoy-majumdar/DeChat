package l04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j04.C24748g0;
import j04.C24766m;
import java.util.ArrayList;
import java.util.List;
import n04.C25143j0;
import qz3.C26065q;
import qz3.C26075s;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sz3.C26247g;
import xy3.C26566c;
import xy3.C26571h;
import zy3.C26730c;

/* renamed from: l04.o */
public final class C24921o extends C26730c {

    /* renamed from: q */
    public final C24766m f71009q;

    /* renamed from: r */
    public final C26075s f71010r;

    /* renamed from: s */
    public final C24871a f71011s;

    /* renamed from: l04.o$a */
    public static final class C24922a extends C87413o implements C32224a<List<? extends C26566c>> {

        /* renamed from: d */
        public final /* synthetic */ C24921o f71012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24922a(C24921o oVar) {
            super(0);
            this.f71012d = oVar;
        }

        public Object invoke() {
            C24921o oVar = this.f71012d;
            C24766m mVar = oVar.f71009q;
            return C110818d0.m150953y0(mVar.f70643a.f70626e.mo51720g(oVar.f71010r, mVar.f70644b));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24921o(j04.C24766m r12, qz3.C26075s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "proto"
            gy3.C87412m.m108594g(r13, r0)
            j04.k r0 = r12.f70643a
            m04.n r2 = r0.f70622a
            wy3.k r3 = r12.f70645c
            int r0 = xy3.C26571h.f73936P0
            xy3.h r4 = xy3.C26571h.C26572a.f73937a
            sz3.c r0 = r12.f70644b
            int r1 = r13.f72846h
            vz3.f r5 = j04.C24732a0.m31110b(r0, r1)
            qz3.s$c r0 = r13.f72848j
            java.lang.String r1 = "proto.variance"
            gy3.C87412m.m108593f(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003b
            r1 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 2
            if (r0 != r1) goto L_0x0032
            n04.z1 r0 = n04.C25202z1.INVARIANT
            goto L_0x003d
        L_0x0032:
            rx3.j r12 = new rx3.j
            r12.<init>()
            throw r12
        L_0x0038:
            n04.z1 r0 = n04.C25202z1.OUT_VARIANCE
            goto L_0x003d
        L_0x003b:
            n04.z1 r0 = n04.C25202z1.IN_VARIANCE
        L_0x003d:
            r6 = r0
            boolean r7 = r13.f72847i
            wy3.y0 r9 = wy3.C26521y0.f73808a
            wy3.b1$a r10 = wy3.C26439b1.C26440a.f73729a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f71009q = r12
            r11.f71010r = r13
            l04.a r13 = new l04.a
            j04.k r12 = r12.f70643a
            m04.n r12 = r12.f70622a
            l04.o$a r14 = new l04.o$a
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r11.f71011s = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l04.C24921o.<init>(j04.m, qz3.s, int):void");
    }

    /* renamed from: J0 */
    public void mo51855J0(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* renamed from: K0 */
    public List<C25143j0> mo51856K0() {
        C26075s sVar = this.f71010r;
        C26247g gVar = this.f71009q.f70646d;
        C87412m.m108594g(sVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        List<C26065q> list = sVar.f72849n;
        boolean z = !list.isEmpty();
        ArrayList arrayList = list;
        if (!z) {
            arrayList = null;
        }
        ArrayList<C26065q> arrayList2 = arrayList;
        if (arrayList == null) {
            List<Integer> list2 = sVar.f72850o;
            C87412m.m108593f(list2, "upperBoundIdList");
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list2, 10));
            for (Integer num : list2) {
                C87412m.m108593f(num, LocaleUtil.ITALIAN);
                arrayList3.add(gVar.mo53147a(num.intValue()));
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            return C26236u.m33719b(C24442a.m30538e(this).mo53322n());
        }
        C24748g0 g0Var = this.f71009q.f70650h;
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C26065q g : arrayList2) {
            arrayList4.add(g0Var.mo51736g(g));
        }
        return arrayList4;
    }

    public C26571h getAnnotations() {
        return this.f71011s;
    }
}
