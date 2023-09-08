package com.tencent.p014mm.plugin.appbrand.weishi;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import lb0.C88394b;
import ym0.C91516n;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.f */
public class C84905f {

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.f$a */
    public class C84906a implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ ImageView f247439d;

        /* renamed from: e */
        public final /* synthetic */ Runnable f247440e;

        /* renamed from: f */
        public final /* synthetic */ String f247441f;

        public C84906a(ImageView imageView, Runnable runnable, String str) {
            this.f247439d = imageView;
            this.f247440e = runnable;
            this.f247441f = str;
        }

        /* renamed from: b */
        public void mo1907b() {
            Log.m105920e("MicroMsg.AppBrandWeishiUtil", "thumb loaded fail");
            String str = this.f247441f;
            if (str != null) {
                C84905f.m104621b(this.f247439d, str, (String) null, this.f247440e);
            }
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "AppBrandWeishiUtil#THUMB";
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            Log.m105924i("MicroMsg.AppBrandWeishiUtil", "thumb loaded");
            ImageView imageView = this.f247439d;
            if (!(imageView == null || bitmap == null || bitmap.isRecycled())) {
                imageView.setImageBitmap(bitmap);
            }
            Runnable runnable = this.f247440e;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.f$b */
    public class C84907b implements C1256g<IPCVoid> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.f$c */
    public static class C84908c implements C80883e<IPCString, IPCVoid> {
        private C84908c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                new AppBrandWeishiUIReadyEvent().publish();
            }
        }
    }

    /* renamed from: a */
    public static boolean m104620a(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            return C91516n.m114822a(appBrandRuntime.f238147j);
        }
        return false;
    }

    /* renamed from: b */
    public static void m104621b(ImageView imageView, String str, String str2, Runnable runnable) {
        Log.m105925i("MicroMsg.AppBrandWeishiUtil", "loadThumbImage:%s", str);
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122797p(new C84906a(imageView, runnable, str2), str, (C88394b.C88408j) null, (C88394b.C88405h) null);
    }

    /* renamed from: c */
    public static void m104622c() {
        Log.m105918d("MicroMsg.AppBrandWeishiUtil", "sendEventAppBrandWeishiUIReady");
        if (MMApplicationContext.isMMProcess()) {
            new AppBrandWeishiUIReadyEvent().publish();
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString("wxfe02ecfe70800f46"), C84908c.class, new C84907b());
        }
    }

    /* renamed from: d */
    public static void m104623d(AppBrandRuntime appBrandRuntime, ImageView imageView, Runnable runnable) {
        if (appBrandRuntime.mo113036W() instanceof AppBrandInitConfigLU) {
            AppBrandWeishiParams appBrandWeishiParams = ((AppBrandInitConfigLU) appBrandRuntime.mo113036W()).f234848z;
            String str = appBrandWeishiParams.f239421e;
            String str2 = appBrandWeishiParams.f239422f;
            Log.m105925i("MicroMsg.AppBrandWeishiUtil", "showLaunchThumb, thumbUrl:%s, thumbPath:%s", str, str2);
            if (!Util.isNullOrNil(str)) {
                m104621b(imageView, str, "file://" + str2, runnable);
            } else if (!Util.isNullOrNil(str2)) {
                m104621b(imageView, "file://" + str2, (String) null, runnable);
            }
        }
    }
}
