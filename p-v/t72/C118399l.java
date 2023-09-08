package t72;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.Iterator;
import java.util.Map;
import t72.C118387c;
import t72.C118396k;

/* renamed from: t72.l */
public class C118399l implements Runnable {

    /* renamed from: d */
    public final Map<String, Integer> f353853d;

    /* renamed from: e */
    public final /* synthetic */ Map f353854e;

    /* renamed from: f */
    public final /* synthetic */ C118387c.C118388a f353855f;

    /* renamed from: g */
    public final /* synthetic */ C86009m1 f353856g;

    /* renamed from: h */
    public final /* synthetic */ C118387c f353857h;

    /* renamed from: i */
    public final /* synthetic */ C118391i f353858i;

    public C118399l(C118391i iVar, Map map, C118387c.C118388a aVar, C86009m1 m1Var, C118387c cVar) {
        this.f353858i = iVar;
        this.f353854e = map;
        this.f353855f = aVar;
        this.f353856g = m1Var;
        this.f353857h = cVar;
        this.f353853d = map;
    }

    public void run() {
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan start fileScanResult[%s], subDirMap[%d]", this.f353855f, Integer.valueOf(this.f353854e.size()));
        long currentTimeMillis = System.currentTimeMillis();
        this.f353858i.Cx0(this.f353856g, this.f353855f, (C118387c.C118389b) null, (C118387c.C118390c) null, this.f353853d, true, 0);
        if (this.f353854e.size() > 0) {
            Iterator it = this.f353854e.entrySet().iterator();
            while (it != null && it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.f353855f.f353808h.add(new C118387c.C118389b((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
            }
        }
        this.f353855f.f353806f = System.currentTimeMillis() - currentTimeMillis;
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan end takes[%d], emptySubDir[%d], fileScanResult[%s], tid[%d]", Long.valueOf(this.f353855f.f353806f), Integer.valueOf(this.f353854e.values().size()), this.f353855f, Long.valueOf(Thread.currentThread().getId()));
        ((C118396k.C118397a) this.f353857h).mo183192a(0, this.f353855f);
    }
}
