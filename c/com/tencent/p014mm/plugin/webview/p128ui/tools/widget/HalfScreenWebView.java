package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HalfScreenWebViewCloseEvent;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C45520t;
import e00.C45528u;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76875f0;
import nl3.C47276a;
import nl3.C47282e;
import p225rc.C12969d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView */
public final class HalfScreenWebView extends C47276a implements C44365w, MMActivity.C44688e, C6606x {

    /* renamed from: L */
    public static final /* synthetic */ int f119779L = 0;

    /* renamed from: A */
    public View f119780A;

    /* renamed from: B */
    public WeImageView f119781B;

    /* renamed from: C */
    public View f119782C;

    /* renamed from: D */
    public PullDownWebViewLayout f119783D;

    /* renamed from: E */
    public WeImageView f119784E;

    /* renamed from: F */
    public final C13601g f119785F;

    /* renamed from: G */
    public final float f119786G;

    /* renamed from: H */
    public boolean f119787H;

    /* renamed from: I */
    public Integer f119788I;

    /* renamed from: J */
    public C44247d0 f119789J;

    /* renamed from: K */
    public final IListener<?> f119790K;

    /* renamed from: s */
    public final Context f119791s;

    /* renamed from: t */
    public final C44361u f119792t;

    /* renamed from: u */
    public final String f119793u;

    /* renamed from: v */
    public View f119794v;

    /* renamed from: w */
    public View f119795w;

    /* renamed from: x */
    public WeImageView f119796x;

    /* renamed from: y */
    public TextView f119797y;

    /* renamed from: z */
    public LinearLayout f119798z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$a */
    public static final class C44212a extends C87413o implements C32224a<C47282e> {

        /* renamed from: d */
        public final /* synthetic */ HalfScreenWebView f119799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44212a(HalfScreenWebView halfScreenWebView) {
            super(0);
            this.f119799d = halfScreenWebView;
        }

        public Object invoke() {
            return new C47282e(new WeakReference(this.f119799d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$b */
    public static final class C44213b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public int f119800d;

        /* renamed from: e */
        public final /* synthetic */ HalfScreenWebView f119801e;

        /* renamed from: f */
        public final /* synthetic */ Configuration f119802f;

        public C44213b(HalfScreenWebView halfScreenWebView, Configuration configuration) {
            this.f119801e = halfScreenWebView;
            this.f119802f = configuration;
        }

        public void onGlobalLayout() {
            View view;
            ViewTreeObserver viewTreeObserver;
            ViewGroup.LayoutParams layoutParams;
            Log.m105918d("MicroMsg.HalfScreenWebView", "onConfigurationChanged counter = " + this.f119800d);
            HalfScreenWebView halfScreenWebView = this.f119801e;
            Configuration configuration = this.f119802f;
            View view2 = halfScreenWebView.f126904h;
            if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null)) {
                layoutParams.height = halfScreenWebView.mo23875F();
                View view3 = halfScreenWebView.f126904h;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams);
                }
            }
            View view4 = halfScreenWebView.f126903g;
            if (view4 != null) {
                view4.post(new C44351o(halfScreenWebView, configuration));
            }
            halfScreenWebView.mo72306E();
            int i = this.f119800d + 1;
            this.f119800d = i;
            if (i >= 2 && (view = this.f119801e.f126903g) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$c */
    public static final class C44214c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HalfScreenWebView f119803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44214c(HalfScreenWebView halfScreenWebView) {
            super(0);
            this.f119803d = halfScreenWebView;
        }

        public Object invoke() {
            this.f119803d.cancel();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfScreenWebView(Context context, String str, MMWebView mMWebView, C44361u uVar) {
        super(context);
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(uVar, "option");
        this.f119791s = context;
        this.f119792t = uVar;
        this.f119793u = str;
        this.f119785F = C36568h.m40985a(new C44212a(this));
        this.f119786G = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
        this.f119789J = ((C45528u) C86312j.m106911c(C45528u.class)).mo70751qI((Activity) context, str, mMWebView, new C44305j(uVar.f120216a, uVar.f120217b, uVar.f120218c, uVar.f120225j, uVar.f120226k, this, this));
        this.f119790K = new HalfScreenWebView$halfScreenWebViewCloseEventListener$1(this, C40008f.f107254d);
    }

    /* renamed from: F */
    public int mo23875F() {
        return (int) (((float) C74783i3.m89537a(getContext()).f24705b) * (((float) 1) - this.f119792t.f120216a));
    }

    /* renamed from: G */
    public View mo6265G() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.chz, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…reen_dialog_layout, null)");
        return inflate;
    }

