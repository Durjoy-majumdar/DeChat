package vv1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WebView;
import fy3.C32224a;
import g83.C45900i;
import g83.C98092k;
import gy3.C87412m;
import gy3.C87413o;
import kv1.C99252h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u73.C14136q0;
import uv1.C65479a;
import uv1.C65480b;
import uv1.C65481c;
import uv1.C65483e;
import wv1.C53202d;
import wv1.C66200a;
import wv1.C66202c;
import wv1.C66203e;
import yb2.C15946a;

/* renamed from: vv1.b */
public final class C65887b extends C15946a implements C65886a {

    /* renamed from: d */
    public final C13601g f189441d;

    /* renamed from: e */
    public final C13601g f189442e;

    /* renamed from: f */
    public final C13601g f189443f;

    /* renamed from: g */
    public final C13601g f189444g;

    /* renamed from: h */
    public final C13601g f189445h = C36568h.m40985a(new C65893h(this));

    /* renamed from: i */
    public final C13601g f189446i;

    /* renamed from: vv1.b$a */
    public final class C52994a extends C45900i {
        public C52994a(C65887b bVar) {
            super(9);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C14136q0.m13472d(103, String.valueOf(C99252h.f291031d), String.valueOf(C99252h.f291030c), false, "", 0, "", false, String.valueOf(C99252h.f291031d));
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C14136q0.m13473e(103, String.valueOf(C99252h.f291031d), String.valueOf(C99252h.f291030c), false, "", 0, "", false, String.valueOf(C99252h.f291031d));
        }
    }

