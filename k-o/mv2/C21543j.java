package mv2;

import com.tencent.p014mm.sdk.platformtools.Log;
import pv2.C77290d;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;

/* renamed from: mv2.j */
public class C21543j implements C64998b<C22551c> {

    /* renamed from: a */
    public final /* synthetic */ C21544k f60998a;

    public C21543j(C21544k kVar) {
        this.f60998a = kVar;
    }

    /* renamed from: a */
    public void mo24821a(C22553e eVar) {
        C22551c cVar = (C22551c) eVar;
        Log.m105925i("MicroMsg.SoterNetDelegateUtil", "generate and upload ask onResult errCode: %d, errMsg: %s", Integer.valueOf(cVar.f61886a), cVar.f61887b);
        if (cVar.mo34909a()) {
            C21539a aVar = this.f60998a.f60999a;
            if (aVar != null) {
                C21541f.this.mo33748j1();
                return;
            }
            return;
        }
        C77290d.m93105c(1, cVar.f61886a, 1);
        C21539a aVar2 = this.f60998a.f60999a;
        if (aVar2 != null) {
            C21541f.this.mo33749k1(3, cVar.f61886a, cVar.f61887b);
        }
    }
}
