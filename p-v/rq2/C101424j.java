package rq2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import ko2.C46734a;
import qs2.C101271i0;
import vr2.C102236a0;

/* renamed from: rq2.j */
public class C101424j {
    /* renamed from: a */
    public static void m133095a(Context context, String str, C101271i0 i0Var, int i, long j, String str2) {
        SnsMethodCalculate.markStartTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        m133096b(context, str, i0Var, i, j, str2, true);
        SnsMethodCalculate.markEndTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }

    /* renamed from: b */
    public static void m133096b(Context context, String str, C101271i0 i0Var, int i, long j, String str2, boolean z) {
        String str3;
        Context context2 = context;
        SnsMethodCalculate.markStartTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        try {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(i0Var.mo140743j()) || TextUtils.isEmpty(i0Var.mo140735b())) {
                str3 = str;
            } else {
                str3 = C95198o2.m121129a(str, "traceid=" + i0Var.mo140743j() + "&aid=" + i0Var.mo140735b());
            }
            String k = i0Var.mo140744k();
            if (TextUtils.isEmpty(k)) {
                k = i0Var.mo140745l();
                Log.m105924i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use orig_UxInfo:" + k);
            } else {
                Log.m105924i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use updated_UxInfo:" + k);
            }
            if (z) {
                str3 = C102236a0.m134734b(str3, k);
                C102236a0.m134736c(intent, k);
            }
            String e = C46734a.m52032e(str3);
            Log.m105925i("AdLandingPageH5Jumper", "open url %s", e);
            intent.putExtra("rawUrl", e);
            intent.putExtra("useJs", true);
            intent.putExtra("type", -255);
            if (i0Var.mo140736c() == 0) {
                SnsAdClick snsAdClick = new SnsAdClick(i, 7, j, 0, 0, 0, 0, 0);
                Bundle bundle = new Bundle();
                bundle.putParcelable("KSnsAdTag", snsAdClick);
                if (!TextUtils.isEmpty(k)) {
                    bundle.putString("KAnsUxInfo", k);
                }
                intent.putExtra("jsapiargs", bundle);
            }
            if ((context2 instanceof Activity) && i0Var.mo140736c() == 2) {
                String stringExtra = ((Activity) context2).getIntent().getStringExtra("sns_landing_pages_sessionId");
                String stringExtra2 = ((Activity) context2).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                if (!Util.isNullOrNil(stringExtra)) {
                    String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                    Object[] objArr = new Object[4];
                    if (Util.isNullOrNil(stringExtra2)) {
                        stringExtra2 = "";
                    }
                    objArr[0] = stringExtra2;
                    objArr[1] = stringExtra;
                    objArr[2] = str2;
                    objArr[3] = valueOf;
                    String format = String.format("official_mall_%s_%s_%s_%s", objArr);
                    intent.putExtra("prePublishId", format);
                    intent.putExtra("KPublisherId", format);
                    intent.putExtra("pay_channel", 47);
                }
            }
            C102236a0.m134732a(intent, 84);
            C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageH5Jumper", "adLandingJumpWebPageUI exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }
}
