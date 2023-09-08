package nk0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kk0.C88191m;
import org.json.JSONException;
import org.json.JSONObject;
import qk0.C89684a;
import qk0.C89688c;
import qk0.C89690e;
import qk0.C89691f;
import qk0.C89692g;
import qk0.C89693h;
import qk0.C89694i;

/* renamed from: nk0.g */
public class C89007g implements C21634h {

    /* renamed from: a */
    public final String f256601a = ("MicroMsg.Ble.BleConnectWorker#" + hashCode());

    /* renamed from: b */
    public final Context f256602b;

    /* renamed from: c */
    public String f256603c;

    /* renamed from: d */
    public volatile C89000c f256604d;

    /* renamed from: e */
    public volatile BluetoothGatt f256605e;

    /* renamed from: f */
    public List<C89690e> f256606f;

    /* renamed from: g */
    public volatile Map<String, List<C89688c>> f256607g;

    /* renamed from: h */
    public volatile C89694i f256608h = null;

    /* renamed from: i */
    public volatile C89693h f256609i = null;

    /* renamed from: j */
    public volatile C89692g f256610j = null;

    /* renamed from: k */
    public final C89004f f256611k;

    /* renamed from: l */
    public volatile int f256612l = -1;

    public C89007g(Context context, String str, C89004f fVar) {
        this.f256602b = context;
        this.f256603c = str;
        this.f256611k = fVar;
    }

