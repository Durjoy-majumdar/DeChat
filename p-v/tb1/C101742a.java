package tb1;

import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: tb1.a */
public class C101742a extends IStaticListener<DeleteFavoriteEvent> {
    public boolean callback(IEvent iEvent) {
        DeleteFavoriteEvent deleteFavoriteEvent = (DeleteFavoriteEvent) iEvent;
        Log.m105925i("MicroMsg.Fav.DelFavoriteItemListener", "do delete favitem, localId %d", Long.valueOf(deleteFavoriteEvent.f264667d.f264669a));
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(deleteFavoriteEvent.f264667d.f264669a);
        int i = deleteFavoriteEvent.f264667d.f264670b;
        deleteFavoriteEvent.f264668e.f264671a = C100734q.m131860m(Yt, true, (Runnable) null, i);
        return false;
    }
}
