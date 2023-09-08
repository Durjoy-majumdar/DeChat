package com.tencent.xweb.util;

import android.content.SharedPreferences;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewReporterInterface;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.report.KVReportForVideoFullscreen;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.xwalk.core.XWalkEnvironment;

public class WXWebReporter {
    public static final String APPBRAND_PRELOAD_LINK = "https://servicewechat.com/preload/page-frame.html";
    public static final int APPBRAND_SCENE = 0;
    public static final String APPBRAND_URL_PREFIX = "https://servicewechat.com/";
    public static final int APPBRAND_WEBVIEW_SCENE = 3;
    public static final int CHECK_XWALK_FILE_CRUPPTED = 63;
    public static final int CHECK_XWALK_FILE_CRUPPTED_AT_FIRST_TIME = 64;
    public static final int CHECK_XWALK_NO_FILE_CONFIG = 78;
    public static final int CHECK_XWALK_NO_RES_CONFIG = 79;
    public static final int CHECK_XWALK_RES_CRUPPTED = 76;
    public static final int CHECK_XWALK_RES_CRUPPTED_AT_FIRST_TIME = 77;
    public static final int CLEAR_OLD_XWALK_FAILED = 66;
    public static final int CLEAR_OLD_XWALK_SUC = 65;
    public static final int E_ACFUN_VIDEO = 3;
    public static final int E_BILI_VIDEO = 2;
    public static final int E_LE_VIDEO = 1;
    public static final int E_QQ_VIDEO = 0;
    public static final int KEY_FREQ_COPY_DEX_SUC = 249;
    public static final int KEY_FREQ_FIND_DEX_CORUPPT = 253;
    public static final int KEY_FREQ_LOAD_CORE_FAILED = 252;
    public static final int KEY_FREQ_LOAD_FAILED_15_TIMES = 243;
    public static final int KEY_FREQ_NEW_FAILED_15_TIMES = 245;
    public static final int KEY_FREQ_NEW_WEB_FAILED = 247;
    public static final int KEY_FREQ_REMOVE_DEX_FAILED = 250;
    public static final int KEY_FREQ_REMOVE_OPT_DEX_FAILED = 255;
    public static final int KEY_FREQ_REMOVE_OPT_DEX_SUC = 254;
    public static final int KEY_GEN_OPT_DEX_FAILED = 251;
    public static final int KEY_LOAD_FAILED_CANT_FIX = 244;
    public static final int KEY_NEW_FAILED_CANT_FIX = 246;
    public static final int KEY_SET_DATA_SUFFIX_INVOKE_METHOD_FAILED = 232;
    public static final int KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED = 230;
    public static final int KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED_2 = 231;
    public static final int KEY_TRY_FIX_DEX_FAILED = 248;
    public static final int LOAD_SO_32_RUNTIME_USE_64_SO = 193;
    public static final int LOAD_SO_64_RUNTIME_USE_32_SO = 194;
    public static final int LOAD_SO_CPU_BUILD_NOT_MATCH = 191;
    public static final int LOAD_SO_EXCEPTION = 192;
    public static final int LOAD_SO_LINK_ERR_OTHER = 195;
    public static final String MP_BRIDGE_PREFIX = "http://mp.weixinbridge.com/";
    public static final String MP_LIST_URL_HTTPS_PREFIX = "https://servicewechat.com/preload/";
    public static final int MP_SCENE = 1;
    public static final String MP_URL_HTTPS_PREFIX = "https://mp.weixin.qq.com/";
    public static final String MP_URL_PREFIX = "http://mp.weixin.qq.com/";
    public static final int OUT_LINK_SCENE = 2;
    private static final String TAG = "WXWebReporter";
    public static final int WXWEB_67_IDKEY_ID = 938;
    public static final int WXWEB_FIND_XWALK_CRASH = 61;
    public static final int WXWEB_GET_MMKV_CALLBACK_IS_NULL = 177;
    public static final int WXWEB_GET_MMKV_FROM_CALLBACK_FAILED = 176;
    public static final int WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED = 179;
    public static final int WXWEB_GET_REFLECT_MMKV_METHED_FAILED = 178;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD = 9;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_COST = 12;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_FAILED = 10;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_SUCCESS = 11;
    public static final int WXWEB_IDKEY_APPBRAND_UV_START = 73;
    public static final int WXWEB_IDKEY_APPLY_PATCH = 14;
    public static final int WXWEB_IDKEY_APPLY_PATCH_COST = 17;
    public static final int WXWEB_IDKEY_APPLY_PATCH_FAILED = 15;
    public static final int WXWEB_IDKEY_APPLY_PATCH_SUCCESS = 16;
    public static final int WXWEB_IDKEY_CHECKFILELIST_ERROR = 33;
    public static final int WXWEB_IDKEY_CHECK_UPDATECONFIG_FAILED = 60;
    public static final int WXWEB_IDKEY_CONFIG_CHECK_MD5_ERROR = 34;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD = 20;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_COST = 23;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_FAILED = 21;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_SUCCESS = 22;
    public static final int WXWEB_IDKEY_CONFIG_PARSE_ERROR = 35;
    public static final int WXWEB_IDKEY_CONFIG_SIGNATURE_NOT_MATCH = 95;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_FINAL = 87;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_SYS = 84;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_X5 = 85;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_XWALK = 86;
    public static final int WXWEB_IDKEY_DEBUG_LINK_ALL = 224;
    public static final int WXWEB_IDKEY_DEBUG_LINK_FROM_WEB = 223;
    public static final int WXWEB_IDKEY_DECOMPRESS_ERROR = 32;
    public static final int WXWEB_IDKEY_FR_AUDIO_ID = 1900;
    public static final int WXWEB_IDKEY_FR_CACHE_HIT = 192;
    public static final int WXWEB_IDKEY_FR_ERR_DISABLE_PASSWORD = 167;
    public static final int WXWEB_IDKEY_FR_ERR_DOWNLOAD_CANCEL = 165;
    public static final int WXWEB_IDKEY_FR_ERR_DOWNLOAD_OR_INSTALL_FAILED = 166;
    public static final int WXWEB_IDKEY_FR_ERR_FILE_NOT_EXIST = 156;
    public static final int WXWEB_IDKEY_FR_ERR_FILE_NOT_SUPPORT = 157;
    public static final int WXWEB_IDKEY_FR_ERR_FORBID_DOWNLOAD_CODE = 151;
    public static final int WXWEB_IDKEY_FR_ERR_INVOKE_ERROR = 153;
    public static final int WXWEB_IDKEY_FR_ERR_PASSWORD_ERROR = 162;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_INIT_ERROR = 154;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_NOT_INSTALLED = 152;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_WRONG_PARAM = 155;
    public static final int WXWEB_IDKEY_FR_ERR_SO_ERROR = 163;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_EXIST = 158;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_PREPARE_ERROR = 159;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_RUN_ERROR = 160;
    public static final int WXWEB_IDKEY_FR_ERR_VERSION_TOO_OLD = 161;
    public static final int WXWEB_IDKEY_FR_ERR_VIEW_DESTROY = 164;
    public static final int WXWEB_IDKEY_FR_EXCEL_ID = 1070;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD = 78;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_CONFIG_DOWNLOAD_FAILED = 85;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_CONFIG_PARSE_FAILED = 86;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_AVAILABLE_UPDATE = 88;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG = 83;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_NETWORK = 82;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_PLUGIN_IN_CONFIG = 87;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_OTHERS_IS_UPDATING = 84;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR = 90;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR = 91;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_UPDATE_ERROR = 89;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_START_FAILED = 80;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_SUCCESS = 79;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_USER_CANCEL = 81;
    public static final int WXWEB_IDKEY_FR_EXTEND_OTHER_PV = 9;
    public static final int WXWEB_IDKEY_FR_EXTEND_OTHER_UV = 11;
    public static final int WXWEB_IDKEY_FR_EXTEND_QQBROWSER_PV = 17;
    public static final int WXWEB_IDKEY_FR_EXTEND_QQBROWSER_UV = 19;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_10_L_20 = 25;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_20_L_50 = 26;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_50 = 27;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_L_10 = 24;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_FAIL = 15;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_PV = 5;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_UV = 7;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_FAIL = 13;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_PV = 1;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_UV = 3;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_X5_ALL_FAIL = 39;
    public static final int WXWEB_IDKEY_FR_LAST_TASK_EXIST = 191;
    public static final int WXWEB_IDKEY_FR_OFFICE_EXCEL_ID = 1879;
    public static final int WXWEB_IDKEY_FR_OFFICE_ID = 1544;
    public static final int WXWEB_IDKEY_FR_OFFICE_POWERPOINT_ID = 1880;
    public static final int WXWEB_IDKEY_FR_OFFICE_WORD_ID = 1891;
    public static final int WXWEB_IDKEY_FR_OTHER_PV = 8;
    public static final int WXWEB_IDKEY_FR_OTHER_UV = 10;
    public static final int WXWEB_IDKEY_FR_PASSWORD_RETRY_EXCEED_LIMIT = 73;
    public static final int WXWEB_IDKEY_FR_PDF_ID = 1071;
    public static final int WXWEB_IDKEY_FR_PLUGIN_CHECK_FAIL = 63;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD = 60;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD_FAIL = 62;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD_SUC = 61;
    public static final int WXWEB_IDKEY_FR_PLUGIN_FILE_DAMAGED = 66;
    public static final int WXWEB_IDKEY_FR_PLUGIN_INSTALL_FAIL = 65;
    public static final int WXWEB_IDKEY_FR_PLUGIN_MENU_OPENBY_OTHER_CLICK = 68;
    public static final int WXWEB_IDKEY_FR_PLUGIN_MENU_SEND_CLICK = 67;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_APPLY_FAIL = 57;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_CHECK_FAIL = 55;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD = 51;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD_FAIL = 54;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD_SUC = 52;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_INSTALL_FAIL = 59;
    public static final int WXWEB_IDKEY_FR_POWERPOINT_ID = 1068;
    public static final int WXWEB_IDKEY_FR_QQBROWSER_PV = 16;
    public static final int WXWEB_IDKEY_FR_QQBROWSER_UV = 18;
    public static final int WXWEB_IDKEY_FR_READ_ENCRYPTED_FILE = 70;
    public static final int WXWEB_IDKEY_FR_READ_ENCRYPTED_FILE_SUCCESS = 71;
    public static final int WXWEB_IDKEY_FR_SIZE_G_10_L_20 = 21;
    public static final int WXWEB_IDKEY_FR_SIZE_G_20_L_50 = 22;
    public static final int WXWEB_IDKEY_FR_SIZE_G_50 = 23;
    public static final int WXWEB_IDKEY_FR_SIZE_L_10 = 20;
    public static final int WXWEB_IDKEY_FR_TXT_ID = 1889;
    public static final int WXWEB_IDKEY_FR_USING_APKVERSION_MAX = 150;
    public static final int WXWEB_IDKEY_FR_USING_APKVERSION_MIN = 100;
    public static final int WXWEB_IDKEY_FR_WORD_ID = 1069;
    public static final int WXWEB_IDKEY_FR_WRONG_IMG_SIZE = 190;
    public static final int WXWEB_IDKEY_FR_WRONG_PASSWORD = 72;
    public static final int WXWEB_IDKEY_FR_X5_FAIL = 14;
    public static final int WXWEB_IDKEY_FR_X5_PV = 4;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_CMD = 42;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_CONTEXT_ERROR = 48;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FILE_NOT_SUPPORT = 47;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FORBID_DOWNLOAD_CODE = 44;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FORCE = 41;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_HARDCODE = 40;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_INNER_ERROR = 49;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_PLUGIN_NOT_INSTALLED = 45;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_PLUGIN_TOO_OLD = 46;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_RECENT_CRASH = 43;
    public static final int WXWEB_IDKEY_FR_X5_TO_XWEB = 76;
    public static final int WXWEB_IDKEY_FR_X5_TO_XWEB_XWEB_FAILED = 77;
    public static final int WXWEB_IDKEY_FR_X5_UV = 6;
    public static final int WXWEB_IDKEY_FR_XWEB_FAIL = 12;
    public static final int WXWEB_IDKEY_FR_XWEB_PV = 0;
    public static final int WXWEB_IDKEY_FR_XWEB_SCENE_MINIQB_ERROR = 50;
    public static final int WXWEB_IDKEY_FR_XWEB_TO_X5 = 74;
    public static final int WXWEB_IDKEY_FR_XWEB_TO_X5_X5_FAILED = 75;
    public static final int WXWEB_IDKEY_FR_XWEB_UV = 2;
    public static final int WXWEB_IDKEY_FR_XWEB_X5_ALL_FAIL = 38;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD = 185;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED = 187;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS = 186;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED = 188;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_USE_DEFAULT = 190;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD = 189;
    public static final int WXWEB_IDKEY_ID = 577;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_FINAL = 83;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_SYS = 80;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_X5 = 81;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_XWALK = 82;
    public static final int WXWEB_IDKEY_LOCAL_TO_OVERSEA = 197;
    public static final int WXWEB_IDKEY_OVERSEA_TO_LOCAL = 198;
    public static final int WXWEB_IDKEY_PATCHMODE_ADDFILE_ERROR = 40;
    public static final int WXWEB_IDKEY_PATCHMODE_CHECKFILELIST_ERROR = 36;
    public static final int WXWEB_IDKEY_PATCHMODE_COPYFROMBASE_ERROR = 39;
    public static final int WXWEB_IDKEY_PATCHMODE_DECOMPRESS_ERROR = 37;
    public static final int WXWEB_IDKEY_PATCHMODE_NOCONFIG_ERROR = 38;
    public static final int WXWEB_IDKEY_PATCHMODE_REMOVEFILE_ERROR = 41;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD = 25;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_COST = 28;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_FAILED = 26;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_SUCCESS = 27;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD = 181;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED = 183;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS = 182;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED = 184;
    public static final int WXWEB_IDKEY_PLUGIN_UPDATE_START = 180;
    public static final int WXWEB_IDKEY_RECHECK_CHECK_FILE_ERROR = 92;
    public static final int WXWEB_IDKEY_RECHECK_UPDATE_CONFIG = 68;
    public static final int WXWEB_IDKEY_REVERT_NO_OLD_FAILED_ = 91;
    public static final int WXWEB_IDKEY_REVERT_TONEAR_SUC = 90;
    public static final int WXWEB_IDKEY_REVERT_TOTARGET_SUC = 89;
    public static final int WXWEB_IDKEY_START_CHECK_UPDATE = 88;
    public static final int WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE = 199;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ACFUN_ENTER_FULLSCREEN = 162;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ACFUN_HOOK = 154;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_BILI_ENTER_FULLSCREEN = 161;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_BILI_HOOK = 153;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LE_ENTER_FULLSCREEN = 160;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LE_HOOK = 152;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD = 46;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_COST = 49;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_FAILED = 47;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_SUCCESS = 48;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW = 56;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 57;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 58;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 59;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_QQ_ENTER_FULLSCREEN = 159;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_QQ_HOOK = 151;
    public static final int WXWEB_IDKEY_TOOLS_UV_START = 70;
    public static final int WXWEB_IDKEY_USER_FORCE_CHECK_UPDATE = 93;
    public static final int WXWEB_IDKEY_USER_FORCE_DOWNLOAD = 94;
    public static final int WXWEB_IDKEY_USING_APKVERSION_MAX = 150;
    public static final int WXWEB_IDKEY_USING_APKVERSION_MIN = 100;
    public static final int WXWEB_IDKEY_USING_SYS_DAILY = 97;
    public static final int WXWEB_IDKEY_USING_X5_DAILY = 98;
    public static final int WXWEB_IDKEY_USING_XWALK_DAILY = 99;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD = 0;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_COST = 3;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_FAILED = 1;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_SUCCESS = 2;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ACFUN_ENTER_FULLSCREEN = 166;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ACFUN_HOOK = 158;
    public static final int WXWEB_IDKEY_WXWEBVIEW_BILI_ENTER_FULLSCREEN = 165;
    public static final int WXWEB_IDKEY_WXWEBVIEW_BILI_HOOK = 157;
    public static final int WXWEB_IDKEY_WXWEBVIEW_JS_EXCEPTION = 167;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LE_ENTER_FULLSCREEN = 164;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LE_HOOK = 156;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD = 4;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_COST = 7;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_FAILED = 5;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_SUCCESS = 6;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_FULLSCREEN = 52;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 53;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 54;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 55;
    public static final int WXWEB_IDKEY_WXWEBVIEW_QQ_ENTER_FULLSCREEN = 163;
    public static final int WXWEB_IDKEY_WXWEBVIEW_QQ_HOOK = 155;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD = 42;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_COST = 45;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_FAILED = 43;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_SUCCESS = 44;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW = 168;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 169;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 174;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 175;
    public static final int WXWEB_IDKEY_X86_FORCE_SYS = 69;
    public static final int WXWEB_KVSTAT_ID = 15003;
    public static final int WXWEB_KVSTAT_STAGE_CODE_END = 1;
    public static final int WXWEB_KVSTAT_STAGE_CODE_START = 0;
    public static final int WXWEB_KV_CONFIG_DOWNLOAD = 15123;
    public static final int WXWEB_KV_CORE_PROVIDER_OPENFILE = 15625;
    public static final int WXWEB_KV_CORE_UPDATE_FROM_PROVIDER = 15626;
    public static final int WXWEB_KV_FR_ACTION = 25696;
    public static final int WXWEB_KV_FR_ACTION_TYPE_CLICK_COPY = 5;
    public static final int WXWEB_KV_FR_ACTION_TYPE_CLICK_EDIT = 6;
    public static final int WXWEB_KV_FR_ACTION_TYPE_DOUBLE_CLICK = 2;
    public static final int WXWEB_KV_FR_ACTION_TYPE_LONG_PRESS = 4;
    public static final int WXWEB_KV_FR_ACTION_TYPE_OPEN = 1;
    public static final int WXWEB_KV_FR_ACTION_TYPE_SCALE = 3;
    public static final int WXWEB_KV_FR_ACTION_TYPE_SHOW_BOTTOM_BAR = 51;
    public static final int WXWEB_KV_FR_COST = 17564;
    public static final int WXWEB_KV_FR_ERROR_CODE = 17566;
    public static final int WXWEB_KV_FR_EXCEPTION = 17565;
    public static final int WXWEB_KV_FR_FILE_INFO = 17562;
    public static final int WXWEB_KV_FR_OPEN_FILE = 25414;
    public static final int WXWEB_KV_FR_OPEN_FILE_RET = 25415;
    public static final int WXWEB_KV_FR_X5_SCENE = 17563;
    public static final int WXWEB_KV_PLUGIN_CONFIG_UPDATE = 26264;
    public static final int WXWEB_KV_PLUGIN_UPDATE = 15718;
    public static final int WXWEB_KV_PLUGIN_UPDATE_NEW = 26265;
    public static final int WXWEB_KV_RUNTIME_PATCH_DOWNLOAD = 15124;
    public static final int WXWEB_XWALK_CORE_CRASH_DAILY = 62;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED = 226;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS = 228;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC = 227;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED = 220;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS = 222;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_TEST_SYS_SUC = 221;
    public static final int WXXWEB_PRE_DOWN_ARM32_SCHEDULED = 236;
    public static final int WXXWEB_PRE_DOWN_ARM32_SUC = 238;
    public static final int WXXWEB_PRE_DOWN_ARM64_SCHEDULED = 237;
    public static final int WXXWEB_PRE_DOWN_ARM64_SUC = 239;
    public static final int WXXWEB_PRE_DOWN_MATCHED = 240;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_CLASSCIRCULARITYERROR = 90;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_EXCEPTION = 91;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_RUNTIMEEXCEPTION = 89;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_TRANSLATE_GET_SAMPLE_STRING_PER_DAY = 103;
    private static WebViewReporterInterface mReporterCallback = null;
    private static boolean sBHasReportModuleUV = false;
    public static String sStrModule = "";
    private static boolean s_isReported903Uv = false;
    private static WebView.WebViewKind wvKindMostPrefferd = WebView.WebViewKind.WV_KIND_NONE;