    /* renamed from: a */
    public void mo33877a(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = this.f256601a;
        Object[] objArr = new Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = C89691f.m112154a(i2);
        Log.m105925i(str, "[onMtuChanged]gatt deviceId:%s mtu:%d status:%s", objArr);
        if (bluetoothGatt != null) {
            if (i2 == 0) {
                this.f256612l = i;
                String address = bluetoothGatt.getDevice().getAddress();
                C89692g gVar = this.f256610j;
                if (gVar != null) {
                    C88191m.C88198g gVar2 = new C88191m.C88198g((C88191m.C88192a) null);
                    C82381f fVar = ((C88191m.C88195d) gVar).f254997a;
                    if (fVar == null) {
                        Log.m105928w("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, service is null");
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("deviceId", address);
                            jSONObject.put("mtu", i);
                        } catch (JSONException e) {
                            Log.m105928w("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, put params fail since " + e);
                        }
                        String jSONObject2 = jSONObject.toString();
                        int componentId = fVar.getComponentId();
                        gVar2.mo115161k(fVar);
                        gVar2.f242409h = componentId;
                        gVar2.f242407f = jSONObject2;
                        gVar2.mo115158h();
                        Log.m105924i("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, paramsStr: " + jSONObject2);
                    }
                }
            }
            C89000c cVar = this.f256604d;
            if (cVar != null) {
                cVar.mo33877a(bluetoothGatt, i, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo33878b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str = this.f256601a;
        Object[] objArr = new Object[2];
        String str2 = "";
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : str2;
        if (bluetoothGattCharacteristic != null) {
            str2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        }
        objArr[1] = str2;
        Log.m105925i(str, "[onCharacteristicChanged]gatt deviceId:%s characteristicId:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33878b(bluetoothGatt, bluetoothGattCharacteristic);
            if (bluetoothGatt != null && bluetoothGattCharacteristic != null) {
                C89693h hVar = this.f256609i;
                if (hVar == null) {
                    Log.m105929w(this.f256601a, "[change] onBleCharacteristicValueChange is null", new Object[0]);
                    return;
                }
                String str3 = new String(Base64.encode(bluetoothGattCharacteristic.getValue(), 2));
                String address = bluetoothGatt.getDevice().getAddress();
                String upperCase = bluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
                String upperCase2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
                Log.m105925i(this.f256601a, "[change]deviceId %s, serviceId %s, characteristicId %s, value %s", address, upperCase, upperCase2, str3);
                hVar.mo122577a(address, upperCase, upperCase2, str3);
            }
        }
    }

    /* renamed from: c */
    public void mo33879c(BluetoothGatt bluetoothGatt, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = C89691f.m112154a(i);
        Log.m105925i(str, "[onReliableWriteCompleted]gatt deviceId:%s status:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33879c(bluetoothGatt, i);
        }
    }

    /* renamed from: d */
    public void mo33880d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[4];
        Object obj = "";
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : obj;
        objArr[1] = bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid().toString().toUpperCase() : obj;
        if (bluetoothGattCharacteristic != null) {
            obj = Arrays.asList(new byte[][]{bluetoothGattCharacteristic.getValue()});
        }
        objArr[2] = obj;
        objArr[3] = C89691f.m112154a(i);
        Log.m105925i(str, "[onCharacteristicWrite]gatt deviceId:%s characteristicId:%s value:%s, status:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33880d(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    /* renamed from: e */
    public void mo33881e(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = this.f256601a;
        Object[] objArr = new Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = C89691f.m112154a(i2);
        Log.m105925i(str, "[onReadRemoteRssi]gatt deviceId:%s rssi:%d status:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33881e(bluetoothGatt, i, i2);
        }
    }

    /* renamed from: f */
    public void mo33882f(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[2];
        String str2 = "";
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : str2;
        if (bluetoothGattDescriptor != null) {
            str2 = bluetoothGattDescriptor.getUuid().toString().toUpperCase();
        }
        objArr[1] = str2;
        Log.m105925i(str, "[onDescriptorRead]gatt deviceId:%s descriptorId:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33882f(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    /* renamed from: g */
    public void mo33883g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[2];
        String str2 = "";
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : str2;
        if (bluetoothGattDescriptor != null) {
            str2 = bluetoothGattDescriptor.getUuid().toString().toUpperCase();
        }
        objArr[1] = str2;
        Log.m105925i(str, "[onDescriptorWrite]gatt deviceId:%s descriptorId:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33883g(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    /* renamed from: h */
    public void mo33884h(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[3];
        String str2 = "";
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : str2;
        if (bluetoothGattCharacteristic != null) {
            str2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        }
        objArr[1] = str2;
        objArr[2] = C89691f.m112154a(i);
        Log.m105925i(str, "[onCharacteristicRead]gatt deviceId:%s characteristicId:%s status:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33884h(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (bluetoothGatt != null && bluetoothGattCharacteristic != null && i == 0) {
                C89693h hVar = this.f256609i;
                if (hVar == null) {
                    Log.m105929w(this.f256601a, "[change] onBleCharacteristicValueChange is null", new Object[0]);
                    return;
                }
                String str3 = new String(Base64.encode(bluetoothGattCharacteristic.getValue(), 2));
                String address = bluetoothGatt.getDevice().getAddress();
                String upperCase = bluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
                String upperCase2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
                Log.m105925i(this.f256601a, "[read]deviceId %s, serviceId %s, characteristicId %s, value %s", address, upperCase, upperCase2, str3);
                hVar.mo122577a(address, upperCase, upperCase2, str3);
            }
        }
    }

    /* renamed from: i */
    public void mo33885i(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = this.f256601a;
        Object[] objArr = new Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = C89691f.m112154a(i);
        objArr[2] = i2 == 2 ? "CONNECTED" : "DISCONNECTED";
        Log.m105925i(str, "[onConnectionStateChange]gatt deviceId:%s gattStatus:%s, newState:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33885i(bluetoothGatt, i, i2);
            if (i != 0) {
                mo123376k(true);
            } else if (i2 != 2 && i2 == 0) {
                mo123376k(true);
            }
        }
    }

    /* renamed from: j */
    public void mo33886j(BluetoothGatt bluetoothGatt, int i) {
        String str = this.f256601a;
        Object[] objArr = new Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = C89691f.m112154a(i);
        Log.m105925i(str, "[onServicesDiscovered]gatt deviceId:%s status:%s", objArr);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            cVar.mo33886j(bluetoothGatt, i);
        }
    }

    /* renamed from: k */
    public synchronized void mo123376k(boolean z) {
        Log.m105925i(this.f256601a, "closeMyself deviceId:%s", this.f256603c);
        mo123380o(z);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            synchronized (cVar) {
                Queue<C89684a> queue = cVar.f256588a;
                if (queue != null) {
                    queue.clear();
                    cVar.f256588a = null;
                }
                List<C89684a> list = cVar.f256590c;
                if (list != null) {
                    ((ArrayList) list).clear();
                    cVar.f256590c = null;
                }
            }
            this.f256604d = null;
        }
        List<C89690e> list2 = this.f256606f;
        if (list2 != null) {
            ((ArrayList) list2).clear();
            this.f256606f = null;
        }
        Map<String, List<C89688c>> map = this.f256607g;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
            this.f256607g = null;
        }
        C89004f fVar = this.f256611k;
        String str = this.f256603c;
        Map<String, C89007g> map2 = fVar.f256596b;
        if (map2 == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "removeWorker, connectWorkers is null", new Object[0]);
        } else {
            ((ConcurrentHashMap) map2).remove(str);
        }
    }

    /* renamed from: l */
    public final synchronized C89000c mo123377l() {
        C89000c cVar;
        cVar = this.f256604d;
        if (cVar == null) {
            cVar = new C89000c();
            synchronized (cVar) {
                cVar.f256588a = new ConcurrentLinkedQueue();
                cVar.f256590c = new ArrayList();
            }
            this.f256604d = cVar;
        }
        return cVar;
    }

    /* renamed from: m */
    public synchronized List<C89690e> mo123378m() {
        BluetoothGatt bluetoothGatt = this.f256605e;
        if (bluetoothGatt == null) {
            Log.m105921e(this.f256601a, "[getServices] bluetoothGatt is null, err", new Object[0]);
            return null;
        } else if (Util.isNullOrNil(this.f256603c)) {
            Log.m105921e(this.f256601a, "[getServices] deviceId is null, err", new Object[0]);
            return null;
        } else {
            if (this.f256606f == null) {
                List<BluetoothGattService> services = bluetoothGatt.getServices();
                if (services == null) {
                    Log.m105929w(this.f256601a, "[getServices] bluetoothGattServices is null, err", new Object[0]);
                    return null;
                }
                this.f256606f = new ArrayList();
                ArrayList arrayList = new ArrayList();
                for (BluetoothGattService next : services) {
                    C89690e eVar = new C89690e();
                    eVar.f257965a = next.getUuid().toString().toUpperCase();
                    eVar.f257966b = next.getType() == 0;
                    if (!eVar.f257965a.equals("00001800-0000-1000-8000-00805F9B34FB")) {
                        if (!eVar.f257965a.equals("00001801-0000-1000-8000-00805F9B34FB")) {
                            this.f256606f.add(eVar);
                        }
                    }
                    arrayList.add(eVar);
                }
                if (arrayList.size() > 0) {
                    this.f256606f.addAll(arrayList);
                }
            } else {
                Log.m105925i(this.f256601a, "[getServices] use cache", new Object[0]);
            }
            return new ArrayList(this.f256606f);
        }
    }

    /* renamed from: n */
    public synchronized void mo123379n() {
        Log.m105925i(this.f256601a, "init deviceId:%s", this.f256603c);
        this.f256604d = mo123377l();
        this.f256607g = new ConcurrentHashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(2:6|(1:8)(1:9))|10|(2:12|(4:14|15|16|(1:18)))|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo123380o(boolean r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.bluetooth.BluetoothGatt r0 = r7.f256605e     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r7.f256601a     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "deviceId:%s innerCloseMyself"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = r7.f256603c     // Catch:{ all -> 0x0065 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0065 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x0065 }
            if (r8 == 0) goto L_0x0029
            java.lang.String r8 = r7.f256603c     // Catch:{ all -> 0x0065 }
            qk0.i r1 = r7.f256608h     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0026
            java.lang.String r8 = r7.f256601a     // Catch:{ all -> 0x0065 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "notifyConnectionStateChange, onBleConnectionStateChange is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0029
        L_0x0026:
            r1.mo114612a(r8, r6)     // Catch:{ all -> 0x0065 }
        L_0x0029:
            mk0.a r8 = mk0.C88736a.m110767a()     // Catch:{ all -> 0x0065 }
            boolean r8 = r8.f256129d     // Catch:{ all -> 0x0065 }
            if (r8 == 0) goto L_0x005d
            java.lang.String r8 = r7.f256601a     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "deviceId:%s refreshGattCache"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = r7.f256603c     // Catch:{ all -> 0x0065 }
            r2[r6] = r4     // Catch:{ all -> 0x0065 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r2)     // Catch:{ all -> 0x0065 }
            android.bluetooth.BluetoothGatt r8 = r7.f256605e     // Catch:{ all -> 0x0065 }
            if (r8 == 0) goto L_0x005d
            java.lang.Class<android.bluetooth.BluetoothGatt> r1 = android.bluetooth.BluetoothGatt.class
            java.lang.String r2 = "refresh"
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x005d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x005d
            r1.setAccessible(r3)     // Catch:{ Exception -> 0x005d }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x005d }
            java.lang.Object r8 = r1.invoke(r8, r2)     // Catch:{ Exception -> 0x005d }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x005d }
            r8.booleanValue()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            r0.close()     // Catch:{ all -> 0x0065 }
            r8 = 0
            r7.f256605e = r8     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r7)
            return
        L_0x0065:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nk0.C89007g.mo123380o(boolean):void");
    }

    /* renamed from: p */
    public synchronized void mo123381p() {
        Log.m105925i(this.f256601a, "uninit deviceId:%s", this.f256603c);
        mo123380o(true);
        C89000c cVar = this.f256604d;
        if (cVar != null) {
            synchronized (cVar) {
                Queue<C89684a> queue = cVar.f256588a;
                if (queue != null) {
                    queue.clear();
                    cVar.f256588a = null;
                }
                List<C89684a> list = cVar.f256590c;
                if (list != null) {
                    ((ArrayList) list).clear();
                    cVar.f256590c = null;
                }
            }
            this.f256604d = null;
        }
        List<C89690e> list2 = this.f256606f;
        if (list2 != null) {
            ((ArrayList) list2).clear();
            this.f256606f = null;
        }
        Map<String, List<C89688c>> map = this.f256607g;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
            this.f256607g = null;
        }
        this.f256608h = null;
        this.f256609i = null;
        this.f256610j = null;
    }
}
