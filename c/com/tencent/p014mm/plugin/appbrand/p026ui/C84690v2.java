package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.launching.C83291b1;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0;
import com.tencent.p014mm.plugin.appbrand.widget.C84921b;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cr0.C86127t;
import di3.C86312j;
import fy3.C32224a;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import lb0.C88394b;
import lb0.C88431k;
import p1031sb.C90159e;
import p1136n3.C109677a;
import p1136n3.C109678b;
import p170ic.C87690d;
import p225rc.C89923l;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p963fc.C86812g;
import qq0.C89796d;
import rx3.C13598b0;
import wi0.C66117m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.v2 */
public final class C84690v2 extends C1986e4 implements C83291b1, C84565m4, C84567n4 {

    /* renamed from: A */
    public AppBrandCircleProgressView f247055A;

    /* renamed from: B */
    public ViewGroup f247056B;

    /* renamed from: C */
    public TextView f247057C;

    /* renamed from: D */
    public C32224a<C13598b0> f247058D;

    /* renamed from: E */
    public Boolean f247059E;

    /* renamed from: F */
    public ViewStub f247060F;

    /* renamed from: G */
    public ViewStub f247061G;

    /* renamed from: H */
    public C66117m f247062H = C66117m.NORMAL;

    /* renamed from: I */
    public boolean f247063I = true;

    /* renamed from: J */
    public boolean f247064J = false;

    /* renamed from: K */
    public final Set<C32224a<C13598b0>> f247065K = new LinkedHashSet();

    /* renamed from: L */
    public C84698e f247066L;

    /* renamed from: x */
    public AppBrandRuntime f247067x;

    /* renamed from: y */
    public ImageView f247068y;

    /* renamed from: z */
    public TextView f247069z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$a */
    public class C84691a implements Runnable {
        public C84691a() {
        }

