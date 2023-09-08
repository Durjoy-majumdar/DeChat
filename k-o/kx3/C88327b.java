package kx3;

import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.Arrays;
import java.util.HashMap;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: kx3.b */
public class C88327b implements MethodChannel.MethodCallHandler {

    /* renamed from: e */
    public static final String[] f255315e = new String[0];

    /* renamed from: d */
    public final PackageManager f255316d;

    public C88327b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f255316d = packageManager;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String[] strArr;
        if (methodCall.method.equals("getAndroidDeviceInfo")) {
            HashMap hashMap = new HashMap();
            hashMap.put("board", Build.BOARD);
            hashMap.put("bootloader", Build.BOOTLOADER);
            String str = Build.BRAND;
            hashMap.put("brand", str);
            String str2 = Build.DEVICE;
            hashMap.put(TPReportKeys.Common.COMMON_DEVICE_NAME, str2);
            hashMap.put("display", Build.DISPLAY);
            String str3 = Build.FINGERPRINT;
            hashMap.put(FingerprintManagerProxy.FINGERPRINT_SERVICE, str3);
            String str4 = Build.HARDWARE;
            hashMap.put("hardware", str4);
            hashMap.put("host", Build.HOST);
            hashMap.put("id", Build.ID);
            String str5 = Build.MANUFACTURER;
            hashMap.put("manufacturer", str5);
            String str6 = Build.MODEL;
            hashMap.put("model", str6);
            String str7 = Build.PRODUCT;
            hashMap.put("product", str7);
            hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
            hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
            hashMap.put("supportedAbis", Arrays.asList(Build.SUPPORTED_ABIS));
            hashMap.put("tags", Build.TAGS);
            hashMap.put("type", Build.TYPE);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!((str.startsWith("generic") && str2.startsWith("generic")) || str3.startsWith("generic") || str3.startsWith("unknown") || str4.contains("goldfish") || str4.contains("ranchu") || str6.contains("google_sdk") || str6.contains("Emulator") || str6.contains("Android SDK built for x86") || str5.contains("Genymotion") || str7.contains("sdk_google") || str7.contains("google_sdk") || str7.contains("sdk") || str7.contains("sdk_x86") || str7.contains("vbox86p") || str7.contains("emulator") || str7.contains("simulator"))));
            hashMap.put("androidId", "");
            FeatureInfo[] systemAvailableFeatures = this.f255316d.getSystemAvailableFeatures();
            if (systemAvailableFeatures == null) {
                strArr = f255315e;
            } else {
                String[] strArr2 = new String[systemAvailableFeatures.length];
                for (int i = 0; i < systemAvailableFeatures.length; i++) {
                    strArr2[i] = systemAvailableFeatures[i].name;
                }
                strArr = strArr2;
            }
            hashMap.put("systemFeatures", Arrays.asList(strArr));
            HashMap hashMap2 = new HashMap();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
            }
            hashMap2.put("codename", Build.VERSION.CODENAME);
            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
            hashMap2.put("release", Build.VERSION.RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(i2));
            hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, hashMap2);
            result.success(hashMap);
            return;
        }
        result.notImplemented();
    }
}
