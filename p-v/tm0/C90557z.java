package tm0;

import android.app.Activity;
import android.os.PowerManager;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import org.json.JSONObject;

/* renamed from: tm0.z */
public class C90557z extends C82268c {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "setKeepScreenOn";

    /* renamed from: g */
    public C82381f f260180g;

    /* renamed from: h */
    public PowerManager.WakeLock f260181h;

    /* renamed from: i */
    public boolean f260182i = false;

    /* renamed from: j */
    public C83231l.C83234d f260183j;

    /* renamed from: tm0.z$a */
    public class C90558a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f260184d;

        public C90558a(C82381f fVar) {
            this.f260184d = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "onDestroy");
            if (C90557z.this.mo124687x()) {
                C90557z.this.mo124688y();
            }
            C83231l.m102144e(this.f260184d.getAppId(), this);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "onPause");
            if (C90557z.this.mo124687x()) {
                C90557z.this.mo124688y();
            }
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "onResume");
            C90557z zVar = C90557z.this;
            if (zVar.f260182i) {
                zVar.mo124686w();
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else if (fVar.getContext() == null) {
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is nul");
            fVar.mo109647a(i, mo115109j("fail:context is null"));
        } else if (!(fVar.getContext() instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is not activity, don't do invoke");
            fVar.mo109647a(i, mo115109j("fail:context is null"));
        } else {
            boolean z = false;
            boolean optBoolean = jSONObject.optBoolean("keepScreenOn", false);
            this.f260182i = optBoolean;
            Log.m105925i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, keepScreenOn:%b, appId:%s", Boolean.valueOf(optBoolean), fVar.getAppId());
            synchronized (this) {
                this.f260180g = fVar;
            }
            if (optBoolean) {
                if (this.f260183j == null) {
                    this.f260183j = new C90558a(fVar);
                }
                C83231l.m102140a(fVar.getAppId(), this.f260183j);
                if (C83231l.m102141b(fVar.getAppId()) == C83231l.C83233c.INIT || C83231l.m102141b(fVar.getAppId()) == C83231l.C83233c.ON_CREATE || C83231l.m102141b(fVar.getAppId()) == C83231l.C83233c.ON_RESUME) {
                    z = mo124686w();
                } else {
                    Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "background status, don't acquire");
                }
            } else if (mo124687x()) {
                Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "reset screen off");
                z = mo124688y();
            } else {
                Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "fail, has not set screen");
                fVar.mo109647a(i, mo115109j("fail:has not set screen"));
                return;
            }
            if (z) {
                Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn ok");
                fVar.mo109647a(i, mo115109j("ok"));
                return;
            }
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn fail");
            fVar.mo109647a(i, mo115109j("fail"));
        }
    }

    /* renamed from: w */
    public final synchronized boolean mo124686w() {
        if (this.f260180g.getContext() == null) {
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, server context is nul");
            return false;
        }
        Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "acquire ok");
        Activity activity = (Activity) this.f260180g.getContext();
        if (this.f260181h == null) {
            this.f260181h = ((PowerManager) activity.getSystemService("power")).newWakeLock(536870922, "MicroMsg.JsApiSetKeepScreenOn");
        }
        if (!this.f260181h.isHeld()) {
            PowerManager.WakeLock wakeLock = this.f260181h;
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock acquire");
        } else {
            Log.m105924i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock has held ");
        }
        return true;
    }

    /* renamed from: x */
    public final synchronized boolean mo124687x() {
        PowerManager.WakeLock wakeLock;
        wakeLock = this.f260181h;
        return wakeLock != null && wakeLock.isHeld();
    }

    /* renamed from: y */
    public final synchronized boolean mo124688y() {
        Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "release");
        PowerManager.WakeLock wakeLock = this.f260181h;
        if (wakeLock == null || !wakeLock.isHeld()) {
            Log.m105920e("MicroMsg.JsApiSetKeepScreenOn", "wakeLock is  null");
            return false;
        }
        PowerManager.WakeLock wakeLock2 = this.f260181h;
        C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f260181h = null;
        return true;
    }
}
