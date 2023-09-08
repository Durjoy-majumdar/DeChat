package mw0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import d81.C45288e;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

/* renamed from: mw0.i */
public class C88855i extends ScanCallback {

    /* renamed from: h */
    public static C88855i f256300h;

    /* renamed from: a */
    public Context f256301a;

    /* renamed from: b */
    public ArrayList<C88858c> f256302b;

    /* renamed from: c */
    public boolean f256303c;

    /* renamed from: d */
    public BluetoothManager f256304d;

    /* renamed from: e */
    public BluetoothAdapter f256305e;

    /* renamed from: f */
    public BluetoothLeScanner f256306f;

    /* renamed from: g */
    public MMHandler f256307g;

    /* renamed from: mw0.i$a */
    public class C88856a extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ boolean f256308a;

        /* renamed from: b */
        public final /* synthetic */ C88858c f256309b;

        public C88856a(boolean z, C88858c cVar) {
            this.f256308a = z;
            this.f256309b = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
            if (r3 == null) goto L_0x00f9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() {
            /*
                r15 = this;
                mw0.i r0 = mw0.C88855i.this
                boolean r1 = r15.f256308a
                mw0.i$c r2 = r15.f256309b
                android.content.Context r3 = r0.f256301a
                java.lang.String r4 = "MicroMsg.exdevice.NewBluetoothLEScanner"
                r5 = 0
                if (r3 != 0) goto L_0x0014
                java.lang.String r3 = "not found context"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
                r3 = 0
                goto L_0x001e
            L_0x0014:
                android.content.pm.PackageManager r3 = r3.getPackageManager()
                java.lang.String r6 = "android.hardware.bluetooth_le"
                boolean r3 = r3.hasSystemFeature(r6)
            L_0x001e:
                r6 = 1
                if (r3 != 0) goto L_0x0029
                java.lang.String r0 = "this phone is not support BLE"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x00f9
            L_0x0029:
                android.bluetooth.le.BluetoothLeScanner r3 = r0.f256306f
                if (r3 != 0) goto L_0x004f
                android.bluetooth.BluetoothManager r3 = r0.f256304d
                android.bluetooth.BluetoothAdapter r3 = r3.getAdapter()
                r0.f256305e = r3
                if (r3 == 0) goto L_0x0048
                java.lang.String r3 = "Get bluetoothLeScanner"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                android.bluetooth.BluetoothAdapter r3 = r0.f256305e
                android.bluetooth.le.BluetoothLeScanner r3 = r3.getBluetoothLeScanner()
                r0.f256306f = r3
                if (r3 != 0) goto L_0x004f
                goto L_0x00f9
            L_0x0048:
                java.lang.String r0 = "not found BluetoothScannner"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x00f9
            L_0x004f:
                boolean r3 = qw0.C47887a.m53196c()
                if (r3 != 0) goto L_0x005c
                java.lang.String r0 = "Bluetooth state off"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x00f8
            L_0x005c:
                if (r1 == 0) goto L_0x00a2
                java.lang.String r1 = "[BluetoothTrace] start scan"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                java.lang.Throwable r1 = new java.lang.Throwable
                r1.<init>()
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r5 = "[BluetoothTrace] ble scan stacktrace"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r3)
                boolean r1 = r0.f256303c
                if (r1 == 0) goto L_0x007d
                java.lang.String r1 = "ble has scan. just add callback and return"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
                r0.mo123247b(r2)
                goto L_0x00f8
            L_0x007d:
                android.bluetooth.le.BluetoothLeScanner r7 = r0.f256306f
                k20.a r1 = new k20.a
                r1.<init>()
                r1.mo10233c(r0)
                java.lang.Object[] r8 = r1.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/bluetooth/sdk/ble/NewBluetoothLEScanner"
                java.lang.String r10 = "scanImpl"
                java.lang.String r11 = "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/NewBluetoothLEScanner$NewBleScanCallback;)Z"
                java.lang.String r12 = "android/bluetooth/le/BluetoothLeScanner"
                java.lang.String r13 = "startScan"
                java.lang.String r14 = "(Landroid/bluetooth/le/ScanCallback;)V"
                j20.C117292a.m165364j(r7, r8, r9, r10, r11, r12, r13, r14)
                r0.mo123247b(r2)
                r0.f256303c = r6
                goto L_0x00f8
            L_0x00a2:
                boolean r1 = r0.f256303c
                if (r1 != 0) goto L_0x00bb
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.util.ArrayList<mw0.i$c> r0 = r0.f256302b
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r5] = r0
                java.lang.String r0 = "scan haven't started. just return, callback size = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
                goto L_0x00f8
            L_0x00bb:
                if (r2 != 0) goto L_0x00c3
                java.lang.String r1 = "callback is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                goto L_0x00de
            L_0x00c3:
                java.util.ArrayList<mw0.i$c> r1 = r0.f256302b
                boolean r1 = r1.remove(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "remove callback "
                r3.append(r7)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
            L_0x00de:
                if (r2 == 0) goto L_0x00e3
                r2.mo33765a()
            L_0x00e3:
                java.util.ArrayList<mw0.i$c> r1 = r0.f256302b
                int r1 = r1.size()
                if (r1 > 0) goto L_0x00f8
                java.lang.String r1 = "stop scan"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
                android.bluetooth.le.BluetoothLeScanner r1 = r0.f256306f
                r1.stopScan(r0)
                r0.f256303c = r5
            L_0x00f8:
                r5 = 1
            L_0x00f9:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mw0.C88855i.C88856a.run():java.lang.Object");
        }
    }

    /* renamed from: mw0.i$b */
    public class C88857b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f256311d;

        public C88857b(int i) {
            this.f256311d = i;
        }

        public void run() {
            for (int i = 0; i < C88855i.this.f256302b.size(); i++) {
                C88855i.this.f256302b.get(i).mo33767c(this.f256311d);
            }
        }
    }

    /* renamed from: mw0.i$c */
    public interface C88858c {
        /* renamed from: a */
        void mo33765a();

        /* renamed from: b */
        void mo33766b(BluetoothDevice bluetoothDevice, int i, byte[] bArr);

        /* renamed from: c */
        void mo33767c(int i);
    }

    public C88855i(Context context) {
        if (context == null) {
            Log.m105920e("MicroMsg.exdevice.NewBluetoothLEScanner", "No context for scanner");
            return;
        }
        this.f256301a = context;
        this.f256302b = new ArrayList<>();
        this.f256303c = false;
        this.f256305e = null;
        this.f256306f = null;
        this.f256307g = null;
        BluetoothManager bluetoothManager = (BluetoothManager) this.f256301a.getSystemService("bluetooth");
        this.f256304d = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f256305e = adapter;
        if (adapter != null) {
            Log.m105918d("MicroMsg.exdevice.NewBluetoothLEScanner", "Get bluetoothLeScanner");
            this.f256306f = this.f256305e.getBluetoothLeScanner();
        }
        this.f256307g = new MMHandler("NewBluetoothLEScannerThread");
    }

    /* renamed from: a */
    public static C88855i m110939a() {
        C88855i iVar = f256300h;
        if (iVar != null) {
            return iVar;
        }
        C88855i iVar2 = new C88855i(MMApplicationContext.getContext());
        f256300h = iVar2;
        return iVar2;
    }

    /* renamed from: b */
    public final boolean mo123247b(C88858c cVar) {
        int i = 0;
        if (cVar == null) {
            Log.m105920e("MicroMsg.exdevice.NewBluetoothLEScanner", "callback is null");
            return false;
        }
        while (true) {
            if (i >= this.f256302b.size()) {
                i = -1;
                break;
            } else if (this.f256302b.get(i) == cVar) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            boolean add = this.f256302b.add(cVar);
            Log.m105918d("MicroMsg.exdevice.NewBluetoothLEScanner", "add callback " + add);
            return add;
        }
        Log.m105928w("MicroMsg.exdevice.NewBluetoothLEScanner", "callback has in queue. pass");
        return true;
    }

    /* renamed from: c */
    public boolean mo123248c(boolean z, C88858c cVar) {
        Log.m105924i("MicroMsg.exdevice.NewBluetoothLEScanner", "(API21)execute scan");
        Boolean bool = (Boolean) new C88856a(z, cVar).exec(this.f256307g);
        Assert.assertTrue(bool != null);
        return bool.booleanValue();
    }

    public void onBatchScanResults(List<ScanResult> list) {
        if (list != null) {
            for (ScanResult next : list) {
                Log.m105919d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", next.getDevice().getAddress(), next.getDevice().getName(), C45288e.m50130a(next.getScanRecord().getBytes()));
            }
        }
    }

    public void onScanFailed(int i) {
        this.f256307g.post(new C88857b(i));
    }

    public void onScanResult(int i, ScanResult scanResult) {
        if (scanResult != null && scanResult.getScanRecord() != null) {
            Log.m105919d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", scanResult.getDevice().getAddress(), scanResult.getDevice().getName(), C45288e.m50130a(scanResult.getScanRecord().getBytes()));
            Log.m105919d("MicroMsg.exdevice.NewBluetoothLEScanner", "callback size = %d", Integer.valueOf(this.f256302b.size()));
            this.f256307g.post(new C88859j(this, scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes()));
        }
    }
}
