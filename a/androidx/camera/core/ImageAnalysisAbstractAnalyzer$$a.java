package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageAnalysis;
import java.util.concurrent.Executor;
import p202m2.C117512b;

public final /* synthetic */ class ImageAnalysisAbstractAnalyzer$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f44212a;

    /* renamed from: b */
    public final /* synthetic */ Executor f44213b;

    /* renamed from: c */
    public final /* synthetic */ ImageProxy f44214c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f44215d;

    /* renamed from: e */
    public final /* synthetic */ ImageProxy f44216e;

    /* renamed from: f */
    public final /* synthetic */ Rect f44217f;

    /* renamed from: g */
    public final /* synthetic */ ImageAnalysis.Analyzer f44218g;

    public /* synthetic */ ImageAnalysisAbstractAnalyzer$$a(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, Executor executor, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer) {
        this.f44212a = imageAnalysisAbstractAnalyzer;
        this.f44213b = executor;
        this.f44214c = imageProxy;
        this.f44215d = matrix;
        this.f44216e = imageProxy2;
        this.f44217f = rect;
        this.f44218g = analyzer;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44212a.lambda$analyzeImage$1(this.f44213b, this.f44214c, this.f44215d, this.f44216e, this.f44217f, this.f44218g, aVar);
    }
}
