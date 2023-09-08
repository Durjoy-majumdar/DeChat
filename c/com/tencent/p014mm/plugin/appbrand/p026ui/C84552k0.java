package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br0.C79778e;
import c30.C104289g;
import c30.C79923f;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81891f;
import com.tencent.p014mm.plugin.appbrand.game.preload.p880ui.BootstrapProgressBar;
import com.tencent.p014mm.plugin.appbrand.launching.C83291b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import h81.C32735h;
import java.util.ArrayList;
import ji3.C9457a;
import kg3.C76577a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import qq0.C89796d;
import qq0.C89829z;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.k0 */
final class C84552k0 extends C1986e4 implements C83291b1 {

    /* renamed from: A */
    public ImageView f246720A;

    /* renamed from: B */
    public ImageView f246721B;

    /* renamed from: C */
    public TextView f246722C;

    /* renamed from: D */
    public TextView f246723D;

    /* renamed from: E */
    public LinearLayout f246724E;

    /* renamed from: F */
    public AppBrandCircleProgressView f246725F;

    /* renamed from: G */
    public C89796d f246726G;

    /* renamed from: H */
    public C79778e.C79780b f246727H = C79778e.C79780b.PORTRAIT;

    /* renamed from: I */
    public TextView f246728I;

    /* renamed from: J */
    public boolean f246729J;

    /* renamed from: K */
    public Runnable f246730K = null;

    /* renamed from: L */
    public RelativeLayout f246731L;

    /* renamed from: M */
    public boolean f246732M = false;

    /* renamed from: N */
    public boolean f246733N = false;

    /* renamed from: P */
    public boolean f246734P = false;

    /* renamed from: Q */
    public int f246735Q;

    /* renamed from: R */
    public boolean f246736R = false;

    /* renamed from: S */
    public int f246737S = 30;

    /* renamed from: T */
    public RelativeLayout f246738T;

    /* renamed from: U */
    public ImageView f246739U;

    /* renamed from: V */
    public BootstrapProgressBar f246740V;

    /* renamed from: W */
    public boolean f246741W;

    /* renamed from: p0 */
    public boolean f246742p0;

    /* renamed from: x */
    public AppBrandRuntimeWC f246743x;

    /* renamed from: x0 */
    public Boolean f246744x0;

    /* renamed from: y */
    public ImageView f246745y;

    /* renamed from: y0 */
    public boolean f246746y0 = false;

    /* renamed from: z */
    public ImageView f246747z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$a */
    public class C84553a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f246748d;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$a$a */
        public class C84554a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ ViewParent f246750d;

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$a$a$a */
            public class C84555a implements Runnable {
                public C84555a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, remove splash");
                    C84552k0.this.setVisibility(8);
                    C84554a aVar = C84554a.this;
                    ((ViewGroup) aVar.f246750d).removeView(C84552k0.this);
                    C32224a aVar2 = C84553a.this.f246748d;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            }

            public C84554a(ViewParent viewParent) {
                this.f246750d = viewParent;
            }

