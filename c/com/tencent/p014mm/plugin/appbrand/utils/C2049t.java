package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.t */
public final class C2049t {

    /* renamed from: a */
    public static final C13601g f11994a = C36568h.m40985a(C2051b.f11997d);

    /* renamed from: b */
    public static final C13601g f11995b = C36568h.m40985a(C2050a.f11996d);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.t$a */
    public static final class C2050a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2050a f11996d = new C2050a();

        public C2050a() {
            super(0);
        }

        public Object invoke() {
            boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_wxa_enable_mark_snapshot_not_need, z);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.t$b */
    public static final class C2051b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2051b f11997d = new C2051b();

        public C2051b() {
            super(0);
        }

        public Object invoke() {
            boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_wxa_enable_preload_v8_env, z);
            }
            return Boolean.valueOf(z);
        }
    }
}
