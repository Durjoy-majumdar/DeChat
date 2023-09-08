package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.expose.ImproveExposeReportHandle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\rj\b\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemExposeHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Lrx3/b0;", "onViewExposed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "handleList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle */
public final class ImproveTimelineItemExposeHandle extends ImproveTimelineItemBizHandle {
    public static final ImproveTimelineItemExposeHandle INSTANCE = new ImproveTimelineItemExposeHandle();
    private static final ArrayList<ImproveTimelineItemBizHandle> handleList;

    static {
        ArrayList<ImproveTimelineItemBizHandle> arrayList = new ArrayList<>();
        handleList = arrayList;
        arrayList.add(new ImproveTimelineItemBizFinderHandle());
        arrayList.add(new ImproveExposeReportHandle());
        arrayList.add(new ImproveTimelineItemGameShareHandle());
    }

    private ImproveTimelineItemExposeHandle() {
    }

    public void onViewExposed(SnsInfo snsInfo, View view, long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
        SnsInfo snsInfo2 = snsInfo;
        C87412m.m108594g(snsInfo, "info");
        View view2 = view;
        C87412m.m108594g(view, "view");
        for (ImproveTimelineItemBizHandle onViewExposed : handleList) {
            onViewExposed.onViewExposed(snsInfo, view, j, j2, z);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
    }
}
