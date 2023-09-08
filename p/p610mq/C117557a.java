package p610mq;

import com.tencent.p014mm.sdk.platformtools.Log;
import j81.C117302a;
import j81.C117306b;
import j81.C117307c;
import j81.C87906e;
import o81.C117726o;
import v81.C118667b;
import v81.C118668c;

/* renamed from: mq.a */
public class C117557a implements C117726o {
    /* renamed from: GA */
    public void mo182286GA(C118667b bVar) {
        C117302a xx02 = C117302a.xx0();
        xx02.getClass();
        if (bVar != null) {
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigOffline offlineConfig : " + bVar.f355080a);
            xx02.f351179o.post(new C117306b(xx02, bVar));
        }
    }

    /* renamed from: SY */
    public void mo182287SY(C118667b bVar) {
        C117302a.xx0().getClass();
        if (bVar != null) {
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigUpdate newConfig : " + bVar.f355080a);
        }
    }

    /* renamed from: Tn */
    public void mo182288Tn(C118668c cVar) {
        C117302a.xx0().getClass();
        if (cVar != null) {
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onSqlConfigSame sameConfig : " + cVar.f355094a);
        }
    }

    /* renamed from: ZV */
    public void mo182289ZV(C118668c cVar) {
        C117302a.xx0().getClass();
        if (cVar != null) {
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onSqlConfigOffline offlineConfig : " + cVar.f355094a);
        }
    }

    /* renamed from: bS */
    public void mo182290bS(C118668c cVar) {
        C117302a.xx0().getClass();
        if (cVar != null) {
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onSqlConfigUpdate newConfig : " + cVar.f355094a);
        }
    }

    public void qo0(C118667b bVar) {
        C117302a xx02 = C117302a.xx0();
        xx02.getClass();
        if (bVar != null) {
            if (C87906e.m109415i()) {
                xx02.f351179o.post(new C117307c(xx02, bVar));
            }
            Log.m105924i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigSame sameConfig : " + bVar.f355080a);
        }
    }
}
