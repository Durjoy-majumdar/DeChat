package p655px;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: px.f */
public class C35710f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f95407d;

    public C35710f(Intent intent) {
        this.f95407d = intent;
    }

    public void run() {
        try {
            C117361f.INSTANCE.gk0(this.f95407d);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PSIR", th, "unexpected exception was thrown.", new Object[0]);
        }
    }
}
