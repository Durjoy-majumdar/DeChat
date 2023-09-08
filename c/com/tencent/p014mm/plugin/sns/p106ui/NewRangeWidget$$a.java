package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewRangeWidget$$a */
public final /* synthetic */ class NewRangeWidget$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewRangeWidget f277008d;

    public /* synthetic */ NewRangeWidget$$a(NewRangeWidget newRangeWidget) {
        this.f277008d = newRangeWidget;
    }

    public final void onClick(View view) {
        NewRangeWidget newRangeWidget = this.f277008d;
        String str = NewRangeWidget.f276989z;
        newRangeWidget.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", newRangeWidget, array);
        SnsMethodCalculate.markStartTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        Log.m105924i("MicroMsg.NewRangeWidget", "click to jump to SnsLabelUI");
        Activity activity = newRangeWidget.f276990e;
        int i = NewSnsLabelUI.f277103K;
        SnsMethodCalculate.markStartTimeMs("getJumpIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        Log.m105924i("MicroMsg.NewSnsLabelUI", "getJumpIntent");
        Intent intent = new Intent(activity, NewSnsLabelUI.class);
        SnsReportHelper.f275506m0.mo131344E().f266364D = 1;
        SnsReportHelper.f275506m0.mo131344E().f266365E = 0;
        SnsMethodCalculate.markEndTimeMs("getJumpIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        intent.putStringArrayListExtra("label_id", newRangeWidget.f277004v);
        intent.putExtra("KLabel_range_index", newRangeWidget.f276999q);
        intent.putExtra("Klabel_name_list", newRangeWidget.f277001s);
        intent.putExtra("Kother_user_name_list", newRangeWidget.f277002t);
        intent.putExtra("Kchat_room_name_list", newRangeWidget.f277003u);
        intent.putExtra("k_sns_label_ui_style", 0);
        intent.putExtra("Kis_with_together", newRangeWidget.f276688d);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
        Activity activity2 = newRangeWidget.f276990e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(5);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/NewRangeWidget", "lambda$init$0", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
        if (timelineGroupUserBehaviorStruct != null) {
            int i2 = timelineGroupUserBehaviorStruct.f266376e;
            if (i2 <= 0) {
                timelineGroupUserBehaviorStruct.f266376e = 1;
            } else {
                timelineGroupUserBehaviorStruct.f266376e = i2 + 1;
            }
        }
        SnsMethodCalculate.markEndTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        C117292a.m165361g(newRangeWidget, "com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
