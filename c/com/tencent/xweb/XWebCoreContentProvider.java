package com.tencent.xweb;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.xwalk.core.XWalkEnvironment;

public class XWebCoreContentProvider extends ContentProvider {
    private static final int ERRCODE_FAILED_ATTEMPT_OTHER_FILE = -7;
    private static final int ERRCODE_FAILED_CAN_NOT_GET_VERSION = -8;
    private static final int ERRCODE_FAILED_CONTEXT_INVALID = -2;
    private static final int ERRCODE_FAILED_CURRENT_NOT_PROVIDER = -3;
    private static final int ERRCODE_FAILED_FILELIST_NOT_EXIST = -4;
    private static final int ERRCODE_FAILED_FILE_NOT_EXIST = -6;
    private static final int ERRCODE_FAILED_READ_FILELIST_ERROR = -5;
    private static final int ERRCODE_FAILED_TARGET_VERSION_INSTALLING = -9;
    private static final int ERRCODE_FAILED_URI_INVALID = -1;
    private static final int ERRCODE_SUCCESS_GET_FILE = 0;
    private static final int ERRCODE_SUCCESS_GET_FILELIST = 1;
    private static final int ERRCODE_SUCCESS_TEST = 2;
    public static final String MM_PACKAGE_NAME = "com.tencent.mm";
    public static final int OP_TYPE_GET_FILE = 2;
    public static final int OP_TYPE_INVALID = -1;
    public static final int OP_TYPE_REPORT_KV = 3;
    public static final int OP_TYPE_TEST = 1;
    private static final String TAG = "XWebCoreContentProvider";
    public static final String URI_APPEND_STR = ".sdk.xweb.XWebCoreProvider";
    private static final int URI_MAX_LENGTH = 1000;
    public static final String[] XWALK_CORE_PROVIDER_LIST = {"com.tencent.mm"};
    private static AtomicBoolean sIsXWebInitFinished = new AtomicBoolean(false);
    private static AtomicLong sOperatingTimeStamp = new AtomicLong(0);

    public static class CachedInfoMgr {
        private static List<KVInfo> sCachedKVList = new ArrayList();
        private static final Object sLockObj = new Object();

        public static void add(KVInfo kVInfo) {
            synchronized (sLockObj) {
                sCachedKVList.add(kVInfo);
            }
        }

        public static void process() {
            XWebLog.m21911i(XWebCoreContentProvider.TAG, "CachedInfoMgr process cached info");
            synchronized (sLockObj) {
                for (KVInfo next : sCachedKVList) {
                    WXWebReporter.setKVLog(next.key, next.value);
                }
                sCachedKVList.clear();
            }
        }
    }

    public static class KVInfo {
        public int key = -1;
        public String value = "";
    }

    public static class ReportInfo {
        public String currentPackageName = "";
        public int errCode = -1;
        public UriInfo uriInfo = new UriInfo();
    }

    public static class UriInfo {
        public String callerName = "";
        public int opType = -1;
        public String targetFileName = "";
        public int targetVersion = 0;
    }

    public static Uri buildUri(String str, String str2, int i, int i2, String str3) {
        if (str2.isEmpty()) {
            str2 = " ";
        }
        if (i == 2) {
            return Uri.parse("content://" + str + URI_APPEND_STR + "/" + str2 + "/" + i + "/" + i2 + "/" + str3);
        }
        return Uri.parse("content://" + str + URI_APPEND_STR + "/" + str2 + "/" + i);
    }

