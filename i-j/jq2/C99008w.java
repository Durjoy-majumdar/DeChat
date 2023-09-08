package jq2;

import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import jp2.C98963o;
import rq2.C101425k;
import te3.C101789j00;
import te3.C101804kv2;

/* renamed from: jq2.w */
public class C99008w {
    /* renamed from: a */
    public static C101804kv2 m128937a(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        TimeLineObject timeLineObject;
        C101789j00 j002;
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (baseViewHolder == null || (timeLineObject = baseViewHolder.timeLineObject) == null || (j002 = timeLineObject.ContentObj) == null || C101425k.m133097a(j002.f298427h)) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return null;
        }
        C101804kv2 kv22 = j002.f298427h.get(0);
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return kv22;
    }

    /* renamed from: b */
    public static C98963o m128938b(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        BaseTimeLine baseTimeLine;
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return null;
        }
        C98963o oVar = baseTimeLine.f276699f;
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return oVar;
    }

    /* renamed from: c */
    public static String m128939c(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        TimeLineObject timeLineObject;
        SnsMethodCalculate.markStartTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        SnsMethodCalculate.markStartTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (baseViewHolder != null) {
            timeLineObject = baseViewHolder.timeLineObject;
            SnsMethodCalculate.markEndTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        } else {
            timeLineObject = null;
            SnsMethodCalculate.markEndTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        }
        if (timeLineObject != null) {
            String str = timeLineObject.f283893Id;
            SnsMethodCalculate.markEndTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return "";
    }
}
