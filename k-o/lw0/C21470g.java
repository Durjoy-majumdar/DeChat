package lw0;

import android.bluetooth.BluetoothAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.UUID;
import k20.C9556a;

/* renamed from: lw0.g */
public class C21470g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ UUID f60798d;

    /* renamed from: e */
    public final /* synthetic */ C21462f f60799e;

    public C21470g(C21462f fVar, UUID uuid) {
        this.f60799e = fVar;
        this.f60798d = uuid;
    }

    public void run() {
        C21462f fVar = this.f60799e;
        UUID uuid = this.f60798d;
        fVar.getClass();
        Log.m105924i("MicroMsg.exdevice.IBeaconServer", "startRanging");
        boolean z = true;
        if (uuid == null) {
            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
            z = false;
        } else {
            if (!fVar.f60775f.contains(uuid)) {
                fVar.f60775f.add(uuid);
            }
            synchronized (fVar) {
                if (fVar.f60787u.stopped()) {
                    fVar.f60787u.startTimer(2000);
                }
                if (C21462f.f60772x && fVar.f60786t.stopped()) {
                    fVar.f60786t.startTimer(10000);
                }
                if (fVar.f60788v.stopped()) {
                    if (!C21462f.f60772x) {
                        fVar.f60788v.startTimer(120000);
                    } else {
                        fVar.f60788v.startTimer(1800000);
                    }
                }
                if (!C21462f.f60771w) {
                    fVar.f60779j = true;
                    Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                    Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                    BluetoothAdapter bluetoothAdapter = fVar.f60777h;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(fVar);
                    Boolean valueOf = Boolean.valueOf(((Boolean) C117292a.m165364j(bluetoothAdapter, aVar.mo10232b(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                    if (valueOf.booleanValue() || C21462f.f60771w) {
                        fVar.f60776g = true;
                        C21462f.f60771w = true;
                        Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                    } else {
                        int i = 0;
                        while (!valueOf.booleanValue() && i < 3 && !C21462f.f60771w) {
                            i++;
                            fVar.f60777h.stopLeScan(fVar);
                            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "start IBEACON BLE scan failed,retry no " + i + " time");
                            Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                            Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                            BluetoothAdapter bluetoothAdapter2 = fVar.f60777h;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(fVar);
                            valueOf = Boolean.valueOf(((Boolean) C117292a.m165364j(bluetoothAdapter2, aVar2.mo10232b(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                            if (valueOf.booleanValue()) {
                                C21462f.f60771w = true;
                                fVar.f60776g = true;
                                Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                            }
                        }
                    }
                }
            }
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "startRanging failed!!!");
        }
    }
}
