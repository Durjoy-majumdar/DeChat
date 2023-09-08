package xm1;

import a14.C53930o0;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import pm1.C62381d;
import te3.C49548ge1;
import tf0.C13887q1;
import zm1.C16301e;

/* renamed from: xm1.g */
public final class C15833g extends UIComponent {

    /* renamed from: d */
    public LiveEntranceFragmentViewCallback f42637d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15833g(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cn9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0285  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            super.onCreate(r21)
            android.os.Bundle r0 = r20.getArguments()
            r1 = 1
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = "key_use_dark_style"
            r0.getInt(r2, r1)
        L_0x000f:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r20.getActivity()
            bl3.r$a r2 = r0.mo62444c(r2)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            te3.hj1 r8 = r2.mo12861q3()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r2 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r3, r4)
            r4 = r3
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            androidx.fragment.app.Fragment r5 = r20.getFragment()
            gy3.C87412m.m108591d(r5)
            r6 = 0
            android.view.View r7 = r20.getRootView()
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r20
            r3.f42637d = r2
            java.lang.Class<fm1.c> r4 = fm1.C8137c.class
            bl3.r$a r0 = r0.mo62446e(r4)
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler> r4 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler r0 = (com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler) r0
            com.tencent.mm.ui.MMActivity r4 = r2.f15702a
            r0.mo11321n2(r4)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r4 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r4 = r4.Nt0()
            java.lang.String r5 = "FinderLiveEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = r4.mo77227G5(r5)
            if (r6 == 0) goto L_0x0086
            te3.nn1 r8 = r6.mo77308o2(r5)
            if (r8 == 0) goto L_0x0086
            te3.xi1 r8 = r6.field_ctrInfo
            int r8 = r8.f144670e
            r9 = 16
            if (r8 != r9) goto L_0x0086
            r4.mo77242O(r6)
            java.lang.String r6 = "NearbyLiveTab"
            te3.yi1 r4 = r4.mo77279s(r6)
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            java.lang.String r6 = "Finder.LiveEntranceFragmentViewCallback"
            java.lang.String r8 = "#disposeRedDotInSystem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            r0.mo77239M5(r5)
            r8 = 0
            if (r4 == 0) goto L_0x00a2
            long r10 = r4.f186549g
            goto L_0x00a3
        L_0x00a2:
            r10 = r8
        L_0x00a3:
            r2.f15716o = r10
            if (r4 == 0) goto L_0x00ad
            int r5 = r4.f186559t
            if (r5 != r1) goto L_0x00ad
            r5 = 1
            goto L_0x00ae
        L_0x00ad:
            r5 = 0
        L_0x00ae:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x00bc
            if (r4 == 0) goto L_0x00b7
            int r4 = r4.f186545G
            goto L_0x00b8
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            if (r4 != r1) goto L_0x00bc
            r4 = 1
            goto L_0x00bd
        L_0x00bc:
            r4 = 0
        L_0x00bd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "#onCreate red dot="
            r10.append(r11)
            long r11 = r2.f15716o
            java.lang.String r11 = o40.C61926c.m72691p(r11)
            r10.append(r11)
            java.lang.String r11 = " isRedEnterLive: "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r11 = " isRedDotCrossLiveDisablePreload: "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            android.view.View r10 = r2.f15704c
            r11 = 2131310170(0x7f09365a, float:1.8238644E38)
            android.view.View r10 = r10.findViewById(r11)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r2.f15709h = r10
            android.view.View r10 = r2.f15704c
            r11 = 2131310171(0x7f09365b, float:1.8238647E38)
            android.view.View r10 = r10.findViewById(r11)
            java.lang.String r11 = "parentView.findViewById(…_entrance_refresh_layout)"
            gy3.C87412m.m108593f(r10, r11)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = (com.tencent.p014mm.view.refreshLayout.WxRefreshLayout) r10
            r2.f15712k = r10
            androidx.recyclerview.widget.RecyclerView r10 = r2.f15709h
            if (r10 == 0) goto L_0x0133
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r11 < r12) goto L_0x0133
            xn1.e r11 = new xn1.e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.tencent.mm.ui.MMActivity r13 = r2.f15702a
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            r13 = 35
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            r10.mo17043c(r11)
        L_0x0133:
            zm1.e r10 = new zm1.e
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory r15 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory
            com.tencent.mm.ui.MMActivity r12 = r2.f15702a
            r13 = 0
            r14 = 0
            r16 = 0
            te3.hj1 r11 = r2.f15705d
            xm1.n r7 = new xm1.n
            r7.<init>(r2)
            xm1.e0 r0 = r2.f15713l
            r17 = r11
            r11 = r15
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r7
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.ArrayList<cm1.i2> r0 = r2.f15710i
            r10.<init>(r8, r0)
            xm1.o r0 = new xm1.o
            r0.<init>(r2)
            r10.f173488o = r0
            xm1.q r0 = new xm1.q
            r0.<init>(r2)
            r10.f173487n = r0
            r2.f15711j = r10
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager r0 = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager
            r7 = 2
            r0.<init>(r7, r1)
            androidx.recyclerview.widget.RecyclerView r7 = r2.f15709h
            if (r7 != 0) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            r7.setLayoutManager(r0)
        L_0x0178:
            androidx.recyclerview.widget.RecyclerView r0 = r2.f15709h
            if (r0 == 0) goto L_0x0184
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$a r7 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$a
            r7.<init>()
            r0.mo17085h0(r7)
        L_0x0184:
            zm1.f r0 = new zm1.f
            java.util.ArrayList<cm1.i2> r9 = r2.f15710i
            xm1.r r10 = new xm1.r
            r10.<init>(r2)
            xm1.e0 r11 = r2.f15713l
            xm1.s r12 = new xm1.s
            r12.<init>(r2)
            xm1.t r13 = new xm1.t
            r13.<init>(r2)
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            androidx.recyclerview.widget.RecyclerView r7 = r2.f15709h
            if (r7 == 0) goto L_0x01a4
            r7.mo17043c(r0)
        L_0x01a4:
            r2.f15714m = r0
            androidx.recyclerview.widget.RecyclerView r0 = r2.f15709h
            if (r0 != 0) goto L_0x01ab
            goto L_0x01b0
        L_0x01ab:
            zm1.e r7 = r2.f15711j
            r0.setAdapter(r7)
        L_0x01b0:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r2.f15712k
            java.lang.String r7 = "refreshLayout"
            if (r0 == 0) goto L_0x0401
            xm1.u r8 = new xm1.u
            r8.<init>(r2)
            r0.setOnSimpleAction(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f15709h
            if (r0 == 0) goto L_0x01cc
            xm1.v r8 = new xm1.v
            r8.<init>(r2)
            xm1.m r9 = xm1.C15842m.f42666d
            jq3.C9496f.m9181b(r0, r8, r9)
        L_0x01cc:
            long r8 = r2.f15716o
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01d6
            r0 = 1
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            com.tencent.mm.ui.MMActivity r8 = r2.f15702a
            android.content.Intent r8 = r8.getIntent()
            if (r8 == 0) goto L_0x01e8
            java.lang.String r9 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            android.os.Parcelable r8 = r8.getParcelableExtra(r9)
            android.content.Intent r8 = (android.content.Intent) r8
            goto L_0x01e9
        L_0x01e8:
            r8 = 0
        L_0x01e9:
            if (r8 == 0) goto L_0x01ed
            r8 = 1
            goto L_0x01ee
        L_0x01ed:
            r8 = 0
        L_0x01ee:
            if (r8 != 0) goto L_0x0266
            j31.a$b r9 = j31.C9276a.f29023b
            j31.a r9 = r9.mo10053a()
            java.lang.String r10 = "7312+1"
            j31.b r9 = r9.mo10052a(r10)
            boolean r10 = r9 instanceof fn1.C8168b
            if (r10 == 0) goto L_0x0203
            fn1.b r9 = (fn1.C8168b) r9
            goto L_0x0204
        L_0x0203:
            r9 = 0
        L_0x0204:
            if (r9 == 0) goto L_0x0261
            boolean r10 = r9.mo380g()
            if (r10 == 0) goto L_0x020d
            goto L_0x020e
        L_0x020d:
            r9 = 0
        L_0x020e:
            if (r9 == 0) goto L_0x0261
            _result r10 = r9.f29027b
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            if (r10 == 0) goto L_0x021b
            T r10 = r10.f256796d
            te3.ge1 r10 = (te3.C49548ge1) r10
            goto L_0x021c
        L_0x021b:
            r10 = 0
        L_0x021c:
            if (r10 == 0) goto L_0x0261
            int r11 = r10.f133996f
            if (r11 <= 0) goto L_0x0261
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#loadPrefetchData: prefech_min_interval="
            r11.append(r12)
            int r12 = r10.f133996f
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            long r11 = xm1.C15819a.f42621c
            int r13 = r10.f133996f
            int r13 = r13 * 1000
            long r13 = (long) r13
            long r11 = r11 + r13
            long r13 = java.lang.System.currentTimeMillis()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0261
            java.lang.String r11 = "#loadPrefetchData: success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            r2.f15717p = r10
            r11 = 0
            r13 = 0
            r2.mo3626f(r10, r11, r13)
            r9.mo10056c(r13)
            java.util.ArrayList<cm1.i2> r9 = r2.f15710i
            boolean r9 = r9.isEmpty()
            r13 = r9 ^ 1
            goto L_0x0262
        L_0x0261:
            r13 = 0
        L_0x0262:
            if (r13 == 0) goto L_0x0266
            r13 = 1
            goto L_0x0267
        L_0x0266:
            r13 = 0
        L_0x0267:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#onCreate isLoadPrefetchSuccess="
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = " isLiveNeedScrollSquare: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            if (r13 == 0) goto L_0x02a8
            if (r0 == 0) goto L_0x02a3
            java.util.List r9 = r2.mo3623b()
            long r10 = r2.f15716o
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x02a3
            java.lang.String r0 = "#onCreate in -isLoadPrefetchSuccess- condition, ready to scroll! good"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r2.mo3625e()
            r0 = 0
            goto L_0x02a8
        L_0x02a3:
            java.lang.String r9 = "#onCreate in -isLoadPrefetchSuccess- condition, not found feedId, sad."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
        L_0x02a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#onCreate isLastExitEntranceTimeOut="
            r9.append(r10)
            xm1.a r10 = xm1.C15819a.f42619a
            boolean r11 = r10.mo14502a()
            r9.append(r11)
            java.lang.String r11 = " isLiveNeedScrollSquare"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            if (r13 != 0) goto L_0x02f8
            boolean r9 = r10.mo14502a()
            if (r9 != 0) goto L_0x02f8
            if (r8 != 0) goto L_0x02f8
            te3.ge1 r9 = xm1.C15819a.f42623e
            r2.f15717p = r9
            java.util.ArrayList<cm1.i2> r9 = r2.f15710i
            java.util.List<cm1.i2> r11 = xm1.C15819a.f42624f
            r9.addAll(r11)
            java.util.ArrayList<cm1.i2> r9 = r2.f15710i
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#onCreate isLoadLastExitSuccess="
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            goto L_0x02f9
        L_0x02f8:
            r9 = 0
        L_0x02f9:
            if (r9 == 0) goto L_0x0323
            if (r0 != 0) goto L_0x031e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#onCreate in -isLoadLastExitSuccess- condition, scroll to "
            r11.append(r12)
            int r12 = xm1.C15819a.f42626h
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            androidx.recyclerview.widget.RecyclerView r11 = r2.f15709h
            if (r11 == 0) goto L_0x0323
            int r12 = xm1.C15819a.f42626h
            r14 = 0
            r11.scrollBy(r14, r12)
            goto L_0x0323
        L_0x031e:
            java.lang.String r11 = "#onCreate in -isLoadLastExitSuccess- condition, do nothing."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
        L_0x0323:
            if (r13 != 0) goto L_0x0327
            if (r9 == 0) goto L_0x033b
        L_0x0327:
            a14.n0 r14 = r2.f15706e
            r15 = 0
            r16 = 0
            xm1.x r9 = new xm1.x
            r11 = 0
            r9.<init>(r2, r11)
            r18 = 3
            r19 = 0
            r17 = r9
            a14.C53895h.m60466d(r14, r15, r16, r17, r18, r19)
        L_0x033b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "#onCreate need auto refresh? isLoadPrefetchSuccess="
            r9.append(r11)
            r9.append(r13)
            java.lang.String r11 = ", CacheUtils.isLastExitEntranceTimeOut="
            r9.append(r11)
            boolean r11 = r10.mo14502a()
            r9.append(r11)
            java.lang.String r11 = ", isRedEnterLive: "
            r9.append(r11)
            r9.append(r5)
            java.lang.String r11 = ",  isRedDotCrossLiveDisablePreload: "
            r9.append(r11)
            r9.append(r4)
            java.lang.String r11 = ",  hasRedDotAndNotScroll="
            r9.append(r11)
            r9.append(r0)
            java.lang.String r11 = ", isLiveNeedScrollSquare="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            if (r4 != 0) goto L_0x03b4
            if (r8 != 0) goto L_0x03b4
            if (r5 == 0) goto L_0x0398
            r10 = 1
            r11 = 0
            r12 = 21
            r13 = 0
            r15 = 0
            xm1.y r0 = new xm1.y
            r0.<init>(r2)
            r17 = 24
            r18 = 0
            r9 = r2
            r16 = r0
            com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback.m3359c(r9, r10, r11, r12, r13, r15, r16, r17, r18)
            goto L_0x03b4
        L_0x0398:
            if (r13 != 0) goto L_0x03a0
            boolean r4 = r10.mo14502a()
            if (r4 != 0) goto L_0x03a2
        L_0x03a0:
            if (r0 == 0) goto L_0x03b4
        L_0x03a2:
            java.lang.String r0 = "#onCreate autoRefresh"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r2.f15712k
            if (r0 == 0) goto L_0x03af
            r0.mo26573d()
            goto L_0x03b4
        L_0x03af:
            gy3.C87412m.m108603p(r7)
            r0 = 0
            throw r0
        L_0x03b4:
            androidx.recyclerview.widget.RecyclerView r6 = r2.f15709h
            if (r6 == 0) goto L_0x03da
            pm1.d r0 = new pm1.d
            com.tencent.mm.ui.MMActivity r5 = r2.f15702a
            java.util.ArrayList<cm1.i2> r7 = r2.f15710i
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            java.lang.Class<ir.n> r4 = p565ir.C60606n.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ir.n r4 = (p565ir.C60606n) r4
            boolean r4 = r4.mo85009IS()
            r12 = r4 ^ 1
            r13 = 0
            r14 = 256(0x100, float:3.59E-43)
            r15 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.f15715n = r0
        L_0x03da:
            pm1.d r0 = r2.f15715n
            if (r0 == 0) goto L_0x03e2
            r1 = 0
            r0.mo87429h(r1)
        L_0x03e2:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$finderNearbyRefreshEventListener$1 r0 = r2.f15723v
            r0.alive()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$finderNearbyInsertEventListener$1 r0 = r2.f15698C
            r0.alive()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1 r0 = r2.f15696A
            r0.alive()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1 r0 = r2.f15727z
            r0.alive()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$uninterestEventListener$1 r0 = r2.f15699D
            r0.alive()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$feedUpdateEventListener$1 r0 = r2.f15700E
            r0.alive()
            return
        L_0x0401:
            gy3.C87412m.m108603p(r7)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xm1.C15833g.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("NearbyLiveSquareTabUIC", "onDestroy() tab:null");
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42637d;
        if (liveEntranceFragmentViewCallback != null) {
            liveEntranceFragmentViewCallback.f15698C.dead();
            liveEntranceFragmentViewCallback.f15696A.dead();
            liveEntranceFragmentViewCallback.f15727z.dead();
            liveEntranceFragmentViewCallback.f15723v.dead();
            liveEntranceFragmentViewCallback.f15699D.dead();
            liveEntranceFragmentViewCallback.f15700E.dead();
            boolean z = true;
            C53930o0.m60558e(liveEntranceFragmentViewCallback.f15706e, (CancellationException) null, 1, (Object) null);
            C53930o0.m60558e(liveEntranceFragmentViewCallback.f15707f, (CancellationException) null, 1, (Object) null);
            Intent intent = liveEntranceFragmentViewCallback.f15702a.getIntent();
            int i = 0;
            if ((intent != null ? (Intent) intent.getParcelableExtra("KEY_ENTER_LIVE_PARAM_INTENT_DATA") : null) == null) {
                z = false;
            }
            if (!z) {
                C15819a aVar = C15819a.f42619a;
                C49548ge1 ge12 = liveEntranceFragmentViewCallback.f15717p;
                C15819a.f42623e = ge12;
                if (ge12 != null) {
                    C15819a.f42625g = System.currentTimeMillis();
                }
                ArrayList arrayList = (ArrayList) C15819a.f42624f;
                arrayList.clear();
                arrayList.addAll(liveEntranceFragmentViewCallback.f15710i);
                RecyclerView recyclerView = liveEntranceFragmentViewCallback.f15709h;
                if (recyclerView != null) {
                    i = recyclerView.computeVerticalScrollOffset();
                }
                C15819a.f42626h = i;
            }
            C62381d dVar = liveEntranceFragmentViewCallback.f15715n;
            if (dVar != null) {
                dVar.detach();
            }
            liveEntranceFragmentViewCallback.f15721t = null;
            return;
        }
        C87412m.m108603p("liveFriendsCallback");
        throw null;
    }

    public void onPause() {
        super.onPause();
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42637d;
        if (liveEntranceFragmentViewCallback != null) {
            C62381d dVar = liveEntranceFragmentViewCallback.f15715n;
            if (dVar != null) {
                dVar.mo87435n();
            }
            C62381d dVar2 = liveEntranceFragmentViewCallback.f15715n;
            if (dVar2 != null) {
                dVar2.mo11214a();
            }
            liveEntranceFragmentViewCallback.f15721t = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13306Eb();
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "recordCurNoticeStatus lastNoticeSnapshot:" + liveEntranceFragmentViewCallback.f15721t);
            return;
        }
        C87412m.m108603p("liveFriendsCallback");
        throw null;
    }

    public void onResume() {
        C16301e eVar;
        super.onResume();
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42637d;
        if (liveEntranceFragmentViewCallback != null) {
            C62381d dVar = liveEntranceFragmentViewCallback.f15715n;
            if (dVar != null) {
                dVar.mo11215b();
            }
            String str = liveEntranceFragmentViewCallback.f15721t;
            if (str != null) {
                String Eb = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13306Eb();
                if (!Util.isEqual(str, Eb) && (eVar = liveEntranceFragmentViewCallback.f15711j) != null) {
                    eVar.notifyDataSetChanged();
                }
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "checkNoticeStatus lastNoticeSnapshot:" + str + " newSnapshot:" + Eb);
                return;
            }
            return;
        }
        C87412m.m108603p("liveFriendsCallback");
        throw null;
    }

    public void onStart() {
        super.onStart();
        if (this.f42637d == null) {
            C87412m.m108603p("liveFriendsCallback");
            throw null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f42637d == null) {
            C87412m.m108603p("liveFriendsCallback");
            throw null;
        }
    }
}
