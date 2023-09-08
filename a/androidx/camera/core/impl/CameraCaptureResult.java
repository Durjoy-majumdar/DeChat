package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;

public interface CameraCaptureResult {

    public static final class EmptyCameraCaptureResult implements CameraCaptureResult {
        public static CameraCaptureResult create() {
            return new EmptyCameraCaptureResult();
        }

        public CameraCaptureMetaData.AeState getAeState() {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }

        public CameraCaptureMetaData.AfMode getAfMode() {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }

        public CameraCaptureMetaData.AfState getAfState() {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }

        public CameraCaptureMetaData.AwbState getAwbState() {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }

        public /* synthetic */ CaptureResult getCaptureResult() {
            return C16530a.m15536a(this);
        }

        public CameraCaptureMetaData.FlashState getFlashState() {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }

        public TagBundle getTagBundle() {
            return TagBundle.emptyBundle();
        }

        public long getTimestamp() {
            return -1;
        }

        public /* synthetic */ void populateExifData(ExifData.Builder builder) {
            C16530a.m15537b(this, builder);
        }
    }

    CameraCaptureMetaData.AeState getAeState();

    CameraCaptureMetaData.AfMode getAfMode();

    CameraCaptureMetaData.AfState getAfState();

    CameraCaptureMetaData.AwbState getAwbState();

    CaptureResult getCaptureResult();

    CameraCaptureMetaData.FlashState getFlashState();

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}
