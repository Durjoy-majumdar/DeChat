package kb2;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p143ds.C58433i;
import sx3.C110818d0;

/* renamed from: kb2.k */
public final class C60997k extends C60896i<C60995i> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bjb;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        FinderObject finderObject;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C60905o oVar2 = oVar;
        int i3 = i2;
        C60995i iVar = (C60995i) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(iVar, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.ca_);
        String str = null;
        if (i3 == 1) {
            C58433i iVar2 = (C58433i) C86312j.m106911c(C58433i.class);
            C87412m.m108593f(imageView, "thumbIV");
            GalleryItem$MediaItem galleryItem$MediaItem = iVar.f173717j;
            int type = galleryItem$MediaItem != null ? galleryItem$MediaItem.getType() : 0;
            GalleryItem$MediaItem galleryItem$MediaItem2 = iVar.f173717j;
            String e = galleryItem$MediaItem2 != null ? galleryItem$MediaItem2.mo80159e() : null;
            String str2 = "";
            if (e == null) {
                e = str2;
            }
            GalleryItem$MediaItem galleryItem$MediaItem3 = iVar.f173717j;
            if (galleryItem$MediaItem3 != null) {
                str = galleryItem$MediaItem3.f162747d;
            }
            if (str != null) {
                str2 = str;
            }
            iVar2.Eo0(imageView, type, e, str2, galleryItem$MediaItem3 != null ? galleryItem$MediaItem3.f162751h : 0, galleryItem$MediaItem3 != null ? galleryItem$MediaItem3.f162752i : 0);
            textView.setVisibility(8);
        } else if (i3 == 2) {
            C56791j jVar = (C56791j) C86312j.m106911c(C56791j.class);
            GalleryItem$MediaItem galleryItem$MediaItem4 = iVar.f173717j;
            String e2 = galleryItem$MediaItem4 != null ? galleryItem$MediaItem4.mo80159e() : null;
            GalleryItem$MediaItem galleryItem$MediaItem5 = iVar.f173717j;
            if (galleryItem$MediaItem5 != null) {
                str = galleryItem$MediaItem5.f162747d;
            }
            Bitmap dV = jVar.mo80181dV(e2, str, galleryItem$MediaItem5 != null ? galleryItem$MediaItem5.f162751h : 0, galleryItem$MediaItem5 != null ? galleryItem$MediaItem5.f162752i : 0);
            if (dV == null || dV.isRecycled()) {
                imageView.setImageResource(C0966R.C0969drawable.c_d);
            } else {
                imageView.setImageBitmap(dV);
            }
            GalleryItem$MediaItem galleryItem$MediaItem6 = iVar.f173717j;
            if (galleryItem$MediaItem6 instanceof GalleryItem$VideoMediaItem) {
                C87412m.m108592e(galleryItem$MediaItem6, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                textView.setText(mo85969j(((GalleryItem$VideoMediaItem) galleryItem$MediaItem6).f162766w / 1000));
                textView.setVisibility(0);
            }
        } else if (!(i3 != 3 || (finderObject = iVar.f173713f.f183798f) == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59347c = true;
            bVar.f59359o = C0966R.C0969drawable.c_d;
            C20828a.m22825b().mo32519h(finderMedia.thumbUrl + finderMedia.thumb_url_token, imageView, bVar.mo32666a());
            textView.setText(mo85969j(finderMedia.videoDuration));
            textView.setVisibility(0);
        }
        if (iVar.f173716i) {
            View D = oVar2.mo85812D(C0966R.C0970id.j9d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.j9d);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(D2, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final String mo85969j(int i) {
        String valueOf = String.valueOf(i % 60);
        if (valueOf.length() < 2) {
            valueOf = '0' + valueOf;
        }
        return (i / 60) + XVFSFile.PATH_SEPARATOR_CHAR + valueOf;
    }
}
