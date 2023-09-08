package com.tencent.p014mm.plugin.finder.webview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import e00.C45520t;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.UUID;
import o40.C61926c;
import rs1.C48079eb;
import rx3.C13598b0;
import te3.C52267zi;
import zs1.C53810h;
import zs1.C53812i;
import zs1.C53815m;
import zs1.C53817n;

/* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper */
public final class FinderWebViewScrollViewWrapper implements C41646v {

    /* renamed from: m */
    public static boolean f111982m;

    /* renamed from: a */
    public final Context f111983a;

    /* renamed from: b */
    public final C53810h f111984b;

    /* renamed from: c */
    public MMWebView f111985c;

    /* renamed from: d */
    public boolean f111986d;

    /* renamed from: e */
    public boolean f111987e;

    /* renamed from: f */
    public boolean f111988f;

    /* renamed from: g */
    public MMActivity f111989g;

    /* renamed from: h */
    public boolean f111990h;

    /* renamed from: i */
    public DialogInterface.OnDismissListener f111991i;

    /* renamed from: j */
    public final C53815m f111992j;

    /* renamed from: k */
    public final C41647w f111993k;

    /* renamed from: l */
    public final FinderWebViewScrollViewWrapper$lifecycleObserver$1 f111994l;

    public FinderWebViewScrollViewWrapper(Context context, String str, C53810h hVar, int i, String str2) {
        C45520t controller;
        MMWebView mMWebView;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(hVar, "dialog");
        this.f111983a = context;
        this.f111984b = hVar;
        C53815m mVar = new C53815m(this);
        this.f111992j = mVar;
        C52267zi ziVar = new C52267zi();
        ziVar.f145967e = UUID.randomUUID().toString();
        ziVar.f145968f = str;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderWebViewHelper finderWebViewHelper = new FinderWebViewHelper(context, ziVar, (Window) null, i, 4, (C8480h) null);
        finderWebViewHelper.setDialogWindow(hVar.getWindow());
        MultiCodeMaskView multiCodeMaskView = mVar.f151026i;
        if (multiCodeMaskView != null) {
            finderWebViewHelper.setCodeMaskView(multiCodeMaskView);
            finderWebViewHelper.getWebViewEnv().f112084d = str2;
            this.f111993k = finderWebViewHelper;
            FinderWebViewScrollViewWrapper$lifecycleObserver$1 finderWebViewScrollViewWrapper$lifecycleObserver$1 = new FinderWebViewScrollViewWrapper$lifecycleObserver$1(this);
            this.f111994l = finderWebViewScrollViewWrapper$lifecycleObserver$1;
            finderWebViewHelper.addWebViewStateListener(new C41642r(this));
            this.f111985c = finderWebViewHelper.getWithInitWebView();
            if (!(((C48079eb) C39818r.f106831a.mo62443b(context).mo62449e(C48079eb.class)) == null || !(context instanceof Activity) || (controller = finderWebViewHelper.getController()) == null || (mMWebView = this.f111985c) == null)) {
                mMWebView.setWebChromeClient(new C41635k(new WeakReference(context), new WeakReference(controller)));
            }
            C61926c.m72668M(new C41643s(this));
            hVar.setOnDismissListener(new C41640p(this));
            MMWebView mMWebView2 = this.f111985c;
            C87412m.m108591d(mMWebView2);
            mVar.f151021d = mMWebView2;
            mMWebView2.f122362o.add(new C53817n(mVar));
            RelativeInterceptScrollLayout relativeInterceptScrollLayout = mVar.f151020c;
            if (relativeInterceptScrollLayout != null) {
                relativeInterceptScrollLayout.addView(mVar.f151021d, new RelativeLayout.LayoutParams(-1, -2));
                MMWebView mMWebView3 = mVar.f151021d;
                if (mMWebView3 != null) {
                    mMWebView3.setWebViewCallbackClient(mVar.f151031n);
                }
                mVar.f151028k = new C41641q(this);
                C41644t tVar = new C41644t(this);
                if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                    mVar.f151030m = tVar;
                }
                if (context instanceof MMActivity) {
                    MMActivity mMActivity = (MMActivity) context;
                    this.f111989g = mMActivity;
                    mMActivity.getLifecycle().addObserver(finderWebViewScrollViewWrapper$lifecycleObserver$1);
                } else if (context instanceof MMFinderFragment) {
                    MMFinderFragment mMFinderFragment = (MMFinderFragment) context;
                    if (mMFinderFragment.getActivity() instanceof MMActivity) {
                        FragmentActivity activity = mMFinderFragment.getActivity();
                        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        this.f111989g = (MMActivity) activity;
                        FragmentActivity activity2 = mMFinderFragment.getActivity();
                        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((MMActivity) activity2).getLifecycle().addObserver(finderWebViewScrollViewWrapper$lifecycleObserver$1);
                    }
                }
                hVar.setCurScrollHeightListener(finderWebViewHelper.getScrollHeightListener());
                return;
            }
            C87412m.m108603p("mWebViewContainer");
            throw null;
        }
        C87412m.m108603p("codeMaskView");
        throw null;
    }

    /* renamed from: a */
    public C53812i mo64703a() {
        return this.f111984b;
    }

    /* renamed from: b */
    public final void mo64758b() {
        Window window;
        Log.m105924i("Finder.AdCenterDialog", "realShow");
        C53810h hVar = this.f111984b;
        hVar.getClass();
        Log.m105924i("Finder.FinderScrollDialog", "show");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        Context context = hVar.getContext();
        FrameLayout frameLayout = null;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        KeyEvent.Callback decorView = (mMActivity == null || (window = mMActivity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof FrameLayout) {
            frameLayout = (FrameLayout) decorView;
        }
        if (frameLayout != null) {
            frameLayout.addView(hVar, layoutParams);
        }
        f111982m = true;
    }

    /* renamed from: c */
    public void mo64759c() {
        Log.m105925i("Finder.AdCenterDialog", "showDialog showAfterWebViewReady: %b, webViewReady: %b", Boolean.valueOf(this.f111988f), Boolean.valueOf(this.f111986d));
        if (!this.f111988f) {
            mo64758b();
        } else if (!this.f111986d) {
            this.f111987e = true;
        } else {
            mo64758b();
        }
    }
}
