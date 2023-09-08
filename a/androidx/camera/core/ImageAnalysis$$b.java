package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class ImageAnalysis$$b implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ ImageAnalysis f44207a;

    /* renamed from: b */
    public final /* synthetic */ String f44208b;

    /* renamed from: c */
    public final /* synthetic */ ImageAnalysisConfig f44209c;

    /* renamed from: d */
    public final /* synthetic */ Size f44210d;

    public /* synthetic */ ImageAnalysis$$b(ImageAnalysis imageAnalysis, String str, ImageAnalysisConfig imageAnalysisConfig, Size size) {
        this.f44207a = imageAnalysis;
        this.f44208b = str;
        this.f44209c = imageAnalysisConfig;
        this.f44210d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f44207a.lambda$createPipeline$1(this.f44208b, this.f44209c, this.f44210d, sessionConfig, sessionError);
    }
}
