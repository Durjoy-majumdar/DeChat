package y71;

import android.os.Message;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.service.C18696o;
import com.tencent.p014mm.plugin.exdevice.service.C41200j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import z71.C53752a;

/* renamed from: y71.a */
public final class C23260a implements C23277l {

    /* renamed from: h */
    public static C23260a f66860h;

    /* renamed from: d */
    public final HashMap<Long, Long> f66861d = new HashMap<>();

    /* renamed from: e */
    public C23276j f66862e = null;

    /* renamed from: f */
    public MMHandler f66863f = new C23262b(C112396n.m153349b().f336526b.getSerialTag());

    /* renamed from: g */
    public Object f66864g = new Object();

    /* renamed from: y71.a$a */
    public class C23261a implements Runnable {
        public C23261a() {
        }

        public void run() {
            ((C18696o) C23260a.this.f66862e).mo23552gj(0, -1, "", "", "", 0, (byte[]) null);
        }
    }

    /* renamed from: y71.a$b */
    public final class C23262b extends MMHandler {
        public C23262b(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C23264d dVar = (C23264d) message.obj;
                    ((C18696o) C23260a.this.f66862e).mo23552gj(1, 0, (String) null, dVar.f66871a, dVar.f66872b, dVar.f66873c, dVar.f66874d);
                    return;
                case 2:
                    ((C18696o) C23260a.this.f66862e).mo23552gj(2, 0, (String) null, (String) null, (String) null, 0, (byte[]) null);
                    return;
                case 3:
                    C23266f fVar = (C23266f) message.obj;
                    ((C18696o) C23260a.this.f66862e).mo23551g(fVar.f66879a, fVar.f66880b, fVar.f66881c, fVar.f66882d);
                    return;
                case 4:
                    C23265e eVar = (C23265e) message.obj;
                    ((C18696o) C23260a.this.f66862e).mo23550f(eVar.f66875a, eVar.f66876b, eVar.f66877c, eVar.f66878d);
                    return;
                case 5:
                    C23263c cVar = (C23263c) message.obj;
                    C23276j jVar = C23260a.this.f66862e;
                    int i = message.arg1;
                    long j = cVar.f66867a;
                    short s = cVar.f66868b;
                    short s2 = cVar.f66869c;
                    byte[] bArr = cVar.f66870d;
                    C18696o oVar = (C18696o) jVar;
                    oVar.getClass();
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(i);
                    objArr[1] = Long.valueOf(j);
                    objArr[2] = Short.valueOf(s);
                    objArr[3] = Short.valueOf(s2);
                    objArr[4] = Integer.valueOf(bArr == null ? 0 : bArr.length);
                    Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", objArr);
                    C18696o.C18701e eVar2 = new C18696o.C18701e();
                    eVar2.f52320c = s2;
                    eVar2.f52321d = bArr;
                    eVar2.f52318a = j;
                    eVar2.f52319b = s;
                    eVar2.f52322e = i;
                    MMHandler mMHandler = oVar.f52302p;
                    if (!mMHandler.sendMessage(mMHandler.obtainMessage(6, eVar2))) {
                        Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 6);
                        return;
                    }
                    return;
                case 8:
                    C23268h hVar = (C23268h) message.obj;
                    C23260a.m27724d(C23260a.this, hVar.f66885a, hVar.f66886b);
                    return;
                case 9:
                    C23260a aVar = C23260a.this;
                    long longValue = ((Long) message.obj).longValue();
                    aVar.getClass();
                    Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "stopTaskImp taskId = %d", Long.valueOf(longValue));
                    Java2CExDevice.stopTask(longValue);
                    return;
                case 10:
                    C23267g gVar = (C23267g) message.obj;
                    C23260a aVar2 = C23260a.this;
                    long j2 = gVar.f66883a;
                    byte[] bArr2 = gVar.f66884b;
                    aVar2.getClass();
                    Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKeyImp------ deviceId = %d", Long.valueOf(j2));
                    if (!aVar2.f66861d.containsKey(Long.valueOf(j2))) {
                        Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
                        return;
                    } else {
                        Java2CExDevice.setChannelSessionKey(aVar2.f66861d.get(Long.valueOf(j2)).longValue(), bArr2);
                        return;
                    }
                case 11:
                    synchronized (C23260a.this.f66864g) {
                        C23260a.m27725e(C23260a.this, ((Long) message.obj).longValue());
                    }
                    return;
                case 12:
                    synchronized (C23260a.this.f66864g) {
                        C23260a.this.mo36737l(((Long) message.obj).longValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: y71.a$d */
    public static final class C23264d {

        /* renamed from: a */
        public String f66871a;

        /* renamed from: b */
        public String f66872b;

        /* renamed from: c */
        public int f66873c;

        /* renamed from: d */
        public byte[] f66874d;

        public C23264d(String str, String str2, int i, byte[] bArr) {
            this.f66871a = str;
            this.f66872b = str2;
            this.f66873c = i;
            this.f66874d = bArr;
        }
    }

    /* renamed from: y71.a$f */
    public static final class C23266f {

        /* renamed from: a */
        public long f66879a = 0;

        /* renamed from: b */
        public int f66880b = 0;

        /* renamed from: c */
        public int f66881c = 0;

        /* renamed from: d */
        public String f66882d = null;

        /* renamed from: a */
        public C23266f mo36747a(int i) {
            this.f66881c = i;
            return this;
        }

        /* renamed from: b */
        public C23266f mo36748b(String str) {
            this.f66882d = str;
            return this;
        }

        /* renamed from: c */
        public C23266f mo36749c(int i) {
            this.f66880b = i;
            return this;
        }

        /* renamed from: d */
        public C23266f mo36750d(long j) {
            this.f66879a = j;
            return this;
        }
    }

    /* renamed from: y71.a$g */
    public static final class C23267g {

        /* renamed from: a */
        public long f66883a;

        /* renamed from: b */
        public byte[] f66884b;

        public C23267g(long j, byte[] bArr) {
            this.f66883a = j;
            this.f66884b = bArr;
        }
    }

    /* renamed from: y71.a$h */
    public static final class C23268h {

        /* renamed from: a */
        public long f66885a;

        /* renamed from: b */
        public C41200j f66886b;

        public C23268h(long j, C41200j jVar) {
            this.f66885a = j;
            this.f66886b = jVar;
        }
    }

    public C23260a(C23276j jVar) {
        this.f66862e = jVar;
        f66860h = this;
    }

    /* renamed from: d */
    public static int m27724d(C23260a aVar, long j, C41200j jVar) {
        aVar.getClass();
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "startTaskImp, taskId = %d", Long.valueOf(j));
        Assert.assertNotNull(jVar);
        try {
            long deviceId = jVar.getReqObj().getDeviceId();
            if (!C53752a.m60249c("conneted_device", deviceId)) {
                Log.m105928w("MicroMsg.exdevice.BTDeviceManager", "Cannot startTask because this channel is close aready!!!");
                C23266f fVar = new C23266f();
                fVar.mo36750d(j);
                fVar.mo36747a(-1);
                fVar.mo36749c(-1);
                fVar.mo36748b("Channel is close aready!!!");
                MMHandler mMHandler = f66860h.f66863f;
                Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(3, 0, 0, fVar)));
            } else if (!aVar.f66861d.containsKey(Long.valueOf(deviceId))) {
                Log.m105921e("MicroMsg.exdevice.BTDeviceManager", "Cannot find Channel by DeviceInfo(%s) in mMapDeviceChannelId", Long.valueOf(deviceId));
                ((C18696o) aVar.f66862e).mo23551g(j, -1, -1, "Cannot find Channel by DeviceInfo!!!");
            } else {
                Java2CExDevice.AccessoryCmd accessoryCmd = new Java2CExDevice.AccessoryCmd();
                accessoryCmd.channelID = aVar.f66861d.get(Long.valueOf(deviceId)).longValue();
                try {
                    accessoryCmd.reqCmdID = jVar.getReqObj().Km0();
                    accessoryCmd.respCmdID = jVar.getReqObj().mo23536rX();
                    try {
                        byte[] qq = jVar.getReqObj().mo23535qq();
                        int gh = jVar.getReqObj().mo23534gh();
                        if (Java2CExDevice.startTask(j, (short) gh, accessoryCmd, qq) != 0) {
                            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startTask Failed!!!");
                        } else {
                            Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "------let task go------ taskId = %d, deviceId = %d, channelId = %d, seq = %d, reqCmdId = %d, respCmdId = %d", Long.valueOf(j), Long.valueOf(deviceId), Long.valueOf(accessoryCmd.channelID), Integer.valueOf(gh), Integer.valueOf(accessoryCmd.reqCmdID), Integer.valueOf(accessoryCmd.respCmdID));
                            return 0;
                        }
                    } catch (RemoteException e) {
                        Log.m105921e("MicroMsg.exdevice.BTDeviceManager", "Remote getDataOut failed!!! %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e, "", new Object[0]);
                        ((C18696o) aVar.f66862e).mo23551g(j, -1, -1, "Remote getDataOut failed!!!!!!");
                    }
                } catch (RemoteException e2) {
                    Log.m105921e("MicroMsg.exdevice.BTDeviceManager", "Remote getResquestCmdId or getResponseCmdId failed!!! %s", e2.getMessage());
                    Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e2, "", new Object[0]);
                    ((C18696o) aVar.f66862e).mo23551g(j, -1, -1, "Remote getResquestCmdId or getResponseCmdId failed!!!");
                }
            }
        } catch (RemoteException e3) {
            Log.m105921e("MicroMsg.exdevice.BTDeviceManager", "Remote getDeviceId failed!!! %s", e3.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e3, "", new Object[0]);
            ((C18696o) aVar.f66862e).mo23551g(j, -1, -1, "Remote getDeviceId failed!!!");
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m27725e(C23260a aVar, long j) {
        aVar.getClass();
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "startChannelImp deviceId = %d", Long.valueOf(j));
        if (C53752a.m60249c("conneted_device", j)) {
            Log.m105928w("MicroMsg.exdevice.BTDeviceManager", "This deviceId is not call stop channel before startChannel, Call it");
            aVar.mo36737l(j);
        }
        Java2CExDevice.LongWrapper longWrapper = new Java2CExDevice.LongWrapper();
        longWrapper.value = -1;
        int createChannel = Java2CExDevice.createChannel(j, longWrapper);
        if (createChannel != 0) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.createChannel Failed, ret = " + createChannel);
            ((C18696o) aVar.f66862e).mo23550f(j, 1, 4, -1);
        } else {
            Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "Create channel id is ok, deviceId = %d, channelId = %d", Long.valueOf(j), Long.valueOf(longWrapper.value));
            aVar.f66861d.put(Long.valueOf(j), Long.valueOf(longWrapper.value));
            Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "add the device to connected devices : [%d]", Long.valueOf(j));
            if (!C53752a.m60247a("conneted_device", j)) {
                Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "addToSharedPreferences failed!!!");
                ((C18696o) aVar.f66862e).mo23550f(j, 1, 4, -1);
            } else {
                int startChannelService = Java2CExDevice.startChannelService(longWrapper.value);
                if (startChannelService == 0) {
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startChannelService Failed, ret = " + startChannelService);
                ((C18696o) aVar.f66862e).mo23550f(j, 1, 4, -1);
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m27726g(long j, short s, short s2, byte[] bArr, int i) {
        Object[] objArr = new Object[5];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Short.valueOf(s);
        objArr[2] = Short.valueOf(s2);
        objArr[3] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[4] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", objArr);
        Assert.assertNotNull(f66860h);
        Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = " + j + " seq = " + s + "cmdId = " + s2 + "errCode = " + i);
        long f = f66860h.mo36734f(j);
        if (-1 == f) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        C23263c cVar = new C23263c((C23261a) null);
        cVar.mo36741c(f);
        cVar.mo36740b(bArr);
        cVar.mo36739a(s2);
        cVar.mo36742d(s);
        MMHandler mMHandler = f66860h.f66863f;
        Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(5, i, 0, cVar)));
    }

    /* renamed from: h */
    public static void m27727h(long j, int i, int i2, int i3) {
        Assert.assertNotNull(f66860h);
        Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "onStateChange channelId = " + j + " oldState = " + i + " newState = " + i2 + " errCode = " + i3);
        long f = f66860h.mo36734f(j);
        if (-1 == f) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        C23265e eVar = new C23265e((C23261a) null);
        eVar.mo36743a(f);
        eVar.mo36744b(i3);
        eVar.mo36745c(i2);
        eVar.mo36746d(i);
        MMHandler mMHandler = f66860h.f66863f;
        Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(4, 0, 0, eVar)));
    }

    /* renamed from: i */
    public static void m27728i(long j, int i, int i2, String str) {
        Assert.assertNotNull(f66860h);
        Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "onTaskEnd taskId = " + j + " errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C23266f fVar = new C23266f();
        fVar.mo36750d(j);
        fVar.mo36747a(i2);
        fVar.mo36749c(i);
        fVar.mo36748b(str);
        MMHandler mMHandler = f66860h.f66863f;
        Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(3, 0, 0, fVar)));
    }

    /* renamed from: a */
    public void mo33635a(String str, String str2, int i, int i2, byte[] bArr) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        Log.m105919d("MicroMsg.exdevice.BTDeviceManager", "------onScanFound------ aBluetoothVersion = %d, device mac = %s, device name = %s, rssi = %d, advertisment length = %d", objArr);
        C23264d dVar = new C23264d(str, str2, i2, bArr);
        MMHandler mMHandler = this.f66863f;
        Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(1, 0, 0, dVar)));
    }

    /* renamed from: b */
    public void mo33636b(int i, String str) {
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "------onScanError------ error code = %d, error msg = %s", Integer.valueOf(i), Integer.valueOf(i));
        if (!this.f66863f.post(new C23261a())) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "onScanError: mHandler.post failed!!!");
        }
    }

    /* renamed from: c */
    public void mo33637c(int i) {
        Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "******onScanFinished******aBluetoothVersion = " + i);
        MMHandler mMHandler = this.f66863f;
        Assert.assertTrue(mMHandler.sendMessage(mMHandler.obtainMessage(2, 0, 0, (Object) null)));
    }

    /* renamed from: f */
    public final long mo36734f(long j) {
        if (!this.f66861d.containsValue(Long.valueOf(j))) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Cannot find DeviceInfo by channelId");
            return -1;
        }
        for (Map.Entry next : this.f66861d.entrySet()) {
            if (j == ((Long) next.getValue()).longValue()) {
                return ((Long) next.getKey()).longValue();
            }
        }
        Assert.assertTrue(false);
        return -1;
    }

    /* renamed from: j */
    public boolean mo36735j(long j) {
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "startChannel deviceId = %d", Long.valueOf(j));
        MMHandler mMHandler = this.f66863f;
        return mMHandler.sendMessage(mMHandler.obtainMessage(11, Long.valueOf(j)));
    }

    /* renamed from: k */
    public int mo36736k(long j, C41200j jVar) {
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "startTask, taskId = %d", Long.valueOf(j));
        Assert.assertNotNull(jVar);
        C23268h hVar = new C23268h(j, jVar);
        MMHandler mMHandler = this.f66863f;
        return mMHandler.sendMessage(mMHandler.obtainMessage(8, hVar)) ? 0 : -1;
    }

    /* renamed from: l */
    public final boolean mo36737l(long j) {
        Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "stopChannelImp deviceId = " + j);
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "remove the device from connected devices : [%d]", Long.valueOf(j));
        if (!C53752a.m60250d("conneted_device", j)) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "removeFromSharedPreferences failed!!!");
        }
        if (!this.f66861d.containsKey(Long.valueOf(j))) {
            Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
            return false;
        }
        Java2CExDevice.stopChannelService(this.f66861d.get(Long.valueOf(j)).longValue());
        Java2CExDevice.destroyChannel(this.f66861d.get(Long.valueOf(j)).longValue());
        return true;
    }

    /* renamed from: y71.a$c */
    public static final class C23263c {

        /* renamed from: a */
        public long f66867a;

        /* renamed from: b */
        public short f66868b;

        /* renamed from: c */
        public short f66869c;

        /* renamed from: d */
        public byte[] f66870d;

        public C23263c() {
            this.f66867a = 0;
            this.f66868b = 0;
            this.f66869c = 0;
            this.f66870d = null;
        }

        /* renamed from: a */
        public C23263c mo36739a(short s) {
            this.f66869c = s;
            return this;
        }

        /* renamed from: b */
        public C23263c mo36740b(byte[] bArr) {
            this.f66870d = bArr;
            return this;
        }

        /* renamed from: c */
        public C23263c mo36741c(long j) {
            this.f66867a = j;
            return this;
        }

        /* renamed from: d */
        public C23263c mo36742d(short s) {
            this.f66868b = s;
            return this;
        }

        public /* synthetic */ C23263c(C23261a aVar) {
            this();
        }
    }

    /* renamed from: y71.a$e */
    public static final class C23265e {

        /* renamed from: a */
        public long f66875a;

        /* renamed from: b */
        public int f66876b;

        /* renamed from: c */
        public int f66877c;

        /* renamed from: d */
        public int f66878d;

        public C23265e() {
            this.f66875a = 0;
            this.f66876b = 0;
            this.f66877c = 0;
            this.f66878d = 0;
        }

        /* renamed from: a */
        public C23265e mo36743a(long j) {
            this.f66875a = j;
            return this;
        }

        /* renamed from: b */
        public C23265e mo36744b(int i) {
            this.f66878d = i;
            return this;
        }

        /* renamed from: c */
        public C23265e mo36745c(int i) {
            this.f66877c = i;
            return this;
        }

        /* renamed from: d */
        public C23265e mo36746d(int i) {
            this.f66876b = i;
            return this;
        }

        public /* synthetic */ C23265e(C23261a aVar) {
            this();
        }
    }
}
