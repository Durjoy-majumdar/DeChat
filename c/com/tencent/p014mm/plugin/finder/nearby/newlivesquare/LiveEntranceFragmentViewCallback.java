package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54059a;
import an1.C0093f;
import an1.C0098k;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bn1.C0330a;
import bn1.C0331b;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ln1.C21445b;
import p565ir.C60606n;
import pm1.C62381d;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49548ge1;
import te3.C49712hj1;
import te3.C51942x91;
import te3.C52231z81;
import te3.C64414h71;
import wx3.C15601d;
import wx3.C66212f;
import xm1.C15820a0;
import xm1.C15822b0;
import xm1.C15824c0;
import xm1.C15828e;
import xm1.C15829e0;
import xm1.C15832f;
import xm1.C15852w;
import xm1.C15858z;
import ym1.C16052a;
import yx3.C91590f;
import yx3.C91594j;
import zm1.C16301e;
import zm1.C16302f;

/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback */
public final class LiveEntranceFragmentViewCallback {

    /* renamed from: A */
    public final LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1 f15696A;

    /* renamed from: B */
    public C49548ge1 f15697B;

    /* renamed from: C */
    public final C3319x38874615 f15698C;

    /* renamed from: D */
    public final LiveEntranceFragmentViewCallback$uninterestEventListener$1 f15699D;

    /* renamed from: E */
    public final LiveEntranceFragmentViewCallback$feedUpdateEventListener$1 f15700E;

    /* renamed from: F */
    public boolean f15701F;

    /* renamed from: a */
    public final MMActivity f15702a;

    /* renamed from: b */
    public final Fragment f15703b;

    /* renamed from: c */
    public final View f15704c;

    /* renamed from: d */
    public final C49712hj1 f15705d;

    /* renamed from: e */
    public final C0000n0 f15706e = C53930o0.m60555b();

    /* renamed from: f */
    public final C0000n0 f15707f = C53930o0.m60554a(C53872d1.f151119c);

    /* renamed from: g */
    public boolean f15708g;

    /* renamed from: h */
    public RecyclerView f15709h;

    /* renamed from: i */
    public final ArrayList<C0740i2> f15710i = new ArrayList<>();

    /* renamed from: j */
    public C16301e f15711j;

    /* renamed from: k */
    public WxRefreshLayout f15712k;

    /* renamed from: l */
    public final C15829e0 f15713l = new C15829e0();

    /* renamed from: m */
    public C16302f f15714m;

    /* renamed from: n */
    public C62381d f15715n;

    /* renamed from: o */
    public long f15716o;

    /* renamed from: p */
    public C49548ge1 f15717p;

    /* renamed from: q */
    public C54059a f15718q = new C54059a();

    /* renamed from: r */
    public final C16052a f15719r;

    /* renamed from: s */
    public final List<C51942x91> f15720s;

    /* renamed from: t */
    public String f15721t;

    /* renamed from: u */
    public String f15722u;

    /* renamed from: v */
    public final C3320x670f0ed f15723v;

    /* renamed from: w */
    public long f15724w;

    /* renamed from: x */
    public C64414h71 f15725x;

    /* renamed from: y */
    public long f15726y;

    /* renamed from: z */
    public final LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1 f15727z;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$a */
    public final class C3316a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f15728d = C74942w4.m89784a(MMApplicationContext.getContext(), 6);

        /* renamed from: e */
        public final int f15729e = C74942w4.m89784a(MMApplicationContext.getContext(), 12);

