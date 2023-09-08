package lu2;

import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;

public final /* synthetic */ class a$$a implements C94974y1.C94977c {

    /* renamed from: a */
    public final /* synthetic */ BaseTimeLineItem f292050a;

    public /* synthetic */ a$$a(BaseTimeLineItem baseTimeLineItem) {
        this.f292050a = baseTimeLineItem;
    }

    /* renamed from: a */
    public final void mo131312a(LinkedList linkedList) {
        BaseTimeLineItem baseTimeLineItem = this.f292050a;
        baseTimeLineItem.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$checkUnreadTip$0", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        baseTimeLineItem.f279909j.setVisibility(0);
        baseTimeLineItem.mo133399r(baseTimeLineItem.f279909j, linkedList, 3);
        SnsMethodCalculate.markEndTimeMs("lambda$checkUnreadTip$0", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }
}
