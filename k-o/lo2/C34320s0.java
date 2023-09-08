package lo2;

import android.content.SharedPreferences;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p244tt.C14088e;

/* renamed from: lo2.s0 */
public class C34320s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f92475d;

    /* renamed from: lo2.s0$a */
    public class C34321a implements C115477b {

        /* renamed from: a */
        public final /* synthetic */ SharedPreferences f92476a;

        /* renamed from: b */
        public final /* synthetic */ long f92477b;

        public C34321a(SharedPreferences sharedPreferences, long j) {
            this.f92476a = sharedPreferences;
            this.f92477b = j;
        }

        /* renamed from: a */
        public void mo5700a(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1$1");
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("LiteAppPreviewHelper", "checkFinderRoomPreview fail, checkTimeInterval is " + (currentTimeMillis - this.f92477b));
            SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1$1");
        }

        /* renamed from: b */
        public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
            SnsMethodCalculate.markStartTimeMs("success", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1$1");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f92476a.edit().putLong(C34320s0.this.f92475d, currentTimeMillis).commit();
                Log.m105924i("LiteAppPreviewHelper", "checkFinderRoomPreview success, checkTimeInterval is " + (currentTimeMillis - this.f92477b));
            } catch (Throwable th) {
                Log.m105920e("LiteAppPreviewHelper", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("success", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1$1");
        }
    }

    public C34320s0(String str) {
        this.f92475d = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1");
        try {
            if (Util.isNullOrNil(this.f92475d)) {
                Log.m105920e("LiteAppPreviewHelper", "appId is null or nil");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("ad_finder_room_preview_lite_app_update", 0);
            if (currentTimeMillis - sharedPreferences.getLong(this.f92475d, 0) >= 21600000) {
                ((C14088e) C86312j.m106911c(C14088e.class)).u50(this.f92475d, new C34321a(sharedPreferences, currentTimeMillis));
            } else {
                Log.m105918d("LiteAppPreviewHelper", "checkFinderRoomPreview but time interval is not over 6h");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$1");
        } catch (Throwable th) {
            Log.m105920e("LiteAppPreviewHelper", th.toString());
        }
    }
}
