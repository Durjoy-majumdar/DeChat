package lw0;

import android.bluetooth.BluetoothDevice;

/* renamed from: lw0.i */
public class C21472i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f60802d;

    /* renamed from: e */
    public final /* synthetic */ BluetoothDevice f60803e;

    /* renamed from: f */
    public final /* synthetic */ C88657e f60804f;

    /* renamed from: g */
    public final /* synthetic */ C21462f f60805g;

    public C21472i(C21462f fVar, int i, BluetoothDevice bluetoothDevice, C88657e eVar) {
        this.f60805g = fVar;
        this.f60802d = i;
        this.f60803e = bluetoothDevice;
        this.f60804f = eVar;
    }

    public void run() {
        this.f60805g.f60773d.mo182192a((String) null, this.f60802d, this.f60803e.getAddress(), this.f60804f);
    }
}
