package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.app.o */
public final class C1510o {

    /* renamed from: a */
    public static final C1510o f10864a = new C1510o();

    /* renamed from: b */
    public static final C13601g f10865b = C36568h.m40985a(C1511a.f10866d);

    /* renamed from: com.tencent.mm.plugin.appbrand.app.o$a */
    public static final class C1511a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C1511a f10866d = new C1511a();

        public C1511a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C86718e.m107549h());
        }
    }

    /* renamed from: a */
    public final MultiProcessMMKV mo1516a() {
        return MultiProcessMMKV.getMMKV("AppBrandProcessSharedMMKV_" + mo1518c());
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo1517b(String str) {
        C87412m.m108594g(str, "name");
        return MultiProcessMMKV.getMMKV(str + '_' + mo1518c());
    }

    /* renamed from: c */
    public final int mo1518c() {
        return C86709a0.m107522a() ? C86709a0.m107523b().mo121110g() : ((Number) ((C36570n) f10865b).getValue()).intValue();
    }
}
