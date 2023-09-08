package kj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54116w;
import cl1.C0689t;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C51276so2;
import wx3.C15601d;
import wx3.C66217g;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.x2 */
public final class C10265x2 extends C10538e {

    /* renamed from: h */
    public final int f31308h;

    /* renamed from: i */
    public final String f31309i = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.VisitorTicketOption$onItemClicked$1", mo125469f = "VisitorTicketOption.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.x2$a */
    public static final class C10266a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f31310d;

        /* renamed from: e */
        public int f31311e;

        /* renamed from: f */
        public final /* synthetic */ C10125e1 f31312f;

        /* renamed from: g */
        public final /* synthetic */ C10265x2 f31313g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10266a(C10125e1 e1Var, C10265x2 x2Var, C15601d<? super C10266a> dVar) {
            super(2, dVar);
            this.f31312f = e1Var;
            this.f31313g = x2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10266a(this.f31312f, this.f31313g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10266a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r8 = r19
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f31311e
                r10 = 0
                r2 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r0 = r8.f31310d
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.throwOnFailure(r20)     // Catch:{ Exception -> 0x001a }
                r0 = r20
                goto L_0x00ab
            L_0x001a:
                r0 = move-exception
                goto L_0x00b1
            L_0x001d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r20)
                kj1.e1 r1 = r8.f31312f
                androidx.lifecycle.i0 r1 = r1.mo10534b(r0)
                cl1.u r1 = (cl1.C55001u) r1
                byte[] r1 = r1.f154417n
                pe3.b r1 = pe3.C89349b.m111674a(r1)
                kj1.e1 r3 = r8.f31312f
                androidx.lifecycle.i0 r3 = r3.mo10534b(r0)
                cl1.u r3 = (cl1.C55001u) r3
                long r3 = r3.f154416j
                kj1.e1 r5 = r8.f31312f
                androidx.lifecycle.i0 r5 = r5.mo10534b(r0)
                cl1.u r5 = (cl1.C55001u) r5
                te3.c21 r5 = r5.f154420q
                te3.so2 r5 = r5.f182413y0
                if (r5 == 0) goto L_0x0052
                java.lang.String r5 = r5.f141652e
                if (r5 != 0) goto L_0x0054
            L_0x0052:
                java.lang.String r5 = ""
            L_0x0054:
                kj1.e1 r6 = r8.f31312f
                androidx.lifecycle.i0 r0 = r6.mo10534b(r0)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                long r6 = r0.f182392d
                kj1.e1 r0 = r8.f31312f
                java.lang.Class<cl1.o> r11 = cl1.C54991o.class
                androidx.lifecycle.i0 r0 = r0.mo10534b(r11)
                cl1.o r0 = (cl1.C54991o) r0
                java.lang.String r11 = r0.f154345o
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ak1.w r0 = (ak1.C54116w) r0
                r12 = 4
                r0.py0(r12, r5)
                te3.nz0 r0 = new te3.nz0     // Catch:{ Exception -> 0x00af }
                r0.<init>()     // Catch:{ Exception -> 0x00af }
                je1.h2 r12 = je1.C46523h2.f125330a     // Catch:{ Exception -> 0x00af }
                r13 = 10635(0x298b, float:1.4903E-41)
                te3.ig0 r12 = r12.mo71859a(r13)     // Catch:{ Exception -> 0x00af }
                r0.f138847d = r12     // Catch:{ Exception -> 0x00af }
                r0.f138848e = r5     // Catch:{ Exception -> 0x00af }
                r0.f138849f = r3     // Catch:{ Exception -> 0x00af }
                r0.f138851h = r1     // Catch:{ Exception -> 0x00af }
                r0.f138850g = r6     // Catch:{ Exception -> 0x00af }
                r1 = 2
                r0.f138853j = r1     // Catch:{ Exception -> 0x00af }
                ob0.b r1 = r0.mo73345b()     // Catch:{ Exception -> 0x00af }
                r3 = 0
                r0 = 0
                r6 = 3
                r7 = 0
                r8.f31310d = r11     // Catch:{ Exception -> 0x00af }
                r8.f31311e = r2     // Catch:{ Exception -> 0x00af }
                r2 = r3
                r4 = r0
                r5 = r19
                java.lang.Object r0 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00af }
                if (r0 != r9) goto L_0x00aa
                return r9
            L_0x00aa:
                r1 = r11
            L_0x00ab:
                te3.oz0 r0 = (te3.C50756oz0) r0     // Catch:{ Exception -> 0x001a }
                r15 = r1
                goto L_0x00cb
            L_0x00af:
                r0 = move-exception
                r1 = r11
            L_0x00b1:
                kj1.e1 r2 = r8.f31312f
                java.lang.String r2 = r2.f30980a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "#SHEET_MORE_ACTION_TICKET FinderLiveGetConcertTicketInfoRequest fail. "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                r15 = r1
                r0 = r10
            L_0x00cb:
                if (r0 == 0) goto L_0x00f8
                te3.ez r0 = r0.f139459d
                if (r0 == 0) goto L_0x00f8
                boolean r1 = r0.f133188j
                if (r1 == 0) goto L_0x00d7
                r13 = r0
                goto L_0x00d8
            L_0x00d7:
                r13 = r10
            L_0x00d8:
                if (r13 == 0) goto L_0x00f8
                kj1.x2 r0 = r8.f31313g
                java.lang.Class<ir.n> r1 = p565ir.C60606n.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(IFinderLiveFeatureService::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r11 = r1
                ir.n r11 = (p565ir.C60606n) r11
                kj1.e1 r0 = r0.f31809a
                com.tencent.mm.ui.MMActivity r12 = r0.f30985d
                r14 = 0
                r17 = 4
                r18 = 0
                java.lang.String r16 = "2"
                p565ir.C60606n.C60607a.m70859c(r11, r12, r13, r14, r15, r16, r17, r18)
            L_0x00f8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kj1.C10265x2.C10266a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10265x2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31308h = e1Var.f30955B;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31309i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C51276so2 so22 = ((C55001u) ((C0689t) this.f31809a.mo10534b(C0689t.class)).business(C55001u.class)).f154420q.f182413y0;
        return (so22 != null && so22.f141656i == 1) && !C62042e.f176370a.mo87027N0();
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        String str;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        e0Var.mo107135b(this.f31308h, C0966R.string.mrj, C0966R.raw.finder_live_ticket_icon_in_live);
        C51276so2 so22 = ((C55001u) e1Var.mo10534b(C55001u.class)).f154420q.f182413y0;
        if (so22 == null || (str = so22.f141652e) == null) {
            str = "";
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).py0(3, str);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31308h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C87412m.m108594g(e1Var, "<this>");
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (bVar != null && (aVar = bVar.f31008a) != null) {
            aVar.mo10542b(C66217g.f190253d, C53934p0.DEFAULT, new C10266a(e1Var, this, (C15601d<? super C10266a>) null));
        }
    }
}
