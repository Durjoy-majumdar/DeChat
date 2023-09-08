package mw0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import mw0.C21555c;
import mw0.C88855i;
import p206nj.C11171e;

/* renamed from: mw0.b */
public final class C21546b {

    /* renamed from: a */
    public C21553d f61004a;

    /* renamed from: b */
    public Context f61005b;

    /* renamed from: c */
    public final HashMap<String, C21559e> f61006c;

    /* renamed from: d */
    public MMHandler f61007d;

    /* renamed from: e */
    public Runnable f61008e;

    /* renamed from: f */
    public volatile boolean f61009f;

    /* renamed from: g */
    public volatile boolean f61010g;

    /* renamed from: h */
    public C21555c f61011h;

    /* renamed from: i */
    public C88855i f61012i;

    /* renamed from: j */
    public final HashSet<Long> f61013j;

    /* renamed from: k */
    public C21555c.C21557b f61014k;

    /* renamed from: l */
    public C88855i.C88858c f61015l;

    /* renamed from: mw0.b$a */
    public class C21547a implements Runnable {
        public C21547a() {
        }

        public void run() {
            C21546b.this.f61009f = false;
            C21546b.this.mo33755e(false);
            Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
            C21546b.this.mo33759i();
            C21553d dVar = C21546b.this.f61004a;
            if (dVar != null) {
                dVar.mo33772c();
            }
        }
    }

    /* renamed from: mw0.b$b */
    public class C21548b implements C21555c.C21557b {

        /* renamed from: mw0.b$b$a */
        public class C21549a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BluetoothDevice f61018d;

            /* renamed from: e */
            public final /* synthetic */ int f61019e;

            /* renamed from: f */
            public final /* synthetic */ byte[] f61020f;

            public C21549a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                this.f61018d = bluetoothDevice;
                this.f61019e = i;
                this.f61020f = bArr;
            }

