package lo2;

import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import kr0.C76629w0;
import p1031sb.C90159e;
import p235sm.C36711u0;

/* renamed from: lo2.x */
public final class C88617x {

    /* renamed from: a */
    public static Map<String, Boolean> f255894a = new HashMap();

    /* renamed from: lo2.x$a */
    public class C88618a implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f255895a;

        /* renamed from: lo2.x$a$a */
        public class C34322a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f92479d;

            public C34322a(boolean z) {
                this.f92479d = z;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1$1");
                if (this.f92479d) {
                    C88618a.this.f255895a.setVisibility(0);
                    ((C36711u0) C86312j.m106911c(C36711u0.class)).mo60810a(C88618a.this.f255895a);
                } else if (C88618a.this.f255895a.getVisibility() == 0) {
                    C88618a.this.f255895a.setVisibility(4);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1$1");
            }
        }

        public C88618a(ImageView imageView) {
            this.f255895a = imageView;
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
            if (wxaAttributes == null) {
                Log.m105920e("AdWeAppHelper", "onGetWeAppInfo, info==null");
                SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
                return;
            }
            int i = 0;
            try {
                if (wxaAttributes.mo113940m2() != null) {
                    i = wxaAttributes.mo113940m2().f239500p;
                }
            } catch (Exception e) {
                Log.m105920e("AdWeAppHelper", "onGetWeAppInfo, exp=" + e.toString());
            }
            boolean b = C90159e.m112823b(i, 10);
            Object tag = this.f255895a.getTag();
            if (tag instanceof String) {
                String str3 = (String) tag;
                if (str3.equals(wxaAttributes.field_username)) {
                    Log.m105924i("AdWeAppHelper", "onGetWeAppInfo, weAppName=" + str3 + ", isRelievedBuyWeApp=" + b);
                    MMHandlerThread.postToMainThread(new C34322a(b));
                    if (!TextUtils.isEmpty(wxaAttributes.field_username)) {
                        synchronized (C88617x.class) {
                            try {
                                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                                Map<String, Boolean> map = C88617x.f255894a;
                                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                                ((HashMap) map).put(wxaAttributes.field_username, Boolean.valueOf(b));
                            } finally {
                                str = "onGetWeAppInfo";
                                str2 = "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1";
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                            }
                        }
                    }
                } else {
                    Log.m105928w("AdWeAppHelper", "onGetWeAppInfo, View reuse, view.name=" + str3 + ", info.name=" + wxaAttributes.field_username);
                }
            } else {
                Log.m105928w("AdWeAppHelper", "onGetWeAppInfo, View reuse, view.name=null, info.name=" + wxaAttributes.field_username);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m110483a(String str) {
        synchronized (C88617x.class) {
            SnsMethodCalculate.markStartTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            } else if (((HashMap) f255894a).containsKey(str)) {
                boolean booleanValue = ((Boolean) ((HashMap) f255894a).get(str)).booleanValue();
                SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return booleanValue;
            } else {
                SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            }
        }
    }

    /* renamed from: b */
    public static void m110484b(String str, ImageView imageView, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("AdWeAppHelper", "refreshWeAppAuthIcon, weAppUserName==null");
            SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return;
        }
        imageView.setTag(str);
        SnsMethodCalculate.markStartTimeMs("isExptShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z = true;
        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) == 1;
        SnsMethodCalculate.markEndTimeMs("isExptShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean a = m110483a(str);
        if (aDInfo.forbiddenShowRelievedBuy || !z2 || !a) {
            z = false;
        }
        if (z) {
            imageView.setVisibility(0);
        } else if (imageView.getVisibility() == 0) {
            imageView.setVisibility(4);
        }
        synchronized (C88617x.class) {
            try {
                ((HashMap) f255894a).put(str, Boolean.valueOf(z));
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                    throw th;
                }
            }
        }
        Log.m105924i("AdWeAppHelper", "refreshWeAppGuaranteeAuthIcon, isExptShow=" + z2 + ", isForbid=" + aDInfo.forbiddenShowRelievedBuy + ", cache=" + a);
        if (aDInfo.forbiddenShowRelievedBuy || !z2) {
            SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return;
        }
        ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106878CE(str, new C88618a(imageView));
        SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
    }
}