            public void onAnimationEnd(Animator animator) {
                C84552k0.this.post(new C84555a());
            }
        }

        public C84553a(C32224a aVar) {
            this.f246748d = aVar;
        }

        public void run() {
            ViewParent parent = C84552k0.this.getParent();
            if (!(parent instanceof ViewGroup)) {
                Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, wrong ViewGroup");
                return;
            }
            C84552k0.this.f246725F.mo175030e();
            ViewPropertyAnimator animate = C84552k0.this.animate();
            animate.setStartDelay((long) (((float) animate.getDuration()) * 0.8f));
            animate.setDuration((long) (((float) animate.getDuration()) * 1.0f));
            animate.setListener(new C84554a(parent));
            animate.alpha(0.0f).start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$b */
    public class C84556b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f246753d;

        public C84556b(int i) {
            this.f246753d = i;
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "onDataTransferState  state=" + this.f246753d);
            if (this.f246753d == 3) {
                C84552k0 k0Var = C84552k0.this;
                if (k0Var.f246729J) {
                    k0Var.f246728I.setVisibility(0);
                    C84552k0.this.f246728I.setText(C0966R.string.f360106a52);
                    return;
                }
                k0Var.f246730K = this;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$c */
    public class C84557c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public float f246755d = 50.0f;

        public C84557c(C1983e0 e0Var) {
        }

        public boolean onTimerExpired() {
            float f = this.f246755d;
            if (f >= 100.0f) {
                return false;
            }
            this.f246755d = f + 0.33f;
            if (C84552k0.this.f246738T.getVisibility() != 0) {
                return true;
            }
            C84552k0.this.f246740V.setProgress(this.f246755d);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.k0$d */
    public class C84558d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public int f246757d = 50;

        public C84558d(C1983e0 e0Var) {
        }

        public boolean onTimerExpired() {
            int i = this.f246757d;
            if (i >= 100) {
                return false;
            }
            int i2 = i + 1;
            this.f246757d = i2;
            C84552k0.this.f246725F.setProgress(i2);
            if (this.f246757d == 100) {
                C84552k0 k0Var = C84552k0.this;
                k0Var.f246729J = true;
                Runnable runnable = k0Var.f246730K;
                if (runnable != null) {
                    runnable.run();
                    C84552k0.this.f246730K = null;
                }
            }
            return true;
        }
    }

    public C84552k0(Context context, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(context);
        this.f246743x = appBrandRuntimeWC;
        Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        int i = -1;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6475fu, this);
        this.f246738T = (RelativeLayout) findViewById(C0966R.C0970id.f5888rg);
        this.f246739U = (ImageView) findViewById(C0966R.C0970id.f5889rh);
        this.f246740V = (BootstrapProgressBar) findViewById(C0966R.C0970id.f5890ri);
        C81891f.m100578a().mo114291b(999, 1);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_splashscreen, false) && this.f246743x != null) {
            long currentTicks = Util.currentTicks();
            AppBrandInitConfigWC M1 = this.f246743x.mo113210l1();
            WxaAttributes.WxaVersionCoverImageInfo wxaVersionCoverImageInfo = M1.f234804H.f239457i;
            String str = wxaVersionCoverImageInfo == null ? null : wxaVersionCoverImageInfo.f239446d;
            if (!Util.isNullOrNil(str)) {
                this.f246732M = true;
                Log.m105925i("MicroMsg.AppBrandGameUILoadingSplash", "loadingImgUrl:%s", str);
                C81891f.m100578a().mo114291b(1000, 1);
                C9457a.m9137a(new C84533h0(this, str, new C84529g0(this, currentTicks)));
                WxaAttributes.WxaVersionCoverImageInfo wxaVersionCoverImageInfo2 = M1.f234804H.f239457i;
                String str2 = wxaVersionCoverImageInfo2 == null ? null : wxaVersionCoverImageInfo2.f239447e;
                if (!Util.isNullOrNil(str2)) {
                    int parseColor = Color.parseColor(str2);
                    this.f246735Q = parseColor;
                    this.f246740V.setProgressColor(parseColor);
                    Log.m105925i("MicroMsg.AppBrandGameUILoadingSplash", "loadingProgressBarColor:%s", Integer.valueOf(this.f246735Q));
                } else {
                    int color = getContext().getResources().getColor(C0966R.color.f3058do);
                    this.f246735Q = color;
                    this.f246740V.setProgressColor(color);
                }
                this.f246740V.setAnimated(true);
                this.f246740V.setStriped(true);
                MMHandlerThread.postToMainThreadDelayed(new C84542i0(this), 1000);
                MMHandlerThread.postToMainThreadDelayed(new C84548j0(this), 2000);
            } else {
                C81891f.m100578a().mo114291b(1000, 0);
            }
        }
        this.f246731L = (RelativeLayout) findViewById(C0966R.C0970id.f5901rt);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f5895rn);
        this.f246745y = imageView;
        imageView.setImageDrawable(C88393a.m110230a());
        this.f246722C = (TextView) findViewById(C0966R.C0970id.f5899rr);
        this.f246747z = (ImageView) findViewById(C0966R.C0970id.f5903rv);
        this.f246720A = (ImageView) findViewById(C0966R.C0970id.f5900rs);
        this.f246724E = (LinearLayout) findViewById(C0966R.C0970id.f5892rk);
        this.f246728I = (TextView) findViewById(C0966R.C0970id.g35);
        AppBrandCircleProgressView appBrandCircleProgressView = (AppBrandCircleProgressView) findViewById(C0966R.C0970id.f5898rq);
        this.f246725F = appBrandCircleProgressView;
        appBrandCircleProgressView.setCircleColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
        this.f246725F.setDotWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4107sf));
        this.f246725F.setDotColor(getResources().getColor(C0966R.color.f2939n));
        this.f246725F.setCircleStrokeWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4106se));
        this.f246725F.setProgressColor(getResources().getColor(C0966R.color.f2939n));
        this.f246725F.setProgressWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4108sg));
        if (MMApplicationContext.isMainProcess()) {
            this.f246725F.setTransitionTimingMs(Integer.MAX_VALUE);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f246720A.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f246747z.getLayoutParams();
        this.f246726G = (C89796d) this.f246743x.mo113028S().mo116271a(getContext(), C89796d.class);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 21;
        C89829z.m112323b(this.f246726G);
        this.f246724E.addView(this.f246726G, layoutParams3);
        C89829z.m112322a(this.f246724E);
        if (this.f246743x.mo113210l1().f239368j == 1) {
            this.f246720A.setVisibility(0);
        } else {
            this.f246720A.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f246740V.getLayoutParams();
        C79778e.C79780b a = this.f246743x.mo113054f0().getOrientationHandler().mo109917a();
        this.f246727H = a;
        Log.m105925i("MicroMsg.AppBrandGameUILoadingSplash", "mLastDeviceOrientation :%s", a);
        C79778e.C79780b bVar = this.f246727H;
        if (bVar == C79778e.C79780b.LANDSCAPE_SENSOR || bVar == C79778e.C79780b.LANDSCAPE_LOCKED || bVar == C79778e.C79780b.LANDSCAPE_LEFT || bVar == C79778e.C79780b.LANDSCAPE_RIGHT) {
            if (this.f246720A.getVisibility() == 0) {
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4095ra);
                layoutParams.topMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4099rh);
                this.f246720A.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
            }
            layoutParams4.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4087r3);
            layoutParams4.width = C76577a.m92155f(getContext(), C0966R.dimen.f4088r4);
        } else {
            if (this.f246720A.getVisibility() == 0) {
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
                layoutParams.topMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4101rj);
                this.f246720A.setLayoutParams(layoutParams);
            } else {
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
            }
            layoutParams4.width = C76577a.m92155f(getContext(), C0966R.dimen.f4090r6);
            layoutParams4.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4089r5);
        }
        this.f246740V.setLayoutParams(layoutParams4);
        this.f246747z.setLayoutParams(layoutParams2);
        mo122168R(getResources().getColor(C0966R.color.f2929c), true, true);
        this.f246726G.setBackgroundColor(0);
        C89796d dVar = this.f246726G;
        if (this.f246744x0 == null) {
            this.f246744x0 = Boolean.valueOf(C85875k4.m106211z());
        }
        dVar.setStyleColor(!this.f246744x0.booleanValue() ? -16777216 : i);
        this.f246726G.setHomeButtonOnClickListener(new C84562l0(this));
        C84545i3.m104129f(getContext(), true);
        if (!this.f246732M) {
            this.f246725F.mo175031f();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5899rr));
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5447fd));
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5446fc));
        C84701w0.m104353d(arrayList, this);
        this.f246723D = (TextView) findViewById(C0966R.C0970id.f5894rm);
        this.f246723D.setTextSize(0, C76577a.m92156g(getContext()) * 11.0f);
        C68651k2.m80887a(this.f246745y, this.f246725F, this.f246722C);
        ViewGroup.LayoutParams layoutParams5 = this.f246720A.getLayoutParams();
        layoutParams5.width = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f4102rk);
        layoutParams5.height = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f4100ri);
        ImageView imageView2 = this.f246720A;
        imageView2.setLayoutParams(imageView2.getLayoutParams());
        this.f246721B = (ImageView) findViewById(C0966R.C0970id.f5893rl);
        if (this.f246743x.mo113210l1().f239370o > 0) {
            try {
                Log.m105925i("MicroMsg.AppBrandGameUILoadingSplash", "setAgeAppropriateImageView ageAppropriateLevel:%d,ageAppropriateIcon:%s", Integer.valueOf(this.f246743x.mo113210l1().f239370o), AppBrandGlobalSystemConfig.m100099b().f239298V);
                String str3 = (String) new C104289g(AppBrandGlobalSystemConfig.m100099b().f239298V).get(String.valueOf(this.f246743x.mo113210l1().f239370o));
                if (str3 != null) {
                    this.f246723D.setGravity(19);
                    this.f246721B.setVisibility(0);
                    this.f246721B.setOnClickListener(new C1983e0(this, "https://game.weixin.qq.com/cgi-bin/minigame/static/age-tips/index.html?appid=" + this.f246743x.f238147j + "&age=" + this.f246743x.mo113210l1().f239370o + "#wechat_redirect"));
                    String str4 = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122786b(this.f246721B, str3, (Drawable) null, new C84526f0(this));
                    return;
                }
            } catch (C79923f e) {
                Log.printErrStackTrace("MicroMsg.AppBrandGameUILoadingSplash", e, "JSONException: setAgeAppropriateImageView ageAppropriateIcon age error", new Object[0]);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrandGameUILoadingSplash", e2, "Exception: setAgeAppropriateImageView ageAppropriateIcon age error", new Object[0]);
            }
            this.f246721B.setVisibility(8);
            this.f246723D.setGravity(17);
            return;
        }
        this.f246721B.setVisibility(8);
        this.f246723D.setGravity(17);
    }

    /* renamed from: U */
    public static void m104137U(C84552k0 k0Var) {
        if (k0Var.f246734P && k0Var.f246733N) {
            Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "showCutomView");
            k0Var.f246738T.setVisibility(0);
            k0Var.f246731L.setVisibility(4);
            k0Var.f246740V.bringToFront();
            k0Var.f246724E.bringToFront();
        }
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        this.f246746y0 = true;
        Log.m105928w("MicroMsg.AppBrandGameUILoadingSplash", "animateHide");
        post(new C84553a(aVar));
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        MMHandlerThread.postToMainThread(new C84556b(i));
    }

    /* renamed from: S */
    public String mo1898S() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f246743x;
        String str = appBrandRuntimeWC == null ? "null" : appBrandRuntimeWC.f238147j;
        return "AppBrandGameUILoadingSplash:" + str;
    }

    public View getView() {
        return this;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C79778e.C79780b a = this.f246743x.mo113054f0().getOrientationHandler().mo109917a();
        if (a != this.f246727H) {
            this.f246727H = a;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f246720A.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f246740V.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f246747z.getLayoutParams();
            if (a == C79778e.C79780b.LANDSCAPE_SENSOR || a == C79778e.C79780b.LANDSCAPE_LOCKED || a == C79778e.C79780b.LANDSCAPE_LEFT || a == C79778e.C79780b.LANDSCAPE_RIGHT) {
                if (this.f246720A.getVisibility() == 0) {
                    layoutParams3.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4095ra);
                    layoutParams.topMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4099rh);
                    this.f246720A.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
                }
                layoutParams2.width = C76577a.m92155f(getContext(), C0966R.dimen.f4088r4);
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4087r3);
            } else {
                if (this.f246720A.getVisibility() == 0) {
                    layoutParams3.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
                    layoutParams.topMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4101rj);
                    this.f246720A.setLayoutParams(layoutParams);
                } else {
                    layoutParams3.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4096rb);
                }
                layoutParams2.width = C76577a.m92155f(getContext(), C0966R.dimen.f4090r6);
                layoutParams2.bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4089r5);
            }
            this.f246740V.setLayoutParams(layoutParams2);
            this.f246747z.setLayoutParams(layoutParams3);
            requestLayout();
        }
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(this.f246745y, str, (Drawable) null, C88431k.f255437d);
        this.f246722C.setText(str2);
    }

    /* renamed from: r */
    public void mo1913r(int i) {
    }

    public void setProgress(int i) {
        if (!this.f246732M) {
            if (i < 100) {
                this.f246725F.setProgress(i / 2);
            } else if (!this.f246741W) {
                this.f246741W = true;
                new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C84558d((C1983e0) null), true).startTimer(0, 50);
            }
        } else if (this.f246733N || !this.f246736R) {
            if (i < 100) {
                if (this.f246738T.getVisibility() == 0) {
                    this.f246740V.setProgress(((float) i) / 2.0f);
                }
            } else if (!this.f246742p0) {
                this.f246742p0 = true;
                new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C84557c((C1983e0) null), true).startTimer(0, (long) (1000 / this.f246737S));
            }
        } else if (i < 100) {
            this.f246725F.setProgress(i / 2);
        } else if (!this.f246741W) {
            this.f246741W = true;
            new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C84558d((C1983e0) null), true).startTimer(0, 100);
        }
    }
}
