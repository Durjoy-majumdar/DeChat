package cn1;

import a14.C0000n0;
import an1.C0091d;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.BigBannerListConvert$runAutoSwitchCard$1", mo125469f = "BigBannerListConvert.kt", mo125470l = {378}, mo125471m = "invokeSuspend")
/* renamed from: cn1.l */
public final class C0852l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f2012d;

    /* renamed from: e */
    public int f2013e;

    /* renamed from: f */
    public int f2014f;

    /* renamed from: g */
    public final /* synthetic */ C0091d f2015g;

    /* renamed from: h */
    public final /* synthetic */ WxRecyclerView f2016h;

    /* renamed from: i */
    public final /* synthetic */ C0821e f2017i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0852l(C0091d dVar, WxRecyclerView wxRecyclerView, C0821e eVar, C15601d<? super C0852l> dVar2) {
        super(2, dVar2);
        this.f2015g = dVar;
        this.f2016h = wxRecyclerView;
        this.f2017i = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0852l(this.f2015g, this.f2016h, this.f2017i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0852l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f2014f
            r3 = 0
            r4 = 1
            java.lang.String r5 = "BigBannerListConvert"
            if (r2 == 0) goto L_0x0021
            if (r2 != r4) goto L_0x0019
            int r2 = r0.f2013e
            java.lang.Object r6 = r0.f2012d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r6
            kotlin.ResultKt.throwOnFailure(r20)
            r7 = r0
            goto L_0x0068
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r20)
            an1.d r2 = r0.f2015g
            java.util.ArrayList<cm1.i2> r2 = r2.f529e
            int r2 = r2.size()
            if (r2 > r4) goto L_0x0036
            java.lang.String r1 = "#onBindViewHolder auto switch card. oh, you don't need it"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0036:
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f2016h
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            if (r2 == 0) goto L_0x0111
            boolean r6 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r6 != 0) goto L_0x0044
            goto L_0x0111
        L_0x0044:
            cn1.e r6 = r0.f2017i
            r7 = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r7
            r6.getClass()
            int[] r6 = new int[r4]
            r7.mo17394A(r6)
            r6 = r6[r3]
            r7 = r0
            r18 = r6
            r6 = r2
            r2 = r18
        L_0x0059:
            r8 = 3000(0xbb8, double:1.482E-320)
            r7.f2012d = r6
            r7.f2013e = r2
            r7.f2014f = r4
            java.lang.Object r8 = a14.C53965x0.m60607b(r8, r7)
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            cn1.e r8 = r7.f2017i
            r9 = r6
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r9
            r8.getClass()
            java.lang.String r8 = "lm"
            gy3.C87412m.m108594g(r9, r8)
            int[] r8 = new int[r4]
            r9.mo17394A(r8)
            r8 = r8[r3]
            if (r2 == r8) goto L_0x00a0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#onBindViewHolder auto switch lastCheckPos="
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = " currentPos="
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = ". switch next time"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x010d
        L_0x00a0:
            an1.d r2 = r7.f2015g
            java.util.ArrayList<cm1.i2> r2 = r2.f529e
            int r2 = r2.size()
            int r2 = r2 - r4
            if (r8 >= r2) goto L_0x00ae
            int r2 = r8 + 1
            goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            com.tencent.mm.view.recyclerview.WxRecyclerView r15 = r7.f2016h
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.mo10233c(r2)
            java.lang.Object[] r10 = r14.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$runAutoSwitchCard$1"
            java.lang.String r12 = "invokeSuspend"
            java.lang.String r13 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r2 = "Undefined"
            java.lang.String r16 = "smoothScrollToPosition"
            java.lang.String r17 = "(I)V"
            r9 = r15
            r4 = r14
            r14 = r2
            r2 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.mo17149t1(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$runAutoSwitchCard$1"
            java.lang.String r11 = "invokeSuspend"
            java.lang.String r12 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "smoothScrollToPosition"
            java.lang.String r15 = "(I)V"
            r9 = r2
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "#onBindViewHolder auto switch now pos is "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
        L_0x010d:
            r2 = r8
            r4 = 1
            goto L_0x0059
        L_0x0111:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0852l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
