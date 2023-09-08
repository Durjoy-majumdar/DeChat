package na0;

import android.content.ContentUris;
import android.provider.MediaStore;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: na0.e */
public final class C100108e extends C87413o implements C32226l<GalleryItem$MediaItem, CharSequence> {

    /* renamed from: d */
    public static final C100108e f293259d = new C100108e();

    public C100108e() {
        super(1);
    }

    public Object invoke(Object obj) {
        GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) obj;
        String uri = (galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, galleryItem$MediaItem.f162751h) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, galleryItem$MediaItem.f162751h)).toString();
        C87412m.m108593f(uri, "if (it is GalleryItem.Vi…             }.toString()");
        return uri;
    }
}
