package com.tencent.p014mm.plugin.ball.service;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import aw0.C103919a;
import aw0.C103922g;
import aw0.C103924i;
import aw0.C103925l;
import aw0.C103926n;
import aw0.C79635e;
import bw0.C104172l;
import bw0.C104173m;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.model.BallReportInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105085q;
import com.tencent.p014mm.plugin.ball.p1099ui.C105087r;
import com.tencent.p014mm.plugin.ball.p1099ui.C105088s;
import com.tencent.p014mm.plugin.ball.p1099ui.C105089t;
import com.tencent.p014mm.plugin.ball.p1099ui.C105090u;
import com.tencent.p014mm.plugin.ball.p1099ui.C105091v;
import com.tencent.p014mm.plugin.ball.p1099ui.C105092w;
import com.tencent.p014mm.plugin.ball.p1099ui.C105093x;
import com.tencent.p014mm.plugin.ball.p1099ui.C105094y;
import com.tencent.p014mm.plugin.ball.p1099ui.C105095z;
import com.tencent.p014mm.plugin.ball.p1099ui.FloatBallProxyUI;
import com.tencent.p014mm.plugin.ball.view.FloatBallBlurView;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.shadow.layout.WxShadowLinearLayout;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import p261wl.C38166b;
import p447aw.C103918d;
import p633on.C35204j;
import xv0.C112181e;
import xv0.C112183f;
import xv0.C112184g;
import xv0.C112185h;
import xv0.C112186j;
import xv0.C112187l;

/* renamed from: com.tencent.mm.plugin.ball.service.c */
public class C105035c implements C112181e, C81591s.C81592a {

    /* renamed from: w */
    public static C105035c f311750w;

    /* renamed from: a */
    public final List<BallInfo> f311751a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final List<BallInfo> f311752b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public Set<C112184g> f311753c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public Set<C112186j> f311754d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public final SparseArray<Set<C112185h>> f311755e = new SparseArray<>();

    /* renamed from: f */
    public Map<String, ResultReceiver> f311756f = new ConcurrentHashMap();

    /* renamed from: g */
    public volatile BallInfo f311757g = null;

    /* renamed from: h */
    public volatile BallInfo f311758h = null;

    /* renamed from: i */
    public volatile boolean f311759i = false;

    /* renamed from: j */
    public volatile boolean f311760j = false;

    /* renamed from: k */
    public volatile boolean f311761k = false;

    /* renamed from: l */
    public volatile boolean f311762l = false;

    /* renamed from: m */
    public volatile boolean f311763m = false;

    /* renamed from: n */
    public volatile boolean f311764n = true;

    /* renamed from: o */
    public volatile long f311765o = 0;

    /* renamed from: p */
    public volatile int f311766p = 0;

    /* renamed from: q */
    public volatile int f311767q = 0;

    /* renamed from: r */
    public volatile int f311768r = 0;

    /* renamed from: s */
    public volatile boolean f311769s = false;

    /* renamed from: t */
    public View f311770t;

    /* renamed from: u */
    public volatile BallInfo f311771u = null;

    /* renamed from: v */
    public int f311772v = -1;

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
    /* renamed from: r0 */
    public static com.tencent.p014mm.plugin.ball.service.C105035c m140879r0() {
        /*
            java.lang.Class<com.tencent.mm.plugin.ball.service.c> r0 = com.tencent.p014mm.plugin.ball.service.C105035c.class
            monitor-enter(r0)
            com.tencent.mm.plugin.ball.service.c r1 = f311750w     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ all -> 0x0018 }
            com.tencent.mm.plugin.ball.service.c r1 = new com.tencent.mm.plugin.ball.service.c     // Catch:{ all -> 0x0011 }
            r1.<init>()     // Catch:{ all -> 0x0011 }
            f311750w = r1     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            com.tencent.mm.plugin.ball.service.c r0 = f311750w
            return r0
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.service.C105035c.m140879r0():com.tencent.mm.plugin.ball.service.c");
    }

    /* renamed from: A */
    public void mo149083A(BallInfo ballInfo, boolean z) {
        BallInfo ballInfo2 = ballInfo;
        int i = ballInfo2.f311683H.f311721j;
        if (!(i == 1 || i == 2 || i == 3)) {
            Log.m105929w("MicroMsg.FloatBallReportLogic", "activeBallTypeReport unexpected opType:%d", Integer.valueOf(i));
            ballInfo2.f311683H.f311721j = 3;
        }
        C105034a.m140877c(ballInfo, ballInfo2.f311683H.f311721j, Util.nowMilliSecond() - ballInfo2.f311703x, 0, 0, 0, 0);
        if (z) {
            mo149172B0(ballInfo2, true);
        }
        Class<C112183f> cls = C112183f.class;
        int i2 = ballInfo2.f311686d;
        if (i2 == 20) {
            i2 = ballInfo2.f311687e;
        }
        Log.m105919d("MicroMsg.FloatBallService", "alvinluo notifySingleBallInfoClicked type: %d, contentType: %d", Integer.valueOf(i2), Integer.valueOf(ballInfo2.f311687e));
        Set<C112185h> set = this.f311755e.get(i2);
        if (C103925l.m138627a(set)) {
            for (C112185h G1 : set) {
                G1.mo64040G1(ballInfo2);
            }
        }
        C38166b.m41756c(cls, Integer.valueOf(i2), new C105046n(this, ballInfo2));
        Set<C112185h> set2 = this.f311755e.get(0);
        if (C103925l.m138627a(set2)) {
            for (C112185h G12 : set2) {
                G12.mo64040G1(ballInfo2);
            }
        }
        C38166b.m41756c(cls, 0, new C105047o(this, ballInfo2));
    }

    /* renamed from: A0 */
    public final void mo149171A0(BallInfo ballInfo) {
        Class<C112183f> cls = C112183f.class;
        Set<C112185h> set = this.f311755e.get(ballInfo.f311686d);
        if (C103925l.m138627a(set)) {
            for (C112185h c2 : set) {
                c2.mo64042c2(ballInfo);
            }
        }
        C38166b.m41756c(cls, Integer.valueOf(ballInfo.f311686d), new c$$b(this, ballInfo));
        Set<C112185h> set2 = this.f311755e.get(0);
        if (C103925l.m138627a(set2)) {
            for (C112185h c25 : set2) {
                c25.mo64042c2(ballInfo);
            }
        }
        C38166b.m41756c(cls, 0, new c$$c(this, ballInfo));
    }

    /* renamed from: B */
    public boolean mo149084B() {
        return this.f311760j;
    }

    /* renamed from: B0 */
    public final void mo149172B0(BallInfo ballInfo, boolean z) {
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            m0.f311703x = Util.nowMilliSecond();
            this.f311771u = m0;
            Log.m105925i("MicroMsg.FloatBallService", "onEnterBallInfoPage, set lastEnteredBallInfo:%s, withFloatBall: %s", this.f311771u.mo149041e(), Boolean.valueOf(z));
            mo149173C0(z);
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = ballInfo != null ? ballInfo.mo149041e() : "null";
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.FloatBallService", "onEnterBallInfoPage, no this ball info:%s, withFloatBall: %s", objArr);
    }

    /* renamed from: C */
    public void mo149085C(BallInfo ballInfo) {
        FloatBallView floatBallView;
        FloatBallBlurView floatBallBlurView;
        BallInfo ballInfo2;
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            Log.m105925i("MicroMsg.FloatBallService", "updateBallBlurInfo, existed:true, ballInfo:%s", m0);
            BallInfo.C55569c cVar = m0.f311694o;
            BallInfo.C55569c cVar2 = ballInfo.f311694o;
            cVar.getClass();
            cVar.f158210a = cVar2.f158210a;
            cVar.f158211b = cVar2.f158211b;
            C105085q d = C105085q.m141018d();
            if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null && (floatBallBlurView = floatBallView.f312002y) != null && (ballInfo2 = floatBallView.f311960c1) != null && ballInfo2 == ballInfo) {
                C103919a.m138617a(ballInfo.f311694o, floatBallBlurView);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "updatePlayButton, existed:false");
    }

