package pt2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: pt2.f */
public final class C12007f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f35002d;

    public C12007f(View view) {
        this.f35002d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2");
        View view2 = this.f35002d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