    public static class KVBuilder {
        public int nKVID;
        public StringBuilder stringBuilder = new StringBuilder();

        public KVBuilder(int i) {
            this.nKVID = i;
        }

        public KVBuilder append(int i, Object obj) {
            return append(obj);
        }

        public String doReportKV() {
            String sb = this.stringBuilder.toString();
            WXWebReporter.setKVLog(this.nKVID, this.stringBuilder.toString());
            return sb;
        }

        public KVBuilder append(Object obj) {
            if (this.stringBuilder.length() > 0) {
                this.stringBuilder.append(",");
            }
            this.stringBuilder.append(obj.toString());
            return this;
        }
    }

    public static class KVDef {

        public static class KVXwebInitCoreFailed {
            public static int ABI_32 = 1;
            public static int ABI_64 = 2;
            public static int ERRTYPE_LOADCORE = 1;
            public static int ERRTYPE_NEW_INSTANCE = 2;

            /* renamed from: ID */
            public static int f57027ID = 19307;
        }
    }

    public static class ID1367KeyDef {

        /* renamed from: ID */
        public static final int f57028ID = 1367;
        public static final int KEY_REPORT_DEVICE32 = 253;
        public static final int KEY_REPORT_DEVICE64 = 254;
        public static final int KEY_REPORT_INSTALLED_NO_VER = 251;
        public static final int KEY_REPORT_INSTALLED_VER_MIN = 0;
        public static final int KEY_REPORT_PREDOWN_NO_VER = 252;
        public static final int KEY_REPORT_PREDOWN_VER_MIN = 100;
        public static final int KEY_REPORT_RUNTIME64 = 255;
    }

