package fz3;

import gy3.C8480h;
import gy3.C87412m;
import hz3.C24610e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oz3.C25384l;
import rx3.C13604l;
import sx3.C110818d0;
import wy3.C26434a;
import wy3.C26463h1;
import wy3.C26516w;
import zz3.C26795i;

/* renamed from: fz3.w */
public final class C24521w implements C26795i {

    /* renamed from: a */
    public static final C24522a f70080a = new C24522a((C8480h) null);

    /* renamed from: fz3.w$a */
    public static final class C24522a {
        public C24522a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo51203a(C26434a aVar, C26434a aVar2) {
            C87412m.m108594g(aVar, "superDescriptor");
            C87412m.m108594g(aVar2, "subDescriptor");
            if ((aVar2 instanceof C24610e) && (aVar instanceof C26516w)) {
                C24610e eVar = (C24610e) aVar2;
                eVar.mo52639h().size();
                C26516w wVar = (C26516w) aVar;
                wVar.mo52639h().size();
                List<C26463h1> h = eVar.m34990a().mo52639h();
                C87412m.m108593f(h, "subDescriptor.original.valueParameters");
                List<C26463h1> h2 = wVar.mo36109a().mo52639h();
                C87412m.m108593f(h2, "superDescriptor.original.valueParameters");
                Iterator it = ((ArrayList) C110818d0.m150908F0(h, h2)).iterator();
                while (it.hasNext()) {
                    C13604l lVar = (C13604l) it.next();
                    C26463h1 h1Var = (C26463h1) lVar.f38555d;
                    C26463h1 h1Var2 = (C26463h1) lVar.f38556e;
                    C87412m.m108593f(h1Var, "subParameter");
                    boolean z = mo51204b((C26516w) aVar2, h1Var) instanceof C25384l.C25387c;
                    C87412m.m108593f(h1Var2, "superParameter");
                    if (z != (mo51204b(wVar, h1Var2) instanceof C25384l.C25387c)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r7v11, types: [wy3.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final oz3.C25384l mo51204b(wy3.C26516w r7, wy3.C26463h1 r8) {
            /*
                r6 = this;
                java.lang.String r0 = "f"
                gy3.C87412m.m108594g(r7, r0)
                vz3.f r0 = r7.getName()
                java.lang.String r0 = r0.mo35995b()
                java.lang.String r1 = "remove"
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                r1 = 1
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x00c1
                java.util.List r0 = r7.mo52639h()
                int r0 = r0.size()
                if (r0 != r1) goto L_0x00c1
                wy3.b r0 = d04.C24442a.m30545l(r7)
                wy3.k r0 = r0.mo51892b()
                boolean r0 = r0 instanceof hz3.C21040c
                if (r0 != 0) goto L_0x0037
                boolean r0 = ty3.C26336h.m33824A(r7)
                if (r0 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r0 = 0
                goto L_0x0038
            L_0x0037:
                r0 = 1
            L_0x0038:
                if (r0 == 0) goto L_0x003c
                goto L_0x00c1
            L_0x003c:
                wy3.w r0 = r7.mo36109a()
                java.util.List r0 = r0.mo52639h()
                java.lang.String r4 = "f.original.valueParameters"
                gy3.C87412m.m108593f(r0, r4)
                java.lang.Object r0 = sx3.C110818d0.m150938j0(r0)
                wy3.h1 r0 = (wy3.C26463h1) r0
                n04.j0 r0 = r0.getType()
                java.lang.String r4 = "f.original.valueParameters.single().type"
                gy3.C87412m.m108593f(r0, r4)
                oz3.l r0 = oz3.C25404v.m32597c(r0)
                boolean r4 = r0 instanceof oz3.C25384l.C25387c
                if (r4 == 0) goto L_0x0063
                oz3.l$c r0 = (oz3.C25384l.C25387c) r0
                goto L_0x0064
            L_0x0063:
                r0 = r3
            L_0x0064:
                if (r0 == 0) goto L_0x0069
                e04.e r0 = r0.f71937i
                goto L_0x006a
            L_0x0069:
                r0 = r3
            L_0x006a:
                e04.e r4 = e04.C20506e.INT
                if (r0 == r4) goto L_0x006f
                goto L_0x00c1
            L_0x006f:
                wy3.w r0 = fz3.C20745h.m22700a(r7)
                if (r0 != 0) goto L_0x0076
                goto L_0x00c1
            L_0x0076:
                wy3.w r4 = r0.mo36109a()
                java.util.List r4 = r4.mo52639h()
                java.lang.String r5 = "overridden.original.valueParameters"
                gy3.C87412m.m108593f(r4, r5)
                java.lang.Object r4 = sx3.C110818d0.m150938j0(r4)
                wy3.h1 r4 = (wy3.C26463h1) r4
                n04.j0 r4 = r4.getType()
                java.lang.String r5 = "overridden.original.valueParameters.single().type"
                gy3.C87412m.m108593f(r4, r5)
                oz3.l r4 = oz3.C25404v.m32597c(r4)
                wy3.k r0 = r0.mo51892b()
                java.lang.String r5 = "overridden.containingDeclaration"
                gy3.C87412m.m108593f(r0, r5)
                vz3.d r0 = d04.C24442a.m30541h(r0)
                vz3.c r5 = ty3.C26343l.C26344a.f73391K
                vz3.d r5 = r5.mo35982i()
                boolean r0 = gy3.C87412m.m108589b(r0, r5)
                if (r0 == 0) goto L_0x00c1
                boolean r0 = r4 instanceof oz3.C25384l.C25386b
                if (r0 == 0) goto L_0x00c1
                oz3.l$b r4 = (oz3.C25384l.C25386b) r4
                java.lang.String r0 = r4.f71936i
                java.lang.String r4 = "java/lang/Object"
                boolean r0 = gy3.C87412m.m108589b(r0, r4)
                if (r0 == 0) goto L_0x00c1
                r0 = 1
                goto L_0x00c2
            L_0x00c1:
                r0 = 0
            L_0x00c2:
                java.lang.String r4 = "valueParameterDescriptor.type"
                if (r0 != 0) goto L_0x0130
                java.util.List r0 = r7.mo52639h()
                int r0 = r0.size()
                if (r0 == r1) goto L_0x00d1
                goto L_0x0121
            L_0x00d1:
                wy3.k r0 = r7.mo51892b()
                boolean r5 = r0 instanceof wy3.C26447e
                if (r5 == 0) goto L_0x00dc
                wy3.e r0 = (wy3.C26447e) r0
                goto L_0x00dd
            L_0x00dc:
                r0 = r3
            L_0x00dd:
                if (r0 != 0) goto L_0x00e0
                goto L_0x0121
            L_0x00e0:
                java.util.List r7 = r7.mo52639h()
                java.lang.String r5 = "f.valueParameters"
                gy3.C87412m.m108593f(r7, r5)
                java.lang.Object r7 = sx3.C110818d0.m150938j0(r7)
                wy3.h1 r7 = (wy3.C26463h1) r7
                n04.j0 r7 = r7.getType()
                n04.j1 r7 = r7.mo37081K0()
                wy3.h r7 = r7.mo37094o()
                boolean r5 = r7 instanceof wy3.C26447e
                if (r5 == 0) goto L_0x0102
                r3 = r7
                wy3.e r3 = (wy3.C26447e) r3
            L_0x0102:
                if (r3 != 0) goto L_0x0105
                goto L_0x0121
            L_0x0105:
                ty3.j r7 = ty3.C26336h.m33840u(r0)
                if (r7 == 0) goto L_0x010d
                r7 = 1
                goto L_0x010e
            L_0x010d:
                r7 = 0
            L_0x010e:
                if (r7 == 0) goto L_0x011f
                vz3.c r7 = d04.C24442a.m30540g(r0)
                vz3.c r0 = d04.C24442a.m30540g(r3)
                boolean r7 = gy3.C87412m.m108589b(r7, r0)
                if (r7 == 0) goto L_0x011f
                goto L_0x0120
            L_0x011f:
                r1 = 0
            L_0x0120:
                r2 = r1
            L_0x0121:
                if (r2 == 0) goto L_0x0124
                goto L_0x0130
            L_0x0124:
                n04.j0 r7 = r8.getType()
                gy3.C87412m.m108593f(r7, r4)
                oz3.l r7 = oz3.C25404v.m32597c(r7)
                goto L_0x013f
            L_0x0130:
                n04.j0 r7 = r8.getType()
                gy3.C87412m.m108593f(r7, r4)
                n04.j0 r7 = r04.C26094c.m33430j(r7)
                oz3.l r7 = oz3.C25404v.m32597c(r7)
            L_0x013f:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fz3.C24521w.C24522a.mo51204b(wy3.w, wy3.h1):oz3.l");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (gy3.C87412m.m108589b(r1, oz3.C25404v.m32595a(r4, false, false, 2, (java.lang.Object) null)) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (((java.util.ArrayList) fz3.C20759m0.f58659k).contains(r1) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zz3.C26795i.C26797b mo51196a(wy3.C26434a r10, wy3.C26434a r11, wy3.C26447e r12) {
        /*
            r9 = this;
            zz3.i$b r0 = zz3.C26795i.C26797b.INCOMPATIBLE
            java.lang.String r1 = "superDescriptor"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "subDescriptor"
            gy3.C87412m.m108594g(r11, r1)
            boolean r1 = r10 instanceof wy3.C26436b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r11 instanceof wy3.C26516w
            if (r1 == 0) goto L_0x00b0
            boolean r1 = ty3.C26336h.m33824A(r11)
            if (r1 == 0) goto L_0x001e
            goto L_0x00b0
        L_0x001e:
            fz3.h r1 = fz3.C20745h.f58634m
            r4 = r11
            wy3.w r4 = (wy3.C26516w) r4
            vz3.f r5 = r4.getName()
            java.lang.String r6 = "subDescriptor.name"
            gy3.C87412m.m108593f(r5, r6)
            boolean r1 = r1.mo32446b(r5)
            if (r1 != 0) goto L_0x0047
            fz3.m0$a r1 = fz3.C20759m0.f58649a
            vz3.f r1 = r4.getName()
            gy3.C87412m.m108593f(r1, r6)
            java.util.List<vz3.f> r5 = fz3.C20759m0.f58659k
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x00b0
        L_0x0047:
            r1 = r10
            wy3.b r1 = (wy3.C26436b) r1
            wy3.b r1 = fz3.C20754l0.m22706c(r1)
            boolean r5 = r10 instanceof wy3.C26516w
            r6 = 0
            if (r5 == 0) goto L_0x0057
            r7 = r10
            wy3.w r7 = (wy3.C26516w) r7
            goto L_0x0058
        L_0x0057:
            r7 = r6
        L_0x0058:
            if (r7 == 0) goto L_0x0066
            boolean r8 = r4.mo53474H0()
            boolean r7 = r7.mo53474H0()
            if (r8 != r7) goto L_0x0066
            r7 = 1
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x00b1
            boolean r7 = r4.mo53474H0()
            if (r7 != 0) goto L_0x0073
            goto L_0x00b1
        L_0x0073:
            boolean r7 = r12 instanceof hz3.C21040c
            if (r7 == 0) goto L_0x00b0
            wy3.w r7 = r4.mo53473D0()
            if (r7 == 0) goto L_0x007e
            goto L_0x00b0
        L_0x007e:
            if (r1 == 0) goto L_0x00b0
            boolean r12 = fz3.C20754l0.m22707d(r12, r1)
            if (r12 == 0) goto L_0x0087
            goto L_0x00b0
        L_0x0087:
            boolean r12 = r1 instanceof wy3.C26516w
            if (r12 == 0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b1
            wy3.w r1 = (wy3.C26516w) r1
            wy3.w r12 = fz3.C20745h.m22700a(r1)
            if (r12 == 0) goto L_0x00b1
            r12 = 2
            java.lang.String r1 = oz3.C25404v.m32595a(r4, r3, r3, r12, r6)
            r4 = r10
            wy3.w r4 = (wy3.C26516w) r4
            wy3.w r4 = r4.mo36109a()
            java.lang.String r5 = "superDescriptor.original"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r12 = oz3.C25404v.m32595a(r4, r3, r3, r12, r6)
            boolean r12 = gy3.C87412m.m108589b(r1, r12)
            if (r12 == 0) goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00b4
            return r0
        L_0x00b4:
            fz3.w$a r12 = f70080a
            boolean r10 = r12.mo51203a(r10, r11)
            if (r10 == 0) goto L_0x00bd
            return r0
        L_0x00bd:
            zz3.i$b r10 = zz3.C26795i.C26797b.UNKNOWN
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fz3.C24521w.mo51196a(wy3.a, wy3.a, wy3.e):zz3.i$b");
    }

    /* renamed from: b */
    public C26795i.C26796a mo51197b() {
        return C26795i.C26796a.CONFLICTS_ONLY;
    }
}
