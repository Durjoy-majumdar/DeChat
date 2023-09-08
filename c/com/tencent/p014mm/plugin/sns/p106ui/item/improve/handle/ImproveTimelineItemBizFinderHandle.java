package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e30.C75539a;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import p599lr.C61381b;
import t30.C77848n;
import t30.C77849o;
import te3.C101804kv2;
import yn2.C102882s0;
import yn2.C102886u0;
import yn2.C102887v0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizFinderHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Lrx3/b0;", "onViewExposed", "snsinfo", "karaExposedEvent", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle */
public final class ImproveTimelineItemBizFinderHandle extends ImproveTimelineItemBizHandle {
    public final void karaExposedEvent(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("karaExposedEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
        if (snsInfo != null) {
            String str = snsInfo.getTimeLine().Location != null ? snsInfo.getTimeLine().Location.f298649f : "";
            LinkedList<C101804kv2> linkedList = snsInfo.getTimeLine().ContentObj.f298427h;
            if (snsInfo.getTypeFlag() == 1 && !snsInfo.isAd() && linkedList != null) {
                linkedList.size();
            }
            String userName = snsInfo.getUserName();
            String snsId = snsInfo.getSnsId();
            int typeFlag = snsInfo.getTypeFlag();
            boolean isWsFold = snsInfo.isWsFold();
            snsInfo.toString();
            C75539a.C75547h hVar = C75539a.f221931a;
            if (hVar != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new C77848n((C77849o) hVar, snsId, isWsFold, str, typeFlag, userName), "KaraEvent");
            }
        }
        SnsMethodCalculate.markEndTimeMs("karaExposedEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
    }

    public void onViewExposed(SnsInfo snsInfo, View view, long j, long j2, boolean z) {
        C102886u0 u0Var;
        SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
        C87412m.m108594g(snsInfo, "info");
        C87412m.m108594g(view, "view");
        boolean b = C102882s0.f303681a.mo142590b(snsInfo.getLocalid());
        Log.m105924i("MicroMsg.Improve.ImproveTimelineItemBizHandle", "ImproveTimelineItemBizFinderHandle isExposed:" + z + " show:" + b);
        if (z && b) {
            C61381b bVar = (C61381b) C86312j.m106911c(C61381b.class);
            long j3 = snsInfo.field_snsId;
            long j4 = (long) snsInfo.localid;
            String localid = snsInfo.getLocalid();
            SnsMethodCalculate.markStartTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            C102887v0 v0Var = null;
            if (localid == null) {
                SnsMethodCalculate.markEndTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                u0Var = null;
            } else {
                u0Var = C102882s0.f303682b.get(localid);
                SnsMethodCalculate.markEndTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            }
            if (u0Var != null) {
                SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                v0Var = u0Var.f303689a;
                SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            }
            bVar.fd0(false, j3, "", j4, v0Var == C102887v0.Photo);
        }
        if (z) {
            karaExposedEvent(snsInfo);
        }
        SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
    }
}
