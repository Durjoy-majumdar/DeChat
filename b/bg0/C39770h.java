package bg0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import p214om.C11502f;
import te3.C51761w;

/* renamed from: bg0.h */
public class C39770h implements C87581a<Void, C89132b.C89134c<C51761w>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f106727a;

    public C39770h(C67235i iVar, C46888b bVar) {
        this.f106727a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C51761w wVar = (C51761w) cVar.f256796d;
            Log.m105925i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, retcode: %s, retmsg: %s", Integer.valueOf(wVar.f143790d), wVar.f143791e);
            int i = wVar.f143790d;
            if (i == 0) {
                Log.m105924i("MicroMsg.PaylistAAInteractor", "on urgeAAPay success");
                ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
                this.f106727a.mo72093c(Boolean.TRUE);
                C115669n.INSTANCE.idkeyStat(407, 24, 1, false);
                return null;
            }
            if (i <= 0 || Util.isNullOrNil(wVar.f143791e)) {
                this.f106727a.mo72091a(Boolean.FALSE);
            } else {
                this.f106727a.mo72091a(wVar.f143791e);
            }
            C115669n.INSTANCE.idkeyStat(407, 26, 1, false);
            return null;
        }
        this.f106727a.mo72091a(Boolean.FALSE);
        C115669n.INSTANCE.idkeyStat(407, 25, 1, false);
        return null;
    }
}
