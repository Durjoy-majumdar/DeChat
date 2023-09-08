package mw0;

import android.content.Context;
import com.tencent.p014mm.plugin.exdevice.service.C18696o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;
import junit.framework.Assert;
import mw0.C21555c;
import mw0.C21572h;

/* renamed from: mw0.f */
public class C21565f {

    /* renamed from: a */
    public C21555c f61066a;

    /* renamed from: b */
    public C21570d f61067b;

    /* renamed from: c */
    public Context f61068c;

    /* renamed from: d */
    public ReentrantLock f61069d;

    /* renamed from: e */
    public MMHandler f61070e;

    /* renamed from: f */
    public Runnable f61071f;

    /* renamed from: g */
    public C21555c.C21557b f61072g;

    /* renamed from: h */
    public HashSet<Long> f61073h;

    /* renamed from: i */
    public final HashMap<Long, C21572h> f61074i;

    /* renamed from: j */
    public final HashMap<Long, Boolean> f61075j;

    /* renamed from: k */
    public C21572h.C21577e f61076k;

    /* renamed from: mw0.f$a */
    public class C21566a implements C21555c.C21557b {
        public C21566a() {
        }

        /* renamed from: a */
        public void mo33762a() {
            Log.m105918d("MicroMsg.exdevice.BluetoothLESimpleManager", "------onDiscoverFinished------");
            C21570d dVar = C21565f.this.f61067b;
            if (dVar != null) {
                C18696o.C18697a aVar = (C18696o.C18697a) dVar;
                aVar.getClass();
                Log.m105918d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDiscoverFinished");
                C18696o.C18706j jVar = new C18696o.C18706j();
                jVar.f52337a = true;
                jVar.f52338b = null;
                jVar.f52339c = null;
                jVar.f52340d = 0;
                jVar.f52341e = null;
                MMHandler mMHandler = C18696o.this.f52302p;
                if (!mMHandler.sendMessage(mMHandler.obtainMessage(13, jVar))) {
                    Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 13);
                }
            } else {
                Log.m105928w("MicroMsg.exdevice.BluetoothLESimpleManager", "no SimpleBLEManagerCallback");
            }
            C21565f.this.f61073h.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
            r0 = true;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33763b(android.bluetooth.BluetoothDevice r13, int r14, byte[] r15) {
            /*
                r12 = this;
                java.lang.String r0 = r13.getAddress()
                long r0 = d81.C45288e.m50137h(r0)
                mw0.f r2 = mw0.C21565f.this
                java.util.HashSet<java.lang.Long> r2 = r2.f61073h
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x0192
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r13.getName()
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = r13.getAddress()
                r5 = 1
                r2[r5] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                r6 = 2
                r2[r6] = r3
                java.lang.String r3 = d81.C45288e.m50130a(r15)
                r7 = 3
                r2[r7] = r3
                java.lang.String r3 = "MicroMsg.exdevice.BluetoothLESimpleManager"
                java.lang.String r8 = "------onDiscover------ device Name = %s, mac = %s(%d), scanRecord = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r8, r2)
                mw0.f r2 = mw0.C21565f.this
                java.util.HashSet<java.lang.Long> r2 = r2.f61073h
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.add(r0)
                java.util.HashMap<java.lang.String, java.lang.Long> r0 = nw0.C89094c.f256752a
                java.lang.String r0 = "nw0.c"
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r15)
                if (r1 == 0) goto L_0x005a
                java.lang.String r1 = "parseBroadcastServiceUuid error. broadcast data is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x0057:
                r0 = 0
                goto L_0x0146
            L_0x005a:
                r1 = 0
            L_0x005b:
                if (r1 < 0) goto L_0x0057
                int r2 = r15.length
                if (r1 >= r2) goto L_0x0057
                int r2 = r1 + 1
                byte r1 = r15[r1]
                int r3 = r2 + r1
                int r8 = r15.length
                if (r3 <= r8) goto L_0x0084
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r4] = r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r5] = r1
                int r1 = r15.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r6] = r1
                java.lang.String r1 = "broadcast data len is not enough. offset = %d, current len = %d, broadcast len = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r3)
                goto L_0x0057
            L_0x0084:
                if (r1 > 0) goto L_0x0094
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r4] = r1
                java.lang.String r1 = "current part of data's len = %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)
                goto L_0x0057
            L_0x0094:
                int r3 = r2 + 1
                byte r2 = r15[r2]
                int r1 = r1 + -1
                r8 = -1
                if (r2 == r8) goto L_0x0125
                if (r2 == r6) goto L_0x00ec
                if (r2 == r7) goto L_0x00ec
                r8 = 6
                if (r2 == r8) goto L_0x00a9
                r8 = 7
                if (r2 == r8) goto L_0x00a9
                goto L_0x0122
            L_0x00a9:
                r2 = 16
                if (r2 > r1) goto L_0x0122
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r15, r3, r2)     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.nio.ByteBuffer r2 = r2.order(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                long r8 = r2.getLong()     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                long r10 = r2.getLong()     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.util.UUID r2 = new java.util.UUID     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                r2.<init>(r10, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.lang.String r8 = "find 128-bit broacast service = %s"
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                r9[r4] = r2     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                java.util.HashMap<java.lang.String, java.lang.Long> r8 = nw0.C89094c.f256752a     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                boolean r2 = r8.containsKey(r2)     // Catch:{ IndexOutOfBoundsException -> 0x00dc }
                if (r2 == 0) goto L_0x00e6
                goto L_0x011e
            L_0x00da:
                r13 = move-exception
                goto L_0x00eb
            L_0x00dc:
                r2 = move-exception
                java.lang.String r8 = "BlueToothDeviceFilter.parseUUID"
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00da }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r2)     // Catch:{ all -> 0x00da }
            L_0x00e6:
                int r3 = r3 + 16
                int r1 = r1 + -16
                goto L_0x00a9
            L_0x00eb:
                throw r13
            L_0x00ec:
                if (r6 > r1) goto L_0x0122
                int r2 = r3 + 1
                byte r3 = r15[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r8 = r2 + 1
                byte r2 = r15[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 8
                r2 = r2 | r3
                int r1 = r1 + -2
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r4] = r2
                java.lang.String r2 = "%08x-0000-1000-8000-00805f9b34fb"
                java.lang.String r2 = java.lang.String.format(r2, r3)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r4] = r2
                java.lang.String r9 = "find 16-bit broacast service = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r3)
                java.util.HashMap<java.lang.String, java.lang.Long> r3 = nw0.C89094c.f256752a
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L_0x0120
            L_0x011e:
                r0 = 1
                goto L_0x0146
            L_0x0120:
                r3 = r8
                goto L_0x00ec
            L_0x0122:
                int r1 = r1 + r3
                goto L_0x005b
            L_0x0125:
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                r2[r4] = r8
                java.lang.String r8 = "Manufacturer Specific Data size = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r2)
                java.lang.Object[] r2 = new java.lang.Object[r5]
                int r1 = r1 + r3
                byte[] r3 = java.util.Arrays.copyOfRange(r15, r3, r1)
                java.lang.String r3 = d81.C45288e.m50130a(r3)
                r2[r4] = r3
                java.lang.String r3 = "Manufacturer Specific Data = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
                goto L_0x005b
            L_0x0146:
                if (r0 == 0) goto L_0x0192
                mw0.f r0 = mw0.C21565f.this
                mw0.f$d r0 = r0.f61067b
                java.lang.String r1 = r13.getAddress()
                java.lang.String r13 = r13.getName()
                com.tencent.mm.plugin.exdevice.service.o$a r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18697a) r0
                r0.getClass()
                java.lang.Object[] r2 = new java.lang.Object[r6]
                r2[r4] = r1
                r2[r5] = r13
                java.lang.String r3 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
                java.lang.String r6 = "onDiscover. deviceMac=%s, deviceName=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
                com.tencent.mm.plugin.exdevice.service.o$j r2 = new com.tencent.mm.plugin.exdevice.service.o$j
                r2.<init>()
                r2.f52337a = r4
                r2.f52338b = r1
                r2.f52339c = r13
                r2.f52340d = r14
                r2.f52341e = r15
                com.tencent.mm.plugin.exdevice.service.o r13 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                com.tencent.mm.sdk.platformtools.MMHandler r13 = r13.f52302p
                r14 = 13
                android.os.Message r15 = r13.obtainMessage(r14, r2)
                boolean r13 = r13.sendMessage(r15)
                if (r13 != 0) goto L_0x0192
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r13[r4] = r14
                java.lang.String r14 = "mHandler.sendMessage failed!!!, message what = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r14, r13)
            L_0x0192:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mw0.C21565f.C21566a.mo33763b(android.bluetooth.BluetoothDevice, int, byte[]):void");
        }
    }

    /* renamed from: mw0.f$b */
    public class C21567b extends C21572h.C21577e {

        /* renamed from: mw0.f$b$a */
        public class C21568a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f61079d;

            /* renamed from: e */
            public final /* synthetic */ boolean f61080e;

            /* renamed from: f */
            public final /* synthetic */ long f61081f;

            public C21568a(long j, boolean z, long j2) {
                this.f61079d = j;
                this.f61080e = z;
                this.f61081f = j2;
            }

            public void run() {
                C21572h hVar = C21565f.this.f61074i.get(Long.valueOf(this.f61079d));
                boolean z = this.f61080e;
                boolean z2 = !z;
                if (hVar != null || z2) {
                    C21570d dVar = C21565f.this.f61067b;
                    if (dVar != null) {
                        long j = this.f61079d;
                        long j2 = this.f61081f;
                        C18696o.C18697a aVar = (C18696o.C18697a) dVar;
                        aVar.getClass();
                        Object[] objArr = new Object[3];
                        objArr[0] = Long.valueOf(j);
                        objArr[1] = z ? "true" : "false";
                        int i = 2;
                        objArr[2] = Long.valueOf(j2);
                        Log.m105919d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onConnected. seesionId=%d, connected=%s, profileType=%d", objArr);
                        C18696o.C18702f fVar = new C18696o.C18702f();
                        fVar.f52323a = j;
                        if (!z) {
                            i = 4;
                        }
                        fVar.f52325c = i;
                        fVar.f52324b = 1;
                        fVar.f52326d = 0;
                        fVar.f52327e = j2;
                        MMHandler mMHandler = C18696o.this.f52302p;
                        if (!mMHandler.sendMessage(mMHandler.obtainMessage(9, fVar))) {
                            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 9);
                        }
                        if (z2) {
                            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleManager", "disconnected, mBLEManagerCallback callback mac=%s", C45288e.m50135f(this.f61079d));
                        }
                    }
                    if (z2) {
                        Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleManager", "remove seesion(mac=%s)", C45288e.m50135f(this.f61079d));
                        C21565f.this.f61074i.remove(Long.valueOf(this.f61079d));
                        C21565f.this.f61075j.remove(Long.valueOf(this.f61079d));
                        return;
                    }
                    return;
                }
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleManager", "no seesion(mac=%s) found", C45288e.m50135f(this.f61079d));
            }
        }

