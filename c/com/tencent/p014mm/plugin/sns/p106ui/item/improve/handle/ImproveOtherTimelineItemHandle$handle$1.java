package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$1 */
public final class ImproveOtherTimelineItemHandle$handle$1 implements View.OnClickListener {
    public final /* synthetic */ SnsInfo $snsInfo;
    private byte _hellAccFlag_;
    public final /* synthetic */ ImproveOtherTimelineItemHandle this$0;

    public ImproveOtherTimelineItemHandle$handle$1(ImproveOtherTimelineItemHandle improveOtherTimelineItemHandle, SnsInfo snsInfo) {
        this.this$0 = improveOtherTimelineItemHandle;
        this.$snsInfo = snsInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$1");
        ImproveOtherTimelineItemHandle improveOtherTimelineItemHandle = this.this$0;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        improveOtherTimelineItemHandle.postClickEvent(view, this.$snsInfo);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
