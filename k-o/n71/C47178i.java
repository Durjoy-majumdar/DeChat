package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import junit.framework.Assert;
import pe3.C89349b;
import s71.C48243c;
import s71.C48248h;

/* renamed from: n71.i */
public final class C47178i extends C47179j {
    public C47178i(byte[] bArr, int i, long j) {
        C48248h hVar = new C48248h();
        hVar.f129263d = new C48243c();
        hVar.f129264e = new C89349b(bArr, 0, bArr.length);
        hVar.f129265f = i;
        this.f126722d = hVar;
        this.f126719a = j;
        this.f126720b = 30001;
    }

    /* renamed from: c */
    public byte[] mo72252c() {
        Assert.assertNotNull(this.f126722d);
        try {
            return this.f126722d.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", e.getMessage());
            return null;
        }
    }
}
