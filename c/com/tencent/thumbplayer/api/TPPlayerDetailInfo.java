package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TPPlayerDetailInfo {
    @TPNativeKeyMap.MapDetailInfoType(16)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_END */
    public static final int f349341x4029493f = 16;
    @TPNativeKeyMap.MapDetailInfoType(15)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_START */
    public static final int f349342xdbc3f7c6 = 15;
    @TPNativeKeyMap.MapDetailInfoType(18)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_END = 18;
    @TPNativeKeyMap.MapDetailInfoType(17)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_START = 17;
    @TPNativeKeyMap.MapDetailInfoType(4)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_END = 4;
    @TPNativeKeyMap.MapDetailInfoType(3)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_START = 3;
    @TPNativeKeyMap.MapDetailInfoType(5)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_ON_PREAPRED = 5;
    @TPNativeKeyMap.MapDetailInfoType(2)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_PREPARE_START = 2;
    @TPNativeKeyMap.MapDetailInfoType(8)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_DECODER_CREATE_START */
    public static final int f349343xc2476f13 = 8;
    @TPNativeKeyMap.MapDetailInfoType(10)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_FRAME_RENDERED = 10;
    @TPNativeKeyMap.MapDetailInfoType(0)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_START = 0;
    @TPNativeKeyMap.MapDetailInfoType(7)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_DECODER_CREATE_START */
    public static final int f349344x8e113f8e = 7;
    @TPNativeKeyMap.MapDetailInfoType(9)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_FRAME_RENDERED = 9;
    @TPNativeKeyMap.MapDetailInfoType(6)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_ON_PREAPRED */
    public static final int f349345xea5a37b8 = 6;
    @TPNativeKeyMap.MapDetailInfoType(1)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_PREPARE_START */
    public static final int f349346x5e50cc3 = 1;

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_AUDIO_FRAME_RENDERED */
    public static final int f349347xfdb7ee58 = 1006;

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_VIDEO_FRAME_RENDERED */
    public static final int f349348x175a7713 = 1005;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_PREPARED = 1004;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_PREPARE_START = 1003;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_END = 1001;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_START = 1000;
    @TPNativeKeyMap.MapDetailInfoType(12)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_END */
    public static final int f349349x7950643a = 12;
    @TPNativeKeyMap.MapDetailInfoType(11)

    /* renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_START */
    public static final int f349350x67904001 = 11;
    @TPNativeKeyMap.MapDetailInfoType(14)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_END = 14;
    @TPNativeKeyMap.MapDetailInfoType(13)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_START = 13;
    @TPNativeKeyMap.MapDetailInfoType(-1)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_UNKNOWN = -1;
    public long timeSince1970Ms;
    @TPPlayerDetailInfoType
    public int type;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPPlayerDetailInfoType {
    }

    public TPPlayerDetailInfo(@TPPlayerDetailInfoType int i, long j) {
        this.type = i;
        this.timeSince1970Ms = j;
    }

    public TPPlayerDetailInfo(@TPPlayerDetailInfoType int i) {
        this(i, System.currentTimeMillis());
    }
}
