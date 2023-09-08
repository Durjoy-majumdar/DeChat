package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0 */
public class C44262h0 extends WebChromeClient {

    /* renamed from: a */
    public int f119944a = 0;

    /* renamed from: b */
    public MMWebView f119945b;

    /* renamed from: c */
    public C43758q f119946c = new C43758q();

    /* renamed from: d */
    public final ConcurrentSkipListSet<JsResult> f119947d = new ConcurrentSkipListSet<>(new C44264b(this));

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$a */
    public class C44263a implements C76879j.C47267l {

        /* renamed from: a */
        public final /* synthetic */ JsPromptResult f119948a;

        public C44263a(C44262h0 h0Var, JsPromptResult jsPromptResult) {
            this.f119948a = jsPromptResult;
        }

        public boolean onFinish(CharSequence charSequence) {
            this.f119948a.confirm(String.valueOf(charSequence));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$b */
    public class C44264b implements Comparator<JsResult> {
        public C44264b(C44262h0 h0Var) {
        }

        public int compare(Object obj, Object obj2) {
            return ((JsResult) obj).hashCode() - ((JsResult) obj2).hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$c */
    public class C44265c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119949d;

        public C44265c(JsResult jsResult) {
            this.f119949d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119949d.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C44262h0.this.mo68964a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$d */
    public class C44266d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119951d;

        public C44266d(C44262h0 h0Var, JsResult jsResult) {
            this.f119951d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119951d.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$e */
    public class C44267e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119952d;

        public C44267e(C44262h0 h0Var, JsResult jsResult) {
            this.f119952d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119952d.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$f */
    public class C44268f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119953d;

        public C44268f(JsResult jsResult) {
            this.f119953d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119953d.cancel();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C44262h0.this.mo68964a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$g */
    public class C44269g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119955d;

        public C44269g(C44262h0 h0Var, JsResult jsResult) {
            this.f119955d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119955d.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$h */
    public class C44270h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119956d;

        public C44270h(C44262h0 h0Var, JsResult jsResult) {
            this.f119956d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119956d.confirm();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h0$i */
    public class C44271i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JsResult f119957d;

        public C44271i(C44262h0 h0Var, JsResult jsResult) {
            this.f119957d = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f119957d.cancel();
        }
    }

    public C44262h0(MMWebView mMWebView) {
        this.f119945b = mMWebView;
    }

    /* renamed from: a */
    public void mo68964a() {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull != null) {
            castActivityOrNull.finish();
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull == null) {
            Log.m105921e("MicroMsg.WebView.MMWebChromeClient", "onGeolocationPermissionsShowPrompt with origin(%s) NULL activity, return denial", str);
            callback.invoke(str, false, false);
            return;
        }
        this.f119946c.mo68071h(castActivityOrNull, this.f119945b.getUrl(), "", this.f119945b.f122357g, "", str, callback);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C77398g gVar;
        String str3 = str;
        String str4 = str2;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull == null) {
            Log.m105921e("MicroMsg.WebView.MMWebChromeClient", "onJsAlert with url(%s) message(%s), NULL activity, return cancel", str3, str4);
            jsResult.cancel();
            return true;
        }
        C44281i0 i0Var = new C44281i0(this, jsResult);
        int i = this.f119944a + 1;
        this.f119944a = i;
        if (i > 2) {
            gVar = C76879j.m92708B(castActivityOrNull, str2, "", castActivityOrNull.getString(C0966R.string.lly), castActivityOrNull.getString(C0966R.string.a18), new C44265c(i0Var), new C44266d(this, i0Var), C0966R.color.a1d);
        } else {
            gVar = C76879j.m92754y(castActivityOrNull, str4, "", castActivityOrNull.getString(C0966R.string.a18), new C44267e(this, i0Var));
        }
        if (gVar == null) {
            return super.onJsAlert(webView, str3, str4, i0Var);
        }
        gVar.setCanceledOnTouchOutside(false);
        gVar.mo107530l(false);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C77398g gVar;
        String str3 = str;
        String str4 = str2;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull == null) {
            Log.m105921e("MicroMsg.WebView.MMWebChromeClient", "onJsConfirm with url(%s) message(%s), NULL activity, return cancel", str3, str4);
            jsResult.cancel();
            return true;
        }
        C44281i0 i0Var = new C44281i0(this, jsResult);
        int i = this.f119944a + 1;
        this.f119944a = i;
        if (i > 2) {
            gVar = C76879j.m92708B(castActivityOrNull, str2, "", castActivityOrNull.getString(C0966R.string.lly), castActivityOrNull.getString(C0966R.string.a18), new C44268f(i0Var), new C44269g(this, i0Var), C0966R.color.f3169hp);
        } else {
            gVar = C76879j.m92717K(castActivityOrNull, false, str2, "", castActivityOrNull.getString(C0966R.string.a18), castActivityOrNull.getString(C0966R.string.f7926wf), new C44270h(this, i0Var), new C44271i(this, i0Var));
        }
        if (gVar == null) {
            return super.onJsConfirm(webView, str3, str4, i0Var);
        }
        gVar.setCancelable(false);
        gVar.setCanceledOnTouchOutside(false);
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull == null) {
            Log.m105921e("MicroMsg.WebView.MMWebChromeClient", "onJsPrompt with url(%s) message(%s), NULL activity, return cancel", str, str2);
            jsPromptResult.cancel();
            return true;
        }
        new C44281i0(this, jsPromptResult);
        C77398g N = C76879j.m92720N(castActivityOrNull, str2, str3, "", Integer.MAX_VALUE, new C44263a(this, jsPromptResult));
        if (N == null) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        N.setCancelable(false);
        N.setCanceledOnTouchOutside(false);
        return true;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f119945b.getContext());
        if (castActivityOrNull == null) {
            Log.m105920e("MicroMsg.WebView.MMWebChromeClient", "onPermissionRequest NULL activity");
            return;
        }
        this.f119946c.mo68072i(permissionRequest, castActivityOrNull, this.f119945b.getUrl());
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }
}
