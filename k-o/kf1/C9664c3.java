package kf1;

import a14.C0000n0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import fy3.C32232u;
import gy3.C8477a0;
import gy3.C8479f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.FinderGetJustWatched$justWatchedLooper$1", mo125469f = "FinderGetJustWatched.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
/* renamed from: kf1.c3 */
public final class C9664c3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f30025d;

    /* renamed from: e */
    public /* synthetic */ Object f30026e;

    /* renamed from: f */
    public final /* synthetic */ C9683d3 f30027f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f30028g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.FinderGetJustWatched$justWatchedLooper$1$1$1", mo125469f = "FinderGetJustWatched.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kf1.c3$a */
    public static final class C9665a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C9683d3 f30029d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<List<BaseFinderFeed>> f30030e;

        /* renamed from: f */
        public final /* synthetic */ int f30031f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f30032g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9665a(C9683d3 d3Var, C8479f0<List<BaseFinderFeed>> f0Var, int i, C8477a0 a0Var, C15601d<? super C9665a> dVar) {
            super(2, dVar);
            this.f30029d = d3Var;
            this.f30030e = f0Var;
            this.f30031f = i;
            this.f30032g = a0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9665a(this.f30029d, this.f30030e, this.f30031f, this.f30032g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9665a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C9683d3 d3Var = this.f30029d;
            int i = d3Var.f30085n;
            if (i != 0) {
                d3Var.f30085n = i - 1;
                d3Var.f30076e += ((List) this.f30030e.f27484d).size();
            } else {
                ArrayList<C0740i2> arrayList = d3Var.f30080i;
                if (arrayList != null) {
                    arrayList.addAll((Collection) this.f30030e.f27484d);
                }
            }
            int size = ((this.f30031f + this.f30029d.f30080i.size()) + this.f30029d.f30076e) - ((List) this.f30030e.f27484d).size();
            C32232u<Boolean, Long, Boolean, ArrayList<C0740i2>, C89349b, Integer, Boolean, C13598b0> uVar = this.f30029d.f30078g;
            if (uVar != null) {
                Boolean valueOf = Boolean.valueOf(this.f30032g.f27482d);
                Long l = new Long(this.f30029d.f30083l);
                Boolean valueOf2 = Boolean.valueOf(this.f30029d.f30082k);
                C9683d3 d3Var2 = this.f30029d;
                uVar.invoke(valueOf, l, valueOf2, d3Var2.f30080i, d3Var2.f30081j, new Integer(size), Boolean.valueOf(this.f30029d.f30075d));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.FinderGetJustWatched$justWatchedLooper$1$2", mo125469f = "FinderGetJustWatched.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kf1.c3$b */
    public static final class C9666b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f30033d;

        /* renamed from: e */
        public final /* synthetic */ C9683d3 f30034e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9666b(C8477a0 a0Var, C9683d3 d3Var, C15601d<? super C9666b> dVar) {
            super(2, dVar);
            this.f30033d = a0Var;
            this.f30034e = d3Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9666b(this.f30033d, this.f30034e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9666b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f30033d.f27482d = true;
            C32232u<Boolean, Long, Boolean, ArrayList<C0740i2>, C89349b, Integer, Boolean, C13598b0> uVar = this.f30034e.f30078g;
            if (uVar != null) {
                Long l = new Long(this.f30034e.f30083l);
                Boolean valueOf = Boolean.valueOf(this.f30034e.f30082k);
                C9683d3 d3Var = this.f30034e;
                uVar.invoke(true, l, valueOf, d3Var.f30080i, d3Var.f30081j, new Integer(-2), Boolean.TRUE);
            }
            Log.m105924i("Finder.FinderGetJustWatched", "justWatched request ERROR");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9664c3(C9683d3 d3Var, C8477a0 a0Var, C15601d<? super C9664c3> dVar) {
        super(2, dVar);
        this.f30027f = d3Var;
        this.f30028g = a0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C9664c3 c3Var = new C9664c3(this.f30027f, this.f30028g, dVar);
        c3Var.f30026e = obj;
        return c3Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9664c3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ Exception -> 0x0017 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1 A[Catch:{ Exception -> 0x0017 }, LOOP:1: B:33:0x00bb->B:35:0x00c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A[Catch:{ Exception -> 0x0017 }, LOOP:2: B:37:0x00dc->B:39:0x00e2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104 A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013a A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013c A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145 A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bb A[Catch:{ Exception -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0130 A[EDGE_INSN: B:94:0x0130->B:49:0x0130 ?: BREAK  , SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f30025d
            r4 = 1
            if (r2 == 0) goto L_0x0022
            if (r2 != r4) goto L_0x001a
            java.lang.Object r2 = r0.f30026e
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r27)     // Catch:{ Exception -> 0x0016 }
            r3 = r27
            r12 = r0
            goto L_0x0073
        L_0x0016:
            r12 = r0
        L_0x0017:
            r5 = r2
            goto L_0x01df
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r27)
            java.lang.Object r2 = r0.f30026e
            a14.n0 r2 = (a14.C0000n0) r2
            r12 = r0
        L_0x002a:
            kf1.d3 r5 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            int r6 = r5.f30086o     // Catch:{ Exception -> 0x0017 }
            int r7 = r6 + -1
            r5.f30086o = r7     // Catch:{ Exception -> 0x0017 }
            if (r6 == 0) goto L_0x01f3
            boolean r6 = r5.f30075d     // Catch:{ Exception -> 0x0017 }
            if (r6 != 0) goto L_0x01f3
            boolean r6 = r5.f30082k     // Catch:{ Exception -> 0x0017 }
            if (r6 == 0) goto L_0x01f3
            boolean r5 = r5.f30087p     // Catch:{ Exception -> 0x0017 }
            if (r5 != 0) goto L_0x01f3
            je1.q1 r5 = new je1.q1     // Catch:{ Exception -> 0x0017 }
            kf1.d3 r6 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            java.lang.String r14 = r6.f30072a     // Catch:{ Exception -> 0x0017 }
            long r7 = r6.f30083l     // Catch:{ Exception -> 0x0017 }
            pe3.b r9 = r6.f30081j     // Catch:{ Exception -> 0x0017 }
            te3.hj1 r10 = r6.f30074c     // Catch:{ Exception -> 0x0017 }
            long r3 = r6.f30073b     // Catch:{ Exception -> 0x0017 }
            r18 = 1
            java.lang.String r22 = ""
            r23 = 0
            r25 = 0
            r13 = r5
            r15 = r7
            r17 = r9
            r19 = r10
            r20 = r3
            r13.<init>(r14, r15, r17, r18, r19, r20, r22, r23, r25)     // Catch:{ Exception -> 0x0017 }
            r6 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            r12.f30026e = r2     // Catch:{ Exception -> 0x0017 }
            r3 = 1
            r12.f30025d = r3     // Catch:{ Exception -> 0x0017 }
            r9 = r12
            java.lang.Object r3 = q40.C89456b.m111831a(r5, r6, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0017 }
            if (r3 != r1) goto L_0x0073
            return r1
        L_0x0073:
            com.tencent.mm.protocal.protobuf.FinderUserPageResponse r3 = (com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse) r3     // Catch:{ Exception -> 0x0017 }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r3.object     // Catch:{ Exception -> 0x0017 }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x0017 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0017 }
            r5.<init>()     // Catch:{ Exception -> 0x0017 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0017 }
        L_0x0083:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0017 }
            if (r6 == 0) goto L_0x009c
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0017 }
            r7 = r6
            com.tencent.mm.protocal.protobuf.FinderObject r7 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r7     // Catch:{ Exception -> 0x0017 }
            er1.w3 r8 = er1.C58784w3.f168295a     // Catch:{ Exception -> 0x0017 }
            boolean r7 = r8.mo83866E0(r7)     // Catch:{ Exception -> 0x0017 }
            if (r7 == 0) goto L_0x0083
            r5.add(r6)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0083
        L_0x009c:
            wp1.f$a r4 = wp1.C15585f.f42211a     // Catch:{ Exception -> 0x0017 }
            r6 = 2
            kf1.d3 r7 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            te3.hj1 r7 = r7.f30074c     // Catch:{ Exception -> 0x0017 }
            java.util.List r4 = r4.mo14343f(r5, r6, r7)     // Catch:{ Exception -> 0x0017 }
            gy3.f0 r11 = new gy3.f0     // Catch:{ Exception -> 0x0017 }
            r11.<init>()     // Catch:{ Exception -> 0x0017 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0017 }
            r6 = 10
            int r6 = sx3.C36907w.m41090l(r4, r6)     // Catch:{ Exception -> 0x0017 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0017 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0017 }
        L_0x00bb:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0017 }
            if (r6 == 0) goto L_0x00d1
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0017 }
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r6     // Catch:{ Exception -> 0x0017 }
            wp1.f$a r7 = wp1.C15585f.f42211a     // Catch:{ Exception -> 0x0017 }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r7.mo14348k(r6)     // Catch:{ Exception -> 0x0017 }
            r5.add(r6)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00bb
        L_0x00d1:
            kf1.d3 r4 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0017 }
            r6.<init>()     // Catch:{ Exception -> 0x0017 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0017 }
        L_0x00dc:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0017 }
            if (r7 == 0) goto L_0x00f0
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0017 }
            r8 = r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8     // Catch:{ Exception -> 0x0017 }
            r4.getClass()     // Catch:{ Exception -> 0x0017 }
            r6.add(r7)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00dc
        L_0x00f0:
            r11.f27484d = r6     // Catch:{ Exception -> 0x0017 }
            kf1.d3 r4 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            pe3.b r5 = r3.lastBuffer     // Catch:{ Exception -> 0x0017 }
            r4.f30081j = r5     // Catch:{ Exception -> 0x0017 }
            java.util.ArrayList<cm1.i2> r5 = r4.f30080i     // Catch:{ Exception -> 0x0017 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0017 }
            r6 = -1
            int r5 = r5 + r6
        L_0x0100:
            r7 = 0
            if (r6 >= r5) goto L_0x0130
            java.util.ArrayList<cm1.i2> r9 = r4.f30080i     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r10 = "watchedDataList[index]"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ Exception -> 0x0017 }
            cm1.i2 r9 = (cm1.C0740i2) r9     // Catch:{ Exception -> 0x0017 }
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed     // Catch:{ Exception -> 0x0017 }
            if (r10 == 0) goto L_0x012d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9     // Catch:{ Exception -> 0x0017 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r9.mo3513o()     // Catch:{ Exception -> 0x0017 }
            long r13 = r10.getId()     // Catch:{ Exception -> 0x0017 }
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x012d
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r9.mo3513o()     // Catch:{ Exception -> 0x0017 }
            long r7 = r5.getId()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0130
        L_0x012d:
            int r5 = r5 + -1
            goto L_0x0100
        L_0x0130:
            r4.f30083l = r7     // Catch:{ Exception -> 0x0017 }
            kf1.d3 r13 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            int r3 = r3.continueFlag     // Catch:{ Exception -> 0x0017 }
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x013c
            r3 = 1
            goto L_0x013d
        L_0x013c:
            r3 = 0
        L_0x013d:
            r13.f30082k = r3     // Catch:{ Exception -> 0x0017 }
            T r3 = r11.f27484d     // Catch:{ Exception -> 0x0017 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x0017 }
            if (r3 == 0) goto L_0x01b3
            gy3.a0 r14 = r12.f30028g     // Catch:{ Exception -> 0x0017 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0017 }
            r8 = 0
        L_0x014c:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0017 }
            if (r4 == 0) goto L_0x01b3
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0017 }
            int r15 = r8 + 1
            if (r8 < 0) goto L_0x01ae
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4     // Catch:{ Exception -> 0x0017 }
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed     // Catch:{ Exception -> 0x0017 }
            if (r5 == 0) goto L_0x01aa
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo3513o()     // Catch:{ Exception -> 0x0017 }
            long r5 = r5.getId()     // Catch:{ Exception -> 0x0017 }
            java.lang.Long r7 = r13.f30077f     // Catch:{ Exception -> 0x0017 }
            if (r7 != 0) goto L_0x016d
            goto L_0x01aa
        L_0x016d:
            long r9 = r7.longValue()     // Catch:{ Exception -> 0x0017 }
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01aa
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo3513o()     // Catch:{ Exception -> 0x0017 }
            boolean r5 = r5.isLiveFeed()     // Catch:{ Exception -> 0x0017 }
            if (r5 != 0) goto L_0x01aa
            r10 = 1
            r4.mo3500g0(r10)     // Catch:{ Exception -> 0x0017 }
            r13.f30075d = r10     // Catch:{ Exception -> 0x0017 }
            boolean r4 = r13.f30087p     // Catch:{ Exception -> 0x0017 }
            if (r4 != 0) goto L_0x01aa
            a14.h0 r4 = a14.C53872d1.f151117a     // Catch:{ Exception -> 0x0017 }
            a14.k2 r16 = f14.C58901s.f168555a     // Catch:{ Exception -> 0x0017 }
            r17 = 0
            kf1.c3$a r18 = new kf1.c3$a     // Catch:{ Exception -> 0x0017 }
            r4 = 0
            r5 = r18
            r6 = r13
            r7 = r11
            r9 = r14
            r19 = 1
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0017 }
            r8 = 2
            r9 = 0
            r4 = r2
            r5 = r16
            r6 = r17
            r7 = r18
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0017 }
            goto L_0x01ac
        L_0x01aa:
            r19 = 1
        L_0x01ac:
            r8 = r15
            goto L_0x014c
        L_0x01ae:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x0017 }
            r1 = 0
            throw r1     // Catch:{ Exception -> 0x0017 }
        L_0x01b3:
            r19 = 1
            kf1.d3 r3 = r12.f30027f     // Catch:{ Exception -> 0x0017 }
            boolean r4 = r3.f30075d     // Catch:{ Exception -> 0x0017 }
            if (r4 != 0) goto L_0x01dc
            int r4 = r3.f30085n     // Catch:{ Exception -> 0x0017 }
            if (r4 == 0) goto L_0x01d1
            int r4 = r4 + -1
            r3.f30085n = r4     // Catch:{ Exception -> 0x0017 }
            int r4 = r3.f30076e     // Catch:{ Exception -> 0x0017 }
            T r5 = r11.f27484d     // Catch:{ Exception -> 0x0017 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x0017 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0017 }
            int r4 = r4 + r5
            r3.f30076e = r4     // Catch:{ Exception -> 0x0017 }
            goto L_0x01dc
        L_0x01d1:
            java.util.ArrayList<cm1.i2> r3 = r3.f30080i     // Catch:{ Exception -> 0x0017 }
            if (r3 == 0) goto L_0x01dc
            T r4 = r11.f27484d     // Catch:{ Exception -> 0x0017 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ Exception -> 0x0017 }
            r3.addAll(r4)     // Catch:{ Exception -> 0x0017 }
        L_0x01dc:
            r4 = 1
            goto L_0x002a
        L_0x01df:
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            r7 = 0
            kf1.c3$b r8 = new kf1.c3$b
            gy3.a0 r1 = r12.f30028g
            kf1.d3 r2 = r12.f30027f
            r3 = 0
            r8.<init>(r1, r2, r3)
            r9 = 2
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
        L_0x01f3:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9664c3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
