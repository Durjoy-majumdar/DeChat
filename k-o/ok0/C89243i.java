package ok0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86917b;
import fl0.C86920e;
import gy3.C87412m;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.i */
public final class C89243i extends C89684a {

    /* renamed from: n */
    public final Integer f257138n;

    /* renamed from: o */
    public final String f257139o;

    public C89243i(Integer num, String str) {
        this.f257138n = num;
        this.f257139o = str;
    }

    /* renamed from: a */
    public void mo33877a(BluetoothGatt bluetoothGatt, int i, int i2) {
        C87412m.m108594g(bluetoothGatt, "gatt");
        String a = C89691f.m112154a(i2);
        Log.m105925i("MicroMsg.Ble.Action", "onMtuChanged: mtu = %d, status = %s", Integer.valueOf(i), a);
        if (i2 == 0) {
            Integer num = this.f257138n;
            if (num != null && i == num.intValue()) {
                mo124011p(new C89696k(0, "", C86920e.f252311a, Integer.valueOf(i)));
            } else {
                mo124011p(new C89696k(-1, "fail:internal error", C86917b.f252281d, Integer.valueOf(i)));
            }
        } else {
            mo124011p(C89696k.m112157a("status: " + a));
        }
        mo124010m();
    }

    /* renamed from: l */
    public void mo123562l() {
        if (C90216b.m112935d() == null) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, bluetoothAdapter is null", this);
            mo124011p(C89696k.f257972i);
            mo124010m();
            return;
        }
        String str = this.f257139o;
        if (str == null || !BluetoothAdapter.checkBluetoothAddress(str) || this.f257138n == null) {
            Log.m105929w("MicroMsg.Ble.Action", "action:%s, unspecified deviceId", this);
            mo124011p(C89696k.f257984u);
            mo124010m();
        } else if (!C90216b.m112933b()) {
            Log.m105921e("MicroMsg.Ble.Action", "bluetooth is not enable.", new Object[0]);
            mo124011p(C89696k.f257972i);
            mo124010m();
        } else {
            BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
            if (bluetoothGatt == null) {
                mo124011p(C89696k.f257975l);
                mo124010m();
            } else if (this.f257138n.intValue() > 512) {
                mo124011p(new C89696k(10013, "fail:invalid data, DEFAULT_MAX_MTU = 512", C86920e.f252317g, (Object) null));
                mo124010m();
            } else if (this.f257138n.intValue() < 23) {
                mo124011p(new C89696k(10013, "fail:invalid data, DEFAULT_MIN_MTU = 23", C86920e.f252317g, (Object) null));
                mo124010m();
            } else {
                int i = this.f257933a.f256612l;
                Log.m105925i("MicroMsg.Ble.Action", "action:" + this + ", mtuSize: " + this.f257138n + ", curMtu: " + i, new Object[0]);
                Integer num = this.f257138n;
                if (num != null && num.intValue() == i) {
                    mo124011p(new C89696k(0, "", C86920e.f252311a, Integer.valueOf(i)));
                    mo124010m();
                } else if (!bluetoothGatt.requestMtu(this.f257138n.intValue())) {
                    mo124011p(C89696k.m112158b("requestMtu fail"));
                    mo124010m();
                }
            }
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "SetMtuAction";
    }
}