    private static void doReport(Context context, ReportInfo reportInfo) {
        if (reportInfo != null) {
            String str = reportInfo.errCode + "," + (reportInfo.currentPackageName.length() > 100 ? reportInfo.currentPackageName.substring(0, 99) : reportInfo.currentPackageName) + "," + reportInfo.uriInfo.opType + "," + (reportInfo.uriInfo.callerName.length() > 100 ? reportInfo.uriInfo.callerName.substring(0, 99) : reportInfo.uriInfo.callerName) + "," + reportInfo.uriInfo.targetVersion + "," + (reportInfo.uriInfo.targetFileName.length() > 100 ? reportInfo.uriInfo.targetFileName.substring(0, 99) : reportInfo.uriInfo.targetFileName) + "," + XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion();
            if (context != null && !"com.tencent.mm".equals(reportInfo.currentPackageName)) {
                XWebLog.m21908d(TAG, "doReport need post to mm " + str);
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    XWebLog.m21909e(TAG, "doReport content resolver is null");
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(String.valueOf(WXWebReporter.WXWEB_KV_CORE_PROVIDER_OPENFILE), str);
                    contentResolver.insert(buildUri("com.tencent.mm", reportInfo.currentPackageName, 3, 0, ""), contentValues);
                } catch (Throwable unused) {
                    XWebLog.m21908d(TAG, "doReport error post to mm");
                }
            } else if (WXWebReporter.hasInit()) {
                XWebLog.m21908d(TAG, "doReport " + str);
                WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_CORE_PROVIDER_OPENFILE, str);
            } else {
                XWebLog.m21908d(TAG, "doReport reporter not init, cache " + str);
                KVInfo kVInfo = new KVInfo();
                kVInfo.key = WXWebReporter.WXWEB_KV_CORE_PROVIDER_OPENFILE;
                kVInfo.value = str;
                CachedInfoMgr.add(kVInfo);
            }
        }
    }

    public static boolean isBusy() {
        if (!sIsXWebInitFinished.get()) {
            XWebLog.m21911i(TAG, "isBusy = true, xweb not init yet");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - sOperatingTimeStamp.get();
        if (currentTimeMillis < 0 || currentTimeMillis > 10000) {
            XWebLog.m21911i(TAG, "isBusy = false");
            return false;
        }
        XWebLog.m21911i(TAG, "isBusy = true, is operating now");
        return true;
    }

    public static boolean isProvider(String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "isProvider, packageName is null or empty");
            return false;
        }
        for (String equals : XWALK_CORE_PROVIDER_LIST) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSelfProvider() {
        if (XWalkEnvironment.getApplicationContext() != null) {
            return isProvider(XWalkEnvironment.getApplicationContext().getPackageName());
        }
        XWebLog.m21909e(TAG, "isSelfProvider, sApplicationContext is null");
        return true;
    }

    public static void onXWebInitFinished() {
        XWebLog.m21911i(TAG, "onXWebInitFinished");
        CachedInfoMgr.process();
        sIsXWebInitFinished.set(true);
    }

    private static UriInfo parseUri(Uri uri) {
        int i;
        String str;
        UriInfo uriInfo = new UriInfo();
        uriInfo.opType = -1;
        String uri2 = uri.toString();
        if (uri2.length() > 1000) {
            XWebLog.m21908d(TAG, "parseUri exceed max length");
            return uriInfo;
        }
        XWebLog.m21908d(TAG, "parseUri " + uri2);
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 2) {
            XWebLog.m21908d(TAG, "parseUri strList invalid");
            return uriInfo;
        }
        String str2 = pathSegments.get(0);
        if (str2 == null || str2.isEmpty()) {
            XWebLog.m21908d(TAG, "parseUri callerName invalid");
            return uriInfo;
        }
        uriInfo.callerName = str2;
        try {
            int parseInt = Integer.parseInt(pathSegments.get(1));
            if (parseInt == 1 || parseInt == 3) {
                if (pathSegments.size() == 2) {
                    uriInfo.opType = parseInt;
                    XWebLog.m21908d(TAG, "parseUri result: " + parseInt);
                } else {
                    XWebLog.m21908d(TAG, "parseUri wrong params on test or report");
                }
                return uriInfo;
            } else if (parseInt == 2) {
                if (pathSegments.size() == 4) {
                    str = pathSegments.get(3);
                    try {
                        i = Integer.parseInt(pathSegments.get(2));
                    } catch (Throwable th) {
                        XWebLog.m21910e(TAG, "parseUri error parse targetVersion, error", th);
                    }
                } else {
                    str = "";
                    i = -1;
                }
                if (i == -1 || str == null || str.isEmpty()) {
                    XWebLog.m21908d(TAG, "parseUri wrong params on get file");
                } else {
                    uriInfo.opType = parseInt;
                    uriInfo.targetVersion = i;
                    uriInfo.targetFileName = str;
                    XWebLog.m21908d(TAG, "parseUri result: " + parseInt + " " + i + " " + str);
                }
                return uriInfo;
            } else {
                XWebLog.m21908d(TAG, "parseUri invalid opType");
                return uriInfo;
            }
        } catch (Throwable th4) {
            XWebLog.m21910e(TAG, "parseUri error parse opType, error", th4);
            return uriInfo;
        }
    }

    private static Map<String, String> readListConfigFile(File file) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.isEmpty()) {
                        String[] split = readLine.split(XVFSFile.PATH_SEPARATOR);
                        if (split.length == 2 && (str = split[0]) != null && !str.isEmpty() && (str2 = split[1]) != null && !str2.isEmpty()) {
                            hashMap.put(split[0], split[1]);
                            XWebLog.m21908d(TAG, "readListConfigFile found " + split[0]);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        XWebLog.m21909e(TAG, "readListConfigFile error: " + th);
                        return hashMap;
                    } finally {
                        FileUtils.tryClose(bufferedReader);
                    }
                }
            }
            FileUtils.tryClose(bufferedReader2);
        } catch (Throwable th4) {
            th = th4;
            XWebLog.m21909e(TAG, "readListConfigFile error: " + th);
            return hashMap;
        }
        return hashMap;
    }

    private static void tryRefillCallerName(Context context, UriInfo uriInfo) {
        try {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < packagesForUid.length; i++) {
                    if (i != packagesForUid.length - 1) {
                        sb.append(packagesForUid[i]);
                        sb.append("+");
                    } else {
                        sb.append(packagesForUid[i]);
                    }
                }
                String sb4 = sb.toString();
                if (!sb4.isEmpty()) {
                    uriInfo.callerName = sb4;
                }
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "tryRefillCallerName error", th);
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        sOperatingTimeStamp.set(System.currentTimeMillis());
        if (contentValues == null || contentValues.size() == 0) {
            XWebLog.m21908d(TAG, "insert values is null or empty");
            return null;
        } else if (parseUri(uri).opType != 3) {
            XWebLog.m21908d(TAG, "insert wrong opType");
            return null;
        } else {
            Context context = getContext();
            if (context == null) {
                XWebLog.m21909e(TAG, "insert context is null");
                return null;
            } else if (!"com.tencent.mm".equals(context.getPackageName())) {
                XWebLog.m21909e(TAG, "insert current not mm, return");
                return null;
            } else {
                XWebLog.m21908d(TAG, "insert start report");
                for (Map.Entry next : contentValues.valueSet()) {
                    try {
                        int parseInt = Integer.parseInt((String) next.getKey());
                        String str = (String) next.getValue();
                        if (WXWebReporter.isXWebCoreContentProviderKey(parseInt) && str != null) {
                            if (!str.isEmpty()) {
                                if (WXWebReporter.hasInit()) {
                                    XWebLog.m21908d(TAG, "insert report " + parseInt + " " + str);
                                    WXWebReporter.setKVLog(parseInt, str);
                                } else {
                                    XWebLog.m21908d(TAG, "insert reporter not init, cache " + parseInt + " " + str);
                                    KVInfo kVInfo = new KVInfo();
                                    kVInfo.key = parseInt;
                                    kVInfo.value = str;
                                    CachedInfoMgr.add(kVInfo);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        XWebLog.m21910e(TAG, "insert parse error", th);
                    }
                }
                return null;
            }
        }
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        sOperatingTimeStamp.set(System.currentTimeMillis());
        UriInfo parseUri = parseUri(uri);
        ReportInfo reportInfo = new ReportInfo();
        reportInfo.errCode = -1;
        reportInfo.uriInfo = parseUri;
        Context context = getContext();
        if (context == null) {
            XWebLog.m21909e(TAG, "openFile context is null");
            reportInfo.errCode = -2;
            doReport((Context) null, reportInfo);
            return null;
        }
        tryRefillCallerName(context, parseUri);
        String packageName = context.getPackageName();
        reportInfo.currentPackageName = packageName;
        XWebLog.m21908d(TAG, "openFile current package: " + packageName);
        if (!isProvider(packageName)) {
            XWebLog.m21909e(TAG, "openFile current is not provider");
            reportInfo.errCode = -3;
            doReport(context, reportInfo);
            return null;
        }
        int i = parseUri.opType;
        if (i == 1) {
            XWebLog.m21908d(TAG, "openFile test msg from " + parseUri.callerName);
            reportInfo.errCode = 2;
            doReport(context, reportInfo);
            return null;
        } else if (i == 2) {
            XWebLog.m21908d(TAG, "openFile request from " + parseUri.callerName);
            File file = new File(XWebFileUtil.getPatchFileListConfig(context, parseUri.targetVersion));
            if (!file.exists()) {
                file = new File(XWebFileUtil.getDownloadZipFileListConfig(context, parseUri.targetVersion));
                if (!file.exists()) {
                    XWebLog.m21908d(TAG, "openFile cannot find listConfigFile of ver " + parseUri.targetVersion);
                    reportInfo.errCode = -4;
                    doReport(context, reportInfo);
                    return null;
                }
            }
            if (!parseUri.targetFileName.equals("filelist.config")) {
                Map<String, String> readListConfigFile = readListConfigFile(file);
                if (readListConfigFile == null || readListConfigFile.size() == 0) {
                    XWebLog.m21909e(TAG, "openFile fileMap is null or empty");
                    reportInfo.errCode = -5;
                    doReport(context, reportInfo);
                    return null;
                } else if (readListConfigFile.containsKey(parseUri.targetFileName)) {
                    File file2 = parseUri.targetFileName.equals(XWebFileUtil.XWALK_CORE_APK_NAME) ? new File(XWebFileUtil.getDownloadApkPath(context, parseUri.targetVersion)) : new File(XWebFileUtil.getExtractedCoreFile(context, parseUri.targetVersion, parseUri.targetFileName));
                    if (file2.exists()) {
                        XWebLog.m21908d(TAG, "openFile return file " + parseUri.targetFileName);
                        reportInfo.errCode = 0;
                        doReport(context, reportInfo);
                        return ParcelFileDescriptor.open(file2, 268435456);
                    }
                    XWebLog.m21908d(TAG, "openFile file not exist " + parseUri.targetFileName);
                    reportInfo.errCode = -6;
                    doReport(context, reportInfo);
                    return null;
                } else {
                    XWebLog.m21908d(TAG, "openFile caller attempt to get file " + parseUri.targetFileName);
                    reportInfo.errCode = -7;
                    doReport(context, reportInfo);
                    return null;
                }
            } else if (XWalkEnvironment.getInstalledNewstVersion(context) == -1) {
                XWebLog.m21908d(TAG, "openFile can not get current version");
                reportInfo.errCode = -8;
                doReport(context, reportInfo);
                return null;
            } else {
                XWebLog.m21908d(TAG, "openFile return listConfigFile");
                reportInfo.errCode = 1;
                doReport(context, reportInfo);
                return ParcelFileDescriptor.open(file, 268435456);
            }
        } else {
            XWebLog.m21908d(TAG, "openFile invalid uri");
            reportInfo.errCode = -1;
            doReport(context, reportInfo);
            return null;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
