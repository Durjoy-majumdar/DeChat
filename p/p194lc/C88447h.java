package p194lc;

import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineLogic;
import com.tencent.skyline.SkylineRuntime;
import java.util.Iterator;
import js0.C88024r;
import p176jc.C87939v;

/* renamed from: lc.h */
public final class C88447h implements C83174m.C83175a {

    /* renamed from: d */
    public final /* synthetic */ int f255471d;

    /* renamed from: e */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255472e;

    /* renamed from: f */
    public final /* synthetic */ SkylineRuntime f255473f;

    /* renamed from: lc.h$a */
    public static final class C88448a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f255474d;

        public C88448a(long j) {
            this.f255474d = j;
        }

        public final void run() {
            C87939v vVar = C87939v.f254498a;
            long j = this.f255474d;
            synchronized (vVar) {
                C87939v.C87940a aVar = C87939v.f254499b.get(Long.valueOf(j));
                if (aVar == null) {
                    Log.m105920e("SkylineManager", "release runtimePtr:" + j + " fail stack:" + android.util.Log.getStackTraceString(new Throwable()));
                    return;
                }
                C87939v.f254499b.remove(Long.valueOf(j));
                Iterator<Integer> it = aVar.f254507f.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    int i = aVar.f254506e;
                    if (next != null) {
                        if (next.intValue() == i) {
                        }
                    }
                    Log.m105924i("SkylineManager", "release destroyFlutter id:" + next.intValue());
                    SkylineLogic.INSTANCE.destroyFlutterEngine(next.intValue());
                }
                Log.m105924i("SkylineManager", "release destroyFirstFlutter id:" + aVar.f254506e);
                SkylineLogic.INSTANCE.destroyFlutterEngine(aVar.f254506e);
            }
        }
    }

    public C88447h(int i, AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, SkylineRuntime skylineRuntime) {
        this.f255471d = i;
        this.f255472e = appServiceSkylineExtensionImpl;
        this.f255473f = skylineRuntime;
    }

    public final void onDestroy() {
        Log.m105924i("AppServiceSkylineExtensionImpl", "v8 destroy callback " + this.f255471d + " mSkylineRuntimeJNIBootstrapDone:" + this.f255472e.f235029f);
        SkylineRuntime skylineRuntime = this.f255473f;
        long runtimePtr = skylineRuntime != null ? skylineRuntime.getRuntimePtr() : 0;
        if (this.f255472e.f235029f) {
            AppServiceSkylineExtensionImpl.m97721g(this.f255472e, this.f255473f);
        }
        C88024r.m109572b(new C88448a(runtimePtr));
    }
}