    /* renamed from: C0 */
    public final void mo149173C0(boolean z) {
        boolean z2;
        FloatMenuView floatMenuView;
        BallInfo m0 = mo149134m0(this.f311771u);
        if (m0 == null || !C103925l.m138627a(this.f311751a)) {
            Object[] objArr = new Object[1];
            objArr[0] = this.f311771u != null ? this.f311771u.mo149041e() : "null";
            Log.m105925i("MicroMsg.FloatBallService", "recheckBallInfoList, last enteredBallInfo:%s", objArr);
        } else {
            List<BallInfo> list = this.f311751a;
            if (C103925l.m138627a(list)) {
                Iterator it = ((CopyOnWriteArrayList) list).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((BallInfo) it.next()).equals(m0)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                Log.m105924i("MicroMsg.FloatBallService", "recheckBallInfoList, has other balls, hidden current ball info");
                C105085q d = C105085q.m141018d();
                boolean z3 = d.mo149235e() && (floatMenuView = d.f311870d.f311846d) != null && floatMenuView.getVisibility() == 0;
                Log.m105925i("MicroMsg.FloatBallService", "recheckBallInfoList, canNotShowFloatBall:%s, withFloatBall:%s", Boolean.valueOf(z3), Boolean.valueOf(z));
                if (!z3 && z) {
                    mo149176F0(m0, 1.0f);
                }
                Iterator it4 = ((CopyOnWriteArrayList) this.f311751a).iterator();
                while (it4.hasNext()) {
                    BallInfo ballInfo = (BallInfo) it4.next();
                    if (!ballInfo.f311680E && ballInfo.f311681F && !ballInfo.equals(m0)) {
                        ballInfo.f311681F = false;
                        mo149187z0(ballInfo, 4, (Bundle) null);
                    } else if (ballInfo.equals(m0)) {
                        ballInfo.f311681F = true;
                    }
                }
            } else if (C103925l.m138629c(this.f311751a, m0)) {
                Log.m105924i("MicroMsg.FloatBallService", "recheckBallInfoList, no other balls, make float ball transparent");
                m0.f311681F = false;
                mo149176F0(m0, 0.0f);
            }
        }
        mo149186y0();
    }

    /* renamed from: D */
    public void mo149086D(boolean z) {
        mo149182u0(true);
        mo149181t0(z, (AnimatorListenerAdapter) null);
    }

