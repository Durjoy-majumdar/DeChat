package nu2;

import br2.C54550e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: nu2.d */
public class C100202d {
    /* renamed from: a */
    public static int m130998a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        if (snsInfo.isAdIpInteractVideo()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 39;
        } else if (snsInfo.isBreakFrameAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 32;
        } else if (snsInfo.isTwistAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 28;
        } else if (snsInfo.isGestureAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 29;
        } else if (snsInfo.isLongPressGestureAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 30;
        } else if (snsInfo.isShakeAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 31;
        } else if (snsInfo.isDragAd()) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 35;
        } else if (C54550e.m61296a(snsInfo)) {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 41;
        } else {
            SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 27;
        }
    }

    /* renamed from: b */
    public static boolean m130999b(int i) {
        SnsMethodCalculate.markStartTimeMs("isFullCardViewType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        boolean z = i == 27 || i == 28 || i == 29 || i == 30 || i == 31 || i == 32 || i == 39 || i == 35 || i == 41;
        SnsMethodCalculate.markEndTimeMs("isFullCardViewType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        return z;
    }
}
