package kb2;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p143ds.C58433i;

/* renamed from: kb2.a */
public final class C60987a extends C60896i<C60995i> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bip;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60995i iVar = (C60995i) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.kk6);
        C58433i iVar2 = (C58433i) C86312j.m106911c(C58433i.class);
        C87412m.m108593f(imageView, "thumbIV");
        GalleryItem$MediaItem galleryItem$MediaItem = iVar.f173717j;
        int type = galleryItem$MediaItem != null ? galleryItem$MediaItem.getType() : 0;
        GalleryItem$MediaItem galleryItem$MediaItem2 = iVar.f173717j;
        String str = null;
        String e = galleryItem$MediaItem2 != null ? galleryItem$MediaItem2.mo80159e() : null;
        String str2 = e == null ? "" : e;
        GalleryItem$MediaItem galleryItem$MediaItem3 = iVar.f173717j;
        if (galleryItem$MediaItem3 != null) {
            str = galleryItem$MediaItem3.f162747d;
        }
        iVar2.Eo0(imageView, type, str2, str == null ? "" : str, galleryItem$MediaItem3 != null ? galleryItem$MediaItem3.f162751h : 0, galleryItem$MediaItem3 != null ? galleryItem$MediaItem3.f162752i : 0);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
