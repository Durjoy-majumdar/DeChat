package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class YtSDKKitConfigHelper {
    private static final HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String> SDK_SETTINGS = new HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String>() {
        {
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE, "lipread_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_settings");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_settings");
        }
    };
    private static final String TAG = "YtSDKKitConfigHelper";
    private static final HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String> UI_SETTINGS = new HashMap<YtSDKKitFramework.YtSDKKitFrameworkWorkMode, String>() {
        {
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_card_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE, "lipread_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_ui");
            put(YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_ui");
        }
    };

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper$10 */
    public static /* synthetic */ class C2028810 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        public static final /* synthetic */ int[] f57032x75f35c10;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode[] r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57032x75f35c10 = r0
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f57032x75f35c10     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.C2028810.<clinit>():void");
        }
    }

    public static String getConfigStringBy(JSONObject jSONObject, String str, boolean z) {
        String str2;
        try {
            str2 = jSONObject.getString(str);
        } catch (JSONException e) {
            String str3 = TAG;
            YtLogger.m106579e(str3, "Parse json object failed " + e.getLocalizedMessage());
            str2 = null;
        }
        if (z && (str2 == null || str2.equals(""))) {
            String str4 = TAG;
            YtLogger.m106579e(str4, "Parse json object failed " + str + "参数解析失败, 不存在或者不能为空");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_JSON_PARAM_ERROR, StringCode.MSG_PARAM_ERROR);
            HashMap hashMap = new HashMap();
            hashMap.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            hashMap.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_JSON_PARAM_ERROR));
            hashMap.put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_JSON_PARAM_ERROR, StringCode.MSG_PARAM_ERROR, str + "参数解析失败, 不存在或者不能为空"));
            YtFSM.getInstance().sendFSMEvent(hashMap);
        }
        return str2;
    }

    public static ArrayList<String> getPipleStateNames(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode) {
        switch (C2028810.f57032x75f35c10[ytSDKKitFrameworkWorkMode.ordinal()]) {
            case 1:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_AUTO_DETECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_MANUAL_DETECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 2:
            case 3:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 4:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 5:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 6:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.LIPREAD_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 7:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.DETECTONLY_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            case 8:
                return new ArrayList<String>() {
                    {
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.OCR_VIID_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE));
                        add(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            default:
                return null;
        }
    }

    public static JSONObject getSDKConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (JSONException e) {
            YtLogger.m106579e(TAG, e.getMessage());
            return null;
        }
    }

    public static JSONObject getUIConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (JSONException e) {
            YtLogger.m106579e(TAG, e.getMessage());
            return null;
        }
    }

    public static void setSDKConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (JSONException e) {
            YtLogger.m106579e(TAG, e.getMessage());
        }
    }

    public static void setUIConfig(YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (JSONException e) {
            YtLogger.m106579e(TAG, e.getMessage());
        }
    }
}
