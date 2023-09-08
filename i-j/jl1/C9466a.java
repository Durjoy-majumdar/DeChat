package jl1;

import com.tencent.p014mm.plugin.finder.live.widget.adapters.CustomGiftItemConvertFactory;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: jl1.a */
public final class C9466a extends WxRecyclerAdapter<C9468c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9466a(ArrayList<C9468c> arrayList) {
        super(new CustomGiftItemConvertFactory(), arrayList, false);
        C87412m.m108594g(arrayList, "dataList");
    }
}