    public static class ID1511KeyDef {

        /* renamed from: ID */
        public static final int f57029ID = 1511;
        public static final int KEY_MAIN_CFG_START = 0;
        public static final int KEY_PLUG_CFG_START = 100;
    }

    public static class ID1749KeyDef {

        /* renamed from: ID */
        public static final int f57030ID = 1749;
        public static final int KEY_ALL_KINDS_FPS_DISABLED_FROM_CLIENT = 3;
        public static final int KEY_ALL_KINDS_FPS_ENABLED_FROM_CLIENT = 2;
        public static final int KEY_CHANNEL_GET_CLASSLOADER_FAIL = 50;
        public static final int KEY_CHANNEL_INIT_CORE_BRIDGE_FAIL = 51;
        public static final int KEY_CHANNEL_INIT_LOG_CHANNEL_FAIL = 54;
        public static final int KEY_CHANNEL_INIT_NORMAL_CHANNEL = 61;
        public static final int KEY_CHANNEL_INIT_NORMAL_CHANNEL_SUCCESS = 62;
        public static final int KEY_CHANNEL_INIT_NOTIFY_CHANNEL_FAIL = 52;
        public static final int KEY_CHANNEL_INIT_RUNTIME_TO_SDK_CHANNEL_FAIL = 53;
        public static final int KEY_CHANNEL_INIT_STANDALONE_CHANNEL = 59;
        public static final int KEY_CHANNEL_INIT_STANDALONE_CHANNEL_SUCCESS = 60;
        public static final int KEY_CHANNEL_INVALID_VERSION = 49;
        public static final int KEY_CHANNEL_LOAD_NATIVE_LIBRARY_FAIL = 55;
        public static final int KEY_CHANNEL_NATIVE_LIBRARY_NOT_MATCH = 56;
        public static final int KEY_CHANNEL_NOT_SUPPORT_STANDALONE_MODE = 58;
        public static final int KEY_CHANNEL_SET_STANDALONE_MODE_FAIL = 57;
        public static final int KEY_CLEAN_PREDOWN_CORE = 85;
        public static final int KEY_COMMAND_CONFIG_SECTION_A_B_NOT_READY = 46;
        public static final int KEY_COMMAND_CONFIG_SECTION_A_READY = 47;
        public static final int KEY_COMMAND_CONFIG_SECTION_B_READY = 48;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS = 33;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS_FAILED = 37;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS_FAILED_FINALLY = 41;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS = 30;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS_FAILED = 34;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS_FAILED_FINALLY = 38;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5 = 31;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5_FAILED = 35;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5_FAILED_FINALLY = 39;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK = 32;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK_FAILED = 36;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK_FAILED_FINALLY = 40;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_PINUS_FAILED_FINALLY = 45;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_SYS_FAILED_FINALLY = 42;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_X5_FAILED_FINALLY = 43;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_XWALK_FAILED_FINALLY = 44;
        public static final int KEY_DOWNLOAD_RUNTIME_WHEN_NO_UIN = 20;
        public static final int KEY_EMBED_INSTALL_FIND_SO_FAIL = 25;
        public static final int KEY_EMBED_INSTALL_FIND_SO_IN_APK = 26;
        public static final int KEY_EMBED_INSTALL_FIND_SO_NOT_IN_APK = 27;
        public static final int KEY_FPS_PROFILE_FORCE_DISABLED_FROM_CLIENT = 1;
        public static final int KEY_FPS_PROFILE_FORCE_ENABLED_FROM_CLIENT = 0;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_MUTE = 7;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED = 8;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_05 = 9;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_075 = 10;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_10 = 11;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_15 = 12;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_20 = 13;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_30 = 14;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_SYS = 5;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_X5 = 6;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_XWEB = 4;
        public static final int KEY_FULLSCREEN_VIDEO_INIT_CHANNEL_FAILED = 19;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_OTHERS = 16;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_PINUS = 18;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_XWALK = 17;
        public static final int KEY_FULLSCREEN_VIDEO_SDK = 15;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_OTHERS = 63;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_PINUS = 65;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_XWALK = 64;
        public static final int KEY_INSTALL_RUNTIME_WHEN_NO_UIN = 21;
        public static final int KEY_IP_TYPE_CHANGED = 28;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_PINUS = 82;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_SYS = 79;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_X5 = 80;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_XWALK = 81;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_PINUS = 78;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_SYS = 75;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_X5 = 76;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_XWALK = 77;
        public static final int KEY_PINUS_CORE_INIT_CANCEL = 73;
        public static final int KEY_PINUS_CORE_INIT_FAILED = 72;
        public static final int KEY_PINUS_CORE_INIT_FINISH = 74;
        public static final int KEY_PINUS_CORE_INIT_START = 71;
        public static final int KEY_REFLECT_INIT_CLASS = 23;
        public static final int KEY_REFLECT_INIT_METHOD = 24;
        public static final int KEY_REFLECT_INIT_OBJECT = 22;
        public static final int KEY_USER_TYPE_CHANGED_GRAYVALUE = 29;
        public static final int KEY_WEBVIEW_REINIT_XWEB = 66;
        public static final int KEY_XWALK_CORE_INIT_CANCEL = 69;
        public static final int KEY_XWALK_CORE_INIT_FAILED = 68;
        public static final int KEY_XWALK_CORE_INIT_FINISH = 70;
        public static final int KEY_XWALK_CORE_INIT_START = 67;
    }

