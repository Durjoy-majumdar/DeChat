package cp2;

import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: cp2.a */
public class C57960a implements AdLandingPagesProxy.C94830p {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f165861a;

    /* renamed from: b */
    public final /* synthetic */ String f165862b;

    /* renamed from: cp2.a$a */
    public class C57961a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f165863d;

        public C57961a(String str) {
            this.f165863d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
            TextView textView = (TextView) C57960a.this.f165861a.get();
            if (textView == null) {
                Log.m105928w("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, backTxtViewRef get null");
            } else if (!TextUtils.isEmpty(this.f165863d)) {
                textView.setText(C57960a.this.f165862b + this.f165863d);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1$1");
        }
    }

    public C57960a(WeakReference weakReference, String str) {
        this.f165861a = weakReference;
        this.f165862b = str;
    }

    /* renamed from: a */
    public void mo10855a(Object obj) {
        String str;
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        Log.m105924i("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, ret=" + obj);
        if (obj instanceof String) {
            try {
                str = new JSONObject((String) obj).optString("name");
            } catch (Exception unused) {
            }
            MMHandlerThread.postToMainThread(new C57961a(str));
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        }
        str = "";
        MMHandlerThread.postToMainThread(new C57961a(str));
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }

    /* renamed from: b */
    public void mo10856b(int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }
}
