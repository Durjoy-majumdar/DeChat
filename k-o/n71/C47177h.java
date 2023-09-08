package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import s71.C48243c;
import s71.C48254n;

/* renamed from: n71.h */
public class C47177h extends C47179j {
    public C47177h(int i, int i2, long j) {
        C48254n nVar = new C48254n();
        nVar.f129273d = new C48243c();
        nVar.f129274e = i;
        nVar.f129275f = i2;
        this.f126722d = nVar;
        this.f126719a = j;
        this.f126720b = 30002;
    }

    /* renamed from: c */
    public byte[] mo72252c() {
        try {
            return this.f126722d.toByteArray();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", e.getMessage());
            return null;
        }
    }
}
