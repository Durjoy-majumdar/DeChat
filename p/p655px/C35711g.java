package p655px;

import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.g */
public class C35711g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f95408d;

    public C35711g(int i) {
        this.f95408d = i;
    }

    public void run() {
        Log.m105924i("MicroMsg.PSIR", "[+] report finder task start running.");
        try {
            C117361f.INSTANCE.Vp0(this.f95408d);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "[finder] unexpected exception was thrown.", new Object[0]);
        }
    }
}
