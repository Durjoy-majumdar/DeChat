package com.tencent.thumbplayer.composition;

class TPMediaCompositionHelper {
    public static final String EMPTY_CLIP_FLAG = "1";
    public static final int END_OF_FILE = -1;
    public static final String NORMAL_CLIP_FLAG = "0";
    public static final String XML_TAG_ASSERT = "assets";
    public static final String XML_TAG_AUDIO_TRACK = "audio_track";
    public static final String XML_TAG_AUDIO_TRACKS = "audio_tracks";
    public static final String XML_TAG_AV_TRACK = "av_track";
    public static final String XML_TAG_AV_TRACKS = "av_tracks";
    public static final String XML_TAG_CLIP_DURATION = "clip_durationMs";
    public static final String XML_TAG_CLIP_END_TIME = "clip_endTimeMs";
    public static final String XML_TAG_CLIP_ID = "clip_id";
    public static final String XML_TAG_CLIP_PATH = "clip_path";
    public static final String XML_TAG_CLIP_PLACE_HOLDER = "clip_placeHolder";
    public static final String XML_TAG_CLIP_PLAY_TIME = "clip_playTimeMs";
    public static final String XML_TAG_CLIP_START_TIME = "clip_startTimeMs";
    public static final String XML_TAG_DRM_APPVER = "clip_drmAppVersion";
    public static final String XML_TAG_DRM_COMMON_KEY = "clip_drmCommonKey";
    public static final String XML_TAG_DRM_COOKIE = "clip_drmCookie";
    public static final String XML_TAG_DRM_GUID = "clip_drmGuid";
    public static final String XML_TAG_DRM_LICENSE = "clip_drmLicenseUrl";
    public static final String XML_TAG_DRM_LICENSE_STANDARDIZATION = "clip_drmLicenseStandardization";
    public static final String XML_TAG_DRM_PLATFORM = "clip_drmPlatform";
    public static final String XML_TAG_DRM_PROVISION = "clip_drmProvisionUrl";
    public static final String XML_TAG_DRM_SAVE_PATH = "clip_drmSavePath";
    public static final String XML_TAG_DRM_TYPE = "clip_drmType";
    public static final String XML_TAG_DRM_USEL1 = "clip_drmUseL1";
    public static final String XML_TAG_PREFERRED_PROPERTY = "clip_preferredProperty";
    public static final String XML_TAG_RTC_SDP_EXCHANGE_TYPE = "clip_rtcSdpExchangeType";
    public static final String XML_TAG_RTC_SERVER_URL = "clip_rtcServerUrl";
    public static final String XML_TAG_TRACK_CLIP = "track_clip";
    public static final String XML_TAG_TRACK_ID = "track_id";
    public static final String XML_TAG_UTF8 = "UTF-8";
    public static final String XML_TAG_VIDEO_TRACK = "video_track";
    public static final String XML_TAG_VIDEO_TRACKS = "video_tracks";
    private static int audioClidId = 0;
    private static int avClidId = 0;
    public static String composition_duration_strategy = "base_video";
    private static int videoClidId;

    public static int generateTrackClipId(int i) {
        if (i == 1) {
            int i2 = avClidId;
            avClidId = i2 + 1;
            return i2;
        } else if (i == 2) {
            int i3 = videoClidId;
            videoClidId = i3 + 1;
            return i3;
        } else if (i != 3) {
            return -1;
        } else {
            int i4 = audioClidId;
            audioClidId = i4 + 1;
            return i4;
        }
    }
}
