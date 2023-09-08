package com.tencent.xweb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;

public class FileReaderXWeb {
    private static final String TAG = "FileReaderXWeb";
    private static Map<String, String> sRecordMap = new HashMap();
    /* access modifiers changed from: private */
    public static WCWebUpdater.IWebviewPluginUpdater sUpdater = null;
    private byte _hellAccFlag_;

    public static void finishReadFile(String str, String str2) {
        try {
            if (sUpdater != null) {
                XWebLog.m21911i(TAG, "finishReadFile pre updater exist, cancel it");
                sUpdater.cancelPluginUpdate();
                sUpdater = null;
            }
            Map<String, String> map = sRecordMap;
            String str3 = map.get(str + str2);
            if (str3 != null) {
                Map<String, String> map2 = sRecordMap;
                map2.remove(str + str2);
                XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                if (plugin instanceof XWalkReaderBasePlugin) {
                    XWebLog.m21911i(TAG, "finishReadFile " + str3);
                    HashMap hashMap = new HashMap();
                    hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, str2);
                    hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                    ((XWalkReaderBasePlugin) plugin).finishReadFile(hashMap);
                    return;
                }
                XWebLog.m21909e(TAG, "finishReadFile unknown plugin: " + str3);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "finishReadFile error", th);
        }
    }

    /* access modifiers changed from: private */
    public static Bitmap getBitmapFromParams(HashMap<String, Object> hashMap, String str) {
        if (hashMap == null) {
            XWebLog.m21909e(TAG, "getBitmapFromParams params is null");
            return null;
        }
        try {
            Object obj = hashMap.get(str);
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            XWebLog.m21909e(TAG, "getBitmapFromParams value is not bitmap, key: " + str);
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getBitmapFromParams error", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static Float getFloatFromParams(HashMap<String, Object> hashMap, String str) {
        if (hashMap == null) {
            XWebLog.m21909e(TAG, "getFloatFromParams params is null");
            return null;
        }
        try {
            Object obj = hashMap.get(str);
            if (obj instanceof Float) {
                return (Float) obj;
            }
            XWebLog.m21909e(TAG, "getFloatFromParams value is not float, key: " + str);
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getFloatFromParams error", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static Integer getIntegerFromParams(HashMap<String, Object> hashMap, String str) {
        if (hashMap == null) {
            XWebLog.m21909e(TAG, "getIntegerFromParams params is null");
            return null;
        }
        try {
            Object obj = hashMap.get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            XWebLog.m21909e(TAG, "getIntegerFromParams value is not integer, key: " + str);
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getIntegerFromParams error", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static MotionEvent getMotionEventFromParams(HashMap<String, Object> hashMap, String str) {
        if (hashMap == null) {
            XWebLog.m21909e(TAG, "getMotionEventFromParams params is null");
            return null;
        }
        try {
            Object obj = hashMap.get(str);
            if (obj instanceof MotionEvent) {
                return (MotionEvent) obj;
            }
            XWebLog.m21909e(TAG, "getMotionEventFromParams value is not motion event, key: " + str);
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getMotionEventFromParams error", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static String getStringFromParams(HashMap<String, Object> hashMap, String str) {
        if (hashMap == null) {
            XWebLog.m21909e(TAG, "getStringFromParams params is null");
            return null;
        }
        try {
            Object obj = hashMap.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            XWebLog.m21909e(TAG, "getStringFromParams value is not string, key: " + str);
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getStringFromParams error", th);
            return null;
        }
    }

    public static XFileSdk.ViewStatus getViewStatus(String str, String str2) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null) {
                    if (!str2.isEmpty()) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "getViewStatus error, not reading");
                            return null;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            return ((XWalkReaderBasePlugin) plugin).getViewStatus(hashMap);
                        }
                        XWebLog.m21909e(TAG, "getViewStatus error, unknown plugin: " + str3);
                        return null;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getViewStatus error", th);
                return null;
            }
        }
        XWebLog.m21909e(TAG, "getViewStatus error, invalid param");
        return null;
    }

    /* access modifiers changed from: private */
    public static void innerReadFile(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str4 = str;
        String str5 = str3;
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        final XFileSdk.ActionCallback actionCallback2 = actionCallback;
        final int availableVersion = xWalkReaderBasePlugin.getAvailableVersion();
        long currentTimeMillis = System.currentTimeMillis();
        long currentProcessMemory = FileReaderHelper.getCurrentProcessMemory(activity);
        if (WebDebugCfg.getInst() != null) {
            z3 = WebDebugCfg.getInst().getDisableFileReaderCache();
            z2 = WebDebugCfg.getInst().getDisableFileReaderEncry();
        } else {
            z3 = false;
            z2 = true;
        }
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (!(next == null || next.getKey() == null || ((String) next.getKey()).isEmpty() || next.getValue() == null || ((String) next.getValue()).isEmpty())) {
                    if (!XFileSdk.PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU.equals(next.getKey()) || !CommandCfgPlugin.getInstance().isXFilesHideCustomMenu()) {
                        hashMap2.put((String) next.getKey(), (String) next.getValue());
                    }
                }
            }
        }
        HashMap<String, String> cmdPluginParam = CommandCfgPlugin.getInstance().getCmdPluginParam(xWalkReaderBasePlugin.getPluginName());
        if (cmdPluginParam != null) {
            Iterator<Map.Entry<String, String>> it = cmdPluginParam.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next2 = it.next();
                if (!(next2 == null || next2.getKey() == null || ((String) next2.getKey()).isEmpty() || next2.getValue() == null || ((String) next2.getValue()).isEmpty())) {
                    hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_CONFIG_PARAM_PREFIX + ((String) next2.getKey()), (String) next2.getValue());
                    it = it;
                }
            }
        }
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE, String.valueOf(XWalkEnvironment.getForceDarkMode()));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_DISABLE_CACHE, String.valueOf(z3));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_DISABLE_ENCRY, String.valueOf(z2));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, str4);
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, str2);
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str5);
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_TIME_START, String.valueOf(currentTimeMillis));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_MEMORY_START, String.valueOf(currentProcessMemory));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_PASSWORD_TITLE, activity2.getString(C0966R.string.lpk));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_PASSWORD_WRONG, activity2.getString(C0966R.string.lpl));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_PASSWORD_HINT, activity2.getString(C0966R.string.lpj));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_BUTTON_CONFIRM, activity2.getString(C0966R.string.lpg));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_BUTTON_CANCEL, activity2.getString(C0966R.string.lpf));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_OPERATION_COPY, activity2.getString(C0966R.string.lpi));
        hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_STR_HINT_COPIED, activity2.getString(C0966R.string.lph));
        if (viewType == XFileSdk.ViewType.ReaderView) {
            hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_VIEW_TYPE, XWalkReaderBasePlugin.PARAM_VALUE_VIEW_TYPE_READER);
        } else {
            hashMap2.put(XWalkReaderBasePlugin.PARAM_KEY_VIEW_TYPE, XWalkReaderBasePlugin.PARAM_VALUE_VIEW_TYPE_LIST);
        }
        boolean isXFilesHideBottomBar = CommandCfgPlugin.getInstance().isXFilesHideBottomBar();
        int minSupportRuntimeVersion = xWalkReaderBasePlugin.getMinSupportRuntimeVersion(2);
        boolean z5 = availableVersion < minSupportRuntimeVersion;
        if (viewGroup2 != null && (isXFilesHideBottomBar || z5)) {
            XWebLog.m21911i(TAG, "innerReadFile, need hide bottom bar, hideByCmd = " + isXFilesHideBottomBar + ", version = " + availableVersion + ", minSupportVersionBottomBar = " + minSupportRuntimeVersion);
            int i = 0;
            while (true) {
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                View childAt = viewGroup2.getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof String) && XFileSdk.VIEW_TAG_BOTTOM_BAR.equalsIgnoreCase((String) tag)) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view = childAt;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/xweb/FileReaderXWeb", "innerReadFile", "(Lcom/tencent/xweb/xwalk/plugin/XWalkReaderBasePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/xweb/FileReaderHelper$OpenFileReportData;Ljava/util/HashMap;Lcom/tencent/xweb/XFileSdk$ViewType;Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/tencent/xweb/XFileSdk$ActionCallback;Landroid/webkit/ValueCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/xweb/FileReaderXWeb", "innerReadFile", "(Lcom/tencent/xweb/xwalk/plugin/XWalkReaderBasePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/xweb/FileReaderHelper$OpenFileReportData;Ljava/util/HashMap;Lcom/tencent/xweb/XFileSdk$ViewType;Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/tencent/xweb/XFileSdk$ActionCallback;Landroid/webkit/ValueCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        break;
                    }
                }
                i++;
            }
        }
        if (actionCallback2 != null) {
            final XWalkReaderBasePlugin xWalkReaderBasePlugin2 = xWalkReaderBasePlugin;
            final String str6 = str;
            final String str7 = str2;
            final String str8 = str3;
            final boolean z6 = z;
            C201222 r17 = new ValueCallback<Pair<String, Object>>() {
                public void onReceiveValue(Pair<String, Object> pair) {
                    Object obj;
                    if (!(pair == null || (obj = pair.first) == null)) {
                        Object obj2 = pair.second;
                        if (obj2 instanceof HashMap) {
                            try {
                                HashMap hashMap = (HashMap) obj2;
                                if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_VIEW_STATUS_CHANGE.equals(obj)) {
                                    Integer access$300 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_INDEX);
                                    if (access$300 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewIndex is null");
                                        return;
                                    }
                                    Float access$400 = FileReaderXWeb.getFloatFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_ZOOM);
                                    if (access$400 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewZoom is null");
                                        return;
                                    }
                                    Integer access$3002 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_WIDTH);
                                    if (access$3002 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewCurWidth is null");
                                        return;
                                    }
                                    Integer access$3003 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_HEIGHT);
                                    if (access$3003 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewCurHeight is null");
                                        return;
                                    }
                                    Integer access$3004 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_X);
                                    if (access$3004 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewTransX is null");
                                        return;
                                    }
                                    Integer access$3005 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_Y);
                                    if (access$3005 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", viewTransY is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onViewStatusChange(access$300.intValue(), access$400.floatValue(), access$3002.intValue(), access$3003.intValue(), access$3004.intValue(), access$3005.intValue());
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_PAGE_COUNT_UPDATE.equals(pair.first)) {
                                    Integer access$3006 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_TOTAL_COUNT);
                                    if (access$3006 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", totalCount is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onPageCountUpdate(access$3006.intValue());
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_PAGE_CHANGE.equals(pair.first)) {
                                    Integer access$3007 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_PAGE_INDEX);
                                    if (access$3007 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", pageIndex is null");
                                        return;
                                    }
                                    Integer access$3008 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_PAGE_WIDTH);
                                    if (access$3008 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", pageWidth is null");
                                        return;
                                    }
                                    Integer access$3009 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_PAGE_HEIGHT);
                                    if (access$3009 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", pageHeight is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onPageChange(access$3007.intValue(), access$3008.intValue(), access$3009.intValue());
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_THUMBNAIL_LOAD.equals(pair.first)) {
                                    Integer access$30010 = FileReaderXWeb.getIntegerFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_PAGE_INDEX);
                                    Bitmap access$500 = FileReaderXWeb.getBitmapFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_THUMBNAIL);
                                    if (access$30010 == null || access$500 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", pageIndex/thumbnail is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onThumbnailLoad(access$30010.intValue(), access$500);
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_SINGLE_TAP.equals(pair.first)) {
                                    MotionEvent access$600 = FileReaderXWeb.getMotionEventFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_MOTION_EVENT);
                                    if (access$600 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", motion event is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onSingleTap(access$600);
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_DOUBLE_TAP.equals(pair.first)) {
                                    MotionEvent access$6002 = FileReaderXWeb.getMotionEventFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_MOTION_EVENT);
                                    if (access$6002 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", motion event is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onDoubleTap(access$6002);
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_GENERAL_CALLBACK.equals(pair.first)) {
                                    String access$700 = FileReaderXWeb.getStringFromParams(hashMap, XWalkReaderBasePlugin.ACTION_CALLBACK_PARAM_KEY_GENERAL_CALLBACK_NAME);
                                    if (access$700 == null) {
                                        XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback " + ((String) pair.first) + ", general callback name is null");
                                        return;
                                    }
                                    XFileSdk.ActionCallback.this.onGeneralCallback(access$700, hashMap);
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_REACH_END.equals(pair.first)) {
                                    XFileSdk.ActionCallback.this.onReachEnd();
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_USER_OPERATED.equals(pair.first)) {
                                    XFileSdk.ActionCallback.this.onUserOperated();
                                    return;
                                } else if (XWalkReaderBasePlugin.ACTION_CALLBACK_NAME_ON_USER_CANCEL.equals(pair.first)) {
                                    XFileSdk.ActionCallback.this.onUserCancel();
                                    return;
                                } else {
                                    XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback unknown value: " + ((String) pair.first));
                                    return;
                                }
                            } catch (Throwable unused) {
                                XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback onReceiveValue error, hashMap invalid");
                                return;
                            }
                        }
                    }
                    XWebLog.m21909e(FileReaderXWeb.TAG, "actionCallback onReceiveValue error, value invalid");
                }
            };
            final FileReaderHelper.OpenFileReportData openFileReportData2 = openFileReportData;
            final HashMap<String, String> hashMap3 = hashMap;
            final XFileSdk.ViewType viewType2 = viewType;
            HashMap hashMap4 = hashMap2;
            final Activity activity3 = activity;
            final ViewGroup viewGroup3 = viewGroup;
            final XFileSdk.ActionCallback actionCallback3 = actionCallback;
            final ValueCallback<Integer> valueCallback2 = valueCallback;
            z4 = xWalkReaderBasePlugin.readFile(hashMap4, activity, viewGroup, r17, new ValueCallback<Integer>() {
                public void onReceiveValue(Integer num) {
                    FileReaderXWeb.processInnerRet(num.intValue(), availableVersion, xWalkReaderBasePlugin2, str6, str7, str8, z6, openFileReportData2, hashMap3, viewType2, activity3, viewGroup3, actionCallback3, valueCallback2);
                }
            });
        } else {
            HashMap hashMap5 = hashMap2;
            final XWalkReaderBasePlugin xWalkReaderBasePlugin3 = xWalkReaderBasePlugin;
            final String str9 = str;
            final String str10 = str2;
            final String str11 = str3;
            final boolean z7 = z;
            final FileReaderHelper.OpenFileReportData openFileReportData3 = openFileReportData;
            final HashMap<String, String> hashMap6 = hashMap;
            final XFileSdk.ViewType viewType3 = viewType;
            final Activity activity4 = activity;
            final ViewGroup viewGroup4 = viewGroup;
            final XFileSdk.ActionCallback actionCallback4 = actionCallback;
            final ValueCallback<Integer> valueCallback3 = valueCallback;
            z4 = xWalkReaderBasePlugin.readFile(hashMap5, activity, viewGroup, (ValueCallback<Pair<String, Object>>) null, new ValueCallback<Integer>() {
                public void onReceiveValue(Integer num) {
                    FileReaderXWeb.processInnerRet(num.intValue(), availableVersion, xWalkReaderBasePlugin3, str9, str10, str11, z7, openFileReportData3, hashMap6, viewType3, activity4, viewGroup4, actionCallback4, valueCallback3);
                }
            });
        }
        if (z4) {
            Map<String, String> map = sRecordMap;
            map.put(str5 + str4, xWalkReaderBasePlugin.getPluginName());
        }
    }

    public static boolean isPluginAvailable(String str, boolean z, boolean z2, int i) {
        if (!z || !FileReaderCrashDetector.isRecentCrashed(str)) {
            XWalkPlugin plugin = FileReaderHelper.getPlugin(str);
            if (!(plugin instanceof XWalkReaderBasePlugin)) {
                XWebLog.m21911i(TAG, "isPluginAvailable unSupport format" + str);
                return false;
            }
            XWalkReaderBasePlugin xWalkReaderBasePlugin = (XWalkReaderBasePlugin) plugin;
            int availableVersion = xWalkReaderBasePlugin.getAvailableVersion(true);
            int minSupportRuntimeVersion = xWalkReaderBasePlugin.getMinSupportRuntimeVersion(i);
            if (availableVersion <= 0 || availableVersion < minSupportRuntimeVersion) {
                XWebLog.m21911i(TAG, "isPluginAvailable no available version, depends on canExplicitInstall");
                return FileReaderHelper.canExplicitInstall(xWalkReaderBasePlugin, z2, minSupportRuntimeVersion) > 0;
            }
            XWebLog.m21911i(TAG, "isPluginAvailable has available version");
            return true;
        }
        XWebLog.m21911i(TAG, "isPluginAvailable recent crashed");
        return false;
    }

    /* access modifiers changed from: private */
    public static void onReceiveValueProcess(String str, int i, ValueCallback<Integer> valueCallback, int i2, Context context, FileReaderHelper.OpenFileReportData openFileReportData) {
        FileReaderHelper.reportXWebErrorCode(str, i, i2, context, openFileReportData);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Integer.valueOf(i2));
        }
    }

    private static Integer parseInteger(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "parseInteger error", th);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static void processInnerRet(int i, int i2, XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        int i3 = i;
        FileReaderHelper.OpenFileReportData openFileReportData2 = openFileReportData;
        HashMap<String, String> hashMap2 = hashMap;
        if (i3 == 0) {
            FileReaderDownloadLimiter.clear(xWalkReaderBasePlugin.getPluginName());
        }
        if (i3 == -3 || i3 == -13) {
            int availableVersion = xWalkReaderBasePlugin.getAvailableVersion(true);
            boolean z2 = false;
            boolean equalsIgnoreCase = hashMap2 != null ? "true".equalsIgnoreCase(hashMap2.get(XFileSdk.PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR)) : false;
            int todayDownloadCount = FileReaderDownloadLimiter.getTodayDownloadCount(xWalkReaderBasePlugin.getPluginName());
            int maxDownloadCountWhenPluginError = CommandCfgPlugin.getInstance().getMaxDownloadCountWhenPluginError();
            XWebLog.m21911i(TAG, "processInnerRet, todayDownloadCount = " + todayDownloadCount + ", maxDownloadCount = " + maxDownloadCountWhenPluginError);
            if (todayDownloadCount >= maxDownloadCountWhenPluginError) {
                XWebLog.m21911i(TAG, "processInnerRet, reach max download count, disable download");
            } else {
                z2 = equalsIgnoreCase;
            }
            if (availableVersion > 0 || !z2) {
                XWebLog.m21911i(TAG, "processInnerRet ret = " + i3 + ", invoke or abi not match, but can not download, return");
                onReceiveValueProcess(str2, i2, valueCallback, i, activity, openFileReportData);
                return;
            }
            XWebLog.m21911i(TAG, "processInnerRet ret = " + i3 + ", invoke or abi not match, try download");
            if (hashMap2 != null) {
                hashMap2.remove(XFileSdk.PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR);
            }
            if (openFileReportData2 != null) {
                if (i3 == -3) {
                    openFileReportData2.explicitDownloadScene = "invoke_error";
                } else if (i3 == -13) {
                    openFileReportData2.explicitDownloadScene = "so_error";
                }
            }
            FileReaderDownloadLimiter.record(xWalkReaderBasePlugin.getPluginName());
            readFileByPlugin(xWalkReaderBasePlugin, str, str2, str3, true, openFileReportData, hashMap, viewType, activity, viewGroup, actionCallback, valueCallback);
            return;
        }
        XWebLog.m21911i(TAG, "processInnerRet ret = " + i3 + ", return");
        onReceiveValueProcess(str2, i2, valueCallback, i, activity, openFileReportData);
    }

    public static void readFile(String str, String str2, String str3, boolean z, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        String str4 = str2;
        Activity activity2 = activity;
        StringBuilder sb = new StringBuilder();
        sb.append("readFile by xweb, fileExt: ");
        sb.append(str4 != null ? str4 : "null");
        XWebLog.m21911i(TAG, sb.toString());
        long reportFileSize = FileReaderHelper.reportFileSize(str, str2);
        FileReaderHelper.reportPVUV(str2, FileReaderHelper.ReaderType.XWEB.name());
        FileReaderHelper.OpenFileReportData openFileReportData = new FileReaderHelper.OpenFileReportData(FileReaderHelper.getOpenFileScene(hashMap), str2, reportFileSize, "unknown", -1, FileReaderHelper.convertOpenFileFrom(FileReaderHelper.getOpenFileFrom(hashMap)));
        XWalkPlugin plugin = FileReaderHelper.getPlugin(str2);
        if (!(plugin instanceof XWalkReaderBasePlugin)) {
            XWebLog.m21909e(TAG, "readFile unSupport format" + str2);
            if (plugin != null) {
                openFileReportData.readerType = plugin.getPluginName();
                openFileReportData.version = plugin.getAvailableVersion(true);
            }
            openFileReportData.markStart(activity2);
            FileReaderHelper.reportOpenFile(openFileReportData);
            onReceiveValueProcess(str2, -1, valueCallback, -7, activity, openFileReportData);
            return;
        }
        XWalkReaderBasePlugin xWalkReaderBasePlugin = (XWalkReaderBasePlugin) plugin;
        int availableVersion = xWalkReaderBasePlugin.getAvailableVersion(true);
        openFileReportData.readerType = xWalkReaderBasePlugin.getPluginName();
        openFileReportData.version = availableVersion;
        openFileReportData.markStart(activity2);
        FileReaderHelper.reportOpenFile(openFileReportData);
        readFileByPlugin(xWalkReaderBasePlugin, str, str2, str3, z, openFileReportData, hashMap, viewType, activity, viewGroup, actionCallback, valueCallback);
    }

    private static void readFileByPlugin(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        XWalkReaderBasePlugin xWalkReaderBasePlugin2 = xWalkReaderBasePlugin;
        FileReaderHelper.OpenFileReportData openFileReportData2 = openFileReportData;
        if (xWalkReaderBasePlugin2 == null) {
            XWebLog.m21909e(TAG, "readFile failed, plugin is null");
            onReceiveValueProcess(str2, -1, valueCallback, -5, activity, openFileReportData);
            return;
        }
        int availableVersion = xWalkReaderBasePlugin.getAvailableVersion();
        int minSupportRuntimeVersion = xWalkReaderBasePlugin2.getMinSupportRuntimeVersion(actionCallback != null ? 1 : 0);
        if (availableVersion <= 0 || availableVersion < minSupportRuntimeVersion) {
            int canExplicitInstall = FileReaderHelper.canExplicitInstall(xWalkReaderBasePlugin2, z, minSupportRuntimeVersion);
            if (canExplicitInstall > 0) {
                XWebLog.m21911i(TAG, "readFile can explicit install");
                FileReaderHelper.reportExplicitInstall(str2);
                if (openFileReportData2 != null && "none".equals(openFileReportData2.explicitDownloadScene)) {
                    openFileReportData2.explicitDownloadScene = FileReaderHelper.EXPLICIT_DOWNLOAD_SCENE_NOT_INSTALL;
                }
                if (!startExplicitInstall(xWalkReaderBasePlugin, str, str2, str3, z, canExplicitInstall, minSupportRuntimeVersion, openFileReportData, hashMap, viewType, activity, viewGroup, actionCallback, valueCallback)) {
                    FileReaderHelper.reportExplicitInstallStartFailed(str2);
                    onReceiveValueProcess(str2, availableVersion, valueCallback, -18, activity, openFileReportData);
                    return;
                }
                return;
            }
            XWebLog.m21911i(TAG, "readFile can not explicit install, return");
            onReceiveValueProcess(str2, availableVersion, valueCallback, -1, activity, openFileReportData);
            return;
        }
        innerReadFile(xWalkReaderBasePlugin, str, str2, str3, z, openFileReportData, hashMap, viewType, activity, viewGroup, actionCallback, valueCallback);
    }

    public static boolean requestThumbnail(String str, String str2, int i) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                    if (i >= 0) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "requestThumbnail error, not reading");
                            return false;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_THUMBNAIL_INDEX, Integer.valueOf(i));
                            return ((XWalkReaderBasePlugin) plugin).requestThumbnail(hashMap);
                        }
                        XWebLog.m21909e(TAG, "requestThumbnail error, unknown plugin: " + str3);
                        return false;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "requestThumbnail error", th);
                return false;
            }
        }
        XWebLog.m21909e(TAG, "requestThumbnail error, invalid param");
        return false;
    }

    public static boolean setDisableDoubleTap(String str, String str2, boolean z) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null) {
                    if (!str2.isEmpty()) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "setDisableDoubleTap error, not reading");
                            return false;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_NAME, XWalkReaderBasePlugin.GENERAL_INVOKE_NAME_SET_DISABLE_DOUBLE_TAP);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_PARAM_KEY_DISABLE_DOUBLE_TAP, Boolean.valueOf(z));
                            Object generalInvoke = ((XWalkReaderBasePlugin) plugin).generalInvoke(hashMap);
                            if (generalInvoke instanceof Boolean) {
                                return ((Boolean) generalInvoke).booleanValue();
                            }
                            return false;
                        }
                        XWebLog.m21909e(TAG, "setDisableDoubleTap error, unknown plugin: " + str3);
                        return false;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setDisableDoubleTap error", th);
                return false;
            }
        }
        XWebLog.m21909e(TAG, "setDisableDoubleTap error, invalid param");
        return false;
    }

    public static boolean setDisableScroll(String str, String str2, boolean z) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null) {
                    if (!str2.isEmpty()) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "setDisableScroll error, not reading");
                            return false;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_NAME, XWalkReaderBasePlugin.GENERAL_INVOKE_NAME_SET_DISABLE_SCROLL);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_PARAM_KEY_DISABLE_SCROLL, Boolean.valueOf(z));
                            Object generalInvoke = ((XWalkReaderBasePlugin) plugin).generalInvoke(hashMap);
                            if (generalInvoke instanceof Boolean) {
                                return ((Boolean) generalInvoke).booleanValue();
                            }
                            return false;
                        }
                        XWebLog.m21909e(TAG, "setDisableScroll error, unknown plugin: " + str3);
                        return false;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setDisableScroll error", th);
                return false;
            }
        }
        XWebLog.m21909e(TAG, "setDisableScroll error, invalid param");
        return false;
    }

    public static boolean setTouchEvent(String str, String str2, MotionEvent motionEvent) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                    if (motionEvent != null) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "setTouchEvent error, not reading");
                            return false;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_NAME, XWalkReaderBasePlugin.GENERAL_INVOKE_NAME_SET_TOUCH_EVENT);
                            hashMap.put(XWalkReaderBasePlugin.GENERAL_INVOKE_PARAM_KEY_TOUCH_EVENT, motionEvent);
                            Object generalInvoke = ((XWalkReaderBasePlugin) plugin).generalInvoke(hashMap);
                            if (generalInvoke instanceof Boolean) {
                                return ((Boolean) generalInvoke).booleanValue();
                            }
                            return false;
                        }
                        XWebLog.m21909e(TAG, "setTouchEvent error, unknown plugin: " + str3);
                        return false;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setTouchEvent error", th);
                return false;
            }
        }
        XWebLog.m21909e(TAG, "setTouchEvent error, invalid param");
        return false;
    }

    public static boolean setViewToStatus(String str, String str2, int i, float f, int i2, int i3) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str2 != null) {
                    if (!str2.isEmpty()) {
                        Map<String, String> map = sRecordMap;
                        String str3 = map.get(str + str2);
                        if (str3 == null) {
                            XWebLog.m21909e(TAG, "setViewToStatus error, not reading");
                            return false;
                        }
                        XWalkPlugin plugin = XWalkPluginManager.getPlugin(str3);
                        if (plugin instanceof XWalkReaderBasePlugin) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_SET_INDEX, Integer.valueOf(i));
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_SET_ZOOM, Float.valueOf(f));
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_SET_X, Integer.valueOf(i2));
                            hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_SET_Y, Integer.valueOf(i3));
                            return ((XWalkReaderBasePlugin) plugin).setViewToStatus(hashMap);
                        }
                        XWebLog.m21909e(TAG, "setViewToStatus error, unknown plugin: " + str3);
                        return false;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setViewToStatus error", th);
                return false;
            }
        }
        XWebLog.m21909e(TAG, "setViewToStatus error, invalid param");
        return false;
    }

    private static boolean startExplicitInstall(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, int i, int i2, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        int i3 = i;
        FileReaderHelper.OpenFileReportData openFileReportData2 = openFileReportData;
        HashMap<String, String> hashMap2 = hashMap;
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        Integer num = null;
        if (sUpdater != null) {
            XWebLog.m21911i(TAG, "startExplicitInstall pre updater not finish, cancel it");
            sUpdater.cancelPluginUpdate();
            sUpdater = null;
        }
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider == null) {
            XWebLog.m21909e(TAG, "startExplicitInstall webViewProvider is null");
            return false;
        }
        WCWebUpdater.IWebviewPluginUpdater iWebviewPluginUpdater = (WCWebUpdater.IWebviewPluginUpdater) xWebViewProvider.execute(ConstValue.STR_CMD_GET_PLUGIN_UPDATER, (Object[]) null);
        sUpdater = iWebviewPluginUpdater;
        if (iWebviewPluginUpdater == null) {
            XWebLog.m21909e(TAG, "startExplicitInstall updater is null");
            return false;
        } else if (activity2 == null || activity.isDestroyed() || viewGroup2 == null) {
            XWebLog.m21909e(TAG, "startExplicitInstall activity destroyed");
            return false;
        } else {
            RelativeLayout relativeLayout = null;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup2.getChildAt(i4);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof String) && XFileSdk.VIEW_TAG_RELATIVE_LAYOUT.equalsIgnoreCase((String) tag)) {
                        relativeLayout = (RelativeLayout) childAt;
                    }
                }
            }
            if (relativeLayout == null) {
                if (viewGroup2 instanceof RelativeLayout) {
                    relativeLayout = (RelativeLayout) viewGroup2;
                } else {
                    XWebLog.m21909e(TAG, "startExplicitInstall layout is null");
                    return false;
                }
            }
            if (openFileReportData2 != null) {
                try {
                    if (!"none".equals(openFileReportData2.explicitDownloadScene) && !FileReaderHelper.EXPLICIT_DOWNLOAD_SCENE_NOT_INSTALL.equals(openFileReportData2.explicitDownloadScene)) {
                        XWebLog.m21911i(TAG, "startExplicitInstall remove all views in layout");
                        relativeLayout.removeAllViews();
                    }
                } catch (Throwable th) {
                    XWebLog.m21909e(TAG, "startExplicitInstall remove all views in layout error: " + th.getMessage());
                }
            }
            if (hashMap2 != null) {
                num = parseInteger(hashMap2.get(XFileSdk.PARAM_KEY_EXTRA_PARAM_DOWNLOAD_TEXT_COLOR));
            }
            if (num == null) {
                num = -1140850689;
            }
            TextView textView = new TextView(activity2);
            textView.setText(activity2.getString(C0966R.string.mjf));
            textView.setTextSize(14.0f);
            textView.setTextColor(num.intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13, -1);
            relativeLayout.addView(textView, layoutParams);
            boolean z2 = i3 == 2 || i3 == 3;
            final WeakReference weakReference = r1;
            WeakReference weakReference2 = new WeakReference(activity2);
            final WeakReference weakReference3 = r1;
            WeakReference weakReference4 = new WeakReference(viewGroup2);
            final WeakReference weakReference5 = r1;
            WeakReference weakReference6 = new WeakReference(textView);
            WCWebUpdater.IWebviewPluginUpdater iWebviewPluginUpdater2 = sUpdater;
            final String str4 = str2;
            final XWalkReaderBasePlugin xWalkReaderBasePlugin2 = xWalkReaderBasePlugin;
            final int i5 = i2;
            final String str5 = str;
            final String str6 = str3;
            final boolean z3 = z;
            final FileReaderHelper.OpenFileReportData openFileReportData3 = openFileReportData;
            final HashMap<String, String> hashMap3 = hashMap;
            C201211 r202 = r1;
            final XFileSdk.ViewType viewType2 = viewType;
            String pluginName = xWalkReaderBasePlugin.getPluginName();
            final XFileSdk.ActionCallback actionCallback2 = actionCallback;
            final ValueCallback<Integer> valueCallback2 = valueCallback;
            final Activity activity3 = activity;
            final boolean z4 = z2;
            C201211 r1 = new XWalkPluginUpdateListener() {
                public void onXWalkPluginUpdateCompleted(int i) {
                    int i2;
                    int i3 = i;
                    XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateCompleted errorCode = " + i3);
                    WCWebUpdater.IWebviewPluginUpdater unused = FileReaderXWeb.sUpdater = null;
                    FileReaderHelper.reportDownloadErrorCode(str4, i3);
                    Activity activity = (Activity) weakReference.get();
                    ViewGroup viewGroup = (ViewGroup) weakReference3.get();
                    TextView textView = (TextView) weakReference5.get();
                    int i4 = -26;
                    int i5 = -11;
                    if (i3 == 0) {
                        i4 = 0;
                    } else if (i3 == -1) {
                        i4 = -15;
                    } else if (i3 == -2) {
                        i4 = -19;
                    } else if (i3 == -3) {
                        i4 = -20;
                    } else if (i3 == -4) {
                        i4 = -21;
                    } else if (i3 == -5) {
                        i4 = -22;
                    } else if (i3 == -6) {
                        i4 = -23;
                    } else if (i3 == -7) {
                        i4 = -24;
                    } else if (i3 == -8) {
                        i4 = -25;
                    } else if (i3 != -9) {
                        if (i3 == -10) {
                            i4 = -27;
                        } else if (i3 == -11) {
                            i4 = -28;
                        }
                    }
                    int availableVersion = xWalkReaderBasePlugin2.getAvailableVersion(true);
                    if (availableVersion < i5) {
                        XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateCompleted, update failed or cancel, version " + availableVersion + " < minVersion " + i5);
                        if (!(activity == null || activity.isFinishing() || activity.isDestroyed() || viewGroup == null || textView == null)) {
                            if (z4) {
                                textView.setText(activity.getString(C0966R.string.mje));
                            } else {
                                textView.setText(activity.getString(C0966R.string.lpm));
                            }
                        }
                        if (i4 == 0) {
                            XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateCompleted update is success, but version invalid, change ret");
                            if (availableVersion <= 0) {
                                i5 = -2;
                            }
                            i2 = i5;
                        } else {
                            i2 = i4;
                        }
                        FileReaderXWeb.onReceiveValueProcess(str4, availableVersion, valueCallback2, i2, activity3, openFileReportData3);
                    } else if (activity == null || activity.isFinishing() || activity.isDestroyed() || viewGroup == null || textView == null) {
                        XWebLog.m21909e(FileReaderXWeb.TAG, "onXWalkPluginUpdateCompleted, update success, view destroyed, return");
                        FileReaderXWeb.onReceiveValueProcess(str4, availableVersion, valueCallback2, -14, activity3, openFileReportData3);
                    } else {
                        XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateCompleted, update success, start read file");
                        textView.setVisibility(8);
                        FileReaderXWeb.innerReadFile(xWalkReaderBasePlugin2, str5, str4, str6, z3, openFileReportData3, hashMap3, viewType2, activity, viewGroup, actionCallback2, valueCallback2);
                    }
                }

                public void onXWalkPluginUpdateProgress(int i) {
                    XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateProgress " + i);
                    Activity activity = (Activity) weakReference.get();
                    TextView textView = (TextView) weakReference5.get();
                    if (activity != null && !activity.isDestroyed() && textView != null) {
                        textView.setText(activity.getString(C0966R.string.lpn) + i + "%");
                    }
                }

                public void onXWalkPluginUpdateStarted() {
                    XWebLog.m21911i(FileReaderXWeb.TAG, "onXWalkPluginUpdateStarted");
                }
            };
            iWebviewPluginUpdater2.setPluginOnlyOneToUpdate(pluginName, r202);
            HashMap hashMap4 = new HashMap();
            if (z2) {
                hashMap4.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            } else {
                hashMap4.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, "1");
            }
            sUpdater.startCheck(XWalkEnvironment.getApplicationContext(), hashMap4);
            return true;
        }
    }
}