    /* renamed from: H */
    public void mo6266H() {
        int i;
        int i2;
        TextView textView;
        LinearLayout linearLayout;
        float f;
        float f2;
        WindowManager.LayoutParams attributes;
        View decorView;
        Log.m105924i("MicroMsg.HalfScreenWebView", "initContentView url= " + this.f119793u + " heightPercent=" + this.f119792t.f120216a + " reuse=" + this.f119792t.f120218c + " immersiveUIStyle=" + this.f119792t.f120221f);
        mo143460C(1);
        super.mo6266H();
        setCanceledOnTouchOutside(true);
        if (this.f119792t.f120223h) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.3f);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(Integer.MIN_VALUE);
            }
        } else {
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setDimAmount(0.0f);
            }
        }
        if (1 == this.f119792t.f120222g) {
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setWindowAnimations(C0966R.style.f8722sr);
            }
        } else {
            Window window5 = getWindow();
            if (window5 != null) {
                window5.setWindowAnimations(C0966R.style.f8365fv);
            }
        }
        Window window6 = getWindow();
        if (!(window6 == null || (decorView = window6.getDecorView()) == null)) {
            decorView.setMinimumWidth(C74783i3.m89537a(decorView.getContext()).f24704a);
            decorView.setPadding(0, 0, 0, 0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window7 = getWindow();
            WindowManager.LayoutParams attributes2 = window7 != null ? window7.getAttributes() : null;
            if (attributes2 != null) {
                attributes2.layoutInDisplayCutoutMode = 1;
            }
            Window window8 = getWindow();
            if (window8 != null) {
                window8.setAttributes(attributes2);
            }
            Window window9 = getWindow();
            View decorView2 = window9 != null ? window9.getDecorView() : null;
            if (decorView2 != null) {
                decorView2.setSystemUiVisibility(1280);
            }
        }
        Window window10 = getWindow();
        if (!(window10 == null || (attributes = window10.getAttributes()) == null)) {
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
        }
        Context context = this.f119791s;
        boolean z = context instanceof MMActivity;
        if (z) {
            if (this.f119792t.f120230o) {
                MMActivity mMActivity = z ? (MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.setRequestedOrientation(1);
                }
            } else {
                MMActivity mMActivity2 = z ? (MMActivity) context : null;
                if (mMActivity2 != null) {
                    mMActivity2.addOnConfigurationChangedListener(this);
                }
            }
        }
        View view = this.f126906j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view3 = this.f126905i;
        this.f119795w = view3 != null ? view3.findViewById(C0966R.C0970id.lmb) : null;
        View view4 = this.f126905i;
        this.f119794v = view4 != null ? view4.findViewById(C0966R.C0970id.lmd) : null;
        View view5 = this.f126905i;
        this.f119780A = view5 != null ? view5.findViewById(C0966R.C0970id.lm_) : null;
        View view6 = this.f126905i;
        this.f119781B = view6 != null ? (WeImageView) view6.findViewById(C0966R.C0970id.lma) : null;
        View view7 = this.f126905i;
        this.f119782C = view7 != null ? view7.findViewById(C0966R.C0970id.lmg) : null;
        View view8 = this.f126905i;
        this.f119783D = view8 != null ? (PullDownWebViewLayout) view8.findViewById(C0966R.C0970id.lmh) : null;
        View view9 = this.f126905i;
        this.f119784E = view9 != null ? (WeImageView) view9.findViewById(C0966R.C0970id.lmc) : null;
        View view10 = this.f126905i;
        this.f119796x = view10 != null ? (WeImageView) view10.findViewById(C0966R.C0970id.nr7) : null;
        View view11 = this.f126905i;
        this.f119797y = view11 != null ? (TextView) view11.findViewById(C0966R.C0970id.kpm) : null;
        View view12 = this.f126905i;
        this.f119798z = view12 != null ? (LinearLayout) view12.findViewById(C0966R.C0970id.koz) : null;
        this.f119789J.mo68952m();
        if (this.f119792t.f120221f) {
            this.f119787H = true;
        } else {
            try {
                this.f119787H = C87412m.m108589b(Util.nullAsNil(Uri.parse(this.f119793u).getQueryParameter("immersiveUIStyle")), "1");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.HalfScreenWebView", "initImmersiveStyle ex " + e.getMessage());
            }
        }
        String str = this.f119792t.f120229n;
        if (!(str == null || C112551y.m153811k(str))) {
            this.f119788I = Integer.valueOf(C6600v.m6908c(this.f119792t.f120229n, C76577a.m92153d(getContext(), C0966R.color.al6)));
        }
        if (!this.f119787H) {
            PullDownWebViewLayout pullDownWebViewLayout = this.f119783D;
            ViewGroup.LayoutParams layoutParams = pullDownWebViewLayout != null ? pullDownWebViewLayout.getLayoutParams() : null;
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).addRule(3, C0966R.C0970id.lmg);
        }
        mo68882P();
        View view13 = this.f126905i;
        if (view13 != null) {
            view13.setOnTouchListener(new C44357s(this));
        }
        C44361u uVar = this.f119792t;
        if (!uVar.f120219d || uVar.f120220e == -1) {
            WeImageView weImageView = this.f119784E;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            i = 0;
        } else {
            WeImageView weImageView2 = this.f119784E;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            C7007c1.m7257b(this.f119784E, 0.5f);
            WeImageView weImageView3 = this.f119784E;
            if (weImageView3 != null) {
                weImageView3.setOnClickListener(new C30618p(this));
            }
            i = ((int) (this.f119786G * ((float) 3))) + 0;
        }
        int i3 = this.f119792t.f120220e;
        if (i3 != -1) {
            if (i3 == 1) {
                WeImageView weImageView4 = this.f119781B;
                if (weImageView4 != null) {
                    weImageView4.setRotation(180.0f);
                }
            } else {
                WeImageView weImageView5 = this.f119781B;
                if (weImageView5 != null) {
                    weImageView5.setRotation(90.0f);
                }
            }
            i2 = ((int) (this.f119786G * ((float) 3))) + 0;
        } else {
            View view14 = this.f119782C;
            if (view14 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view15 = view14;
                C117292a.m165358d(view15, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i2 = 0;
        }
        if (this.f119792t.f120227l) {
            WeImageView weImageView6 = this.f119796x;
            if (weImageView6 != null) {
                weImageView6.setOnClickListener(new C44354q(this));
            }
            C7007c1.m7257b(this.f119796x, 0.5f);
            if (i > 0) {
                f2 = this.f119786G;
                f = (float) 5;
            } else {
                f2 = this.f119786G;
                f = (float) 3;
            }
            i += (int) (f2 * f);
        } else {
            WeImageView weImageView7 = this.f119796x;
            if (weImageView7 != null) {
                weImageView7.setVisibility(8);
            }
        }
        int i4 = i2 - i;
        if (this.f119792t.f120228m) {
            if (i4 > 0) {
                LinearLayout linearLayout2 = this.f119798z;
                if (linearLayout2 != null) {
                    linearLayout2.setPadding(0, 0, i4, 0);
                }
            } else if (i4 < 0 && (linearLayout = this.f119798z) != null) {
                linearLayout.setPadding(0 - i4, 0, 0, 0);
            }
            if (C44706b.m49450a()) {
                C44706b.m49451b(this.f119797y, C0966R.dimen.f3619c);
            } else if (C76577a.m92147C(getContext()) && (textView = this.f119797y) != null) {
                textView.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(getContext()));
            }
        }
        View view16 = this.f119795w;
        if (view16 != null) {
            view16.setOnClickListener(new C44356r(this));
        }
        mo68880N(mo68878L());
        mo68885f(C76577a.m92153d(getContext(), C0966R.color.al6));
        this.f119790K.alive();
    }

    /* renamed from: J */
    public void mo68876J() {
        super.mo68876J();
        this.f119790K.dead();
        Context context = this.f119791s;
        if (context instanceof MMActivity) {
            ((MMActivity) context).removeOnConfigurationChangedListener(this);
        }
        PullDownWebViewLayout pullDownWebViewLayout = this.f119783D;
        if (pullDownWebViewLayout != null) {
            pullDownWebViewLayout.removeAllViews();
        }
        this.f119789J.onDestroy();
        Log.m105924i("MicroMsg.HalfScreenWebView", "onDismiss url= " + this.f119793u + " cacheController=" + false);
    }

    /* renamed from: K */
    public void mo68877K() {
        if (!this.f119792t.f120224i) {
            Log.m105924i("MicroMsg.HalfScreenWebView", "onOuterViewClick closeWhenClickEmptyArea is false");
            return;
        }
        this.f119790K.dead();
        HalfScreenWebViewCloseEvent halfScreenWebViewCloseEvent = new HalfScreenWebViewCloseEvent();
        halfScreenWebViewCloseEvent.f107612d.f107613a = this.f119791s;
        if (halfScreenWebViewCloseEvent.publish()) {
            C12969d.m12410d(200, new C44214c(this));
        } else {
            cancel();
        }
    }

    /* renamed from: L */
    public final int mo68878L() {
        int i;
        Context context;
        if (this.f119787H) {
            context = getContext();
            i = C0966R.color.ald;
        } else {
            context = getContext();
            i = C0966R.color.al6;
        }
        return C76577a.m92153d(context, i);
    }

    /* renamed from: M */
    public final MMWebView mo68879M() {
        return this.f119789J.mo68950h();
    }

    /* renamed from: N */
    public void mo68880N(int i) {
        int i2;
        View view = this.f119782C;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        View view2 = this.f119794v;
        float f = this.f119786G;
        if (view2 != null) {
            view2.setOutlineProvider(new C44359t(f));
        }
        boolean z = true;
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        if (Color.red(i) <= 200 || Color.blue(i) <= 200 || Color.green(i) <= 200) {
            z = false;
        }
        if (z) {
            if (this.f119792t.f120219d) {
                View view3 = this.f119780A;
                if (view3 != null) {
                    view3.setBackgroundResource(C0966R.C0969drawable.b2m);
                }
            } else {
                View view4 = this.f119780A;
                if (view4 != null) {
                    view4.setBackgroundResource(C0966R.C0969drawable.b2k);
                }
            }
            i2 = C76577a.m92153d(getContext(), C0966R.color.UN_BW_0_Alpha_0_9);
        } else {
            if (this.f119792t.f120219d) {
                View view5 = this.f119780A;
                if (view5 != null) {
                    view5.setBackgroundResource(C0966R.C0969drawable.b2l);
                }
            } else {
                View view6 = this.f119780A;
                if (view6 != null) {
                    view6.setBackgroundResource(C0966R.C0969drawable.b2j);
                }
            }
            i2 = C76577a.m92153d(getContext(), C0966R.color.BW_100_Alpha_0_9);
        }
        WeImageView weImageView = this.f119781B;
        if (weImageView != null) {
            weImageView.setIconColor(i2);
        }
        WeImageView weImageView2 = this.f119784E;
        if (weImageView2 != null) {
            weImageView2.setIconColor(i2);
        }
        WeImageView weImageView3 = this.f119796x;
        if (weImageView3 != null) {
            weImageView3.setIconColor(i2);
        }
        TextView textView = this.f119797y;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    /* renamed from: O */
    public final void mo68881O(WebView webView) {
        if (this.f119792t.f120220e == 0) {
            boolean z = true;
            if (webView == null || !webView.canGoBack()) {
                z = false;
            }
            if (z) {
                WeImageView weImageView = this.f119781B;
                if (weImageView != null) {
                    weImageView.setRotation(180.0f);
                    return;
                }
                return;
            }
            WeImageView weImageView2 = this.f119781B;
            if (weImageView2 != null) {
                weImageView2.setRotation(90.0f);
            }
        }
    }

    /* renamed from: P */
    public final void mo68882P() {
        C74783i3.C6978a a = C74783i3.m89537a(getContext());
        int i = a.f24704a;
        int i2 = a.f24705b;
        if (i > i2) {
            i = i2;
        }
        View view = this.f119794v;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        View view2 = this.f119794v;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo7525a(C76875f0 f0Var) {
        C87412m.m108594g(f0Var, "item");
        this.f119789J.mo68946a(f0Var);
    }

    /* renamed from: c */
    public void mo7526c(C11184p0 p0Var) {
        this.f119789J.mo68948c(p0Var);
    }

    /* renamed from: d */
    public void mo68883d(Bundle bundle) {
        cancel();
    }

    /* renamed from: e */
    public void mo68884e(Bundle bundle) {
        int i;
        int i2;
        if (bundle != null) {
            if (bundle.getBoolean("set_navigation_bar_color_reset", false)) {
                i = mo68878L();
                i2 = 255;
            } else {
                int i3 = bundle.getInt("set_navigation_bar_color_color");
                i2 = bundle.getInt("set_navigation_bar_color_alpha");
                i = i3;
            }
            mo68880N((i & 16777215) | (i2 << 24));
        }
    }

    /* renamed from: f */
    public void mo68885f(int i) {
        View view = this.f119794v;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: g */
    public void mo7528g(C44242c cVar) {
        C87412m.m108594g(cVar, "callback");
        this.f119789J.mo68949g(cVar);
    }

    /* renamed from: i */
    public void mo68886i(Bundle bundle) {
        TextView textView;
        if (bundle != null && this.f119792t.f120228m && (textView = this.f119797y) != null) {
            String string = bundle.getString("set_page_title_text");
            if (string != null) {
                textView.setText(string);
            }
            float f = bundle.getFloat("set_page_title_alpha", 1.0f);
            textView.setTextColor(C6600v.m6908c(bundle.getString("set_page_title_color"), textView.getCurrentTextColor()));
            double d = (double) f;
            boolean z = false;
            if (0.0d <= d && d <= 1.0d) {
                z = true;
            }
            if (z) {
                textView.setAlpha(f);
            }
        }
    }

    /* renamed from: n */
    public void mo68887n(WebView webView, String str, boolean z) {
        mo68881O(webView);
    }

    /* renamed from: o */
    public boolean mo68888o() {
        return this.f119787H;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        View view = this.f126903g;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C44213b(this, configuration));
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C44247d0 d0Var = this.f119789J;
        if (d0Var != null) {
            d0Var.onWindowFocusChanged(z);
        }
    }

    /* renamed from: q */
    public void mo68891q(WebView webView, String str) {
        TextView textView;
        if (!this.f119792t.f120228m) {
            TextView textView2 = this.f119797y;
            if (textView2 != null) {
                textView2.setText("");
                return;
            }
            return;
        }
        C45520t u = this.f119789J.mo68956u();
        String o = u != null ? u.mo67734o() : null;
        Log.m105924i("MicroMsg.HalfScreenWebView", "onReceivedTitle# title = " + str + " loadUrl=" + o);
        if (Util.isNullOrNil(str)) {
            TextView textView3 = this.f119797y;
            if (textView3 != null) {
                textView3.setText("");
                return;
            }
            return;
        }
        String nullAsNil = Util.nullAsNil(o);
        C87412m.m108593f(nullAsNil, "nullAsNil(loadUrl)");
        C87412m.m108591d(str);
        if (C112551y.m153808h(nullAsNil, str, false, 2, (Object) null)) {
            TextView textView4 = this.f119797y;
            if (textView4 != null) {
                textView4.setText("");
                return;
            }
            return;
        }
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (!(!Util.isNullOrNil(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str))) && !C112551y.m153819s(str, "about:blank", false) && (textView = this.f119797y) != null) {
            textView.setText(str);
        }
    }

    /* renamed from: r */
    public void mo68892r(WebView webView, String str) {
    }

    /* renamed from: s */
    public void mo68893s(WebView webView, String str) {
        mo68881O(webView);
    }

    /* renamed from: t */
    public void mo68894t(WebView webView, String str) {
        Object[] objArr = new Object[2];
        String str2 = null;
        boolean z = false;
        objArr[0] = webView != null ? webView.getUrl() : null;
        C45520t u = this.f119789J.mo68956u();
        objArr[1] = u != null ? u.getCurrentUrl() : null;
        Log.m105927v("MicroMsg.HalfScreenWebView", "onPageStart url: %s, current: %s", objArr);
        C45520t u2 = this.f119789J.mo68956u();
        String currentUrl = u2 != null ? u2.getCurrentUrl() : null;
        if (currentUrl == null || currentUrl.length() == 0) {
            z = true;
        }
        if (!z) {
            String url = webView != null ? webView.getUrl() : null;
            C45520t u3 = this.f119789J.mo68956u();
            if (u3 != null) {
                str2 = u3.getCurrentUrl();
            }
            if (!Util.isEqual(url, str2)) {
                mo68880N(mo68878L());
                mo68885f(C76577a.m92153d(getContext(), C0966R.color.al6));
            }
        }
    }

    /* renamed from: z */
    public void mo68895z() {
        PullDownWebViewLayout pullDownWebViewLayout;
        View b = this.f119789J.mo68947b();
        MMWebView mMWebView = null;
        ViewParent parent = b != null ? b.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (this.f119788I != null) {
            MMWebView M = mo68879M();
            Integer num = this.f119788I;
            C87412m.m108591d(num);
            M.setBackgroundColor(num.intValue());
            if (!this.f119787H) {
                Integer num2 = this.f119788I;
                C87412m.m108591d(num2);
                mo68880N(num2.intValue());
            }
        } else {
            mo68879M().setBackgroundColor(C76577a.m92153d(getContext(), C0966R.color.al6));
        }
        PullDownWebViewLayout pullDownWebViewLayout2 = this.f119783D;
        if (pullDownWebViewLayout2 != null) {
            pullDownWebViewLayout2.addView(b, new RelativeLayout.LayoutParams(-1, -1));
        }
        mo68881O(mo68879M());
        int i = (int) (((float) C74783i3.m89537a(getContext()).f24705b) * this.f119792t.f120216a * 0.3f);
        C47282e.m52580a((C47282e) ((C36570n) this.f119785F).getValue(), this.f119795w, this.f126903g, i, 0.5f, (View) null, 16, (Object) null);
        C47282e eVar = (C47282e) ((C36570n) this.f119785F).getValue();
        View view = this.f119782C;
        View view2 = this.f126903g;
        if (this.f119787H) {
            mMWebView = mo68879M();
        }
        C47282e.m52580a(eVar, view, view2, i, 0.0f, mMWebView, 8, (Object) null);
        C5843f0 f0Var = C5843f0.f22025a;
        if (((Boolean) ((C36570n) C5843f0.f22032h).getValue()).booleanValue() && (pullDownWebViewLayout = this.f119783D) != null) {
            WeakReference weakReference = new WeakReference(this);
            MMWebView M2 = mo68879M();
            View view3 = this.f126903g;
            C87412m.m108594g(M2, "webView");
            if (view3 != null) {
                pullDownWebViewLayout.f119836i = view3;
                pullDownWebViewLayout.f119838n = new C47282e(weakReference);
                pullDownWebViewLayout.f119839o = i;
                pullDownWebViewLayout.f119837j = M2;
                pullDownWebViewLayout.f119840p = true;
            }
        }
    }

    public /* synthetic */ HalfScreenWebView(Context context, String str, MMWebView mMWebView, C44361u uVar, int i, C8480h hVar) {
        String str2;
        Context context2;
        HalfScreenWebView halfScreenWebView;
        C44361u uVar2;
        MMWebView mMWebView2 = (i & 4) != 0 ? null : mMWebView;
        if ((i & 8) != 0) {
            uVar2 = new C44361u(0.0f, (String) null, false, false, 0, false, 0, false, false, 0, false, false, false, (String) null, false, 32767, (C8480h) null);
            halfScreenWebView = this;
            context2 = context;
            str2 = str;
        } else {
            halfScreenWebView = this;
            context2 = context;
            str2 = str;
            uVar2 = uVar;
        }
        new HalfScreenWebView(context2, str2, mMWebView2, uVar2);
    }
}
