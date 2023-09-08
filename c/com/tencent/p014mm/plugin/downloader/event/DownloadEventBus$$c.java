package com.tencent.p014mm.plugin.downloader.event;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p237sp.C36768q;

/* renamed from: com.tencent.mm.plugin.downloader.event.DownloadEventBus$$c */
public class DownloadEventBus$$c implements C80883e<Bundle, Bundle> {
    private DownloadEventBus$$c() {
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Iterator it = ((CopyOnWriteArraySet) DownloadEventBus.f110054g).iterator();
        while (it.hasNext()) {
            ((C36768q.C36770b) it.next()).mo25139a(bundle);
        }
    }
}
