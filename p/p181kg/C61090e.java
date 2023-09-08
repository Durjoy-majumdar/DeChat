package p181kg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: kg.e */
public final class C61090e extends C60896i<C61089d> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a9m;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C61089d) cVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        RecyclerView.C16613e eVar = oVar.f173500B;
        C87412m.m108592e(eVar, "null cannot be cast to non-null type com.tencent.mm.album.ui.c2c.gallery.AlbumGalleryAdapter");
        layoutParams.height = ((C55068a) eVar).f154629K;
        oVar.f44854d.setLayoutParams(layoutParams);
        oVar.f44854d.setClickable(true);
    }
}
