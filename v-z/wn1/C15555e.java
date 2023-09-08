package wn1;

import cm1.C0740i2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sx3.C64175a0;
import tn1.C14051a;

/* renamed from: wn1.e */
public final class C15555e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C0740i2> f42154d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<C0740i2> f42155e;

    /* renamed from: f */
    public final /* synthetic */ C14051a f42156f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15555e(WxRecyclerAdapter<C0740i2> wxRecyclerAdapter, ArrayList<C0740i2> arrayList, C14051a aVar) {
        super(0);
        this.f42154d = wxRecyclerAdapter;
        this.f42155e = arrayList;
        this.f42156f = aVar;
    }

    public Object invoke() {
        C64175a0.m75516x(this.f42154d.getData());
        List<C0740i2> data = this.f42154d.getData();
        ArrayList<C0740i2> arrayList = this.f42155e;
        List<C0740i2> subList = arrayList.subList(3, arrayList.size());
        C87412m.m108593f(subList, "dataList.subList(3, dataList.size)");
        data.addAll(subList);
        this.f42156f.f39411s = true;
        this.f42154d.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
