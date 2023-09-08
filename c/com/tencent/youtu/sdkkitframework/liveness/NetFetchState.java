package com.tencent.youtu.sdkkitframework.liveness;

import android.text.TextUtils;
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
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetFetchState extends YtFSMBaseState {
    /* access modifiers changed from: private */
    public static final String TAG = "NetFetchState";
    /* access modifiers changed from: private */
    public String actionSeqData = "";
    /* access modifiers changed from: private */
    public String appId;
    /* access modifiers changed from: private */
    public int backendProtoType = 0;
    /* access modifiers changed from: private */
    public int changePointNum = 2;
    /* access modifiers changed from: private */
    public String configUrl;
    /* access modifiers changed from: private */
    public String controlConfig = "";
    /* access modifiers changed from: private */
    public String extraConfig = "";
    /* access modifiers changed from: private */
    public String localColorData = "";
    /* access modifiers changed from: private */
    public boolean needLocalConfig = false;
    /* access modifiers changed from: private */
    public JSONObject selectData = null;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$4 */
    public static /* synthetic */ class C203214 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        public static final /* synthetic */ int[] f57033x75f35c10;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode[] r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57033x75f35c10 = r0
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57033x75f35c10     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57033x75f35c10     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57033x75f35c10     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57033x75f35c10     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f57033x75f35c10     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203214.<clinit>():void");
        }
    }

    public interface NetworkCallback {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    private void onReflectRequest() {
        YTAGReflectLiveCheckInterface.getLiveCheckType(YtFSM.getInstance().getContext().currentAppContext, new YTAGReflectLiveCheckInterface.GetLiveStyleResult() {
            public void onFailed(int i, String str, String str2) {
                String access$400 = NetFetchState.TAG;
                YtLogger.m106579e(access$400, "network failed " + str + " fix " + str2);
                YtSDKStats.getInstance().reportError(i, str);
                YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(i, str, str2) {
                    public final /* synthetic */ int val$code1;
                    public final /* synthetic */ String val$howToFix1;
                    public final /* synthetic */ String val$tips1;

                    {
                        this.val$code1 = r3;
                        this.val$tips1 = r4;
                        this.val$howToFix1 = r5;
                        put("ui_error", Integer.valueOf(r3));
                        put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_FAILED);
                        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_NETWORK_ERROR));
                        put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_NETWORK_ERROR, StringCode.MSG_NET_ERROR, "msg_net_error " + r4 + " " + r5));
                    }
                });
            }

            public void onSuccess(LiveStyleRequester.YTLiveStyleReq yTLiveStyleReq, LiveStyleResponse liveStyleResponse) {
                String str;
                NetFetchState.this.stateData.put("select_data", yTLiveStyleReq.select_data);
                if ((TextUtils.isEmpty(NetFetchState.this.localColorData) || !NetFetchState.this.needLocalConfig) && NetFetchState.this.configUrl != null) {
                    if (NetFetchState.this.backendProtoType == 2 || YtFSM.getInstance().getWorkMode() != YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
                        YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = new YtLivenessNetProtoHelper.GetLiveTypeReqData();
                        YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                        getLiveTypeReqData.baseInfo = netBaseInfoData;
                        netBaseInfoData.appId = NetFetchState.this.appId;
                        YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = getLiveTypeReqData.baseInfo;
                        netBaseInfoData2.businessId = "wx_default";
                        netBaseInfoData2.lux = yTLiveStyleReq.select_data.android_data.lux;
                        getLiveTypeReqData.reflectConfig = NetFetchState.this.extraConfig;
                        getLiveTypeReqData.controlConfig = NetFetchState.this.controlConfig;
                        getLiveTypeReqData.colorNum = NetFetchState.this.changePointNum;
                        str = YtLivenessNetProtoHelper.makeGetLiveTypeReq(getLiveTypeReqData);
                    } else {
                        YtLivenessNetProtoHelper.GetFourLiveTypeReqData getFourLiveTypeReqData = new YtLivenessNetProtoHelper.GetFourLiveTypeReqData();
                        YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData3 = new YtLivenessNetProtoHelper.NetBaseInfoData();
                        getFourLiveTypeReqData.baseInfo = netBaseInfoData3;
                        netBaseInfoData3.appId = NetFetchState.this.appId;
                        str = YtLivenessNetProtoHelper.makeGetFourLiveReq(getFourLiveTypeReqData);
                    }
                    String str2 = str;
                    YtLogger.m106580i(NetFetchState.TAG, "Use online data ---> on get config info: " + str2);
                    YtFSM.getInstance().sendNetworkRequest(StringCode.NET_FETCH_DATA, NetFetchState.this.configUrl, str2, (HashMap<String, String>) null, new YtSDKKitFramework.IYtSDKKitNetResponseParser() {
                        /* JADX WARNING: Removed duplicated region for block: B:82:0x0274  */
                        /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> r20, java.lang.Exception r21) {
                            /*
                                r19 = this;
                                r1 = r19
                                r2 = r20
                                r0 = r21
                                java.lang.String r3 = "change_point_num"
                                java.lang.String r4 = "reflect_param"
                                java.lang.String r5 = "video_config"
                                java.lang.String r6 = "config"
                                java.lang.String r7 = "error_code"
                                java.lang.String r8 = "video_iframeinterval"
                                java.lang.String r9 = "video_framerate"
                                java.lang.String r10 = "video_bitrate"
                                java.lang.String r11 = "color_data"
                                java.lang.String r12 = "select_data"
                                r13 = 2097153(0x200001, float:2.938737E-39)
                                java.lang.String r14 = "response"
                                if (r0 == 0) goto L_0x0052
                                com.tencent.youtu.sdkkitframework.common.YtSDKStats r3 = com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance()
                                java.lang.String r4 = r21.getMessage()
                                r3.reportError(r13, r4)
                                java.lang.String r3 = r21.getLocalizedMessage()
                                if (r2 == 0) goto L_0x0044
                                boolean r4 = r2.containsKey(r14)
                                if (r4 == 0) goto L_0x0044
                                java.lang.Object r2 = r2.get(r14)
                                r3 = r2
                                java.lang.String r3 = (java.lang.String) r3
                            L_0x0044:
                                com.tencent.youtu.sdkkitframework.framework.YtFSM r2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$1 r4 = new com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$1
                                r4.<init>(r0, r3)
                                r2.sendFSMEvent(r4)
                                goto L_0x02a7
                            L_0x0052:
                                java.lang.String r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG
                                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                                r15.<init>()
                                java.lang.String r13 = "response : "
                                r15.append(r13)
                                java.lang.Object r13 = r2.get(r14)
                                java.lang.String r13 = (java.lang.String) r13
                                r15.append(r13)
                                java.lang.String r13 = r15.toString()
                                com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r0, r13)
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this
                                int r0 = r0.backendProtoType
                                r13 = 2
                                r16 = 1
                                java.lang.String r15 = "action_data"
                                r17 = r8
                                java.lang.String r8 = "errorcode"
                                if (r0 == r13) goto L_0x0113
                                com.tencent.youtu.sdkkitframework.framework.YtFSM r0 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
                                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r0 = r0.getWorkMode()
                                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r13 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE
                                if (r0 != r13) goto L_0x0113
                                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010e }
                                java.lang.Object r3 = r2.get(r14)     // Catch:{ JSONException -> 0x010e }
                                java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x010e }
                                r0.<init>(r3)     // Catch:{ JSONException -> 0x010e }
                                boolean r3 = r0.has(r8)     // Catch:{ JSONException -> 0x010e }
                                if (r3 == 0) goto L_0x0107
                                int r3 = r0.getInt(r8)     // Catch:{ JSONException -> 0x010e }
                                if (r3 != 0) goto L_0x0107
                                java.lang.String r3 = "validate_data"
                                java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x010e }
                                if (r0 == 0) goto L_0x0107
                                java.lang.String r3 = ""
                                r4 = 0
                            L_0x00b2:
                                int r5 = r0.length()     // Catch:{ JSONException -> 0x010e }
                                if (r4 >= r5) goto L_0x00e7
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x010e }
                                r5.<init>()     // Catch:{ JSONException -> 0x010e }
                                r5.append(r3)     // Catch:{ JSONException -> 0x010e }
                                char r3 = r0.charAt(r4)     // Catch:{ JSONException -> 0x010e }
                                r5.append(r3)     // Catch:{ JSONException -> 0x010e }
                                java.lang.String r3 = r5.toString()     // Catch:{ JSONException -> 0x010e }
                                int r5 = r0.length()     // Catch:{ JSONException -> 0x010e }
                                int r5 = r5 + -1
                                if (r4 == r5) goto L_0x00e4
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x010e }
                                r5.<init>()     // Catch:{ JSONException -> 0x010e }
                                r5.append(r3)     // Catch:{ JSONException -> 0x010e }
                                java.lang.String r3 = ","
                                r5.append(r3)     // Catch:{ JSONException -> 0x010e }
                                java.lang.String r3 = r5.toString()     // Catch:{ JSONException -> 0x010e }
                            L_0x00e4:
                                int r4 = r4 + 1
                                goto L_0x00b2
                            L_0x00e7:
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r4 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x010e }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r4 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x010e }
                                java.util.HashMap r4 = r4.stateData     // Catch:{ JSONException -> 0x010e }
                                r4.put(r15, r3)     // Catch:{ JSONException -> 0x010e }
                                com.tencent.youtu.sdkkitframework.framework.YtFSM r3 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()     // Catch:{ JSONException -> 0x010e }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$2 r4 = new com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$2     // Catch:{ JSONException -> 0x010e }
                                r4.<init>(r0)     // Catch:{ JSONException -> 0x010e }
                                r3.sendFSMEvent(r4)     // Catch:{ JSONException -> 0x010e }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x010e }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x010e }
                                r0.moveToNextState()     // Catch:{ JSONException -> 0x010e }
                                r15 = 0
                                goto L_0x0108
                            L_0x0107:
                                r15 = 1
                            L_0x0108:
                                r18 = r14
                            L_0x010a:
                                r16 = r15
                                goto L_0x0272
                            L_0x010e:
                                r18 = r14
                                goto L_0x0272
                            L_0x0113:
                                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0253 }
                                java.lang.Object r13 = r2.get(r14)     // Catch:{ JSONException -> 0x0253 }
                                java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x0253 }
                                r0.<init>(r13)     // Catch:{ JSONException -> 0x0253 }
                                r13 = -1
                                boolean r18 = r0.has(r7)     // Catch:{ JSONException -> 0x0253 }
                                if (r18 == 0) goto L_0x012a
                                int r13 = r0.getInt(r7)     // Catch:{ JSONException -> 0x0253 }
                                goto L_0x0134
                            L_0x012a:
                                boolean r7 = r0.has(r8)     // Catch:{ JSONException -> 0x0253 }
                                if (r7 == 0) goto L_0x0134
                                int r13 = r0.getInt(r8)     // Catch:{ JSONException -> 0x0253 }
                            L_0x0134:
                                if (r13 != 0) goto L_0x024e
                                boolean r7 = r0.has(r11)     // Catch:{ JSONException -> 0x0253 }
                                r8 = 0
                                if (r7 == 0) goto L_0x0142
                                java.lang.String r7 = r0.getString(r11)     // Catch:{ JSONException -> 0x0253 }
                                goto L_0x0143
                            L_0x0142:
                                r7 = r8
                            L_0x0143:
                                boolean r13 = r0.has(r15)     // Catch:{ JSONException -> 0x0253 }
                                if (r13 == 0) goto L_0x014d
                                java.lang.String r8 = r0.getString(r15)     // Catch:{ JSONException -> 0x0253 }
                            L_0x014d:
                                java.lang.String r13 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG     // Catch:{ JSONException -> 0x0253 }
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0253 }
                                r2.<init>()     // Catch:{ JSONException -> 0x0253 }
                                r18 = r14
                                java.lang.String r14 = "color_data : "
                                r2.append(r14)     // Catch:{ JSONException -> 0x024c }
                                r2.append(r7)     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r13, r2)     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                r2.put(r11, r7)     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                r2.put(r15, r8)     // Catch:{ JSONException -> 0x024c }
                                boolean r2 = r0.has(r12)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x01e1
                                org.json.JSONObject r2 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                boolean r2 = r2.has(r6)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x01a2
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r7 = "control_config"
                                org.json.JSONObject r8 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r6 = r8.getString(r6)     // Catch:{ JSONException -> 0x024c }
                                r2.put(r7, r6)     // Catch:{ JSONException -> 0x024c }
                            L_0x01a2:
                                org.json.JSONObject r2 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                boolean r2 = r2.has(r4)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x01c1
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r6 = "extra_config"
                                org.json.JSONObject r7 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r4 = r7.getString(r4)     // Catch:{ JSONException -> 0x024c }
                                r2.put(r6, r4)     // Catch:{ JSONException -> 0x024c }
                            L_0x01c1:
                                org.json.JSONObject r2 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                boolean r2 = r2.has(r3)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x01eb
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r4 = "cp_num"
                                org.json.JSONObject r6 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r3 = r6.getString(r3)     // Catch:{ JSONException -> 0x024c }
                                r2.put(r4, r3)     // Catch:{ JSONException -> 0x024c }
                                goto L_0x01eb
                            L_0x01e1:
                                java.lang.String r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG     // Catch:{ JSONException -> 0x024c }
                                java.lang.String r3 = "select_data not found or select_data.config not found"
                                com.tencent.youtu.sdkkitframework.common.YtLogger.m106579e(r2, r3)     // Catch:{ JSONException -> 0x024c }
                            L_0x01eb:
                                boolean r2 = r0.has(r5)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x0242
                                org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x024c }
                                boolean r2 = r0.has(r10)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x020e
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                int r3 = r0.getInt(r10)     // Catch:{ JSONException -> 0x024c }
                                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x024c }
                                r2.put(r10, r3)     // Catch:{ JSONException -> 0x024c }
                            L_0x020e:
                                boolean r2 = r0.has(r9)     // Catch:{ JSONException -> 0x024c }
                                if (r2 == 0) goto L_0x0227
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r2 = r2.stateData     // Catch:{ JSONException -> 0x024c }
                                int r3 = r0.getInt(r9)     // Catch:{ JSONException -> 0x024c }
                                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x024c }
                                r2.put(r9, r3)     // Catch:{ JSONException -> 0x024c }
                            L_0x0227:
                                r2 = r17
                                boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x024c }
                                if (r3 == 0) goto L_0x0242
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r3 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r3 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                java.util.HashMap r3 = r3.stateData     // Catch:{ JSONException -> 0x024c }
                                int r0 = r0.getInt(r2)     // Catch:{ JSONException -> 0x024c }
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x024c }
                                r3.put(r2, r0)     // Catch:{ JSONException -> 0x024c }
                            L_0x0242:
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3 r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.this     // Catch:{ JSONException -> 0x024c }
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this     // Catch:{ JSONException -> 0x024c }
                                r0.moveToNextState()     // Catch:{ JSONException -> 0x024c }
                                r15 = 0
                                goto L_0x010a
                            L_0x024c:
                                r0 = move-exception
                                goto L_0x0256
                            L_0x024e:
                                r18 = r14
                                r15 = 1
                                goto L_0x010a
                            L_0x0253:
                                r0 = move-exception
                                r18 = r14
                            L_0x0256:
                                java.lang.String r2 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                java.lang.String r4 = "parse response json other object failed:"
                                r3.append(r4)
                                java.lang.String r0 = r0.getLocalizedMessage()
                                r3.append(r0)
                                java.lang.String r0 = r3.toString()
                                com.tencent.youtu.sdkkitframework.common.YtLogger.m106579e(r2, r0)
                            L_0x0272:
                                if (r16 == 0) goto L_0x02a7
                                java.lang.String r0 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG
                                java.lang.String r2 = "parse response failed"
                                com.tencent.youtu.sdkkitframework.common.YtLogger.m106579e(r0, r2)
                                com.tencent.youtu.sdkkitframework.common.YtSDKStats r0 = com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance()
                                java.lang.String r2 = "server return failed"
                                r3 = 2097153(0x200001, float:2.938737E-39)
                                r0.reportError(r3, r2)
                                r3 = r20
                                r4 = r18
                                boolean r0 = r3.containsKey(r4)
                                if (r0 == 0) goto L_0x029b
                                java.lang.Object r0 = r3.get(r4)
                                r2 = r0
                                java.lang.String r2 = (java.lang.String) r2
                            L_0x029b:
                                com.tencent.youtu.sdkkitframework.framework.YtFSM r0 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
                                com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$3 r3 = new com.tencent.youtu.sdkkitframework.liveness.NetFetchState$3$1$3
                                r3.<init>(r2)
                                r0.sendFSMEvent(r3)
                            L_0x02a7:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.C203153.C203161.onNetworkResponseEvent(java.util.HashMap, java.lang.Exception):void");
                        }
                    });
                    return;
                }
                YtLogger.m106580i(NetFetchState.TAG, "Use local data");
                NetFetchState.this.stateData.put("color_data", NetFetchState.this.localColorData);
                NetFetchState.this.stateData.put("action_data", NetFetchState.this.actionSeqData);
                YtLogger.m106580i(NetFetchState.TAG, "select data:" + NetFetchState.this.selectData);
                if (NetFetchState.this.selectData != null) {
                    try {
                        if (NetFetchState.this.selectData.has("config")) {
                            NetFetchState.this.stateData.put("control_config", NetFetchState.this.selectData.getString("config"));
                        }
                        if (NetFetchState.this.selectData.has("reflect_param")) {
                            NetFetchState.this.stateData.put("extra_config", NetFetchState.this.selectData.getString("reflect_param"));
                        }
                        if (NetFetchState.this.selectData.has("change_point_num")) {
                            NetFetchState.this.stateData.put("cp_num", NetFetchState.this.selectData.getString("change_point_num"));
                        }
                    } catch (JSONException e) {
                        String str3 = "Select data parse failed " + e.getLocalizedMessage();
                        YtLogger.m106579e(NetFetchState.TAG, str3);
                        YtSDKStats.getInstance().reportInfo(str3);
                    }
                } else {
                    YtLogger.m106579e(NetFetchState.TAG, "select data is null");
                    YtSDKStats.getInstance().reportInfo("select data is null");
                }
                NetFetchState.this.moveToNextState();
            }
        });
    }

    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
            {
                put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_DATA);
            }
        });
        int i = C203214.f57033x75f35c10[YtFSM.getInstance().getWorkMode().ordinal()];
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
            onReflectRequest();
        }
    }

    public void enterFirst() {
    }

    public void exit() {
        super.exit();
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            String string = jSONObject.getString("app_id");
            this.appId = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.configUrl = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.localColorData = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.needLocalConfig = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.actionSeqData += jSONArray.getString(i);
                    if (i < jSONArray.length() - 1) {
                        this.actionSeqData += ",";
                    }
                }
            } else {
                this.actionSeqData = "0";
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
            if (jSONObject.has("select_data")) {
                this.selectData = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                this.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
        } catch (JSONException e) {
            YtLogger.m106579e(TAG, "Failed to parse json:" + e.getLocalizedMessage());
        }
    }

    public void moveToNextState() {
        super.moveToNextState();
        try {
            int i = C203214.f57033x75f35c10[YtFSM.getInstance().getWorkMode().ordinal()];
            if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                return;
            }
            String str = "Unknown work mode " + YtFSM.getInstance().getWorkMode();
            YtSDKStats.getInstance().reportError(4194304, str);
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(str) {
                public final /* synthetic */ String val$message;

                {
                    this.val$message = r5;
                    put("ui_error", 4194304);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, 4194304);
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(4194304, StringCode.MSG_PARAM_ERROR, r5));
                }
            });
        } catch (Exception e) {
            YtLogger.m106579e(TAG, "move to next stat failed " + e.getLocalizedMessage());
        }
    }

    public void reset() {
        super.reset();
    }

    public void unload() {
        super.unload();
    }
}
