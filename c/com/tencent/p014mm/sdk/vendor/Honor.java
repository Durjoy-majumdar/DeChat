package com.tencent.p014mm.sdk.vendor;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/sdk/vendor/Honor;", "", "()V", "TAG", "", "isHONOR", "", "Ljava/lang/Boolean;", "ifHONOR", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.vendor.Honor */
public final class Honor {
    public static final Honor INSTANCE = new Honor();
    public static final String TAG = "MicroMsg.Vendor.Honor";
    private static Boolean isHONOR;

    private Honor() {
    }

    public final boolean ifHONOR() {
        if (isHONOR == null) {
            String str = Build.BRAND;
            String str2 = Build.MANUFACTURER;
            Log.m105924i(TAG, "Build.BRAND:" + str + ", manufacture:" + str2);
            boolean z = true;
            if (!C112551y.m153809i("HONOR", str, true) || !C112551y.m153809i("HONOR", str2, true)) {
                z = false;
            }
            isHONOR = Boolean.valueOf(z);
        }
        Boolean bool = isHONOR;
        C87412m.m108592e(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }
}
