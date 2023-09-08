package gh3;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;

/* renamed from: gh3.f */
public final class C32456f extends C116965a {
    /* renamed from: a */
    public String mo58628a() {
        return "com.android.internal.telephony.ITelephonyRegistry";
    }

    /* renamed from: b */
    public String mo58629b() {
        return "telephony.registry";
    }

    /* renamed from: d */
    public void mo58630d(Object obj) {
        Class<?> cls;
        C87412m.m108594g(obj, "service");
        if (Build.VERSION.SDK_INT < 29) {
            Field field = null;
            try {
                cls = Class.forName("android.telephony.TelephonyManager");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    field = cls.getDeclaredField("sRegistry");
                } catch (Throwable th) {
                    Log.m105924i("HookPhoneRegisterProcessor", "NoSuchFieldException: " + th.getMessage());
                }
            }
            Log.m105924i("HookPhoneRegisterProcessor", "TelephonyManager-sRegistry = " + field);
            Log.m105924i("HookPhoneRegisterProcessor", "mPmFidld = " + field);
            if (field != null) {
                field.setAccessible(true);
                field.set(cls, obj);
            }
        }
    }
}
