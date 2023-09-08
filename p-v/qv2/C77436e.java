package qv2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import lt3.C21460a;
import op3.C117877b;
import op3.C117882j;
import pv2.C77290d;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;

/* renamed from: qv2.e */
public class C77436e implements C64998b<C22551c> {

    /* renamed from: a */
    public final /* synthetic */ C117877b f225861a;

    /* renamed from: b */
    public final /* synthetic */ C77437f f225862b;

    public C77436e(C77437f fVar, C117877b bVar) {
        this.f225862b = fVar;
        this.f225861a = bVar;
    }

    /* renamed from: a */
    public void mo24821a(C22553e eVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IS_LAST_GEN_ASK_SUCCESS_BOOLEAN_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_IS_LAST_UPLOAD_ASK_SUCCESS_BOOLEAN_SYNC;
        C22551c cVar = (C22551c) eVar;
        Log.m105925i("MicroMsg.SoterPrepareAskFunc", "alvinluo SoterPrepareAskFunc onResult errCode: %d, errMsg: %s", Integer.valueOf(cVar.f61886a), cVar.f61887b);
        if (cVar.mo34909a()) {
            this.f225862b.f225863a.mo72093c(this.f225861a.mo182596a(1));
            this.f225862b.getClass();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) i.mo119685f(aVar2, bool)).booleanValue()) {
                C115669n.INSTANCE.mo175911u(1104, 29);
            }
            this.f225862b.getClass();
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar, bool)).booleanValue()) {
                C115669n.INSTANCE.mo175911u(1104, 30);
            }
            this.f225862b.getClass();
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            Boolean bool2 = Boolean.TRUE;
            i2.mo119677K(aVar, bool2);
            this.f225862b.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, bool2);
        } else {
            if (cVar.f61886a == 1003) {
                this.f225862b.getClass();
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.FALSE);
            }
            if (cVar.f61886a == 4) {
                this.f225862b.getClass();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
            }
            C77290d.m93105c(1, cVar.f61886a, 1);
            this.f225862b.f225863a.mo72091a(C117882j.m166284c(Integer.valueOf(cVar.f61886a), cVar.f61887b));
        }
        if (C21460a.m24273g() == 1) {
            C77290d.m93105c(1, -2, 1);
        } else {
            C77290d.m93105c(1, -3, 1);
        }
    }
}
