package bu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.cover.SnsImproveCoverLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bu2.a */
public final class C92310a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsImproveCoverLayout f264148d;

    public C92310a(SnsImproveCoverLayout snsImproveCoverLayout) {
        this.f264148d = snsImproveCoverLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$1");
        SnsImproveCoverLayout snsImproveCoverLayout = this.f264148d;
        int i = SnsImproveCoverLayout.f279805g;
        SnsMethodCalculate.markStartTimeMs("access$changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        snsImproveCoverLayout.mo133333b();
        SnsMethodCalculate.markEndTimeMs("access$changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
