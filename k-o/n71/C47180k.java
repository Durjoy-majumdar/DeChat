package n71;

import a81.C39508h;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.exdevice.model.C41131g1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import s71.C48251k;
import y71.C53502m;
import z71.C53753b;
import z71.C53754c;

/* renamed from: n71.k */
public class C47180k implements C11385n {

    /* renamed from: g */
    public static C47180k f126726g;

    /* renamed from: d */
    public final HashMap<Long, C47186f> f126727d;

    /* renamed from: e */
    public MMHandler f126728e;

    /* renamed from: f */
    public HashMap<String, Integer> f126729f;

    /* renamed from: n71.k$g */
    public static final class C11140g {

        /* renamed from: b */
        public static C11140g f32914b;

        /* renamed from: a */
        public long f32915a;

        public C11140g() {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
            long j = 0;
            if (sharedPreferences != null) {
                j = sharedPreferences.getLong("local_message_seq", 0);
                Log.m105925i("MicroMsg.exdevice.Util", "lasted seq id is %d", Long.valueOf(j));
            }
            this.f32915a = j;
        }

        /* renamed from: a */
        public static long m11026a() {
            if (f32914b == null) {
                f32914b = new C11140g();
            }
            C11140g gVar = f32914b;
            if (MAlarmHandler.NEXT_FIRE_INTERVAL == gVar.f32915a) {
                Log.m105928w("MicroMsg.MMSendDataToManufacturerLogic", "Sequence Data-overrun!!!");
                gVar.f32915a = 0;
            }
            long j = gVar.f32915a + 1;
            gVar.f32915a = j;
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
            if (sharedPreferences != null) {
                Log.m105925i("MicroMsg.exdevice.Util", "save locall seq id : %d", Long.valueOf(j));
                sharedPreferences.edit().putLong("local_message_seq", j).commit();
            }
            return j;
        }
    }

