package hg2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.ReaderAppOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75584h4;
import java.util.ArrayList;

/* renamed from: hg2.h */
public class C76191h extends IStaticListener<ReaderAppOperationEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        ReaderAppOperationEvent readerAppOperationEvent = (ReaderAppOperationEvent) iEvent;
        ReaderAppOperationEvent.C67767a aVar = readerAppOperationEvent.f193863d;
        int i = aVar.f193865a;
        if (i == 3) {
            ReaderAppOperationEvent.C67768b bVar = readerAppOperationEvent.f193864e;
            DoFavoriteEvent doFavoriteEvent = aVar.f193866b;
            int i2 = aVar.f193867c;
            String str = aVar.f193868d;
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav info, newsSvrid is %d, tweetId is %s", Integer.valueOf(i2), str);
            ArrayList arrayList = (ArrayList) C76193l.yx0().mo105929Ow((long) i2, 20);
            if (!arrayList.isEmpty()) {
                Log.m105924i("MicroMsg.Sns.GetFavDataSource", "fav news msgs");
                String nullAs = Util.nullAs(str, "");
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    } else if (nullAs.equals(((C75584h4) arrayList.get(i3)).mo105925g())) {
                        z = C98451e.m127894a(doFavoriteEvent, (C75584h4) arrayList.get(i3), i3);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            z = false;
            bVar.f193870a = z;
        } else if (i == 4) {
            C76193l.yx0().mo105932jo(readerAppOperationEvent.f193863d.f193869e);
        }
        return false;
    }
}