    public static class ID903KeyDef {
        public static final int DANGERTIME_NOT_UPDATE = 148;
        public static final int DONOW_UPDATE_FUTURE_DAY_SCHE = 147;
        public static final int EMBED_INSTALLER_FAILED_COPY_FILE = 126;
        public static final int EMBED_INSTALLER_FAILED_EXP = 128;
        public static final int EMBED_INSTALLER_SUC = 127;
        public static final int FETCH_CONFIG_BEFORE_UPDATE = 159;
        public static final int HYBRID_INSTALL_COPY_FILE_ERROR_NOT_FOUND = 133;
        public static final int HYBRID_INSTALL_COPY_FILE_FAILED = 135;
        public static final int HYBRID_INSTALL_FILE_MD5_NOT_MATCH = 134;
        public static final int HYBRID_INSTALL_UNZIP_FAILED = 132;
        public static final int HYBRID_INSTALL_ZIP_FAILED = 136;

        /* renamed from: ID */
        public static final int f57031ID = 903;
        public static final int KEY_PVUV_APPBRAND_START = 48;
        public static final int KEY_PVUV_MM_START = 30;
        public static final int KEY_PVUV_SUPPORT_START = 54;
        public static final int KEY_PVUV_TOOLS_MP_START = 42;
        public static final int KEY_PVUV_TOOLS_START = 36;
        public static final int KEY_PV_APPBRAND_PRELOAD = 102;
        public static final int KEY_PV_APPBRAND_X5_WRAP_SYS = 72;
        public static final int KEY_PV_MM_X5_WRAP_SYS = 74;
        public static final int KEY_PV_OFFSET = 0;
        public static final int KEY_PV_SUPPORT_X5_WRAP_SYS = 73;
        public static final int KEY_PV_TOOLS_MP_LINK = 103;
        public static final int KEY_PV_TOOLS_X5_WRAP_SYS = 70;
        public static final int KEY_PV_URL_DISPATCH_BLACKLIST = 121;
        public static final int KEY_TEMP_USE_100_REPORT_0 = 0;
        public static final int KEY_TEMP_USE_100_REPORT_1 = 1;
        public static final int KEY_TEMP_USE_100_REPORT_10 = 10;
        public static final int KEY_TEMP_USE_100_REPORT_11 = 11;
        public static final int KEY_TEMP_USE_100_REPORT_2 = 2;
        public static final int KEY_TEMP_USE_100_REPORT_3 = 3;
        public static final int KEY_TEMP_USE_100_REPORT_4 = 4;
        public static final int KEY_TEMP_USE_100_REPORT_5 = 5;
        public static final int KEY_TEMP_USE_100_REPORT_6 = 6;
        public static final int KEY_TEMP_USE_100_REPORT_7 = 7;
        public static final int KEY_TEMP_USE_100_REPORT_8 = 8;
        public static final int KEY_TEMP_USE_100_REPORT_9 = 9;
        public static final int KEY_UV_APPBRAND_X5_WRAP_SYS = 77;
        public static final int KEY_UV_MM_X5_WRAP_SYS = 79;
        public static final int KEY_UV_OFFSET = 3;
        public static final int KEY_UV_SUPPORT_X5_WRAP_SYS = 78;
        public static final int KEY_UV_TOOLS_X5_WRAP_SYS = 75;
        public static final int LIB_INSTALL_COPY_FILE_ERROR_NOT_FOUND = 129;
        public static final int LIB_INSTALL_COPY_FILE_FAILED = 131;
        public static final int LIB_INSTALL_FILE_MD5_NOT_MATCH = 130;
        public static final int PAST_DAY_SCHEDULE_ABANDON = 146;
        public static final int SCHEDULE_REPLACED = 149;
        public static final int TRIGER_UPDATER_AFTER_CONFIG = 160;
        public static final int UPDATE_ADD_BY_CONFIG = 151;
        public static final int UPDATE_ADD_BY_FORWARD = 161;
        public static final int UPDATE_ADD_BY_TIME_RANGE = 162;
        public static final int UPDATE_CUT_BY_CONFIG = 150;
        public static final int UPDATE_FREE_UPDATE = 153;
        public static final int UPDATE_NEED_UPDATE_NO_CORE = 157;
        public static final int UPDATE_NO_SCHEDULE = 155;
        public static final int UPDATE_PARSE_RELEASE_DATE_FAILED = 158;
        public static final int UPDATE_SCHEDULE_TO_NEXT_DAY = 156;
        public static final int UPDATE_SHOULD_UPDATE = 152;
        public static final int UPDATE_SHOULD_UPDATE_BY_DEFAULT = 154;
        public static final int UPDATE_SPEED_CONFIG_PARSE_FAILED = 163;
    }

