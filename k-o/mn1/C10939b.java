package mn1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.FinderNearbyRefreshEvent;
import com.tencent.p014mm.autogen.events.FinderNewEntranceNotifyInsertEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fn1.C8166a;
import fn1.C8168b;
import fn1.C8171c;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hn1.C8614b;
import i31.C117134d;
import it1.C60625c;
import it1.C9256k;
import j31.C117294b;
import j31.C9276a;
import jn1.C9476a;
import jn1.C9479b;
import jp3.C9487b;
import kotlin.ResultKt;
import oe1.C35152b;
import p185kq.C61130g;
import pe3.C89349b;
import ps3.C12005b;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49548ge1;
import te3.C49712hj1;
import te3.C51942x91;
import te3.C64414h71;
import vc1.C37715b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C86522b
/* renamed from: mn1.b */
public final class C10939b extends C86301e implements C12005b {

    /* renamed from: d */
    public IResponse<?> f32596d;

    /* renamed from: e */
    public long f32597e;

    /* renamed from: f */
    public boolean f32598f;

    /* renamed from: g */
    public boolean f32599g;

    /* renamed from: h */
    public C53973z1 f32600h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.service.impl.NearbyRefreshServiceImpl$clearNewEntranceCache$1", mo125469f = "NearbyRefreshServiceImpl.kt", mo125470l = {60}, mo125471m = "invokeSuspend")
    /* renamed from: mn1.b$a */
    public static final class C10940a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f32601d;

