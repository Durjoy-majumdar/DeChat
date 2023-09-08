package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.os.Build;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.EnableMainBottomTabSwitchEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.taskbar.api.GyroView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lt0.C76723a;
import lu3.C88654b;
import p206nj.C88956h;
import vx2.C78493o;
import wx2.C78736a;
import yx2.C79166c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.l */
public class C71331l implements AbsListView.OnScrollListener, View.OnTouchListener, C71323d {

    /* renamed from: A */
    public C88654b f206563A = null;

    /* renamed from: B */
    public C88654b f206564B = null;

    /* renamed from: C */
    public boolean f206565C = false;

    /* renamed from: D */
    public boolean f206566D = false;

    /* renamed from: E */
    public boolean f206567E = true;

    /* renamed from: F */
    public boolean f206568F = false;

    /* renamed from: G */
    public boolean f206569G = false;

    /* renamed from: H */
    public int f206570H = 0;

    /* renamed from: I */
    public boolean f206571I = false;

    /* renamed from: J */
    public boolean f206572J = true;

    /* renamed from: K */
    public boolean f206573K = true;

    /* renamed from: L */
    public boolean f206574L;

    /* renamed from: M */
    public boolean f206575M = false;

    /* renamed from: N */
    public boolean f206576N = false;

    /* renamed from: P */
    public int f206577P = 0;

    /* renamed from: Q */
    public int f206578Q = 0;

    /* renamed from: Q0 */
    public PointF f206579Q0 = new PointF();

    /* renamed from: R */
    public int f206580R = 0;

    /* renamed from: R0 */
    public PointF f206581R0 = new PointF();

    /* renamed from: S */
    public int f206582S = 0;

    /* renamed from: S0 */
    public boolean f206583S0 = false;

    /* renamed from: T */
    public int f206584T = 0;

    /* renamed from: T0 */
    public boolean f206585T0 = false;

    /* renamed from: U */
    public C76723a f206586U;

    /* renamed from: U0 */
    public Runnable f206587U0 = new C71336e();

    /* renamed from: V */
    public boolean f206588V = false;

    /* renamed from: V0 */
    public boolean f206589V0 = true;

    /* renamed from: W */
    public Runnable f206590W;

    /* renamed from: W0 */
    public GyroView f206591W0;

    /* renamed from: X */
    public boolean f206592X = true;

    /* renamed from: X0 */
    public View f206593X0;

    /* renamed from: Y */
    public boolean f206594Y = false;

    /* renamed from: Y0 */
    public AppBrandDesktopContainerView f206595Y0;

    /* renamed from: Z */
    public boolean f206596Z = false;

    /* renamed from: Z0 */
    public boolean f206597Z0 = true;

    /* renamed from: a1 */
    public boolean f206598a1 = false;

    /* renamed from: b1 */
    public View f206599b1;

    /* renamed from: c1 */
    public View f206600c1;

    /* renamed from: d */
    public Context f206601d;

    /* renamed from: e */
    public ListView f206602e;

    /* renamed from: f */
    public TaskBarContainer f206603f;

    /* renamed from: g */
    public int f206604g = 0;

    /* renamed from: h */
    public int f206605h = 0;

    /* renamed from: i */
    public Vibrator f206606i;

    /* renamed from: j */
    public int f206607j;

    /* renamed from: n */
    public List<C71321c> f206608n = new LinkedList();

    /* renamed from: o */
    public C78736a f206609o;

    /* renamed from: p */
    public DynamicBgContainer f206610p;

    /* renamed from: p0 */
    public Runnable f206611p0;

    /* renamed from: q */
    public View f206612q;

    /* renamed from: r */
    public boolean f206613r = true;

    /* renamed from: s */
    public boolean f206614s = false;

    /* renamed from: t */
    public View f206615t;

    /* renamed from: u */
    public View f206616u;

    /* renamed from: v */
    public int f206617v = 0;

    /* renamed from: w */
    public int f206618w = 0;

    /* renamed from: x */
    public int f206619x = 0;

    /* renamed from: x0 */
    public int f206620x0 = 0;

    /* renamed from: y */
    public Runnable f206621y = null;

    /* renamed from: y0 */
    public boolean f206622y0;

    /* renamed from: z */
    public Runnable f206623z = null;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$f */
    public class C5520f implements Animator.AnimatorListener {
        public C5520f() {
        }

        public void onAnimationCancel(Animator animator) {
            C71331l.this.f206599b1.animate().setListener((Animator.AnimatorListener) null);
            C71331l.this.f206599b1.setTranslationY(0.0f);
        }

