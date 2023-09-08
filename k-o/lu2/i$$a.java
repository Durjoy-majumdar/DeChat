package lu2;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95953r;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import os2.C100417r0;
import yn2.C102882s0;

public final /* synthetic */ class i$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95953r f292055d;

    public /* synthetic */ i$$a(C95953r rVar) {
        this.f292055d = rVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        C95953r rVar = this.f292055d;
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", rVar, array);
        SnsMethodCalculate.markStartTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        Log.m105924i("MicroMsg.VideoTimeLineItem", "VideoTimeLineItem click to post finder");
        SnsInfo snsInfo = rVar.f280179s;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            C117292a.m165361g(rVar, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        TimeLineObject timeLine = snsInfo.getTimeLine();
        String str = timeLine.ContentDesc;
        String j = C100417r0.m131421j("sns_table_", (long) rVar.f280179s.localid);
        C102882s0 s0Var = C102882s0.f303681a;
        MMActivity mMActivity = rVar.f279906g.f278575i;
        SnsInfo snsInfo2 = rVar.f280179s;
        String str2 = "(Landroid/view/View;)V";
        String str3 = "onClick";
        if (s0Var.mo142596h(mMActivity, j, str, snsInfo2.field_snsId, (long) snsInfo2.localid, timeLine.videoTemplate, false)) {
            view2.post(new C10654j(rVar, view2));
        }
        SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        C117292a.m165361g(rVar, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", str3, str2);
    }
}
