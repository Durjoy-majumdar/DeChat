package tb1;

import com.tencent.p014mm.autogen.events.FavNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import p823sg.C90196p;
import pb1.C100718j1;
import pb1.C100731p1;
import wb1.C102421x;

/* renamed from: tb1.e */
public class C101743e extends IStaticListener<FavNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        FavNotifyEvent favNotifyEvent = (FavNotifyEvent) iEvent;
        Log.m105926v("MicroMsg.FavNotifyListener", "deal with fav notify");
        if (((C102421x) ((C100718j1) C86312j.m106911c(C100718j1.class)).th0()).f301670g) {
            Log.m105928w("MicroMsg.FavNotifyListener", "sending item, do not do sync");
        } else {
            byte[] bArr = favNotifyEvent.f264824d.f264825a;
            C86709a0.m107524d().mo123460f(new C100731p1(bArr == null ? 1 : C90196p.m112885b(bArr, 0), 4));
        }
        return false;
    }
}
