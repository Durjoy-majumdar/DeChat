package ux0;

import a14.C0000n0;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j00.C46392g;
import js0.C88016e;
import kj2.C117407d;
import rx3.C13598b0;
import s73.C48262e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.game.jsapi.adapter.GamePrefetchJsCoreAdapter$init$1", mo125469f = "GamePrefetchJsCoreAdapter.kt", mo125470l = {55, 56, 59, 62, 63}, mo125471m = "invokeSuspend")
/* renamed from: ux0.c */
public final class C52631c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f146952d;

    /* renamed from: e */
    public final /* synthetic */ C48262e f146953e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<Boolean, String, C13598b0> f146954f;

    /* renamed from: g */
    public final /* synthetic */ String f146955g;

    /* renamed from: ux0.c$a */
    public static final class C37604a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C37604a f99718d = new C37604a();

        public C37604a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] initJsContext inject LuggageBridge.js result: " + str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ux0.c$b */
    public static final class C37605b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C37605b f99719d = new C37605b();

        public C37605b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] initJsContext inject luggage_mm_adapter.js result: " + str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ux0.c$c */
    public static final class C37606c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C37606c f99720d = new C37606c();

        public C37606c() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] set System.launchScene = 0: " + str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ux0.c$d */
    public static final class C52632d implements C46392g.C46393a {

        /* renamed from: a */
        public final /* synthetic */ C48262e f146956a;

        /* renamed from: b */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f146957b;

        /* renamed from: c */
        public final /* synthetic */ String f146958c;

        /* renamed from: ux0.c$d$a */
        public static final class C37607a<T> implements ValueCallback {

            /* renamed from: a */
            public final /* synthetic */ C32227p<Boolean, String, C13598b0> f99721a;

            /* renamed from: b */
            public final /* synthetic */ String f99722b;

            public C37607a(C32227p<? super Boolean, ? super String, C13598b0> pVar, String str) {
                this.f99721a = pVar;
                this.f99722b = str;
            }

            public void onReceiveValue(Object obj) {
                Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] initJsContext inject gamecenter_jscore.js result: " + ((String) obj));
                this.f99721a.invoke(Boolean.TRUE, this.f99722b);
            }
        }

        public C52632d(C48262e eVar, C32227p<? super Boolean, ? super String, C13598b0> pVar, String str) {
            this.f146956a = eVar;
            this.f146957b = pVar;
            this.f146958c = str;
        }

        /* renamed from: a */
        public final void mo71798a(String str) {
            ((C46392g) C86312j.m106911c(C46392g.class)).destroy();
            if ((str == null || str.length() == 0) || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                String decodeString = MultiProcessMMKV.getSingleMMKV("brandService").decodeString("GameCenterJsPath");
                if (decodeString == null) {
                    decodeString = "";
                }
                str = decodeString.length() > 0 ? C86013q1.m106432N(decodeString) : C88016e.m109548e("gamecenter_jscore.js");
            }
            try {
                C37607a aVar = new C37607a(this.f146957b, this.f146958c);
                C40480g gVar = C52633e.f146960e;
                if (gVar != null) {
                    gVar.evaluateJavascript(str, aVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GamePrefetchJsCoreAdapter", e, "[game-web-prefetch] inject gamecenter_jscore.js excpetion", new Object[0]);
                this.f146956a.mo73005a(new C48262e.C48268f());
                String str2 = C52633e.f146962g;
                String str3 = C52633e.f146963h;
                String message = e.getMessage();
                C117407d.INSTANCE.mo160131h(20821, str2, str3, message != null ? C112551y.m153815o(message, ',', '.', false, 4, (Object) null) : null);
                this.f146957b.invoke(Boolean.FALSE, this.f146958c);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52631c(C48262e eVar, C32227p<? super Boolean, ? super String, C13598b0> pVar, String str, C15601d<? super C52631c> dVar) {
        super(2, dVar);
        this.f146953e = eVar;
        this.f146954f = pVar;
        this.f146955g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52631c(this.f146953e, this.f146954f, this.f146955g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52631c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4 A[Catch:{ Exception -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[Catch:{ Exception -> 0x0034 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[Catch:{ Exception -> 0x0034 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[Catch:{ Exception -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00df A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f146952d
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r6) goto L_0x0030
            if (r1 == r5) goto L_0x002c
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0123
        L_0x001a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x0034 }
            goto L_0x00be
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x0034 }
            goto L_0x00b3
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0088
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x0034 }
            goto L_0x005d
        L_0x0034:
            r14 = move-exception
            goto L_0x00e0
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r14 = "var global = this; var self = this;"
            r13.f146952d = r6     // Catch:{ Exception -> 0x0034 }
            ux0.a r1 = ux0.C14389a.f39961d     // Catch:{ Exception -> 0x0034 }
            wx3.h r7 = new wx3.h     // Catch:{ Exception -> 0x0034 }
            wx3.d r8 = xx3.C66447b.m78392b(r13)     // Catch:{ Exception -> 0x0034 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0034 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r8 = ux0.C52633e.f146960e     // Catch:{ Exception -> 0x0034 }
            if (r8 == 0) goto L_0x0056
            ux0.b r9 = new ux0.b     // Catch:{ Exception -> 0x0034 }
            r9.<init>(r1, r7)     // Catch:{ Exception -> 0x0034 }
            r8.evaluateJavascript(r14, r9)     // Catch:{ Exception -> 0x0034 }
        L_0x0056:
            java.lang.Object r14 = r7.mo90314b()     // Catch:{ Exception -> 0x0034 }
            if (r14 != r0) goto L_0x005d
            return r0
        L_0x005d:
            java.lang.String r14 = "LuggageBridge.js"
            java.lang.String r14 = js0.C88016e.m109548e(r14)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = "getAssetAsString(\"LuggageBridge.js\")"
            gy3.C87412m.m108593f(r14, r1)     // Catch:{ Exception -> 0x0034 }
            ux0.c$a r1 = ux0.C52631c.C37604a.f99718d     // Catch:{ Exception -> 0x0034 }
            r13.f146952d = r5     // Catch:{ Exception -> 0x0034 }
            wx3.h r7 = new wx3.h     // Catch:{ Exception -> 0x0034 }
            wx3.d r8 = xx3.C66447b.m78392b(r13)     // Catch:{ Exception -> 0x0034 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0034 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r8 = ux0.C52633e.f146960e     // Catch:{ Exception -> 0x0034 }
            if (r8 == 0) goto L_0x0081
            ux0.b r9 = new ux0.b     // Catch:{ Exception -> 0x0034 }
            r9.<init>(r1, r7)     // Catch:{ Exception -> 0x0034 }
            r8.evaluateJavascript(r14, r9)     // Catch:{ Exception -> 0x0034 }
        L_0x0081:
            java.lang.Object r14 = r7.mo90314b()     // Catch:{ Exception -> 0x0034 }
            if (r14 != r0) goto L_0x0088
            return r0
        L_0x0088:
            java.lang.String r14 = "luggage_mm_adapter.js"
            java.lang.String r14 = js0.C88016e.m109548e(r14)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r1 = "getAssetAsString(\"luggage_mm_adapter.js\")"
            gy3.C87412m.m108593f(r14, r1)     // Catch:{ Exception -> 0x0034 }
            ux0.c$b r1 = ux0.C52631c.C37605b.f99719d     // Catch:{ Exception -> 0x0034 }
            r13.f146952d = r4     // Catch:{ Exception -> 0x0034 }
            wx3.h r7 = new wx3.h     // Catch:{ Exception -> 0x0034 }
            wx3.d r8 = xx3.C66447b.m78392b(r13)     // Catch:{ Exception -> 0x0034 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0034 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r8 = ux0.C52633e.f146960e     // Catch:{ Exception -> 0x0034 }
            if (r8 == 0) goto L_0x00ac
            ux0.b r9 = new ux0.b     // Catch:{ Exception -> 0x0034 }
            r9.<init>(r1, r7)     // Catch:{ Exception -> 0x0034 }
            r8.evaluateJavascript(r14, r9)     // Catch:{ Exception -> 0x0034 }
        L_0x00ac:
            java.lang.Object r14 = r7.mo90314b()     // Catch:{ Exception -> 0x0034 }
            if (r14 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            ux0.e r14 = ux0.C52633e.f146959d     // Catch:{ Exception -> 0x0034 }
            r13.f146952d = r3     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r14 = ux0.C52633e.m58972a(r14, r13)     // Catch:{ Exception -> 0x0034 }
            if (r14 != r0) goto L_0x00be
            return r0
        L_0x00be:
            java.lang.String r14 = "SystemInfo.launchScene = 0;"
            ux0.c$c r1 = ux0.C52631c.C37606c.f99720d     // Catch:{ Exception -> 0x0034 }
            r13.f146952d = r2     // Catch:{ Exception -> 0x0034 }
            wx3.h r2 = new wx3.h     // Catch:{ Exception -> 0x0034 }
            wx3.d r3 = xx3.C66447b.m78392b(r13)     // Catch:{ Exception -> 0x0034 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0034 }
            com.tencent.mm.plugin.appbrand.jsruntime.g r3 = ux0.C52633e.f146960e     // Catch:{ Exception -> 0x0034 }
            if (r3 == 0) goto L_0x00d9
            ux0.b r7 = new ux0.b     // Catch:{ Exception -> 0x0034 }
            r7.<init>(r1, r2)     // Catch:{ Exception -> 0x0034 }
            r3.evaluateJavascript(r14, r7)     // Catch:{ Exception -> 0x0034 }
        L_0x00d9:
            java.lang.Object r14 = r2.mo90314b()     // Catch:{ Exception -> 0x0034 }
            if (r14 != r0) goto L_0x0123
            return r0
        L_0x00e0:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "MicroMsg.GamePrefetchJsCoreAdapter"
            java.lang.String r3 = "[game-web-prefetch] inject luggage excpetion"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r14, r3, r1)
            s73.e r1 = r13.f146953e
            s73.e$f r2 = new s73.e$f
            r2.<init>()
            r1.mo73005a(r2)
            java.lang.String r1 = ux0.C52633e.f146962g
            java.lang.String r2 = ux0.C52633e.f146963h
            java.lang.String r7 = r14.getMessage()
            if (r7 == 0) goto L_0x010a
            r8 = 44
            r9 = 46
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r14 = z04.C112551y.m153815o(r7, r8, r9, r10, r11, r12)
            goto L_0x010b
        L_0x010a:
            r14 = 0
        L_0x010b:
            kj2.d r3 = kj2.C117407d.INSTANCE
            r7 = 20821(0x5155, float:2.9176E-41)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            r4[r6] = r2
            r4[r5] = r14
            r3.mo160131h(r7, r4)
            fy3.p<java.lang.Boolean, java.lang.String, rx3.b0> r14 = r13.f146954f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = r13.f146955g
            r14.invoke(r0, r1)
        L_0x0123:
            java.lang.Class<j00.g> r14 = j00.C46392g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            j00.g r14 = (j00.C46392g) r14
            ux0.c$d r0 = new ux0.c$d
            s73.e r1 = r13.f146953e
            fy3.p<java.lang.Boolean, java.lang.String, rx3.b0> r2 = r13.f146954f
            java.lang.String r3 = r13.f146955g
            r0.<init>(r1, r2, r3)
            r14.mo71796IE(r0)
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.C52631c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
