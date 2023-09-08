package com.tencent.liteav.videoproducer.utils;

import android.graphics.Bitmap;
import android.media.projection.MediaProjection;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.ScreenCapturer;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;
import com.tencent.liteav.videoproducer.encoder.NativeEncoderDataListener;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

@JNINamespace("liteav::video")
public class NativeProducerParamCreator {
    private static final String TAG = "CaptureParamsHelper";

    public static Boolean createBooleanWithValue(boolean z) {
        return Boolean.valueOf(z);
    }

    public static CameraCaptureParams createCameraParams(Boolean bool, int i, int i2, int i3) {
        CameraCaptureParams cameraCaptureParams = new CameraCaptureParams();
        cameraCaptureParams.f47179a = bool;
        cameraCaptureParams.f47183b = i;
        cameraCaptureParams.f47184c = i2;
        cameraCaptureParams.f47185d = i3;
        return cameraCaptureParams;
    }

    public static VideoEncoderDef.EncodeStrategy createEncoderStrategy(int i) {
        return VideoEncoderDef.EncodeStrategy.m17551a(i);
    }

    public static VideoProducerDef.GSensorMode createGSensorMode(int i) {
        return VideoProducerDef.GSensorMode.m17762a(i);
    }

    public static VideoProducerDef.HomeOrientation createHomeOrientation(int i) {
        return VideoProducerDef.HomeOrientation.m17763a(i);
    }

    public static GLConstants.MirrorMode createMirrorMode(int i) {
        return GLConstants.MirrorMode.m17041a(i);
    }

    public static NativeEncoderDataListener createNativeEncoderDataListener(long j, int i) {
        return new NativeEncoderDataListener(j, i);
    }

    public static GLConstants.Orientation createOrientation(int i) {
        return GLConstants.Orientation.m17042a(i);
    }

    public static GLConstants.PixelBufferType createPixelBufferType(int i) {
        return GLConstants.PixelBufferType.m17043a(i);
    }

    public static GLConstants.PixelFormatType createPixelFormatType(int i) {
        return GLConstants.PixelFormatType.m17044a(i);
    }

    public static VideoProducerDef.ProducerMode createProducerMode(int i) {
        return VideoProducerDef.ProducerMode.m17764a(i);
    }

    public static Rotation createRotation(int i) {
        return Rotation.m139836a(i);
    }

    public static GLConstants.GLScaleType createScaleType(int i) {
        return GLConstants.GLScaleType.m139835a(i);
    }

    public static ScreenCapturer.ScreenCaptureParams createScreenParams(boolean z, int i, int i2, int i3, MediaProjection mediaProjection) {
        ScreenCapturer.ScreenCaptureParams screenCaptureParams = new ScreenCapturer.ScreenCaptureParams();
        screenCaptureParams.f47214a = z;
        screenCaptureParams.f47183b = i;
        screenCaptureParams.f47184c = i2;
        screenCaptureParams.f47185d = i3;
        screenCaptureParams.f47215f = mediaProjection;
        return screenCaptureParams;
    }

    public static SnapshotSourceType createSnapshotSourceType(int i) {
        return SnapshotSourceType.m17047a(i);
    }

    public static CaptureSourceInterface.SourceType createSourceType(int i) {
        return CaptureSourceInterface.SourceType.m17403a(i);
    }

    public static VideoProducerDef.StreamType createStreamType(int i) {
        return VideoProducerDef.StreamType.m17765a(i);
    }

    public static VirtualCamera.VirtualCameraParams createVirtualParams(Bitmap bitmap, int i, int i2, int i3) {
        VirtualCamera.VirtualCameraParams virtualCameraParams = new VirtualCamera.VirtualCameraParams();
        virtualCameraParams.f47223a = bitmap;
        virtualCameraParams.f47183b = i;
        virtualCameraParams.f47184c = i2;
        virtualCameraParams.f47185d = i3;
        return virtualCameraParams;
    }
}
