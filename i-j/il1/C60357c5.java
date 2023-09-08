package il1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.file.XVFSFile;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import wg1.C66110y2;
import y50.C15936n0;

/* renamed from: il1.c5 */
public final class C60357c5 {

    /* renamed from: a */
    public final ViewGroup f172070a;

    /* renamed from: b */
    public final String f172071b = "FinderLiveLoadingTipWidget";

    /* renamed from: c */
    public ValueAnimator f172072c;

    /* renamed from: d */
    public final ImageView f172073d;

    /* renamed from: e */
    public final View f172074e;

    /* renamed from: f */
    public final TextView f172075f;

    /* renamed from: g */
    public final TextView f172076g;

    /* renamed from: h */
    public TextView f172077h;

    /* renamed from: i */
    public final TextView f172078i;

    /* renamed from: j */
    public final TextView f172079j;

    /* renamed from: k */
    public TextView f172080k;

    /* renamed from: l */
    public int f172081l;

    /* renamed from: m */
    public C45795b f172082m;

    /* renamed from: n */
    public final ViewGroup f172083n;

    /* renamed from: o */
    public final Runnable f172084o;

    /* renamed from: p */
    public MTimerHandler f172085p;

    /* renamed from: il1.c5$a */
    public static final class C60358a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60357c5 f172086d;

        public C60358a(C60357c5 c5Var) {
            this.f172086d = c5Var;
        }

        public final void run() {
            View view = this.f172086d.f172074e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: il1.c5$b */
    public static final class C60359b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60357c5 f172087d;

        /* renamed from: e */
        public final /* synthetic */ String f172088e;

        /* renamed from: f */
        public final /* synthetic */ String f172089f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60359b(C60357c5 c5Var, String str, String str2) {
            super(1);
            this.f172087d = c5Var;
            this.f172088e = str;
            this.f172089f = str2;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            String str = this.f172087d.f172071b;
            Log.m105924i(str, "showBlurBg username:" + this.f172088e + ",thumbUrl:" + this.f172089f + " blurBgView.elevation:" + this.f172087d.f172073d.getElevation());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.c5$c */
    public static final class C60360c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C60357c5 f172090d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f172091e;

        /* renamed from: il1.c5$c$a */
        public static final class C60361a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60357c5 f172092d;

            /* renamed from: e */
            public final /* synthetic */ C45795b f172093e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60361a(C60357c5 c5Var, C45795b bVar) {
                super(0);
                this.f172092d = c5Var;
                this.f172093e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x009c, code lost:
                if ((r0.length() > 0) == true) goto L_0x00a0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r6 = this;
                    java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                    il1.c5 r1 = r6.f172092d
                    int r2 = r1.f172081l
                    r3 = 1
                    int r2 = r2 + r3
                    r1.f172081l = r2
                    fj1.b r1 = r6.f172093e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    cl1.o r1 = (cl1.C54991o) r1
                    int r1 = r1.f154284Y2
                    il1.c5 r2 = r6.f172092d
                    int r2 = r2.f172081l
                    int r1 = r1 - r2
                    r2 = 5
                    if (r1 <= r2) goto L_0x0064
                    fj1.b r1 = r6.f172093e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    cl1.o r1 = (cl1.C54991o) r1
                    int r1 = r1.f154284Y2
                    if (r1 <= 0) goto L_0x0064
                    il1.c5 r1 = r6.f172092d
                    java.lang.String r1 = r1.f172071b
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "onTimerUpdate adjustPauseTime:"
                    r2.append(r4)
                    il1.c5 r4 = r6.f172092d
                    int r4 = r4.f172081l
                    r2.append(r4)
                    java.lang.String r4 = ", liveData.anchorPauseTime:"
                    r2.append(r4)
                    fj1.b r4 = r6.f172093e
                    androidx.lifecycle.i0 r4 = r4.mo71262a(r0)
                    cl1.o r4 = (cl1.C54991o) r4
                    int r4 = r4.f154284Y2
                    r2.append(r4)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                    il1.c5 r1 = r6.f172092d
                    fj1.b r2 = r6.f172093e
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
                    cl1.o r2 = (cl1.C54991o) r2
                    int r2 = r2.f154284Y2
                    r1.f172081l = r2
                L_0x0064:
                    il1.c5 r1 = r6.f172092d
                    android.widget.TextView r2 = r1.f172077h
                    if (r2 != 0) goto L_0x006b
                    goto L_0x0078
                L_0x006b:
                    y50.n0$a r4 = y50.C15936n0.f42815a
                    int r1 = r1.f172081l
                    java.lang.String r5 = ":"
                    java.lang.String r1 = r4.mo14587b(r1, r5)
                    r2.setText(r1)
                L_0x0078:
                    fj1.b r1 = r6.f172093e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    cl1.o r1 = (cl1.C54991o) r1
                    il1.c5 r2 = r6.f172092d
                    int r2 = r2.f172081l
                    r1.f154284Y2 = r2
                    fj1.b r1 = r6.f172093e
                    androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
                    cl1.o r0 = (cl1.C54991o) r0
                    java.lang.String r0 = r0.f154297b3
                    r1 = 0
                    if (r0 == 0) goto L_0x009f
                    int r2 = r0.length()
                    if (r2 <= 0) goto L_0x009b
                    r2 = 1
                    goto L_0x009c
                L_0x009b:
                    r2 = 0
                L_0x009c:
                    if (r2 != r3) goto L_0x009f
                    goto L_0x00a0
                L_0x009f:
                    r3 = 0
                L_0x00a0:
                    if (r3 == 0) goto L_0x00b7
                    il1.c5 r1 = r6.f172092d
                    android.widget.TextView r1 = r1.f172076g
                    java.lang.CharSequence r1 = r1.getText()
                    boolean r1 = android.text.TextUtils.equals(r0, r1)
                    if (r1 != 0) goto L_0x00b7
                    il1.c5 r1 = r6.f172092d
                    android.widget.TextView r1 = r1.f172076g
                    r1.setText(r0)
                L_0x00b7:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: il1.C60357c5.C60360c.C60361a.invoke():java.lang.Object");
            }
        }

        public C60360c(C60357c5 c5Var, C45795b bVar) {
            this.f172090d = c5Var;
            this.f172091e = bVar;
        }

        public final boolean onTimerExpired() {
            C61926c.m72668M(new C60361a(this.f172090d, this.f172091e));
            return true;
        }
    }

