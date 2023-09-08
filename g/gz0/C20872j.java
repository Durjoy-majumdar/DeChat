package gz0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import dz0.C20483c;
import f40.C86709a0;
import hz0.C46152h0;
import j20.C117292a;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import te3.C64680ri;

/* renamed from: gz0.j */
public class C20872j implements C11385n {

    /* renamed from: d */
    public MMActivity f58975d;

    /* renamed from: e */
    public C20483c f58976e;

    /* renamed from: f */
    public String f58977f;

    /* renamed from: g */
    public volatile boolean f58978g = false;

    /* renamed from: h */
    public volatile boolean f58979h = false;

    /* renamed from: i */
    public Object f58980i = new Object();

    /* renamed from: j */
    public boolean f58981j = false;

    /* renamed from: n */
    public boolean f58982n = false;

    /* renamed from: o */
    public volatile float f58983o = -85.0f;

    /* renamed from: p */
    public volatile float f58984p = -1000.0f;

    /* renamed from: q */
    public boolean f58985q = false;

    /* renamed from: r */
    public C64680ri f58986r;

    /* renamed from: s */
    public C20874b f58987s;

    /* renamed from: t */
    public int f58988t = 60;

    /* renamed from: u */
    public long f58989u = 0;

    /* renamed from: v */
    public long f58990v = 0;

    /* renamed from: w */
    public MTimerHandler f58991w = new MTimerHandler(new C20873a(), false);

    /* renamed from: gz0.j$a */
    public class C20873a implements MTimerHandler.CallBack {
        public C20873a() {
        }

        public boolean onTimerExpired() {
            C20872j.this.mo32582c();
            C20872j.this.mo32584e();
            return true;
        }
    }

    /* renamed from: gz0.j$b */
    public class C20874b {

        /* renamed from: a */
        public volatile boolean f58993a = false;

        /* renamed from: b */
        public BluetoothAdapter f58994b;

        /* renamed from: c */
        public boolean f58995c = false;

        /* renamed from: d */
        public Map<String, C20877c> f58996d = new ConcurrentHashMap();

        /* renamed from: e */
        public BroadcastReceiver f58997e;

        /* renamed from: f */
        public long f58998f = 3000;

        /* renamed from: g */
        public Runnable f58999g = new C20875a();

        /* renamed from: h */
        public BluetoothAdapter.LeScanCallback f59000h = new C20876b();

        /* renamed from: gz0.j$b$a */
        public class C20875a implements Runnable {
            public C20875a() {
            }

            public void run() {
                C20874b.this.mo32588c();
                C20874b.this.mo32587b();
            }
        }

        /* renamed from: gz0.j$b$b */
        public class C20876b implements BluetoothAdapter.LeScanCallback {
            public C20876b() {
            }

            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                if (bluetoothDevice == null) {
                    Log.m105920e("MicroMsg.CardLbsOrBluetooth", "device is null, return");
                    return;
                }
                C64680ri riVar = C20872j.this.f58986r;
                if (riVar != null && !Util.isNullOrNil(riVar.f185169d)) {
                    String nullAsNil = Util.nullAsNil(bluetoothDevice.getName());
                    String address = bluetoothDevice.getAddress();
                    if (nullAsNil.equals(C20872j.this.f58986r.f185169d)) {
                        Log.m105925i("MicroMsg.CardLbsOrBluetooth", "onLeScan for deviceId:%s, name:%s, rssi:%d", address, nullAsNil, Integer.valueOf(i));
                        C20874b.this.getClass();
                        byte[] bArr2 = null;
                        if (bArr != null) {
                            int i2 = 0;
                            while (i2 < bArr.length) {
                                int i3 = i2 + 1;
                                byte b = bArr[i2] & ExifInterface.MARKER;
                                if (b == 0) {
                                    break;
                                }
                                int i4 = b - 1;
                                int i5 = i3 + 1;
                                if ((bArr[i3] & ExifInterface.MARKER) == 255) {
                                    byte b2 = bArr[i5 + 1];
                                    byte b3 = bArr[i5];
                                    bArr2 = new byte[i4];
                                    System.arraycopy(bArr, i5, bArr2, 0, i4);
                                }
                                i2 = i4 + i5;
                            }
                        }
                        ((ConcurrentHashMap) C20874b.this.f58996d).put(address, new C20877c(address, i, nullAsNil, bArr2));
                        return;
                    }
                    Log.m105919d("MicroMsg.CardLbsOrBluetooth", "onLeScan for deviceId:%s, name:%s, rssi:%d", address, nullAsNil, Integer.valueOf(i));
                }
            }
        }