    /* renamed from: vv1.b$c */
    public static final class C52995c extends C87413o implements C32224a<KeyboardHeightProvider> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f147903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52995c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f147903d = appCompatActivity;
        }

        public Object invoke() {
            return new KeyboardHeightProvider(this.f147903d);
        }
    }

    /* renamed from: vv1.b$i */
    public static final class C52996i extends C87413o implements C32224a<WebSearchWebView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f147904d;

        /* renamed from: e */
        public final /* synthetic */ C65887b f147905e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52996i(AppCompatActivity appCompatActivity, C65887b bVar) {
            super(0);
            this.f147904d = appCompatActivity;
            this.f147905e = bVar;
        }

        public Object invoke() {
            WebSearchWebView webSearchWebView = new WebSearchWebView(this.f147904d);
            webSearchWebView.mo67633c0(new C53202d(), new C52994a(this.f147905e));
            return webSearchWebView;
        }
    }

    /* renamed from: vv1.b$j */
    public static final class C52997j extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f147906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52997j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f147906d = appCompatActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f147906d.findViewById(C0966R.C0970id.lm9);
        }
    }

    /* renamed from: vv1.b$b */
    public static final class C65888b extends C87413o implements C32224a<C66200a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f189447d;

        /* renamed from: e */
        public final /* synthetic */ C65887b f189448e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65888b(AppCompatActivity appCompatActivity, C65887b bVar) {
            super(0);
            this.f189447d = appCompatActivity;
            this.f189448e = bVar;
        }

        public Object invoke() {
            return new C66200a(this.f189447d, (C66202c) ((C36570n) this.f189448e.f189443f).getValue());
        }
    }

    /* renamed from: vv1.b$d */
    public static final class C65889d<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C65887b f189449d;

        public C65889d(C65887b bVar) {
            this.f189449d = bVar;
        }

        public void onChanged(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            if (((C65480b) aVar.checkAction(C65480b.class)) != null) {
                C65887b bVar = this.f189449d;
                bVar.mo89942y0().addJavascriptInterface(bVar.mo89941h2(), "ftsJSApi");
                ((FrameLayout) ((C36570n) bVar.f189446i).getValue()).addView(bVar.mo89942y0(), new FrameLayout.LayoutParams(-1, -1));
                bVar.mo89942y0().setBackgroundColor(bVar.getResources().getColor(C0966R.color.f3490v1));
                bVar.mo89942y0().loadUrl(aVar.f188433d);
                Log.m105924i("MicroMsg.FTS.FTSHotSearchUIC", "load url " + aVar.f188433d);
                WebSearchWebView y0 = bVar.mo89942y0();
                y0.f122362o.add(new C52998c(bVar));
            }
            C65483e eVar = (C65483e) aVar.checkAction(C65483e.class);
            if (eVar != null) {
                C65887b bVar2 = this.f189449d;
                if (eVar.f188436a) {
                    ((FrameLayout) ((C36570n) bVar2.f189446i).getValue()).setVisibility(0);
                } else {
                    ((FrameLayout) ((C36570n) bVar2.f189446i).getValue()).setVisibility(8);
                }
            }
        }
    }

    /* renamed from: vv1.b$e */
    public static final class C65890e implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ C65887b f189450d;

        public C65890e(C65887b bVar) {
            this.f189450d = bVar;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            Log.m105924i("MicroMsg.FTS.FTSHotSearchUIC", "onKeyboardHeight height:" + i + " isResized:" + z);
            ((C66202c) ((C36570n) this.f189450d.f189443f).getValue()).f190244e = i;
            UIStateCenter e3 = this.f189450d.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C65481c(i));
            }
        }
    }

    /* renamed from: vv1.b$f */
    public static final class C65891f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65887b f189451d;

        public C65891f(C65887b bVar) {
            this.f189451d = bVar;
        }

        public final void run() {
            this.f189451d.mo89943g3().mo104022e();
        }
    }

    /* renamed from: vv1.b$g */
    public static final class C65892g extends C87413o implements C32224a<C66202c> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f189452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65892g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f189452d = appCompatActivity;
        }

        public Object invoke() {
            return new C66202c(this.f189452d);
        }
    }

    /* renamed from: vv1.b$h */
    public static final class C65893h extends C87413o implements C32224a<C66203e> {

        /* renamed from: d */
        public final /* synthetic */ C65887b f189453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65893h(C65887b bVar) {
            super(0);
            this.f189453d = bVar;
        }

        public Object invoke() {
            return new C66203e((C66202c) ((C36570n) this.f189453d.f189443f).getValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65887b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f189441d = C36568h.m40985a(new C52996i(appCompatActivity, this));
        this.f189442e = C36568h.m40985a(new C52995c(appCompatActivity));
        this.f189443f = C36568h.m40985a(new C65892g(appCompatActivity));
        this.f189444g = C36568h.m40985a(new C65888b(appCompatActivity, this));
        this.f189446i = C36568h.m40985a(new C52997j(appCompatActivity));
    }

    /* renamed from: c */
    public C98092k mo89940c() {
        return (C66203e) ((C36570n) this.f189445h).getValue();
    }

    /* renamed from: g3 */
    public final KeyboardHeightProvider mo89943g3() {
        return (KeyboardHeightProvider) ((C36570n) this.f189442e).getValue();
    }

    /* renamed from: h2 */
    public C66200a mo89941h2() {
        return (C66200a) ((C36570n) this.f189444g).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C93938f0.m118697e()) {
            mo89941h2().mo90295r("onCreate", "");
            UIStateCenter e3 = mo14599e3();
            if (e3 != null) {
                e3.observe((C0125s) getActivity(), new C65889d(this));
            }
            C14136q0.m13469a(103, String.valueOf(C99252h.f291031d), String.valueOf(C99252h.f291030c), false, "", 0, "", false, "");
            return;
        }
        ((FrameLayout) ((C36570n) this.f189446i).getValue()).setVisibility(8);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        mo89943g3().f220015b = new C65890e(this);
    }

    public void onDestroy() {
        if (C93938f0.m118697e()) {
            ((C66203e) ((C36570n) this.f189445h).getValue()).mo126345e();
            mo89942y0().removeJavascriptInterface("ftsJSApi");
            mo89942y0().destroy();
        }
        mo89943g3().mo104021d();
        mo89943g3().f220015b = null;
    }

    public void onPause() {
        super.onPause();
        if (C93938f0.m118697e()) {
            mo89941h2().mo90295r("onPause", "");
        }
        mo89943g3().mo104021d();
    }

    public void onResume() {
        super.onResume();
        if (C93938f0.m118697e()) {
            mo89941h2().mo90295r("onResume", "");
        }
        getRootView().post(new C65891f(this));
    }

    /* renamed from: y0 */
    public WebSearchWebView mo89942y0() {
        return (WebSearchWebView) ((C36570n) this.f189441d).getValue();
    }
}
