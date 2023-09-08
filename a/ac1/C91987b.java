package ac1;

import bc1.C92240b;
import cc1.C92413a;
import com.tencent.p014mm.autogen.events.FavDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import yb1.C38987b;

/* renamed from: ac1.b */
public class C91987b extends IStaticListener<FavDeleteEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        FavDeleteEvent favDeleteEvent = (FavDeleteEvent) iEvent;
        if (favDeleteEvent != null) {
            String str = favDeleteEvent.f264807d.f264808a;
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline url is null!");
            } else {
                C92413a Lo = ((C38987b) C86312j.m106911c(C38987b.class)).wx0().mo126415Lo(str);
                if (Lo == null) {
                    Log.m105924i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline favOffline is null!");
                } else {
                    z = C92240b.m115964c(str, Lo.field_path, Lo.field_imgDirPath);
                    Log.m105925i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", favDeleteEvent.f264807d.f264808a, Boolean.valueOf(z));
                }
            }
            z = false;
            Log.m105925i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", favDeleteEvent.f264807d.f264808a, Boolean.valueOf(z));
        }
        return false;
    }
}
