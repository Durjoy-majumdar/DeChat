package lm1;

import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: lm1.m */
public final class C10568m extends WxRecyclerAdapter<C0740i2> {
    public C10568m(ArrayList<C0740i2> arrayList, NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(nearbyLiveItemConvertFactory, arrayList, false, 4, (C8480h) null);
    }

    /* renamed from: z6 */
    public void onViewAttachedToWindow(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.onViewAttachedToWindow(oVar);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            int i = oVar.f44859i;
            layoutParams2.f44911i = i == -1 || i == -9 || i == -10 || i == 6 || i == 4 || i == 2022;
        }
    }
}
