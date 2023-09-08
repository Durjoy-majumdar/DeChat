package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import e00.C45517q0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import nj3.C76879j;
import p170ic.C46213g;
import p248ug.C52572q0;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a */
public final class C44224a extends WebChromeClient {

    /* renamed from: a */
    public final WeakReference<Activity> f119854a;

    /* renamed from: b */
    public final WeakReference<BaseWebViewController> f119855b;

    /* renamed from: c */
    public final WeakReference<C44363v> f119856c;

    /* renamed from: d */
    public int f119857d;

    /* renamed from: e */
    public final C45517q0 f119858e = ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71617t3();

    /* renamed from: f */
    public C77398g f119859f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$a */
    public static final class C44225a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f119860d;

        /* renamed from: e */
        public final /* synthetic */ C44224a f119861e;

        /* renamed from: f */
        public final /* synthetic */ JsResult f119862f;

        public C44225a(String str, C44224a aVar, JsResult jsResult) {
            this.f119860d = str;
            this.f119861e = aVar;
            this.f119862f = jsResult;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.CommWebChromeClient", "onJsAlert, onClose");
            C115669n.INSTANCE.mo160131h(11683, this.f119860d, 1, Integer.valueOf(this.f119861e.f119857d));
            this.f119862f.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            Activity a = this.f119861e.mo68930a();
            C87412m.m108591d(a);
            a.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$b */
    public static final class C44226b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f119863d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f119864e;

        public C44226b(PBool pBool, JsResult jsResult) {
            this.f119863d = pBool;
            this.f119864e = jsResult;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.CommWebChromeClient", "onJsAlert, onConfirm");
            this.f119863d.value = true;
            this.f119864e.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$c */
    public static final class C44227c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f119865d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f119866e;

        public C44227c(PBool pBool, JsResult jsResult) {
            this.f119865d = pBool;
            this.f119866e = jsResult;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.CommWebChromeClient", "onJsAlert, onConfirm");
            this.f119865d.value = true;
            this.f119866e.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$d */
    public static final class C44228d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f119867d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f119868e;

        public C44228d(PBool pBool, JsResult jsResult) {
            this.f119867d = pBool;
            this.f119868e = jsResult;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.CommWebChromeClient", "onJsAlert, onDismiss");
            if (!this.f119867d.value) {
                this.f119868e.cancel();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$e */
    public static final class C44229e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f119869d;

        /* renamed from: e */
        public final /* synthetic */ C44224a f119870e;

        /* renamed from: f */
        public final /* synthetic */ JsResult f119871f;

        public C44229e(String str, C44224a aVar, JsResult jsResult) {
            this.f119869d = str;
            this.f119870e = aVar;
            this.f119871f = jsResult;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(11683, this.f119869d, 1, Integer.valueOf(this.f119870e.f119857d));
            this.f119871f.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            Log.m105925i("MicroMsg.CommWebChromeClient", "onJsConfirm cancel and finish %d", Integer.valueOf(this.f119870e.f119857d));
            Activity a = this.f119870e.mo68930a();
            C87412m.m108591d(a);
            a.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$f */
    public static final class C44230f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f119872d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f119873e;

        /* renamed from: f */
        public final /* synthetic */ C44224a f119874f;

        public C44230f(PBool pBool, JsResult jsResult, C44224a aVar) {
            this.f119872d = pBool;
            this.f119873e = jsResult;
            this.f119874f = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119872d.value = true;
            this.f119873e.confirm();
            Log.m105925i("MicroMsg.CommWebChromeClient", "onJsConfirm confirm %d", Integer.valueOf(this.f119874f.f119857d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$g */
    public static final class C44231g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f119875d;

        /* renamed from: e */
        public final /* synthetic */ JsResult f119876e;

        /* renamed from: f */
        public final /* synthetic */ C44224a f119877f;

        public C44231g(PBool pBool, JsResult jsResult, C44224a aVar) {
            this.f119875d = pBool;
            this.f119876e = jsResult;
            this.f119877f = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119875d.value = true;
            this.f119876e.confirm();
            Log.m105925i("MicroMsg.CommWebChromeClient", "onJsConfirm confirm %d", Integer.valueOf(this.f119877f.f119857d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$h */
    public static final class C44232h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119878d;

        /* renamed from: e */
        public final /* synthetic */ C44224a f119879e;

        public C44232h(JsResult jsResult, C44224a aVar) {
            this.f119878d = jsResult;
            this.f119879e = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119878d.cancel();
            Log.m105925i("MicroMsg.CommWebChromeClient", "onJsConfirm cancel %d", Integer.valueOf(this.f119879e.f119857d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a$i */
    public static final class C44233i implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C44224a f119880d;

        /* renamed from: e */
        public final /* synthetic */ PBool f119881e;

        /* renamed from: f */
        public final /* synthetic */ JsResult f119882f;

        public C44233i(C44224a aVar, PBool pBool, JsResult jsResult) {
            this.f119880d = aVar;
            this.f119881e = pBool;
            this.f119882f = jsResult;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105925i("MicroMsg.CommWebChromeClient", "onJsConfirm, onDismiss %d, %b", Integer.valueOf(this.f119880d.f119857d), Boolean.valueOf(this.f119881e.value));
            if (!this.f119881e.value) {
                this.f119882f.cancel();
            }
        }
    }

    public C44224a(WeakReference<Activity> weakReference, WeakReference<BaseWebViewController> weakReference2, WeakReference<C44363v> weakReference3) {
        C87412m.m108594g(weakReference, "activityWeakRef");
        C87412m.m108594g(weakReference2, "controllerWeakRef");
        C87412m.m108594g(weakReference3, "commWebViewWeakRef");
        this.f119854a = weakReference;
        this.f119855b = weakReference2;
        this.f119856c = weakReference3;
    }

    /* renamed from: a */
    public final Activity mo68930a() {
        return this.f119854a.get();
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C87412m.m108594g(consoleMessage, StateEvent.Name.MESSAGE);
        C46213g.m51505a(consoleMessage, "MicroMsg.CommWebChromeClient", false);
        return super.onConsoleMessage(consoleMessage);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(callback, "callback");
        C45517q0 q0Var = this.f119858e;
        Activity a = mo68930a();
        C87412m.m108591d(a);
        BaseWebViewController baseWebViewController = this.f119855b.get();
        C87412m.m108591d(baseWebViewController);
        String currentUrl = baseWebViewController.getCurrentUrl();
        BaseWebViewController baseWebViewController2 = this.f119855b.get();
        C87412m.m108591d(baseWebViewController2);
        String n0 = baseWebViewController2.mo63683n0();
        BaseWebViewController baseWebViewController3 = this.f119855b.get();
        C87412m.m108591d(baseWebViewController3);
        int z = baseWebViewController3.mo67758z();
        Activity a2 = mo68930a();
        C87412m.m108591d(a2);
        ((C43758q) q0Var).mo68071h(a, currentUrl, n0, z, a2.getIntent().getStringExtra("geta8key_username"), str, callback);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        String str3 = str;
        String str4 = str2;
        JsResult jsResult2 = jsResult;
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str3, "url");
        C87412m.m108594g(str4, StateEvent.Name.MESSAGE);
        C87412m.m108594g(jsResult2, "result");
        Log.m105924i("MicroMsg.CommWebChromeClient", "onJsAlert");
        PBool pBool = new PBool();
        pBool.value = false;
        Activity a = mo68930a();
        C87412m.m108591d(a);
        if (a.isFinishing()) {
            Log.m105918d("MicroMsg.CommWebChromeClient", "onJsAlert finish");
            jsResult.cancel();
            return true;
        }
        int i = this.f119857d + 1;
        this.f119857d = i;
        if (i > 2) {
            Activity a2 = mo68930a();
            Activity a3 = mo68930a();
            C87412m.m108591d(a3);
            String string = a3.getString(C0966R.string.lly);
            Activity a4 = mo68930a();
            C87412m.m108591d(a4);
            this.f119859f = C76879j.m92708B(a2, str2, "", string, a4.getString(C0966R.string.a18), new C44225a(str3, this, jsResult2), new C44226b(pBool, jsResult2), C0966R.color.a1d);
        } else {
            Activity a5 = mo68930a();
            Activity a6 = mo68930a();
            C87412m.m108591d(a6);
            this.f119859f = C76879j.m92754y(a5, str4, "", a6.getString(C0966R.string.a18), new C44227c(pBool, jsResult2));
        }
        C77398g gVar = this.f119859f;
        if (gVar == null) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        C87412m.m108591d(gVar);
        gVar.setOnDismissListener(new C44228d(pBool, jsResult2));
        C77398g gVar2 = this.f119859f;
        C87412m.m108591d(gVar2);
        gVar2.setCanceledOnTouchOutside(false);
        C77398g gVar3 = this.f119859f;
        C87412m.m108591d(gVar3);
        gVar3.mo107530l(false);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        String str3 = str;
        JsResult jsResult2 = jsResult;
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str3, "url");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        C87412m.m108594g(jsResult2, "result");
        Log.m105924i("MicroMsg.CommWebChromeClient", "onJsConfirm");
        PBool pBool = new PBool();
        pBool.value = false;
        Activity a = mo68930a();
        C87412m.m108591d(a);
        if (a.isFinishing()) {
            Log.m105924i("MicroMsg.CommWebChromeClient", "onJsConfirm finish");
            jsResult.cancel();
            return true;
        }
        int i = this.f119857d + 1;
        this.f119857d = i;
        if (i > 2) {
            Activity a2 = mo68930a();
            Activity a3 = mo68930a();
            C87412m.m108591d(a3);
            String string = a3.getString(C0966R.string.lly);
            Activity a4 = mo68930a();
            C87412m.m108591d(a4);
            this.f119859f = C76879j.m92708B(a2, str2, "", string, a4.getString(C0966R.string.a18), new C44229e(str3, this, jsResult2), new C44230f(pBool, jsResult2, this), C0966R.color.f3169hp);
        } else {
            Activity a5 = mo68930a();
            Activity a6 = mo68930a();
            C87412m.m108591d(a6);
            String string2 = a6.getString(C0966R.string.a18);
            Activity a7 = mo68930a();
            C87412m.m108591d(a7);
            this.f119859f = C76879j.m92717K(a5, false, str2, "", string2, a7.getString(C0966R.string.f7926wf), new C44231g(pBool, jsResult2, this), new C44232h(jsResult2, this));
        }
        C77398g gVar = this.f119859f;
        if (gVar == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        C87412m.m108591d(gVar);
        gVar.setOnDismissListener(new C44233i(this, pBool, jsResult2));
        C77398g gVar2 = this.f119859f;
        C87412m.m108591d(gVar2);
        gVar2.setCancelable(false);
        C77398g gVar3 = this.f119859f;
        C87412m.m108591d(gVar3);
        gVar3.setCanceledOnTouchOutside(false);
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str3, "defaultValue");
        C87412m.m108594g(jsPromptResult, "result");
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C87412m.m108594g(permissionRequest, "request");
        C45517q0 q0Var = this.f119858e;
        Activity a = mo68930a();
        C87412m.m108591d(a);
        BaseWebViewController baseWebViewController = this.f119855b.get();
        C87412m.m108591d(baseWebViewController);
        ((C43758q) q0Var).mo68072i(permissionRequest, a, baseWebViewController.getCurrentUrl());
    }

    public void onReceivedTitle(WebView webView, String str) {
        C44363v vVar;
        super.onReceivedTitle(webView, str);
        WeakReference<C44363v> weakReference = this.f119856c;
        if (!(weakReference == null || (vVar = weakReference.get()) == null)) {
            vVar.mo68891q(webView, str);
        }
        WeakReference<BaseWebViewController> weakReference2 = this.f119855b;
        BaseWebViewController baseWebViewController = weakReference2 != null ? weakReference2.get() : null;
        if (baseWebViewController != null) {
            baseWebViewController.f117581o = str;
        }
    }
}
