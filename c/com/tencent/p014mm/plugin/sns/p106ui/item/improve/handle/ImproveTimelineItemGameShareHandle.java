package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import oz1.C77050b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemGameShareHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Lrx3/b0;", "onViewExposed", "", "GAME_SHARE_EXPOSE", "I", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle */
public final class ImproveTimelineItemGameShareHandle extends ImproveTimelineItemBizHandle {
    private final int GAME_SHARE_EXPOSE = 1;

    public void onViewExposed(SnsInfo snsInfo, View view, long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
        C87412m.m108594g(snsInfo, "info");
        C87412m.m108594g(view, "view");
        if (snsInfo.getTimeLine().ContentObj.f298424e == 101 && z) {
            ((C77050b) C86312j.m106911c(C77050b.class)).u10(snsInfo.getTimeLine().f283893Id, snsInfo.getTimeLine().AppInfo.f299236d, snsInfo.getTimeLine().gameShareCardObject.f298869f, snsInfo.getTimeLine().gameShareCardObject.f298868e, this.GAME_SHARE_EXPOSE);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
    }
}
