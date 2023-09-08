package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import n71.C47172c;
import n71.C47178i;
import y71.C53501k;
import y71.C53502m;

/* renamed from: a81.g */
public class C39507g extends C41171u1 {

    /* renamed from: d */
    public C47172c f106077d;

    public C39507g(byte[] bArr, int i, long j) {
        this.f106077d = new C47178i(bArr, i, j);
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        if (C53502m.m60037a().mo74180g(this.f106077d.f126719a)) {
            return new C39501a(this.f106077d, dVar).mo62110b(kVar);
        }
        Log.m105929w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", Long.valueOf(this.f106077d.f126719a));
        return true;
    }
}
