package p858ng;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;
import p855lg.C61278a;

/* renamed from: ng.n */
public final class C61712n implements C60897k<C61278a> {

    /* renamed from: a */
    public final /* synthetic */ AlbumGalleryUIC f175415a;

    public C61712n(AlbumGalleryUIC albumGalleryUIC) {
        this.f175415a = albumGalleryUIC;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C61278a aVar = (C61278a) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "data");
        this.f175415a.mo76193k3().dispatch(new C61698f(aVar));
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C61278a) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C61278a aVar = (C61278a) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "data");
        this.f175415a.mo76193k3().dispatch(new C61697e(aVar, i, view));
    }
}
