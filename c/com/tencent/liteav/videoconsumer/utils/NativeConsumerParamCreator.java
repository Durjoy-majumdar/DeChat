package com.tencent.liteav.videoconsumer.utils;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

@JNINamespace("liteav::video")
public class NativeConsumerParamCreator {
    public static VideoDecoderDef.ConsumerScene createConsumerScene(int i) {
        return VideoDecoderDef.ConsumerScene.m17242a(i);
    }

    private static VideoDecodeController.DecodeStrategy createDecodeStrategy(int i) {
        return VideoDecodeController.DecodeStrategy.m17241a(i);
    }

    public static GLConstants.PixelBufferType createPixelBufferType(int i) {
        return GLConstants.PixelBufferType.m17043a(i);
    }

    public static GLConstants.PixelFormatType createPixelFormatType(int i) {
        return GLConstants.PixelFormatType.m17044a(i);
    }

    private static GLConstants.GLScaleType createScaleType(int i) {
        return GLConstants.GLScaleType.m139835a(i);
    }

    public static SnapshotSourceType createSnapshotSourceType(int i) {
        return SnapshotSourceType.m17047a(i);
    }

    public static Rotation fromInt(int i) {
        for (Rotation rotation : Rotation.values()) {
            if (rotation.mValue == i) {
                return rotation;
            }
        }
        return Rotation.NORMAL;
    }
}
