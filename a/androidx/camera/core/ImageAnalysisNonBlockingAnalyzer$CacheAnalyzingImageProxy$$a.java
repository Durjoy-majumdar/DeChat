package androidx.camera.core;

public final /* synthetic */ class ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageAnalysisNonBlockingAnalyzer f44226d;

    public /* synthetic */ ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$a(ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
        this.f44226d = imageAnalysisNonBlockingAnalyzer;
    }

    public final void run() {
        this.f44226d.analyzeCachedImage();
    }
}
