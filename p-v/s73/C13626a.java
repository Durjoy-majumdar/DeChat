package s73;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.C43510e0;
import com.tencent.p014mm.plugin.webview.core.C43514j;
import com.tencent.p014mm.plugin.webview.core.C5854i;
import com.tencent.p014mm.plugin.webview.stub.C43787d;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d93.C45310h;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import ke3.C88144b;
import rx3.C13598b0;
import t83.C13841a;
import t83.C48590l;

/* renamed from: s73.a */
public final class C13626a {

    /* renamed from: a */
    public final Class<? extends Service> f38610a;

    /* renamed from: b */
    public final String f38611b;

    /* renamed from: c */
    public final String f38612c;

    /* renamed from: d */
    public final JsapiPermissionWrapper f38613d;

    /* renamed from: e */
    public final String f38614e = "MicroMsg.JsApiHandlerBuilder";

    /* renamed from: s73.a$a */
    public static class C13627a extends C6107m.C6108a {

        /* renamed from: e */
        public final C48590l f38615e;

        /* renamed from: f */
        public final String f38616f = "MicroMsg.JsApiWebViewStub_Callback_AIDL";

        public C13627a(C48590l lVar) {
            C87412m.m108594g(lVar, "jsapi");
            this.f38615e = lVar;
        }

        /* renamed from: B7 */
        public void mo7025B7(String str) {
        }

        public void Ef0() {
        }

        /* renamed from: F7 */
        public int mo7027F7() {
            return 0;
        }

        /* renamed from: Gb */
        public void mo7028Gb(String str, String str2) {
        }

        /* renamed from: Ni */
        public String mo7029Ni() {
            return this.f38616f;
        }

        /* renamed from: US */
        public void mo7030US(String str, String str2, int i, int i2) {
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            String str;
            Class cls = C45696d.class;
            String str2 = this.f38616f;
            Log.m105924i(str2, "invokeAsResult:" + i);
            Bundle bundle2 = new Bundle();
            if (i == 101) {
                C87412m.m108591d(bundle);
                bundle.setClassLoader(C74928u.C45093i.class.getClassLoader());
                Context r = this.f38615e.mo73255r();
                String string = bundle.getString("open_ui_with_webview_ui_plugin_name");
                String string2 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
                Intent intent = new Intent();
                Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                C87412m.m108591d(bundle3);
                C88144b.m109791i(r, string, string2, intent.putExtras(bundle3), (Bundle) null);
            } else if (i == 200) {
                C45696d.C7944a aVar = new C45696d.C7944a();
                Intent intent2 = new Intent();
                C87412m.m108591d(bundle);
                int i2 = bundle.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                int i3 = bundle.getInt("subscene", 10000);
                String string3 = bundle.getString("url");
                if (((C45696d) C86709a0.m107533q(cls)).B60(string3)) {
                    string3 = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(string3, i2, i3, (int) (System.currentTimeMillis() / ((long) 1000)));
                }
                bundle2.putBoolean("success", ((C45696d) C86709a0.m107533q(cls)).Zi0(this.f38615e.mo73255r(), string3, bundle.getInt("item_show_type"), bundle.getBoolean("isNativePage"), i2, i3, intent2, bundle.getInt("openType"), aVar));
                if (!aVar.f26630a && (str = aVar.f26631b) != null) {
                    bundle2.putString("desc", str);
                }
            }
            return bundle2;
        }

        /* renamed from: XB */
        public void mo7032XB(int i, Bundle bundle) {
        }

        public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
            this.f38615e.mo8702g(str, str2, C13841a.m13131a(bundle), z);
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean callback(int i, Bundle bundle) {
            return true;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
        }

        /* renamed from: e3 */
        public String mo7037e3() {
            return this.f38616f;
        }

        /* renamed from: es */
        public void mo7061es(boolean z) {
        }

        public boolean fq0(C43787d dVar) {
            return false;
        }

        public String getCurrentUrl() {
            return this.f38616f;
        }

        /* renamed from: hb */
        public boolean mo7040hb(int i) {
            return true;
        }

        /* renamed from: kn */
        public void mo7062kn(boolean z) {
        }

        /* renamed from: mC */
        public void mo7041mC(Bundle bundle) {
        }

        public Bundle q10(String str, String str2) {
            return new Bundle();
        }

        /* renamed from: uP */
        public void mo7043uP() {
        }

        /* renamed from: xf */
        public void mo7044xf(boolean z) {
        }

        /* renamed from: xx */
        public void mo7045xx(String str, String str2) {
        }

        public String ya0() {
            return this.f38616f;
        }
    }

    /* renamed from: s73.a$b */
    public static final class C13628b implements C43514j {

        /* renamed from: a */
        public final /* synthetic */ C48590l f38617a;

        /* renamed from: b */
        public final /* synthetic */ int f38618b;

        /* renamed from: c */
        public final /* synthetic */ C13626a f38619c;

        public C13628b(C48590l lVar, int i, C13626a aVar) {
            this.f38617a = lVar;
            this.f38618b = i;
            this.f38619c = aVar;
        }

        /* renamed from: c */
        public boolean mo10771c() {
            return false;
        }

        /* renamed from: d */
        public void mo10772d(C5854i iVar) {
            C87412m.m108594g(iVar, "conn");
            try {
                this.f38617a.f130007l = iVar.mo6903m();
                iVar.mo6903m().Np0(new C13627a(this.f38617a), this.f38618b);
                this.f38617a.mo73262v0(true);
            } catch (Throwable th) {
                String str = this.f38619c.f38614e;
                Log.m105920e(str, "onConnected ex " + th.getMessage());
            }
        }
    }

    public C13626a(Class<? extends Service> cls, String str, String str2, JsapiPermissionWrapper jsapiPermissionWrapper) {
        C87412m.m108594g(cls, "stubService");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "appId");
        this.f38610a = cls;
        this.f38611b = str;
        this.f38612c = str2;
        this.f38613d = jsapiPermissionWrapper;
    }

    /* renamed from: a */
    public final C48590l mo13024a() {
        int hashCode = hashCode();
        C48590l lVar = new C48590l((MMWebView) null, (C45310h) null, hashCode);
        JsapiPermissionWrapper jsapiPermissionWrapper = this.f38613d;
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f38611b);
        bundle.putString("appId", this.f38612c);
        C13598b0 b0Var = C13598b0.f38549a;
        lVar.f129987G = jsapiPermissionWrapper;
        lVar.f129988H = bundle;
        lVar.f129989I = true;
        C43510e0.f117642a.mo67793a(true, this.f38610a, new C13628b(lVar, hashCode, this));
        return lVar;
    }
}
