package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Environment;
import com.tencent.youtu.lipreader.jni.YTLipReader;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LipReadLivenessState extends YtFSMBaseState {
    private static final String TAG = "LipReadLivenessState";
    private String[] actionDataParsed;
    private int audioBitRate = 64000;
    private int audioSampleRate = 44100;
    private int backendProtoType = 0;
    public long beginTimeMs;
    private YTFaceTrack.FaceStatus bestFaceStatus;
    private YuvImage bestFrame;
    private boolean canTransit;
    private int codecSettingBitRate = 2097152;
    private int codecSettingFrameRate = 30;
    private int codecSettingiFrameInterval = 1;
    private int continuousDetectCount = 0;
    private int currentRotateState = YtFSM.getInstance().getContext().currentRotateState;
    public long endTimeMs;
    private YTFaceTrack.FaceStatus[] faceStatus;
    private String innerAudioPath = (Environment.getExternalStorageDirectory().getPath() + "/tmpaudio.spx");
    private String innerMp4Path = (Environment.getExternalStorageDirectory().getPath() + "/lipreadtemp.mp4");
    private boolean isFinished;
    private boolean isLoadResourceOnline = false;
    private YuvImage lastFrame;
    private boolean needCheckMultiFaces = false;
    private boolean needCheckPose = true;
    private boolean needManualTrigger = false;
    private YtSDKKitCommon.StateNameHelper.StateClassName nextStateName;
    private int numIntervalMs = 1000;
    private SilentLivenessState.FacePreviewingAdvise poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private YtVideoEncoder videoEncoder;
    public YTLipReader ytLipReader;

    public class BestFrame {
        public float eyeScore;
        public float[] f5p;
        public YuvImage frame;
        public float pitch;
        public float roll;
        public float yaw;

        public BestFrame() {
        }
    }

    private void clearData() {
        YtVideoEncoder ytVideoEncoder;
        this.isFinished = false;
        this.canTransit = false;
        this.poseState = SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        if (!(this.backendProtoType == 2 || (ytVideoEncoder = this.videoEncoder) == null)) {
            ytVideoEncoder.abortEncoding();
            this.videoEncoder = null;
        }
        YTLipReader yTLipReader = this.ytLipReader;
        if (yTLipReader != null) {
            yTLipReader.reset();
        }
    }

    private void sendCancelFailEvent() {
        String convertAdvise = SilentLivenessState.convertAdvise(this.poseState);
        String makeMessageJson = CommonUtils.makeMessageJson(4194304, convertAdvise, "LipRead check failed");
        YtSDKStats.getInstance().reportError(4194304, convertAdvise);
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        hashMap.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        hashMap.put(StateEvent.Name.ERROR_CODE, 4194304);
        hashMap.put(StateEvent.Name.ERROR_REASON_CODE, 4194304);
        hashMap.put(StateEvent.Name.MESSAGE, makeMessageJson);
        YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    public void enter() {
        super.enter();
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.poseState = (SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
            this.continuousDetectCount = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.faceStatus = (YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            this.bestFaceStatus = (YTFaceTrack.FaceStatus) stateByName.getStateDataBy("best_face_status");
            this.bestFrame = (YuvImage) stateByName.getStateDataBy("best_image");
            this.lastFrame = (YuvImage) stateByName.getStateDataBy("last_frame");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                String str = (String) stateByName2.getStateDataBy("action_data");
                String str2 = TAG;
                YtLogger.m106580i(str2, "action data :" + str);
                String[] split = str.split(",");
                this.actionDataParsed = split;
                this.stateData.put("action_seq", split);
            }
        } catch (Exception e) {
            String str3 = TAG;
            YtLogger.m106579e(str3, "lipread enter failed " + e.getLocalizedMessage());
            CommonUtils.reportException("lipread enter failed ", e);
        }
    }

    public void enterFirst() {
        int i;
        int i2;
        this.beginTimeMs = System.currentTimeMillis();
        if (this.backendProtoType != 2) {
            Camera.Size previewSize = YtFSM.getInstance().getContext().currentCamera.getParameters().getPreviewSize();
            if (YtFSM.getInstance().getContext().currentRotateState >= 5) {
                i = previewSize.height;
                i2 = previewSize.width;
            } else {
                i = previewSize.width;
                i2 = previewSize.height;
            }
            YtVideoEncoder ytVideoEncoder = new YtVideoEncoder((YtVideoEncoder.IYUVToVideoEncoderCallback) null, true);
            this.videoEncoder = ytVideoEncoder;
            ytVideoEncoder.startAudioVideoEncoding(i, i2, new File(this.innerMp4Path), this.codecSettingBitRate, this.codecSettingFrameRate, this.codecSettingiFrameInterval, this.audioSampleRate, this.audioBitRate);
        }
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            clearData();
        }
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = "num_interval_ms";
        String str3 = "audio_path";
        String str4 = TAG;
        super.loadStateWith(str, jSONObject);
        String str5 = "resource_online";
        try {
            if (jSONObject2.has("force_pose_check")) {
                this.needCheckPose = jSONObject2.getBoolean("force_pose_check");
            }
            if (jSONObject2.has("manual_trigger")) {
                this.needManualTrigger = jSONObject2.getBoolean("manual_trigger");
            }
            if (jSONObject2.has("video_path")) {
                this.innerMp4Path = jSONObject2.getString("video_path");
            }
            if (jSONObject2.has("backend_proto_type")) {
                this.backendProtoType = jSONObject2.getInt("backend_proto_type");
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
            if (jSONObject2.has("audio_bitrate")) {
                this.audioBitRate = jSONObject2.getInt("audio_bitrate");
            }
            if (jSONObject2.has("audio_samplerate")) {
                this.audioSampleRate = jSONObject2.getInt("audio_samplerate");
            }
            this.needCheckMultiFaces = jSONObject2.optBoolean("need_check_multiface", false);
            JSONArray optJSONArray = jSONObject2.optJSONArray("action_default_seq");
            if (optJSONArray == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
                YtLogger.m106579e(str4, "Failed to load action data");
                this.actionDataParsed = "0".split(",");
            } else {
                this.actionDataParsed = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.actionDataParsed[i] = optJSONArray.getString(i);
                }
            }
            String str6 = TAG;
            YtLogger.m106580i(str6, "load action sequence from sdkconfig " + jSONObject2.getString("action_default_seq") + " size :" + this.actionDataParsed.length);
        } catch (JSONException e) {
            String str7 = TAG;
            YtLogger.m106579e(str7, "lipread load failed1:" + e.getLocalizedMessage());
            this.actionDataParsed = "0".split(",");
        }
        this.isFinished = false;
        this.canTransit = false;
        YtFSM.getInstance().getContext().currentAppContext.getFilesDir().getAbsolutePath();
        String str8 = str5;
        try {
            if (jSONObject2.has(str8)) {
                this.isLoadResourceOnline = jSONObject2.getBoolean(str8);
            }
            String str9 = str3;
            if (jSONObject2.has(str9)) {
                this.innerAudioPath = jSONObject2.getString(str9);
            }
            String str10 = str2;
            if (jSONObject2.has(str10)) {
                this.numIntervalMs = jSONObject2.getInt(str10);
            }
        } catch (Exception e2) {
            String str11 = TAG;
            YtLogger.m106579e(str11, "lipread load failed2:" + e2.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            FileUtils.loadLibrary("YTLipReader");
        }
        YTLipReader yTLipReader = new YTLipReader();
        this.ytLipReader = yTLipReader;
        yTLipReader.init();
        String str12 = TAG;
        YtLogger.m106580i(str12, "YTLipReader Version: " + this.ytLipReader.getVersion());
        this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.stateData.put("action_seq", this.actionDataParsed);
    }

    public void moveToNextState() {
        super.moveToNextState();
        long currentTimeMillis = System.currentTimeMillis();
        this.endTimeMs = currentTimeMillis;
        if (currentTimeMillis - this.beginTimeMs > ((long) (this.actionDataParsed.length * this.numIntervalMs))) {
            this.isFinished = true;
            byte[] bArr = null;
            if (this.backendProtoType == 2) {
                if (YtFSM.getInstance().getContext().baseFunctionListener != null) {
                    bArr = YtFSM.getInstance().getContext().baseFunctionListener.getVoiceData();
                } else {
                    YtLogger.m106582w(TAG, "Base function listener for getting voice data not found");
                }
                if (bArr == null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(this.innerAudioPath));
                        if (fileInputStream.available() != 0) {
                            bArr = new byte[fileInputStream.available()];
                        }
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                    } catch (IOException e) {
                        String str = TAG;
                        YtLogger.m106579e(str, "fetch audio data failed:" + e.getLocalizedMessage());
                    }
                }
            } else {
                this.videoEncoder.stopEncoding();
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(this.innerMp4Path));
                    if (fileInputStream2.available() != 0) {
                        bArr = new byte[fileInputStream2.available()];
                    }
                    fileInputStream2.read(bArr);
                    fileInputStream2.close();
                } catch (IOException e2) {
                    String str2 = TAG;
                    YtLogger.m106579e(str2, "Failed fetch action video " + e2.getLocalizedMessage());
                }
            }
            if (bArr == null) {
                YtLogger.m106579e(TAG, "fetch audio data failed");
            }
            this.stateData.put("audio_data", bArr);
            String feature = this.ytLipReader.feature();
            if (feature == null) {
                YtLogger.m106579e(TAG, "feature is null");
            }
            this.stateData.put("feature", feature);
            String lipReadingFeature = this.ytLipReader.lipReadingFeature();
            if (lipReadingFeature == null) {
                YtLogger.m106579e(TAG, "lipread feature is null");
            }
            this.stateData.put("lipreading_feature", lipReadingFeature);
            this.stateData.put("last_frame", this.bestFrame);
            this.stateData.put("face_extra_list", this.ytLipReader.getImageListJsonStr());
            YTFaceTrack.FaceStatus faceStatus2 = this.bestFaceStatus;
            if (faceStatus2 == null) {
                YtLogger.m106579e(TAG, "last frame landmark is null");
            } else {
                this.stateData.put("last_frame_landmark", faceStatus2.xys5p);
            }
            this.canTransit = true;
            return;
        }
        YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
    }

    public void reset() {
        clearData();
        super.reset();
    }

    public void unload() {
        YtVideoEncoder ytVideoEncoder;
        if (this.ytLipReader != null) {
            this.ytLipReader = null;
        }
        if (!(this.backendProtoType == 2 || (ytVideoEncoder = this.videoEncoder) == null)) {
            ytVideoEncoder.abortEncoding();
            this.videoEncoder = null;
        }
        super.unload();
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise;
        super.update(bArr, i, i2, i3, j);
        if (this.backendProtoType != 2) {
            this.videoEncoder.queueFrame(this.lastFrame);
            this.videoEncoder.encode();
        }
        if (!this.isFinished) {
            if ((!this.needCheckPose || (facePreviewingAdvise = this.poseState) == SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && ((!this.needCheckMultiFaces || this.poseState != SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE) && this.poseState != SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE)) {
                YTLipReader yTLipReader = this.ytLipReader;
                YTFaceTrack.FaceStatus faceStatus2 = this.faceStatus[0];
                yTLipReader.feed(faceStatus2.xys, bArr, i, i2, this.currentRotateState, faceStatus2.pitch, faceStatus2.yaw, faceStatus2.roll);
            } else {
                this.nextStateName = YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
                String str = TAG;
                YtLogger.m106580i(str, "lipread cancel with pose type " + this.poseState);
                sendCancelFailEvent();
            }
            moveToNextState();
        } else if (this.canTransit) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
        }
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            this.needCheckPose = jSONObject.optBoolean("force_pose_check", this.needCheckPose);
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", this.needCheckMultiFaces);
        } catch (Exception e) {
            YtLogger.m106579e(TAG, e.getLocalizedMessage());
        }
    }
}
