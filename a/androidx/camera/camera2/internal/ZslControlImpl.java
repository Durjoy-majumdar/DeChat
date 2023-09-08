package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import p1167z8.C112608f;

final class ZslControlImpl implements ZslControl {
    private static final int MAX_IMAGES = 2;
    public final Queue<ImageProxy> mImageRingBuffer = new LinkedList();
    private boolean mIsPrivateReprocessingSupported = false;
    private boolean mIsYuvReprocessingSupported = false;
    private boolean mIsZslDisabled = false;
    private DeferrableSurface mReprocessingImageDeferrableSurface;
    public SafeCloseImageReaderProxy mReprocessingImageReader;
    public ImageWriter mReprocessingImageWriter;
    public final Queue<TotalCaptureResult> mTotalCaptureResultRingBuffer = new LinkedList();

    public ZslControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mIsYuvReprocessingSupported = ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 7);
        this.mIsPrivateReprocessingSupported = ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 4);
    }

    private void cleanup() {
        Queue<ImageProxy> queue = this.mImageRingBuffer;
        while (!queue.isEmpty()) {
            queue.remove().close();
        }
        this.mTotalCaptureResultRingBuffer.clear();
        DeferrableSurface deferrableSurface = this.mReprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new ZslControlImpl$$a(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
            }
            deferrableSurface.close();
        }
        ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null) {
            imageWriter.close();
            this.mReprocessingImageWriter = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addZslConfig$0(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage != null) {
            this.mImageRingBuffer.add(acquireLatestImage);
        }
    }

    public void addZslConfig(Size size, SessionConfig.Builder builder) {
        if (!this.mIsZslDisabled) {
            if (this.mIsYuvReprocessingSupported || this.mIsPrivateReprocessingSupported) {
                cleanup();
                int i = this.mIsYuvReprocessingSupported ? 35 : 34;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), i, 2));
                this.mReprocessingImageReader = safeCloseImageReaderProxy;
                safeCloseImageReaderProxy.setOnImageAvailableListener(new ZslControlImpl$$b(this), CameraXExecutors.ioExecutor());
                ImmediateSurface immediateSurface = new ImmediateSurface(this.mReprocessingImageReader.getSurface(), new Size(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight()), i);
                this.mReprocessingImageDeferrableSurface = immediateSurface;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = this.mReprocessingImageReader;
                C112608f<Void> terminationFuture = immediateSurface.getTerminationFuture();
                Objects.requireNonNull(safeCloseImageReaderProxy2);
                terminationFuture.addListener(new ZslControlImpl$$a(safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
                builder.addSurface(this.mReprocessingImageDeferrableSurface);
                builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                    public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                        super.onCaptureCompleted(cameraCaptureResult);
                        CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
                        if (captureResult != null && (captureResult instanceof TotalCaptureResult)) {
                            ZslControlImpl.this.mTotalCaptureResultRingBuffer.add((TotalCaptureResult) captureResult);
                        }
                    }
                });
                builder.addSessionStateCallback(new CameraCaptureSession.StateCallback() {
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        Surface inputSurface = cameraCaptureSession.getInputSurface();
                        if (inputSurface != null) {
                            ZslControlImpl.this.mReprocessingImageWriter = ImageWriterCompat.newInstance(inputSurface, 1);
                        }
                    }
                });
                builder.setInputConfiguration(new InputConfiguration(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight(), this.mReprocessingImageReader.getImageFormat()));
            }
        }
    }

    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.mImageRingBuffer.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        ImageWriter imageWriter;
        Image image = imageProxy.getImage();
        if (Build.VERSION.SDK_INT < 23 || (imageWriter = this.mReprocessingImageWriter) == null || image == null) {
            return false;
        }
        ImageWriterCompat.queueInputImage(imageWriter, image);
        return true;
    }

    public void setZslDisabled(boolean z) {
        this.mIsZslDisabled = z;
    }
}
