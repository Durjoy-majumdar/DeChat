package com.tencent.p014mm.splash;

import android.app.Application;
import com.tencent.p014mm.legacy.app.WeChatSplash;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import com.tencent.p014mm.splash.C85791o;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import f40.C86709a0;
import gp3.C87315b;
import j40.C87829b;
import java.util.Iterator;

/* renamed from: com.tencent.mm.splash.m */
public class C85788m {

    /* renamed from: a */
    public static boolean f249862a;

    /* renamed from: b */
    public static C85789a f249863b;

    /* renamed from: c */
    public static boolean f249864c;

    /* renamed from: d */
    public static C85791o.C85792a f249865d;

    /* renamed from: e */
    public static Application f249866e;

    /* renamed from: f */
    public static String f249867f;

    /* renamed from: com.tencent.mm.splash.m$a */
    public interface C85789a {
    }

    /* renamed from: a */
    public static void m105964a(C85789a aVar) {
        if (f249863b == null) {
            Application application = f249866e;
            String str = f249867f;
            WeChatSplashStartup weChatSplashStartup = (WeChatSplashStartup) aVar;
            weChatSplashStartup.f237801a = application;
            weChatSplashStartup.f237802b = str;
            C87829b profile = WeChatSplash.profile();
            weChatSplashStartup.f237803c = profile;
            C86709a0.m107527g(profile);
            C87829b bVar = weChatSplashStartup.f237803c;
            Application application2 = weChatSplashStartup.f237801a;
            Iterator<C87315b> it = bVar.f254269h.getQueue().iterator();
            while (it.hasNext()) {
                C87315b next = it.next();
                if (next != null) {
                    ((ApplicationLifeCycle) next.f253059e).onBaseContextAttached(application2);
                }
            }
            f249863b = aVar;
        }
    }
}
