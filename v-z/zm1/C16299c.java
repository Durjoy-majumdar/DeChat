package zm1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: zm1.c */
public final class C16299c extends WxRecyclerAdapter<C0740i2> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16299c(HeadLivingItemConvertFactory headLivingItemConvertFactory, ArrayList<C0740i2> arrayList) {
        super(headLivingItemConvertFactory, arrayList, false);
        C87412m.m108594g(headLivingItemConvertFactory, "itemConvertFactory");
        C87412m.m108594g(arrayList, "data");
    }
}
