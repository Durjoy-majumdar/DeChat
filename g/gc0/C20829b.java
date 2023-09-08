package gc0;

import com.tencent.p014mm.modelimage.loader.impr.C114733a;
import com.tencent.p014mm.sdk.platformtools.Log;
import hc0.C20935b;
import ic0.C21071j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import lc0.C21410b;

/* renamed from: gc0.b */
public class C20829b {

    /* renamed from: a */
    public C20935b f58840a;

    /* renamed from: b */
    public C21071j f58841b;

    /* renamed from: c */
    public Executor f58842c;

    /* renamed from: d */
    public final Map<Integer, String> f58843d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    public HashMap<Integer, C21410b> f58844e = new HashMap<>();

    public C20829b(C20935b bVar) {
        this.f58840a = bVar;
        this.f58841b = bVar.f59297l;
        this.f58842c = bVar.f59298m;
        ((C114733a) bVar.f59292g).f343975a = bVar.f59294i;
    }

    /* renamed from: a */
    public void mo32529a(C21410b bVar) {
        C20830c cVar;
        HashMap<Integer, C21410b> hashMap = this.f58844e;
        if (hashMap != null && bVar != null && (cVar = bVar.f60572e) != null) {
            hashMap.remove(Integer.valueOf(cVar.f58846b));
        }
    }

    /* renamed from: b */
    public void mo32530b(C20830c cVar) {
        this.f58843d.remove(Integer.valueOf(cVar.f58846b));
        Log.m105919d("MicroMsg.imageloader.ImageLoaderManager", "[cpan] remove image weak holder size:%d viewcode:%s", Integer.valueOf(this.f58843d.size()), Integer.valueOf(cVar.f58846b));
    }
}
