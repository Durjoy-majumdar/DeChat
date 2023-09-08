package xf0;

import com.tencent.p014mm.autogen.events.CloseAAEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lp3.C88633e;
import lp3.C88643g;
import yf0.C53518j;
import yf0.C53519k;

/* renamed from: xf0.c */
public class C53321c extends IStaticListener<CloseAAEvent> {
    public boolean callback(IEvent iEvent) {
        CloseAAEvent closeAAEvent = (CloseAAEvent) iEvent;
        CloseAAEvent.C40053a aVar = closeAAEvent.f107410d;
        Log.m105925i("CloseAAEventIListener", "closeAAEvent callback, billNo: %s, chatroom: %s", aVar.f107411a, aVar.f107412b);
        if (!Util.isNullOrNil(closeAAEvent.f107410d.f107411a) && !Util.isNullOrNil(closeAAEvent.f107410d.f107412b)) {
            C53519k kVar = new C53519k();
            C53518j jVar = kVar.f150483a;
            jVar.getClass();
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(1530, jVar);
            C53519k.C53520a aVar2 = kVar.f150485c;
            CloseAAEvent.C40053a aVar3 = closeAAEvent.f107410d;
            String str = aVar3.f107411a;
            String str2 = aVar3.f107412b;
            long j = aVar3.f107413c;
            aVar2.getClass();
            ((C88633e) C88643g.m110550h(str, 3, str2, Long.valueOf(j))).mo123061d(aVar2).mo123064p(new C38491b(this, kVar)).mo123065b(new C38490a(this, kVar));
        }
        return false;
    }
}
