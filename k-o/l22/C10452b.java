package l22;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.webview.core.C43510e0;
import com.tencent.p014mm.plugin.webview.core.C43514j;
import com.tencent.p014mm.plugin.webview.core.C5854i;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import d93.C45310h;
import p244tt.C14092g;
import s73.C13626a;
import t83.C48590l;

/* renamed from: l22.b */
public class C10452b implements C14092g {

    /* renamed from: a */
    public C48590l f31677a;

    /* renamed from: b */
    public long f31678b = 0;

    /* renamed from: c */
    public int f31679c = 0;

    /* renamed from: l22.b$a */
    public class C10453a implements C43514j {

        /* renamed from: a */
        public final /* synthetic */ C48590l f31680a;

        /* renamed from: b */
        public final /* synthetic */ C10452b f31681b;

        /* renamed from: c */
        public final /* synthetic */ int f31682c;

        public C10453a(C48590l lVar, C10452b bVar, int i) {
            this.f31680a = lVar;
            this.f31681b = bVar;
            this.f31682c = i;
        }

        /* renamed from: c */
        public boolean mo10771c() {
            return false;
        }

        /* renamed from: d */
        public void mo10772d(C5854i iVar) {
            this.f31680a.f130007l = iVar.mo6903m();
            try {
                iVar.mo6903m().Np0(new C10454b(C10452b.this, this.f31680a, this.f31681b), this.f31682c);
            } catch (Exception unused) {
            }
            this.f31680a.mo73262v0(true);
        }
    }

    /* renamed from: l22.b$b */
    public class C10454b extends C13626a.C13627a {

        /* renamed from: g */
        public long f31684g = 0;

        /* renamed from: h */
        public int f31685h = 0;

        public C10454b(C10452b bVar, C48590l lVar, C10452b bVar2) {
            super(lVar);
            this.f31684g = bVar2.f31678b;
            this.f31685h = bVar2.f31679c;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra("result_data", bundle);
            LiteAppCenter.closeWindow(this.f31685h, this.f31684g, intent);
        }

        public String getCurrentUrl() {
            return "liteapp://";
        }
    }

    public C10452b() {
        try {
            this.f31677a = mo10770a(this, "liteapp", "wxaliteapp", JsapiPermissionWrapper.f121047h);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public C48590l mo10770a(C10452b bVar, String str, String str2, JsapiPermissionWrapper jsapiPermissionWrapper) {
        int hashCode = hashCode();
        if (C10458f.f31693c == null) {
            C10458f.f31693c = new C10458f();
        }
        C48590l lVar = new C48590l((MMWebView) null, (C45310h) null, hashCode, C10458f.f31693c);
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString("appId", str2);
        lVar.f129987G = jsapiPermissionWrapper;
        lVar.f129988H = bundle;
        lVar.f129989I = true;
        C43510e0.f117642a.mo67793a(true, Class.forName("com.tencent.mm.plugin.webview.stub.WebViewStubService"), new C10453a(lVar, bVar, hashCode));
        return lVar;
    }
}
