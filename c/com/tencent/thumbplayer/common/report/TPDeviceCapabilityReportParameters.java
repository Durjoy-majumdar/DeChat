package com.tencent.thumbplayer.common.report;

import org.json.JSONObject;

public class TPDeviceCapabilityReportParameters {
    private AV1DecoderParams mAV1DecoderParams = new AV1DecoderParams();
    private CommonParams mCommonParams = new CommonParams();
    private HEVCDecoderParams mHEVCDecoderParams = new HEVCDecoderParams();
    private VP8DecoderParams mVP8DecoderParams = new VP8DecoderParams();
    private VP9DecoderParams mVP9DecoderParams = new VP9DecoderParams();

    public class AV1DecoderParams implements ITPReportParams {
        private static final String AV1_HW_DECODER_LEVEL = "av1hwdecoderlevel";
        private static final String AV1_HW_DECODER_PROFILE = "av1hwdecoderprofile";
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        public int av1HWDecoderLevel;
        public int av1HWDecoderProfile;

        public AV1DecoderParams() {
            reset();
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(AV1_HW_DECODER_PROFILE, this.av1HWDecoderProfile);
            iTPReportProperties.put(AV1_HW_DECODER_LEVEL, this.av1HWDecoderLevel);
        }

        public void reset() {
            this.av1HWDecoderProfile = -1;
            this.av1HWDecoderLevel = -1;
        }
    }

    public class CommonParams implements ITPReportParams {
        private static final String API_LEVEL = "apilevel";
        private static final String CPU_NAME = "cpuname";
        private static final String FLOW_ID = "flowid";
        private static final String MODEL = "model";
        private static final String OS_VER = "osver";
        private static final String PLATFORM = "appplatform";
        private static final String SERIAL_NO = "serialno";
        public int apiLevel;
        public String cpuName;
        public String flowId;
        public String model;
        public String osVer;
        public int platform;
        public String serialNo;

        public CommonParams() {
            reset();
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put("flowid", this.flowId);
            iTPReportProperties.put(PLATFORM, this.platform);
            iTPReportProperties.put(API_LEVEL, this.apiLevel);
            iTPReportProperties.put("osver", this.osVer);
            iTPReportProperties.put(MODEL, this.model);
            iTPReportProperties.put(SERIAL_NO, this.serialNo);
            iTPReportProperties.put(CPU_NAME, this.cpuName);
        }

        public void reset() {
            this.flowId = "";
            this.platform = -1;
            this.apiLevel = -1;
            this.osVer = "";
            this.model = "";
            this.serialNo = "";
            this.cpuName = "";
        }
    }

    public class HEVCDecoderParams implements ITPReportParams {
        private static final String HEVC_HW_DECODER_LEVEL = "hevchwdecoderlevel";
        private static final String HEVC_HW_DECODER_PROFILE = "hevchwdecoderprofile";
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        public int hevcHWDecoderLevel;
        public int hevcHWDecoderProfile;

        public HEVCDecoderParams() {
            reset();
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(HEVC_HW_DECODER_PROFILE, this.hevcHWDecoderProfile);
            iTPReportProperties.put(HEVC_HW_DECODER_LEVEL, this.hevcHWDecoderLevel);
        }

        public void reset() {
            this.hevcHWDecoderProfile = -1;
            this.hevcHWDecoderLevel = -1;
        }
    }

    public class VP8DecoderParams implements ITPReportParams {
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        private static final String VP8_HW_DECODER_LEVEL = "vp8hwdecoderlevel";
        private static final String VP8_HW_DECODER_PROFILE = "vp8hwdecoderprofile";
        public int vp8HWDecoderLevel;
        public int vp8HWDecoderProfile;

        public VP8DecoderParams() {
            reset();
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(VP8_HW_DECODER_PROFILE, this.vp8HWDecoderProfile);
            iTPReportProperties.put(VP8_HW_DECODER_LEVEL, this.vp8HWDecoderLevel);
        }

        public void reset() {
            this.vp8HWDecoderProfile = -1;
            this.vp8HWDecoderLevel = -1;
        }
    }

    public class VP9DecoderParams implements ITPReportParams {
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        private static final String VP9_HW_DECODER_LEVEL = "vp9hwdecoderlevel";
        private static final String VP9_HW_DECODER_PROFILE = "vp9hwdecoderprofile";
        public int vp9HWDecoderLevel;
        public int vp9HWDecoderProfile;

        public VP9DecoderParams() {
            reset();
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(VP9_HW_DECODER_PROFILE, this.vp9HWDecoderProfile);
            iTPReportProperties.put(VP9_HW_DECODER_LEVEL, this.vp9HWDecoderLevel);
        }

        public void reset() {
            this.vp9HWDecoderProfile = -1;
            this.vp9HWDecoderLevel = -1;
        }
    }

    public AV1DecoderParams getAV1DecoderParams() {
        return this.mAV1DecoderParams;
    }

    public CommonParams getCommonParams() {
        return this.mCommonParams;
    }

    public HEVCDecoderParams getHEVCDecoderParams() {
        return this.mHEVCDecoderParams;
    }

    public VP8DecoderParams getVP8DecoderParams() {
        return this.mVP8DecoderParams;
    }

    public VP9DecoderParams getVP9DecoderParams() {
        return this.mVP9DecoderParams;
    }

    public void resetAllParams() {
        this.mCommonParams.reset();
        this.mAV1DecoderParams.reset();
    }
}
