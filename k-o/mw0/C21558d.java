package mw0;

import android.bluetooth.BluetoothDevice;

/* renamed from: mw0.d */
public class C21558d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BluetoothDevice f61040d;

    /* renamed from: e */
    public final /* synthetic */ int f61041e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f61042f;

    /* renamed from: g */
    public final /* synthetic */ C21555c f61043g;

    public C21558d(C21555c cVar, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f61043g = cVar;
        this.f61040d = bluetoothDevice;
        this.f61041e = i;
        this.f61042f = bArr;
    }

    public void run() {
        for (int i = 0; i < this.f61043g.f61033e.size(); i++) {
            this.f61043g.f61033e.get(i).mo33763b(this.f61040d, this.f61041e, this.f61042f);
        }
    }
}
