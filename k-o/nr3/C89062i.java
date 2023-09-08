package nr3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nr3.i */
public class C89062i {

    /* renamed from: a */
    public final byte[] f256713a = new byte[1];

    /* renamed from: a */
    public void mo123426a(long j) {
        synchronized (this.f256713a) {
            byte[] bArr = this.f256713a;
            if (bArr[0] != 0) {
                Log.m105925i("MicroMsg.WxTimeoutLock", "no need lock %s", this);
            } else {
                try {
                    bArr.wait(j);
                } catch (InterruptedException e) {
                    Log.printErrStackTrace("MicroMsg.WxTimeoutLock", e, "", new Object[0]);
                }
            }
        }
    }
}
