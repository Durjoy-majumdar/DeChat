package o81;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import j81.C87906e;
import java.util.HashMap;
import u24.C90599h;
import v81.C118667b;
import v81.C118668c;
import w81.C90900a;

/* renamed from: o81.b */
public class C117714b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117715c f352039d;

    public C117714b(C117715c cVar) {
        this.f352039d = cVar;
    }

    public void run() {
        for (C118667b bVar : ((HashMap) this.f352039d.f352040d).values()) {
            if (C90599h.m113511d(bVar.f355090k) && !C90599h.m113511d(bVar.f355091l)) {
                String c = C87906e.m109409c(bVar.f355091l);
                if (!C90599h.m113511d(c)) {
                    try {
                        bVar.f355090k = new String(Base64.decode(c, 0), "UTF-8");
                        C117715c.vx0(this.f352039d);
                        C90900a.m114034g(true);
                    } catch (Exception e) {
                        Log.m105920e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e.getMessage());
                        C90900a.m114034g(false);
                    }
                } else {
                    C90900a.m114034g(false);
                }
            }
        }
        for (C118668c cVar : ((HashMap) this.f352039d.f352041e).values()) {
            if (C90599h.m113511d(cVar.f355096c) && !C90599h.m113511d(cVar.f355097d)) {
                String c2 = C87906e.m109409c(cVar.f355097d);
                if (!C90599h.m113511d(c2)) {
                    try {
                        cVar.f355096c = new String(Base64.decode(c2, 0), "UTF-8");
                        this.f352039d.Ax0();
                        C90900a.m114034g(true);
                    } catch (Exception e2) {
                        Log.m105920e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e2.getMessage());
                        C90900a.m114034g(false);
                    }
                } else {
                    C90900a.m114034g(false);
                }
            }
        }
    }
}