        public C3316a() {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            int N0 = recyclerView.mo17029N0(view);
            if (N0 >= 0 && N0 < LiveEntranceFragmentViewCallback.this.f15710i.size()) {
                C0740i2 i2Var = LiveEntranceFragmentViewCallback.this.f15710i.get(N0);
                C87412m.m108593f(i2Var, "feedDataList[position]");
                if (i2Var instanceof C0331b) {
                    boolean z = true;
                    while (N0 > 0) {
                        N0--;
                        C0740i2 i2Var2 = LiveEntranceFragmentViewCallback.this.f15710i.get(N0);
                        C87412m.m108593f(i2Var2, "feedDataList[position]");
                        if (!(i2Var2 instanceof C0331b)) {
                            break;
                        }
                        z = !z;
                    }
                    rect.left = z ? this.f15729e : this.f15728d;
                    rect.right = z ? this.f15728d : this.f15729e;
                    rect.bottom = C74942w4.m89784a(MMApplicationContext.getContext(), 12);
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$startToScrollWhereRedDotHere$1", mo125469f = "LiveEntranceFragmentViewCallback.kt", mo125470l = {1611, 1651}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$b */
    public static final class C3317b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f15731d;

        /* renamed from: e */
        public Object f15732e;

        /* renamed from: f */
        public Object f15733f;

        /* renamed from: g */
        public Object f15734g;

        /* renamed from: h */
        public int f15735h;

        /* renamed from: i */
        public int f15736i;

        /* renamed from: j */
        public final /* synthetic */ LiveEntranceFragmentViewCallback f15737j;

        /* renamed from: n */
        public final /* synthetic */ long f15738n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3317b(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, long j, C15601d<? super C3317b> dVar) {
            super(2, dVar);
            this.f15737j = liveEntranceFragmentViewCallback;
            this.f15738n = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3317b(this.f15737j, this.f15738n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3317b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
            if (r12 >= r10.f15710i.size()) goto L_0x00e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
            r8 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
            com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.m3358a(r10, r8);
            r2.f15732e = r10;
            r2.f15733f = r9;
            r2.f15734g = r14;
            r2.f15731d = r6;
            r2.f15735h = r12;
            r2.f15736i = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
            if (a14.C53965x0.m60607b(500, r2) != r1) goto L_0x00fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
            r8 = r14;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0122 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f15736i
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x002e
                if (r2 != r4) goto L_0x0026
                int r2 = r0.f15735h
                long r6 = r0.f15731d
                java.lang.Object r8 = r0.f15734g
                gy3.f0 r8 = (gy3.C8479f0) r8
                java.lang.Object r9 = r0.f15733f
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f15732e
                com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r10 = (com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback) r10
                kotlin.ResultKt.throwOnFailure(r19)
                r12 = r2
                r15 = 2
                r2 = r0
                goto L_0x00fc
            L_0x0026:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r19)
                goto L_0x0040
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r19)
                r6 = 1000(0x3e8, double:4.94E-321)
                r0.f15736i = r5
                java.lang.Object r2 = a14.C53965x0.m60607b(r6, r0)
                if (r2 != r1) goto L_0x0040
                return r1
            L_0x0040:
                com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r2 = r0.f15737j
                java.util.ArrayList<cm1.i2> r6 = r2.f15710i
                long r7 = r0.f15738n
                java.util.Iterator r6 = r6.iterator()
                r10 = r2
                r9 = r6
                r6 = r7
                r8 = 0
                r2 = r0
            L_0x004f:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x012f
                java.lang.Object r11 = r9.next()
                int r12 = r8 + 1
                r13 = 0
                if (r8 < 0) goto L_0x012b
                cm1.i2 r11 = (cm1.C0740i2) r11
                boolean r14 = r11 instanceof bn1.C0331b
                if (r14 == 0) goto L_0x008f
                r14 = r11
                bn1.b r14 = (bn1.C0331b) r14
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
                long r14 = r14.f164794id
                int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r16 != 0) goto L_0x008f
                int r11 = r8 + 2
                java.util.ArrayList<cm1.i2> r13 = r10.f15710i
                int r13 = r13.size()
                if (r11 >= r13) goto L_0x0081
                r8 = r11
                goto L_0x008a
            L_0x0081:
                java.util.ArrayList<cm1.i2> r11 = r10.f15710i
                int r11 = r11.size()
                if (r12 >= r11) goto L_0x008a
                r8 = r12
            L_0x008a:
                com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.m3358a(r10, r8)
                goto L_0x0126
            L_0x008f:
                gy3.f0 r14 = new gy3.f0
                r14.<init>()
                boolean r15 = r11 instanceof an1.C0103p
                if (r15 == 0) goto L_0x009f
                r15 = r11
                an1.p r15 = (an1.C0103p) r15
                te3.a91 r15 = r15.f545d
                r14.f27484d = r15
            L_0x009f:
                boolean r15 = r11 instanceof an1.C0091d
                if (r15 == 0) goto L_0x00a9
                an1.d r11 = (an1.C0091d) r11
                te3.a91 r11 = r11.f528d
                r14.f27484d = r11
            L_0x00a9:
                T r11 = r14.f27484d
                te3.a91 r11 = (te3.C48682a91) r11
                if (r11 == 0) goto L_0x0126
                java.util.LinkedList<te3.z81> r11 = r11.f130381h
                if (r11 == 0) goto L_0x0126
                java.util.Iterator r11 = r11.iterator()
                r15 = 0
            L_0x00b8:
                boolean r16 = r11.hasNext()
                if (r16 == 0) goto L_0x0126
                java.lang.Object r16 = r11.next()
                int r17 = r15 + 1
                if (r15 < 0) goto L_0x0122
                r15 = r16
                te3.z81 r15 = (te3.C52231z81) r15
                com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.f145756f
                if (r15 == 0) goto L_0x00d6
                long r3 = r15.f164794id
                int r15 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r15 != 0) goto L_0x00d6
                r3 = 1
                goto L_0x00d7
            L_0x00d6:
                r3 = 0
            L_0x00d7:
                if (r3 == 0) goto L_0x011e
                java.util.ArrayList<cm1.i2> r3 = r10.f15710i
                int r3 = r3.size()
                if (r12 >= r3) goto L_0x00e2
                r8 = r12
            L_0x00e2:
                com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.m3358a(r10, r8)
                r3 = 500(0x1f4, double:2.47E-321)
                r2.f15732e = r10
                r2.f15733f = r9
                r2.f15734g = r14
                r2.f15731d = r6
                r2.f15735h = r12
                r15 = 2
                r2.f15736i = r15
                java.lang.Object r3 = a14.C53965x0.m60607b(r3, r2)
                if (r3 != r1) goto L_0x00fb
                return r1
            L_0x00fb:
                r8 = r14
            L_0x00fc:
                xm1.e0 r3 = r10.f15713l
                T r4 = r8.f27484d
                te3.a91 r4 = (te3.C48682a91) r4
                int r4 = r4.f130377d
                java.util.List<xm1.e0$a> r3 = r3.f42636a
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x010c:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x011c
                java.lang.Object r8 = r3.next()
                xm1.e0$a r8 = (xm1.C15829e0.C15830a) r8
                r8.mo761b(r4, r6)
                goto L_0x010c
            L_0x011c:
                r8 = r12
                goto L_0x0128
            L_0x011e:
                r15 = r17
                r4 = 2
                goto L_0x00b8
            L_0x0122:
                sx3.C64197v.m75542k()
                throw r13
            L_0x0126:
                r15 = 2
                goto L_0x011c
            L_0x0128:
                r4 = 2
                goto L_0x004f
            L_0x012b:
                sx3.C64197v.m75542k()
                throw r13
            L_0x012f:
                com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r1 = r2.f15737j
                r1.getClass()
                java.lang.String r1 = "Finder.LiveEntranceFragmentViewCallback"
                java.lang.String r2 = "#disposeRedDotInCache"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
                java.lang.String r2 = "NearbyLiveTab"
                java.lang.String r3 = "LiveEntranceFragmentViewCallback"
                r1.mo77263e(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.C3317b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public LiveEntranceFragmentViewCallback(MMActivity mMActivity, Fragment fragment, C15832f fVar, View view, C49712hj1 hj12) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(fragment, "fragment");
        C87412m.m108594g(view, "parentView");
        C87412m.m108594g(hj12, "contextObj");
        this.f15702a = mMActivity;
        this.f15703b = fragment;
        this.f15704c = view;
        this.f15705d = hj12;
        this.f15719r = new C16052a(hj12, mMActivity, fragment, 0, (C15828e) null, 16, (C8480h) null);
        this.f15720s = new ArrayList();
        this.f15722u = "";
        this.f15723v = new C3320x670f0ed(this, mMActivity);
        this.f15727z = new LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1(this, mMActivity);
        this.f15696A = new LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1(this, mMActivity);
        this.f15698C = new C3319x38874615(this, mMActivity);
        this.f15699D = new LiveEntranceFragmentViewCallback$uninterestEventListener$1(this, mMActivity);
        this.f15700E = new LiveEntranceFragmentViewCallback$feedUpdateEventListener$1(this, mMActivity);
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#init");
    }

    /* renamed from: a */
    public static final void m3358a(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, int i) {
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#startToScrollWhereRedDotHere-scrollNow position=" + i);
        RecyclerView recyclerView = liveEntranceFragmentViewCallback.f15709h;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback", "startToScrollWhereRedDotHere$scrollNow", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback", "startToScrollWhereRedDotHere$scrollNow", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: c */
    public static void m3359c(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, boolean z, int i, int i2, long j, C32226l lVar, C32226l lVar2, int i3, Object obj) {
        long j2 = (i3 & 8) != 0 ? 0 : j;
        C32226l lVar3 = (i3 & 16) != 0 ? null : lVar;
        C32226l lVar4 = (i3 & 32) != 0 ? null : lVar2;
        liveEntranceFragmentViewCallback.getClass();
        int i4 = i2;
        C21445b.f60694a.mo33622k(i4, 10000, "");
        StringBuilder sb = new StringBuilder();
        sb.append("#loadData fromHead=");
        boolean z2 = z;
        sb.append(z);
        sb.append(" containerId=");
        int i5 = i;
        sb.append(i5);
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", sb.toString());
        C53895h.m60466d(liveEntranceFragmentViewCallback.f15707f, (C66212f) null, (C53934p0) null, new C15852w(liveEntranceFragmentViewCallback, z, i4, i5, j2, lVar3, lVar4, (C15601d<? super C15852w>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public static final void m3360g(List<Long> list, List<C52231z81> list2) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<C52231z81> it = list2.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            C52231z81 next = it.next();
            FinderObject finderObject = next.f145756f;
            if (list.contains(Long.valueOf(finderObject != null ? finderObject.f164794id : 0))) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("id=");
                FinderObject finderObject2 = next.f145756f;
                sb4.append(finderObject2 != null ? Long.valueOf(finderObject2.f164794id) : null);
                sb4.append(" name=");
                FinderObject finderObject3 = next.f145756f;
                if (finderObject3 != null) {
                    str = finderObject3.nickname;
                }
                sb4.append(str);
                String sb5 = sb4.toString();
                sb.append(sb5 + 10);
                it.remove();
            }
        }
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, LocaleUtil.ITALIAN);
        if (sb6.length() > 0) {
            str = sb6;
        }
        if (str != null) {
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#checkAndRemoveDuplicateData remove: " + str);
            C32227p<String, String, C13598b0> pVar = C15824c0.f42631a;
            ((C15824c0.C15825a) C15824c0.f42631a).invoke("有重复内容，已移除", str);
        }
    }

    /* renamed from: b */
    public final List<Long> mo3623b() {
        ArrayList arrayList = new ArrayList();
        for (C0740i2 i2Var : this.f15710i) {
            if ((i2Var instanceof C0330a) && !(i2Var instanceof C0093f)) {
                arrayList.addAll(((C0330a) i2Var).mo81j());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo3624d(boolean z, String str, boolean z2) {
        int i;
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#onRvRefreshOrLoadMoreCall isRefresh=" + z + " source=" + str);
        if (this.f15701F) {
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#onRvRefreshOrLoadMoreCall isRefresh=" + z + " but is running! Get out.");
            return;
        }
        this.f15701F = true;
        if (z2) {
            m3359c(this, true, 0, 0, 0, (C32226l) null, new C15858z(this), 24, (Object) null);
            return;
        }
        int i2 = 0;
        if (z) {
            C21445b.f60694a.mo33620i(false, false);
            m3359c(this, true, 0, 1, 0, (C32226l) null, new C15822b0(this), 24, (Object) null);
            return;
        }
        C0740i2 i2Var = (C0740i2) C110818d0.m150925W(this.f15710i);
        if (i2Var != null) {
            if (i2Var instanceof C0331b) {
                i2 = ((C0331b) i2Var).f903d.f130377d;
            }
            if (i2Var instanceof C0098k) {
                i2 = ((C0098k) i2Var).f539e.f130377d;
            }
            i = i2;
        } else {
            i = 0;
        }
        m3359c(this, false, i, 2, 0, (C32226l) null, new C15820a0(this), 24, (Object) null);
    }

    /* renamed from: e */
    public final void mo3625e() {
        long j = this.f15716o;
        if (j != 0) {
            if (!((C60606n) C86312j.m106911c(C60606n.class)).mo85009IS()) {
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#startToScrollWhereRedDotHere isNewLiveEntranceRedDotAutoScrollEnable=false, return");
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#disposeRedDotInCache");
                ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77263e("NearbyLiveTab", "LiveEntranceFragmentViewCallback");
                return;
            }
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#startToScrollWhereRedDotHere ready to scroll");
            C53895h.m60466d(this.f15706e, (C66212f) null, (C53934p0) null, new C3317b(this, j, (C15601d<? super C3317b>) null), 3, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: te3.c21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: te3.c21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v47, resolved type: te3.c21} */
    /* JADX WARNING: type inference failed for: r8v16, types: [java.util.ArrayList<cm1.i2>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d4, code lost:
        r24 = r1;
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0558, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0657, code lost:
        r1 = r24;
        r2 = r18;
        r4 = null;
        r5 = 0;
        r8 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3626f(te3.C49548ge1 r24, long r25, boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r4 = r27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#transResponseToListData insertAfterObjectId="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " cleanCurrent="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.LiveEntranceFragmentViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 0
            if (r4 == 0) goto L_0x003d
            java.util.ArrayList<cm1.i2> r4 = r0.f15710i
            int r4 = r4.size()
            java.util.ArrayList<cm1.i2> r7 = r0.f15710i
            r7.clear()
            zm1.e r7 = r0.f15711j
            if (r7 == 0) goto L_0x003d
            r7.notifyItemRangeRemoved(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x003d:
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0046
            r0.f15697B = r1
            return
        L_0x0046:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList<cm1.i2> r3 = r0.f15710i
            java.util.Iterator r3 = r3.iterator()
        L_0x0051:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r7 = r4 instanceof an1.C0093f
            if (r7 == 0) goto L_0x0051
            an1.f r4 = (an1.C0093f) r4
            java.util.List r4 = r4.mo81j()
            r2.addAll(r4)
            goto L_0x0051
        L_0x006b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<cm1.i2> r4 = r0.f15710i
            java.util.Iterator r4 = r4.iterator()
        L_0x0076:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0090
            java.lang.Object r7 = r4.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof an1.C0095h
            if (r8 == 0) goto L_0x0076
            an1.h r7 = (an1.C0095h) r7
            java.util.List r7 = r7.mo81j()
            r3.addAll(r7)
            goto L_0x0076
        L_0x0090:
            java.util.List r4 = r23.mo3623b()
            java.lang.String r7 = "container.card_list"
            r8 = 1
            if (r1 == 0) goto L_0x00d7
            java.util.LinkedList<te3.a91> r9 = r1.f133994d
            if (r9 == 0) goto L_0x00d7
            java.util.Iterator r9 = r9.iterator()
        L_0x00a1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d5
            java.lang.Object r10 = r9.next()
            te3.a91 r10 = (te3.C48682a91) r10
            int r11 = r10.f130378e
            if (r11 == r8) goto L_0x00ca
            r12 = 7
            if (r11 == r12) goto L_0x00bf
            java.util.LinkedList<te3.z81> r10 = r10.f130381h
            gy3.C87412m.m108593f(r10, r7)
            m3360g(r4, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x00a1
        L_0x00bf:
            java.util.LinkedList<te3.z81> r10 = r10.f130381h
            gy3.C87412m.m108593f(r10, r7)
            m3360g(r3, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x00a1
        L_0x00ca:
            java.util.LinkedList<te3.z81> r10 = r10.f130381h
            gy3.C87412m.m108593f(r10, r7)
            m3360g(r2, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x00a1
        L_0x00d5:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x00d7:
            te3.ge1 r2 = r0.f15717p
            if (r2 == 0) goto L_0x00de
            boolean r2 = r2.f134001n
            goto L_0x00df
        L_0x00de:
            r2 = 1
        L_0x00df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#transResponseToListData skipAsyncLoadLiveInfo="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            r3 = 4
            r4 = 0
            if (r1 == 0) goto L_0x01e1
            java.util.LinkedList<te3.a91> r9 = r1.f133994d
            if (r9 == 0) goto L_0x01e1
            java.util.Iterator r9 = r9.iterator()
        L_0x00ff:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01df
            java.lang.Object r10 = r9.next()
            te3.a91 r10 = (te3.C48682a91) r10
            int r11 = r10.f130378e
            if (r11 != r3) goto L_0x01dc
            java.util.ArrayList<cm1.i2> r11 = r0.f15710i
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x0116:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0129
            java.lang.Object r13 = r11.next()
            cm1.i2 r13 = (cm1.C0740i2) r13
            boolean r13 = r13 instanceof bn1.C0331b
            if (r13 == 0) goto L_0x0116
            int r12 = r12 + 1
            goto L_0x0116
        L_0x0129:
            java.util.LinkedList<te3.z81> r11 = r10.f130381h
            int r11 = r11.size()
            int r12 = r12 + r11
            java.lang.String r11 = "count_restrict解释-0:不限制 1:限制奇数 2:限制偶数\n"
            int r13 = r10.f130385o
            java.lang.String r14 = ", name="
            java.lang.String r15 = " remove id="
            if (r13 == r8) goto L_0x0184
            r3 = 2
            if (r13 == r3) goto L_0x013f
            goto L_0x01c8
        L_0x013f:
            int r12 = r12 % 2
            if (r12 != r8) goto L_0x01c8
            java.util.LinkedList<te3.z81> r3 = r10.f130381h
            gy3.C87412m.m108593f(r3, r7)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x01c8
            java.util.LinkedList<te3.z81> r3 = r10.f130381h
            java.lang.Object r3 = r3.removeLast()
            te3.z81 r3 = (te3.C52231z81) r3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r15)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r3.f145756f
            if (r11 == 0) goto L_0x016d
            long r11 = r11.f164794id
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            goto L_0x016e
        L_0x016d:
            r11 = r4
        L_0x016e:
            r10.append(r11)
            r10.append(r14)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f145756f
            if (r3 == 0) goto L_0x017b
            java.lang.String r3 = r3.nickname
            goto L_0x017c
        L_0x017b:
            r3 = r4
        L_0x017c:
            r10.append(r3)
            java.lang.String r11 = r10.toString()
            goto L_0x01c8
        L_0x0184:
            int r12 = r12 % 2
            if (r12 != 0) goto L_0x01c8
            java.util.LinkedList<te3.z81> r3 = r10.f130381h
            gy3.C87412m.m108593f(r3, r7)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x01c8
            java.util.LinkedList<te3.z81> r3 = r10.f130381h
            java.lang.Object r3 = r3.removeLast()
            te3.z81 r3 = (te3.C52231z81) r3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r15)
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r3.f145756f
            if (r11 == 0) goto L_0x01b2
            long r11 = r11.f164794id
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            goto L_0x01b3
        L_0x01b2:
            r11 = r4
        L_0x01b3:
            r10.append(r11)
            r10.append(r14)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f145756f
            if (r3 == 0) goto L_0x01c0
            java.lang.String r3 = r3.nickname
            goto L_0x01c1
        L_0x01c0:
            r3 = r4
        L_0x01c1:
            r10.append(r3)
            java.lang.String r11 = r10.toString()
        L_0x01c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "#transResponseToListData count_restrict status: "
            r3.append(r10)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
        L_0x01dc:
            r3 = 4
            goto L_0x00ff
        L_0x01df:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x01e1:
            if (r1 == 0) goto L_0x0662
            java.util.LinkedList<te3.a91> r1 = r1.f133994d
            if (r1 == 0) goto L_0x0662
            java.util.Iterator r1 = r1.iterator()
        L_0x01eb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0660
            java.lang.Object r3 = r1.next()
            te3.a91 r3 = (te3.C48682a91) r3
            gg1.a r9 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r9 = gg1.C32444a.f86207v1
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != r8) goto L_0x0235
            java.util.LinkedList<te3.z81> r9 = r3.f130381h
            java.util.Iterator r9 = r9.iterator()
        L_0x020d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0235
            java.lang.Object r10 = r9.next()
            te3.z81 r10 = (te3.C52231z81) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f145756f
            if (r10 == 0) goto L_0x0220
            te3.c21 r10 = r10.liveInfo
            goto L_0x0221
        L_0x0220:
            r10 = r4
        L_0x0221:
            if (r10 != 0) goto L_0x0224
            goto L_0x020d
        L_0x0224:
            te3.ix0 r11 = new te3.ix0
            r11.<init>()
            r11.f183745d = r8
            java.lang.String r12 = "屏蔽测试\nBAN_TEST"
            r11.f183746e = r12
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r10.f182386Y = r11
            goto L_0x020d
        L_0x0235:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#transResponseToListData container.type="
            r9.append(r10)
            int r10 = r3.f130378e
            r9.append(r10)
            java.lang.String r10 = " container.container_id="
            r9.append(r10)
            int r10 = r3.f130377d
            r9.append(r10)
            java.lang.String r10 = " container.card_list.size="
            r9.append(r10)
            java.util.LinkedList<te3.z81> r10 = r3.f130381h
            int r10 = r10.size()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            java.util.ArrayList<cm1.i2> r9 = r0.f15710i
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x026a:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x02c7
            java.lang.Object r11 = r9.next()
            int r12 = r10 + 1
            if (r10 < 0) goto L_0x02c3
            cm1.i2 r11 = (cm1.C0740i2) r11
            boolean r10 = r11 instanceof bn1.C0330a
            if (r10 == 0) goto L_0x02c1
            boolean r10 = r11 instanceof bn1.C0331b
            if (r10 != 0) goto L_0x02c1
            bn1.a r11 = (bn1.C0330a) r11
            int r10 = r11.mo82k()
            int r13 = r3.f130377d
            if (r10 != r13) goto L_0x02c1
            int r9 = r3.f130382i
            r11.mo79b(r9)
            pe3.b r9 = r3.f130384n
            r11.mo80d(r9)
            xm1.e0 r9 = r0.f15713l
            int r10 = r3.f130377d
            java.util.LinkedList<te3.z81> r11 = r3.f130381h
            gy3.C87412m.m108593f(r11, r7)
            r9.getClass()
            java.util.List<xm1.e0$a> r9 = r9.f42636a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x02aa:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x02ba
            java.lang.Object r12 = r9.next()
            xm1.e0$a r12 = (xm1.C15829e0.C15830a) r12
            r12.mo763d(r10, r11)
            goto L_0x02aa
        L_0x02ba:
            java.lang.String r9 = "#transResponseToListData-oldContainerAppend insert container_id=container.container_id"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            r9 = 1
            goto L_0x02c8
        L_0x02c1:
            r10 = r12
            goto L_0x026a
        L_0x02c3:
            sx3.C64197v.m75542k()
            throw r4
        L_0x02c7:
            r9 = 0
        L_0x02c8:
            if (r9 == 0) goto L_0x02cb
            return
        L_0x02cb:
            int r9 = r3.f130378e
            java.lang.String r15 = ""
            java.lang.String r10 = "card"
            switch(r9) {
                case 1: goto L_0x05eb;
                case 2: goto L_0x055c;
                case 3: goto L_0x0516;
                case 4: goto L_0x0401;
                case 5: goto L_0x037c;
                case 6: goto L_0x02d4;
                case 7: goto L_0x031d;
                case 8: goto L_0x02de;
                default: goto L_0x02d4;
            }
        L_0x02d4:
            r24 = r1
            r18 = r2
            r3 = 1
            r9 = 0
            r16 = 4
            goto L_0x0657
        L_0x02de:
            java.util.ArrayList<cm1.i2> r9 = r0.f15710i
            an1.j r11 = new an1.j
            r11.<init>(r3)
            java.util.LinkedList<te3.z81> r3 = r3.f130381h
            if (r3 == 0) goto L_0x0308
            java.util.Iterator r3 = r3.iterator()
        L_0x02ed:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0306
            java.lang.Object r12 = r3.next()
            te3.z81 r12 = (te3.C52231z81) r12
            xm1.d0 r13 = xm1.C15827d0.f42635a
            java.util.ArrayList<cm1.i2> r14 = r11.f537e
            gy3.C87412m.m108593f(r12, r10)
            te3.hj1 r15 = r0.f15705d
            r13.mo14506a(r14, r12, r11, r15)
            goto L_0x02ed
        L_0x0306:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0308:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r9.add(r11)
            zm1.e r3 = r0.f15711j
            if (r3 == 0) goto L_0x01eb
            java.util.ArrayList<cm1.i2> r9 = r0.f15710i
            int r9 = r9.size()
            int r9 = r9 - r8
            r3.notifyItemInserted(r9)
            goto L_0x01eb
        L_0x031d:
            java.util.ArrayList<cm1.i2> r9 = r0.f15710i
            an1.h r10 = new an1.h
            r10.<init>(r3)
            java.util.LinkedList<te3.z81> r3 = r3.f130381h
            if (r3 == 0) goto L_0x0367
            java.util.Iterator r3 = r3.iterator()
        L_0x032c:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x0365
            java.lang.Object r11 = r3.next()
            te3.z81 r11 = (te3.C52231z81) r11
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.f145756f
            if (r11 == 0) goto L_0x032c
            wp1.f$a r12 = wp1.C15585f.f42211a
            java.util.List r11 = sx3.C26236u.m33719b(r11)
            er1.w3 r13 = er1.C58784w3.f168295a
            int r13 = r13.mo83887M1(r5)
            te3.hj1 r14 = r0.f15705d
            java.util.List r11 = r12.mo14343f(r11, r13, r14)
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r11
            if (r11 == 0) goto L_0x0362
            java.util.ArrayList<cm1.i2> r12 = r10.f533e
            an1.g r13 = new an1.g
            r13.<init>(r11)
            r12.add(r13)
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0362:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x032c
        L_0x0365:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0367:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r9.add(r10)
            zm1.e r3 = r0.f15711j
            if (r3 == 0) goto L_0x01eb
            java.util.ArrayList<cm1.i2> r9 = r0.f15710i
            int r9 = r9.size()
            int r9 = r9 - r8
            r3.notifyItemInserted(r9)
            goto L_0x01eb
        L_0x037c:
            java.util.ArrayList<cm1.i2> r14 = r0.f15710i
            an1.b r13 = new an1.b
            r13.<init>(r3)
            java.util.LinkedList<te3.z81> r9 = r3.f130381h
            if (r9 == 0) goto L_0x03e3
            java.util.Iterator r16 = r9.iterator()
            r17 = 0
        L_0x038d:
            boolean r9 = r16.hasNext()
            if (r9 == 0) goto L_0x03dc
            java.lang.Object r9 = r16.next()
            int r18 = r17 + 1
            if (r17 < 0) goto L_0x03d8
            te3.z81 r9 = (te3.C52231z81) r9
            te3.ff0 r10 = r9.f145764q
            if (r10 == 0) goto L_0x03cb
            java.util.ArrayList<cm1.i2> r12 = r13.f526e
            an1.a r11 = new an1.a
            java.lang.String r9 = r9.f145757g
            if (r9 != 0) goto L_0x03ac
            r19 = r15
            goto L_0x03ae
        L_0x03ac:
            r19 = r9
        L_0x03ae:
            java.util.LinkedList<te3.z81> r9 = r3.f130381h
            int r20 = r9.size()
            r9 = r11
            r5 = r11
            r11 = r19
            r8 = r12
            r12 = r3
            r21 = r13
            r13 = r17
            r22 = r14
            r14 = r20
            r9.<init>(r10, r11, r12, r13, r14)
            r8.add(r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x03cf
        L_0x03cb:
            r21 = r13
            r22 = r14
        L_0x03cf:
            r17 = r18
            r13 = r21
            r14 = r22
            r5 = 0
            r8 = 1
            goto L_0x038d
        L_0x03d8:
            sx3.C64197v.m75542k()
            throw r4
        L_0x03dc:
            r21 = r13
            r22 = r14
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x03e7
        L_0x03e3:
            r21 = r13
            r22 = r14
        L_0x03e7:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r5 = r21
            r3 = r22
            r3.add(r5)
            zm1.e r3 = r0.f15711j
            if (r3 == 0) goto L_0x02d4
            java.util.ArrayList<cm1.i2> r5 = r0.f15710i
            int r5 = r5.size()
            r8 = 1
            int r5 = r5 - r8
            r3.notifyItemInserted(r5)
            goto L_0x02d4
        L_0x0401:
            java.util.ArrayList<cm1.i2> r5 = r0.f15710i
            java.lang.Object r5 = sx3.C110818d0.m150925W(r5)
            cm1.i2 r5 = (cm1.C0740i2) r5
            java.util.ArrayList<cm1.i2> r8 = r0.f15710i
            if (r5 == 0) goto L_0x0414
            boolean r5 = r5 instanceof bn1.C0331b
            if (r5 != 0) goto L_0x0412
            goto L_0x0414
        L_0x0412:
            r5 = 0
            goto L_0x0415
        L_0x0414:
            r5 = 1
        L_0x0415:
            if (r5 == 0) goto L_0x0419
            r5 = r8
            goto L_0x041a
        L_0x0419:
            r5 = r4
        L_0x041a:
            if (r5 == 0) goto L_0x0444
            an1.k r5 = new an1.k
            java.lang.String r9 = r3.f130379f
            if (r9 != 0) goto L_0x0423
            goto L_0x0424
        L_0x0423:
            r15 = r9
        L_0x0424:
            r5.<init>(r15, r3)
            java.util.List<te3.x91> r9 = r5.f540f
            java.util.List<te3.x91> r10 = r0.f15720s
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.addAll(r10)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r8.add(r5)
            zm1.e r5 = r0.f15711j
            if (r5 == 0) goto L_0x0444
            java.util.ArrayList<cm1.i2> r8 = r0.f15710i
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            r5.notifyItemInserted(r8)
        L_0x0444:
            java.util.LinkedList<te3.z81> r5 = r3.f130381h
            if (r5 == 0) goto L_0x04f5
            java.util.Iterator r5 = r5.iterator()
        L_0x044c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x04ee
            java.lang.Object r8 = r5.next()
            te3.z81 r8 = (te3.C52231z81) r8
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r8.f145756f
            if (r9 == 0) goto L_0x04e5
            wp1.f$a r10 = wp1.C15585f.f42211a
            java.util.List r9 = sx3.C26236u.m33719b(r9)
            er1.w3 r11 = er1.C58784w3.f168295a
            r12 = 0
            int r11 = r11.mo83887M1(r12)
            te3.hj1 r12 = r0.f15705d
            java.util.List r9 = r10.mo14343f(r9, r11, r12)
            java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
            r10 = r9
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r10
            if (r10 == 0) goto L_0x04de
            int r9 = r8.f145755e
            r15 = 4
            if (r9 == r15) goto L_0x04ba
            r11 = 6
            if (r9 == r11) goto L_0x0485
            r24 = r1
            r16 = 4
            goto L_0x04db
        L_0x0485:
            java.util.ArrayList<cm1.i2> r14 = r0.f15710i
            an1.o r13 = new an1.o
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r8.f145759i
            java.lang.String r9 = "card.relate_living"
            gy3.C87412m.m108593f(r12, r9)
            te3.b71 r11 = r8.f145763p
            java.lang.String r8 = r8.f145762o
            r9 = r13
            r16 = r11
            r11 = r3
            r4 = r13
            r13 = r16
            r24 = r1
            r1 = r14
            r14 = r8
            r16 = 4
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.add(r4)
            zm1.e r1 = r0.f15711j
            if (r1 == 0) goto L_0x04db
            java.util.ArrayList<cm1.i2> r4 = r0.f15710i
            int r4 = r4.size()
            r8 = 1
            int r4 = r4 - r8
            r1.notifyItemInserted(r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x04db
        L_0x04ba:
            r24 = r1
            r16 = 4
            java.util.ArrayList<cm1.i2> r1 = r0.f15710i
            an1.m r4 = new an1.m
            java.lang.String r8 = r8.f145762o
            r4.<init>(r10, r3, r8, r2)
            r1.add(r4)
            zm1.e r1 = r0.f15711j
            if (r1 == 0) goto L_0x04db
            java.util.ArrayList<cm1.i2> r4 = r0.f15710i
            int r4 = r4.size()
            r8 = 1
            int r4 = r4 - r8
            r1.notifyItemInserted(r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x04db:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x04e2
        L_0x04de:
            r24 = r1
            r16 = 4
        L_0x04e2:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x04e9
        L_0x04e5:
            r24 = r1
            r16 = 4
        L_0x04e9:
            r1 = r24
            r4 = 0
            goto L_0x044c
        L_0x04ee:
            r24 = r1
            r16 = 4
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x04f9
        L_0x04f5:
            r24 = r1
            r16 = 4
        L_0x04f9:
            java.util.ArrayList<cm1.i2> r1 = r0.f15710i
            java.lang.Object r1 = sx3.C110818d0.m150925W(r1)
            cm1.i2 r1 = (cm1.C0740i2) r1
            if (r1 == 0) goto L_0x0558
            boolean r4 = r1 instanceof bn1.C0330a
            if (r4 == 0) goto L_0x0513
            bn1.a r1 = (bn1.C0330a) r1
            pe3.b r4 = r3.f130384n
            r1.mo80d(r4)
            int r3 = r3.f130382i
            r1.mo79b(r3)
        L_0x0513:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0558
        L_0x0516:
            r24 = r1
            r16 = 4
            java.util.ArrayList<cm1.i2> r1 = r0.f15710i
            an1.p r4 = new an1.p
            r4.<init>(r3)
            java.util.LinkedList<te3.z81> r3 = r3.f130381h
            if (r3 == 0) goto L_0x0544
            java.util.Iterator r3 = r3.iterator()
        L_0x0529:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0542
            java.lang.Object r5 = r3.next()
            te3.z81 r5 = (te3.C52231z81) r5
            xm1.d0 r8 = xm1.C15827d0.f42635a
            java.util.ArrayList<cm1.i2> r9 = r4.f546e
            gy3.C87412m.m108593f(r5, r10)
            te3.hj1 r11 = r0.f15705d
            r8.mo14506a(r9, r5, r4, r11)
            goto L_0x0529
        L_0x0542:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0544:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r1.add(r4)
            zm1.e r1 = r0.f15711j
            if (r1 == 0) goto L_0x0558
            java.util.ArrayList<cm1.i2> r3 = r0.f15710i
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            r1.notifyItemInserted(r3)
        L_0x0558:
            r18 = r2
            goto L_0x05e8
        L_0x055c:
            r24 = r1
            r16 = 4
            java.util.ArrayList<cm1.i2> r1 = r0.f15710i
            an1.d r4 = new an1.d
            r4.<init>(r3)
            java.util.LinkedList<te3.z81> r5 = r3.f130381h
            if (r5 == 0) goto L_0x05d2
            java.util.Iterator r5 = r5.iterator()
        L_0x056f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x05cd
            java.lang.Object r8 = r5.next()
            te3.z81 r8 = (te3.C52231z81) r8
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r8.f145756f
            if (r9 == 0) goto L_0x05c8
            wp1.f$a r10 = wp1.C15585f.f42211a
            java.util.List r9 = sx3.C26236u.m33719b(r9)
            er1.w3 r11 = er1.C58784w3.f168295a
            r12 = 0
            int r11 = r11.mo83887M1(r12)
            te3.hj1 r12 = r0.f15705d
            java.util.List r9 = r10.mo14343f(r9, r11, r12)
            java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
            r10 = r9
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r10
            if (r10 == 0) goto L_0x05c3
            java.util.ArrayList<cm1.i2> r15 = r4.f529e
            an1.c r14 = new an1.c
            te3.fg0 r8 = r8.f145761n
            if (r8 == 0) goto L_0x05a7
            java.lang.String r9 = r8.f133486d
            r13 = r9
            goto L_0x05a8
        L_0x05a7:
            r13 = 0
        L_0x05a8:
            if (r8 == 0) goto L_0x05ad
            java.lang.String r8 = r8.f133487e
            goto L_0x05ae
        L_0x05ad:
            r8 = 0
        L_0x05ae:
            r17 = 2
            r9 = r14
            r11 = r3
            r12 = r2
            r18 = r2
            r2 = r14
            r14 = r8
            r8 = r15
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x05c5
        L_0x05c3:
            r18 = r2
        L_0x05c5:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x05ca
        L_0x05c8:
            r18 = r2
        L_0x05ca:
            r2 = r18
            goto L_0x056f
        L_0x05cd:
            r18 = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x05d4
        L_0x05d2:
            r18 = r2
        L_0x05d4:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r1.add(r4)
            zm1.e r1 = r0.f15711j
            if (r1 == 0) goto L_0x05e8
            java.util.ArrayList<cm1.i2> r2 = r0.f15710i
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            r1.notifyItemInserted(r2)
        L_0x05e8:
            r3 = 1
            r9 = 0
            goto L_0x0657
        L_0x05eb:
            r24 = r1
            r18 = r2
            r16 = 4
            java.util.ArrayList<cm1.i2> r1 = r0.f15710i
            an1.f r2 = new an1.f
            r2.<init>(r3)
            java.util.LinkedList<te3.z81> r3 = r3.f130381h
            if (r3 == 0) goto L_0x0640
            java.util.Iterator r3 = r3.iterator()
        L_0x0600:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x063c
            java.lang.Object r4 = r3.next()
            te3.z81 r4 = (te3.C52231z81) r4
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f145756f
            if (r4 == 0) goto L_0x063a
            wp1.f$a r5 = wp1.C15585f.f42211a
            java.util.List r4 = sx3.C26236u.m33719b(r4)
            er1.w3 r8 = er1.C58784w3.f168295a
            r9 = 0
            int r8 = r8.mo83887M1(r9)
            te3.hj1 r10 = r0.f15705d
            java.util.List r4 = r5.mo14343f(r4, r8, r10)
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r4
            if (r4 == 0) goto L_0x0637
            java.util.ArrayList<cm1.i2> r5 = r2.f531e
            an1.e r8 = new an1.e
            r8.<init>(r4)
            r5.add(r8)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0637:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0600
        L_0x063a:
            r9 = 0
            goto L_0x0600
        L_0x063c:
            r9 = 0
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0641
        L_0x0640:
            r9 = 0
        L_0x0641:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r1.add(r2)
            zm1.e r1 = r0.f15711j
            if (r1 == 0) goto L_0x0656
            java.util.ArrayList<cm1.i2> r2 = r0.f15710i
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            r1.notifyItemInserted(r2)
            goto L_0x0657
        L_0x0656:
            r3 = 1
        L_0x0657:
            r1 = r24
            r2 = r18
            r4 = 0
            r5 = 0
            r8 = 1
            goto L_0x01eb
        L_0x0660:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0662:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.mo3626f(te3.ge1, long, boolean):void");
    }
}
