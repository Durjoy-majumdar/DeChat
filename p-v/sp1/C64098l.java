package sp1;

import a14.C0000n0;
import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import np1.C61866i0;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C48714ah2;
import te3.C64370fp1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$launchAnim$1", mo125469f = "FinderLiveShopHotSellView.kt", mo125470l = {367, 371, 375, 380, 387, 390}, mo125471m = "invokeSuspend")
/* renamed from: sp1.l */
public final class C64098l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181740d;

    /* renamed from: e */
    public /* synthetic */ Object f181741e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveShopHotSellView f181742f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveShopHotSellView.C56311c f181743g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$launchAnim$1$1", mo125469f = "FinderLiveShopHotSellView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sp1.l$a */
    public static final class C64099a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShopHotSellView f181744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64099a(FinderLiveShopHotSellView finderLiveShopHotSellView, C15601d<? super C64099a> dVar) {
            super(2, dVar);
            this.f181744d = finderLiveShopHotSellView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64099a(this.f181744d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64099a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C48714ah2 ah22;
            String str;
            String l;
            ResultKt.throwOnFailure(obj);
            FinderLiveShopHotSellView finderLiveShopHotSellView = this.f181744d;
            int i = FinderLiveShopHotSellView.f160927I;
            finderLiveShopHotSellView.getClass();
            C62042e eVar = C62042e.f176370a;
            StringBuilder sb = new StringBuilder();
            sb.append("reportExpose ");
            C64370fp1 fp12 = finderLiveShopHotSellView.f160937e;
            Long l2 = null;
            sb.append(fp12 != null ? fp12.f183177e : null);
            sb.append(' ');
            C64370fp1 fp13 = finderLiveShopHotSellView.f160937e;
            if (fp13 != null) {
                l2 = Long.valueOf(fp13.f183176d);
            }
            sb.append(l2);
            eVar.mo86998D1("FinderLiveShopHotSellView", sb.toString());
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w wVar = (C54116w) c;
            C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionHotSellExpose;
            C64370fp1 fp14 = finderLiveShopHotSellView.f160937e;
            String str2 = "";
            String str3 = (fp14 == null || (l = Long.valueOf(fp14.f183176d).toString()) == null) ? str2 : l;
            C61866i0 i0Var = C61866i0.f175909a;
            FinderLiveShopHotSellView.C56311c cVar = finderLiveShopHotSellView.f160945p;
            if (!(cVar == null || (ah22 = cVar.f160963b) == null || (str = ah22.f130531g) == null)) {
                str2 = str;
            }
            C54116w.Rx0(wVar, r0Var, (String) null, str3, (String) null, (String) null, (String) null, 0, 0, i0Var.mo86793d(str2, finderLiveShopHotSellView.f160937e), WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64098l(FinderLiveShopHotSellView finderLiveShopHotSellView, FinderLiveShopHotSellView.C56311c cVar, C15601d<? super C64098l> dVar) {
        super(2, dVar);
        this.f181742f = finderLiveShopHotSellView;
        this.f181743g = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C64098l lVar = new C64098l(this.f181742f, this.f181743g, dVar);
        lVar.f181741e = obj;
        return lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64098l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
        r2 = ((java.lang.Boolean) r2).booleanValue();
        r10 = r0.f181742f;
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r10, 1, r10.f160946q.f160956a, r2, false);
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r0.f181742f, 2, 0, false, true);
        r0.f181740d = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        if (a14.C53965x0.m60607b((long) r0.f181742f.f160946q.f160958c, r0) != r1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r2 = r0.f181742f;
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2, 2, r2.f160946q.f160958c, true, false);
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r0.f181742f, 3, 0, false, true);
        r2 = r0.f181742f;
        r6 = r0.f181743g;
        r10 = r2.f160946q;
        r0.f181740d = 3;
        r2 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64540l(r2, r6, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ee, code lost:
        if (r2 != r1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f1, code lost:
        r2 = ((java.lang.Boolean) r2).booleanValue();
        r6 = r0.f181742f;
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r6, 3, r6.f160946q.f160959d, r2, false);
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0101, code lost:
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2.f181742f, 4, 0, false, true);
        r5 = r2.f181742f;
        r6 = r2.f181743g;
        r2.f181740d = 4;
        r5 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64539k(r5, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0110, code lost:
        if (r5 != r1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2.f181742f, 4, 0, ((java.lang.Boolean) r5).booleanValue(), false);
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2.f181742f, 5, 0, false, true);
        r5 = np1.C61866i0.f175909a;
        r10 = r2.f181743g;
        r11 = r10.f160965d;
        r10 = r10.f160963b;
        r5.getClass();
        gy3.C87412m.m108594g(r10, "hotSellingOptions");
        r5 = r10.f130530f;
        gy3.C87412m.m108593f(r5, "hotSellingOptions.display_time_level");
        r5 = sx3.C110818d0.m150916N(r5);
        r10 = r10.f130530f;
        gy3.C87412m.m108593f(r10, "hotSellingOptions.display_time_level");
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0148, code lost:
        r13 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014e, code lost:
        if (r10.hasNext() == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0150, code lost:
        r12 = (te3.C49515g50) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0158, code lost:
        if (r11 > r12.f133855d) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015a, code lost:
        r5 = (te3.C49515g50) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015c, code lost:
        if (r5 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015e, code lost:
        r13 = r5.f133856e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0161, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        r5 = (te3.C49515g50) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0165, code lost:
        if (r5 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0167, code lost:
        r13 = r5.f133856e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2.f181742f, 5, r13, true, false);
        r2.f181740d = 5;
        r5 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64541m(r2.f181742f, (long) r13, 500, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
        if (r5 != r1) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0183, code lost:
        if (((java.lang.Boolean) r5).booleanValue() != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0185, code lost:
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2.f181742f, 6, 0, false, true);
        r4 = r2.f181742f;
        r5 = r4.f160946q;
        r2.f181740d = 6;
        r4 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64531c(r4, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0194, code lost:
        if (r4 != r1) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0196, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0197, code lost:
        r1 = ((java.lang.Boolean) r4).booleanValue();
        r4 = r2.f181742f;
        com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r4, 6, r4.f160946q.f160961f, r1, false);
        r2.f181742f.f160949t = 0;
        r1 = r2.f181742f.f160947r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ae, code lost:
        if (r1 == null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
        r1.mo78784a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b3, code lost:
        r2.f181742f.f160947r = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b9, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181740d
            r3 = 6
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0042;
                case 1: goto L_0x003c;
                case 2: goto L_0x0037;
                case 3: goto L_0x0030;
                case 4: goto L_0x0028;
                case 5: goto L_0x0020;
                case 6: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r17)
            r4 = r17
            r2 = r0
            goto L_0x0197
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r17)
            r5 = r17
            r2 = r0
            goto L_0x017d
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r17)
            r5 = r17
            r2 = r0
            goto L_0x0113
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L_0x00f1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x00d4
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L_0x00b0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.f181741e
            r10 = r2
            a14.n0 r10 = (a14.C0000n0) r10
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            int r11 = r2.f160948s
            if (r11 > 0) goto L_0x0090
            int r11 = r2.getMeasuredWidth()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r11.intValue()
            if (r12 <= 0) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            if (r12 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r11 = r7
        L_0x0065:
            if (r11 == 0) goto L_0x006c
            int r11 = r11.intValue()
            goto L_0x0076
        L_0x006c:
            android.content.Context r11 = r2.getContext()
            r12 = 80
            int r11 = kg3.C76577a.m92151b(r11, r12)
        L_0x0076:
            r2.f160948s = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "initRootWidth rootWidth:"
            r11.append(r12)
            int r2 = r2.f160948s
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            java.lang.String r11 = "FinderLiveShopHotSellView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
        L_0x0090:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2, r8, r9, r9, r8)
            r11 = 0
            r12 = 0
            sp1.l$a r13 = new sp1.l$a
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            r13.<init>(r2, r7)
            r14 = 3
            r15 = 0
            a14.C53895h.m60464b(r10, r11, r12, r13, r14, r15)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r10 = r2.f160946q
            r0.f181740d = r8
            java.lang.Object r2 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64530b(r2, r10, r0)
            if (r2 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r10 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r11 = r10.f160946q
            int r11 = r11.f160956a
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r10, r8, r11, r2, r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2, r6, r9, r9, r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r2 = r2.f160946q
            int r2 = r2.f160958c
            long r10 = (long) r2
            r0.f181740d = r6
            java.lang.Object r2 = a14.C53965x0.m60607b(r10, r0)
            if (r2 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r10 = r2.f160946q
            int r10 = r10.f160958c
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2, r6, r10, r8, r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r2, r5, r9, r9, r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r2 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r6 = r0.f181743g
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r10 = r2.f160946q
            r0.f181740d = r5
            java.lang.Object r2 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64540l(r2, r6, r10, r0)
            if (r2 != r1) goto L_0x00f1
            return r1
        L_0x00f1:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r6 = r0.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r10 = r6.f160946q
            int r10 = r10.f160959d
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r6, r5, r10, r2, r9)
            r2 = r0
        L_0x0101:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r5 = r2.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r5, r4, r9, r9, r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r5 = r2.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r6 = r2.f181743g
            r2.f181740d = r4
            java.lang.Object r5 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64539k(r5, r6, r2)
            if (r5 != r1) goto L_0x0113
            return r1
        L_0x0113:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r6 = r2.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r6, r4, r9, r5, r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r5 = r2.f181742f
            r6 = 5
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r5, r6, r9, r9, r8)
            np1.i0 r5 = np1.C61866i0.f175909a
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r10 = r2.f181743g
            int r11 = r10.f160965d
            te3.ah2 r10 = r10.f160963b
            r5.getClass()
            java.lang.String r5 = "hotSellingOptions"
            gy3.C87412m.m108594g(r10, r5)
            java.util.LinkedList<te3.g50> r5 = r10.f130530f
            java.lang.String r12 = "hotSellingOptions.display_time_level"
            gy3.C87412m.m108593f(r5, r12)
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            java.util.LinkedList<te3.g50> r10 = r10.f130530f
            gy3.C87412m.m108593f(r10, r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x0148:
            boolean r12 = r10.hasNext()
            r13 = 3000(0xbb8, float:4.204E-42)
            if (r12 == 0) goto L_0x0163
            java.lang.Object r12 = r10.next()
            te3.g50 r12 = (te3.C49515g50) r12
            int r14 = r12.f133855d
            if (r11 > r14) goto L_0x0161
            te3.g50 r5 = (te3.C49515g50) r5
            if (r5 == 0) goto L_0x0169
            int r13 = r5.f133856e
            goto L_0x0169
        L_0x0161:
            r5 = r12
            goto L_0x0148
        L_0x0163:
            te3.g50 r5 = (te3.C49515g50) r5
            if (r5 == 0) goto L_0x0169
            int r13 = r5.f133856e
        L_0x0169:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r5 = r2.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r5, r6, r13, r8, r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r10 = r2.f181742f
            long r11 = (long) r13
            r13 = 500(0x1f4, double:2.47E-321)
            r2.f181740d = r6
            r15 = r2
            java.lang.Object r5 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64541m(r10, r11, r13, r15)
            if (r5 != r1) goto L_0x017d
            return r1
        L_0x017d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0101
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r4 = r2.f181742f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r4, r3, r9, r9, r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r4 = r2.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r5 = r4.f160946q
            r2.f181740d = r3
            java.lang.Object r4 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64531c(r4, r5, r2)
            if (r4 != r1) goto L_0x0197
            return r1
        L_0x0197:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r4 = r2.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r5 = r4.f160946q
            int r5 = r5.f160961f
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64529a(r4, r3, r5, r1, r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r1 = r2.f181742f
            r1.f160949t = r9
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r1 = r2.f181742f
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$a r1 = r1.f160947r
            if (r1 == 0) goto L_0x01b3
            r1.mo78784a()
        L_0x01b3:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r1 = r2.f181742f
            r1.f160947r = r7
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64098l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
