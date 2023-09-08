package ow1;

import com.tencent.p014mm.plugin.gallery.model.C93946b;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ow1.h */
public class C100569h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f294653d;

    /* renamed from: e */
    public final /* synthetic */ C100571i f294654e;

    /* renamed from: ow1.h$a */
    public class C100570a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f294655d;

        /* renamed from: e */
        public final /* synthetic */ int f294656e;

        public C100570a(int i, int i2) {
            this.f294655d = i;
            this.f294656e = i2;
        }

        public void run() {
            C93964k kVar;
            GalleryItem$AlbumItem galleryItem$AlbumItem = (GalleryItem$AlbumItem) C100569h.this.f294653d.get();
            if (galleryItem$AlbumItem != null && (kVar = C93958f.m118750j().f271195e) != null && !((C93946b) kVar).f271112g && galleryItem$AlbumItem.f271104o) {
                galleryItem$AlbumItem.f271098f = this.f294655d;
                galleryItem$AlbumItem.f271100h = this.f294656e;
                galleryItem$AlbumItem.f271104o = false;
                C100569h.this.f294654e.notifyDataSetChanged();
            }
        }
    }

    public C100569h(C100571i iVar, AtomicReference atomicReference) {
        this.f294654e = iVar;
        this.f294653d = atomicReference;
    }

    public void run() {
        GalleryItem$AlbumItem galleryItem$AlbumItem = (GalleryItem$AlbumItem) this.f294653d.get();
        if (galleryItem$AlbumItem != null) {
            C93964k kVar = C93958f.m118750j().f271195e;
            if (galleryItem$AlbumItem.f271104o && kVar != null && !((C93946b) kVar).f271112g) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = galleryItem$AlbumItem.f271100h;
                    C93958f.m118753m().mo128895c(new C100570a(galleryItem$AlbumItem.f271098f, i));
                    Log.m105918d("MicroMsg.GalleryAdapter", "costTime = " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.GalleryAdapter", th, "counting album size fail", new Object[0]);
                }
            }
        }
    }
}
