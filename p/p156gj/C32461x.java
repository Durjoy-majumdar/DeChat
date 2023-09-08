package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gj.x */
public class C32461x {
    /* renamed from: a */
    public static boolean m39732a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            String str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            Log.m105925i("MicroMsg.HarmonyOSHelper", "OsBrand: %s", str);
            return "harmony".equals(str);
        } catch (ClassNotFoundException unused) {
            Log.m105920e("MicroMsg.HarmonyOSHelper", "occured ClassNotFoundException");
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.m105920e("MicroMsg.HarmonyOSHelper", "occured NoSuchMethodException");
            return false;
        } catch (Exception unused3) {
            Log.m105920e("MicroMsg.HarmonyOSHelper", "occur other problem");
            return false;
        }
    }
}
