package com.tencent.xweb.xwalk.plugin;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.tencent.xweb.FileReaderCrashDetector;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.XWebClassLoaderWrapper;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public abstract class XWalkReaderBasePlugin extends XWalkPlugin {
    public static final String ACTION_CALLBACK_NAME_ON_DOUBLE_TAP = "ac_onDoubleTap";
    public static final String ACTION_CALLBACK_NAME_ON_GENERAL_CALLBACK = "ac_onGeneralCallback";
    public static final String ACTION_CALLBACK_NAME_ON_PAGE_CHANGE = "ac_onPageChange";
    public static final String ACTION_CALLBACK_NAME_ON_PAGE_COUNT_UPDATE = "ac_onPageCountUpdate";
    public static final String ACTION_CALLBACK_NAME_ON_REACH_END = "ac_onReachEnd";
    public static final String ACTION_CALLBACK_NAME_ON_SINGLE_TAP = "ac_onSingleTap";
    public static final String ACTION_CALLBACK_NAME_ON_THUMBNAIL_LOAD = "ac_onThumbnailLoad";
    public static final String ACTION_CALLBACK_NAME_ON_USER_CANCEL = "ac_onUserCancel";
    public static final String ACTION_CALLBACK_NAME_ON_USER_OPERATED = "ac_onUserOperated";
    public static final String ACTION_CALLBACK_NAME_ON_VIEW_STATUS_CHANGE = "ac_onViewStatusChange";
    public static final String ACTION_CALLBACK_PARAM_KEY_GENERAL_CALLBACK_NAME = "ac_generalCallbackName";
    public static final String ACTION_CALLBACK_PARAM_KEY_MOTION_EVENT = "ac_motionEvent";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_HEIGHT = "ac_pageHeight";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_INDEX = "ac_pageIndex";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_WIDTH = "ac_pageWidth";
    public static final String ACTION_CALLBACK_PARAM_KEY_THUMBNAIL = "ac_thumbnail";
    public static final String ACTION_CALLBACK_PARAM_KEY_TOTAL_COUNT = "ac_totalCount";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_HEIGHT = "ac_curHeight";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_WIDTH = "ac_curWidth";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_INDEX = "ac_viewIndex";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_X = "ac_viewTransX";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_Y = "ac_viewTransY";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_ZOOM = "ac_viewZoom";
    public static final String BATCH_METHOD_NAME = "batchConvert";
    public static final String DEX_DIR_NAME = "dex";
    public static final String FINISH_METHOD_NAME = "finishReadFile";
    public static final String GENERAL_INVOKE_METHOD_NAME = "generalInvoke";
    public static final String GENERAL_INVOKE_NAME = "gi_name";
    public static final String GENERAL_INVOKE_NAME_SET_DISABLE_DOUBLE_TAP = "gi_setDisableDoubleTap";
    public static final String GENERAL_INVOKE_NAME_SET_DISABLE_SCROLL = "gi_setDisableScroll";
    public static final String GENERAL_INVOKE_NAME_SET_TOUCH_EVENT = "gi_setTouchEvent";
    public static final String GENERAL_INVOKE_PARAM_KEY_DISABLE_DOUBLE_TAP = "gi_disableDoubleTap";
    public static final String GENERAL_INVOKE_PARAM_KEY_DISABLE_SCROLL = "gi_disableScroll";
    public static final String GENERAL_INVOKE_PARAM_KEY_TOUCH_EVENT = "gi_touchEvent";
    public static final String GET_SUPPORT_METHOD_NAME = "getSupportFormats";
    public static final String GET_VIEW_STATUS_METHOD_NAME = "getViewStatus";
    public static final String PARAM_KEY_BATCH_FILE_NAME = "batch_file_name";
    public static final String PARAM_KEY_BATCH_IN_DIR = "batch_in_dir";
    public static final String PARAM_KEY_BATCH_OUT_DIR = "batch_out_dir";
    public static final String PARAM_KEY_BATCH_REMAINING = "batch_remaining";
    public static final String PARAM_KEY_BATCH_SAVE_FILE = "batch_save_file";
    public static final String PARAM_KEY_CACHE_DIR = "cache_dir";
    public static final String PARAM_KEY_CONFIG_PARAM_PREFIX = "config_param_";
    public static final String PARAM_KEY_DARK_MODE = "dark_mode";
    public static final String PARAM_KEY_DISABLE_CACHE = "disable_cache";
    public static final String PARAM_KEY_DISABLE_ENCRY = "disable_encry";
    public static final String PARAM_KEY_ENV_CHANGED = "env_changed";
    public static final String PARAM_KEY_FILE_EXT = "file_ext";
    public static final String PARAM_KEY_FILE_PASSWORD = "file_password";
    public static final String PARAM_KEY_FILE_PATH = "file_path";
    public static final String PARAM_KEY_GET_INDEX = "get_index";
    public static final String PARAM_KEY_GET_X = "get_x";
    public static final String PARAM_KEY_GET_Y = "get_y";
    public static final String PARAM_KEY_GET_ZOOM = "get_zoom";
    public static final String PARAM_KEY_MEMORY_START = "memory_start";
    public static final String PARAM_KEY_PLUGIN_VERSION = "plugin_version";
    public static final String PARAM_KEY_RES_DIR = "res_dir";
    public static final String PARAM_KEY_SET_INDEX = "set_index";
    public static final String PARAM_KEY_SET_X = "set_x";
    public static final String PARAM_KEY_SET_Y = "set_y";
    public static final String PARAM_KEY_SET_ZOOM = "set_zoom";
    public static final String PARAM_KEY_STR_BUTTON_CANCEL = "str_button_cancel";
    public static final String PARAM_KEY_STR_BUTTON_CONFIRM = "str_button_confirm";
    public static final String PARAM_KEY_STR_HINT_COPIED = "str_hint_copied";
    public static final String PARAM_KEY_STR_OPERATION_COPY = "str_operation_copy";
    public static final String PARAM_KEY_STR_PASSWORD_HINT = "str_password_hint";
    public static final String PARAM_KEY_STR_PASSWORD_TITLE = "str_password_title";
    public static final String PARAM_KEY_STR_PASSWORD_WRONG = "str_password_wrong";
    public static final String PARAM_KEY_THUMBNAIL_INDEX = "thumbnail_index";
    public static final String PARAM_KEY_TIME_START = "time_start";
    public static final String PARAM_KEY_TOKEN = "token";
    public static final String PARAM_KEY_VIEW_TYPE = "view_type";
    public static final String PARAM_VALUE_VIEW_TYPE_LIST = "view_type_list";
    public static final String PARAM_VALUE_VIEW_TYPE_READER = "view_type_reader";
    public static final String READ_METHOD_NAME = "readFile";
    public static final String REQUEST_THUMBNAIL_METHOD_NAME = "requestThumbnail";
    public static final String SET_VIEW_TO_STATUS_METHOD_NAME = "setViewToStatus";
    public int loadedClassVersion = -1;
    public Class loadedEnvClass = null;
    public Class loadedReaderClass = null;
    public ValueCallback<Pair<Integer, String>> logCallback = new ValueCallback<Pair<Integer, String>>() {
        public void onReceiveValue(Pair<Integer, String> pair) {
            if (((Integer) pair.first).intValue() == 0) {
                XWebLog.m21912v(XWalkReaderBasePlugin.this.getPluginName(), (String) pair.second);
            } else if (((Integer) pair.first).intValue() == 1) {
                XWebLog.m21908d(XWalkReaderBasePlugin.this.getPluginName(), (String) pair.second);
            } else if (((Integer) pair.first).intValue() == 2) {
                XWebLog.m21911i(XWalkReaderBasePlugin.this.getPluginName(), (String) pair.second);
            } else if (((Integer) pair.first).intValue() == 3) {
                XWebLog.m21913w(XWalkReaderBasePlugin.this.getPluginName(), (String) pair.second);
            } else if (((Integer) pair.first).intValue() == 4) {
                XWebLog.m21909e(XWalkReaderBasePlugin.this.getPluginName(), (String) pair.second);
            }
        }
    };
    public ValueCallback<Pair<Integer, String>> reportCallback = new ValueCallback<Pair<Integer, String>>() {
        public void onReceiveValue(Pair<Integer, String> pair) {
            if (((Integer) pair.first).intValue() == 0) {
                try {
                    String[] split = ((String) pair.second).split(XVFSFile.PATH_SEPARATOR);
                    if (split.length == 3) {
                        WXWebReporter.idkeyReport(Long.parseLong(split[0]), (long) Integer.parseInt(split[1]), (long) Integer.parseInt(split[2]));
                    }
                } catch (Throwable th) {
                    XWebLog.m21910e(XWalkReaderBasePlugin.this.getPluginName(), "idkeyReport parse failed, value:" + ((String) pair.second) + ", error", th);
                }
            } else if (((Integer) pair.first).intValue() == 1) {
                try {
                    String[] split2 = ((String) pair.second).split(XVFSFile.PATH_SEPARATOR);
                    if (split2.length == 2) {
                        int parseInt = Integer.parseInt(split2[0]);
                        String str = split2[1];
                        if (parseInt == 17565 || parseInt == 17564) {
                            str = XWalkReaderBasePlugin.this.getAvailableVersion() + "," + split2[1];
                        }
                        WXWebReporter.setKVLog(parseInt, str);
                    }
                } catch (Throwable th4) {
                    XWebLog.m21910e(XWalkReaderBasePlugin.this.getPluginName(), "setKVLog parse failed, value:" + ((String) pair.second) + ", error", th4);
                }
            }
        }
    };

    private String getCurrentEnvInfo() {
        return "display_" + Build.DISPLAY + ",sdk_" + Build.VERSION.SDK_INT + ",release_" + Build.VERSION.RELEASE + ",client_" + XWalkEnvironment.getInitConfig(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
    }

    private String getSupportFormats() {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "getSupportFormat, context is null");
            return "";
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo != null) {
            return sharedPreferencesForPluginVersionInfo.getString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_SUPPORT_FORMATS, "");
        }
        XWebLog.m21909e(getPluginName(), "getSupportFormat, sp is null");
        return "";
    }

    private boolean isEnvChanged() {
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo != null) {
            return !getCurrentEnvInfo().equals(sharedPreferencesForPluginVersionInfo.getString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_ENV_INFO, ""));
        }
        XWebLog.m21909e(getPluginName(), "recordEnv sp is null");
        return true;
    }

    private String loadSupportFormatsFromPlugin(ClassLoader classLoader) {
        Class<?> cls;
        if (classLoader != null) {
            try {
                cls = classLoader.loadClass(getEnvClassPath());
            } catch (Throwable th) {
                String pluginName = getPluginName();
                XWebLog.m21909e(pluginName, "loadSupportFormatsFromPlugin error: " + th);
                return "";
            }
        } else {
            ensurePluginClass();
            cls = this.loadedEnvClass;
        }
        Method method = cls.getMethod(GET_SUPPORT_METHOD_NAME, new Class[0]);
        method.setAccessible(true);
        String str = (String) method.invoke((Object) null, new Object[0]);
        return str == null ? "" : str;
    }

    /* access modifiers changed from: private */
    public void recordEnv() {
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "recordEnv sp is null");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
        if (edit == null) {
            XWebLog.m21909e(getPluginName(), "recordEnv sp is null");
            return;
        }
        edit.putString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_ENV_INFO, getCurrentEnvInfo());
        edit.commit();
    }

    private boolean saveSupportFormats(String str) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "saveSupportFormats, context is null");
            return false;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "saveSupportFormats, sp is null");
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
        edit.putString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_SUPPORT_FORMATS, str);
        boolean commit = edit.commit();
        String pluginName = getPluginName();
        XWebLog.m21911i(pluginName, "loadSupportFormat, ret = " + commit + ", formats: " + str);
        return commit;
    }

    public boolean batchConvert(HashMap<String, String> hashMap, Activity activity, ValueCallback<Pair<Integer, String>> valueCallback, ValueCallback<Pair<Integer, String>> valueCallback2, ValueCallback<Integer> valueCallback3) {
        HashMap<String, String> hashMap2 = hashMap;
        Activity activity2 = activity;
        if (hashMap2 == null || activity2 == null) {
            Toast.makeText(activity2, "参数错误", 0).show();
            return false;
        }
        int availableVersion = getAvailableVersion(true);
        if (availableVersion <= 0) {
            Toast.makeText(activity2, "插件未安装", 0).show();
            return false;
        } else if (availableVersion < getMinSupportRuntimeVersion(0)) {
            Toast.makeText(activity2, "插件版本不符合要求", 0).show();
            return false;
        } else {
            try {
                hashMap2.put(PARAM_KEY_CACHE_DIR, getPrivateCacheDir(availableVersion));
                hashMap2.put(PARAM_KEY_RES_DIR, getExtractDir(availableVersion));
                hashMap2.put(PARAM_KEY_PLUGIN_VERSION, String.valueOf(availableVersion));
                hashMap2.put(PARAM_KEY_DISABLE_CACHE, String.valueOf(false));
                hashMap2.put(PARAM_KEY_DISABLE_ENCRY, String.valueOf(true));
                ensurePluginClass();
                Method method = this.loadedReaderClass.getMethod(BATCH_METHOD_NAME, new Class[]{Activity.class, ViewGroup.class, ClassLoader.class, HashMap.class, ValueCallback.class, ValueCallback.class, ValueCallback.class});
                FrameLayout frameLayout = new FrameLayout(activity2);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(-7829368);
                activity2.setContentView(frameLayout);
                method.setAccessible(true);
                method.invoke((Object) null, new Object[]{activity2, frameLayout, this.loadedReaderClass.getClassLoader(), hashMap2, valueCallback, valueCallback2, valueCallback3});
                return true;
            } catch (Throwable unused) {
                Toast.makeText(activity2, "反射失败！", 0).show();
                return false;
            }
        }
    }

    public void checkFiles() {
        int availableVersion = getAvailableVersion();
        if (availableVersion < 0) {
            XWebLog.m21911i(getPluginName(), "checkFiles, not installed");
        } else if (!checkFileListConfig(availableVersion, true)) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "checkFiles failed, abandon version " + availableVersion);
            WXWebReporter.onPluginDamaged(getPluginName());
            String versionDir = getVersionDir(availableVersion);
            setAvailableVersion(-1, true);
            if (versionDir != null && !versionDir.isEmpty()) {
                FileUtils.deleteAll(versionDir);
            }
        }
    }

    public void ensurePluginClass() {
        synchronized (this) {
            int availableVersion = getAvailableVersion(true);
            if (this.loadedReaderClass == null || this.loadedEnvClass == null || this.loadedClassVersion != availableVersion) {
                String pluginName = getPluginName();
                XWebLog.m21911i(pluginName, "load class of version " + availableVersion);
                ClassLoader classLoader = XWebClassLoaderWrapper.getClassLoader(getAPKPath(availableVersion), getDexDir(availableVersion), getExtractDir(availableVersion));
                this.loadedReaderClass = classLoader.loadClass(getReaderClassPath());
                this.loadedEnvClass = classLoader.loadClass(getEnvClassPath());
                this.loadedClassVersion = availableVersion;
            }
        }
    }

    public void finishReadFile(HashMap<String, String> hashMap) {
        Class cls = this.loadedReaderClass;
        if (cls == null) {
            XWebLog.m21909e(getPluginName(), "finishReadFile error, loadedReaderClass is null");
            return;
        }
        try {
            Method method = cls.getMethod(FINISH_METHOD_NAME, new Class[]{HashMap.class});
            method.setAccessible(true);
            method.invoke((Object) null, new Object[]{hashMap});
        } catch (Throwable th) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "finishReadFile error: " + th);
        }
    }

    public Object generalInvoke(HashMap<String, Object> hashMap) {
        Class cls = this.loadedReaderClass;
        if (cls == null) {
            XWebLog.m21909e(getPluginName(), "generalInvoke error, loadedReaderClass is null");
            return null;
        }
        try {
            Method method = cls.getMethod(GENERAL_INVOKE_METHOD_NAME, new Class[]{HashMap.class});
            method.setAccessible(true);
            return method.invoke((Object) null, new Object[]{hashMap});
        } catch (Throwable th) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "generalInvoke error: " + th);
            return null;
        }
    }

    public abstract String getAPKPath(int i);

    public String getDexDir(int i) {
        String versionDir = getVersionDir(i);
        if (versionDir == null || versionDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getDexDir, versionDir is empty");
            return "";
        }
        return versionDir + File.separator + "dex";
    }

    public String getDownloadFullPath(int i, boolean z) {
        String versionDir = getVersionDir(i);
        if (versionDir == null || versionDir.isEmpty()) {
            return "";
        }
        if (!z) {
            return versionDir + File.separator + getPluginName() + ".zip";
        }
        return versionDir + File.separator + getPluginName() + ".patch";
    }

    public abstract String getEnvClassPath();

    public abstract int getMinSupportRuntimeVersion(int i);

    public abstract String getReaderClassPath();

    public XFileSdk.ViewStatus getViewStatus(HashMap<String, Object> hashMap) {
        Class cls = this.loadedReaderClass;
        if (cls == null) {
            XWebLog.m21909e(getPluginName(), "getViewStatus error, loadedReaderClass is null");
            return null;
        }
        try {
            Method method = cls.getMethod(GET_VIEW_STATUS_METHOD_NAME, new Class[]{HashMap.class});
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[]{hashMap});
            if (invoke instanceof HashMap) {
                HashMap hashMap2 = (HashMap) invoke;
                Object obj = hashMap2.get(PARAM_KEY_GET_INDEX);
                Object obj2 = hashMap2.get(PARAM_KEY_GET_ZOOM);
                Object obj3 = hashMap2.get(PARAM_KEY_GET_X);
                Object obj4 = hashMap2.get(PARAM_KEY_GET_Y);
                if ((obj instanceof Integer) && (obj2 instanceof Float) && (obj3 instanceof Integer)) {
                    if (obj4 instanceof Integer) {
                        return new XFileSdk.ViewStatus(((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                    }
                }
                XWebLog.m21909e(getPluginName(), "getViewStatus error, value invalid");
            }
            return null;
        } catch (Throwable th) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "getViewStatus error: " + th);
            return null;
        }
    }

    public boolean isIgnoreForbidDownloadCode() {
        return false;
    }

    public boolean isSupport(String str, boolean z) {
        if (getAvailableVersion() < 0) {
            XWebLog.m21911i(getPluginName(), "isSupport, not installed");
            return false;
        }
        String supportFormats = getSupportFormats();
        if (supportFormats.isEmpty() && z) {
            try {
                supportFormats = loadSupportFormatsFromPlugin((ClassLoader) null);
                saveSupportFormats(supportFormats);
            } catch (Throwable th) {
                String pluginName = getPluginName();
                XWebLog.m21909e(pluginName, "isSupport error: " + th);
                return false;
            }
        }
        return supportFormats.toLowerCase().contains(str.toLowerCase());
    }

    public void onReceiveValueProcess(ValueCallback<Integer> valueCallback, int i) {
        int availableVersion = getAvailableVersion();
        if (availableVersion > 0 && (i == -3 || i == -13)) {
            synchronized (this) {
                this.loadedReaderClass = null;
                this.loadedEnvClass = null;
                this.loadedClassVersion = -1;
            }
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "invoke error or abi not match, abandon current version " + availableVersion);
            String versionDir = getVersionDir(availableVersion);
            setAvailableVersion(-1, true);
            if (versionDir != null && !versionDir.isEmpty()) {
                FileUtils.deleteAll(versionDir);
            }
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Integer.valueOf(i));
        }
    }

    public int performInstall(SchedulerConfig schedulerConfig) {
        XWebLog.m21911i(getPluginName(), "performInstall version " + schedulerConfig.version);
        boolean unZipAndCheck = unZipAndCheck(schedulerConfig);
        if (!unZipAndCheck) {
            XWebLog.m21909e(getPluginName(), "performInstall unZipAndCheck failed");
            WXWebReporter.onPluginCheckFailed(getPluginName(), schedulerConfig.bIsPatchUpdate);
            return -2;
        }
        if (schedulerConfig.bIsPatchUpdate) {
            try {
                unZipAndCheck = doPatch(schedulerConfig);
            } catch (Throwable th) {
                XWebLog.m21910e(getPluginName(), "performInstall doPatch error", th);
            }
            if (!unZipAndCheck) {
                XWebLog.m21909e(getPluginName(), "performInstall doPatch failed, delete all");
                WXWebReporter.onPluginDoPatchFailed(getPluginName());
                String versionDir = getVersionDir(schedulerConfig.version);
                if (versionDir.isEmpty()) {
                    return -3;
                }
                FileUtils.deleteAll(versionDir);
                return -3;
            }
        }
        String aPKPath = getAPKPath(schedulerConfig.version);
        String extractDir = getExtractDir(schedulerConfig.version);
        String dexDir = getDexDir(schedulerConfig.version);
        File file = new File(dexDir);
        if (!file.exists()) {
            file.mkdirs();
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists()) {
                        file2.delete();
                    }
                }
            }
        }
        try {
            String loadSupportFormatsFromPlugin = loadSupportFormatsFromPlugin(XWebClassLoaderWrapper.getClassLoader(aPKPath, dexDir, extractDir));
            saveSupportFormats(loadSupportFormatsFromPlugin);
            String[] split = loadSupportFormatsFromPlugin.split(",");
            WebDebugCfg.getInst().setForceUseOfficeReader(split, FileReaderHelper.UseOfficeReader.none);
            FileReaderCrashDetector.resetCrashInfo(split);
            clearPatchDownloadInfo();
            String privateCacheDir = getPrivateCacheDir(schedulerConfig.version);
            if (privateCacheDir != null && !privateCacheDir.isEmpty()) {
                FileUtils.deleteAll(privateCacheDir);
            }
            setAvailableVersion(schedulerConfig.version, true);
            XWebLog.m21911i(getPluginName(), "performInstall version " + getAvailableVersion() + " success");
            return 0;
        } catch (Throwable th4) {
            WXWebReporter.onPluginInstallFailed(getPluginName(), schedulerConfig.bIsPatchUpdate);
            XWebLog.m21909e(getPluginName(), "performInstall error: " + th4);
            return -4;
        }
    }

    public boolean readFile(HashMap<String, String> hashMap, Activity activity, ViewGroup viewGroup, ValueCallback<Pair<String, Object>> valueCallback, ValueCallback<Integer> valueCallback2) {
        HashMap<String, String> hashMap2 = hashMap;
        final ValueCallback<Integer> valueCallback3 = valueCallback2;
        Class<Activity> cls = Activity.class;
        if (hashMap2 == null || activity == null || viewGroup == null) {
            XWebLog.m21909e(getPluginName(), "readFile params is null");
            onReceiveValueProcess(valueCallback3, -5);
            return false;
        }
        final String str = hashMap2.get(PARAM_KEY_FILE_EXT);
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "readFile fileExt is null");
            onReceiveValueProcess(valueCallback3, -5);
            return false;
        }
        int availableVersion = getAvailableVersion();
        if (availableVersion <= 0) {
            XWebLog.m21909e(getPluginName(), "readFile plugin not installed");
            onReceiveValueProcess(valueCallback3, -2);
            return false;
        }
        int minSupportRuntimeVersion = getMinSupportRuntimeVersion(valueCallback != null ? 1 : 0);
        if (availableVersion < minSupportRuntimeVersion) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "readFile plugin version is too old, require: " + minSupportRuntimeVersion);
            onReceiveValueProcess(valueCallback3, -11);
            return false;
        }
        String pluginName2 = getPluginName();
        XWebLog.m21911i(pluginName2, "readFile by xweb, plugin version " + availableVersion);
        if (XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID, 100, 150);
        } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_PDF_ID, 100, 150);
        } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_WORD_ID, 100, 150);
        } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID, 100, 150);
        } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID, 100, 150);
        } else if (XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equalsIgnoreCase(getPluginName())) {
            reportUsingVersion(availableVersion, WXWebReporter.WXWEB_IDKEY_FR_TXT_ID, 100, 150);
        } else {
            XWebLog.m21909e(getPluginName(), "unknown report id");
        }
        try {
            boolean isEnvChanged = isEnvChanged();
            if (isEnvChanged) {
                XWebLog.m21911i(getPluginName(), "readFile, env changed");
            }
            hashMap2.put(PARAM_KEY_ENV_CHANGED, String.valueOf(isEnvChanged));
            hashMap2.put(PARAM_KEY_CACHE_DIR, getPrivateCacheDir(availableVersion));
            hashMap2.put(PARAM_KEY_RES_DIR, getExtractDir(availableVersion));
            hashMap2.put(PARAM_KEY_PLUGIN_VERSION, String.valueOf(availableVersion));
            ensurePluginClass();
            if (valueCallback != null) {
                Method method = this.loadedReaderClass.getMethod(READ_METHOD_NAME, new Class[]{cls, ViewGroup.class, ClassLoader.class, HashMap.class, ValueCallback.class, ValueCallback.class, ValueCallback.class, ValueCallback.class});
                method.setAccessible(true);
                FileReaderCrashDetector.onStart(str);
                method.invoke((Object) null, new Object[]{activity, viewGroup, this.loadedReaderClass.getClassLoader(), hashMap2, valueCallback, this.logCallback, this.reportCallback, new ValueCallback<Integer>() {
                    public void onReceiveValue(Integer num) {
                        String pluginName = XWalkReaderBasePlugin.this.getPluginName();
                        XWebLog.m21911i(pluginName, "readFile onReceiveValue: " + num);
                        FileReaderCrashDetector.onFinish(str);
                        XWalkReaderBasePlugin.this.recordEnv();
                        XWalkReaderBasePlugin.this.onReceiveValueProcess(valueCallback3, num.intValue());
                    }
                }});
            } else {
                Method method2 = this.loadedReaderClass.getMethod(READ_METHOD_NAME, new Class[]{cls, ViewGroup.class, ClassLoader.class, HashMap.class, ValueCallback.class, ValueCallback.class, ValueCallback.class});
                method2.setAccessible(true);
                FileReaderCrashDetector.onStart(str);
                method2.invoke((Object) null, new Object[]{activity, viewGroup, this.loadedReaderClass.getClassLoader(), hashMap2, this.logCallback, this.reportCallback, new ValueCallback<Integer>() {
                    public void onReceiveValue(Integer num) {
                        String pluginName = XWalkReaderBasePlugin.this.getPluginName();
                        XWebLog.m21911i(pluginName, "readFile onReceiveValue: " + num);
                        FileReaderCrashDetector.onFinish(str);
                        XWalkReaderBasePlugin.this.recordEnv();
                        XWalkReaderBasePlugin.this.onReceiveValueProcess(valueCallback3, num.intValue());
                    }
                }});
            }
            return true;
        } catch (Throwable th) {
            String pluginName3 = getPluginName();
            XWebLog.m21909e(pluginName3, "readFile error: " + th);
            FileReaderHelper.reportException(getPluginName() + "_" + str, availableVersion, "invoke error ", th);
            onReceiveValueProcess(valueCallback3, -3);
            return false;
        }
    }

    public boolean requestThumbnail(HashMap<String, Object> hashMap) {
        Class cls = this.loadedReaderClass;
        if (cls == null) {
            XWebLog.m21909e(getPluginName(), "requestThumbnail error, loadedReaderClass is null");
            return false;
        }
        try {
            Method method = cls.getMethod(REQUEST_THUMBNAIL_METHOD_NAME, new Class[]{HashMap.class});
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[]{hashMap});
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "requestThumbnail error: " + th);
            return false;
        }
    }

    public boolean setViewToStatus(HashMap<String, Object> hashMap) {
        Class cls = this.loadedReaderClass;
        if (cls == null) {
            XWebLog.m21909e(getPluginName(), "setViewToStatus error, loadedReaderClass is null");
            return false;
        }
        try {
            Method method = cls.getMethod(SET_VIEW_TO_STATUS_METHOD_NAME, new Class[]{HashMap.class});
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[]{hashMap});
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            String pluginName = getPluginName();
            XWebLog.m21909e(pluginName, "setViewToStatus error: " + th);
            return false;
        }
    }
}
