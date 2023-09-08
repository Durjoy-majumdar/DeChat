package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.m0 */
public final class C29553m0 {

    /* renamed from: a */
    public static final C29553m0 f80469a = new C29553m0();

    /* renamed from: b */
    public static final C13601g f80470b = C36568h.m40985a(C29554a.f80474d);

    /* renamed from: c */
    public static final String f80471c = "--enable-wasm-in-lite-mode --lite-mode";

    /* renamed from: d */
    public static final String[] f80472d = {":appbrand0", ":appbrand2", ":appbrand3"};

    /* renamed from: e */
    public static final String[] f80473e = {":appbrand1", ":appbrand4"};

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.m0$a */
    public static final class C29554a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29554a f80474d = new C29554a();

        public C29554a() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
            if (r0 != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                com.tencent.mm.plugin.appbrand.jsruntime.m0 r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0.f80469a
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r1 = "clicfg_android_appbrand_enable_v8_lite"
                r2 = 0
                r3 = 1
                int r0 = r0.mo182443e(r1, r2, r3, r3)
                if (r3 != r0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "resolveEnable, enableExptVal1: "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "MicroMsg.AppBrand.WeAppV8LiteStrategy"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                if (r0 == 0) goto L_0x002c
                goto L_0x0090
            L_0x002c:
                boolean r0 = p156gj.C87203t.m108279o()
                if (r0 == 0) goto L_0x0038
                java.lang.String r0 = "resolveEnable, not 32bit runtime"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x0091
            L_0x0038:
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r1 = "clicfg_android_appbrand_enable_v8_lite_3g"
                int r0 = r0.mo182443e(r1, r3, r3, r3)
                if (r3 != r0) goto L_0x0046
                r0 = 1
                goto L_0x0047
            L_0x0046:
                r0 = 0
            L_0x0047:
                rx3.g r1 = kp0.C33964a.f91707a
                rx3.g r1 = kp0.C33964a.f91707a
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "resolveEnable, enableExptVal2: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = ", is3GUserSpace: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                if (r0 == 0) goto L_0x0078
                if (r1 == 0) goto L_0x0078
                goto L_0x0090
            L_0x0078:
                boolean r0 = p156gj.C32460a.f86250a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "resolveEnable, enableExptVal3: "
                r1.append(r5)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                if (r0 == 0) goto L_0x0091
            L_0x0090:
                r2 = 1
            L_0x0091:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0.C29554a.invoke():java.lang.Object");
        }
    }

    /* renamed from: a */
    public final boolean mo56808a() {
        boolean z = false;
        if (MMApplicationContext.isMainProcess()) {
            z = ((Boolean) ((C36570n) f80470b).getValue()).booleanValue();
            MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
            if (multiProcessMMKV != null) {
                multiProcessMMKV.encode("WeAppV8LiteStrategy#enableV8Lite", z);
            }
        } else if (mo56810c()) {
            MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
            if (multiProcessMMKV2 != null ? multiProcessMMKV2.getBoolean("WeAppV8LiteStrategy#enableV8Lite", false) : false) {
                z = true;
            }
        }
        Log.m105924i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enable#get, " + z);
        return z;
    }

    /* renamed from: b */
    public final boolean mo56809b() {
        boolean z = mo56810c() && mo56808a();
        Log.m105924i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enableForMe#get, " + z);
        return z;
    }

    /* renamed from: c */
    public final boolean mo56810c() {
        String str;
        String[] strArr = f80472d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = null;
            if (i >= length) {
                break;
            }
            String str2 = strArr[i];
            String processName = MMApplicationContext.getProcessName();
            C87412m.m108593f(processName, "getProcessName()");
            C87412m.m108593f(str2, LocaleUtil.ITALIAN);
            if (C112551y.m153808h(processName, str2, false, 2, (Object) null)) {
                str = str2;
                break;
            }
            i++;
        }
        return str != null;
    }
}
