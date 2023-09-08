package kb2;

import android.os.Parcelable;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import gy3.C87412m;
import o40.C61926c;
import pe3.C89349b;
import te3.C64470jh3;
import zb2.C66777a;

/* renamed from: kb2.i */
public final class C60995i extends C66777a<C60995i> {

    /* renamed from: d */
    public final String f173711d;

    /* renamed from: e */
    public int f173712e;

    /* renamed from: f */
    public final C64470jh3 f173713f;

    /* renamed from: g */
    public final String f173714g;

    /* renamed from: h */
    public boolean f173715h;

    /* renamed from: i */
    public boolean f173716i;

    /* renamed from: j */
    public GalleryItem$MediaItem f173717j;

    public C60995i(String str, int i, C64470jh3 jh32, String str2) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(jh32, "previewItem");
        C87412m.m108594g(str2, "listId");
        this.f173711d = str;
        this.f173712e = i;
        this.f173713f = jh32;
        this.f173714g = str2;
        C89349b bVar = jh32.f183799g;
        if (bVar != null) {
            byte[] f = bVar.mo123703f();
            int i2 = jh32.f183797e;
            if (i2 == 1) {
                Parcelable.Creator creator = GalleryItem$ImageMediaItem.CREATOR;
                C87412m.m108593f(creator, "CREATOR");
                this.f173717j = (GalleryItem$MediaItem) C61926c.m72670O(f, creator);
            } else if (i2 == 2) {
                Parcelable.Creator creator2 = GalleryItem$VideoMediaItem.CREATOR;
                C87412m.m108593f(creator2, "CREATOR");
                this.f173717j = (GalleryItem$MediaItem) C61926c.m72670O(f, creator2);
            }
        }
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f173714g + '-' + this.f173711d;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f173713f.f183797e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C60995i) obj, "other");
        int i = this.f173712e;
        return C87412m.m108596i(i, i);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C60995i iVar = (C60995i) obj;
        C87412m.m108594g(iVar, "other");
        return C87412m.m108589b(this.f173711d, iVar.f173711d) && C87412m.m108589b(this.f173713f, iVar.f173713f) && C87412m.m108589b(this.f173714g, iVar.f173714g) && this.f173716i == iVar.f173716i;
    }
}