    public static String generateSessionId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private static int getPVUVModuleStart() {
        if (sStrModule.equals(XWalkEnvironment.MODULE_MM)) {
            return 30;
        }
        if (sStrModule.equals(XWalkEnvironment.MODULE_TOOLS)) {
            return 36;
        }
        if (sStrModule.equals(XWalkEnvironment.MODULE_APPBRAND)) {
            return 48;
        }
        return sStrModule.equals("support") ? 54 : -1;
    }

    public static WebView.WebViewKind getStatWebKind() {
        return WebView.getCurrentModuleWebCoreType();
    }

    public static int getUrlType(String str) {
        if (str.startsWith(APPBRAND_URL_PREFIX)) {
            return 0;
        }
        return (str.startsWith(MP_URL_PREFIX) || str.startsWith(MP_URL_HTTPS_PREFIX) || str.startsWith(MP_LIST_URL_HTTPS_PREFIX) || str.startsWith(MP_BRIDGE_PREFIX)) ? 1 : 2;
    }

    public static boolean hasInit() {
        return mReporterCallback != null;
    }

    public static void idkeyForPair(int i, int i2, int i3, int i4, int i5, int i6) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyForPair(i, i2, i3, i4, i5, i6);
        }
    }

    public static void idkeyReport(long j, int i) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, j, (long) i);
        }
    }

    public static void invokeRuntimeChannelClassCircularityError() {
        idkeyReport(938, 90, 1);
    }

    public static void invokeRuntimeChannelException() {
        idkeyReport(938, 91, 1);
    }

    public static void invokeRuntimeChannelRuntimeException() {
        idkeyReport(938, 89, 1);
    }

    public static boolean isXWebCoreContentProviderKey(int i) {
        return i == 15625 || i == 15626;
    }

    public static void onAllKindsFpsProfileDisabledFromClient() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 3, 1);
        }
    }

    public static void onAllKindsFpsProfileEnabledFromClient() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 2, 1);
        }
    }

    public static void onCfgDownload(String str, boolean z) {
        idkeyReport(1511, (long) ((z ? 0 : 100) + (NumberUtil.safeParseInt(str).intValue() % 100)), 1);
    }

    public static void onCheckUpdateConfigFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 60, 1);
        }
    }

    public static void onClickFullscreenVideoMute() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 7, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 8, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed05() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 9, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed075() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 10, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed10() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 11, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed15() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 12, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed20() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 13, 1);
        }
    }

    public static void onClickFullscreenVideoSpeed30() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 14, 1);
        }
    }

    public static void onConfigDownload() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 20, 1);
        }
    }

    public static void onConfigDownloadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 21, 1);
        }
    }

    public static void onConfigDownloadSuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && webViewReporterInterface != null && j > 0 && j < 600000) {
            webViewReporterInterface.idkeyForPair(577, 577, 22, 23, 1, (int) j);
        }
    }

    public static void onCreateWebviewFailed(WebView.WebViewKind webViewKind) {
        int i;
        if (mReporterCallback != null) {
            if (webViewKind == WebView.WebViewKind.WV_KIND_CW || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                i = 86;
            } else if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
                i = 84;
            } else {
                return;
            }
            mReporterCallback.idkeyStat(577, (long) i, 1);
        }
    }

    public static void onCreateWebviewFailedFinally() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 87, 1);
        }
    }

    public static void onFpsProfileForceDisabledFromClient() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 1, 1);
        }
    }

    public static void onFpsProfileForceEnabledFromClient() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(1749, 0, 1);
        }
    }

    public static void onFullScreenJSUseDefault() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 190, 1);
        }
    }

    public static void onFullScreenJSUseDownload() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 189, 1);
        }
    }

    public static void onInitCoreFailed(WebView.WebViewKind webViewKind) {
        int i;
        if (mReporterCallback != null) {
            if (webViewKind == WebView.WebViewKind.WV_KIND_CW || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                i = 82;
            } else if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
                i = 80;
            } else {
                return;
            }
            mReporterCallback.idkeyStat(577, (long) i, 1);
        }
    }

    public static void onInitCoreFailedFinally() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 83, 1);
        }
    }

    public static void onJSException() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 167, 1);
        }
    }

    public static void onJustCrashed(WebView.WebViewKind webViewKind) {
        if (mReporterCallback != null) {
            if (webViewKind == WebView.WebViewKind.WV_KIND_CW || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                mReporterCallback.idkeyStat(577, 61, 1);
                reportDaily(577, 62);
            }
        }
    }

    public static void onPatchApply() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 14, 1);
        }
    }

    public static void onPatchApplyFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 15, 1);
        }
    }

    public static void onPatchApplySuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && webViewReporterInterface != null && j > 0 && j < 120000) {
            webViewReporterInterface.idkeyForPair(577, 577, 16, 17, 1, (int) j);
        }
    }

    public static void onPatchDownload() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 25, 1);
        }
    }

    public static void onPatchDownloadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 26, 1);
        }
    }

    public static void onPatchDownloadSuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && webViewReporterInterface != null && j > 0 && j < 600000) {
            webViewReporterInterface.idkeyForPair(577, 577, 27, 28, 1, (int) j);
        }
    }

    public static void onPluginCheckFailed(String str, boolean z) {
        if (mReporterCallback != null) {
            int i = z ? 55 : 63;
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
                mReporterCallback.idkeyStat(577, 188, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, (long) i, 1);
            }
        }
    }

    public static void onPluginConfigDownload() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 181, 1);
        }
    }

    public static void onPluginConfigDownloadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 183, 1);
        }
    }

    public static void onPluginConfigDownloadSuccess() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 182, 1);
        }
    }

    public static void onPluginConfigParseFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 184, 1);
        }
    }

    public static void onPluginDamaged(String str) {
        if (mReporterCallback != null) {
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, 66, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, 66, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, 66, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, 66, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, 66, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, 66, 1);
            }
        }
    }

    public static void onPluginDoPatchFailed(String str) {
        if (mReporterCallback != null) {
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, 57, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, 57, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, 57, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, 57, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, 57, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, 57, 1);
            }
        }
    }

    public static void onPluginDownload(String str, boolean z) {
        if (mReporterCallback != null) {
            int i = z ? 51 : 60;
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
                mReporterCallback.idkeyStat(577, 185, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, (long) i, 1);
            }
        }
    }

    public static void onPluginDownloadFailed(String str, boolean z) {
        if (mReporterCallback != null) {
            int i = z ? 54 : 62;
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
                mReporterCallback.idkeyStat(577, 187, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, (long) i, 1);
            }
        }
    }

    public static void onPluginDownloadSuccess(String str, boolean z) {
        if (mReporterCallback != null) {
            int i = z ? 52 : 61;
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str)) {
                mReporterCallback.idkeyStat(577, 186, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, (long) i, 1);
            }
        }
    }

    public static void onPluginInstallFailed(String str, boolean z) {
        if (mReporterCallback != null) {
            int i = z ? 59 : 65;
            if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str)) {
                mReporterCallback.idkeyStat(1068, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str)) {
                mReporterCallback.idkeyStat(1071, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str)) {
                mReporterCallback.idkeyStat(1069, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str)) {
                mReporterCallback.idkeyStat(1070, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str)) {
                mReporterCallback.idkeyStat(1544, (long) i, 1);
            } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str)) {
                mReporterCallback.idkeyStat(1889, (long) i, 1);
            }
        }
    }

    public static void onPluginMenuOpenByOtherClick(String str) {
        if (str != null && !str.isEmpty() && mReporterCallback != null) {
            long j = 1544;
            if (str.equalsIgnoreCase(FileReaderHelper.PPT_EXT) || str.equalsIgnoreCase(FileReaderHelper.PPTX_EXT) || str.equalsIgnoreCase(FileReaderHelper.DPS_EXT)) {
                WebViewReporterInterface webViewReporterInterface = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1068;
                }
                webViewReporterInterface.idkeyStat(j, 68, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.PDF_EXT)) {
                mReporterCallback.idkeyStat(1071, 68, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.DOC_EXT) || str.equalsIgnoreCase(FileReaderHelper.DOCX_EXT) || str.equalsIgnoreCase(FileReaderHelper.WPS_EXT)) {
                WebViewReporterInterface webViewReporterInterface2 = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1069;
                }
                webViewReporterInterface2.idkeyStat(j, 68, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.XLS_EXT) || str.equalsIgnoreCase(FileReaderHelper.XLSX_EXT) || str.equalsIgnoreCase(FileReaderHelper.ET_EXT)) {
                WebViewReporterInterface webViewReporterInterface3 = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1070;
                }
                webViewReporterInterface3.idkeyStat(j, 68, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.TXT_EXT)) {
                mReporterCallback.idkeyStat(1889, 68, 1);
            } else if (FileReaderHelper.isAudioFormat(str)) {
                mReporterCallback.idkeyStat(1900, 68, 1);
            }
        }
    }

    public static void onPluginMenuSendClick(String str) {
        if (str != null && !str.isEmpty() && mReporterCallback != null) {
            long j = 1544;
            if (str.equalsIgnoreCase(FileReaderHelper.PPT_EXT) || str.equalsIgnoreCase(FileReaderHelper.PPTX_EXT) || str.equalsIgnoreCase(FileReaderHelper.DPS_EXT)) {
                WebViewReporterInterface webViewReporterInterface = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1068;
                }
                webViewReporterInterface.idkeyStat(j, 67, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.PDF_EXT)) {
                mReporterCallback.idkeyStat(1071, 67, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.DOC_EXT) || str.equalsIgnoreCase(FileReaderHelper.DOCX_EXT) || str.equalsIgnoreCase(FileReaderHelper.WPS_EXT)) {
                WebViewReporterInterface webViewReporterInterface2 = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1069;
                }
                webViewReporterInterface2.idkeyStat(j, 67, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.XLS_EXT) || str.equalsIgnoreCase(FileReaderHelper.XLSX_EXT) || str.equalsIgnoreCase(FileReaderHelper.ET_EXT)) {
                WebViewReporterInterface webViewReporterInterface3 = mReporterCallback;
                if (!FileReaderHelper.getUseOfficeReader(str, false)) {
                    j = 1070;
                }
                webViewReporterInterface3.idkeyStat(j, 67, 1);
            } else if (str.equalsIgnoreCase(FileReaderHelper.TXT_EXT)) {
                mReporterCallback.idkeyStat(1889, 67, 1);
            } else if (FileReaderHelper.isAudioFormat(str)) {
                mReporterCallback.idkeyStat(1900, 67, 1);
            }
        }
    }

    public static void onRuntimeDownload() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 9, 1);
        }
    }

    public static void onRuntimeDownloadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 10, 1);
        }
    }

    public static void onRuntimeDownloadSuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && webViewReporterInterface != null && j > 0 && j < 600000) {
            webViewReporterInterface.idkeyForPair(577, 577, 11, 12, 1, (int) j);
        }
    }

    public static void onSpecialVideoEnterFullscreen(int i, boolean z) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = z ? 163 : 159;
            } else if (i == 1) {
                i2 = z ? 164 : 160;
            } else if (i == 2) {
                i2 = z ? 165 : 161;
            } else if (i == 3) {
                i2 = z ? 166 : 162;
            }
            if (i2 > 0) {
                webViewReporterInterface.idkeyStat(577, (long) i2, 1);
            }
        }
    }

    public static void onSpecialVideoHook(int i, boolean z) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = z ? 155 : 151;
            } else if (i == 1) {
                i2 = z ? 156 : 152;
            } else if (i == 2) {
                i2 = z ? 157 : 153;
            } else if (i == 3) {
                i2 = z ? 158 : 154;
            }
            if (i2 > 0) {
                webViewReporterInterface.idkeyStat(577, (long) i2, 1);
            }
        }
    }

    public static void onStartCheckPluginUpdate() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 180, 1);
        }
    }

    public static void onStartCheckUpdate() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 88, 1);
        }
    }

    public static void onSysWebViewOnShowCustomView() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 56, 1);
            mReporterCallback.idkeyStat(1749, 5, 1);
        }
    }

    public static void onSysWebViewOnShowCustomViewSpecial() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 57, 1);
        }
    }

    public static void onSysWebViewOnShowCustomViewSpecialNative() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 58, 1);
        }
    }

    public static void onSysWebViewOnShowCustomViewSpecialNativeVideo() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 59, 1);
        }
    }

    public static void onSysWebviewLoad() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 46, 1);
        }
    }

    public static void onSysWebviewLoadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 47, 1);
        }
    }

    public static void onSysWebviewLoadSuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && j > 0 && j < 300000) {
            webViewReporterInterface.idkeyForPair(577, 577, 48, 49, 1, (int) j);
        }
    }

    public static void onUseCoreFailed(WebView.WebViewKind webViewKind, int i) {
        if (FrequentLimiter.canDoDaily("kv_" + KVDef.KVXwebInitCoreFailed.f57027ID + webViewKind.toString() + "_" + i)) {
            KVBuilder kVBuilder = new KVBuilder(KVDef.KVXwebInitCoreFailed.f57027ID);
            kVBuilder.append(21, Integer.valueOf(i));
            if (webViewKind == WebView.WebViewKind.WV_KIND_CW || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                kVBuilder.append(22, Integer.valueOf(XWalkEnvironment.getInstalledNewstVersionForCurAbi()));
            } else if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
                kVBuilder.append(22, Integer.valueOf(ChromiumVersionUtil.safeGetChromiumVersion()));
            } else {
                kVBuilder.append(22, 0);
            }
            kVBuilder.append(23, Integer.valueOf(XWebSdk.getXWebSdkVersion()));
            if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(AbiUtil.getRuntimeAbi())) {
                kVBuilder.append(24, Integer.valueOf(KVDef.KVXwebInitCoreFailed.ABI_32));
            } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(AbiUtil.getRuntimeAbi())) {
                kVBuilder.append(24, Integer.valueOf(KVDef.KVXwebInitCoreFailed.ABI_64));
            }
            kVBuilder.append(25, Integer.valueOf(webViewKind.ordinal()));
            kVBuilder.doReportKV();
        }
    }

    public static void onWXWebviewLoad(String str) {
        onWebviewLoad(str);
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 4, 1);
        }
    }

    public static void onWXWebviewLoadFailed() {
        onWebviewLoadFailed();
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 5, 1);
        }
    }

    public static void onWXWebviewLoadSuccess(long j) {
        onWebviewLoadSuccess(j);
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && j > 0 && j < 300000) {
            webViewReporterInterface.idkeyForPair(577, 577, 6, 7, 1, (int) j);
        }
    }

    public static void onWebviewCoreUsed(WebView.WebViewKind webViewKind) {
        String str;
        int i;
        if (mReporterCallback != null) {
            WebView.WebViewKind webViewKind2 = WebView.WebViewKind.WV_KIND_CW;
            if (webViewKind == webViewKind2 || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                str = "REPORT_APK_VER_TIME";
            } else {
                str = "REPORT_APK_VER_TIME_" + webViewKind;
            }
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            String str2 = "";
            String string = XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getString(str, str2);
            if (string != null) {
                str2 = string;
            }
            if (webViewKind == webViewKind2 || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                int i2 = XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getInt("REPORT_XWEB_APK_VER", 0);
                int availableVersion = XWalkEnvironment.getAvailableVersion();
                if (availableVersion > 0) {
                    if (availableVersion != i2 || !format.equals(str2)) {
                        mReporterCallback.idkeyStat(577, (long) ((availableVersion % 50) + 100), 1);
                        XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().edit().putInt("REPORT_XWEB_APK_VER", availableVersion).commit();
                    }
                } else {
                    return;
                }
            }
            if (!format.equals(str2)) {
                if (webViewKind == webViewKind2 || webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                    if (XWalkEnvironment.getAvailableVersion() > 0) {
                        i = 99;
                    } else {
                        return;
                    }
                } else if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
                    i = 97;
                } else {
                    return;
                }
                mReporterCallback.idkeyStat(577, (long) i, 1);
                XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().edit().putString(str, format).commit();
            }
        }
    }

    public static void onWebviewLoad(String str) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 0, 1);
            if (sStrModule.equals(XWalkEnvironment.MODULE_TOOLS) && str != null && getUrlType(str) == 1) {
                mReporterCallback.idkeyStat(903, 103, 1);
            }
            if (!sBHasReportModuleUV) {
                int i = -1;
                if (sStrModule.equals(XWalkEnvironment.MODULE_TOOLS)) {
                    i = 70;
                } else if (sStrModule.equals(XWalkEnvironment.MODULE_APPBRAND)) {
                    i = 73;
                }
                int ordinal = WebView.getCurrentModuleWebCoreType().ordinal() - 1;
                if (WebView.getCurrentModuleWebCoreType() == WebView.WebViewKind.WV_KIND_PINUS) {
                    ordinal = WebView.WebViewKind.WV_KIND_CW.ordinal() - 1;
                }
                if (i >= 70 && ordinal >= 0) {
                    sBHasReportModuleUV = true;
                    reportDaily(577, i + ordinal);
                }
            }
        }
    }

    public static void onWebviewLoadFailed() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 1, 1);
        }
    }

    public static void onWebviewLoadSuccess(long j) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null && j > 0 && j < 300000) {
            webViewReporterInterface.idkeyForPair(577, 577, 2, 3, 1, (int) j);
        }
    }

    public static void onX5WebViewOnShowCustomViewSpecialNativeVideo() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 175, 1);
        }
    }

    public static void onXWWebViewOnShowCustomViewFullscreen() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 52, 1);
            mReporterCallback.idkeyStat(1749, 4, 1);
        }
    }

    public static void onXWWebViewOnShowCustomViewSpecial() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 53, 1);
        }
    }

    public static void onXWWebViewOnShowCustomViewSpecialNative() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 54, 1);
        }
    }

    public static void onXWWebViewOnShowCustomViewSpecialNativeVideo() {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(577, 55, 1);
        }
    }

    public static void reportCoreInstalled() {
        String runtimeAbi = AbiUtil.getRuntimeAbi();
        String str = XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equals(runtimeAbi) ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR;
        int installedNewstVersion = XWalkEnvironment.getInstalledNewstVersion(runtimeAbi);
        int installedNewstVersion2 = XWalkEnvironment.getInstalledNewstVersion(str);
        XWebLog.m21911i(TAG, "reportCoreInstalled, cur abi(" + runtimeAbi + "), ver = " + installedNewstVersion + ", predown abi(" + str + "), ver = " + installedNewstVersion2);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(installedNewstVersion);
        boolean valueChanged = FrequentLimiter.valueChanged("report_core_ver", sb.toString());
        if (FrequentLimiter.canDoDaily("report_core_daily") || valueChanged) {
            if (installedNewstVersion <= 0) {
                reportWithLog(1367, 251, 1);
            } else {
                reportWithLog(1367, (long) ((installedNewstVersion % 100) + 0), 1);
            }
        }
        boolean valueChanged2 = FrequentLimiter.valueChanged("report_core_ver_predown", "" + installedNewstVersion2);
        if (FrequentLimiter.canDoDaily("report_core_daily_predown") || valueChanged2) {
            if (installedNewstVersion2 <= 0) {
                reportWithLog(1367, 252, 1);
            } else {
                reportWithLog(1367, (long) ((installedNewstVersion2 % 100) + 100), 1);
            }
        }
        if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(runtimeAbi)) {
            String deviceAbi = AbiUtil.getDeviceAbi();
            if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(deviceAbi)) {
                reportDaily(ID1367KeyDef.f57028ID, 253);
            } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(deviceAbi)) {
                reportDaily(ID1367KeyDef.f57028ID, 254);
            }
        } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(runtimeAbi)) {
            reportDaily(ID1367KeyDef.f57028ID, 255);
        }
    }

    public static void reportDaily(int i, int i2) {
        if (mReporterCallback != null) {
            SharedPreferences sharedPreferencesForReportDaily = XWebSharedPreferenceUtil.getSharedPreferencesForReportDaily();
            String str = "id_" + i + "_key_" + i2;
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            if (!format.equals(sharedPreferencesForReportDaily.getString(str, ""))) {
                mReporterCallback.idkeyStat((long) i, (long) i2, 1);
                sharedPreferencesForReportDaily.edit().putString(str, format).commit();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void reportPVNew(java.lang.String r7, com.tencent.xweb.WebView r8) {
        /*
            java.lang.Class<com.tencent.xweb.util.WXWebReporter> r8 = com.tencent.xweb.util.WXWebReporter.class
            monitor-enter(r8)
            com.tencent.xweb.WebViewReporterInterface r0 = mReporterCallback     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r8)
            return
        L_0x0009:
            reportUVNew()     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0025
            java.lang.String r0 = "https://servicewechat.com/preload/page-frame.html"
            java.lang.String r7 = r7.trim()     // Catch:{ all -> 0x0058 }
            boolean r7 = r0.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0025
            com.tencent.xweb.WebViewReporterInterface r0 = mReporterCallback     // Catch:{ all -> 0x0058 }
            r1 = 903(0x387, double:4.46E-321)
            r3 = 102(0x66, double:5.04E-322)
            r5 = 1
            r0.idkeyStat(r1, r3, r5)     // Catch:{ all -> 0x0058 }
        L_0x0025:
            int r7 = getPVUVModuleStart()     // Catch:{ all -> 0x0058 }
            com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.getCurrentModuleWebCoreType()     // Catch:{ all -> 0x0058 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0058 }
            int r0 = r0 + -1
            com.tencent.xweb.WebView$WebViewKind r1 = com.tencent.xweb.WebView.getCurrentModuleWebCoreType()     // Catch:{ all -> 0x0058 }
            com.tencent.xweb.WebView$WebViewKind r2 = com.tencent.xweb.WebView.WebViewKind.WV_KIND_PINUS     // Catch:{ all -> 0x0058 }
            if (r1 != r2) goto L_0x0043
            com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.WebViewKind.WV_KIND_CW     // Catch:{ all -> 0x0058 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0058 }
            int r0 = r0 + -1
        L_0x0043:
            r1 = 30
            if (r7 < r1) goto L_0x0056
            if (r0 < 0) goto L_0x0056
            int r7 = r7 + 0
            int r7 = r7 + r0
            com.tencent.xweb.WebViewReporterInterface r0 = mReporterCallback     // Catch:{ all -> 0x0058 }
            r1 = 903(0x387, double:4.46E-321)
            long r3 = (long) r7     // Catch:{ all -> 0x0058 }
            r5 = 1
            r0.idkeyStat(r1, r3, r5)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r8)
            return
        L_0x0058:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WXWebReporter.reportPVNew(java.lang.String, com.tencent.xweb.WebView):void");
    }

    public static void reportUVNew() {
        if (!s_isReported903Uv) {
            int pVUVModuleStart = getPVUVModuleStart();
            int ordinal = WebView.getCurrentModuleWebCoreType().ordinal() - 1;
            if (WebView.getCurrentModuleWebCoreType() == WebView.WebViewKind.WV_KIND_PINUS) {
                ordinal = WebView.WebViewKind.WV_KIND_CW.ordinal() - 1;
            }
            if (pVUVModuleStart >= 30 && ordinal >= 0) {
                s_isReported903Uv = true;
                reportDaily(903, pVUVModuleStart + 3 + ordinal);
            }
        }
    }

    public static void reportWebViewOnShowCustomView(WebView.WebViewKind webViewKind, boolean z, String str) {
        int i;
        if (mReporterCallback != null) {
            if (webViewKind == WebView.WebViewKind.WV_KIND_PINUS) {
                i = z ? 78 : 82;
            } else if (webViewKind == WebView.WebViewKind.WV_KIND_CW) {
                i = z ? 77 : 81;
            } else if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
                i = z ? 75 : 79;
            } else {
                return;
            }
            mReporterCallback.idkeyStat(1749, (long) i, 1);
            KVReportForVideoFullscreen.report(webViewKind, z ? 1 : 2, 2, false, str);
        }
    }

    public static void reportWithLog(long j, long j2, long j3) {
        XWebLog.m21911i(TAG, "report idkey id = " + j + " key = " + j2 + " value = " + j3);
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(j, j2, j3);
        }
    }

    public static void reportXFilesAction(String str, String str2, String str3, int i, int i2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) {
            XWebLog.m21909e(TAG, "reportXFilesAction failed, invalid param");
            return;
        }
        String str4 = str + "," + str2 + "," + str3 + "," + i + "," + i2;
        XWebLog.m21911i(TAG, "reportXFilesAction key = 25696, value = " + str4);
        setKVLog(WXWEB_KV_FR_ACTION, str4);
    }

    public static void setCurrentModule(String str) {
        if (str != null) {
            sStrModule = str;
        }
    }

    public static void setKVLog(int i, String str) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.kvStat(i, str);
        }
    }

    public static void setMostPrefferdCore(WebView.WebViewKind webViewKind) {
        wvKindMostPrefferd = webViewKind;
        XWebLog.m21911i(TAG, "setMostPrefferdCore, kind:" + webViewKind);
    }

    public static void setReporterCallback(WebViewReporterInterface webViewReporterInterface) {
        mReporterCallback = webViewReporterInterface;
    }

    public static void idkeyReport(long j, long j2, long j3) {
        WebViewReporterInterface webViewReporterInterface = mReporterCallback;
        if (webViewReporterInterface != null) {
            webViewReporterInterface.idkeyStat(j, j2, j3);
        }
    }
}
