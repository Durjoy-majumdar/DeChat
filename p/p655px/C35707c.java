package p655px;

import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.c */
public class C35707c implements Runnable {
    public void run() {
        Log.m105924i("MicroMsg.PSIR", "[+] report yap task start running.");
        try {
            C117361f.INSTANCE.mo182039vc();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "[yap] unexpected exception was thrown.", new Object[0]);
        }
    }
}
