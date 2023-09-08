package pw0;

import android.content.Context;
import android.os.Message;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import junit.framework.Assert;
import mw0.C21546b;
import ow0.C21894a;
import y71.C112396n;
import y71.C23272e;
import y71.C23277l;

/* renamed from: pw0.b */
public final class C22025b {

    /* renamed from: a */
    public MMHandler f62347a = null;

    /* renamed from: b */
    public C21546b f62348b = null;

    /* renamed from: c */
    public C21894a f62349c = null;

    /* renamed from: d */
    public C22036c f62350d = null;

    /* renamed from: e */
    public final HashSet<String> f62351e = new HashSet<>();

    /* renamed from: pw0.b$a */
    public class C22026a extends C21894a.C21897c {
        public C22026a() {
        }

        /* renamed from: a */
        public void mo34928a(long j, boolean z) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onConnected*** SessionId = " + j + " Connected = " + z);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 4, 1, 0, new C22031f(j, z)));
        }

        /* renamed from: b */
        public void mo34929b(String str, String str2) {
            if (C22025b.m25442c(C22025b.this, str)) {
                Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscover*** deviceMac = " + str + "deviceName = " + str2);
                Assert.assertTrue(C22025b.m25440a(C22025b.this, 3, 1, 0, new C22034i(str, str2, 0, (byte[]) null)));
            }
        }

