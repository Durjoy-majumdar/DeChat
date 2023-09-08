package ut2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ut2.o */
public final class C102100o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImproveMainUIC f300654d;

    public C102100o(ImproveMainUIC improveMainUIC) {
        this.f300654d = improveMainUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupAppBarDoubleClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$setupAppBarDoubleClick$1");
        long currentTimeMillis = System.currentTimeMillis();
        ImproveMainUIC improveMainUIC = this.f300654d;
        SnsMethodCalculate.markStartTimeMs("access$getLastClickTimeStamp$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        long j = improveMainUIC.f279678i;
        SnsMethodCalculate.markEndTimeMs("access$getLastClickTimeStamp$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        if (currentTimeMillis - j <= 300) {
            this.f300654d.getAppBarLayout().setExpanded(true);
            WxRecyclerView recycleView = this.f300654d.getRecycleView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            WxRecyclerView wxRecyclerView = recycleView;
            C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupAppBarDoubleClick$1", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            recycleView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupAppBarDoubleClick$1", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            this.f300654d.getOverScrollView().mo133377a();
        }
        ImproveMainUIC improveMainUIC2 = this.f300654d;
        long currentTimeMillis2 = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("access$setLastClickTimeStamp$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        improveMainUIC2.f279678i = currentTimeMillis2;
        SnsMethodCalculate.markEndTimeMs("access$setLastClickTimeStamp$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$setupAppBarDoubleClick$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupAppBarDoubleClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
