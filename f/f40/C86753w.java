package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* renamed from: f40.w */
public class C86753w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f251830d;

    /* renamed from: e */
    public final /* synthetic */ C86755y f251831e;

    public C86753w(C86755y yVar, String str) {
        this.f251831e = yVar;
        this.f251830d = str;
    }

    public void run() {
        try {
            File a = this.f251831e.mo121157a();
            if (!a.exists()) {
                a.createNewFile();
            }
            Log.m105925i("MicroMsg.FindOutDataDisappeared", "Update private usage '%s'", this.f251830d);
            C86013q1.m106437S(a.getAbsolutePath(), this.f251830d.getBytes(StandardCharsets.UTF_8));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th, "", new Object[0]);
        }
    }
}
