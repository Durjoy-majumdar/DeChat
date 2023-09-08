package lo2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import org.json.JSONObject;

/* renamed from: lo2.c */
public class C34318c {

    /* renamed from: a */
    public static long f92472a;

    /* renamed from: lo2.c$a */
    public class C34319a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f92473d;

        /* renamed from: e */
        public final /* synthetic */ String f92474e;

        public C34319a(Context context, String str) {
            this.f92473d = context;
            this.f92474e = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
            try {
                Context context = this.f92473d;
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    C76912y0.m92768g(this.f92473d, this.f92474e);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
                    return;
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m40322a(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (!TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markStartTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            } else {
                try {
                    ClipboardHelper.setText(MMApplicationContext.getContext(), "wx_ad_giftcode", str);
                } catch (Throwable th) {
                    th.toString();
                }
                SnsMethodCalculate.markEndTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            }
            if (!TextUtils.isEmpty(str2) && Util.milliSecondsToNow(f92472a) > 1500) {
                f92472a = System.currentTimeMillis();
                MMHandlerThread.postToMainThreadDelayed(new C34319a(context, str2), 800);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }

    /* renamed from: b */
    public static void m40323b(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wx_ad_pkgname", str);
            jSONObject.put("wx_ad_deeplink", str2);
            ClipboardHelper.setText(MMApplicationContext.getContext(), "wx_ad_deeplink", jSONObject.toString());
        } catch (Throwable th) {
            th.toString();
        }
        SnsMethodCalculate.markEndTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }
}
