package com.tencent.thumbplayer.tplayer.plugins.report;

import com.tencent.thumbplayer.common.report.ITPReportParams;
import com.tencent.thumbplayer.common.report.ITPReportProperties;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TPReportParams {
    public static final int BUFFERING_REASON_BITRATE_JITTER = 1400109;
    public static final int BUFFERING_REASON_CDN_TIMEOUT = 1400103;
    public static final int BUFFERING_REASON_CDN_TIMEOUT_BUT_CONNECTED = 1400104;
    public static final int BUFFERING_REASON_DOWNLOAD_SHORT_TIME = 1400111;
    public static final int BUFFERING_REASON_DOWNLOAD_TASK = 1400101;
    public static final int BUFFERING_REASON_NETWORK_DEVICE_EXCEPTION = 1400102;
    public static final int BUFFERING_REASON_NETWORK_UNSTABLE = 1400100;
    public static final int BUFFERING_REASON_P2P_FASTER_THAN_HTTP = 1400110;
    public static final int BUFFERING_REASON_P2P_UPLOAD = 1400112;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT = 1400105;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT_BUT_CONNECTED = 1400106;
    public static final int BUFFERING_REASON_SLOWLY_SPEED = 1400107;
    public static final int BUFFERING_REASON_SLOWLY_SPEED_BUT_CONNECTED = 1400108;
    public static final String ERROR_CODE_NO_ERROR = "0";
    public static final String JSON_KEY_VAL = "val";
    public static final int LIVE_STEP_FAILED = 150;
    public static final int LIVE_STEP_LOADING_SUCC = 205;
    public static final int LIVE_STEP_PLAY = 263;
    public static final int NETWORK_TYPE_2G = 2;
    public static final int NETWORK_TYPE_3G = 3;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_5G = 5;
    public static final int NETWORK_TYPE_ETHERNET = 10;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 1;
    public static final int PLAYER_STEP_BUFFERING = 35;
    public static final int PLAYER_STEP_FIRST_LOAD = 30;
    public static final int PLAYER_STEP_FIRST_RENDERING = 32;
    public static final int PLAYER_STEP_GET_CDN_URL = 15;
    public static final int PLAYER_STEP_INIT_PLAYER = 5;
    public static final int PLAYER_STEP_LOAD_SUBTITLE = 33;
    public static final int PLAYER_STEP_PLAY_DONE = 50;
    public static final int PLAYER_STEP_REDIRECT = 34;
    public static final int PLAYER_STEP_USER_SEEK = 40;
    public static final int PLAYER_TYPE_SYSTEM_PLAYER = 0;
    public static final int PLAYER_TYPE_THUMB_PLAYER = 1;
    public static final int PLAY_END_REASON_APP_EXIT = 2;
    public static final int PLAY_END_REASON_EOS = 0;
    public static final int PLAY_END_REASON_PLAYER_ERROR = 3;
    public static final int PLAY_END_REASON_USER_STOP = 1;
    public static final int PLAY_EVENT_NONE = 0;
    public static final int PLAY_EVENT_PAUSE_BY_DEVICE = 2;
    public static final int PLAY_EVENT_SCREEN_SHOT = 3;
    public static final int PLAY_EVENT_SEEK = 1;
    public static final int PLAY_SCENE_NORMAL_PLAY = 1;
    public static final int PLAY_SCENE_TRICK_PLAY = 2;
    public static final int PLAY_TYPE_LIVE = 1;
    public static final int PLAY_TYPE_UNKNOWN = -1;
    public static final int PLAY_TYPE_VOD = 0;
    public static final String PROP_KEY_DATA = "data";
    private static final String TAG = "TPReportParams";
    public static final int VIDEO_DL_TYPE_HLS = 3;
    public static final int VIDEO_DL_TYPE_MP4 = 1;
    private BufferingTotalParams bufferingTotalParams = new BufferingTotalParams();
    private CommonParams commonParams = new CommonParams();
    private FirstLoadParams firstLoadParams = new FirstLoadParams();
    private FirstRenderParams firstRenderParams = new FirstRenderParams();
    private GetCdnUrlParams getCdnParams = new GetCdnUrlParams();
    private PlayerInitParams initParams = new PlayerInitParams();
    private LiveExParam liveExParam = new LiveExParam();
    private LoadSubtitleParams loadSubtitleParams = new LoadSubtitleParams();
    private PlayDoneParams playDoneParams = new PlayDoneParams();
    private RedirectParams redirectParams = new RedirectParams();
    private UserSeekTotalParams userSeekTotalParams = new UserSeekTotalParams();
    private VodExParam vodExParam = new VodExParam();

    public class BufferingOnceParams implements ITPReportParams {
        public long bufferingPresentTimeLong;
        public long endTimeUnix;
        public String errCodeString;
        public int formatInt;
        public int lastEventInt;
        public int reasonInt;
        public int sceneInt;
        public long starTimeUnix;
        public String urlString;

        public BufferingOnceParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.sceneInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_LAST_EVENT, this.lastEventInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, this.bufferingPresentTimeLong);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("url", this.urlString);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.sceneInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_LAST_EVENT, this.lastEventInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, this.bufferingPresentTimeLong);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("url", this.urlString);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.sceneInt = 1;
            this.lastEventInt = 0;
            this.reasonInt = TPReportParams.BUFFERING_REASON_NETWORK_UNSTABLE;
        }
    }

    public class BufferingTotalParams implements ITPReportParams {
        public int bufferingCountInt;
        public int bufferingDurationInt;
        public List<BufferingOnceParams> bufferingOnceParamsList = new LinkedList();

        public BufferingTotalParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_COUNT, this.bufferingCountInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_DURATION, this.bufferingDurationInt);
                JSONArray jSONArray = new JSONArray();
                for (BufferingOnceParams paramsToJson : this.bufferingOnceParamsList) {
                    JSONObject jSONObject2 = new JSONObject();
                    paramsToJson.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_COUNT, this.bufferingCountInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_DURATION, this.bufferingDurationInt);
        }

        public void reset() {
            this.bufferingCountInt = 0;
            this.bufferingDurationInt = 0;
            this.bufferingOnceParamsList.clear();
        }
    }

    public class CommonParams implements ITPReportParams {
        public String appVersionString;
        public int cdnIdInt;
        public String cdnIpString;
        public String cdnUipString;
        public String deviceNameString;
        public String deviceResolutionString;
        public int downloadTypeInt;
        public String flowIdString;
        public String guidString;
        public int loginTypeInt;
        public float mediaDurationFloat;
        public int mediaFormatInt;
        public int mediaRateInt;
        public String mediaResolutionString;
        public int networkSpeedInt;
        public int networkTypeInt;
        public int onlineInt;
        public String osVersionString;
        public int p2pInt;
        public String p2pVersionString;
        public long platformLong;
        public String playNoString;
        public int playTypeInt;
        public int playerTypeInt;
        public String playerVersionString;
        public String proto;
        public String protover;
        public String qqOpenIdString;
        public int scenesId;
        public int seqInt = 0;
        public int signalStrengthInt;
        public int stepInt;
        public int testIdInt;
        public String uinString;
        public String uipString;
        public String vidString;
        public String wxOpenIdString;

        public CommonParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.Common.COMMON_STEP, this.stepInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_SEQ, this.seqInt);
            iTPReportProperties.put("platform", this.platformLong);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_FLOW_ID, this.flowIdString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PLAY_NO, this.playNoString);
            iTPReportProperties.put("uin", this.uinString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_QQ_OPEN_ID, this.qqOpenIdString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_WX_OPEN_ID, this.wxOpenIdString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_LOGIN_TYPE, this.loginTypeInt);
            iTPReportProperties.put("guid", this.guidString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_UIP, this.uipString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_CDN_UIP, this.cdnUipString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_CDN_IP, this.cdnIpString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_ONLINE, this.onlineInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_P2P, this.p2pInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_SIG_STRENGTH, this.signalStrengthInt);
            iTPReportProperties.put("network", this.networkTypeInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, this.networkSpeedInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_DEVICE_NAME, this.deviceNameString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, this.deviceResolutionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_TEST_ID, this.testIdInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_OS_VERSION, this.osVersionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_P2P_VERSION, this.p2pVersionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_APP_VERSION, this.appVersionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PLAYER_VERSION, this.playerVersionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PLAYER_TYPE, this.playerTypeInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_CDN_ID, this.cdnIdInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_SCENES_ID, this.scenesId);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PLAY_TYPE, this.playTypeInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_DL_TYPE, this.downloadTypeInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_VID, this.vidString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, this.mediaResolutionString);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_MEDIA_FORMAT, this.mediaFormatInt);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_MEDIA_RATE, this.mediaRateInt);
            iTPReportProperties.put("duration", this.mediaDurationFloat);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PROTO, this.proto);
            iTPReportProperties.put(TPReportKeys.Common.COMMON_PROTOVER, this.protover);
        }

        public void reset() {
            this.stepInt = 0;
            this.seqInt = 0;
            this.platformLong = 0;
            this.flowIdString = "";
            this.playNoString = "";
            this.uinString = "";
            this.qqOpenIdString = "";
            this.wxOpenIdString = "";
            this.loginTypeInt = 0;
            this.guidString = "";
            this.uipString = "";
            this.cdnUipString = "";
            this.cdnIpString = "";
            this.onlineInt = 0;
            this.p2pInt = 0;
            this.signalStrengthInt = 0;
            this.networkTypeInt = 0;
            this.networkSpeedInt = 0;
            this.deviceNameString = "";
            this.deviceResolutionString = "";
            this.testIdInt = 0;
            this.osVersionString = "";
            this.p2pVersionString = "";
            this.appVersionString = "";
            this.playerVersionString = "";
            this.playerTypeInt = 0;
            this.cdnIdInt = 0;
            this.scenesId = 0;
            this.downloadTypeInt = 0;
            this.vidString = "";
            this.mediaResolutionString = "";
            this.mediaFormatInt = 0;
            this.mediaRateInt = 0;
            this.mediaDurationFloat = 0.0f;
            this.proto = "";
            this.protover = "";
        }
    }

    public class FirstLoadParams implements ITPReportParams {
        public String cdnUrlString;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long firstOpenTimeUnix;
        public long firstPacketReadTimeUnix;
        public long starTimeUnix;

        public FirstLoadParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_FIRST_OPEN_TIME, this.firstOpenTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_FIRST_PACKET_READ_TIME, this.firstPacketReadTimeUnix);
                jSONObject.put("url", this.cdnUrlString);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_FIRST_OPEN_TIME, this.firstOpenTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_FIRST_PACKET_READ_TIME, this.firstPacketReadTimeUnix);
            iTPReportProperties.put("url", this.cdnUrlString);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0;
            this.firstOpenTimeUnix = 0;
            this.firstPacketReadTimeUnix = 0;
            this.endTimeUnix = 0;
            this.cdnUrlString = "";
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    public class FirstRenderParams implements ITPReportParams {
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;

        public FirstRenderParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0;
            this.endTimeUnix = 0;
            this.errCodeString = "0";
        }
    }

    public class GetCdnUrlParams implements ITPReportParams {
        public long endTimeUnix;
        public String errCodeString;
        public String proxyIpString;
        public long starTimeUnix;

        public GetCdnUrlParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, this.proxyIpString);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, this.proxyIpString);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0;
            this.endTimeUnix = 0;
            this.proxyIpString = "";
            this.errCodeString = "0";
        }
    }

    public class LiveExParam implements ITPReportParams {
        public int adPlayLengthInt;
        public int blockCountInt;
        public int blockTimeInt;
        public String cdnServerString;
        public int connectTimeInt;
        public int contentIdInt;
        public String defSwitchString;
        public int deviceTypeInt;
        public int downSpeedInt;
        public String downloadServerIpString;
        public String downloadUrl;
        public int errCodeInt;
        public String extraInfoString;
        public int freeTypeInt;
        public String fullErrCodeString;
        public int getStreamDurationInt;
        public int getSyncFrameDurationInt;
        public int getUrlTimeInt;
        public int isLookBackInt;
        public int isStreamP2PInt;
        public int isUseP2PInt;
        public int isUserPayInt;
        public int liveDelayInt;
        public int liveProgramIdInt;
        public int liveTagInt;
        public int liveTypeInt;
        public long loadingTimeLong;
        public int maxSpeedInt;
        public int networkTypeInt;
        public int playTimeInt;
        public String playerVersionString;
        public int prePlayLengthInt;
        public int reconnectCntInt;
        public long reportTimeLong;
        public String spanId;
        public int streamIdInt;
        public int testSpeedInt;
        public String tuid;
        public String userIpString;
        public String userQQString;

        public LiveExParam() {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_REPORT_TIME, this.reportTimeLong);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_S_IP, this.userIpString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_I_QQ, this.userQQString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_PRE_DURATION, this.prePlayLengthInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_AD_DURATION, this.adPlayLengthInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_PLAYER_VER, this.playerVersionString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_DL_IP, this.downloadServerIpString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_DEV_TYPE, this.deviceTypeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_NET_TYPE, this.networkTypeInt);
            iTPReportProperties.put("freetype", this.freeTypeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_USE_P2P, this.isUseP2PInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_P2P_PLAY, this.isStreamP2PInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_PROGRAM_ID, this.liveProgramIdInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, this.streamIdInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_CONTENT_ID, this.contentIdInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_PLAY_TIME, this.playTimeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_IS_USER_PAY, this.isUserPayInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, this.defSwitchString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE, this.liveTypeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_CDN_SERVER, this.cdnServerString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_DOWNLOAD_URL, this.downloadUrl);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_IS_LOOK_BACK, this.isLookBackInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_DELAY, this.liveDelayInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TAG, this.liveTagInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.extraInfoString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_CONN_TIME, this.connectTimeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_MAX_SPEED, this.maxSpeedInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_TEST_SPEED, this.testSpeedInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_DOWN_SPEED, this.downSpeedInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_RECONNECT_TIME, this.reconnectCntInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LOADING_TIME, this.loadingTimeLong);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_BLOCK_TIME, this.blockTimeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_BLOCK_COUNT, this.blockCountInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, this.errCodeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_GET_URL_TIME, this.getUrlTimeInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_FULL_CODE, this.fullErrCodeString);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_GET_DATA_DURATION, this.getStreamDurationInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_GET_SYNC_FRAM, this.getSyncFrameDurationInt);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LIVE_FX_SPANID, this.spanId);
            iTPReportProperties.put(TPReportKeys.LiveExKeys.LICE_FX_TUID, this.tuid);
        }

        public void reset() {
        }
    }

    public class LoadSubtitleParams implements ITPReportParams {
        public int bufferingDurationInt;
        public int cdnTypeInt;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;
        public String subtitleUrlString;

        public LoadSubtitleParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFER_DURATION, this.bufferingDurationInt);
                jSONObject.put("url", this.subtitleUrlString);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_BUFFER_DURATION, this.bufferingDurationInt);
            iTPReportProperties.put("url", this.subtitleUrlString);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0;
            this.endTimeUnix = 0;
            this.bufferingDurationInt = 0;
            this.subtitleUrlString = "";
            this.cdnTypeInt = 0;
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    public class PlayDoneParams implements ITPReportParams {
        public long endTimeUnix;
        public String errCodeString;
        public float playDurationFloat;
        public int reasonInt;

        public PlayDoneParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_PLAY_DURATION, (double) this.playDurationFloat);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_PLAY_DURATION, this.playDurationFloat);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.reasonInt = 0;
            this.endTimeUnix = 0;
            this.playDurationFloat = 0.0f;
            this.errCodeString = "0";
        }
    }

    public class PlayerInitParams implements ITPReportParams {
        public String errCodeString;
        public long playEndTimeUnix;
        public long playStarTimeUnix;

        public PlayerInitParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.playStarTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.playEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_START_TIME, this.playStarTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.playEndTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.playStarTimeUnix = 0;
            this.playEndTimeUnix = 0;
            this.errCodeString = "0";
        }
    }

    public class RedirectParams implements ITPReportParams {
        public int cdnTypeInt;
        public long endTimeUnix;
        public String errCodeString;
        public int redirectCountInt;
        public String redirectedUrlString;
        public long starTimeUnix;

        public RedirectParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("url", this.redirectedUrlString);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_T302, this.redirectCountInt);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("url", this.redirectedUrlString);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_T302, this.redirectCountInt);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0;
            this.endTimeUnix = 0;
            this.redirectedUrlString = "";
            this.cdnTypeInt = 0;
            this.redirectCountInt = 0;
            this.errCodeString = "0";
        }
    }

    public class UserSeekOnceParams implements ITPReportParams {
        public long endPresentTimeLong;
        public String errCodeString;
        public int formatInt;
        public long seekEndTimeUnix;
        public long seekStartTimeUnix;
        public long startPresentTimeLong;

        public UserSeekOnceParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, this.startPresentTimeLong);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, this.endPresentTimeLong);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_START_TIME, this.seekStartTimeUnix);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_END_TIME, this.seekEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, this.startPresentTimeLong);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, this.endPresentTimeLong);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_START_TIME, this.seekStartTimeUnix);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_END_TIME, this.seekEndTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        public void reset() {
            this.startPresentTimeLong = 0;
            this.endPresentTimeLong = 0;
            this.seekStartTimeUnix = 0;
            this.seekEndTimeUnix = 0;
            this.errCodeString = "0";
        }
    }

    public class UserSeekTotalParams implements ITPReportParams {
        public int seekBufferingCountInt;
        public int seekBufferingDurationInt;
        public List<UserSeekOnceParams> seekOnceParamsList = new LinkedList();
        public int seekTotalCountInt;

        public UserSeekTotalParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_COUNT, this.seekTotalCountInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_COUNT, this.seekBufferingCountInt);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_DURATION, this.seekBufferingDurationInt);
                JSONArray jSONArray = new JSONArray();
                for (UserSeekOnceParams paramsToJson : this.seekOnceParamsList) {
                    JSONObject jSONObject2 = new JSONObject();
                    paramsToJson.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (JSONException e) {
                TPLogUtil.m21895e(TPReportParams.TAG, (Throwable) e);
            }
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_COUNT, this.seekTotalCountInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_COUNT, this.seekBufferingCountInt);
            iTPReportProperties.put(TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_DURATION, this.seekBufferingDurationInt);
        }

        public void reset() {
            this.seekTotalCountInt = 0;
            this.seekBufferingCountInt = 0;
            this.seekBufferingDurationInt = 0;
            this.seekOnceParamsList.clear();
        }
    }

    public class VodExParam implements ITPReportParams {
        public int bizIdInt;
        public int clipInt;
        public int currentPlayInt;
        public int freeTypeInt;
        public int hasSubtitleInt;
        public int hevcLcInt;
        public int hitDownloaded;
        public int isSelectedSubtitleInt;
        public int multiTrackInt;
        public int optimizedPlayInt;
        public int statusInt;

        public VodExParam() {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put("freetype", this.freeTypeInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_CURRENT_PLAY, this.currentPlayInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_OPTIMIZED_PLAY, this.optimizedPlayInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_HAS_SUBTITLE, this.hasSubtitleInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_SELECTED_SUBTITLE, this.isSelectedSubtitleInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, this.multiTrackInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_BIZ_ID, this.bizIdInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_HEVC_LC, this.hevcLcInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_CLIP_COUNT, this.clipInt);
            iTPReportProperties.put("status", this.statusInt);
            iTPReportProperties.put(TPReportKeys.VodExKeys.VOD_EX_HIT_DOWNLOADED, this.hitDownloaded);
        }

        public void reset() {
        }
    }

    public TPReportParams() {
        this.commonParams.reset();
        this.initParams.reset();
        this.getCdnParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
    }

    public BufferingOnceParams createBufferingOnceParams() {
        return new BufferingOnceParams();
    }

    public UserSeekOnceParams createUserSeekOnceParams() {
        return new UserSeekOnceParams();
    }

    public BufferingTotalParams getBufferingTotalParams() {
        return this.bufferingTotalParams;
    }

    public CommonParams getCommonParams() {
        return this.commonParams;
    }

    public FirstLoadParams getFirstLoadParams() {
        return this.firstLoadParams;
    }

    public FirstRenderParams getFirstRenderParams() {
        return this.firstRenderParams;
    }

    public GetCdnUrlParams getGetCdnParams() {
        return this.getCdnParams;
    }

    public PlayerInitParams getInitParams() {
        return this.initParams;
    }

    public LiveExParam getLiveExParam() {
        return this.liveExParam;
    }

    public LoadSubtitleParams getLoadSubtitleParams() {
        return this.loadSubtitleParams;
    }

    public PlayDoneParams getPlayDoneParams() {
        return this.playDoneParams;
    }

    public RedirectParams getRedirectParams() {
        return this.redirectParams;
    }

    public UserSeekTotalParams getUserSeekTotalParams() {
        return this.userSeekTotalParams;
    }

    public VodExParam getVodExParam() {
        return this.vodExParam;
    }

    public void resetAllParam() {
        this.commonParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.getCdnParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
        this.liveExParam.reset();
        this.vodExParam.reset();
    }
}
