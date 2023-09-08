package lk0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13604l;
import sk0.C90215a;
import sx3.C36907w;
import z04.C119027c;

/* renamed from: lk0.b */
public final class C88546b extends BluetoothGattServerCallback {

    /* renamed from: a */
    public final HashSet<BluetoothDevice> f255756a = new HashSet<>();

    /* renamed from: b */
    public final Map<Integer, C88562n> f255757b = new ConcurrentHashMap();

    /* renamed from: c */
    public C88564p f255758c;

    /* renamed from: a */
    public final boolean mo123011a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "deviceNotExist: device == null");
            return true;
        }
        HashSet<BluetoothDevice> hashSet = this.f255756a;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(hashSet, 10));
        for (BluetoothDevice address : hashSet) {
            arrayList.add(address.getAddress());
        }
        if (arrayList.contains(bluetoothDevice.getAddress())) {
            return false;
        }
        Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "deviceNotExist: is not contain device");
        return true;
    }

    /* renamed from: b */
    public final C88564p mo123012b() {
        C88564p pVar = this.f255758c;
        if (pVar != null) {
            return pVar;
        }
        C87412m.m108603p("server");
        throw null;
    }

    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        C87412m.m108594g(bluetoothGattCharacteristic, "characteristic");
        super.onCharacteristicReadRequest(bluetoothDevice, i, i2, bluetoothGattCharacteristic);
        Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "Device tried to read characteristic: " + bluetoothGattCharacteristic.getUuid());
        Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "Value: " + Arrays.toString(bluetoothGattCharacteristic.getValue()));
        if (!mo123011a(bluetoothDevice)) {
            if (i2 != 0) {
                mo123012b().mo123025a().sendResponse(bluetoothDevice, i, 7, i2, bluetoothGattCharacteristic.getValue());
                return;
            }
            int c = C90215a.m112931c();
            while (true) {
                if (!((ConcurrentHashMap) this.f255757b).containsKey(Integer.valueOf(c))) {
                    break;
                }
                c = C90215a.m112931c();
            }
            boolean z = true;
            Log.m105925i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: callbackId = %d", Integer.valueOf(c));
            C82381f fVar = mo123012b().f255787c;
            if (fVar != null) {
                int i3 = mo123012b().f255788d;
                String uuid = bluetoothGattCharacteristic.getService().getUuid().toString();
                C87412m.m108593f(uuid, "characteristic.service.uuid.toString()");
                String uuid2 = bluetoothGattCharacteristic.getUuid().toString();
                C87412m.m108593f(uuid2, "characteristic.uuid.toString()");
                Log.m105924i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnCharacteristicReadRequest: serverID = " + i3 + ", serviceUUID = " + uuid + ",\" +\n        \" characteristicUUID = " + uuid2 + ", callbackId = " + c);
                try {
                    C88560l lVar = new C88560l();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("serverId", i3);
                    jSONObject.put("serviceId", uuid);
                    jSONObject.put("characteristicId", uuid2);
                    jSONObject.put("callbackId", c);
                    lVar.mo115163m(jSONObject.toString());
                    lVar.mo115161k(fVar);
                    lVar.mo115158h();
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "OnCharacteristicReadRequest: fail", e);
                    z = false;
                }
                if (z) {
                    C87412m.m108591d(bluetoothDevice);
                    C88562n nVar = new C88562n(bluetoothDevice, i, i2);
                    Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicReadRequest: pendingWriteReqList ret = " + ((C88562n) ((ConcurrentHashMap) this.f255757b).put(Integer.valueOf(c), nVar)) + " id = " + c);
                    return;
                }
                return;
            }
            C87412m.m108603p("component");
            throw null;
        }
    }

    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        int i3 = i2;
        byte[] bArr2 = bArr;
        C87412m.m108594g(bluetoothDevice2, TPReportKeys.Common.COMMON_DEVICE_NAME);
        C87412m.m108594g(bluetoothGattCharacteristic, "characteristic");
        C87412m.m108594g(bArr2, "value");
        super.onCharacteristicWriteRequest(bluetoothDevice, i, bluetoothGattCharacteristic, z, z2, i2, bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("Characteristic Write request: ");
        String arrays = Arrays.toString(bArr);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        Log.m105926v("MicroMsg.BLE.GattServerCallbackImpl", sb.toString());
        if (!mo123011a(bluetoothDevice)) {
            if (i3 != 0) {
                mo123012b().mo123025a().sendResponse(bluetoothDevice, i, 7, i2, bluetoothGattCharacteristic.getValue());
                return;
            }
            int c = C90215a.m112931c();
            while (true) {
                if (!((ConcurrentHashMap) this.f255757b).containsKey(Integer.valueOf(c))) {
                    break;
                }
                c = C90215a.m112931c();
            }
            boolean z3 = true;
            Log.m105925i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicWriteRequest: callbackId = %d", Integer.valueOf(c));
            byte[] encode = Base64.encode(bArr2, 2);
            C82381f fVar = mo123012b().f255787c;
            if (fVar != null) {
                int i4 = mo123012b().f255788d;
                String uuid = bluetoothGattCharacteristic.getService().getUuid().toString();
                C87412m.m108593f(uuid, "characteristic.service.uuid.toString()");
                String uuid2 = bluetoothGattCharacteristic.getUuid().toString();
                C87412m.m108593f(uuid2, "characteristic.uuid.toString()");
                C87412m.m108593f(encode, "base64Value");
                String str = new String(encode, C119027c.f356488a);
                Log.m105924i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnCharacteristicWriteRequest: serverID = " + i4 + ", serviceUUID = " + uuid + ", characteristicUUID = " + uuid2 + ", callbackId = " + c);
                try {
                    C88561m mVar = new C88561m();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("serverId", i4);
                    jSONObject.put("serviceId", uuid);
                    jSONObject.put("characteristicId", uuid2);
                    jSONObject.put("callbackId", c);
                    jSONObject.put("value", str);
                    mVar.mo115163m(jSONObject.toString());
                    mVar.mo115161k(fVar);
                    mVar.mo115158h();
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "BlePeripheralPublishEventFuns fail", e);
                    z3 = false;
                }
                if (z3) {
                    C88562n nVar = new C88562n(bluetoothDevice2, i, i3);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f255757b;
                    Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "onCharacteristicWriteRequest: pendingWriteReqList res = " + ((C88562n) concurrentHashMap.put(Integer.valueOf(c), nVar)) + ", id = " + c);
                    return;
                }
                return;
            }
            C87412m.m108603p("component");
            throw null;
        }
    }

    public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        C87412m.m108594g(bluetoothDevice, TPReportKeys.Common.COMMON_DEVICE_NAME);
        super.onConnectionStateChange(bluetoothDevice, i, i2);
        if (i != 0) {
            this.f255756a.remove(bluetoothDevice);
            Log.m105920e("MicroMsg.BLE.GattServerCallbackImpl", "Error when connecting: " + i);
        } else if (i2 == 0) {
            this.f255756a.remove(bluetoothDevice);
            C82381f fVar = mo123012b().f255787c;
            if (fVar != null) {
                String address = bluetoothDevice.getAddress();
                C87412m.m108593f(address, "device.address");
                C88545a.m110421a(fVar, address, String.valueOf(mo123012b().f255788d), false);
                mo123012b().f255785a = C88568t.CREATED;
                Log.m105926v("MicroMsg.BLE.GattServerCallbackImpl", "Disconnected from device");
                return;
            }
            C87412m.m108603p("component");
            throw null;
        } else if (i2 == 2) {
            this.f255756a.add(bluetoothDevice);
            C82381f fVar2 = mo123012b().f255787c;
            if (fVar2 != null) {
                String address2 = bluetoothDevice.getAddress();
                C87412m.m108593f(address2, "device.address");
                C88545a.m110421a(fVar2, address2, String.valueOf(mo123012b().f255788d), true);
                mo123012b().f255785a = C88568t.CONNECTED;
                Log.m105926v("MicroMsg.BLE.GattServerCallbackImpl", "Connected to device: " + bluetoothDevice.getAddress());
                return;
            }
            C87412m.m108603p("component");
            throw null;
        }
    }

    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        C87412m.m108594g(bluetoothGattDescriptor, "descriptor");
        super.onDescriptorReadRequest(bluetoothDevice, i, i2, bluetoothGattDescriptor);
        Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "Device tried to read descriptor: " + bluetoothGattDescriptor.getUuid());
        Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "Value: " + Arrays.toString(bluetoothGattDescriptor.getValue()));
        if (i2 != 0) {
            mo123012b().mo123025a().sendResponse(bluetoothDevice, i, 7, i2, (byte[]) null);
            return;
        }
        mo123012b().mo123025a().sendResponse(bluetoothDevice, i, 0, i2, bluetoothGattDescriptor.getValue());
    }

    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        C87412m.m108594g(bluetoothGattDescriptor, "descriptor");
        C87412m.m108594g(bArr, "value");
        super.onDescriptorWriteRequest(bluetoothDevice, i, bluetoothGattDescriptor, z, z2, i2, bArr);
        Log.m105926v("MicroMsg.BLE.GattServerCallbackImpl", "Descriptor Write Request " + bluetoothGattDescriptor.getUuid() + ' ' + Arrays.toString(bArr));
        if (z2) {
            mo123012b().mo123025a().sendResponse(bluetoothDevice, i, 0, 0, (byte[]) null);
        }
    }

    public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        super.onNotificationSent(bluetoothDevice, i);
        Log.m105926v("MicroMsg.BLE.GattServerCallbackImpl", "Notification sent. Status: " + i);
    }

    public void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        C32226l lVar;
        Timer timer;
        super.onServiceAdded(i, bluetoothGattService);
        if (bluetoothGattService != null) {
            Log.m105924i("MicroMsg.BLE.GattServerCallbackImpl", "onServiceAdded: " + bluetoothGattService.getUuid());
            C13604l lVar2 = (C13604l) ((HashMap) mo123012b().f255790f).get(bluetoothGattService.getUuid());
            if (!(lVar2 == null || (timer = (Timer) lVar2.f38556e) == null)) {
                timer.cancel();
            }
            C13604l lVar3 = (C13604l) ((HashMap) mo123012b().f255790f).get(bluetoothGattService.getUuid());
            if (!(lVar3 == null || (lVar = (C32226l) lVar3.f38555d) == null)) {
                lVar.invoke(Boolean.TRUE);
            }
            ((HashMap) mo123012b().f255790f).remove(bluetoothGattService.getUuid());
        }
    }
}