    public C60357c5(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "root");
        this.f172070a = viewGroup;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fv6);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_loading_blur)");
        this.f172073d = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fv5);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_loading_bar)");
        this.f172074e = findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.fv7);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_loading_tips)");
        this.f172075f = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.dp5);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…er_live_layer_show_title)");
        TextView textView = (TextView) findViewById4;
        this.f172076g = textView;
        this.f172077h = (TextView) viewGroup.findViewById(C0966R.C0970id.kkn);
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.f358169dp3);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…der_live_layer_show_desc)");
        this.f172078i = (TextView) findViewById5;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.f358167dp1);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…ayer_show_btn_count_down)");
        this.f172079j = (TextView) findViewById6;
        this.f172080k = (TextView) viewGroup.findViewById(C0966R.C0970id.f358166dp0);
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.dqm);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…live_loading_tip_ui_root)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById7;
        this.f172083n = viewGroup2;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        TextView textView2 = this.f172077h;
        C85875k4.m106189j0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        this.f172084o = new C60358a(this);
        viewGroup2.setClickable(false);
        viewGroup2.setElevation((float) (C62042e.f176370a.mo87027N0() ? viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ada) : viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8)));
    }

    /* renamed from: d */
    public static void m70622d(C60357c5 c5Var, boolean z, int i, Object obj) {
        int i2;
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = false;
        }
        Log.m105924i(c5Var.f172071b, "hideTimeCount");
        TextView textView = c5Var.f172077h;
        if (textView != null && textView.getVisibility() == 0) {
            if (z) {
                TextView textView2 = c5Var.f172077h;
                if (textView2 == null || textView2.getVisibility() != 0) {
                    z2 = false;
                }
                if (z2 && (i2 = c5Var.f172081l) > 0) {
                    C66110y2.m77912b(C66110y2.f190024a, 2, i2, 0, false, 12, (Object) null);
                }
            }
            TextView textView3 = c5Var.f172077h;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            MTimerHandler mTimerHandler = c5Var.f172085p;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85321a() {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r4.f172083n
            int r0 = r0.getWidth()
            if (r0 != 0) goto L_0x0066
            android.view.ViewGroup r0 = r4.f172083n
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = r4.f172071b
            java.lang.String r1 = "checkIfNeedAddToDecorView: width and height = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.ViewGroup r0 = r4.f172070a
            android.content.Context r0 = r0.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L_0x0025
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            if (r0 == 0) goto L_0x0033
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0033
            android.view.View r0 = r0.getDecorView()
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            boolean r1 = r0 instanceof android.widget.FrameLayout
            if (r1 == 0) goto L_0x003b
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            android.view.ViewGroup r1 = r4.f172083n
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x004c
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x004c:
            if (r2 != 0) goto L_0x004f
            return
        L_0x004f:
            boolean r1 = gy3.C87412m.m108589b(r2, r0)
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = r4.f172071b
            java.lang.String r3 = "checkIfNeedAddToDecorView: add to decor view"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            android.view.ViewGroup r1 = r4.f172083n
            r2.removeView(r1)
            android.view.ViewGroup r1 = r4.f172083n
            r0.addView(r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60357c5.mo85321a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r0 = (r0 = ((cl1.C54991o) r2.mo71262a(r0)).f154341n).liveInfo;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85322b(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            fj1.b r1 = r9.f172082m
            if (r1 == 0) goto L_0x0012
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.mo75969L3()
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.lang.String r1 = ""
        L_0x0014:
            fj1.b r2 = r9.f172082m
            r3 = 0
            r8 = 1
            if (r2 == 0) goto L_0x002e
            androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x002e
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x002e
            int r0 = r0.f182410x
            if (r0 != r8) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0033
            if (r11 == 0) goto L_0x0089
        L_0x0033:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x003a
            r3 = 1
        L_0x003a:
            if (r3 != 0) goto L_0x0089
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r2 = r0
            ht1.t1 r2 = (ht1.C60200t1) r2
            android.widget.ImageView r4 = r9.f172073d
            r5 = 0
            r6 = 4
            r7 = 0
            r3 = r1
            ht1.C60200t1.C60201a.m70370h(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r9.f172071b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "showThumbUrlBg withoutBlur:"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = " username:"
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = ", url:"
            r2.append(r10)
            r2.append(r1)
            java.lang.String r10 = ",  blurBgView.elevation:"
            r2.append(r10)
            android.widget.ImageView r10 = r9.f172073d
            float r10 = r10.getElevation()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            goto L_0x0096
        L_0x0089:
            nk1.b r11 = nk1.C11193b.f33003a
            android.widget.ImageView r0 = r9.f172073d
            il1.c5$b r2 = new il1.c5$b
            r2.<init>(r9, r10, r1)
            boolean r8 = r11.mo11281b(r10, r1, r0, r2)
        L_0x0096:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60357c5.mo85322b(java.lang.String, boolean):boolean");
    }

    /* renamed from: c */
    public final void mo85323c() {
        View view = this.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "hideProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "hideProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172075f.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo85324e(String str, String str2) {
        ValueAnimator valueAnimator;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "tip");
        ValueAnimator valueAnimator2 = this.f172072c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = this.f172072c) != null) {
            valueAnimator.end();
        }
        this.f172083n.setVisibility(0);
        mo85322b(str, true);
        this.f172073d.setElevation((float) this.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        if (Build.VERSION.SDK_INT >= 23) {
            this.f172073d.setForeground(this.f172070a.getContext().getResources().getDrawable(C0966R.color.UN_BW_0_Alpha_0_3));
        }
        View view = this.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showBlurBgWithTimeCount", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showBlurBgWithTimeCount", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172075f.setVisibility(8);
        this.f172076g.setVisibility(0);
        this.f172078i.setVisibility(8);
        this.f172079j.setVisibility(8);
        TextView textView = this.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f172076g.setText(str2);
        mo85325f();
        this.f172070a.requestLayout();
        if (C62042e.f176370a.mo87027N0()) {
            mo85321a();
        }
    }

    /* renamed from: f */
    public final void mo85325f() {
        MTimerHandler mTimerHandler;
        Class cls = C54991o.class;
        C45795b bVar = this.f172082m;
        if (bVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = ((C54991o) bVar.mo71262a(cls)).f154279X2;
            boolean z = true;
            this.f172081l = (1 > j ? 1 : (1 == j ? 0 : -1)) <= 0 && (j > elapsedRealtime ? 1 : (j == elapsedRealtime ? 0 : -1)) < 0 ? (int) ((elapsedRealtime - ((C54991o) bVar.mo71262a(cls)).f154279X2) / ((long) 1000)) : ((C54991o) bVar.mo71262a(cls)).f154284Y2;
            String str = this.f172071b;
            Log.m105924i(str, "startPauseTime: curTime:" + elapsedRealtime + ", anchorPauseStartTime:" + ((C54991o) bVar.mo71262a(cls)).f154279X2 + ", anchorPauseTimeCount:" + ((C54991o) bVar.mo71262a(cls)).f154284Y2 + ", pauseTime:" + this.f172081l);
            if (this.f172081l < 0) {
                m70622d(this, false, 1, (Object) null);
                return;
            }
            TextView textView = this.f172077h;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f172077h;
            if (textView2 != null) {
                textView2.setText(C15936n0.f42815a.mo14587b(this.f172081l, XVFSFile.PATH_SEPARATOR));
            }
            if (this.f172085p == null) {
                this.f172085p = new MTimerHandler("LiveVisitorPause::Timer", (MTimerHandler.CallBack) new C60360c(this, bVar), true);
            }
            MTimerHandler mTimerHandler2 = this.f172085p;
            if (mTimerHandler2 == null || !mTimerHandler2.stopped()) {
                z = false;
            }
            if (z && (mTimerHandler = this.f172085p) != null) {
                mTimerHandler.startTimer(1000);
            }
        }
    }
}