        public C21567b() {
        }

        /* renamed from: a */
        public void mo33798a(long j, boolean z, long j2) {
            Object[] objArr = new Object[2];
            objArr[0] = C45288e.m50135f(j);
            objArr[1] = z ? "true" : "false";
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleManager", "onConnected. mac = %s, connected = %s", objArr);
            C21565f fVar = C21565f.this;
            C21568a aVar = new C21568a(j, z, j2);
            fVar.f61069d.lock();
            aVar.run();
            fVar.f61069d.unlock();
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleManager", "session size = %d", Integer.valueOf(C21565f.this.f61074i.size()));
        }

        /* renamed from: b */
        public void mo33799b(long j, boolean z) {
            Object[] objArr = new Object[2];
            objArr[0] = C45288e.m50135f(j);
            String str = "true";
            objArr[1] = z ? str : "false";
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleManager", "onSend. mac = %s, success = %s", objArr);
            C21570d dVar = C21565f.this.f61067b;
            if (dVar != null) {
                C18696o.C18697a aVar = (C18696o.C18697a) dVar;
                aVar.getClass();
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(j);
                if (!z) {
                    str = "false";
                }
                objArr2[1] = str;
                Log.m105919d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onSend. sessionId=%d, success=%s", objArr2);
                C18696o.C18707k kVar = new C18696o.C18707k();
                kVar.f52342a = j;
                if (z) {
                    kVar.f52343b = 0;
                    kVar.f52344c = 0;
                } else {
                    kVar.f52343b = -1;
                    kVar.f52344c = -1;
                }
                kVar.f52345d = "";
                MMHandler mMHandler = C18696o.this.f52302p;
                if (!mMHandler.sendMessage(mMHandler.obtainMessage(11, kVar))) {
                    Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 11);
                }
            }
        }
    }

    /* renamed from: mw0.f$c */
    public class C21569c implements Runnable {
        public C21569c() {
        }

        public void run() {
            C21565f fVar = C21565f.this;
            fVar.f61066a.mo33778c(false, fVar.f61072g);
            Log.m105924i("MicroMsg.exdevice.BluetoothLESimpleManager", "Time out for discovering. Stop it");
        }
    }

    /* renamed from: mw0.f$d */
    public static abstract class C21570d {
    }

    public C21565f(C21570d dVar) {
        this.f61068c = null;
        this.f61069d = new ReentrantLock();
        this.f61070e = null;
        this.f61071f = null;
        this.f61072g = new C21566a();
        this.f61073h = new HashSet<>();
        this.f61074i = new HashMap<>();
        this.f61075j = new HashMap<>();
        this.f61076k = new C21567b();
        this.f61068c = MMApplicationContext.getContext();
        this.f61067b = dVar;
        this.f61066a = C21555c.m24445a();
        this.f61071f = new C21569c();
        this.f61070e = new MMHandler("BluetoothLESimpleManagerThread");
    }

    /* renamed from: a */
    public final boolean mo33795a() {
        return this.f61068c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: b */
    public boolean mo33796b() {
        Log.m105918d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble scan");
        Assert.assertTrue(this.f61066a != null);
        if (!mo33795a()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
            return false;
        }
        boolean c = this.f61066a.mo33778c(true, this.f61072g);
        if (c) {
            this.f61073h.clear();
        }
        return c;
    }

    /* renamed from: c */
    public boolean mo33797c() {
        Log.m105918d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble stop scan");
        Assert.assertTrue(this.f61066a != null);
        if (!mo33795a()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
            return false;
        }
        this.f61070e.removeCallbacks(this.f61071f);
        return this.f61066a.mo33778c(false, this.f61072g);
    }
}
