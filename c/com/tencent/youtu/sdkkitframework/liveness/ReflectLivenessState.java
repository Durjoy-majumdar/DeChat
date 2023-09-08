package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.util.Base64;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.TimeoutCounter;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectData;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.DataPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ReflectLivenessState extends YtFSMBaseState {
    /* access modifiers changed from: private */
    public static final String TAG = "ReflectLivenessState";
    private YTActRefData actRefData;
    private int actReflectUXMode = 0;
    private String appId;
    private int backendProtoType = 0;
    private int changePointNum = 2;
    private String colorData;
    private int continuousDetectCount = 0;
    private String controlConfig = "";
    private ReflectProcessType currentProcessType = ReflectProcessType.RPT_TIPWAIT;
    private String extraConfig = "";
    private YTFaceTrack.FaceStatus[] faceStatus;
    private boolean isLoadResourceOnline = false;
    /* access modifiers changed from: private */
    public String legitimateReflectVersion = "3.6.9.1";
    private YTFaceTrackParam mOriginParam;
    /* access modifiers changed from: private */
    public boolean needCheckFaces = true;
    private boolean needCheckMultiFaces = false;
    private boolean needCheckPose = false;
    private boolean needLocalConfig = false;
    private boolean needManualTrigger = false;
    private boolean needRandom = false;
    private YtSDKKitCommon.StateNameHelper.StateClassName nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
    private SilentLivenessState.FacePreviewingAdvise poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private String randomColorData;
    public int reflectImagesShortenStrategy;
    private int securityLevel = 2;
    private LiveStyleRequester.SeleceData seleceData;
    private int simiThreshold = 70;
    private int stableFrameCount = 5;
    private TimeoutCounter tipsTimer = new TimeoutCounter("reflect tips timeout counter");

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$12 */
    public static /* synthetic */ class C2033712 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType */
        public static final /* synthetic */ int[] f57037xd42c1e46;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType[] r0 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57037xd42c1e46 = r0
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType r1 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_TIPWAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57037xd42c1e46     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType r1 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57037xd42c1e46     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType r1 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_REFLECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57037xd42c1e46     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$ReflectProcessType r1 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_FINISH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.C2033712.<clinit>():void");
        }
    }

    public enum ReflectProcessType {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    private void clearData() {
        this.currentProcessType = ReflectProcessType.RPT_TIPWAIT;
        this.continuousDetectCount = 0;
        this.poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        this.needCheckFaces = true;
        YTAGReflectLiveCheckInterface.cancel();
        this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
    }

    private ActionReflectReq getActionReflectLiveReq(FullPack fullPack, YTActReflectData yTActReflectData, String str) {
        ActionReflectReq actionReflectReq = new ActionReflectReq();
        actionReflectReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
        actionReflectReq.color_data = str;
        actionReflectReq.platform = 2;
        actionReflectReq.select_data = yTActReflectData.select_data;
        if (fullPack != null) {
            actionReflectReq.reflect_data = translation(fullPack.AGin);
        }
        actionReflectReq.live_image = new YTImageInfo(yTActReflectData.best);
        actionReflectReq.eye_image = new YTImageInfo(yTActReflectData.eye);
        actionReflectReq.mouth_image = new YTImageInfo(yTActReflectData.mouth);
        actionReflectReq.compare_image = null;
        actionReflectReq.mode = 0;
        actionReflectReq.session_id = null;
        return actionReflectReq;
    }

    private ReflectLiveReq getReflectLiveReq(FullPack fullPack, String str) {
        ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
        reflectLiveReq.color_data = str;
        reflectLiveReq.platform = 2;
        if (fullPack != null) {
            reflectLiveReq.reflect_data = translation(fullPack.AGin);
            reflectLiveReq.live_image = null;
        }
        reflectLiveReq.compare_image = null;
        reflectLiveReq.session_id = null;
        reflectLiveReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
        return reflectLiveReq;
    }

    /* access modifiers changed from: private */
    public void handleFailure(int i, String str, String str2) {
        String str3 = TAG;
        YtLogger.m106579e(str3, "failed :" + ("message:" + str + "\ntips:" + str2 + "\ncode:" + i));
        String convertAdvise = SilentLivenessState.convertAdvise(this.poseState);
        String makeMessageJson = CommonUtils.makeMessageJson(4194304, convertAdvise, str);
        YtSDKStats.getInstance().reportError(i, convertAdvise);
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        hashMap.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        hashMap.put(StateEvent.Name.ERROR_CODE, 4194304);
        hashMap.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i));
        hashMap.put(StateEvent.Name.MESSAGE, makeMessageJson);
        YtFSM.getInstance().sendFSMEvent(hashMap);
        this.currentProcessType = ReflectProcessType.RPT_FINISH;
    }

    /* access modifiers changed from: private */
    public void handleSuccess(FullPack fullPack) {
        if (this.currentProcessType != ReflectProcessType.RPT_TIPWAIT) {
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                try {
                    YTActRefImage yTActRefImage = this.actRefData.best;
                    YTActReflectImage yTActReflectImage = new YTActReflectImage(yTActRefImage.image, yTActRefImage.xys, yTActRefImage.checksum);
                    YTActRefImage yTActRefImage2 = this.actRefData.eye;
                    YTActReflectImage yTActReflectImage2 = new YTActReflectImage(yTActRefImage2.image, yTActRefImage2.xys, yTActRefImage2.checksum);
                    YTActRefImage yTActRefImage3 = this.actRefData.mouth;
                    ActionReflectReq actionReflectLiveReq = getActionReflectLiveReq(fullPack, new YTActReflectData(yTActReflectImage, yTActReflectImage2, new YTActReflectImage(yTActRefImage3.image, yTActRefImage3.xys, yTActRefImage3.checksum), this.seleceData), this.colorData);
                    actionReflectLiveReq.app_id = this.appId;
                    Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int i = width > height ? width : height;
                        if (i > 640) {
                            bitmap = imageScale(bitmap, (width * 640) / i, (height * 640) / i);
                            String str = TAG;
                            YtLogger.m106580i(str, "resize image. from w:" + width + " h:" + height + " to w:" + bitmap.getWidth() + " h:" + bitmap.getHeight());
                        }
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                        actionReflectLiveReq.compare_image = new YTImageInfo(new YTActReflectImage(byteArrayOutputStream.toByteArray(), (float[]) null, (String) null));
                    }
                    actionReflectLiveReq.color_data = this.colorData;
                    this.stateData.put("reflect_request_object", actionReflectLiveReq);
                } catch (Exception e) {
                    String str2 = TAG;
                    YtLogger.m106579e(str2, "handle success failed: " + e.getLocalizedMessage());
                }
            } else {
                ReflectLiveReq reflectLiveReq = getReflectLiveReq(fullPack, this.colorData);
                Bitmap bitmap2 = YtFSM.getInstance().getContext().imageToCompare;
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    int width2 = bitmap2.getWidth();
                    int height2 = bitmap2.getHeight();
                    int i2 = width2 > height2 ? width2 : height2;
                    if (i2 > 640) {
                        bitmap2 = imageScale(bitmap2, (width2 * 640) / i2, (height2 * 640) / i2);
                        String str3 = TAG;
                        YtLogger.m106580i(str3, "resize image. from w:" + width2 + " h:" + height2 + " to w:" + bitmap2.getWidth() + " h:" + bitmap2.getHeight());
                    }
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                    reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
                }
                YtLogger.m106580i(TAG, "on Request...");
                reflectLiveReq.color_data = this.colorData;
                reflectLiveReq.select_data = this.seleceData;
                this.stateData.put("reflect_request_object", reflectLiveReq);
            }
            this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
        }
    }

    private static Bitmap imageScale(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private void setupRequset() {
    }

    private void startReflect() {
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
            {
                put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
            }
        });
        YTFaceTrackParam yTFaceTrackParam = this.mOriginParam;
        String str = TAG;
        YtLogger.m106580i(str, "param: " + yTFaceTrackParam);
        yTFaceTrackParam.detect_interval = -1;
        YTFaceTrack.getInstance().SetFaceTrackParam(yTFaceTrackParam);
        this.currentProcessType = ReflectProcessType.RPT_REFLECT;
        setupRequset();
        YTAGReflectSettings aGSettings = YTAGReflectLiveCheckInterface.getAGSettings();
        aGSettings.safetylevel = this.securityLevel;
        boolean z = false;
        aGSettings.isEncodeReflectData = false;
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            z = true;
        }
        aGSettings.isActionReflect = z;
        YTAGReflectLiveCheckInterface.setAGSettings(aGSettings);
        YtLogger.m106580i(str, "Settings: safetyLevel " + aGSettings.safetylevel);
        YtLogger.m106580i(str, "Settings: isEncodeReflectData " + aGSettings.isEncodeReflectData);
        YtLogger.m106580i(str, "Settings: isActionReflect " + aGSettings.isActionReflect);
        YtSDKKitFramework.YtSDKPlatformContext context = YtFSM.getInstance().getContext();
        YTAGReflectLiveCheckInterface.start(context.currentAppContext, context.currentCamera, context.currentCameraId, this.colorData, new YTAGReflectLiveCheckInterface.LightLiveCheckResult() {
            public void onFailed(int i, String str, String str2) {
                ReflectLivenessState.this.handleFailure(i, str, str2);
            }

            public void onSuccess(FullPack fullPack) {
                YtLogger.m106580i(ReflectLivenessState.TAG, "on start succeed!!!!!");
                ReflectLivenessState.this.handleSuccess(fullPack);
            }
        });
    }

    private ReflectColorData translation(DataPack dataPack) {
        String str = TAG;
        YtLogger.m106578d(str, "translation reflectImagesShortenStrategy：" + this.reflectImagesShortenStrategy);
        int i = 0;
        if (this.reflectImagesShortenStrategy == 1) {
            int i2 = 0;
            while (true) {
                RawImgData[] rawImgDataArr = dataPack.videoData;
                if (i2 >= rawImgDataArr.length) {
                    break;
                }
                if (i2 > 2 && i2 < rawImgDataArr.length - 2 && i2 % 2 != 0) {
                    rawImgDataArr[i2].frameBuffer = new byte[0];
                }
                i2++;
            }
        }
        ReflectColorData reflectColorData = new ReflectColorData();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            RawImgData[] rawImgDataArr2 = dataPack.videoData;
            if (i3 >= rawImgDataArr2.length) {
                break;
            }
            arrayList.add(translation(rawImgDataArr2[i3]));
            i3++;
        }
        reflectColorData.setImages_data(arrayList);
        reflectColorData.setBegin_time(dataPack.beginTime);
        reflectColorData.setChangepoint_time(dataPack.changePointTime);
        reflectColorData.changepoint_time_list = new ArrayList<>();
        while (true) {
            long[] jArr = dataPack.changePointTimeList;
            if (i >= jArr.length) {
                break;
            }
            reflectColorData.changepoint_time_list.add(Long.valueOf(jArr[i]));
            i++;
        }
        reflectColorData.setOffset_sys(dataPack.offsetSys);
        reflectColorData.setFrame_num(dataPack.frameNum);
        reflectColorData.setLandmark_num(dataPack.landMarkNum);
        reflectColorData.setWidth(dataPack.width);
        reflectColorData.setHeight(dataPack.height);
        reflectColorData.version = YTAGReflectLiveCheckInterface.VERSION;
        try {
            reflectColorData.setLog(new String(dataPack.log, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        reflectColorData.setConfig_begin(dataPack.config_begin);
        return reflectColorData;
    }

    public void enter() {
        YTFaceTrack.FaceStatus[] faceStatusArr;
        super.enter();
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.poseState = (SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
            this.continuousDetectCount = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.faceStatus = (YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                this.seleceData = (LiveStyleRequester.SeleceData) stateByName2.getStateDataBy("select_data");
                if (!this.needLocalConfig) {
                    this.colorData = (String) stateByName2.getStateDataBy("color_data");
                } else if (this.needRandom) {
                    this.colorData = this.randomColorData;
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.controlConfig = str;
                }
            }
            if (!this.controlConfig.isEmpty()) {
                String[] split = this.controlConfig.split("&");
                if (split.length > 0) {
                    for (String split2 : split) {
                        String[] split3 = split2.split("=");
                        if (split3.length > 1 && split3[0].equals("actref_ux_mode")) {
                            this.actReflectUXMode = Integer.parseInt(split3[1]);
                        }
                        if (split3.length > 1 && split3[0].equals("reflect_images_shorten_strategy")) {
                            this.reflectImagesShortenStrategy = Integer.parseInt(split3[1]);
                        }
                    }
                }
            }
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName3 != null) {
                this.actRefData = (YTActRefData) stateByName3.getStateDataBy("act_reflect_data");
            }
            if (this.continuousDetectCount > this.stableFrameCount && this.poseState == SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS && (faceStatusArr = this.faceStatus) != null && faceStatusArr.length > 0) {
                YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                    {
                        put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
                    }
                });
            }
            if (this.actReflectUXMode == 2) {
                this.currentProcessType = ReflectProcessType.RPT_FINISH;
                handleSuccess((FullPack) null);
            }
        } catch (Exception e) {
            YtLogger.m106579e(TAG, "reflection enter failed " + e.getLocalizedMessage());
            CommonUtils.reportException("reflection enter failed ", e);
        }
    }

    public void enterFirst() {
        YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", (Object) null);
        this.tipsTimer.reset();
        YtFSM.getInstance().cleanUpQueue();
    }

    public void exit() {
        super.exit();
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            clearData();
        }
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = "need_random_flag";
        super.loadStateWith(str, jSONObject);
        String str3 = "change_point_num";
        try {
            if (jSONObject2.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject2.getBoolean("resource_online");
            }
            if (jSONObject2.has("similarity_threshold")) {
                this.simiThreshold = jSONObject2.getInt("similarity_threshold");
            } else {
                this.simiThreshold = 70;
            }
            if (jSONObject2.has("reflect_security_level")) {
                this.securityLevel = jSONObject2.getInt("reflect_security_level");
            }
            if (jSONObject2.has("local_config_flag")) {
                this.needLocalConfig = jSONObject2.getBoolean("local_config_flag");
            }
            if (jSONObject2.has("color_data")) {
                this.colorData = jSONObject2.getString("color_data");
            }
            if (jSONObject2.has("stable_frame_num")) {
                this.stableFrameCount = jSONObject2.getInt("stable_frame_num");
            }
            if (jSONObject2.has("backend_proto_type")) {
                this.backendProtoType = jSONObject2.getInt("backend_proto_type");
            }
            if (jSONObject2.has("force_pose_check")) {
                this.needCheckPose = jSONObject2.getBoolean("force_pose_check");
            }
            if (jSONObject2.has("manual_trigger")) {
                this.needManualTrigger = jSONObject2.getBoolean("manual_trigger");
            }
            if (jSONObject2.has("reflect_tips_countdown_ms")) {
                this.tipsTimer.init((long) Math.max(0, Math.min(10000, jSONObject2.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject2.has("control_config")) {
                this.controlConfig = jSONObject2.getString("control_config");
            }
        } catch (JSONException e) {
            String str4 = TAG;
            YtLogger.m106579e(str4, "Failed to parse json:" + e.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            FileUtils.loadLibrary("YTAGReflectLiveCheck");
        }
        String str5 = TAG;
        YtLogger.m106580i(str5, "Reflection version:3.6.9.2");
        String[] split = YTAGReflectLiveCheckInterface.VERSION.split("\\.");
        String str6 = this.legitimateReflectVersion;
        YtLogger.m106580i(str5, "Wanted Reflection Version: " + str6);
        String[] split2 = str6.split("\\.");
        if (Integer.parseInt(split[0]) != Integer.parseInt(split2[0])) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：" + YTAGReflectLiveCheckInterface.VERSION);
                }
            });
        } else if (Integer.parseInt(split[1]) != Integer.parseInt(split2[1])) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：" + YTAGReflectLiveCheckInterface.VERSION);
                }
            });
        } else if (Integer.parseInt(split[2]) < Integer.parseInt(split2[2])) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.WARNING_TIPS, "反光库版本过低！目标版本：" + ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：" + YTAGReflectLiveCheckInterface.VERSION);
                }
            });
        }
        try {
            this.appId = jSONObject2.getString("app_id");
            if (jSONObject2.has("extra_config")) {
                this.extraConfig = jSONObject2.getString("extra_config");
            }
            String str7 = str3;
            if (jSONObject2.has(str7)) {
                this.changePointNum = jSONObject2.getInt(str7);
            }
            String str8 = str2;
            if (jSONObject2.has(str8)) {
                this.needRandom = jSONObject2.getBoolean(str8);
            }
            this.needCheckMultiFaces = jSONObject2.optBoolean("need_check_multiface", false);
        } catch (JSONException e2) {
            String str9 = TAG;
            YtLogger.m106579e(str9, "Failed to parse json:" + e2.getLocalizedMessage());
        }
        int initModel = YTAGReflectLiveCheckInterface.initModel(this.appId, YtSDKKitFramework.getInstance().version().split("-")[0]);
        if (initModel != 0) {
            String str10 = TAG;
            YtLogger.m106579e(str10, "failed to init reflect sdk " + initModel);
            YtSDKStats.getInstance().reportError(initModel, "failed to init reflect sdk");
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(initModel) {
                public final /* synthetic */ int val$initR;

                {
                    this.val$initR = r4;
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECT_INIT_FAILED));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTReflect SDK failed with " + r4));
                }
            });
        }
        this.mOriginParam = YTFaceTrack.getInstance().GetFaceTrackParam();
        String str11 = TAG;
        YtLogger.m106580i(str11, "mOriginParam: " + this.mOriginParam);
        if (this.needRandom) {
            this.randomColorData = YTAGReflectLiveCheckJNIInterface.FRGenConfigData(this.changePointNum, this.extraConfig);
        }
        YTAGReflectLiveCheckInterface.setReflectNotice(new YTReflectNotice() {
            public void onDelayCalc() {
                boolean unused = ReflectLivenessState.this.needCheckFaces = false;
            }
        });
        if (YtFSM.getInstance().getContext().reflectListener != null) {
            YTAGReflectLiveCheckInterface.setReflectListener(new YTAGReflectLiveCheckInterface.IYTReflectListener() {
                public float onGetAppBrightness() {
                    try {
                        return YtFSM.getInstance().getContext().reflectListener.onGetAppBrightness();
                    } catch (Exception e) {
                        YtLogger.m106579e(ReflectLivenessState.TAG, e.getLocalizedMessage());
                        return -1.0f;
                    }
                }

                public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
                    try {
                        if (!ReflectLivenessState.this.stateData.containsKey("refcontrol_begin")) {
                            ReflectLivenessState.this.stateData.put("refcontrol_begin", String.valueOf(System.currentTimeMillis() * 1000));
                        }
                        YtFSM.getInstance().getContext().reflectListener.onReflectEvent(colorMatrixColorFilter, f);
                    } catch (Exception e) {
                        YtLogger.m106579e(ReflectLivenessState.TAG, e.getLocalizedMessage());
                    }
                }

                public void onReflectStart(long j) {
                    try {
                        YtFSM.getInstance().getContext().reflectListener.onReflectStart(j);
                    } catch (Exception e) {
                        YtLogger.m106579e(ReflectLivenessState.TAG, e.getLocalizedMessage());
                    }
                }
            });
        } else {
            YTAGReflectLiveCheckInterface.setReflectListener((YTAGReflectLiveCheckInterface.IYTReflectListener) null);
        }
        YTAGReflectLiveCheckJNIInterface.configNativeLog(true);
        YTAGReflectLiveCheckJNIInterface.updateParam("log_level", "3");
        YTAGReflectLiveCheckJNIInterface.setLoggerListener(new YTAGReflectLiveCheckJNIInterface.IYtLoggerListener() {
            public void log(String str, String str2) {
                YtLogger.m106580i(str, str2);
            }
        });
    }

    public void moveToNextState() {
        super.moveToNextState();
        if (this.nextStateName == YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
            return;
        }
        YTFaceTrack.getInstance().SetFaceTrackParam(this.mOriginParam);
        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void reset() {
        clearData();
        super.reset();
    }

    public void unload() {
        super.unload();
        YTAGReflectLiveCheckInterface.cancel();
        YTAGReflectLiveCheckInterface.releaseModel();
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise;
        YTFaceTrack.FaceStatus[] faceStatusArr;
        SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise2;
        super.update(bArr, i, i2, i3, j);
        int i4 = C2033712.f57037xd42c1e46[this.currentProcessType.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 == 2) {
                if (this.continuousDetectCount > this.stableFrameCount && (((facePreviewingAdvise = this.poseState) == SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && (faceStatusArr = this.faceStatus) != null && faceStatusArr.length > 0)) {
                    startReflect();
                }
                this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (i4 == 3) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("reflect continuous_detect_count ");
                sb.append(this.continuousDetectCount);
                sb.append("pass flag ");
                SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise3 = this.poseState;
                SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise4 = SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS;
                if (facePreviewingAdvise3 == facePreviewingAdvise4) {
                    z = false;
                }
                sb.append(z);
                YtLogger.m106580i(str, sb.toString());
                YtLogger.m106580i(str, "reflect pose state " + this.poseState);
                if (this.needCheckFaces && (!(!this.needCheckPose || (facePreviewingAdvise2 = this.poseState) == facePreviewingAdvise4 || facePreviewingAdvise2 == SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) || ((this.needCheckMultiFaces && this.poseState == SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE) || this.poseState == SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE))) {
                    YtLogger.m106580i(str, "reflect cancel:" + this.continuousDetectCount);
                    YTAGReflectLiveCheckInterface.cancel();
                    handleFailure(-1, "检测异常", "请保持姿态");
                }
                if (this.faceStatus != null) {
                    int i5 = YtFSM.getInstance().getContext().currentRotateState;
                    YTFaceTrack.FaceStatus faceStatus2 = this.faceStatus[0];
                    YTAGReflectLiveCheckInterface.pushImageData(bArr, i, i2, j, i5, faceStatus2.xys, faceStatus2.pitch, faceStatus2.yaw, faceStatus2.roll);
                }
            }
        } else if (!this.tipsTimer.isRunning() || this.tipsTimer.checkTimeout()) {
            this.tipsTimer.cancel();
            this.currentProcessType = ReflectProcessType.RPT_INIT;
        } else if (this.continuousDetectCount <= 1) {
            this.tipsTimer.reset();
        } else {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.UI_TIPS, StringCode.FL_REFLECT_PREPARE);
                }
            });
        }
        moveToNextState();
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            this.needCheckPose = jSONObject.optBoolean("force_pose_check", this.needCheckPose);
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", this.needCheckMultiFaces);
        } catch (Exception e) {
            YtLogger.m106579e(TAG, e.getLocalizedMessage());
        }
    }

    private ColorImgData translation(RawImgData rawImgData) {
        ColorImgData colorImgData = new ColorImgData();
        colorImgData.setImage(new String(Base64.encode(rawImgData.frameBuffer, 2)));
        colorImgData.checksum = rawImgData.checksum;
        colorImgData.setCapture_time(rawImgData.captureTime);
        colorImgData.setX(rawImgData.f57040x);
        colorImgData.setY(rawImgData.f57041y);
        return colorImgData;
    }
}
