package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import vr2.C102236a0;
import z31.C102972b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveObjectFeedHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "Lrx3/b0;", "bizUrlClick", "outsideUrlClick", "", "getContentStyle", "Landroid/view/View;", "layout", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "postClickEvent", "", "id", "Ljava/lang/String;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle */
public final class ImproveObjectFeedHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveObjectFeedHandle INSTANCE = new ImproveObjectFeedHandle();

    /* renamed from: id */
    private static String f280081id = "";

    private ImproveObjectFeedHandle() {
    }

    private final void bizUrlClick() {
        SnsMethodCalculate.markStartTimeMs("bizUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        SnsMethodCalculate.markEndTimeMs("bizUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142713g(12076, "ClickBrandUrlFeedCount", f280081id);
        bVar.mo142712f(12076, "BrowseMPArticleTime");
    }

    private final void outsideUrlClick() {
        SnsMethodCalculate.markStartTimeMs("outsideUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        SnsMethodCalculate.markEndTimeMs("outsideUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142713g(12076, "ClickNotBrandUrlFeedCount", f280081id);
        bVar.mo142712f(12076, "BrowseExternalArticleTime");
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        return 3;
    }

    public void postClickEvent(View view, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        C87412m.m108594g(view, "layout");
        C87412m.m108594g(snsInfo, "snsInfo");
        super.postClickEvent(view, snsInfo);
        String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
        C87412m.m108593f(q0, "longToString(snsInfo.field_snsId)");
        f280081id = q0;
        if (!Util.isNullOrNil(snsInfo.getTimeLine().publicUserName)) {
            bizUrlClick();
        } else {
            outsideUrlClick();
        }
        SnsMethodCalculate.markEndTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
    }
}
