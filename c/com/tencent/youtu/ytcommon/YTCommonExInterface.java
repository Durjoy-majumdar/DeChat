package com.tencent.youtu.ytcommon;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import java.lang.reflect.Method;

public class YTCommonExInterface {
    private static final String TAG = "YTUtilityInterface";
    public static final String VERSION = "3.2.3";
    public static Method commonSoInitAuth;
    private static int mBusinessCode;

    public interface BUSINESS_CODE {
        public static final int YT_COMMON = 0;
        public static final int YT_WX = 1;
    }

    public static int getBusinessCode() {
        return mBusinessCode;
    }

    public static float setAppBrightness(Activity activity, int i) {
        YTLogger.m144668i(TAG, "[YTUtilityInterface.setAppBrightness] brightness: " + i);
        try {
            if (!activity.isDestroyed()) {
                if (!activity.isFinishing()) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i == -1) {
                        attributes.screenBrightness = -1.0f;
                    } else {
                        if (i <= 0) {
                            i = 1;
                        }
                        attributes.screenBrightness = ((float) i) / 255.0f;
                    }
                    float f = attributes.screenBrightness;
                    window.setAttributes(attributes);
                    return f;
                }
            }
            return -1.0f;
        } catch (Exception e) {
            YTLogger.m144667e(TAG, "set appbrightness failed :" + e.getLocalizedMessage());
            return -1.0f;
        }
    }

    public static void setBusinessCode(int i) {
        mBusinessCode = i;
    }

    public static void setIsEnabledLog(boolean z) {
        YTLogger.setIsEnabledLog(z);
    }

    public static void setIsEnabledNativeLog(boolean z) {
        YTLogger.setIsEnabledNativeLog(z);
    }

    public static void setLogger(YTLogger.IFaceLiveLogger iFaceLiveLogger) {
        YTLogger.setLog(iFaceLiveLogger);
    }
}
