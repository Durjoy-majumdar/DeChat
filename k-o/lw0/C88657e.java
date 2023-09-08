package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d81.C86218a;

/* renamed from: lw0.e */
public class C88657e {

    /* renamed from: a */
    public final C88658j f255970a = new C88658j();

    /* renamed from: b */
    public final C88659k f255971b = new C88659k();

    /* renamed from: a */
    public boolean mo123098a(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
            return false;
        }
        C86218a aVar = new C86218a(bArr.length);
        aVar.mo120653d(bArr, 0, bArr.length);
        boolean a = this.f255970a.mo123100a(aVar);
        if (!a) {
            Log.m105918d("MicroMsg.exdevice.IBeaconProtocal", "mSectionA.ParseTLV Failed!!!");
            return a;
        }
        boolean a2 = this.f255971b.mo123100a(aVar);
        if (!a2) {
            Log.m105918d("MicroMsg.exdevice.IBeaconProtocal", "mSectionB.ParseTLV Failed!!!");
        }
        return a2;
    }
}
