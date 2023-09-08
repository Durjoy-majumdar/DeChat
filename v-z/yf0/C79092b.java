package yf0;

import ag0.C27890c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;
import te3.C77903a;
import te3.C78021z;
import vf0.C37726b;
import zf0.C53776k;

/* renamed from: yf0.b */
public class C79092b implements C11385n {

    /* renamed from: d */
    public C46888b f232239d;

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C78021z zVar = ((C53776k) yVar).f150933f;
            Log.m105925i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", Integer.valueOf(zVar.f228659d));
            int i3 = zVar.f228659d;
            if (i3 == 0) {
                C88643g.m110553k(this.f232239d, zVar);
                C115669n.INSTANCE.idkeyStat(407, 6, 1, false);
                C27890c Lo = C37726b.vx0().mo55666Lo(zVar.f228661f);
                if (Lo != null) {
                    Lo.field_status = zVar.f228669q;
                    C37726b.vx0().replace(Lo);
                    return;
                }
                return;
            }
            C77903a aVar = zVar.f228655G;
            if (aVar != null && aVar.f226964d == 1) {
                this.f232239d.mo72091a(aVar);
            } else if (i3 <= 0 || Util.isNullOrNil(zVar.f228660e)) {
                this.f232239d.mo72091a(Boolean.FALSE);
            } else {
                this.f232239d.mo72091a(zVar.f228660e);
            }
            C115669n.INSTANCE.idkeyStat(407, 8, 1, false);
            return;
        }
        C46888b bVar = this.f232239d;
        if (bVar != null) {
            bVar.mo72091a(Boolean.FALSE);
        }
        C115669n.INSTANCE.idkeyStat(407, 7, 1, false);
    }
}
