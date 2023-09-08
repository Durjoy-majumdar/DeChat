package jq2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.helper.ActionBtnFollowFinderHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: jq2.a */
public class C46567a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ActionBtnFollowFinderHelper f125462d;

    public C46567a(ActionBtnFollowFinderHelper actionBtnFollowFinderHelper) {
        this.f125462d = actionBtnFollowFinderHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$1");
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = this.f125462d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        C77407n nVar = actionBtnFollowFinderHelper.f274161c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (nVar != null) {
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper2 = this.f125462d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C77407n nVar2 = actionBtnFollowFinderHelper2.f274161c;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            if (nVar2.mo107563h()) {
                ActionBtnFollowFinderHelper actionBtnFollowFinderHelper3 = this.f125462d;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                C77407n nVar3 = actionBtnFollowFinderHelper3.f274161c;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                nVar3.mo107572p();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
