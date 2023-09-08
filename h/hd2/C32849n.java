package hd2;

import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import id2.C76312r;
import ie3.C76324c;
import kd2.C76559f;

/* renamed from: hd2.n */
public class C32849n extends IStaticListener<OfflineUpdateCardListEvent> {
    public boolean callback(IEvent iEvent) {
        OfflineUpdateCardListEvent offlineUpdateCardListEvent = (OfflineUpdateCardListEvent) iEvent;
        Log.m105925i("UpdateCardListEventIListener", "update card list: %s", Integer.valueOf(offlineUpdateCardListEvent.f78882d.f78883a));
        if (C76559f.m92115k()) {
            if (offlineUpdateCardListEvent.f78882d.f78883a != 2 || !C76559f.m92113i()) {
                C86709a0.m107524d().mo123460f(new C76312r(13, (String) null, 8, 0, ""));
            } else {
                Log.m105924i("UpdateCardListEventIListener", "unbind card, offline kinda enable, check ifneed userbindquery in kinda");
                ((C76324c) C86312j.m106911c(C76324c.class)).checkIfNeedRequestUserBindqueryWhenUnBindCard(offlineUpdateCardListEvent.f78882d.f78884b);
                return true;
            }
        }
        return false;
    }
}
