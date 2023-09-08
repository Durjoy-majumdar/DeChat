package mw0;

import android.bluetooth.BluetoothDevice;

/* renamed from: mw0.j */
public class C88859j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BluetoothDevice f256313d;

    /* renamed from: e */
    public final /* synthetic */ int f256314e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f256315f;

    /* renamed from: g */
    public final /* synthetic */ C88855i f256316g;

    public C88859j(C88855i iVar, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f256316g = iVar;
        this.f256313d = bluetoothDevice;
        this.f256314e = i;
        this.f256315f = bArr;
    }

    public void run() {
        for (int i = 0; i < this.f256316g.f256302b.size(); i++) {
            this.f256316g.f256302b.get(i).mo33766b(this.f256313d, this.f256314e, this.f256315f);
        }
    }
}
