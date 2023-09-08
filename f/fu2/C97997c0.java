package fu2;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WechatWorkSnsStruct;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.C43162z1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import f40.C86709a0;
import gu2.C98214b;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C52988j;

/* renamed from: fu2.c0 */
public final class C97997c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45808b0 f287400d;

    public C97997c0(C45808b0 b0Var) {
        this.f287400d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
        C45808b0 b0Var = this.f287400d;
        SnsMethodCalculate.markStartTimeMs("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        C43162z1 n = b0Var.mo71270n();
        SnsMethodCalculate.markEndTimeMs("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        n.mo67390c();
        if (view.getTag() != null && (view.getTag() instanceof C52988j)) {
            C98214b c = this.f287400d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            String userName = c.getUserName();
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            WechatWorkSnsStruct wechatWorkSnsStruct = new WechatWorkSnsStruct();
            wechatWorkSnsStruct.f266564f = wechatWorkSnsStruct.mo86045b("OpenimUsername", userName, true);
            wechatWorkSnsStruct.f266562d = 1;
            wechatWorkSnsStruct.f266563e = 1;
            wechatWorkSnsStruct.mo86054n();
            SnsMethodCalculate.markEndTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            C86709a0.m107529k().f251779b.mo123460f(new C94877g0(c.mo142401p2(), 9));
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
