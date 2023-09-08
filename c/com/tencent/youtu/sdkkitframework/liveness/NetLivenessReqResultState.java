package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class NetLivenessReqResultState extends YtFSMBaseState {
    /* access modifiers changed from: private */
    public static final String TAG = "NetLivenessReqResultState";
    private int actRefUXMode = 0;
    private int actReflectType = 0;
    private String appId;
    private int backendProtoType = 0;
    private YuvImage bestImage;
    private int changePointNum = 2;
    private String controlConfig = "";
    private String extraConfig = "";
    private int finalConfidenceThreshold;
    private boolean needManualTrigger = false;
    public boolean needVideoData = true;
    private HashMap<String, String> requestOptions = new HashMap<>();
    private String resultUrl;
    private String secretId;
    private String secretKey;
    private int simiThreshold = 70;
    private String userId;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$12 */
    public static /* synthetic */ class C2032512 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        public static final /* synthetic */ int[] f57034x75f35c10;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode[] r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57034x75f35c10 = r0
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57034x75f35c10     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57034x75f35c10     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57034x75f35c10     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57034x75f35c10     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.C2032512.<clinit>():void");
        }
    }

    public class FivePoints {
        public ArrayList<Pointf> points;

        public FivePoints() {
        }
    }

    public class Pointf {

        /* renamed from: x */
        public float f57035x;

        /* renamed from: y */
        public float f57036y;

        public Pointf() {
        }
    }

    public class Version {
        public String faction_sdk_version = "";
        public String freflect_sdk_version = "";
        public String ftrack_sdk_version = "";
        public String sdk_version = "";

        public Version() {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ JSONException -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> r19, java.lang.Exception r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = "similarity_float"
            java.lang.String r3 = "score"
            java.lang.String r4 = " score "
            java.lang.String r5 = "errorcode: "
            java.lang.String r6 = "rst_succeed"
            java.lang.String r7 = "errorcode"
            java.lang.String r8 = "rst_failed"
            java.lang.String r9 = "error_code"
            com.tencent.youtu.sdkkitframework.common.YtSDKStats r10 = com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance()
            r10.exitState()
            java.lang.String r10 = "response"
            if (r20 == 0) goto L_0x0056
            java.lang.String r0 = TAG
            java.lang.String r3 = "failed: error"
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r0, r3)
            com.tencent.youtu.sdkkitframework.common.YtSDKStats r0 = com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance()
            r3 = 2097153(0x200001, float:2.938737E-39)
            java.lang.String r4 = r20.getMessage()
            r0.reportError(r3, r4)
            java.lang.String r0 = r20.getMessage()
            if (r2 == 0) goto L_0x0048
            boolean r3 = r2.containsKey(r10)
            if (r3 == 0) goto L_0x0048
            java.lang.Object r0 = r2.get(r10)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0048:
            com.tencent.youtu.sdkkitframework.framework.YtFSM r2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
            com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$3 r3 = new com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$3
            r3.<init>(r0)
            r2.sendFSMEvent(r3)
            goto L_0x01c2
        L_0x0056:
            r12 = -1
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e2 }
            java.lang.Object r14 = r2.get(r10)     // Catch:{ JSONException -> 0x00e2 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x00e2 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x00e2 }
            boolean r14 = r13.has(r3)     // Catch:{ JSONException -> 0x00e2 }
            boolean r15 = r13.has(r7)     // Catch:{ JSONException -> 0x00de }
            if (r15 != 0) goto L_0x007d
            boolean r15 = r13.has(r9)     // Catch:{ JSONException -> 0x00de }
            if (r15 == 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            java.lang.String r3 = TAG     // Catch:{ JSONException -> 0x00de }
            java.lang.String r7 = "response not right"
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106579e(r3, r7)     // Catch:{ JSONException -> 0x00de }
            r3 = -1
            r7 = -1
            goto L_0x00c2
        L_0x007d:
            int r15 = r1.backendProtoType     // Catch:{ JSONException -> 0x00de }
            if (r15 != 0) goto L_0x0086
            int r7 = r13.getInt(r7)     // Catch:{ JSONException -> 0x00de }
            goto L_0x009d
        L_0x0086:
            boolean r15 = r13.has(r9)     // Catch:{ JSONException -> 0x00de }
            if (r15 == 0) goto L_0x0091
            int r7 = r13.getInt(r9)     // Catch:{ JSONException -> 0x00de }
            goto L_0x009d
        L_0x0091:
            boolean r15 = r13.has(r7)     // Catch:{ JSONException -> 0x00de }
            if (r15 == 0) goto L_0x009c
            int r7 = r13.getInt(r7)     // Catch:{ JSONException -> 0x00de }
            goto L_0x009d
        L_0x009c:
            r7 = -1
        L_0x009d:
            if (r14 == 0) goto L_0x00a7
            int r3 = r13.getInt(r3)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            r12 = r7
            goto L_0x00df
        L_0x00a7:
            r3 = -1
        L_0x00a8:
            java.lang.String r15 = TAG     // Catch:{ JSONException -> 0x00db }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00db }
            r11.<init>()     // Catch:{ JSONException -> 0x00db }
            r11.append(r5)     // Catch:{ JSONException -> 0x00db }
            r11.append(r7)     // Catch:{ JSONException -> 0x00db }
            r11.append(r4)     // Catch:{ JSONException -> 0x00db }
            r11.append(r3)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x00db }
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r15, r11)     // Catch:{ JSONException -> 0x00db }
        L_0x00c2:
            boolean r11 = r13.has(r0)     // Catch:{ JSONException -> 0x00db }
            if (r11 == 0) goto L_0x00d9
            int r11 = r13.getInt(r0)     // Catch:{ JSONException -> 0x00db }
            if (r11 == r12) goto L_0x00d7
            int r0 = r1.simiThreshold     // Catch:{ JSONException -> 0x00d4 }
            if (r11 <= r0) goto L_0x00d7
            r0 = r6
            goto L_0x00f1
        L_0x00d4:
            r0 = move-exception
            r12 = r7
            goto L_0x00e6
        L_0x00d7:
            r0 = r8
            goto L_0x00f1
        L_0x00d9:
            r0 = r8
            goto L_0x00f2
        L_0x00db:
            r0 = move-exception
            r12 = r7
            goto L_0x00e0
        L_0x00de:
            r0 = move-exception
        L_0x00df:
            r3 = -1
        L_0x00e0:
            r11 = -1
            goto L_0x00e6
        L_0x00e2:
            r0 = move-exception
            r3 = -1
            r11 = -1
            r14 = 0
        L_0x00e6:
            java.lang.String r7 = TAG
            java.lang.String r0 = r0.getLocalizedMessage()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106579e(r7, r0)
            r0 = r8
            r7 = r12
        L_0x00f1:
            r12 = r11
        L_0x00f2:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r13 = TAG
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r5)
            r15.append(r7)
            r15.append(r4)
            r15.append(r3)
            java.lang.String r4 = r15.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r13, r4)
            java.lang.String r4 = "message"
            java.lang.String r5 = "process_action"
            java.lang.String r13 = "ui_tips"
            java.lang.String r15 = "process_finished"
            r16 = r8
            java.lang.String r8 = "ui_action"
            r17 = r7
            if (r7 != 0) goto L_0x0164
            if (r14 == 0) goto L_0x0129
            int r7 = r1.finalConfidenceThreshold
            if (r3 < r7) goto L_0x0164
        L_0x0129:
            r11.put(r8, r15)
            r11.put(r13, r6)
            java.lang.String r3 = "succeed"
            r11.put(r5, r3)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r11.put(r9, r5)
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(r3, r6, r2)
            r11.put(r4, r2)
            android.graphics.YuvImage r2 = r1.bestImage
            java.lang.String r3 = "extra_message"
            r11.put(r3, r2)
            if (r12 <= 0) goto L_0x0161
            java.lang.String r2 = "cmp_message"
            r11.put(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.String r2 = "cmp_score"
            r11.put(r2, r0)
        L_0x0161:
            r7 = r17
            goto L_0x01a3
        L_0x0164:
            java.lang.String r0 = "error_reason_code"
            if (r14 == 0) goto L_0x0177
            int r6 = r1.finalConfidenceThreshold
            if (r3 >= r6) goto L_0x0177
            r3 = 4194305(0x400001, float:5.877473E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r0, r3)
            goto L_0x017e
        L_0x0177:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r11.put(r0, r3)
        L_0x017e:
            r11.put(r8, r15)
            r3 = r16
            r11.put(r13, r3)
            java.lang.String r0 = "failed"
            r11.put(r5, r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.put(r9, r0)
            java.lang.Object r0 = r2.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r17
            java.lang.String r0 = com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(r7, r3, r0)
            r11.put(r4, r0)
        L_0x01a3:
            com.tencent.youtu.sdkkitframework.common.YtSDKStats r0 = com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "errorCode "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.reportInfo(r2)
            com.tencent.youtu.sdkkitframework.framework.YtFSM r0 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
            r0.sendFSMEvent(r11)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.handleResponseEvent(java.util.HashMap, java.lang.Exception):void");
    }

    public static String makeActionStr(String[] strArr) {
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            int parseInt = Integer.parseInt(strArr[i]);
            if (parseInt == 0 || parseInt == 1) {
                str = str + "blink";
            } else if (parseInt == 2) {
                str = str + "mouth";
            } else if (parseInt == 3) {
                str = str + "node";
            } else if (parseInt == 4) {
                str = str + "shake";
            } else if (parseInt == 5) {
                str = str + "silence";
            }
            if (i != strArr.length - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    private void onActReflectRequest() {
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            YuvImage yuvImage = (YuvImage) stateByName2.getStateDataBy("best_frame");
            this.bestImage = yuvImage;
            this.stateData.put("best_frame", yuvImage);
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            ActionReflectReq actionReflectReq = (ActionReflectReq) stateByName3.getStateDataBy("reflect_request_object");
            byte[] bArr = (byte[]) stateByName2.getStateDataBy("frames");
            byte[] encode = Base64.encode(bArr, 2);
            String str = (String) stateByName.getStateDataBy("control_config");
            if (str != null) {
                this.controlConfig = str;
            }
            String str2 = (String) stateByName.getStateDataBy("extra_config");
            if (str2 != null) {
                this.extraConfig = str2;
                String str3 = TAG;
                YtLogger.m106580i(str3, "extraconfig:" + this.extraConfig);
            }
            String str4 = (String) stateByName3.getStateDataBy("refcontrol_begin");
            if (str4 != null) {
                StringBuilder sb = new StringBuilder();
                String str5 = this.extraConfig;
                if (str5 == null) {
                    str5 = "";
                }
                sb.append(str5);
                sb.append(" refcontrol_begin ");
                sb.append(str4);
                this.extraConfig = sb.toString();
            }
            String str6 = (String) stateByName.getStateDataBy("cp_num");
            if (str6 != null) {
                this.changePointNum = Integer.parseInt(str6);
                String str7 = TAG;
                YtLogger.m106580i(str7, "cpnum:" + this.changePointNum);
            }
            parseControlConfig();
            String makeActionStr = makeActionStr((String[]) stateByName2.getStateDataBy("action_seq"));
            YtLivenessNetProtoHelper.ActionReflectLiveReqData actionReflectLiveReqData = new YtLivenessNetProtoHelper.ActionReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
            actionReflectLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.sessionId = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = actionReflectLiveReqData.baseInfo;
            netBaseInfoData2.appId = this.appId;
            netBaseInfoData2.businessId = "";
            actionReflectLiveReqData.colorData = actionReflectReq.color_data;
            if (this.needVideoData) {
                actionReflectLiveReqData.actionVideo = new String(encode);
            } else {
                actionReflectLiveReqData.actionVideo = "";
            }
            actionReflectLiveReqData.actionStr = makeActionStr;
            YTImageInfo yTImageInfo = actionReflectReq.eye_image;
            actionReflectLiveReqData.eyeImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo.image, yTImageInfo.five_points, yTImageInfo.checksum);
            YTImageInfo yTImageInfo2 = actionReflectReq.mouth_image;
            actionReflectLiveReqData.mouthImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo2.image, yTImageInfo2.five_points, yTImageInfo2.checksum);
            YTImageInfo yTImageInfo3 = actionReflectReq.live_image;
            actionReflectLiveReqData.liveImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo3.image, yTImageInfo3.five_points, yTImageInfo3.checksum);
            actionReflectLiveReqData.reflectData = actionReflectReq.reflect_data;
            actionReflectLiveReqData.baseInfo.lux = actionReflectReq.select_data.android_data.lux;
            actionReflectLiveReqData.reflectConfig = this.extraConfig;
            actionReflectLiveReqData.controlConfig = this.controlConfig;
            actionReflectLiveReqData.colorNum = this.changePointNum;
            actionReflectLiveReqData.config = YTAGReflectLiveCheckJNIInterface.ChecksumPose(bArr.toString(), actionReflectReq.live_image.image, makeActionStr);
            String makeActionReflectLiveReq = YtLivenessNetProtoHelper.makeActionReflectLiveReq(actionReflectLiveReqData);
            String str8 = TAG;
            YtLogger.m106580i(str8, "uploadString: " + makeActionReflectLiveReq);
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, makeActionReflectLiveReq, (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                    YtLogger.m106580i(NetLivenessReqResultState.TAG, "handle actreflect response");
                    NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (Exception e) {
            String str9 = TAG;
            YtLogger.m106579e(str9, "actrefl request failed" + e.getLocalizedMessage());
            YtSDKStats instance = YtSDKStats.getInstance();
            instance.reportInfo("actrefl request failed: " + e.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(e) {
                public final /* synthetic */ Exception val$e;

                {
                    this.val$e = r4;
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.MSG_NET_ERROR, r4.getLocalizedMessage()));
                }
            });
        }
    }

    private void onActionRequest() {
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName == null) {
                YtSDKStats.getInstance().reportInfo("action request action state is null");
                YtLogger.m106579e(TAG, "action request action state is null");
                return;
            }
            this.bestImage = (YuvImage) stateByName.getStateDataBy("best_frame");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.bestImage.compressToJpeg(new Rect(0, 0, this.bestImage.getWidth(), this.bestImage.getHeight()), 95, byteArrayOutputStream);
            byte[] bArr = (byte[]) stateByName.getStateDataBy("frames");
            if (bArr == null) {
                YtLogger.m106579e(TAG, "action data is null");
            }
            byte[] encode = bArr == null ? null : Base64.encode(bArr, 2);
            String makeActionStr = makeActionStr((String[]) stateByName.getStateDataBy("action_seq"));
            parseControlConfig();
            YtLivenessNetProtoHelper.ActionLiveReqData actionLiveReqData = new YtLivenessNetProtoHelper.ActionLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
            actionLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.appId = this.appId;
            netBaseInfoData.sessionId = UUID.randomUUID().toString();
            actionLiveReqData.bestImage = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            actionLiveReqData.actionStr = makeActionStr;
            if (this.needVideoData) {
                actionLiveReqData.actionVideo = new String(encode);
            } else {
                actionLiveReqData.actionVideo = "";
            }
            actionLiveReqData.needEyeDetect = true;
            actionLiveReqData.needMouthDetect = true;
            actionLiveReqData.reflectConfig = this.extraConfig;
            actionLiveReqData.controlConfig = this.controlConfig;
            actionLiveReqData.colorNum = this.changePointNum;
            actionLiveReqData.config = (String) stateByName.getStateDataBy("config");
            actionLiveReqData.reservedfield = "";
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, YtLivenessNetProtoHelper.makeActionLiveReq(actionLiveReqData), (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                    YtLogger.m106580i(NetLivenessReqResultState.TAG, "Handle action response");
                    NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (Exception e) {
            String str = TAG;
            YtLogger.m106579e(str, "action request failed" + e.getLocalizedMessage());
            YtSDKStats instance = YtSDKStats.getInstance();
            instance.reportInfo("action request failed: " + e.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(e) {
                public final /* synthetic */ Exception val$e;

                {
                    this.val$e = r5;
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.RST_FAILED, r5.getLocalizedMessage()));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onCheckResponseManual() {
        if (this.needManualTrigger) {
            try {
                YtFSM instance = YtFSM.getInstance();
                YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
                instance.getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_manual_trigger", (Object) null);
                YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
            } catch (Exception e) {
                String str = "on Check response manual failed " + e.getLocalizedMessage();
                YtLogger.m106579e(TAG, str);
                YtSDKStats.getInstance().reportInfo(str);
            }
        }
    }

    private void onLipReadRequest() {
        String str;
        String str2;
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.LIPREAD_STATE));
            if (stateByName2 == null) {
                YtSDKStats.getInstance().reportInfo("lipread request action state is null");
                YtLogger.m106579e(TAG, "lipread request action state is null");
                return;
            }
            this.bestImage = (YuvImage) stateByName2.getStateDataBy("last_frame");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.bestImage.compressToJpeg(new Rect(0, 0, this.bestImage.getWidth(), this.bestImage.getHeight()), 95, byteArrayOutputStream);
            byte[] encode = Base64.encode(byteArrayOutputStream.toByteArray(), 2);
            Arrays.toString((String[]) stateByName2.getStateDataBy("action_seq"));
            if (this.backendProtoType == 2) {
                YtLivenessNetProtoHelper.LipReadReqData lipReadReqData = new YtLivenessNetProtoHelper.LipReadReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                lipReadReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.appId;
                netBaseInfoData.sessionId = UUID.randomUUID().toString();
                lipReadReqData.baseInfo.businessId = this.requestOptions.containsKey("business_id") ? this.requestOptions.get("business_id") : "wx_default";
                lipReadReqData.baseInfo.personId = this.requestOptions.containsKey("person_id") ? this.requestOptions.get("person_id") : "wx_default0";
                lipReadReqData.baseInfo.personType = this.requestOptions.containsKey("person_type") ? this.requestOptions.get("person_type") : "youtu";
                lipReadReqData.baseInfo.reqType = this.requestOptions.containsKey("req_type") ? this.requestOptions.get("req_type") : WeChatBrands.Business.GROUP_LIVE;
                lipReadReqData.baseInfo.liveType = this.requestOptions.containsKey(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE) ? Integer.parseInt(this.requestOptions.get(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE)) : 0;
                lipReadReqData.liveImage = new String(encode);
                lipReadReqData.liveFivePoint = (float[]) stateByName2.getStateDataBy("last_frame_landmark");
                lipReadReqData.faceExtraInfo = (String) stateByName2.getStateDataBy("face_extra_list");
                String str3 = "";
                for (String str4 : (String[]) stateByName2.getStateDataBy("action_seq")) {
                    str3 = str3 + str4;
                }
                YtLogger.m106580i(TAG, "action_seq: " + str3);
                lipReadReqData.validate_data = str3;
                lipReadReqData.voice = new String(Base64.encode((byte[]) stateByName2.getStateDataBy("audio_data"), 2));
                lipReadReqData.mouth_lip_reading = (String) stateByName2.getStateDataBy("lipreading_feature");
                lipReadReqData.mouth_move = (String) stateByName2.getStateDataBy("feature");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ((YuvImage) stateByName.getStateDataBy("best_image")).compressToJpeg(new Rect(0, 0, this.bestImage.getWidth(), this.bestImage.getHeight()), 95, byteArrayOutputStream2);
                lipReadReqData.bestImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream2.toByteArray(), (float[]) stateByName.getStateDataBy("best_shape"), (String) null);
                str2 = YtLivenessNetProtoHelper.makeLipReadReq(lipReadReqData);
            } else {
                String str5 = "";
                for (String str6 : (String[]) stateByName2.getStateDataBy("action_seq")) {
                    str5 = str5 + str6;
                }
                YtLogger.m106580i(TAG, "action_seq: " + str5);
                YtLivenessNetProtoHelper.FourLiveReqData fourLiveReqData = new YtLivenessNetProtoHelper.FourLiveReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = new YtLivenessNetProtoHelper.NetBaseInfoData();
                fourLiveReqData.baseInfoData = netBaseInfoData2;
                netBaseInfoData2.appId = this.appId;
                fourLiveReqData.validateData = str5;
                fourLiveReqData.video = new String(Base64.encode((byte[]) stateByName2.getStateDataBy("audio_data"), 2));
                String makeFourLiveReq = YtLivenessNetProtoHelper.makeFourLiveReq(fourLiveReqData);
                if (this.requestOptions.size() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(makeFourLiveReq);
                        for (Map.Entry next : this.requestOptions.entrySet()) {
                            jSONObject.put((String) next.getKey(), next.getValue());
                        }
                        str2 = jSONObject.toString();
                    } catch (JSONException e) {
                        YtLogger.m106579e(TAG, "lipread net request parse json failed " + e.getLocalizedMessage());
                    }
                }
                str = makeFourLiveReq;
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, str, (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                    public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                        YtLogger.m106580i(NetLivenessReqResultState.TAG, "Handle lipread response");
                        NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                        NetLivenessReqResultState.this.onCheckResponseManual();
                    }
                });
            }
            str = str2;
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, str, (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                    YtLogger.m106580i(NetLivenessReqResultState.TAG, "Handle lipread response");
                    NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (Exception e2) {
            YtLogger.m106579e(TAG, "lipread request failed" + e2.getLocalizedMessage());
            YtSDKStats.getInstance().reportInfo("lipreading request failed: " + e2.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(e2) {
                public final /* synthetic */ Exception val$e;

                {
                    this.val$e = r5;
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.RST_FAILED, r5.getLocalizedMessage()));
                }
            });
        }
    }

    private void onReflectRequest() {
        String str;
        CommonUtils.benchMarkBegin("reflect_request_s1");
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.bestImage = (YuvImage) stateByName.getStateDataBy("best_image");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.bestImage.compressToJpeg(new Rect(0, 0, this.bestImage.getWidth(), this.bestImage.getHeight()), 95, byteArrayOutputStream);
            byte[] encode = Base64.encode(byteArrayOutputStream.toByteArray(), 2);
            this.stateData.put("best_frame", this.bestImage);
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            ReflectLiveReq reflectLiveReq = (ReflectLiveReq) stateByName2.getStateDataBy("reflect_request_object");
            String str2 = (String) stateByName3.getStateDataBy("extra_config");
            if (str2 != null) {
                this.extraConfig = str2;
            }
            String str3 = (String) stateByName2.getStateDataBy("refcontrol_begin");
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                String str4 = this.extraConfig;
                if (str4 == null) {
                    str4 = "";
                }
                sb.append(str4);
                sb.append(" refcontrol_begin ");
                sb.append(str3);
                this.extraConfig = sb.toString();
            }
            String str5 = (String) stateByName3.getStateDataBy("cp_num");
            if (str5 != null) {
                this.changePointNum = Integer.parseInt(str5);
            }
            reflectLiveReq.session_id = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData = new YtLivenessNetProtoHelper.ReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
            reflectLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.appId = this.appId;
            netBaseInfoData.sessionId = UUID.randomUUID().toString();
            reflectLiveReqData.baseInfo.businessId = this.requestOptions.containsKey("business_id") ? this.requestOptions.get("business_id") : null;
            reflectLiveReqData.baseInfo.personId = this.requestOptions.containsKey("person_id") ? this.requestOptions.get("person_id") : null;
            reflectLiveReqData.baseInfo.personType = this.requestOptions.containsKey("person_type") ? this.requestOptions.get("person_type") : null;
            reflectLiveReqData.baseInfo.reqType = this.requestOptions.containsKey("req_type") ? this.requestOptions.get("req_type") : null;
            reflectLiveReqData.baseInfo.liveType = this.requestOptions.containsKey(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE) ? Integer.parseInt(this.requestOptions.get(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE)) : 0;
            reflectLiveReqData.colorData = reflectLiveReq.color_data;
            reflectLiveReqData.liveImage = new String(encode);
            reflectLiveReqData.reflectData = reflectLiveReq.reflect_data;
            reflectLiveReqData.config = this.extraConfig;
            reflectLiveReqData.colorNum = this.changePointNum;
            if (this.backendProtoType == 2) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ((YuvImage) stateByName.getStateDataBy("best_image")).compressToJpeg(new Rect(0, 0, this.bestImage.getWidth(), this.bestImage.getHeight()), 95, byteArrayOutputStream2);
                reflectLiveReqData.bestImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream2.toByteArray(), (float[]) stateByName.getStateDataBy("best_shape"), (String) null);
                YuvImage yuvImage = (YuvImage) stateByName.getStateDataBy("openmouth_image");
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 95, byteArrayOutputStream3);
                reflectLiveReqData.openMouthImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream3.toByteArray(), (float[]) stateByName.getStateDataBy("openmouth_shape"), (String) null);
                YuvImage yuvImage2 = (YuvImage) stateByName.getStateDataBy("closeeye_image");
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                yuvImage2.compressToJpeg(new Rect(0, 0, yuvImage2.getWidth(), yuvImage2.getHeight()), 95, byteArrayOutputStream4);
                reflectLiveReqData.closeEyeImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream4.toByteArray(), (float[]) stateByName.getStateDataBy("closeeye_shape"), (String) null);
                str = YtLivenessNetProtoHelper.makePersonLiveReq(reflectLiveReqData);
            } else {
                str = YtLivenessNetProtoHelper.makeReflectLiveReq(reflectLiveReqData);
            }
            String str6 = str;
            String str7 = TAG;
            YtLogger.m106580i(str7, "begin request...uploadsize " + str6.length());
            CommonUtils.benchMarkEnd("reflect_request_s1");
            CommonUtils.benchMarkBegin("reflect_request_s2");
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, str6, (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                    CommonUtils.benchMarkEnd("reflect_request_s2");
                    CommonUtils.benchMarkBegin("reflect_request_s3");
                    YtLogger.m106580i(NetLivenessReqResultState.TAG, "handle reflection response");
                    NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    CommonUtils.benchMarkEnd("reflect_request_s3");
                    NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (Exception e) {
            String str8 = TAG;
            YtLogger.m106579e(str8, "reflection request failed" + e.getLocalizedMessage());
            YtSDKStats instance = YtSDKStats.getInstance();
            instance.reportInfo("reflection request failed: " + e.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(e) {
                public final /* synthetic */ Exception val$e;

                {
                    this.val$e = r5;
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.RST_FAILED, r5.getLocalizedMessage()));
                }
            });
        }
    }

    private void onSilentRequest() {
        YuvImage yuvImage = (YuvImage) YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).getStateDataBy("best_image");
        this.bestImage = yuvImage;
        int width = yuvImage.getWidth();
        int height = this.bestImage.getHeight();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bestImage.compressToJpeg(new Rect(0, 0, width, height), 95, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        YtLivenessNetProtoHelper.PictureLiveReqData pictureLiveReqData = new YtLivenessNetProtoHelper.PictureLiveReqData();
        YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
        pictureLiveReqData.baseInfo = netBaseInfoData;
        netBaseInfoData.sessionId = UUID.randomUUID().toString();
        pictureLiveReqData.baseInfo.appId = this.appId;
        pictureLiveReqData.imageInfo = new YtLivenessNetProtoHelper.ImageInfo(byteArray, (float[]) null, (String) null);
        YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.resultUrl, YtLivenessNetProtoHelper.makePictureLiveReq(pictureLiveReqData), (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
            public void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc) {
                YtLogger.m106580i(NetLivenessReqResultState.TAG, "Parse silent response");
                NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                NetLivenessReqResultState.this.onCheckResponseManual();
            }
        });
    }

    private void parseControlConfig() {
        if (!this.controlConfig.isEmpty()) {
            String[] split = this.controlConfig.split("&");
            if (split.length > 0) {
                for (String split2 : split) {
                    String[] split3 = split2.split("=");
                    if (split3.length > 1) {
                        if (split3[0].equals("need_action_video") && split3[1].equals("false")) {
                            this.needVideoData = false;
                        }
                        if (split3[0].equals("actref_ux_mode")) {
                            this.actRefUXMode = Integer.parseInt(split3[1]);
                        }
                    }
                }
            }
        }
    }

    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
            {
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.NET_REQ);
            }
        });
        int i = C2032512.f57034x75f35c10[YtFSM.getInstance().getWorkMode().ordinal()];
        if (i == 1 || i == 2) {
            onActionRequest();
        } else if (i == 3) {
            onReflectRequest();
        } else if (i == 4) {
            onActReflectRequest();
        } else if (i == 5) {
            onLipReadRequest();
        }
    }

    public void enterFirst() {
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            this.appId = jSONObject.getString("app_id");
            String string = jSONObject.getString("result_api_url");
            this.resultUrl = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
                YtLogger.m106579e(TAG, "parse url failed");
                return;
            }
            if (jSONObject.has("secret_key")) {
                this.secretKey = jSONObject.getString("secret_key");
            }
            if (jSONObject.has("secret_id")) {
                this.secretId = jSONObject.getString("secret_id");
            }
            if (jSONObject.has("user_id")) {
                this.userId = jSONObject.getString("user_id");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.simiThreshold = jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("final_liveness_confidence_threshold")) {
                this.finalConfidenceThreshold = jSONObject.getInt("final_liveness_confidence_threshold");
            } else {
                this.finalConfidenceThreshold = 85;
            }
            if (jSONObject.has("extra_config")) {
                this.extraConfig = jSONObject.getString("extra_config");
            } else {
                this.extraConfig = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.controlConfig = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.changePointNum = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("manual_trigger")) {
                this.needManualTrigger = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("request_options")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("request_options");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.requestOptions.put(next, jSONObject2.getString(next));
                }
            }
            if (jSONObject.has("backend_proto_type")) {
                this.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
        } catch (JSONException e) {
            String str2 = TAG;
            YtLogger.m106579e(str2, "Failed to parse json:" + e.getLocalizedMessage());
        }
    }

    public void unload() {
        super.unload();
    }
}
