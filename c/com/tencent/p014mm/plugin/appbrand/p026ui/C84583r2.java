package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import go3.C87282f;
import is0.C87793a;
import is0.C87794b;
import it0.C87795a;
import java.util.WeakHashMap;
import jt0.C88029d;
import p849e3.C107168a0;
import p849e3.C107207u;
import wi0.C91003z;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.r2 */
public enum C84583r2 implements C84674s4 {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$a */
    public class C84584a extends C87282f {

        /* renamed from: a */
        public boolean f246795a;

        /* renamed from: b */
        public final /* synthetic */ AppBrandRuntime f246796b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f246797c;

        public C84584a(C84583r2 r2Var, AppBrandRuntime appBrandRuntime, Runnable runnable) {
            this.f246796b = appBrandRuntime;
            this.f246797c = runnable;
            this.f246795a = false;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f246797c;
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }

        public void onAnimationStart(Animation animation) {
            AppBrandRuntime appBrandRuntime = this.f246796b;
            if (appBrandRuntime instanceof AppBrandRuntimeWC) {
                if (!this.f246795a) {
                    HalfScreenManger halfScreenManger = ((AppBrandRuntimeWC) appBrandRuntime).f238298z1;
                    halfScreenManger.f247572e.reset();
                    halfScreenManger.mo117795r(animation.getDuration());
                }
                this.f246795a = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$b */
    public class C84585b extends C87282f {

        /* renamed from: a */
        public final /* synthetic */ Runnable f246798a;

        public C84585b(C84583r2 r2Var, Runnable runnable) {
            this.f246798a = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f246798a;
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$c */
    public class C84586c extends C87282f {

        /* renamed from: a */
        public boolean f246799a;

        /* renamed from: b */
        public final /* synthetic */ AppBrandRuntime f246800b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f246801c;

        public C84586c(C84583r2 r2Var, AppBrandRuntime appBrandRuntime, Runnable runnable) {
            this.f246800b = appBrandRuntime;
            this.f246801c = runnable;
            this.f246799a = false;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f246801c;
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }

        public void onAnimationStart(Animation animation) {
            AppBrandRuntime appBrandRuntime = this.f246800b;
            if ((appBrandRuntime instanceof AppBrandRuntimeWC) && !this.f246799a) {
                HalfScreenManger halfScreenManger = ((AppBrandRuntimeWC) appBrandRuntime).f238298z1;
                long duration = animation.getDuration();
                C88029d dVar = halfScreenManger.f247572e;
                dVar.mo122474e(dVar.mo122472c(), 0, duration);
                this.f246799a = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$d */
    public class C84587d extends C87282f {

        /* renamed from: a */
        public final /* synthetic */ Runnable f246802a;

        public C84587d(C84583r2 r2Var, Runnable runnable) {
            this.f246802a = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f246802a;
            if (runnable != null) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$e */
    public class C84588e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f246803d;

        /* renamed from: e */
        public final /* synthetic */ int f246804e;

        /* renamed from: f */
        public final /* synthetic */ Animation.AnimationListener f246805f;

        public C84588e(AppBrandRuntime appBrandRuntime, int i, Animation.AnimationListener animationListener) {
            this.f246803d = appBrandRuntime;
            this.f246804e = i;
            this.f246805f = animationListener;
        }

        public void run() {
            C84583r2.m104179a(this.f246803d, this.f246804e, this.f246805f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r2$f */
    public class C84589f implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ Animation.AnimationListener f246806a;

        /* renamed from: b */
        public final /* synthetic */ AppBrandRuntime f246807b;

        public C84589f(Animation.AnimationListener animationListener, AppBrandRuntime appBrandRuntime) {
            this.f246806a = animationListener;
            this.f246807b = appBrandRuntime;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f246806a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f246806a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f246806a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
            this.f246807b.f238153r.setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    public static void m104179a(AppBrandRuntime appBrandRuntime, int i, Animation.AnimationListener animationListener) {
        C84927e eVar = appBrandRuntime.f238153r;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145208c(eVar)) {
            appBrandRuntime.f238153r.setWillNotDraw(true);
            appBrandRuntime.f238153r.post(new C84588e(appBrandRuntime, i, animationListener));
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), i);
        loadAnimation.setAnimationListener(new C84589f(animationListener, appBrandRuntime));
        appBrandRuntime.f238153r.startAnimation(loadAnimation);
        if (appBrandRuntime instanceof AppBrandRuntimeWC) {
            HalfScreenConfig halfScreenConfig = ((AppBrandRuntimeWC) appBrandRuntime).mo113210l1().f234815R0;
            if (halfScreenConfig.mo76931c() && halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED) {
                View findViewById = appBrandRuntime.f238153r.getRootView().findViewById(C0966R.C0970id.biv);
                if (findViewById instanceof C87794b) {
                    C87794b bVar = (C87794b) findViewById;
                    bVar.getClass();
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, (int) loadAnimation.getDuration()});
                    ofInt.setDuration(loadAnimation.getDuration() * ((long) 10));
                    ofInt.addUpdateListener(new C87793a(bVar, loadAnimation, ofInt));
                    ofInt.start();
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m104180b() {
        return C85875k4.m106197n0() && !C84684v.Companion.mo117404a();
    }

    /* renamed from: c */
    public static int m104181c(AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject == null) {
            return 0;
        }
        return appBrandStatObject.f245533f;
    }

    /* renamed from: f */
    public static boolean m104182f(AppBrandInitConfig appBrandInitConfig) {
        if (!(appBrandInitConfig instanceof AppBrandInitConfigWC)) {
            return false;
        }
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
        return appBrandInitConfigWC.f239394y1 != null || m104181c(appBrandInitConfigWC.f234834c1) == 1187;
    }

    /* renamed from: g */
    public static boolean m104183g(AppBrandRuntime appBrandRuntime) {
        if (!(appBrandRuntime instanceof AppBrandRuntimeWC)) {
            return false;
        }
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
        return appBrandRuntimeWC.mo113194Y1() || appBrandRuntimeWC.mo121253n1().f245533f == 1099;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b1  */
    /* renamed from: Gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111331Gm(android.app.Activity r8, com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00ea
            android.content.Intent r0 = r8.getIntent()
            if (r0 != 0) goto L_0x000a
            goto L_0x00ea
        L_0x000a:
            boolean r0 = r9 instanceof com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            r0 = r9
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
            com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData r1 = r0.f239394y1
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r8.overridePendingTransition(r2, r2)
            return
        L_0x001b:
            wi0.z r1 = r0.mo111302o()
            wi0.z r3 = wi0.C91003z.DISABLED
            if (r3 != r1) goto L_0x0027
            r8.overridePendingTransition(r2, r2)
            return
        L_0x0027:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f234834c1
            boolean r3 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83594m.m102619a(r8, r9, r0)     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r3 = r9.f239362d
            boolean r3 = ym0.C91516n.m114822a(r3)
            r4 = 1
            if (r3 == 0) goto L_0x003e
            r8.overridePendingTransition(r2, r2)
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0042
            return
        L_0x0042:
            wi0.z r3 = wi0.C91003z.POPUP
            r5 = 2130771992(0x7f010018, float:1.714709E38)
            r6 = 2130772012(0x7f01002c, float:1.714713E38)
            if (r3 != r1) goto L_0x0050
            r8.overridePendingTransition(r6, r5)
            return
        L_0x0050:
            boolean r1 = m104180b()
            if (r1 == 0) goto L_0x005a
            r8.overridePendingTransition(r6, r2)
            return
        L_0x005a:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r9 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r9
            boolean r1 = r9.f239373d1
            if (r1 != 0) goto L_0x00e3
            int r9 = r9.f234813Q0
            if (r9 != r4) goto L_0x0066
            goto L_0x00e3
        L_0x0066:
            int r9 = m104181c(r0)
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r9 == r1) goto L_0x0079
            int r9 = m104181c(r0)
            r1 = 1223(0x4c7, float:1.714E-42)
            if (r9 != r1) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r9 = 0
            goto L_0x007a
        L_0x0079:
            r9 = 1
        L_0x007a:
            if (r9 != 0) goto L_0x00df
            int r9 = m104181c(r0)
            r1 = 1113(0x459, float:1.56E-42)
            if (r9 == r1) goto L_0x008f
            int r9 = m104181c(r0)
            r1 = 1114(0x45a, float:1.561E-42)
            if (r9 != r1) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r9 = 0
            goto L_0x0090
        L_0x008f:
            r9 = 1
        L_0x0090:
            if (r9 == 0) goto L_0x0093
            goto L_0x00df
        L_0x0093:
            int r9 = m104181c(r0)
            r1 = 1024(0x400, float:1.435E-42)
            if (r1 != r9) goto L_0x00a6
            r9 = 6
            if (r0 != 0) goto L_0x00a0
            r1 = 0
            goto L_0x00a2
        L_0x00a0:
            int r1 = r0.f245531d
        L_0x00a2:
            if (r9 != r1) goto L_0x00a6
            r9 = 1
            goto L_0x00a7
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            if (r9 == 0) goto L_0x00b1
            int r9 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318646c
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318647d
            r8.overridePendingTransition(r9, r0)
            goto L_0x00e2
        L_0x00b1:
            android.content.Intent r9 = r8.getIntent()
            if (r9 == 0) goto L_0x00c0
            java.lang.String r1 = "key_appbrand_bring_ui_to_front_from_task_Base_by_task_top_ui"
            boolean r9 = r9.getBooleanExtra(r1, r2)
            if (r9 == 0) goto L_0x00c0
            r2 = 1
        L_0x00c0:
            if (r2 == 0) goto L_0x00c6
            r8.overridePendingTransition(r6, r5)
            goto L_0x00e2
        L_0x00c6:
            r9 = 1090(0x442, float:1.527E-42)
            int r0 = m104181c(r0)
            r1 = 2130772013(0x7f01002d, float:1.7147132E38)
            if (r9 != r0) goto L_0x00d8
            r9 = 2130772014(0x7f01002e, float:1.7147134E38)
            r8.overridePendingTransition(r9, r1)
            goto L_0x00e2
        L_0x00d8:
            r9 = 2130772011(0x7f01002b, float:1.7147128E38)
            r8.overridePendingTransition(r9, r1)
            goto L_0x00e2
        L_0x00df:
            r8.overridePendingTransition(r6, r5)
        L_0x00e2:
            return
        L_0x00e3:
            int r9 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318644a
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318645b
            r8.overridePendingTransition(r9, r0)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.mo111331Gm(android.app.Activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    /* renamed from: aG */
    public void mo111332aG(Activity activity) {
        mo111334b9(activity, (AppBrandInitConfig) null);
    }

    public void al0(AppBrandRuntime appBrandRuntime, Runnable runnable, AppBrandRuntime appBrandRuntime2, Runnable runnable2) {
        int ordinal;
        if (appBrandRuntime != null) {
            boolean z = appBrandRuntime instanceof AppBrandRuntimeWC;
            AppBrandInitConfigWC appBrandInitConfigWC = null;
            HalfScreenConfig halfScreenConfig = z ? ((AppBrandRuntimeWC) appBrandRuntime).mo113210l1().f234815R0 : null;
            int i = C0966R.C0968anim.f2333y;
            int i2 = C0966R.C0968anim.f2353ah;
            if (halfScreenConfig == null || !halfScreenConfig.mo76931c()) {
                if (z) {
                    appBrandInitConfigWC = ((AppBrandRuntimeWC) appBrandRuntime).mo113210l1();
                }
                if (appBrandInitConfigWC == null || C91003z.DISABLED != appBrandInitConfigWC.mo111302o()) {
                    if (m104183g(appBrandRuntime)) {
                        i2 = MMFragmentActivity$$c.f318644a;
                    }
                    if (m104183g(appBrandRuntime)) {
                        i = MMFragmentActivity$$c.f318645b;
                    }
                } else {
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            } else if (!C87795a.shouldUseCenterPopStyle(halfScreenConfig.f157932C) && (ordinal = halfScreenConfig.mo76929a(appBrandRuntime.mo113026R()).ordinal()) != 0) {
                i2 = ordinal != 1 ? C0966R.C0968anim.f2333y : MMFragmentActivity$$c.f318644a;
            }
            m104179a(appBrandRuntime, i2, new C84584a(this, appBrandRuntime, runnable));
            if (appBrandRuntime2 != null) {
                m104179a(appBrandRuntime2, i, new C84585b(this, runnable2));
            }
        }
    }

    /* renamed from: b9 */
    public void mo111334b9(Activity activity, AppBrandInitConfig appBrandInitConfig) {
        if (activity != null) {
            if (appBrandInitConfig == null && (activity instanceof AppBrandUI)) {
                C81820e3 a8 = ((AppBrandUI) activity).mo117110a8();
                AppBrandRuntime activeRuntime = a8 == null ? null : a8.getActiveRuntime();
                if (activeRuntime != null) {
                    appBrandInitConfig = activeRuntime.mo113036W();
                }
            }
            if (appBrandInitConfig instanceof AppBrandInitConfigWC) {
                AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
                if (C91003z.DISABLED == appBrandInitConfigWC.mo111303p()) {
                    activity.overridePendingTransition(0, 0);
                    return;
                } else if (C91003z.POPUP == appBrandInitConfigWC.mo111303p()) {
                    activity.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2351af);
                    return;
                } else {
                    HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.f234815R0;
                    if (halfScreenConfig != null && halfScreenConfig.mo76931c() && (activity instanceof AppBrandPluginUI)) {
                        ((AppBrandPluginUI) activity).mo117071c8(appBrandInitConfigWC);
                        return;
                    } else if (appBrandInitConfigWC.f239373d1 || appBrandInitConfigWC.f234813Q0 == 1) {
                        activity.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
                        return;
                    }
                }
            }
            if (m104180b()) {
                activity.overridePendingTransition(0, C0966R.C0968anim.f2351af);
            } else {
                activity.overridePendingTransition(C0966R.C0968anim.f2350ae, C0966R.C0968anim.f2351af);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: uR */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111335uR(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r6, java.lang.Runnable r7, com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r8, java.lang.Runnable r9) {
        /*
            r5 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r0 == 0) goto L_0x0011
            r0 = r8
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r1 = 0
            r2 = 2130771992(0x7f010018, float:1.714709E38)
            r3 = 2130772010(0x7f01002a, float:1.7147126E38)
            if (r0 == 0) goto L_0x0043
            boolean r4 = r0.mo76931c()
            if (r4 == 0) goto L_0x0043
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r1 = r0.f157932C
            boolean r1 = it0.C87795a.shouldUseCenterPopStyle(r1)
            if (r1 == 0) goto L_0x002a
            goto L_0x005f
        L_0x002a:
            android.app.Activity r1 = r8.mo113026R()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r0 = r0.mo76929a(r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x005f
            r1 = 1
            if (r0 == r1) goto L_0x003f
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            goto L_0x0062
        L_0x003f:
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318647d
            r1 = r0
            goto L_0x0062
        L_0x0043:
            wi0.z r0 = wi0.C91003z.DISABLED
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r4 = r8.mo113036W()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r4
            wi0.z r4 = r4.mo111303p()
            if (r0 != r4) goto L_0x0053
            r2 = 0
            goto L_0x0062
        L_0x0053:
            boolean r0 = m104183g(r8)
            if (r0 == 0) goto L_0x005f
            int r1 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318647d
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318646c
            r2 = r0
            goto L_0x0062
        L_0x005f:
            r1 = 2130772010(0x7f01002a, float:1.7147126E38)
        L_0x0062:
            if (r1 != 0) goto L_0x006a
            if (r9 == 0) goto L_0x0072
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
            goto L_0x0072
        L_0x006a:
            com.tencent.mm.plugin.appbrand.ui.r2$c r0 = new com.tencent.mm.plugin.appbrand.ui.r2$c
            r0.<init>(r5, r8, r9)
            m104179a(r8, r1, r0)
        L_0x0072:
            if (r6 == 0) goto L_0x0084
            if (r2 != 0) goto L_0x007c
            if (r7 == 0) goto L_0x0084
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
            goto L_0x0084
        L_0x007c:
            com.tencent.mm.plugin.appbrand.ui.r2$d r8 = new com.tencent.mm.plugin.appbrand.ui.r2$d
            r8.<init>(r5, r7)
            m104179a(r6, r2, r8)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.mo111335uR(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.Runnable):void");
    }
}
