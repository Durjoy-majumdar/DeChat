package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.SingleImageProxyBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ScheduledExecutorService;
import p1167z8.C112608f;

final class ProcessingSurface extends DeferrableSurface {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "ProcessingSurfaceTextur";
    private final CameraCaptureCallback mCameraCaptureCallback;
    public final CaptureProcessor mCaptureProcessor;
    public final CaptureStage mCaptureStage;
    private final Handler mImageReaderHandler;
    public final MetadataImageReader mInputImageReader;
    public final Surface mInputSurface;
    public final Object mLock = new Object();
    private final DeferrableSurface mOutputDeferrableSurface;
    public boolean mReleased;
    private final Size mResolution;
    private String mTagBundleKey;
    private final ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    public ProcessingSurface(int i, int i2, int i3, Handler handler, CaptureStage captureStage, CaptureProcessor captureProcessor, DeferrableSurface deferrableSurface, String str) {
        super(new Size(i, i2), i3);
        ProcessingSurface$$a processingSurface$$a = new ProcessingSurface$$a(this);
        this.mTransformedListener = processingSurface$$a;
        this.mReleased = false;
        Size size = new Size(i, i2);
        this.mResolution = size;
        if (handler != null) {
            this.mImageReaderHandler = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mImageReaderHandler = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(this.mImageReaderHandler);
        MetadataImageReader metadataImageReader = new MetadataImageReader(i, i2, i3, 2);
        this.mInputImageReader = metadataImageReader;
        metadataImageReader.setOnImageAvailableListener(processingSurface$$a, newHandlerExecutor);
        this.mInputSurface = metadataImageReader.getSurface();
        this.mCameraCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onResolutionUpdate(size);
        this.mCaptureStage = captureStage;
        this.mOutputDeferrableSurface = deferrableSurface;
        this.mTagBundleKey = str;
        Futures.addCallback(deferrableSurface.getSurface(), new FutureCallback<Surface>() {
            public void onFailure(Throwable th) {
                Logger.m15474e(ProcessingSurface.TAG, "Failed to extract Listenable<Surface>.", th);
            }

            public void onSuccess(Surface surface) {
                synchronized (ProcessingSurface.this.mLock) {
                    ProcessingSurface.this.mCaptureProcessor.onOutputSurface(surface, 1);
                }
            }
        }, CameraXExecutors.directExecutor());
        getTerminationFuture().addListener(new ProcessingSurface$$b(this), CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            imageIncoming(imageReaderProxy);
        }
    }

    /* access modifiers changed from: private */
    public void release() {
        synchronized (this.mLock) {
            if (!this.mReleased) {
                this.mInputImageReader.close();
                this.mInputSurface.release();
                this.mOutputDeferrableSurface.close();
                this.mReleased = true;
            }
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        CameraCaptureCallback cameraCaptureCallback;
        synchronized (this.mLock) {
            if (!this.mReleased) {
                cameraCaptureCallback = this.mCameraCaptureCallback;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return cameraCaptureCallback;
    }

    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        if (!this.mReleased) {
            ImageProxy imageProxy = null;
            try {
                imageProxy = imageReaderProxy.acquireNextImage();
            } catch (IllegalStateException e) {
                Logger.m15474e(TAG, "Failed to acquire next image.", e);
            }
            if (imageProxy != null) {
                ImageInfo imageInfo = imageProxy.getImageInfo();
                if (imageInfo == null) {
                    imageProxy.close();
                    return;
                }
                Integer num = (Integer) imageInfo.getTagBundle().getTag(this.mTagBundleKey);
                if (num == null) {
                    imageProxy.close();
                } else if (this.mCaptureStage.getId() != num.intValue()) {
                    Logger.m15477w(TAG, "ImageProxyBundle does not contain this id: " + num);
                    imageProxy.close();
                } else {
                    SingleImageProxyBundle singleImageProxyBundle = new SingleImageProxyBundle(imageProxy, this.mTagBundleKey);
                    this.mCaptureProcessor.process(singleImageProxyBundle);
                    singleImageProxyBundle.close();
                }
            }
        }
    }

    public C112608f<Surface> provideSurface() {
        C112608f<Surface> immediateFuture;
        synchronized (this.mLock) {
            immediateFuture = Futures.immediateFuture(this.mInputSurface);
        }
        return immediateFuture;
    }
}
