package com.tencent.p014mm.plugin.lite;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1005ma.C88718b;
import p1020pa.C89330g;
import p1056vl.C90824b;
import p1198ka.C117396b;
import p1198ka.C117397c;
import p1198ka.C117398d;
import p193la.C10479a;
import p979ia.C117147b;
import tm0.C78043c0;
import tm0.C78044d0;
import tm0.C90557z;

/* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter */
public abstract class LiteAppCenter {
    public static final String FRAMEWORK_TYPE_BASE = "base";
    public static final String FRAMEWORK_TYPE_NONE = "none";
    public static final String FRAMEWORK_TYPE_VUE = "Vue";
    public static final String FRAMEWORK_TYPE_VUE3 = "Vue3";
    public static final String LITE_APP_BASE_LIB = "wxalitebaselibrary";
    private static final String TAG = "WxaLiteApp.LiteAppCenter";
    public static float fontScale = 1.0f;
    public static boolean fontScaleFollowSystem = false;
    public static boolean isInitialized;
    private static String lastPath = "";
    private static AtomicInteger mAppUuid = new AtomicInteger(0);
    public static IWxaLiteAppCallback mCallback;
    private static AtomicInteger mDataUuid = new AtomicInteger(0);
    private static Map<Integer, C56832d> mDelayDataStore = new ConcurrentHashMap();
    public static DisplayMetrics mDisplayMetrics;
    public static Map<Integer, ILiteAppUICallback> mUICallback = new ConcurrentHashMap();
    private static long pageId = -1;
    private static HashMap<Long, PageInfo> pageInfos = new HashMap<>();
    private static Map<String, Map<String, Class<? extends C10479a>>> sAppLevelApi = new ConcurrentHashMap();
    private static Map<String, Map<String, C117398d>> sAppLevelModule = new ConcurrentHashMap();
    private static Map<String, Class<? extends C10479a>> sCommApi = new ConcurrentHashMap();
    private static Map<String, C117398d> sCommModule = new ConcurrentHashMap();
    private static boolean sInitLib;
    private static Map<String, C10479a> sWxaLiteAppJsApiMap = new ConcurrentHashMap();
    private static HashMap<Long, SystemInfoChangeCallbackInfo> systemInfoChangeCallback = new HashMap<>();
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$HostInfo */
    public static class HostInfo {
        public String appBranch = "";
        public String appBuildJob = "";
        public String appBuildTime = "";
        public String appFlavor = "";
        public String appRevision = "";
        public String appVersion = "";
        public Map<String, String> otherExtends;
        public String system = "";
        public String systemVersion = "";
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback */
    public interface ILiteAppUICallback {
        void callDynamicModule(Method method, C117396b bVar, Object[] objArr);

        void closeWindow(Intent intent);

        int getDataUuid();

        Bundle getExtraData();

        C56832d getStore();

        SystemInfo getSystemInfo();

        boolean hasCutOut();

        void navigateBack(boolean z);

        void onCheckSumFail(String str, List<String> list);

        void onCreateLitePageViewFinish(PageInfo pageInfo);

        void onShowPageTimeStamp(long j, long j2);

        void setFlags(int i);

        void setKeepScreenOn(boolean z);

        void setPageOrientation(int i);

        void setStore(C56832d dVar);

        void showPage(PageInfo pageInfo);

        void vibrateLong(long j);

        void vibrateShort(long j, int i);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$IWxaLiteAppCallback */
    public interface IWxaLiteAppCallback {
        void dataReporting(String str, String str2);

        String[] getAppInfo(String str);

        HostInfo getHostInfo();

        WxaLiteAppBaselibInfo getLiteAppBaselibInfo(String str);

        String getLiteAppRoot();

        String getOfflineResource(String str, String str2, String str3);

        String getRecentForward(String str);

        String getRecentForwardTitle(String str);

        String getRegionInfo(String str, String str2);

        SystemInfo getSystemInfo();

        String getUin();

        String getUserAgent();

        void hideKeyboard();

        void onShowStatusChange(String str, String str2, long j, long j2, boolean z);

        void onStoreSendResult(String str, int i, String str2, String str3);

        void onStoreSetData(String str, String[] strArr, String[] strArr2);

        void openPage(String str, String str2, String str3, String str4);

        void reloadDebug(String str, String str2);

        void reportIdKey(long j, long j2, long j3);

        void reportKv(int i, String str);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$JsApi */
    public static class JsApi {
        public String appId;
        public long appPtr;
        public int appUuid;
        public long callbackId;
        public boolean isFromView;
        public String method;
        public long pageId;
        public String param;

