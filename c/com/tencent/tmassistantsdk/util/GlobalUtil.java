package com.tencent.tmassistantsdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p385u2.C111105a;

public class GlobalUtil {
    public static final int NET_TYPE_WIFI = 4;
    public static final String SharedPreferencesName = "TMAssistantSDKSharedPreference";
    private static final String TAG = "GlobalUtil";
    public static GlobalUtil mInstance;
    public static int mMemUUID;
    public final int JCE_CMDID_Empty = 0;
    public final int JCE_CMDID_GetAppSimpleDetail = 5;
    public final int JCE_CMDID_GetAppUpdate = 3;
    public final int JCE_CMDID_GetAuthorized = 4;
    public final int JCE_CMDID_GetSettings = 2;
    public final int JCE_CMDID_ReportLog = 1;
    public Context mContext;
    public HashMap<Integer, String> mJCECmdIdMap = null;
    public String mQUA = "";

    public GlobalUtil() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        this.mJCECmdIdMap = hashMap;
        hashMap.put(1, "ReportLog");
        this.mJCECmdIdMap.put(2, "GetSettings");
        this.mJCECmdIdMap.put(3, "GetAppUpdate");
        this.mJCECmdIdMap.put(4, "GetAuthorized");
        this.mJCECmdIdMap.put(5, "GetAppSimpleDetail");
    }

    public static ArrayList<String> String2List(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static int assistantErrorCode2SDKErrorCode(int i) {
        if (i == -1000) {
            return 604;
        }
        if (i == -16) {
            return 731;
        }
        if (i == -15) {
            return 1;
        }
        if (i == -1) {
            return 709;
        }
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case -28:
                return 701;
            case -27:
                return 606;
            case -26:
            case -24:
                return 604;
            case -25:
                return 602;
            case -23:
                return 601;
            case -22:
                return TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
            case -21:
                return 700;
            default:
                switch (i) {
                    case -13:
                        return 703;
                    case -12:
                        return TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH;
                    case -11:
                        return 708;
                    default:
                        return 604;
                }
        }
    }

    public static int assistantState2SDKState(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 4;
        }
        if (i != 6) {
            return i != 9 ? 0 : 6;
        }
        return 1;
    }

    public static String calcMD5AsString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString(b & ExifInterface.MARKER));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return "";
        }
    }

    public static void deleteOldDB(String str) {
        if (getInstance().getContext() != null) {
            C86009m1 c = C86009m1.m106378c(getInstance().getContext().getDatabasePath(str));
            if (c.mo119967g()) {
                try {
                    c.mo119966f();
                    TMLog.m164114i(TAG, "deleteDB");
                } catch (Exception unused) {
                    TMLog.m164114i(TAG, "deleteDB failed");
                }
            }
        }
    }

    public static String getAppPackageName(Context context) {
        return context != null ? context.getPackageName() : "";
    }

    public static int getAppVersionCode(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return 0;
    }

    public static synchronized GlobalUtil getInstance() {
        GlobalUtil globalUtil;
        synchronized (GlobalUtil.class) {
            if (mInstance == null) {
                mInstance = new GlobalUtil();
            }
            globalUtil = mInstance;
        }
        return globalUtil;
    }

    public static synchronized int getMemUUID() {
        int i;
        synchronized (GlobalUtil.class) {
            i = mMemUUID;
            mMemUUID = i + 1;
        }
        return i;
    }

    public static boolean isDBExist(String str) {
        return getInstance().getContext() != null && C86009m1.m106378c(getInstance().getContext().getDatabasePath(str)).mo119967g();
    }

    public static void updateFilePathAuthorized(String str) {
        C86009m1 m1Var = new C86009m1(str);
        String k = m1Var.mo119973k();
        String k2 = new C86009m1(k).mo119973k();
        String k3 = new C86009m1(k2).mo119973k();
        try {
            Runtime.getRuntime().exec("chmod 777 " + m1Var.mo119971i());
            Runtime.getRuntime().exec("chmod 777 " + k);
            Runtime.getRuntime().exec("chmod 777 " + k2);
            Runtime.getRuntime().exec("chmod 777" + k3);
        } catch (IOException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public boolean canReportValue() {
        return false;
    }

    public void destroy() {
        this.mContext = null;
        mInstance = null;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getJceCmdIdByClassName(String str) {
        HashMap<Integer, String> hashMap;
        if (!(str == null || (hashMap = this.mJCECmdIdMap) == null)) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (next != null) {
                    Integer num = (Integer) next.getKey();
                    String str2 = (String) next.getValue();
                    if (str2 != null && str2.equals(str)) {
                        return num.intValue();
                    }
                }
            }
        }
        return 0;
    }

    public String getNetworkOperator() {
        Context context = this.mContext;
        return context == null ? "" : ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
    }

    public int getNetworkType() {
        Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            if (C111105a.m151499a(context, "android.permission.READ_PHONE_STATE") == 0) {
                return ((TelephonyManager) this.mContext.getSystemService("phone")).getNetworkType();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.getSharedPreferences(SharedPreferencesName, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getPhoneGuid() {
        /*
            r4 = this;
            android.content.Context r0 = r4.mContext
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            r2 = 0
            java.lang.String r3 = "TMAssistantSDKSharedPreference"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = "TMAssistantSDKPhoneGUID"
            java.lang.String r0 = r0.getString(r2, r1)
            return r0
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.util.GlobalUtil.getPhoneGuid():java.lang.String");
    }

    public int getQQDownloaderAPILevel() {
        Bundle bundle;
        Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 0;
        }
    }

    public int getQQDownloaderVersionCode() {
        PackageManager packageManager;
        Context context = this.mContext;
        if (!(context == null || (packageManager = context.getPackageManager()) == null)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0);
                if (packageInfo == null) {
                    return 0;
                }
                return packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return 0;
    }

    public void setContext(Context context) {
        this.mContext = context;
        this.mQUA = new QUASetting(context).buildQUA();
    }

    public void setNetTypeValue(byte b) {
        SharedPreferences sharedPreferences;
        Context context = this.mContext;
        if (context != null && (sharedPreferences = context.getSharedPreferences(SharedPreferencesName, 0)) != null && Byte.parseByte(sharedPreferences.getString("TMAssistantSDKNetType", "0")) != b) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("TMAssistantSDKNetType", b + "").commit();
        }
    }

    public void setPhoneGuid(String str) {
        SharedPreferences sharedPreferences;
        Context context = this.mContext;
        if (context != null && str != null && (sharedPreferences = context.getSharedPreferences(SharedPreferencesName, 0)) != null) {
            sharedPreferences.edit().putString("TMAssistantSDKPhoneGUID", str).commit();
        }
    }
}
