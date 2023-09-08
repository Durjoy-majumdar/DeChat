package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.vendor.Huawei;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.skyline.SkylineLog;
import com.tencent.skyline.SkylineLogic;
import com.tencent.skyline.jni.SkylineJNI;
import com.tencent.skyline.jni.SkylineLibraryLoader;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import iu0.C87814b;
import p1007mc.C88723a;
import p176jc.C33533t;
import p176jc.C87915a;
import p176jc.C87919d;
import p176jc.C87938u;
import p176jc.C9290b;

/* renamed from: com.tencent.mm.plugin.appbrand.app.z0$$a */
public final /* synthetic */ class z0$$a implements Runnable {
    public final void run() {
        Class cls = C32735h.class;
        SkylineLog.INSTANCE.initLogCallBack(new C29097a1());
        boolean z = true;
        int i = (Build.VERSION.SDK_INT > 24 || !Huawei.ifHUAWEI()) ? 2 : 1;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_wxa_skyline_timer, BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
        boolean isAppBrandProcess = MMApplicationContext.isAppBrandProcess();
        MultiProcessMMKV multiProcessMMKV = C87919d.f254459c;
        multiProcessMMKV.putInt("renderBackend", i).commit();
        C87919d dVar = C87919d.f254457a;
        dVar.getClass();
        C87919d.f254461e = wf;
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        sb.append(MMApplicationContext.getProcessName());
        sb.append(" renderBackend:");
        sb.append(multiProcessMMKV.getInt("renderBackend", 0));
        sb.append(" useJavaTimer:");
        sb.append(C87919d.f254461e);
        sb.append(" version:");
        SkylineLogic skylineLogic = SkylineLogic.INSTANCE;
        sb.append(skylineLogic.version());
        Log.m105924i("Luggage.SkylineBoot", sb.toString());
        if (dVar.mo122386a()) {
            C87938u uVar = C87938u.f254496a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            synchronized (uVar) {
                if (!C87938u.f254497b.getAndSet(true)) {
                    SkylineLibraryLoader.initXWebLibraryLoader(new C33533t());
                    skylineLogic.init(context);
                    try {
                        SkylineJNI.setDiskCacheDirPath(C86013q1.m106448i("wcf://WxaSkylineCache/", true));
                    } catch (Throwable th) {
                        Log.m105920e("SkylineLogic", "SkylineJNI fail: " + th);
                    }
                    SkylineJNI.setCronetClient(new C87915a());
                    if (isAppBrandProcess) {
                        if (BuildInfo.DEBUG) {
                            p172io.flutter.Log.setLogLevel(p172io.flutter.Log.VERBOSE);
                        }
                        p172io.flutter.Log.setLogDelegate(new C9290b());
                    }
                }
            }
        }
        C87919d.f254463g = false;
        if (C87919d.f254457a.mo122386a()) {
            C87919d.f254459c.putBoolean("SwapSurface", 1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_skyline_enabled_swap_surface, 1));
            C87814b[] bVarArr = C87814b.f254221d;
            Log.m105924i("MicroMsg.AppBrandXWebSameLayerPluginInstaller", "<clinit>");
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_skyline_enable_new_image, 0) != 1) {
                z = false;
            }
            if (z) {
                try {
                    SkylineJNI.enableNewImage();
                } catch (UnsatisfiedLinkError unused) {
                }
            } else {
                SkylineJNI.disableNewImage();
            }
            C88723a.f256079a = new C81148b1();
        }
    }
}
