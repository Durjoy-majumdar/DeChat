package n71;

import a81.C39505e;
import a81.C39506f;
import com.tencent.p014mm.plugin.exdevice.service.C41185d;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;
import x71.C53294a;
import y71.C53502m;

/* renamed from: n71.a */
public class C47169a extends C41185d.C41186a {

    /* renamed from: e */
    public static C47169a f126713e;

    /* renamed from: n71.a$a */
    public static class C47170a implements Runnable {

        /* renamed from: d */
        public long f126714d;

        /* renamed from: e */
        public int f126715e;

        /* renamed from: f */
        public int f126716f;

        /* renamed from: g */
        public int f126717g;

        /* renamed from: h */
        public byte[] f126718h;

        public C47170a(int i, long j, int i2, int i3, byte[] bArr) {
            this.f126714d = j;
            this.f126715e = i2;
            this.f126716f = i3;
            this.f126718h = bArr;
            this.f126717g = i;
        }

        /* renamed from: a */
        public void mo72246a() {
            int i;
            int i2;
            long j = this.f126714d;
            if (j == -1 || (i = this.f126715e) == -1 || (i2 = this.f126716f) == -1) {
                Log.m105920e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
                return;
            }
            switch (i2) {
                case 10001:
                    C53502m.m60039c().mo64199b(new C39505e(this.f126717g, j, i, i2, this.f126718h));
                    return;
                case 10002:
                    C47180k a = C47180k.m52466a();
                    int i3 = this.f126717g;
                    long j2 = this.f126714d;
                    int i4 = this.f126715e;
                    int i5 = this.f126716f;
                    byte[] bArr = this.f126718h;
                    a.getClass();
                    a.f126728e.obtainMessage(1, i3, 0, new C47175f(j2, i4, i5, bArr)).sendToTarget();
                    return;
                case 10003:
                    C53502m.m60039c().mo64199b(new C39506f(this.f126717g, j, i, i2, this.f126718h));
                    return;
                default:
                    Log.m105921e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", Integer.valueOf(i2));
                    return;
            }
        }

        public void run() {
            mo72246a();
        }
    }

    /* renamed from: fY */
    public void mo64239fY(int i, long j, int i2, int i3, byte[] bArr) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Long.valueOf(j);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        objArr[4] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        Log.m105925i("MicroMsg.exdevice.DeviceRequestManager", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", objArr);
        C53294a.m59722a(j, i == 0 ? 1 : 0);
        String a = C45288e.m50130a(bArr);
        if (a == null) {
            Log.m105920e("MicroMsg.exdevice.DeviceRequestManager", "dataIn is null!!! Just leave without process data");
            return;
        }
        Log.m105919d("MicroMsg.exdevice.DeviceRequestManager", "data dump = %s", a);
        new C47170a(i, j, i2, i3, bArr).mo72246a();
    }
}
