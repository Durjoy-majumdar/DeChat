package wi0;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: wi0.n */
public final class C90989n {

    /* renamed from: a */
    public static final MultiProcessMMKV f261076a = MultiProcessMMKV.getMMKV("com.tencent.mm.plugin.appbrand.config.AppDebugInfoHelper");

    /* renamed from: a */
    public static void m114156a(String str, boolean z) {
        MultiProcessMMKV multiProcessMMKV = f261076a;
        multiProcessMMKV.putBoolean(str + "_AppDebugEnabled", z).commit();
    }
}
