package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class SessionProcessorBase implements SessionProcessor {
    private static final String TAG = "SessionProcessorBase";
    private String mCameraId;
    private HandlerThread mImageReaderHandlerThread;
    private Map<Integer, ImageReader> mImageReaderMap = new HashMap();
    private final Object mLock = new Object();
    private List<DeferrableSurface> mSurfacesList = new ArrayList();

    public static class ImageRefHolder implements ImageReference {
        private Image mImage;
        private final Object mImageLock = new Object();
        private int mRefCount = 1;

        public ImageRefHolder(Image image) {
            this.mImage = image;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean decrement() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.mImageLock
                monitor-enter(r0)
                int r1 = r3.mRefCount     // Catch:{ all -> 0x0017 }
                if (r1 > 0) goto L_0x000a
                r1 = 0
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                return r1
            L_0x000a:
                r2 = 1
                int r1 = r1 - r2
                r3.mRefCount = r1     // Catch:{ all -> 0x0017 }
                if (r1 > 0) goto L_0x0015
                android.media.Image r1 = r3.mImage     // Catch:{ all -> 0x0017 }
                r1.close()     // Catch:{ all -> 0x0017 }
            L_0x0015:
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                return r2
            L_0x0017:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase.ImageRefHolder.decrement():boolean");
        }

        public Image get() {
            return this.mImage;
        }

        public boolean increment() {
            synchronized (this.mImageLock) {
                int i = this.mRefCount;
                if (i <= 0) {
                    return false;
                }
                this.mRefCount = i + 1;
                return true;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setImageProcessor$1(ImageProcessor imageProcessor, int i, ImageReader imageReader) {
        try {
            Image acquireNextImage = imageReader.acquireNextImage();
            ImageProcessor imageProcessor2 = imageProcessor;
            int i2 = i;
            imageProcessor2.onNextImageAvailable(i2, acquireNextImage.getTimestamp(), new ImageRefHolder(acquireNextImage), (String) null);
        } catch (IllegalStateException e) {
            Logger.m15474e(TAG, "Failed to acquire next image.", e);
        }
    }

    public final void deInitSession() {
        Logger.m15473e(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            for (DeferrableSurface close : this.mSurfacesList) {
                close.close();
            }
            this.mSurfacesList.clear();
            this.mImageReaderMap.clear();
        }
        HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    public abstract void deInitSessionInternal();

    public final SessionConfig initSession(CameraInfo cameraInfo, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3) {
        Camera2CameraInfo from = Camera2CameraInfo.from(cameraInfo);
        Camera2SessionConfig initSessionInternal = initSessionInternal(from.getCameraId(), from.getCameraCharacteristicsMap(), outputSurface, outputSurface2, outputSurface3);
        synchronized (this.mLock) {
            for (Camera2OutputConfig next : initSessionInternal.getOutputConfigs()) {
                if (next instanceof SurfaceOutputConfig) {
                    this.mSurfacesList.add(new SessionProcessorSurface(((SurfaceOutputConfig) next).getSurface(), next.getId()));
                } else if (next instanceof ImageReaderOutputConfig) {
                    ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) next;
                    ImageReader newInstance = ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
                    this.mImageReaderMap.put(Integer.valueOf(next.getId()), newInstance);
                    SessionProcessorSurface sessionProcessorSurface = new SessionProcessorSurface(newInstance.getSurface(), next.getId());
                    sessionProcessorSurface.getTerminationFuture().addListener(new SessionProcessorBase$$a(newInstance), CameraXExecutors.directExecutor());
                    this.mSurfacesList.add(sessionProcessorSurface);
                } else if (next instanceof MultiResolutionImageReaderOutputConfig) {
                    throw new UnsupportedOperationException("MultiResolutionImageReader not supported");
                }
            }
        }
        SessionConfig.Builder builder = new SessionConfig.Builder();
        synchronized (this.mLock) {
            for (DeferrableSurface addSurface : this.mSurfacesList) {
                builder.addSurface(addSurface);
            }
        }
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        for (CaptureRequest.Key next2 : initSessionInternal.getSessionParameters().keySet()) {
            builder2.setCaptureRequestOption(next2, initSessionInternal.getSessionParameters().get(next2));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(initSessionInternal.getSessionTemplateId());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = from.getCameraId();
        Logger.m15471d(TAG, "initSession: cameraId=" + this.mCameraId);
        return builder.build();
    }

    public abstract Camera2SessionConfig initSessionInternal(String str, Map<String, CameraCharacteristics> map, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3);

    public void setImageProcessor(int i, ImageProcessor imageProcessor) {
        ImageReader imageReader;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(Integer.valueOf(i));
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new SessionProcessorBase$$b(imageProcessor, i), new Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }
}
