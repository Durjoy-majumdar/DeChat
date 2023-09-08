package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44067e;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44075l;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.MPVideoPlayFullScreenView;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p170ic.C46213g;
import qo3.C77398g;
import rx3.C13598b0;
import s90.C48300n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0 */
public class WebViewUI$$j0 extends WebChromeClient {

    /* renamed from: a */
    public C43758q f118613a = new C43758q();

    /* renamed from: b */
    public C77398g f118614b = null;

    /* renamed from: c */
    public final /* synthetic */ WebViewUI f118615c;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$a */
    public class C43814a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f118616d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118617e;

        public C43814a(String str, JsResult jsResult) {
            this.f118616d = str;
            this.f118617e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(11683, this.f118616d, 1, Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
            this.f118617e.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            Log.m105925i("MicroMsg.WebViewUI", "onJsConfirm cancel and finish %d", Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
            WebViewUI$$j0.this.f118615c.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$b */
    public class C43815b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118619d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118620e;

        public C43815b(PBool pBool, JsResult jsResult) {
            this.f118619d = pBool;
            this.f118620e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f118619d.value = true;
            this.f118620e.confirm();
            Log.m105925i("MicroMsg.WebViewUI", "onJsConfirm confirm %d", Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$c */
    public class C43816c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118622d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118623e;

        public C43816c(PBool pBool, JsResult jsResult) {
            this.f118622d = pBool;
            this.f118623e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f118622d.value = true;
            this.f118623e.confirm();
            Log.m105925i("MicroMsg.WebViewUI", "onJsConfirm confirm %d", Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$d */
    public class C43817d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f118625d;

        public C43817d(JsResult jsResult) {
            this.f118625d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f118625d.cancel();
            Log.m105925i("MicroMsg.WebViewUI", "onJsConfirm cancel %d", Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$e */
    public class C43818e implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118627d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118628e;

        public C43818e(PBool pBool, JsResult jsResult) {
            this.f118627d = pBool;
            this.f118628e = jsResult;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105925i("MicroMsg.WebViewUI", "onJsConfirm, onDismiss %d, %b", Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1), Boolean.valueOf(this.f118627d.value));
            if (!this.f118627d.value) {
                this.f118628e.cancel();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$f */
    public class C43819f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f118630d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118631e;

        public C43819f(String str, JsResult jsResult) {
            this.f118630d = str;
            this.f118631e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WebViewUI", "onJsAlert, onClose");
            C115669n.INSTANCE.mo160131h(11683, this.f118630d, 1, Integer.valueOf(WebViewUI$$j0.this.f118615c.f118570v1));
            this.f118631e.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            WebViewUI$$j0.this.f118615c.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$g */
    public class C43820g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118633d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118634e;

        public C43820g(WebViewUI$$j0 webViewUI$$j0, PBool pBool, JsResult jsResult) {
            this.f118633d = pBool;
            this.f118634e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WebViewUI", "onJsAlert, onConfirm");
            this.f118633d.value = true;
            this.f118634e.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$h */
    public class C43821h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118635d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118636e;

        public C43821h(WebViewUI$$j0 webViewUI$$j0, PBool pBool, JsResult jsResult) {
            this.f118635d = pBool;
            this.f118636e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WebViewUI", "onJsAlert, onConfirm");
            this.f118635d.value = true;
            this.f118636e.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0$i */
    public class C43822i implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f118637d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f118638e;

        public C43822i(WebViewUI$$j0 webViewUI$$j0, PBool pBool, JsResult jsResult) {
            this.f118637d = pBool;
            this.f118638e = jsResult;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WebViewUI", "onJsAlert, onDismiss");
            if (!this.f118637d.value) {
                this.f118638e.cancel();
            }
        }
    }

    public WebViewUI$$j0(WebViewUI webViewUI) {
        this.f118615c = webViewUI;
    }

    public View getVideoLoadingProgressView() {
        WebViewUI webViewUI = this.f118615c;
        if (webViewUI.f118488S0 == null) {
            webViewUI.f118488S0 = new ProgressBar(this.f118615c);
            this.f118615c.f118488S0.setIndeterminate(true);
        }
        return this.f118615c.f118488S0;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C46213g.m51505a(consoleMessage, "MicroMsg.WebViewUI", false);
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onEnterFullscreen(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        MMWebView mMWebView;
        this.f118615c.mo68283g9(true);
        C103928o.m138641a(true, true, false);
        if (this.f118615c.mo68272b8().f147522b) {
            MPVideoPlayFullScreenView m8 = this.f118615c.mo68294m8();
            Context context = m8.getContext();
            if ((context instanceof WebViewUI) && (mMWebView = ((WebViewUI) context).f118523f) != null) {
                m8.f119373y = mMWebView.setVideoJsCallback(new C44067e(m8));
            }
            if (m8.f119373y != null) {
                this.f118615c.f118568u2 = customViewCallback;
                Log.m105924i("MicroMsg.WebViewUI", "onEnterFullscreen view");
                if (view.getParent() == null) {
                    MPVideoPlayFullScreenView m84 = this.f118615c.mo68294m8();
                    synchronized (m84) {
                        m84.mo68671l();
                        m84.f119356g.removeAllViews();
                        Context context2 = m84.getContext();
                        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                        ((WebViewUI) context2).setMMOrientation();
                        m84.mo68668i(true);
                        View view2 = m84.f119354e;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        m84.f119354e.setBackgroundColor(-16777216);
                        m84.setVisibility(0);
                        FrameLayout frameLayout = new FrameLayout(m84.getContext());
                        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
                        m84.f119357h = frameLayout;
                        ViewGroup viewGroup = m84.f119356g;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(15);
                        C13598b0 b0Var = C13598b0.f38549a;
                        viewGroup.addView(frameLayout, layoutParams);
                        m84.mo68667h();
                        m84.f119349T = false;
                        Log.m105918d(m84.f119353d, "addVideoView");
                        m84.f119345P = true;
                        m84.mo68659e();
                    }
                }
                return true;
            }
        }
        if (this.f118615c.mo68272b8().f147522b) {
            this.f118615c.mo68272b8().mo73623a(false);
        }
        return super.onEnterFullscreen(view, customViewCallback);
    }

    public boolean onExitFullscreen() {
        this.f118615c.mo68283g9(false);
        C103928o.m138641a(false, true, false);
        return super.onExitFullscreen();
    }

    public void onExitFullscreenVideo(Bitmap bitmap) {
        C45059m0 m0Var;
        WebViewUI webViewUI = this.f118615c;
        if (webViewUI.f118508Z != null && webViewUI.mo68272b8().f147522b && this.f118615c.mo68294m8().getVisibility() == 0) {
            WebChromeClient.CustomViewCallback customViewCallback = this.f118615c.f118568u2;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            boolean z = false;
            this.f118615c.mo68272b8().mo73623a(false);
            MPVideoPlayFullScreenView m8 = this.f118615c.mo68294m8();
            if (m8.f119349T) {
                Log.m105924i(m8.f119353d, "isRunningExitAnimation");
            } else if (m8.f119371x == null) {
                Log.m105924i(m8.f119353d, "runExitAnimation mpShareVideoInfo is null, just exit");
                m8.mo68660f();
            } else {
                m8.mo68674o();
                if (bitmap != null && !bitmap.isRecycled()) {
                    ImageView imageView = new ImageView(m8.getContext());
                    ViewGroup viewGroup = m8.f119357h;
                    if (viewGroup != null) {
                        viewGroup.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                    }
                    imageView.setImageBitmap(bitmap);
                }
                Log.m105924i(m8.f119353d, "runExitAnimation");
                m8.mo68677p();
                int width = m8.f119354e.getWidth();
                int height = m8.f119354e.getHeight();
                C45059m0 m0Var2 = m8.f119333C;
                if (m0Var2 != null) {
                    m0Var2.f122226f = width;
                    m0Var2.f122227g = height;
                }
                if (m0Var2 != null) {
                    C48300n nVar = m8.f119371x;
                    C87412m.m108591d(nVar);
                    int i = nVar.f129344u;
                    C48300n nVar2 = m8.f119371x;
                    C87412m.m108591d(nVar2);
                    int i2 = nVar2.f129345v;
                    C48300n nVar3 = m8.f119371x;
                    C87412m.m108591d(nVar3);
                    int i3 = nVar3.f129346w;
                    C48300n nVar4 = m8.f119371x;
                    C87412m.m108591d(nVar4);
                    m0Var2.mo70410e(i, i2, i3, nVar4.f129347x);
                }
                float f = m8.f119348S;
                if (((double) f) == 1.0d) {
                    z = true;
                }
                if (!z && (m0Var = m8.f119333C) != null) {
                    m0Var.f122234n = ((float) 1) / f;
                }
                ViewGroup.LayoutParams layoutParams = m8.f119354e.getLayoutParams();
                C45059m0 m0Var3 = m8.f119333C;
                if (m0Var3 != null) {
                    m0Var3.mo70409d(m8.f119357h, m8.f119354e, new C44075l(m8, (C45059m0.C45068i) null, layoutParams), (C45059m0.C45066g) null);
                }
            }
            WebViewUIStyleHelper webViewUIStyleHelper = this.f118615c.f118477N1;
            if (webViewUIStyleHelper != null) {
                webViewUIStyleHelper.mo68381m();
            }
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C43758q qVar = this.f118613a;
        WebViewUI webViewUI = this.f118615c;
        qVar.mo68071h(webViewUI, webViewUI.getCurrentURL(), this.f118615c.mo6901n0(), this.f118615c.f118513b1.mo67758z(), this.f118615c.getIntent().getStringExtra("geta8key_username"), str, callback);
    }

    public void onHideCustomView() {
        Log.m105924i("MicroMsg.WebViewUI", "onHideCustomView, sdk int = " + Build.VERSION.SDK_INT);
        this.f118615c.getContext().getWindow().clearFlags(128);
        WebViewUI webViewUI = this.f118615c;
        if (webViewUI.f118482Q0 != null) {
            try {
                webViewUI.mo68288i9(webViewUI.mo68256S8());
                if (!this.f118615c.f118523f.isXWalkKernel()) {
                    this.f118615c.f118523f.setVisibility(0);
                    this.f118615c.setTitleVisibility(0);
                } else {
                    this.f118615c.fullScreenNoTitleBar(false);
                    WebViewUI webViewUI2 = this.f118615c;
                    webViewUI2.mo68299o9(webViewUI2.getResources().getColor(C0966R.color.aea));
                    WebViewUI webViewUI3 = this.f118615c;
                    if (webViewUI3.f118519d2 != null) {
                        this.f118615c.mo68290j9(webViewUI3.mo68287i8());
                    }
                }
                WebViewUI webViewUI4 = this.f118615c;
                FrameLayout frameLayout = webViewUI4.f118579y;
                if (frameLayout != null) {
                    frameLayout.removeView(webViewUI4.f118482Q0);
                }
                WebViewUI webViewUI5 = this.f118615c;
                webViewUI5.f118482Q0 = null;
                WebChromeClient.CustomViewCallback customViewCallback = webViewUI5.f118580y0;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
                this.f118615c.mo68283g9(false);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewUI", "onHideCustomView error " + e.getMessage());
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        JsResult jsResult2 = jsResult;
        Log.m105924i("MicroMsg.WebViewUI", "onJsAlert");
        PBool pBool = new PBool();
        pBool.value = false;
        if (this.f118615c.isFinishing() || this.f118615c.activityHasDestroyed()) {
            Log.m105918d("MicroMsg.WebViewUI", "onJsAlert finish");
            jsResult.cancel();
            return true;
        }
        WebViewUI webViewUI = this.f118615c;
        int i = webViewUI.f118570v1 + 1;
        webViewUI.f118570v1 = i;
        if (i > 2) {
            this.f118614b = C76879j.m92708B(webViewUI, str2, "", webViewUI.getString(C0966R.string.lly), this.f118615c.getString(C0966R.string.a18), new C43819f(str, jsResult2), new C43820g(this, pBool, jsResult2), C0966R.color.a1d);
            String str3 = str2;
        } else {
            String str4 = str;
            this.f118614b = C76879j.m92754y(webViewUI, str2, "", webViewUI.getString(C0966R.string.a18), new C43821h(this, pBool, jsResult2));
        }
        C77398g gVar = this.f118614b;
        if (gVar == null) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        gVar.setOnDismissListener(new C43822i(this, pBool, jsResult2));
        this.f118614b.setCanceledOnTouchOutside(false);
        this.f118614b.mo107530l(false);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        JsResult jsResult2 = jsResult;
        Log.m105924i("MicroMsg.WebViewUI", "onJsConfirm");
        PBool pBool = new PBool();
        pBool.value = false;
        if (this.f118615c.isFinishing() || this.f118615c.activityHasDestroyed()) {
            Log.m105924i("MicroMsg.WebViewUI", "onJsConfirm finish");
            jsResult.cancel();
            return true;
        }
        WebViewUI webViewUI = this.f118615c;
        int i = webViewUI.f118570v1 + 1;
        webViewUI.f118570v1 = i;
        if (i > 2) {
            this.f118614b = C76879j.m92708B(webViewUI, str2, "", webViewUI.getString(C0966R.string.lly), this.f118615c.getString(C0966R.string.a18), new C43814a(str, jsResult2), new C43815b(pBool, jsResult2), C0966R.color.f3169hp);
        } else {
            String str3 = str;
            this.f118614b = C76879j.m92717K(webViewUI.getContext(), false, str2, "", this.f118615c.getString(C0966R.string.a18), this.f118615c.getString(C0966R.string.f7926wf), new C43816c(pBool, jsResult2), new C43817d(jsResult2));
        }
        C77398g gVar = this.f118614b;
        if (gVar == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        gVar.setOnDismissListener(new C43818e(pBool, jsResult2));
        this.f118614b.setCancelable(false);
        this.f118614b.setCanceledOnTouchOutside(false);
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C43758q qVar = this.f118613a;
        WebViewUI webViewUI = this.f118615c;
        qVar.mo68072i(permissionRequest, webViewUI, webViewUI.getCurrentURL());
    }

    public void onProgressChanged(WebView webView, int i) {
        Log.m105919d("MicroMsg.WebViewUI", "onProgressChanged %d", Integer.valueOf(i));
    }

    public void onReceivedTitle(WebView webView, String str) {
        Log.m105925i("MicroMsg.WebViewUI", "onReceivedTitle#%s title = %s, loadurl = %s", Integer.valueOf(this.f118615c.mo68267Y7()), str, this.f118615c.f118513b1.f117597w);
        super.onReceivedTitle(webView, str);
        WebViewUI webViewUI = this.f118615c;
        if (webViewUI.f118517d && !webViewUI.f118520e) {
            Log.m105924i("MicroMsg.WebViewUI", "fixed title, ignore received title: " + str);
        } else if (webViewUI.f118484R) {
            if (Util.isNullOrNil(str)) {
                this.f118615c.setMMTitle("");
            } else if (Util.nullAsNil(this.f118615c.f118513b1.f117597w).endsWith(str)) {
                this.f118615c.setMMTitle("");
            } else if (!C6013c.m5892d(str) && !str.startsWith("about:blank")) {
                this.f118615c.setMMTitle(str);
            }
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Log.m105924i("MicroMsg.WebViewUI", "onShowCustomView, sdk int = " + Build.VERSION.SDK_INT);
        try {
            this.f118615c.getContext().getWindow().addFlags(128);
            WebViewUI webViewUI = this.f118615c;
            if (webViewUI.f118482Q0 != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            webViewUI.mo68288i9(false);
            WebViewUI webViewUI2 = this.f118615c;
            webViewUI2.f118482Q0 = view;
            webViewUI2.f118580y0 = customViewCallback;
            if (!webViewUI2.f118523f.isXWalkKernel()) {
                this.f118615c.f118523f.setVisibility(8);
                this.f118615c.f118579y.addView(view);
                this.f118615c.setTitleVisibility(4);
            } else {
                this.f118615c.f118579y.addView(view, 0);
                this.f118615c.fullScreenNoTitleBar(true);
                this.f118615c.mo68299o9(0);
                WebViewUI webViewUI3 = this.f118615c;
                if (webViewUI3.f118519d2 != null) {
                    webViewUI3.mo68290j9(0);
                }
            }
            this.f118615c.mo68283g9(true);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewUI", "onShowCustomView error " + e.getMessage());
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (fileChooserParams.getMode() != 0 && fileChooserParams.getMode() != 1) {
            return false;
        }
        if (fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length <= 0) {
            Log.m105924i("MicroMsg.WebViewUI", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
            return true;
        }
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        String str = fileChooserParams.isCaptureEnabled() ? "true" : "false";
        Log.m105925i("MicroMsg.WebViewUI", "onShowFileChooser mode: %d, catpure: %s", Integer.valueOf(fileChooserParams.getMode()), Boolean.valueOf(fileChooserParams.isCaptureEnabled()));
        WebViewUI webViewUI = this.f118615c;
        webViewUI.f118534i2.mo68060c(webViewUI, webViewUI.f118491T0, (ValueCallback<Uri>) null, valueCallback, acceptTypes, str, fileChooserParams.createIntent());
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        WebViewUI webViewUI = this.f118615c;
        webViewUI.f118534i2.mo68060c(webViewUI, webViewUI.f118491T0, valueCallback, (ValueCallback<Uri[]>) null, str != null ? str.split(",") : null, str2, (Intent) null);
    }
}
