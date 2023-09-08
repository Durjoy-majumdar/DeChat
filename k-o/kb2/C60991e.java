package kb2;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import n03.C61598b;
import wx3.C15601d;

/* renamed from: kb2.e */
public final class C60991e extends C60896i<C60995i> {

    /* renamed from: e */
    public final C61598b f173702e;

    public C60991e(C61598b bVar) {
        C87412m.m108594g(bVar, "videoLayoutRecycler");
        this.f173702e = bVar;
    }

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
        C56791j jVar = (C56791j) C86312j.m106911c(C56791j.class);
        GalleryItem$MediaItem galleryItem$MediaItem = iVar.f173717j;
        String e = galleryItem$MediaItem != null ? galleryItem$MediaItem.mo80159e() : null;
        GalleryItem$MediaItem galleryItem$MediaItem2 = iVar.f173717j;
        String str = galleryItem$MediaItem2 != null ? galleryItem$MediaItem2.f162747d : null;
        long j = 0;
        long j2 = galleryItem$MediaItem2 != null ? galleryItem$MediaItem2.f162751h : 0;
        if (galleryItem$MediaItem2 != null) {
            j = galleryItem$MediaItem2.f162752i;
        }
        Bitmap dV = jVar.mo80181dV(e, str, j2, j);
        if (dV == null || dV.isRecycled()) {
            imageView.setImageResource(C0966R.C0969drawable.c_d);
        } else {
            imageView.setImageBitmap(dV);
        }
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.f359485l50);
        frameLayout.setVisibility(0);
        View D = oVar.mo85812D(C0966R.C0970id.hwy);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        GalleryItem$MediaItem galleryItem$MediaItem3 = iVar.f173717j;
        GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = galleryItem$MediaItem3 instanceof GalleryItem$VideoMediaItem ? (GalleryItem$VideoMediaItem) galleryItem$MediaItem3 : null;
        if (galleryItem$VideoMediaItem != null && (galleryItem$VideoMediaItem.f162768y == -1 || galleryItem$VideoMediaItem.f162767x == -1)) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C60989d(galleryItem$VideoMediaItem, C9577b.f29815d, (C15601d<? super C60989d>) null), 2, (Object) null);
        }
        D.setOnClickListener(new C60988c(this, frameLayout, iVar, D));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
