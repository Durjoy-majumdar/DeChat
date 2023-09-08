package r50;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.live.core.mini.AbsLiveMiniView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f50.C58925e;
import gy3.C87412m;
import j20.C117292a;
import kg3.C76577a;
import o40.C61926c;
import p646pn.C110234e;
import r50.C63363c;
import xv0.C112181e;
import xv0.C53451i;
import xv0.C66445c;

/* renamed from: r50.f */
public final class C63367f implements C58925e {

    /* renamed from: d */
    public final C63361a f179744d;

    /* renamed from: e */
    public final PowerManager.WakeLock f179745e;

    /* renamed from: f */
    public Intent f179746f = new Intent();

    /* renamed from: g */
    public AbsLiveMiniView f179747g;

    /* renamed from: h */
    public FrameLayout f179748h = new FrameLayout(MMApplicationContext.getContext());

    /* renamed from: i */
    public View f179749i;

    /* renamed from: j */
    public boolean f179750j;

    /* renamed from: n */
    public View f179751n;

    /* renamed from: o */
    public boolean f179752o;

    /* renamed from: p */
    public final C63368a f179753p;

    /* renamed from: r50.f$a */
    public static final class C63368a extends C53451i {

        /* renamed from: a */
        public final /* synthetic */ C63367f f179754a;

        public C63368a(C63367f fVar) {
            this.f179754a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = r4.f311693n;
         */
        /* renamed from: D2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo74085D2(com.tencent.p014mm.plugin.ball.model.BallInfo r4) {
            /*
                r3 = this;
                r50.f r0 = r3.f179754a
                r50.a r0 = r0.f179744d
                r50.b r0 = r0.mo82743z()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onFloatBallPlayButtonClick ballInfo: "
                r1.append(r2)
                if (r4 == 0) goto L_0x001f
                com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo r2 = r4.f311693n
                if (r2 == 0) goto L_0x001f
                boolean r2 = r2.f311706d
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x0020
            L_0x001f:
                r2 = 0
            L_0x0020:
                r1.append(r2)
                java.lang.String r2 = " player: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.LiveCoreMini"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                r1 = 1
                r2 = 0
                if (r4 == 0) goto L_0x0042
                com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo r4 = r4.f311693n
                if (r4 == 0) goto L_0x0042
                boolean r4 = r4.f311706d
                if (r4 != 0) goto L_0x0042
                r4 = 1
                goto L_0x0043
            L_0x0042:
                r4 = 0
            L_0x0043:
                if (r4 == 0) goto L_0x004b
                if (r0 == 0) goto L_0x005c
                r0.mo82744W()
                goto L_0x005c
            L_0x004b:
                if (r0 == 0) goto L_0x0054
                boolean r4 = r0.isPlaying()
                if (r4 != 0) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                if (r1 == 0) goto L_0x005c
                if (r0 == 0) goto L_0x005c
                r0.mo82745Z()
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r50.C63367f.C63368a.mo74085D2(com.tencent.mm.plugin.ball.model.BallInfo):void");
        }

        /* renamed from: X4 */
        public void mo74086X4(BallInfo ballInfo, BallInfo ballInfo2) {
            Log.m105924i("MicroMsg.LiveCoreMini", "onFloatBallInfoReplaced replacedBallInfo: " + ballInfo + " targetBallInfo: " + ballInfo2);
            AbsLiveMiniView absLiveMiniView = this.f179754a.f179747g;
            if (absLiveMiniView != null) {
                absLiveMiniView.mo76396c();
            }
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
            Log.m105924i("MicroMsg.LiveCoreMini", "onFloatBallInfoRemoved ballInfo: " + ballInfo);
        }

        /* renamed from: f5 */
        public void mo74087f5(BallInfo ballInfo) {
            Log.m105924i("MicroMsg.LiveCoreMini", "onFloatBallDeleteButtonClick ballInfo: " + ballInfo);
            AbsLiveMiniView absLiveMiniView = this.f179754a.f179747g;
            if (absLiveMiniView != null) {
                absLiveMiniView.mo76396c();
            }
        }
    }

