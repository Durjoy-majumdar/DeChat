package mw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;

/* renamed from: mw0.g */
public class C21571g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f61084d;

    /* renamed from: e */
    public final /* synthetic */ C21565f f61085e;

    public C21571g(C21565f fVar, long j) {
        this.f61085e = fVar;
        this.f61084d = j;
    }

    public void run() {
        C21572h remove = this.f61085e.f61074i.remove(Long.valueOf(this.f61084d));
        if (remove != null) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------close------, mac=%s, name=%s", C45288e.m50135f(remove.f61087a), remove.f61088b.getName());
            MMHandler mMHandler = remove.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(2))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 2);
            }
            this.f61085e.f61075j.put(Long.valueOf(this.f61084d), Boolean.TRUE);
            return;
        }
        Log.m105928w("MicroMsg.exdevice.BluetoothLESimpleManager", "session not found! maybe ui don't handle session disconnect event correctly.");
    }
}
