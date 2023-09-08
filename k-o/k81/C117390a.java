package k81;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import m81.C117538b;
import m81.C117542c;
import m81.C61443a;
import u24.C90599h;

/* renamed from: k81.a */
public abstract class C117390a implements C117392c {

    /* renamed from: a */
    public C117542c f351437a;

    /* renamed from: b */
    public int f351438b = 0;

    /* renamed from: a */
    public void mo182072a(String str) {
        C117542c cVar;
        if (!C90599h.m113511d(str) && (cVar = this.f351437a) != null) {
            cVar.remove(str);
        }
    }

    /* renamed from: b */
    public void mo182073b() {
        this.f351438b = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_edge_computing_cache_storage_mode, 0);
        C117542c cVar = this.f351437a;
        if (cVar != null) {
            cVar.close();
        }
        this.f351437a = null;
        int i = this.f351438b;
        if (i == 0) {
            this.f351437a = new C117538b(type());
        } else if (i == 1) {
            this.f351437a = new C61443a(type());
        }
        C117542c cVar2 = this.f351437a;
        if (cVar2 != null) {
            cVar2.reset();
            Log.m105924i("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset storageMode : " + this.f351438b);
            return;
        }
        Log.m105920e("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset illegal storageMode : " + this.f351438b);
    }
}
