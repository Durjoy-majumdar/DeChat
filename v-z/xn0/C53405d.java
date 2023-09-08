package xn0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import br0.C39836d;
import br0.C79778e;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.webview.modeltools.C43754j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44262h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import cr0.C45150a;
import d93.C45310h;
import fy3.C32224a;
import p225rc.C89916g;
import p225rc.g$$f;
import p225rc.g$$i;
import rq0.C90086e;

/* renamed from: xn0.d */
public class C53405d extends C44262h0 {

    /* renamed from: e */
    public final C40478h f150259e;

    /* renamed from: f */
    public final C32224a<C45310h> f150260f;

    /* renamed from: g */
    public final C43754j f150261g = new C53406a();

    /* renamed from: h */
    public final g$$f f150262h = new C53407b();

    /* renamed from: i */
    public final g$$i f150263i = new C53408c();

    /* renamed from: j */
    public C53411f f150264j;

    /* renamed from: k */
    public C83231l.C83234d f150265k;

    /* renamed from: xn0.d$a */
    public class C53406a extends C43754j {
        public C53406a() {
        }

        /* renamed from: b */
        public void mo68059b() {
            super.mo68059b();
            C53405d.this.mo74047c();
        }
    }

    /* renamed from: xn0.d$b */
    public class C53407b implements g$$f {
        public C53407b() {
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            Activity A0 = C53405d.this.f150259e.getPageView() != null ? C53405d.this.f150259e.getPageView().mo116146A0() : null;
            if (A0 == null || 201 != i) {
                return false;
            }
            C43754j jVar = C53405d.this.f150261g;
            if (jVar.f118229e == null) {
                if (i != 201) {
                    return false;
                }
                jVar.mo68063f(A0, i, i2, intent);
            }
            return true;
        }
    }

    /* renamed from: xn0.d$c */
    public class C53408c implements g$$i {
        public C53408c() {
        }

        /* renamed from: c */
        public void mo1686c(String[] strArr, int[] iArr) {
            Activity A0 = C53405d.this.f150259e.getPageView() != null ? C53405d.this.f150259e.getPageView().mo116146A0() : null;
            if (A0 != null) {
                C53405d.this.f150261g.mo68064g(A0, 119, strArr, iArr);
            }
        }
    }

    /* renamed from: xn0.d$d */
    public class C53409d extends C83231l.C83234d {
        public C53409d() {
        }

        /* renamed from: d */
        public void mo74048d() {
            C53405d.this.f150259e.getWebView().leaveFullscreen();
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            if (eVar == C83231l.C83235e.LAUNCH_MINI_PROGRAM) {
                C53405d.this.f150259e.getWebView().leaveFullscreen();
            }
        }
    }

    /* renamed from: xn0.d$e */
    public class C53410e implements Runnable {
        public C53410e() {
        }

        public void run() {
            if (C53405d.this.f150259e.getPageView().mo116151F0() != null) {
                C53405d.this.f150259e.getPageView().mo116151F0().mo62476d();
                C90086e eVar = (C90086e) C53405d.this.f150259e.getPageView().mo116150E0(C90086e.class);
                if (eVar != null) {
                    eVar.mo116463f((C79778e.C79779a) null);
                }
            }
        }
    }

    /* renamed from: xn0.d$f */
    public final class C53411f implements C45150a.C45151a {

        /* renamed from: a */
        public C45150a f150271a;

        public C53411f(C53406a aVar) {
        }

        /* renamed from: a */
        public boolean mo70655a(int i) {
            if (C53405d.this.f150259e.getPageView().mo116151F0() == null) {
                return false;
            }
            C45150a aVar = this.f150271a;
            if (aVar != null) {
                aVar.mo70654N2(this);
            }
            C53405d.this.f150259e.getPageView().mo116151F0().mo62477e(C39836d.C39837a.m42626a(i));
            return true;
        }
    }

    public C53405d(MMWebView mMWebView, C40478h hVar, C32224a<C45310h> aVar) {
        super(mMWebView);
        this.f150259e = hVar;
        this.f150260f = aVar;
    }

    /* renamed from: a */
    public void mo68964a() {
        this.f150259e.mo63229G0();
    }

    /* renamed from: b */
    public final void mo74046b() {
        C89916g a;
        Activity A0 = this.f150259e.getPageView() != null ? this.f150259e.getPageView().mo116146A0() : null;
        if (A0 != null && (a = C89916g.m112446a(A0)) != null) {
            a.mo124232f(this.f150262h);
            g$$i g__i = this.f150263i;
            if (g__i != null) {
                a.f258380b.put(119, g__i);
            }
        }
    }

    /* renamed from: c */
    public final void mo74047c() {
        C89916g a;
        Activity A0 = this.f150259e.getPageView() != null ? this.f150259e.getPageView().mo116146A0() : null;
        if (A0 != null && (a = C89916g.m112446a(A0)) != null) {
            g$$f g__f = this.f150262h;
            if (g__f != null) {
                a.f258381c.remove(g__f);
            }
            if (this.f150263i != null) {
                a.f258380b.remove(119);
            }
        }
    }

    public boolean onEnterFullscreen(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f150259e.mo63251r1()) {
            if (this.f150264j == null) {
                this.f150264j = new C53411f((C53406a) null);
            }
            C53411f fVar = this.f150264j;
            Context context = this.f150259e.getPageView().getContext();
            fVar.getClass();
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
            if (castActivityOrNull instanceof C45150a) {
                C45150a aVar = (C45150a) castActivityOrNull;
                fVar.f150271a = aVar;
                aVar.mo70653K2(fVar);
            }
        }
        String appId = this.f150259e.getAppId();
        C53409d dVar = new C53409d();
        this.f150265k = dVar;
        C83231l.m102140a(appId, dVar);
        return false;
    }

    public boolean onExitFullscreen() {
        C45150a aVar;
        C53411f fVar = this.f150264j;
        if (!(fVar == null || (aVar = fVar.f150271a) == null)) {
            aVar.mo70654N2(fVar);
        }
        C83231l.m102144e(this.f150259e.getAppId(), this.f150265k);
        this.f150259e.post(new C53410e());
        return false;
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f150259e.mo63244h1(str);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C45310h invoke = this.f150260f.invoke();
        Activity A0 = this.f150259e.getPageView() != null ? this.f150259e.getPageView().mo116146A0() : null;
        if (!(invoke == null || A0 == null)) {
            if (fileChooserParams.getMode() != 0 && fileChooserParams.getMode() != 1) {
                return false;
            }
            if (fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length <= 0) {
                Log.m105924i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
            } else {
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                String str = fileChooserParams.isCaptureEnabled() ? "true" : "false";
                Log.m105925i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", Integer.valueOf(fileChooserParams.getMode()), Boolean.valueOf(fileChooserParams.isCaptureEnabled()));
                mo74046b();
                this.f150261g.mo68060c(A0, invoke, (ValueCallback<Uri>) null, valueCallback, acceptTypes, str, fileChooserParams.createIntent());
                return true;
            }
        }
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C45310h invoke = this.f150260f.invoke();
        Activity A0 = this.f150259e.getPageView() != null ? this.f150259e.getPageView().mo116146A0() : null;
        if (invoke != null && A0 != null) {
            mo74046b();
            this.f150261g.mo68060c(A0, invoke, valueCallback, (ValueCallback<Uri[]>) null, str != null ? str.split(",") : null, str2, (Intent) null);
        }
    }
}