    /* renamed from: n71.k$b */
    public class C47182b extends MMHandler {
        public C47182b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            Log.m105925i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "handleMessage msg.what = %d", Integer.valueOf(message2.what));
            int i = message2.what;
            int i2 = -1;
            if (i == 0) {
                long longValue = ((Long) message2.obj).longValue();
                C47186f fVar = C47180k.this.f126727d.get(Long.valueOf(longValue));
                if (fVar == null) {
                    Log.m105929w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId(%d), or response has been send", Long.valueOf(longValue));
                    return;
                }
                fVar.mo72257a().mo72254e(-1, "", (byte[]) null);
                C53502m.m60039c().mo64199b(new C39508h(fVar.mo72257a()));
                C47180k.this.f126727d.remove(Long.valueOf(longValue));
            } else if (i == 1) {
                C47175f fVar2 = (C47175f) message2.obj;
                if (!C53502m.m60037a().mo74180g(fVar2.f126719a)) {
                    Log.m105921e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "This device send other cmd before do auth, device id = %d", Long.valueOf(fVar2.f126719a));
                    fVar2.mo72254e(-2, "", new byte[0]);
                    C53502m.m60039c().mo64199b(new C39508h(fVar2));
                    return;
                }
                int i3 = message2.arg1;
                if (-5 == i3 || -3 == i3 || -4 == i3) {
                    Log.m105921e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Error Code = %d, reply errorcode to device and close channel", Integer.valueOf(i3));
                    fVar2.mo72254e(-1, "", new byte[0]);
                    C53502m.m60039c().mo64199b(new C39508h(fVar2));
                    return;
                }
                C53754c Bx0 = C41166r1.Bx0();
                C53753b SE = Bx0.mo74331SE(fVar2.f126719a + "");
                if (SE == null) {
                    Log.m105920e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
                    return;
                }
                if (System.currentTimeMillis() / 1000 < ((long) SE.f150110v)) {
                    Log.m105920e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "device has been blocked");
                    fVar2.mo72254e(-5, "Device Is Block", (byte[]) null);
                    C53502m.m60039c().mo64199b(new C39508h(fVar2));
                    return;
                }
                long a = C11140g.m11026a();
                C48251k kVar = (C48251k) fVar2.f126723e;
                if (kVar == null) {
                    Log.m105920e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
                    fVar2.mo72254e(-4, "Decode failed", (byte[]) null);
                    C53502m.m60039c().mo64199b(new C39508h(fVar2));
                    return;
                }
                Integer num = C47180k.this.f126729f.get(SE.field_deviceID);
                if (num == null) {
                    num = 0;
                }
                Log.m105925i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataDirection = %s", num);
                if (num.intValue() != 0) {
                    if ((1 & num.intValue()) != 0) {
                        C41166r1.yx0().mo64183p(SE.field_deviceID, SE.field_brandName, kVar.f129268e.mo123703f());
                    }
                    if ((num.intValue() & 2) != 0) {
                        long j = fVar2.f126719a;
                        String str = SE.field_deviceType;
                        String str2 = SE.field_deviceID;
                        C86709a0.m107529k().f251779b.mo123460f(new C41131g1(j, str, str2, a, Util.nowMilliSecond(), kVar.f129268e.mo123703f(), kVar.f129269f));
                        long j2 = a;
                        C47185e eVar = new C47185e(j2);
                        C47180k.this.f126728e.postDelayed(eVar, 30000);
                        C47186f fVar3 = new C47186f();
                        fVar3.mo72259c(fVar2);
                        fVar3.mo72260d(eVar);
                        C47180k.this.f126727d.put(Long.valueOf(j2), fVar3);
                    }
                } else if (kVar.f129269f == 10001) {
                    C41166r1.yx0().mo64183p(SE.field_deviceID, SE.field_brandName, kVar.f129268e.mo123703f());
                } else {
                    long j3 = fVar2.f126719a;
                    String str3 = SE.field_deviceType;
                    String str4 = SE.field_deviceID;
                    C86709a0.m107529k().f251779b.mo123460f(new C41131g1(j3, str3, str4, a, Util.nowMilliSecond(), kVar.f129268e.mo123703f(), kVar.f129269f));
                    long j4 = a;
                    C47185e eVar2 = new C47185e(j4);
                    C47180k.this.f126728e.postDelayed(eVar2, 30000);
                    C47186f fVar4 = new C47186f();
                    fVar4.mo72259c(fVar2);
                    fVar4.mo72260d(eVar2);
                    C47180k.this.f126727d.put(Long.valueOf(j4), fVar4);
                }
            } else if (i == 2) {
                C47183c cVar = (C47183c) message2.obj;
                if (cVar.f126732b != 0 || cVar.f126731a != 0) {
                    long j1 = ((C41131g1) cVar.f126734d).mo64198j1();
                    C47186f fVar5 = C47180k.this.f126727d.get(Long.valueOf(j1));
                    if (fVar5 == null) {
                        Log.m105921e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", Long.valueOf(j1));
                        return;
                    }
                    C47175f a2 = fVar5.mo72257a();
                    if (cVar.f126731a == -417) {
                        i2 = -5;
                    }
                    a2.mo72254e(i2, cVar.f126733c, (byte[]) null);
                    C53502m.m60039c().mo64199b(new C39508h(fVar5.mo72257a()));
                    C47180k.this.f126728e.removeCallbacks(fVar5.mo72258b());
                    C47180k.this.f126727d.remove(Long.valueOf(j1));
                }
            } else if (i != 3) {
                Log.m105923f("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "unknown message type = %d", Integer.valueOf(i));
            } else {
                C47184d dVar = (C47184d) message2.obj;
                C47186f fVar6 = C47180k.this.f126727d.get(Long.valueOf(dVar.f126735a));
                if (fVar6 == null) {
                    Log.m105929w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", Long.valueOf(dVar.f126735a));
                    return;
                }
                fVar6.f126739a.mo72254e(0, "", dVar.f126736b);
                C53502m.m60039c().mo64199b(new C39508h(fVar6.mo72257a()));
                C47180k.this.f126728e.removeCallbacks(fVar6.mo72258b());
                C47180k.this.f126727d.remove(Long.valueOf(dVar.f126735a));
            }
        }
    }

    /* renamed from: n71.k$c */
    public static final class C47183c {

        /* renamed from: a */
        public int f126731a = 0;

        /* renamed from: b */
        public int f126732b = 0;

        /* renamed from: c */
        public String f126733c = null;

        /* renamed from: d */
        public C117747y f126734d = null;
    }

    /* renamed from: n71.k$d */
    public static final class C47184d {

        /* renamed from: a */
        public long f126735a;

        /* renamed from: b */
        public byte[] f126736b;

        public C47184d() {
            this.f126735a = 0;
            this.f126736b = null;
        }
    }

    /* renamed from: n71.k$e */
    public final class C47185e implements Runnable {

        /* renamed from: d */
        public long f126737d = -1;

        public C47185e(long j) {
            Assert.assertTrue(j >= 0);
            this.f126737d = j;
        }

        public void run() {
            Log.m105929w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Time Out Sequnence(%d)", Long.valueOf(this.f126737d));
            C47180k.this.f126728e.obtainMessage(0, Long.valueOf(this.f126737d)).sendToTarget();
        }
    }

    /* renamed from: n71.k$f */
    public static final class C47186f {

        /* renamed from: a */
        public C47175f f126739a = null;

        /* renamed from: b */
        public C47185e f126740b = null;

        /* renamed from: a */
        public C47175f mo72257a() {
            Assert.assertNotNull(this.f126739a);
            return this.f126739a;
        }

        /* renamed from: b */
        public C47185e mo72258b() {
            Assert.assertNotNull(this.f126740b);
            return this.f126740b;
        }

        /* renamed from: c */
        public void mo72259c(C47175f fVar) {
            Assert.assertNotNull(fVar);
            this.f126739a = fVar;
        }

        /* renamed from: d */
        public void mo72260d(C47185e eVar) {
            Assert.assertNotNull(eVar);
            this.f126740b = eVar;
        }
    }

    public C47180k() {
        this.f126727d = new HashMap<>();
        this.f126728e = null;
        this.f126729f = new HashMap<>();
        this.f126728e = new C47182b(C86709a0.m107525e().getLooper());
    }

    /* renamed from: a */
    public static C47180k m52466a() {
        C47180k kVar = f126726g;
        if (kVar != null) {
            return kVar;
        }
        C47180k kVar2 = new C47180k();
        f126726g = kVar2;
        return kVar2;
    }

    /* renamed from: b */
    public void mo72255b(long j, byte[] bArr) {
        boolean z = true;
        Log.m105925i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Recivce sendDataToManufacturerResponse, sessionId = %d", Long.valueOf(j));
        if (j < 0) {
            z = false;
        }
        Assert.assertTrue(z);
        C47184d dVar = new C47184d();
        dVar.f126735a = j;
        dVar.f126736b = bArr;
        this.f126728e.obtainMessage(3, dVar).sendToTarget();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "******onSceneEnd******\r\n errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C47183c cVar = new C47183c();
        cVar.f126731a = i2;
        cVar.f126732b = i;
        cVar.f126733c = str;
        cVar.f126734d = yVar;
        this.f126728e.obtainMessage(2, cVar).sendToTarget();
    }
}
