package ds0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.lifecycle.C54218t;
import androidx.recyclerview.widget.RecyclerView;
import as0.C39633a;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ds0.b */
public final class C45442b implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ C39633a f122978a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandPrivacyUseRecordPage f122979b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<Integer> f122980c;

    /* renamed from: d */
    public final /* synthetic */ C45447i f122981d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage$initContentArea$1$1", mo125469f = "AppBrandPrivacyUseRecordPage.kt", mo125470l = {177}, mo125471m = "invokeSuspend")
    /* renamed from: ds0.b$a */
    public static final class C45443a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f122982d;

        /* renamed from: e */
        public Object f122983e;

        /* renamed from: f */
        public Object f122984f;

        /* renamed from: g */
        public Object f122985g;

        /* renamed from: h */
        public Object f122986h;

        /* renamed from: i */
        public Object f122987i;

        /* renamed from: j */
        public Object f122988j;

        /* renamed from: n */
        public Object f122989n;

        /* renamed from: o */
        public int f122990o;

        /* renamed from: p */
        public final /* synthetic */ C8479f0<Integer> f122991p;

        /* renamed from: q */
        public final /* synthetic */ AppBrandPrivacyUseRecordPage f122992q;

        /* renamed from: r */
        public final /* synthetic */ C39633a f122993r;

        /* renamed from: s */
        public final /* synthetic */ C45447i f122994s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45443a(C8479f0<Integer> f0Var, AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage, C39633a aVar, C45447i iVar, C15601d<? super C45443a> dVar) {
            super(2, dVar);
            this.f122991p = f0Var;
            this.f122992q = appBrandPrivacyUseRecordPage;
            this.f122993r = aVar;
            this.f122994s = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C45443a(this.f122991p, this.f122992q, this.f122993r, this.f122994s, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C45443a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r8 = r16
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f122990o
                r9 = 0
                java.lang.String r10 = "MicroMsg.AppBrandPrivacyUseRecordPage"
                r11 = 1
                if (r1 == 0) goto L_0x0040
                if (r1 != r11) goto L_0x0038
                java.lang.Object r0 = r8.f122989n
                ds0.i r0 = (ds0.C45447i) r0
                java.lang.Object r1 = r8.f122988j
                com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r1 = (com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage) r1
                java.lang.Object r2 = r8.f122987i
                gy3.f0 r2 = (gy3.C8479f0) r2
                java.lang.Object r3 = r8.f122986h
                as0.a r3 = (as0.C39633a) r3
                java.lang.Object r4 = r8.f122985g
                ds0.i r4 = (ds0.C45447i) r4
                java.lang.Object r5 = r8.f122984f
                com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r5 = (com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage) r5
                java.lang.Object r6 = r8.f122983e
                gy3.f0 r6 = (gy3.C8479f0) r6
                java.lang.Object r7 = r8.f122982d
                as0.a r7 = (as0.C39633a) r7
                kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ Exception -> 0x0035 }
                r14 = r1
                r1 = r17
                goto L_0x008e
            L_0x0035:
                r0 = move-exception
                goto L_0x0096
            L_0x0038:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0040:
                kotlin.ResultKt.throwOnFailure(r17)
                gy3.f0<java.lang.Integer> r12 = r8.f122991p
                T r1 = r12.f27484d
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L_0x0053
                java.lang.String r0 = "onLoadMore, fetchToken is null, not need"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0053:
                as0.a r13 = r8.f122993r
                com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage r14 = r8.f122992q
                ds0.i r15 = r8.f122994s
                ds0.h r2 = ds0.C31278h.f83758a     // Catch:{ Exception -> 0x0091 }
                java.lang.String r3 = r14.f108933d     // Catch:{ Exception -> 0x0091 }
                if (r3 != 0) goto L_0x0061
                java.lang.String r3 = ""
            L_0x0061:
                int r4 = r1.intValue()     // Catch:{ Exception -> 0x0091 }
                r5 = 0
                r6 = 4
                r7 = 0
                r8.f122982d = r13     // Catch:{ Exception -> 0x0091 }
                r8.f122983e = r12     // Catch:{ Exception -> 0x0091 }
                r8.f122984f = r14     // Catch:{ Exception -> 0x0091 }
                r8.f122985g = r15     // Catch:{ Exception -> 0x0091 }
                r8.f122986h = r13     // Catch:{ Exception -> 0x0091 }
                r8.f122987i = r12     // Catch:{ Exception -> 0x0091 }
                r8.f122988j = r14     // Catch:{ Exception -> 0x0091 }
                r8.f122989n = r15     // Catch:{ Exception -> 0x0091 }
                r8.f122990o = r11     // Catch:{ Exception -> 0x0091 }
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r16
                java.lang.Object r1 = ds0.C31278h.m39349a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0091 }
                if (r1 != r0) goto L_0x0087
                return r0
            L_0x0087:
                r2 = r12
                r6 = r2
                r3 = r13
                r7 = r3
                r5 = r14
                r0 = r15
                r4 = r0
            L_0x008e:
                te3.a55 r1 = (te3.a55) r1     // Catch:{ Exception -> 0x0035 }
                goto L_0x00af
            L_0x0091:
                r0 = move-exception
                r6 = r12
                r7 = r13
                r5 = r14
                r4 = r15
            L_0x0096:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onLoadMore, fetch fail since "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                r0 = r4
                r14 = r5
                r2 = r6
                r3 = r7
                r1 = r9
            L_0x00af:
                int r4 = com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage.f108932e
                r4 = 0
                if (r1 == 0) goto L_0x00e3
                java.util.LinkedList<te3.x75> r5 = r1.f130322d
                if (r5 == 0) goto L_0x00c1
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x00bf
                goto L_0x00c1
            L_0x00bf:
                r5 = 0
                goto L_0x00c2
            L_0x00c1:
                r5 = 1
            L_0x00c2:
                if (r5 == 0) goto L_0x00c5
                goto L_0x00e3
            L_0x00c5:
                r14.getClass()
                int r5 = r1.f130323e
                if (r11 != r5) goto L_0x00cd
                goto L_0x00ce
            L_0x00cd:
                r11 = 0
            L_0x00ce:
                r3.mo62189a(r11)
                java.lang.Integer r3 = r14.mo63407K(r1)
                r2.f27484d = r3
                java.util.LinkedList<te3.x75> r1 = r1.f130322d
                java.lang.String r2 = "resp.record_list"
                gy3.C87412m.m108593f(r1, r2)
                r0.mo70943F4(r1)
                goto L_0x00ee
            L_0x00e3:
                java.lang.String r0 = "onSecondTimesFetched, resp is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                r3.mo62189a(r4)
                r2.f27484d = r9
            L_0x00ee:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ds0.C45442b.C45443a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C45442b(C39633a aVar, AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage, C8479f0<Integer> f0Var, C45447i iVar) {
        this.f122978a = aVar;
        this.f122979b = appBrandPrivacyUseRecordPage;
        this.f122980c = f0Var;
        this.f122981d = iVar;
    }

    /* renamed from: a */
    public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        if (!this.f122978a.f106395e) {
            Log.m105924i("MicroMsg.AppBrandPrivacyUseRecordPage", "onLoadMore, loading is not shown");
        } else {
            C53895h.m60466d(C54218t.m60906a(this.f122979b), (C66212f) null, (C53934p0) null, new C45443a(this.f122980c, this.f122979b, this.f122978a, this.f122981d, (C15601d<? super C45443a>) null), 3, (Object) null);
        }
    }
}
