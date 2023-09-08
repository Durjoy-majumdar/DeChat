package ka0;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;

/* renamed from: ka0.j */
public final class C33855j {

    /* renamed from: a */
    public static final C33855j f91497a = new C33855j();

    /* renamed from: a */
    public final MultiProcessMMKV mo59329a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_sdk");
        C87412m.m108593f(mmkv, "getMMKV(kvName)");
        return mmkv;
    }

    /* renamed from: b */
    public final String mo59330b() {
        String string = mo59329a().getString("KEY_SDK_SHA1", "");
        return string == null ? "" : string;
    }

    /* renamed from: c */
    public final boolean mo59331c() {
        return mo59329a().getLong("KEY_SDK_UPDATE_TIME", 0) < mo59329a().getLong("KEY_RES_UPDATE_TIME", 0);
    }
}
