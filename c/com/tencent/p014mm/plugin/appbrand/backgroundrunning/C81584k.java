package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.app.Notification;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.k */
public final class C81584k {

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.k$b */
    public static class C81586b {

        /* renamed from: a */
        public List<AppBrandBackgroundRunningApp> f239254a;

        /* renamed from: b */
        public List<AppBrandBackgroundRunningApp> f239255b;

        public C81586b(C81585a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.k$c */
    public static class C81587c {

        /* renamed from: a */
        public final Notification f239256a;

        /* renamed from: b */
        public final int f239257b;

        public C81587c(Notification notification, int i) {
            this.f239256a = notification;
            this.f239257b = i;
        }
    }

    /* renamed from: a */
    public static Class<? extends CustomBackgroundRunningNotificationLogic> m100071a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandForegroundNotificationCommons", "getCustomNotificationLogicClass fail since " + e.toString());
            return null;
        }
    }
}
