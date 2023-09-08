package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C7642k;
import gy3.C87412m;
import java.util.Iterator;
import jq3.C9493c;
import kf1.C9818k2;
import kf1.C9837l2;
import rs1.C13442s8;
import rx3.C13604l;
import vq1.C65861r;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler */
public final class FinderFeedSnsAdHandler extends C9818k2 {

    /* renamed from: j */
    public final int f13030j = C0966R.C0970id.e6u;

    /* renamed from: k */
    public FinderContact f13031k;

    /* renamed from: l */
    public boolean f13032l;

    /* renamed from: m */
    public Runnable f13033m;

    /* renamed from: n */
    public final FinderFeedSnsAdHandler$adFeedUiActionListener$1 f13034n;

    /* renamed from: o */
    public final FinderFeedSnsAdHandler$feedUpdateListener$1 f13035o;

    /* renamed from: p */
    public final FinderFeedSnsAdHandler$lifecycleObserver$1 f13036p;

    /* renamed from: q */
    public View f13037q;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$a */
    public final class C2502a implements Runnable {

        /* renamed from: d */
        public final long f13038d;

        public C2502a(long j) {
            this.f13038d = j;
        }

        public void run() {
            View view;
            View findViewById;
            ViewPropertyAnimator translationY;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator listener;
            ViewPropertyAnimator translationY2;
            ViewPropertyAnimator duration2;
            ViewPropertyAnimator translationY3;
            ViewPropertyAnimator duration3;
            FinderFeedSnsAdHandler finderFeedSnsAdHandler = FinderFeedSnsAdHandler.this;
            long j = this.f13038d;
            finderFeedSnsAdHandler.getClass();
            Log.m105924i("Finder.FeedAdHandler", "startAdAnimView invoke");
            RecyclerView.C16631z h = finderFeedSnsAdHandler.mo2504h(j);
            if (!(h == null || (view = h.f44854d) == null || (findViewById = view.findViewById(C0966R.C0970id.d6z)) == null)) {
                if (findViewById.getVisibility() != 0) {
                    Log.m105924i("Finder.FeedAdHandler", "finder_ad_feed_hint_container not visible");
                    finderFeedSnsAdHandler.f13037q = null;
                } else {
                    float dimension = view.getContext().getResources().getDimension(C0966R.dimen.f3761db);
                    Log.m105924i("Finder.FeedAdHandler", "startAdAnimView");
                    View findViewById2 = view.findViewById(C0966R.C0970id.d97);
                    if (findViewById2 != null) {
                        Log.m105924i("Finder.FeedAdHandler", "startAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :" + 0.0f);
                        ViewPropertyAnimator animate = findViewById2.animate();
                        if (!(animate == null || (translationY3 = animate.translationY(dimension + 0.0f)) == null || (duration3 = translationY3.setDuration(300)) == null)) {
                            duration3.start();
                        }
                    }
                    View findViewById3 = view.findViewById(finderFeedSnsAdHandler.f13030j);
                    if (findViewById3 != null) {
                        Log.m105924i("Finder.FeedAdHandler", "startAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :" + 0.0f);
                        ViewPropertyAnimator animate2 = findViewById3.animate();
                        if (!(animate2 == null || (translationY2 = animate2.translationY(0.0f + dimension)) == null || (duration2 = translationY2.setDuration(300)) == null)) {
                            duration2.start();
                        }
                    }
                    Log.m105924i("Finder.FeedAdHandler", "startAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :" + 0.0f);
                    ViewPropertyAnimator animate3 = findViewById.animate();
                    if (!(animate3 == null || (translationY = animate3.translationY(0.0f + dimension)) == null || (duration = translationY.setDuration(300)) == null || (listener = duration.setListener(new C9837l2(finderFeedSnsAdHandler))) == null)) {
                        listener.start();
                    }
                    finderFeedSnsAdHandler.f13037q = view;
                }
            }
            FinderFeedSnsAdHandler.this.f13033m = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$b */
    public static final class C2503b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSnsAdHandler f13040d;

        public C2503b(FinderFeedSnsAdHandler finderFeedSnsAdHandler) {
            this.f13040d = finderFeedSnsAdHandler;
        }

        public final void run() {
            RecyclerView recyclerView;
            RecyclerView.C16613e adapter;
            RecyclerView.C16613e adapter2;
            RecyclerView recyclerView2;
            RecyclerView.C16613e adapter3;
            FinderFeedSnsAdHandler finderFeedSnsAdHandler = this.f13040d;
            int i = 0;
            if (!(finderFeedSnsAdHandler.f30359d - 1 < 0 || (recyclerView2 = finderFeedSnsAdHandler.f30362g) == null || (adapter3 = recyclerView2.getAdapter()) == null)) {
                adapter3.notifyItemRangeChanged(0, this.f13040d.f30359d, new C13604l(25, 1));
            }
            RecyclerView recyclerView3 = this.f13040d.f30362g;
            if (!(recyclerView3 == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
                i = adapter2.getItemCount();
            }
            FinderFeedSnsAdHandler finderFeedSnsAdHandler2 = this.f13040d;
            int i2 = i - (finderFeedSnsAdHandler2.f30359d + 1);
            if (i2 > 0 && (recyclerView = finderFeedSnsAdHandler2.f30362g) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeChanged(this.f13040d.f30359d + 1, i2, new C13604l(25, 1));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedSnsAdHandler(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C40008f fVar = C40008f.f107254d;
        this.f13034n = new FinderFeedSnsAdHandler$adFeedUiActionListener$1(this, fVar);
        this.f13035o = new FinderFeedSnsAdHandler$feedUpdateListener$1(this, fVar);
        this.f13036p = new FinderFeedSnsAdHandler$lifecycleObserver$1(this);
    }

    /* renamed from: f */
    public static final void m2408f(FinderFeedSnsAdHandler finderFeedSnsAdHandler, long j, int i, int i2, int i3, int i4) {
        FinderFeedSnsAdHandler finderFeedSnsAdHandler2 = finderFeedSnsAdHandler;
        int i5 = (j != finderFeedSnsAdHandler2.f30358c || !finderFeedSnsAdHandler2.f30361f) ? i4 : i3;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderFeedSnsAdHandler2.f30356a);
        y0Var.Gy0(j, i, i2, i5, i3, "", f != null ? f.mo12861q3() : null);
    }

    /* renamed from: a */
    public void mo2498a(RecyclerView recyclerView) {
        super.mo2498a(recyclerView);
        this.f13034n.alive();
        this.f13035o.alive();
        this.f30356a.getLifecycle().addObserver(this.f13036p);
    }

    /* renamed from: b */
    public void mo2499b(C7642k kVar) {
        C87412m.m108594g(kVar, "ev");
        Log.m105924i("Finder.FeedAdHandler", "onCenterFeedChange");
        if (this.f30359d == 0) {
            RecyclerView recyclerView = this.f30362g;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f13033m);
            }
            mo2503g();
        }
        if (kVar.f25959j == 0) {
            mo2508l(kVar.f25958i, kVar.f25960k);
        }
        this.f30361f = false;
    }

    /* renamed from: c */
    public void mo2500c() {
        super.mo2500c();
        this.f13034n.dead();
        this.f13035o.dead();
        this.f30356a.getLifecycle().removeObserver(this.f13036p);
    }

    /* renamed from: d */
    public void mo2501d(long j) {
        Log.m105924i("Finder.FeedAdHandler", "onVideoPlayOneMinute");
        if (j == this.f30358c && !this.f30361f) {
            Log.m105924i("Finder.FeedAdHandler", "onVideoPlayOneMinute feedId:" + j);
            mo2506j(j);
        }
        this.f30357b = true;
    }

    /* renamed from: e */
    public void mo2502e(long j) {
        if (j == this.f30358c && !this.f30361f) {
            mo2506j(j);
        }
        super.mo2502e(j);
    }

    /* renamed from: g */
    public final void mo2503g() {
        RecyclerView recyclerView;
        RecyclerView.C16631z F0;
        RecyclerView recyclerView2;
        RecyclerView.C16613e adapter;
        View findViewById;
        Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView invoke");
        View view = this.f13037q;
        if (!(view == null || (findViewById = view.findViewById(C0966R.C0970id.d6z)) == null)) {
            Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView");
            View findViewById2 = view.findViewById(C0966R.C0970id.d97);
            if (findViewById2 != null) {
                Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :" + 0.0f);
                ViewPropertyAnimator animate = findViewById2.animate();
                if (animate != null) {
                    animate.cancel();
                }
                findViewById2.setTranslationY(0.0f);
            }
            View findViewById3 = view.findViewById(this.f13030j);
            if (findViewById3 != null) {
                Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :" + 0.0f);
                ViewPropertyAnimator animate2 = findViewById3.animate();
                if (animate2 != null) {
                    animate2.cancel();
                }
                findViewById3.setTranslationY(0.0f);
            }
            Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :" + 0.0f);
            ViewPropertyAnimator animate3 = findViewById.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            findViewById.setTranslationY(0.0f);
        }
        if (mo2505i(this.f13031k)) {
            Log.m105924i("Finder.FeedAdHandler", "cancelAdAnimView isFollowed notify adTip gone");
            View view2 = this.f13037q;
            if (!(view2 == null || (recyclerView = this.f30362g) == null || (F0 = recyclerView.mo17021F0(view2)) == null || (recyclerView2 = this.f30362g) == null || (adapter = recyclerView2.getAdapter()) == null)) {
                adapter.notifyItemChanged(F0.mo17363j(), new C13604l(25, 6));
            }
        }
        this.f13037q = null;
    }

    /* renamed from: h */
    public final RecyclerView.C16631z mo2504h(long j) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.f30362g;
        RecyclerView.C16613e adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null) {
            return null;
        }
        Iterator it = wxRecyclerAdapter.getData().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C9493c) it.next()).getItemId() == j) {
                break;
            }
            i++;
        }
        if (i < 0 || (recyclerView = this.f30362g) == null) {
            return null;
        }
        return recyclerView.mo17023I0(i);
    }

    /* renamed from: i */
    public final boolean mo2505i(FinderContact finderContact) {
        String str;
        C65861r rVar = C65861r.f189395e;
        C65861r rVar2 = C65861r.f189395e;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        return C65861r.m77586b(rVar2, str, false, true, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo2506j(long j) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView.C16631z h = mo2504h(j);
        if (h != null && h.mo17363j() >= 0 && (recyclerView = this.f30362g) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(h.mo17363j(), new C13604l(24, 3));
        }
    }

    /* renamed from: k */
    public final void mo2507k() {
        RecyclerView recyclerView = this.f30362g;
        if (recyclerView != null) {
            recyclerView.post(new C2503b(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r1.intValue() != 9) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2508l(long r17, com.tencent.p014mm.plugin.finder.storage.FeedData r19) {
        /*
            r16 = this;
            r0 = r16
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r2 = r0.f30356a
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<ht1.y2> r2 = ht1.C8817y2.class
            bl3.c r1 = r1.mo62447c(r2)
            ht1.y2 r1 = (ht1.C8817y2) r1
            ht1.z2 r1 = r1.mo9643v2()
            r2 = 2
            r4 = r17
            com.tencent.mm.plugin.finder.feed.model.u0 r1 = r1.mo9654t1(r4, r2)
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.model.C2778b
            r6 = 0
            if (r3 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.feed.model.b r1 = (com.tencent.p014mm.plugin.finder.feed.model.C2778b) r1
            goto L_0x0026
        L_0x0025:
            r1 = r6
        L_0x0026:
            if (r1 == 0) goto L_0x002f
            int r1 = r1.f13957f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0030
        L_0x002f:
            r1 = r6
        L_0x0030:
            r3 = 8
            r7 = 32
            r8 = 0
            java.lang.String r9 = "Finder.FeedAdHandler"
            if (r1 != 0) goto L_0x003a
            goto L_0x007b
        L_0x003a:
            int r10 = r1.intValue()
            if (r10 != r3) goto L_0x007b
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r0.f13031k
            if (r1 != 0) goto L_0x005c
            vq1.r r1 = vq1.C65861r.f189395e
            vq1.r r10 = vq1.C65861r.f189395e
            if (r19 == 0) goto L_0x0050
            java.lang.String r1 = r19.getUserName()
            if (r1 != 0) goto L_0x0052
        L_0x0050:
            java.lang.String r1 = ""
        L_0x0052:
            r11 = r1
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            boolean r1 = vq1.C65861r.m77586b(r10, r11, r12, r13, r14, r15)
            goto L_0x0060
        L_0x005c:
            boolean r1 = r0.mo2505i(r1)
        L_0x0060:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "reportAdExpose isFollowCur "
            r2.append(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            if (r1 != 0) goto L_0x0087
            r2 = 3
            goto L_0x0088
        L_0x007b:
            r3 = 9
            if (r1 != 0) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "reportAdExpose userContact "
            r1.append(r3)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r0.f13031k
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            if (r2 <= 0) goto L_0x00c9
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r3 = r1
            dp1.y0 r3 = (dp1.C58417y0) r3
            r7 = 1
            r8 = 0
            r9 = 0
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r10 = r0.f30356a
            rs1.s8 r1 = r1.mo12873f(r10)
            if (r1 == 0) goto L_0x00bf
            te3.hj1 r1 = r1.mo12861q3()
            r11 = r1
            goto L_0x00c0
        L_0x00bf:
            r11 = r6
        L_0x00c0:
            java.lang.String r10 = ""
            r4 = r17
            r6 = r2
            r3.Gy0(r4, r6, r7, r8, r9, r10, r11)
            goto L_0x00dd
        L_0x00c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "iconType error: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler.mo2508l(long, com.tencent.mm.plugin.finder.storage.FeedData):void");
    }
}
