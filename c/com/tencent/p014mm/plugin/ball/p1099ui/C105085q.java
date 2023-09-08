package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.FrameLayout;
import aw0.C103925l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105050r;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArraySet;
import p206nj.C11171e;
import xv0.C112184g;
import xv0.C112186j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ball.ui.q */
public class C105085q implements C112184g {

    /* renamed from: g */
    public static C105085q f311869g;

    /* renamed from: d */
    public C105070f f311870d;

    /* renamed from: e */
    public boolean f311871e = false;

    /* renamed from: f */
    public volatile boolean f311872f = false;

    /* renamed from: com.tencent.mm.plugin.ball.ui.q$a */
    public class C105086a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f311873d;

        /* renamed from: e */
        public final /* synthetic */ BallInfo f311874e;

        public C105086a(List list, BallInfo ballInfo) {
            this.f311873d = list;
            this.f311874e = ballInfo;
        }

        public void run() {
            C105085q qVar = C105085q.this;
            List list = this.f311873d;
            BallInfo ballInfo = this.f311874e;
            qVar.getClass();
            try {
                if (!C103925l.m138627a(list)) {
                    Log.m105924i("MicroMsg.FloatBallUIManager", "empty ball info list");
                    MMHandlerThread.postToMainThread(new C105095z(qVar));
                } else if (!qVar.mo149235e()) {
                    Log.m105924i("MicroMsg.FloatBallUIManager", "float ball did not create");
                    qVar.mo149232a();
                    qVar.mo149236f(list, ballInfo);
                } else {
                    Log.m105924i("MicroMsg.FloatBallUIManager", "float ball already created");
                    qVar.mo149236f(list, ballInfo);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallUIManager", e, "onFloatBallInfoChangedInternal exception", new Object[0]);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static com.tencent.p014mm.plugin.ball.p1099ui.C105085q m141018d() {
        /*
            java.lang.Class<com.tencent.mm.plugin.ball.ui.q> r0 = com.tencent.p014mm.plugin.ball.p1099ui.C105085q.class
            monitor-enter(r0)
            com.tencent.mm.plugin.ball.ui.q r1 = f311869g     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ all -> 0x0018 }
            com.tencent.mm.plugin.ball.ui.q r1 = new com.tencent.mm.plugin.ball.ui.q     // Catch:{ all -> 0x0011 }
            r1.<init>()     // Catch:{ all -> 0x0011 }
            f311869g = r1     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            com.tencent.mm.plugin.ball.ui.q r0 = f311869g
            return r0
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.p1099ui.C105085q.m141018d():com.tencent.mm.plugin.ball.ui.q");
    }

    /* renamed from: B */
    public void mo145544B(List<BallInfo> list, BallInfo ballInfo) {
        Log.m105918d("MicroMsg.FloatBallUIManager", "onFloatBallInfoChanged");
        C105086a aVar = new C105086a(list, ballInfo);
        Boolean bool = C103925l.f307288a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(aVar);
        }
    }

    /* renamed from: a */
    public final void mo149232a() {
        C105070f fVar = new C105070f(MMApplicationContext.getContext());
        this.f311870d = fVar;
        fVar.f311846d.setVisibility(8);
        if (fVar.f311843a != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (C11171e.m11046c(26)) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.format = 1;
            layoutParams.packageName = MMApplicationContext.getContext().getPackageName();
            layoutParams.flags = 65824;
            layoutParams.gravity = 8388659;
            layoutParams.width = -1;
            layoutParams.height = -1;
            Boolean bool = C103925l.f307288a;
            C105050r.m140969d().getClass();
            layoutParams.x = C105050r.f311801e;
            layoutParams.y = C103925l.m138635i();
            try {
                fVar.f311843a.addView(fVar.f311846d, layoutParams);
                Log.m105924i("MicroMsg.FloatBallContainer", "attachFloatMenuViewToWindow success");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallContainer", e, "attachFloatMenuViewToWindow fail", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.FloatBallContainer", "attachFloatMenuViewToWindow, window manager is null");
        }
        fVar.f311845c.setVisibility(8);
        if (fVar.f311843a != null) {
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            if (C11171e.m11046c(26)) {
                layoutParams2.type = 2038;
            } else {
                layoutParams2.type = 2002;
            }
            layoutParams2.format = 1;
            layoutParams2.packageName = MMApplicationContext.getContext().getPackageName();
            layoutParams2.flags = 16974632;
            layoutParams2.gravity = 8388659;
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            Boolean bool2 = C103925l.f307288a;
            C105050r.m140969d().getClass();
            layoutParams2.x = C105050r.f311801e;
            layoutParams2.y = C103925l.m138635i();
            try {
                fVar.f311843a.addView(fVar.f311845c, layoutParams2);
                Log.m105924i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success");
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.FloatBallContainer", e2, "attachFloatBallViewToWindow fail", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
        }
        Set<C112186j> o0 = fVar.f311844b.mo149138o0();
        Log.m105925i("MicroMsg.FloatBallContainer", "attachToWindow, add floatBallViewListeners %s", Integer.valueOf(o0.size()));
        for (C112186j next : o0) {
            FloatBallView floatBallView = fVar.f311845c;
            if (floatBallView != null) {
                ((CopyOnWriteArraySet) floatBallView.f311982p).add(next);
            }
        }
        mo149237g();
    }

    /* renamed from: b */
    public void mo149233b() {
        if (mo149235e()) {
            FloatBallView floatBallView = this.f311870d.f311845c;
            if (floatBallView != null) {
                Log.printDebugStack("MicroMsg.FloatBallView", "clearCustomView", new Object[0]);
                FrameLayout frameLayout = floatBallView.f311997w;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    floatBallView.f311987r = null;
                    floatBallView.mo149284b0(false);
                    if (!floatBallView.mo149274Q(floatBallView.f311961d)) {
                        floatBallView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.FloatBallUIManager", "clearVOIPView, container is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((r0 != null && r0.getVisibility() == 0) != false) goto L_0x0021;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo149234c(boolean r4, android.animation.AnimatorListenerAdapter r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo149235e()
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.mo149235e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            com.tencent.mm.plugin.ball.ui.f r0 = r3.f311870d
            com.tencent.mm.plugin.ball.view.FloatMenuView r0 = r0.f311846d
            if (r0 == 0) goto L_0x001c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0043
            com.tencent.mm.plugin.ball.ui.f r0 = r3.f311870d
            com.tencent.mm.plugin.ball.view.FloatMenuView r0 = r0.f311846d
            if (r0 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x002f
            r0.mo149359b(r5)
            goto L_0x0049
        L_0x002f:
            int r4 = r0.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x003f
            java.lang.String r4 = "MicroMsg.FloatMenuView"
            java.lang.String r5 = "float menu already hide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x0049
        L_0x003f:
            r0.setVisibility(r5)
            goto L_0x0049
        L_0x0043:
            if (r5 == 0) goto L_0x0049
            r4 = 0
            r5.onAnimationEnd(r4)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.p1099ui.C105085q.mo149234c(boolean, android.animation.AnimatorListenerAdapter):void");
    }

    /* renamed from: e */
    public boolean mo149235e() {
        return this.f311870d != null;
    }

    /* renamed from: f */
    public final void mo149236f(List<BallInfo> list, BallInfo ballInfo) {
        if (mo149235e()) {
            C105070f fVar = this.f311870d;
            fVar.getClass();
            List<BallInfo> e = C103925l.m138631e(list);
            Object[] objArr = new Object[2];
            objArr[0] = C103925l.m138627a(list) ? Integer.valueOf(list.size()) : "0";
            Vector vector = (Vector) e;
            objArr[1] = Integer.valueOf(vector.size());
            Log.m105919d("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, size:%s, nonHidden: %d", objArr);
            if (C103925l.m138627a(e)) {
                BallInfo h = C103925l.m138634h(e);
                Log.m105919d("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, videoBallInfo: %s", h);
                if (h != null && vector.size() == 1) {
                    Log.m105924i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatMenuView for VIDEO");
                    FloatMenuView floatMenuView = fVar.f311846d;
                    if (floatMenuView.getVisibility() == 8) {
                        Log.m105924i("MicroMsg.FloatMenuView", "float menu already hide");
                    } else {
                        floatMenuView.setVisibility(8);
                    }
                }
                boolean z = AppForegroundDelegate.INSTANCE.f343454n;
                FloatMenuView floatMenuView2 = fVar.f311846d;
                boolean z2 = (floatMenuView2 != null && floatMenuView2.getVisibility() == 0) || fVar.f311844b.mo149084B();
                if (!z || z2 || fVar.f311844b.mo149120f0()) {
                    Log.m105925i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, foreground:%s, canNotShowFloatBall:%s, forceHideAllFloatBall: %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(fVar.f311844b.mo149120f0()));
                } else {
                    Log.m105925i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", Boolean.valueOf(fVar.f311845c.f311954W0));
                    FloatBallView floatBallView = fVar.f311845c;
                    if (!floatBallView.f311954W0) {
                        floatBallView.mo149280X(false, (AnimatorListenerAdapter) null);
                    }
                }
                if (h != null) {
                    FloatMenuView floatMenuView3 = fVar.f311846d;
                    if (!(floatMenuView3 != null && floatMenuView3.getVisibility() == 0) && !fVar.f311844b.mo149120f0()) {
                        Log.m105925i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView for VIDEO, nonHiddenSize: %d", Integer.valueOf(vector.size()));
                        fVar.f311845c.mo149280X(false, (AnimatorListenerAdapter) null);
                    }
                }
            } else if (fVar.f311846d.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView and FloatMenuView");
                fVar.f311846d.mo149359b((AnimatorListenerAdapter) null);
                fVar.f311845c.mo149342x(false, (AnimatorListenerAdapter) null);
            } else if (fVar.f311845c.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                fVar.f311845c.mo149342x(false, (AnimatorListenerAdapter) null);
            }
            FloatBallView floatBallView2 = fVar.f311845c;
            if (floatBallView2 != null) {
                floatBallView2.mo145544B(list, ballInfo);
            }
            FloatMenuView floatMenuView4 = fVar.f311846d;
            if (floatMenuView4 != null) {
                floatMenuView4.mo145544B(list, ballInfo);
            }
            fVar.f311849g.f337413b = list;
            if (!(list == null || list.size() == 0)) {
                int i = list.get(0).f311687e;
                String string = i != 2 ? i != 6 ? i != 16 ? i != 23 ? MMApplicationContext.getResources().getString(C0966R.string.ju_) : MMApplicationContext.getResources().getString(C0966R.string.jul) : MMApplicationContext.getResources().getString(C0966R.string.ju4) : MMApplicationContext.getResources().getString(C0966R.string.juj) : MMApplicationContext.getResources().getString(C0966R.string.jtt);
                if (list.size() > 1) {
                    string = MMApplicationContext.getResources().getString(C0966R.string.jui);
                }
                fVar.f311845c.f311991t.setContentDescription(string);
            }
            mo149237g();
        }
    }

    /* renamed from: g */
    public final void mo149237g() {
        Log.m105927v("MicroMsg.FloatBallUIManager", "updateNeedTranslateAnimation: %s", Boolean.valueOf(this.f311871e));
        if (this.f311871e) {
            FloatBallView floatBallView = this.f311870d.f311845c;
            if (floatBallView != null) {
                floatBallView.setNeedTranslateAnimation(true);
            }
            this.f311871e = false;
            return;
        }
        FloatBallView floatBallView2 = this.f311870d.f311845c;
        if (floatBallView2 != null) {
            floatBallView2.setNeedTranslateAnimation(false);
        }
    }
}
