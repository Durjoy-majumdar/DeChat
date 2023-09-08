package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    public final Executor mBackgroundExecutor;
    public ImageProxy mCachedImage;
    private final Object mLock = new Object();
    private CacheAnalyzingImageProxy mPostedImage;

    public static class CacheAnalyzingImageProxy extends ForwardingImageProxy {
        public final WeakReference<ImageAnalysisNonBlockingAnalyzer> mNonBlockingAnalyzerWeakReference;

        public CacheAnalyzingImageProxy(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.mNonBlockingAnalyzerWeakReference = new WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            addOnImageCloseListener(new ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$b(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(ImageProxy imageProxy) {
            ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = this.mNonBlockingAnalyzerWeakReference.get();
            if (imageAnalysisNonBlockingAnalyzer != null) {
                imageAnalysisNonBlockingAnalyzer.mBackgroundExecutor.execute(new ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$a(imageAnalysisNonBlockingAnalyzer));
            }
        }
    }

    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.mBackgroundExecutor = executor;
    }

    public ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    public void analyzeCachedImage() {
        synchronized (this.mLock) {
            this.mPostedImage = null;
            ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                this.mCachedImage = null;
                onValidImageAvailable(imageProxy);
            }
        }
    }

    public void clearCache() {
        synchronized (this.mLock) {
            ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                imageProxy.close();
                this.mCachedImage = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onValidImageAvailable(androidx.camera.core.ImageProxy r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mIsAttached     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000c
            r7.close()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x000c:
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r1 = r6.mPostedImage     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0035
            androidx.camera.core.ImageInfo r1 = r7.getImageInfo()     // Catch:{ all -> 0x004e }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x004e }
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r3 = r6.mPostedImage     // Catch:{ all -> 0x004e }
            androidx.camera.core.ImageInfo r3 = r3.getImageInfo()     // Catch:{ all -> 0x004e }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x004e }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            r7.close()     // Catch:{ all -> 0x004e }
            goto L_0x0033
        L_0x002a:
            androidx.camera.core.ImageProxy r1 = r6.mCachedImage     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x0031:
            r6.mCachedImage = r7     // Catch:{ all -> 0x004e }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0035:
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r1 = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy     // Catch:{ all -> 0x004e }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x004e }
            r6.mPostedImage = r1     // Catch:{ all -> 0x004e }
            z8.f r7 = r6.analyzeImage(r1)     // Catch:{ all -> 0x004e }
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$1 r2 = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$1     // Catch:{ all -> 0x004e }
            r2.<init>(r1)     // Catch:{ all -> 0x004e }
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch:{ all -> 0x004e }
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r7, r2, r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.onValidImageAvailable(androidx.camera.core.ImageProxy):void");
    }
}
