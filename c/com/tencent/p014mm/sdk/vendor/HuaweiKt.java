package com.tencent.p014mm.sdk.vendor;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/vendor/HuaweiKt;", "", "()V", "TAG", "", "hasHuaweiMagicWindowFeature", "", "Ljava/lang/Boolean;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.vendor.HuaweiKt */
public final class HuaweiKt {
    public static final HuaweiKt INSTANCE = new HuaweiKt();
    private static final String TAG = "MicroMsg.HuaweiKt";
    private static Boolean hasHuaweiMagicWindowFeature;

    private HuaweiKt() {
    }

    public static final boolean hasHuaweiMagicWindowFeature() {
        Boolean bool;
        Boolean bool2 = hasHuaweiMagicWindowFeature;
        if (bool2 != null) {
            C87412m.m108591d(bool2);
            return bool2.booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            Object invoke = cls.getMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}).invoke(cls.newInstance(), new Object[]{"ro.config.hw_magic_window_enable", Boolean.FALSE});
            C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        } catch (Throwable th) {
            Log.m105928w(TAG, "hasHuaweiMagicWindowFeature: " + th.getMessage());
            bool = Boolean.FALSE;
        }
        hasHuaweiMagicWindowFeature = bool;
        C87412m.m108591d(bool);
        return bool.booleanValue();
    }
}
