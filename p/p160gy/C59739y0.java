package p160gy;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86301e;
import ei3.C86522b;
import lo2.C99542h0;
import lu2.C61403b;
import p166hy.C60226p0;
import te3.C101789j00;
import te3.C64623p81;

@C86522b
/* renamed from: gy.y0 */
public final class C59739y0 extends C86301e implements C60226p0 {
    /* renamed from: te */
    public C64623p81 mo84727te(Object obj) {
        SnsMethodCalculate.markStartTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        C64623p81 p812 = null;
        C61403b.C61404a aVar = obj instanceof C61403b.C61404a ? (C61403b.C61404a) obj : null;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            return null;
        }
        TimeLineObject timeLineObject = aVar.timeLineObject;
        if (timeLineObject == null) {
            SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            return null;
        }
        C101789j00 j002 = timeLineObject.ContentObj;
        if (j002 != null) {
            p812 = j002.f298435s;
        }
        SnsMethodCalculate.markEndTimeMs("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        return p812;
    }

    /* renamed from: zF */
    public boolean mo84728zF(Intent intent, Context context, String str, String str2, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
        boolean f = C99542h0.m129908f(intent, context, str, str2, str3, str4);
        SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.feature.sns.SnsFinderService");
        return f;
    }
}
