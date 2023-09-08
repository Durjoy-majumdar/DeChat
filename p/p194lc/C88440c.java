package p194lc;

import android.os.Process;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.IWindowReadyCallback;
import fy3.C32226l;
import p176jc.C87939v;
import p284zb.C91635f;
import rx3.C13598b0;

/* renamed from: lc.c */
public final class C88440c implements IWindowReadyCallback {

    /* renamed from: a */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255452a;

    /* renamed from: b */
    public final /* synthetic */ C91635f f255453b;

    /* renamed from: c */
    public final /* synthetic */ int f255454c;

    public C88440c(int i, AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, C91635f fVar) {
        this.f255454c = i;
        this.f255452a = appServiceSkylineExtensionImpl;
        this.f255453b = fVar;
    }

    public void onWindowReady(int i) {
        C32226l<Boolean, C13598b0> remove;
        Log.m105924i("AppServiceSkylineExtensionImpl", this.f255454c + " onWindowReady id:" + i);
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f255452a;
        synchronized (appServiceSkylineExtensionImpl.f235037n) {
            appServiceSkylineExtensionImpl.f235036m.add(Integer.valueOf(i));
        }
        C87939v vVar = C87939v.f254498a;
        Long l = C87939v.f254500c.get(Integer.valueOf(i));
        if (l == null) {
            l = 0L;
        }
        C87939v.C87940a aVar = C87939v.f254499b.get(Long.valueOf(l.longValue()));
        if (aVar == null) {
            Log.m105920e("SkylineManager", "notifyFlutterReady id:" + i + " fail");
        } else {
            if (aVar.f254506e == i) {
                C87939v.C87941b bVar = aVar.f254503b;
                bVar.getClass();
                bVar.f254509b = System.currentTimeMillis();
            } else {
                C87939v.C87941b bVar2 = aVar.f254504c.get(Integer.valueOf(i));
                if (bVar2 != null) {
                    bVar2.f254509b = System.currentTimeMillis();
                }
            }
            Log.m105924i("SkylineManager", "Thread.currentThread().priority:" + Thread.currentThread().getPriority() + " Process.priority:" + Process.getThreadPriority(Process.myTid()));
            Log.m105924i("SkylineManager", "notifyFlutterReady id:" + i + " size:" + C87939v.f254501d.size());
            synchronized (vVar) {
                remove = C87939v.f254501d.remove(Integer.valueOf(i));
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C32226l lVar = remove;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl2 = this.f255452a;
        C91635f fVar = this.f255453b;
        appServiceSkylineExtensionImpl2.mo111458h(fVar, false);
        appServiceSkylineExtensionImpl2.mo111459i(new C88450j(fVar, i));
    }
}
