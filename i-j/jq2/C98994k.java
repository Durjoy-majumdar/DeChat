package jq2;

import android.app.Activity;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jp2.C98963o;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: jq2.k */
public class C98994k {
    /* renamed from: a */
    public static boolean m128903a(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        boolean z2 = false;
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
            return false;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 9 || i == 19) {
            z2 = true;
        }
        SnsMethodCalculate.markEndTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        return z2;
    }

    /* renamed from: b */
    public static void m128904b(Activity activity, int i, SnsInfo snsInfo, int i2) {
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        try {
            if (activity instanceof SnsTimeLineUI) {
                oVar = ((SnsTimeLineUI) activity).mo132956s8();
            } else {
                if (activity instanceof SnsCommentDetailUI) {
                    SnsCommentDetailUI snsCommentDetailUI = (SnsCommentDetailUI) activity;
                    snsCommentDetailUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    oVar = snsCommentDetailUI.f277866X;
                    SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                }
                oVar = null;
            }
        } catch (Throwable th) {
            Log.m105920e("AdTagClickableHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        SnsAdClick snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, snsInfo.field_snsId, i2, 45);
        C102260r.m134864d(snsAdClick, oVar, snsInfo, i2);
        C102236a0.m134773u0(snsAdClick);
        SnsMethodCalculate.markEndTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
    }
}
