package ok0;

import android.bluetooth.BluetoothGatt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import gy3.C87412m;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.d */
public final class C89237d extends C89684a {

    /* renamed from: n */
    public final String f257118n = ("MicroMsg.AppBrand.GetBLEDeviceRSSIAction" + '#' + hashCode());

    /* renamed from: e */
    public void mo33881e(BluetoothGatt bluetoothGatt, int i, int i2) {
        String a = C89691f.m112154a(i2);
        Log.m105925i(this.f257118n, "onReadRemoteRssi, rssi: %d, statusDesc: %s", Integer.valueOf(i), a);
        if (i2 != 0) {
            mo124011p(C89696k.m112157a("status: " + a));
            mo124010m();
        } else if (!C87412m.m108589b(this.f257933a.f256605e, bluetoothGatt)) {
            Log.m105929w(this.f257118n, "bluetoothGatt is not match", new Object[0]);
            mo124011p(new C89696k(-1, "fail:internal error", C86920e.f252314d, (Object) null));
            mo124010m();
        } else {
            mo124011p(new C89696k(0, "", C86920e.f252311a, Integer.valueOf(i)));
            mo124010m();
        }
    }

    /* renamed from: l */
    public void mo123562l() {
        if (!C90216b.m112933b()) {
            Log.m105929w(this.f257118n, "Bluetooth is not enable.", new Object[0]);
            mo124011p(C89696k.f257972i);
            mo124010m();
            return;
        }
        BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
        if (bluetoothGatt == null) {
            Log.m105929w(this.f257118n, "bluetoothGatt is null", new Object[0]);
            mo124011p(C89696k.f257975l);
            mo124010m();
        } else if (!bluetoothGatt.readRemoteRssi()) {
            mo124011p(C89696k.m112158b("readRemoteRssi fail"));
            mo124010m();
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "GetBLEDeviceRSSIAction";
    }
}
