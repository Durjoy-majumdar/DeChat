package ok0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.UUID;
import pk0.C89364a;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.e */
public class C89238e extends C89684a {

    /* renamed from: n */
    public final String f257119n;

    /* renamed from: o */
    public final String f257120o;

    /* renamed from: p */
    public final boolean f257121p;

    public C89238e(String str, String str2, boolean z) {
        this.f257119n = str;
        this.f257120o = str2;
        this.f257121p = z;
    }

    /* renamed from: g */
    public void mo33883g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        Log.m105925i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", this, C89691f.m112154a(i));
        mo124010m();
    }

    /* renamed from: l */
    public void mo123562l() {
        BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
        if (bluetoothGatt == null) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            mo124011p(C89696k.f257975l);
            mo124010m();
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(this.f257119n));
        if (service == null) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            mo124011p(C89696k.f257973j);
            mo124010m();
        } else if (!C90216b.m112937f(this.f257120o)) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            mo124011p(C89696k.f257974k);
            mo124010m();
        } else {
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(this.f257120o));
            if (characteristic == null) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
                mo124011p(C89696k.f257974k);
                mo124010m();
                return;
            }
            if (!((characteristic.getProperties() & 32) > 0)) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, not support indicate", this);
                mo124011p(C89696k.f257976m);
                mo124010m();
            } else if (!bluetoothGatt.setCharacteristicNotification(characteristic, this.f257121p)) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", this);
                mo124011p(C89696k.m112158b("setCharacteristicNotification fail"));
                mo124010m();
            } else {
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(C89364a.f257345a);
                if (descriptor == null) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", this);
                    mo124011p(C89696k.f257979p);
                    mo124010m();
                    return;
                }
                if (!descriptor.setValue(this.f257121p ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", this);
                    mo124011p(C89696k.f257980q);
                    mo124010m();
                } else if (!bluetoothGatt.writeDescriptor(descriptor)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", this);
                    mo124011p(C89696k.f257981r);
                    mo124010m();
                } else {
                    mo124011p(C89696k.f257968e);
                }
            }
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "IndicateCharacteristicAction";
    }

    public String toString() {
        return "IndicateCharacteristicAction#" + this.f257945m + "{serviceId='" + this.f257119n + '\'' + ", characteristicId='" + this.f257120o + '\'' + ", enable=" + this.f257121p + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
