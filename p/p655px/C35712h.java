package p655px;

import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.h */
public class C35712h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f95409d;

    public C35712h(int i) {
        this.f95409d = i;
    }

    public void run() {
        Log.m105924i("MicroMsg.PSIR", "[+] report task start running.");
        try {
            C117361f.INSTANCE.mo182033dk(this.f95409d, 1008);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "unexpected exception was thrown.", new Object[0]);
        }
    }
}
