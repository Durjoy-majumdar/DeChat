package mb2;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import gy3.C87412m;
import mb2.C61461c;

/* renamed from: mb2.f */
public final class C61474f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61461c.C61465d f174802d;

    public C61474f(C61461c.C61465d dVar) {
        this.f174802d = dVar;
    }

    public void run() {
        C61461c.C61465d dVar = this.f174802d;
        C61461c.C61465d.C61468b bVar = dVar.f174794g;
        if (bVar != null) {
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = dVar.f174793f;
            C87412m.m108591d(galleryItem$VideoMediaItem);
            int i = galleryItem$VideoMediaItem.f162766w;
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem2 = this.f174802d.f174793f;
            C87412m.m108591d(galleryItem$VideoMediaItem2);
            bVar.mo86446a(dVar, i, galleryItem$VideoMediaItem2.f162759s);
        }
    }
}