        public void onAnimationEnd(Animator animator) {
            C71331l.this.f206599b1.animate().setListener((Animator.AnimatorListener) null);
            C71331l.this.f206599b1.setTranslationY(0.0f);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$a */
    public class C71332a implements Runnable {
        public C71332a() {
        }

        public void run() {
            C71331l lVar = C71331l.this;
            lVar.f206607j = C75044y4.m89989a(lVar.f206601d) + C75044y4.m89994f(C71331l.this.f206601d);
            Log.m105925i("MicroMsg.TaskBarAnimController", "[run] mScrollOffset:%d UIUtilsStatusBar:%d WeUIToolHelperStatusBar:%d", Integer.valueOf(C71331l.this.f206607j), Integer.valueOf(C85875k4.m106198o(C71331l.this.f206601d)), Integer.valueOf(C75044y4.m89994f(C71331l.this.f206601d)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$b */
    public class C71333b implements Runnable {
        public C71333b() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo doOpenHeader");
            C71331l.this.f206602e.smoothScrollBy(C71331l.this.f206603f.getTop(), 600);
            C71331l.this.mo98267n(4);
            C71331l.this.mo98263j(true, false, 0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$c */
    public class C71334c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f206626d;

        public C71334c(int i) {
            this.f206626d = i;
        }

        public void run() {
            int bottom = C71331l.this.f206603f.getBottom() - C71331l.this.f206607j;
            Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo closeHeader distance: %d, bottom: %d", Integer.valueOf(bottom), Integer.valueOf(C71331l.this.f206603f.getBottom()));
            C71331l lVar = C71331l.this;
            int i = lVar.f206571I ? 10 : 600;
            lVar.f206602e.smoothScrollBy(bottom, i);
            C71331l lVar2 = C71331l.this;
            lVar2.f206567E = !lVar2.f206571I;
            lVar2.f206571I = false;
            int i2 = lVar2.f206570H;
            if (i2 != 0) {
                lVar2.f206570H = 0;
            } else {
                i2 = this.f206626d;
            }
            lVar2.mo98263j(false, false, i2, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$d */
    public class C71335d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f206628d;

        /* renamed from: e */
        public final /* synthetic */ int f206629e;

        public C71335d(boolean z, int i) {
            this.f206628d = z;
            this.f206629e = i;
        }

        public void run() {
            C71331l lVar = C71331l.this;
            lVar.f206571I = this.f206628d;
            lVar.mo98254a(this.f206629e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.l$e */
    public class C71336e implements Runnable {
        public C71336e() {
        }

        public void run() {
            C71331l.this.f206622y0 = false;
        }
    }

    public C71331l(Context context, ListView listView, TaskBarContainer taskBarContainer) {
        this.f206601d = context;
        this.f206602e = listView;
        this.f206603f = taskBarContainer;
        this.f206606i = (Vibrator) context.getSystemService("vibrator");
        this.f206607j = C75044y4.m89989a(this.f206601d) + C75044y4.m89994f(this.f206601d);
        boolean post = listView.post(new C71332a());
        C78493o.m94790a();
        boolean b = C78493o.m94791b();
        this.f206574L = b;
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo init AppBrandDesktopAnimController isEnableDynamicBackground: %b mScrollOffset:%s ret:%s", Boolean.valueOf(b), Integer.valueOf(this.f206607j), Boolean.valueOf(post));
        this.f206598a1 = true;
        this.f206597Z0 = true;
        GyroView gyroView = this.f206591W0;
        if (gyroView != null) {
            gyroView.mo6557a(0.0f, mo98266m());
            this.f206591W0.setTranslationY(0.0f);
        }
        mo98256c();
        this.f206584T = this.f206601d.getResources().getColor(C0966R.color.f2927a);
        this.f206586U = new C76723a(this.f206601d.getResources().getColor(C0966R.color.FG_0), C74933u4.m89764a(this.f206601d.getResources().getColor(C0966R.color.BW_100_Alpha_0_8), 60));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98254a(int r6) {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r5.mo98261h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.TaskBarAnimController"
            java.lang.String r4 = "alvinluo closeHeader isVisibleHeader: %b, reason: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r5.f206603f
            r1 = 11
            if (r6 != r1) goto L_0x0031
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r1 = r0.f206464z
            boolean r1 = r1.mo94374b()
            if (r1 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r0 = r0.f206464z
            r0.mo94373a()
            r0 = 1
            goto L_0x0035
        L_0x0031:
            r0.getClass()
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            return
        L_0x0038:
            r5.f206569G = r3
            r5.f206583S0 = r2
            r5.mo98267n(r2)
            boolean r0 = r5.mo98261h()
            if (r0 != 0) goto L_0x0049
            r5.mo98264k(r2)
            return
        L_0x0049:
            r5.f206594Y = r3
            android.widget.ListView r0 = r5.f206602e
            java.lang.Runnable r1 = r5.f206611p0
            r0.removeCallbacks(r1)
            android.widget.ListView r0 = r5.f206602e
            com.tencent.mm.plugin.taskbar.ui.l$c r1 = new com.tencent.mm.plugin.taskbar.ui.l$c
            r1.<init>(r6)
            r5.f206611p0 = r1
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.taskbar.p110ui.C71331l.mo98254a(int):void");
    }

    /* renamed from: b */
    public void mo98255b(long j, int i, boolean z) {
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo closeHeader delay: %d, type: %d fast:%s", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        Runnable runnable = this.f206623z;
        if (runnable != null) {
            this.f206602e.removeCallbacks(runnable);
        }
        ListView listView = this.f206602e;
        C71335d dVar = new C71335d(z, i);
        this.f206623z = dVar;
        listView.postDelayed(dVar, j);
    }

    /* renamed from: c */
    public final void mo98256c() {
        try {
            this.f206617v = (int) (((float) this.f206601d.getResources().getDisplayMetrics().heightPixels) * 0.2f);
            int b = C76577a.m92151b(this.f206601d, 16);
            this.f206618w = b;
            int i = this.f206617v;
            if (i < b) {
                this.f206618w = 0;
            }
            this.f206619x = i;
            this.f206580R = C76577a.m92151b(this.f206601d, 100);
            Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo configAnim mStartAlphaAnimDisFromBottom: %d, mAlphaAnimationDistance: %d, mGyroViewAnimateAlphaDistance: %d", Integer.valueOf(this.f206617v), Integer.valueOf(this.f206619x), Integer.valueOf(this.f206580R));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public void mo98257d(boolean z) {
        this.f206603f.f206446e.getClass();
        if (z != this.f206589V0) {
            if (WeChatEnvironment.hasDebugger()) {
                Log.m105927v("MicroMsg.TaskBarAnimController", "alvinluo enableBottomTabSwitch enable: %b, last: %b", Boolean.valueOf(z), Boolean.valueOf(this.f206589V0));
            }
            this.f206589V0 = z;
            EnableMainBottomTabSwitchEvent enableMainBottomTabSwitchEvent = new EnableMainBottomTabSwitchEvent();
            enableMainBottomTabSwitchEvent.f193551d.f193552a = z;
            enableMainBottomTabSwitchEvent.publish();
        }
    }

    /* renamed from: e */
    public final int mo98258e() {
        if (this.f206603f.getMeasuredHeight() == 0) {
            return 0;
        }
        return this.f206603f.getBottom() - this.f206607j;
    }

    /* renamed from: f */
    public final void mo98259f() {
        boolean h = mo98261h();
        Log.m105925i("MicroMsg.TaskBarAnimController", "virbg: hideBackgroundView isEnableDynamicBackground: %b isHeaderVisible: %b", Boolean.valueOf(this.f206574L), Boolean.valueOf(h));
        if ((!this.f206567E || !h) && this.f206574L && !this.f206613r) {
            Log.m105924i("MicroMsg.TaskBarAnimController", "virbg: hideBackgroundView SurfaceView onPause and set GONE");
            this.f206610p.mo96167b();
            this.f206613r = true;
        }
    }

    /* renamed from: g */
    public boolean mo98260g() {
        return mo98261h() && this.f206575M;
    }

    /* renamed from: h */
    public boolean mo98261h() {
        Log.m105927v("MicroMsg.TaskBarAnimController", "alvinluo isVisibleHeader bottom: %d, scrollOffset: %d, firstVisiblePosition: %d HeaderOpen:%b", Integer.valueOf(this.f206603f.getBottom()), Integer.valueOf(this.f206607j), Integer.valueOf(this.f206602e.getFirstVisiblePosition()), Boolean.valueOf(this.f206575M));
        return this.f206603f.getBottom() >= this.f206607j + 10 && this.f206602e.getFirstVisiblePosition() == 0;
    }

    /* renamed from: i */
    public final boolean mo98262i() {
        return Math.abs(this.f206581R0.y - this.f206579Q0.y) <= 5.0f || this.f206581R0.y <= this.f206579Q0.y;
    }

    /* renamed from: j */
    public void mo98263j(boolean z, boolean z2, int i, int i2) {
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo notifyCallback isOpen: %b, isDrag: %b, reason: %d", Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
        if (z) {
            this.f206570H = 0;
            this.f206575M = true;
            View view = this.f206615t;
            if (view != null && view.getVisibility() == 0) {
                this.f206615t.invalidate();
            }
            Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo onOpenHeader isToClose: %b, isEnableDynamicBackgroud: %b", Boolean.valueOf(this.f206569G), Boolean.valueOf(this.f206574L));
            View view2 = this.f206599b1;
            if (view2 != null) {
                if (this.f206569G) {
                    if (view2 != null) {
                        this.f206569G = true;
                        view2.setTranslationY(0.0f);
                    }
                } else if (!mo98261h()) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onOpen header not visible");
                    this.f206599b1.setTranslationY(0.0f);
                } else {
                    this.f206599b1.animate().translationY((float) this.f206599b1.getHeight()).setDuration(260).setListener(new C5521m(this)).start();
                    this.f206588V = true;
                    Runnable runnable = this.f206590W;
                    if (runnable != null) {
                        this.f206602e.removeCallbacks(runnable);
                    }
                    ListView listView = this.f206602e;
                    C71337n nVar = new C71337n(this);
                    this.f206590W = nVar;
                    listView.postDelayed(nVar, 500);
                }
            }
            int i3 = this.f206620x0;
            if ((i3 & 2) == 0) {
                this.f206620x0 = (i3 | 2) & -5;
            } else {
                return;
            }
        } else {
            mo98264k(z2);
            int i4 = this.f206620x0;
            if ((i4 & 4) == 0) {
                this.f206620x0 = (i4 | 4) & -3;
            } else {
                return;
            }
        }
        for (C71321c next : this.f206608n) {
            if (z) {
                if (z2) {
                    next.mo98193C();
                } else {
                    next.mo98206h();
                }
            } else if (z2) {
                next.mo98201S(i);
            } else {
                next.mo98200K(i, i2);
            }
        }
    }

    /* renamed from: k */
    public void mo98264k(boolean z) {
        this.f206575M = false;
        GyroView gyroView = this.f206591W0;
        if (gyroView != null) {
            gyroView.mo6557a(0.0f, mo98266m());
            this.f206591W0.setTranslationY(0.0f);
        }
        Runnable runnable = this.f206621y;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
        if (this.f206567E) {
            C71338o oVar = new C71338o(this);
            this.f206621y = oVar;
            MMHandlerThread.postToMainThreadDelayed(oVar, 500);
        } else {
            mo98259f();
        }
        View view = this.f206599b1;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onClose", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "onClose", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206599b1.animate().translationY(0.0f).setDuration(this.f206599b1.getTranslationY() == 0.0f ? 130 : 260).setListener(new C5520f()).start();
            this.f206588V = true;
            Runnable runnable2 = this.f206590W;
            if (runnable2 != null) {
                this.f206602e.removeCallbacks(runnable2);
            }
            ListView listView = this.f206602e;
            C71337n nVar = new C71337n(this);
            this.f206590W = nVar;
            listView.postDelayed(nVar, 500);
        }
    }

    /* renamed from: l */
    public void mo98265l() {
        boolean z;
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo openHeader isVisibleHeader: %b, headerOpen: %b", Boolean.valueOf(mo98261h()), Boolean.valueOf(this.f206575M));
        if (mo98261h()) {
            boolean z2 = this.f206597Z0;
            this.f206594Y = true;
            this.f206569G = false;
            this.f206602e.removeCallbacks(this.f206611p0);
            ListView listView = this.f206602e;
            C71333b bVar = new C71333b();
            this.f206611p0 = bVar;
            listView.post(bVar);
            if (!this.f206574L) {
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo checkAndStartPerformanceMonitor not enableNativeBackground not need to monitor");
                return;
            }
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if (defaultPreference != null) {
                long j = defaultPreference.getLong("monitory_last_check_time", -1);
                if (C79166c.f232466d == 0) {
                    C79166c.f232466d = defaultPreference.getInt("current_app_fps", 0);
                }
                Log.m105919d("MicroMsg.DynamicBackgroundConfig", "alvinluo needMonitorFps lastAppFps: %d, lastCheckTime: %d", Integer.valueOf(C79166c.f232466d), Long.valueOf(j));
                if (j == -1 || C79166c.f232466d <= 45 || System.currentTimeMillis() - j > 3600000) {
                    defaultPreference.edit().putLong("monitory_last_check_time", System.currentTimeMillis()).apply();
                    z = true;
                } else {
                    z = false;
                }
                Log.m105925i("MicroMsg.DynamicBackgroundConfig", "alvinluo needMonitorFps needCheck: %b", Boolean.valueOf(z));
            } else {
                z = false;
            }
            if (!z) {
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo checkAndStartPerformanceMonitor no need to check");
                return;
            }
            Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo checkAndStartPerformanceMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b", Boolean.valueOf(this.f206565C), Boolean.valueOf(this.f206566D));
            if (!this.f206565C && !this.f206566D) {
                this.f206565C = true;
                C88654b bVar2 = this.f206563A;
                if (bVar2 != null) {
                    bVar2.mo97819a();
                }
                this.f206563A = new C71328j(this);
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo execute startMonitorRunnable");
                ((C119157j) C119157j.f356862d).mo183876g(this.f206563A, "AppBrandDesktopPerformanceMonitor");
            }
        }
    }

    /* renamed from: m */
    public int mo98266m() {
        if (this.f206604g == 0) {
            this.f206604g = (int) (((float) this.f206603f.getHeight()) * 0.2f);
        }
        return this.f206604g;
    }

    /* renamed from: n */
    public final void mo98267n(int i) {
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo setActionBarVisible: %d", Integer.valueOf(i));
        View view = this.f206600c1;
        if (view != null && view.getVisibility() != i) {
            View view2 = this.f206600c1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setActionBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "setActionBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: o */
    public void mo98268o(MotionEvent motionEvent) {
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo setActionDownEvent %d, x: %f, y: %f", Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        this.f206602e.removeCallbacks(this.f206611p0);
        this.f206602e.removeCallbacks(this.f206623z);
        this.f206579Q0.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f206596Z = false;
        this.f206588V = false;
        this.f206583S0 = true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v66 */
    /* JADX WARNING: type inference failed for: r0v68 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x06ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r38, int r39, int r40, int r41) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r39)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r40)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            r4 = r37
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            boolean r0 = r6.f206588V
            r1 = 5
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r5 = "onScroll"
            java.lang.String r8 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r9 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r10 = "MicroMsg.TaskBarAnimController"
            if (r0 != 0) goto L_0x0072
            boolean r0 = r38.isInLayout()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r6.f206569G
            if (r0 != 0) goto L_0x0072
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getBottom()
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r11 = r6.f206603f
            int r11 = r11.getHeight()
            int r11 = r11 - r1
            if (r0 >= r11) goto L_0x0072
            boolean r0 = r6.f206575M
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "isInLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r6.mo98254a(r2)
            j20.C117292a.m165361g(r6, r9, r8, r5, r4)
            return
        L_0x0072:
            boolean r0 = r6.f206596Z
            r11 = 4
            if (r0 == 0) goto L_0x0094
            boolean r0 = r6.f206594Y
            if (r0 != 0) goto L_0x0094
            boolean r0 = r6.f206622y0
            if (r0 == 0) goto L_0x0094
            if (r39 > 0) goto L_0x0094
            boolean r0 = r37.mo98261h()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "alvinluo [onScroll] stop fling!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            android.widget.ListView r0 = r6.f206602e
            r0.scrollBy(r2, r2)
            r6.mo98254a(r11)
        L_0x0094:
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            r12 = 6
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r14 = 1028443341(0x3d4ccccd, float:0.05)
            r15 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0123
            int r0 = r0.getHeight()
            int r1 = r6.f206582S
            if (r0 == r1) goto L_0x0123
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            int r0 = r0 + 60
            r6.f206577P = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            int r1 = r6.f206607j
            int r0 = r0 - r1
            r6.f206578Q = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            r6.f206604g = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r14
            int r0 = (int) r0
            r6.f206605h = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r1 = r6.f206603f
            int r1 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            int r1 = r6.f206582S
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r11] = r1
            int r1 = r6.f206577P
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r15] = r1
            int r1 = r6.f206578Q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r18 = 3
            r0[r18] = r1
            int r1 = r6.f206604g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r17 = 4
            r0[r17] = r1
            int r1 = r6.f206605h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 5
            r0[r16] = r1
            java.lang.String r1 = "alvinluo initAnimationOffset headerContainer height: %d, old: %d, startAlphaOffset: %d, endAlphaOffset: %d, openLimit: %d, closeLimit: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            r6.f206582S = r0
        L_0x0123:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            boolean r1 = r6.f206622y0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r39)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r40)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
            r18 = 3
            r0[r18] = r1
            boolean r1 = r6.f206596Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r17 = 4
            r0[r17] = r1
            int r1 = r6.f206577P
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 5
            r0[r16] = r1
            java.lang.String r1 = "alvinluo onScroll isFling: %b, firstVisibleItem: %d, visibleItemCount: %d, totalItemCount: %d, isNeedCheckStopFling: %b, listBgStartAlphaOffset: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r1, r0)
            boolean r0 = r6.f206596Z
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x041e
            if (r39 != 0) goto L_0x041e
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            if (r0 == 0) goto L_0x041e
            int r0 = r0.getBottom()
            wx2.a r13 = r6.f206609o
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r2] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r11] = r0
            int r0 = r6.f206607j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r15] = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r18 = 3
            r14[r18] = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getBottom()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = 4
            r14[r17] = r0
            boolean r0 = r6.f206614s
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r16 = 5
            r14[r16] = r0
            java.lang.String r0 = "alvinluo onDragHeader disX: %d, disY: %d, mScrollOffset: %d, headerContainer height: %d, headerContainer bottom: %d, canShowSurfaceView: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r14)
            boolean r0 = r6.f206574L
            if (r0 != 0) goto L_0x01b3
            android.view.View r14 = r6.f206615t
            if (r14 != 0) goto L_0x01b3
            goto L_0x02af
        L_0x01b3:
            if (r0 == 0) goto L_0x0217
            boolean r0 = r37.mo98261h()
            if (r0 == 0) goto L_0x02af
            boolean r0 = r6.f206613r
            if (r0 == 0) goto L_0x02af
            boolean r0 = r6.f206614s
            if (r0 == 0) goto L_0x02af
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            com.tencent.mm.plugin.taskbar.ui.f r0 = r0.getTaskBarView()
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r0
            boolean r0 = r0.f206487U1
            if (r0 != 0) goto L_0x02af
            r6.f206613r = r2
            android.view.View r0 = r6.f206615t
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r21 = k20.C60958c.f173611a
            r14.mo10233c(r3)
            java.lang.Object[] r22 = r14.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r24 = "switchToSurfaceView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r3 = r14.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r22 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r23 = "switchToSurfaceView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r0 = r6.f206610p
            r0.mo96166a()
            goto L_0x02af
        L_0x0217:
            r6.f206613r = r11
            boolean r0 = r37.mo98261h()
            if (r0 == 0) goto L_0x02af
            android.view.View r0 = r6.f206615t
            if (r0 == 0) goto L_0x02af
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0233
            android.view.View r0 = r6.f206615t
            float r0 = r0.getAlpha()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02af
        L_0x0233:
            android.view.View r0 = r6.f206615t
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r21 = k20.C60958c.f173611a
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
            r14.mo10233c(r12)
            java.lang.Object[] r22 = r14.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r24 = "showSurfaceView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setAlpha"
            java.lang.String r28 = "(F)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r12 = r14.mo10231a(r2)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            r0.setAlpha(r12)
            java.lang.String r22 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r23 = "showSurfaceView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            android.view.View r0 = r6.f206615t
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r3)
            java.lang.Object[] r30 = r12.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r32 = "showSurfaceView"
            java.lang.String r33 = "()V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r0
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            java.lang.Object r3 = r12.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r30 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r31 = "showSurfaceView"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x02af:
            boolean r0 = r6.f206573K
            if (r0 != 0) goto L_0x02ba
            java.lang.String r0 = "alvinluo onDragHeader disableUpdateListAlpha"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x041e
        L_0x02ba:
            int r0 = r37.mo98258e()
            int r3 = r6.f206577P
            int r3 = r0 - r3
            float r3 = (float) r3
            float r3 = r3 * r1
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r12 = r6.f206603f
            int r12 = r12.getMeasuredHeight()
            int r14 = r6.f206607j
            int r12 = r12 - r14
            int r14 = r6.f206577P
            int r12 = r12 - r14
            float r12 = (float) r12
            float r3 = r3 / r12
            r12 = 0
            float r3 = java.lang.Math.max(r12, r3)
            float r3 = java.lang.Math.min(r1, r3)
            float r3 = r1 - r3
            r6.mo98274r(r3)
            if (r13 == 0) goto L_0x02ed
            int r14 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r14 < 0) goto L_0x02e9
            r14 = 1
            goto L_0x02ea
        L_0x02e9:
            r14 = 0
        L_0x02ea:
            r13.mo101312b(r14)
        L_0x02ed:
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r13 = r6.f206603f
            int r13 = r13.getHeight()
            int r14 = r6.f206607j
            int r13 = r13 - r14
            int r14 = r6.f206617v
            int r13 = r13 - r14
            int r14 = r37.mo98258e()
            int r14 = r14 - r13
            float r15 = (float) r14
            float r15 = r15 * r1
            int r11 = r6.f206617v
            int r2 = r6.f206618w
            int r11 = r11 - r2
            float r2 = (float) r11
            float r15 = r15 / r2
            float r2 = java.lang.Math.max(r12, r15)
            float r2 = java.lang.Math.min(r1, r2)
            r11 = 5
            java.lang.Object[] r15 = new java.lang.Object[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r23 = 0
            r15[r23] = r11
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r22 = 1
            r15[r22] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r14 = 2
            r15[r14] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r13 = 3
            r15[r13] = r11
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            r13 = 4
            r15[r13] = r11
            java.lang.String r11 = "alvinluo onDragHeader scrollOffset: %d, percent: %f, diff: %d, fromOffset: %d, actionBarAlpha: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r11, r15)
            int r11 = r6.f206577P
            int r11 = r11 / r14
            if (r0 >= r11) goto L_0x034f
            boolean r11 = r6.f206572J
            if (r11 == 0) goto L_0x035b
            r11 = 0
            r6.f206572J = r11
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r13 = r6.f206603f
            r13.mo98168e(r11)
            goto L_0x035b
        L_0x034f:
            boolean r11 = r6.f206572J
            if (r11 != 0) goto L_0x035b
            r11 = 1
            r6.f206572J = r11
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r13 = r6.f206603f
            r13.mo98168e(r11)
        L_0x035b:
            int r11 = r6.f206577P
            if (r0 >= r11) goto L_0x036c
            r11 = 0
            r6.mo98267n(r11)
            int r2 = r6.f206584T
            r6.mo98272p(r1, r2, r0)
            r6.mo98273q(r1)
            goto L_0x0389
        L_0x036c:
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x0389
            r11 = 4
            r6.mo98267n(r11)
            android.content.Context r11 = r6.f206601d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131100055(0x7f060197, float:1.781248E38)
            int r11 = r11.getColor(r12)
            r6.mo98272p(r2, r11, r0)
            float r0 = r1 - r2
            r6.mo98273q(r0)
        L_0x0389:
            r0 = r39
        L_0x038b:
            int r2 = r39 + r40
            if (r0 >= r2) goto L_0x03da
            android.view.View r2 = r7.getChildAt(r0)
            if (r2 == 0) goto L_0x03d7
            if (r0 == 0) goto L_0x03d7
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r11.mo10233c(r12)
            java.lang.Object[] r30 = r11.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r32 = "onDragHeader"
            java.lang.String r33 = "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setAlpha"
            java.lang.String r36 = "(F)V"
            r29 = r2
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r2.setAlpha(r11)
            java.lang.String r30 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r31 = "onDragHeader"
            java.lang.String r32 = "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setAlpha"
            java.lang.String r35 = "(F)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x03d7:
            int r0 = r0 + 1
            goto L_0x038b
        L_0x03da:
            android.view.View r0 = r6.f206616u
            if (r0 == 0) goto L_0x041e
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r30 = r2.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r32 = "onDragHeader"
            java.lang.String r33 = "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setAlpha"
            java.lang.String r36 = "(F)V"
            r29 = r0
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.setAlpha(r2)
            java.lang.String r30 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r31 = "onDragHeader"
            java.lang.String r32 = "(IILandroid/widget/AbsListView;IILcom/tencent/mm/plugin/taskbar/api/ActionBarColorUpdate;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setAlpha"
            java.lang.String r35 = "(F)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x041e:
            android.widget.ListView r0 = r6.f206602e
            r2 = 8
            if (r0 != 0) goto L_0x0427
        L_0x0424:
            r0 = 1
            goto L_0x049b
        L_0x0427:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r0 < r3) goto L_0x0434
            boolean r0 = p206nj.C88956h.m111064e()
            if (r0 != 0) goto L_0x0434
            goto L_0x0424
        L_0x0434:
            boolean r0 = r37.mo98260g()
            if (r0 == 0) goto L_0x043b
            goto L_0x0424
        L_0x043b:
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            if (r0 == 0) goto L_0x0424
            int r0 = r0.getBottom()
            int r3 = r6.f206607j
            int r3 = r3 + 20
            if (r0 > r3) goto L_0x0424
            android.view.View r0 = r6.f206615t
            if (r0 == 0) goto L_0x048f
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r11)
            java.lang.Object[] r30 = r3.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r32 = "updateListViewBg"
            java.lang.String r33 = "()V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r0
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r11 = 0
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r30 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r31 = "updateListViewBg"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
        L_0x048f:
            boolean r0 = r6.f206574L
            if (r0 == 0) goto L_0x0424
            r0 = 1
            r6.f206613r = r0
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r3 = r6.f206610p
            r3.mo96167b()
        L_0x049b:
            boolean r3 = r37.mo98261h()
            if (r3 != 0) goto L_0x0523
            r6.f206596Z = r0
            int r3 = r37.mo98258e()
            int r3 = r3 + -60
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            boolean r11 = r37.mo98262i()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r13 = 0
            r12[r13] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r12[r0] = r11
            int r0 = r6.f206605h
            if (r0 != 0) goto L_0x04d0
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r11 = 1028443341(0x3d4ccccd, float:0.05)
            float r0 = r0 * r11
            int r0 = (int) r0
            r6.f206605h = r0
        L_0x04d0:
            int r0 = r6.f206605h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = 2
            r12[r11] = r0
            java.lang.String r0 = "checkClose moveUp:%b offset:%d closeLimit:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r12)
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            if (r0 == 0) goto L_0x04e9
            int r0 = r0.getBottom()
            if (r0 > 0) goto L_0x04e9
            goto L_0x0508
        L_0x04e9:
            boolean r0 = r37.mo98262i()
            if (r0 == 0) goto L_0x0508
            int r0 = r6.f206605h
            if (r0 != 0) goto L_0x0502
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r11 = 1028443341(0x3d4ccccd, float:0.05)
            float r0 = r0 * r11
            int r0 = (int) r0
            r6.f206605h = r0
        L_0x0502:
            int r0 = r6.f206605h
            if (r3 >= r0) goto L_0x0508
            r0 = 1
            goto L_0x0509
        L_0x0508:
            r0 = 0
        L_0x0509:
            if (r0 == 0) goto L_0x0515
            boolean r0 = r6.f206576N
            if (r0 == 0) goto L_0x0515
            r0 = 1
            r3 = 0
            r6.mo98263j(r3, r0, r3, r3)
            goto L_0x0526
        L_0x0515:
            r0 = 1
            r3 = 0
            boolean r11 = r6.f206585T0
            if (r11 == 0) goto L_0x0526
            boolean r11 = r6.f206576N
            if (r11 == 0) goto L_0x0526
            r6.mo98263j(r3, r0, r3, r3)
            goto L_0x0526
        L_0x0523:
            r3 = 0
            r6.f206596Z = r3
        L_0x0526:
            com.tencent.mm.plugin.taskbar.api.GyroView r0 = r6.f206591W0
            if (r0 != 0) goto L_0x0537
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            r3 = 2131305823(0x7f09255f, float:1.8229828E38)
            android.view.View r0 = r0.findViewById(r3)
            com.tencent.mm.plugin.taskbar.api.GyroView r0 = (com.tencent.p014mm.plugin.taskbar.api.GyroView) r0
            r6.f206591W0 = r0
        L_0x0537:
            android.view.View r0 = r6.f206593X0
            if (r0 != 0) goto L_0x0546
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            r3 = 2131297029(0x7f090305, float:1.8211991E38)
            android.view.View r0 = r0.findViewById(r3)
            r6.f206593X0 = r0
        L_0x0546:
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r0 = r6.f206595Y0
            if (r0 != 0) goto L_0x0552
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r6.f206603f
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r0 = r0.getDesktopContainerView()
            r6.f206595Y0 = r0
        L_0x0552:
            if (r39 <= 0) goto L_0x0556
            goto L_0x06a5
        L_0x0556:
            int r0 = r37.mo98266m()
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r3 = r6.f206603f
            int r3 = r3.getBottom()
            int r11 = r37.mo98258e()
            int r12 = r6.f206578Q
            int r13 = r6.f206577P
            int r12 = r12 - r13
            int r13 = r11 - r13
            float r13 = (float) r13
            float r13 = r13 * r1
            float r14 = (float) r12
            float r13 = r13 / r14
            android.view.View r14 = r6.f206593X0
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r20 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
            r15.mo10233c(r2)
            java.lang.Object[] r30 = r15.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r32 = "setHeaderAlpha"
            java.lang.String r33 = "(F)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setAlpha"
            java.lang.String r36 = "(F)V"
            r29 = r14
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r2 = 0
            java.lang.Object r15 = r15.mo10231a(r2)
            java.lang.Float r15 = (java.lang.Float) r15
            float r2 = r15.floatValue()
            r14.setAlpha(r2)
            java.lang.String r30 = "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController"
            java.lang.String r31 = "setHeaderAlpha"
            java.lang.String r32 = "(F)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setAlpha"
            java.lang.String r35 = "(F)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView r2 = r6.f206595Y0
            boolean r14 = r2.f197230j
            if (r14 == 0) goto L_0x05b9
            goto L_0x05d4
        L_0x05b9:
            android.view.ViewGroup r14 = r2.f197224d
            r14.setAlpha(r13)
            r14 = 1045220557(0x3e4ccccd, float:0.2)
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x05cf
            android.view.ViewGroup r2 = r2.f197225e
            r14 = 5
            float r15 = (float) r14
            float r15 = r15 * r13
            r2.setAlpha(r15)
            goto L_0x05d4
        L_0x05cf:
            android.view.ViewGroup r2 = r2.f197225e
            r2.setAlpha(r1)
        L_0x05d4:
            int r2 = r11 + -60
            r14 = 11
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r19 = 0
            r14[r19] = r15
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15 = 1
            r14[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r15 = 2
            r14[r15] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r13)
            r13 = 3
            r14[r13] = r12
            int r12 = r6.f206577P
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 4
            r14[r13] = r12
            int r12 = r6.f206578Q
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 5
            r14[r13] = r12
            boolean r12 = r6.f206622y0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r13 = 6
            r14[r13] = r12
            r12 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r14[r12] = r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r13 = 8
            r14[r13] = r12
            r12 = 9
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r13 = r6.f206603f
            int r13 = r13.getHeight()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r12] = r13
            com.tencent.mm.plugin.taskbar.api.GyroView r12 = r6.f206591W0
            int r12 = r12.getHeight()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 10
            r14[r13] = r12
            java.lang.String r12 = "alvinluo handleGyroView dis: %d, totalDis: %d, offsetY: %d, percent: %f, start: %d, end: %d, isFling: %b, limit: %d, bottom: %d, headerContainerHeight: %d, gyroView height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r12, r14)
            boolean r10 = r6.f206622y0
            if (r10 != 0) goto L_0x0649
            r10 = 5
            if (r3 >= r10) goto L_0x064d
        L_0x0649:
            boolean r10 = r6.f206568F
            if (r10 == 0) goto L_0x0661
        L_0x064d:
            if (r0 < r2) goto L_0x065b
            com.tencent.mm.plugin.taskbar.api.GyroView r10 = r6.f206591W0
            float r12 = (float) r2
            r10.mo6557a(r12, r0)
            com.tencent.mm.plugin.taskbar.api.GyroView r10 = r6.f206591W0
            r10.setAlpha(r1)
            goto L_0x0661
        L_0x065b:
            com.tencent.mm.plugin.taskbar.api.GyroView r10 = r6.f206591W0
            float r12 = (float) r0
            r10.mo6557a(r12, r0)
        L_0x0661:
            int r10 = r2 - r0
            float r10 = (float) r10
            float r10 = r10 * r1
            int r12 = r6.f206580R
            float r12 = (float) r12
            float r10 = r10 / r12
            float r1 = r1 - r10
            com.tencent.mm.plugin.taskbar.api.GyroView r10 = r6.f206591W0
            int r12 = r10.getHeight()
            int r11 = r11 - r12
            int r11 = -r11
            float r11 = (float) r11
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            r10.setTranslationY(r11)
            com.tencent.mm.plugin.taskbar.api.GyroView r10 = r6.f206591W0
            r10.setAlpha(r1)
            if (r2 < r0) goto L_0x069b
            boolean r0 = r6.f206598a1
            if (r0 == 0) goto L_0x069b
            boolean r0 = r37.mo98261h()
            if (r0 == 0) goto L_0x069b
            boolean r0 = r38.isInLayout()
            if (r0 != 0) goto L_0x069b
            android.os.Vibrator r0 = r6.f206606i
            r1 = 10
            r0.vibrate(r1)
            r0 = 0
            r6.f206598a1 = r0
        L_0x069b:
            int r0 = r6.f206607j
            int r0 = r0 + r13
            if (r3 >= r0) goto L_0x06a5
            r0 = 1
            r6.f206598a1 = r0
            r6.f206597Z0 = r0
        L_0x06a5:
            boolean r0 = r37.mo98261h()
            r6.f206585T0 = r0
            boolean r0 = r37.mo98261h()
            if (r0 == 0) goto L_0x06ba
            boolean r0 = r6.f206583S0
            if (r0 == 0) goto L_0x06ba
            r0 = 0
            r6.mo98257d(r0)
            goto L_0x06c9
        L_0x06ba:
            r0 = 0
            boolean r1 = r6.f206575M
            if (r1 != 0) goto L_0x06c4
            r2 = 1
            r6.mo98257d(r2)
            goto L_0x06c9
        L_0x06c4:
            if (r1 == 0) goto L_0x06c9
            r6.mo98257d(r0)
        L_0x06c9:
            java.lang.Runnable r0 = r6.f206587U0
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
            java.lang.Runnable r0 = r6.f206587U0
            r1 = 60
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            j20.C117292a.m165361g(r6, r9, r8, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.taskbar.p110ui.C71331l.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo onScrollStateChanged scrollState: %d, isMoveUp: %b", Integer.valueOf(i), Boolean.valueOf(mo98262i()));
        this.f206614s = true;
        if (i == 0 || i == -1) {
            this.f206576N = false;
            if (!this.f206594Y || i != 0) {
                int e = mo98258e() - 60;
                Log.m105925i("MicroMsg.TaskBarAnimController", "checkOpen moveUp:%b offset:%d openLimit:%d", Boolean.valueOf(mo98262i()), Integer.valueOf(e), Integer.valueOf(mo98266m()));
                TaskBarContainer taskBarContainer = this.f206603f;
                if ((taskBarContainer == null || taskBarContainer.getBottom() > 0) && !mo98262i() && e > mo98266m()) {
                    mo98265l();
                } else if (mo98262i() && i == -1) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onScrollStateChanged closeHeader");
                    mo98254a(4);
                } else if (i == -1) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onScrollStateChanged closeHeader auto");
                    mo98254a(0);
                    this.f206568F = true;
                }
            } else {
                Log.m105924i("MicroMsg.TaskBarAnimController", "isScrollingByAnim True!!!");
                this.f206594Y = false;
                C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
        } else if (i == 2) {
            this.f206622y0 = true;
            this.f206576N = true;
        } else if (i == 1) {
            this.f206622y0 = false;
            this.f206573K = true;
            this.f206576N = true;
            if (mo98262i()) {
                this.f206622y0 = false;
                this.f206570H = 4;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            mo98268o(motionEvent);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f206583S0 = false;
            this.f206581R0.set(motionEvent.getRawX(), motionEvent.getRawY());
            TaskBarContainer taskBarContainer = this.f206603f;
            if (taskBarContainer != null && taskBarContainer.getBackUpFooterRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && mo98262i()) {
                if (this.f206570H == 0) {
                    this.f206570H = 12;
                }
                Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo onTouch ActionUp reason: %d", Integer.valueOf(this.f206570H));
            }
            Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onTouch ActionUp");
            onScrollStateChanged(this.f206602e, -1);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: p */
    public final void mo98272p(float f, int i, int i2) {
        TaskBarBottomView taskBarBottomView;
        Log.m105919d("MicroMsg.TaskBarAnimController", "alvinluo updateActionBarBgColor ratio: %f, scrollOffset: %d", Float.valueOf(f), Integer.valueOf(i2));
        int i3 = (i & 16777215) | (((int) (255.0f * f)) << 24);
        C78736a aVar = this.f206609o;
        if (aVar != null) {
            aVar.mo101311a(f, i3, i2);
        }
        TaskBarContainer taskBarContainer = this.f206603f;
        if (taskBarContainer != null && (taskBarBottomView = taskBarContainer.f206463y) != null) {
            taskBarBottomView.setDrawColor(i3);
        }
    }

    /* renamed from: q */
    public final void mo98273q(float f) {
        Log.m105919d("MicroMsg.TaskBarAnimController", "alvinluo updateActionBarFgColor ratio: %f", Float.valueOf(f));
        int a = this.f206586U.mo107002a(1.0f - f);
        C78736a aVar = this.f206609o;
        if (aVar != null) {
            aVar.mo101313c(f, a, a);
        }
        TaskBarContainer taskBarContainer = this.f206603f;
        if (taskBarContainer != null) {
            TextView textView = taskBarContainer.f206455q;
            if (textView != null) {
                textView.setTextColor(a);
            }
            WeImageView weImageView = taskBarContainer.f206456r;
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.actionbar_icon_dark_search);
                taskBarContainer.f206456r.setIconColor(a);
            }
            WeImageView weImageView2 = taskBarContainer.f206457s;
            if (weImageView2 != null) {
                weImageView2.setImageResource(C0966R.raw.icons_outlined_add2);
                taskBarContainer.f206457s.setIconColor(a);
            }
            WeImageView weImageView3 = taskBarContainer.f206459u;
            if (weImageView3 != null) {
                weImageView3.setVisibility(taskBarContainer.f206446e.f206512z1.f206523b ? 0 : 8);
            }
            WeImageView weImageView4 = taskBarContainer.f206458t;
            if (weImageView4 != null) {
                weImageView4.setIconColor(a);
                View view = taskBarContainer.f206452n;
                if (view != null) {
                    View findViewById = view.findViewById(C0966R.C0970id.f5471g1);
                    if (findViewById == null || findViewById.getVisibility() != 0) {
                        taskBarContainer.f206458t.setVisibility(4);
                    } else {
                        taskBarContainer.f206458t.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo98274r(float f) {
        int i = ((int) (255.0f * f)) << 24;
        int color = (this.f206601d.getResources().getColor(C0966R.color.f2927a) & 16777215) | i;
        int b = (Build.VERSION.SDK_INT < 23 || C88956h.m111064e()) ? (C74933u4.m89765b(this.f206601d.getResources().getColor(C0966R.color.aec), this.f206601d.getResources().getColor(C0966R.color.f2927a)) & 16777215) | i : f < 1.0f ? 0 : color;
        ListView listView = this.f206602e;
        if (listView != null) {
            listView.setBackgroundColor(color);
        }
        View view = this.f206612q;
        if (view != null) {
            view.setBackgroundColor(b);
        }
    }
}
