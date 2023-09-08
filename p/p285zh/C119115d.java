package p285zh;

import android.os.SystemClock;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: zh.d */
public class C119115d extends C80401d {

    /* renamed from: b */
    public long f356718b = 0;

    /* renamed from: a */
    public void mo17850a() {
        Log.m105924i("MicroMsg.NotifyPowerInspector", "bg");
        this.f356718b = SystemClock.uptimeMillis();
        ((C119157j) C119157j.f356862d).mo183876g(new d$$a(this), "MicroMsg.NotifyPowerInspector");
    }

    /* renamed from: b */
    public void mo17851b() {
        Log.m105924i("MicroMsg.NotifyPowerInspector", "fg");
        ((C119157j) C119157j.f356862d).mo183876g(new d$$b(this), "MicroMsg.NotifyPowerInspector");
    }
}
