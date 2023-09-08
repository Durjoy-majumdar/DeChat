package eo2;

import android.provider.Settings;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: eo2.c */
public class C45680c {

    /* renamed from: a */
    public static int f123483a = 0;

    /* renamed from: b */
    public static String f123484b = "";

    /* renamed from: a */
    public static String m50873a(String str) {
        SnsMethodCalculate.markStartTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (m50875c()) {
                if (!Util.isNullOrNil(f123484b)) {
                    String str2 = f123484b;
                    SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return str2;
                } else if (Util.isNullOrNil(str)) {
                    Log.m105920e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: this aPhone supports HarmonyOS but propertyName is null or nil");
                    SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return "0.0.0";
                } else {
                    f123484b = "0.0.0";
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    String str3 = (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
                    if (!Util.isNullOrNil(str3)) {
                        f123484b = str3;
                    } else {
                        Log.m105920e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", this aPhone supports HarmonyOS but harmonyOSVersion is null or nil");
                    }
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", " + th.toString());
        }
        String str4 = f123484b;
        SnsMethodCalculate.markEndTimeMs("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return str4;
    }

    /* renamed from: b */
    public static int m50874b() {
        SnsMethodCalculate.markStartTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (m50875c()) {
                int i = Settings.Secure.getInt(MMApplicationContext.getContext().getContentResolver(), "pure_mode_state", -1);
                SnsMethodCalculate.markEndTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return i;
            }
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getPureMode: " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return -1;
    }

    /* renamed from: c */
    public static boolean m50875c() {
        SnsMethodCalculate.markStartTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            int i = f123483a;
            if (i == 1) {
                SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return true;
            } else if (i == 2) {
                SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return false;
            } else {
                f123483a = 2;
                Object d = m50876d("com.huawei.system.BuildEx", "getOsBrand");
                if (d instanceof String) {
                    String str = (String) d;
                    if (Util.isNullOrNil(str) || !"harmony".equals(str)) {
                        Log.m105924i("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: this aPhone not supports HarmonyOS and osNameStr is " + str);
                    } else {
                        f123483a = 1;
                        SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                        return true;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return false;
            }
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: " + th.toString());
        }
    }

    /* renamed from: d */
    public static Object m50876d(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            Object invoke = Class.forName(str).getMethod(str2, new Class[0]).invoke((Object) null, new Object[0]);
            SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return invoke;
        } catch (ClassNotFoundException e) {
            Log.m105921e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", e);
            SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        } catch (Throwable th) {
            Log.m105921e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", th);
            SnsMethodCalculate.markEndTimeMs("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        }
    }
}
