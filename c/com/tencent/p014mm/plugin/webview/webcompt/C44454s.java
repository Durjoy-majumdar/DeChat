package com.tencent.p014mm.plugin.webview.webcompt;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import fy3.C32226l;
import gy3.C87412m;
import java.io.ByteArrayInputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import rx3.C36570n;
import sf0.C48374j0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import t83.C48590l;
import te3.C51018qv3;
import te3.C52018xt1;
import te3.d25;
import z04.C112551y;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.s */
public final class C44454s extends C43505b0 {

    /* renamed from: c */
    public final String f120556c = "MicroMsg.WebComponentInterceptor";

    /* renamed from: f */
    public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C87412m.m108593f(uri, "request.url.toString()");
        C44408c.C44410b bVar = C44408c.f120395e;
        bVar.getClass();
        if (!C112551y.m153819s(uri, C44408c.f120396f, false)) {
            return null;
        }
        C48590l g0 = mo67777c().mo67720g0();
        C87412m.m108592e(g0, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        C44463z z = g0.mo73268z();
        if (z == null) {
            return null;
        }
        C44408c c = z.mo69227c();
        c.getClass();
        Uri url = webResourceRequest.getUrl();
        String host = url.getHost();
        if (host == null) {
            host = "";
        }
        String str = C44408c.f120397g;
        Log.m105924i(str, "getInterceptResponse " + url);
        c.f120410b.mo69224a(C44406b.IFRAME_INTERCEPT);
        C44408c.C44428l.C44429a aVar = (C44408c.C44428l.C44429a) c.mo69184j().get(host);
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("['");
            bVar.getClass();
            List<Number> list = (List) ((C36570n) C44408c.f120400j).getValue();
            SecureRandom secureRandom = new SecureRandom();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (Number intValue : list) {
                byte[] bArr = new byte[intValue.intValue()];
                secureRandom.nextBytes(bArr);
                arrayList.add(C110823p.m150986L(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C44451p.f120548d, 30, (Object) null));
            }
            sb.append(C110818d0.m150921S(arrayList, "','", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            sb.append("']");
            String sb4 = sb.toString();
            String str2 = C44408c.f120397g;
            Log.m105924i(str2, "buildMatrix " + sb4 + ", " + url);
            C44408c.f120395e.getClass();
            String r = C112551y.m153818r((String) ((C36570n) C44408c.f120401k).getValue(), "$__IFRAME_MATRIX__$", sb4, false, 4, (Object) null);
            String str3 = aVar.f120468b.f131168d;
            C87412m.m108593f(str3, "worker.webComptInfo.name");
            String r2 = C112551y.m153818r(r, "$__WEB_COMPT_NAME__$", str3, false, 4, (Object) null);
            C40480g a = aVar.mo69209a();
            a.evaluateJavascript("WeixinWebCompt.onBind.apply(WeixinWebCompt, " + sb4 + ')', (ValueCallback<String>) null);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ready to response ");
            sb5.append(url);
            Log.m105924i(str2, sb5.toString());
            byte[] bytes = r2.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "utf8", new ByteArrayInputStream(bytes));
            aVar.f120470d = true;
            c.f120410b.mo69224a(C44406b.IFRAME_INTERCEPT_SUCC);
            return webResourceResponse;
        }
        c.f120410b.mo69224a(C44406b.IFRAME_INTERCEPT_ERR);
        byte[] bytes2 = ("webCompt: " + host + " not found").getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
        return new WebResourceResponse("text/html", "utf8", new ByteArrayInputStream(bytes2));
    }

    /* renamed from: j */
    public boolean mo67780j(String str, boolean z, int i) {
        C87412m.m108594g(str, "url");
        C44408c.f120395e.getClass();
        return C112551y.m153819s(str, C44408c.f120396f, false);
    }

    /* renamed from: l */
    public boolean mo67782l(int i, String str, C52018xt1 xt12) {
        byte[] d;
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "resp");
        C51018qv3 qv32 = xt12.f144939D;
        if (!(qv32 == null || (d = C48374j0.m53715d(qv32)) == null)) {
            try {
                d25 d25 = new d25();
                d25.parseFrom(d);
                String str2 = xt12.f144941d;
                C87412m.m108593f(str2, "resp.FullURL");
                C6609t.m6916a(str2, d25.f132085d);
            } catch (Exception e) {
                Log.printErrStackTrace(this.f120556c, e, "parse WebComponentInfo", new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: r */
    public C43505b0.C43506a mo62382r(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        C44408c.f120395e.getClass();
        return C112551y.m153819s(str, C44408c.f120396f, false) ? new C43505b0.C43506a(true, false) : super.mo62382r(webView, str);
    }
}
