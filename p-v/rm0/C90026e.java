package rm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: rm0.e */
public class C90026e extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 472;
    public static final String NAME = "enableDeviceOrientationChangeListening";

    /* renamed from: g */
    public boolean f258622g = false;

    /* renamed from: h */
    public C84800z1 f258623h;

    /* renamed from: rm0.e$a */
    public static final class C90027a implements C84800z1.C84802b {

        /* renamed from: a */
        public final String f258624a;

        /* renamed from: rm0.e$a$a */
        public class C90028a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C84800z1.C84801a f258625d;

            public C90028a(C84800z1.C84801a aVar) {
                this.f258625d = aVar;
            }

            public void run() {
                C84800z1.C84801a aVar;
                C90035h a = C90035h.m112630a(C90027a.this.f258624a, false);
                if (a != null) {
                    C84800z1.C84801a aVar2 = this.f258625d;
                    a.f258639e = aVar2;
                    if (a.f258635a && a.f258640f == (aVar = C84800z1.C84801a.LANDSCAPE)) {
                        if (aVar2 == C84800z1.C84801a.REVERSE_LANDSCAPE || aVar2 == aVar) {
                            a.mo124343c(aVar2);
                            Log.m105924i("MicroMsg.OrientationConfigListenerHelper", "onFourOrientationsChange mAppid:" + a.f258636b + "; mOrientation:" + aVar2.name());
                        }
                    }
                }
            }
        }

        public C90027a(String str) {
            this.f258624a = str;
        }

        /* renamed from: a */
        public void mo22146a(C84800z1.C84801a aVar, C84800z1.C84801a aVar2) {
            Log.m105924i("MicroMsg.JsApiEnableDeviceOrientation", "OrientationListener lastOrientation:" + aVar.name() + "; newOrientation:" + aVar2.name());
            MMHandlerThread.postToMainThreadDelayed(new C90028a(aVar2), 500);
        }
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("enable", false)) {
            Map<String, C90035h> map = C90035h.f258634g;
            C90035h a = C90035h.m112630a(fVar.getAppId(), true);
            Objects.requireNonNull(a);
            a.f258636b = fVar.getAppId();
            a.f258637c = fVar;
            a.f258635a = true;
            a.f258638d.mo115161k(fVar);
            C84800z1.C84801a aVar = a.f258640f;
            if (aVar != C84800z1.C84801a.NONE) {
                a.f258638d.mo124342p(aVar);
            }
            Log.m105925i("MicroMsg.OrientationConfigListenerHelper", "startListen appId:%s", a.f258636b);
            if (!this.f258622g) {
                C84800z1 z1Var = new C84800z1(fVar.getContext(), new C90027a(fVar.getAppId()));
                this.f258623h = z1Var;
                z1Var.enable();
                this.f258622g = true;
            }
        } else {
            Map<String, C90035h> map2 = C90035h.f258634g;
            C90035h a2 = C90035h.m112630a(fVar.getAppId(), false);
            if (a2 != null) {
                a2.mo124344d();
            }
            if (this.f258622g) {
                this.f258623h.disable();
                this.f258623h = null;
                this.f258622g = false;
            }
        }
        return mo115109j("ok");
    }
}
