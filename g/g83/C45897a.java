package g83;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import te3.c25;
import u73.C52456b0;
import z73.C53759a;
import z73.C53761n;

/* renamed from: g83.a */
public class C45897a<T> implements C11385n, C114668z {

    /* renamed from: d */
    public C59386f<T> f123861d;

    public C45897a(C59386f<T> fVar) {
        this.f123861d = fVar;
        C86709a0.m107524d().mo123455a(2975, this);
        AppForegroundDelegate.INSTANCE.mo174208a(this);
    }

    /* renamed from: a */
    public final int mo71326a() {
        BaseWebSearchWebView webView;
        C59386f<T> fVar = this.f123861d;
        if (fVar == null || (webView = fVar.getWebView()) == null) {
            return -1;
        }
        return webView.hashCode();
    }

    public void onAppBackground(String str) {
        C59379b<T> g;
        BaseWebSearchWebView webView;
        Log.m105924i("MicroMsg.WebSearch.BaseWebSearchData", "onAppBackground " + str);
        C59386f<T> fVar = this.f123861d;
        if (fVar != null && (g = fVar.mo9284g()) != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                C53759a aVar = g.f150904a;
                if (!(aVar == null || (webView = aVar.getWebView()) == null)) {
                    C53761n nVar = C53761n.f150905a;
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "requestObj.toString()");
                    nVar.mo74349a(webView, "onAppBackground", jSONObject2);
                }
                C87412m.m108593f(g.mo74341e().toString(), "returnSuccess().toString()");
            } catch (Exception unused) {
                C87412m.m108593f(g.mo74340d().toString(), "returnFail().toString()");
            }
        }
    }

    public void onAppForeground(String str) {
        C59379b<T> g;
        BaseWebSearchWebView webView;
        Log.m105924i("MicroMsg.WebSearch.BaseWebSearchData", "onAppForeground " + str);
        C59386f<T> fVar = this.f123861d;
        if (fVar != null && (g = fVar.mo9284g()) != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, C31543z5.m39453c());
                C53759a aVar = g.f150904a;
                if (!(aVar == null || (webView = aVar.getWebView()) == null)) {
                    C53761n nVar = C53761n.f150905a;
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "requestObj.toString()");
                    nVar.mo74349a(webView, "onAppForeground", jSONObject2);
                }
                C87412m.m108593f(g.mo74341e().toString(), "returnSuccess().toString()");
            } catch (Exception unused) {
                C87412m.m108593f(g.mo74340d().toString(), "returnFail().toString()");
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C59379b<T> g;
        String str2;
        C59379b<T> g2;
        if (yVar instanceof C52456b0) {
            C52456b0 b0Var = (C52456b0) yVar;
            if (b0Var.f146575h == mo71326a()) {
                c25 c25 = (c25) b0Var.f146572e.f127056b.f127083a;
                if (c25 != null) {
                    C59386f<T> fVar = this.f123861d;
                    if (fVar == null || (g2 = fVar.mo9284g()) == null) {
                        str2 = null;
                    } else {
                        if (str == null) {
                            str = "";
                        }
                        String str3 = c25.f131472d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str2 = g2.mo84492j(i2, str, str3, c25.f131473e);
                    }
                    if (str2 != null) {
                        return;
                    }
                }
                C59386f<T> fVar2 = this.f123861d;
                if (fVar2 != null && (g = fVar2.mo9284g()) != null) {
                    g.mo84492j(-1, "", "", b0Var.f146574g);
                }
            }
        }
    }
}