        public JsApi(int i, String str, long j, long j2, String str2, String str3, long j3, boolean z) {
            this.appUuid = i;
            this.appId = str;
            this.appPtr = j;
            this.pageId = j2;
            this.method = str2;
            this.param = str3;
            this.callbackId = j3;
            this.isFromView = z;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("appUuid:");
            stringBuffer.append(this.appUuid);
            stringBuffer.append("appid:");
            stringBuffer.append(this.appId);
            stringBuffer.append(" appPtr:");
            stringBuffer.append(this.appPtr);
            stringBuffer.append(" pageId:");
            stringBuffer.append(this.pageId);
            stringBuffer.append(" method:");
            stringBuffer.append(this.method);
            stringBuffer.append(" param:");
            stringBuffer.append(this.param);
            stringBuffer.append(" callback:");
            stringBuffer.append(this.callbackId);
            stringBuffer.append(" isFromView:");
            stringBuffer.append(this.isFromView);
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$MethodInfo */
    public static class MethodInfo {
        public static final int PARAM_CHAR = 1;
        public static final int PARAM_JSON = 3;
        public static final int PARAM_NUMBER = 0;
        public static final int PARAM_STRING = 2;
        public String methodName = "";
        public List<Integer> paramTypes = new ArrayList();
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$ModuleInfo */
    public static class ModuleInfo {
        public Map<String, MethodInfo> methods = new HashMap();
        public String moduleName = "";
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$SystemInfo */
    public static class SystemInfo {
        public String appId = "";
        public String brand = "";
        public boolean darkMode = false;
        public float fontScale = 1.0f;
        public boolean isHalfScreen = false;
        public String language = "";
        public String model = "";
        public float navigationBarHeight = 0.0f;
        public String networkType = "";
        public float pixelRatio = 0.0f;
        public String platform = "";
        public float statusBarHeight = 0.0f;
        public String system = "";
        public float titleBarHeight = 0.0f;
        public String version = "";

        public String toJasonString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("networkType", this.networkType);
                jSONObject.put("brand", this.brand);
                jSONObject.put("model", this.model);
                jSONObject.put("appId", this.appId);
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.language);
                jSONObject.put("platform", this.platform);
                jSONObject.put("system", this.system);
                jSONObject.put("fontScale", (double) this.fontScale);
                jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.version);
                jSONObject.put("pixelRatio", (double) this.pixelRatio);
                jSONObject.put("navigationBarHeight", (double) this.navigationBarHeight);
                jSONObject.put("statusBarHeight", (double) this.statusBarHeight);
                jSONObject.put("titleBarHeight", (double) this.titleBarHeight);
                jSONObject.put("darkMode", this.darkMode);
                jSONObject.put("isHalfScreen", this.isHalfScreen);
            } catch (JSONException e) {
                C88718b.m110680b(LiteAppCenter.TAG, "toJasonString JSONException" + e.toString(), new Object[0]);
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$SystemInfoChangeCallbackInfo */
    public static class SystemInfoChangeCallbackInfo {
        public String appId;
        public long appPtr;
        public HashSet<Long> callbackIds;
        public long pageId;

        public SystemInfoChangeCallbackInfo(String str, long j, long j2, long j3) {
            HashSet<Long> hashSet = new HashSet<>();
            this.callbackIds = hashSet;
            this.appId = str;
            this.appPtr = j;
            this.pageId = j2;
            hashSet.add(Long.valueOf(j3));
        }
    }

    public static native void DynamicModuleCallback(String str, long j, long j2, long j3, String str2, boolean z, boolean z2);

    private static native void addJsApi(String str);

    public static void addJsApi(String str, Class<? extends C10479a> cls) {
        if (!sCommApi.containsKey(str)) {
            sCommApi.put(str, cls);
            addJsApi(str);
            return;
        }
        throw new RuntimeException(str + " has been exists");
    }

    private static native void addJsApi(String str, String str2);

    private static String callDynamicModule(int i, String str, long j, long j2, String str2, String str3, String str4, long j3, boolean z) {
        String str5 = str2;
        String str6 = str3;
        try {
            Map map = sAppLevelModule.get(str);
            Method method = null;
            C117398d dVar = map != null ? (C117398d) map.get(str5) : null;
            if (dVar == null) {
                dVar = sCommModule.get(str5);
                if (dVar == null) {
                    C88718b.m110681c(TAG, "DynamicModule " + str5 + " isn't registered!", new Object[0]);
                    return "\"module isn't registered!\"";
                }
            }
            Boolean bool = Boolean.FALSE;
            Iterator it = ((HashMap) dVar.f351439a).keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str7 = (String) it.next();
                if (str7.equals(str6)) {
                    bool = Boolean.TRUE;
                    method = (Method) ((HashMap) dVar.f351439a).get(str7);
                    break;
                }
            }
            Boolean bool2 = bool;
            if (!bool.booleanValue()) {
                Iterator it4 = ((HashMap) dVar.f351440b).keySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String str8 = (String) it4.next();
                    if (str8.equals(str6)) {
                        bool2 = Boolean.FALSE;
                        bool = Boolean.TRUE;
                        method = (Method) ((HashMap) dVar.f351440b).get(str8);
                        break;
                    }
                }
            }
            Method method2 = method;
            Boolean bool3 = bool2;
            if (!bool.booleanValue()) {
                C88718b.m110681c(TAG, "DynamicModule " + str5 + " hasn't method " + str6, new Object[0]);
                return "\"method isn't found!\"";
            }
            C117396b bVar = (C117396b) dVar.f351441c.getConstructor(new Class[0]).newInstance(new Object[0]);
            bVar.setModuleName(str5);
            Method method3 = method2;
            bVar.setCallback(new C117397c(i, str, j, j2, j3, z));
            JSONArray jSONArray = new JSONArray(str4);
            Object[] objArr = new Object[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                objArr[i2] = jSONArray.get(i2);
            }
            if (bool3.booleanValue()) {
                Object invoke = method3.invoke(bVar, objArr);
                Class<?> returnType = method3.getReturnType();
                if (returnType.getName().toLowerCase().contains("map")) {
                    return new JSONObject((Map) invoke).toString();
                }
                if (returnType.getName().toLowerCase().contains("list")) {
                    return new JSONArray((List) invoke).toString();
                }
                if (!returnType.getName().toLowerCase().contains("string")) {
                    return invoke.toString();
                }
                return FastJsonResponse.QUOTE + ((String) invoke) + FastJsonResponse.QUOTE;
            } else if (!mUICallback.containsKey(Integer.valueOf(i))) {
                return "\"call async method, waiting for callback!\"";
            } else {
                mUICallback.get(Integer.valueOf(i)).callDynamicModule(method3, bVar, objArr);
                return "\"call async method, waiting for callback!\"";
            }
        } catch (Exception e) {
            C88718b.m110680b(TAG, "CallDynamicModule " + e.toString(), new Object[0]);
            return "\"error\"";
        }
    }

