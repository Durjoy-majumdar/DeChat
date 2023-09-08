package com.tencent.p014mm.plugin.finder.video.autoplay;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dg1.C58263a;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7647p;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C60143g;
import hr1.C8730k;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import rs1.C13442s8;
import rs1.C63566lb;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/autoplay/FinderMultiFlowVideoAutoPlayManager;", "Lef1/d;", "Lhr1/k;", "Ldg1/a;", "Lcom/tencent/mm/ui/MMFragmentActivity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lrs1/lb;", "recycler", "", "tabType", "<init>", "(Lcom/tencent/mm/ui/MMFragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lrs1/lb;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager */
public final class FinderMultiFlowVideoAutoPlayManager extends C58555d implements C8730k, C58263a {

    /* renamed from: g */
    public final MMFragmentActivity f161941g;

    /* renamed from: h */
    public final RecyclerView f161942h;

    /* renamed from: i */
    public final C63566lb f161943i;

    /* renamed from: j */
    public final int f161944j;

    /* renamed from: n */
    public final MMHandler f161945n = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C56531a(this));

    /* renamed from: o */
    public final HashMap<Long, Long> f161946o = new HashMap<>();

    /* renamed from: p */
    public final HashSet<String> f161947p = new HashSet<>();

    /* renamed from: q */
    public boolean f161948q;

    /* renamed from: r */
    public FinderVideoLayout f161949r;

    /* renamed from: s */
    public long f161950s;

    /* renamed from: t */
    public final int[] f161951t = new int[2];

    /* renamed from: u */
    public final Rect f161952u = new Rect();

    /* renamed from: v */
    public boolean f161953v;

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager$a */
    public static final class C56531a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ FinderMultiFlowVideoAutoPlayManager f161954d;

        public C56531a(FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager) {
            this.f161954d = finderMultiFlowVideoAutoPlayManager;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == 1) {
                Log.m105924i("Finder.VideoAutoPlayManager", "data change to check play...");
                FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager = this.f161954d;
                finderMultiFlowVideoAutoPlayManager.f161942h.post(new C60143g(finderMultiFlowVideoAutoPlayManager, message.arg1));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager$b */
    public static final class C56532b extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f161955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56532b(FinderVideoLayout finderVideoLayout) {
            super(1);
            this.f161955d = finderVideoLayout;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            C87412m.m108594g(o2Var, "view");
            FinderVideoLayout finderVideoLayout = this.f161955d;
            boolean z = true;
            if (finderVideoLayout != null) {
                z = true ^ C87412m.m108589b(finderVideoLayout.getVideoView(), o2Var.getVideoView());
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager$c */
    public static final class C56533c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderMultiFlowVideoAutoPlayManager f161956d;

        /* renamed from: e */
        public final /* synthetic */ FrameLayout.LayoutParams f161957e;

        public C56533c(FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager, FrameLayout.LayoutParams layoutParams) {
            this.f161956d = finderMultiFlowVideoAutoPlayManager;
            this.f161957e = layoutParams;
        }

        public final void run() {
            this.f161956d.f161952u.setEmpty();
            FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager = this.f161956d;
            finderMultiFlowVideoAutoPlayManager.f161942h.getGlobalVisibleRect(finderMultiFlowVideoAutoPlayManager.f161952u);
            FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager2 = this.f161956d;
            this.f161957e.topMargin = (int) (((float) finderMultiFlowVideoAutoPlayManager2.f161952u.top) + (((float) finderMultiFlowVideoAutoPlayManager2.f161942h.getHeight()) * 0.3f));
        }
    }

    public FinderMultiFlowVideoAutoPlayManager(MMFragmentActivity mMFragmentActivity, RecyclerView recyclerView, C63566lb lbVar, int i) {
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(lbVar, "recycler");
        this.f161941g = mMFragmentActivity;
        this.f161942h = recyclerView;
        this.f161943i = lbVar;
        this.f161944j = i;
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C7647p) {
            C7647p pVar = (C7647p) bVar;
            if (pVar.f25973e != pVar.f25971c) {
                this.f161945n.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        this.f161945n.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r3 = r3.f44854d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79658E1(androidx.recyclerview.widget.RecyclerView.C16631z r3) {
        /*
            r2 = this;
            com.tencent.mm.ui.MMFragmentActivity r0 = r2.f161941g
            com.tencent.mm.plugin.finder.view.k5$a r1 = com.tencent.p014mm.plugin.finder.view.C30031k5.f81274F
            boolean r1 = r1.mo57083a(r0)
            if (r1 != 0) goto L_0x003a
            com.tencent.mm.plugin.finder.view.w0$a r1 = com.tencent.p014mm.plugin.finder.view.C56660w0.f162410d
            boolean r0 = r1.mo57084a(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isHalfScreenLandingPageShowing:"
            r0.append(r1)
            boolean r1 = vo2.C65833d.f189315b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdHalfScreenLandingPageState"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = vo2.C65833d.f189315b
            if (r0 != 0) goto L_0x003a
            pf1.d0 r0 = pf1.C62262d0.f176978a
            r0.getClass()
            boolean r0 = pf1.C62262d0.f176980c
            if (r0 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            if (r3 == 0) goto L_0x004e
            android.view.View r3 = r3.f44854d
            if (r3 == 0) goto L_0x004e
            r0 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r3 = r3.findViewById(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            rs1.lb r0 = r2.f161943i
            com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager$b r1 = new com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager$b
            r1.<init>(r3)
            r0.mo80066B0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager.mo79658E1(androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: L0 */
    public void mo9561L0() {
        mo77491x1(this.f161941g, this);
        C58553c y3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f161941g).mo75002a(C13442s8.class)).mo12867y3(this.f161944j);
        if (y3 != null) {
            y3.mo83450a(this);
        }
        if (!this.f161945n.hasMessages(1)) {
            this.f161945n.sendEmptyMessageDelayed(1, 500);
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99382d8.mo60266n().intValue() == 1) {
            View decorView = this.f161941g.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = new View(this.f161941g);
            view.setBackgroundColor(-16711936);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 4);
            this.f161942h.post(new C56533c(this, layoutParams));
            view.setLayoutParams(layoutParams);
            ((FrameLayout) decorView).addView(view);
        }
    }

    /* renamed from: M0 */
    public void mo9562M0(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i("Finder.MultiFlowVideoAutoPlayManager", "[lock] scene=" + str + " isLock=" + z + " lockSize=" + this.f161947p.size() + " unLockAfterCheck=" + z2);
        if (z) {
            this.f161947p.add(str);
            this.f161948q = true;
        } else {
            this.f161947p.remove(str);
            if (this.f161947p.size() <= 0) {
                this.f161948q = false;
            }
        }
        this.f161945n.removeMessages(1);
        if (!this.f161948q && z2) {
            this.f161945n.sendEmptyMessage(1);
        }
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f161953v = false;
        this.f161945n.removeMessages(1);
        mo79658E1((RecyclerView.C16631z) null);
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f161953v = true;
        this.f161945n.sendEmptyMessage(1);
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    /* renamed from: s1 */
    public void mo9563s1(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        this.f161945n.removeMessages(1);
        this.f161945n.sendEmptyMessage(1);
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        if (!(bVar instanceof C7647p)) {
            return false;
        }
        int i = ((C7647p) bVar).f25970b;
        return i == 0 || i == 5 || i == 11;
    }
}
