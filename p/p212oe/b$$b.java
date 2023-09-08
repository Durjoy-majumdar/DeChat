package p212oe;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxperf.thread.ThreadInspect;

/* renamed from: oe.b$$b */
public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f257034d;

    /* renamed from: e */
    public final /* synthetic */ int f257035e;

    public /* synthetic */ b$$b(String str, int i) {
        this.f257034d = str;
        this.f257035e = i;
    }

    public final void run() {
        String str = this.f257034d;
        int i = this.f257035e;
        Log.m105928w("Matrix.battery.BatteryCanaryConfigs", "tkill thread: " + str + ", tid = " + i);
        if (ThreadInspect.init()) {
            ThreadInspect.tkill(i, 6);
        }
    }
}
