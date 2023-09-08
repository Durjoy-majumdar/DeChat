package yf0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49207e;
import zf0.C53774e;

/* renamed from: yf0.j */
public class C53518j implements C11385n {

    /* renamed from: d */
    public C46888b f150481d;

    /* renamed from: e */
    public long f150482e = -1;

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C53774e eVar = (C53774e) yVar;
            C49207e eVar2 = eVar.f150924e;
            Log.m105925i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", Integer.valueOf(eVar2.f132598d));
            Log.m105919d("MicroMsg.CloseAALogic", "closeAA, response.msgxml: %s", eVar2.f132600f);
            int i3 = eVar2.f132598d;
            if (i3 == 0) {
                C88643g.m110553k(this.f150481d, Boolean.TRUE);
                if (!Util.isNullOrNil(eVar2.f132600f)) {
                    long j = this.f150482e;
                    if (j > 0 && eVar.f150926g == 3) {
                        C79104i.m95675t(j, eVar2.f132600f);
                    }
                }
                C115669n.INSTANCE.idkeyStat(407, 21, 1, false);
            } else if (i3 <= 0 || Util.isNullOrNil(eVar2.f132599e)) {
                this.f150481d.mo72091a(Boolean.FALSE);
                C115669n.INSTANCE.idkeyStat(407, 23, 1, false);
            } else {
                this.f150481d.mo72091a(eVar2.f132599e);
                C115669n.INSTANCE.idkeyStat(407, 11, 1, false);
            }
        } else {
            this.f150481d.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(407, 22, 1, false);
        }
    }
}
