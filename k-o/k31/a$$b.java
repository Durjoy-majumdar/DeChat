package k31;

import java.util.HashMap;
import java.util.Map;
import n31.C117602d;
import r31.C118218a;
import r31.C118219b;

public final /* synthetic */ class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117373a f351394d;

    /* renamed from: e */
    public final /* synthetic */ String f351395e;

    /* renamed from: f */
    public final /* synthetic */ C117602d f351396f;

    public /* synthetic */ a$$b(C117373a aVar, String str, C117602d dVar) {
        this.f351394d = aVar;
        this.f351395e = str;
        this.f351396f = dVar;
    }

    public final void run() {
        Map<String, Object> map;
        C117373a aVar = this.f351394d;
        String str = this.f351395e;
        C117602d dVar = this.f351396f;
        C118218a a = C118219b.m166774a(str, C118219b.m166776c(aVar.f351384j.f353458b));
        if (a != null && (map = a.f353363b) != null && ((HashMap) map).size() > 0) {
            dVar.mo55686a(a.f353363b);
        }
    }
}
