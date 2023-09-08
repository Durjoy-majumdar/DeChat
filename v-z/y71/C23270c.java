package y71;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: y71.c */
public class C23270c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23272e f66891d;

    /* renamed from: e */
    public final /* synthetic */ int f66892e;

    public C23270c(C23272e eVar, int i) {
        this.f66891d = eVar;
        this.f66892e = i;
    }

    public void run() {
        boolean z;
        C23272e eVar = this.f66891d;
        if (!eVar.f66897a.mo35152i(this.f66892e)) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.stopScan failed!!!");
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.stopScanImp failed!!!");
        }
    }
}
