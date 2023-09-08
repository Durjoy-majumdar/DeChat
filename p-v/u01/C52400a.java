package u01;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import t01.C48520a;

/* renamed from: u01.a */
public class C52400a<E> extends HashSet<E> {

    /* renamed from: d */
    public C52401b f146477d;

    public C52400a(C52401b bVar) {
        this.f146477d = bVar;
    }

    public synchronized boolean add(E e) {
        boolean add;
        add = super.add(e);
        mo73399f();
        return add;
    }

    public void clear() {
        super.clear();
        synchronized (this) {
            C48520a.C48521a aVar = (C48520a.C48521a) this.f146477d;
            aVar.getClass();
            Log.m105924i("MicroMsg.CDNDownloadClient", "notify clear");
            C48520a.m53895a(C48520a.this);
            C48520a aVar2 = C48520a.this;
            aVar2.getClass();
            Log.m105924i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            aVar2.f129781j.stopTimer();
        }
    }

    /* renamed from: f */
    public final synchronized void mo73399f() {
        C48520a.C48521a aVar = (C48520a.C48521a) this.f146477d;
        aVar.getClass();
        Log.m105924i("MicroMsg.CDNDownloadClient", "notify add");
        C48520a.this.mo73154b();
        C48520a aVar2 = C48520a.this;
        aVar2.getClass();
        Log.m105924i("MicroMsg.CDNDownloadClient", "startCheckProcessActiveTimer");
        aVar2.f129781j.startTimer(20000);
    }

    /* renamed from: h */
    public final synchronized void mo73400h() {
        C48520a.C48521a aVar = (C48520a.C48521a) this.f146477d;
        aVar.getClass();
        Log.m105924i("MicroMsg.CDNDownloadClient", "notify remove");
        if (((HashSet) C48520a.this.f129778g).size() == 0) {
            C48520a.m53895a(C48520a.this);
            C48520a aVar2 = C48520a.this;
            aVar2.getClass();
            Log.m105924i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            aVar2.f129781j.stopTimer();
        }
    }

    public synchronized boolean remove(Object obj) {
        boolean remove;
        remove = super.remove(obj);
        mo73400h();
        return remove;
    }
}
