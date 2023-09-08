package lu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public final /* synthetic */ class h$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f32069d;

    public /* synthetic */ h$$b(View view) {
        this.f32069d = view;
    }

    public final void run() {
        View view = this.f32069d;
        SnsMethodCalculate.markStartTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "lambda$fillItem$0", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "lambda$fillItem$0", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }
}
