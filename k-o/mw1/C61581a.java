package mw1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93970n;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import java.util.LinkedList;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: mw1.a */
public final class C61581a {

    /* renamed from: a */
    public static final C61581a f175152a = new C61581a();

    /* renamed from: b */
    public static C93970n f175153b;

    /* renamed from: c */
    public static C61583b f175154c = new C61583b();

    /* renamed from: d */
    public static C61582a f175155d = new C61582a();

    /* renamed from: e */
    public static GalleryItem$AlbumItem f175156e;

    /* renamed from: f */
    public static String f175157f;

    /* renamed from: g */
    public static String f175158g;

    /* renamed from: mw1.a$a */
    public static final class C61582a implements C93964k.C93965a {

        /* renamed from: d */
        public long f175159d = System.currentTimeMillis();

        /* renamed from: e */
        public C32227p<? super LinkedList<GalleryItem$AlbumItem>, ? super Long, C13598b0> f175160e;

        /* renamed from: z7 */
        public void mo86519z7(LinkedList<GalleryItem$AlbumItem> linkedList) {
            C87412m.m108594g(linkedList, "albumItems");
            long currentTimeMillis = System.currentTimeMillis() - this.f175159d;
            String str = C61581a.f175157f;
            int i = 0;
            for (GalleryItem$AlbumItem galleryItem$AlbumItem : linkedList) {
                i += galleryItem$AlbumItem.f271098f;
            }
            GalleryItem$AlbumItem galleryItem$AlbumItem2 = new GalleryItem$AlbumItem(str, i);
            GalleryItem$AlbumItem galleryItem$AlbumItem3 = (GalleryItem$AlbumItem) C110818d0.m150916N(linkedList);
            galleryItem$AlbumItem2.f271101i = galleryItem$AlbumItem3 != null ? galleryItem$AlbumItem3.f271101i : null;
            linkedList.add(0, galleryItem$AlbumItem2);
            C32227p<? super LinkedList<GalleryItem$AlbumItem>, ? super Long, C13598b0> pVar = this.f175160e;
            if (pVar != null) {
                pVar.invoke(linkedList, Long.valueOf(currentTimeMillis));
            }
        }
    }

    /* renamed from: mw1.a$b */
    public static final class C61583b implements C93964k.C93967c {

        /* renamed from: d */
        public long f175161d = System.currentTimeMillis();

        /* renamed from: e */
        public C32228q<? super Boolean, ? super LinkedList<GalleryItem$MediaItem>, ? super Long, C13598b0> f175162e;

        /* renamed from: B3 */
        public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f175161d;
            long j3 = currentTimeMillis - j2;
            C13598b0 b0Var = null;
            if (!(j2 == j)) {
                linkedList = null;
            }
            if (linkedList != null) {
                C32228q<? super Boolean, ? super LinkedList<GalleryItem$MediaItem>, ? super Long, C13598b0> qVar = this.f175162e;
                if (qVar != null) {
                    qVar.invoke(Boolean.TRUE, linkedList, Long.valueOf(j3));
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var != null) {
                    return;
                }
            }
            C32228q<? super Boolean, ? super LinkedList<GalleryItem$MediaItem>, ? super Long, C13598b0> qVar2 = this.f175162e;
            if (qVar2 != null) {
                qVar2.invoke(Boolean.FALSE, new LinkedList(), Long.valueOf(j3));
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    static {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f4z);
        C87412m.m108593f(string, "getContext().resources.g…allery_all_pic_and_video)");
        f175157f = string;
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.f360829f50);
        C87412m.m108593f(string2, "getContext().getString(R.string.gallery_all_video)");
        f175158g = string2;
    }
}
