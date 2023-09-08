package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageAnalysis;
import p202m2.C117512b;

public final /* synthetic */ class ImageAnalysisAbstractAnalyzer$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f44219d;

    /* renamed from: e */
    public final /* synthetic */ ImageProxy f44220e;

    /* renamed from: f */
    public final /* synthetic */ Matrix f44221f;

    /* renamed from: g */
    public final /* synthetic */ ImageProxy f44222g;

    /* renamed from: h */
    public final /* synthetic */ Rect f44223h;

    /* renamed from: i */
    public final /* synthetic */ ImageAnalysis.Analyzer f44224i;

    /* renamed from: j */
    public final /* synthetic */ C117512b.C117513a f44225j;

    public /* synthetic */ ImageAnalysisAbstractAnalyzer$$b(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, C117512b.C117513a aVar) {
        this.f44219d = imageAnalysisAbstractAnalyzer;
        this.f44220e = imageProxy;
        this.f44221f = matrix;
        this.f44222g = imageProxy2;
        this.f44223h = rect;
        this.f44224i = analyzer;
        this.f44225j = aVar;
    }

    public final void run() {
        this.f44219d.lambda$analyzeImage$0(this.f44220e, this.f44221f, this.f44222g, this.f44223h, this.f44224i, this.f44225j);
    }
}
