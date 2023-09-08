package p233s3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import gy3.C87412m;

/* renamed from: s3.l */
public class C101522l extends C101520k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101522l(C101514g gVar, View view, Window window) {
        super(gVar, view, window);
        C87412m.m108594g(gVar, "jankStats");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(window, "window");
    }

    /* renamed from: e */
    public long mo141008e(FrameMetrics frameMetrics) {
        C87412m.m108594g(frameMetrics, "frameMetrics");
        return frameMetrics.getMetric(10);
    }
}
