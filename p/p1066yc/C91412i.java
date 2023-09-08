package p1066yc;

import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: yc.i */
public final class C91412i {

    /* renamed from: a */
    public static volatile boolean f262135a;

    /* renamed from: a */
    public static C80123a m114704a(C91165a aVar) {
        Log.m105918d("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide");
        if (!f262135a) {
            Log.m105924i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, not support");
            return null;
        }
        C82381f g = aVar.mo62544g();
        AppBrandRuntime runtime = g instanceof C83780d1 ? ((C83780d1) g).getRuntime() : g instanceof C81925i2 ? ((C81925i2) g).getRuntime() : null;
        if (runtime == null) {
            Log.m105928w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is null");
            return null;
        } else if (runtime.mo113064k0() || runtime.f238117P) {
            Log.m105928w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is destroyed or finishing");
            return null;
        } else {
            C80123a aVar2 = (C80123a) runtime.mo113032U(C80123a.class);
            if (aVar2 != null) {
                return aVar2;
            }
            Log.m105924i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, create");
            C80123a aVar3 = new C80123a(runtime);
            runtime.mo113059i(aVar3);
            return aVar3;
        }
    }
}
