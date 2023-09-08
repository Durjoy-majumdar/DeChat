package x52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import eb0.C97625j3;
import ob0.C35136m;
import sf0.C48374j0;
import w52.C38023l;
import w52.C53078f;

/* renamed from: x52.e */
public class C38453e implements C86497v5.C31520a {
    /* renamed from: Y */
    public void mo58212Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105924i("MicroMsg.MassSendSysCmdMsgListener", "MassSendTopConfXml:" + g);
        C38023l.xx0().mo73769c(g);
        C38023l.xx0().mo73767a();
        C53078f xx02 = C38023l.xx0();
        long nowMilliSecond = Util.nowMilliSecond();
        xx02.getClass();
        C97625j3.m125812b().mo105906u().mo119676J(102409, Long.valueOf(nowMilliSecond));
    }
}
