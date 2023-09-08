package zg1;

import cj1.C54761g4;
import cj1.C54847z3;
import cl1.C54979h1;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.LinkedList;
import o40.C61937h;
import ok1.C62042e;
import pe3.C89349b;
import rx3.C13598b0;
import sk1.C63956k;
import sx3.C110818d0;
import te3.C52013xs0;
import te3.C64822x51;
import yg1.C16006g;

/* renamed from: zg1.d0 */
public final class C66807d0 extends C16006g {

    /* renamed from: c */
    public final String f191931c = "LivePromoteInfoInterceptor";

    /* renamed from: zg1.d0$a */
    public static final class C66808a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66807d0 f191932d;

        /* renamed from: e */
        public final /* synthetic */ C64822x51 f191933e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66808a(C66807d0 d0Var, C64822x51 x512) {
            super(0);
            this.f191932d = d0Var;
            this.f191933e = x512;
        }

        public Object invoke() {
            C62042e.f176370a.mo87049V1(this.f191932d.f43066a, this.f191933e, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66807d0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C13598b0 b0Var;
        C45795b buContext;
        C45795b buContext2;
        C45795b buContext3;
        C58115i iVar;
        Class cls = C54979h1.class;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C64822x51 x512 = new C64822x51();
        boolean z = false;
        C63956k kVar = null;
        if (xs02 != null) {
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                C89349b bVar = xs02.f144906h;
                x512.parseFrom(bVar != null ? bVar.mo123703f() : null);
            }
        }
        Log.m105924i(this.f191931c, "recive promote msg: " + C61937h.m72709h(x512));
        int i = x512.f186257g;
        if ((i == 1 || ((x512.f186256f != null || x512.f186266s) && i == 0) ? x512 : null) != null) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (!(aVar == null || (iVar = aVar.f172989A) == null || !iVar.mo82886h())) {
                z = true;
            }
            if (z) {
                if (x512.f186257g == 1) {
                    C62042e eVar = C62042e.f176370a;
                    byte[] byteArray = x512.toByteArray();
                    C87412m.m108593f(byteArray, "info.toByteArray()");
                    C63956k y1 = eVar.mo87130y1(byteArray);
                    if (!(y1 instanceof C63956k)) {
                        y1 = null;
                    }
                    finderLiveService.getClass();
                    C56032b bVar2 = FinderLiveService.f159379g;
                    C0740i2 i2Var = (bVar2 == null || (buContext3 = bVar2.getBuContext()) == null) ? null : ((C54979h1) buContext3.mo71262a(cls)).f154147v;
                    if (i2Var instanceof C63956k) {
                        kVar = (C63956k) i2Var;
                    }
                    if (!(kVar == null || y1 == null || kVar.f181291d == y1.f181291d)) {
                        Log.m105924i(this.f191931c, "promoteid no match dont del,promotingId:" + kVar.f181291d + ", newPromoteInfo:" + y1.f181291d);
                    }
                }
                finderLiveService.getClass();
                C56032b bVar3 = FinderLiveService.f159379g;
                if (bVar3 != null) {
                    mo90801h(bVar3, x512);
                }
            } else {
                finderLiveService.getClass();
                C56032b bVar4 = FinderLiveService.f159379g;
                if (bVar4 != null) {
                    mo90801h(bVar4, x512);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    if (x512.f186257g == 1) {
                        finderLiveService.getClass();
                        C56032b bVar5 = FinderLiveService.f159379g;
                        C54979h1 h1Var = (bVar5 == null || (buContext2 = bVar5.getBuContext()) == null) ? null : (C54979h1) buContext2.mo71262a(cls);
                        if (h1Var != null) {
                            h1Var.mo75948o3((C0740i2) null);
                        }
                    } else {
                        finderLiveService.getClass();
                        C56032b bVar6 = FinderLiveService.f159379g;
                        C54979h1 h1Var2 = (bVar6 == null || (buContext = bVar6.getBuContext()) == null) ? null : (C54979h1) buContext.mo71262a(cls);
                        if (h1Var2 != null) {
                            C62042e eVar2 = C62042e.f176370a;
                            byte[] byteArray2 = x512.toByteArray();
                            C87412m.m108593f(byteArray2, "info.toByteArray()");
                            C63956k y15 = eVar2.mo87130y1(byteArray2);
                            if (y15 instanceof C0740i2) {
                                kVar = y15;
                            }
                            h1Var2.mo75948o3(kVar);
                        }
                    }
                }
            }
        }
        if (x512.f186262o > 0) {
            FinderLiveService.f159376d.getClass();
            C54847z3 z3Var = FinderLiveService.f159383n;
            z3Var.f153758g.post(new C54761g4(x512.f186262o, z3Var, x512.f186263p));
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20051};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        r0 = r0.getBuContext();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90801h(com.tencent.p014mm.plugin.finder.live.view.C56032b r8, te3.C64822x51 r9) {
        /*
            r7 = this;
            int r0 = r9.f186257g
            java.lang.String r1 = "PARAM_FINDER_LIVE_PROMOTE_DATA"
            r2 = 1
            if (r0 != r2) goto L_0x0021
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_DEL
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            byte[] r9 = r9.toByteArray()
            r3.putByteArray(r1, r9)
            java.lang.String r9 = "PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR"
            r3.putBoolean(r9, r2)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r8.statusChange(r0, r3)
            goto L_0x00b7
        L_0x0021:
            boolean r0 = r9.f186266s
            r3 = 0
            if (r0 != r2) goto L_0x0074
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r5 = r0.mo87027N0()
            if (r5 != 0) goto L_0x0074
            byte[] r8 = r9.toByteArray()
            java.lang.String r1 = "info.toByteArray()"
            gy3.C87412m.m108593f(r8, r1)
            sk1.k r8 = r0.mo87130y1(r8)
            boolean r8 = r8 instanceof sk1.C63956k
            boolean r8 = r9.f186265r
            if (r8 == 0) goto L_0x0050
            my3.j r8 = new my3.j
            int r0 = r9.f186263p
            r8.<init>(r2, r0)
            ky3.c$a r0 = ky3.C88334c.f255322d
            int r8 = my3.C61595o.m72299g(r8, r0)
            long r3 = (long) r8
        L_0x0050:
            java.lang.String r8 = r7.f191931c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[notifyBubble] delay = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r8 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r8
            long r3 = r3 * r0
            zg1.d0$a r8 = new zg1.d0$a
            r8.<init>(r7, r9)
            o40.C61926c.m72666K(r3, r8)
            goto L_0x00b7
        L_0x0074:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            r2 = 0
            if (r0 == 0) goto L_0x008f
            fj1.b r0 = r0.getBuContext()
            if (r0 == 0) goto L_0x008f
            java.lang.Class<cl1.h1> r5 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r5)
            cl1.h1 r0 = (cl1.C54979h1) r0
            cm1.i2 r0 = r0.f154147v
            goto L_0x0090
        L_0x008f:
            r0 = r2
        L_0x0090:
            boolean r5 = r0 instanceof sk1.C63956k
            if (r5 == 0) goto L_0x0097
            r2 = r0
            sk1.k r2 = (sk1.C63956k) r2
        L_0x0097:
            long r5 = r9.f186258h
            if (r2 == 0) goto L_0x009d
            long r3 = r2.f181291d
        L_0x009d:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a4
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE
            goto L_0x00a6
        L_0x00a4:
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_PROMTE_ADD
        L_0x00a6:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            byte[] r9 = r9.toByteArray()
            r2.putByteArray(r1, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r8.statusChange(r0, r2)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C66807d0.mo90801h(com.tencent.mm.plugin.finder.live.view.b, te3.x51):void");
    }
}
