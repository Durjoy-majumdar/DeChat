package ok0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.UUID;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.h */
public class C89242h extends C89684a {

    /* renamed from: n */
    public final String f257135n;

    /* renamed from: o */
    public final String f257136o;

    /* renamed from: p */
    public final Integer f257137p;

    public C89242h(String str, String str2, Integer num) {
        this.f257135n = str;
        this.f257136o = str2;
        this.f257137p = num;
    }

    /* renamed from: h */
    public void mo33884h(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        Log.m105925i("MicroMsg.Ble.Action", "action:%s onCharacteristicRead status:%s", this, C89691f.m112154a(i));
        mo124010m();
    }

    /* renamed from: l */
    public void mo123562l() {
        BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
        if (bluetoothGatt == null) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            mo124011p(C89696k.f257975l);
            mo124010m();
        } else if (!C90216b.m112937f(this.f257135n)) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            mo124011p(C89696k.f257973j);
            mo124010m();
        } else {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(this.f257135n));
            if (service == null) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
                mo124011p(C89696k.f257973j);
                mo124010m();
            } else if (!C90216b.m112937f(this.f257136o)) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
                mo124011p(C89696k.f257974k);
                mo124010m();
            } else {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
                UUID fromString = UUID.fromString(this.f257136o);
                Integer num = this.f257137p;
                if (num != null) {
                    Log.m105925i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
                    Iterator<BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothGattCharacteristic next = it.next();
                        if (fromString.equals(next.getUuid()) && this.f257137p.intValue() == next.getInstanceId()) {
                            bluetoothGattCharacteristic = next;
                            break;
                        }
                    }
                } else {
                    bluetoothGattCharacteristic = service.getCharacteristic(fromString);
                }
                if (bluetoothGattCharacteristic == null) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
                    mo124011p(C89696k.f257974k);
                    mo124010m();
                    return;
                }
                if (!((bluetoothGattCharacteristic.getProperties() & 2) > 0)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s, not support read", this);
                    mo124011p(C89696k.f257976m);
                    mo124010m();
                } else if (!bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.readCharacteristic fail", this);
                    mo124011p(C89696k.m112158b("readCharacteristic fail"));
                    mo124010m();
                } else {
                    mo124011p(C89696k.f257968e);
                }
            }
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "ReadCharacteristicAction";
    }

    public String toString() {
        return "ReadCharacteristicAction#" + this.f257945m + "{serviceId='" + this.f257135n + '\'' + ", characteristicId='" + this.f257136o + '\'' + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