    public static native int checkBaseLib(String str);

    public static native int checkLiteAppPkg(String str);

    public static void closeWindow(int i, long j, Intent intent) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).closeWindow(intent);
        }
    }

    public static native void createStore(String str, String str2, String str3, int i);

    private static void dataReporting(String str, String str2) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.dataReporting(str, str2);
        }
    }

    private static void dispatchCmdNoRet(int i, String str, long j, long j2, String str2, String str3) {
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1360764789:
                if (str2.equals(C78043c0.NAME)) {
                    c = 0;
                    break;
                }
                break;
            case -1225644142:
                if (str2.equals(C90557z.NAME)) {
                    c = 1;
                    break;
                }
                break;
            case 772222029:
                if (str2.equals(C78044d0.NAME)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (mUICallback.containsKey(Integer.valueOf(i))) {
                    mUICallback.get(Integer.valueOf(i)).vibrateLong(400);
                    return;
                }
                return;
            case 1:
                if (mUICallback.containsKey(Integer.valueOf(i))) {
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        if (jSONObject.has("on")) {
                            mUICallback.get(Integer.valueOf(i)).setKeepScreenOn(jSONObject.getBoolean("on"));
                            return;
                        }
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                if (mUICallback.containsKey(Integer.valueOf(i))) {
                    int i2 = 192;
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.has("type")) {
                            String string = jSONObject2.getString("type");
                            if ("heavy".equals(string)) {
                                i2 = 255;
                            } else if ("light".equals(string)) {
                                i2 = 128;
                            }
                        }
                    } catch (JSONException unused2) {
                    }
                    mUICallback.get(Integer.valueOf(i)).vibrateShort(15, i2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static String dispatchCmdWithRet(String str, long j, long j2, String str2, String str3) {
        return (str2.equals("province") || str2.equals("city") || str2.equals("region") || str2.equals("subDistrict")) ? mCallback.getRegionInfo(str2, str3) : "";
    }

    public static native int dispatchStore(String str, String str2, String str3);

    public static int genAppUuid() {
        return mAppUuid.incrementAndGet();
    }

    public static int genDataUuid() {
        return mDataUuid.incrementAndGet();
    }

    private static ModuleInfo[] getAllDynamicModule(String str) {
        Iterator it;
        LinkedList linkedList;
        String str2;
        String str3;
        int i;
        String str4 = str;
        if (str4 == null) {
            C88718b.m110680b(TAG, "invalid appId", new Object[0]);
            return null;
        }
        LinkedList linkedList2 = new LinkedList();
        HashMap hashMap = new HashMap();
        Map map = sAppLevelModule.get(str4);
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.putAll(sCommModule);
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            ModuleInfo moduleInfo = new ModuleInfo();
            moduleInfo.moduleName = (String) entry.getKey();
            C117398d dVar = (C117398d) entry.getValue();
            Iterator it5 = ((HashMap) dVar.f351439a).entrySet().iterator();
            while (true) {
                it = it4;
                linkedList = linkedList2;
                str2 = "string";
                if (!it5.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it5.next();
                Iterator it6 = it5;
                MethodInfo methodInfo = new MethodInfo();
                C117398d dVar2 = dVar;
                methodInfo.methodName = (String) entry2.getKey();
                Class[] parameterTypes = ((Method) entry2.getValue()).getParameterTypes();
                Map.Entry entry3 = entry2;
                int length = parameterTypes.length;
                ModuleInfo moduleInfo2 = moduleInfo;
                int i2 = 0;
                while (i2 < length) {
                    Class[] clsArr = parameterTypes;
                    String lowerCase = parameterTypes[i2].getName().toLowerCase();
                    if (lowerCase.contains(str2)) {
                        i = length;
                        methodInfo.paramTypes.add(3);
                    } else {
                        i = length;
                        if (lowerCase.contains("list")) {
                            methodInfo.paramTypes.add(3);
                        } else if (lowerCase.contains("map")) {
                            methodInfo.paramTypes.add(3);
                        } else if (lowerCase.contains("json")) {
                            methodInfo.paramTypes.add(3);
                        } else if (lowerCase.contains("short")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("int")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("long")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("float")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("double")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("bool")) {
                            methodInfo.paramTypes.add(0);
                        } else if (lowerCase.contains("char")) {
                            methodInfo.paramTypes.add(1);
                        }
                    }
                    i2++;
                    length = i;
                    parameterTypes = clsArr;
                }
                ModuleInfo moduleInfo3 = moduleInfo2;
                moduleInfo3.methods.put((String) entry3.getKey(), methodInfo);
                it4 = it;
                moduleInfo = moduleInfo3;
                linkedList2 = linkedList;
                it5 = it6;
                dVar = dVar2;
            }
            C117398d dVar3 = dVar;
            ModuleInfo moduleInfo4 = moduleInfo;
            Iterator it7 = ((HashMap) dVar3.f351440b).entrySet().iterator();
            while (it7.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it7.next();
                MethodInfo methodInfo2 = new MethodInfo();
                Iterator it8 = it7;
                methodInfo2.methodName = (String) entry4.getKey();
                Class[] parameterTypes2 = ((Method) entry4.getValue()).getParameterTypes();
                Map.Entry entry5 = entry4;
                int length2 = parameterTypes2.length;
                ModuleInfo moduleInfo5 = moduleInfo4;
                int i3 = 0;
                while (i3 < length2) {
                    Class[] clsArr2 = parameterTypes2;
                    String lowerCase2 = parameterTypes2[i3].getName().toLowerCase();
                    if (lowerCase2.contains(str2)) {
                        str3 = str2;
                        methodInfo2.paramTypes.add(3);
                    } else {
                        str3 = str2;
                        if (lowerCase2.contains("list")) {
                            methodInfo2.paramTypes.add(3);
                        } else if (lowerCase2.contains("map")) {
                            methodInfo2.paramTypes.add(3);
                        } else if (lowerCase2.contains("json")) {
                            methodInfo2.paramTypes.add(3);
                        } else if (lowerCase2.contains("short")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("int")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("long")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("float")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("double")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("bool")) {
                            methodInfo2.paramTypes.add(0);
                        } else if (lowerCase2.contains("char")) {
                            methodInfo2.paramTypes.add(1);
                        }
                    }
                    i3++;
                    str2 = str3;
                    parameterTypes2 = clsArr2;
                }
                String str5 = str2;
                ModuleInfo moduleInfo6 = moduleInfo5;
                moduleInfo6.methods.put((String) entry5.getKey(), methodInfo2);
                moduleInfo4 = moduleInfo6;
                it7 = it8;
                str2 = str5;
            }
            ModuleInfo moduleInfo7 = moduleInfo4;
            LinkedList linkedList3 = linkedList;
            linkedList3.add(moduleInfo7);
            it4 = it;
            linkedList2 = linkedList3;
        }
        return (ModuleInfo[]) linkedList2.toArray(new ModuleInfo[0]);
    }

    private static String getAppFilePath() {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.getLiteAppRoot();
        }
        StringBuilder sb = new StringBuilder();
        Context context = C117147b.f350981b;
        if (context != null) {
            sb.append(context.getFilesDir());
            sb.append("/liteapp");
            return sb.toString();
        }
        C87412m.m108603p("appContext");
        throw null;
    }

    private static boolean getAppInfo(String str, String[] strArr) {
        String[] appInfo;
        if (strArr == null || strArr.length != 2) {
            C88718b.m110680b(TAG, "info invalid", new Object[0]);
            return false;
        }
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (!(iWxaLiteAppCallback == null || (appInfo = iWxaLiteAppCallback.getAppInfo(str)) == null || appInfo.length != strArr.length)) {
            strArr[0] = appInfo[0];
            strArr[1] = appInfo[1];
        }
        return false;
    }

    public static native String getAuthUrl(String str, String str2, String str3);

    public static native String getBaseLibBuildTypeByPath(String str);

    public static native String getBaseLibBuildTypeByString(String str);

    public static native String getBaseLibMajorVersion();

    public static native String getBaseLibMajorVersionByPath(String str);

    public static native String getBaseLibVersionByPath(String str);

    public static native String getBaseLibVersionByString(String str);

    public static native int getBaseLibVersionNumber(String str);

    public static String getLastPath() {
        return lastPath;
    }

    public static native String getLiteAppMinBaseLibMajorVersion(String str, String str2, String str3);

    public static native String getLiteAppMinLiteAppBaseLib(String str, String str2, String str3);

    public static native String getLiteAppVersion(String str, String str2, String str3);

    private static String getOfflineResource(String str, String str2, String str3) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getOfflineResource(str, str2, str3) : "";
    }

    private static String getRecentForward(String str) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getRecentForward(str) : "";
    }

    private static String getRecentForwardTitle(String str) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getRecentForwardTitle(str) : "";
    }

    public static native int getSdkMaxBaseLibVersionNumber();

    public static native int getSdkMaxVersionNumber();

    public static native String getSdkMinBaseLibVersion();

    public static native int getSdkMinBaseLibVersionNumber();

    public static native String getSdkVersion();

    public static native int getSdkVersionNumber();

    private static String getSystemInfo(int i, long j) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            return mUICallback.get(Integer.valueOf(i)).getSystemInfo().toJasonString();
        }
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getSystemInfo().toJasonString() : "";
    }

    private static String getUin() {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getUin() : "";
    }

    private static String getUserAgent() {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.getUserAgent() : "";
    }

    private static boolean hasCutOut(int i, long j) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            return mUICallback.get(Integer.valueOf(i)).hasCutOut();
        }
        return false;
    }

    private static void hideKeyboard() {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.hideKeyboard();
        }
    }

    public static void initLib() {
        if (!sInitLib) {
            sInitLib = true;
            C9556a aVar = new C9556a();
            aVar.mo10233c("mmv8");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c("flutter");
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar2.mo10231a(0));
            C117292a.m165359e(obj2, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c("wechatlv");
            Object obj3 = new Object();
            C117292a.m165358d(obj3, aVar3.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar3.mo10231a(0));
            C117292a.m165359e(obj3, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c("wxajs");
            Object obj4 = new Object();
            C117292a.m165358d(obj4, aVar4.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar4.mo10231a(0));
            C117292a.m165359e(obj4, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c("wcwss");
            Object obj5 = new Object();
            C117292a.m165358d(obj5, aVar5.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar5.mo10231a(0));
            C117292a.m165359e(obj5, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c("owl");
            Object obj6 = new Object();
            C117292a.m165358d(obj6, aVar6.mo10232b(), "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar6.mo10231a(0));
            C117292a.m165359e(obj6, "com/tencent/mm/plugin/lite/LiteAppCenter", "initLib", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    private static native void innerShowIndexView(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, String[] strArr, String[] strArr2);

    private static native void innerShowView(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, String str6, String[] strArr, String[] strArr2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: la.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void invokeJsApi(com.tencent.p014mm.plugin.lite.LiteAppCenter.JsApi r18) {
        /*
            r1 = r18
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r18.toString()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "WxaLiteApp.LiteAppCenter"
            java.lang.String r5 = "invokeJsApi:%s"
            p1005ma.C88718b.m110681c(r3, r5, r0)
            r5 = 0
            java.lang.String r0 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "invalid api"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e7 }
            p1005ma.C88718b.m110680b(r3, r0, r7)     // Catch:{ Exception -> 0x00e7 }
            return
        L_0x0021:
            java.lang.String r7 = r1.method     // Catch:{ Exception -> 0x00e7 }
            if (r7 == 0) goto L_0x00c8
            java.lang.String r7 = r1.param     // Catch:{ Exception -> 0x00e7 }
            if (r7 != 0) goto L_0x002b
            goto L_0x00c8
        L_0x002b:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends la.a>>> r7 = sAppLevelApi     // Catch:{ Exception -> 0x00e7 }
            boolean r0 = r7.containsKey(r0)     // Catch:{ Exception -> 0x00e7 }
            r7 = 0
            if (r0 == 0) goto L_0x0047
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends la.a>>> r0 = sAppLevelApi     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x00e7 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r1.method     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x00e7 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x00e7 }
            goto L_0x0048
        L_0x0047:
            r0 = r7
        L_0x0048:
            if (r0 != 0) goto L_0x0054
            java.util.Map<java.lang.String, java.lang.Class<? extends la.a>> r0 = sCommApi     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r1.method     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x00e7 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x00e7 }
        L_0x0054:
            if (r0 == 0) goto L_0x0066
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00e7 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r7)     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ Exception -> 0x00e7 }
            r7 = r0
            la.a r7 = (p193la.C10479a) r7     // Catch:{ Exception -> 0x00e7 }
            goto L_0x007b
        L_0x0066:
            java.util.Map<java.lang.String, la.a> r0 = sWxaLiteAppJsApiMap     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r1.method     // Catch:{ Exception -> 0x00e7 }
            boolean r0 = r0.containsKey(r8)     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x007b
            java.util.Map<java.lang.String, la.a> r0 = sWxaLiteAppJsApiMap     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r7 = r1.method     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x00e7 }
            r7 = r0
            la.a r7 = (p193la.C10479a) r7     // Catch:{ Exception -> 0x00e7 }
        L_0x007b:
            if (r7 != 0) goto L_0x009d
            java.lang.String r0 = "not found api "
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e7 }
            p1005ma.C88718b.m110680b(r3, r0, r7)     // Catch:{ Exception -> 0x00e7 }
            long r13 = r1.callbackId     // Catch:{ Exception -> 0x00e7 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x009c
            java.lang.String r8 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            long r9 = r1.appPtr     // Catch:{ Exception -> 0x00e7 }
            long r11 = r1.pageId     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r15 = "{result: false, errMsg:\"not found\" ,data: {}}"
            r16 = 0
            boolean r0 = r1.isFromView     // Catch:{ Exception -> 0x00e7 }
            r17 = r0
            jsApiCallback(r8, r9, r11, r13, r15, r16, r17)     // Catch:{ Exception -> 0x00e7 }
        L_0x009c:
            return
        L_0x009d:
            java.lang.String r0 = r1.method     // Catch:{ Exception -> 0x00e7 }
            r7.f31712d = r0     // Catch:{ Exception -> 0x00e7 }
            la.b r0 = new la.b     // Catch:{ Exception -> 0x00e7 }
            int r9 = r1.appUuid     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r10 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            long r11 = r1.appPtr     // Catch:{ Exception -> 0x00e7 }
            long r13 = r1.pageId     // Catch:{ Exception -> 0x00e7 }
            long r5 = r1.callbackId     // Catch:{ Exception -> 0x00e7 }
            boolean r15 = r1.isFromView     // Catch:{ Exception -> 0x00e7 }
            r8 = r0
            r17 = r15
            r15 = r5
            r8.<init>(r9, r10, r11, r13, r15, r17)     // Catch:{ Exception -> 0x00e7 }
            r7.mo5675c(r0)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r0 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r6 = r1.param     // Catch:{ Exception -> 0x00e7 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00e7 }
            boolean r6 = r1.isFromView     // Catch:{ Exception -> 0x00e7 }
            r7.mo5674b(r0, r5, r6)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x010c
        L_0x00c8:
            java.lang.String r0 = "invalid api "
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e7 }
            p1005ma.C88718b.m110680b(r3, r0, r5)     // Catch:{ Exception -> 0x00e7 }
            long r11 = r1.callbackId     // Catch:{ Exception -> 0x00e7 }
            r5 = 0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            java.lang.String r6 = r1.appId     // Catch:{ Exception -> 0x00e7 }
            long r7 = r1.appPtr     // Catch:{ Exception -> 0x00e7 }
            long r9 = r1.pageId     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r13 = "{result: false, errMsg: \"invalid api\", data: {}}"
            r14 = 0
            boolean r15 = r1.isFromView     // Catch:{ Exception -> 0x00e7 }
            jsApiCallback(r6, r7, r9, r11, r13, r14, r15)     // Catch:{ Exception -> 0x00e7 }
        L_0x00e6:
            return
        L_0x00e7:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r2[r4] = r0
            java.lang.String r0 = "invokeJsApi :%s"
            p1005ma.C88718b.m110680b(r3, r0, r2)
            long r9 = r1.callbackId
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            java.lang.String r4 = r1.appId
            long r5 = r1.appPtr
            long r7 = r1.pageId
            r12 = 0
            boolean r13 = r1.isFromView
            java.lang.String r11 = "{result: false, errMsg:\"exception\" data: {}}"
            jsApiCallback(r4, r5, r7, r9, r11, r12, r13)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.LiteAppCenter.invokeJsApi(com.tencent.mm.plugin.lite.LiteAppCenter$JsApi):void");
    }

    public static native void jsApiCallback(String str, long j, long j2, long j3, String str2, boolean z, boolean z2);

    private static boolean loadBaseLibByMajorVersion(String str, String str2, String str3) {
        String liteAppMinBaseLibMajorVersion = getLiteAppMinBaseLibMajorVersion(str, str2, str3);
        if (liteAppMinBaseLibMajorVersion.length() == 0 || liteAppMinBaseLibMajorVersion.equals(getBaseLibMajorVersion())) {
            return true;
        }
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            WxaLiteAppBaselibInfo liteAppBaselibInfo = iWxaLiteAppCallback.getLiteAppBaselibInfo(liteAppMinBaseLibMajorVersion);
            HostInfo hostInfo = new HostInfo();
            IWxaLiteAppCallback iWxaLiteAppCallback2 = mCallback;
            if (iWxaLiteAppCallback2 != null) {
                hostInfo = iWxaLiteAppCallback2.getHostInfo();
            }
            String str4 = liteAppBaselibInfo.f339285h;
            lastPath = str4;
            if (setPath(str4, hostInfo, FRAMEWORK_TYPE_VUE) == 0) {
                return true;
            }
        }
        return false;
    }

    private static void navigateBack(int i, long j, boolean z) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).navigateBack(z);
        }
    }

    private static void offSystemInfoChange(long j) {
        systemInfoChangeCallback.remove(Long.valueOf(j));
    }

    public static native void onBackground(int i);

    private static void onCheckSumFail(int i, String str, long j, List<String> list) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).onCheckSumFail(str, list);
        }
    }

    private static void onCreateLitePageViewFinish(int i, long j, PageInfo pageInfo) {
        C88718b.m110681c(TAG, "onCreateLitePageViewFinish appUuid: " + i, new Object[0]);
        pageInfos.put(Long.valueOf(pageInfo.pageId), pageInfo);
        pageId = pageInfo.pageId;
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).onCreateLitePageViewFinish(pageInfo);
        }
    }

    public static native void onEventTriggered(String str, String str2);

    public static native void onForeground(int i);

    private static void onReleaseLiteApp(String str, long j, int i) {
    }

    private static void onShowPageTimeStamp(int i, long j, long j2, long j3) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).onShowPageTimeStamp(j2, j3);
        }
    }

    private static void onShowStatusChange(String str, String str2, long j, long j2, boolean z) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onShowStatusChange(str, str2, j, j2, z);
        }
    }

    private static boolean onStoreDispatch(String str, long j, int i, String str2, String str3, int i2) {
        C56832d store;
        if (!mUICallback.containsKey(Integer.valueOf(i)) || (store = mUICallback.get(Integer.valueOf(i)).getStore()) == null || store.f162866c == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new C56830b(store, j, i2, str2, str3));
        return true;
    }

    private static void onStoreSendResult(String str, int i, String str2, String str3) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onStoreSendResult(str, i, str2, str3);
        }
    }

    private static void onStoreSetData(String str, String[] strArr, String[] strArr2) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onStoreSetData(str, strArr, strArr2);
        }
    }

    private static String onStoreSyncCall(String str, long j, int i, String str2, String str3) {
        C56832d store;
        if (!mUICallback.containsKey(Integer.valueOf(i)) || (store = mUICallback.get(Integer.valueOf(i)).getStore()) == null || store.f162866c == null) {
            return "";
        }
        C56832d.C56835c cVar = new C56832d.C56835c(store, "");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new C56831c(store, cVar, str2, str3, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return (String) cVar.f162869a;
    }

    private static void onSystemInfoChange(String str, long j, long j2, long j3) {
        if (systemInfoChangeCallback.containsKey(Long.valueOf(j2))) {
            systemInfoChangeCallback.get(Long.valueOf(j2)).callbackIds.add(Long.valueOf(j3));
        } else {
            systemInfoChangeCallback.put(Long.valueOf(j2), new SystemInfoChangeCallbackInfo(str, j, j2, j3));
        }
    }

    private static void openPage(String str, String str2, String str3, String str4) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.openPage(str, str2, str3, str4);
        }
    }

    public static native void preloadIndexView(String str, String str2, String str3, int i);

    public static native void preloadView(String str, String str2, String str3, String str4, int i);

    private static native void preloadViewBaseLib(int i, String str);

    public static native int prepareCppEngineId();

    public static native void publishGlobalEvent(long j, long j2, String str);

    public static native void publishGlobalEventToTopPage(long j, String str, String str2);

    public static void registerModule(String str, Class<? extends C117396b> cls) {
        if (!sCommModule.containsKey(str)) {
            C117398d dVar = new C117398d();
            dVar.f351441c = cls;
            dVar.mo182080a();
            sCommModule.put(str, dVar);
            return;
        }
        throw new RuntimeException(str + " has been registered");
    }

    public static native void release();

    private static void releasePage(long j, long j2) {
        systemInfoChangeCallback.remove(Long.valueOf(j2));
        pageInfos.remove(Long.valueOf(j2));
    }

    public static native void releaseStore(String str);

    private static void reloadDebug(int i, String str, long j, int i2, String str2) {
        C88718b.m110681c(TAG, "[liteDebug] reloadDebug, appId=" + str + ";appPtr=" + j + ";pageCount=" + i2 + "; qrcodeDebugQueryString=" + str2, new Object[0]);
        for (int i3 = 0; i3 < i2; i3++) {
            navigateBack(i, j, true);
        }
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reloadDebug(str, str2);
        }
    }

    private static void reportIdKey(long j, long j2, long j3) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reportIdKey(j, j2, j3);
        }
    }

    private static void reportKv(int i, String str) {
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.reportKv(i, str);
        }
    }

    public static native void setAuthInfo(String str, String str2, Map<String, String> map, Map<String, String> map2, boolean z);

    public static native void setCookie(String str, String str2, String str3, boolean z);

    private static native void setDarkMode(boolean z);

    public static void setDelayData(int i, C56832d dVar) {
        if (dVar == null) {
            mDelayDataStore.remove(Integer.valueOf(i));
        } else {
            mDelayDataStore.put(Integer.valueOf(i), dVar);
        }
    }

    public static native void setDeveloperFlag(boolean z);

    public static native void setDisplayParams(long j, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8);

    private static void setFlags(int i, long j, int i2) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).setFlags(i2);
        }
    }

    private static native void setFontScale(float f);

    public static native void setForceUseSyncCall(boolean z);

    public static native void setIsHalfScreen(long j, boolean z);

    public static native void setLocale(String str, String str2);

    private static void setPageInfo(long j, long j2, PageInfo pageInfo) {
        pageInfos.put(Long.valueOf(j2), pageInfo);
    }

    private static void setPageOrientation(int i, long j, int i2) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.get(Integer.valueOf(i)).setPageOrientation(i2);
        }
    }

    public static native int setPath(String str, HostInfo hostInfo, String str2);

    public static void setPath(String str, String str2) {
        lastPath = str;
        HostInfo hostInfo = new HostInfo();
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.getHostInfo();
        }
        setPath(str, hostInfo, str2);
    }

    public static native void setSafeAreaInsets(long j, float f, float f2, float f3, float f4, boolean z);

    public static native void setSystemBarHeight(long j, float f, float f2, boolean z);

    public static void setUICallback(int i, ILiteAppUICallback iLiteAppUICallback) {
        mUICallback.put(Integer.valueOf(i), iLiteAppUICallback);
        int dataUuid = iLiteAppUICallback.getDataUuid();
        if (dataUuid > 0 && mDelayDataStore.containsKey(Integer.valueOf(dataUuid))) {
            iLiteAppUICallback.setStore(mDelayDataStore.get(Integer.valueOf(dataUuid)));
            mDelayDataStore.remove(Integer.valueOf(dataUuid));
        }
    }

    public static void setWxaLiteAppCallback(IWxaLiteAppCallback iWxaLiteAppCallback) {
        mCallback = iWxaLiteAppCallback;
    }

    public static void showIndexView(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, String[] strArr, String[] strArr2) {
        innerShowIndexView(str, str2, str3, str4, i, i2, z, str5, strArr, strArr2);
    }

    private static void showPage(int i, long j, long j2) {
        PageInfo pageInfo;
        if (mUICallback.containsKey(Integer.valueOf(i)) && (pageInfo = pageInfos.get(Long.valueOf(j2))) != null) {
            mUICallback.get(Integer.valueOf(i)).showPage(pageInfo);
        }
    }

    public static void showView(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, String str6, String[] strArr, String[] strArr2) {
        innerShowView(str, str2, str3, str4, str5, i, i2, z, str6, strArr, strArr2);
    }

    public static native boolean storeIsAlive(String str);

    public static native void storeSendResult(int i, long j, int i2, String str, String str2);

    public static native void storeSetData(int i, String[] strArr, String[] strArr2);

    public static native int subscribeStore(String str, String[] strArr);

    private static void systemInfoChange(String str) {
        for (SystemInfoChangeCallbackInfo next : systemInfoChangeCallback.values()) {
            Iterator<Long> it = next.callbackIds.iterator();
            while (it.hasNext()) {
                jsApiCallback(next.appId, next.appPtr, next.pageId, it.next().longValue(), str, true, true);
            }
        }
    }

    public static native int unSubscribeStore(String str, String[] strArr);

    public static void unsetUICallback(int i, ILiteAppUICallback iLiteAppUICallback) {
        if (mUICallback.containsKey(Integer.valueOf(i))) {
            mUICallback.remove(Integer.valueOf(i));
        }
    }

    public static void updateDarkMode(boolean z) {
        setDarkMode(z);
        systemInfoChange("{\"darkMode\": " + String.valueOf(z) + "}");
    }

    public static void updateDisplayParam(Context context, long j) {
        Point b = C90824b.m113902b(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = b.x;
        int i2 = b.y;
        Float valueOf = Float.valueOf(displayMetrics.density);
        int e = C89330g.m111653e(context);
        int b2 = C89330g.m111650b(context);
        float floatValue = ((float) 48) * valueOf.floatValue();
        setDisplayParams(j, ((float) i) / valueOf.floatValue(), ((float) i2) / valueOf.floatValue(), ((float) b.x) / valueOf.floatValue(), ((float) b.y) / valueOf.floatValue(), displayMetrics.densityDpi, valueOf.floatValue(), floatValue / valueOf.floatValue(), ((float) e) / valueOf.floatValue(), ((float) b2) / valueOf.floatValue());
        C88718b.m110681c(TAG, "updateLvCppDisplayParams appPtr=%d w=%d h=%d screen=%d,%d densityDpi=%d density=%f statusBarHeight:%d navigationBarHeight:%d actionBarHeight:%f", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b.x), Integer.valueOf(b.y), Integer.valueOf(displayMetrics.densityDpi), valueOf, Integer.valueOf(e), Integer.valueOf(b2), Float.valueOf(floatValue));
    }

    public static void updateFontScale(float f) {
        setFontScale(f);
    }

    public static boolean versionGreater(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 != null && !str2.isEmpty()) {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int min = Math.min(split.length, split2.length);
            int i = 0;
            while (i < min) {
                if (split[i].equals(split2[i])) {
                    i++;
                } else if (split[i].length() > split2[i].length()) {
                    return true;
                } else {
                    return split[i].length() >= split2[i].length() && split[i].compareTo(split2[i]) > 0;
                }
            }
        }
        return true;
    }

    public static void addJsApi(Map<String, Class> map) {
        for (Map.Entry next : map.entrySet()) {
            if (C10479a.class.isAssignableFrom((Class) next.getValue())) {
                addJsApi((String) next.getKey(), (Class<? extends C10479a>) (Class) next.getValue());
            } else {
                throw new RuntimeException("api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    public static void setPath(String str, Map<String, String> map, String str2) {
        lastPath = str;
        HostInfo hostInfo = new HostInfo();
        IWxaLiteAppCallback iWxaLiteAppCallback = mCallback;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.getHostInfo();
        }
        hostInfo.otherExtends = new HashMap();
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                hostInfo.otherExtends.put((String) next.getKey(), (String) next.getValue());
            }
        }
        setPath(str, hostInfo, str2);
    }

    public static void registerModule(String str, String str2, Class<? extends C117396b> cls) {
        Map map = sAppLevelModule.get(str);
        if (map == null) {
            map = new HashMap();
            sAppLevelModule.put(str, map);
        }
        if (!map.containsKey(str2)) {
            C117398d dVar = new C117398d();
            dVar.f351441c = cls;
            dVar.mo182080a();
            map.put(str2, dVar);
            return;
        }
        throw new RuntimeException(str2 + " has been registered");
    }

    public static void addJsApi(String str, String str2, Class<? extends C10479a> cls) {
        Map map = sAppLevelApi.get(str);
        if (map == null) {
            map = new ConcurrentHashMap();
            sAppLevelApi.put(str, map);
        }
        if (!map.containsKey(str2)) {
            map.put(str2, cls);
            addJsApi(str, str2);
            return;
        }
        throw new RuntimeException(str + XVFSFile.PATH_SEPARATOR + str2 + " has been exists");
    }

    public static void addJsApi(String str, Map<String, Class> map) {
        for (Map.Entry next : map.entrySet()) {
            if (C10479a.class.isAssignableFrom((Class) next.getValue())) {
                addJsApi(str, (String) next.getKey(), (Class) next.getValue());
            } else {
                throw new RuntimeException(str + ":api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$PageInfo */
    public static class PageInfo implements Parcelable {
        public static final Parcelable.Creator<PageInfo> CREATOR = new Parcelable.Creator<PageInfo>() {
            public PageInfo createFromParcel(Parcel parcel) {
                return new PageInfo(parcel);
            }

            public PageInfo[] newArray(int i) {
                return new PageInfo[i];
            }
        };
        public String appId;
        public long appPtr;
        public long appUuid;
        public String basePath;
        public int flags;
        public long pageId;
        public int pageOrientation;
        public String pageUrl;
        public long renderId;
        public int success;

        public PageInfo(int i, long j, long j2, long j3, long j4, String str, String str2, int i2, int i3, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            try {
                C88718b.m110681c(LiteAppCenter.TAG, "PageInfo success: %d, appUuid: %d, appPtr: %d, pageId: %d, renderId: %d, basePath: %s, pageUrl: %s, flags: %d, pageOrientation: %d, appId: %s", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str4, str5, Integer.valueOf(i2), Integer.valueOf(i3), str6);
                this.success = i;
                this.appUuid = j;
                this.appPtr = j2;
                this.pageId = j3;
                this.renderId = j4;
                this.basePath = str4;
                this.pageUrl = str5;
                this.flags = i2;
                this.pageOrientation = i3;
                this.appId = str6;
            } catch (Exception e) {
                C88718b.m110680b(LiteAppCenter.TAG, e.toString(), new Object[0]);
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "PageInfo{success=" + this.success + ", uuid=" + this.appUuid + ", appPtr=" + this.appPtr + ", pageId=" + this.pageId + ", renderId=" + this.renderId + ", basePath='" + this.basePath + '\'' + ", pageUrl='" + this.pageUrl + '\'' + ", flags=" + this.flags + ", pageOrientation=" + this.pageOrientation + ", appId=" + this.appId + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.success);
            parcel.writeLong(this.appUuid);
            parcel.writeLong(this.appPtr);
            parcel.writeLong(this.pageId);
            parcel.writeLong(this.renderId);
            parcel.writeString(this.basePath);
            parcel.writeString(this.pageUrl);
            parcel.writeInt(this.flags);
            parcel.writeInt(this.pageOrientation);
            parcel.writeString(this.appId);
        }

        public PageInfo(Parcel parcel) {
            this.success = parcel.readInt();
            this.appUuid = parcel.readLong();
            this.appPtr = parcel.readLong();
            this.pageId = parcel.readLong();
            this.renderId = parcel.readLong();
            this.basePath = parcel.readString();
            this.pageUrl = parcel.readString();
            this.flags = parcel.readInt();
            this.pageOrientation = parcel.readInt();
            this.appId = parcel.readString();
        }
    }

    public static void addJsApi(String str, C10479a aVar) {
        sWxaLiteAppJsApiMap.put(str, aVar);
    }

    public static void addJsApi(HashMap<String, C10479a> hashMap) {
        sWxaLiteAppJsApiMap.putAll(hashMap);
    }
}
