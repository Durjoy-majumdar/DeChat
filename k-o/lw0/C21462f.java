package lw0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d81.C45288e;
import j20.C117292a;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import y71.C112396n;
import y71.C23277l;

/* renamed from: lw0.f */
public class C21462f implements C117482b, C23277l, BluetoothAdapter.LeScanCallback {

    /* renamed from: w */
    public static boolean f60771w;

    /* renamed from: x */
    public static boolean f60772x;

    /* renamed from: d */
    public final C117484d f60773d;

    /* renamed from: e */
    public final C117482b f60774e;

    /* renamed from: f */
    public final HashSet<UUID> f60775f;

    /* renamed from: g */
    public boolean f60776g = false;

    /* renamed from: h */
    public BluetoothAdapter f60777h;

    /* renamed from: i */
    public final MMHandler f60778i;

    /* renamed from: j */
    public boolean f60779j = true;

    /* renamed from: n */
    public int f60780n = 0;

    /* renamed from: o */
    public String f60781o = "";

    /* renamed from: p */
    public C88657e f60782p = null;

    /* renamed from: q */
    public Map<String, Long> f60783q = new ConcurrentHashMap();

    /* renamed from: r */
    public final MTimerHandler f60784r = new MTimerHandler(C112396n.m153349b().f336526b.getSerialTag(), (MTimerHandler.CallBack) new C21463a(), true);

    /* renamed from: s */
    public final MTimerHandler f60785s = new MTimerHandler(C112396n.m153349b().f336526b.getSerialTag(), (MTimerHandler.CallBack) new C21465b(), true);

    /* renamed from: t */
    public final MTimerHandler f60786t = new MTimerHandler(C112396n.m153349b().f336526b.getSerialTag(), (MTimerHandler.CallBack) new C21466c(), true);

    /* renamed from: u */
    public final MTimerHandler f60787u = new MTimerHandler(C112396n.m153349b().f336526b.getSerialTag(), (MTimerHandler.CallBack) new C21467d(this), true);

    /* renamed from: v */
    public final MTimerHandler f60788v = new MTimerHandler(C112396n.m153349b().f336526b.getSerialTag(), (MTimerHandler.CallBack) new C21468e(), true);

    /* renamed from: lw0.f$a */
    public class C21463a implements MTimerHandler.CallBack {

        /* renamed from: lw0.f$a$a */
        public class C21464a implements Runnable {
            public C21464a() {
            }

            public void run() {
                C21462f fVar = C21462f.this;
                fVar.f60773d.mo182192a((String) null, fVar.f60780n, fVar.f60781o, fVar.f60782p);
            }
        }

        public C21463a() {
        }

        public boolean onTimerExpired() {
            C21462f.this.f60778i.post(new C21464a());
            return false;
        }
    }

    /* renamed from: lw0.f$b */
    public class C21465b implements MTimerHandler.CallBack {
        public C21465b() {
        }

