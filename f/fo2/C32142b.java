package fo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;

/* renamed from: fo2.b */
public class C32142b {
    /* renamed from: a */
    public static Object m39633a(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, objArr);
                SnsMethodCalculate.markEndTimeMs("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
                return invoke;
            }
        } catch (Exception e) {
            Log.m105920e("AdDeviceInfo.ua.ReflectUtils", "invokeStaticMethod exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("invokeStaticMethod", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ReflectUtils");
        return null;
    }
}
