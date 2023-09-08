package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Base64;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class YtLivenessNetProtoHelper {
    /* access modifiers changed from: private */
    public static final String TAG = "YtLivenessNetProtoHelper";

    public static class ActionLiveReq {
        public String action_str;
        public String action_video;
        public String app_id;
        public String best_image;
        public String business_id;
        public String compare_image;
        public int compare_image_type;
        public boolean do_eye_detect;
        public boolean do_live;
        public boolean do_mouth_detect;
        public boolean get_more_image;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ActionLiveReqData {
        public String actionStr;
        public String actionVideo;
        public NetBaseInfoData baseInfo;
        public String bestImage;
        public int colorNum;
        public String config;
        public String controlConfig;
        public boolean needEyeDetect;
        public boolean needMoreImage;
        public boolean needMouthDetect;
        public String reflectConfig;
        public String reservedfield;
        public ArrayList<SensorData> sensorData;
    }

    public static class ActionReflectLiveReq {
        public String action_str;
        public String action_video;
        public String app_id;
        public String business_id;
        public String color_data;
        public ImageInfo compare_image;
        public int compare_image_type;
        public String config;
        public ImageInfo eye_image;
        public ImageInfo live_image;
        public int mode;
        public ImageInfo mouth_image;
        public int platform;
        public ReflectColorData reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ActionReflectLiveReqData {
        public String actionStr;
        public String actionVideo;
        public NetBaseInfoData baseInfo;
        public String colorData;
        public int colorNum;
        public String config;
        public String controlConfig;
        public ImageInfo eyeImage;
        public ImageInfo liveImage;
        public int mode;
        public ImageInfo mouthImage;
        public String reflectConfig;
        public ReflectColorData reflectData;
        public ArrayList<SensorData> sensorData;
    }

    public static class FaceFrame {
        public String image;
        public ArrayList<Float> x_coordinates;
        public ArrayList<Float> y_coordinates;
    }

    public static class FourLiveReq {
        public String app_id;
        public String compare_image;
        public String validate_data;
        public String video;
    }

    public static class FourLiveReqData {
        public NetBaseInfoData baseInfoData;
        public String validateData;
        public String video;
    }

    public static class GetFourLiveTypeReq {
        public String app_id;
        public String seq;
    }

    public static class GetFourLiveTypeReqData {
        public NetBaseInfoData baseInfo;
    }

    public static class GetLiveTypeReq {
        public String app_id;
        public String business_name;
        public String person_id;
        public int platform;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class GetLiveTypeReqData {
        public NetBaseInfoData baseInfo;
        public int colorNum;
        public String controlConfig;
        public String reflectConfig;
    }

    public static class LipReadReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo bestImage;
        public String faceExtraInfo;
        public float[] liveFivePoint;
        public String liveImage;
        public String mouth_lip_reading;
        public String mouth_move;
        public String validate_data;
        public String voice;
    }

    public static class NetBaseInfoData {
        public String appId;
        public String businessId;
        public int liveType;
        public float lux;
        public String personId;
        public String personType;
        public String reqType;
        public String sessionId;
    }

    public static class PersonLive {
        public String color_data;
        public ArrayList<FaceFrame> frames;
        public String mouth_lip_reading;
        public String mouth_move;
        public int platform;
        public ReflectColorData reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public ArrayList<SensorData> sensor_data;
        public String validate_data;
        public String voice;
    }

    public static class PersonLiveReq {
        public String app_id;
        public ImageInfo best_image;
        public String business_name;
        public int live_type;
        public PersonLive livedata;
        public String mp_business_buffer;
        public String person_id;
        public String person_type;
        public String req_type;
        public String request_id;
        public int scene;
    }

    public static class PictureLiveDetectReq {
        public String app_id;
        public ArrayList<Float> five_point;
        public String image;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class PictureLiveReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo imageInfo;
        public ArrayList<SensorData> sensorData;
    }

    public static class ReflectLiveReq {
        public String app_id;
        public String business_id;
        public String color_data;
        public String compare_image;
        public int compare_image_type;
        public String live_image;
        public int platform;
        public ReflectColorData reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ReflectLiveReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo bestImage;
        public ImageInfo closeEyeImage;
        public String colorData;
        public int colorNum;
        public String config;
        public String liveImage;
        public ImageInfo openMouthImage;
        public ReflectColorData reflectData;
        public ArrayList<SensorData> sensorData;
    }

    public static class Version {
        public String faction_sdk_version = "";
        public String freflect_sdk_version = "";
        public String ftrack_sdk_version = "";
        public String sdk_version = "";

        public String makeVersion() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("sdk_version:");
            stringBuffer.append(this.sdk_version);
            stringBuffer.append(";ftrack_sdk_version:");
            stringBuffer.append(this.ftrack_sdk_version);
            if (this.faction_sdk_version != "") {
                stringBuffer.append(";faction_sdk_version:");
                stringBuffer.append(this.faction_sdk_version);
            }
            if (this.freflect_sdk_version != "") {
                stringBuffer.append(";freflect_sdk_version:");
                stringBuffer.append(this.freflect_sdk_version);
            }
            return stringBuffer.toString();
        }
    }

    public static class LiveStyleRequester {

        public static class LiveStyleAndroidData {
            public String android_apilevel = ("" + Build.VERSION.SDK_INT);
            public String android_version = Build.VERSION.RELEASE;
            public String build_brand = Build.BRAND;
            public String build_device = Build.DEVICE;
            public String build_display = Build.DISPLAY;
            public String build_hardware = Build.HARDWARE;
            public String build_model = Build.MODEL;
            public String build_product = Build.PRODUCT;
            public float lux = 0.0f;

            public String toString() {
                return "".concat(this.build_brand).concat(this.build_model).concat(this.build_hardware).concat(this.build_display).concat(this.build_product).concat(this.build_device);
            }
        }

        public static class SeleceData {
            public LiveStyleAndroidData android_data;
            public int change_point_num = 2;
            public String client_version;
            public String config;
            public int platform = 2;
            public int protocal = 1;
            public String reflect_param;
            public ArrayList<SensorData> sensor_data;
            public String version = YTAGReflectLiveCheckInterface.VERSION;

            public SeleceData(float f, int i, String str, String str2, String str3) {
                LiveStyleAndroidData liveStyleAndroidData = new LiveStyleAndroidData();
                this.android_data = liveStyleAndroidData;
                liveStyleAndroidData.lux = f;
                this.change_point_num = i;
                if (str != null && str.length() > 0) {
                    this.reflect_param = str;
                }
                if (str3 != null && str3.length() > 0) {
                    this.config = str3;
                }
                this.client_version = str2;
            }

            public String getConfig() {
                return this.config;
            }

            public void setConfig(String str) {
                this.config = str;
            }

            public String toString() {
                String concat = "".concat(Integer.toString(this.platform)).concat(Integer.toString(this.protocal)).concat(this.client_version).concat(this.android_data.toString());
                String access$000 = YtLivenessNetProtoHelper.TAG;
                YtLogger.m106580i(access$000, "select_data_str: " + concat);
                return concat;
            }
        }

        public static class YTLiveStyleReq {
            public String app_id;
            public SeleceData select_data;
        }
    }

    public static class SensorData {
        public long capture_time;
        public ArrayList<Float> sensor_data;
        public int type;
    }

    public static String makeActionLiveReq(ActionLiveReqData actionLiveReqData) {
        ActionLiveReq actionLiveReq = new ActionLiveReq();
        NetBaseInfoData netBaseInfoData = actionLiveReqData.baseInfo;
        actionLiveReq.app_id = netBaseInfoData.appId;
        actionLiveReq.session_id = netBaseInfoData.sessionId;
        actionLiveReq.business_id = netBaseInfoData.businessId;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        actionLiveReq.select_data = new LiveStyleRequester.SeleceData(actionLiveReqData.baseInfo.lux, actionLiveReqData.colorNum, actionLiveReqData.reflectConfig, version.makeVersion(), actionLiveReqData.controlConfig);
        actionLiveReq.action_str = actionLiveReqData.actionStr;
        actionLiveReq.action_video = actionLiveReqData.actionVideo;
        actionLiveReq.best_image = actionLiveReqData.bestImage;
        actionLiveReq.do_eye_detect = actionLiveReqData.needEyeDetect;
        actionLiveReq.do_mouth_detect = actionLiveReqData.needMouthDetect;
        actionLiveReq.do_live = true;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            actionLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new WeJson().toJson(actionLiveReq);
    }

    public static String makeActionReflectLiveReq(ActionReflectLiveReqData actionReflectLiveReqData) {
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
        NetLivenessReqResultState.makeActionStr((String[]) stateByName.getStateDataBy("action_seq"));
        ActionReflectLiveReq actionReflectLiveReq = new ActionReflectLiveReq();
        NetBaseInfoData netBaseInfoData = actionReflectLiveReqData.baseInfo;
        actionReflectLiveReq.app_id = netBaseInfoData.appId;
        actionReflectLiveReq.session_id = netBaseInfoData.sessionId;
        actionReflectLiveReq.business_id = netBaseInfoData.businessId;
        actionReflectLiveReq.platform = 2;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        actionReflectLiveReq.select_data = new LiveStyleRequester.SeleceData(actionReflectLiveReqData.baseInfo.lux, actionReflectLiveReqData.colorNum, actionReflectLiveReqData.reflectConfig, version.makeVersion(), actionReflectLiveReqData.controlConfig);
        String str = actionReflectLiveReqData.controlConfig;
        String Checksum = YTPoseDetectJNIInterface.Checksum((byte[]) stateByName.getStateDataBy("frames"));
        String removeKey = removeKey(str, "sdcs");
        String concat = removeKey.concat("&sdcs=" + YTPoseDetectJNIInterface.getLiveSelectDataChecksum(actionReflectLiveReq.select_data.toString(), Checksum));
        actionReflectLiveReq.action_video = actionReflectLiveReqData.actionVideo;
        actionReflectLiveReq.select_data.setConfig(concat.concat("&avcs=" + Checksum));
        actionReflectLiveReq.color_data = actionReflectLiveReqData.colorData;
        actionReflectLiveReq.action_str = actionReflectLiveReqData.actionStr;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionReflectLiveReq.compare_image = new ImageInfo(byteArrayOutputStream.toByteArray(), (float[]) null, (String) null);
            actionReflectLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        actionReflectLiveReq.live_image = actionReflectLiveReqData.liveImage;
        actionReflectLiveReq.mouth_image = actionReflectLiveReqData.mouthImage;
        actionReflectLiveReq.eye_image = actionReflectLiveReqData.eyeImage;
        actionReflectLiveReq.mode = actionReflectLiveReqData.mode;
        actionReflectLiveReq.reflect_data = actionReflectLiveReqData.reflectData;
        actionReflectLiveReq.config = actionReflectLiveReqData.config;
        return new WeJson().toJson(actionReflectLiveReq);
    }

    public static String makeFourLiveReq(FourLiveReqData fourLiveReqData) {
        FourLiveReq fourLiveReq = new FourLiveReq();
        fourLiveReq.app_id = fourLiveReqData.baseInfoData.appId;
        fourLiveReq.validate_data = fourLiveReqData.validateData;
        fourLiveReq.video = fourLiveReqData.video;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            fourLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
        }
        return new WeJson().toJson(fourLiveReq);
    }

    public static String makeGetFourLiveReq(GetFourLiveTypeReqData getFourLiveTypeReqData) {
        GetFourLiveTypeReq getFourLiveTypeReq = new GetFourLiveTypeReq();
        getFourLiveTypeReq.app_id = getFourLiveTypeReqData.baseInfo.appId;
        return new WeJson().toJson(getFourLiveTypeReq);
    }

    public static String makeGetLiveTypeReq(GetLiveTypeReqData getLiveTypeReqData) {
        GetLiveTypeReq getLiveTypeReq = new GetLiveTypeReq();
        NetBaseInfoData netBaseInfoData = getLiveTypeReqData.baseInfo;
        getLiveTypeReq.app_id = netBaseInfoData.appId;
        getLiveTypeReq.business_name = netBaseInfoData.businessId;
        getLiveTypeReq.person_id = netBaseInfoData.personId;
        getLiveTypeReq.platform = 2;
        getLiveTypeReq.session_id = netBaseInfoData.sessionId;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        }
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        getLiveTypeReq.select_data = new LiveStyleRequester.SeleceData(getLiveTypeReqData.baseInfo.lux, getLiveTypeReqData.colorNum, getLiveTypeReqData.reflectConfig, version.makeVersion(), getLiveTypeReqData.controlConfig);
        String str = getLiveTypeReqData.controlConfig;
        getLiveTypeReq.select_data.setConfig(str.concat("&sdcs=" + YTAGReflectLiveCheckJNIInterface.Checksum(getLiveTypeReq.select_data.toString())));
        return new WeJson().toJson(getLiveTypeReq);
    }

    public static String makeLipReadReq(LipReadReqData lipReadReqData) {
        PersonLiveReq personLiveReq = new PersonLiveReq();
        NetBaseInfoData netBaseInfoData = lipReadReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.livedata = new PersonLive();
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        String makeVersion = version.makeVersion();
        personLiveReq.livedata.select_data = new LiveStyleRequester.SeleceData(lipReadReqData.baseInfo.lux, 0, "", makeVersion, "");
        personLiveReq.livedata.frames = new ArrayList<>();
        FaceFrame faceFrame = new FaceFrame();
        faceFrame.image = lipReadReqData.liveImage;
        faceFrame.x_coordinates = new ArrayList<>();
        faceFrame.y_coordinates = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int i2 = i * 2;
            faceFrame.x_coordinates.add(Float.valueOf(lipReadReqData.liveFivePoint[i2]));
            faceFrame.y_coordinates.add(Float.valueOf(lipReadReqData.liveFivePoint[i2 + 1]));
        }
        personLiveReq.livedata.frames.add(faceFrame);
        try {
            JSONObject jSONObject = new JSONObject(lipReadReqData.faceExtraInfo);
            FaceFrame faceFrame2 = new FaceFrame();
            faceFrame2.image = jSONObject.getString("openmouth_img");
            faceFrame2.x_coordinates = new ArrayList<>();
            faceFrame2.y_coordinates = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("openmouth_5pts");
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                faceFrame2.x_coordinates.add(Float.valueOf((float) jSONArray.optDouble(i4)));
                faceFrame2.y_coordinates.add(Float.valueOf((float) jSONArray.optDouble(i4 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame2);
            FaceFrame faceFrame3 = new FaceFrame();
            faceFrame3.image = jSONObject.getString("closeeye_img");
            faceFrame3.x_coordinates = new ArrayList<>();
            faceFrame3.y_coordinates = new ArrayList<>();
            JSONArray jSONArray2 = jSONObject.getJSONArray("closeeye_5pts");
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = i5 * 2;
                faceFrame3.x_coordinates.add(Float.valueOf((float) jSONArray2.optDouble(i6)));
                faceFrame3.y_coordinates.add(Float.valueOf((float) jSONArray2.optDouble(i6 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame3);
        } catch (Exception e) {
            String str = TAG;
            YtLogger.m106579e(str, "Failed parse extra face list " + e.getLocalizedMessage());
        }
        PersonLive personLive = personLiveReq.livedata;
        personLive.validate_data = lipReadReqData.validate_data;
        personLive.voice = lipReadReqData.voice;
        personLive.mouth_move = lipReadReqData.mouth_move;
        personLive.mouth_lip_reading = lipReadReqData.mouth_lip_reading;
        personLive.platform = 2;
        NetBaseInfoData netBaseInfoData2 = lipReadReqData.baseInfo;
        personLiveReq.person_type = netBaseInfoData2.personType;
        personLiveReq.live_type = netBaseInfoData2.liveType;
        personLiveReq.req_type = netBaseInfoData2.reqType;
        return new WeJson().toJson(personLiveReq);
    }

    public static String makePersonLiveReq(ReflectLiveReqData reflectLiveReqData) {
        PersonLiveReq personLiveReq = new PersonLiveReq();
        NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.live_type = netBaseInfoData.liveType;
        personLiveReq.req_type = netBaseInfoData.reqType;
        personLiveReq.request_id = netBaseInfoData.sessionId;
        personLiveReq.person_type = netBaseInfoData.personType;
        personLiveReq.livedata = new PersonLive();
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        String makeVersion = version.makeVersion();
        personLiveReq.livedata.select_data = new LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, makeVersion, "");
        PersonLive personLive = personLiveReq.livedata;
        personLive.reflect_data = reflectLiveReqData.reflectData;
        personLive.color_data = reflectLiveReqData.colorData;
        personLive.platform = 2;
        personLive.frames = new ArrayList<>();
        FaceFrame faceFrame = new FaceFrame();
        faceFrame.image = reflectLiveReqData.bestImage.image;
        personLiveReq.livedata.frames.add(faceFrame);
        FaceFrame faceFrame2 = new FaceFrame();
        faceFrame2.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame2);
        FaceFrame faceFrame3 = new FaceFrame();
        faceFrame3.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame3);
        return new WeJson().toJson(personLiveReq);
    }

    public static String makePictureLiveReq(PictureLiveReqData pictureLiveReqData) {
        PictureLiveDetectReq pictureLiveDetectReq = new PictureLiveDetectReq();
        NetBaseInfoData netBaseInfoData = pictureLiveReqData.baseInfo;
        pictureLiveDetectReq.app_id = netBaseInfoData.appId;
        pictureLiveDetectReq.session_id = netBaseInfoData.sessionId;
        ImageInfo imageInfo = pictureLiveReqData.imageInfo;
        pictureLiveDetectReq.five_point = imageInfo.five_points;
        pictureLiveDetectReq.image = imageInfo.image;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        pictureLiveDetectReq.select_data = new LiveStyleRequester.SeleceData(pictureLiveReqData.baseInfo.lux, 0, "", version.makeVersion(), "");
        return new WeJson().toJson(pictureLiveDetectReq);
    }

    public static String makeReflectLiveReq(ReflectLiveReqData reflectLiveReqData) {
        ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
        NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        reflectLiveReq.app_id = netBaseInfoData.appId;
        reflectLiveReq.session_id = netBaseInfoData.sessionId;
        reflectLiveReq.business_id = netBaseInfoData.businessId;
        reflectLiveReq.platform = 2;
        reflectLiveReq.color_data = reflectLiveReqData.colorData;
        reflectLiveReq.live_image = reflectLiveReqData.liveImage;
        reflectLiveReq.reflect_data = reflectLiveReqData.reflectData;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTrack.Version;
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        reflectLiveReq.select_data = new LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, version.makeVersion(), "");
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            reflectLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new WeJson().toJson(reflectLiveReq);
    }

    private static String removeKey(String str, String str2) {
        String[] split = str.split("&");
        String str3 = "";
        for (int i = 0; i < split.length; i++) {
            if (!split[i].split("=")[0].equals(str2)) {
                str3 = str3.length() == 0 ? str3.concat(split[i]) : str3.concat("&").concat(split[i]);
                String str4 = TAG;
                YtLogger.m106580i(str4, "result: " + str3);
            }
        }
        return str3;
    }

    public static class ImageInfo {
        public String checksum;
        public ArrayList<Float> five_points;
        public String image;

        public ImageInfo(String str, ArrayList<Float> arrayList, String str2) {
            this.image = str;
            this.five_points = arrayList;
            this.checksum = str2;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0036 A[SYNTHETIC, Splitter:B:25:0x0036] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x003d A[SYNTHETIC, Splitter:B:29:0x003d] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0044 A[SYNTHETIC, Splitter:B:36:0x0044] */
        /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createFileWithByte(java.lang.String r3, byte[] r4) {
            /*
                r2 = this;
                java.io.File r0 = new java.io.File
                r0.<init>(r3)
                r3 = 0
                boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
                if (r1 == 0) goto L_0x000f
                r0.delete()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            L_0x000f:
                r0.createNewFile()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
                java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002f, all -> 0x002b }
                r0.<init>(r1)     // Catch:{ Exception -> 0x002f, all -> 0x002b }
                r0.write(r4)     // Catch:{ Exception -> 0x0030, all -> 0x0029 }
                r0.flush()     // Catch:{ Exception -> 0x0030, all -> 0x0029 }
                r1.close()     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                r0.close()     // Catch:{ Exception -> 0x004c }
                goto L_0x004c
            L_0x0029:
                r4 = move-exception
                goto L_0x002d
            L_0x002b:
                r4 = move-exception
                r0 = r3
            L_0x002d:
                r3 = r1
                goto L_0x0034
            L_0x002f:
                r0 = r3
            L_0x0030:
                r3 = r1
                goto L_0x0042
            L_0x0032:
                r4 = move-exception
                r0 = r3
            L_0x0034:
                if (r3 == 0) goto L_0x003b
                r3.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003b
            L_0x003a:
            L_0x003b:
                if (r0 == 0) goto L_0x0040
                r0.close()     // Catch:{ Exception -> 0x0040 }
            L_0x0040:
                throw r4
            L_0x0041:
                r0 = r3
            L_0x0042:
                if (r3 == 0) goto L_0x0049
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x0049
            L_0x0048:
            L_0x0049:
                if (r0 == 0) goto L_0x004c
                goto L_0x0025
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo.createFileWithByte(java.lang.String, byte[]):void");
        }

        public ImageInfo(byte[] bArr, float[] fArr, String str) {
            this.image = new String(Base64.encode(bArr, 2));
            ArrayList<Float> arrayList = new ArrayList<>();
            this.five_points = arrayList;
            this.checksum = str;
            if (fArr != null) {
                arrayList.add(Float.valueOf(fArr[176]));
                this.five_points.add(Float.valueOf(fArr[177]));
                this.five_points.add(Float.valueOf(fArr[178]));
                this.five_points.add(Float.valueOf(fArr[179]));
                this.five_points.add(Float.valueOf(fArr[64]));
                this.five_points.add(Float.valueOf(fArr[65]));
                this.five_points.add(Float.valueOf(fArr[90]));
                this.five_points.add(Float.valueOf(fArr[91]));
                this.five_points.add(Float.valueOf(fArr[102]));
                this.five_points.add(Float.valueOf(fArr[103]));
            }
        }
    }
}
