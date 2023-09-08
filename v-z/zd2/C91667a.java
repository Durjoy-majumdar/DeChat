package zd2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88015a;

/* renamed from: zd2.a */
public class C91667a {

    /* renamed from: a */
    public static final Application.ActivityLifecycleCallbacks f262646a = new C91668a();

    /* renamed from: zd2.a$a */
    public class C91668a extends C88015a {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                if (Util.nullAsNil(activity.getLocalClassName()).contains("WebView")) {
                    Object[] objArr = new Object[2];
                    objArr[0] = activity.getLocalClassName();
                    objArr[1] = activity.getIntent() == null ? null : activity.getIntent().getStringExtra(C74928u.C45093i.f122325q);
                    Log.m105925i("MicroMsg.WxPayAdUxInfoTracer", "onActivityCreated-%s, adUxInfo=%s", objArr);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m115205a(String str, PersistableBundle persistableBundle) {
        m115206b("onNewConfig", str, persistableBundle);
    }

    /* renamed from: b */
    public static void m115206b(String str, String str2, PersistableBundle persistableBundle) {
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str;
        objArr[2] = persistableBundle == null ? null : persistableBundle.getString("adUxInfo");
        Log.m105925i("MicroMsg.WxPayAdUxInfoTracer", "AppBrandRuntime(%s)-%s, adUxInfo=%s", objArr);
    }

    /* renamed from: c */
    public static void m115207c(String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.WxPayAdUxInfoTracer", "trace: scene[%s] api[%s] udUxInfo[%s] source[%s]", str, str2, str3, str4);
    }
}
