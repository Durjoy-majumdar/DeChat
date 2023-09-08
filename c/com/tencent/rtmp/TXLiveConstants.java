package com.tencent.rtmp;

public class TXLiveConstants {
    public static final int AUDIO_ROUTE_RECEIVER = 1;
    public static final int AUDIO_ROUTE_SPEAKER = 0;
    public static final int AUDIO_VOLUME_TYPE_AUTO = 0;
    public static final int AUDIO_VOLUME_TYPE_MEDIA = 1;
    public static final int AUDIO_VOLUME_TYPE_VOIP = 2;
    public static final int AUTO_ADJUST_BITRATE_RESOLUTION_STRATEGY_1 = 1;
    public static final int AUTO_ADJUST_BITRATE_RESOLUTION_STRATEGY_2 = 3;
    public static final int AUTO_ADJUST_BITRATE_STRATEGY_1 = 0;
    public static final int AUTO_ADJUST_BITRATE_STRATEGY_2 = 2;
    public static final int AUTO_ADJUST_LIVEPUSH_RESOLUTION_STRATEGY = 1;
    public static final int AUTO_ADJUST_LIVEPUSH_STRATEGY = 0;
    public static final int AUTO_ADJUST_NONE = -1;
    public static final int AUTO_ADJUST_REALTIME_BITRATE_RESOLUTION_STRATEGY = 5;
    public static final int AUTO_ADJUST_REALTIME_BITRATE_STRATEGY = 4;
    public static final int AUTO_ADJUST_REALTIME_VIDEOCHAT_STRATEGY = 5;
    public static final int BEAUTY_STYLE_HAZY = 3;
    public static final int BEAUTY_STYLE_NATURE = 1;
    public static final int BEAUTY_STYLE_PITU = 2;
    public static final int BEAUTY_STYLE_SMOOTH = 0;
    public static final int CUSTOM_MODE_AUDIO_CAPTURE = 1;
    public static final int CUSTOM_MODE_AUDIO_PREPROCESS = 4;
    public static final int CUSTOM_MODE_VIDEO_CAPTURE = 2;
    public static final int CUSTOM_MODE_VIDEO_PREPROCESS = 8;
    public static final int ENCODE_VIDEO_AUTO = 2;
    public static final int ENCODE_VIDEO_HARDWARE = 1;
    public static final int ENCODE_VIDEO_SOFTWARE = 0;
    public static final int ERR_LICENSE_CHECK_FAIL = -5;
    public static final String EVT_BLOCK_DURATION = "EVT_BLOCK_DURATION";
    public static final String EVT_DESCRIPTION = "EVT_MSG";
    public static final String EVT_GET_MSG = "EVT_GET_MSG";
    public static final String EVT_GET_MSG_TYPE = "EVT_GET_MSG_TYPE";
    public static final String EVT_PARAM1 = "EVT_PARAM1";
    public static final String EVT_PARAM2 = "EVT_PARAM2";
    public static final String EVT_PLAYABLE_DURATION_MS = "EVT_PLAYABLE_DURATION_MS";
    public static final String EVT_PLAYABLE_RATE = "EVT_PLAYABLE_RATE";
    public static final String EVT_PLAY_COVER_URL = "EVT_PLAY_COVER_URL";
    public static final String EVT_PLAY_DESCRIPTION = "EVT_PLAY_DESCRIPTION";
    public static final String EVT_PLAY_DURATION = "EVT_PLAY_DURATION";
    public static final String EVT_PLAY_DURATION_MS = "EVT_PLAY_DURATION_MS";
    public static final String EVT_PLAY_NAME = "EVT_PLAY_NAME";
    public static final String EVT_PLAY_PROGRESS = "EVT_PLAY_PROGRESS";
    public static final String EVT_PLAY_PROGRESS_MS = "EVT_PLAY_PROGRESS_MS";
    public static final String EVT_PLAY_URL = "EVT_PLAY_URL";
    public static final String EVT_TIME = "EVT_TIME";
    public static final String EVT_UTC_TIME = "EVT_UTC_TIME";
    public static final int LOCAL_VIDEO_MIRROR_TYPE_AUTO = 0;
    public static final int LOCAL_VIDEO_MIRROR_TYPE_DISABLE = 2;
    public static final int LOCAL_VIDEO_MIRROR_TYPE_ENABLE = 1;
    public static final int LOG_LEVEL_DEBUG = 1;
    public static final int LOG_LEVEL_ERROR = 4;
    public static final int LOG_LEVEL_FATAL = 5;
    public static final int LOG_LEVEL_INFO = 2;
    public static final int LOG_LEVEL_NULL = 6;
    public static final int LOG_LEVEL_VERBOSE = 0;
    public static final int LOG_LEVEL_WARN = 3;
    public static final String NET_STATUS_AUDIO_BITRATE = "AUDIO_BITRATE";
    public static final String NET_STATUS_AUDIO_BLOCK_TIME = "AUDIO_BLOCK_TIME";
    public static final String NET_STATUS_AUDIO_CACHE = "AUDIO_CACHE";
    public static final String NET_STATUS_AUDIO_CACHE_THRESHOLD = "AUDIO_CACHE_THRESHOLD";
    public static final String NET_STATUS_AUDIO_DROP = "AUDIO_DROP";
    public static final String NET_STATUS_AUDIO_INFO = "AUDIO_PLAY_INFO";
    public static final String NET_STATUS_AV_PLAY_INTERVAL = "AV_PLAY_INTERVAL";
    public static final String NET_STATUS_AV_RECV_INTERVAL = "AV_RECV_INTERVAL";
    public static final String NET_STATUS_CPU_USAGE = "CPU_USAGE";
    public static final String NET_STATUS_NET_JITTER = "NET_JITTER";
    public static final String NET_STATUS_NET_SPEED = "NET_SPEED";
    public static final String NET_STATUS_QUALITY_LEVEL = "NET_QUALITY_LEVEL";
    public static final String NET_STATUS_SERVER_IP = "SERVER_IP";
    public static final String NET_STATUS_VIDEO_BITRATE = "VIDEO_BITRATE";
    public static final String NET_STATUS_VIDEO_CACHE = "VIDEO_CACHE";
    public static final String NET_STATUS_VIDEO_DPS = "VIDEO_DPS";
    public static final String NET_STATUS_VIDEO_DROP = "VIDEO_DROP";
    public static final String NET_STATUS_VIDEO_FPS = "VIDEO_FPS";
    public static final String NET_STATUS_VIDEO_GOP = "VIDEO_GOP";
    public static final String NET_STATUS_VIDEO_HEIGHT = "VIDEO_HEIGHT";
    public static final String NET_STATUS_VIDEO_WIDTH = "VIDEO_WIDTH";
    public static final String NET_STATUS_V_DEC_CACHE_SIZE = "V_DEC_CACHE_SIZE";
    public static final String NET_STATUS_V_SUM_CACHE_SIZE = "V_SUM_CACHE_SIZE";
    public static final int PAUSE_FLAG_PAUSE_AUDIO = 2;
    public static final int PAUSE_FLAG_PAUSE_VIDEO = 1;
    public static final int PLAY_ERR_FILE_NOT_FOUND = -2303;
    public static final int PLAY_ERR_GET_PLAYINFO_FAIL = -2306;
    public static final int PLAY_ERR_GET_RTMP_ACC_URL_FAIL = -2302;
    public static final int PLAY_ERR_HEVC_DECODE_FAIL = -2304;
    public static final int PLAY_ERR_HLS_KEY = -2305;
    public static final int PLAY_ERR_NET_DISCONNECT = -2301;
    public static final int PLAY_ERR_STREAM_SWITCH_FAIL = -2307;
    public static final int PLAY_EVT_CHANGE_RESOLUTION = 2009;
    public static final int PLAY_EVT_CHANGE_ROTATION = 2011;
    public static final int PLAY_EVT_CONNECT_SUCC = 2001;
    public static final int PLAY_EVT_GET_FLVSESSIONKEY = 2031;
    public static final int PLAY_EVT_GET_MESSAGE = 2012;
    public static final int PLAY_EVT_GET_METADATA = 2028;
    public static final int PLAY_EVT_GET_PLAYINFO_SUCC = 2010;
    public static final int PLAY_EVT_PLAY_BEGIN = 2004;
    public static final int PLAY_EVT_PLAY_END = 2006;
    public static final int PLAY_EVT_PLAY_LOADING = 2007;
    public static final int PLAY_EVT_PLAY_PROGRESS = 2005;
    public static final int PLAY_EVT_RCV_FIRST_AUDIO_FRAME = 2026;
    public static final int PLAY_EVT_RCV_FIRST_I_FRAME = 2003;
    public static final int PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW = 2033;
    public static final int PLAY_EVT_RTMP_STREAM_BEGIN = 2002;
    public static final int PLAY_EVT_START_VIDEO_DECODER = 2008;
    public static final int PLAY_EVT_STREAM_SWITCH_SUCC = 2015;
    public static final int PLAY_EVT_VOD_LOADING_END = 2014;
    public static final int PLAY_EVT_VOD_PLAY_PREPARED = 2013;
    public static final int PLAY_WARNING_AUDIO_DECODE_FAIL = 2102;
    public static final int PLAY_WARNING_DNS_FAIL = 3001;
    public static final int PLAY_WARNING_FIRST_IDR_HW_DECODE_FAIL = 2108;
    public static final int PLAY_WARNING_HW_ACCELERATION_FAIL = 2106;
    public static final int PLAY_WARNING_READ_WRITE_FAIL = 3005;
    public static final int PLAY_WARNING_RECONNECT = 2103;
    public static final int PLAY_WARNING_RECV_DATA_LAG = 2104;
    public static final int PLAY_WARNING_SEVER_CONN_FAIL = 3002;
    public static final int PLAY_WARNING_SHAKE_FAIL = 3003;
    public static final int PLAY_WARNING_SPEAKER_DEVICE_ABNORMAL = 1205;
    public static final int PLAY_WARNING_VIDEO_DECODE_FAIL = 2101;
    public static final int PLAY_WARNING_VIDEO_DISCONTINUITY = 2107;
    public static final int PLAY_WARNING_VIDEO_PLAY_LAG = 2105;
    public static final int PUSH_ERR_AUDIO_ENCODE_FAIL = -1304;
    public static final int PUSH_ERR_INVALID_ADDRESS = -1313;
    public static final int PUSH_ERR_MIC_RECORD_FAIL = -1311;
    public static final int PUSH_ERR_NET_DISCONNECT = -1307;
    public static final int PUSH_ERR_OPEN_CAMERA_FAIL = -1301;
    public static final int PUSH_ERR_OPEN_MIC_FAIL = -1302;
    public static final int PUSH_ERR_SCREEN_CAPTURE_DISTURBED = -1310;
    public static final int PUSH_ERR_SCREEN_CAPTURE_START_FAILED = -1308;
    public static final int PUSH_ERR_SCREEN_CAPTURE_SWITCH_DISPLAY_FAILED = -1312;
    public static final int PUSH_ERR_SCREEN_CAPTURE_UNSURPORT = -1309;
    public static final int PUSH_ERR_UNSUPPORTED_RESOLUTION = -1305;
    public static final int PUSH_ERR_UNSUPPORTED_SAMPLERATE = -1306;
    public static final int PUSH_ERR_VIDEO_ENCODE_FAIL = -1303;
    public static final int PUSH_EVT_CHANGE_BITRATE = 1006;
    public static final int PUSH_EVT_CHANGE_RESOLUTION = 1005;
    public static final int PUSH_EVT_CONNECT_SUCC = 1001;
    public static final int PUSH_EVT_FIRST_FRAME_AVAILABLE = 1007;
    public static final int PUSH_EVT_OPEN_CAMERA_SUCC = 1003;
    public static final int PUSH_EVT_PUSH_BEGIN = 1002;
    public static final int PUSH_EVT_ROOM_IN = 1018;
    public static final int PUSH_EVT_ROOM_IN_FAILED = 1022;
    public static final int PUSH_EVT_ROOM_NEED_REENTER = 1021;
    public static final int PUSH_EVT_ROOM_OUT = 1019;
    public static final int PUSH_EVT_ROOM_USERLIST = 1020;
    public static final int PUSH_EVT_ROOM_USER_AUDIO_STATE = 1034;
    public static final int PUSH_EVT_ROOM_USER_ENTER = 1031;
    public static final int PUSH_EVT_ROOM_USER_EXIT = 1032;
    public static final int PUSH_EVT_ROOM_USER_VIDEO_STATE = 1033;
    public static final int PUSH_EVT_SCREEN_CAPTURE_SUCC = 1004;
    public static final int PUSH_EVT_START_VIDEO_ENCODER = 1008;
    public static final int PUSH_WARNING_BEAUTYSURFACE_VIEW_INIT_FAIL = 1105;
    public static final int PUSH_WARNING_DNS_FAIL = 3001;
    public static final int PUSH_WARNING_HW_ACCELERATION_FAIL = 1103;
    public static final int PUSH_WARNING_MICROPHONE_DEVICE_ABNORMAL = 1204;
    public static final int PUSH_WARNING_NET_BUSY = 1101;
    public static final int PUSH_WARNING_READ_WRITE_FAIL = 3005;
    public static final int PUSH_WARNING_RECONNECT = 1102;
    public static final int PUSH_WARNING_SERVER_DISCONNECT = 3004;
    public static final int PUSH_WARNING_SEVER_CONN_FAIL = 3002;
    public static final int PUSH_WARNING_SHAKE_FAIL = 3003;
    public static final int PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW = 1106;
    public static final int PUSH_WARNING_VIDEO_ENCODE_FAIL = 1104;
    public static final int PUSH_WARNING_VIDEO_ENCODE_SW_SWITCH_HW = 1107;
    public static final int PUSH_WARNING_VIDEO_RENDER_FAIL = 2110;
    public static final int RENDER_MODE_ADJUST_RESOLUTION = 1;
    public static final int RENDER_MODE_FULL_FILL_SCREEN = 0;
    public static final int RENDER_ROTATION_0 = 0;
    public static final int RENDER_ROTATION_180 = 180;
    public static final int RENDER_ROTATION_270 = 270;
    public static final int RENDER_ROTATION_90 = 90;
    public static final int RENDER_ROTATION_LANDSCAPE = 270;
    public static final int RENDER_ROTATION_PORTRAIT = 0;
    public static final int REVERB_TYPE_0 = 0;
    public static final int REVERB_TYPE_1 = 1;
    public static final int REVERB_TYPE_2 = 2;
    public static final int REVERB_TYPE_3 = 3;
    public static final int REVERB_TYPE_4 = 4;
    public static final int REVERB_TYPE_5 = 5;
    public static final int REVERB_TYPE_6 = 6;
    public static final int RTMP_CHANNEL_TYPE_AUTO = 0;
    public static final int RTMP_CHANNEL_TYPE_PRIVATE = 2;
    public static final int RTMP_CHANNEL_TYPE_STANDARD = 1;
    public static final String TXRTMPSDK_AUDIO_PCMSOURCE_LOCALMERGER = "TXRTMPSDK_AUDIO_PCMSOURCE_LOCALMERGER";
    public static final String TXRTMPSDK_PUSHEVENT_SOURCE_OPENCAMERA = "TXRTMPSDK_PUSHEVENT_SOURCE_OPENCAMERA";
    public static final String TXRTMPSDK_PUSHEVENT_SOURCE_OPENMIC = "TXRTMPSDK_PUSHEVENT_SOURCE_OPENMIC";
    public static final String TXRTMPSDK_VIDEO_YUVSOURCE_LOCALCAMERA = "TXRTMPSDK_VIDEO_YUVSOURCE_LOCALCAMERA";
    public static final int VIDEO_ANGLE_HOME_DOWN = 1;
    public static final int VIDEO_ANGLE_HOME_LEFT = 2;
    public static final int VIDEO_ANGLE_HOME_RIGHT = 0;
    public static final int VIDEO_ANGLE_HOME_UP = 3;
    public static final int VIDEO_QUALITY_HIGH_DEFINITION = 2;
    public static final int VIDEO_QUALITY_LINKMIC_MAIN_PUBLISHER = 4;
    public static final int VIDEO_QUALITY_LINKMIC_SUB_PUBLISHER = 5;
    public static final int VIDEO_QUALITY_REALTIEM_VIDEOCHAT = 6;
    public static final int VIDEO_QUALITY_STANDARD_DEFINITION = 1;
    public static final int VIDEO_QUALITY_SUPER_DEFINITION = 3;
    public static final int VIDEO_QUALITY_ULTRA_DEFINITION = 7;
    public static final int VIDEO_RESOLUTION_TYPE_1080_1920 = 30;
    public static final int VIDEO_RESOLUTION_TYPE_1280_720 = 5;
    public static final int VIDEO_RESOLUTION_TYPE_160_160 = 19;
    public static final int VIDEO_RESOLUTION_TYPE_180_320 = 7;
    public static final int VIDEO_RESOLUTION_TYPE_1920_1080 = 31;
    public static final int VIDEO_RESOLUTION_TYPE_240_320 = 11;
    public static final int VIDEO_RESOLUTION_TYPE_270_270 = 18;
    public static final int VIDEO_RESOLUTION_TYPE_270_480 = 8;
    public static final int VIDEO_RESOLUTION_TYPE_320_180 = 9;
    public static final int VIDEO_RESOLUTION_TYPE_320_240 = 14;
    public static final int VIDEO_RESOLUTION_TYPE_320_480 = 6;
    public static final int VIDEO_RESOLUTION_TYPE_360_480 = 12;
    public static final int VIDEO_RESOLUTION_TYPE_360_640 = 0;
    public static final int VIDEO_RESOLUTION_TYPE_480_270 = 10;
    public static final int VIDEO_RESOLUTION_TYPE_480_360 = 15;
    public static final int VIDEO_RESOLUTION_TYPE_480_480 = 17;
    public static final int VIDEO_RESOLUTION_TYPE_480_640 = 13;
    public static final int VIDEO_RESOLUTION_TYPE_540_960 = 1;
    public static final int VIDEO_RESOLUTION_TYPE_640_360 = 3;
    public static final int VIDEO_RESOLUTION_TYPE_640_480 = 16;
    public static final int VIDEO_RESOLUTION_TYPE_720_1280 = 2;
    public static final int VIDEO_RESOLUTION_TYPE_960_540 = 4;
    public static final int VOICECHANGER_TYPE_0 = 0;
    public static final int VOICECHANGER_TYPE_1 = 1;
    public static final int VOICECHANGER_TYPE_10 = 10;
    public static final int VOICECHANGER_TYPE_11 = 11;
    public static final int VOICECHANGER_TYPE_2 = 2;
    public static final int VOICECHANGER_TYPE_3 = 3;
    public static final int VOICECHANGER_TYPE_4 = 4;
    public static final int VOICECHANGER_TYPE_5 = 5;
    public static final int VOICECHANGER_TYPE_6 = 6;
    public static final int VOICECHANGER_TYPE_7 = 7;
    public static final int VOICECHANGER_TYPE_8 = 8;
    public static final int VOICECHANGER_TYPE_9 = 9;
}
