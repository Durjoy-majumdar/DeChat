package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WechatWorkSnsStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C52988j;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.i0 */
public class C96034i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280442d;

    public C96034i0(TimelineClickListener timelineClickListener) {
        this.f280442d = timelineClickListener;
    }

    public void onClick(View view) {
        SnsInfo DN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
        this.f280442d.mo132100u(view);
        if (!(view.getTag() == null || !(view.getTag() instanceof C52988j) || (DN = C94866e1.Yx0().mo139798DN(((C52988j) view.getTag()).f147902b)) == null)) {
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            String userName = DN.getUserName();
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            WechatWorkSnsStruct wechatWorkSnsStruct = new WechatWorkSnsStruct();
            wechatWorkSnsStruct.f266564f = wechatWorkSnsStruct.mo86045b("OpenimUsername", userName, true);
            wechatWorkSnsStruct.f266562d = 1;
            wechatWorkSnsStruct.f266563e = 1;
            wechatWorkSnsStruct.mo86054n();
            SnsMethodCalculate.markEndTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            C94877g0 g0Var = new C94877g0(DN.field_snsId, 9);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(g0Var);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