        public void run() {
            AppBrandRuntime appBrandRuntime = C84690v2.this.f247067x;
            if (appBrandRuntime == null || appBrandRuntime.mo113028S() == null) {
                C84690v2 v2Var = C84690v2.this;
                v2Var.setActionBar(LayoutInflater.from(v2Var.getContext()).inflate(C0966R.C0971layout.f6391dk, (ViewGroup) null));
                return;
            }
            C84690v2.this.setActionBar((C89796d) C84690v2.this.f247067x.mo113028S().mo116271a(C84690v2.this.getContext(), C89796d.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$b */
    public class C84692b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewParent f247071d;

        public C84692b(ViewParent viewParent) {
            this.f247071d = viewParent;
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, remove splash");
            C84690v2.this.setVisibility(8);
            ((ViewGroup) this.f247071d).removeView(C84690v2.this);
            C84690v2.m104336U(C84690v2.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$c */
    public class C84693c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$c$a */
        public class C84694a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ int f247074d;

            /* renamed from: e */
            public final /* synthetic */ ViewParent f247075e;

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$c$a$a */
            public class C84695a implements Runnable {
                public C84695a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, hide ends && remove splash");
                    C84690v2.this.setVisibility(8);
                    C84694a aVar = C84694a.this;
                    ((ViewGroup) aVar.f247075e).removeView(C84690v2.this);
                    C84690v2.m104336U(C84690v2.this);
                }
            }

            public C84694a(int i, ViewParent viewParent) {
                this.f247074d = i;
                this.f247075e = viewParent;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int argb = Color.argb(intValue, Color.red(this.f247074d), Color.green(this.f247074d), Color.blue(this.f247074d));
                C84690v2.this.f247056B.setBackgroundColor(argb);
                C84690v2 v2Var = C84690v2.this;
                v2Var.mo122168R(argb, !v2Var.mo117410a0(), true);
                if (intValue == 0) {
                    C84690v2.this.post(new C84695a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$c$b */
        public class C84696b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ int f247078d;

            public C84696b(int i) {
                this.f247078d = i;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C84690v2.this.f247069z.setTextColor(Color.argb(Math.round(255.0f * floatValue), Color.red(this.f247078d), Color.green(this.f247078d), Color.blue(this.f247078d)));
                C84690v2.this.f247055A.setAlpha(floatValue);
                C84690v2.this.f247068y.setAlpha(floatValue);
                C84690v2.this.f247061G.setAlpha(floatValue);
                C84690v2 v2Var = C84690v2.this;
                v2Var.mo122168R(v2Var.getBgColor(), !C84690v2.this.mo117410a0(), true);
            }
        }

        public C84693c() {
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide with animation");
            ViewParent parent = C84690v2.this.getParent();
            if (!(parent instanceof ViewGroup)) {
                Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
                return;
            }
            C84690v2.this.f247055A.mo175030e();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, 0});
            ofInt.addUpdateListener(new C84694a(C84690v2.this.getBgColor(), parent));
            ofInt.setStartDelay((long) Math.round(160.0f));
            ofInt.setDuration((long) Math.round(40.0f));
            ofInt.setInterpolator(new C109677a());
            ofInt.start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration((long) Math.round(160.0f));
            ofFloat.addUpdateListener(new C84696b(C84690v2.this.getNameTextColor()));
            ofFloat.setInterpolator(new C109678b());
            ofFloat.start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$d */
    public class C84697d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f247080d;

        public C84697d(int i) {
            this.f247080d = i;
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "onDataTransferState  state=" + this.f247080d);
            if (this.f247080d == 3) {
                C84690v2 v2Var = C84690v2.this;
                if (v2Var.f247057C == null) {
                    ((ViewStub) v2Var.findViewById(C0966R.C0970id.f6099x_)).inflate();
                    C84690v2 v2Var2 = C84690v2.this;
                    v2Var2.f247057C = (TextView) v2Var2.findViewById(C0966R.C0970id.g35);
                }
                C84690v2.this.f247057C.setVisibility(0);
                C84690v2.this.f247057C.setText(C0966R.string.f360106a52);
                C84690v2.this.f247060F.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v2$e */
    public interface C84698e {
    }

    public C84690v2(Context context) {
        super(context);
        mo117409Z();
    }

    /* renamed from: U */
    public static void m104336U(C84690v2 v2Var) {
        v2Var.getClass();
        LinkedList linkedList = new LinkedList(v2Var.f247065K);
        v2Var.f247065K.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C32224a) it.next()).invoke();
        }
    }

    /* access modifiers changed from: private */
    public int getBgColor() {
        int ordinal = this.f247062H.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? getResources().getColor(C0966R.color.f2929c) : Color.parseColor("#191919") : getResources().getColor(C0966R.color.f2975b6) : getResources().getColor(C0966R.color.f2929c);
    }

    /* access modifiers changed from: private */
    public int getNameTextColor() {
        int ordinal = this.f247062H.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? getResources().getColor(C0966R.color.a7f) : Color.parseColor("#CCFFFFFF") : Color.parseColor("#E6000000") : getResources().getColor(C0966R.color.a7f);
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        Object[] objArr = new Object[3];
        AppBrandRuntime appBrandRuntime = this.f247067x;
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f238147j;
        objArr[1] = Boolean.valueOf(this.f247063I);
        objArr[2] = Boolean.valueOf(this.f247064J);
        Log.m105925i("MicroMsg.AppBrandUILoadingSplash", "animateHide appId[%s] mCanShowHideAnimation[%b], mIsHideInvoked[%b]", objArr);
        if (aVar != null) {
            this.f247065K.add(aVar);
        }
        if (!this.f247064J) {
            this.f247064J = true;
            if (!this.f247063I) {
                Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, start hide without animation");
                ViewParent parent = getParent();
                if (!(parent instanceof ViewGroup)) {
                    Log.m105924i("MicroMsg.AppBrandUILoadingSplash", "animateHide, wrong ViewGroup");
                } else {
                    post(new C84692b(parent));
                }
            } else {
                post(new C84693c());
            }
        }
    }

    /* renamed from: F */
    public void mo117194F(C32224a<C13598b0> aVar) {
        this.f247058D = aVar;
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        AppBrandRuntime appBrandRuntime = this.f247067x;
        if (appBrandRuntime != null) {
            appBrandRuntime.mo113024P0(new C84697d(i));
        }
    }

    /* renamed from: S */
    public String mo1898S() {
        AppBrandRuntime appBrandRuntime = this.f247067x;
        String str = appBrandRuntime == null ? "null" : appBrandRuntime.f238147j;
        return "AppBrandUILoadingSplash:" + str;
    }

    /* renamed from: Y */
    public void mo117408Y(AppBrandRuntime appBrandRuntime) {
        Log.m105919d("MicroMsg.AppBrandUILoadingSplash", "attachRuntime %s", appBrandRuntime.mo113036W().f239363e);
        this.f247067x = appBrandRuntime;
        if (appBrandRuntime.mo113026R() != null) {
            Activity R = appBrandRuntime.mo113026R();
            if (getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) getContext()).setBaseContext(R);
                mo122168R(getBgColor(), !mo117410a0(), true);
            }
        }
    }

    /* renamed from: Z */
    public final void mo117409Z() {
        int i = -1;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6392dl, this);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f5939su);
        this.f247068y = imageView;
        imageView.setImageDrawable(C84700v4.m104349a());
        this.f247069z = (TextView) findViewById(C0966R.C0970id.f5944sz);
        AppBrandCircleProgressView appBrandCircleProgressView = (AppBrandCircleProgressView) findViewById(C0966R.C0970id.bd5);
        this.f247055A = appBrandCircleProgressView;
        C68651k2.m80887a(this.f247068y, appBrandCircleProgressView, this.f247069z);
        this.f247055A.setCircleColor(C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_1));
        this.f247055A.setDotWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4107sf));
        this.f247055A.setDotColor(C111105a.m151500b(getContext(), C0966R.color.f2939n));
        this.f247055A.setCircleStrokeWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4106se));
        this.f247055A.setProgressColor(C111105a.m151500b(getContext(), C0966R.color.f2939n));
        this.f247055A.setProgressWidth((float) getResources().getDimensionPixelSize(C0966R.dimen.f4108sg));
        if (MMApplicationContext.isMainProcess()) {
            this.f247055A.setTransitionTimingMs(Integer.MAX_VALUE);
        }
        this.f247056B = (ViewGroup) findViewById(C0966R.C0970id.f5945t0);
        this.f247060F = (ViewStub) findViewById(C0966R.C0970id.ags);
        this.f247061G = (ViewStub) findViewById(C0966R.C0970id.fh_);
        C87690d.m109091b("AppBrandUILoadingSplash setupRightButton", new C84691a());
        this.f247069z.getLayoutParams().height = C84921b.m104660a(getContext());
        C84703w2 w2Var = new C84703w2(this);
        AppBrandOptionButton appBrandOptionButton = (AppBrandOptionButton) this.f247056B.findViewById(C0966R.C0970id.f5447fd);
        this.f247056B.findViewById(C0966R.C0970id.f5443f_).setBackgroundResource(mo117410a0() ? C0966R.C0969drawable.f4439co : C0966R.C0969drawable.f4440cp);
        appBrandOptionButton.mo117731b();
        appBrandOptionButton.setColor(mo117410a0() ? -1 : -16777216);
        AppBrandOptionButton appBrandOptionButton2 = (AppBrandOptionButton) this.f247056B.findViewById(C0966R.C0970id.f5446fc);
        appBrandOptionButton2.mo117731b();
        if (!mo117410a0()) {
            i = -16777216;
        }
        appBrandOptionButton2.setColor(i);
        appBrandOptionButton2.setOnClickListener(w2Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5944sz));
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5447fd));
        arrayList.add(Integer.valueOf(C0966R.C0970id.f5446fc));
        C84701w0.m104353d(arrayList, getView());
    }

    /* renamed from: a0 */
    public final boolean mo117410a0() {
        if (this.f247062H == C66117m.FORCE_LIGHT) {
            return false;
        }
        if (this.f247059E == null) {
            this.f247059E = Boolean.valueOf(C89923l.f258408a.mo117495a());
        }
        return this.f247059E.booleanValue();
    }

    /* renamed from: b0 */
    public final void mo117411b0(Configuration configuration) {
        if (this.f247067x.mo113054f0() instanceof C86127t) {
            Activity w = ((C86127t) this.f247067x.mo113054f0()).mo120548w();
            boolean z = configuration.orientation == 2;
            if ((!z || w == null || Build.VERSION.SDK_INT < 24 || !w.isInMultiWindowMode() || w.getRequestedOrientation() != 1) && w != null) {
                Window window = w.getWindow();
                View decorView = window.getDecorView();
                if (z) {
                    window.addFlags(1024);
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
                    return;
                }
                C84545i3.m104130g(window, false, false);
            }
        }
    }

    public int getProgress() {
        return this.f247055A.getProgress();
    }

    public View getView() {
        return this;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo122168R(getBgColor(), !mo117410a0(), true);
        this.f247055A.mo175031f();
        try {
            mo117411b0(getContext().getResources().getConfiguration());
        } catch (Exception unused) {
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            mo117411b0(configuration);
        } catch (Exception unused) {
        }
    }

    public final boolean post(Runnable runnable) {
        boolean z = false;
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(this)) {
            AppBrandRuntime appBrandRuntime = this.f247067x;
            if (appBrandRuntime != null && (appBrandRuntime instanceof C86812g) && ((C86812g) appBrandRuntime).mo121251g1()) {
                z = true;
            }
            if (z) {
                MMHandlerThread.postToMainThread(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        boolean z = false;
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(this)) {
            AppBrandRuntime appBrandRuntime = this.f247067x;
            if (appBrandRuntime != null && (appBrandRuntime instanceof C86812g) && ((C86812g) appBrandRuntime).mo121251g1()) {
                z = true;
            }
            if (z) {
                MMHandlerThread.postToMainThreadDelayed(runnable, j);
                return true;
            }
        }
        return super.postDelayed(runnable, j);
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(this.f247068y, str, (Drawable) null, C88431k.f255437d);
        this.f247069z.setText(str2);
    }

    /* renamed from: r */
    public void mo1913r(int i) {
        this.f247056B.setBackgroundColor(i);
    }

    public void setActionBar(View view) {
        View findViewById = this.f247056B.findViewById(C0966R.C0970id.f6024v6);
        if (findViewById != null) {
            this.f247056B.removeView(findViewById);
        }
        view.setId(C0966R.C0970id.f6024v6);
        this.f247056B.addView(view, -1, view.getResources().getDimensionPixelSize(C0966R.dimen.f3677b7));
    }

    public void setCanShowHideAnimation(boolean z) {
        this.f247063I = z;
    }

    public void setLabelInjector(C84698e eVar) {
        Class cls = C32735h.class;
        this.f247066L = eVar;
        if (eVar != null) {
            ViewStub viewStub = this.f247061G;
            C84686v0.C84688b bVar = (C84686v0.C84688b) eVar;
            if (!C90159e.m112822a(bVar.f247054a.mo113210l1().f239387r1, 5) || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32738b.wxapp_flagship_store, 0) != 1) {
                if ((bVar.f247054a.mo113210l1().f239388s1 != 0) && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_show_official_flag, 0) == 1) {
                    viewStub.setLayoutResource(C0966R.C0971layout.f6473ft);
                    viewStub.inflate();
                }
            } else {
                viewStub.setLayoutResource(C0966R.C0971layout.f6474t);
                C84704w4.m104354a((ImageView) viewStub.inflate().findViewById(C0966R.C0970id.f15));
            }
            C84698e eVar2 = this.f247066L;
            ViewStub viewStub2 = this.f247060F;
            if (C90159e.m112823b(((C84686v0.C84688b) eVar2).f247054a.mo113210l1().f239386q1, 5) && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) == 1) {
                viewStub2.setLayoutResource(C0966R.C0971layout.f6477fw);
                Log.m105924i("MicroMsg.WxaRelievedBuyIconApply", "applyGrayIcon");
                C84711y4.m104368b((ImageView) viewStub2.inflate().findViewById(C0966R.C0970id.f15), C0966R.raw.app_brand_relieved_buy_loading_logo, AppBrandGlobalSystemConfig.m100099b().f239299W.f239344g, AppBrandGlobalSystemConfig.m100099b().f239299W.f239345h, AppBrandGlobalSystemConfig.m100099b().f239299W.f239346i);
            }
        }
    }

    public void setProgress(int i) {
        this.f247055A.setProgress(i);
    }

    public void setTheme(C66117m mVar) {
        this.f247062H = mVar;
        this.f247056B.setBackgroundColor(getBgColor());
        this.f247069z.setTextColor(getNameTextColor());
    }

    public C84690v2(Context context, AppBrandRuntime appBrandRuntime) {
        super(context);
        this.f247067x = appBrandRuntime;
        mo117409Z();
    }
}
