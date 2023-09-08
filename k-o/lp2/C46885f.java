package lp2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import rq2.C101425k;
import te3.C101820nt3;
import te3.C51939x82;
import te3.C52084y82;

/* renamed from: lp2.f */
public class C46885f extends C46883a<C51939x82, C52084y82> {
    public C46885f(String str, String str2, String str3, String str4) {
        mo72087l1(new C51939x82(), new C52084y82(), "/cgi-bin/mmoc-bin/adplayinfo/send_ad_coupon", 4743, str, str2, str3, str4);
    }

    /* renamed from: j1 */
    public void mo72085j1(C101820nt3 nt32, Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        C51939x82 x822 = (C51939x82) nt32;
        SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        if (x822 == null || C101425k.m133099c(objArr)) {
            SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        } else {
            for (int i = 0; i < objArr.length; i++) {
                String str = objArr[i];
                if (str instanceof String) {
                    if (i == 0) {
                        x822.f144520d = str;
                    } else if (i == 1) {
                        x822.f144521e = str;
                    } else if (i == 2) {
                        x822.f144522f = str;
                    } else if (i == 3) {
                        x822.f144523g = str;
                    }
                }
            }
            SnsMethodCalculate.markStartTimeMs("requestPrintOut", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
            StringBuilder sb = new StringBuilder("REQ:[");
            sb.append("appId: ");
            if (!TextUtils.isEmpty(x822.f144520d)) {
                sb.append(x822.f144520d);
            } else {
                sb.append("");
            }
            sb.append(", stockid: ");
            if (!TextUtils.isEmpty(x822.f144521e)) {
                sb.append(x822.f144521e);
            } else {
                sb.append("");
            }
            sb.append(", uxinfo: ");
            if (!TextUtils.isEmpty(x822.f144522f)) {
                sb.append(x822.f144522f);
            } else {
                sb.append("");
            }
            sb.append(", compid: ");
            if (!TextUtils.isEmpty(x822.f144523g)) {
                sb.append(x822.f144523g);
            } else {
                sb.append("");
            }
            sb.append("]");
            Log.m105918d("SnsAd.CouponCardNetScene", sb.toString());
            SnsMethodCalculate.markEndTimeMs("requestPrintOut", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
            SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
        }
        SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdCouponCard");
    }
}
