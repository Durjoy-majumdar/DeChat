package androidx.camera.core;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;

public final /* synthetic */ class ImageAnalysis$$c implements ImageAnalysis.Analyzer {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysis.Analyzer f44211a;

    public /* synthetic */ ImageAnalysis$$c(ImageAnalysis.Analyzer analyzer) {
        this.f44211a = analyzer;
    }

    public final void analyze(ImageProxy imageProxy) {
        this.f44211a.analyze(imageProxy);
    }

    public /* synthetic */ int getTargetCoordinateSystem() {
        return C16525d.m15514a(this);
    }

    public /* synthetic */ Size getTargetResolutionOverride() {
        return C16525d.m15515b(this);
    }

    public /* synthetic */ void updateTransform(Matrix matrix) {
        C16525d.m15516c(this, matrix);
    }
}
