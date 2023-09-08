package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionLivenessState extends YtFSMBaseState {
    /* access modifiers changed from: private */
    public static final String TAG = "ActionLivenessState";
    /* access modifiers changed from: private */
    public YTActRefData actReflectData;
    public int actReflectUXMode = 0;
    /* access modifiers changed from: private */
    public int actionContinuousFailedCount = 0;
    /* access modifiers changed from: private */
    public int actionCurrentIndex;
    /* access modifiers changed from: private */
    public String[] actionDataParsed;
    private YTPoseDetectInterface.PoseDetectOnFrame actionFrameHandler;
    /* access modifiers changed from: private */
    public int actionLiveType = 1;
    private int actionVideoShortenStrategy;
    private String anchorWidths;
    /* access modifiers changed from: private */
    public int codecSettingBitRate = 2097152;
    /* access modifiers changed from: private */
    public int codecSettingFrameRate = 30;
    /* access modifiers changed from: private */
    public int codecSettingiFrameInterval = 1;
    private int continuousDetectCount = 0;
    private String controlConfig = "";
    private int currentRotateState;
    /* access modifiers changed from: private */
    public String extraTips = "";
    private YTFaceTrack.FaceStatus[] faceStatus;
    /* access modifiers changed from: private */
    public String innerMp4Path = (Environment.getExternalStorageDirectory().getPath() + "/temp.mp4");
    /* access modifiers changed from: private */
    public boolean isActionFinished = false;
    private boolean isLoadResourceOnline = false;
    /* access modifiers changed from: private */
    public String legitimatePoseVersion = "3.5.4";
    private YTFaceTrackParam mOriginParam;
    private boolean needCheckMultiFaces = false;
    private boolean needLocalConfig = false;
    private boolean needManualTrigger = false;
    /* access modifiers changed from: private */
    public YtSDKKitCommon.StateNameHelper.StateClassName nextStateName;
    private int poseReadyCount = 0;
    private SilentLivenessState.FacePreviewingAdvise poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private int securityLevel = 1;
    private int stableCountNum = 5;
    /* access modifiers changed from: private */
    public YtVideoEncoder videoEncoder;

    public static /* synthetic */ int access$808(ActionLivenessState actionLivenessState) {
        int i = actionLivenessState.actionContinuousFailedCount;
        actionLivenessState.actionContinuousFailedCount = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public boolean changeToNextAction(String[] strArr, int i) {
        String str = TAG;
        YtLogger.m106580i(str, "currentIndex: " + i);
        if (strArr.length == 0) {
            return false;
        }
        this.actionCurrentIndex = i;
        if (i >= strArr.length) {
            return false;
        }
        int parseInt = Integer.parseInt(strArr[i]);
        if (parseInt == 0 || parseInt == 1) {
            this.actionLiveType = 1;
        } else if (parseInt == 2) {
            this.actionLiveType = 2;
        } else if (parseInt == 3) {
            this.actionLiveType = 3;
        } else if (parseInt == 4) {
            this.actionLiveType = 4;
        } else if (parseInt == 5) {
            this.actionLiveType = 5;
        }
        this.stateData.put("current_action_type", Integer.valueOf(parseInt));
        YtLogger.m106580i(str, "action check rounds: " + this.actionCurrentIndex + "start check pose: " + this.actionLiveType);
        YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", (Object) null);
        this.poseReadyCount = 0;
        return true;
    }

    private void clearData() {
        this.actionContinuousFailedCount = 0;
        this.isActionFinished = false;
        this.actionCurrentIndex = -1;
        this.poseReadyCount = 0;
        this.poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        changeToNextAction(this.actionDataParsed, -1 + 1);
        this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.videoEncoder.abortEncoding();
        startPose();
    }

    /* access modifiers changed from: private */
    public String getTipsByPoseType(int i) {
        if (i == 1) {
            return StringCode.FL_ACT_BLINK;
        }
        if (i == 2) {
            return StringCode.FL_ACT_OPEN_MOUTH;
        }
        if (i == 4) {
            return StringCode.FL_ACT_SHAKE_HEAD;
        }
        if (i == 3) {
            return StringCode.FL_ACT_NOD_HEAD;
        }
        if (i == 5) {
            return StringCode.FL_ACT_SILENCE;
        }
        return StringCode.FL_ACT_ERROR + i;
    }

    /* access modifiers changed from: private */
    public String makeActionStr(String[] strArr) {
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

    private void sendFSMEvent(HashMap<String, Object> hashMap) {
        YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    private void startPose() {
        this.actionFrameHandler = new YTPoseDetectInterface.PoseDetectOnFrame() {
            public void onCanReflect() {
                YTActRefData unused = ActionLivenessState.this.actReflectData = YTPoseDetectInterface.getActReflectData();
            }

            public void onFailed(int i, String str, String str2) {
                YtSDKStats instance = YtSDKStats.getInstance();
                instance.reportInfo("pose state " + i);
                String access$200 = ActionLivenessState.TAG;
                YtLogger.m106580i(access$200, "YTPoseDetectInterface.poseDetect.onFailed: " + i + " s: " + str);
                ActionLivenessState.access$808(ActionLivenessState.this);
                int unused = ActionLivenessState.this.actionContinuousFailedCount;
            }

            public void onRecordingDone(byte[][] bArr, int i, int i2) {
                YtLogger.m106580i(ActionLivenessState.TAG, "收到视频上传通知，帧数：" + bArr.length + " 每帧width：" + i + " 每帧height: " + i2);
                if (!ActionLivenessState.this.videoEncoder.isEncodingStarted()) {
                    YtLogger.m106580i(ActionLivenessState.TAG, "??Start encoder");
                    YtLogger.m106580i(ActionLivenessState.TAG, "codec info: rotatedWith: " + i + "rotatedHeight: " + i2 + " bitrate: " + ActionLivenessState.this.codecSettingBitRate + " framerate" + ActionLivenessState.this.codecSettingFrameRate + " iframeinterval" + ActionLivenessState.this.codecSettingiFrameInterval);
                    ActionLivenessState.this.videoEncoder.startEncoding(i, i2, new File(ActionLivenessState.this.innerMp4Path), ActionLivenessState.this.codecSettingBitRate, ActionLivenessState.this.codecSettingFrameRate, ActionLivenessState.this.codecSettingiFrameInterval);
                }
                YtLogger.m106580i(ActionLivenessState.TAG, "action framesize:" + bArr.length);
                for (byte[] yuvImage : bArr) {
                    YtLogger.m106580i(ActionLivenessState.TAG, "Rotate yuv size" + i + "x" + i2 + " rotate:" + YtFSM.getInstance().getContext().currentRotateState);
                    ActionLivenessState.this.videoEncoder.queueFrame(new YuvImage(yuvImage, 17, i, i2, (int[]) null));
                    try {
                        ActionLivenessState.this.videoEncoder.encode();
                    } catch (Exception e) {
                        YtLogger.m106579e(ActionLivenessState.TAG, "video encode dequeueOutputBuffer error:" + Log.getStackTraceString(e));
                        YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR, "video encode dequeueOutputBuffer error");
                        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                            {
                                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR));
                                put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_ACTION_ENCODE_VIDEO_ERROR, StringCode.MSG_ENCODE_VIDEO_ERROR, "video encode dequeueOutputBuffer error400102"));
                            }
                        });
                    }
                }
                if (!ActionLivenessState.this.isActionFinished) {
                    YTPoseDetectInterface.reset();
                    return;
                }
                ActionLivenessState.this.videoEncoder.stopEncoding();
                final byte[] bArr2 = null;
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(ActionLivenessState.this.innerMp4Path));
                    if (fileInputStream.available() != 0) {
                        bArr2 = new byte[fileInputStream.available()];
                    }
                    fileInputStream.read(bArr2);
                    fileInputStream.close();
                } catch (Exception e2) {
                    YtLogger.m106579e(ActionLivenessState.TAG, "Failed fetch action video " + e2.getLocalizedMessage());
                }
                ActionLivenessState.this.stateData.put("frames", bArr2);
                ActionLivenessState.this.stateData.put("mediacodec_color_format", Integer.valueOf(ActionLivenessState.this.videoEncoder.getColorFormat()));
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode workMode = YtFSM.getInstance().getWorkMode();
                YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
                if (workMode != ytSDKKitFrameworkWorkMode) {
                    YTPoseDetectInterface.getBestImage(new YTPoseDetectInterface.PoseDetectGetBestImage() {
                        public void onGetBestImage(byte[] bArr, int i, int i2) {
                            String access$200 = ActionLivenessState.TAG;
                            YtLogger.m106580i(access$200, "获取到最优图. width:" + i + " height: " + i2 + " bytes size: " + bArr.length);
                            new YuvImage(bArr, 17, i, i2, (int[]) null);
                            ActionLivenessState.this.stateData.put("best_frame", YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).getStateDataBy("best_image"));
                            long time = new Date().getTime();
                            ActionLivenessState actionLivenessState = ActionLivenessState.this;
                            ActionLivenessState.this.stateData.put("config", YTPoseDetectJNIInterface.getConfigData(bArr2, actionLivenessState.makeActionStr(actionLivenessState.actionDataParsed), YtSDKKitFramework.getInstance().version().split("-")[0], Long.toString(time)));
                            YtSDKKitCommon.StateNameHelper.StateClassName unused = ActionLivenessState.this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
                        }
                    }, true);
                } else if (YtFSM.getInstance().getWorkMode() == ytSDKKitFrameworkWorkMode) {
                    YTPoseDetectInterface.getBestImage(new YTPoseDetectInterface.PoseDetectGetBestImage() {
                        public void onGetBestImage(byte[] bArr, int i, int i2) {
                            String access$200 = ActionLivenessState.TAG;
                            YtLogger.m106580i(access$200, "获取到最优图. width:" + i + " height: " + i2 + " bytes size: " + bArr.length);
                            ActionLivenessState.this.stateData.put("best_frame", new YuvImage(bArr, 17, i, i2, (int[]) null));
                            ActionLivenessState.this.stateData.put("act_reflect_data", ActionLivenessState.this.actReflectData);
                            long time = new Date().getTime();
                            ActionLivenessState actionLivenessState = ActionLivenessState.this;
                            ActionLivenessState.this.stateData.put("config", YTPoseDetectJNIInterface.getConfigData(bArr2, actionLivenessState.makeActionStr(actionLivenessState.actionDataParsed), YtSDKKitFramework.getInstance().version().split("-")[0], Long.toString(time)));
                            YtSDKKitCommon.StateNameHelper.StateClassName unused = ActionLivenessState.this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
                        }
                    }, true);
                } else {
                    YtLogger.m106579e(ActionLivenessState.TAG, "unimplemented work mode " + YtFSM.getInstance().getWorkMode());
                }
            }

            public void onSuccess(int i) {
                String unused = ActionLivenessState.this.extraTips = "";
                if (i == 1) {
                    String access$200 = ActionLivenessState.TAG;
                    YtLogger.m106580i(access$200, "Detect pose with sequence " + ActionLivenessState.this.actionDataParsed.length);
                    ActionLivenessState actionLivenessState = ActionLivenessState.this;
                    if (actionLivenessState.changeToNextAction(actionLivenessState.actionDataParsed, ActionLivenessState.this.actionCurrentIndex + 1)) {
                        String access$2002 = ActionLivenessState.TAG;
                        YtLogger.m106580i(access$2002, "start check pose: " + ActionLivenessState.this.actionLiveType);
                    } else {
                        YtLogger.m106580i(ActionLivenessState.TAG, "action seq all done");
                        boolean unused2 = ActionLivenessState.this.isActionFinished = true;
                    }
                } else if (i == -4) {
                    String access$2003 = ActionLivenessState.TAG;
                    YtLogger.m106582w(access$2003, "Act failed " + i);
                    String unused3 = ActionLivenessState.this.extraTips = StringCode.FL_ACT_LIGHT_NOT_RIGHT;
                } else if (i == -5) {
                    String access$2004 = ActionLivenessState.TAG;
                    YtLogger.m106582w(access$2004, "Act failed " + i);
                    String unused4 = ActionLivenessState.this.extraTips = StringCode.FL_ACT_SCREEN_SHAKING;
                } else if (!(i == -1 || i == 0)) {
                    String access$2005 = ActionLivenessState.TAG;
                    YtLogger.m106582w(access$2005, "Act failed " + i);
                }
                YtSDKStats instance = YtSDKStats.getInstance();
                instance.reportInfo("pose state " + i);
            }
        };
        YTPoseDetectInterface.start(YtFSM.getInstance().getContext().currentAppContext, YtFSM.getInstance().getContext().currentCamera, YtFSM.getInstance().getContext().currentCameraId, new YTPoseDetectInterface.PoseDetectResult() {
            public void onFailed(int i, String str, String str2) {
                YtSDKStats.getInstance().reportError(i, "failed to init pose sdk");
                YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(i) {
                    public final /* synthetic */ int val$initR;

                    {
                        this.val$initR = r4;
                        put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                        put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
                        put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + r4));
                    }
                });
                YtSDKKitCommon.StateNameHelper.StateClassName unused = ActionLivenessState.this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
            }

            public void onSuccess() {
                YtLogger.m106580i(ActionLivenessState.TAG, "start success");
            }
        });
    }

    public void enter() {
        super.enter();
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.continuousDetectCount = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.faceStatus = (YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            this.poseState = (SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null && !this.needLocalConfig) {
                String str = (String) stateByName2.getStateDataBy("action_data");
                String str2 = TAG;
                YtLogger.m106580i(str2, "action data :" + str);
                String[] split = str.split(",");
                this.actionDataParsed = split;
                int length = split.length;
                int i = this.actionCurrentIndex;
                if (length > i) {
                    int parseInt = Integer.parseInt(split[i]);
                    if (parseInt == 0 || parseInt == 1) {
                        this.actionLiveType = 1;
                    } else if (parseInt == 2) {
                        this.actionLiveType = 2;
                    } else if (parseInt == 3) {
                        this.actionLiveType = 3;
                    } else if (parseInt == 4) {
                        this.actionLiveType = 4;
                    } else if (parseInt == 5) {
                        this.actionLiveType = 5;
                    }
                    this.stateData.put("current_action_type", Integer.valueOf(parseInt));
                }
            }
            if (this.actReflectUXMode == 1) {
                this.actionLiveType = 5;
                this.actionDataParsed = new String[]{WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY};
            }
            this.stateData.put("action_seq", this.actionDataParsed);
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                String[] split2 = YtSDKKitFramework.getInstance().version().split("-");
                String makeActionStr = NetLivenessReqResultState.makeActionStr(this.actionDataParsed);
                if (stateByName2 != null) {
                    YTPoseDetectJNIInterface.setColorData((String) stateByName2.getStateDataBy("color_data"), split2[0], makeActionStr);
                }
            }
        } catch (Exception e) {
            String str3 = TAG;
            YtLogger.m106579e(str3, "action enter failed " + e.getLocalizedMessage());
            CommonUtils.reportException("action enter failed ", e);
        }
    }

    public void enterFirst() {
        YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", (Object) null);
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName != null) {
            try {
                Object stateDataBy = stateByName.getStateDataBy("video_bitrate");
                if (stateDataBy != null) {
                    this.codecSettingBitRate = ((Integer) stateDataBy).intValue();
                }
                Object stateDataBy2 = stateByName.getStateDataBy("video_framerate");
                if (stateDataBy2 != null) {
                    this.codecSettingFrameRate = ((Integer) stateDataBy2).intValue();
                }
                Object stateDataBy3 = stateByName.getStateDataBy("video_iframeinterval");
                if (stateDataBy3 != null) {
                    this.codecSettingiFrameInterval = ((Integer) stateDataBy3).intValue();
                }
                String str = (String) stateByName.getStateDataBy("control_config");
                if (str != null) {
                    this.controlConfig = str;
                }
            } catch (Exception e) {
                YtLogger.m106579e(TAG, "action enter first failed:" + e.getLocalizedMessage());
            }
        }
        if (!TextUtils.isEmpty(this.controlConfig)) {
            String[] split = this.controlConfig.split("&");
            if (split.length > 0) {
                for (String split2 : split) {
                    String[] split3 = split2.split("=");
                    if (split3.length > 1 && split3[0].equals("actref_ux_mode")) {
                        this.actReflectUXMode = Integer.parseInt(split3[1]);
                    }
                    if (split3.length > 1 && split3[0].equals("action_video_shorten_strategy")) {
                        int parseInt = Integer.parseInt(split3[1]);
                        this.actionVideoShortenStrategy = parseInt;
                        YTPoseDetectJNIInterface.updateParam("action_video_shorten_strategy", String.valueOf(parseInt));
                    }
                }
            }
        }
        YTFaceTrackParam yTFaceTrackParam = this.mOriginParam;
        yTFaceTrackParam.detect_interval = 30;
        YTFaceTrack.getInstance().SetFaceTrackParam(yTFaceTrackParam);
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            clearData();
        }
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        super.loadStateWith(str, jSONObject);
        YtFSM.getInstance().getContext().currentAppContext.getFilesDir().getAbsolutePath();
        try {
            if (jSONObject2.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject2.getBoolean("resource_online");
            }
            if (jSONObject2.has("video_path")) {
                this.innerMp4Path = jSONObject2.getString("video_path");
            }
            if (jSONObject2.has("local_config_flag")) {
                this.needLocalConfig = jSONObject2.getBoolean("local_config_flag");
            }
            if (jSONObject2.has("video_bitrate")) {
                this.codecSettingBitRate = jSONObject2.getInt("video_bitrate");
            }
            if (jSONObject2.has("video_framerate")) {
                this.codecSettingFrameRate = jSONObject2.getInt("video_framerate");
            }
            if (jSONObject2.has("video_iframeinterval")) {
                this.codecSettingiFrameInterval = jSONObject2.getInt("video_iframeinterval");
            }
            if (jSONObject2.has("manual_trigger")) {
                this.needManualTrigger = jSONObject2.getBoolean("manual_trigger");
            }
            if (jSONObject2.has("stable_frame_num")) {
                this.stableCountNum = jSONObject2.getInt("stable_frame_num");
            }
            if (jSONObject2.has("control_config")) {
                this.controlConfig = jSONObject2.getString("control_config");
            }
            this.needCheckMultiFaces = jSONObject2.optBoolean("need_check_multiface", false);
            this.anchorWidths = jSONObject2.optString("anchor_widths", "480,240,240");
        } catch (JSONException e) {
            String str2 = TAG;
            YtLogger.m106579e(str2, "action load failed1:" + e.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            FileUtils.loadLibrary("YTPoseDetect");
        }
        String version = YTPoseDetectJNIInterface.getVersion();
        String str3 = TAG;
        YtLogger.m106580i(str3, "YTPose Version: " + version);
        String[] split = version.split("\\.");
        String str4 = this.legitimatePoseVersion;
        YtLogger.m106580i(str3, "Wanted YTPose Version: " + str4);
        String[] split2 = str4.split("\\.");
        if (Integer.parseInt(split[0]) != Integer.parseInt(split2[0])) {
            sendFSMEvent(new HashMap<String, Object>(version) {
                public final /* synthetic */ String val$realVersion;

                {
                    this.val$realVersion = r4;
                    put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.legitimatePoseVersion + " 当前版本：" + r4);
                }
            });
        } else if (Integer.parseInt(split[1]) != Integer.parseInt(split2[1])) {
            sendFSMEvent(new HashMap<String, Object>(version) {
                public final /* synthetic */ String val$realVersion;

                {
                    this.val$realVersion = r4;
                    put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.legitimatePoseVersion + " 当前版本：" + r4);
                }
            });
        } else if (Integer.parseInt(split[2]) < Integer.parseInt(split2[2])) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(version) {
                public final /* synthetic */ String val$realVersion;

                {
                    this.val$realVersion = r4;
                    put(StateEvent.Name.WARNING_TIPS, "动作库版本过低！目标版本：" + ActionLivenessState.this.legitimatePoseVersion + " 当前版本：" + r4);
                }
            });
        }
        int initModel = YTPoseDetectInterface.initModel();
        if (initModel != 0) {
            YtLogger.m106579e(str3, "action load failed2: " + initModel);
            YtSDKStats.getInstance().reportError(initModel, "failed to init pose sdk");
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(initModel) {
                public final /* synthetic */ int val$initR;

                {
                    this.val$initR = r4;
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + r4));
                }
            });
            return;
        }
        this.continuousDetectCount = 0;
        this.stateData.put("action_type", Integer.valueOf(this.actionLiveType));
        try {
            if (jSONObject2.has("action_security_level")) {
                this.securityLevel = jSONObject2.getInt("action_security_level");
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("action_default_seq");
            if (jSONArray == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
                return;
            }
            this.actionDataParsed = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.actionDataParsed[i] = jSONArray.getString(i);
            }
            String str5 = TAG;
            YtLogger.m106580i(str5, "load action sequence from sdkconfig " + jSONObject2.getString("action_default_seq") + " size :" + this.actionDataParsed.length);
            try {
                if (jSONObject2.has("action_inner_settings")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("action_inner_settings");
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        YTPoseDetectJNIInterface.updateParam(next, jSONObject3.getString(next));
                    }
                }
            } catch (JSONException e2) {
                String str6 = TAG;
                YtLogger.m106580i(str6, "action load failed4: " + e2.getLocalizedMessage());
            }
            YTPoseDetectJNIInterface.configNativeLog(true);
            YTPoseDetectJNIInterface.updateParam("log_level", "3");
            YTPoseDetectJNIInterface.updateParam("anchor_widths", this.anchorWidths);
            YTPoseDetectJNIInterface.setLoggerListener(new YTPoseDetectJNIInterface.IYtLoggerListener() {
                public void log(String str, String str2) {
                    YtLogger.m106580i(str, str2);
                }
            });
            this.currentRotateState = YtFSM.getInstance().getContext().currentRotateState;
            this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            this.videoEncoder = new YtVideoEncoder((YtVideoEncoder.IYUVToVideoEncoderCallback) null, true);
            this.mOriginParam = YTFaceTrack.getInstance().GetFaceTrackParam();
            YTPoseDetectJNIInterface.setSafetyLevel(this.securityLevel);
            reset();
        } catch (JSONException e3) {
            String str7 = TAG;
            YtLogger.m106579e(str7, "action load failed3: " + e3.getLocalizedMessage());
            this.actionDataParsed = "0".split(" ");
        }
    }

    public void moveToNextState() {
        super.moveToNextState();
        if (this.nextStateName == YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
            return;
        }
        YTFaceTrack.getInstance().SetFaceTrackParam(this.mOriginParam);
        YTPoseDetectInterface.stop();
        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
    }

    public void reset() {
        clearData();
        super.reset();
    }

    public void unload() {
        super.unload();
        if (YTPoseDetectInterface.isDetecting()) {
            YTPoseDetectInterface.stop();
        }
        YTPoseDetectInterface.releaseModel();
        YtVideoEncoder ytVideoEncoder = this.videoEncoder;
        if (ytVideoEncoder != null) {
            ytVideoEncoder.abortEncoding();
            this.videoEncoder = null;
        }
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        int i4;
        super.update(bArr, i, i2, i3, j);
        YTFaceTrack.FaceStatus[] faceStatusArr = this.faceStatus;
        if (faceStatusArr != null && faceStatusArr.length > 0 && (i4 = this.continuousDetectCount) > 0) {
            if (i4 <= 1 || (this.needCheckMultiFaces && faceStatusArr.length > 1)) {
                this.poseReadyCount = this.stableCountNum;
                YTPoseDetectInterface.reset();
            }
            if (this.actionFrameHandler == null) {
                YtLogger.m106579e(TAG, "FrameHandle is null, check init first");
                return;
            }
            if (this.poseReadyCount > this.stableCountNum + 10 && !this.isActionFinished) {
                sendFSMEvent(new HashMap<String, Object>() {
                    {
                        put(StateEvent.Name.UI_EXTRA_TIPS, ActionLivenessState.this.extraTips);
                        put(StateEvent.Name.UI_TIPS, ActionLivenessState.this.getTipsByPoseType(ActionLivenessState.this.actionLiveType));
                        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_PASS);
                    }
                });
            }
            this.poseReadyCount++;
            YTFaceTrack.FaceStatus faceStatus2 = this.faceStatus[0];
            float[] fArr = faceStatus2.xys;
            float[] fArr2 = faceStatus2.pointsVis;
            int i5 = this.actionLiveType;
            Camera camera = YtFSM.getInstance().getContext().currentCamera;
            YTFaceTrack.FaceStatus faceStatus3 = this.faceStatus[0];
            YTPoseDetectInterface.poseDetect(fArr, fArr2, i5, bArr, camera, faceStatus3.pitch, faceStatus3.yaw, faceStatus3.roll, this.actionFrameHandler, 1);
        }
        moveToNextState();
    }
}
