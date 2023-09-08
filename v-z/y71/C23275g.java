package y71;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: y71.g */
public class C23275g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23272e f66907d;

    /* renamed from: e */
    public final /* synthetic */ long f66908e;

    public C23275g(C23272e eVar, long j) {
        this.f66907d = eVar;
        this.f66908e = j;
    }

    public void run() {
        C23272e eVar = this.f66907d;
        long j = this.f66908e;
        if (!eVar.f66899c.containsKey(Long.valueOf(j))) {
            Log.m105928w("MicroMsg.exdevice.BluetoothSDKAdapter", "the session not exist");
        } else {
            eVar.f66897a.mo35149f(j, eVar.f66900d.get(Long.valueOf(j)).intValue());
        }
    }
}
