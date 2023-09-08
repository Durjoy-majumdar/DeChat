package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43512f;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.util.WebViewControllerPreloadMrg;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.XWebSdk;
import d93.C45298c;
import d93.C45310h;
import di3.C86312j;
import e00.C45520t;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i93.C46206e;
import j20.C117292a;
import j93.C46450c;
import j93.C46451d;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76875f0;
import nj3.C76879j;
import p200lx.C46900z;
import p248ug.C52572q0;
import qo3.C77407n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t83.C13853i;
import t83.C48590l;
import v83.C52806b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0 */
public final class C44341n0 implements C44247d0, C43512f, C44363v {

    /* renamed from: A */
    public int f120164A;

    /* renamed from: B */
    public C44349h f120165B;

    /* renamed from: C */
    public C46451d f120166C;

    /* renamed from: D */
    public BaseWebViewController f120167D;

    /* renamed from: E */
    public final C13601g f120168E;

    /* renamed from: F */
    public C44347f f120169F;

    /* renamed from: G */
    public final C13601g f120170G;

    /* renamed from: H */
    public FrameLayout f120171H;

    /* renamed from: I */
    public ScrollView f120172I;

    /* renamed from: J */
    public View f120173J;

    /* renamed from: K */
    public WebViewCallbackClient f120174K;

    /* renamed from: d */
    public final Activity f120175d;

    /* renamed from: e */
    public final MMWebView f120176e;

    /* renamed from: f */
    public final C44305j f120177f;

    /* renamed from: g */
    public MMWebView f120178g;

    /* renamed from: h */
    public final String f120179h;

    /* renamed from: i */
    public WebViewKeyboardLinearLayout f120180i;

    /* renamed from: j */
    public NestedBounceView f120181j;

    /* renamed from: n */
    public ProgressBar f120182n;

    /* renamed from: o */
    public View f120183o;

    /* renamed from: p */
    public RelativeLayout f120184p;

    /* renamed from: q */
    public MultiCodeMaskView f120185q;

    /* renamed from: r */
    public boolean f120186r;

    /* renamed from: s */
    public C44272i f120187s = new C44272i();

    /* renamed from: t */
    public int f120188t;

    /* renamed from: u */
    public int f120189u;

    /* renamed from: v */
    public C44242c f120190v;

    /* renamed from: w */
    public Dialog f120191w;

    /* renamed from: x */
    public C44365w f120192x;

    /* renamed from: y */
    public long f120193y;

    /* renamed from: z */
    public long f120194z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$a */
    public static final class C44342a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44341n0 f120195d;

        public C44342a(C44341n0 n0Var) {
            this.f120195d = n0Var;
        }

