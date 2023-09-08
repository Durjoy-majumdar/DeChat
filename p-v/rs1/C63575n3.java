package rs1;

import a14.C53895h;
import a14.C53934p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p646pn.C110234e;
import p646pn.C62408g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wv0.C78727a;
import wx3.C15601d;
import wx3.C66212f;
import xv0.C112181e;

/* renamed from: rs1.n3 */
public final class C63575n3 extends UIComponent {

    /* renamed from: d */
    public boolean f180278d;

    /* renamed from: e */
    public boolean f180279e;

    /* renamed from: f */
    public boolean f180280f;

    /* renamed from: g */
    public long f180281g;

    /* renamed from: h */
    public BaseFeedLoader<C0740i2> f180282h;

    /* renamed from: i */
    public Bundle f180283i;

    /* renamed from: j */
    public boolean f180284j;

    /* renamed from: n */
    public boolean f180285n = true;

    /* renamed from: o */
    public boolean f180286o;

    /* renamed from: p */
    public boolean f180287p;

    /* renamed from: q */
    public boolean f180288q;

    /* renamed from: r */
    public C63577c f180289r = new C63577c(this);

    /* renamed from: s */
    public final C13601g f180290s = C36568h.m40985a(C63578d.f180293d);

    /* renamed from: rs1.n3$b */
    public static final class C13336b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63575n3 f37827d;

        /* renamed from: e */
        public final /* synthetic */ FinderLinearLayoutManager f37828e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f37829f;

        /* renamed from: rs1.n3$b$a */
        public static final class C13337a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderLinearLayoutManager f37830d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView f37831e;

