package p228rp;

import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;
import di3.C86301e;
import ei3.C86522b;
import java.util.concurrent.CopyOnWriteArraySet;
import p237sp.C36768q;

@C86522b
/* renamed from: rp.e */
public class C36404e extends C86301e implements C36768q {
    public void A20(C36768q.C36770b bVar) {
        if (bVar != null) {
            ((CopyOnWriteArraySet) DownloadEventBus.f110054g).add(bVar);
        } else {
            DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        }
    }

    public void Cf0(C36768q.C36770b bVar) {
        if (bVar != null) {
            ((CopyOnWriteArraySet) DownloadEventBus.f110054g).remove(bVar);
        } else {
            DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        }
    }
}
