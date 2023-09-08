package ox2;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import java.util.Map;

/* renamed from: ox2.b */
public final class C89302b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89299a f257261d;

    public C89302b(C89299a aVar) {
        this.f257261d = aVar;
    }

    public final void run() {
        for (Map.Entry<String, C40427l0> value : this.f257261d.f257256f.entrySet()) {
            C81291m0.m99669e((C40427l0) value.getValue());
        }
        this.f257261d.f257256f.clear();
    }
}
