package com.tencent.p014mm.plugin.appbrand.task.preload;

import android.util.SparseLongArray;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.g */
public final class C84327g {

    /* renamed from: a */
    public static final C84329b f246215a = new C84329b();

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.g$a */
    public enum C84328a {
        WASERVICE,
        WAGAME,
        NIL
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.g$b */
    public static final class C84329b extends SparseLongArray {
        public C84329b() {
            super(C84328a.values().length);
        }
    }

    /* renamed from: a */
    public static final boolean m103944a() {
        return (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) && MultiProcessMMKV.getMMKV("__appbrand__preload__interval__limiter__").getBoolean("__key_test_disable__", false);
    }

    /* renamed from: b */
    public static final void m103945b(boolean z) {
        MultiProcessMMKV.getMMKV("__appbrand__preload__interval__limiter__").putBoolean("__key_test_disable__", z).commit();
    }
}
