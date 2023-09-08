package com.tencent.thumbplayer.adapter.strategy.utils;

import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPAudioAVSyncStrategy;
import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPErrorCode;
import com.tencent.thumbplayer.api.TPFeatureType;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPPropertyID;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.api.TPThreadPriority;
import com.tencent.thumbplayer.api.TPVideoSeiH264Type;
import com.tencent.thumbplayer.api.TPVideoSeiHevcType;
import com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant;
import com.tencent.thumbplayer.core.common.TPDetailInfo;
import com.tencent.thumbplayer.core.common.TPNativeAudioAttributes;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TPNativeKeyMap {
    public static final int INVALID_VALUE = -1;

    @SearchConfig(nativeDefValue = 0, searchClass = TPAudioAVSyncStrategy.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapAudioAVSyncStrategy {
        @TPCommonEnum.InnerAudioAVSyncStrategy
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapAudioCodecType {
        @TPCommonEnum.InnerAudioCodecType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapAudioDecoderType {
        @TPCommonEnum.InnerAudioDecoderType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapAudioSampleFormat {
        @TPCommonEnum.InnerAudioSampleFormat
        int value();
    }

    @SearchConfig(nativeDefValue = 1, searchClass = TPCommonEnum.class, tpDefValue = 1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapBufferStrategy {
        @TPCommonEnum.InnerBufferStrategy
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapCodecType {
        @TPCommonEnum.InnerVideoCodecType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPPlayerConnectionConstant.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapConnectionAction {
        @TPCommonEnum.NativeConnectionAction
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPPlayerConnectionConstant.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapConnectionConfig {
        @TPCommonEnum.NativeConnectionConfig
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapDemuxerType {
        @TPCommonEnum.InnerDemuxerType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPPlayerDetailInfo.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapDetailInfoType {
        @TPDetailInfo.TPDetailInfoType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapDrmType {
        @TPCommonEnum.InnerDrmType
        int value();
    }

    @SearchConfig(nativeDefValue = 1001, searchClass = TPErrorCode.class, tpDefValue = 1001, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapErrorType {
        @TPCommonEnum.NativeErrorType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPFeatureType.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapFeatureType {
        @TPCommonEnum.InnerFeatureType
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapHdrType {
        @TPCommonEnum.InnerHDRType
        int value();
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapInitConfig {
        String keyName();

        @TPCommonEnum.OptionalIdType
        int type();

        @TPCommonEnum.NativeInitConfig
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapMediaType {
        @TPCommonEnum.InnerMediaType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPPlayerMsg.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapMsgInfo {
        @TPCommonEnum.NativeMsgInfo
        int value();
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapOptionalId {
        String keyName();

        @TPCommonEnum.OptionalIdType
        int type();

        @TPCommonEnum.NativeOptionalId
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapPixelFormat {
        @TPCommonEnum.InnerPixelFormat
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPPropertyID.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapPropertyId {
        @TPCommonEnum.NativePropertyId
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapReduceLantencyType {
        @TPCommonEnum.InnerReduceLantencyType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPDrmInfo.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapReportDrmType {
        @TPGeneralPlayFlowParams.TPDrmType
        int value();
    }

    @SearchConfig(nativeDefValue = 2, searchClass = ITPPlayer.class, tpDefValue = 2, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSeekMode {
        @TPCommonEnum.NativeSeekMode
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPSubtitleRenderModel.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSubtitleFontStyle {
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPSubtitleFrameBuffer.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSubtitleFormat {
        @TPCommonEnum.InnerSubtitleFormat
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPSubtitleRenderModel.class, tpDefValue = -1, valueClass = long.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSubtitleRenderParams {
        long value();
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSurfaceType {
        @TPCommonEnum.NativeSurfaceType
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = ITPPlayer.class, tpDefValue = 1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapSwitchDefMode {
        @TPCommonEnum.NativeSwitchDefMode
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapTPAudioAttributeContentType {
        @TPNativeAudioAttributes.TPNativeAudioAttributeContentType
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapTPAudioAttributeFlag {
        @TPNativeAudioAttributes.TPNativeAudioAttributeFlag
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPAudioAttributes.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapTPAudioAttributeStreamType {
        @TPNativeAudioAttributes.TPNativeAudioAttributeStreamType
        int value();
    }

    @SearchConfig(nativeDefValue = 0, searchClass = TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapTPAudioAttributeUsage {
        @TPNativeAudioAttributes.TPNativeAudioAttributeUsage
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPThreadPriority.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapThreadPriorityType {
        @TPCommonEnum.InnerThreadPriority
        int value();
    }

    @SearchConfig(nativeDefValue = 2, searchClass = TPCommonEnum.class, tpDefValue = 2, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapVideoColorSpace {
        @TPCommonEnum.InnerVideoColorSpace
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapVideoDecoderType {
        @TPCommonEnum.InnerVideoDecoderType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPVideoSeiH264Type.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapVideoH264SeiType {
        @TPCommonEnum.InnerVideoH264SeiType
        int value();
    }

    @SearchConfig(nativeDefValue = -1, searchClass = TPVideoSeiHevcType.class, tpDefValue = -1, valueClass = int.class)
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MapVideoHevcSeiType {
        @TPCommonEnum.InnerVideoHevcSeiType
        int value();
    }

    @Target({ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SearchConfig {
        long nativeDefValue();

        Class<?> searchClass();

        long tpDefValue();

        Class<? extends Number> valueClass();
    }
}
