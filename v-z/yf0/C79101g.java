package yf0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;
import te3.C51181s;
import te3.C77903a;
import zf0.C53775j;

/* renamed from: yf0.g */
public class C79101g implements C11385n {

    /* renamed from: d */
    public C46888b f232255d;

    /* renamed from: e */
    public boolean f232256e = false;

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f232256e = false;
        if (i == 0 && i2 == 0) {
            C51181s sVar = ((C53775j) yVar).f150929f;
            Log.m105925i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", Integer.valueOf(sVar.f141236d), sVar.f141237e);
            if (sVar.f141236d == 0) {
                C88643g.m110553k(this.f232255d, sVar);
                C115669n.INSTANCE.idkeyStat(407, 9, 1, false);
                return;
            }
            if (this.f232255d != null) {
                C77903a aVar = sVar.f141242j;
                if (aVar != null && aVar.f226964d == 1 && !Util.isNullOrNil(aVar.f226968h) && !Util.isNullOrNil(sVar.f141242j.f226966f) && !Util.isNullOrNil(sVar.f141242j.f226967g) && !Util.isNullOrNil(sVar.f141242j.f226965e)) {
                    this.f232255d.mo72091a(sVar.f141242j);
                } else if (sVar.f141236d <= 0 || Util.isNullOrNil(sVar.f141237e)) {
                    this.f232255d.mo72091a(Boolean.FALSE);
                } else {
                    this.f232255d.mo72091a(sVar.f141237e);
                }
            }
            C115669n.INSTANCE.idkeyStat(407, 11, 1, false);
            return;
        }
        C46888b bVar = this.f232255d;
        if (bVar != null) {
            bVar.mo72091a(Boolean.FALSE);
        }
        C115669n.INSTANCE.idkeyStat(407, 10, 1, false);
    }
}
