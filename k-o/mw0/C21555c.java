package mw0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import d81.C45288e;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C9556a;

/* renamed from: mw0.c */
public class C21555c implements BluetoothAdapter.LeScanCallback {

    /* renamed from: i */
    public static C21555c f61031i;

    /* renamed from: d */
    public Context f61032d;

    /* renamed from: e */
    public ArrayList<C21557b> f61033e;

    /* renamed from: f */
    public boolean f61034f;

    /* renamed from: g */
    public BluetoothAdapter f61035g;

    /* renamed from: h */
    public MMHandler f61036h;

    /* renamed from: mw0.c$a */
    public class C21556a extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ boolean f61037a;

        /* renamed from: b */
        public final /* synthetic */ C21557b f61038b;

        public C21556a(boolean z, C21557b bVar) {
            this.f61037a = z;
            this.f61038b = bVar;
        }

        public Object run() {
            boolean z;
            C21555c cVar = C21555c.this;
            boolean z2 = this.f61037a;
            C21557b bVar = this.f61038b;
            Context context = cVar.f61032d;
            boolean z3 = false;
            if (context == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "not found context");
                z = false;
            } else {
                z = context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            }
            if (!z) {
                Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "this phone is not support BLE");
            } else if (cVar.f61035g == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "not found BluetoothAdapter");
            } else {
                if (z2) {
                    if (cVar.f61034f) {
                        Log.m105928w("MicroMsg.exdevice.BluetoothLEScaner", "ble has scan. just add callback and return");
                        cVar.mo33777b(bVar);
                    } else {
                        Log.m105918d("MicroMsg.exdevice.BluetoothLEScaner", "start scan");
                        Log.m105924i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                        Log.printErrStackTrace("MicroMsg.exdevice.BluetoothLEScaner", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                        BluetoothAdapter bluetoothAdapter = cVar.f61035g;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(cVar);
                        boolean booleanValue = ((Boolean) C117292a.m165364j(bluetoothAdapter, aVar.mo10232b(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                        if (booleanValue) {
                            cVar.f61034f = true;
                            cVar.mo33777b(bVar);
                        } else if (cVar.f61033e.size() <= 0) {
                            Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed and callbacklist size is 0,start retry,and bluetooth state is(12 is on ,10 is off): " + cVar.f61035g.getState());
                            int i = 0;
                            while (!booleanValue && i < 3) {
                                cVar.f61035g.stopLeScan(cVar);
                                cVar.f61034f = false;
                                Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed,retry no " + i + " time");
                                Log.m105924i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                                Log.printErrStackTrace("MicroMsg.exdevice.BluetoothLEScaner", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                                BluetoothAdapter bluetoothAdapter2 = cVar.f61035g;
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(cVar);
                                booleanValue = ((Boolean) C117292a.m165364j(bluetoothAdapter2, aVar2.mo10232b(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                                if (booleanValue) {
                                    cVar.f61034f = true;
                                    cVar.mo33777b(bVar);
                                }
                                i++;
                            }
                        } else if (cVar.f61035g.getState() == 12) {
                            Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed when bluetooth state is on.");
                            cVar.f61034f = true;
                            cVar.mo33777b(bVar);
                        } else {
                            Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed");
                        }
                        z3 = booleanValue;
                    }
                } else if (!cVar.f61034f) {
                    Log.m105929w("MicroMsg.exdevice.BluetoothLEScaner", "scan haven't started. just return, callback size = %d", Integer.valueOf(cVar.f61033e.size()));
                } else {
                    if (bVar == null) {
                        Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
                    } else {
                        boolean remove = cVar.f61033e.remove(bVar);
                        Log.m105918d("MicroMsg.exdevice.BluetoothLEScaner", "remove callback " + remove);
                    }
                    if (bVar != null) {
                        bVar.mo33762a();
                    }
                    Log.m105918d("MicroMsg.exdevice.BluetoothLEScaner", "stop deleteCallback");
                    if (cVar.f61033e.size() <= 0) {
                        Log.m105918d("MicroMsg.exdevice.BluetoothLEScaner", "stop scan");
                        cVar.f61035g.stopLeScan(cVar);
                        cVar.f61034f = false;
                    }
                }
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: mw0.c$b */
    public interface C21557b {
        /* renamed from: a */
        void mo33762a();

        /* renamed from: b */
        void mo33763b(BluetoothDevice bluetoothDevice, int i, byte[] bArr);
    }

    public C21555c(Context context) {
        if (context == null) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "no context for scaner");
            return;
        }
        this.f61032d = context;
        this.f61033e = new ArrayList<>();
        this.f61034f = false;
        this.f61035g = null;
        this.f61036h = null;
        this.f61035g = ((BluetoothManager) this.f61032d.getSystemService("bluetooth")).getAdapter();
        this.f61036h = new MMHandler("BluetoothLEScanerThread");
    }

    /* renamed from: a */
    public static C21555c m24445a() {
        C21555c cVar = f61031i;
        if (cVar != null) {
            return cVar;
        }
        C21555c cVar2 = new C21555c(MMApplicationContext.getContext());
        f61031i = cVar2;
        return cVar2;
    }

    /* renamed from: b */
    public final boolean mo33777b(C21557b bVar) {
        int i = 0;
        if (bVar == null) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
            return false;
        }
        while (true) {
            if (i >= this.f61033e.size()) {
                i = -1;
                break;
            } else if (this.f61033e.get(i) == bVar) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            boolean add = this.f61033e.add(bVar);
            Log.m105918d("MicroMsg.exdevice.BluetoothLEScaner", "add callback " + add);
            return add;
        }
        Log.m105928w("MicroMsg.exdevice.BluetoothLEScaner", "callback has in queue. pass");
        return true;
    }

    /* renamed from: c */
    public boolean mo33778c(boolean z, C21557b bVar) {
        Boolean bool = (Boolean) new C21556a(z, bVar).exec(this.f61036h);
        Assert.assertTrue(bool != null);
        return bool.booleanValue();
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        Log.m105919d("MicroMsg.exdevice.BluetoothLEScaner", "onLeScan. device addr = %s, name = %s, data = %s", bluetoothDevice.getAddress(), bluetoothDevice.getName(), C45288e.m50130a(bArr));
        Log.m105919d("MicroMsg.exdevice.BluetoothLEScaner", "callback size = %d", Integer.valueOf(this.f61033e.size()));
        this.f61036h.post(new C21558d(this, bluetoothDevice, i, bArr));
    }
}
