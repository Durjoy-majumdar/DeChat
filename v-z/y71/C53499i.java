package y71;

import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import z71.C53753b;
import z71.C53754c;

/* renamed from: y71.i */
public class C53499i {

    /* renamed from: a */
    public HashMap<Long, C53500a> f150444a = new HashMap<>();

    /* renamed from: y71.i$a */
    public static class C53500a {

        /* renamed from: a */
        public long f150445a;

        /* renamed from: b */
        public byte[] f150446b;

        /* renamed from: c */
        public byte[] f150447c;

        /* renamed from: d */
        public byte[] f150448d;

        /* renamed from: e */
        public int f150449e;

        /* renamed from: f */
        public boolean f150450f;

        /* renamed from: g */
        public long f150451g;
    }

    /* renamed from: a */
    public boolean mo74174a(long j) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceInfoManager", "delDeviceAuthFlag, device id = %d", Long.valueOf(j));
        C53500a d = mo74177d(j);
        if (d == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
            return false;
        }
        d.f150450f = false;
        return true;
    }

    /* renamed from: b */
    public final byte[] mo74175b(long j, int i) {
        if (j < 0) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceInfoManager", "device is lower than 0");
            return null;
        }
        C53500a aVar = this.f150444a.get(Long.valueOf(j));
        if (aVar == null) {
            mo74179f(j);
            aVar = this.f150444a.get(Long.valueOf(j));
        }
        if (aVar == null) {
            return null;
        }
        if (i == 1) {
            return aVar.f150448d;
        }
        if (i == 2) {
            return aVar.f150446b;
        }
        if (i != 3) {
            return null;
        }
        return aVar.f150447c;
    }

    /* renamed from: c */
    public int mo74176c(long j) {
        if (this.f150444a.containsKey(Long.valueOf(j))) {
            return this.f150444a.get(Long.valueOf(j)).f150449e;
        }
        return 0;
    }

    /* renamed from: d */
    public C53500a mo74177d(long j) {
        if (!this.f150444a.containsKey(Long.valueOf(j))) {
            mo74179f(j);
        }
        return this.f150444a.get(Long.valueOf(j));
    }

    /* renamed from: e */
    public C53500a mo74178e(long j) {
        if (this.f150444a.containsKey(Long.valueOf(j))) {
            return this.f150444a.get(Long.valueOf(j));
        }
        C53500a aVar = new C53500a();
        aVar.f150445a = j;
        aVar.f150448d = null;
        aVar.f150446b = null;
        aVar.f150447c = null;
        aVar.f150449e = 0;
        aVar.f150450f = false;
        aVar.f150451g = 0;
        this.f150444a.put(Long.valueOf(j), aVar);
        return aVar;
    }

    /* renamed from: f */
    public final void mo74179f(long j) {
        C53754c Bx0 = C41166r1.Bx0();
        C53753b SE = Bx0.mo74331SE(j + "");
        if (SE == null) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceInfoManager", "get harddevice info from db failed : %d", Long.valueOf(j));
            return;
        }
        C53500a aVar = new C53500a();
        aVar.f150445a = j;
        aVar.f150448d = SE.field_authBuf;
        aVar.f150446b = SE.field_sessionKey;
        aVar.f150447c = SE.field_sessionBuf;
        aVar.f150449e = 0;
        aVar.f150450f = false;
        this.f150444a.put(Long.valueOf(j), aVar);
        Log.m105925i("MicroMsg.exdevice.ExdeviceInfoManager", "not contains the device info, device id = %d, load from db", Long.valueOf(j));
    }

    /* renamed from: g */
    public boolean mo74180g(long j) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceInfoManager", "isDeviceAuthed, device id = %d", Long.valueOf(j));
        C53500a d = mo74177d(j);
        if (d != null) {
            return d.f150450f;
        }
        Log.m105920e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
        return false;
    }

    /* renamed from: h */
    public final void mo74181h(long j, byte[] bArr, int i) {
        boolean z = false;
        if (j < 0 || bArr == null || bArr.length == 0) {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            if (bArr == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
            Log.m105921e("MicroMsg.exdevice.ExdeviceInfoManager", "device id low than 0 or authbuf is null, deviceid = %d, buffer == null : %b, buffer length = %d", objArr);
            return;
        }
        C53500a aVar = this.f150444a.get(Long.valueOf(j));
        if (aVar == null) {
            aVar = new C53500a();
            aVar.f150445a = j;
        }
        if (i == 1) {
            aVar.f150448d = bArr;
        } else if (i == 2) {
            aVar.f150446b = bArr;
        } else if (i != 3) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceInfoManager", "unkown buffer type : %d", Integer.valueOf(i));
        } else {
            aVar.f150447c = bArr;
        }
        this.f150444a.put(Long.valueOf(j), aVar);
    }

    /* renamed from: i */
    public boolean mo74182i(long j) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceInfoManager", "setDeviceAuthFlag, device id = %d", Long.valueOf(j));
        C53500a d = mo74177d(j);
        if (d == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
            return false;
        }
        d.f150450f = true;
        return true;
    }
}