            /* renamed from: f */
            public final /* synthetic */ long f37832f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13337a(FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView, long j) {
                super(0);
                this.f37830d = finderLinearLayoutManager;
                this.f37831e = recyclerView;
                this.f37832f = j;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: cm1.j0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r11 = this;
                    com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r0 = r11.f37830d
                    int r0 = r0.mo16957C()
                    androidx.recyclerview.widget.RecyclerView r1 = r11.f37831e
                    androidx.recyclerview.widget.RecyclerView$z r0 = r1.mo17023I0(r0)
                    boolean r1 = r0 instanceof jq3.C60905o
                    r2 = 0
                    if (r1 == 0) goto L_0x0014
                    jq3.o r0 = (jq3.C60905o) r0
                    goto L_0x0015
                L_0x0014:
                    r0 = r2
                L_0x0015:
                    r3 = 0
                    if (r0 == 0) goto L_0x0024
                    java.lang.Object r1 = r0.f173503E
                    jq3.c r1 = (jq3.C9493c) r1
                    if (r1 == 0) goto L_0x0024
                    long r5 = r1.getItemId()
                    goto L_0x0025
                L_0x0024:
                    r5 = r3
                L_0x0025:
                    r1 = 0
                    r7 = 1
                    if (r0 == 0) goto L_0x0030
                    int r8 = r0.f44859i
                    r9 = 4
                    if (r8 != r9) goto L_0x0030
                    r8 = 1
                    goto L_0x0031
                L_0x0030:
                    r8 = 0
                L_0x0031:
                    java.lang.String r9 = " seekTime="
                    java.lang.String r10 = "SimpleUIComponent"
                    if (r8 == 0) goto L_0x0091
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "[checkSeek] video feedId="
                    r1.append(r3)
                    java.lang.String r3 = o40.C61926c.m72691p(r5)
                    r1.append(r3)
                    r1.append(r9)
                    long r3 = r11.f37832f
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
                    bl3.r r1 = bl3.C39818r.f106831a
                    java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                    bl3.r$a r1 = r1.mo62446e(r3)
                    java.lang.Class<os1.u> r3 = os1.C62168u.class
                    androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
                    os1.u r1 = (os1.C62168u) r1
                    r1.mo87219c3(r5)
                    java.lang.Object r1 = r0.f173503E
                    boolean r3 = r1 instanceof cm1.C55018j0
                    if (r3 == 0) goto L_0x0073
                    r2 = r1
                    cm1.j0 r2 = (cm1.C55018j0) r2
                L_0x0073:
                    if (r2 != 0) goto L_0x0076
                    goto L_0x0078
                L_0x0076:
                    r2.f154481f = r7
                L_0x0078:
                    r1 = 2131302685(0x7f09191d, float:1.8223463E38)
                    android.view.View r0 = r0.mo85812D(r1)
                    r1 = r0
                    com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
                    if (r1 == 0) goto L_0x00d7
                    long r2 = r11.f37832f
                    r4 = 3
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 28
                    r9 = 0
                    com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.m65079J(r1, r2, r4, r5, r6, r7, r8, r9)
                    goto L_0x00d7
                L_0x0091:
                    if (r0 == 0) goto L_0x0099
                    int r2 = r0.f44859i
                    r8 = 2
                    if (r2 != r8) goto L_0x0099
                    r1 = 1
                L_0x0099:
                    if (r1 == 0) goto L_0x00d7
                    long r1 = r11.f37832f
                    int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00d7
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "[checkSeek] photo feedId="
                    r1.append(r2)
                    java.lang.String r2 = o40.C61926c.m72691p(r5)
                    r1.append(r2)
                    r1.append(r9)
                    long r2 = r11.f37832f
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
                    r1 = 2131297745(0x7f0905d1, float:1.8213444E38)
                    android.view.View r0 = r0.mo85812D(r1)
                    com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r0 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r0
                    if (r0 == 0) goto L_0x00d7
                    em1.b r0 = r0.getPlayer()
                    if (r0 == 0) goto L_0x00d7
                    long r1 = r11.f37832f
                    r0.seekTo(r1)
                L_0x00d7:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: rs1.C63575n3.C13336b.C13337a.invoke():java.lang.Object");
            }
        }

        public C13336b(C63575n3 n3Var, FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView) {
            this.f37827d = n3Var;
            this.f37828e = finderLinearLayoutManager;
            this.f37829f = recyclerView;
        }

        public final void run() {
            long longExtra = this.f37827d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0);
            if (longExtra > 0) {
                C61926c.m72666K(0, new C13337a(this.f37828e, this.f37829f, longExtra));
            }
        }
    }

    /* renamed from: rs1.n3$a */
    public static final class C63576a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63575n3 f180291d;

        public C63576a(C63575n3 n3Var) {
            this.f180291d = n3Var;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f180291d.getActivity().finish();
            this.f180291d.getActivity().overridePendingTransition(0, 0);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f180291d.getActivity().finish();
            this.f180291d.getActivity().overridePendingTransition(0, 0);
        }
    }

    /* renamed from: rs1.n3$c */
    public static final class C63577c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63575n3 f180292d;

        public C63577c(C63575n3 n3Var) {
            this.f180292d = n3Var;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C63575n3 n3Var = this.f180292d;
            n3Var.f180287p = false;
            if (n3Var.f180284j && n3Var.f180278d && !n3Var.f180288q) {
                n3Var.mo88423f3();
            }
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C63575n3 n3Var = this.f180292d;
            n3Var.f180287p = false;
            if (n3Var.f180284j && n3Var.f180278d && !n3Var.f180288q) {
                n3Var.mo88423f3();
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f180292d.f180287p = true;
        }
    }

    /* renamed from: rs1.n3$d */
    public static final class C63578d extends C87413o implements C32224a<C62408g> {

        /* renamed from: d */
        public static final C63578d f180293d = new C63578d();

        public C63578d() {
            super(0);
        }

        public Object invoke() {
            C110234e eVar = (C110234e) C86312j.m106911c(C110234e.class);
            if (eVar != null) {
                return eVar.mo161397YJ();
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63575n3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static void m74909c3(C63575n3 n3Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        C63575n3 n3Var2 = n3Var;
        boolean z4 = (i & 1) != 0 ? true : z;
        boolean z5 = (i & 2) != 0 ? false : z2;
        boolean z6 = (i & 4) != 0 ? false : z3;
        n3Var.getClass();
        FinderVideoPassiveMiniViewHelper.C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
        if (!dVar.mo77472a().mo77465I0(z5, false)) {
            Log.m105924i(C54492n.TAG, "addFloatBall: unable to add float ball");
            return;
        }
        if (!n3Var2.f180280f) {
            n3Var.mo88426j3(z5, true);
            n3Var2.f180280f = true;
        }
        if (z4) {
            FinderVideoPassiveMiniViewHelper a = dVar.mo77472a();
            a.getClass();
            a.f159094z = UUID.randomUUID().toString();
            a.f159087A = 1;
        }
        if (z6) {
            FinderVideoPassiveMiniViewHelper a2 = dVar.mo77472a();
            a2.getClass();
            a2.f159094z = UUID.randomUUID().toString();
            a2.f159087A = 3;
        }
        C53895h.m60466d(n3Var.getMainScope(), (C66212f) null, (C53934p0) null, new C63570m3(z6, z5, n3Var, z4, (C15601d<? super C63570m3>) null), 3, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88421d3(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.f180279e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r12.f180278d
            if (r0 == 0) goto L_0x001c
            boolean r0 = r12.f180284j
            if (r0 == 0) goto L_0x001c
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r0 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r0.mo77472a()
            boolean r0 = r0.mo90541w()
            if (r0 != 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            boolean r3 = r12.f180286o
            if (r3 != 0) goto L_0x0027
            if (r13 != 0) goto L_0x0025
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkBackPressedAnim: isActiveAddFloatBall="
            r4.append(r5)
            r4.append(r13)
            java.lang.String r5 = ", needExitAnimation="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", canAddPassiveFloatBall="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", activity="
            r4.append(r5)
            java.lang.Class<rs1.n3> r5 = rs1.C63575n3.class
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r3 == 0) goto L_0x010c
            if (r13 != 0) goto L_0x006b
            if (r0 == 0) goto L_0x006b
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r12
            m74909c3(r6, r7, r8, r9, r10, r11)
        L_0x006b:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            vv0.C65884b.m77629a(r13, r1)
            bl3.r r13 = bl3.C39818r.f106831a
            android.app.Activity r0 = r12.getContext()
            bl3.r$a r13 = r13.mo62443b(r0)
            java.lang.Class<rs1.q> r0 = rs1.C13371q.class
            bl3.t r13 = r13.mo62449e(r0)
            rs1.q r13 = (rs1.C13371q) r13
            if (r13 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r13.f37885e = r1
        L_0x0089:
            r12.f180286o = r2
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$a r13 = com.tencent.p014mm.plugin.finder.megavideo.p053ui.FinderMegaVideoMiniView.f160139i
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = "getContext().resources"
            gy3.C87412m.m108593f(r0, r2)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$c r2 = com.tencent.p014mm.plugin.finder.megavideo.p053ui.FinderMegaVideoMiniView.C56150c.MUSIC
            android.util.Size r13 = r13.mo78293a(r0, r2)
            rx3.g r0 = r12.f180290s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            pn.g r2 = (p646pn.C62408g) r2
            r0 = 0
            if (r2 == 0) goto L_0x00e2
            r3 = 0
            androidx.appcompat.app.AppCompatActivity r4 = r12.getActivity()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r4, r5)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            com.tencent.mm.ui.MMActivityController r4 = r4.getController()
            if (r4 == 0) goto L_0x00c5
            android.view.View r4 = r4.mo177094s()
            goto L_0x00c6
        L_0x00c5:
            r4 = r0
        L_0x00c6:
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r13.getWidth()
            int r13 = r13.getHeight()
            r5.<init>(r6, r13)
            r6 = 0
            rs1.n3$a r7 = new rs1.n3$a
            r7.<init>(r12)
            boolean r13 = r2.mo87457b(r3, r4, r5, r6, r7)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            goto L_0x00e3
        L_0x00e2:
            r13 = r0
        L_0x00e3:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = gy3.C87412m.m108589b(r13, r2)
            if (r2 == 0) goto L_0x0106
            androidx.appcompat.app.AppCompatActivity r2 = r12.getActivity()
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x00f6
            r0 = r2
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
        L_0x00f6:
            if (r0 == 0) goto L_0x0106
            android.content.res.Resources r2 = r12.getResources()
            r3 = 2131099649(0x7f060001, float:1.7811657E38)
            int r2 = r2.getColor(r3)
            r0.setNavigationbarColor(r2)
        L_0x0106:
            if (r13 == 0) goto L_0x010c
            boolean r1 = r13.booleanValue()
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63575n3.mo88421d3(boolean):boolean");
    }

    /* renamed from: e3 */
    public final void mo88422e3(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "rv");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            recyclerView.post(new C13336b(this, finderLinearLayoutManager, recyclerView));
        }
    }

    /* renamed from: f3 */
    public final void mo88423f3() {
        FinderVideoPassiveMiniViewHelper.C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
        dVar.mo77472a().f311726d.f311697r = false;
        dVar.mo77472a().mo77454E0();
        this.f180288q = true;
    }

    /* renamed from: g3 */
    public final void mo88424g3() {
        C63648v vVar = (C63648v) C39818r.f106831a.mo62444c(getActivity()).mo62449e(C63648v.class);
        if (vVar != null) {
            C61926c.m72666K(0, new C63669y(vVar));
        }
    }

    /* renamed from: i3 */
    public final void mo88425i3(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("key_anim_intent_id");
        }
        if (bundle != null) {
            bundle.remove("key_intent_animating_flag");
        }
        this.f180283i = bundle;
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88426j3(boolean r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "saveData: isPassive="
            r2.append(r3)
            r3 = r20
            r2.append(r3)
            java.lang.String r4 = ", checkAutoPlay="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ", activity="
            r2.append(r4)
            androidx.appcompat.app.AppCompatActivity r4 = r19.getActivity()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r19.getActivity()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r11 = 1
            r4 = 2131312597(0x7f093fd5, float:1.8243567E38)
            java.lang.String r5 = "FinderVideoPassive"
            java.lang.String r6 = "activity"
            r7 = 0
            r12 = 0
            if (r2 == 0) goto L_0x00e8
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r2 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r2.mo77472a()
            androidx.appcompat.app.AppCompatActivity r9 = r19.getActivity()
            bl3.r r10 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r13 = r19.getActivity()
            bl3.r$a r10 = r10.mo62444c(r13)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r13 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r13)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r10 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r10
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r13 = r10.getActiveFragment()
            if (r1 == 0) goto L_0x006f
            long r7 = r0.f180281g
        L_0x006f:
            r14 = r7
            r2.getClass()
            gy3.C87412m.m108594g(r9, r6)
            java.lang.String r1 = "fragment"
            gy3.C87412m.m108594g(r13, r1)
            r2.f159090v = r12
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99450l6
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == r11) goto L_0x0097
            java.lang.String r1 = "saveCurrentVideo: FINDER_PASSIVE_VIDEO_SWITCH is close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x024d
        L_0x0097:
            boolean r1 = r13.isVisible()
            if (r1 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveCurrentVideo: fragment is invisible, tabType="
            r1.append(r2)
            int r2 = r13.f17334o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x024d
        L_0x00b5:
            android.view.View r1 = r13.f165437h
            if (r1 == 0) goto L_0x024d
            android.view.View r1 = r1.findViewById(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r1
            if (r1 == 0) goto L_0x024d
            androidx.recyclerview.widget.RecyclerView r6 = r1.getRecyclerView()
            if (r6 == 0) goto L_0x024d
            int r7 = r13.f17334o
            r4 = r2
            r5 = r9
            r8 = r20
            r9 = r14
            r4.mo77468L0(r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r2.f159090v
            if (r1 != 0) goto L_0x00d7
            goto L_0x024d
        L_0x00d7:
            androidx.fragment.app.FragmentActivity r2 = r13.getActivity()
            if (r2 == 0) goto L_0x00e2
            java.lang.Class r2 = r2.getClass()
            goto L_0x00e4
        L_0x00e2:
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r2 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
        L_0x00e4:
            r1.f159108l = r2
            goto L_0x024d
        L_0x00e8:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r2 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r2.mo77472a()
            androidx.appcompat.app.AppCompatActivity r13 = r19.getActivity()
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r9 = r0.f180282h
            if (r9 == 0) goto L_0x00fb
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataListJustForAdapter()
            goto L_0x00fc
        L_0x00fb:
            r9 = r12
        L_0x00fc:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r10 = r0.f180282h
            if (r10 == 0) goto L_0x0106
            pe3.b r10 = r10.getLastBuffer()
            r14 = r10
            goto L_0x0107
        L_0x0106:
            r14 = r12
        L_0x0107:
            android.os.Bundle r15 = r0.f180283i
            if (r1 == 0) goto L_0x010d
            long r7 = r0.f180281g
        L_0x010d:
            r16 = r7
            r2.getClass()
            gy3.C87412m.m108594g(r13, r6)
            r2.f159090v = r12
            android.view.View r1 = r13.findViewById(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r1
            if (r1 == 0) goto L_0x024d
            androidx.recyclerview.widget.RecyclerView r6 = r1.getRecyclerView()
            if (r6 == 0) goto L_0x024d
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r13)
            java.lang.Class<rs1.o6> r4 = rs1.C13354o6.class
            bl3.t r1 = r1.mo62449e(r4)
            rs1.o6 r1 = (rs1.C13354o6) r1
            if (r9 != 0) goto L_0x0149
            androidx.recyclerview.widget.RecyclerView$e r4 = r6.getAdapter()
            boolean r7 = r4 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r7 == 0) goto L_0x0140
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
            goto L_0x0141
        L_0x0140:
            r4 = r12
        L_0x0141:
            if (r4 == 0) goto L_0x0148
            java.util.List r9 = r4.getData()
            goto L_0x0149
        L_0x0148:
            r9 = r12
        L_0x0149:
            if (r9 == 0) goto L_0x0168
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r9.iterator()
        L_0x0154:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0166
            java.lang.Object r8 = r7.next()
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x0154
            r4.add(r8)
            goto L_0x0154
        L_0x0166:
            r9 = r4
            goto L_0x0169
        L_0x0168:
            r9 = r12
        L_0x0169:
            r18 = 0
            if (r1 != 0) goto L_0x019b
            if (r9 == 0) goto L_0x0178
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r4 = 0
            goto L_0x0179
        L_0x0178:
            r4 = 1
        L_0x0179:
            if (r4 == 0) goto L_0x019b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveNormalUICurrVideo: data.size = "
            r1.append(r2)
            if (r9 == 0) goto L_0x018f
            int r2 = r9.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
        L_0x018f:
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x024d
        L_0x019b:
            r7 = 0
            r4 = r2
            r5 = r13
            r8 = r20
            r3 = r9
            r9 = r16
            r4.mo77468L0(r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r4 = r2.f159090v
            if (r4 == 0) goto L_0x023b
            te3.zv2 r4 = r4.f159107k
            if (r4 == 0) goto L_0x023b
            r4.f186886h = r14
            if (r1 == 0) goto L_0x01bf
            com.tencent.mm.plugin.finder.feed.n r1 = r1.f37856d
            jq3.o r1 = r1.mo2931f()
            if (r1 == 0) goto L_0x01bf
            java.lang.Object r1 = r1.f173503E
            jq3.c r1 = (jq3.C9493c) r1
            goto L_0x01c0
        L_0x01bf:
            r1 = r12
        L_0x01c0:
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x01c7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            goto L_0x01c8
        L_0x01c7:
            r1 = r12
        L_0x01c8:
            if (r1 == 0) goto L_0x01d4
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            r4.f186893r = r1
        L_0x01d4:
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r13)
            java.lang.Class<rs1.k5> r5 = rs1.C13298k5.class
            bl3.t r1 = r1.mo62449e(r5)
            rs1.k5 r1 = (rs1.C13298k5) r1
            if (r1 == 0) goto L_0x01ef
            jq3.o r1 = r1.mo12748f3()
            if (r1 == 0) goto L_0x01ef
            java.lang.Object r1 = r1.f173503E
            jq3.c r1 = (jq3.C9493c) r1
            goto L_0x01f0
        L_0x01ef:
            r1 = r12
        L_0x01f0:
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x01f7
            r12 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
        L_0x01f7:
            if (r12 == 0) goto L_0x0203
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            r4.f186893r = r1
        L_0x0203:
            if (r3 == 0) goto L_0x020d
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x020c
            goto L_0x020d
        L_0x020c:
            r11 = 0
        L_0x020d:
            if (r11 != 0) goto L_0x023b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r4.f186888j
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0220:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0238
            java.lang.Object r5 = r3.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            r4.add(r5)
            goto L_0x0220
        L_0x0238:
            r1.addAll(r4)
        L_0x023b:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r2.f159090v
            if (r1 != 0) goto L_0x0240
            goto L_0x0246
        L_0x0240:
            java.lang.Class r3 = r13.getClass()
            r1.f159108l = r3
        L_0x0246:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r2.f159090v
            if (r1 != 0) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r1.f159109m = r15
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63575n3.mo88426j3(boolean, boolean):void");
    }

    /* renamed from: k3 */
    public final void mo88427k3(boolean z) {
        View findViewById = getContext().findViewById(C0966R.C0970id.m1o);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().f159088B = z;
    }

    public void onBeforeFinish(Intent intent) {
        if (!this.f180279e && this.f180278d && this.f180284j && !FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo90541w()) {
            m74909c3(this, false, true, false, 4, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            androidx.appcompat.app.AppCompatActivity r10 = r9.getActivity()
            android.content.Intent r10 = r10.getIntent()
            java.lang.String r0 = "FLOAT_BALL_KEY"
            java.lang.String r10 = r10.getStringExtra(r0)
            r0 = 1
            r9.f180278d = r0
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r1 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r1.mo77472a()
            boolean r2 = r2.mo90541w()
            java.lang.String r3 = "activity"
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0070
            if (r10 == 0) goto L_0x002f
            int r10 = r10.length()
            if (r10 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r10 = 0
            goto L_0x0030
        L_0x002f:
            r10 = 1
        L_0x0030:
            if (r10 == 0) goto L_0x0068
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r10 = r1.mo77472a()
            androidx.appcompat.app.AppCompatActivity r2 = r9.getActivity()
            r10.getClass()
            gy3.C87412m.m108594g(r2, r3)
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r2 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r6 = r10.f159093y
            if (r6 == 0) goto L_0x0049
            java.lang.Class<?> r6 = r6.f159108l
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            if (r2 != 0) goto L_0x0063
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeUI> r2 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI.class
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r10 = r10.f159093y
            if (r10 == 0) goto L_0x0059
            java.lang.Class<?> r10 = r10.f159108l
            goto L_0x005a
        L_0x0059:
            r10 = r4
        L_0x005a:
            boolean r10 = gy3.C87412m.m108589b(r2, r10)
            if (r10 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r10 = 0
            goto L_0x0064
        L_0x0063:
            r10 = 1
        L_0x0064:
            if (r10 != 0) goto L_0x0068
            r9.f180278d = r5
        L_0x0068:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r10 = r1.mo77472a()
            com.tencent.mm.plugin.ball.model.BallInfo r10 = r10.f311726d
            java.lang.String r10 = r10.f311688f
        L_0x0070:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r1.mo77472a()
            androidx.appcompat.app.AppCompatActivity r6 = r9.getActivity()
            r2.getClass()
            gy3.C87412m.m108594g(r6, r3)
            java.lang.Class r3 = r6.getClass()
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r2 = r2.f159093y
            if (r2 == 0) goto L_0x0089
            java.lang.Class<?> r2 = r2.f159108l
            goto L_0x008a
        L_0x0089:
            r2 = r4
        L_0x008a:
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            r9.f180284j = r2
            android.content.Intent r2 = r9.getIntent()
            r6 = 0
            java.lang.String r3 = "KEY_ENTER_PLAYING_FEED_ID"
            long r2 = r2.getLongExtra(r3, r6)
            r9.f180281g = r2
            if (r10 != 0) goto L_0x00b5
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r10 = r1.mo77472a()
            r10.mo77454E0()
            java.lang.Class<dp1.y0> r10 = dp1.C58417y0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            dp1.y0 r10 = (dp1.C58417y0) r10
            java.lang.String r10 = r10.mo83357yP()
            r9.f180278d = r5
        L_0x00b5:
            boolean r2 = r9.f180278d
            if (r2 == 0) goto L_0x00e6
            long r2 = r9.f180281g
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00e6
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r1.mo77472a()
            gr1.o2 r3 = r2.f159091w
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r3.isPlaying()
            goto L_0x00d6
        L_0x00cc:
            em1.b r3 = r2.f159092x
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r3.isPlaying()
            goto L_0x00d6
        L_0x00d5:
            r3 = 0
        L_0x00d6:
            if (r3 == 0) goto L_0x00e4
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r2 = r2.f159093y
            if (r2 == 0) goto L_0x00e4
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f159103g
            if (r2 == 0) goto L_0x00e4
            long r6 = r2.getFeedId()
        L_0x00e4:
            r9.f180281g = r6
        L_0x00e6:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r5] = r10
            java.lang.String r3 = "SimpleUIComponent"
            java.lang.String r6 = "initFinderFloatBall key: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            boolean r2 = r9.f180284j
            if (r2 == 0) goto L_0x00f9
            boolean r2 = r9.f180278d
            if (r2 != 0) goto L_0x0103
        L_0x00f9:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r2 = r1.mo77472a()
            boolean r2 = r2.mo90541w()
            if (r2 != 0) goto L_0x010c
        L_0x0103:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r1 = r1.mo77472a()
            r2 = 32
            r1.mo35648A(r2, r10)
        L_0x010c:
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x014f
            int r10 = r10.length()
            if (r10 != 0) goto L_0x011b
            r5 = 1
        L_0x011b:
            if (r5 != 0) goto L_0x014f
            r9.f180287p = r0
            rx3.g r10 = r9.f180290s
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            pn.g r10 = (p646pn.C62408g) r10
            if (r10 == 0) goto L_0x014f
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            android.content.Intent r0 = r0.getIntent()
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            com.tencent.mm.ui.MMActivityController r1 = r1.getController()
            if (r1 == 0) goto L_0x0149
            android.view.View r1 = r1.mo177094s()
            goto L_0x014a
        L_0x0149:
            r1 = r4
        L_0x014a:
            rs1.n3$c r2 = r9.f180289r
            r10.mo87456a(r0, r1, r4, r2)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63575n3.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77469M0();
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        if (pY != null) {
            pY.mo149130k0();
        }
    }

    public void onFinished() {
        super.onFinished();
        FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo149068c0();
    }

    public void onNewIntent(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("FLOAT_BALL_KEY") : null;
        this.f180278d = !(stringExtra == null || stringExtra.length() == 0);
        FinderVideoPassiveMiniViewHelper a = FinderVideoPassiveMiniViewHelper.f159083D.mo77472a();
        AppCompatActivity activity = getActivity();
        a.getClass();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Class<?> cls = activity.getClass();
        FinderVideoPassiveMiniViewHelper.C55857e eVar = a.f159093y;
        this.f180284j = C87412m.m108589b(cls, eVar != null ? eVar.f159108l : null);
        if (intent != null) {
            this.f180281g = intent.getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0);
        }
        this.f180285n = true;
        Log.m105925i(C54492n.TAG, "alvinluo onNewIntent %s", Boolean.valueOf(this.f180287p));
        if (this.f180278d && (getActivity() instanceof MMActivity)) {
            this.f180287p = true;
            C62408g gVar = (C62408g) ((C36570n) this.f180290s).getValue();
            if (gVar != null) {
                AppCompatActivity activity2 = getActivity();
                C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivityController controller = ((MMActivity) activity2).getController();
                gVar.mo87456a(intent, controller != null ? controller.mo177094s() : null, (C78727a) null, this.f180289r);
            }
        }
    }

    public void onPause() {
        if (!this.f180280f) {
            mo88426j3(true, false);
        }
        if (this.f180284j && this.f180278d) {
            FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo64001C();
        }
        FinderVideoPassiveMiniViewHelper a = FinderVideoPassiveMiniViewHelper.f159083D.mo77472a();
        C112181e eVar = a.f311729g;
        if (eVar != null) {
            eVar.mo149147w(a.f311726d);
        }
        this.f180288q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r4 = this;
            super.onResume()
            boolean r0 = r4.f180284j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0052
            boolean r0 = r4.f180278d
            if (r0 == 0) goto L_0x0052
            boolean r0 = r4.f180285n
            if (r0 == 0) goto L_0x0052
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L_0x001e
            java.lang.String r3 = "key_enter_from_float_ball"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x002a
            java.lang.String r3 = "key_enter_with_animation"
            boolean r0 = r0.getBooleanExtra(r3, r2)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0039
            androidx.appcompat.app.AppCompatActivity r0 = r4.getActivity()
            vv0.C65884b.m77629a(r0, r2)
        L_0x0039:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            boolean r1 = r4.f180287p
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "SimpleUIComponent"
            java.lang.String r3 = "alvinluo onResume %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            boolean r0 = r4.f180287p
            if (r0 != 0) goto L_0x005b
            r4.mo88423f3()
            goto L_0x005b
        L_0x0052:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d r0 = com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.f159083D
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r0.mo77472a()
            r0.mo77471O0(r1, r1)
        L_0x005b:
            boolean r0 = r4.f180278d
            if (r0 != 0) goto L_0x0070
            java.lang.Class<pn.e> r0 = p646pn.C110234e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            if (r0 == 0) goto L_0x0070
            r0.mo149144t()
        L_0x0070:
            r4.f180285n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63575n3.onResume():void");
    }
}
