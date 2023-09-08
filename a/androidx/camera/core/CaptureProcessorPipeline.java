package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

class CaptureProcessorPipeline implements CaptureProcessor {
    private static final String TAG = "CaptureProcessorPipeline";
    public C117512b.C117513a<Void> mCloseCompleter;
    private C112608f<Void> mCloseFuture;
    private boolean mClosed = false;
    public final Executor mExecutor;
    private ImageReaderProxy mIntermediateImageReader = null;
    private final Object mLock = new Object();
    private final int mMaxImages;
    private final CaptureProcessor mPostCaptureProcessor;
    private final CaptureProcessor mPreCaptureProcessor;
    private boolean mProcessing = false;
    private ImageInfo mSourceImageInfo = null;
    private final C112608f<List<Void>> mUnderlyingCaptureProcessorsCloseFuture;

    public CaptureProcessorPipeline(CaptureProcessor captureProcessor, int i, CaptureProcessor captureProcessor2, Executor executor) {
        this.mPreCaptureProcessor = captureProcessor;
        this.mPostCaptureProcessor = captureProcessor2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(captureProcessor.getCloseFuture());
        arrayList.add(captureProcessor2.getCloseFuture());
        this.mUnderlyingCaptureProcessorsCloseFuture = Futures.allAsList(arrayList);
        this.mExecutor = executor;
        this.mMaxImages = i;
    }

    private void closeAndCompleteFutureIfNecessary() {
        boolean z;
        boolean z2;
        C117512b.C117513a<Void> aVar;
        synchronized (this.mLock) {
            z = this.mClosed;
            z2 = this.mProcessing;
            aVar = this.mCloseCompleter;
            if (z && !z2) {
                this.mIntermediateImageReader.close();
            }
        }
        if (z && !z2 && aVar != null) {
            this.mUnderlyingCaptureProcessorsCloseFuture.addListener(new CaptureProcessorPipeline$$e(aVar), CameraXExecutors.directExecutor());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCloseFuture$3(List list) {
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$4(C117512b.C117513a aVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "CaptureProcessorPipeline-close";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onResolutionUpdate$1(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
        try {
            this.mExecutor.execute(new CaptureProcessorPipeline$$d(this, acquireNextImage));
        } catch (RejectedExecutionException unused) {
            Logger.m15473e(TAG, "The executor for post-processing might have been shutting down or terminated!");
            acquireNextImage.close();
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                this.mPreCaptureProcessor.close();
                this.mPostCaptureProcessor.close();
                closeAndCompleteFutureIfNecessary();
            }
        }
    }

    public C112608f<Void> getCloseFuture() {
        C112608f<Void> fVar;
        synchronized (this.mLock) {
            if (!this.mClosed || this.mProcessing) {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = C117512b.m165760a(new CaptureProcessorPipeline$$c(this));
                }
                fVar = Futures.nonCancellationPropagating(this.mCloseFuture);
            } else {
                fVar = Futures.transform(this.mUnderlyingCaptureProcessorsCloseFuture, new CaptureProcessorPipeline$$b(), CameraXExecutors.directExecutor());
            }
        }
        return fVar;
    }

    public void onOutputSurface(Surface surface, int i) {
        this.mPostCaptureProcessor.onOutputSurface(surface, i);
    }

    public void onResolutionUpdate(Size size) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.mMaxImages));
        this.mIntermediateImageReader = androidImageReaderProxy;
        this.mPreCaptureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), 35);
        this.mPreCaptureProcessor.onResolutionUpdate(size);
        this.mPostCaptureProcessor.onResolutionUpdate(size);
        this.mIntermediateImageReader.setOnImageAvailableListener(new CaptureProcessorPipeline$$a(this), CameraXExecutors.directExecutor());
    }

    /* renamed from: postProcess */
    public void lambda$onResolutionUpdate$0(ImageProxy imageProxy) {
        boolean z;
        synchronized (this.mLock) {
            z = this.mClosed;
        }
        if (!z) {
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            this.mSourceImageInfo.getClass();
            String next = this.mSourceImageInfo.getTagBundle().listKeys().iterator().next();
            int intValue = ((Integer) this.mSourceImageInfo.getTagBundle().getTag(next)).intValue();
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, this.mSourceImageInfo);
            this.mSourceImageInfo = null;
            SettableImageProxyBundle settableImageProxyBundle = new SettableImageProxyBundle(Collections.singletonList(Integer.valueOf(intValue)), next);
            settableImageProxyBundle.addImageProxy(settableImageProxy);
            try {
                this.mPostCaptureProcessor.process(settableImageProxyBundle);
            } catch (Exception e) {
                Logger.m15473e(TAG, "Post processing image failed! " + e.getMessage());
            }
        }
        synchronized (this.mLock) {
            this.mProcessing = false;
        }
        closeAndCompleteFutureIfNecessary();
    }

    public void process(ImageProxyBundle imageProxyBundle) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mProcessing = true;
                C112608f<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(imageProxyBundle.getCaptureIds().get(0).intValue());
                C20434g.m22017a(imageProxy.isDone());
                try {
                    this.mSourceImageInfo = imageProxy.get().getImageInfo();
                    this.mPreCaptureProcessor.process(imageProxyBundle);
                } catch (InterruptedException | ExecutionException unused) {
                    throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
                }
            }
        }
    }
}
