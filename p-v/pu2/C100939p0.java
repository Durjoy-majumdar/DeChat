package pu2;

import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: pu2.p0 */
public final class C100939p0 implements C94974y1.C94977c {

    /* renamed from: a */
    public final /* synthetic */ C100934n0 f295573a;

    public C100939p0(C100934n0 n0Var) {
        this.f295573a = n0Var;
    }

    /* renamed from: a */
    public final void mo131312a(LinkedList<String> linkedList) {
        SnsMethodCalculate.markStartTimeMs("getTargetUserNamesCallback", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$1");
        C100934n0 n0Var = this.f295573a;
        SnsMethodCalculate.markStartTimeMs("access$getUnreadAvatarView$p", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        StoryAvatarDotsView storyAvatarDotsView = n0Var.f295568x0;
        SnsMethodCalculate.markEndTimeMs("access$getUnreadAvatarView$p", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        C87412m.m108593f(linkedList, LocaleUtil.ITALIAN);
        SnsMethodCalculate.markStartTimeMs("access$initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        n0Var.mo140401r(storyAvatarDotsView, linkedList, 3);
        SnsMethodCalculate.markEndTimeMs("access$initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markEndTimeMs("getTargetUserNamesCallback", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$1");
    }
}
