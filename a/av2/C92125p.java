package av2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: av2.p */
public final class C92125p {
    /* renamed from: a */
    public static final String m115796a(String str) {
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        Log.m105918d("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaId: " + str);
        SnsInfo d = m115799d(str);
        if (d == null) {
            Log.m105924i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        C101804kv2 d2 = C94897n1.m120366d(d, str);
        if (d2 == null) {
            Log.m105924i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        String c = m115798c(m115800e(d), d2);
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c;
    }

    /* renamed from: b */
    public static final String m115797b(String str, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        Log.m105918d("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaId: " + str);
        if (kv22 == null) {
            Log.m105924i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        SnsInfo d = m115799d(str);
        if (d == null) {
            Log.m105924i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        String c = m115798c(m115800e(d), kv22);
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c;
    }

    /* renamed from: c */
    public static final String m115798c(boolean z, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        C87412m.m108594g(kv22, "media");
        if (z) {
            String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22);
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return str;
        }
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
        String T = C102236a0.m134725T(kv22);
        C87412m.m108593f(T, "getSnsSightName(media)");
        String str2 = e + T;
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return str2;
    }

    /* renamed from: d */
    public static final SnsInfo m115799d(String str) {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        try {
            snsInfo = C94866e1.Yx0().mo139798DN(str);
        } catch (Exception unused) {
            snsInfo = null;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return snsInfo;
    }

    /* renamed from: e */
    public static final boolean m115800e(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        C87412m.m108594g(snsInfo, "snsInfo");
        C101789j00 j002 = snsInfo.getTimeLine().ContentObj;
        boolean z = false;
        if (j002 == null) {
            Log.m105920e("MicroMsg.Sns.MaterialPathUtils", "isPhotoType, contentObj is null");
            SnsMethodCalculate.markEndTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return false;
        }
        if (j002.f298424e == 1) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return z;
    }
}
