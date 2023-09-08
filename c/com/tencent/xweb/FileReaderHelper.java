package com.tencent.xweb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Process;
import com.eclipsesource.mmv8.Platform;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public class FileReaderHelper {
    public static final String AAC_EXT = "aac";
    public static final String[] ALL_FILE_FORMATS = {PPT_EXT, PPTX_EXT, XLS_EXT, XLSX_EXT, DOC_EXT, DOCX_EXT, WPS_EXT, ET_EXT, DPS_EXT, PDF_EXT, TXT_EXT, MP3_EXT, M4A_EXT, WAV_EXT, AAC_EXT};
    public static final String[] AUDIO_FILE_FORMATS = {MP3_EXT, M4A_EXT, WAV_EXT, AAC_EXT};
    public static final int CAN_EXPLICIT_INSTALL_FALSE_FORBID_DOWNLOAD = -2;
    public static final int CAN_EXPLICIT_INSTALL_FALSE_FORBID_EXPLICIT_DOWNLOAD = -3;
    public static final int CAN_EXPLICIT_INSTALL_FALSE_PARAM_INVALID = -1;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_CAN_DOWNLOAD = 1;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_FORBID_DOWNLOAD_CAN_TRY_EMBED = 2;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_FORBID_EXPLICIT_DOWNLOAD_CAN_TRY_EMBED = 3;
    public static final String DOCX_EXT = "docx";
    public static final String DOC_EXT = "doc";
    public static final String DPS_EXT = "dps";
    public static final String ERROR_MSG_DISABLE_PASSWORD = "disable_password";
    public static final String ERROR_MSG_DOWNLOAD_CANCEL = "download_cancel";
    public static final String ERROR_MSG_DOWNLOAD_CONFIG_DOWNLOAD_FAILED = "download_config_download_failed";
    public static final String ERROR_MSG_DOWNLOAD_CONFIG_PARSE_FAILED = "download_config_parse_failed";
    public static final String ERROR_MSG_DOWNLOAD_NO_AVAILABLE_UPDATE = "download_no_available_update";
    public static final String ERROR_MSG_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG = "download_no_need_to_fetch_config";
    public static final String ERROR_MSG_DOWNLOAD_NO_NETWORK = "download_no_network";
    public static final String ERROR_MSG_DOWNLOAD_NO_PLUGIN_IN_CONFIG = "download_no_plugin_in_config";
    public static final String ERROR_MSG_DOWNLOAD_OTHERS_IS_UPDATING = "download_others_is_updating";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR = "download_plugin_only_download_error";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR = "download_plugin_only_install_error";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_UPDATE_ERROR = "download_plugin_update_error";
    public static final String ERROR_MSG_DOWNLOAD_START_FAILED = "download_start_failed";
    public static final String ERROR_MSG_FILE_NOT_EXIST = "file_not_exist";
    public static final String ERROR_MSG_FILE_NOT_SUPPORT = "file_not_support";
    public static final String ERROR_MSG_FORBID_DOWNLOAD_CODE = "forbid_download_code";
    public static final String ERROR_MSG_INIT_ERROR = "init_error";
    public static final String ERROR_MSG_INVOKE_ERROR = "invoke_error";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_DEFAULT = "miniqb_init_error_default";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_DISABLE = "miniqb_init_error_disable";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_FAILED = "miniqb_init_error_failed";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT = "miniqb_init_error_not_support";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT_64 = "miniqb_init_error_not_support_64";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_PARAM = "miniqb_init_error_param";
    public static final String ERROR_MSG_MINIQB_OPEN_ERROR = "miniqb_open_error";
    public static final String ERROR_MSG_PASSWORD_ERROR = "password_error";
    public static final String ERROR_MSG_PLUGIN_NOT_INSTALLED = "plugin_not_installed";
    public static final String ERROR_MSG_QB_ERROR = "qb_error";
    public static final String ERROR_MSG_SO_ERROR = "so_error";
    public static final String ERROR_MSG_SUCCESS = "success";
    public static final String ERROR_MSG_TASK_EXIST = "task_exist";
    public static final String ERROR_MSG_TASK_PREPARE_ERROR = "task_prepare_error";
    public static final String ERROR_MSG_TASK_RUN_ERROR = "task_run_error";
    public static final String ERROR_MSG_THIRD_ERROR = "third_error";
    public static final String ERROR_MSG_UNKNOWN = "unknown";
    public static final String ERROR_MSG_VERSION_TOO_OLD = "version_too_old";
    public static final String ERROR_MSG_VIEW_DESTROY = "view_destroy";
    public static final String ERROR_MSG_WRONG_PARAM = "wrong_param";
    public static final int ERR_CANT_OPEN = -102;
    public static final int ERR_NONE = 0;
    public static final String ET_EXT = "et";
    public static final String EXPLICIT_DOWNLOAD_SCENE_INVOKE_ERROR = "invoke_error";
    public static final String EXPLICIT_DOWNLOAD_SCENE_NONE = "none";
    public static final String EXPLICIT_DOWNLOAD_SCENE_NOT_INSTALL = "not_install";
    public static final String EXPLICIT_DOWNLOAD_SCENE_SO_ERROR = "so_error";
    private static final long FILE_SIZE_SPAN = 1048576;
    public static final String M4A_EXT = "m4a";
    public static final String MP3_EXT = "mp3";
    public static final String[] OFFICE_READER_FORMATS = {PPT_EXT, PPTX_EXT, XLS_EXT, XLSX_EXT, DOC_EXT, DOCX_EXT, WPS_EXT, ET_EXT, DPS_EXT};
    public static final String OPEN_FILE_FROM_CMD = "cmd";
    public static final String OPEN_FILE_FROM_DEFAULT = "default";
    public static final String OPEN_FILE_FROM_FORCE = "force";
    public static final String OPEN_FILE_FROM_HARDCODE = "hardcode";
    public static final String OPEN_FILE_FROM_MINIQB_ERROR = "miniqb_error";
    public static final String OPEN_FILE_FROM_UNKNOWN = "unknown";
    public static final String OPEN_FILE_FROM_XFILE_CONTEXT_ERROR = "xfile_context_error";
    public static final String OPEN_FILE_FROM_XFILE_FORBID_DOWNLOAD = "xfile_forbid_download";
    public static final String OPEN_FILE_FROM_XFILE_INNER_ERROR = "xfile_inner_error";
    public static final String OPEN_FILE_FROM_XFILE_NOT_INSTALLED = "xfile_not_installed";
    public static final String OPEN_FILE_FROM_XFILE_NOT_SUPPORT = "xfile_not_support";
    public static final String OPEN_FILE_FROM_XFILE_RECENT_CRASH = "xfile_recent_crash";
    public static final String OPEN_FILE_FROM_XFILE_TOO_OLD = "xfile_too_old";
    public static String OPEN_X5_SCENE_STR = "open_x5_from_scene";
    public static final String PDF_EXT = "pdf";
    public static final String PPTX_EXT = "pptx";
    public static final String PPT_EXT = "ppt";
    public static final String QQ_BROWSER = "QQBROWSER";
    public static final String READER_TYPE_MINIQB = "miniqb";
    public static final String READER_TYPE_QB = "qb";
    public static final String READER_TYPE_THIRD_PREFIX = "third_";
    public static final String READER_TYPE_UNKNOWN = "unknown";
    public static final String READER_TYPE_XFilesAudioPlayer = "XFilesAudioPlayer";
    private static final String TAG = "XFilesReaderHelper";
    public static final String THIRD_APP = "THIRDAPP";
    public static final String TXT_EXT = "txt";
    public static final String WAV_EXT = "wav";
    public static final String WPS_EXT = "wps";
    public static final String XLSX_EXT = "xlsx";
    public static final String XLS_EXT = "xls";

    public enum AudioPlayerStrategy {
        auto,
        tponly,
        tpfirst,
        sysonly,
        sysfirst
    }

    public enum ReaderType {
        NONE,
        XWEB,
        X5
    }

    public static class ReportTarget {
        public boolean isExtendFormat;
        public int reportID;

        public ReportTarget(int i, boolean z) {
            this.reportID = i;
            this.isExtendFormat = z;
        }
    }

    public enum UseOfficeReader {
        none,
        yes,
        no
    }

    public static int canExplicitInstall(XWalkReaderBasePlugin xWalkReaderBasePlugin, boolean z, int i) {
        if (xWalkReaderBasePlugin == null) {
            XWebLog.m21909e(TAG, "canExplicitInstall error, readerPlugin is null");
            return -1;
        }
        boolean z2 = xWalkReaderBasePlugin.hasEmbed() && xWalkReaderBasePlugin.getEmbedVersion() >= i;
        XWebLog.m21911i(TAG, "canExplicitInstall plugin:" + xWalkReaderBasePlugin.getPluginName() + ", curVersion: " + xWalkReaderBasePlugin.getAvailableVersion() + ", require: " + i + ", embedVersion: " + xWalkReaderBasePlugin.getEmbedVersion() + ", canTryEmbed: " + z2 + ", canExplicitDownload: " + z);
        if (XWebEmbedSetting.getForbidDownloadCode() && !xWalkReaderBasePlugin.isIgnoreForbidDownloadCode()) {
            XWebLog.m21911i(TAG, "canExplicitInstall forbid download code");
            if (z2) {
                XWebLog.m21911i(TAG, "canExplicitInstall can try embed");
                return 2;
            }
            XWebLog.m21911i(TAG, "canExplicitInstall no embed");
            return -2;
        } else if (!z) {
            XWebLog.m21911i(TAG, "canExplicitInstall can not explicit download");
            if (z2) {
                XWebLog.m21911i(TAG, "canExplicitInstall can try embed");
                return 3;
            }
            XWebLog.m21911i(TAG, "canExplicitInstall no embed");
            return -3;
        } else {
            XWebLog.m21911i(TAG, "canExplicitInstall can download");
            return 1;
        }
    }

    public static String convertOpenFileFrom(int i) {
        return i == 40 ? OPEN_FILE_FROM_HARDCODE : i == 41 ? OPEN_FILE_FROM_FORCE : i == 42 ? OPEN_FILE_FROM_CMD : i == 43 ? OPEN_FILE_FROM_XFILE_RECENT_CRASH : i == 44 ? OPEN_FILE_FROM_XFILE_FORBID_DOWNLOAD : i == 45 ? OPEN_FILE_FROM_XFILE_NOT_INSTALLED : i == 46 ? OPEN_FILE_FROM_XFILE_TOO_OLD : i == 47 ? OPEN_FILE_FROM_XFILE_NOT_SUPPORT : i == 48 ? OPEN_FILE_FROM_XFILE_CONTEXT_ERROR : i == 49 ? OPEN_FILE_FROM_XFILE_INNER_ERROR : i == 50 ? OPEN_FILE_FROM_MINIQB_ERROR : "unknown";
    }

    public static String convertX5ErrorCodeToMsg(int i, boolean z) {
        return i == 0 ? "success" : z ? i == -100001 ? ERROR_MSG_MINIQB_INIT_ERROR_PARAM : i == -100002 ? ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT : i == -100003 ? ERROR_MSG_MINIQB_INIT_ERROR_FAILED : i == -100004 ? ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT_64 : i == -100005 ? ERROR_MSG_MINIQB_INIT_ERROR_DISABLE : ERROR_MSG_MINIQB_INIT_ERROR_DEFAULT : ERROR_MSG_MINIQB_OPEN_ERROR;
    }

    public static String convertXWebErrorCodeToMsg(int i) {
        if (i == 0) {
            return "success";
        }
        if (i == -1) {
            return ERROR_MSG_FORBID_DOWNLOAD_CODE;
        }
        if (i == -2) {
            return ERROR_MSG_PLUGIN_NOT_INSTALLED;
        }
        if (i == -3) {
            return "invoke_error";
        }
        if (i == -4) {
            return ERROR_MSG_INIT_ERROR;
        }
        if (i == -5) {
            return ERROR_MSG_WRONG_PARAM;
        }
        if (i == -6) {
            return ERROR_MSG_FILE_NOT_EXIST;
        }
        if (i == -7) {
            return ERROR_MSG_FILE_NOT_SUPPORT;
        }
        if (i == -8) {
            return ERROR_MSG_TASK_EXIST;
        }
        if (i == -9) {
            return ERROR_MSG_TASK_PREPARE_ERROR;
        }
        if (i == -10) {
            return ERROR_MSG_TASK_RUN_ERROR;
        }
        if (i == -11) {
            return ERROR_MSG_VERSION_TOO_OLD;
        }
        if (i == -12) {
            return ERROR_MSG_PASSWORD_ERROR;
        }
        if (i == -13) {
            return "so_error";
        }
        if (i == -14) {
            return ERROR_MSG_VIEW_DESTROY;
        }
        if (i == -15) {
            return ERROR_MSG_DOWNLOAD_CANCEL;
        }
        if (i == -18) {
            return ERROR_MSG_DOWNLOAD_START_FAILED;
        }
        if (i == -19) {
            return ERROR_MSG_DOWNLOAD_NO_NETWORK;
        }
        if (i == -20) {
            return ERROR_MSG_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG;
        }
        if (i == -21) {
            return ERROR_MSG_DOWNLOAD_OTHERS_IS_UPDATING;
        }
        if (i == -22) {
            return ERROR_MSG_DOWNLOAD_CONFIG_DOWNLOAD_FAILED;
        }
        if (i == -23) {
            return ERROR_MSG_DOWNLOAD_CONFIG_PARSE_FAILED;
        }
        if (i == -24) {
            return ERROR_MSG_DOWNLOAD_NO_PLUGIN_IN_CONFIG;
        }
        if (i == -25) {
            return ERROR_MSG_DOWNLOAD_NO_AVAILABLE_UPDATE;
        }
        if (i == -26) {
            return ERROR_MSG_DOWNLOAD_PLUGIN_UPDATE_ERROR;
        }
        if (i == -27) {
            return ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR;
        }
        if (i == -28) {
            return ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR;
        }
        if (i == -17) {
            return ERROR_MSG_DISABLE_PASSWORD;
        }
        XWebLog.m21909e(TAG, "convertXWebErrorCodeToMsg unknown code: " + i);
        return "unknown";
    }

    private static void fillX5Scene(Intent intent, int i) {
        if (intent != null) {
            intent.putExtra(OPEN_X5_SCENE_STR, i);
        }
    }

    public static long getCurrentProcessMemory(Context context) {
        XWebLog.m21911i(TAG, "getCurrentProcessMemory start");
        if (context == null) {
            try {
                XWebLog.m21909e(TAG, "getCurrentProcessMemory failed, context is null");
                return 0;
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "getCurrentProcessMemory error, msg:" + th.getMessage());
                return 0;
            }
        } else {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                XWebLog.m21909e(TAG, "getCurrentProcessMemory failed, activityManager is null");
                return 0;
            }
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo != null) {
                if (processMemoryInfo.length > 0) {
                    long totalPrivateClean = (long) ((processMemoryInfo[0].getTotalPrivateClean() + processMemoryInfo[0].getTotalPrivateDirty()) / 1024);
                    XWebLog.m21911i(TAG, "getCurrentProcessMemory " + totalPrivateClean);
                    return totalPrivateClean;
                }
            }
            XWebLog.m21909e(TAG, "getCurrentProcessMemory failed, memoryInfo is empty");
            return 0;
        }
    }

    public static int getOpenFileFrom(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            try {
                XWebLog.m21909e(TAG, "getOpenFileFrom failed, extra params is null");
                return 0;
            } catch (Exception e) {
                XWebLog.m21909e(TAG, "getOpenFileFrom error: " + e.getMessage());
                return 0;
            }
        } else {
            String str = hashMap.get(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_FROM);
            if (str != null) {
                if (!str.isEmpty()) {
                    return Integer.parseInt(str);
                }
            }
            XWebLog.m21909e(TAG, "getOpenFileFrom failed, strScene is empty");
            return 0;
        }
    }

    public static int getOpenFileScene(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            try {
                XWebLog.m21909e(TAG, "getOpenFileScene failed, extra params is null");
                return 0;
            } catch (Exception e) {
                XWebLog.m21909e(TAG, "getOpenFileScene error: " + e.getMessage());
                return 0;
            }
        } else {
            String str = hashMap.get(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE);
            if (str != null) {
                if (!str.isEmpty()) {
                    return Integer.parseInt(str);
                }
            }
            XWebLog.m21909e(TAG, "getOpenFileScene failed, strScene is empty");
            return 0;
        }
    }

    public static XWalkPlugin getPlugin(String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase(PPT_EXT) || str.equalsIgnoreCase(PPTX_EXT) || str.equalsIgnoreCase(DPS_EXT)) {
            return getUseOfficeReader(str, true) ? XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE) : XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_PPT);
        }
        if (str.equalsIgnoreCase(PDF_EXT)) {
            return XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_PDF);
        }
        if (str.equalsIgnoreCase(DOC_EXT) || str.equalsIgnoreCase(DOCX_EXT) || str.equalsIgnoreCase(WPS_EXT)) {
            return getUseOfficeReader(str, true) ? XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE) : XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_WORD);
        }
        if (str.equalsIgnoreCase(XLS_EXT) || str.equalsIgnoreCase(XLSX_EXT) || str.equalsIgnoreCase(ET_EXT)) {
            return getUseOfficeReader(str, true) ? XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE) : XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL);
        }
        if (str.equalsIgnoreCase(TXT_EXT)) {
            return XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_TXT);
        }
        return null;
    }

    public static ReaderType getReaderType(String str, boolean z, Intent intent) {
        int canExplicitInstall;
        fillX5Scene(intent, 40);
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "getReaderType fileExt is empty, use x5");
            return ReaderType.X5;
        }
        String lowerCase = str.toLowerCase();
        ReaderType fileReaderType = CommandCfgPlugin.getInstance().getFileReaderType(lowerCase);
        XWebLog.m21911i(TAG, "getReaderType cmd type: " + fileReaderType.toString());
        fillX5Scene(intent, 42);
        ReaderType readerType = ReaderType.X5;
        if (fileReaderType == readerType) {
            XWebLog.m21911i(TAG, "getReaderType use x5");
            return readerType;
        } else if (!isSupport(lowerCase)) {
            XWebLog.m21911i(TAG, "getReaderType not support " + lowerCase + ", use x5");
            fillX5Scene(intent, 47);
            return readerType;
        } else {
            if (!(WebDebugCfg.getInst() != null ? WebDebugCfg.getInst().getDisableFileReaderCrashDetect() : false) && FileReaderCrashDetector.isRecentCrashed(lowerCase)) {
                XWebLog.m21911i(TAG, "getReaderType recent crashed, use x5");
                fillX5Scene(intent, 43);
                return readerType;
            } else if (isAudioFormat(lowerCase)) {
                XWebLog.m21911i(TAG, "getReaderType is supported audio file, use xweb");
                return ReaderType.XWEB;
            } else if (!z) {
                XWebLog.m21911i(TAG, "getReaderType skip check plugin, use xweb");
                return ReaderType.XWEB;
            } else {
                XWalkPlugin plugin = getPlugin(lowerCase);
                if (!(plugin instanceof XWalkReaderBasePlugin)) {
                    XWebLog.m21911i(TAG, "getReaderType can not find plugin, not support " + lowerCase + ", use x5");
                    fillX5Scene(intent, 47);
                    return readerType;
                }
                XWalkReaderBasePlugin xWalkReaderBasePlugin = (XWalkReaderBasePlugin) plugin;
                int availableVersion = xWalkReaderBasePlugin.getAvailableVersion(true);
                int minSupportRuntimeVersion = xWalkReaderBasePlugin.getMinSupportRuntimeVersion(0);
                if ((availableVersion <= 0 || availableVersion < minSupportRuntimeVersion) && (canExplicitInstall = canExplicitInstall(xWalkReaderBasePlugin, CommandCfgPlugin.getInstance().canDownloadWhenNotInstall(true), minSupportRuntimeVersion)) <= 0) {
                    XWebLog.m21911i(TAG, "getReaderType can not explicit install, use x5");
                    if (canExplicitInstall == -2) {
                        fillX5Scene(intent, 44);
                    } else if (canExplicitInstall == -3) {
                        fillX5Scene(intent, availableVersion <= 0 ? 45 : 46);
                    }
                    return readerType;
                }
                XWebLog.m21911i(TAG, "getReaderType version support, use xweb");
                return ReaderType.XWEB;
            }
        }
    }

    private static ReportTarget getReportTarget(String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "getReportTarget fileExt is null");
            return null;
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase(PPT_EXT);
        int i = WXWebReporter.WXWEB_IDKEY_FR_OFFICE_POWERPOINT_ID;
        if (equalsIgnoreCase) {
            if (!getUseOfficeReader(str, false)) {
                i = WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID;
            }
            return new ReportTarget(i, false);
        } else if (str.equalsIgnoreCase(PPTX_EXT)) {
            if (!getUseOfficeReader(str, false)) {
                i = WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID;
            }
            return new ReportTarget(i, true);
        } else {
            boolean equalsIgnoreCase2 = str.equalsIgnoreCase(XLS_EXT);
            int i2 = WXWebReporter.WXWEB_IDKEY_FR_OFFICE_EXCEL_ID;
            if (equalsIgnoreCase2) {
                if (!getUseOfficeReader(str, false)) {
                    i2 = WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID;
                }
                return new ReportTarget(i2, false);
            } else if (str.equalsIgnoreCase(XLSX_EXT)) {
                if (!getUseOfficeReader(str, false)) {
                    i2 = WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID;
                }
                return new ReportTarget(i2, true);
            } else {
                boolean equalsIgnoreCase3 = str.equalsIgnoreCase(DOC_EXT);
                int i3 = WXWebReporter.WXWEB_IDKEY_FR_OFFICE_WORD_ID;
                if (equalsIgnoreCase3) {
                    if (!getUseOfficeReader(str, false)) {
                        i3 = WXWebReporter.WXWEB_IDKEY_FR_WORD_ID;
                    }
                    return new ReportTarget(i3, false);
                } else if (str.equalsIgnoreCase(DOCX_EXT)) {
                    if (!getUseOfficeReader(str, false)) {
                        i3 = WXWebReporter.WXWEB_IDKEY_FR_WORD_ID;
                    }
                    return new ReportTarget(i3, true);
                } else if (str.equalsIgnoreCase(PDF_EXT)) {
                    return new ReportTarget(WXWebReporter.WXWEB_IDKEY_FR_PDF_ID, false);
                } else {
                    if (str.equalsIgnoreCase(TXT_EXT)) {
                        return new ReportTarget(WXWebReporter.WXWEB_IDKEY_FR_TXT_ID, false);
                    }
                    if (isAudioFormat(str)) {
                        return new ReportTarget(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID, false);
                    }
                    return null;
                }
            }
        }
    }

    public static boolean getUseOfficeReader(String str, boolean z) {
        UseOfficeReader useOfficeReader;
        UseOfficeReader useOfficeReader2 = UseOfficeReader.none;
        if (WebDebugCfg.getInst() != null) {
            useOfficeReader = WebDebugCfg.getInst().getForceUseOfficeReader(str);
            if (z) {
                XWebLog.m21911i(TAG, "getUseOfficeReader force = " + useOfficeReader.toString());
            }
        } else {
            if (z) {
                XWebLog.m21909e(TAG, "getUseOfficeReader WebDebugCfg is null, skip force");
            }
            useOfficeReader = useOfficeReader2;
        }
        if (useOfficeReader == useOfficeReader2) {
            useOfficeReader = CommandCfgPlugin.getInstance().getCmdUseOfficeReader(str);
            if (z) {
                XWebLog.m21911i(TAG, "getUseOfficeReader cmd = " + useOfficeReader.toString());
            }
        }
        return useOfficeReader == UseOfficeReader.yes;
    }

    public static boolean isAudioFormat(String str) {
        if (str != null && !str.isEmpty()) {
            for (String equalsIgnoreCase : AUDIO_FILE_FORMATS) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSupport(String str) {
        if (str != null && !str.isEmpty()) {
            for (String equalsIgnoreCase : ALL_FILE_FORMATS) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void reportDownloadErrorCode(String str, int i) {
        int i2;
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "reportDownloadErrorCode param is null");
            return;
        }
        String lowerCase = str.toLowerCase();
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportDownloadErrorCode skip " + lowerCase);
            return;
        }
        if (i == 0) {
            i2 = 79;
        } else if (i == -1) {
            i2 = 81;
        } else if (i == -2) {
            i2 = 82;
        } else if (i == -3) {
            i2 = 83;
        } else if (i == -4) {
            i2 = 84;
        } else if (i == -5) {
            i2 = 85;
        } else if (i == -6) {
            i2 = 86;
        } else if (i == -7) {
            i2 = 87;
        } else if (i == -8) {
            i2 = 88;
        } else if (i == -9) {
            i2 = 89;
        } else if (i == -10) {
            i2 = 90;
        } else if (i == -11) {
            i2 = 91;
        } else {
            XWebLog.m21909e(TAG, "reportDownloadErrorCode idkey unknown ret: " + i);
            return;
        }
        XWebLog.m21908d(TAG, "reportDownloadErrorCode idkey id:" + reportTarget.reportID + ", key:" + i2);
        WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i2, 1);
    }

    public static void reportException(String str, int i, String str2, Throwable th) {
        if (str == null || str.isEmpty() || str2 == null || th == null) {
            XWebLog.m21909e(TAG, "reportException wrong param");
            return;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            String str3 = "empty";
            if (stringWriter2.isEmpty()) {
                stringWriter2 = str3;
            }
            String replace = stringWriter2.substring(0, Math.min(stringWriter2.length(), 1000)).replace(',', ' ').replace(XVFSFile.PATH_SEPARATOR_CHAR, ' ');
            String str4 = str2 + " " + th.getMessage();
            if (!str4.isEmpty()) {
                str3 = str4;
            }
            String str5 = i + "," + str + "," + replace + "," + str3.substring(0, Math.min(str3.length(), 1000)).replace(',', ' ').replace(XVFSFile.PATH_SEPARATOR_CHAR, ' ');
            XWebLog.m21908d(TAG, "reportException kv key:17565, val:" + str5);
            WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_EXCEPTION, str5);
        } catch (Throwable th4) {
            XWebLog.m21910e(TAG, "reportException error", th4);
        }
    }

    public static void reportExplicitInstall(String str) {
        reportIDKeyByFileExt(str, 78);
    }

    public static void reportExplicitInstallStartFailed(String str) {
        reportIDKeyByFileExt(str, 80);
    }

    public static long reportFileSize(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            XWebLog.m21909e(TAG, "reportFileSize param is null");
            return 0;
        }
        String lowerCase = str2.toLowerCase();
        File file = new File(str);
        if (!file.exists()) {
            XWebLog.m21909e(TAG, "reportFileSize file not exist");
            return 0;
        }
        long length = file.length() / FILE_SIZE_SPAN;
        if (length == 0) {
            length++;
        }
        String str3 = (lowerCase.length() > 50 ? lowerCase.substring(0, 50) : lowerCase) + "," + length;
        XWebLog.m21908d(TAG, "reportFileSize kv key:17562, val:" + str3);
        WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_FILE_INFO, str3);
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportFileSize idkey skip " + lowerCase);
            return length;
        }
        int i = length <= 10 ? reportTarget.isExtendFormat ? 24 : 20 : length <= 20 ? reportTarget.isExtendFormat ? 25 : 21 : length <= 50 ? reportTarget.isExtendFormat ? 26 : 22 : reportTarget.isExtendFormat ? 27 : 23;
        XWebLog.m21908d(TAG, "reportFileSize idkey id:" + reportTarget.reportID + ", key:" + i);
        WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i, 1);
        return length;
    }

    private static void reportIDKeyByFileExt(String str, int i) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "reportIDKeyByFileExt param is null");
            return;
        }
        String lowerCase = str.toLowerCase();
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportIDKeyByFileExt skip " + lowerCase);
            return;
        }
        XWebLog.m21908d(TAG, "reportIDKeyByFileExt id:" + reportTarget.reportID + ", key:" + i);
        WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i, 1);
    }

    public static void reportOpenFile(OpenFileReportData openFileReportData) {
        if (openFileReportData == null) {
            XWebLog.m21909e(TAG, "reportOpenFile failed, data is null");
            return;
        }
        String stringOpenFile = openFileReportData.getStringOpenFile();
        if (stringOpenFile == null || stringOpenFile.isEmpty()) {
            XWebLog.m21909e(TAG, "reportOpenFile failed, reportVal is empty");
            return;
        }
        XWebLog.m21911i(TAG, "reportOpenFile kv key:25414, val:" + stringOpenFile);
        WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_OPEN_FILE, stringOpenFile);
    }

    public static void reportOpenFileRet(OpenFileReportData openFileReportData) {
        if (openFileReportData == null) {
            XWebLog.m21909e(TAG, "reportOpenFileRet failed, data is null");
            return;
        }
        String stringOpenFileRet = openFileReportData.getStringOpenFileRet();
        if (stringOpenFileRet == null || stringOpenFileRet.isEmpty()) {
            XWebLog.m21909e(TAG, "reportOpenFileRet failed, reportVal is empty");
            return;
        }
        XWebLog.m21911i(TAG, "reportOpenFileRet kv key:25415, val:" + stringOpenFileRet);
        WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_OPEN_FILE_RET, stringOpenFileRet);
    }

    public static void reportPVUV(String str, String str2) {
        int i;
        boolean z;
        String str3;
        int i2;
        String str4 = str2;
        if (str == null || str.isEmpty() || str4 == null || str2.isEmpty()) {
            XWebLog.m21909e(TAG, "reportPVUV param is null");
            return;
        }
        String lowerCase = str.toLowerCase();
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportPVUV skip " + lowerCase + ", " + str4);
            return;
        }
        if (ReaderType.XWEB.name().equalsIgnoreCase(str4)) {
            boolean z2 = reportTarget.isExtendFormat;
            i = z2 ? 3 : 2;
            z = z2;
        } else {
            if (ReaderType.X5.name().equalsIgnoreCase(str4)) {
                boolean z3 = reportTarget.isExtendFormat;
                z = z3 ? 5 : 4;
                i2 = z3 ? 7 : 6;
            } else if (QQ_BROWSER.equalsIgnoreCase(str4)) {
                boolean z4 = reportTarget.isExtendFormat;
                z = z4 ? 17 : 16;
                i2 = z4 ? 19 : 18;
            } else if (THIRD_APP.equalsIgnoreCase(str4)) {
                boolean z5 = reportTarget.isExtendFormat;
                z = z5 ? 9 : 8;
                i2 = z5 ? 11 : 10;
            } else {
                XWebLog.m21909e(TAG, "reportPVUV unknown type, skip");
                return;
            }
            i = i2;
        }
        try {
            str3 = new SimpleDateFormat("yyyyMMdd").format(new Date());
        } catch (Throwable th) {
            XWebLog.m21909e(TAG, "reportPVUV get cur date error: " + th.getMessage());
            str3 = "";
        }
        boolean z6 = false;
        String str5 = lowerCase + "_" + str4 + "_" + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_REPORT_UV_DATE;
        SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
        if (sharedPreferencesForFileReaderRecord != null) {
            z6 = !sharedPreferencesForFileReaderRecord.getString(str5, "").equals(str3);
        } else {
            XWebLog.m21909e(TAG, "reportPVUV sp is null, skip uv report");
        }
        XWebLog.m21908d(TAG, "reportPV id:" + reportTarget.reportID + ", key:" + ((int) z));
        WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) z, 1);
        if (z6) {
            XWebLog.m21908d(TAG, "reportUV id:" + reportTarget.reportID + ", key:" + i);
            WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i, 1);
            SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
            if (edit != null) {
                edit.putString(str5, str3);
                edit.commit();
                return;
            }
            XWebLog.m21909e(TAG, "reportPVUV editor is null, skip");
        }
    }

    public static void reportReadByX5Scene(String str, int i) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "reportReadByX5Scene param is null");
            return;
        }
        String lowerCase = str.toLowerCase();
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportReadByX5Scene idkey skip " + lowerCase);
            return;
        }
        String str2 = lowerCase + "," + i;
        XWebLog.m21908d(TAG, "reportReadByX5Scene kv key:17563, val:" + str2);
        WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_X5_SCENE, str2);
        XWebLog.m21908d(TAG, "reportReadByX5Scene idkey id:" + reportTarget.reportID + ", key:" + i);
        WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i, 1);
    }

    public static void reportX5ErrorCode(String str, int i, boolean z, int i2, Context context, OpenFileReportData openFileReportData) {
        String str2;
        if (openFileReportData != null) {
            openFileReportData.markEnd(context, i, convertX5ErrorCodeToMsg(i, z));
            reportOpenFileRet(openFileReportData);
        }
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "reportX5ErrorCode param is null");
            return;
        }
        String lowerCase = str.toLowerCase();
        ReportTarget reportTarget = getReportTarget(lowerCase);
        if (reportTarget == null) {
            XWebLog.m21908d(TAG, "reportX5ErrorCode skip " + lowerCase);
            return;
        }
        if (i != 0) {
            if (z) {
                str2 = "-1," + lowerCase + "," + i + ",x5init";
            } else {
                str2 = "-1," + lowerCase + "," + i + ",x5";
            }
            XWebLog.m21908d(TAG, "reportX5ErrorCode kv key:17566, val:" + str2);
            WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_ERROR_CODE, str2);
        }
        if (z || i == -102) {
            int i3 = reportTarget.isExtendFormat ? 15 : 14;
            XWebLog.m21908d(TAG, "reportX5ErrorCode idkey id:" + reportTarget.reportID + ", key:" + i3);
            WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i3, 1);
            if (i2 == 49) {
                int i4 = reportTarget.isExtendFormat ? 39 : 38;
                XWebLog.m21908d(TAG, "reportX5ErrorCode XWeb and X5 All failed id:" + reportTarget.reportID + ", key:" + i4);
                WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i4, 1);
            }
        }
    }

    public static void reportXWebErrorCode(String str, int i, int i2, Context context, OpenFileReportData openFileReportData) {
        int i3;
        if (openFileReportData != null) {
            openFileReportData.markEnd(context, i2, convertXWebErrorCodeToMsg(i2));
            reportOpenFileRet(openFileReportData);
        }
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "reportXWebErrorCode param is null");
        } else if (i2 != 0) {
            String lowerCase = str.toLowerCase();
            ReportTarget reportTarget = getReportTarget(lowerCase);
            if (reportTarget == null) {
                XWebLog.m21908d(TAG, "reportXWebErrorCode skip " + lowerCase);
                return;
            }
            String str2 = i + "," + lowerCase + "," + i2 + ",xweb";
            XWebLog.m21908d(TAG, "reportXWebErrorCode kv key:17566, val:" + str2);
            WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_FR_ERROR_CODE, str2);
            int i4 = reportTarget.isExtendFormat ? 13 : 12;
            XWebLog.m21908d(TAG, "reportXWebErrorCode first idkey id:" + reportTarget.reportID + ", key:" + i4);
            WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i4, 1);
            if (i2 == -1) {
                i3 = 151;
            } else if (i2 == -2) {
                i3 = 152;
            } else if (i2 == -3) {
                i3 = 153;
            } else if (i2 == -4) {
                i3 = 154;
            } else if (i2 == -5) {
                i3 = 155;
            } else if (i2 == -6) {
                i3 = 156;
            } else if (i2 == -7) {
                i3 = 157;
            } else if (i2 == -8) {
                i3 = 158;
            } else if (i2 == -9) {
                i3 = 159;
            } else if (i2 == -10) {
                i3 = 160;
            } else if (i2 == -11) {
                i3 = 161;
            } else if (i2 == -12) {
                i3 = 162;
            } else if (i2 == -13) {
                i3 = 163;
            } else if (i2 == -14) {
                i3 = 164;
            } else if (i2 == -15) {
                i3 = 165;
            } else if (i2 == -18 || i2 == -19 || i2 == -20 || i2 == -21 || i2 == -22 || i2 == -23 || i2 == -24 || i2 == -25 || i2 == -26 || i2 == -27 || i2 == -28) {
                i3 = 166;
            } else if (i2 == -17) {
                i3 = 167;
            } else {
                XWebLog.m21909e(TAG, "reportXWebErrorCode idkey unknown ret: " + i2);
                return;
            }
            XWebLog.m21908d(TAG, "reportXWebErrorCode second idkey id:" + reportTarget.reportID + ", key:" + i3);
            WXWebReporter.idkeyReport((long) reportTarget.reportID, (long) i3, 1);
        }
    }

    public static class OpenFileReportData {
        public int errorCode;
        public String errorMsg;
        public String explicitDownloadScene;
        public String fileExt;
        public long fileSizeMB;
        public String from;
        public long memoryCost;
        public long memoryEnd;
        public long memoryStart;
        public String module;
        public String platform;
        public String readerType;
        public int scene;
        public long timeCost;
        public long timeEnd;
        public long timeStart;
        public int version;

        public OpenFileReportData(int i, String str, long j, String str2, int i2, String str3) {
            this.platform = Platform.ANDROID;
            this.module = "";
            this.scene = -1;
            this.fileExt = "";
            this.fileSizeMB = -1;
            this.readerType = "";
            this.version = -1;
            this.from = "";
            this.memoryStart = -1;
            this.memoryEnd = -1;
            this.memoryCost = -1;
            this.timeCost = -1;
            this.errorCode = 0;
            this.errorMsg = "unknown";
            this.explicitDownloadScene = "none";
            this.timeStart = -1;
            this.timeEnd = -1;
            this.module = XWalkEnvironment.getSafeModuleName("unknown");
            this.scene = i;
            this.fileExt = str;
            this.fileSizeMB = j;
            this.readerType = str2;
            this.version = i2;
            this.from = str3;
        }

        private String getSafeMsg(String str) {
            if (str != null && !str.isEmpty()) {
                try {
                    return str.substring(0, Math.min(str.length(), 150)).replace(',', ' ').replace(XVFSFile.PATH_SEPARATOR_CHAR, ' ');
                } catch (Throwable th) {
                    XWebLog.m21909e(FileReaderHelper.TAG, "getSafeMsg error: " + th.getMessage());
                }
            }
            return "unknown";
        }

        public String getStringOpenFile() {
            return this.platform + "," + this.module + "," + this.scene + "," + this.fileExt + "," + this.fileSizeMB + "," + this.readerType + "," + this.version + "," + this.from + "," + this.memoryStart;
        }

        public String getStringOpenFileRet() {
            String safeMsg = getSafeMsg(this.errorMsg);
            return this.platform + "," + this.module + "," + this.scene + "," + this.fileExt + "," + this.fileSizeMB + "," + this.readerType + "," + this.version + "," + this.from + "," + this.memoryStart + "," + this.memoryEnd + "," + this.memoryCost + "," + this.timeCost + "," + this.errorCode + "," + safeMsg + "," + this.explicitDownloadScene;
        }

        public void markEnd(Context context, int i, String str) {
            markEnd(FileReaderHelper.getCurrentProcessMemory(context), System.currentTimeMillis(), i, str);
        }

        public void markStart(Context context) {
            markStart(FileReaderHelper.getCurrentProcessMemory(context), System.currentTimeMillis());
        }

        public void markEnd(long j, long j2, int i, String str) {
            this.memoryEnd = j;
            this.timeEnd = j2;
            this.memoryCost = j - this.memoryStart;
            this.timeCost = j2 - this.timeStart;
            this.errorCode = i;
            this.errorMsg = str;
        }

        public void markStart(long j, long j2) {
            this.memoryStart = j;
            this.timeStart = j2;
        }
    }
}
