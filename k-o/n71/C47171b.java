package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import pe3.C47465a;
import pe3.C89349b;
import s71.C48241a;
import s71.C48242b;
import s71.C48245e;

/* renamed from: n71.b */
public class C47171b extends C47173d {
    public C47171b(long j, int i, int i2, byte[] bArr) {
        super(j, i, i2, bArr);
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + j + " seq = " + i + " cmdId = " + i2);
    }

    /* renamed from: d */
    public C47465a mo72248d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
            return null;
        }
        C48241a aVar = new C48241a();
        try {
            aVar.parseFrom(bArr);
            this.f126723e = aVar;
            Log.m105924i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + aVar.f129236f + " DeviceName = " + aVar.f129243p + " Language = " + aVar.f129242o + " TimeZone = " + aVar.f129241n);
            return aVar;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdAuth", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public void mo72249e(int i, String str, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + i + "errMsg = " + str);
        C48242b bVar = new C48242b();
        C48245e eVar = new C48245e();
        this.f126721c = eVar;
        eVar.f129247d = i;
        eVar.f129248e = str;
        bVar.f129267d = eVar;
        bVar.f129244e = C89349b.m111674a(bArr);
        this.f126722d = bVar;
        this.f126720b = 20001;
    }
}
