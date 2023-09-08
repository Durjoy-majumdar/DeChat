package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveLiteAppHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "()V", "getContentStyle", "", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveLiteAppHandle */
public final class ImproveLiteAppHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveLiteAppHandle INSTANCE = new ImproveLiteAppHandle();

    private ImproveLiteAppHandle() {
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveLiteAppHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveLiteAppHandle");
        return 41;
    }
}
