package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton;", "Landroid/widget/FrameLayout;", "", "enable", "Lrx3/b0;", "setTouchEnable", "Lcom/tencent/mm/plugin/mmsight/ui/j;", "callback", "setLongPressCallback", "Lcom/tencent/mm/plugin/mmsight/ui/k;", "setLongPressScrollCallback", "Lcom/tencent/mm/plugin/mmsight/ui/z0;", "setSimpleTapCallback", "setEnableCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton */
public final class ImproveMMSightRecordButton extends FrameLayout {

    /* renamed from: H */
    public static final /* synthetic */ int f313711H = 0;

    /* renamed from: A */
    public int f313712A;

    /* renamed from: B */
    public int f313713B;

    /* renamed from: C */
    public C105518b0 f313714C;

    /* renamed from: D */
    public long f313715D;

    /* renamed from: E */
    public long f313716E;

    /* renamed from: F */
    public boolean f313717F = true;

    /* renamed from: G */
    public boolean f313718G = true;

    /* renamed from: d */
    public View f313719d;

    /* renamed from: e */
    public View f313720e;

    /* renamed from: f */
    public View f313721f;

    /* renamed from: g */
    public ImproveMMSightCircularProgressBar f313722g;

    /* renamed from: h */
    public ImproveMMSightCircularCustomProgressBar f313723h;

    /* renamed from: i */
    public C105538j f313724i;

    /* renamed from: j */
    public C105539k f313725j;

    /* renamed from: n */
    public C105591z0 f313726n;

    /* renamed from: o */
    public final C0000n0 f313727o = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: p */
    public C53973z1 f313728p;

    /* renamed from: q */
    public boolean f313729q = true;

    /* renamed from: r */
    public boolean f313730r;

    /* renamed from: s */
    public ViewPropertyAnimator f313731s;

    /* renamed from: t */
    public ViewPropertyAnimator f313732t;

    /* renamed from: u */
    public ViewPropertyAnimator f313733u;

    /* renamed from: v */
    public ViewPropertyAnimator f313734v;

    /* renamed from: w */
    public ViewPropertyAnimator f313735w;

    /* renamed from: x */
    public float f313736x = -1.0f;

    /* renamed from: y */
    public boolean f313737y;

    /* renamed from: z */
    public boolean f313738z;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$a */
    public static final class C105488a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ImproveMMSightRecordButton f313739d;

