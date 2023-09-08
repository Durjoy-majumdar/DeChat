package com.tencent.xweb.util;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.xweb.internal.ConstValue;
import org.xwalk.core.XWalkEnvironment;

public class CachedSystemBuildInfo {
    public static final String Tag = "CachedSystemBuildInfo";
    private static String sBrand;
    private static String sManufacturer;
    private static String sModel;

    public static String getBrand() {
        if (TextUtils.isEmpty(sBrand)) {
            sBrand = Build.BRAND;
        }
        return sBrand;
    }

    public static String getManufacturer() {
        if (TextUtils.isEmpty(sManufacturer)) {
            sManufacturer = Build.MANUFACTURER;
        }
        return sManufacturer;
    }

    public static String getModel() {
        if (TextUtils.isEmpty(sModel)) {
            String initConfig = XWalkEnvironment.getInitConfig("packageName", (String) null);
            if (initConfig == null) {
                sModel = Build.MODEL;
                XWebLog.m21913w(Tag, "device model, package name not available in init args, use Build.MODEL:" + sModel);
            } else if ("com.tencent.mm".equals(initConfig)) {
                String initConfig2 = XWalkEnvironment.getInitConfig(ConstValue.INIT_CONFIG_KEY_DEVICE_MODEL, (String) null);
                if (initConfig2 != null) {
                    sModel = initConfig2;
                    XWebLog.m21911i(Tag, "device model from init args:" + sModel);
                } else {
                    sModel = Build.MODEL;
                    XWebLog.m21913w(Tag, "device model, not available in init args, use Build.MODEL:" + sModel);
                }
            } else {
                sModel = Build.MODEL;
                XWebLog.m21913w(Tag, "device model, not in wechat app, use Build.MODEL:" + sModel);
            }
        }
        return sModel;
    }
}
