package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import l31.C99333f;
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveObjectMusicHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Landroid/view/View;", "layout", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lrx3/b0;", "postClickEvent", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle */
public final class ImproveObjectMusicHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveObjectMusicHandle INSTANCE = new ImproveObjectMusicHandle();

    private ImproveObjectMusicHandle() {
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle");
        return 4;
    }

    public void postClickEvent(View view, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle");
        C87412m.m108594g(view, "layout");
        C87412m.m108594g(snsInfo, "snsInfo");
        super.postClickEvent(view, snsInfo);
        String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
        C87412m.m108593f(q0, "longToString(snsInfo.field_snsId)");
        ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "ClickMusicFeedCount", q0);
        SnsMethodCalculate.markEndTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle");
    }
}
