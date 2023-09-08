package ub2;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59826g;
import hb2.C59828h;
import rx3.C13598b0;

/* renamed from: ub2.r */
public final class C65310r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f187979d;

    /* renamed from: e */
    public final /* synthetic */ MusicMVCardChooseView f187980e;

    /* renamed from: f */
    public final /* synthetic */ GalleryItem$MediaItem f187981f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65310r(View view, MusicMVCardChooseView musicMVCardChooseView, GalleryItem$MediaItem galleryItem$MediaItem) {
        super(0);
        this.f187979d = view;
        this.f187980e = musicMVCardChooseView;
        this.f187981f = galleryItem$MediaItem;
    }

    public Object invoke() {
        View view = this.f187979d;
        C59826g gVar = null;
        if (view != null) {
            try {
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.gqq);
                C87412m.m108593f(imageView, "thumbIv");
                gVar = C59828h.m69722a(imageView);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Mv.MusicMVCardChooseView", "generate animation info fail:" + e.getLocalizedMessage());
            }
        }
        MvCreateReportHelper.f163007c = 2;
        MusicMVCardChooseView.C57080a aVar = this.f187980e.f163463G;
        if (aVar != null) {
            aVar.mo80360G4(this.f187981f, gVar);
        }
        return C13598b0.f38549a;
    }
}
