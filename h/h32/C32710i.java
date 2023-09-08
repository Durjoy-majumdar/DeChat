package h32;

import com.tencent.p014mm.sdk.platformtools.Log;
import g32.C75846b;
import g62.C75875l;

/* renamed from: h32.i */
public class C32710i implements C75875l.C32329c {
    /* renamed from: w5 */
    public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
        C75846b zx02 = C75846b.zx0();
        zx02.getClass();
        if (eVar.f123845b.equals("delete")) {
            Log.m105925i("MicroMsg.SubCoreLuckyMoney", "update red flag when delete msg: %s", eVar.f123844a);
            zx02.Fx0(eVar.f123844a);
        }
    }
}