        /* renamed from: c */
        public void mo34930c() {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscoverFinished***");
            C22025b.m25441b(C22025b.this);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 2, 1, 0, (Object) null));
        }

        /* renamed from: d */
        public void mo34931d(long j, int i, String str) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onError*** SessionId = " + j + " errorCode = " + i + " errorInfo = " + str);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 5, 1, 0, new C22032g(j, i, str)));
        }

        /* renamed from: e */
        public void mo34932e(long j, byte[] bArr) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onRecv*** sessionId = " + j);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 1, 1, 0, new C22033h(j, bArr)));
        }

        /* renamed from: f */
        public void mo34933f(long j, boolean z) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSend*** SessionId = " + j + " success = " + z);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 0, 1, 0, new C22035j(j, z)));
        }

        /* renamed from: g */
        public void mo34934g(long j, long j2, long j3) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSessionCreate*** sessionID = " + j + " deviceID = " + j2);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 6, 1, 0, new C22029d(j, j2, j3)));
        }
    }

    /* renamed from: pw0.b$b */
    public class C22027b extends C21546b.C21553d {
        public C22027b() {
        }

        /* renamed from: a */
        public void mo33770a(long j, boolean z) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onConnected*** SessionId = " + j + " Connected = " + z);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 4, 0, 0, new C22031f(j, z)));
        }

        /* renamed from: b */
        public void mo33771b(String str, String str2, int i, byte[] bArr) {
            Log.m105919d("MicroMsg.exdevice.BluetoothSDKManager", "---BLE onDiscover---, %s, %s", str, str2);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 3, 0, 0, new C22034i(str, str2, i, bArr)));
        }

        /* renamed from: c */
        public void mo33772c() {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onDiscoverFinished***");
            C22025b.m25441b(C22025b.this);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 2, 0, 0, (Object) null));
        }

        /* renamed from: d */
        public void mo33773d(long j, byte[] bArr) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onRecv*** sessionId = " + j);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 1, 0, 0, new C22033h(j, bArr)));
        }

        /* renamed from: e */
        public void mo33774e(long j, boolean z) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSend*** SessionId = " + j + " success = " + z);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 0, 0, 0, new C22035j(j, z)));
        }

        /* renamed from: f */
        public void mo33775f(long j, long j2, long j3) {
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSessionCreate*** sessionID = " + j + " deviceID = " + j2);
            Assert.assertTrue(C22025b.m25440a(C22025b.this, 6, 0, 0, new C22029d(j, j2, j3)));
        }
    }

    /* renamed from: pw0.b$c */
    public static class C22028c extends MMHandler {

        /* renamed from: a */
        public WeakReference<C22025b> f62354a = null;

        public C22028c(String str, C22025b bVar) {
            super(str);
            this.f62354a = new WeakReference<>(bVar);
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            C22025b bVar = this.f62354a.get();
            if (bVar == null) {
                Log.m105928w("MicroMsg.exdevice.BluetoothSDKManager", "null == BluetoothSdkManager");
                return;
            }
            Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "handleMessage Message.What = " + message2.what);
            switch (message2.what) {
                case 0:
                    C22035j jVar = (C22035j) message2.obj;
                    ((C23272e) bVar.f62350d).mo36755g(jVar.f62358a, jVar.f62359b);
                    return;
                case 1:
                    C22033h hVar = (C22033h) message2.obj;
                    C22036c cVar = bVar.f62350d;
                    long j = hVar.f62361a;
                    byte[] bArr = hVar.f62362b;
                    ((C23272e) cVar).getClass();
                    Log.m105924i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = " + j);
                    Java2CExDevice.onBluetoothRecvData(j, bArr);
                    return;
                case 2:
                    C22036c cVar2 = bVar.f62350d;
                    int i = message2.arg1;
                    C23272e eVar = (C23272e) cVar2;
                    eVar.getClass();
                    Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", Integer.valueOf(i));
                    if (eVar.f66898b.isEmpty()) {
                        Log.m105928w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                        return;
                    }
                    Iterator<C23277l> it = eVar.f66898b.iterator();
                    while (it.hasNext()) {
                        C23277l next = it.next();
                        if (next != null) {
                            next.mo33637c(i);
                        }
                    }
                    eVar.f66898b.clear();
                    return;
                case 3:
                    C22034i iVar = (C22034i) message2.obj;
                    C22036c cVar3 = bVar.f62350d;
                    String str = iVar.f62363a;
                    String str2 = iVar.f62364b;
                    int i2 = message2.arg1;
                    int i3 = iVar.f62365c;
                    byte[] bArr2 = iVar.f62366d;
                    C23272e eVar2 = (C23272e) cVar3;
                    eVar2.getClass();
                    Object[] objArr = new Object[5];
                    objArr[0] = str;
                    objArr[1] = str2;
                    objArr[2] = Integer.valueOf(i2);
                    objArr[3] = Integer.valueOf(i3);
                    objArr[4] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
                    Log.m105919d("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFound--- deviceMac = %s, deviceName = %s, BTversion = %d, rssi = %d, advertisment length = %d", objArr);
                    if (eVar2.f66898b.isEmpty()) {
                        Log.m105928w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                        return;
                    }
                    Iterator<C23277l> it4 = eVar2.f66898b.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo33635a(str, str2, i2, i3, bArr2);
                        i3 = i3;
                    }
                    return;
                case 4:
                    C22031f fVar = (C22031f) message2.obj;
                    ((C23272e) bVar.f62350d).mo36754f(fVar.f62358a, fVar.f62359b);
                    return;
                case 5:
                    C22036c cVar4 = bVar.f62350d;
                    long j2 = ((C22032g) message2.obj).f62360a;
                    ((C23272e) cVar4).getClass();
                    Java2CExDevice.onBluetoothError(j2, 0);
                    return;
                case 6:
                    C22029d dVar = (C22029d) message2.obj;
                    ((C23272e) bVar.f62350d).mo36756h(dVar.f62356b, dVar.f62355a, dVar.f62357c);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: pw0.b$d */
    public static final class C22029d {

        /* renamed from: a */
        public long f62355a;

        /* renamed from: b */
        public long f62356b;

        /* renamed from: c */
        public long f62357c;

        public C22029d(long j, long j2, long j3) {
            this.f62356b = j;
            this.f62355a = j2;
            this.f62357c = j3;
        }
    }

    /* renamed from: pw0.b$e */
    public static class C22030e {

        /* renamed from: a */
        public long f62358a;

        /* renamed from: b */
        public boolean f62359b;

        public C22030e(long j, boolean z) {
            this.f62358a = j;
            this.f62359b = z;
        }
    }

    /* renamed from: pw0.b$f */
    public static final class C22031f extends C22030e {
        public C22031f(long j, boolean z) {
            super(j, z);
        }
    }

    /* renamed from: pw0.b$g */
    public static final class C22032g {

        /* renamed from: a */
        public long f62360a;

        public C22032g(long j, int i, String str) {
            this.f62360a = j;
        }
    }

    /* renamed from: pw0.b$h */
    public static final class C22033h {

        /* renamed from: a */
        public long f62361a;

        /* renamed from: b */
        public byte[] f62362b;

        public C22033h(long j, byte[] bArr) {
            this.f62361a = j;
            this.f62362b = bArr;
        }
    }

    /* renamed from: pw0.b$i */
    public static final class C22034i {

        /* renamed from: a */
        public String f62363a;

        /* renamed from: b */
        public String f62364b;

        /* renamed from: c */
        public int f62365c;

        /* renamed from: d */
        public byte[] f62366d;

        public C22034i(String str, String str2, int i, byte[] bArr) {
            this.f62363a = str;
            this.f62364b = str2;
            this.f62365c = i;
            this.f62366d = bArr;
        }
    }

    /* renamed from: pw0.b$j */
    public static final class C22035j extends C22030e {
        public C22035j(long j, boolean z) {
            super(j, z);
        }
    }

    public C22025b(Context context, C22036c cVar, MMHandler mMHandler) {
        this.f62349c = new C21894a(mMHandler);
        C21546b bVar = new C21546b(mMHandler.getSerialTag());
        this.f62348b = bVar;
        bVar.mo33756f(context, new C22027b());
        this.f62349c.mo34921d(context, new C22026a());
        this.f62347a = new C22028c(C112396n.m153349b().f336526b.getSerialTag(), this);
        this.f62350d = cVar;
    }

    /* renamed from: a */
    public static boolean m25440a(C22025b bVar, int i, int i2, int i3, Object obj) {
        MMHandler mMHandler = bVar.f62347a;
        return mMHandler.sendMessage(mMHandler.obtainMessage(i, i2, i3, obj));
    }

    /* renamed from: b */
    public static void m25441b(C22025b bVar) {
        bVar.f62351e.clear();
    }

    /* renamed from: c */
    public static boolean m25442c(C22025b bVar, String str) {
        if (str == null) {
            bVar.getClass();
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "null == aDeviceMac");
            return false;
        } else if (bVar.f62351e.contains(str)) {
            return false;
        } else {
            bVar.f62351e.add(str);
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo35147d(long j, int i) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***connect*** aSessionId = " + j + " aBluetoothVersion = " + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar != null) {
                return bVar.mo33752b(j);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        } else if (i != 1) {
            Assert.assertTrue(false);
            return false;
        } else {
            C21894a aVar = this.f62349c;
            if (aVar != null) {
                return aVar.mo34918a(j, true);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return false;
        }
    }

    /* renamed from: e */
    public void mo35148e(long j, long j2, int i) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***createSession*** deviceId = " + j + "aBluetoothVersion = " + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            } else {
                bVar.mo33753c(j, j2);
            }
        } else if (i != 1) {
            Assert.assertTrue(false);
        } else {
            C21894a aVar = this.f62349c;
            if (aVar == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            } else {
                aVar.mo34919b(j, j2);
            }
        }
    }

    /* renamed from: f */
    public void mo35149f(long j, int i) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***Destroy Session*** aSessionId = " + j + " aBluetoothVersion" + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            } else {
                bVar.mo33754d(j);
            }
        } else if (i != 1) {
            Assert.assertTrue(false);
        } else {
            C21894a aVar = this.f62349c;
            if (aVar == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            } else {
                aVar.mo34920c(j);
            }
        }
    }

    /* renamed from: g */
    public boolean mo35150g(int i, int... iArr) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "---scan--- aBluetoothVersion = " + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar != null) {
                return iArr == null ? bVar.mo33758h(true, new int[0]) : bVar.mo33758h(true, iArr);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        } else if (i != 1) {
            Assert.assertTrue(false);
            return false;
        } else {
            C21894a aVar = this.f62349c;
            if (aVar != null) {
                return aVar.mo34923f(true);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo35151h(long j, int i, byte[] bArr) {
        Assert.assertNotNull(bArr);
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***SendData*** sessionId = " + j + "bluetoothVersion = " + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar != null) {
                return bVar.mo33760j(j, bArr);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        } else if (i != 1) {
            Assert.assertTrue(false);
            return false;
        } else {
            C21894a aVar = this.f62349c;
            if (aVar != null) {
                return aVar.mo34925h(j, bArr);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo35152i(int i) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKManager", "***stopScan*** aBluetoothVersion = " + i);
        if (i == 0) {
            C21546b bVar = this.f62348b;
            if (bVar != null) {
                return bVar.mo33758h(false, new int[0]);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        } else if (i != 1) {
            Assert.assertTrue(false);
            return false;
        } else {
            C21894a aVar = this.f62349c;
            if (aVar != null) {
                return aVar.mo34923f(false);
            }
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return false;
        }
    }
}