    /* renamed from: D0 */
    public final void mo149174D0(BallInfo ballInfo) {
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null && m0.f311680E) {
            Log.m105925i("MicroMsg.FloatBallService", "removeAppBrandPassiveBallInfo, remove existedBallInfo:%s", m0);
            m0.f311683H.f311721j = 10;
            mo149108Z(m0);
        }
    }

    /* renamed from: E */
    public void mo149087E(BallInfo ballInfo) {
        if (ballInfo != null) {
            C105034a.m140875a(ballInfo, this.f311751a);
        }
    }

    /* renamed from: E0 */
    public final void mo149175E0(boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        Bundle bundle;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall, no float window permission");
            if (C103925l.m138627a(this.f311751a)) {
                BallInfo ballInfo = null;
                Iterator it = ((CopyOnWriteArrayList) this.f311751a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BallInfo ballInfo2 = (BallInfo) it.next();
                    if (ballInfo2.f311686d == 7) {
                        ballInfo = ballInfo2;
                        break;
                    }
                }
                if (ballInfo != null) {
                    Log.m105924i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, removed");
                    mo149108Z(ballInfo);
                } else {
                    Log.m105924i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, ignore");
                }
            }
            C105085q d = C105085q.m141018d();
            d.getClass();
            MMHandlerThread.postToMainThread(new C105095z(d));
            this.f311759i = false;
            ((CopyOnWriteArrayList) this.f311751a).clear();
            Log.m105924i("MicroMsg.FloatBallService", "ballinfo clear2");
            C105050r d2 = C105050r.m140969d();
            synchronized (d2) {
                MultiProcessMMKV.getMMKV(d2.mo149194c()).clear();
            }
            mo149186y0();
        } else if (!this.f311759i) {
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall, restore data from storage");
            if (C86709a0.m107522a()) {
                C105050r.m140969d().getClass();
                List<BallInfo> list = C105050r.f311800d;
                Log.m105924i("MicroMsg.FloatBallService", "restoreProcessNameWithFileType");
                if (!(list == null || list.size() == 0)) {
                    for (BallInfo next : list) {
                        if (!(next == null || next.f311686d != 4 || (bundle = next.f311678C) == null)) {
                            String string = bundle.getString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                            if (!Util.isNullOrNil(string)) {
                                Log.m105925i("MicroMsg.FloatBallService", "restore with process name: %s", string);
                                next.f311678C.putString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, "");
                            }
                        }
                    }
                }
                ((CopyOnWriteArrayList) this.f311751a).clear();
                Log.m105924i("MicroMsg.FloatBallService", "ballinfo clear1");
                if (C85875k4.m106163T()) {
                    ((CopyOnWriteArrayList) this.f311751a).addAll(C103925l.m138633g(list));
                    Log.m105924i("MicroMsg.FloatBallService", "ballinfo add1, size:" + ((CopyOnWriteArrayList) this.f311751a).size());
                } else {
                    ((CopyOnWriteArrayList) this.f311751a).addAll(list);
                    Log.m105924i("MicroMsg.FloatBallService", "ballinfo add2, size:" + ((CopyOnWriteArrayList) this.f311751a).size());
                }
                List<BallInfo> d3 = C103925l.m138630d(list);
                ((CopyOnWriteArrayList) this.f311752b).clear();
                ((CopyOnWriteArrayList) this.f311752b).addAll(d3);
                this.f311759i = true;
                MMHandlerThread.postToMainThreadDelayed(new C105044l(this), 100);
                return;
            }
            Log.m105924i("MicroMsg.FloatBallService", "restoreDataFromStorage, account not ready");
        } else if (this.f311760j && !mo149128j0()) {
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall, has marked no float ball page, ignore resuming");
        } else if (this.f311761k) {
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall, has marked forceHideAllFloatBall, ignore resuming");
        } else if (this.f311763m) {
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall, hasHideForKeyboardHeightChange, ignore resuming");
        } else {
            BallInfo m0 = mo149134m0(this.f311771u);
            if (!((m0 == null || !C103925l.m138627a(this.f311751a)) ? false : C103925l.m138629c(this.f311751a, m0))) {
                Log.m105925i("MicroMsg.FloatBallService", "resumeFloatBall not singleBallInfoCondition, withAnimation:%s", Boolean.valueOf(z));
                C105085q d4 = C105085q.m141018d();
                d4.getClass();
                MMHandlerThread.postToMainThread(new C105094y(d4, z, z2, animatorListenerAdapter));
                return;
            }
            Log.m105924i("MicroMsg.FloatBallService", "resumeFloatBall singleBallInfoCondition, withAnimation:false");
            C105085q d5 = C105085q.m141018d();
            d5.getClass();
            MMHandlerThread.postToMainThread(new C105094y(d5, false, z2, animatorListenerAdapter));
            mo149172B0(this.f311771u, true);
        }
    }

    /* renamed from: F */
    public void mo149088F(BallInfo ballInfo) {
        FloatMenuView floatMenuView;
        BallInfo ballInfo2 = ballInfo;
        Object[] objArr = new Object[1];
        objArr[0] = this.f311771u != null ? this.f311771u.mo149041e() : "null";
        Log.m105925i("MicroMsg.FloatBallService", "onExitBallInfoPage, lastEnteredBallInfo:%s", objArr);
        this.f311771u = null;
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            Log.m105925i("MicroMsg.FloatBallService", "onExitBallInfoPage, ballInfo:%s", m0);
            BallReportInfo ballReportInfo = m0.f311683H;
            int i = ballReportInfo.f311721j;
            if (i == -1) {
                ballReportInfo.f311721j = 0;
            } else if (i != -1) {
                if (!(i == 7 || i == 4 || i == 5 || i == 12 || i == 13)) {
                    Log.m105929w("MicroMsg.FloatBallReportLogic", "minimizeBallReport unexpected opType:%d", Integer.valueOf(i));
                    m0.f311683H.f311721j = 6;
                }
                C105034a.m140877c(m0, m0.f311683H.f311721j, 0, 0, 0, Util.nowMilliSecond() - m0.f311703x, 0);
            }
            C105085q d = C105085q.m141018d();
            if (d.mo149235e() && (floatMenuView = d.f311870d.f311846d) != null && floatMenuView.getVisibility() == 0) {
                C105085q d2 = C105085q.m141018d();
                C105045m mVar = new C105045m(this, ballInfo2);
                d2.getClass();
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    d2.mo149234c(true, mVar);
                } else {
                    MMHandlerThread.postToMainThread(new C105092w(d2, true, mVar));
                }
            } else if (!this.f311761k) {
                mo149176F0(ballInfo2, 1.0f);
            }
            if (m0.f311681F) {
                m0.f311681F = false;
                mo149186y0();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "onExitBallInfoPage, no this ball info");
        C105085q d3 = C105085q.m141018d();
        C105045m mVar2 = new C105045m(this, ballInfo2);
        d3.getClass();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            d3.mo149234c(true, mVar2);
        } else {
            MMHandlerThread.postToMainThread(new C105092w(d3, true, mVar2));
        }
    }

    /* renamed from: F0 */
    public void mo149176F0(BallInfo ballInfo, float f) {
        if (f == 1.0f || C103925l.m138629c(this.f311751a, ballInfo)) {
            C105085q d = C105085q.m141018d();
            d.getClass();
            MMHandlerThread.postToMainThread(new C105090u(d, f));
        }
    }

    /* renamed from: G */
    public void mo149089G(int i, C112185h hVar) {
        Log.m105925i("MicroMsg.FloatBallService", "removeFloatBallInfoEventListener, type:%s", Integer.valueOf(i));
        if (hVar != null) {
            synchronized (this.f311755e) {
                Set set = this.f311755e.get(i);
                if (set != null) {
                    set.remove(hVar);
                }
            }
        }
    }

    /* renamed from: G0 */
    public final boolean mo149177G0(int i, int i2, boolean z, boolean z2, boolean z3, AnimatorListenerAdapter animatorListenerAdapter) {
        int i3;
        boolean z4 = z;
        AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
        boolean j0 = mo149128j0();
        Log.m105925i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight needShowFloatBall: %b", Boolean.valueOf(j0));
        if (!j0 || this.f311769s || !this.f311763m) {
            int i4 = C103926n.f307292b + C103926n.f307293c + C103926n.f307294d;
            View view = this.f311770t;
            if (view != null) {
                i4 = Math.max(view.getMeasuredHeight(), i4);
            }
            C105085q d = C105085q.m141018d();
            if (d.mo149235e()) {
                FloatBallView floatBallView = d.f311870d.f311845c;
                i3 = floatBallView != null ? floatBallView.getPositionY() : C103925l.m138635i();
            } else {
                i3 = C103925l.m138635i();
            }
            boolean z5 = ((i3 + i4) + i) + (z3 ? i2 : 0) >= this.f311768r && i > 0;
            Log.m105925i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight, ballPositionY:[%s, %s], keyboardHeight:%s, screenHeight:%s, extraHeight: %d, hide: %b, checkBottomShadow: %b, checkExtraHeight: %b", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(this.f311768r), Integer.valueOf(i2), Boolean.valueOf(z5), Boolean.valueOf(z2), Boolean.valueOf(z3));
            if (z5) {
                this.f311763m = true;
                mo149181t0(z4, animatorListenerAdapter2);
                return true;
            } else if (!this.f311763m) {
                return false;
            } else {
                this.f311763m = false;
                mo149175E0(z4, true, animatorListenerAdapter2);
                return true;
            }
        } else {
            this.f311763m = false;
            View view2 = this.f311770t;
            if (view2 == null || view2.getVisibility() == 0) {
                Log.m105918d("MicroMsg.FloatBallService", "alvinluo updateBallVisibilityByKbHeight has voip and visible, not need to show");
                return false;
            }
            Log.m105918d("MicroMsg.FloatBallService", "alvinluo updateBallVisibilityByKbHeight has voip but not visible and delay show animation");
            View view3 = this.f311770t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f311770t;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo149175E0(z4, false, animatorListenerAdapter2);
            return true;
        }
    }

    /* renamed from: H */
    public boolean mo149090H() {
        return this.f311762l;
    }

    /* renamed from: H0 */
    public void mo149178H0(BallInfo ballInfo) {
        if (this.f311757g == null) {
            Log.m105928w("MicroMsg.FloatBallService", "alvinluo updateMessageBall messageBallInfo is null and ignore");
        } else if (mo149134m0(this.f311757g) != null) {
            this.f311757g.mo149050p(ballInfo);
            this.f311757g.f311688f = ballInfo.f311688f;
            Log.m105925i("MicroMsg.FloatBallService", "alvinluo updateMessageBall existed: true, and update %s", this.f311757g);
            mo149110a0(this.f311757g);
        } else {
            Log.m105928w("MicroMsg.FloatBallService", "alvinluo updateMessageBall messageBallInfo not null but not added!!");
        }
    }

    /* renamed from: I */
    public List<BallInfo> mo149091I() {
        return this.f311752b;
    }

    /* renamed from: J */
    public void mo149092J(C112184g gVar) {
        ((CopyOnWriteArraySet) this.f311753c).add(gVar);
    }

    /* renamed from: K */
    public void mo149093K(ResultReceiver resultReceiver) {
        C105085q d = C105085q.m141018d();
        d.getClass();
        MMHandlerThread.postToMainThread(new C105091v(d, true, resultReceiver));
    }

    /* renamed from: L */
    public void mo149094L(int i, int i2, boolean z, long j) {
        this.f311766p = i;
        this.f311767q = i2;
        this.f311769s = z;
        if (!C105085q.m141018d().mo149235e()) {
            Log.m105924i("MicroMsg.FloatBallService", "KeyboardHeightChanged, no float ball");
            return;
        }
        if (z) {
            mo149141q(true);
        } else {
            mo149141q(false);
        }
        if (j != 0) {
            MMHandlerThread.postToMainThreadDelayed(new c$$e(this, i, i2), j);
        } else {
            mo149177G0(i, i2, true, true, this.f311766p != 0, (AnimatorListenerAdapter) null);
        }
    }

    /* renamed from: M */
    public void mo149095M(BallInfo ballInfo) {
        boolean z = false;
        if (!(ballInfo.f311686d == 6 && ballInfo.f311683H.f311716e == 11) || C103922g.m138623b()) {
            int i = ballInfo.f311686d;
            if (i == 7) {
                Log.m105924i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: location");
            } else if (i == 17) {
                Log.m105924i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand_voip");
            } else if (i == 18) {
                Log.m105924i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: audio_of_video_background_play");
            } else if (i == 33) {
                Log.m105924i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand bluetooth");
            } else {
                z = true;
            }
            if (z) {
                C103922g.m138622a(MMApplicationContext.getContext(), ballInfo.f311686d, true, new c$$f(this, ballInfo));
            } else {
                mo149179q0(ballInfo);
            }
        } else {
            Log.m105924i("MicroMsg.FloatBallService", "isAskForPermissionAlready, no permission & no ask for");
        }
    }

    /* renamed from: N */
    public boolean mo149096N(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        if (!C105085q.m141018d().mo149235e()) {
            Log.m105924i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition, no float ball");
            return false;
        } else if (!this.f311769s) {
            Log.m105924i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition keyboard not show and ignore");
            return false;
        } else {
            return mo149177G0(this.f311766p, this.f311767q, z, false, false, animatorListenerAdapter);
        }
    }

    /* renamed from: O */
    public void mo149097O(boolean z) {
        mo149182u0(false);
        mo149115d(z);
    }

    /* renamed from: P */
    public void mo113864P(List<AppBrandBackgroundRunningApp> list, AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel, int i) {
        Log.m105925i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation:%s, change:%s", appBrandBackgroundRunningOperationParcel, Integer.valueOf(i));
        if (i != 0) {
            int i2 = appBrandBackgroundRunningOperationParcel.f239225g;
            if (i2 == 2 || i2 == 3) {
                if ((appBrandBackgroundRunningOperationParcel.f239224f & 2) > 0) {
                    mo149174D0(new BallInfo(7, C79635e.m96714b(appBrandBackgroundRunningOperationParcel.f239222d, appBrandBackgroundRunningOperationParcel.f239223e), (JSONObject) null));
                }
                if ((appBrandBackgroundRunningOperationParcel.f239224f & 4) > 0) {
                    String str = appBrandBackgroundRunningOperationParcel.f239222d;
                    int i3 = appBrandBackgroundRunningOperationParcel.f239223e;
                    mo149174D0(new BallInfo(17, String.format(Locale.US, "%s#%d", new Object[]{str, Integer.valueOf(i3)}), (JSONObject) null));
                }
                if ((appBrandBackgroundRunningOperationParcel.f239224f & 8) > 0) {
                    mo149174D0(new BallInfo(18, C79635e.m96713a(appBrandBackgroundRunningOperationParcel.f239222d, appBrandBackgroundRunningOperationParcel.f239223e), (JSONObject) null));
                }
                if ((appBrandBackgroundRunningOperationParcel.f239224f & 16) > 0) {
                    mo149174D0(new BallInfo(19, C79635e.m96713a(appBrandBackgroundRunningOperationParcel.f239222d, appBrandBackgroundRunningOperationParcel.f239223e), (JSONObject) null));
                }
                if ((appBrandBackgroundRunningOperationParcel.f239224f & 32) > 0) {
                    mo149174D0(new BallInfo(33, C79635e.m96713a(appBrandBackgroundRunningOperationParcel.f239222d, appBrandBackgroundRunningOperationParcel.f239223e), (JSONObject) null));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation ignored");
        }
    }

    /* renamed from: Q */
    public void mo149098Q(View view) {
        this.f311770t = view;
    }

    /* renamed from: R */
    public void mo149099R(long j) {
        this.f311765o = j;
    }

    /* renamed from: S */
    public void mo149100S(BallInfo ballInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        BallInfo s0 = mo149180s0();
        if (s0 != null) {
            s0.f311679D = ballInfo.f311679D;
            s0.f311684I = ballInfo.f311684I;
            FloatBallView floatBallView = C105085q.m141018d().f311870d.f311845c;
            if (floatBallView != null) {
                Log.m105924i("MicroMsg.FloatBallView", "alvinluo switchVoipVoice");
                if (s0.f311684I == null) {
                    Log.m105928w("MicroMsg.FloatBallView", "switchVoip animationInfo invalid and ignore");
                    return;
                }
                Point point = new Point(s0.f311684I.f311713a);
                Point point2 = new Point(s0.f311684I.f311714b);
                if (!floatBallView.mo149273P(point) || !floatBallView.mo149273P(point2)) {
                    Log.m105928w("MicroMsg.FloatBallView", "switchVoip animationInfo size invalid and ignore");
                    return;
                }
                floatBallView.f311972i1 = 80;
                floatBallView.mo149301h0(80 | (floatBallView.f312003y0 ? 8388611 : 8388613), true);
                FrameLayout frameLayout = floatBallView.f311997w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                Log.m105925i("MicroMsg.FloatBallView", "alvinluo animateVoipSwitch state: %d, startSize: %s, endSize: %s, current: %d, %d", Integer.valueOf(s0.f311679D), point, point2, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(300);
                if (animatorListenerAdapter != null) {
                    ofFloat.addListener(animatorListenerAdapter);
                }
                ofFloat.addListener(new C104172l(floatBallView, s0, point, point2));
                ofFloat.addUpdateListener(new C104173m(floatBallView, layoutParams, point, point2, frameLayout));
                ofFloat.start();
            }
        }
    }

    /* renamed from: T */
    public void mo149101T(int i, C112185h hVar) {
        Log.m105925i("MicroMsg.FloatBallService", "addFloatBallInfoEventListener, type:%s", Integer.valueOf(i));
        if (hVar != null) {
            synchronized (this.f311755e) {
                Set set = this.f311755e.get(i);
                if (set == null) {
                    set = new HashSet();
                    this.f311755e.put(i, set);
                }
                set.add(hVar);
            }
        }
    }

    /* renamed from: U */
    public void mo149102U(C112184g gVar) {
        ((CopyOnWriteArraySet) this.f311753c).remove(gVar);
    }

    /* renamed from: V */
    public void mo149103V(BallInfo ballInfo, boolean z) {
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            m0.f311681F = !z;
            Log.m105925i("MicroMsg.FloatBallService", "updateBallVisibility, existed:true, visible:%s, ballInfo:%s", Boolean.valueOf(z), m0);
            mo149186y0();
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "updateBallVisibility, existed:false");
    }

    /* renamed from: W */
    public void mo149104W(boolean z) {
        C105085q d = C105085q.m141018d();
        if (d.mo149235e()) {
            d.f311870d.f311848f = z;
        }
    }

    /* renamed from: X */
    public void mo149105X(boolean z) {
        Log.m105925i("MicroMsg.FloatBallService", "markQBFileViewPage:%s", Boolean.valueOf(z));
        this.f311762l = z;
    }

    /* renamed from: Y */
    public Point mo149106Y(int i, Point point) {
        Point point2 = new Point();
        C105050r.m140969d().getClass();
        if (C105050r.f311804h) {
            point2.set(FloatBallView.f311923O1, C103925l.m138635i() + C103926n.f307293c);
        } else {
            point2.set((i - point.x) - FloatBallView.f311923O1, C103925l.m138635i() + C103926n.f307293c);
        }
        C105050r.m140969d().getClass();
        Log.m105925i("MicroMsg.FloatBallService", "getFloatBallPositionForAnimation viewWidth: %s, dockLeft: %s, ballSize: %s, position:[%s, %s]", Integer.valueOf(i), Boolean.valueOf(C105050r.f311804h), point, Integer.valueOf(point2.x), Integer.valueOf(point2.y));
        return point2;
    }

    /* renamed from: Y1 */
    public void mo149107Y1() {
        PlaySound.play(MMApplicationContext.getContext(), C0966R.string.lgu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149108Z(com.tencent.p014mm.plugin.ball.model.BallInfo r10) {
        /*
            r9 = this;
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r0 = r9.f311751a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.contains(r10)
            java.lang.String r1 = "MicroMsg.FloatBallService"
            if (r0 == 0) goto L_0x00d1
            java.lang.Boolean r0 = aw0.C103925l.f307288a
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r0 = r9.f311751a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r10)
            com.tencent.mm.plugin.ball.service.r r0 = com.tencent.p014mm.plugin.ball.service.C105050r.m140969d()
            r0.mo149196f(r10)
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r0 = r9.f311751a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            com.tencent.p014mm.plugin.ball.service.C105034a.m140878d(r10, r0)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r10
            java.lang.String r4 = "removeBallInfo, existed:true, ballInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            com.tencent.mm.plugin.ball.model.BallInfo r2 = r9.f311771u
            r4 = 0
            if (r2 == 0) goto L_0x0048
            com.tencent.mm.plugin.ball.model.BallInfo r2 = r9.f311771u
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = "removeBallInfo, remove last enteredBallInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r9.f311771u = r4
        L_0x0048:
            com.tencent.mm.plugin.ball.ui.q r1 = com.tencent.p014mm.plugin.ball.p1099ui.C105085q.m141018d()
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r2 = r9.f311751a
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            int r2 = r2.size()
            r1.getClass()
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6[r3] = r7
            int r7 = r10.f311679D
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            boolean r7 = r10.f311681F
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.FloatBallUIManager"
            java.lang.String r8 = "alvinluo onFloatBallRemoved size: %d, state: %d, hidden: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r8, r6)
            if (r2 != 0) goto L_0x0090
            boolean r2 = r1.mo149235e()
            if (r2 == 0) goto L_0x0090
            int r2 = r10.f311679D
            if (r2 == 0) goto L_0x0089
            boolean r2 = r10.f311681F
            if (r2 != 0) goto L_0x0089
            r3 = 1
        L_0x0089:
            if (r3 == 0) goto L_0x0090
            boolean r2 = r10.f311697r
            r1.f311871e = r2
            goto L_0x00b0
        L_0x0090:
            boolean r2 = aw0.C103925l.m138640n(r10)
            if (r2 == 0) goto L_0x00b0
            com.tencent.mm.plugin.ball.ui.p r2 = new com.tencent.mm.plugin.ball.ui.p
            r2.<init>(r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r1 != r3) goto L_0x00a9
            r2.run()
            goto L_0x00b0
        L_0x00a9:
            zt3.t r1 = zt3.C119157j.f356862d
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
        L_0x00b0:
            r9.mo149173C0(r0)
            r9.mo149187z0(r10, r5, r4)
            r9.mo149171A0(r10)
            java.lang.Class<c02.c> r0 = c02.C92331c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            c02.c r0 = (c02.C92331c) r0
            java.lang.String r1 = r10.f311688f
            r0.mo58349Bn(r1)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r9.f311757g
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00d7
            r9.f311757g = r4
            goto L_0x00d7
        L_0x00d1:
            java.lang.String r10 = "removeBallInfo, existed:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.service.C105035c.mo149108Z(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    /* renamed from: a */
    public void mo149109a(BallInfo ballInfo) {
        FloatBallView floatBallView;
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            Log.m105925i("MicroMsg.FloatBallService", "updatePlayButton, existed:true, ballInfo:%s", m0);
            m0.f311693n.mo149054a(ballInfo.f311693n);
            C105085q d = C105085q.m141018d();
            if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
                floatBallView.mo149320p0(ballInfo);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "updatePlayButton, existed:false");
    }

    /* renamed from: a0 */
    public void mo149110a0(BallInfo ballInfo) {
        BallInfo m0 = mo149134m0(ballInfo);
        if (m0 != null) {
            m0.mo149050p(ballInfo);
            Log.m105925i("MicroMsg.FloatBallService", "updateBallInfo, existed:true, ballInfo:%s", m0);
            mo149186y0();
            if (ballInfo.f311694o == m0.f311694o) {
                mo149085C(ballInfo);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "updateBallInfo, existed:false");
    }

    /* renamed from: b */
    public void mo149111b(BallInfo ballInfo, ResultReceiver resultReceiver) {
        if (ballInfo != null && resultReceiver != null) {
            String e = ballInfo.mo149041e();
            Log.m105925i("MicroMsg.FloatBallService", "registerFloatBallEventReceiver, key:%s, receiver:%s", e, Integer.valueOf(resultReceiver.hashCode()));
            ((ConcurrentHashMap) this.f311756f).put(e, resultReceiver);
        }
    }

    /* renamed from: b0 */
    public void mo149112b0(float f) {
        FloatBallView floatBallView;
        C105085q d = C105085q.m141018d();
        if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
            floatBallView.setFloatBallAlpha(f);
        }
    }

    /* renamed from: c */
    public void mo149113c(boolean z) {
        mo149181t0(z, (AnimatorListenerAdapter) null);
    }

    /* renamed from: c0 */
    public void mo149114c0(C112187l lVar) {
        if (lVar == null) {
            return;
        }
        if (C103925l.m138627a(this.f311751a)) {
            lVar.mo61051a(new ArrayList(this.f311751a));
        } else {
            lVar.mo61051a(new ArrayList());
        }
    }

    /* renamed from: d */
    public void mo149115d(boolean z) {
        mo149175E0(z, true, (AnimatorListenerAdapter) null);
    }

    /* renamed from: d0 */
    public void mo149116d0(C112186j jVar) {
        FloatBallView floatBallView;
        ((CopyOnWriteArraySet) this.f311754d).add(jVar);
        C105085q d = C105085q.m141018d();
        if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
            ((CopyOnWriteArraySet) floatBallView.f311982p).add(jVar);
        }
    }

    /* renamed from: e */
    public void mo149117e(int i) {
        this.f311768r = i;
    }

    /* renamed from: e0 */
    public void mo149118e0() {
        mo149105X(false);
        mo149182u0(false);
        if (this.f311771u != null) {
            Log.m105925i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, lastEnteredBallInfo:%s", this.f311771u);
            mo149088F(mo149134m0(this.f311771u));
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, safe");
    }

    /* renamed from: f */
    public void mo149119f(BallInfo ballInfo) {
        if (ballInfo != null) {
            String e = ballInfo.mo149041e();
            ResultReceiver resultReceiver = (ResultReceiver) ((ConcurrentHashMap) this.f311756f).remove(e);
            Object[] objArr = new Object[2];
            objArr[0] = e;
            objArr[1] = resultReceiver != null ? Integer.valueOf(resultReceiver.hashCode()) : null;
            Log.m105925i("MicroMsg.FloatBallService", "removeFloatBallEventReceiver, key:%s, receiver:%s", objArr);
        }
    }

    /* renamed from: f0 */
    public boolean mo149120f0() {
        return this.f311761k;
    }

    /* renamed from: g */
    public void mo149121g(boolean z) {
        C105085q d = C105085q.m141018d();
        c$$d c__d = new c$$d(this);
        d.getClass();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            d.mo149234c(z, c__d);
        } else {
            MMHandlerThread.postToMainThread(new C105092w(d, z, c__d));
        }
    }

    /* renamed from: g0 */
    public void mo149122g0(boolean z) {
        FloatBallView floatBallView;
        C105085q d = C105085q.m141018d();
        if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
            floatBallView.setFloatBallPageAnimating(z);
        }
    }

    /* renamed from: h */
    public void mo149123h(boolean z) {
        FloatBallView floatBallView;
        C105085q d = C105085q.m141018d();
        if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
            if (floatBallView.f311960c1 != null) {
                floatBallView.mo149284b0(z);
            }
            WxShadowLinearLayout wxShadowLinearLayout = floatBallView.f311999x;
            if (wxShadowLinearLayout != null) {
                wxShadowLinearLayout.setAlpha(z ? 1.0f : 0.0f);
            }
        }
    }

    /* renamed from: h0 */
    public boolean mo149124h0(BallInfo ballInfo) {
        List<BallInfo> d = C103925l.m138630d(this.f311751a);
        if ((C103925l.m138627a(d) ? ((Vector) d).size() : 0) >= 5) {
            Log.m105924i("MicroMsg.FloatBallService", "canAddBallInfo, false");
            return false;
        }
        Log.m105924i("MicroMsg.FloatBallService", "canAddBallInfo, true");
        return true;
    }

    /* renamed from: i */
    public void mo149125i(int i) {
        C105085q d = C105085q.m141018d();
        if (d.mo149235e()) {
            d.f311870d.mo149223f(i);
        }
    }

    /* renamed from: i0 */
    public void mo149126i0(BallInfo ballInfo) {
        mo149172B0(ballInfo, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0115  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149127j(long r11, xv0.C112181e.C112182a r13) {
        /*
            r10 = this;
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r10.f311758h
            java.lang.String r1 = "MicroMsg.FloatBallService"
            if (r0 != 0) goto L_0x000c
            java.lang.String r11 = "alvinluo addMessageBall readyMessageBallInfo is invalid and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r11)
            return
        L_0x000c:
            boolean r0 = r10.f311764n
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x002f
            boolean r0 = r10.f311762l
            if (r0 != 0) goto L_0x002f
            java.lang.Object[] r11 = new java.lang.Object[r5]
            boolean r12 = r10.f311764n
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11[r4] = r12
            java.lang.String r12 = "alvinluo addMessageBall isWechatForeground: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r12, r11)
            if (r13 == 0) goto L_0x002c
            r13.mo57750a(r2)
        L_0x002c:
            r10.f311758h = r3
            return
        L_0x002f:
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r10.f311758h
            java.lang.Boolean r6 = aw0.C103925l.f307288a
            long r6 = r0.f311705z
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            long r11 = r11 - r6
            java.lang.Integer r0 = aw0.C103925l.f307290c
            int r0 = r0.intValue()
            long r6 = (long) r0
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            r11 = 1
            goto L_0x004e
        L_0x004d:
            r11 = 0
        L_0x004e:
            r12 = 5
            if (r11 != 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r0 = aw0.C103925l.f307290c
            if (r0 == 0) goto L_0x005c
            int r0 = r0.intValue()
            goto L_0x005d
        L_0x005c:
            r0 = -1
        L_0x005d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r4] = r0
            java.lang.String r0 = "alvinluo addMessageBall can not add message ball because of time over limit %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r11)
            if (r13 == 0) goto L_0x006d
            r13.mo57750a(r12)
        L_0x006d:
            r10.f311758h = r3
            return
        L_0x0070:
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r10.f311757g
            r0 = 20
            r6 = 2
            if (r11 == 0) goto L_0x0082
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r10.f311757g
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r10.mo149134m0(r11)
            if (r11 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r11 = 2
            goto L_0x0095
        L_0x0082:
            com.tencent.mm.plugin.ball.model.BallInfo r11 = new com.tencent.mm.plugin.ball.model.BallInfo
            com.tencent.mm.plugin.ball.model.BallInfo r7 = r10.f311758h
            java.lang.String r7 = r7.f311688f
            r11.<init>(r0, r7, r3)
            r10.f311757g = r11
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r10.f311757g
            com.tencent.mm.plugin.ball.model.BallInfo r7 = r10.f311758h
            r11.mo149050p(r7)
            r11 = 1
        L_0x0095:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7[r4] = r8
            com.tencent.mm.plugin.ball.model.BallInfo r8 = r10.f311757g
            r7[r5] = r8
            java.lang.String r8 = "alvinluo addMessageBall addResult: %s, and add: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r7)
            if (r11 != r5) goto L_0x00af
            com.tencent.mm.plugin.ball.model.BallInfo r7 = r10.f311758h
            com.tencent.mm.plugin.ball.model.BallReportInfo r7 = r7.f311683H
            r7.f311715d = r12
            goto L_0x00b7
        L_0x00af:
            if (r11 != r6) goto L_0x00b7
            com.tencent.mm.plugin.ball.model.BallInfo r7 = r10.f311758h
            com.tencent.mm.plugin.ball.model.BallReportInfo r7 = r7.f311683H
            r7.f311715d = r2
        L_0x00b7:
            com.tencent.mm.plugin.ball.model.BallInfo r7 = r10.f311758h
            int r8 = r7.f311686d
            if (r8 != r0) goto L_0x00bf
            int r8 = r7.f311687e
        L_0x00bf:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r0[r4] = r9
            int r4 = r7.f311686d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r5] = r4
            int r4 = r7.f311687e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r6] = r4
            java.lang.String r4 = "alvinluo notifyAddMessageFloatBall type: %d, ball.type: %d, contentType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            android.util.SparseArray<java.util.Set<xv0.h>> r0 = r10.f311755e
            java.lang.Object r0 = r0.get(r8)
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = aw0.C103925l.m138627a(r0)
            if (r1 == 0) goto L_0x0103
            java.util.Iterator r0 = r0.iterator()
        L_0x00ef:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0103
            java.lang.Object r1 = r0.next()
            xv0.h r1 = (xv0.C112185h) r1
            boolean r1 = r1.mo74089u5(r7)
            if (r1 == 0) goto L_0x00ef
            r0 = 1
            goto L_0x0112
        L_0x0103:
            java.lang.Class<xv0.f> r0 = xv0.C112183f.class
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            com.tencent.mm.plugin.ball.service.p r4 = new com.tencent.mm.plugin.ball.service.p
            r4.<init>(r10, r7)
            boolean r0 = p261wl.C38166b.m41756c(r0, r1, r4)
        L_0x0112:
            if (r0 == 0) goto L_0x0115
            return
        L_0x0115:
            if (r11 != r5) goto L_0x0123
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r10.f311757g
            com.tencent.mm.plugin.ball.model.BallReportInfo r0 = r0.f311683H
            r0.f311715d = r12
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311757g
            r10.mo149095M(r12)
            goto L_0x0141
        L_0x0123:
            if (r11 != r6) goto L_0x0141
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311758h
            r10.mo149178H0(r12)
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311757g
            if (r12 == 0) goto L_0x0141
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311757g
            boolean r12 = r12.f311682G
            if (r12 != 0) goto L_0x0141
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311757g
            com.tencent.mm.plugin.ball.model.BallReportInfo r12 = r12.f311683H
            r12.f311715d = r2
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r10.f311757g
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r0 = r10.f311751a
            com.tencent.p014mm.plugin.ball.service.C105034a.m140875a(r12, r0)
        L_0x0141:
            r10.f311758h = r3
            if (r13 == 0) goto L_0x0148
            r13.mo57750a(r11)
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.service.C105035c.mo149127j(long, xv0.e$a):void");
    }

    /* renamed from: j0 */
    public boolean mo149128j0() {
        if (C103925l.m138627a(this.f311751a)) {
            Iterator it = ((CopyOnWriteArrayList) this.f311751a).iterator();
            while (it.hasNext()) {
                BallInfo ballInfo = (BallInfo) it.next();
                if (!ballInfo.f311681F) {
                    if (!C103925l.m138640n(ballInfo)) {
                        int i = ballInfo.f311686d;
                        if (i == 17 || i == 19) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public Point mo149129k() {
        Point point;
        C105085q d = C105085q.m141018d();
        if (d.mo149235e()) {
            FloatBallView floatBallView = d.f311870d.f311845c;
            if (floatBallView != null) {
                point = floatBallView.getBallPosition();
            } else {
                Boolean bool = C103925l.f307288a;
                C105050r.m140969d().getClass();
                point = new Point(C105050r.f311801e, C103925l.m138635i());
            }
        } else {
            Boolean bool2 = C103925l.f307288a;
            C105050r.m140969d().getClass();
            point = new Point(C105050r.f311801e, C103925l.m138635i());
        }
        if (point == null) {
            Boolean bool3 = C103925l.f307288a;
            C105050r.m140969d().getClass();
            point = new Point(C105050r.f311801e, C103925l.m138635i());
        }
        Log.m105925i("MicroMsg.FloatBallService", "getBallPosition, position:[%s, %s]", Integer.valueOf(point.x), Integer.valueOf(point.y));
        return point;
    }

    /* renamed from: k0 */
    public void mo149130k0() {
        C105085q d = C105085q.m141018d();
        d.getClass();
        C61926c.m72669N(new C105089t(d));
    }

    /* renamed from: l */
    public void mo149131l() {
        Log.m105925i("MicroMsg.FloatBallService", "onAccountRelease:%s", Integer.valueOf(hashCode()));
        mo149102U(C105085q.m141018d());
        mo149102U(C105050r.m140969d());
        this.f311759i = false;
        C105085q d = C105085q.m141018d();
        d.getClass();
        MMHandlerThread.postToMainThread(new C105095z(d));
    }

    /* renamed from: l0 */
    public void mo149132l0() {
        this.f311770t = null;
    }

    /* renamed from: m */
    public long mo149133m() {
        return this.f311765o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return null;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.ball.model.BallInfo mo149134m0(com.tencent.p014mm.plugin.ball.model.BallInfo r7) {
        /*
            r6 = this;
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r0 = r6.f311751a
            monitor-enter(r0)
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r1 = r6.f311751a     // Catch:{ all -> 0x0053 }
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch:{ all -> 0x0053 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r1 = r6.f311751a     // Catch:{ all -> 0x0053 }
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch:{ all -> 0x0053 }
            int r7 = r1.indexOf(r7)     // Catch:{ all -> 0x0053 }
            if (r7 < 0) goto L_0x0048
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r1 = r6.f311751a     // Catch:{ all -> 0x0053 }
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch:{ all -> 0x0053 }
            int r1 = r1.size()     // Catch:{ all -> 0x0053 }
            if (r7 < r1) goto L_0x0023
            goto L_0x0048
        L_0x0023:
            r1 = 0
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r3 = r6.f311751a     // Catch:{ Exception -> 0x003c }
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ Exception -> 0x003c }
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x003c }
            com.tencent.mm.plugin.ball.model.BallInfo r7 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r7     // Catch:{ Exception -> 0x003c }
            java.lang.String r3 = "MicroMsg.FloatBallService"
            java.lang.String r4 = "getBallInfo, existed:true, responseBallInfo:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x003c }
            r5[r1] = r7     // Catch:{ Exception -> 0x003c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ Exception -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r7
        L_0x003c:
            r7 = move-exception
            java.lang.String r3 = "MicroMsg.FloatBallService"
            java.lang.String r4 = "getBallInfo exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r4, r1)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x004a:
            java.lang.String r7 = "MicroMsg.FloatBallService"
            java.lang.String r1 = "getBallInfo, existed:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x0053:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.service.C105035c.mo149134m0(com.tencent.mm.plugin.ball.model.BallInfo):com.tencent.mm.plugin.ball.model.BallInfo");
    }

    /* renamed from: n */
    public void mo149135n(int i) {
        if (this.f311757g != null && this.f311757g.f311687e == i) {
            Log.m105925i("MicroMsg.FloatBallService", "alvinluo removeMessageBall type: %d", Integer.valueOf(i));
            synchronized (this.f311751a) {
                mo149108Z(this.f311757g);
            }
        }
    }

    /* renamed from: n0 */
    public void mo149136n0(boolean z) {
        Log.m105925i("MicroMsg.FloatBallService", "markWechatInForeground, foreground:%s", Boolean.valueOf(z));
        this.f311764n = z;
        if (this.f311762l) {
            Log.m105924i("MicroMsg.FloatBallService", "markWechatInForeground, has marked QB file view page, mark Wechat in foreground");
            C105085q d = C105085q.m141018d();
            d.getClass();
            MMHandlerThread.postToMainThread(new C105087r(d, true));
        } else {
            C105085q d2 = C105085q.m141018d();
            d2.getClass();
            MMHandlerThread.postToMainThread(new C105087r(d2, z));
        }
        if (!this.f311764n) {
            Log.m105924i("MicroMsg.FloatBallService", "alvinluo resetReadyStatusBallInfo");
            this.f311758h = null;
        }
    }

    /* renamed from: o */
    public Point mo149137o() {
        FloatBallView floatBallView;
        C105085q d = C105085q.m141018d();
        if (!d.mo149235e() || (floatBallView = d.f311870d.f311845c) == null) {
            return null;
        }
        return floatBallView.getCurrentCustomBallSize();
    }

    /* renamed from: o0 */
    public Set<C112186j> mo149138o0() {
        return this.f311754d;
    }

    /* renamed from: p */
    public void mo149139p() {
        Log.m105919d("MicroMsg.FloatBallService", "clearMessageBallInfo readyMessageBallInfo: %s", this.f311758h);
        Log.m105924i("MicroMsg.FloatBallService", "alvinluo resetReadyStatusBallInfo");
        this.f311758h = null;
    }

    /* renamed from: p0 */
    public void mo149140p0(BallInfo ballInfo) {
        if (((CopyOnWriteArrayList) this.f311751a).contains(ballInfo)) {
            Class<C112183f> cls = C112183f.class;
            Set<C112185h> set = this.f311755e.get(ballInfo.f311686d);
            if (C103925l.m138627a(set)) {
                for (C112185h H : set) {
                    H.mo64041H(ballInfo);
                }
            }
            C38166b.m41756c(cls, Integer.valueOf(ballInfo.f311686d), new C105036d(this, ballInfo));
            Set<C112185h> set2 = this.f311755e.get(0);
            if (C103925l.m138627a(set2)) {
                for (C112185h H2 : set2) {
                    H2.mo64041H(ballInfo);
                }
            }
            C38166b.m41756c(cls, 0, new C105037e(this, ballInfo));
            return;
        }
        Log.m105924i("MicroMsg.FloatBallService", "exposeBallInfo, existed:false");
    }

    /* renamed from: q */
    public void mo149141q(boolean z) {
        Log.m105925i("MicroMsg.FloatBallService", "markForceHideAllFloatBall %b", Boolean.valueOf(z));
        this.f311761k = z;
        C105085q.m141018d().f311872f = z;
    }

    /* renamed from: q0 */
    public final void mo149179q0(BallInfo ballInfo) {
        boolean z;
        BallInfo ballInfo2 = ballInfo;
        Class cls = C92331c.class;
        int i = ballInfo2.f311687e;
        boolean z2 = false;
        if (!ballInfo2.f311680E) {
            List<BallInfo> d = C103925l.m138630d(this.f311751a);
            if ((C103925l.m138627a(d) ? ((Vector) d).size() : 0) >= 5) {
                Log.m105925i("MicroMsg.FloatBallService", "addBallInfo, already add max count balls:%s", 5);
                FloatBallProxyUI.m140993I7((Context) null, 1, (BallInfo) null, false, new c$$g(this));
                return;
            }
        }
        if (!((CopyOnWriteArrayList) this.f311751a).contains(ballInfo2)) {
            int i2 = 3;
            if (C103925l.m138640n(ballInfo)) {
                List<BallInfo> list = this.f311751a;
                if (C103925l.m138627a(list)) {
                    Iterator it = ((CopyOnWriteArrayList) list).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C103925l.m138640n((BallInfo) it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    BallInfo h = C103925l.m138634h(this.f311751a);
                    if (h != null) {
                        int i3 = h.f311686d;
                        boolean z3 = i3 != 9;
                        Log.m105929w("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, type: %s, key: %s, canReplaced: %s", Integer.valueOf(i3), h.f311688f, Boolean.valueOf(z3));
                        if (z3) {
                            if (!((CopyOnWriteArrayList) this.f311751a).contains(h) || ((CopyOnWriteArrayList) this.f311751a).contains(ballInfo2)) {
                                Log.m105928w("MicroMsg.FloatBallService", "replacedBalInfo invalid");
                                return;
                            }
                            Log.m105925i("MicroMsg.FloatBallService", "replaceBallInfo, replaced.type: %s, target.type: %s", Integer.valueOf(h.f311686d), Integer.valueOf(ballInfo2.f311686d));
                            if (C103925l.m138640n(h)) {
                                C105085q.m141018d().mo149233b();
                                h.f311689g = null;
                            }
                            ((CopyOnWriteArrayList) this.f311751a).remove(h);
                            C105050r.m140969d().mo149196f(h);
                            C105034a.m140878d(h, ((CopyOnWriteArrayList) this.f311751a).isEmpty());
                            if (this.f311771u != null && this.f311771u.equals(h)) {
                                Log.m105924i("MicroMsg.FloatBallService", "replacedBallInfo, remove last enteredBallInfo");
                                this.f311771u = null;
                            }
                            ((C92331c) C86312j.m106911c(cls)).mo58349Bn(h.f311688f);
                            if (h.equals(this.f311757g)) {
                                this.f311757g = null;
                            }
                            mo149187z0(h, 3, (Bundle) null);
                            mo149171A0(h);
                            long nowMilliSecond = Util.nowMilliSecond();
                            ballInfo2.f311703x = nowMilliSecond;
                            ballInfo2.f311704y = nowMilliSecond;
                            BallReportInfo ballReportInfo = ballInfo2.f311683H;
                            ballReportInfo.f311721j = -1;
                            if (ballInfo2.f311686d != 20) {
                                if (!ballInfo2.f311680E || ballReportInfo.f311715d != 0) {
                                    i2 = ballReportInfo.f311715d;
                                }
                                ballReportInfo.f311715d = i2;
                            } else {
                                int i4 = ballReportInfo.f311715d;
                                if (i4 == 0) {
                                    i4 = 5;
                                }
                                ballReportInfo.f311715d = i4;
                            }
                            ((CopyOnWriteArrayList) this.f311751a).add(ballInfo2);
                            Log.m105925i("MicroMsg.FloatBallService", "replacedBallInfo addBallInfo, existed:false, ballInfo:%s", ballInfo2);
                            if (!ballInfo2.f311682G) {
                                C105034a.m140875a(ballInfo2, this.f311751a);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putInt("type", ballInfo2.f311686d);
                            bundle.putString("key", ballInfo2.f311688f);
                            mo149184w0(1, bundle);
                            mo149183v0(ballInfo);
                            ((C92331c) C86312j.m106911c(cls)).Ll0(ballInfo2);
                            Class<C112183f> cls2 = C112183f.class;
                            int i5 = h.f311686d;
                            if (i5 == 20) {
                                i5 = h.f311687e;
                            }
                            Log.m105919d("MicroMsg.FloatBallService", "notifySingleBallInfoReplaced type: %d, contentType: %d", Integer.valueOf(i5), Integer.valueOf(h.f311687e));
                            Set<C112185h> set = this.f311755e.get(i5);
                            if (C103925l.m138627a(set)) {
                                for (C112185h X4 : set) {
                                    X4.mo74086X4(h, ballInfo2);
                                }
                            }
                            C38166b.m41756c(cls2, Integer.valueOf(h.f311686d), new C105042j(this, h, ballInfo2));
                            Set<C112185h> set2 = this.f311755e.get(0);
                            if (C103925l.m138627a(set2)) {
                                for (C112185h X42 : set2) {
                                    X42.mo74086X4(h, ballInfo2);
                                }
                            }
                            C38166b.m41756c(cls2, 0, new C105043k(this, h, ballInfo2));
                            mo149173C0(true);
                            return;
                        }
                        return;
                    }
                    Log.m105920e("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, but video ball info is null");
                }
            }
            long nowMilliSecond2 = Util.nowMilliSecond();
            ballInfo2.f311703x = nowMilliSecond2;
            ballInfo2.f311704y = nowMilliSecond2;
            BallReportInfo ballReportInfo2 = ballInfo2.f311683H;
            ballReportInfo2.f311721j = -1;
            if (ballInfo2.f311686d != 20) {
                ballReportInfo2.f311715d = (!ballInfo2.f311680E || ballReportInfo2.f311715d != 0) ? ballReportInfo2.f311715d : 3;
            } else {
                int i6 = ballReportInfo2.f311715d;
                if (i6 == 0) {
                    i6 = 5;
                }
                ballReportInfo2.f311715d = i6;
            }
            ((CopyOnWriteArrayList) this.f311751a).add(ballInfo2);
            Log.m105925i("MicroMsg.FloatBallService", "addBallInfoInner, existed:false, ballInfo:%s", ballInfo2);
            if (!ballInfo2.f311682G) {
                C105034a.m140875a(ballInfo2, this.f311751a);
            }
            Log.m105919d("MicroMsg.FloatBallService", "onFloatBallAdded %s", ballInfo2);
            C105085q d2 = C105085q.m141018d();
            int size = ((CopyOnWriteArrayList) this.f311751a).size();
            d2.getClass();
            Log.m105927v("MicroMsg.FloatBallUIManager", "alvinluo onFloatBallAdded size: %d, state: %d, hidden: %b, isNeedEnterTransitionAnim: %s, current: %s", Integer.valueOf(size), Integer.valueOf(ballInfo2.f311679D), Boolean.valueOf(ballInfo2.f311681F), Boolean.valueOf(ballInfo2.f311696q), Boolean.valueOf(d2.f311871e));
            if (size == 1) {
                if (ballInfo2.f311679D != 0 && !ballInfo2.f311681F) {
                    z2 = true;
                }
                if (z2) {
                    d2.f311871e = ballInfo2.f311696q;
                }
            }
            mo149173C0(true);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("type", ballInfo2.f311686d);
            bundle2.putString("key", ballInfo2.f311688f);
            mo149184w0(1, bundle2);
            mo149183v0(ballInfo);
            ((C92331c) C86312j.m106911c(cls)).Ll0(ballInfo2);
            return;
        }
        Log.m105925i("MicroMsg.FloatBallService", "addBallInfo, existed:true, replaceExisted: %b, ballInfo:%s", Boolean.valueOf(ballInfo2.f311677B), ballInfo2);
        if (ballInfo2.f311677B) {
            ballInfo2.f311677B = false;
            mo149110a0(ballInfo);
        }
    }

    /* renamed from: r */
    public void mo149142r(BallInfo ballInfo) {
        mo149083A(ballInfo, true);
    }

    /* renamed from: s */
    public void mo149143s(int i) {
        C105085q d = C105085q.m141018d();
        if (d.mo149235e()) {
            d.f311870d.mo149219b(i);
        }
    }

    /* renamed from: s0 */
    public final BallInfo mo149180s0() {
        if (!C103925l.m138627a(this.f311751a)) {
            return null;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f311751a).iterator();
        while (it.hasNext()) {
            BallInfo ballInfo = (BallInfo) it.next();
            if (C103925l.m138640n(ballInfo)) {
                return ballInfo;
            }
        }
        return null;
    }

    /* renamed from: t */
    public void mo149144t() {
        C105085q d = C105085q.m141018d();
        d.getClass();
        C61926c.m72669N(new C105088s(d));
    }

    /* renamed from: t0 */
    public void mo149181t0(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f311762l) {
            Log.m105924i("MicroMsg.FloatBallService", "hideFloatBall, has marked QB file view page, ignore hiding");
            return;
        }
        boolean z2 = mo149128j0() && !this.f311761k;
        Log.m105925i("MicroMsg.FloatBallService", "hideFloatBall forceHide: %b, canShowFloatBall: %b, videoBallInfo: %s", Boolean.valueOf(this.f311761k), Boolean.valueOf(z2), mo149180s0());
        if (!z2) {
            C105085q d = C105085q.m141018d();
            d.getClass();
            MMHandlerThread.postToMainThread(new C105093x(d, z, animatorListenerAdapter));
        }
    }

    /* renamed from: u */
    public boolean mo149145u() {
        C105085q d = C105085q.m141018d();
        if (d.mo149235e()) {
            FloatBallView floatBallView = d.f311870d.f311845c;
            if (floatBallView != null) {
                return floatBallView.f312003y0;
            }
            return false;
        }
        C105050r.m140969d().getClass();
        return C105050r.f311804h;
    }

    /* renamed from: u0 */
    public void mo149182u0(boolean z) {
        Log.m105925i("MicroMsg.FloatBallService", "markNoFloatBallPage:%s", Boolean.valueOf(z));
        this.f311760j = z;
    }

    /* renamed from: v */
    public void mo149146v() {
        Log.m105925i("MicroMsg.FloatBallService", "onAccountInitialized:%s", Integer.valueOf(hashCode()));
        mo149092J(C105085q.m141018d());
        mo149092J(C105050r.m140969d());
        this.f311759i = false;
        mo149115d(true);
    }

    /* renamed from: v0 */
    public final void mo149183v0(BallInfo ballInfo) {
        int size = this.f311755e.size();
        for (int i = 0; i < size; i++) {
            Set<C112185h> set = this.f311755e.get(this.f311755e.keyAt(i));
            if (C103925l.m138627a(set)) {
                for (C112185h t5 : set) {
                    t5.mo74088t5(ballInfo);
                }
            }
        }
        C38166b.m41755b(C112183f.class, new c$$a(ballInfo));
    }

    /* renamed from: w */
    public void mo149147w(BallInfo ballInfo) {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(ballInfo == null);
        objArr[1] = ballInfo;
        objArr[2] = this.f311758h;
        Log.m105919d("MicroMsg.FloatBallService", "alvinluo markMessageBallInfo ballInfo == null: %b, %s, readyInfo == null: %b", objArr);
        if (ballInfo != null) {
            if (this.f311758h == null) {
                this.f311758h = new BallInfo(20, ballInfo.f311688f, (JSONObject) null);
            }
            this.f311758h.mo149050p(ballInfo);
            this.f311758h.f311688f = ballInfo.f311688f;
            this.f311758h.f311686d = 20;
            this.f311758h.f311679D = 256;
            this.f311758h.f311681F = false;
            this.f311758h.f311680E = false;
            this.f311758h.f311705z = System.currentTimeMillis();
            if (ballInfo.f311686d == 4 && this.f311758h.f311678C != null) {
                String string = this.f311758h.f311678C.getString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                if (!Util.isNullOrNil(string)) {
                    Log.m105919d("MicroMsg.FloatBallService", "markMessageBallInfo reset processName: %s", string);
                    this.f311758h.f311678C.putString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, "");
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void mo149184w0(int i, Bundle bundle) {
        for (ResultReceiver send : ((ConcurrentHashMap) this.f311756f).values()) {
            send.send(i, bundle);
        }
    }

    /* renamed from: x */
    public List<BallInfo> mo149148x() {
        return this.f311751a;
    }

    /* renamed from: x0 */
    public final void mo149185x0(List<BallInfo> list) {
        int size;
        if (!((ConcurrentHashMap) this.f311756f).isEmpty() && this.f311772v != (size = ((Vector) C103925l.m138630d(list)).size())) {
            this.f311772v = size;
            Bundle bundle = new Bundle();
            bundle.putInt("ActiveCount", size);
            for (ResultReceiver send : ((ConcurrentHashMap) this.f311756f).values()) {
                send.send(5, bundle);
            }
        }
    }

    /* renamed from: y */
    public void mo149149y(boolean z) {
        FloatBallView floatBallView;
        C105085q d = C105085q.m141018d();
        if (d.mo149235e() && (floatBallView = d.f311870d.f311845c) != null) {
            floatBallView.setEnableClick(z);
        }
    }

    /* renamed from: y0 */
    public final void mo149186y0() {
        C35204j jVar = (C35204j) C86312j.m106911c(C35204j.class);
        jVar.getClass();
        if (C86709a0.m107522a()) {
            jVar.requireAccountInitialized();
        }
        synchronized (this.f311751a) {
            Vector vector = new Vector(this.f311751a);
            if (C103925l.m138627a(vector)) {
                Collections.sort(vector, new C103924i());
            } else {
                vector = new Vector();
            }
            Log.m105925i("MicroMsg.FloatBallService", "notifyFloatBallInfoChanged, originSize: %d, sortedSize: %d, ballInfoList:%s", Integer.valueOf(((CopyOnWriteArrayList) this.f311751a).size()), Integer.valueOf(vector.size()), vector);
            Iterator it = ((CopyOnWriteArraySet) this.f311753c).iterator();
            while (it.hasNext()) {
                ((C112184g) it.next()).mo145544B(vector, this.f311771u);
                mo149185x0(vector);
            }
        }
    }

    /* renamed from: z */
    public void mo149150z(BallInfo ballInfo) {
        mo149172B0(ballInfo, true);
    }

    /* renamed from: z0 */
    public final void mo149187z0(BallInfo ballInfo, int i, Bundle bundle) {
        String e = ballInfo.mo149041e();
        ResultReceiver resultReceiver = (ResultReceiver) ((ConcurrentHashMap) this.f311756f).get(e);
        if (resultReceiver != null) {
            Log.m105925i("MicroMsg.FloatBallService", "notifyResultReceiver, event:%s, ballInfoHashKey:%s, receiver:%s", Integer.valueOf(i), e, Integer.valueOf(resultReceiver.hashCode()));
            if (bundle == null) {
                bundle = new Bundle();
            }
            resultReceiver.send(i, bundle);
        }
    }
}
