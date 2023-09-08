package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import pe3.C47465a;
import pe3.C89349b;
import s71.C48245e;
import s71.C48251k;
import s71.C48252l;

/* renamed from: n71.f */
public class C47175f extends C47173d {
    public C47175f(long j, int i, int i2, byte[] bArr) {
        super(j, i, i2, bArr);
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + j + " seq = " + i + " cmdId = " + i2);
    }

    /* renamed from: d */
    public C47465a mo72248d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
            return null;
        }
        C48251k kVar = new C48251k();
        try {
            kVar.parseFrom(bArr);
            this.f126723e = kVar;
            Log.m105924i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
            return kVar;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public void mo72254e(int i, String str, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + i + str);
        C48252l lVar = new C48252l();
        C48245e eVar = new C48245e();
        this.f126721c = eVar;
        eVar.f129247d = i;
        eVar.f129248e = str;
        lVar.f129267d = eVar;
        if (bArr == null) {
            bArr = new byte[0];
        }
        lVar.f129270e = new C89349b(bArr, 0, bArr.length);
        this.f126722d = lVar;
        this.f126720b = 20002;
    }
}
