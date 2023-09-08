package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.d */
public final class C1520d {

    /* renamed from: a */
    public static final C1520d f10881a = new C1520d();

    /* renamed from: b */
    public static final C32227p<Long, String, String> f10882b = C1522b.f10886d;

    /* renamed from: c */
    public static final C32227p<Long, String, String> f10883c = C1521a.f10885d;

    /* renamed from: d */
    public static final MultiProcessMMKV f10884d = MultiProcessMMKV.getMMKV("AppBrandEncryptMMKVStorageDirtyDataFixer");

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.d$a */
    public static final class C1521a extends C87413o implements C32227p<Long, String, String> {

        /* renamed from: d */
        public static final C1521a f10885d = new C1521a();

        public C1521a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "appId");
            return longValue + '#' + str + "#had_been_cleaned_dirty";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.d$b */
    public static final class C1522b extends C87413o implements C32227p<Long, String, String> {

        /* renamed from: d */
        public static final C1522b f10886d = new C1522b();

        public C1522b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "appId");
            return longValue + '#' + str + "#is_dirty";
        }
    }

    /* renamed from: a */
    public final void mo1533a(long j, String str) {
        C87412m.m108594g(str, "appId");
        f10884d.putBoolean((String) ((C1522b) f10882b).invoke(Long.valueOf(j), str), false);
        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[unmarkDirty] uin[" + j + "] appId[" + str + ']');
    }
}
