package ok0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.j */
public class C89244j extends C89684a {

    /* renamed from: n */
    public final String f257140n;

    /* renamed from: o */
    public final String f257141o;

    /* renamed from: p */
    public final Integer f257142p;

    /* renamed from: q */
    public final int f257143q;

    /* renamed from: r */
    public final String f257144r;

    public C89244j(String str, String str2, Integer num, int i, String str3) {
        this.f257140n = str;
        this.f257141o = str2;
        this.f257142p = num;
        this.f257143q = i;
        this.f257144r = str3;
    }

    /* renamed from: d */
    public void mo33880d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String a = C89691f.m112154a(i);
        Log.m105925i("MicroMsg.Ble.Action", "action:%s onCharacteristicWrite status:%s", this, a);
        if (i == 0) {
            mo124011p(C89696k.f257968e);
        } else {
            mo124011p(C89696k.m112158b("status: " + a));
        }
        mo124010m();
    }

    /* renamed from: l */
    public void mo123562l() {
        BluetoothGatt bluetoothGatt = this.f257933a.f256605e;
        if (bluetoothGatt == null) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            mo124011p(C89696k.f257975l);
            mo124010m();
        } else if (!C90216b.m112937f(this.f257140n)) {
            Log.m105921e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            mo124011p(C89696k.f257973j);
            mo124010m();
        } else {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(this.f257140n));
            if (service == null) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
                mo124011p(C89696k.f257973j);
                mo124010m();
            } else if (!C90216b.m112937f(this.f257141o)) {
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
                mo124011p(C89696k.f257974k);
                mo124010m();
            } else {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
                UUID fromString = UUID.fromString(this.f257141o);
                Integer num = this.f257142p;
                if (num != null) {
                    Log.m105925i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
                    Iterator<BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothGattCharacteristic next = it.next();
                        if (fromString.equals(next.getUuid()) && this.f257142p.intValue() == next.getInstanceId()) {
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
                boolean z = (bluetoothGattCharacteristic.getProperties() & 8) > 0;
                boolean z2 = (bluetoothGattCharacteristic.getProperties() & 4) > 0;
                Log.m105921e("MicroMsg.Ble.Action", "action:%s, writeType: %d, supportWrite: %b, supportWriteNoResponse: %b", this, Integer.valueOf(this.f257143q), Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z || z2) {
                    int i = this.f257143q;
                    if ((1 != i || z) && (2 != i || z2)) {
                        int writeType = bluetoothGattCharacteristic.getWriteType();
                        int i2 = this.f257143q;
                        if (i2 == 1) {
                            bluetoothGattCharacteristic.setWriteType(2);
                        } else if (i2 == 2) {
                            bluetoothGattCharacteristic.setWriteType(1);
                        }
                        byte[] a = C90216b.m112932a(Base64.decode(this.f257144r, 2));
                        bluetoothGattCharacteristic.setValue(a);
                        Log.m105929w("MicroMsg.Ble.Action", "dataToWrite's length:%d", Integer.valueOf(a.length));
                        if (this.f257938f) {
                            Log.m105925i("MicroMsg.Ble.Action", "dataToWrite:%s", Arrays.toString(a));
                        }
                        if (!bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                            Log.m105921e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeCharacteristic fail", this);
                            bluetoothGattCharacteristic.setWriteType(writeType);
                            mo124011p(C89696k.m112158b("writeCharacteristic fail"));
                            mo124010m();
                            return;
                        }
                        bluetoothGattCharacteristic.setWriteType(writeType);
                        return;
                    }
                    mo124011p(C89696k.f257987x);
                    mo124010m();
                    return;
                }
                mo124011p(C89696k.f257976m);
                mo124010m();
            }
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "WriteCharacteristicAction";
    }

    public String toString() {
        return "WriteCharacteristicAction#" + this.f257945m + "{serviceId='" + this.f257140n + '\'' + ", characteristicId='" + this.f257141o + '\'' + ", value='" + this.f257144r + '\'' + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
