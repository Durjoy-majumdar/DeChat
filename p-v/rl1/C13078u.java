package rl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.view.MenuItem;
import fy3.C32227p;
import nj3.C11184p0;
import rx3.C13598b0;
import te3.C48659a31;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rl1.u */
public final class C13078u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13053n f37232d;

    /* renamed from: e */
    public final /* synthetic */ C48659a31 f37233e;

    /* renamed from: f */
    public final /* synthetic */ int f37234f;

    /* renamed from: g */
    public final /* synthetic */ C13044k f37235g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryPanelWidget$lotteryListAdapter$1$2$2$1", mo125469f = "FinderLiveLotteryPanelWidget.kt", mo125470l = {123, 126}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.u$a */
    public static final class C13079a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f37236d;

        /* renamed from: e */
        public int f37237e;

        /* renamed from: f */
        public final /* synthetic */ C13053n f37238f;

        /* renamed from: g */
        public final /* synthetic */ C48659a31 f37239g;

        /* renamed from: h */
        public final /* synthetic */ int f37240h;

        /* renamed from: i */
        public final /* synthetic */ C13044k f37241i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13079a(C13053n nVar, C48659a31 a312, int i, C13044k kVar, C15601d<? super C13079a> dVar) {
            super(2, dVar);
            this.f37238f = nVar;
            this.f37239g = a312;
            this.f37240h = i;
            this.f37241i = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13079a(this.f37238f, this.f37239g, this.f37240h, this.f37241i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13079a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
            if (r3 != null) goto L_0x00c1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r11.f37237e
                r3 = 0
                r4 = 2
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0026
                if (r2 == r6) goto L_0x0021
                if (r2 != r4) goto L_0x0019
                java.lang.Object r0 = r11.f37236d
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0107
            L_0x0019:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00de
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r12)
                rl1.n r12 = r11.f37238f
                androidx.lifecycle.i0 r12 = r12.mo12557c(r0)
                rl1.d0 r12 = (rl1.C13022d0) r12
                if (r12 == 0) goto L_0x00e1
                te3.a31 r2 = r11.f37239g
                rl1.n r7 = r11.f37238f
                int r7 = r7.getSourceScene()
                int r8 = r11.f37240h
                r11.f37237e = r6
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "deleteLotteryPanelItem "
                r9.append(r10)
                org.json.JSONObject r10 = o40.C61937h.m72709h(r2)
                r9.append(r10)
                java.lang.String r10 = ",sourceType:"
                r9.append(r10)
                r9.append(r7)
                java.lang.String r10 = ",index:"
                r9.append(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "MMFinder.LiveLotterySlice"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                if (r7 == 0) goto L_0x00c6
                if (r7 == r6) goto L_0x006f
            L_0x006d:
                r6 = 0
                goto L_0x00c1
            L_0x006f:
                bl3.r r12 = bl3.C39818r.f106831a
                java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                bl3.r$a r12 = r12.mo62446e(r2)
                java.lang.Class<rl1.c0> r2 = rl1.C13020c0.class
                androidx.lifecycle.i0 r12 = r12.mo75002a(r2)
                rl1.c0 r12 = (rl1.C13020c0) r12
                if (r8 < 0) goto L_0x008b
                java.util.LinkedList<te3.a31> r2 = r12.f37083e
                int r2 = r2.size()
                if (r8 >= r2) goto L_0x008b
                r2 = 1
                goto L_0x008c
            L_0x008b:
                r2 = 0
            L_0x008c:
                if (r2 == 0) goto L_0x0097
                java.util.LinkedList<te3.a31> r2 = r12.f37083e
                java.lang.Object r2 = r2.remove(r8)
                r3 = r2
                te3.a31 r3 = (te3.C48659a31) r3
            L_0x0097:
                java.lang.String r12 = r12.f37082d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "deleteLotteryPrepareItem index:"
                r2.append(r7)
                r2.append(r8)
                java.lang.String r7 = ", removeItem:"
                r2.append(r7)
                if (r3 != 0) goto L_0x00b0
                java.lang.String r7 = ""
                goto L_0x00b1
            L_0x00b0:
                r7 = r3
            L_0x00b1:
                org.json.JSONObject r7 = o40.C61937h.m72709h(r7)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                if (r3 == 0) goto L_0x006d
            L_0x00c1:
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
                goto L_0x00db
            L_0x00c6:
                te3.cd1 r3 = new te3.cd1
                r3.<init>()
                r3.f131666d = r6
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                r7.add(r2)
                r3.f131667e = r7
                java.lang.Object r12 = r12.mo12544k3(r3, r6, r11)
            L_0x00db:
                if (r12 != r1) goto L_0x00de
                return r1
            L_0x00de:
                r3 = r12
                java.lang.Boolean r3 = (java.lang.Boolean) r3
            L_0x00e1:
                java.lang.Boolean r12 = java.lang.Boolean.TRUE
                boolean r12 = gy3.C87412m.m108589b(r3, r12)
                if (r12 == 0) goto L_0x0120
                rl1.n r12 = r11.f37238f
                int r12 = r12.getSourceScene()
                if (r12 != 0) goto L_0x010a
                rl1.n r12 = r11.f37238f
                androidx.lifecycle.i0 r12 = r12.mo12557c(r0)
                rl1.d0 r12 = (rl1.C13022d0) r12
                if (r12 == 0) goto L_0x010a
                r11.f37236d = r3
                r11.f37237e = r4
                java.lang.Object r12 = r12.mo12540f3(r5, r11)
                if (r12 != r1) goto L_0x0106
                return r1
            L_0x0106:
                r0 = r3
            L_0x0107:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                r3 = r0
            L_0x010a:
                rl1.k r12 = r11.f37241i
                int r0 = r11.f37240h
                te3.a31 r1 = r11.f37239g
                r12.getClass()
                java.lang.String r2 = "item"
                gy3.C87412m.m108594g(r1, r2)
                rl1.m r1 = new rl1.m
                r1.<init>(r0, r12)
                o40.C61926c.m72668M(r1)
            L_0x0120:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "delete lottery index:"
                r12.append(r0)
                int r0 = r11.f37240h
                r12.append(r0)
                java.lang.String r0 = " result:"
                r12.append(r0)
                r12.append(r3)
                r0 = 33
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.String r0 = "FinderLiveLotteryPanelWidget"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C13078u.C13079a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13078u(C13053n nVar, C48659a31 a312, int i, C13044k kVar) {
        this.f37232d = nVar;
        this.f37233e = a312;
        this.f37234f = i;
        this.f37235g = kVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1000) {
            this.f37232d.getPopupMenu().mo108266a();
            C53895h.m60466d(this.f37232d.getScope(), C53872d1.f151119c, (C53934p0) null, new C13079a(this.f37232d, this.f37233e, this.f37234f, this.f37235g, (C15601d<? super C13079a>) null), 2, (Object) null);
        }
    }
}
