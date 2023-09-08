package p858ng;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC;
import com.tencent.p014mm.p136ui.base.DragDownContainer;
import p278yh.C66642a;

/* renamed from: ng.m */
public final class C61711m implements DragDownContainer.C106642a {

    /* renamed from: a */
    public final /* synthetic */ AlbumGalleryUIC f175414a;

    public C61711m(AlbumGalleryUIC albumGalleryUIC) {
        this.f175414a = albumGalleryUIC;
    }

    /* renamed from: a */
    public void mo86630a() {
        this.f175414a.mo76196n3();
    }

    /* renamed from: b */
    public void mo86631b(float f) {
        C66642a j3 = this.f175414a.mo76192j3();
        if (j3.f191623e == null) {
            j3.f191623e = (ImageView) j3.f191619a.findViewById(C0966R.C0970id.ehi);
        }
        j3.f191623e.setAlpha(f);
    }

    /* renamed from: c */
    public void mo86632c() {
        this.f175414a.mo76194l3();
    }
}