        public C20874b(C20873a aVar) {
        }

        /* renamed from: a */
        public C20877c mo32586a() {
            C20877c cVar = new C20877c("", -100, "", (byte[]) null);
            if (((ConcurrentHashMap) this.f58996d).size() <= 0) {
                return cVar;
            }
            for (C20877c cVar2 : ((ConcurrentHashMap) this.f58996d).values()) {
                if (cVar.f59005b < cVar2.f59005b) {
                    cVar = cVar2;
                }
            }
            return cVar;
        }

        /* renamed from: b */
        public void mo32587b() {
            if (this.f58993a) {
                Log.m105924i("MicroMsg.CardLbsOrBluetooth", "already start");
                return;
            }
            ((ConcurrentHashMap) this.f58996d).clear();
            BluetoothManager bluetoothManager = (BluetoothManager) MMApplicationContext.getContext().getSystemService("bluetooth");
            if (bluetoothManager == null) {
                this.f58995c = false;
                Log.m105920e("MicroMsg.CardLbsOrBluetooth", "bluetoothManager is null");
                return;
            }
            this.f58995c = true;
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.f58994b = adapter;
            if (adapter == null || !adapter.isEnabled()) {
                this.f58995c = false;
                Log.m105920e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
                return;
            }
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "[BluetoothTrace] start scan");
            Log.printErrStackTrace("MicroMsg.CardLbsOrBluetooth", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
            BluetoothAdapter bluetoothAdapter = this.f58994b;
            BluetoothAdapter.LeScanCallback leScanCallback = this.f59000h;
            C9556a aVar = new C9556a();
            aVar.mo10233c(leScanCallback);
            Log.m105925i("MicroMsg.CardLbsOrBluetooth", "startLeScan isOK:%b", Boolean.valueOf(((Boolean) C117292a.m165364j(bluetoothAdapter, aVar.mo10232b(), "com/tencent/mm/plugin/card/mgr/CardLbsOrBluetoothInfoManager$BluetoothHelper", "startScanBluetooth", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue()));
            this.f58993a = true;
        }

        /* renamed from: c */
        public void mo32588c() {
            if (!this.f58993a) {
                Log.m105924i("MicroMsg.CardLbsOrBluetooth", "not start");
                return;
            }
            BluetoothAdapter bluetoothAdapter = this.f58994b;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                this.f58995c = false;
                Log.m105920e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
                return;
            }
            this.f58995c = true;
            this.f58994b.stopLeScan(this.f59000h);
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "stopLeScan");
            this.f58993a = false;
        }
    }

    /* renamed from: gz0.j$c */
    public static class C20877c {

        /* renamed from: a */
        public String f59004a;

        /* renamed from: b */
        public int f59005b;

        /* renamed from: c */
        public String f59006c;

        /* renamed from: d */
        public byte[] f59007d;

        public C20877c(String str, int i, String str2, byte[] bArr) {
            this.f59004a = str;
            this.f59005b = i;
            this.f59006c = str2;
            this.f59007d = bArr;
        }

        public String toString() {
            return "SrvDeviceInfo{deviceId='" + this.f59004a + '\'' + ", rssi=" + this.f59005b + ", name='" + this.f59006c + '\'' + ", manuData=" + Arrays.toString(this.f59007d) + '}';
        }
    }

    /* renamed from: a */
    public final void mo32580a(String str, byte[] bArr, float f, float f2, int i, boolean z, boolean z2) {
        C86709a0.m107529k().f251779b.mo123460f(new C46152h0(str, bArr, f, f2, (float) i, z, z2));
    }

    /* renamed from: b */
    public void mo32581b(MMActivity mMActivity, String str, C20483c cVar, float f, float f2) {
        this.f58978g = true;
        this.f58975d = mMActivity;
        this.f58977f = str;
        this.f58976e = cVar;
        this.f58983o = f;
        this.f58984p = f2;
        this.f58981j = cVar.mo23264L0().f64121R0;
        this.f58982n = cVar.mo23263J0().f63939F;
        this.f58986r = cVar.mo23264L0().f64123S0;
        this.f58988t = cVar.mo23264L0().f64123S0 == null ? 60 : cVar.mo23264L0().f64123S0.f185170e;
        this.f58985q = cVar.mo23264L0().f64123S0 != null && !Util.isNullOrNil(cVar.mo23264L0().f64123S0.f185169d);
        Log.m105925i("MicroMsg.CardLbsOrBluetooth", "init cardId:%s, needLocation:%b, isLocationAuth:%b needBluetooth:%b reportTime:%d", str, Boolean.valueOf(this.f58981j), Boolean.valueOf(this.f58982n), Boolean.valueOf(this.f58985q), Integer.valueOf(this.f58988t));
        if (this.f58981j && !this.f58982n) {
            String str2 = Util.isNullOrNil(this.f58976e.mo23264L0().f64125T0) ? this.f58976e.mo23264L0().f64143n : this.f58976e.mo23264L0().f64125T0;
            MMActivity mMActivity2 = this.f58975d;
            C76879j.m92750u(mMActivity2, mMActivity2.getString(C0966R.string.b0e, new Object[]{str2}), this.f58975d.getString(C0966R.string.a3h), new C20878k(this), new C20879l(this));
        }
        if (this.f58985q) {
            Log.m105925i("MicroMsg.CardLbsOrBluetooth", "initBluetoothHelper blueToothInfo.name:%s", this.f58986r.f185169d);
            C20874b bVar = new C20874b((C20873a) null);
            this.f58987s = bVar;
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "init bluetoothStateListener");
            bVar.f58997e = new C20880m(bVar);
            MMApplicationContext.getContext().registerReceiver(bVar.f58997e, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        mo32583d();
        mo32582c();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public void mo32582c() {
        /*
            r14 = this;
            boolean r0 = r14.f58981j
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r14.f58985q
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r1 = "[report]not need report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0018:
            boolean r0 = r14.f58979h
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r1 = "isReporting, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0024:
            r14.f58979h = r1
            boolean r0 = r14.f58985q
            r3 = 10000(0x2710, double:4.9407E-320)
            if (r0 != 0) goto L_0x002d
            goto L_0x0055
        L_0x002d:
            gz0.j$b r0 = r14.f58987s
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r5 = "[needReportBluetooth]bluetoothHelper is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            goto L_0x0055
        L_0x0039:
            gz0.j$c r0 = r0.mo32586a()
            java.lang.String r0 = r0.f59004a
            java.lang.String r5 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r14.f58989u
            long r5 = r5 - r7
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            java.lang.Object r5 = r14.f58980i
            monitor-enter(r5)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019e }
            long r8 = r14.f58990v     // Catch:{ all -> 0x019e }
            long r6 = r6 - r8
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0066
            r3 = 1
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            float r4 = r14.f58983o     // Catch:{ all -> 0x019e }
            r6 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r4 = java.lang.Float.compare(r4, r6)     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x007d
            float r4 = r14.f58984p     // Catch:{ all -> 0x019e }
            r6 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r4 = java.lang.Float.compare(r4, r6)     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x007d:
            r4 = 0
        L_0x007e:
            boolean r6 = r14.f58982n     // Catch:{ all -> 0x019e }
            if (r6 == 0) goto L_0x008c
            boolean r6 = r14.f58981j     // Catch:{ all -> 0x019e }
            if (r6 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            r3 = 1
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            monitor-exit(r5)     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r5 = "report needLocation:%b, isLocationAuth:%b, isBluetoothEnable:%b, needReportBluetooth:%b needReportGps:%b"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            boolean r7 = r14.f58981j
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r2] = r7
            boolean r7 = r14.f58982n
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r1] = r7
            gz0.j$b r7 = r14.f58987s
            if (r7 != 0) goto L_0x00ac
            r7 = 0
            goto L_0x00ae
        L_0x00ac:
            boolean r7 = r7.f58995c
        L_0x00ae:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            r7 = 3
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r6[r7] = r9
            r7 = 4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r6[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            if (r0 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x0121
            gz0.j$b r0 = r14.f58987s
            gz0.j$c r0 = r0.mo32586a()
            java.lang.String r3 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r4 = "reportBluetoothAndGps deviceInfo:%s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            java.lang.String r3 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r4 = "reportBluetoothAndGps lbsLongitude:%f, lbsLatitude:%f"
            java.lang.Object[] r5 = new java.lang.Object[r8]
            float r6 = r14.f58984p
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r5[r2] = r6
            float r2 = r14.f58983o
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r5)
            java.lang.String r7 = r14.f58977f
            byte[] r8 = r0.f59007d
            float r9 = r14.f58984p
            float r10 = r14.f58983o
            int r11 = r0.f59005b
            gz0.j$b r0 = r14.f58987s
            boolean r12 = r0.f58995c
            boolean r13 = r14.f58982n
            r6 = r14
            r6.mo32580a(r7, r8, r9, r10, r11, r12, r13)
            long r0 = java.lang.System.currentTimeMillis()
            r14.f58990v = r0
            long r0 = java.lang.System.currentTimeMillis()
            r14.f58989u = r0
            gz0.j$b r0 = r14.f58987s
            java.util.Map<java.lang.String, gz0.j$c> r0 = r0.f58996d
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
            goto L_0x019d
        L_0x0121:
            if (r0 == 0) goto L_0x0159
            gz0.j$b r0 = r14.f58987s
            gz0.j$c r0 = r0.mo32586a()
            java.lang.String r3 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r4 = "reportBluetooth deviceInfo:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            java.lang.String r6 = r14.f58977f
            byte[] r7 = r0.f59007d
            int r10 = r0.f59005b
            gz0.j$b r0 = r14.f58987s
            boolean r11 = r0.f58995c
            boolean r12 = r14.f58982n
            r8 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r9 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            r5 = r14
            r5.mo32580a(r6, r7, r8, r9, r10, r11, r12)
            long r0 = java.lang.System.currentTimeMillis()
            r14.f58989u = r0
            gz0.j$b r0 = r14.f58987s
            java.util.Map<java.lang.String, gz0.j$c> r0 = r0.f58996d
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
            goto L_0x019d
        L_0x0159:
            if (r3 == 0) goto L_0x0194
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r3 = "reportgps"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r3 = "reportgps lbsLongitude:%f, lbsLatitude:%f"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            float r5 = r14.f58984p
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4[r2] = r5
            float r5 = r14.f58983o
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4[r1] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r4)
            java.lang.String r7 = r14.f58977f
            float r9 = r14.f58984p
            float r10 = r14.f58983o
            byte[] r8 = new byte[r2]
            boolean r13 = r14.f58982n
            r11 = 0
            r12 = 0
            r6 = r14
            r6.mo32580a(r7, r8, r9, r10, r11, r12, r13)
            long r0 = java.lang.System.currentTimeMillis()
            r14.f58990v = r0
            goto L_0x019d
        L_0x0194:
            java.lang.String r0 = "MicroMsg.CardLbsOrBluetooth"
            java.lang.String r1 = "not report"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r14.f58979h = r2
        L_0x019d:
            return
        L_0x019e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x019e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C20872j.mo32582c():void");
    }

    /* renamed from: d */
    public void mo32583d() {
        if (this.f58981j || this.f58985q) {
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", IXWebBroadcastListener.STAGE_START);
            if (!this.f58978g) {
                Log.m105921e("MicroMsg.CardLbsOrBluetooth", "isInit:%b", Boolean.valueOf(this.f58978g));
                return;
            }
            if (this.f58981j) {
                Log.m105925i("MicroMsg.CardLbsOrBluetooth", "isGPSEnable:%b isNetworkEnable:%b", Boolean.valueOf(LocationUtil.isGpsEnable()), Boolean.valueOf(LocationUtil.isNetworkProviderEnable()));
            }
            C20874b bVar = this.f58987s;
            if (bVar != null && this.f58985q) {
                bVar.mo32587b();
            }
            mo32584e();
            C86709a0.m107529k().f251779b.mo123455a(2574, this);
        }
    }

    /* renamed from: e */
    public void mo32584e() {
        mo32585f();
        int i = this.f58988t;
        if (i > 0) {
            this.f58991w.startTimer((long) (i * 1000));
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "start ReportTimer!");
            return;
        }
        Log.m105920e("MicroMsg.CardLbsOrBluetooth", "not to start ReportTimer!");
    }

    /* renamed from: f */
    public void mo32585f() {
        Log.m105924i("MicroMsg.CardLbsOrBluetooth", "stop ReportTimer!");
        if (!this.f58991w.stopped()) {
            this.f58991w.stopTimer();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CardLbsOrBluetooth", "report success, onSceneEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f58979h = false;
    }
}
