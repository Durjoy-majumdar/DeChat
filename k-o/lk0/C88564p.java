package lk0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import rx3.C13598b0;
import rx3.C13604l;
import sk0.C90216b;

/* renamed from: lk0.p */
public final class C88564p {

    /* renamed from: a */
    public C88568t f255785a = C88568t.INIT;

    /* renamed from: b */
    public BluetoothGattServer f255786b;

    /* renamed from: c */
    public C82381f f255787c;

    /* renamed from: d */
    public int f255788d = -1;

    /* renamed from: e */
    public final CopyOnWriteArrayList<AdvertiseCallback> f255789e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public final Map<UUID, C13604l<C32226l<Boolean, C13598b0>, Timer>> f255790f = new HashMap();

    /* renamed from: g */
    public C88546b f255791g;

    /* renamed from: a */
    public final BluetoothGattServer mo123025a() {
        BluetoothGattServer bluetoothGattServer = this.f255786b;
        if (bluetoothGattServer != null) {
            return bluetoothGattServer;
        }
        C87412m.m108603p("gattServer");
        throw null;
    }

    /* renamed from: b */
    public final void mo123026b(UUID uuid, UUID uuid2, boolean z, int i, String str) {
        C87412m.m108594g(uuid, "serviceId");
        C87412m.m108594g(uuid2, "characteristicId");
        C87412m.m108594g(str, "base64Value");
        BluetoothGattService service = mo123025a().getService(uuid);
        if (service == null) {
            Log.m105924i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: server == null");
            return;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Log.m105924i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: characteristic == null");
            return;
        }
        characteristic.setValue(C90216b.m112932a(Base64.decode(str, 2)));
        if (z) {
            C88546b bVar = this.f255791g;
            C87412m.m108591d(bVar);
            for (BluetoothDevice notifyCharacteristicChanged : bVar.f255756a) {
                Log.m105925i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", String.valueOf(mo123025a().notifyCharacteristicChanged(notifyCharacteristicChanged, characteristic, false)));
            }
        } else {
            C88546b bVar2 = this.f255791g;
            C87412m.m108591d(bVar2);
            for (BluetoothDevice notifyCharacteristicChanged2 : bVar2.f255756a) {
                Log.m105925i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", String.valueOf(mo123025a().notifyCharacteristicChanged(notifyCharacteristicChanged2, characteristic, true)));
            }
        }
        C88546b bVar3 = this.f255791g;
        C87412m.m108591d(bVar3);
        C88562n nVar = (C88562n) ((ConcurrentHashMap) bVar3.f255757b).get(Integer.valueOf(i));
        if (nVar == null) {
            Log.m105924i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: #" + i + " callbackId -> pendingResp is null");
            return;
        }
        Log.m105925i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: device = %s, requestId = %s", nVar.f255781a.toString(), String.valueOf(nVar.f255782b));
        if (!mo123025a().sendResponse(nVar.f255781a, nVar.f255782b, 0, nVar.f255783c, characteristic.getValue())) {
            Log.m105920e("MicroMsg.BLE.PeripheralBleServer", "sendPendingRespFail");
        }
        C88546b bVar4 = this.f255791g;
        C87412m.m108591d(bVar4);
        ((ConcurrentHashMap) bVar4.f255757b).remove(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo123027c() {
        Map<Integer, C88562n> map;
        ((HashMap) this.f255790f).clear();
        mo123025a().close();
        BluetoothAdapter d = C90216b.m112935d();
        if (d != null) {
            mo123028d(d);
        }
        C88546b bVar = this.f255791g;
        if (!(bVar == null || (map = bVar.f255757b) == null)) {
            ((ConcurrentHashMap) map).clear();
        }
        this.f255791g = null;
        this.f255785a = C88568t.DESTROYED;
    }

    /* renamed from: d */
    public final void mo123028d(BluetoothAdapter bluetoothAdapter) {
        C87412m.m108594g(bluetoothAdapter, "adapter");
        BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapter.getBluetoothLeAdvertiser();
        if (bluetoothLeAdvertiser != null) {
            ArrayList<AdvertiseCallback> arrayList = new ArrayList<>();
            for (AdvertiseCallback advertiseCallback : this.f255789e) {
                bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
                arrayList.add(advertiseCallback);
            }
            for (AdvertiseCallback remove : arrayList) {
                this.f255789e.remove(remove);
            }
        }
    }
}
