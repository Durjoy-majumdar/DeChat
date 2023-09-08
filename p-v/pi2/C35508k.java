package pi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import g62.C75875l;
import oi2.C77010f;
import vi2.C78418c;

/* renamed from: pi2.k */
public class C35508k implements C75875l.C32329c {
    /* renamed from: w5 */
    public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
        C77010f vx02 = C77010f.vx0();
        vx02.getClass();
        if (eVar.f123845b.equals("delete")) {
            Log.m105925i("MicroMsg.SubCoreRemittance", "update red flag when delete msg: %s", eVar.f123844a);
            vx02.Bx0(eVar.f123844a, (C72963f4) null, (C78418c) null);
        }
    }
}
