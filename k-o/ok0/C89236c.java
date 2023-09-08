package ok0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86917b;
import gy3.C87412m;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.c */
public final class C89236c extends C89684a {

    /* renamed from: n */
    public final String f257117n;

    public C89236c(String str) {
        C87412m.m108594g(str, "deviceId");
        this.f257117n = str;
    }

    /* renamed from: j */
    public void mo33886j(BluetoothGatt bluetoothGatt, int i) {
        String a = C89691f.m112154a(i);
        Log.m105925i("MicroMsg.Ble.Action", "[onServicesDiscovered] status:%s", a);
        if (i == 0) {
            mo124011p(C89696k.f257968e);
        } else {
            mo124011p(new C89696k(10008, "fail:not found service, " + ("status: " + a), C86917b.f252281d, (Object) null));
        }
        mo124010m();
    }

    /* renamed from: l */
    public void mo123562l() {
        if (C90216b.m112935d() == null) {
            Log.m105929w("MicroMsg.Ble.Action", "action:%s, bluetoothAdapter is null", this);
            mo124011p(C89696k.f257972i);
            mo124010m();
        } else if (!C90216b.m112933b()) {
            Log.m105929w("MicroMsg.Ble.Action", "action:%s, bluetooth is not enable", this);
            mo124011p(C89696k.f257972i);
            mo124010m();
        } else if (!BluetoothAdapter.checkBluetoothAddress(this.f257117n)) {
            Log.m105929w("MicroMsg.Ble.Action", "action:%s, unspecified deviceId", this);
            mo124011p(C89696k.f257984u);
            mo124010m();
        } else {
            BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
            if (bluetoothGatt == null) {
                Log.m105929w("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
                mo124011p(C89696k.f257975l);
                mo124010m();
            } else if (!bluetoothGatt.discoverServices()) {
                Log.m105929w("MicroMsg.Ble.Action", "action:%s, discoverServices fail", this);
                mo124011p(C89696k.m112158b("discoverServices fail"));
                mo124010m();
            }
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "DiscoverServicesAction";
    }
}
