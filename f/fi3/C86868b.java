package fi3;

import android.app.Activity;

/* renamed from: fi3.b */
public final class C86868b {
    /* renamed from: a */
    public static boolean m107886a(Activity activity) {
        String name = activity.getClass().getName();
        return !name.startsWith("com.tencent.mm.splash.") && !name.equals("com.tencent.mm.app.WeChatSplashActivity") && !name.equals("com.tencent.mm.app.WeChatSplashFallbackActivity");
    }
}