        public final void run() {
            this.f120195d.mo69079C().requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$b */
    public static final class C44343b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44341n0 f120196d;

        public C44343b(C44341n0 n0Var) {
            this.f120196d = n0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C44341n0 n0Var = this.f120196d;
            BaseWebViewController baseWebViewController = n0Var.f120167D;
            if (baseWebViewController != null) {
                baseWebViewController.mo67706Z0(baseWebViewController.mo63683n0(), true, 8);
            }
            View view2 = n0Var.f120183o;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ProgressBar progressBar = this.f120196d.f120182n;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$c */
    public static final class C44344c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44341n0 f120197d;

        public C44344c(C44341n0 n0Var) {
            this.f120197d = n0Var;
        }

        public final void run() {
            this.f120197d.mo68895z();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$d */
    public static final class C44345d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C44341n0 f120198d;

        public C44345d(C44341n0 n0Var) {
            this.f120198d = n0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initWebView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                this.f120198d.f120188t = (int) motionEvent.getX();
                this.f120198d.f120189u = (int) motionEvent.getY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initWebView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$e */
    public static final class C44346e extends C87413o implements C32224a<C44255f1> {

        /* renamed from: d */
        public final /* synthetic */ String f120199d;

        /* renamed from: e */
        public final /* synthetic */ C44341n0 f120200e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44346e(String str, C44341n0 n0Var) {
            super(0);
            this.f120199d = str;
            this.f120200e = n0Var;
        }

        public Object invoke() {
            WebViewControllerPreloadMrg webViewControllerPreloadMrg = WebViewControllerPreloadMrg.f120348a;
            String str = this.f120199d;
            boolean z = this.f120200e.f120177f.f120063c;
            webViewControllerPreloadMrg.getClass();
            C87412m.m108594g(str, "url");
            C44255f1 remove = z ? WebViewControllerPreloadMrg.f120350c.get(str) : WebViewControllerPreloadMrg.f120350c.remove(str);
            if (remove != null) {
                return remove;
            }
            BaseWebViewController baseWebViewController = this.f120200e.f120167D;
            C87412m.m108591d(baseWebViewController);
            return new C44255f1(new WeakReference(baseWebViewController));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$f */
    public static final class C44347f extends C43558z {

        /* renamed from: b */
        public final /* synthetic */ C44341n0 f120201b;

        public C44347f(C44341n0 n0Var) {
            this.f120201b = n0Var;
        }

        /* renamed from: a */
        public void mo67848a(int i, String str) {
            int i2;
            C87412m.m108594g(str, "reqUrl");
            C44341n0 n0Var = this.f120201b;
            C44272i iVar = n0Var.f120187s;
            BaseWebViewController baseWebViewController = n0Var.f120167D;
            iVar.getClass();
            if (baseWebViewController != null) {
                if (baseWebViewController.f117539M == null) {
                    Log.m105920e("MicroMsg.HalfScreenWebViewMenuHelper", "setShareFuncFlag params failed");
                    return;
                }
                String currentUrl = baseWebViewController.getCurrentUrl();
                if (!Util.isNullOrNil(currentUrl)) {
                    try {
                        if (C87412m.m108589b(new URL(currentUrl).getHost(), WeChatHosts.domainString(C0966R.string.f360885fm3))) {
                            C45310h hVar = baseWebViewController.f117539M;
                            if (hVar == null) {
                                Log.m105920e("MicroMsg.HalfScreenWebViewMenuHelper", "getShareFuncFlag params failed");
                                i2 = -1;
                            } else {
                                JsapiPermissionWrapper c = hVar.mo70860c();
                                C87412m.m108593f(c, "wvPerm.jsPerm");
                                boolean a = iVar.mo68973a(c, 21, 1);
                                i2 = iVar.mo68973a(c, 23, 2) ? a | true : a;
                                Log.m105925i("MicroMsg.HalfScreenWebViewMenuHelper", "getShareFuncFlag %d", Integer.valueOf(i2));
                            }
                            if (baseWebViewController.mo67720g0() != null) {
                                baseWebViewController.mo67720g0().mo73221R("setFuncFlag", i2);
                            }
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.HalfScreenWebViewMenuHelper", "create url fail : " + e.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo64862e() {
            try {
                BaseWebViewController baseWebViewController = this.f120201b.f120167D;
                if (baseWebViewController != null) {
                    C43791l m = baseWebViewController.mo67731m();
                    BaseWebViewController baseWebViewController2 = this.f120201b.f120167D;
                    m.mo68124cg(baseWebViewController2 != null ? baseWebViewController2.mo67719g() : 0);
                }
                BaseWebViewController baseWebViewController3 = this.f120201b.f120167D;
                if (baseWebViewController3 != null) {
                    C43791l m2 = baseWebViewController3.mo67731m();
                    C44255f1 D = this.f120201b.mo69080D();
                    BaseWebViewController baseWebViewController4 = this.f120201b.f120167D;
                    m2.Np0(D, baseWebViewController4 != null ? baseWebViewController4.mo67719g() : 0);
                }
                C44341n0 n0Var = this.f120201b;
                BaseWebViewController baseWebViewController5 = n0Var.f120167D;
                if (baseWebViewController5 != null) {
                    baseWebViewController5.mo67751u0(n0Var.f120179h);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MMWebViewWithController", th, "alvinluo initWebViewController exception", new Object[0]);
            }
        }

        /* renamed from: j */
        public void mo63706j() {
            C48590l g0;
            BaseWebViewController baseWebViewController = this.f120201b.f120167D;
            if (baseWebViewController != null && (g0 = baseWebViewController.mo67720g0()) != null) {
                g0.mo73204A("onCreate", this.f120201b.f120177f.f120062b);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$g */
    public static final class C44348g extends C87413o implements C32224a<C44236b> {

        /* renamed from: d */
        public final /* synthetic */ C44341n0 f120202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44348g(C44341n0 n0Var) {
            super(0);
            this.f120202d = n0Var;
        }

        public Object invoke() {
            return new C44236b(new WeakReference(this.f120202d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$h */
    public static final class C44349h implements C46450c {

        /* renamed from: a */
        public final /* synthetic */ C44341n0 f120203a;

        public C44349h(C44341n0 n0Var) {
            this.f120203a = n0Var;
        }

        /* renamed from: a */
        public int mo68334a() {
            C45298c U;
            BaseWebViewController baseWebViewController = this.f120203a.f120167D;
            if (baseWebViewController == null || (U = baseWebViewController.mo67698U()) == null) {
                return 0;
            }
            return U.f122692i;
        }

        /* renamed from: b */
        public int mo68335b() {
            return this.f120203a.f120189u;
        }

        /* renamed from: c */
        public int mo68336c() {
            return this.f120203a.f120188t;
        }

        /* renamed from: d */
        public MultiCodeMaskView mo68337d() {
            C44341n0 n0Var = this.f120203a;
            MultiCodeMaskView multiCodeMaskView = n0Var.f120185q;
            if (multiCodeMaskView == null) {
                return null;
            }
            multiCodeMaskView.setTopOffset(n0Var.mo67802j());
            return multiCodeMaskView;
        }

        public Activity getContext() {
            return this.f120203a.f120175d;
        }

        public BaseWebViewController getController() {
            BaseWebViewController baseWebViewController = this.f120203a.f120167D;
            C87412m.m108591d(baseWebViewController);
            return baseWebViewController;
        }

        public int getWVTopOffset() {
            return this.f120203a.mo67802j();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.n0$i */
    public static final class C44350i implements WebViewCallbackClient {

        /* renamed from: a */
        public final /* synthetic */ C44341n0 f120204a;

        public C44350i(C44341n0 n0Var) {
            this.f120204a = n0Var;
        }

        public void onContentHeightChanged(int i) {
            this.f120204a.mo69081E(i);
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            C87412m.m108594g(view, "view");
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            C87412m.m108594g(view, "view");
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            C87412m.m108594g(view, "view");
            return true;
        }
    }

    public C44341n0(Activity activity, String str, MMWebView mMWebView, C44305j jVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(jVar, "option");
        this.f120175d = activity;
        this.f120176e = mMWebView;
        this.f120177f = jVar;
        this.f120179h = str;
        this.f120191w = jVar.f120066f;
        this.f120192x = jVar.f120067g;
        this.f120194z = System.currentTimeMillis();
        this.f120165B = new C44349h(this);
        this.f120168E = C36568h.m40985a(new C44348g(this));
        this.f120169F = new C44347f(this);
        this.f120170G = C36568h.m40985a(new C44346e(str, this));
        this.f120174K = new C44350i(this);
    }

    /* renamed from: A */
    public void mo67797A() {
        C44272i iVar = this.f120187s;
        Activity activity = this.f120175d;
        BaseWebViewController baseWebViewController = this.f120167D;
        iVar.getClass();
        C87412m.m108594g(activity, "ui");
        if (baseWebViewController != null) {
            C45310h hVar = baseWebViewController.f117539M;
            if (hVar == null) {
                Log.m105920e("MicroMsg.HalfScreenWebViewMenuHelper", "showShareMenu params failed");
                return;
            }
            JsapiPermissionWrapper c = hVar.mo70860c();
            C87412m.m108593f(c, "wvPerm.jsPerm");
            if (iVar.mo68973a(c, 21, 1) || iVar.mo68973a(c, 23, 2)) {
                C77407n nVar = new C77407n((Context) activity, 1, false);
                nVar.f225771i = new C44260g(iVar, c, activity);
                nVar.f225782p = new C44261h(baseWebViewController);
                nVar.mo107568m(" ", 1, 0);
                nVar.f225779n1 = false;
                nVar.mo107573q();
                return;
            }
            C76879j.m92726T(activity, activity.getString(C0966R.string.llx));
        }
    }

    /* renamed from: B */
    public final void mo69078B(int i) {
        mo69079C().setPadding(mo69079C().getPaddingLeft(), mo69079C().getPaddingTop(), mo69079C().getPaddingRight(), i);
        mo69079C().post(new C44342a(this));
    }

    /* renamed from: C */
    public final MMWebView mo69079C() {
        MMWebView mMWebView = this.f120178g;
        if (mMWebView != null) {
            return mMWebView;
        }
        C87412m.m108603p("webView");
        throw null;
    }

    /* renamed from: D */
    public final C44255f1 mo69080D() {
        return (C44255f1) ((C36570n) this.f120170G).getValue();
    }

    /* renamed from: E */
    public final void mo69081E(int i) {
        if (i > 0) {
            float scale = mo69079C().getScale();
            int i2 = (int) (((float) i) * scale);
            FrameLayout frameLayout = this.f120171H;
            int measuredHeight = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
            if (i2 < measuredHeight) {
                i2 = measuredHeight;
            }
            Log.m105918d("MicroMsg.MMWebViewWithController", "SnapShotMode, webViewHeight:" + i + ", contentHeight:" + i2 + ", density=" + scale);
            View view = this.f120173J;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = i2 + 2;
                View view2 = this.f120173J;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo69082F() {
        View view = this.f120183o;
        if (view != null && view.getVisibility() == 0) {
            int i = this.f120175d.getResources().getConfiguration().orientation;
            Log.m105925i("MicroMsg.MMWebViewWithController", "updateRefreshMask orientation: %s", Integer.valueOf(i));
            if (i == 1) {
                RelativeLayout relativeLayout = this.f120184p;
                if (relativeLayout != null) {
                    relativeLayout.setPadding(0, this.f120175d.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6), 0, this.f120175d.getResources().getDimensionPixelSize(C0966R.dimen.f3709c2));
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout2 = this.f120184p;
            if (relativeLayout2 != null) {
                relativeLayout2.setPadding(0, this.f120175d.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.f120175d.getResources().getDimensionPixelSize(C0966R.dimen.f3760da));
            }
        }
    }

    /* renamed from: a */
    public void mo68946a(C76875f0 f0Var) {
        C87412m.m108594g(f0Var, "item");
        C44272i iVar = this.f120187s;
        iVar.getClass();
        iVar.f119968k.add(f0Var);
    }

    /* renamed from: b */
    public View mo68947b() {
        return this.f120180i;
    }

    /* renamed from: c */
    public void mo68948c(C11184p0 p0Var) {
        this.f120187s.f119967j = p0Var;
    }

    /* renamed from: d */
    public void mo67798d(Bundle bundle) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68883d(bundle);
        }
    }

    /* renamed from: e */
    public void mo67799e(Bundle bundle) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68884e(bundle);
        }
    }

    /* renamed from: f */
    public void mo67800f(int i) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68885f(i);
        }
    }

    /* renamed from: g */
    public void mo68949g(C44242c cVar) {
        C87412m.m108594g(cVar, "callback");
        this.f120190v = cVar;
    }

    /* renamed from: h */
    public MMWebView mo68950h() {
        return mo69079C();
    }

    /* renamed from: i */
    public void mo67801i(Bundle bundle) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68886i(bundle);
        }
    }

    /* renamed from: j */
    public int mo67802j() {
        int measuredHeight = (this.f120175d.getWindow().getDecorView().getMeasuredHeight() - mo69079C().getMeasuredHeight()) - C75044y4.m89991c(this.f120175d);
        Log.m105918d("MicroMsg.MMWebViewWithController", "getWVTopOffest :" + measuredHeight);
        return measuredHeight;
    }

    /* renamed from: k */
    public void mo68951k() {
        C44242c cVar = this.f120190v;
        boolean z = true;
        if (cVar == null || !cVar.mo2024a(this.f120179h)) {
            z = false;
        }
        if (!z) {
            this.f120187s.mo68978h();
        }
    }

    /* renamed from: l */
    public void mo69083l() {
        View view = this.f120183o;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo69082F();
        mo69084v();
    }

    /* renamed from: m */
    public void mo68952m() {
        this.f120193y = System.currentTimeMillis();
        Log.m105924i("MicroMsg.MMWebViewWithController", "initContentView url= " + this.f120179h + ", reuseWebView=" + this.f120177f.f120063c + ", createUITimestampe: " + this.f120193y);
        if (XWebSdk.isSysWebView()) {
            this.f120177f.f120063c = false;
            Log.m105928w("MicroMsg.MMWebViewWithController", "initContentView SysWebView can not reuseWebView");
        }
        TextPaint textPaint = null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = (WebViewKeyboardLinearLayout) LayoutInflater.from(this.f120175d).inflate(C0966R.C0971layout.d0n, (ViewGroup) null, false);
        this.f120180i = webViewKeyboardLinearLayout;
        this.f120181j = webViewKeyboardLinearLayout != null ? (NestedBounceView) webViewKeyboardLinearLayout.findViewById(C0966R.C0970id.ni_) : null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout2 = this.f120180i;
        this.f120182n = webViewKeyboardLinearLayout2 != null ? (ProgressBar) webViewKeyboardLinearLayout2.findViewById(C0966R.C0970id.nib) : null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout3 = this.f120180i;
        this.f120183o = webViewKeyboardLinearLayout3 != null ? webViewKeyboardLinearLayout3.findViewById(C0966R.C0970id.ijl) : null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout4 = this.f120180i;
        this.f120184p = webViewKeyboardLinearLayout4 != null ? (RelativeLayout) webViewKeyboardLinearLayout4.findViewById(C0966R.C0970id.ijm) : null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout5 = this.f120180i;
        this.f120185q = webViewKeyboardLinearLayout5 != null ? (MultiCodeMaskView) webViewKeyboardLinearLayout5.findViewById(C0966R.C0970id.h2z) : null;
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout6 = this.f120180i;
        TextView textView = webViewKeyboardLinearLayout6 != null ? (TextView) webViewKeyboardLinearLayout6.findViewById(C0966R.C0970id.f359579o50) : null;
        if (textView != null) {
            textPaint = textView.getPaint();
        }
        C85875k4.m106191k0(textPaint);
        if (textView != null) {
            textView.setOnClickListener(new C44343b(this));
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C44344c(this));
    }

    /* renamed from: n */
    public void mo68887n(WebView webView, String str, boolean z) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68887n(webView, str, z);
        }
    }

    /* renamed from: o */
    public boolean mo68888o() {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            return wVar.mo68888o();
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i;
        if (configuration != null && this.f120164A != (i = configuration.orientation)) {
            this.f120164A = i;
            mo69082F();
        }
    }

    public void onDestroy() {
        C48590l g0;
        BaseWebViewController baseWebViewController = this.f120167D;
        if (!(baseWebViewController == null || (g0 = baseWebViewController.mo67720g0()) == null)) {
            g0.mo73204A("onDestroy", this.f120177f.f120062b);
        }
        C44236b bVar = (C44236b) ((C36570n) this.f120168E).getValue();
        bVar.mo67777c().mo67693R0(bVar);
        bVar.mo67777c().mo67723h(bVar.f119886c);
        this.f120190v = null;
        ViewParent parent = mo69079C().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (!this.f120177f.f120063c || !this.f120186r) {
            mo69079C().destroy();
            BaseWebViewController baseWebViewController2 = this.f120167D;
            if (baseWebViewController2 != null) {
                baseWebViewController2.onDestroy();
            }
            C44272i iVar = this.f120187s;
            for (SparseBooleanArray next : iVar.f119964g.values()) {
                if (next != null) {
                    next.clear();
                }
            }
            iVar.f119964g.clear();
            iVar.mo68977g();
        } else {
            this.f120187s.mo68977g();
        }
        mo69079C().setWebChromeClient((WebChromeClient) null);
        mo69079C().setWebViewCallbackClient((WebViewCallbackClient) null);
        BaseWebViewController baseWebViewController3 = this.f120167D;
        if (baseWebViewController3 != null) {
            baseWebViewController3.f117579n = null;
        }
        MultiCodeMaskView multiCodeMaskView = this.f120185q;
        if (multiCodeMaskView != null && multiCodeMaskView.getVisibility() == 0) {
            long j = 0;
            C46451d dVar = this.f120166C;
            if (dVar != null) {
                j = ((WebViewLongClickHelper) dVar).f118402k.longValue();
            }
            multiCodeMaskView.mo67041d(j, false);
        }
        C46451d dVar2 = this.f120166C;
        if (dVar2 != null) {
            WebViewLongClickHelper webViewLongClickHelper = (WebViewLongClickHelper) dVar2;
            C46900z zVar = webViewLongClickHelper.f118398g;
            if (zVar != null) {
                ((ScanCodeSheetItemLogic) zVar).f116146d = MMApplicationContext.getContext();
            }
            C77407n nVar = webViewLongClickHelper.f118397f;
            if (nVar != null) {
                nVar.mo107565j();
                webViewLongClickHelper.f118397f = null;
            }
            webViewLongClickHelper.f118406o = null;
        }
        Log.m105924i("MicroMsg.MMWebViewWithController", "onDestroy url= " + this.f120179h + " cacheController=" + this.f120186r);
    }

    public void onWindowFocusChanged(boolean z) {
        BaseWebViewController baseWebViewController;
        C48590l g0;
        Log.m105918d("MicroMsg.MMWebViewWithController", "onWindowFocusChanged hasFocus=" + z);
        BaseWebViewController baseWebViewController2 = this.f120167D;
        if ((baseWebViewController2 != null ? baseWebViewController2.mo67720g0() : null) != null && (baseWebViewController = this.f120167D) != null && (g0 = baseWebViewController.mo67720g0()) != null) {
            g0.mo73254q0(z, true);
        }
    }

    /* renamed from: p */
    public void mo67803p(int i) {
        BaseWebViewController baseWebViewController = this.f120167D;
        if (baseWebViewController != null) {
            baseWebViewController.mo67668C0(i);
        }
    }

    /* renamed from: q */
    public void mo68891q(WebView webView, String str) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68891q(webView, str);
        }
    }

    /* renamed from: r */
    public void mo68892r(WebView webView, String str) {
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68892r(webView, str);
        }
    }

    /* renamed from: s */
    public void mo68893s(WebView webView, String str) {
        mo69084v();
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68893s(webView, str);
        }
    }

    /* renamed from: t */
    public void mo68894t(WebView webView, String str) {
        NestedBounceView nestedBounceView = this.f120181j;
        if (nestedBounceView != null) {
            nestedBounceView.setBounce(true);
        }
        C44272i iVar = this.f120187s;
        if (str == null) {
            iVar.getClass();
        } else if (iVar.f119964g.get(str) == null) {
            iVar.f119964g.put(str, new SparseBooleanArray());
        }
        C44365w wVar = this.f120192x;
        if (wVar != null) {
            wVar.mo68894t(webView, str);
        }
    }

    /* renamed from: u */
    public C45520t mo68956u() {
        return this.f120167D;
    }

    /* renamed from: v */
    public void mo69084v() {
        ProgressBar progressBar;
        ProgressBar progressBar2 = this.f120182n;
        boolean z = false;
        if (progressBar2 != null && progressBar2.getVisibility() == 0) {
            z = true;
        }
        if (z && (progressBar = this.f120182n) != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: w */
    public C44272i mo67804w() {
        return this.f120187s;
    }

    /* renamed from: x */
    public void mo67805x() {
        NestedBounceView nestedBounceView = this.f120181j;
        if (nestedBounceView != null) {
            nestedBounceView.setBounce(false);
        }
    }

    /* renamed from: y */
    public void mo68957y(C77407n.C47880p pVar) {
        C87412m.m108594g(pVar, "callBack");
        C44272i iVar = this.f120187s;
        iVar.getClass();
        iVar.f119966i = pVar;
    }

    /* renamed from: z */
    public void mo68895z() {
        C48590l g0;
        C44365w wVar;
        BaseWebViewController baseWebViewController;
        C48590l g05;
        C48590l g06;
        ProgressBar progressBar;
        ViewStub viewStub;
        NestedBounceView nestedBounceView;
        boolean z;
        Class cls = C52572q0.class;
        WebViewControllerPreloadMrg webViewControllerPreloadMrg = WebViewControllerPreloadMrg.f120348a;
        String str = this.f120179h;
        boolean z2 = this.f120177f.f120063c;
        webViewControllerPreloadMrg.getClass();
        C87412m.m108594g(str, "url");
        BaseWebViewController remove = z2 ? WebViewControllerPreloadMrg.f120349b.get(str) : WebViewControllerPreloadMrg.f120349b.remove(str);
        this.f120167D = remove;
        if (remove != null) {
            this.f120186r = true;
            MMWebView mMWebView = remove.f117553a;
            C87412m.m108594g(mMWebView, "<set-?>");
            this.f120178g = mMWebView;
            mo69079C().mo70470f(this.f120175d);
            remove.mo67741p(this.f120169F);
            remove.mo67679J((C44236b) ((C36570n) this.f120168E).getValue());
            if (remove.f117596v0.contains(Integer.valueOf(remove.f117566g0)) || remove.f117596v0.contains(Integer.valueOf(remove.f117574k0))) {
                mo69083l();
            }
        }
        String str2 = null;
        if (this.f120167D == null) {
            boolean z3 = this.f120176e == null && !XWebSdk.hasWebViewCoreInited();
            MMWebView mMWebView2 = this.f120176e;
            if (mMWebView2 == null) {
                mMWebView2 = MMWebView.C45103b.m49948a(new MutableContextWrapper(this.f120175d));
            }
            this.f120178g = mMWebView2;
            MMWebView C = mo69079C();
            C45520t.C45522b bVar = r10;
            C45520t.C45522b bVar2 = new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, false, 105, (C8480h) null);
            BaseWebViewController Q3 = ((C52572q0) C86312j.m106911c(cls)).mo71611Q3(C, bVar, (C13853i) null);
            this.f120167D = Q3;
            if (Q3 != null) {
                if (this.f120177f.f120063c) {
                    String str3 = this.f120179h;
                    C44255f1 D = mo69080D();
                    C87412m.m108594g(str3, "url");
                    if (!webViewControllerPreloadMrg.mo69176c(str3)) {
                        Log.m105928w("MicroMsg.WebViewControllerPreloadMrg", "addToCache, url=" + str3 + " has cached!");
                        z = false;
                    } else {
                        WebViewControllerPreloadMrg.f120349b.put(str3, Q3);
                        WebViewControllerPreloadMrg.f120350c.put(str3, D);
                        z = true;
                    }
                    this.f120186r = z;
                }
                Q3.f117595v = z3 ? C46206e.C46207a.ColdBoot : C46206e.C46207a.WarmBoot;
                Q3.mo67741p(this.f120169F);
                Q3.mo67679J((C44236b) ((C36570n) this.f120168E).getValue());
                Q3.init();
                Q3.mo67752v0((Intent) null, this.f120194z, this.f120193y, false, this.f120179h);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f120179h);
                intent.putExtra("geta8key_scene", this.f120177f.f120064d);
                intent.putExtra("useJs", true);
                Q3.mo67677I(intent);
            }
        }
        BaseWebViewController baseWebViewController2 = this.f120167D;
        if (baseWebViewController2 != null) {
            C52806b bVar3 = baseWebViewController2.f117573k;
            bVar3.f147524b = true;
            bVar3.f147525c = true;
            baseWebViewController2.f117579n = this.f120191w;
            C44305j jVar = this.f120177f;
            bVar3.f147526d = jVar.f120062b;
            bVar3.f147527e = jVar.f120061a;
            bVar3.f147523a = mo68888o() ? 1 : 0;
            C44272i iVar = this.f120187s;
            Activity activity = this.f120175d;
            iVar.getClass();
            C87412m.m108594g(activity, "ct");
            iVar.f119962e = new WeakReference<>(activity);
            iVar.f119963f = new WeakReference<>(baseWebViewController2);
            HashMap<String, SparseBooleanArray> hashMap = baseWebViewController2.f117567h;
            if (hashMap != null) {
                C44272i iVar2 = this.f120187s;
                iVar2.getClass();
                iVar2.f119964g = hashMap;
            } else {
                baseWebViewController2.f117567h = this.f120187s.f119964g;
            }
        }
        C46451d bq = ((C52572q0) C86312j.m106911c(cls)).mo71613bq(this.f120165B);
        this.f120166C = bq;
        if (bq != null) {
            ((WebViewLongClickHelper) bq).mo68196j();
        }
        ViewParent parent = mo69079C().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (!this.f120177f.f120065e) {
            NestedBounceView nestedBounceView2 = this.f120181j;
            if (nestedBounceView2 != null) {
                nestedBounceView2.addView(mo69079C(), new RelativeLayout.LayoutParams(-1, -1));
            }
            mo69079C().setOverScrollMode(2);
            NestedBounceView nestedBounceView3 = this.f120181j;
            if (nestedBounceView3 != null) {
                nestedBounceView3.setCustomNestedChild(new C44353p0(this));
                nestedBounceView3.mo154637e(new C44355q0());
            }
            C5843f0 f0Var = C5843f0.f22025a;
            if (((Boolean) ((C36570n) C5843f0.f22032h).getValue()).booleanValue() && (nestedBounceView = this.f120181j) != null) {
                nestedBounceView.setBounce(false);
            }
        } else {
            WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f120180i;
            if (((ViewGroup) ((webViewKeyboardLinearLayout == null || (viewStub = (ViewStub) webViewKeyboardLinearLayout.findViewById(C0966R.C0970id.ngw)) == null) ? null : viewStub.inflate())) != null) {
                WebViewKeyboardLinearLayout webViewKeyboardLinearLayout2 = this.f120180i;
                if (webViewKeyboardLinearLayout2 != null) {
                    FrameLayout frameLayout = (FrameLayout) webViewKeyboardLinearLayout2.findViewById(C0966R.C0970id.msw);
                }
                WebViewKeyboardLinearLayout webViewKeyboardLinearLayout3 = this.f120180i;
                this.f120171H = webViewKeyboardLinearLayout3 != null ? (FrameLayout) webViewKeyboardLinearLayout3.findViewById(C0966R.C0970id.msu) : null;
                WebViewKeyboardLinearLayout webViewKeyboardLinearLayout4 = this.f120180i;
                this.f120172I = webViewKeyboardLinearLayout4 != null ? (ScrollView) webViewKeyboardLinearLayout4.findViewById(C0966R.C0970id.msv) : null;
                WebViewKeyboardLinearLayout webViewKeyboardLinearLayout5 = this.f120180i;
                this.f120173J = webViewKeyboardLinearLayout5 != null ? webViewKeyboardLinearLayout5.findViewById(C0966R.C0970id.ndc) : null;
                mo69079C().setWebViewCallbackClient(this.f120174K);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout2 = this.f120171H;
                if (frameLayout2 != null) {
                    frameLayout2.addView(mo69079C(), layoutParams);
                }
                View view = this.f120173J;
                if (view != null) {
                    view.setOnClickListener(C6605r0.f23862d);
                }
                if (this.f120177f.f120063c) {
                    mo69081E(mo69079C().getContentHeight());
                    if (mo69079C().getWebScrollY() > 0) {
                        Log.m105924i("MicroMsg.MMWebViewWithController", "initReadMode webScrollY = " + mo69079C().getWebScrollY());
                        ScrollView scrollView = this.f120172I;
                        if (scrollView != null) {
                            scrollView.post(new C44358s0(this));
                        }
                    }
                }
                ScrollView scrollView2 = this.f120172I;
                if (scrollView2 != null) {
                    scrollView2.post(new C44360t0(this));
                }
            }
        }
        C44365w wVar2 = this.f120192x;
        if (wVar2 != null) {
            wVar2.mo68895z();
        }
        mo69079C().setWebChromeClient(new MMWebView.C45105d(new C44224a(new WeakReference(this.f120175d), new WeakReference(this.f120167D), new WeakReference(this))));
        mo69079C().mo70468T();
        mo69079C().setOnTouchListener(new C44345d(this));
        BaseWebViewController baseWebViewController3 = this.f120167D;
        if ((baseWebViewController3 != null && !baseWebViewController3.f117596v0.contains(Integer.valueOf(baseWebViewController3.f117578m0))) && (progressBar = this.f120182n) != null) {
            progressBar.setVisibility(0);
        }
        BaseWebViewController baseWebViewController4 = this.f120167D;
        if (!(!((baseWebViewController4 == null || (g06 = baseWebViewController4.mo67720g0()) == null || !g06.f130003h) ? false : true) || (baseWebViewController = this.f120167D) == null || (g05 = baseWebViewController.mo67720g0()) == null)) {
            g05.mo73204A("onCreate", this.f120177f.f120062b);
        }
        if (mo69080D().f119922h != null) {
            mo67799e(mo69080D().f119922h);
            mo67800f(mo69080D().f119925n);
        }
        if (mo69080D().f119923i != null) {
            mo67801i(mo69080D().f119923i);
        } else {
            BaseWebViewController baseWebViewController5 = this.f120167D;
            if (!Util.isNullOrNil(baseWebViewController5 != null ? baseWebViewController5.f117581o : null) && (wVar = this.f120192x) != null) {
                MMWebView C2 = mo69079C();
                BaseWebViewController baseWebViewController6 = this.f120167D;
                if (baseWebViewController6 != null) {
                    str2 = baseWebViewController6.f117581o;
                }
                wVar.mo68891q(C2, str2);
            }
        }
        NestedBounceView nestedBounceView4 = this.f120181j;
        if (nestedBounceView4 != null) {
            nestedBounceView4.setBounce(!mo69080D().f119924j);
        }
        C44255f1 D2 = mo69080D();
        Activity activity2 = this.f120175d;
        D2.getClass();
        C87412m.m108594g(activity2, "context");
        D2.f119920f = new WeakReference<>(activity2);
        C44255f1 D3 = mo69080D();
        D3.getClass();
        D3.f119921g = new WeakReference<>(this);
        BaseWebViewController baseWebViewController7 = this.f120167D;
        if (!(baseWebViewController7 == null || (g0 = baseWebViewController7.mo67720g0()) == null)) {
            g0.f130008m = mo69080D();
        }
        if (mo69079C().getPaddingBottom() > 0) {
            mo69078B(0);
        }
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout6 = this.f120180i;
        if (webViewKeyboardLinearLayout6 != null) {
            webViewKeyboardLinearLayout6.setOnkbdStateListener(new C44352o0(webViewKeyboardLinearLayout6, this));
        }
    }
}
