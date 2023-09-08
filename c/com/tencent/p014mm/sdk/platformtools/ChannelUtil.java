package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.ChannelUtil */
public final class ChannelUtil {
    public static final int AUTO_ADD_ACOUNT_BIND_MOBILE = 1;
    public static final int AUTO_ADD_ACOUNT_NOT_ADD = 0;
    public static final int AUTO_ADD_ACOUNT_NOT_BIND_MOBILE = 2;
    public static final int CHANNEL_ID_CROWDTEST = 1001;
    public static final int CHANNEL_ID_GP = 1;
    public static final int CHANNEL_ID_INVAILD = -1;
    public static final int CHANNEL_ID_OFFICIAL = 0;
    public static final int FLAG_NULL = 0;
    public static final int FLAG_UPDATE_EXTERNAL = 1;
    public static final int FLAG_UPDATE_NOTIP = 2;
    private static final String TAG = "MicroMsg.SDK.ChannelUtil";
    public static int autoAddAccount;
    public static int buildRev = 0;
    public static int channelId;
    public static boolean fullVersionInfo = false;
    public static int historyChannelId;
    public static boolean isNokiaAol = false;
    public static boolean isShowingGprsAlert = true;
    public static String marketURL = ("market://details?id=" + MMApplicationContext.getPackageName());
    public static String profileDeviceType = ("" + Build.VERSION.SDK_INT);
    public static boolean shouldShowGprsAlert = false;
    public static int updateMode;

    private ChannelUtil() {
    }

    public static String formatVersion(Context context, int i) {
        return formatVersion(context, i, fullVersionInfo);
    }

    private static String formatVersionImpl(Context context, int i, boolean z) {
        String str;
        int i2 = (i >> 8) & 255;
        if (i2 == 0) {
            str = "" + ((i >> 24) & 15) + "." + ((i >> 16) & 255);
        } else {
            str = "" + ((i >> 24) & 15) + "." + ((i >> 16) & 255) + "." + i2;
        }
        Log.m105918d(TAG, "minminor " + i2);
        int i3 = i & 268435455;
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    i3 = packageInfo.versionCode;
                    str = packageInfo.versionName;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        if (z) {
            String str2 = str + "_" + i3;
            Log.m105918d(TAG, "full version: " + str2);
            return str2;
        }
        String[] split = str.split("\\.");
        if (split == null || split.length < 4) {
            return str;
        }
        String str3 = split[0] + "." + split[1];
        if (split[2].trim().equals("0")) {
            return str3;
        }
        return str3 + "." + split[2];
    }

    public static boolean isCrowdTestVersion() {
        return channelId == 1001;
    }

    public static boolean isGPVersion() {
        return WeChatSomeFeatureSwitch.forceGooglePlayChannel() || channelId == 1;
    }

    public static void loadProfile(Context context) {
        try {
            Map<String, String> parse = IniParser.parse(Util.convertStreamToString(context.getAssets().open("profile.ini")));
            String nullAsNil = Util.nullAsNil(parse.get("PROFILE_DEVICE_TYPE"));
            profileDeviceType = nullAsNil;
            if (nullAsNil.length() <= 0) {
                profileDeviceType = "" + Build.VERSION.SDK_INT;
            }
            if (parseInt(parse.get("UPDATE_MODE")) != 0) {
                updateMode = parseInt(parse.get("UPDATE_MODE"));
            }
            buildRev = parseInt(parse.get("BUILD_REVISION"));
            shouldShowGprsAlert = parseBoolean(parse.get("GPRS_ALERT"));
            autoAddAccount = parseInt(parse.get("AUTO_ADD_ACOUNT"));
            isNokiaAol = parseBoolean(parse.get("NOKIA_AOL"));
            Log.m105928w(TAG, "profileDeviceType=" + profileDeviceType);
            Log.m105928w(TAG, "updateMode=" + updateMode);
            Log.m105928w(TAG, "shouldShowGprsAlert=" + shouldShowGprsAlert);
            Log.m105928w(TAG, "autoAddAccount=" + autoAddAccount);
            Log.m105928w(TAG, "isNokiaol=" + isNokiaAol);
            String str = parse.get("MARKET_URL");
            if (!(str == null || str.trim().length() == 0 || Uri.parse(str) == null)) {
                marketURL = str;
            }
            Log.m105928w(TAG, "marketURL=" + marketURL);
        } catch (Exception e) {
            Log.m105920e(TAG, "setup profile from profile.ini failed");
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    private static boolean parseBoolean(String str) {
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            Log.m105928w(TAG, e.getMessage());
            return false;
        }
    }

    private static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            Log.m105928w(TAG, e.getMessage());
            return 0;
        }
    }

    public static void setupChannelId(Context context) {
        try {
            int parseInt = Integer.parseInt(IniParser.parse(Util.convertStreamToString(context.getAssets().open("channel.ini"))).get("CHANNEL"));
            channelId = parseInt;
            if (parseInt == 1) {
                updateMode = 1;
            }
        } catch (Exception e) {
            Log.m105920e(TAG, "setup channel id from channel.ini failed");
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static String formatVersion(Context context, int i, boolean z) {
        if (!Util.isNullOrNil(BuildInfo.OVERRIDE_VERSION_NAME)) {
            return BuildInfo.OVERRIDE_VERSION_NAME;
        }
        return formatVersionImpl(context, i, z);
    }
}
