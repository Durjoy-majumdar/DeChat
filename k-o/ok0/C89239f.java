package ok0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.UUID;
import pk0.C89364a;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.f */
public class C89239f extends C89684a {

    /* renamed from: n */
    public final String f257122n;

    /* renamed from: o */
    public final String f257123o;

    /* renamed from: p */
    public final Integer f257124p;

    /* renamed from: q */
    public final boolean f257125q;

    public C89239f(String str, String str2, Integer num, boolean z) {
        this.f257122n = str;
        this.f257123o = str2;
        this.f257124p = num;
        this.f257125q = z;
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
        } else if (!C90216b.m112937f(this.f257122n)) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            mo124011p(C89696k.f257973j);
            mo124010m();
        } else {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(this.f257122n));
            if (service == null) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
                mo124011p(C89696k.f257973j);
                mo124010m();
            } else if (!C90216b.m112937f(this.f257123o)) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
                mo124011p(C89696k.f257974k);
                mo124010m();
            } else {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
                UUID fromString = UUID.fromString(this.f257123o);
                Integer num = this.f257124p;
                if (num != null) {
                    Log.m105925i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
                    Iterator<BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothGattCharacteristic next = it.next();
                        if (fromString.equals(next.getUuid()) && this.f257124p.intValue() == next.getInstanceId()) {
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
                if (!((bluetoothGattCharacteristic.getProperties() & 16) > 0)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s, not support notify", this);
                    mo124011p(C89696k.f257976m);
                    mo124010m();
                } else if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, this.f257125q)) {
                    Log.m105921e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", this);
                    mo124011p(C89696k.m112158b("setCharacteristicNotification fail"));
                    mo124010m();
                } else {
                    BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(C89364a.f257345a);
                    if (descriptor == null) {
                        Log.m105921e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", this);
                        mo124011p(C89696k.f257979p);
                        mo124010m();
                        return;
                    }
                    if (!descriptor.setValue(this.f257125q ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
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
    }

    /* renamed from: n */
    public String mo123563n() {
        return "NotifyCharacteristicAction";
    }

    public String toString() {
        return "NotifyCharacteristicAction#" + this.f257945m + "{serviceId='" + this.f257122n + '\'' + ", characteristicId='" + this.f257123o + '\'' + ", enable=" + this.f257125q + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
