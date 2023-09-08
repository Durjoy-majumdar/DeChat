package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveProductHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "()V", "checkClickValid", "", "snsInfo", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "getContentStyle", "", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle */
public final class ImproveProductHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveProductHandle INSTANCE = new ImproveProductHandle();

    private ImproveProductHandle() {
    }

    public boolean checkClickValid(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        boolean checkMediaValid = checkMediaValid(snsInfo);
        SnsMethodCalculate.markEndTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle");
        return checkMediaValid;
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle");
        return 9;
    }
}
