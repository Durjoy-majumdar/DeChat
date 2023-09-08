package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p1167z8.C112608f;
import p202m2.C117512b;

class ProcessingImageReader implements ImageReaderProxy {
    private static final int EXIF_MAX_SIZE_BYTES = 64000;
    private static final String TAG = "ProcessingImageReader";
    private final List<Integer> mCaptureIdList = new ArrayList();
    public final CaptureProcessor mCaptureProcessor;
    private FutureCallback<List<ImageProxy>> mCaptureStageReadyCallback = new FutureCallback<List<ImageProxy>>() {
        public void onFailure(Throwable th) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r0.mCaptureProcessor.process(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            monitor-enter(r4.this$0.mLock);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r4.this$0.mSettableImageProxyBundle.reset();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r3.execute(new androidx.camera.core.ProcessingImageReader$3$$a(r2, r5));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(java.util.List<androidx.camera.core.ImageProxy> r5) {
            /*
                r4 = this;
                androidx.camera.core.ProcessingImageReader r5 = androidx.camera.core.ProcessingImageReader.this
                java.lang.Object r5 = r5.mLock
                monitor-enter(r5)
                androidx.camera.core.ProcessingImageReader r0 = androidx.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x004c }
                boolean r1 = r0.mClosed     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r5)     // Catch:{ all -> 0x004c }
                return
            L_0x000d:
                r1 = 1
                r0.mProcessing = r1     // Catch:{ all -> 0x004c }
                androidx.camera.core.SettableImageProxyBundle r1 = r0.mSettableImageProxyBundle     // Catch:{ all -> 0x004c }
                androidx.camera.core.ProcessingImageReader$OnProcessingErrorCallback r2 = r0.mOnProcessingErrorCallback     // Catch:{ all -> 0x004c }
                java.util.concurrent.Executor r3 = r0.mErrorCallbackExecutor     // Catch:{ all -> 0x004c }
                monitor-exit(r5)     // Catch:{ all -> 0x004c }
                androidx.camera.core.impl.CaptureProcessor r5 = r0.mCaptureProcessor     // Catch:{ Exception -> 0x001d }
                r5.process(r1)     // Catch:{ Exception -> 0x001d }
                goto L_0x0037
            L_0x001d:
                r5 = move-exception
                androidx.camera.core.ProcessingImageReader r0 = androidx.camera.core.ProcessingImageReader.this
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.camera.core.ProcessingImageReader r1 = androidx.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0049 }
                androidx.camera.core.SettableImageProxyBundle r1 = r1.mSettableImageProxyBundle     // Catch:{ all -> 0x0049 }
                r1.reset()     // Catch:{ all -> 0x0049 }
                if (r2 == 0) goto L_0x0036
                if (r3 == 0) goto L_0x0036
                androidx.camera.core.ProcessingImageReader$3$$a r1 = new androidx.camera.core.ProcessingImageReader$3$$a     // Catch:{ all -> 0x0049 }
                r1.<init>(r2, r5)     // Catch:{ all -> 0x0049 }
                r3.execute(r1)     // Catch:{ all -> 0x0049 }
            L_0x0036:
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            L_0x0037:
                androidx.camera.core.ProcessingImageReader r5 = androidx.camera.core.ProcessingImageReader.this
                java.lang.Object r5 = r5.mLock
                monitor-enter(r5)
                androidx.camera.core.ProcessingImageReader r0 = androidx.camera.core.ProcessingImageReader.this     // Catch:{ all -> 0x0046 }
                r1 = 0
                r0.mProcessing = r1     // Catch:{ all -> 0x0046 }
                monitor-exit(r5)     // Catch:{ all -> 0x0046 }
                r0.closeAndCompleteFutureIfNecessary()
                return
            L_0x0046:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0046 }
                throw r0
            L_0x0049:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r5
            L_0x004c:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x004c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ProcessingImageReader.C165133.onSuccess(java.util.List):void");
        }
    };
    public C117512b.C117513a<Void> mCloseCompleter;
    private C112608f<Void> mCloseFuture;
    public boolean mClosed = false;
    public Executor mErrorCallbackExecutor;
    public Executor mExecutor;
    private ImageReaderProxy.OnImageAvailableListener mImageProcessedListener = new ImageReaderProxy.OnImageAvailableListener() {
        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onImageAvailable$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
            onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
        }

        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
            Executor executor;
            synchronized (ProcessingImageReader.this.mLock) {
                ProcessingImageReader processingImageReader = ProcessingImageReader.this;
                onImageAvailableListener = processingImageReader.mListener;
                executor = processingImageReader.mExecutor;
                processingImageReader.mSettableImageProxyBundle.reset();
                ProcessingImageReader.this.setupSettableImageProxyBundleCallbacks();
            }
            if (onImageAvailableListener == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new ProcessingImageReader$2$$a(this, onImageAvailableListener));
            } else {
                onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
            }
        }
    };
    public final ImageReaderProxy mInputImageReader;
    public ImageReaderProxy.OnImageAvailableListener mListener;
    public final Object mLock = new Object();
    public OnProcessingErrorCallback mOnProcessingErrorCallback;
    public final ImageReaderProxy mOutputImageReader;
    public final Executor mPostProcessExecutor;
    public boolean mProcessing = false;
    public SettableImageProxyBundle mSettableImageProxyBundle = new SettableImageProxyBundle(Collections.emptyList(), this.mTagBundleKey);
    private C112608f<List<ImageProxy>> mSettableImageProxyFutureList = Futures.immediateFuture(new ArrayList());
    private String mTagBundleKey = new String();
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() {
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            ProcessingImageReader.this.imageIncoming(imageReaderProxy);
        }
    };
    private final C112608f<Void> mUnderlyingCaptureProcessorCloseFuture;

    public interface OnProcessingErrorCallback {
        void notifyProcessingError(String str, Throwable th);
    }

    public ProcessingImageReader(Builder builder) {
        if (builder.mInputImageReader.getMaxImages() >= builder.mCaptureBundle.getCaptureStages().size()) {
            ImageReaderProxy imageReaderProxy = builder.mInputImageReader;
            this.mInputImageReader = imageReaderProxy;
            int width = imageReaderProxy.getWidth();
            int height = imageReaderProxy.getHeight();
            int i = builder.mOutputFormat;
            if (i == 256) {
                width = ((int) (((float) (width * height)) * 1.5f)) + EXIF_MAX_SIZE_BYTES;
                height = 1;
            }
            AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(width, height, i, imageReaderProxy.getMaxImages()));
            this.mOutputImageReader = androidImageReaderProxy;
            this.mPostProcessExecutor = builder.mPostProcessExecutor;
            CaptureProcessor captureProcessor = builder.mCaptureProcessor;
            this.mCaptureProcessor = captureProcessor;
            captureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), builder.mOutputFormat);
            captureProcessor.onResolutionUpdate(new Size(imageReaderProxy.getWidth(), imageReaderProxy.getHeight()));
            this.mUnderlyingCaptureProcessorCloseFuture = captureProcessor.getCloseFuture();
            setCaptureBundle(builder.mCaptureBundle);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    private void cancelSettableImageProxyBundleFutureList() {
        synchronized (this.mLock) {
            if (!this.mSettableImageProxyFutureList.isDone()) {
                this.mSettableImageProxyFutureList.cancel(true);
            }
            this.mSettableImageProxyBundle.reset();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$closeAndCompleteFutureIfNecessary$0(C117512b.C117513a aVar) {
        cancelSettableImageProxyBundleFutureList();
        if (aVar != null) {
            aVar.mo182231a(null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCloseFuture$1(Void voidR) {
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$2(C117512b.C117513a aVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "ProcessingImageReader-close";
    }

    public ImageProxy acquireLatestImage() {
        ImageProxy acquireLatestImage;
        synchronized (this.mLock) {
            acquireLatestImage = this.mOutputImageReader.acquireLatestImage();
        }
        return acquireLatestImage;
    }

    public ImageProxy acquireNextImage() {
        ImageProxy acquireNextImage;
        synchronized (this.mLock) {
            acquireNextImage = this.mOutputImageReader.acquireNextImage();
        }
        return acquireNextImage;
    }

    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
            this.mInputImageReader.clearOnImageAvailableListener();
            this.mOutputImageReader.clearOnImageAvailableListener();
            if (!this.mProcessing) {
                this.mSettableImageProxyBundle.close();
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mInputImageReader.clearOnImageAvailableListener();
                this.mOutputImageReader.clearOnImageAvailableListener();
                this.mClosed = true;
                this.mCaptureProcessor.close();
                closeAndCompleteFutureIfNecessary();
            }
        }
    }

    public void closeAndCompleteFutureIfNecessary() {
        boolean z;
        boolean z2;
        C117512b.C117513a<Void> aVar;
        synchronized (this.mLock) {
            z = this.mClosed;
            z2 = this.mProcessing;
            aVar = this.mCloseCompleter;
            if (z && !z2) {
                this.mInputImageReader.close();
                this.mSettableImageProxyBundle.close();
                this.mOutputImageReader.close();
            }
        }
        if (z && !z2) {
            this.mUnderlyingCaptureProcessorCloseFuture.addListener(new ProcessingImageReader$$c(this, aVar), CameraXExecutors.directExecutor());
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        synchronized (this.mLock) {
            ImageReaderProxy imageReaderProxy = this.mInputImageReader;
            if (imageReaderProxy instanceof MetadataImageReader) {
                CameraCaptureCallback cameraCaptureCallback = ((MetadataImageReader) imageReaderProxy).getCameraCaptureCallback();
                return cameraCaptureCallback;
            }
            C165144 r1 = new CameraCaptureCallback() {
            };
            return r1;
        }
    }

    public C112608f<Void> getCloseFuture() {
        C112608f<Void> fVar;
        synchronized (this.mLock) {
            if (!this.mClosed || this.mProcessing) {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = C117512b.m165760a(new ProcessingImageReader$$b(this));
                }
                fVar = Futures.nonCancellationPropagating(this.mCloseFuture);
            } else {
                fVar = Futures.transform(this.mUnderlyingCaptureProcessorCloseFuture, new ProcessingImageReader$$a(), CameraXExecutors.directExecutor());
            }
        }
        return fVar;
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mInputImageReader.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mOutputImageReader.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mInputImageReader.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mInputImageReader.getSurface();
        }
        return surface;
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mInputImageReader.getWidth();
        }
        return width;
    }

    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                try {
                    ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                    if (acquireNextImage != null) {
                        Integer num = (Integer) acquireNextImage.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                        if (!this.mCaptureIdList.contains(num)) {
                            Logger.m15477w(TAG, "ImageProxyBundle does not contain this id: " + num);
                            acquireNextImage.close();
                        } else {
                            this.mSettableImageProxyBundle.addImageProxy(acquireNextImage);
                        }
                    }
                } catch (IllegalStateException e) {
                    Logger.m15474e(TAG, "Failed to acquire latest image.", e);
                }
                return;
            }
            return;
        }
    }

    public void setCaptureBundle(CaptureBundle captureBundle) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                cancelSettableImageProxyBundleFutureList();
                if (captureBundle.getCaptureStages() != null) {
                    if (this.mInputImageReader.getMaxImages() >= captureBundle.getCaptureStages().size()) {
                        this.mCaptureIdList.clear();
                        for (CaptureStage next : captureBundle.getCaptureStages()) {
                            if (next != null) {
                                this.mCaptureIdList.add(Integer.valueOf(next.getId()));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                }
                String num = Integer.toString(captureBundle.hashCode());
                this.mTagBundleKey = num;
                this.mSettableImageProxyBundle = new SettableImageProxyBundle(this.mCaptureIdList, num);
                setupSettableImageProxyBundleCallbacks();
            }
        }
    }

    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            onImageAvailableListener.getClass();
            this.mListener = onImageAvailableListener;
            executor.getClass();
            this.mExecutor = executor;
            this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, executor);
            this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, executor);
        }
    }

    public void setOnProcessingErrorCallback(Executor executor, OnProcessingErrorCallback onProcessingErrorCallback) {
        synchronized (this.mLock) {
            this.mErrorCallbackExecutor = executor;
            this.mOnProcessingErrorCallback = onProcessingErrorCallback;
        }
    }

    public void setupSettableImageProxyBundleCallbacks() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.mCaptureIdList) {
            arrayList.add(this.mSettableImageProxyBundle.getImageProxy(intValue.intValue()));
        }
        this.mSettableImageProxyFutureList = Futures.allAsList(arrayList);
        Futures.addCallback(Futures.allAsList(arrayList), this.mCaptureStageReadyCallback, this.mPostProcessExecutor);
    }

    public static final class Builder {
        public final CaptureBundle mCaptureBundle;
        public final CaptureProcessor mCaptureProcessor;
        public final ImageReaderProxy mInputImageReader;
        public int mOutputFormat;
        public Executor mPostProcessExecutor;

        public Builder(ImageReaderProxy imageReaderProxy, CaptureBundle captureBundle, CaptureProcessor captureProcessor) {
            this.mPostProcessExecutor = Executors.newSingleThreadExecutor();
            this.mInputImageReader = imageReaderProxy;
            this.mCaptureBundle = captureBundle;
            this.mCaptureProcessor = captureProcessor;
            this.mOutputFormat = imageReaderProxy.getImageFormat();
        }

        public ProcessingImageReader build() {
            return new ProcessingImageReader(this);
        }

        public Builder setOutputFormat(int i) {
            this.mOutputFormat = i;
            return this;
        }

        public Builder setPostProcessExecutor(Executor executor) {
            this.mPostProcessExecutor = executor;
            return this;
        }

        public Builder(int i, int i2, int i3, int i4, CaptureBundle captureBundle, CaptureProcessor captureProcessor) {
            this(new MetadataImageReader(i, i2, i3, i4), captureBundle, captureProcessor);
        }
    }
}
