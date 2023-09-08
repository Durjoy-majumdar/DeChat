package ds0;

import a14.C0000n0;
import as0.C39633a;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import fy3.C32227p;
import gy3.C8479f0;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage$initContentArea$3", mo125469f = "AppBrandPrivacyUseRecordPage.kt", mo125470l = {193}, mo125471m = "invokeSuspend")
/* renamed from: ds0.d */
public final class C45445d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f122996d;

    /* renamed from: e */
    public Object f122997e;

    /* renamed from: f */
    public Object f122998f;

    /* renamed from: g */
    public Object f122999g;

    /* renamed from: h */
    public Object f123000h;

    /* renamed from: i */
    public Object f123001i;

    /* renamed from: j */
    public Object f123002j;

    /* renamed from: n */
    public Object f123003n;

    /* renamed from: o */
    public Object f123004o;

    /* renamed from: p */
    public Object f123005p;

    /* renamed from: q */
    public int f123006q;

    /* renamed from: r */
    public final /* synthetic */ AppBrandPrivacyUseRecordPage f123007r;

    /* renamed from: s */
    public final /* synthetic */ C89779i0 f123008s;

    /* renamed from: t */
    public final /* synthetic */ C39633a f123009t;

    /* renamed from: u */
    public final /* synthetic */ C8479f0<Integer> f123010u;

    /* renamed from: v */
    public final /* synthetic */ C45447i f123011v;

    /* renamed from: w */
    public final /* synthetic */ LoadMoreRecyclerView f123012w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45445d(AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage, C89779i0 i0Var, C39633a aVar, C8479f0<Integer> f0Var, C45447i iVar, LoadMoreRecyclerView loadMoreRecyclerView, C15601d<? super C45445d> dVar) {
        super(2, dVar);
        this.f123007r = appBrandPrivacyUseRecordPage;
        this.f123008s = i0Var;
        this.f123009t = aVar;
        this.f123010u = f0Var;
        this.f123011v = iVar;
        this.f123012w = loadMoreRecyclerView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45445d(this.f123007r, this.f123008s, this.f123009t, this.f123010u, this.f123011v, this.f123012w, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45445d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f123006q
            java.lang.String r2 = "MicroMsg.AppBrandPrivacyUseRecordPage"
            r3 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r3) goto L_0x0039
            java.lang.Object r0 = r14.f123005p
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r0 = (com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) r0
            java.lang.Object r1 = r14.f123004o
            ds0.i r1 = (ds0.C45447i) r1
            java.lang.Object r4 = r14.f123003n
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r5 = r14.f123002j
            com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r5 = (com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage) r5
            java.lang.Object r6 = r14.f123001i
            as0.a r6 = (as0.C39633a) r6
            java.lang.Object r7 = r14.f123000h
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r7 = (com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) r7
            java.lang.Object r8 = r14.f122999g
            ds0.i r8 = (ds0.C45447i) r8
            java.lang.Object r9 = r14.f122998f
            gy3.f0 r9 = (gy3.C8479f0) r9
            java.lang.Object r10 = r14.f122997e
            com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r10 = (com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage) r10
            java.lang.Object r11 = r14.f122996d
            as0.a r11 = (as0.C39633a) r11
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0037 }
            goto L_0x007f
        L_0x0037:
            r15 = move-exception
            goto L_0x0089
        L_0x0039:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r15)
            as0.a r6 = r14.f123009t
            com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r5 = r14.f123007r
            gy3.f0<java.lang.Integer> r4 = r14.f123010u
            ds0.i r1 = r14.f123011v
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r15 = r14.f123012w
            ds0.h r7 = ds0.C31278h.f83758a     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = r5.f108933d     // Catch:{ Exception -> 0x0082 }
            if (r8 != 0) goto L_0x0056
            java.lang.String r8 = ""
        L_0x0056:
            r9 = 0
            r10 = 0
            r12 = 6
            r13 = 0
            r14.f122996d = r6     // Catch:{ Exception -> 0x0082 }
            r14.f122997e = r5     // Catch:{ Exception -> 0x0082 }
            r14.f122998f = r4     // Catch:{ Exception -> 0x0082 }
            r14.f122999g = r1     // Catch:{ Exception -> 0x0082 }
            r14.f123000h = r15     // Catch:{ Exception -> 0x0082 }
            r14.f123001i = r6     // Catch:{ Exception -> 0x0082 }
            r14.f123002j = r5     // Catch:{ Exception -> 0x0082 }
            r14.f123003n = r4     // Catch:{ Exception -> 0x0082 }
            r14.f123004o = r1     // Catch:{ Exception -> 0x0082 }
            r14.f123005p = r15     // Catch:{ Exception -> 0x0082 }
            r14.f123006q = r3     // Catch:{ Exception -> 0x0082 }
            r11 = r14
            java.lang.Object r7 = ds0.C31278h.m39349a(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0082 }
            if (r7 != r0) goto L_0x0078
            return r0
        L_0x0078:
            r0 = r15
            r8 = r1
            r9 = r4
            r10 = r5
            r11 = r6
            r15 = r7
            r7 = r0
        L_0x007f:
            te3.a55 r15 = (te3.a55) r15     // Catch:{ Exception -> 0x0037 }
            goto L_0x00a3
        L_0x0082:
            r0 = move-exception
            r7 = r15
            r15 = r0
            r8 = r1
            r9 = r4
            r10 = r5
            r11 = r6
        L_0x0089:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initContentArea, fetch fail since "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r15)
            r15 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
        L_0x00a3:
            int r7 = com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage.f108932e
            r7 = 0
            if (r15 == 0) goto L_0x00df
            java.util.LinkedList<te3.x75> r8 = r15.f130322d
            if (r8 == 0) goto L_0x00b5
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r8 = 0
            goto L_0x00b6
        L_0x00b5:
            r8 = 1
        L_0x00b6:
            if (r8 == 0) goto L_0x00b9
            goto L_0x00df
        L_0x00b9:
            r5.getClass()
            int r2 = r15.f130323e
            if (r3 != r2) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            r6.mo62189a(r3)
            java.lang.Integer r2 = r5.mo63407K(r15)
            r4.f27484d = r2
            java.util.LinkedList<te3.x75> r15 = r15.f130322d
            java.lang.String r2 = "resp.record_list"
            gy3.C87412m.m108593f(r15, r2)
            r1.mo70943F4(r15)
            ds0.e r15 = new ds0.e
            r15.<init>(r0)
            r0.post(r15)
            goto L_0x00fd
        L_0x00df:
            java.lang.String r15 = "onFirstTimesFetched, resp is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            java.lang.String r15 = "showEmptyView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            r0.setPadding(r7, r7, r7, r7)
            android.view.LayoutInflater r15 = r5.getLayoutInflater()
            r1 = 2131493122(0x7f0c0102, float:1.8609715E38)
            android.view.View r15 = r15.inflate(r1, r0, r7)
            if (r15 == 0) goto L_0x00fd
            r0.addHeaderView(r15)
        L_0x00fd:
            qo3.i0 r15 = r14.f123008s
            r15.dismiss()
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ds0.C45445d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
