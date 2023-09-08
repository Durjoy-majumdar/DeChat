package nl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import ql2.C22095a;

/* renamed from: nl2.e */
public final class C21667e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21670h f61320d;

    /* renamed from: e */
    public final /* synthetic */ C21656b f61321e;

    public C21667e(C21670h hVar, C21656b bVar) {
        this.f61320d = hVar;
        this.f61321e = bVar;
    }

    public final void run() {
        Log.m105925i("MicroMsg.AiScanImageGetProductManager", "alvinluo requestGetProduct trackId: %s, session: %s", Integer.valueOf(this.f61320d.f61326f.f61358a.getId()), Long.valueOf(this.f61320d.f61283b));
        C21656b bVar = this.f61321e;
        ArrayList<C22095a> arrayList = bVar.f61290d;
        C22095a aVar = new C22095a(this.f61320d, bVar);
        this.f61321e.mo33923e(aVar);
        arrayList.add(aVar);
        C21656b.m24604l(this.f61321e);
    }
}
