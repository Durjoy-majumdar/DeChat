package p481cs;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93970n;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.plugin.gallery.p473ui.C94057e;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.io.InputStream;
import java.util.ArrayList;
import lw1.C99685b;
import p143ds.C7510m;
import p143ds.C97526j;
import p143ds.C97527l;
import p143ds.C97528n;

@C86522b
/* renamed from: cs.g */
public final class C97364g extends C86301e implements C97528n, C97526j {
    public C7510m Mh0(C7510m.C7512a aVar) {
        C87412m.m108594g(aVar, "config");
        return new C99685b(aVar);
    }

    /* renamed from: Vf */
    public Bitmap mo136634Vf(InputStream inputStream, int i, int i2, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(inputStream, "inputStream");
        return C99685b.f292170e.mo139055a(inputStream, i, i2, z, z2, z3);
    }

    /* renamed from: WA */
    public C97527l mo136635WA() {
        return new C93970n();
    }

    public C97527l Ww0() {
        return C93958f.m118750j();
    }

    /* renamed from: Yq */
    public void mo136637Yq(ArrayList<GalleryItem$MediaItem> arrayList) {
        C93958f.m118755o(arrayList);
    }

    /* renamed from: aK */
    public C94057e mo136638aK(Context context, C94057e.C94058a aVar) {
        return new C94049a(false, context, aVar);
    }

    /* renamed from: hA */
    public ArrayList<GalleryItem$MediaItem> mo136639hA() {
        ArrayList<GalleryItem$MediaItem> k = C93958f.m118751k();
        C87412m.m108593f(k, "getPreviewItems()");
        return k;
    }
}
