package p194lc;

import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.IWindowDestroyCallback;
import com.tencent.skyline.SkylineLogic;
import com.tencent.skyline.SkylineRuntime;
import p176jc.C87939v;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: lc.d */
public final class C88441d implements IWindowDestroyCallback {

    /* renamed from: a */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255455a;

    /* renamed from: b */
    public final /* synthetic */ SkylineRuntime f255456b;

    /* renamed from: c */
    public final /* synthetic */ int f255457c;

    /* renamed from: lc.d$a */
    public static final class C88442a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f255458d;

        public C88442a(int i) {
            this.f255458d = i;
        }

        public final void run() {
            C87939v vVar = C87939v.f254498a;
            int i = this.f255458d;
            synchronized (vVar) {
                Long l = C87939v.f254500c.get(Integer.valueOf(i));
                if (l == null) {
                    l = 0L;
                }
                C87939v.C87940a aVar = C87939v.f254499b.get(Long.valueOf(l.longValue()));
                if (aVar == null) {
                    Log.m105920e("SkylineManager", "destroyFlutter id:" + i + " fail");
                    return;
                }
                aVar.mo122408a(i);
                Log.m105924i("SkylineManager", "destroyFlutter id:" + i);
                if (aVar.f254506e == i) {
                    Log.m105924i("SkylineManager", "destroyFlutter id:" + i + " ignore, return");
                } else if (!aVar.f254507f.contains(Integer.valueOf(i))) {
                    Log.m105928w("SkylineManager", "destroyFlutter id:" + i + " fail, return");
                } else {
                    aVar.f254507f.remove(Integer.valueOf(i));
                    C87939v.f254501d.remove(Integer.valueOf(i));
                    SkylineLogic.INSTANCE.destroyFlutterEngine(i);
                }
            }
        }
    }

    public C88441d(int i, AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, SkylineRuntime skylineRuntime) {
        this.f255457c = i;
        this.f255455a = appServiceSkylineExtensionImpl;
        this.f255456b = skylineRuntime;
    }

    public void onWindowDestroy(int i) {
        boolean isEmpty;
        Log.m105924i("AppServiceSkylineExtensionImpl", this.f255457c + " onWindowDestroy id:" + i);
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f255455a;
        synchronized (appServiceSkylineExtensionImpl.f235037n) {
            appServiceSkylineExtensionImpl.f235036m.remove(Integer.valueOf(i));
            isEmpty = appServiceSkylineExtensionImpl.f235036m.isEmpty();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C88442a(i));
        if (isEmpty && this.f255455a.f235030g) {
            this.f255456b.clearWorkletJSBindings();
        }
    }
}