        public C105488a(ImproveMMSightRecordButton improveMMSightRecordButton) {
            this.f313739d = improveMMSightRecordButton;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni record ani >> ani end " + this.f313739d.f313730r + ", " + this.f313739d.f313718G);
            ImproveMMSightRecordButton improveMMSightRecordButton = this.f313739d;
            if (!improveMMSightRecordButton.f313718G) {
                improveMMSightRecordButton.f313730r = false;
            } else if (improveMMSightRecordButton.f313730r) {
                C105538j jVar = improveMMSightRecordButton.f313724i;
                if (jVar != null) {
                    jVar.mo150387c();
                }
                this.f313739d.f313730r = false;
            } else {
                C105591z0 z0Var = improveMMSightRecordButton.f313726n;
                if (z0Var != null) {
                    z0Var.mo150438a();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni record ani >> ani start");
            ImproveMMSightRecordButton improveMMSightRecordButton = this.f313739d;
            int i = ImproveMMSightRecordButton.f313711H;
            improveMMSightRecordButton.mo150288c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$b */
    public static final class C105489b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ AnimatorListenerAdapter f313740d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f313741e;

        public C105489b(AnimatorListenerAdapter animatorListenerAdapter, ViewPropertyAnimator viewPropertyAnimator) {
            this.f313740d = animatorListenerAdapter;
            this.f313741e = viewPropertyAnimator;
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni no record >> end");
            this.f313740d.onAnimationEnd(animator);
            this.f313741e.setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$c */
    public static final class C105490c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ AnimatorListenerAdapter f313742d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f313743e;

        public C105490c(AnimatorListenerAdapter animatorListenerAdapter, ViewPropertyAnimator viewPropertyAnimator) {
            this.f313742d = animatorListenerAdapter;
            this.f313743e = viewPropertyAnimator;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni is record >> ani end");
            this.f313742d.onAnimationEnd(animator);
            this.f313743e.setListener((Animator.AnimatorListener) null);
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni is record >> ani start");
            this.f313742d.onAnimationStart(animator);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveMMSightRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo150286a();
    }

    /* renamed from: a */
    public final void mo150286a() {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d6h, this, true);
        this.f313719d = findViewById(C0966R.C0970id.f7_);
        this.f313720e = findViewById(C0966R.C0970id.hpy);
        this.f313721f = findViewById(C0966R.C0970id.i7m);
        this.f313723h = (ImproveMMSightCircularCustomProgressBar) findViewById(C0966R.C0970id.aov);
        this.f313722g = (ImproveMMSightCircularProgressBar) findViewById(C0966R.C0970id.bd6);
    }

    /* renamed from: b */
    public final void mo150287b(AnimatorListenerAdapter animatorListenerAdapter) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator animate;
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni >> " + this.f313730r);
        ViewPropertyAnimator viewPropertyAnimator2 = this.f313734v;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = null;
        this.f313734v = null;
        View view = this.f313719d;
        if (view == null || (viewPropertyAnimator = view.animate()) == null) {
            viewPropertyAnimator = null;
        } else {
            viewPropertyAnimator.scaleX(1.0f);
            viewPropertyAnimator.scaleY(1.0f);
            viewPropertyAnimator.setDuration(50);
            if (!this.f313730r) {
                viewPropertyAnimator.setListener(new C105489b(animatorListenerAdapter, viewPropertyAnimator));
            }
            viewPropertyAnimator.start();
        }
        this.f313734v = viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator4 = this.f313735w;
        if (viewPropertyAnimator4 != null) {
            viewPropertyAnimator4.cancel();
        }
        this.f313735w = null;
        View view2 = this.f313720e;
        if (!(view2 == null || (animate = view2.animate()) == null)) {
            animate.scaleX(1.0f);
            animate.scaleY(1.0f);
            animate.alpha(1.0f);
            if (this.f313730r) {
                animate.setListener(new C105490c(animatorListenerAdapter, animate));
            }
            animate.setDuration(50);
            animate.start();
            viewPropertyAnimator3 = animate;
        }
        this.f313735w = viewPropertyAnimator3;
    }

    /* renamed from: c */
    public final void mo150288c() {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "resetCircularProgressBar");
        ImproveMMSightCircularCustomProgressBar improveMMSightCircularCustomProgressBar = this.f313723h;
        if (improveMMSightCircularCustomProgressBar != null) {
            improveMMSightCircularCustomProgressBar.setVisibility(8);
        }
        ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = this.f313722g;
        if (improveMMSightCircularProgressBar != null) {
            improveMMSightCircularProgressBar.setVisibility(8);
        }
        ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar2 = this.f313722g;
        if (improveMMSightCircularProgressBar2 != null) {
            Log.m105924i("MicroMsg.ImproveMMSightCircularProgressBar", "reset");
            C105534i iVar = improveMMSightCircularProgressBar2.f313710r;
            if (iVar != null) {
                iVar.f313941j = false;
                C53973z1 z1Var = iVar.f313935d;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                iVar.f313935d = null;
                iVar.f313938g = 0;
                iVar.f313942k = null;
            }
            improveMMSightCircularProgressBar2.f313710r = null;
            improveMMSightCircularProgressBar2.f313707o = 100.0f;
            improveMMSightCircularProgressBar2.f313706n = 0.0f;
            improveMMSightCircularProgressBar2.f313708p = 0.0f;
            improveMMSightCircularProgressBar2.f313705j = null;
            improveMMSightCircularProgressBar2.invalidate();
        }
    }

    /* renamed from: d */
    public final void mo150289d() {
        setVisibility(8);
        View view = this.f313719d;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        View view2 = this.f313720e;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        mo150288c();
        this.f313730r = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r0 != 3) goto L_0x0207;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onTouchEvent >> action: "
            r0.append(r1)
            int r1 = r13.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ImproveMMSightRecordButton"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r12.f313729q
            r2 = 0
            if (r0 != 0) goto L_0x002a
            java.lang.String r13 = "onTouchEvent but is no enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r13)
            return r2
        L_0x002a:
            int r0 = r13.getAction()
            java.lang.String r3 = "cancelAllDelayJob"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0154
            if (r0 == r5) goto L_0x00d9
            r6 = 3
            r7 = 2
            if (r0 == r7) goto L_0x003e
            if (r0 == r6) goto L_0x00d9
            goto L_0x0207
        L_0x003e:
            float r0 = r13.getRawY()
            int[] r3 = new int[r7]
            r12.getLocationInWindow(r3)
            r3 = r3[r5]
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0207
            boolean r3 = r12.f313730r
            if (r3 == 0) goto L_0x0207
            float r3 = r12.f313736x
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            float r13 = r13.getRawY()
            r12.f313736x = r13
            goto L_0x0207
        L_0x0061:
            float r13 = r0 - r3
            float r13 = java.lang.Math.abs(r13)
            float r3 = r12.f313736x
            r4 = 10
            r8 = 1092616192(0x41200000, float:10.0)
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a3
            int r9 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00a3
            float r3 = (float) r4
            float r13 = r13 / r3
            int r13 = (int) r13
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3[r2] = r4
            boolean r4 = r12.f313737y
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r5] = r4
            java.lang.String r4 = "onScroll Up, factor: %s, isFirstScrollUp: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r3)
            if (r13 <= r6) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r6 = r13
        L_0x0091:
            com.tencent.mm.plugin.mmsight.ui.k r13 = r12.f313725j
            if (r13 == 0) goto L_0x009d
            boolean r1 = r12.f313737y
            if (r1 == 0) goto L_0x009a
            r6 = 1
        L_0x009a:
            r13.mo150388a(r6)
        L_0x009d:
            r12.f313736x = r0
            r12.f313737y = r2
            goto L_0x0207
        L_0x00a3:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0207
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0207
            float r3 = (float) r4
            float r13 = r13 / r3
            int r13 = (int) r13
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3[r2] = r4
            boolean r4 = r12.f313738z
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r5] = r4
            java.lang.String r4 = "onScroll Down, factor: %s, isFirstScrollDown: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r3)
            if (r13 <= r6) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r6 = r13
        L_0x00c7:
            com.tencent.mm.plugin.mmsight.ui.k r13 = r12.f313725j
            if (r13 == 0) goto L_0x00d3
            boolean r1 = r12.f313738z
            if (r1 == 0) goto L_0x00d0
            r6 = 1
        L_0x00d0:
            r13.mo150389b(r6)
        L_0x00d3:
            r12.f313738z = r2
            r12.f313736x = r0
            goto L_0x0207
        L_0x00d9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "onTouchEvent >> "
            r0.append(r6)
            int r13 = r13.getAction()
            r0.append(r13)
            r13 = 32
            r0.append(r13)
            boolean r13 = r12.f313730r
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            long r6 = java.lang.System.currentTimeMillis()
            r12.f313716E = r6
            java.lang.String r13 = "cancelPreAni"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            android.view.ViewPropertyAnimator r13 = r12.f313732t
            if (r13 == 0) goto L_0x010d
            r13.cancel()
        L_0x010d:
            r12.f313732t = r4
            android.view.ViewPropertyAnimator r13 = r12.f313731s
            if (r13 == 0) goto L_0x0116
            r13.cancel()
        L_0x0116:
            r12.f313731s = r4
            android.view.ViewPropertyAnimator r13 = r12.f313733u
            if (r13 == 0) goto L_0x011f
            r13.cancel()
        L_0x011f:
            r12.f313733u = r4
            boolean r13 = r12.f313730r
            if (r13 == 0) goto L_0x0131
            long r6 = r12.f313716E
            long r8 = r12.f313715D
            long r6 = r6 - r8
            r8 = 1500(0x5dc, double:7.41E-321)
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x0131
            r2 = 1
        L_0x0131:
            if (r2 == 0) goto L_0x013e
            r12.mo150289d()
            com.tencent.mm.plugin.mmsight.ui.j r13 = r12.f313724i
            if (r13 == 0) goto L_0x0146
            r13.mo150387c()
            goto L_0x0146
        L_0x013e:
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$a r13 = new com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$a
            r13.<init>(r12)
            r12.mo150287b(r13)
        L_0x0146:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            a14.z1 r13 = r12.f313728p
            if (r13 == 0) goto L_0x0150
            a14.C53973z1.C53974a.m60623a(r13, r4, r5, r4)
        L_0x0150:
            r12.f313728p = r4
            goto L_0x0207
        L_0x0154:
            boolean r0 = r12.f313730r
            if (r0 == 0) goto L_0x015e
            java.lang.String r13 = "action down but is recording"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return r2
        L_0x015e:
            java.lang.String r0 = "cancelAllAni"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.view.ViewPropertyAnimator r0 = r12.f313732t
            if (r0 == 0) goto L_0x016a
            r0.cancel()
        L_0x016a:
            r12.f313732t = r4
            android.view.ViewPropertyAnimator r0 = r12.f313731s
            if (r0 == 0) goto L_0x0173
            r0.cancel()
        L_0x0173:
            r12.f313731s = r4
            android.view.ViewPropertyAnimator r0 = r12.f313734v
            if (r0 == 0) goto L_0x017c
            r0.cancel()
        L_0x017c:
            r12.f313734v = r4
            android.view.ViewPropertyAnimator r0 = r12.f313733u
            if (r0 == 0) goto L_0x0185
            r0.cancel()
        L_0x0185:
            r12.f313733u = r4
            android.view.ViewPropertyAnimator r0 = r12.f313735w
            if (r0 == 0) goto L_0x018e
            r0.cancel()
        L_0x018e:
            r12.f313735w = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            a14.z1 r0 = r12.f313728p
            if (r0 == 0) goto L_0x019a
            a14.C53973z1.C53974a.m60623a(r0, r4, r5, r4)
        L_0x019a:
            r12.f313728p = r4
            com.tencent.mm.plugin.mmsight.ui.j r0 = r12.f313724i
            if (r0 == 0) goto L_0x01a3
            r0.mo150386b()
        L_0x01a3:
            float r13 = r13.getRawY()
            r12.f313736x = r13
            java.lang.String r13 = "playDownAni"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            android.view.ViewPropertyAnimator r13 = r12.f313731s
            if (r13 == 0) goto L_0x01b5
            r13.cancel()
        L_0x01b5:
            r12.f313731s = r4
            android.view.View r13 = r12.f313719d
            if (r13 == 0) goto L_0x01d3
            android.view.ViewPropertyAnimator r13 = r13.animate()
            if (r13 == 0) goto L_0x01d3
            r0 = 1063675494(0x3f666666, float:0.9)
            r13.scaleX(r0)
            r13.scaleY(r0)
            r2 = 50
            r13.setDuration(r2)
            r13.start()
            goto L_0x01d4
        L_0x01d3:
            r13 = r4
        L_0x01d4:
            r12.f313731s = r13
            boolean r13 = r12.f313717F
            if (r13 == 0) goto L_0x01fd
            boolean r13 = r12.f313718G
            if (r13 == 0) goto L_0x01fd
            java.lang.String r13 = "launchLongPressJob"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            a14.z1 r13 = r12.f313728p
            if (r13 == 0) goto L_0x01ea
            a14.C53973z1.C53974a.m60623a(r13, r4, r5, r4)
        L_0x01ea:
            r12.f313728p = r4
            a14.n0 r6 = r12.f313727o
            r7 = 0
            r8 = 0
            com.tencent.mm.plugin.mmsight.ui.d r9 = new com.tencent.mm.plugin.mmsight.ui.d
            r9.<init>(r12, r4)
            r10 = 3
            r11 = 0
            a14.z1 r13 = a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            r12.f313728p = r13
        L_0x01fd:
            r12.f313738z = r5
            r12.f313737y = r5
            r0 = 0
            r12.f313715D = r0
            r12.f313716E = r0
        L_0x0207:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.ImproveMMSightRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnableCallback(boolean z) {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setEnableCallback, " + z);
        this.f313718G = z;
    }

    public final void setLongPressCallback(C105538j jVar) {
        C87412m.m108594g(jVar, "callback");
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setLongPressCallback");
        this.f313724i = jVar;
    }

    public final void setLongPressScrollCallback(C105539k kVar) {
        C87412m.m108594g(kVar, "callback");
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setLongPressScrollCallback");
        this.f313725j = kVar;
    }

    public final void setSimpleTapCallback(C105591z0 z0Var) {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setSingleTapCallback");
        this.f313726n = z0Var;
    }

    public final void setTouchEnable(boolean z) {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setTouchEnable >> " + z);
        this.f313729q = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveMMSightRecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo150286a();
    }
}