        /* renamed from: e */
        public final /* synthetic */ C10939b f32602e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10940a(C10939b bVar, C15601d<? super C10940a> dVar) {
            super(2, dVar);
            this.f32602e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10940a(this.f32602e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10940a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f32601d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C117294b a = C9276a.f29023b.mo10053a().mo10052a("7312+1");
                C8168b bVar = a instanceof C8168b ? (C8168b) a : null;
                if (bVar != null) {
                    this.f32601d = 1;
                    if (bVar.mo9228j(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f32602e.f32600h = null;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.service.impl.NearbyRefreshServiceImpl$requestRefreshNewEntrance$1", mo125469f = "NearbyRefreshServiceImpl.kt", mo125470l = {144}, mo125471m = "invokeSuspend")
    /* renamed from: mn1.b$b */
    public static final class C10941b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f32603d;

        /* renamed from: e */
        public /* synthetic */ Object f32604e;

        /* renamed from: f */
        public final /* synthetic */ boolean f32605f;

        /* renamed from: g */
        public final /* synthetic */ boolean f32606g;

        /* renamed from: mn1.b$b$a */
        public static final class C10942a extends C87413o implements C32224a<C60625c<C49548ge1>> {

            /* renamed from: d */
            public final /* synthetic */ boolean f32607d;

            /* renamed from: e */
            public final /* synthetic */ boolean f32608e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10942a(boolean z, boolean z2) {
                super(0);
                this.f32607d = z;
                this.f32608e = z2;
            }

            public Object invoke() {
                FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
                C55718s0 G5 = Nx0.mo77227G5("FinderLiveEntrance");
                if (!(G5 == null || G5.mo77308o2("FinderLiveEntrance") == null || G5.field_ctrInfo.f144670e != 16)) {
                    Nx0.mo77242O(G5);
                }
                return new C8166a(new C8166a.C8167a(this.f32607d ? 21 : this.f32608e ? 0 : 3, 0, (C89349b) null, 76, C64186f0.f181907d, 135, 0, (C64414h71) null), (C49712hj1) null, (C9487b) null, 6, (C8480h) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10941b(boolean z, boolean z2, C15601d<? super C10941b> dVar) {
            super(2, dVar);
            this.f32605f = z;
            this.f32606g = z2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10941b bVar = new C10941b(this.f32605f, this.f32606g, dVar);
            bVar.f32604e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10941b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f32603d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10942a aVar2 = new C10942a(this.f32605f, this.f32606g);
                C66212f coroutineContext = ((C0000n0) this.f32604e).getCoroutineContext();
                int i2 = C53973z1.f151221b0;
                C8171c cVar = new C8171c(aVar2, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null);
                this.f32603d = 1;
                if (C117134d.m165172f(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: Gx */
    public void mo11141Gx() {
        this.f32600h = C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C10940a(this, (C15601d<? super C10940a>) null), 3, (Object) null);
    }

    public void K60(long j, boolean z) {
        String str;
        IResponse iResponse;
        IResponse iResponse2;
        long j2 = j;
        boolean z2 = z;
        String gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
        Log.m105924i("NearbyRefreshServiceImp", "requestRefresh " + j2 + " isFromRed: " + z2 + " isEventRegist: " + this.f32598f + " scene: " + gK);
        this.f32597e = j2;
        this.f32599g = z2;
        if (!this.f32598f) {
            C8614b bVar = C8614b.f27717a;
            C51942x91 x912 = new C51942x91();
            x912.f144531d = 88890;
            C9479b c = bVar.mo9478c(x912);
            if (c != null) {
                if (c.f29562n != C9476a.C9477a.OK) {
                    C9256k<T> kVar = c.f29558g;
                    if (!(kVar != null && kVar.f29000a == 0 && kVar.f29001b == 0)) {
                        String str2 = c.f29555d;
                        Log.m105924i(str2, "fetchRelatedRecommendList getLoadingState: " + c.f29562n);
                    }
                }
                int i = c.f29572o;
                int i2 = c.f29573p.f144531d;
                int i3 = 1005000 + i2 + i;
                int i4 = i2 + 1001;
                String str3 = c.f29555d;
                StringBuilder sb = new StringBuilder();
                sb.append("fetchRelatedRecommendList relatedObjectId: ");
                sb.append(j2);
                sb.append(" lastBuffer = ");
                C9256k<T> kVar2 = c.f29558g;
                sb.append((kVar2 == null || (iResponse2 = (IResponse) kVar2.f29003d) == null) ? null : iResponse2.getLastBuffer());
                Log.m105924i(str3, sb.toString());
                C51942x91 x913 = c.f29573p;
                C9256k<T> kVar3 = c.f29558g;
                NearbyLiveFeedLoader.C3277c cVar = r1;
                str = gK;
                NearbyLiveFeedLoader.C3277c cVar2 = new NearbyLiveFeedLoader.C3277c(16, x913, (kVar3 == null || (iResponse = (IResponse) kVar3.f29003d) == null) ? null : iResponse.getLastBuffer(), i3, i4, c.f29572o, (String) null, 0, j, 192, (C8480h) null);
                c.mo10169j(cVar, (NearbyLiveFeedLoader.C3273a) null);
            }
            str = gK;
        } else {
            str = gK;
            FinderNearbyRefreshEvent finderNearbyRefreshEvent = new FinderNearbyRefreshEvent();
            finderNearbyRefreshEvent.f9229d.f9230a = j2;
            finderNearbyRefreshEvent.publish();
        }
        if (C87412m.m108589b(str, "135") || z) {
            FinderNewEntranceNotifyInsertEvent finderNewEntranceNotifyInsertEvent = new FinderNewEntranceNotifyInsertEvent();
            finderNewEntranceNotifyInsertEvent.f9231d.f9232a = j2;
            finderNewEntranceNotifyInsertEvent.publish();
        }
    }

    /* renamed from: NJ */
    public void mo11143NJ() {
        C9479b.f29571u = 1;
    }

    public void Nk0(Object obj) {
        if (this.f32598f) {
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.IResponse<*>");
            this.f32596d = (IResponse) obj;
            C37715b bVar = C37715b.f99914a;
            boolean z = true;
            if (C35152b.f94274b.mo60266n().intValue() != 1) {
                z = false;
            }
            Log.m105924i("NearbyRefreshServiceImp", "saveResponse " + this.f32596d + " isEnableAnimReplace: " + z);
            if (!z) {
                mo11146w0();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r4 != false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: ue */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11145ue(boolean r14) {
        /*
            r13 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            java.lang.String r1 = "FinderLiveEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.mo77227G5(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0026
            te3.nn1 r1 = r0.mo77308o2(r1)
            if (r1 == 0) goto L_0x0026
            te3.xi1 r1 = r0.field_ctrInfo
            int r1 = r1.f144670e
            r3 = 16
            if (r1 != r3) goto L_0x0026
            te3.yi1 r0 = r0.f158585F
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0031
            int r0 = r0.f186559t
            if (r0 != r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            j31.a$b r4 = j31.C9276a.f29023b
            j31.a r4 = r4.mo10053a()
            java.lang.String r5 = "7312+1"
            j31.b r4 = r4.mo10052a(r5)
            boolean r5 = r4 instanceof fn1.C8168b
            if (r5 == 0) goto L_0x0045
            fn1.b r4 = (fn1.C8168b) r4
            goto L_0x0046
        L_0x0045:
            r4 = r2
        L_0x0046:
            xm1.a r5 = xm1.C15819a.f42619a
            boolean r5 = r5.mo14502a()
            if (r14 == 0) goto L_0x0070
            if (r4 == 0) goto L_0x006e
            _result r6 = r4.f29027b
            if (r6 == 0) goto L_0x005a
            boolean r6 = r4.mo380g()
            if (r6 != 0) goto L_0x0069
        L_0x005a:
            a14.u0<? extends _result> r4 = r4.f29029d
            if (r4 == 0) goto L_0x0066
            boolean r4 = r4.mo74466a()
            if (r4 != r1) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x006b
        L_0x0069:
            r4 = 1
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            if (r4 != 0) goto L_0x0070
        L_0x006e:
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            long r6 = xm1.C15819a.f42620b
            if (r14 != 0) goto L_0x0088
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0088
            long r8 = xm1.C15819a.f42621c
            long r8 = r8 + r6
            long r10 = java.lang.System.currentTimeMillis()
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r8 = 1
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "requestRefreshNewEntrance: isEnterLiveRedDot="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = " , checkEnterLoad="
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = ", needEnterLoad="
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ", enablePrefetch="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r10 = ", isAutoRefresh="
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = ", preFetchInterval="
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = ", lastRespSetTime="
            r9.append(r6)
            long r6 = xm1.C15819a.f42621c
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.String r7 = "NearbyRefreshServiceImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            if (r14 == 0) goto L_0x00dc
            ln1.b r6 = ln1.C21445b.f60694a
            r9 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r10 = ""
            r6.mo33622k(r3, r9, r10)
        L_0x00dc:
            if (r5 == 0) goto L_0x0113
            if (r4 != 0) goto L_0x00e2
            if (r8 == 0) goto L_0x0113
        L_0x00e2:
            a14.z1 r4 = r13.f32600h
            if (r4 == 0) goto L_0x00ed
            boolean r4 = r4.mo74466a()
            if (r4 != r1) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 == 0) goto L_0x00f6
            java.lang.String r14 = "requestRefreshNewEntrance: is canceling"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r14)
            return
        L_0x00f6:
            long r3 = java.lang.System.currentTimeMillis()
            xm1.C15819a.f42621c = r3
            java.lang.String r1 = "requestRefreshNewEntrance: start preload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            a14.h0 r1 = a14.C53872d1.f151119c
            a14.n0 r3 = a14.C53930o0.m60554a(r1)
            r4 = 0
            r5 = 0
            mn1.b$b r6 = new mn1.b$b
            r6.<init>(r0, r14, r2)
            r7 = 3
            r8 = 0
            a14.C53895h.m60466d(r3, r4, r5, r6, r7, r8)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn1.C10939b.mo11145ue(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        r3 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r3.f29003d;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11146w0() {
        /*
            r14 = this;
            java.lang.Class<kq.g> r0 = p185kq.C61130g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.g r0 = (p185kq.C61130g) r0
            java.lang.String r0 = r0.mo33244gK()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "notifyDataChange "
            r1.append(r2)
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse<?> r2 = r14.f32596d
            r1.append(r2)
            java.lang.String r2 = " objectId: "
            r1.append(r2)
            long r2 = r14.f32597e
            r1.append(r2)
            java.lang.String r2 = " scene: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NearbyRefreshServiceImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r14.f32599g
            r2 = 0
            if (r1 == 0) goto L_0x01af
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse<?> r1 = r14.f32596d
            if (r1 != 0) goto L_0x01af
            hn1.b r1 = hn1.C8614b.f27717a
            te3.x91 r3 = new te3.x91
            r3.<init>()
            r4 = 88890(0x15b3a, float:1.24561E-40)
            r3.f144531d = r4
            jn1.b r1 = r1.mo9478c(r3)
            if (r1 == 0) goto L_0x01cb
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d r3 = r1.f29577t
            if (r3 != 0) goto L_0x005e
            java.lang.String r1 = r1.f29555d
            java.lang.String r2 = "appendRelatedRecommendList relatedRecommendResponse = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x01cb
        L_0x005e:
            it1.k<T> r3 = r1.f29558g
            if (r3 == 0) goto L_0x006d
            T r3 = r3.f29003d
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r3 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r3
            if (r3 == 0) goto L_0x006d
            java.util.List r3 = r3.getIncrementList()
            goto L_0x006e
        L_0x006d:
            r3 = r2
        L_0x006e:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L_0x0075
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x0076
        L_0x0075:
            r3 = r2
        L_0x0076:
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d r4 = r1.f29577t
            if (r4 == 0) goto L_0x007f
            java.util.List r4 = r4.getIncrementList()
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            if (r3 == 0) goto L_0x01a7
            if (r4 != 0) goto L_0x0086
            goto L_0x01a7
        L_0x0086:
            java.lang.String r5 = r1.f29555d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "dataList:\n "
            r6.append(r7)
            je1.g2 r7 = je1.C9311g2.f29093a
            java.lang.String r8 = r7.mo10063b(r3)
            r6.append(r8)
            java.lang.String r8 = " \n newList: \n "
            r6.append(r8)
            java.lang.String r7 = r7.mo10063b(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.util.Iterator r5 = r3.iterator()
            r6 = 0
            r7 = 0
        L_0x00b4:
            boolean r8 = r5.hasNext()
            r9 = -1
            r10 = 1
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r5.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r11 = r8 instanceof cm1.C0784u1
            if (r11 == 0) goto L_0x00df
            cm1.u1 r8 = (cm1.C0784u1) r8
            te3.rl1 r8 = r8.f1834d
            java.lang.String r8 = r8.f140999e
            android.content.res.Resources r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r12 = 2131833454(0x7f11326e, float:1.929999E38)
            java.lang.String r11 = r11.getString(r12)
            boolean r8 = gy3.C87412m.m108589b(r8, r11)
            if (r8 == 0) goto L_0x00df
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r8 == 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            int r7 = r7 + 1
            goto L_0x00b4
        L_0x00e6:
            r7 = -1
        L_0x00e7:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            int r7 = r5.intValue()
            if (r7 == r9) goto L_0x00f3
            r7 = 1
            goto L_0x00f4
        L_0x00f3:
            r7 = 0
        L_0x00f4:
            if (r7 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r5 = r2
        L_0x00f8:
            if (r5 == 0) goto L_0x00ff
            int r5 = r5.intValue()
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0150
            java.lang.Object r8 = r4.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            java.util.Iterator r11 = r3.iterator()
            r12 = 0
        L_0x011a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0135
            java.lang.Object r13 = r11.next()
            cm1.i2 r13 = (cm1.C0740i2) r13
            int r13 = r13.mo76f(r8)
            if (r13 != 0) goto L_0x012e
            r13 = 1
            goto L_0x012f
        L_0x012e:
            r13 = 0
        L_0x012f:
            if (r13 == 0) goto L_0x0132
            goto L_0x0136
        L_0x0132:
            int r12 = r12 + 1
            goto L_0x011a
        L_0x0135:
            r12 = -1
        L_0x0136:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            int r12 = r11.intValue()
            if (r12 != r9) goto L_0x0142
            r12 = 1
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            if (r12 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r11 = r2
        L_0x0147:
            if (r11 == 0) goto L_0x0109
            r11.intValue()
            r7.add(r8)
            goto L_0x0109
        L_0x0150:
            it1.k<T> r4 = r1.f29558g
            if (r4 == 0) goto L_0x0159
            T r4 = r4.f29003d
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r4 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r4
            goto L_0x015a
        L_0x0159:
            r4 = r2
        L_0x015a:
            if (r4 != 0) goto L_0x015d
            goto L_0x016a
        L_0x015d:
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d r6 = r1.f29577t
            if (r6 == 0) goto L_0x0166
            pe3.b r6 = r6.getLastBuffer()
            goto L_0x0167
        L_0x0166:
            r6 = r2
        L_0x0167:
            r4.setLastBuffer(r6)
        L_0x016a:
            java.lang.String r4 = r1.f29555d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "mergeInsertData startIndex = "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r8 = ", incrementSize: "
            r6.append(r8)
            int r8 = r7.size()
            r6.append(r8)
            java.lang.String r8 = " lastBuffer = "
            r6.append(r8)
            it1.k<T> r1 = r1.f29558g
            if (r1 == 0) goto L_0x0198
            T r1 = r1.f29003d
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r1 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r1
            if (r1 == 0) goto L_0x0198
            pe3.b r2 = r1.getLastBuffer()
        L_0x0198:
            r6.append(r2)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            int r5 = r5 + r10
            r3.addAll(r5, r7)
            goto L_0x01cb
        L_0x01a7:
            java.lang.String r1 = r1.f29555d
            java.lang.String r2 = "appendRelatedRecommendList list = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x01cb
        L_0x01af:
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse<?> r1 = r14.f32596d
            if (r1 == 0) goto L_0x01cb
            com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent r1 = new com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent$a r3 = r1.f9225d
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse<?> r4 = r14.f32596d
            r3.f9228c = r4
            long r4 = r14.f32597e
            r3.f9226a = r4
            boolean r4 = r14.f32599g
            r3.f9227b = r4
            r1.publish()
            r14.f32596d = r2
        L_0x01cb:
            java.lang.String r1 = "135"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x01d7
            boolean r0 = r14.f32599g
            if (r0 == 0) goto L_0x01e9
        L_0x01d7:
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent r0 = new com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent$a r1 = r0.f9233d
            long r2 = r14.f32597e
            r1.f9234a = r2
            boolean r2 = r14.f32599g
            r1.f9235b = r2
            r0.publish()
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn1.C10939b.mo11146w0():void");
    }

    /* renamed from: wX */
    public void mo11147wX(boolean z) {
        Log.m105924i("NearbyRefreshServiceImp", "markEventRegister isRegister: " + z);
        this.f32598f = z;
    }
}
