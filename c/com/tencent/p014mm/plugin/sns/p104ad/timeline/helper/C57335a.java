package com.tencent.p014mm.plugin.sns.p104ad.timeline.helper;

import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.helper.ActionBtnFollowFinderHelper;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import jq2.C60887c;
import qo3.C77407n;
import up2.C102064e;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.helper.a */
public class C57335a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FollowUserEvent f164241d;

    /* renamed from: e */
    public final /* synthetic */ ActionBtnFollowFinderHelper f164242e;

    public C57335a(ActionBtnFollowFinderHelper.FollowUserEventListener followUserEventListener, FollowUserEvent followUserEvent, ActionBtnFollowFinderHelper actionBtnFollowFinderHelper) {
        this.f164241d = followUserEvent;
        this.f164242e = actionBtnFollowFinderHelper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener$1");
        if (this.f164241d.f154820d.f154823c) {
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = this.f164242e;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsInfo snsInfo = actionBtnFollowFinderHelper.f274163e;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C60887c.m71300a(snsInfo, this.f164242e.mo130395b(), 0, 1);
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper2 = this.f164242e;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            actionBtnFollowFinderHelper2.getClass();
            SnsMethodCalculate.markStartTimeMs("refreshActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C102064e.C102068b bVar = actionBtnFollowFinderHelper2.f274175q;
            if (bVar != null) {
                ((C96177r2.C96178a) bVar).mo133812a(actionBtnFollowFinderHelper2.f274164f);
            }
            SnsMethodCalculate.markEndTimeMs("refreshActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        } else {
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper3 = this.f164242e;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsInfo snsInfo2 = actionBtnFollowFinderHelper3.f274163e;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C60887c.m71300a(snsInfo2, this.f164242e.mo130395b(), 1, 1);
        }
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper4 = this.f164242e;
        actionBtnFollowFinderHelper4.getClass();
        SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        C77407n nVar = actionBtnFollowFinderHelper4.f274161c;
        if (nVar != null && nVar.mo107563h()) {
            actionBtnFollowFinderHelper4.f274161c.mo107572p();
        }
        SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        this.f164242e.mo130396c();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener$1");
    }
}