            public void run() {
                C21546b.m24424a(C21546b.this, this.f61018d, this.f61019e, this.f61020f);
            }
        }

        public C21548b() {
        }

        /* renamed from: a */
        public void mo33762a() {
        }

        /* renamed from: b */
        public void mo33763b(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            Log.m105919d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", bluetoothDevice.getName(), bluetoothDevice.getAddress(), Long.valueOf(C45288e.m50137h(bluetoothDevice.getAddress())));
            C21546b.this.f61007d.post(new C21549a(bluetoothDevice, i, bArr));
        }
    }

    /* renamed from: mw0.b$c */
    public class C21550c implements C88855i.C88858c {

        /* renamed from: mw0.b$c$a */
        public class C21551a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BluetoothDevice f61023d;

            /* renamed from: e */
            public final /* synthetic */ int f61024e;

            /* renamed from: f */
            public final /* synthetic */ byte[] f61025f;

            public C21551a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                this.f61023d = bluetoothDevice;
                this.f61024e = i;
                this.f61025f = bArr;
            }

            public void run() {
                C21546b.m24424a(C21546b.this, this.f61023d, this.f61024e, this.f61025f);
            }
        }

        /* renamed from: mw0.b$c$b */
        public class C21552b implements Runnable {
            public C21552b() {
            }

            public void run() {
                if (!C21546b.this.f61013j.isEmpty()) {
                    Iterator<Long> it = C21546b.this.f61013j.iterator();
                    while (it.hasNext()) {
                        Long next = it.next();
                        Log.m105921e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", next);
                        C21553d dVar = C21546b.this.f61004a;
                        if (dVar != null) {
                            dVar.mo33770a(next.longValue(), false);
                        }
                    }
                    C21546b.this.f61013j.clear();
                }
            }
        }

        public C21550c() {
        }

        /* renamed from: a */
        public void mo33765a() {
        }

        /* renamed from: b */
        public void mo33766b(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            Log.m105919d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", bluetoothDevice.getName(), bluetoothDevice.getAddress(), Long.valueOf(C45288e.m50137h(bluetoothDevice.getAddress())));
            C21546b.this.f61007d.post(new C21551a(bluetoothDevice, i, bArr));
        }

        /* renamed from: c */
        public void mo33767c(int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "(API21)start ble scan failed, errorCode = %d", Integer.valueOf(i));
            if (i != 1) {
                C21546b.this.f61007d.post(new C21552b());
            }
        }
    }

    /* renamed from: mw0.b$d */
    public static abstract class C21553d {
        /* renamed from: a */
        public abstract void mo33770a(long j, boolean z);

        /* renamed from: b */
        public abstract void mo33771b(String str, String str2, int i, byte[] bArr);

        /* renamed from: c */
        public abstract void mo33772c();

        /* renamed from: d */
        public abstract void mo33773d(long j, byte[] bArr);

        /* renamed from: e */
        public abstract void mo33774e(long j, boolean z);

        /* renamed from: f */
        public abstract void mo33775f(long j, long j2, long j3);
    }

    /* renamed from: mw0.b$e */
    public final class C21554e implements Runnable {

        /* renamed from: d */
        public long f61028d;

        /* renamed from: e */
        public long f61029e;

        public C21554e(long j, long j2) {
            this.f61028d = j;
            this.f61029e = j2;
        }

        public void run() {
            C21546b bVar = C21546b.this;
            long j = this.f61028d;
            C21559e eVar = new C21559e(j, bVar.f61005b, bVar);
            String valueOf = String.valueOf(eVar.f61044a);
            Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", Integer.valueOf(eVar.hashCode()), Long.valueOf(j), valueOf);
            C21559e remove = bVar.f61006c.remove(valueOf);
            if (remove != null) {
                remove.mo33782b();
            }
            bVar.f61006c.put(valueOf, eVar);
            long j2 = eVar.f61044a;
            C21553d dVar = C21546b.this.f61004a;
            if (dVar != null) {
                dVar.mo33775f(j2, this.f61028d, this.f61029e);
            }
        }
    }

    public C21546b(String str) {
        this.f61004a = null;
        this.f61005b = null;
        this.f61006c = new HashMap<>();
        this.f61007d = null;
        this.f61008e = null;
        this.f61009f = false;
        this.f61010g = false;
        this.f61013j = new HashSet<>();
        this.f61014k = new C21548b();
        this.f61015l = new C21550c();
        this.f61008e = new C21547a();
        this.f61007d = new MMHandler(str);
    }

    /* renamed from: a */
    public static void m24424a(C21546b bVar, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        bVar.getClass();
        Log.m105918d("MicroMsg.exdevice.BluetoothLEManager", "onLeScanImp");
        if (!bVar.f61013j.isEmpty()) {
            long h = C45288e.m50137h(bluetoothDevice.getAddress());
            if (bVar.f61013j.contains(Long.valueOf(h))) {
                Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "------onConnectPreScanFound------ sessionid = %d", Long.valueOf(h));
                C21559e eVar = bVar.f61006c.get(String.valueOf(h));
                if (eVar == null) {
                    Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "null == les");
                    C21553d dVar = bVar.f61004a;
                    if (dVar != null) {
                        dVar.mo33770a(h, false);
                    }
                } else if (!eVar.mo33783c()) {
                    Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "les.connect() Failed!!!");
                    C21553d dVar2 = bVar.f61004a;
                    if (dVar2 != null) {
                        dVar2.mo33770a(h, false);
                    }
                }
                bVar.f61013j.remove(Long.valueOf(h));
                if (bVar.f61013j.isEmpty()) {
                    Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "Connect PreScan is done.");
                }
            }
        }
        C21553d dVar3 = bVar.f61004a;
        if (dVar3 != null) {
            dVar3.mo33771b(bluetoothDevice.getAddress(), bluetoothDevice.getName(), i, bArr);
        }
    }

    /* renamed from: b */
    public boolean mo33752b(long j) {
        Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "------connect------ sessionId = %d ", Long.valueOf(j));
        Assert.assertTrue(this.f61010g);
        if (!mo33757g()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            return false;
        }
        C21559e eVar = this.f61006c.get(String.valueOf(j));
        Assert.assertTrue(eVar != null);
        BluetoothManager bluetoothManager = (BluetoothManager) this.f61005b.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "null == bluetoothManager");
        } else {
            List<BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(8);
            if (connectedDevices == null) {
                Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "null == list, may be no device is connected phone now");
            } else {
                for (BluetoothDevice next : connectedDevices) {
                    long h = C45288e.m50137h(next.getAddress());
                    Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "get connected device: mac = %s, long of mac =%d, name = %s", next.getAddress(), Long.valueOf(h), next.getName());
                    if (j == h) {
                        Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "This device is connected to phone now, start connecting without scan...");
                        return eVar.mo33783c();
                    }
                }
                String str = Build.VERSION.RELEASE;
                Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "Android version realse code: %s", str);
                if (!C11171e.m11046c(23) || LocationUtil.isGpsEnable() || str.equalsIgnoreCase("6.0") || str.equalsIgnoreCase("6.0.0")) {
                    Set<BluetoothDevice> bondedDevices = bluetoothManager.getAdapter().getBondedDevices();
                    if (bondedDevices != null) {
                        Iterator<BluetoothDevice> it = bondedDevices.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BluetoothDevice next2 = it.next();
                            long h2 = C45288e.m50137h(next2.getAddress());
                            Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "get paired device: mac = %s, long of mac =%d, name = %s", next2.getAddress(), Long.valueOf(h2), next2.getName());
                            if (j == h2) {
                                Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "This HID device is paired to phone now, check if it is connected...");
                                InputManager inputManager = (InputManager) this.f61005b.getSystemService("input");
                                int[] inputDeviceIds = inputManager.getInputDeviceIds();
                                if (inputDeviceIds == null) {
                                    Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "get input devices failed");
                                    break;
                                }
                                for (int inputDevice : inputDeviceIds) {
                                    InputDevice inputDevice2 = inputManager.getInputDevice(inputDevice);
                                    if (inputDevice2 != null) {
                                        String name = inputDevice2.getName();
                                        Log.m105919d("MicroMsg.exdevice.BluetoothLEManager", "Input devices: %s", name);
                                        if (name != null && name.equals(next2.getName())) {
                                            Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "This HID deivce has connected to phone as a input device");
                                            return eVar.mo33783c();
                                        }
                                    }
                                }
                                Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "This HID device hasn't been connected...");
                            }
                        }
                    } else {
                        Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "null == pairedDevices,get paired devices failed");
                    }
                } else {
                    return eVar.mo33783c();
                }
            }
        }
        this.f61013j.add(Long.valueOf(j));
        return mo33758h(true, new int[0]);
    }

    /* renamed from: c */
    public void mo33753c(long j, long j2) {
        Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "------createSession------ macAddr = %d channelId = %d", Long.valueOf(j), Long.valueOf(j2));
        Assert.assertTrue(this.f61010g);
        if (!mo33757g()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
        } else {
            Assert.assertTrue(this.f61007d.post(new C21554e(j, j2)));
        }
    }

    /* renamed from: d */
    public void mo33754d(long j) {
        Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "------destroySession------ sessionId = %d", Long.valueOf(j));
        Assert.assertTrue(this.f61010g);
        if (!mo33757g()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            return;
        }
        C21559e remove = this.f61006c.remove(String.valueOf(j));
        if (remove == null) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLEManager", "Cannot find BluetoothLESession by sessionId(%d)", Long.valueOf(j));
            return;
        }
        remove.mo33782b();
    }

    /* renamed from: e */
    public final boolean mo33755e(boolean z) {
        C88855i iVar;
        if (C11171e.m11046c(21) && (iVar = this.f61012i) != null) {
            return iVar.mo123248c(z, this.f61015l);
        }
        C21555c cVar = this.f61011h;
        if (cVar != null) {
            return cVar.mo33778c(z, this.f61014k);
        }
        Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "Scanner is null");
        return false;
    }

    /* renamed from: f */
    public void mo33756f(Context context, C21553d dVar) {
        Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "------init------");
        Assert.assertNotNull(context);
        Assert.assertNotNull(dVar);
        if (!this.f61010g) {
            this.f61010g = true;
            this.f61005b = context;
            this.f61004a = dVar;
            this.f61011h = C21555c.m24445a();
            if (C11171e.m11046c(21)) {
                this.f61012i = C88855i.m110939a();
            }
            if (!mo33757g()) {
                Log.m105928w("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport!!!");
            } else {
                ((BluetoothManager) this.f61005b.getSystemService("bluetooth")).getAdapter();
            }
        }
    }

    /* renamed from: g */
    public boolean mo33757g() {
        Assert.assertTrue(this.f61010g);
        return this.f61005b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: h */
    public boolean mo33758h(boolean z, int... iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("------scanLEDevice------");
        sb.append(z ? "true" : "false");
        Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", sb.toString());
        Assert.assertTrue(this.f61010g);
        if (!mo33757g()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            return false;
        } else if (!z) {
            if (this.f61009f) {
                this.f61007d.removeCallbacks(this.f61008e);
                this.f61009f = false;
                mo33755e(false);
                mo33759i();
                C21553d dVar = this.f61004a;
                if (dVar != null) {
                    dVar.mo33772c();
                }
            }
            return true;
        } else if (this.f61009f) {
            return true;
        } else {
            if (!mo33755e(z)) {
                Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "mAdapter.startLeScan Failed!!!");
                if (!this.f61013j.isEmpty()) {
                    Iterator<Long> it = this.f61013j.iterator();
                    while (it.hasNext()) {
                        Long next = it.next();
                        Log.m105921e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", next);
                        C21553d dVar2 = this.f61004a;
                        if (dVar2 != null) {
                            dVar2.mo33770a(next.longValue(), false);
                        }
                    }
                    this.f61013j.clear();
                }
                return false;
            }
            if (iArr == null || iArr.length <= 0 || iArr[0] != 1) {
                this.f61007d.postDelayed(this.f61008e, 10000);
            } else {
                this.f61007d.removeCallbacks(this.f61008e);
            }
            this.f61009f = true;
            return true;
        }
    }

    /* renamed from: i */
    public final void mo33759i() {
        Log.m105924i("MicroMsg.exdevice.BluetoothLEManager", "tryToCleanPreScanSet");
        if (!this.f61013j.isEmpty()) {
            Iterator<Long> it = this.f61013j.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                Log.m105921e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", next);
                C21553d dVar = this.f61004a;
                if (dVar != null) {
                    dVar.mo33770a(next.longValue(), false);
                }
            }
            this.f61013j.clear();
        }
    }

    /* renamed from: j */
    public boolean mo33760j(long j, byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.BluetoothLEManager", "------writeData------ sessionId = %d, data length = %d", Long.valueOf(j), Integer.valueOf(bArr.length));
        Assert.assertTrue(this.f61010g);
        if (!mo33757g()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            return false;
        }
        C21559e eVar = this.f61006c.get(String.valueOf(j));
        if (eVar != null) {
            return eVar.mo33784d(bArr);
        }
        Log.m105928w("MicroMsg.exdevice.BluetoothLEManager", "session is null, may be this session is closed");
        return false;
    }
}
