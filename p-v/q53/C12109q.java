package q53;

import android.view.View;
import android.widget.AdapterView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.e35;

/* renamed from: q53.q */
public final class C12109q implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35202d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<e35> f35203e;

    public C12109q(C12041a aVar, ArrayList<e35> arrayList) {
        this.f35202d = aVar;
        this.f35203e = arrayList;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C12041a aVar = this.f35202d;
        e35 e35 = this.f35203e.get(i);
        C87412m.m108593f(e35, "firstMenuArray[position]");
        C12041a.m11742d(aVar, e35);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
