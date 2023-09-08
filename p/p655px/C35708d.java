package p655px;

import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.d */
public class C35708d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f95404d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f95405e;

    public C35708d(String str, byte[] bArr) {
        this.f95404d = str;
        this.f95405e = bArr;
    }

    public void run() {
        Log.m105924i("MicroMsg.PSIR", "[+] report sensor scene info task start running.");
        try {
            C117361f.INSTANCE.mo182034ez(this.f95404d, this.f95405e);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "[sensor] unexpected exception was thrown.", new Object[0]);
        }
    }
}
