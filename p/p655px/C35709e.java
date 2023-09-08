package p655px;

import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.e */
public class C35709e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f95406d;

    public C35709e(byte[] bArr) {
        this.f95406d = bArr;
    }

    public void run() {
        Log.m105924i("MicroMsg.PSIR", "[+] report turing owner task start running.");
        try {
            C117361f.INSTANCE.mo182030Y8(this.f95406d);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "[TuringOwner] unexpected exception was thrown.", new Object[0]);
        }
    }
}
