package fe3;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import fe3.C58970b;
import gy3.C87412m;

/* renamed from: fe3.d */
public final class C58984d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58970b.C58974d f168768d;

    public C58984d(C58970b.C58974d dVar) {
        this.f168768d = dVar;
    }

    public final void run() {
        C58970b.C58974d dVar = this.f168768d;
        C58970b.C58974d.C58976b bVar = dVar.f168760f;
        if (bVar != null) {
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = dVar.f168759e;
            C87412m.m108591d(galleryItem$VideoMediaItem);
            bVar.mo84212a(dVar, galleryItem$VideoMediaItem.f162766w);
        }
    }
}
