package rd2;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderDetailInfoUI;
import j20.C117292a;
import java.util.ArrayList;
import td2.C13874c;

/* renamed from: rd2.e */
public class C77514e implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallOrderDetailInfoUI f226015d;

    public C77514e(MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f226015d = mallOrderDetailInfoUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        MallOrderDetailObject.C70045a aVar = (MallOrderDetailObject.C70045a) ((ArrayList) this.f226015d.f202179e).get(i);
        if (!TextUtils.isEmpty(aVar.f202086c)) {
            C13874c.m13187c(this.f226015d, aVar.f202086c);
        }
        MallOrderDetailInfoUI.m82536H7(this.f226015d, aVar.f202084a);
        C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