    public C63367f(C63361a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f179744d = aVar;
        Log.printInfoStack("MicroMsg.LiveCoreMini", "dl: LiveMiniManager acquire wake lock", new Object[0]);
        Object systemService = MMApplicationContext.getContext().getSystemService("power");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(536870922, "MicroMsg.LiveCoreMini");
        C87412m.m108593f(newWakeLock, "pm.newWakeLock(PowerMana…er.ON_AFTER_RELEASE, TAG)");
        this.f179745e = newWakeLock;
        if (!newWakeLock.isHeld()) {
            Log.m105924i("MicroMsg.LiveCoreMini", "alvinluo acquire wakeLock");
            PowerManager.WakeLock wakeLock = newWakeLock;
            C117292a.m165357c(wakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            C117292a.m165359e(wakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        this.f179753p = new C63368a(this);
    }

    /* renamed from: a */
    public static final void m74715a(C63367f fVar) {
        Class cls = C110234e.class;
        AbsLiveMiniView absLiveMiniView = fVar.f179747g;
        int currentState = absLiveMiniView != null ? absLiveMiniView.getCurrentState() : 0;
        if (C61926c.m72696u(currentState, 4) || C61926c.m72696u(currentState, 2) || C61926c.m72696u(currentState, 1) || C61926c.m72696u(currentState, 8)) {
            C112181e pY = ((C110234e) C86312j.m106911c(cls)).mo161399pY();
            C63363c.C63364a.f179734a.getClass();
            BallInfo J = C63363c.C63364a.f179735b.f179732a.mo90534J();
            BallInfo.BallButtonInfo ballButtonInfo = J.f311693n;
            ballButtonInfo.f311706d = false;
            ballButtonInfo.f311708f = false;
            ballButtonInfo.f311709g = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f356944ao3);
            pY.mo149109a(J);
            return;
        }
        C112181e pY2 = ((C110234e) C86312j.m106911c(cls)).mo161399pY();
        C63363c.C63364a.f179734a.getClass();
        BallInfo J2 = C63363c.C63364a.f179735b.f179732a.mo90534J();
        BallInfo.BallButtonInfo ballButtonInfo2 = J2.f311693n;
        ballButtonInfo2.f311706d = true;
        ballButtonInfo2.f311708f = true;
        ballButtonInfo2.f311709g = -1;
        pY2.mo149109a(J2);
    }

    /* renamed from: X2 */
    public void mo75898X2() {
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        C63363c.C63364a.f179734a.getClass();
        BallInfo J = C63363c.C63364a.f179735b.f179732a.mo90534J();
        J.f311693n.f311706d = false;
        pY.mo149109a(J);
    }

    /* renamed from: b */
    public final void mo88272b(View view) {
        C87412m.m108594g(view, "view");
        this.f179751n = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
        this.f179748h.removeView(this.f179751n);
        this.f179748h.addView(view, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public final void mo88273c(View view) {
        C87412m.m108594g(view, "view");
        this.f179749i = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
        this.f179748h.removeAllViews();
        this.f179748h.addView(view, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: d */
    public final void mo88274d(Point point, long j, boolean z, int i, int i2, C63373l lVar) {
        Point point2 = point;
        C63373l lVar2 = lVar;
        C87412m.m108594g(point2, "size");
        C87412m.m108594g(lVar2, "ballInfo");
        boolean z2 = this.f179750j;
        AbsLiveMiniView absLiveMiniView = this.f179747g;
        C63374m mVar = new C63374m(z2, j, z, i, absLiveMiniView != null ? absLiveMiniView.mo76395b() : 0, i2);
        C63362b z3 = this.f179744d.mo82743z();
        Bitmap bitmap = null;
        lVar2.f179767f = z3 != null ? z3.getCoverUrl() : null;
        C63362b z4 = this.f179744d.mo82743z();
        if (z4 != null) {
            bitmap = z4.mo82746a();
        }
        lVar2.f179768g = bitmap;
        C63363c.C63364a.f179734a.getClass();
        C63363c cVar = C63363c.C63364a.f179735b;
        AbsLiveMiniView absLiveMiniView2 = this.f179747g;
        cVar.getClass();
        if (absLiveMiniView2 != null) {
            cVar.f179732a.mo90534J().f311696q = false;
            cVar.f179732a.mo90534J().f311692j = 1;
            BallInfo.BallButtonInfo ballButtonInfo = cVar.f179732a.mo90534J().f311693n;
            ballButtonInfo.f311709g = lVar2.f179763b;
            ballButtonInfo.f311708f = lVar2.f179764c;
            ballButtonInfo.f311706d = lVar2.f179762a;
            ballButtonInfo.f311707e = lVar2.f179765d;
            ballButtonInfo.f311710h = lVar2.f179766e;
            BallInfo.C55569c cVar2 = cVar.f179732a.mo90534J().f311694o;
            Bitmap bitmap2 = lVar2.f179768g;
            cVar2.f158211b = bitmap2;
            cVar2.f158210a = (bitmap2 == null || bitmap2.isRecycled()) ? lVar2.f179767f : "";
            if (cVar.f179732a.mo90541w()) {
                if (cVar.f179732a.mo90534J().f311689g != absLiveMiniView2) {
                    Log.m105925i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", 4, absLiveMiniView2, cVar.f179732a.mo90534J().f311689g);
                    cVar.f179732a.mo90534J().f311680E = true;
                    cVar.f179732a.mo90534J().f311679D = 4;
                    cVar.f179732a.mo90534J().f311689g = absLiveMiniView2;
                    cVar.f179732a.mo90534J().f311681F = false;
                    cVar.f179732a.mo90534J().f311677B = true;
                    cVar.f179732a.mo90534J().f311682G = z2;
                    cVar.mo88270d(mVar);
                    cVar.mo88269c(point2);
                    cVar.f179732a.mo68419u();
                } else {
                    Log.m105925i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", 4, absLiveMiniView2);
                }
                C66445c cVar3 = cVar.f179732a;
                cVar3.mo90540s(cVar3.mo90534J().f311693n);
                C66445c cVar4 = cVar.f179732a;
                cVar4.mo90542x(cVar4.mo90534J().f311694o);
            } else {
                C63365d dVar = new C63365d(4, absLiveMiniView2, cVar, z2, mVar, point);
                long nowMilliSecond = (cVar.f179733b + 200) - Util.nowMilliSecond();
                if (nowMilliSecond <= 0) {
                    dVar.run();
                } else {
                    Log.m105925i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, add delayed:%s", Long.valueOf(nowMilliSecond));
                    MMHandlerThread.postToMainThreadDelayed(dVar, nowMilliSecond);
                }
            }
        }
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149101T(21, this.f179753p);
        this.f179750j = true;
    }

    /* renamed from: e */
    public final void mo88275e() {
        Log.m105924i("MicroMsg.LiveCoreMini", "dl: LiveMiniManager release " + this.f179745e.isHeld());
        if (this.f179745e.isHeld()) {
            PowerManager.WakeLock wakeLock = this.f179745e;
            PowerManager.WakeLock wakeLock2 = wakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* renamed from: f */
    public final void mo88276f() {
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(46);
        C63363c.C63364a.f179734a.getClass();
        C63363c cVar = C63363c.C63364a.f179735b;
        AbsLiveMiniView absLiveMiniView = this.f179747g;
        if (cVar.f179732a.mo90541w()) {
            Log.m105925i("MicroMsg.LiveFloatBallHelper", "removeVoipView, has ball, view:%s", absLiveMiniView);
            cVar.f179733b = Util.nowMilliSecond();
            cVar.f179732a.mo68418k();
        } else {
            Log.m105925i("MicroMsg.LiveFloatBallHelper", "removeVoipView, no ball, view:%s", absLiveMiniView);
        }
        this.f179748h.removeView(this.f179751n);
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149089G(21, this.f179753p);
    }

    /* renamed from: g */
    public final void mo88277g(AbsLiveMiniView absLiveMiniView) {
        C77486k kVar = new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8));
        this.f179747g = absLiveMiniView;
        if (absLiveMiniView != null) {
            absLiveMiniView.setClipToOutline(true);
        }
        AbsLiveMiniView absLiveMiniView2 = this.f179747g;
        if (absLiveMiniView2 != null) {
            absLiveMiniView2.setOutlineProvider(kVar);
        }
        this.f179748h.setBackgroundColor(-16777216);
        this.f179748h.setClipToOutline(true);
        this.f179748h.setOutlineProvider(kVar);
        if (this.f179748h.getParent() != null && (this.f179748h.getParent() instanceof ViewGroup)) {
            ViewParent parent = this.f179748h.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f179748h);
        }
        AbsLiveMiniView absLiveMiniView3 = this.f179747g;
        if (absLiveMiniView3 != null) {
            absLiveMiniView3.addView(this.f179748h, 0);
        }
    }

    /* renamed from: s */
    public void mo75899s() {
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        C63363c.C63364a.f179734a.getClass();
        BallInfo J = C63363c.C63364a.f179735b.f179732a.mo90534J();
        BallInfo.BallButtonInfo ballButtonInfo = J.f311693n;
        ballButtonInfo.f311706d = true;
        ballButtonInfo.f311708f = true;
        ballButtonInfo.f311709g = -1;
        pY.mo149109a(J);
    }
}
