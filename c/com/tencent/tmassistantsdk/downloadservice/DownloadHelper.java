package com.tencent.tmassistantsdk.downloadservice;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import com.tencent.xweb.file.XVFSFile;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class DownloadHelper {
    public static final int PHONE = 1;
    public static final float SAVE_FATOR = 1.5f;
    public static final long SAVE_LENGTH = 104857600;
    public static final int SDCARD = 2;
    public static final String TAG = "DownloadHelper";
    public static final int UNKNOWN = 0;

    public static String correctFileName(String str) {
        return str.replace("?", "_").replace("*", "_").replace(" ", "_").replace("$", "_").replace("&", "_").replace("@", "_").replace("#", "_").replace("<", "_").replace(">", "_").replace("|", "_").replace(XVFSFile.PATH_SEPARATOR, "_").replace("/", "_").replace("\\", "_").replace(FastJsonResponse.QUOTE, "_");
    }

    public static String correctURL(String str) {
        String trim = str.replace("\r", "").replace("\n", "").trim();
        String str2 = new String(trim);
        try {
            Uri parse = Uri.parse(trim);
            String lastPathSegment = parse.getLastPathSegment();
            return (lastPathSegment == null || lastPathSegment.length() <= 0) ? str2 : str2.replace(lastPathSegment, URLEncoder.encode(parse.getLastPathSegment()).replace("+", "%20"));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return str2;
        }
    }

    public static String decodeFileName(String str) {
        if (str != null) {
            return URLDecoder.decode(str);
        }
        return null;
    }

    public static String genAPKFileName(String str) {
        if (!str.contains(".apk")) {
            return null;
        }
        String trim = str.trim().substring(str.lastIndexOf("/") + 1).trim();
        if (trim.contains("?")) {
            trim = trim.substring(0, trim.lastIndexOf("?"));
        }
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        String str2 = TAG;
        TMLog.m164114i(str2, "file name = " + trim);
        return renameAPKFileName(trim);
    }

    public static String generateFileNameFromURL(String str, String str2) {
        String str3;
        String calcMD5AsString = GlobalUtil.calcMD5AsString(str);
        if (TextUtils.isEmpty(calcMD5AsString)) {
            calcMD5AsString = Integer.toString(Math.abs(str.hashCode()));
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals("application/vnd.android.package-archive")) {
                str3 = ".apk";
            } else if (str2.equals("application/tm.android.apkdiff")) {
                str3 = ".diff";
            } else if (str2.equals("resource/tm.android.unknown")) {
                str3 = ".other";
            }
            return calcMD5AsString + str3;
        }
        str3 = "";
        return calcMD5AsString + str3;
    }

    public static synchronized String getNetStatus() {
        synchronized (DownloadHelper.class) {
            Context context = GlobalUtil.getInstance().getContext();
            if (context == null) {
                return "";
            }
            try {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return "";
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return "";
                }
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null) {
                    return "";
                }
                String lowerCase = extraInfo.toLowerCase();
                String str = TAG;
                TMLog.m164115v(str, "netInfo  =  " + lowerCase);
                return lowerCase;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static int getStorePosition(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null || !str.startsWith("/data")) {
            return TMAssistantFile.isSDCardExistAndCanWrite() ? 2 : 0;
        }
        return 1;
    }

    public static PowerManager.WakeLock getWakeLock() {
        return null;
    }

    public static boolean isDownloadFileExisted(String str, String str2) {
        try {
            return new C86009m1(TMAssistantFile.getSaveFilePath(generateFileNameFromURL(str, str2))).mo119967g();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return false;
        }
    }

    public static boolean isNetworkConncted() {
        if (GlobalUtil.getInstance().getContext() == null) {
            TMLog.m164116w(TAG, "GlobalUtil.getInstance().getContext() == null.");
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public static boolean isSpaceEnough(String str, long j) {
        int storePosition = getStorePosition(str);
        long j2 = 0;
        if (storePosition == 1) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long blockSize = ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
            if (blockSize >= 0) {
                j2 = blockSize;
            }
        } else if (storePosition != 2) {
            j2 = -1;
        } else if ("mounted".equals(Environment.getExternalStorageState())) {
            Uri n = C116299g2.m163858n(Environment.getExternalStorageDirectory().getPath());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            StatFs statFs2 = new StatFs(C116299g2.m163865u(n));
            long blockSize2 = ((long) statFs2.getBlockSize()) * (((long) statFs2.getAvailableBlocks()) - 4);
            if (blockSize2 >= 0) {
                j2 = blockSize2;
            }
        }
        long j3 = (long) (((float) j) * 1.5f);
        return j3 > SAVE_LENGTH ? j2 >= j3 : j2 >= SAVE_LENGTH;
    }

    public static boolean isValidURL(String str) {
        try {
            new URI(correctURL(str));
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public static String renameAPKFileName(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= 0 || lastIndexOf == str.length() - 1) {
            return str;
        }
        String[] strArr = {str.substring(0, lastIndexOf), str.substring(lastIndexOf, str.length())};
        int i = 0;
        do {
            if (i == 0) {
                str2 = str;
            } else {
                str2 = strArr[0] + "(" + i + ")" + strArr[1];
            }
            i++;
        } while (new C86009m1(TMAssistantFile.getSavePathRootDir() + "/" + str2).mo119967g());
        return str2;
    }

    public static boolean isDownloadFileExisted(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new C86009m1(TMAssistantFile.getSaveFilePath(str)).mo119967g();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return false;
        }
    }
}
