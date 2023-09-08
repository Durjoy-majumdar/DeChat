package f40;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;

/* renamed from: f40.x */
public class C86754x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f251832d;

    /* renamed from: e */
    public final /* synthetic */ String f251833e;

    /* renamed from: f */
    public final /* synthetic */ String f251834f;

    /* renamed from: g */
    public final /* synthetic */ String f251835g;

    /* renamed from: h */
    public final /* synthetic */ C86755y f251836h;

    public C86754x(C86755y yVar, int i, String str, String str2, String str3) {
        this.f251836h = yVar;
        this.f251832d = i;
        this.f251833e = str;
        this.f251834f = str2;
        this.f251835g = str3;
    }

    public void run() {
        try {
            Log.m105921e("MicroMsg.FindOutDataDisappeared", "Found private data disappeared! (%s)", Integer.valueOf(this.f251832d));
            Log.m105921e("MicroMsg.FindOutDataDisappeared", "Current private storage usage: %s", this.f251833e);
            Log.m105921e("MicroMsg.FindOutDataDisappeared", "Previous private storage usage: %s", this.f251834f);
            C86755y yVar = this.f251836h;
            String str = this.f251835g;
            yVar.getClass();
            yVar.mo121158b(new File(C112760b.m154216X()));
            yVar.mo121158b(new File(C112760b.m154225d()));
            yVar.mo121158b(new File(C112760b.m154225d(), str));
            C86751u.m107635a();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th, "", new Object[0]);
        }
    }
}
