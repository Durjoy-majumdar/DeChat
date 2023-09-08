package com.tencent.tav;

import android.text.TextUtils;
import com.tencent.tav.decoder.logger.Logger;

public class ResourceLoadUtil {
    public static final String TAG = "ResourceLoadUtil";
    private static boolean success;

    public static boolean isLoaded() {
        return success;
    }

    public static boolean loadSoSync(String str) {
        boolean z = success;
        if (z) {
            return z;
        }
        if (TextUtils.isEmpty(str)) {
            success = false;
            Logger.m144643e(TAG, "load so path is empty.");
            return success;
        }
        try {
            System.load(str);
            success = true;
            String str2 = TAG;
            Logger.m144641d(str2, "load " + str + ": " + success);
            return success;
        } catch (UnsatisfiedLinkError e) {
            success = false;
            String str3 = TAG;
            Logger.m144644e(str3, "loadSoSync: load soPath = " + str, (Throwable) e);
            Logger.m144641d(str3, "load " + str + ": " + success);
            return success;
        } catch (RuntimeException e2) {
            success = false;
            String str4 = TAG;
            Logger.m144644e(str4, "loadSoSync: load soPath = " + str, (Throwable) e2);
            Logger.m144641d(str4, "load " + str + ": " + success);
            return success;
        } catch (Exception e3) {
            success = false;
            String str5 = TAG;
            Logger.m144644e(str5, "loadSoSync: load soPath = " + str, (Throwable) e3);
            Logger.m144641d(str5, "load " + str + ": " + success);
            return success;
        } catch (Throwable unused) {
            String str6 = TAG;
            Logger.m144641d(str6, "load " + str + ": " + success);
            return success;
        }
    }

    public static void setLoaded(boolean z) {
        success = z;
    }
}
