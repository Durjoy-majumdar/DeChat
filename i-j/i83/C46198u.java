package i83;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.webkit.ValueCallback;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import c30.C26827e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ea3.C45600q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import rx3.C13604l;
import s24.C90125c;
import sx3.C90364q0;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;
import z04.C119027c;

/* renamed from: i83.u */
public final class C46198u implements C0125s {

    /* renamed from: d */
    public MMWebView f124524d;

    /* renamed from: e */
    public final String f124525e = "MicroMsg.WebTransPageLogic";

    /* renamed from: f */
    public String f124526f;

    /* renamed from: g */
    public final C46190l f124527g;

    /* renamed from: h */
    public final String f124528h;

    /* renamed from: i */
    public final String f124529i;

    /* renamed from: j */
    public boolean f124530j;

    /* renamed from: n */
    public C46178e f124531n;

    /* renamed from: o */
    public final C54219z<C46177b0> f124532o;

    /* renamed from: p */
    public C103766u f124533p;

    /* renamed from: q */
    public C53973z1 f124534q;

    /* renamed from: r */
    public final long f124535r;

    /* renamed from: s */
    public final int f124536s;

    /* renamed from: t */
    public int f124537t;

    /* renamed from: u */
    public final C45600q f124538u;

    /* renamed from: v */
    public C54219z<C46191m> f124539v;

    /* renamed from: i83.u$a */
    public static final class C46199a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C46198u f124540a;

        public C46199a(C46198u uVar) {
            this.f124540a = uVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i(this.f124540a.f124525e, "execute js success!");
        }
    }

    /* renamed from: i83.u$b */
    public static final class C46200b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C46198u f124541d;

        public C46200b(C46198u uVar) {
            this.f124541d = uVar;
        }

        public void onChanged(Object obj) {
            C46178e eVar;
            C46193o oVar = (C46193o) obj;
            Log.m105924i(this.f124541d.f124525e, "get liveTransTextRes");
            if (oVar != null) {
                C46198u uVar = this.f124541d;
                uVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<C46192n> it = oVar.f124511a.iterator();
                while (it.hasNext()) {
                    C46192n next = it.next();
                    if (Util.isNullOrNil(next.f124509c) || Util.isNullOrNil(next.f124507a)) {
                        String str = uVar.f124525e;
                        Log.m105928w(str, "node.transText == nil or hashCode == nil , node.orgText = " + next.f124508b);
                    } else {
                        arrayList.add(C90364q0.m113147f(new C13604l("transText", next.f124509c), new C13604l("hashCode", next.f124507a)));
                    }
                    if (!Util.isNullOrNil(next.f124509c) && !Util.isNullOrNil(next.f124508b) && (eVar = uVar.f124531n) != null) {
                        String str2 = next.f124508b;
                        C87412m.m108591d(str2);
                        String str3 = next.f124509c;
                        C87412m.m108591d(str3);
                        eVar.mo67665f(str2, str3);
                    }
                }
                String eVar2 = new C26827e((Collection) arrayList).toString();
                C87412m.m108593f(eVar2, "JSONArray(needReplaceTextArr).toString()");
                String str4 = this.f124541d.f124525e;
                Log.m105924i(str4, "jsonData is " + eVar2);
                if (!Util.isNullOrNil(oVar.f124511a.get(0).f124510d)) {
                    C46198u uVar2 = this.f124541d;
                    String valueOf = String.valueOf(oVar.f124511a.get(0).f124510d);
                    uVar2.getClass();
                    uVar2.f124526f = valueOf;
                }
                this.f124541d.mo71625d(eVar2);
            }
        }
    }

    public C46198u(MMWebView mMWebView) {
        C87412m.m108594g(mMWebView, "webView");
        this.f124524d = mMWebView;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.lgr);
        C87412m.m108593f(string, "getContext().resources.g…menu_tranlate_tips_brand)");
        this.f124526f = string;
        this.f124527g = new C46190l();
        this.f124528h = "jsapi/doTranslate.js";
        this.f124529i = "jsapi/preCheckNeedTrans.js";
        this.f124532o = new C54219z<>();
        C103766u uVar = new C103766u(this);
        this.f124533p = uVar;
        uVar.mo145136d(C39623j.C39626c.CREATED);
        this.f124535r = 500;
        this.f124536s = 10;
        this.f124538u = new C45600q();
        this.f124539v = new C54219z<>();
    }

    /* renamed from: a */
    public final void mo71622a(MMWebView mMWebView, String str) {
        try {
            mMWebView.evaluateJavascript(str, new C46199a(this));
            this.f124530j = true;
        } catch (Exception e) {
            String str2 = this.f124525e;
            Log.m105920e(str2, "execute js error! " + e);
        }
    }

    /* renamed from: b */
    public final String mo71623b(String str) {
        Log.m105925i("MicroMsg.WebViewTransHelper", "getTransJS: %s", str);
        try {
            return new String(C90125c.m112776c(MMApplicationContext.getContext().getAssets().open(str)), C119027c.f356488a);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewTransHelper", "tryInterceptBridgeScriptRequest, failed, ", e);
            return "";
        }
    }

    /* renamed from: c */
    public final void mo71624c() {
        Log.m105924i(this.f124525e, "injectScriptAndStartTrans");
        this.f124532o.setValue(C46177b0.DoingTrans);
        this.f124527g.f124495d.mo145136d(C39623j.C39626c.STARTED);
        C46190l lVar = this.f124527g;
        lVar.f124496e.observe(lVar, new C46200b(this));
        String b = mo71623b(this.f124528h);
        if (Util.isNullOrNil(b)) {
            Log.m105920e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
        } else {
            C46178e eVar = this.f124531n;
            if (Util.isNullOrNil(eVar != null ? eVar.mo67660a() : null)) {
                Log.m105920e("MicroMsg.WebViewTransHelper", "can't get random id from trans helper!");
            } else {
                C46178e eVar2 = this.f124531n;
                C87412m.m108591d(eVar2);
                mo71622a(this.f124524d, C112551y.m153814n(b, "__wx_trans_xxyy", eVar2.mo67660a(), false));
            }
        }
        mo71622a(this.f124524d, "window.WeixinTranslate.startTrans()");
        C46178e eVar3 = this.f124531n;
        if (eVar3 != null) {
            eVar3.mo67663d();
        }
    }

    /* renamed from: d */
    public final void mo71625d(String str) {
        C53973z1 z1Var = this.f124534q;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f124534q = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C46197t(2000, this, (C15601d<? super C46197t>) null), 3, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i(this.f124525e, "json.length == 0");
            return;
        }
        String str2 = this.f124525e;
        Log.m105924i(str2, "replaceHTML: " + str);
        mo71622a(this.f124524d, "window.WeixinTranslate.replaceText(" + str + ')');
    }

    public C39623j getLifecycle() {
        return this.f124533p;
    }
}
