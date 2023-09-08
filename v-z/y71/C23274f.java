package y71;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: y71.f */
public class C23274f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23272e f66905d;

    /* renamed from: e */
    public final /* synthetic */ long f66906e;

    public C23274f(C23272e eVar, long j) {
        this.f66905d = eVar;
        this.f66906e = j;
    }

    public void run() {
        if (!C23272e.m27751d(this.f66905d, this.f66906e)) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.connectImp failed!!!");
        }
    }
}
