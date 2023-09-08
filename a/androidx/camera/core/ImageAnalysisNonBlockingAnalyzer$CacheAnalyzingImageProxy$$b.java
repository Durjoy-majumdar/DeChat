package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;

public final /* synthetic */ class ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$b implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy f44227a;

    public /* synthetic */ ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$b(ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy cacheAnalyzingImageProxy) {
        this.f44227a = cacheAnalyzingImageProxy;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        this.f44227a.lambda$new$1(imageProxy);
    }
}
