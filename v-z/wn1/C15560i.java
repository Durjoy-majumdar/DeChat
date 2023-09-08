package wn1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderSearchUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderTabView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: wn1.i */
public final class C15560i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OrderTabView f42160d;

    /* renamed from: e */
    public final /* synthetic */ Activity f42161e;

    public C15560i(OrderTabView orderTabView, Activity activity) {
        this.f42160d = orderTabView;
        this.f42161e = activity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/order/ui/OrderTabView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f42160d.getContext(), FinderLiveOrderSearchUI.class);
        intent.putExtra("ORDER_REPORT_STRUCT", this.f42161e.getIntent().getByteArrayExtra("ORDER_REPORT_STRUCT"));
        Activity activity = this.f42161e;
        FinderLiveOrderUI finderLiveOrderUI = activity instanceof FinderLiveOrderUI ? (FinderLiveOrderUI) activity : null;
        if (finderLiveOrderUI != null) {
            intent.putExtra("FROM_APP_ID", finderLiveOrderUI.f14535u);
        }
        Activity activity2 = this.f42161e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity3 = activity2;
        C117292a.m165358d(activity3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/ui/OrderTabView$initView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity3, "com/tencent/mm/plugin/finder/order/ui/OrderTabView$initView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/OrderTabView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
