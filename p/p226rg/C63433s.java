package p226rg;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p861pg.C62279a;

/* renamed from: rg.s */
public final class C63433s extends C60896i<C62279a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cz9;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C62279a) cVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        layoutParams.height = AlbumPreviewUIC.f154706n;
        oVar.f44854d.setLayoutParams(layoutParams);
    }
}
