package f00;

import android.app.Application;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.webview.model.C30597q;
import com.tencent.p014mm.plugin.webview.model.C6053p1;
import com.tencent.p014mm.plugin.webview.modeltools.C6079b0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import ea3.C7607a;
import f40.C31887k0;
import f40.C86709a0;
import i83.C8865f;
import j40.C87829b;
import java.util.HashMap;
import k83.C9568c;
import k83.C9571f;
import zh3.C91753f;

/* renamed from: f00.t */
public class C7963t implements C31887k0.C31890c {

    /* renamed from: d */
    public final HashMap<Integer, C91753f.C66827b> f26649d;

    /* renamed from: f00.t$a */
    public class C7964a implements C91753f.C66827b {
        public C7964a(C7963t tVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C6079b0.f22403e;
        }
    }

    /* renamed from: f00.t$b */
    public class C7965b implements C91753f.C66827b {
        public C7965b(C7963t tVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C30597q.f82404g;
        }
    }

    /* renamed from: f00.t$c */
    public class C7966c implements C91753f.C66827b {
        public C7966c(C7963t tVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C6053p1.f22345d;
        }
    }

    /* renamed from: f00.t$d */
    public class C7967d implements C91753f.C66827b {
        public C7967d(C7963t tVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C9568c.f29806d;
        }
    }

    /* renamed from: f00.t$e */
    public class C7968e implements C91753f.C66827b {
        public C7968e(C7963t tVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C9571f.f29809d;
        }
    }

    public C7963t() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        this.f26649d = hashMap;
        hashMap.put(-408809340, new C7964a(this));
        hashMap.put(-1530979959, new C7965b(this));
        hashMap.put(-556471228, new C7966c(this));
        hashMap.put(67360848, new C7967d(this));
        hashMap.put(-734313669, new C7968e(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        boolean z;
        boolean z2;
        C87829b a = C86709a0.m107531m().mo58407a();
        SharedPreferences sharedPreferences = a.f124990c.getSharedPreferences("abi64_webview_compat_sp", 0);
        int i = sharedPreferences.getInt("last_is_32bit_wechat", 0);
        boolean z3 = BuildInfo.IS_ARM64;
        int i2 = z3 ? 2 : 1;
        if (!z3) {
            if (i != 2) {
                Log.m105924i("MicroMsg.XWeb.PluginWebView", "Still 32Bit");
                return this.f26649d;
            }
            z = false;
        } else if (i == 2) {
            Log.m105924i("MicroMsg.XWeb.PluginWebView", "Still 64Bit");
            return this.f26649d;
        } else {
            z = true;
        }
        Application application = a.f124990c;
        try {
            C7607a.m7741a(new C86009m1(application.getFilesDir().getParent() + "/" + "app_webview" + "/" + "GPUCache"));
            C7607a.m7741a(new C86009m1(application.getFilesDir().getParent() + "/" + "app_x5webview" + "/" + "GPUCache"));
            application.getSharedPreferences("WebViewChromiumPrefs", 0).edit().clear().apply();
            z2 = true;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ABI64WebViewCompat", th, "", new Object[0]);
            z2 = false;
        }
        Log.m105925i("MicroMsg.XWeb.PluginWebView", "result %s", Boolean.valueOf(z2));
        if (z2) {
            sharedPreferences.edit().putInt("last_is_32bit_wechat", i2).commit();
        }
        int i3 = z ? 8 : 9;
        if (a.mo71804b()) {
            C86709a0.m107528h().mo121097c(new C8865f(i3));
        }
        return this.f26649d;
    }
}
