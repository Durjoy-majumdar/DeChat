package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import br0.C79774c;
import br0.C79778e;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import di3.C86312j;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import ny3.C89104m;
import p225rc.C89918i;
import p225rc.C89923l;
import p963fc.C86799a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.v */
public final class C84684v extends C86799a<AppBrandInitConfigWC> {
    public static final C84685a Companion = new C84685a();
    /* access modifiers changed from: private */
    public static final C89918i<Boolean> forceCenterInside$delegate;
    /* access modifiers changed from: private */
    public static final C89918i<Boolean> forceNotCenterInside$delegate;
    /* access modifiers changed from: private */
    public static Boolean isBlacklisting;
    /* access modifiers changed from: private */
    public static Boolean mayDisableInHuaWeiDevices;
    private final C79774c base;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.v$a */
    public static final class C84685a {

        /* renamed from: a */
        public static final /* synthetic */ C89104m<Object>[] f247050a;

        static {
            Class<C84685a> cls = C84685a.class;
            f247050a = new C89104m[]{C24560g0.m30726b(new C24570s(cls, "forceCenterInside", "getForceCenterInside()Z", 0)), C24560g0.m30726b(new C24570s(cls, "forceNotCenterInside", "getForceNotCenterInside()Z", 0))};
        }

        /* renamed from: a */
        public final boolean mo117404a() {
            return ((Boolean) C84684v.forceNotCenterInside$delegate.mo124238b(this, f247050a[1])).booleanValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
            if (r5.contains(r3) != false) goto L_0x004b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo117405b() {
            /*
                r12 = this;
                boolean r0 = r12.mo117404a()
                r1 = 1
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.isBlacklisting
                r2 = 0
                if (r0 != 0) goto L_0x0073
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r3 = h81.C32735h.C32737c.clicfg_android_appbrand_compat_mode_black_list
                java.lang.String r4 = "null"
                java.lang.String r0 = r0.Y60(r3, r4)
                java.lang.String r3 = "getService(IExptService:…_mode_black_list, \"null\")"
                gy3.C87412m.m108593f(r0, r3)
                java.util.Locale r3 = java.util.Locale.US
                java.lang.String r5 = "US"
                gy3.C87412m.m108593f(r3, r5)
                java.lang.String r6 = r0.toLowerCase(r3)
                java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
                gy3.C87412m.m108593f(r6, r0)
                java.lang.String r5 = ";"
                java.lang.String[] r7 = new java.lang.String[]{r5}
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                java.util.List r5 = z04.C112550d0.m153785U(r6, r7, r8, r9, r10, r11)
                java.lang.String r6 = "all"
                boolean r6 = r5.contains(r6)
                if (r6 == 0) goto L_0x004d
            L_0x004b:
                r0 = 1
                goto L_0x006c
            L_0x004d:
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L_0x0055
            L_0x0053:
                r0 = 0
                goto L_0x006c
            L_0x0055:
                java.lang.String r4 = p156gj.C87203t.m108275k()
                java.lang.String r6 = "getModel()"
                gy3.C87412m.m108593f(r4, r6)
                java.lang.String r3 = r4.toLowerCase(r3)
                gy3.C87412m.m108593f(r3, r0)
                boolean r0 = r5.contains(r3)
                if (r0 == 0) goto L_0x0053
                goto L_0x004b
            L_0x006c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.isBlacklisting = r0
            L_0x0073:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.isBlacklisting
                gy3.C87412m.m108591d(r0)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0081
                return r1
            L_0x0081:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.mayDisableInHuaWeiDevices
                if (r0 != 0) goto L_0x009f
                boolean r0 = com.tencent.p014mm.sdk.vendor.HuaweiKt.hasHuaweiMagicWindowFeature()
                if (r0 == 0) goto L_0x0097
                rc.l r0 = p225rc.C89923l.f258408a
                boolean r0 = r0.mo117503i()
                if (r0 != 0) goto L_0x0097
                r0 = 1
                goto L_0x0098
            L_0x0097:
                r0 = 0
            L_0x0098:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.mayDisableInHuaWeiDevices = r0
            L_0x009f:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.mayDisableInHuaWeiDevices
                gy3.C87412m.m108591d(r0)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00ad
                return r1
            L_0x00ad:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.C84685a.mo117405b():boolean");
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        forceCenterInside$delegate = new C89918i<>(bool);
        forceNotCenterInside$delegate = new C89918i<>(bool);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84684v(AppBrandRuntime appBrandRuntime, Context context, C79778e eVar, C79774c cVar) {
        super(appBrandRuntime, context, eVar, false, 8, (C8480h) null);
        C87412m.m108594g(appBrandRuntime, "rt");
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(eVar, "activityOrientationHandler");
        C87412m.m108594g(cVar, LiteAppCenter.FRAMEWORK_TYPE_BASE);
        this.base = cVar;
    }

    private final boolean enableForGame() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_center_inside_for_mini_game, 0) == 1;
    }

    public static final boolean isBlackListing() {
        return Companion.mo117405b();
    }

    public int getBackgroundColor() {
        return AppBrandRuntimeWCAccessible.m99326b(getInitConfig()) ? C0966R.color.f3133gi : C0966R.color.f2930d;
    }

    public C79774c.C79777c getStatusBar() {
        return this.base.getStatusBar();
    }

    public boolean shouldInLargeScreenCompatMode() {
        C84685a aVar = Companion;
        aVar.getClass();
        if (((Boolean) forceCenterInside$delegate.mo124238b(aVar, C84685a.f247050a[0])).booleanValue()) {
            return true;
        }
        if (getRt().mo113067m0()) {
            return false;
        }
        if (getInitConfig() != null) {
            AppBrandInitConfigLU initConfig = getInitConfig();
            C87412m.m108591d(initConfig);
            if (((AppBrandInitConfigWC) initConfig).f239373d1 || (AppBrandRuntimeWCAccessible.m99326b(getInitConfig()) && !enableForGame())) {
                return false;
            }
        }
        if (getResizable() || aVar.mo117405b()) {
            return false;
        }
        if (C89923l.f258408a.mo117502h()) {
            return true;
        }
        return super.shouldInLargeScreenCompatMode();
    }
}
