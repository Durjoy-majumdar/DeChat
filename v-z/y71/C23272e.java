package y71;

import android.os.Looper;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;
import java.util.Vector;
import junit.framework.Assert;
import pw0.C22025b;
import pw0.C22036c;
import qw0.C47887a;

/* renamed from: y71.e */
public class C23272e implements C22036c {

    /* renamed from: f */
    public static C23272e f66896f;

    /* renamed from: a */
    public C22025b f66897a = null;

    /* renamed from: b */
    public final Vector<C23277l> f66898b = new Vector<>();

    /* renamed from: c */
    public final HashMap<Long, Integer> f66899c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<Long, Integer> f66900d = new HashMap<>();

    /* renamed from: e */
    public MMHandler f66901e = new MMHandler(C112396n.m153349b().f336526b.getSerialTag());

    /* renamed from: y71.e$a */
    public class C23273a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ long f66903e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f66904f;

        public C23273a(long j, byte[] bArr) {
            this.f66903e = j;
            this.f66904f = bArr;
        }

        public void run() {
            if (!C23272e.m27750c(C23272e.this, this.f66903e, this.f66904f)) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.sendDataImp failed!!!");
            }
        }
    }

    public C23272e() {
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", Long.valueOf(Thread.currentThread().getId()), Long.valueOf(Looper.getMainLooper().getThread().getId()));
        this.f66897a = new C22025b(MMApplicationContext.getContext(), this, C112396n.m153349b().f336526b);
    }

    /* renamed from: a */
    public static boolean m27748a(C23272e eVar, int i, C23277l lVar, int[] iArr) {
        if (lVar != null) {
            if (!(iArr == null ? eVar.f66897a.mo35150g(i, new int[0]) : eVar.f66897a.mo35150g(i, iArr))) {
                Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.scan failed!!!");
                lVar.mo33636b(-1, "scanImp: mBTSDKMrg.scan failed!!!");
                return false;
            }
            eVar.f66898b.add(lVar);
            return true;
        }
        eVar.getClass();
        Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
        throw new IllegalArgumentException("scanImp: null == aCallback");
    }

    /* renamed from: b */
    public static void m27749b(C23272e eVar, long j, long j2) {
        if (eVar.f66899c.containsKey(Long.valueOf(j))) {
            eVar.f66897a.mo35148e(j, j2, eVar.f66899c.get(Long.valueOf(j)).intValue());
            return;
        }
        int a = C112396n.m153349b().mo164107a(j);
        boolean z = false;
        Assert.assertTrue(-1 != a);
        String d = C47887a.m53197d(j);
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "insertDeviceIdTypeMap deviceid = %s, BTVersion = %d", d, Integer.valueOf(a));
        Assert.assertNotNull(d);
        if (1 == a || a == 0) {
            z = true;
        }
        Assert.assertTrue(z);
        long a2 = C47887a.m53194a(d);
        if (!eVar.f66899c.containsKey(Long.valueOf(a2))) {
            eVar.f66899c.put(Long.valueOf(a2), Integer.valueOf(a));
        }
        eVar.f66897a.mo35148e(j, j2, a);
    }

    /* renamed from: c */
    public static boolean m27750c(C23272e eVar, long j, byte[] bArr) {
        Assert.assertTrue(eVar.f66900d.containsKey(Long.valueOf(j)));
        boolean h = eVar.f66897a.mo35151h(j, eVar.f66900d.get(Long.valueOf(j)).intValue(), bArr);
        if (!h) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.sendData failed!!!");
            eVar.mo36755g(j, false);
        }
        return h;
    }

    /* renamed from: d */
    public static boolean m27751d(C23272e eVar, long j) {
        Assert.assertTrue(eVar.f66900d.containsKey(Long.valueOf(j)));
        boolean d = eVar.f66897a.mo35147d(j, eVar.f66900d.get(Long.valueOf(j)).intValue());
        if (!d) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.connect failed!!!");
            eVar.mo36754f(j, false);
        }
        return d;
    }

    /* renamed from: e */
    public static C23272e m27752e() {
        C23272e eVar = f66896f;
        if (eVar != null) {
            return eVar;
        }
        C23272e eVar2 = new C23272e();
        f66896f = eVar2;
        return eVar2;
    }

    /* renamed from: i */
    public static boolean m27753i(long j, byte[] bArr) {
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Long.valueOf(j);
        if (bArr != null) {
            i = bArr.length;
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", objArr);
        Assert.assertNotNull(bArr);
        C23272e e = m27752e();
        boolean post = e.f66901e.post(new C23273a(j, bArr));
        if (!post) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
        }
        return post;
    }

    /* renamed from: f */
    public void mo36754f(long j, boolean z) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + j + "Connected = " + z);
        if (z) {
            Java2CExDevice.onBluetoothConnected(j);
        } else {
            Java2CExDevice.onBluetoothDisconnected(j);
        }
    }

    /* renamed from: g */
    public void mo36755g(long j, boolean z) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + j + "success = " + z);
        if (z) {
            Java2CExDevice.onBluetoothSendDataCompleted(j);
        } else {
            Java2CExDevice.onBluetoothError(j, 0);
        }
    }

    /* renamed from: h */
    public void mo36756h(long j, long j2, long j3) {
        Log.m105924i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + j + " aDeviceID = " + j2);
        Assert.assertTrue(this.f66899c.containsKey(Long.valueOf(j2)));
        if (!this.f66900d.containsKey(Long.valueOf(j))) {
            this.f66900d.put(Long.valueOf(j), this.f66899c.get(Long.valueOf(j2)));
        }
        Java2CExDevice.onBluetoothSessionCreated(j2, j3, j);
    }
}