        public boolean onTimerExpired() {
            Boolean bool;
            if (C21462f.this.f60775f.size() > 0) {
                Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now start");
                C21462f fVar = C21462f.this;
                if (fVar.f60777h != null) {
                    Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                    Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                    BluetoothAdapter bluetoothAdapter = fVar.f60777h;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(fVar);
                    bool = Boolean.valueOf(((Boolean) C117292a.m165364j(bluetoothAdapter, aVar.mo10232b(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan4SelfAdaption", "()Ljava/lang/Boolean;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                } else {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan ok");
                } else {
                    Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan fail");
                }
                boolean z = MMApplicationContext.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
                C21462f.f60772x = z;
                if (!z) {
                    if (!C21462f.this.f60786t.stopped()) {
                        C21462f.this.f60786t.stopTimer();
                    }
                    if (!C21462f.this.f60785s.stopped()) {
                        C21462f.this.f60785s.stopTimer();
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: lw0.f$c */
    public class C21466c implements MTimerHandler.CallBack {
        public C21466c() {
        }

        public boolean onTimerExpired() {
            if (C21462f.this.f60775f.size() <= 0) {
                return false;
            }
            Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now stop");
            C21462f fVar = C21462f.this;
            BluetoothAdapter bluetoothAdapter = fVar.f60777h;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.stopLeScan(fVar);
            }
            if (!C21462f.this.f60785s.stopped()) {
                return true;
            }
            C21462f.this.f60785s.startTimer(2000);
            return true;
        }
    }

    /* renamed from: lw0.f$d */
    public class C21467d implements MTimerHandler.CallBack {
        public C21467d(C21462f fVar) {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]make isScanning status false");
            C21462f.f60771w = false;
            return false;
        }
    }

    /* renamed from: lw0.f$e */
    public class C21468e implements MTimerHandler.CallBack {
        public C21468e() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.exdevice.IBeaconServer", "[shakezb]time out ,let's stop this new method scan");
            C21462f.this.mo33638d();
            return false;
        }
    }

    /* renamed from: lw0.f$f */
    public class C21469f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f60794d;

        /* renamed from: e */
        public final /* synthetic */ String f60795e;

        /* renamed from: f */
        public final /* synthetic */ C88657e f60796f;

        public C21469f(int i, String str, C88657e eVar) {
            this.f60794d = i;
            this.f60795e = str;
            this.f60796f = eVar;
        }

        public void run() {
            C21462f.this.f60773d.mo182192a((String) null, this.f60794d, this.f60795e, this.f60796f);
        }
    }

    public C21462f(C117482b bVar) {
        if (bVar != null) {
            this.f60775f = new HashSet<>();
            this.f60773d = new C117484d(this);
            this.f60774e = bVar;
            this.f60778i = new MMHandler(C112396n.m153349b().f336526b.getSerialTag());
            this.f60777h = ((BluetoothManager) MMApplicationContext.getContext().getSystemService("bluetooth")).getAdapter();
            return;
        }
        throw new NullPointerException("aCallback is null");
    }

    /* renamed from: a */
    public void mo33635a(String str, String str2, int i, int i2, byte[] bArr) {
        Log.m105919d("MicroMsg.exdevice.IBeaconServer", "onScanFound, device mac = %s, device name = %s, bluetooth version = %d, rssi = %d, advertisment = %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), C45288e.m50130a(bArr));
        if (i == 0) {
            C88657e eVar = new C88657e();
            if (!eVar.mo123098a(bArr)) {
                Log.m105918d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
                return;
            }
            UUID j = C45288e.m50139j(eVar.f255971b.f255973c);
            if (j == null) {
                Log.m105920e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
            } else if (!this.f60775f.contains(j)) {
                Log.m105918d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
            } else {
                if (this.f60779j) {
                    this.f60781o = str;
                }
                this.f60778i.post(new C21469f(i2, str, eVar));
            }
        }
    }

    /* renamed from: b */
    public void mo33636b(int i, String str) {
        Log.m105921e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", Integer.valueOf(i), str);
    }

    /* renamed from: c */
    public void mo33637c(int i) {
        if (i == 0) {
            mo33638d();
        }
    }

    /* renamed from: d */
    public final void mo33638d() {
        BluetoothAdapter bluetoothAdapter;
        ((ConcurrentHashMap) this.f60783q).clear();
        f60771w = false;
        if (!this.f60787u.stopped()) {
            this.f60787u.stopTimer();
        }
        if (!this.f60786t.stopped()) {
            this.f60786t.stopTimer();
        }
        if (!this.f60785s.stopped()) {
            this.f60785s.stopTimer();
        }
        if (!this.f60784r.stopped()) {
            this.f60784r.stopTimer();
        }
        if (!this.f60788v.stopped()) {
            this.f60788v.stopTimer();
        }
        if (this.f60776g && (bluetoothAdapter = this.f60777h) != null) {
            if (bluetoothAdapter != null) {
                bluetoothAdapter.stopLeScan(this);
            }
            this.f60776g = false;
        }
    }

    /* renamed from: e */
    public void mo23549e(double d, C117483c cVar) {
        Log.m105919d("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback, distance = %f", Double.valueOf(d));
        String a = C45288e.m50130a(cVar.f351585a.f255971b.f255973c);
        if (a.length() >= 32) {
            a = a.substring(0, 8) + "-" + a.substring(8, 12) + "-" + a.substring(12, 16) + "-" + a.substring(16, 20) + "-" + a.substring(20);
        }
        String str = a + cVar.f351585a.f255971b.f255974d + cVar.f351585a.f255971b.f255975e;
        if (!((ConcurrentHashMap) this.f60783q).containsKey(str)) {
            ((ConcurrentHashMap) this.f60783q).put(str, Long.valueOf(System.currentTimeMillis()));
            this.f60774e.mo23549e(d, cVar);
            Log.m105924i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + a + ",major = " + cVar.f351585a.f255971b.f255974d + ",minor = " + (cVar.f351585a.f255971b.f255975e & 65535));
            return;
        }
        long longValue = ((Long) ((ConcurrentHashMap) this.f60783q).get(str)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue > 500) {
            ((ConcurrentHashMap) this.f60783q).put(str, Long.valueOf(currentTimeMillis));
            this.f60774e.mo23549e(d, cVar);
        }
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        C88657e eVar = new C88657e();
        if (!eVar.mo123098a(bArr)) {
            Log.m105918d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
            return;
        }
        UUID j = C45288e.m50139j(eVar.f255971b.f255973c);
        if (j == null) {
            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
        } else if (!this.f60775f.contains(j)) {
            Log.m105918d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
        } else {
            if (this.f60779j) {
                this.f60780n = i;
                this.f60782p = eVar;
                if (this.f60784r.stopped()) {
                    this.f60784r.startTimer(2000);
                }
                this.f60779j = false;
            }
            this.f60778i.post(new C21472i(this, i, bluetoothDevice, eVar));
        }
    }
}
