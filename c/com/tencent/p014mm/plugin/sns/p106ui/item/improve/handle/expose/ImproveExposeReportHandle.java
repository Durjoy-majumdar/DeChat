package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.expose;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.ImproveTimelineItemBizHandle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C101833r5;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/expose/ImproveExposeReportHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Lrx3/b0;", "onViewExposed", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle */
public final class ImproveExposeReportHandle extends ImproveTimelineItemBizHandle {
    public void onViewExposed(SnsInfo snsInfo, View view, long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle");
        C87412m.m108594g(snsInfo, "info");
        C87412m.m108594g(view, "view");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C87412m.m108593f(timeLine, "info.timeLine");
        boolean isWsFold = snsInfo.isWsFold();
        if (z) {
            SnsReportHelper.f275506m0.mo131384q(timeLine.f283893Id, isWsFold);
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            String str = timeLine.f283893Id;
            C101833r5 r5Var = timeLine.AppInfo;
            String str2 = r5Var != null ? r5Var.f299236d : null;
            if (str2 == null) {
                str2 = "";
            }
            snsReportHelper.mo131385r(str, str2);
            SnsReportHelper.f275506m0.mo131386s(snsInfo.field_snsId);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle");
    }
}
